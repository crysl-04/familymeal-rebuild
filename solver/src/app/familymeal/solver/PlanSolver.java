package app.familymeal.solver;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import org.ojalgo.optimisation.Expression;
import org.ojalgo.optimisation.ExpressionsBasedModel;
import org.ojalgo.optimisation.Optimisation;
import org.ojalgo.optimisation.Variable;

import app.familymeal.solver.Model.Category;
import app.familymeal.solver.Model.DailyTargets;
import app.familymeal.solver.Model.MealType;
import app.familymeal.solver.Model.Nutrient;
import app.familymeal.solver.Model.NutrientRange;
import app.familymeal.solver.Model.Person;
import app.familymeal.solver.Model.PortionKey;
import app.familymeal.solver.Model.Recipe;
import app.familymeal.solver.Model.Season;
import app.familymeal.solver.Model.Slot;

/**
 * 周食谱求解器：jg1（模型构建与求解）+ sy1（上下文与规则判定）的忠实移植。
 *
 * 模型（与设计文档 v3 §5/§8 及反编译参考实现一致）：
 *  - 变量 x_{日}_{餐}_{菜} ∈ {0,1}：该菜是否出现在该餐位
 *  - 主食份量 z_{餐位}_{人}_{主食菜} ∈ [0.5, 2.0] 连续变量，线性化 z ≤ hi·x、z ≥ lo·x
 *  - 结构约束：每餐位各类别菜品数 ∈ structure 区间（早餐：早餐菜 1；午/晚餐：主菜 1、蔬菜 1、主食 1、汤 0–1）
 *  - 每周重复 ≤ maxRepeatsPerWeek（免重复类别除外，默认主食）
 *  - 相邻两天同餐次不出现同一道非免重复菜（≤1）
 *  - 同餐型两餐位的"完全相同菜组合"禁止（连续辅助变量技巧，Σ y_r ≤ fixedDishCount−1）
 *  - 鱼餐位（周三/周五晚餐）：用餐 ≥ wholeFishMinDiners 人 → 必须整鱼，否则必须鱼类
 *  - 周末午餐：周六+周日合计恰有一餐鱼类、恰有一餐虾类
 *  - 营养约束：每人每天（按在家餐次 30/40/30 折算目标），五项营养素 ∈ [min, max]，
 *    偏差用辅助变量进入目标：min Σ weight × (under + over)
 *  - 工作日午/晚餐仅快手菜（quickExemptTags 标签豁免）；忌口类别禁用含该类食材的菜
 */
public final class PlanSolver {

    public enum Status { OPTIMAL, FEASIBLE, INFEASIBLE, TIMEOUT, ERROR }

    public record SolveResult(
            Status status,
            double objective,
            long buildMs,
            long solveMs,
            List<String> warnings,
            String message,
            Map<Slot, Map<String, Double>> dishes,
            Map<PortionKey, Double> portions) {

        public boolean feasible() {
            return status == Status.OPTIMAL || status == Status.FEASIBLE;
        }
    }

    private final Model.PlanInput in;
    private final Model.PlanRules rules;

    // ---- 上下文（sy1）----
    private final List<Recipe> seasonRecipes;
    private final Map<String, Recipe> recipeById;
    private final Map<String, String> categoryByIngredient;
    private final Map<String, Person> personById;
    private final List<Slot> activeSlots;
    private final Set<Slot> weekendLunches;

    public PlanSolver(Model.PlanInput input) {
        this.in = input;
        this.rules = input.rules();
        if (input.month() < 1 || input.month() >= 13) {
            throw new IllegalArgumentException("month must be 1..12");
        }
        // 季节过滤（sy1 构造器）：4–10 月 → {四季, 夏季}；其余 → {四季, 冬季}
        Set<Season> allowedSeasons = (4 > input.month() || input.month() >= 11)
                ? Set.of(Season.ALL, Season.WINTER)
                : Set.of(Season.ALL, Season.SUMMER);
        List<Recipe> filtered = new ArrayList<>();
        for (Recipe r : input.recipes()) {
            if (allowedSeasons.contains(r.season())) {
                filtered.add(r);
            }
        }
        this.seasonRecipes = List.copyOf(filtered);

        this.recipeById = new LinkedHashMap<>();
        for (Recipe r : input.recipes()) {
            recipeById.put(r.id(), r);
        }
        this.categoryByIngredient = new LinkedHashMap<>();
        for (Model.Ingredient ing : input.ingredients()) {
            categoryByIngredient.put(ing.id(), ing.category());
        }
        this.personById = new LinkedHashMap<>();
        for (Person p : input.persons()) {
            personById.put(p.id(), p);
        }

        // 活跃餐位：按 星期×餐次 顺序，用餐者非空
        List<Slot> active = new ArrayList<>();
        for (DayOfWeek day : DayOfWeek.values()) {
            for (MealType meal : MealType.values()) {
                if (!in.schedule().diners(day, meal).isEmpty()) {
                    active.add(new Slot(day, meal));
                }
            }
        }
        this.activeSlots = List.copyOf(active);
        Set<Slot> weekend = new HashSet<>();
        for (Slot s : active) {
            if ((s.day() == DayOfWeek.SATURDAY || s.day() == DayOfWeek.SUNDAY)
                    && s.meal() == MealType.LUNCH) {
                weekend.add(s);
            }
        }
        this.weekendLunches = Set.copyOf(weekend);
    }

    /** 菜谱是否允许出现在餐位（sy1.b，锁定判断之外的全部规则） */
    public boolean isAllowedAt(String recipeId, Slot s) {
        Recipe r = recipeById.get(recipeId);
        if (r == null) {
            return false;
        }
        List<String> diners = in.schedule().diners(s.day(), s.meal());
        if (diners.isEmpty()) {
            return false;
        }
        if (!r.mealTypes().contains(s.meal())) {
            return false;
        }
        Map<Category, int[]> struct = rules.structure().getOrDefault(s.meal(), Map.of());
        if (!struct.containsKey(r.category())) {
            return false;
        }
        if (diners.size() < r.minDiners()) {
            return false;
        }
        Set<String> banned = in.banned().getOrDefault(s, Set.of());
        if (banned.contains(r.id())) {
            return false;
        }
        // 工作日仅快手菜（早餐豁免；quickExemptTags 标签豁免）
        if (rules.weekdayQuickOnly() && s.day().ordinal() < 5
                && s.meal() != MealType.BREAKFAST && !r.quick()) {
            boolean exempt = false;
            for (String tag : r.tags()) {
                if (rules.quickExemptTags().contains(tag)) {
                    exempt = true;
                    break;
                }
            }
            if (!exempt) {
                return false;
            }
        }
        // 忌口
        if (rules.respectExclusions()) {
            Set<String> excluded = new HashSet<>();
            for (String pid : diners) {
                Person p = personById.get(pid);
                if (p != null) {
                    excluded.addAll(p.excludedCategories());
                }
            }
            if (!excluded.isEmpty()) {
                for (var line : r.ingredients()) {
                    String cat = categoryByIngredient.get(line.ingredientId());
                    if (cat != null && excluded.contains(cat)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /** 鱼餐位判定谓词：用餐人数 ≥ wholeFishMinDiners → 整鱼，否则鱼类 */
    private Predicate<Recipe> fishPredicate(Slot s) {
        int diners = in.schedule().diners(s.day(), s.meal()).size();
        return diners >= rules.wholeFishMinDiners() ? Recipe::isWholeFish : Recipe::isFish;
    }

    /** 目标按在家餐次折算（sy1.g）：份额和 < 1 时按比例缩放各营养区间 */
    private DailyTargets foldTargets(Person p, DayOfWeek day) {
        DailyTargets t = p.targets();
        Map<MealType, Double> shares = rules.mealShares();
        if (shares != null) {
            double sum = 0.0;
            for (MealType meal : MealType.values()) {
                if (in.schedule().diners(day, meal).contains(p.id())) {
                    sum += shares.getOrDefault(meal, meal.defaultShare());
                }
            }
            if (sum < 0.999999999d) {
                return t.scale(sum);
            }
        }
        return t;
    }

    public SolveResult solve(long limitMs, long stopMs) {
        long t0 = System.nanoTime();
        List<String> warnings = new ArrayList<>();

        Optimisation.Options opts = new Optimisation.Options();
        opts.time_abort = limitMs;
        opts.time_suffice = Math.min(stopMs, limitMs);
        ExpressionsBasedModel model = new ExpressionsBasedModel(opts);

        // 1) 选择变量（锁定菜固定为 1；不可用的锁定菜记警告）
        Map<Slot, Map<String, Variable>> xVars = new LinkedHashMap<>();
        for (Slot s : activeSlots) {
            Map<String, Variable> perSlot = new LinkedHashMap<>();
            Set<String> locked = in.locked().getOrDefault(s, Set.of());
            for (Recipe r : seasonRecipes) {
                boolean lockedHere = locked.contains(r.id());
                boolean ok = lockedHere
                        ? r.mealTypes().contains(s.meal())
                                && rules.structure().getOrDefault(s.meal(), Map.of()).containsKey(r.category())
                        : isAllowedAt(r.id(), s);
                if (!ok) {
                    if (lockedHere) {
                        warnings.add("locked " + r.id() + " cannot be used in " + s);
                    }
                    continue;
                }
                Variable v = model.newVariable("x_" + s + "_" + r.id());
                v.lower(0).upper(1).integer(true);
                if (lockedHere) {
                    v.lower(1);
                }
                perSlot.put(r.id(), v);
            }
            xVars.put(s, perSlot);
        }

        // 2) 餐位结构约束：各类别菜品数 ∈ [lo, hi]
        for (Map.Entry<Slot, Map<String, Variable>> entry : xVars.entrySet()) {
            Slot s = entry.getKey();
            for (Map.Entry<Category, int[]> sc : rules.structure().getOrDefault(s.meal(), Map.of())
                    .entrySet()) {
                List<Variable> sel = new ArrayList<>();
                for (Map.Entry<String, Variable> ve : entry.getValue().entrySet()) {
                    if (recipeById.get(ve.getKey()).category() == sc.getKey()) {
                        sel.add(ve.getValue());
                    }
                }
                int lo = sc.getValue()[0];
                int hi = sc.getValue()[1];
                if (sel.size() < lo) {
                    String dayCn = s.day().getDisplayName(TextStyle.FULL, Locale.CHINA);
                    return new SolveResult(Status.INFEASIBLE, 0.0, elapsedMs(t0), 0L, warnings,
                            dayCn + s.meal().cn() + ": 可选的「" + sc.getKey().cn + "」不足 " + lo + " 道",
                            Map.of(), Map.of());
                }
                if (!sel.isEmpty()) {
                    Expression ex = model.newExpression("struct_" + s + "_" + sc.getKey());
                    ex.lower(lo).upper(hi);
                    for (Variable v : sel) {
                        ex.set(v, 1.0);
                    }
                }
            }
        }

        // 3) 每周重复上限（免重复类别除外；候选数不超上限时不加约束）
        Map<String, List<Variable>> byRecipe = new LinkedHashMap<>();
        for (Map<String, Variable> perSlot : xVars.values()) {
            for (Map.Entry<String, Variable> ve : perSlot.entrySet()) {
                byRecipe.computeIfAbsent(ve.getKey(), k -> new ArrayList<>()).add(ve.getValue());
            }
        }
        for (Map.Entry<String, List<Variable>> e : byRecipe.entrySet()) {
            Recipe r = recipeById.get(e.getKey());
            if (!rules.isRepeatExempt(r) && e.getValue().size() > rules.maxRepeatsPerWeek()) {
                Expression ex = model.newExpression("repeat_" + e.getKey());
                ex.upper(rules.maxRepeatsPerWeek());
                for (Variable v : e.getValue()) {
                    ex.set(v, 1.0);
                }
            }
        }

        // 4) 相邻两天同餐次不重复（仅午餐/晚餐；免重复类别除外）
        if (rules.noConsecutiveDays()) {
            for (MealType meal : List.of(MealType.LUNCH, MealType.DINNER)) {
                for (int i = 0; i < DayOfWeek.values().length - 1; i++) {
                    DayOfWeek d1 = DayOfWeek.values()[i];
                    DayOfWeek d2 = DayOfWeek.values()[i + 1];
                    Map<String, Variable> m1 = xVars.get(new Slot(d1, meal));
                    Map<String, Variable> m2 = xVars.get(new Slot(d2, meal));
                    if (m1 == null || m2 == null) {
                        continue;
                    }
                    for (Map.Entry<String, Variable> ve : m1.entrySet()) {
                        Variable other = m2.get(ve.getKey());
                        if (other != null
                                && !rules.isRepeatExempt(recipeById.get(ve.getKey()))) {
                            Expression ex = model.newExpression(
                                    "consec_" + meal + "_" + d1 + "_" + ve.getKey());
                            ex.upper(1);
                            ex.set(ve.getValue(), 1.0);
                            ex.set(other, 1.0);
                        }
                    }
                }
            }
        }

        // 5) 同餐型两餐位禁止完全相同的非免重复菜组合（连续辅助变量技巧）
        if (rules.noIdenticalSlots()) {
            for (MealType meal : List.of(MealType.LUNCH, MealType.DINNER)) {
                int fixed = rules.fixedDishCount(meal);
                if (fixed <= 0) {
                    continue;
                }
                List<Slot> slots = new ArrayList<>();
                for (Slot s : activeSlots) {
                    if (s.meal() == meal) {
                        slots.add(s);
                    }
                }
                for (int i = 0; i < slots.size(); i++) {
                    for (int j = i + 1; j < slots.size(); j++) {
                        Slot a = slots.get(i);
                        Slot b = slots.get(j);
                        Map<String, Variable> ma = xVars.get(a);
                        Map<String, Variable> mb = xVars.get(b);
                        List<String> common = new ArrayList<>();
                        for (String id : ma.keySet()) {
                            if (mb.containsKey(id) && !rules.isRepeatExempt(recipeById.get(id))) {
                                common.add(id);
                            }
                        }
                        if (common.size() >= fixed) {
                            Expression sumExpr = model.newExpression(
                                    "dupsum_" + meal + "_" + a + "_" + b);
                            sumExpr.upper(fixed - 1);
                            for (String id : common) {
                                Variable y = model.newVariable(
                                        "dup_" + meal + "_" + a + "_" + b + "_" + id);
                                y.lower(0).upper(1);
                                Expression ge = model.newExpression(
                                        "dupge_" + meal + "_" + a + "_" + b + "_" + id);
                                ge.lower(-1);
                                ge.set(y, 1.0);
                                ge.set(ma.get(id), -1.0);
                                ge.set(mb.get(id), -1.0);
                                sumExpr.set(y, 1.0);
                            }
                        }
                    }
                }
            }
        }

        // 6) 鱼餐位：恰有一道满足鱼类要求的菜
        for (Slot s : activeSlots) {
            if (!rules.fishSlots().contains(s)) {
                continue;
            }
            Predicate<Recipe> pred = fishPredicate(s);
            List<Variable> fishVars = new ArrayList<>();
            for (Map.Entry<String, Variable> ve : xVars.get(s).entrySet()) {
                if (pred.test(recipeById.get(ve.getKey()))) {
                    fishVars.add(ve.getValue());
                }
            }
            if (fishVars.isEmpty()) {
                warnings.add(s.day() + " " + s.meal().cn() + ": 没有可用的鱼类菜，已跳过鱼类要求");
            } else {
                Expression ex = model.newExpression("fish_" + s);
                ex.lower(1).upper(1);
                for (Variable v : fishVars) {
                    ex.set(v, 1.0);
                }
            }
        }

        // 7) 周末午餐：恰有一餐鱼、恰有一餐虾（两类各计一次）
        if (rules.weekendLunchFishAndShrimp() && !weekendLunches.isEmpty()) {
            List<Map.Entry<String, Variable>> pool = new ArrayList<>();
            for (Slot s : weekendLunches) {
                for (Map.Entry<String, Variable> ve : xVars.get(s).entrySet()) {
                    pool.add(Map.entry(ve.getKey(), ve.getValue()));
                }
            }
            List<Map.Entry<String, Predicate<Recipe>>> requirements = List.of(
                    Map.entry("鱼", (Predicate<Recipe>) Recipe::isFish),
                    Map.entry("虾", (Predicate<Recipe>) Recipe::isShrimp));
            for (var req : requirements) {
                List<Variable> matched = new ArrayList<>();
                for (var e : pool) {
                    if (req.getValue().test(recipeById.get(e.getKey()))) {
                        matched.add(e.getValue());
                    }
                }
                if (matched.isEmpty()) {
                    warnings.add("周末午餐没有可用的" + req.getKey() + "类菜，已跳过该要求");
                } else {
                    Expression ex = model.newExpression("weekend_" + req.getKey());
                    ex.lower(1).upper(1);
                    for (Variable v : matched) {
                        ex.set(v, 1.0);
                    }
                }
            }
        }

        // 8) 主食份量（同桌不同量）+ 营养约束（按餐次折算）
        double pLo = rules.stapleMin();
        double pHi = rules.stapleMax();
        boolean parity = pLo == pHi && pLo == 1.0;
        Map<PortionKey, Variable> portionVars = new LinkedHashMap<>();
        long devIdx = 0;
        for (Person p : in.persons()) {
            for (DayOfWeek day : DayOfWeek.values()) {
                List<Slot> homeSlots = new ArrayList<>();
                for (MealType meal : MealType.values()) {
                    Slot s = new Slot(day, meal);
                    if (activeSlots.contains(s)
                            && in.schedule().diners(day, meal).contains(p.id())) {
                        homeSlots.add(s);
                    }
                }
                if (homeSlots.isEmpty()) {
                    continue;
                }
                List<Map.Entry<String, Variable>> terms = new ArrayList<>();
                for (Slot s : homeSlots) {
                    for (Map.Entry<String, Variable> ve : xVars.get(s).entrySet()) {
                        Variable var = ve.getValue();
                        if (!parity && recipeById.get(ve.getKey()).category() == Category.STAPLE) {
                            PortionKey key = new PortionKey(s, p.id(), ve.getKey());
                            Variable z = portionVars.get(key);
                            if (z == null) {
                                z = model.newVariable("z_" + s + "_" + p.id() + "_" + ve.getKey());
                                z.lower(0).upper(pHi);
                                Expression up = model.newExpression("zup_" + s + "_" + p.id() + "_" + ve.getKey());
                                up.upper(0);
                                up.set(z, 1.0);
                                up.set(var, -pHi);
                                Expression lo = model.newExpression("zlo_" + s + "_" + p.id() + "_" + ve.getKey());
                                lo.lower(0);
                                lo.set(z, 1.0);
                                lo.set(var, -pLo);
                                portionVars.put(key, z);
                            }
                            var = z;
                        }
                        terms.add(Map.entry(ve.getKey(), var));
                    }
                }
                DailyTargets targets = foldTargets(p, day);
                for (Nutrient n : Nutrient.values()) {
                    NutrientRange range = targets.get(n);
                    double w = rules.weights().getOrDefault(n, 0.0);
                    Expression ex = model.newExpression("nut_" + p.id() + "_" + day + "_" + n);
                    ex.lower(range.min());
                    for (var term : terms) {
                        ex.set(term.getValue(), recipeById.get(term.getKey()).perServing().get(n));
                    }
                    Variable under = model.newVariable("devU" + devIdx);
                    under.lower(0).weight(w);
                    ex.set(under, 1.0);
                    devIdx++;
                    if (range.hasMax()) {
                        ex.upper(range.max());
                        Variable over = model.newVariable("devO" + devIdx);
                        over.lower(0).weight(w);
                        ex.set(over, -1.0);
                        devIdx++;
                    }
                }
            }
        }

        long buildMs = elapsedMs(t0);

        // 9) 求解
        Optimisation.Result result = model.minimise();
        long solveMs = elapsedMs(t0) - buildMs;
        Optimisation.State st = result.getState();

        Status status;
        if (st == Optimisation.State.OPTIMAL || st == Optimisation.State.DISTINCT) {
            status = Status.OPTIMAL;
        } else if (st == Optimisation.State.FEASIBLE) {
            status = Status.FEASIBLE;
        } else if (st == Optimisation.State.INFEASIBLE) {
            status = Status.INFEASIBLE;
        } else if (st == Optimisation.State.UNEXPLORED) {
            status = Status.TIMEOUT;
        } else {
            status = Status.ERROR;
        }

        if (status != Status.OPTIMAL && status != Status.FEASIBLE) {
            return new SolveResult(status, 0.0, buildMs, solveMs, warnings,
                    "求解器状态: " + st, Map.of(), Map.of());
        }

        // 10) 提取解：选菜（>0.5）与主食份量（四舍五入到 0.05 并夹取到 [lo, hi]）
        Map<Slot, Map<String, Double>> dishes = new LinkedHashMap<>();
        for (Map.Entry<Slot, Map<String, Variable>> entry : xVars.entrySet()) {
            Map<String, Double> selected = new LinkedHashMap<>();
            for (Map.Entry<String, Variable> ve : entry.getValue().entrySet()) {
                if (ve.getValue().doubleValue() > 0.5) {
                    selected.put(ve.getKey(), 1.0);
                }
            }
            dishes.put(entry.getKey(), selected);
        }
        Map<PortionKey, Double> portions = new LinkedHashMap<>();
        for (Map.Entry<PortionKey, Variable> e : portionVars.entrySet()) {
            PortionKey key = e.getKey();
            Map<String, Double> sel = dishes.getOrDefault(key.slot(), Map.of());
            if (sel.containsKey(key.recipeId())) {
                double val = Math.round(e.getValue().doubleValue() * 20.0) / 20.0;
                val = Math.max(pLo, Math.min(pHi, val));
                portions.put(key, val);
            }
        }

        return new SolveResult(status, result.getValue(), buildMs, solveMs, warnings,
                null, dishes, portions);
    }

    private static long elapsedMs(long t0) {
        return (System.nanoTime() - t0) / 1_000_000L;
    }
}
