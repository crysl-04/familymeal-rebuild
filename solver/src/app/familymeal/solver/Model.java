package app.familymeal.solver;

import java.time.DayOfWeek;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 数据模型：与反编译还原的 core/model 一一对应。
 * 类名对应关系（原类 = 反编译混淆名）：
 *   MealType=te1, Category=zr, Season=cf2, Nutrient=zo1, Nutrients=bp1,
 *   NutrientRange=ap1, DailyTargets=e40, Ingredient=uv0, Recipe=j62,
 *   Person=rx1, Schedule=ed2, PlanRules=lz1, PlanInput=bz1, Slot=ek2
 */
public final class Model {
    private Model() {}

    public enum MealType {
        BREAKFAST, LUNCH, DINNER;

        public static MealType fromJson(String s) {
            return switch (s) {
                case "breakfast" -> BREAKFAST;
                case "lunch" -> LUNCH;
                case "dinner" -> DINNER;
                default -> throw new IllegalArgumentException("未知餐次: " + s);
            };
        }

        public String cn() {
            return switch (this) {
                case BREAKFAST -> "早餐";
                case LUNCH -> "午餐";
                case DINNER -> "晚餐";
            };
        }

        /** 《中国居民膳食指南》三餐比例（PlanRules.mealShares 默认值） */
        public double defaultShare() {
            return switch (this) {
                case BREAKFAST -> 0.3;
                case LUNCH -> 0.4;
                case DINNER -> 0.3;
            };
        }
    }

    public enum Category {
        BREAKFAST_COURSE("早餐"), MAIN("主菜"), VEGETABLE("蔬菜"), SOUP("汤"), STAPLE("主食");

        public final String cn;

        Category(String cn) {
            this.cn = cn;
        }

        public static Category fromCn(String s) {
            for (Category c : values()) {
                if (c.cn.equals(s)) {
                    return c;
                }
            }
            throw new IllegalArgumentException("未知菜品类别: " + s);
        }
    }

    public enum Season {
        ALL("四季"), SUMMER("夏季"), WINTER("冬季");

        public final String cn;

        Season(String cn) {
            this.cn = cn;
        }

        public static Season fromCn(String s) {
            for (Season v : values()) {
                if (v.cn.equals(s)) {
                    return v;
                }
            }
            throw new IllegalArgumentException("未知季节: " + s);
        }
    }

    public enum Nutrient {
        KCAL, PROTEIN, FAT, CARB, FIBER;

        public String cn() {
            return switch (this) {
                case KCAL -> "热量";
                case PROTEIN -> "蛋白质";
                case FAT -> "脂肪";
                case CARB -> "碳水";
                case FIBER -> "纤维";
            };
        }
    }

    /** 营养偏差权重（lz1.q 默认值） */
    public static final Map<Nutrient, Double> DEFAULT_WEIGHTS = Map.of(
            Nutrient.KCAL, 0.01,
            Nutrient.PROTEIN, 1.0,
            Nutrient.FAT, 0.5,
            Nutrient.CARB, 0.02,
            Nutrient.FIBER, 1.0);

    public record Nutrients(double kcal, double protein, double fat, double carb, double fiber) {
        public double get(Nutrient n) {
            return switch (n) {
                case KCAL -> kcal;
                case PROTEIN -> protein;
                case FAT -> fat;
                case CARB -> carb;
                case FIBER -> fiber;
            };
        }

        public Nutrients scale(double d) {
            return new Nutrients(kcal * d, protein * d, fat * d, carb * d, fiber * d);
        }
    }

    /** 营养区间 [min, max]；max 缺省时为 +∞（无上限） */
    public record NutrientRange(double min, double max) {
        public NutrientRange {
            if (min < 0.0 || Double.isNaN(min)) {
                throw new IllegalArgumentException("min must be >= 0");
            }
            if (max < min) {
                throw new IllegalArgumentException("max must be >= min");
            }
        }

        /** 反编译 ap1 的单参构造：只有下限 */
        public static NutrientRange minOnly(double min) {
            return new NutrientRange(min, Double.POSITIVE_INFINITY);
        }

        public boolean hasMax() {
            return Math.abs(max) <= Double.MAX_VALUE;
        }

        public NutrientRange scale(double d) {
            return new NutrientRange(min * d, max * d);
        }
    }

    /** 五项营养素的目标区间（e40） */
    public record DailyTargets(NutrientRange kcal, NutrientRange protein, NutrientRange fat,
            NutrientRange carb, NutrientRange fiber) {
        public NutrientRange get(Nutrient n) {
            return switch (n) {
                case KCAL -> kcal;
                case PROTEIN -> protein;
                case FAT -> fat;
                case CARB -> carb;
                case FIBER -> fiber;
            };
        }

        public DailyTargets scale(double d) {
            return new DailyTargets(kcal.scale(d), protein.scale(d), fat.scale(d),
                    carb.scale(d), fiber.scale(d));
        }
    }

    public record Ingredient(String id, String name, String category, Nutrients per100g) {
    }

    public record RecipeIngredientLine(String ingredientId, double grams) {
    }

    public record Recipe(String id, String name, Set<MealType> mealTypes, Category category,
            int baseServings, int minDiners, List<RecipeIngredientLine> ingredients,
            Nutrients totalNutrients, Set<String> tags, Season season, boolean quick) {

        /** j62.b()：每份营养 = 总营养 ÷ 基准份数 */
        public Nutrients perServing() {
            return totalNutrients.scale(1.0 / baseServings);
        }

        public boolean isWholeFish() {
            return tags.contains("fish_whole");
        }

        public boolean isFish() {
            return tags.contains("fish_whole") || tags.contains("fish_portion");
        }

        public boolean isShrimp() {
            return tags.contains("shrimp");
        }
    }

    public record Person(String id, String name, DailyTargets targets, Set<String> excludedCategories) {
    }

    /** 时间表：7 天 × 3 餐 → 在家吃饭的成员 id 列表（缺失/空 = 没人在家） */
    public record Schedule(Map<DayOfWeek, Map<MealType, List<String>>> slots) {
        public List<String> diners(DayOfWeek day, MealType meal) {
            Map<MealType, List<String>> m = slots.get(day);
            if (m == null) {
                return List.of();
            }
            List<String> l = m.get(meal);
            return l == null ? List.of() : l;
        }
    }

    /** 餐位（星期, 餐次） */
    public record Slot(DayOfWeek day, MealType meal) {
        @Override
        public String toString() {
            return day.name() + "_" + meal.name();
        }
    }

    public record PortionKey(Slot slot, String personId, String recipeId) {
    }

    /**
     * 计划规则（lz1.PlanRules）。int[]{lo, hi} 表示该类别菜品数区间。
     */
    public record PlanRules(
            Map<MealType, Map<Category, int[]>> structure,
            int maxRepeatsPerWeek,
            Set<Category> repeatExemptCategories,
            boolean noConsecutiveDays,
            boolean noIdenticalSlots,
            boolean weekdayQuickOnly,
            Set<String> quickExemptTags,
            List<Slot> fishSlots,
            int wholeFishMinDiners,
            boolean weekendLunchFishAndShrimp,
            boolean respectExclusions,
            Map<Nutrient, Double> weights,
            double stapleMin,
            double stapleMax,
            Map<MealType, Double> mealShares) {

        /** lz1 无参构造 = 应用默认规则 */
        public static PlanRules defaults() {
            Map<Category, int[]> breakfast = Map.of(Category.BREAKFAST_COURSE, new int[] {1, 1});
            Map<Category, int[]> lunchDinner = Map.of(
                    Category.MAIN, new int[] {1, 1},
                    Category.VEGETABLE, new int[] {1, 1},
                    Category.STAPLE, new int[] {1, 1},
                    Category.SOUP, new int[] {0, 1});
            return new PlanRules(
                    Map.of(MealType.BREAKFAST, breakfast,
                            MealType.LUNCH, lunchDinner,
                            MealType.DINNER, lunchDinner),
                    2,
                    Set.of(Category.STAPLE),
                    true,
                    true,
                    true,
                    Set.of("fish_whole", "fish_portion", "shrimp"),
                    List.of(new Slot(DayOfWeek.WEDNESDAY, MealType.DINNER),
                            new Slot(DayOfWeek.FRIDAY, MealType.DINNER)),
                    3,
                    true,
                    true,
                    DEFAULT_WEIGHTS,
                    0.5,
                    2.0,
                    Map.of(MealType.BREAKFAST, 0.3, MealType.LUNCH, 0.4, MealType.DINNER, 0.3));
        }

        /** 固定份数且非免重复类别的菜数之和（sy1.d()），用于 noIdenticalSlots */
        public int fixedDishCount(MealType meal) {
            Map<Category, int[]> m = structure.getOrDefault(meal, Map.of());
            int sum = 0;
            for (Map.Entry<Category, int[]> e : m.entrySet()) {
                if (!repeatExemptCategories.contains(e.getKey()) && e.getValue()[0] == e.getValue()[1]) {
                    sum += e.getValue()[0];
                }
            }
            return sum;
        }

        public boolean isRepeatExempt(Recipe r) {
            return repeatExemptCategories.contains(r.category());
        }
    }

    /** 求解输入（bz1.PlanInput） */
    public record PlanInput(List<Recipe> recipes, List<Ingredient> ingredients, List<Person> persons,
            Schedule schedule, int month, PlanRules rules,
            Map<Slot, Set<String>> locked, Map<Slot, Set<String>> banned) {
    }
}
