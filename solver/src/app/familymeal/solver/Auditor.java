package app.familymeal.solver;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import app.familymeal.solver.Model.Category;
import app.familymeal.solver.Model.MealType;
import app.familymeal.solver.Model.Nutrient;
import app.familymeal.solver.Model.NutrientRange;
import app.familymeal.solver.Model.Person;
import app.familymeal.solver.Model.PortionKey;
import app.familymeal.solver.Model.Recipe;
import app.familymeal.solver.Model.Slot;

/**
 * 独立审计：不用求解器内部状态，仅凭解本身与规则重新核对全部硬约束，
 * 并按同一权重口径重算目标值（应与求解器目标值一致）。
 */
public final class Auditor {

    public record Violation(String check, String detail) {
        @Override
        public String toString() {
            return "[" + check + "] " + detail;
        }
    }

    public record NutrientRow(String personId, DayOfWeek day, Nutrient nutrient,
            double intake, NutrientRange target, double under, double over, double weighted) {
    }

    public record AuditReport(List<Violation> violations, double recomputedObjective,
            List<NutrientRow> nutrientRows) {

        public boolean clean() {
            return violations.isEmpty();
        }
    }

    private final Model.PlanInput in;
    private final Model.PlanRules rules;
    private final Map<String, Recipe> recipeById;
    private final Map<String, String> categoryByIngredient;
    private final PlanSolver solver; // 复用 isAllowedAt（规则判定与建模保持一致）

    public Auditor(Model.PlanInput input, PlanSolver solver) {
        this.in = input;
        this.rules = input.rules();
        this.solver = solver;
        this.recipeById = new LinkedHashMap<>();
        for (Recipe r : input.recipes()) {
            recipeById.put(r.id(), r);
        }
        this.categoryByIngredient = new LinkedHashMap<>();
        for (Model.Ingredient ing : input.ingredients()) {
            categoryByIngredient.put(ing.id(), ing.category());
        }
    }

    public AuditReport audit(PlanSolver.SolveResult result) {
        List<Violation> violations = new ArrayList<>();
        List<NutrientRow> rows = new ArrayList<>();

        checkStructure(result, violations);
        checkRepeats(result, violations);
        checkConsecutive(result, violations);
        checkIdentical(result, violations);
        checkFishSlots(result, violations);
        checkWeekendFishShrimp(result, violations);
        checkWeekdayQuick(result, violations);
        checkExclusionsAndMinDiners(result, violations);
        checkSeason(result, violations);
        checkPortions(result, violations);

        double objective = checkNutrients(result, rows, violations);
        return new AuditReport(violations, objective, rows);
    }

    private List<String> selected(PlanSolver.SolveResult result, Slot s) {
        Map<String, Double> m = result.dishes().get(s);
        return m == null ? List.of() : new ArrayList<>(m.keySet());
    }

    private double portion(PlanSolver.SolveResult result, Slot s, String personId, String recipeId) {
        Double z = result.portions().get(new PortionKey(s, personId, recipeId));
        return z == null ? 1.0 : z;
    }

    private void checkStructure(PlanSolver.SolveResult result, List<Violation> out) {
        for (DayOfWeek day : DayOfWeek.values()) {
            for (MealType meal : MealType.values()) {
                Slot s = new Slot(day, meal);
                boolean active = !in.schedule().diners(day, meal).isEmpty();
                List<String> sel = selected(result, s);
                if (!active) {
                    if (!sel.isEmpty()) {
                        out.add(new Violation("structure", s + " 无人用餐却排了菜: " + sel));
                    }
                    continue;
                }
                Map<Category, Integer> counts = new TreeMap<>();
                for (String id : sel) {
                    counts.merge(recipeById.get(id).category(), 1, Integer::sum);
                }
                for (var e : rules.structure().getOrDefault(meal, Map.of()).entrySet()) {
                    int actual = counts.getOrDefault(e.getKey(), 0);
                    if (actual < e.getValue()[0] || actual > e.getValue()[1]) {
                        out.add(new Violation("structure", s + " 类别「" + e.getKey().cn
                                + "」数量 " + actual + " 不在 [" + e.getValue()[0] + ","
                                + e.getValue()[1] + "]"));
                    }
                }
                for (var e : counts.entrySet()) {
                    if (!rules.structure().getOrDefault(meal, Map.of()).containsKey(e.getKey())) {
                        out.add(new Violation("structure",
                                s + " 出现结构外类别「" + e.getKey().cn + "」"));
                    }
                }
            }
        }
    }

    private void checkRepeats(PlanSolver.SolveResult result, List<Violation> out) {
        Map<String, Integer> counts = new LinkedHashMap<>();
        for (DayOfWeek day : DayOfWeek.values()) {
            for (MealType meal : MealType.values()) {
                for (String id : selected(result, new Slot(day, meal))) {
                    counts.merge(id, 1, Integer::sum);
                }
            }
        }
        for (var e : counts.entrySet()) {
            Recipe r = recipeById.get(e.getKey());
            if (!rules.isRepeatExempt(r) && e.getValue() > rules.maxRepeatsPerWeek()) {
                out.add(new Violation("repeat", r.name() + " 出现 " + e.getValue()
                        + " 次，超过每周上限 " + rules.maxRepeatsPerWeek()));
            }
        }
    }

    private void checkConsecutive(PlanSolver.SolveResult result, List<Violation> out) {
        if (!rules.noConsecutiveDays()) {
            return;
        }
        DayOfWeek[] days = DayOfWeek.values();
        for (MealType meal : List.of(MealType.LUNCH, MealType.DINNER)) {
            for (int i = 0; i < days.length - 1; i++) {
                Set<String> a = new HashSet<>(selected(result, new Slot(days[i], meal)));
                Set<String> b = new HashSet<>(selected(result, new Slot(days[i + 1], meal)));
                for (String id : a) {
                    if (b.contains(id) && !rules.isRepeatExempt(recipeById.get(id))) {
                        out.add(new Violation("consecutive", recipeById.get(id).name()
                                + " 在 " + days[i] + " 与 " + days[i + 1] + " 的"
                                + meal.cn() + "连续出现"));
                    }
                }
            }
        }
    }

    private void checkIdentical(PlanSolver.SolveResult result, List<Violation> out) {
        if (!rules.noIdenticalSlots()) {
            return;
        }
        for (MealType meal : List.of(MealType.LUNCH, MealType.DINNER)) {
            int fixed = rules.fixedDishCount(meal);
            List<Slot> slots = new ArrayList<>();
            for (DayOfWeek day : DayOfWeek.values()) {
                Slot s = new Slot(day, meal);
                if (!in.schedule().diners(day, meal).isEmpty()) {
                    slots.add(s);
                }
            }
            for (int i = 0; i < slots.size(); i++) {
                for (int j = i + 1; j < slots.size(); j++) {
                    Set<String> a = new HashSet<>(selected(result, slots.get(i)));
                    Set<String> b = new HashSet<>(selected(result, slots.get(j)));
                    // 非免重复且固定类别（主菜/蔬菜）的选择集合完全相同 → 与模型语义一致的最小违反
                    Set<String> fa = new HashSet<>();
                    Set<String> fb = new HashSet<>();
                    for (String id : a) {
                        if (!rules.isRepeatExempt(recipeById.get(id))) {
                            fa.add(id);
                        }
                    }
                    for (String id : b) {
                        if (!rules.isRepeatExempt(recipeById.get(id))) {
                            fb.add(id);
                        }
                    }
                    if (fixed > 0 && fa.equals(fb) && !fa.isEmpty()
                            && fa.size() >= Math.min(fixed, 2)) {
                        out.add(new Violation("identical", slots.get(i) + " 与 " + slots.get(j)
                                + " 的非免重复菜完全相同: " + fa));
                    }
                }
            }
        }
    }

    private void checkFishSlots(PlanSolver.SolveResult result, List<Violation> out) {
        for (Slot s : rules.fishSlots()) {
            if (in.schedule().diners(s.day(), s.meal()).isEmpty()) {
                continue;
            }
            Predicate predicate = new Predicate(s);
            long count = selected(result, s).stream().filter(predicate).count();
            if (count != 1) {
                out.add(new Violation("fishSlot", s + " 满足鱼类要求的菜有 " + count
                        + " 道（应为 1）"));
            }
        }
    }

    private void checkWeekendFishShrimp(PlanSolver.SolveResult result, List<Violation> out) {
        if (!rules.weekendLunchFishAndShrimp()) {
            return;
        }
        boolean anyWeekendActive = false;
        List<String> weekendDishes = new ArrayList<>();
        for (DayOfWeek day : List.of(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY)) {
            Slot s = new Slot(day, MealType.LUNCH);
            if (in.schedule().diners(day, MealType.LUNCH).isEmpty()) {
                continue;
            }
            anyWeekendActive = true;
            weekendDishes.addAll(selected(result, s));
        }
        if (!anyWeekendActive) {
            return;
        }
        long fish = weekendDishes.stream().filter(id -> recipeById.get(id).isFish()).count();
        long shrimp = weekendDishes.stream().filter(id -> recipeById.get(id).isShrimp()).count();
        if (fish != 1) {
            out.add(new Violation("weekendFish", "周末午餐鱼类菜有 " + fish + " 道（应为 1）"));
        }
        if (shrimp != 1) {
            out.add(new Violation("weekendShrimp", "周末午餐虾类菜有 " + shrimp + " 道（应为 1）"));
        }
    }

    private void checkWeekdayQuick(PlanSolver.SolveResult result, List<Violation> out) {
        if (!rules.weekdayQuickOnly()) {
            return;
        }
        for (DayOfWeek day : DayOfWeek.values()) {
            if (day.ordinal() >= 5) {
                continue;
            }
            for (MealType meal : List.of(MealType.LUNCH, MealType.DINNER)) {
                for (String id : selected(result, new Slot(day, meal))) {
                    Recipe r = recipeById.get(id);
                    if (!r.quick()) {
                        boolean exempt = false;
                        for (String tag : r.tags()) {
                            if (rules.quickExemptTags().contains(tag)) {
                                exempt = true;
                                break;
                            }
                        }
                        if (!exempt) {
                            out.add(new Violation("weekdayQuick",
                                    day + " " + meal.cn() + " 的「" + r.name() + "」不是快手菜"));
                        }
                    }
                }
            }
        }
    }

    private void checkExclusionsAndMinDiners(PlanSolver.SolveResult result, List<Violation> out) {
        for (DayOfWeek day : DayOfWeek.values()) {
            for (MealType meal : MealType.values()) {
                Slot s = new Slot(day, meal);
                List<String> diners = in.schedule().diners(day, meal);
                if (diners.isEmpty()) {
                    continue;
                }
                Set<String> excluded = new HashSet<>();
                for (String pid : diners) {
                    in.persons().stream().filter(p -> p.id().equals(pid)).findFirst()
                            .ifPresent(p -> excluded.addAll(p.excludedCategories()));
                }
                for (String id : selected(result, s)) {
                    Recipe r = recipeById.get(id);
                    if (diners.size() < r.minDiners()) {
                        out.add(new Violation("minDiners", s + " 的「" + r.name()
                                + "」最少需要 " + r.minDiners() + " 人，实际 " + diners.size()));
                    }
                    if (rules.respectExclusions() && !excluded.isEmpty()) {
                        for (var line : r.ingredients()) {
                            String cat = categoryByIngredient.get(line.ingredientId());
                            if (cat != null && excluded.contains(cat)) {
                                out.add(new Violation("exclusion", s + " 的「" + r.name()
                                        + "」含忌口类别「" + cat + "」"));
                            }
                        }
                    }
                }
            }
        }
    }

    private void checkSeason(PlanSolver.SolveResult result, List<Violation> out) {
        int month = in.month();
        Set<app.familymeal.solver.Model.Season> allowed = (month < 4 || month >= 11)
                ? Set.of(app.familymeal.solver.Model.Season.ALL, app.familymeal.solver.Model.Season.WINTER)
                : Set.of(app.familymeal.solver.Model.Season.ALL, app.familymeal.solver.Model.Season.SUMMER);
        for (DayOfWeek day : DayOfWeek.values()) {
            for (MealType meal : MealType.values()) {
                for (String id : selected(result, new Slot(day, meal))) {
                    if (!allowed.contains(recipeById.get(id).season())) {
                        out.add(new Violation("season", recipeById.get(id).name()
                                + " 季节 " + recipeById.get(id).season().cn + " 不适合 " + month + " 月"));
                    }
                }
            }
        }
    }

    private void checkPortions(PlanSolver.SolveResult result, List<Violation> out) {
        for (var e : result.portions().entrySet()) {
            PortionKey key = e.getKey();
            Recipe r = recipeById.get(key.recipeId());
            if (r.category() != Category.STAPLE) {
                out.add(new Violation("portion", "份量只允许出现在主食上: " + key));
            }
            if (!in.schedule().diners(key.slot().day(), key.slot().meal()).contains(key.personId())) {
                out.add(new Violation("portion", "份量分配给了不在场的成员: " + key));
            }
            double v = e.getValue();
            if (v < rules.stapleMin() - 1e-9 || v > rules.stapleMax() + 1e-9) {
                out.add(new Violation("portion", "份量 " + v + " 超出 ["
                        + rules.stapleMin() + "," + rules.stapleMax() + "]: " + key));
            }
        }
    }

    private double checkNutrients(PlanSolver.SolveResult result, List<NutrientRow> rows,
            List<Violation> out) {
        double total = 0.0;
        for (Person p : in.persons()) {
            for (DayOfWeek day : DayOfWeek.values()) {
                List<Slot> homeSlots = new ArrayList<>();
                for (MealType meal : MealType.values()) {
                    Slot s = new Slot(day, meal);
                    if (!in.schedule().diners(day, meal).contains(p.id())) {
                        continue;
                    }
                    if (result.dishes().get(s) == null || result.dishes().get(s).isEmpty()) {
                        continue;
                    }
                    homeSlots.add(s);
                }
                if (homeSlots.isEmpty()) {
                    continue;
                }
                Map<Nutrient, Double> intake = new LinkedHashMap<>();
                for (Nutrient n : Nutrient.values()) {
                    intake.put(n, 0.0);
                }
                for (Slot s : homeSlots) {
                    for (String id : selected(result, s)) {
                        Recipe r = recipeById.get(id);
                        double portion = portion(result, s, p.id(), id);
                        for (Nutrient n : Nutrient.values()) {
                            intake.merge(n, r.perServing().get(n) * portion, Double::sum);
                        }
                    }
                }
                // 与模型一致：目标按在家餐次折算
                Model.DailyTargets targets = fold(p, day);
                for (Nutrient n : Nutrient.values()) {
                    NutrientRange range = targets.get(n);
                    double v = intake.get(n);
                    double under = Math.max(0.0, range.min() - v);
                    double over = range.hasMax() ? Math.max(0.0, v - range.max()) : 0.0;
                    double w = rules.weights().getOrDefault(n, 0.0);
                    double weighted = w * (under + over);
                    total += weighted;
                    rows.add(new NutrientRow(p.id(), day, n, v, range, under, over, weighted));
                    if (under > 1e-6 || over > 1e-6) {
                        // 营养偏差是软约束（进目标函数），只记录不判违规
                    }
                }
            }
        }
        return total;
    }

    private Model.DailyTargets fold(Person p, DayOfWeek day) {
        Model.DailyTargets t = p.targets();
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

    /** 鱼餐位谓词（与 PlanSolver.fishPredicate 相同口径） */
    private final class Predicate implements java.util.function.Predicate<String> {
        private final Slot slot;

        Predicate(Slot slot) {
            this.slot = slot;
        }

        @Override
        public boolean test(String recipeId) {
            Recipe r = recipeById.get(recipeId);
            int diners = in.schedule().diners(slot.day(), slot.meal()).size();
            return diners >= rules.wholeFishMinDiners() ? r.isWholeFish() : r.isFish();
        }
    }
}
