package app.familymeal.solver;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import app.familymeal.solver.Model.Category;
import app.familymeal.solver.Model.DailyTargets;
import app.familymeal.solver.Model.Ingredient;
import app.familymeal.solver.Model.MealType;
import app.familymeal.solver.Model.Nutrient;
import app.familymeal.solver.Model.NutrientRange;
import app.familymeal.solver.Model.Nutrients;
import app.familymeal.solver.Model.Person;
import app.familymeal.solver.Model.Recipe;
import app.familymeal.solver.Model.RecipeIngredientLine;
import app.familymeal.solver.Model.Schedule;
import app.familymeal.solver.Model.Season;

/**
 * 种子 JSON 加载与实体校验（EntityChecks 等价规则的 JVM 子集）。
 * 校验失败抛 IllegalArgumentException，消息为中文并指明文件与条目。
 */
public final class SeedLoader {
    private SeedLoader() {}

    private static final Pattern ID = Pattern.compile("[a-z0-9_]{1,64}");
    private static final Gson GSON = new GsonBuilder().setLenient().create();

    public record SeedData(List<Ingredient> ingredients, List<Recipe> recipes,
            List<Person> persons, Schedule schedule) {}

    // ---------- Gson DTO ----------
    static final class IngredientDto {
        String id, name, category;
        NutDto per_100g;
    }

    static final class NutDto {
        double kcal, protein, fat, carb, fiber;
    }

    static final class RecipeDto {
        String id, name, category, season;
        List<String> meal_types;
        int base_servings = 1;
        Integer min_diners; // 种子数据缺省 → 1
        List<LineDto> ingredients;
        NutDto total_nutrients;
        List<String> tags;
        boolean quick;
    }

    static final class LineDto {
        String id;
        double amount_g;
    }

    static final class RangeDto {
        Double min, max;
    }

    static final class TargetsDto {
        RangeDto kcal, protein, fat, carb, fiber;
    }

    static final class PersonDto {
        String id, name, gender, goal;
        TargetsDto daily_targets;
        List<String> excluded_ingredients;
    }


    // ---------- 加载 ----------
    public static SeedData load(Path dir) throws IOException {
        List<Ingredient> ingredients = loadIngredients(dir.resolve("ingredients.json"));
        List<Recipe> recipes = loadRecipes(dir.resolve("recipes.json"));
        List<Person> persons = loadPersons(dir.resolve("persons.json"));
        Schedule schedule = loadSchedule(dir.resolve("schedule.json"));
        validateReferences(recipes, ingredients, persons);
        return new SeedData(ingredients, recipes, persons, schedule);
    }

    private static JsonElement parse(Path file) throws IOException {
        String content = Files.readString(file, StandardCharsets.UTF_8);
        return JsonParser.parseString(content);
    }

    private static List<Ingredient> loadIngredients(Path file) throws IOException {
        IngredientDto[] dtos = GSON.fromJson(parse(file), IngredientDto[].class);
        List<Ingredient> out = new ArrayList<>();
        Set<String> ids = new HashSet<>();
        for (int i = 0; i < dtos.length; i++) {
            IngredientDto d = dtos[i];
            String where = file.getFileName() + "[" + i + "]";
            checkId(d.id, where);
            checkName(d.name, where);
            require(d.category != null, where, "category 不能为空");
            require(d.per_100g != null, where, "per_100g 不能为空");
            Nutrients n = new Nutrients(d.per_100g.kcal, d.per_100g.protein, d.per_100g.fat,
                    d.per_100g.carb, d.per_100g.fiber);
            require(n.protein() + n.fat() + n.carb() + n.fiber() <= 100.0 + 1e-9,
                    where, "每 100 g 中蛋白、脂肪、碳水、纤维之和不得超过 100 g");
            require(!Double.isNaN(n.kcal()) && n.kcal() >= 0, where, "热量必须为非负数值");
            require(ids.add(d.id), where, "食材 id 重复: " + d.id);
            out.add(new Ingredient(d.id, d.name, d.category, n));
        }
        return out;
    }

    private static List<Recipe> loadRecipes(Path file) throws IOException {
        RecipeDto[] dtos = GSON.fromJson(parse(file), RecipeDto[].class);
        List<Recipe> out = new ArrayList<>();
        Set<String> ids = new HashSet<>();
        Set<String> lineIds = new HashSet<>();
        for (int i = 0; i < dtos.length; i++) {
            RecipeDto d = dtos[i];
            String where = file.getFileName() + "[" + i + "]";
            checkId(d.id, where);
            checkName(d.name, where);
            require(d.meal_types != null && !d.meal_types.isEmpty(), where, "meal_types 不能为空");
            Set<MealType> meals = new HashSet<>();
            for (String mt : d.meal_types) {
                meals.add(MealType.fromJson(mt));
            }
            Category cat = Category.fromCn(d.category);
            Season season = Season.fromCn(d.season);
            require(d.base_servings >= 1, where, "base_servings 必须 >= 1");
            int minDiners = d.min_diners == null ? 1 : d.min_diners;
            require(minDiners >= 1, where, "min_diners 必须 >= 1");
            require(d.ingredients != null, where, "ingredients 不能为空");
            List<RecipeIngredientLine> lines = new ArrayList<>();
            lineIds.clear();
            for (LineDto l : d.ingredients) {
                checkId(l.id, where);
                require(l.amount_g > 0 && l.amount_g <= 5000, where,
                        "食材克数必须在 0–5000 之间: " + l.id);
                require(lineIds.add(l.id), where, "同一道菜里一种食材只能出现一次: " + l.id);
                lines.add(new RecipeIngredientLine(l.id, l.amount_g));
            }
            require(d.total_nutrients != null, where, "total_nutrients 不能为空");
            Nutrients n = new Nutrients(d.total_nutrients.kcal, d.total_nutrients.protein,
                    d.total_nutrients.fat, d.total_nutrients.carb, d.total_nutrients.fiber);
            Set<String> tags = d.tags == null ? Set.of() : new HashSet<>(d.tags);
            require(ids.add(d.id), where, "菜谱 id 重复: " + d.id);
            out.add(new Recipe(d.id, d.name, meals, cat, d.base_servings, minDiners, lines, n,
                    tags, season, d.quick));
        }
        return out;
    }

    private static List<Person> loadPersons(Path file) throws IOException {
        PersonDto[] dtos = GSON.fromJson(parse(file), PersonDto[].class);
        List<Person> out = new ArrayList<>();
        Set<String> ids = new HashSet<>();
        for (int i = 0; i < dtos.length; i++) {
            PersonDto d = dtos[i];
            String where = file.getFileName() + "[" + i + "]";
            checkId(d.id, where);
            checkName(d.name, where);
            require(d.daily_targets != null, where, "daily_targets 不能为空");
            TargetsDto t = d.daily_targets;
            DailyTargets targets = new DailyTargets(
                    range(t.kcal, true), range(t.protein, false), range(t.fat, true),
                    range(t.carb, true), range(t.fiber, false));
            Set<String> excluded = d.excluded_ingredients == null
                    ? Set.of()
                    : new HashSet<>(d.excluded_ingredients);
            require(ids.add(d.id), where, "成员 id 重复: " + d.id);
            out.add(new Person(d.id, d.name, targets, excluded));
        }
        return out;
    }

    /** 种子口径：kcal/fat/carb 有 min 与 max；protein/fiber 只有 min（无上限）。 */
    private static NutrientRange range(RangeDto r, boolean hasMaxInSeed) {
        if (r == null) {
            return NutrientRange.minOnly(0.0);
        }
        double min = r.min == null ? 0.0 : r.min;
        double max = r.max == null ? Double.POSITIVE_INFINITY : r.max;
        if (!hasMaxInSeed && r.max == null) {
            return NutrientRange.minOnly(min);
        }
        return new NutrientRange(min, max);
    }

    private static Schedule loadSchedule(Path file) throws IOException {
        java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<Map<String, Map<String, List<String>>>>() {
        }.getType();
        Map<String, Map<String, List<String>>> dto = GSON.fromJson(parse(file), type);
        Map<DayOfWeek, Map<MealType, List<String>>> slots = new HashMap<>();
        Map<String, DayOfWeek> dayMap = Map.of(
                "monday", DayOfWeek.MONDAY, "tuesday", DayOfWeek.TUESDAY,
                "wednesday", DayOfWeek.WEDNESDAY, "thursday", DayOfWeek.THURSDAY,
                "friday", DayOfWeek.FRIDAY, "saturday", DayOfWeek.SATURDAY,
                "sunday", DayOfWeek.SUNDAY);
        for (Map.Entry<String, Map<String, List<String>>> day : dto.entrySet()) {
            DayOfWeek dow = dayMap.get(day.getKey().toLowerCase(Locale.ROOT));
            require(dow != null, file.getFileName() + ":" + day.getKey(), "未知星期");
            Map<MealType, List<String>> meals = new HashMap<>();
            for (Map.Entry<String, List<String>> meal : day.getValue().entrySet()) {
                meals.put(MealType.fromJson(meal.getKey()),
                        meal.getValue() == null ? List.of() : List.copyOf(meal.getValue()));
            }
            slots.put(dow, meals);
        }
        return new Schedule(Map.copyOf(slots));
    }

    // ---------- 引用完整性 ----------
    private static void validateReferences(List<Recipe> recipes, List<Ingredient> ingredients,
            List<Person> persons) {
        Set<String> ingIds = new HashSet<>();
        for (Ingredient ing : ingredients) {
            ingIds.add(ing.id());
        }
        for (Recipe r : recipes) {
            for (RecipeIngredientLine line : r.ingredients()) {
                require(ingIds.contains(line.ingredientId()), "菜谱 " + r.id(),
                        "引用的食材不存在: " + line.ingredientId());
            }
        }
        Set<String> personIds = new HashSet<>();
        for (Person p : persons) {
            personIds.add(p.id());
        }
        // 时间表引用的成员必须存在
        //（在 SeedData 装配后校验 schedule 由调用方传入，见 load()）
    }

    private static void validateSchedule(Schedule schedule, List<Person> persons) {
        Set<String> personIds = new HashSet<>();
        for (Person p : persons) {
            personIds.add(p.id());
        }
        for (DayOfWeek day : DayOfWeek.values()) {
            for (MealType meal : MealType.values()) {
                for (String pid : schedule.diners(day, meal)) {
                    require(personIds.contains(pid), "schedule", "时间表引用的成员不存在: " + pid);
                }
            }
        }
    }

    public static SeedData loadAndValidate(Path dir) throws IOException {
        SeedData data = load(dir);
        validateSchedule(data.schedule(), data.persons());
        return data;
    }

    // ---------- 校验工具 ----------
    private static void checkId(String id, String where) {
        require(id != null && ID.matcher(id).matches(), where,
                "id 只允许 [a-z0-9_]，长度 1–64: " + id);
    }

    private static void checkName(String name, String where) {
        require(name != null && !name.isBlank(), where, "名称不能为空");
        require(name.strip().equals(name), where, "名称不能有首尾空格: " + name);
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            require(!Character.isISOControl(c), where, "名称不能包含控制字符");
        }
    }

    private static void require(boolean condition, String where, String message) {
        if (!condition) {
            throw new IllegalArgumentException(where + ": " + message);
        }
    }

    /** 供 Main 使用的 Stream 引用消除 */
    @SuppressWarnings("unused")
    private static Stream<Path> unused(Path dir) {
        return Stream.empty();
    }
}
