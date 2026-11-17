package defpackage;

import androidx.sqlite.SQLiteConnection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ja2 {
    public final int a;
    public final String b;
    public final String c;

    public ja2(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public void a(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        pz1.k(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `ingredient` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `category` TEXT NOT NULL, `kcal` REAL NOT NULL, `protein` REAL NOT NULL, `fat` REAL NOT NULL, `carb` REAL NOT NULL, `fiber` REAL NOT NULL, PRIMARY KEY(`id`))");
        pz1.k(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_ingredient_category` ON `ingredient` (`category`)");
        pz1.k(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `recipe` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `category` TEXT NOT NULL, `meal_types` TEXT NOT NULL, `base_servings` INTEGER NOT NULL, `min_diners` INTEGER NOT NULL, `season` TEXT NOT NULL, `quick` INTEGER NOT NULL, `tags` TEXT NOT NULL, `kcal` REAL NOT NULL, `protein` REAL NOT NULL, `fat` REAL NOT NULL, `carb` REAL NOT NULL, `fiber` REAL NOT NULL, PRIMARY KEY(`id`))");
        pz1.k(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_recipe_category` ON `recipe` (`category`)");
        pz1.k(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `recipe_ingredient` (`recipe_id` TEXT NOT NULL, `ingredient_id` TEXT NOT NULL, `grams` REAL NOT NULL, `position` INTEGER NOT NULL, PRIMARY KEY(`recipe_id`, `ingredient_id`), FOREIGN KEY(`recipe_id`) REFERENCES `recipe`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`ingredient_id`) REFERENCES `ingredient`(`id`) ON UPDATE NO ACTION ON DELETE RESTRICT )");
        pz1.k(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_recipe_ingredient_ingredient_id` ON `recipe_ingredient` (`ingredient_id`)");
        pz1.k(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `meta` (`key` TEXT NOT NULL, `value` TEXT NOT NULL, PRIMARY KEY(`key`))");
        pz1.k(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `person` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `gender` TEXT NOT NULL, `birth_year` INTEGER, `height_cm` REAL, `weight_kg` REAL, `activity` TEXT NOT NULL, `goal` TEXT NOT NULL, `target_weight_kg` REAL, `pace` TEXT NOT NULL, `excluded` TEXT NOT NULL, `position` INTEGER NOT NULL, `m_kcal_min` REAL, `m_kcal_max` REAL, `m_protein_min` REAL, `m_fat_min` REAL, `m_fat_max` REAL, `m_carb_min` REAL, `m_carb_max` REAL, `m_fiber_min` REAL, `kcal_offset` REAL NOT NULL DEFAULT 0, `last_adjusted` TEXT, PRIMARY KEY(`id`))");
        pz1.k(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `schedule_slot` (`day` TEXT NOT NULL, `meal` TEXT NOT NULL, `person_id` TEXT NOT NULL, PRIMARY KEY(`day`, `meal`, `person_id`), FOREIGN KEY(`person_id`) REFERENCES `person`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        pz1.k(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_schedule_slot_person_id` ON `schedule_slot` (`person_id`)");
        pz1.k(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `plan` (`id` TEXT NOT NULL, `week_start` TEXT NOT NULL, `month` INTEGER NOT NULL, `created_at` INTEGER NOT NULL, `status` TEXT NOT NULL, `objective` REAL, `note` TEXT NOT NULL, PRIMARY KEY(`id`))");
        pz1.k(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_plan_week_start` ON `plan` (`week_start`)");
        pz1.k(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `plan_dish` (`plan_id` TEXT NOT NULL, `day` TEXT NOT NULL, `meal` TEXT NOT NULL, `recipe_id` TEXT NOT NULL, `recipe_name` TEXT NOT NULL, `locked` INTEGER NOT NULL, PRIMARY KEY(`plan_id`, `day`, `meal`, `recipe_id`), FOREIGN KEY(`plan_id`) REFERENCES `plan`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        pz1.k(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `plan_diner` (`plan_id` TEXT NOT NULL, `day` TEXT NOT NULL, `meal` TEXT NOT NULL, `person_id` TEXT NOT NULL, PRIMARY KEY(`plan_id`, `day`, `meal`, `person_id`), FOREIGN KEY(`plan_id`) REFERENCES `plan`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        pz1.k(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `plan_portion` (`plan_id` TEXT NOT NULL, `day` TEXT NOT NULL, `meal` TEXT NOT NULL, `person_id` TEXT NOT NULL, `recipe_id` TEXT NOT NULL, `servings` REAL NOT NULL, PRIMARY KEY(`plan_id`, `day`, `meal`, `person_id`, `recipe_id`), FOREIGN KEY(`plan_id`) REFERENCES `plan`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        pz1.k(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `shopping_check` (`plan_id` TEXT NOT NULL, `ingredient_id` TEXT NOT NULL, PRIMARY KEY(`plan_id`, `ingredient_id`), FOREIGN KEY(`plan_id`) REFERENCES `plan`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        pz1.k(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `weight_entry` (`person_id` TEXT NOT NULL, `date` TEXT NOT NULL, `weight_kg` REAL NOT NULL, PRIMARY KEY(`person_id`, `date`), FOREIGN KEY(`person_id`) REFERENCES `person`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        pz1.k(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        pz1.k(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a55c5770ca4efcc445dd20c83eb6024f')");
    }

    public void b(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        pz1.k(sQLiteConnection, "DROP TABLE IF EXISTS `ingredient`");
        pz1.k(sQLiteConnection, "DROP TABLE IF EXISTS `recipe`");
        pz1.k(sQLiteConnection, "DROP TABLE IF EXISTS `recipe_ingredient`");
        pz1.k(sQLiteConnection, "DROP TABLE IF EXISTS `meta`");
        pz1.k(sQLiteConnection, "DROP TABLE IF EXISTS `person`");
        pz1.k(sQLiteConnection, "DROP TABLE IF EXISTS `schedule_slot`");
        pz1.k(sQLiteConnection, "DROP TABLE IF EXISTS `plan`");
        pz1.k(sQLiteConnection, "DROP TABLE IF EXISTS `plan_dish`");
        pz1.k(sQLiteConnection, "DROP TABLE IF EXISTS `plan_diner`");
        pz1.k(sQLiteConnection, "DROP TABLE IF EXISTS `plan_portion`");
        pz1.k(sQLiteConnection, "DROP TABLE IF EXISTS `shopping_check`");
        pz1.k(sQLiteConnection, "DROP TABLE IF EXISTS `weight_entry`");
    }

    public void c(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
    }

    public void d(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public void e(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
    }

    public void f(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public az g(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new xr2("id", "TEXT", true, 1, null, 1));
        linkedHashMap.put("name", new xr2("name", "TEXT", true, 0, null, 1));
        linkedHashMap.put("category", new xr2("category", "TEXT", true, 0, null, 1));
        linkedHashMap.put("kcal", new xr2("kcal", "REAL", true, 0, null, 1));
        linkedHashMap.put("protein", new xr2("protein", "REAL", true, 0, null, 1));
        linkedHashMap.put("fat", new xr2("fat", "REAL", true, 0, null, 1));
        linkedHashMap.put("carb", new xr2("carb", "REAL", true, 0, null, 1));
        linkedHashMap.put("fiber", new xr2("fiber", "REAL", true, 0, null, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new zr2("index_ingredient_category", false, lt.P("category"), lt.P("ASC")));
        as2 as2Var = new as2("ingredient", linkedHashMap, linkedHashSet, linkedHashSet2);
        as2 as2VarT = y02.t(sQLiteConnection, "ingredient");
        if (!as2Var.equals(as2VarT)) {
            return new az("ingredient(com.familymeal.app.data.db.IngredientEntity).\n Expected:\n" + as2Var + "\n Found:\n" + as2VarT, false);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new xr2("id", "TEXT", true, 1, null, 1));
        linkedHashMap2.put("name", new xr2("name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("category", new xr2("category", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("meal_types", new xr2("meal_types", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("base_servings", new xr2("base_servings", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("min_diners", new xr2("min_diners", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("season", new xr2("season", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("quick", new xr2("quick", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("tags", new xr2("tags", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("kcal", new xr2("kcal", "REAL", true, 0, null, 1));
        linkedHashMap2.put("protein", new xr2("protein", "REAL", true, 0, null, 1));
        linkedHashMap2.put("fat", new xr2("fat", "REAL", true, 0, null, 1));
        linkedHashMap2.put("carb", new xr2("carb", "REAL", true, 0, null, 1));
        linkedHashMap2.put("fiber", new xr2("fiber", "REAL", true, 0, null, 1));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new zr2("index_recipe_category", false, lt.P("category"), lt.P("ASC")));
        as2 as2Var2 = new as2("recipe", linkedHashMap2, linkedHashSet3, linkedHashSet4);
        as2 as2VarT2 = y02.t(sQLiteConnection, "recipe");
        if (!as2Var2.equals(as2VarT2)) {
            return new az("recipe(com.familymeal.app.data.db.RecipeEntity).\n Expected:\n" + as2Var2 + "\n Found:\n" + as2VarT2, false);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("recipe_id", new xr2("recipe_id", "TEXT", true, 1, null, 1));
        linkedHashMap3.put("ingredient_id", new xr2("ingredient_id", "TEXT", true, 2, null, 1));
        linkedHashMap3.put("grams", new xr2("grams", "REAL", true, 0, null, 1));
        linkedHashMap3.put("position", new xr2("position", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new yr2("recipe", "CASCADE", "NO ACTION", lt.P("recipe_id"), lt.P("id")));
        linkedHashSet5.add(new yr2("ingredient", "RESTRICT", "NO ACTION", lt.P("ingredient_id"), lt.P("id")));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new zr2("index_recipe_ingredient_ingredient_id", false, lt.P("ingredient_id"), lt.P("ASC")));
        as2 as2Var3 = new as2("recipe_ingredient", linkedHashMap3, linkedHashSet5, linkedHashSet6);
        as2 as2VarT3 = y02.t(sQLiteConnection, "recipe_ingredient");
        if (!as2Var3.equals(as2VarT3)) {
            return new az("recipe_ingredient(com.familymeal.app.data.db.RecipeIngredientEntity).\n Expected:\n" + as2Var3 + "\n Found:\n" + as2VarT3, false);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("key", new xr2("key", "TEXT", true, 1, null, 1));
        linkedHashMap4.put("value", new xr2("value", "TEXT", true, 0, null, 1));
        as2 as2Var4 = new as2("meta", linkedHashMap4, new LinkedHashSet(), new LinkedHashSet());
        as2 as2VarT4 = y02.t(sQLiteConnection, "meta");
        if (!as2Var4.equals(as2VarT4)) {
            return new az("meta(com.familymeal.app.data.db.MetaEntity).\n Expected:\n" + as2Var4 + "\n Found:\n" + as2VarT4, false);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("id", new xr2("id", "TEXT", true, 1, null, 1));
        linkedHashMap5.put("name", new xr2("name", "TEXT", true, 0, null, 1));
        linkedHashMap5.put("gender", new xr2("gender", "TEXT", true, 0, null, 1));
        linkedHashMap5.put("birth_year", new xr2("birth_year", "INTEGER", false, 0, null, 1));
        linkedHashMap5.put("height_cm", new xr2("height_cm", "REAL", false, 0, null, 1));
        linkedHashMap5.put("weight_kg", new xr2("weight_kg", "REAL", false, 0, null, 1));
        linkedHashMap5.put("activity", new xr2("activity", "TEXT", true, 0, null, 1));
        linkedHashMap5.put("goal", new xr2("goal", "TEXT", true, 0, null, 1));
        linkedHashMap5.put("target_weight_kg", new xr2("target_weight_kg", "REAL", false, 0, null, 1));
        linkedHashMap5.put("pace", new xr2("pace", "TEXT", true, 0, null, 1));
        linkedHashMap5.put("excluded", new xr2("excluded", "TEXT", true, 0, null, 1));
        linkedHashMap5.put("position", new xr2("position", "INTEGER", true, 0, null, 1));
        linkedHashMap5.put("m_kcal_min", new xr2("m_kcal_min", "REAL", false, 0, null, 1));
        linkedHashMap5.put("m_kcal_max", new xr2("m_kcal_max", "REAL", false, 0, null, 1));
        linkedHashMap5.put("m_protein_min", new xr2("m_protein_min", "REAL", false, 0, null, 1));
        linkedHashMap5.put("m_fat_min", new xr2("m_fat_min", "REAL", false, 0, null, 1));
        linkedHashMap5.put("m_fat_max", new xr2("m_fat_max", "REAL", false, 0, null, 1));
        linkedHashMap5.put("m_carb_min", new xr2("m_carb_min", "REAL", false, 0, null, 1));
        linkedHashMap5.put("m_carb_max", new xr2("m_carb_max", "REAL", false, 0, null, 1));
        linkedHashMap5.put("m_fiber_min", new xr2("m_fiber_min", "REAL", false, 0, null, 1));
        linkedHashMap5.put("kcal_offset", new xr2("kcal_offset", "REAL", true, 0, "0", 1));
        linkedHashMap5.put("last_adjusted", new xr2("last_adjusted", "TEXT", false, 0, null, 1));
        as2 as2Var5 = new as2("person", linkedHashMap5, new LinkedHashSet(), new LinkedHashSet());
        as2 as2VarT5 = y02.t(sQLiteConnection, "person");
        if (!as2Var5.equals(as2VarT5)) {
            return new az("person(com.familymeal.app.data.db.PersonEntity).\n Expected:\n" + as2Var5 + "\n Found:\n" + as2VarT5, false);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("day", new xr2("day", "TEXT", true, 1, null, 1));
        linkedHashMap6.put("meal", new xr2("meal", "TEXT", true, 2, null, 1));
        linkedHashMap6.put("person_id", new xr2("person_id", "TEXT", true, 3, null, 1));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new yr2("person", "CASCADE", "NO ACTION", lt.P("person_id"), lt.P("id")));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new zr2("index_schedule_slot_person_id", false, lt.P("person_id"), lt.P("ASC")));
        as2 as2Var6 = new as2("schedule_slot", linkedHashMap6, linkedHashSet7, linkedHashSet8);
        as2 as2VarT6 = y02.t(sQLiteConnection, "schedule_slot");
        if (!as2Var6.equals(as2VarT6)) {
            return new az("schedule_slot(com.familymeal.app.data.db.ScheduleSlotEntity).\n Expected:\n" + as2Var6 + "\n Found:\n" + as2VarT6, false);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("id", new xr2("id", "TEXT", true, 1, null, 1));
        linkedHashMap7.put("week_start", new xr2("week_start", "TEXT", true, 0, null, 1));
        linkedHashMap7.put("month", new xr2("month", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("created_at", new xr2("created_at", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("status", new xr2("status", "TEXT", true, 0, null, 1));
        linkedHashMap7.put("objective", new xr2("objective", "REAL", false, 0, null, 1));
        linkedHashMap7.put("note", new xr2("note", "TEXT", true, 0, null, 1));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new zr2("index_plan_week_start", true, lt.P("week_start"), lt.P("ASC")));
        as2 as2Var7 = new as2("plan", linkedHashMap7, linkedHashSet9, linkedHashSet10);
        as2 as2VarT7 = y02.t(sQLiteConnection, "plan");
        if (!as2Var7.equals(as2VarT7)) {
            return new az("plan(com.familymeal.app.data.db.PlanEntity).\n Expected:\n" + as2Var7 + "\n Found:\n" + as2VarT7, false);
        }
        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
        linkedHashMap8.put("plan_id", new xr2("plan_id", "TEXT", true, 1, null, 1));
        linkedHashMap8.put("day", new xr2("day", "TEXT", true, 2, null, 1));
        linkedHashMap8.put("meal", new xr2("meal", "TEXT", true, 3, null, 1));
        linkedHashMap8.put("recipe_id", new xr2("recipe_id", "TEXT", true, 4, null, 1));
        linkedHashMap8.put("recipe_name", new xr2("recipe_name", "TEXT", true, 0, null, 1));
        linkedHashMap8.put("locked", new xr2("locked", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet11 = new LinkedHashSet();
        linkedHashSet11.add(new yr2("plan", "CASCADE", "NO ACTION", lt.P("plan_id"), lt.P("id")));
        as2 as2Var8 = new as2("plan_dish", linkedHashMap8, linkedHashSet11, new LinkedHashSet());
        as2 as2VarT8 = y02.t(sQLiteConnection, "plan_dish");
        if (!as2Var8.equals(as2VarT8)) {
            return new az("plan_dish(com.familymeal.app.data.db.PlanDishEntity).\n Expected:\n" + as2Var8 + "\n Found:\n" + as2VarT8, false);
        }
        LinkedHashMap linkedHashMap9 = new LinkedHashMap();
        linkedHashMap9.put("plan_id", new xr2("plan_id", "TEXT", true, 1, null, 1));
        linkedHashMap9.put("day", new xr2("day", "TEXT", true, 2, null, 1));
        linkedHashMap9.put("meal", new xr2("meal", "TEXT", true, 3, null, 1));
        linkedHashMap9.put("person_id", new xr2("person_id", "TEXT", true, 4, null, 1));
        LinkedHashSet linkedHashSet12 = new LinkedHashSet();
        linkedHashSet12.add(new yr2("plan", "CASCADE", "NO ACTION", lt.P("plan_id"), lt.P("id")));
        as2 as2Var9 = new as2("plan_diner", linkedHashMap9, linkedHashSet12, new LinkedHashSet());
        as2 as2VarT9 = y02.t(sQLiteConnection, "plan_diner");
        if (!as2Var9.equals(as2VarT9)) {
            return new az("plan_diner(com.familymeal.app.data.db.PlanDinerEntity).\n Expected:\n" + as2Var9 + "\n Found:\n" + as2VarT9, false);
        }
        LinkedHashMap linkedHashMap10 = new LinkedHashMap();
        linkedHashMap10.put("plan_id", new xr2("plan_id", "TEXT", true, 1, null, 1));
        linkedHashMap10.put("day", new xr2("day", "TEXT", true, 2, null, 1));
        linkedHashMap10.put("meal", new xr2("meal", "TEXT", true, 3, null, 1));
        linkedHashMap10.put("person_id", new xr2("person_id", "TEXT", true, 4, null, 1));
        linkedHashMap10.put("recipe_id", new xr2("recipe_id", "TEXT", true, 5, null, 1));
        linkedHashMap10.put("servings", new xr2("servings", "REAL", true, 0, null, 1));
        LinkedHashSet linkedHashSet13 = new LinkedHashSet();
        linkedHashSet13.add(new yr2("plan", "CASCADE", "NO ACTION", lt.P("plan_id"), lt.P("id")));
        as2 as2Var10 = new as2("plan_portion", linkedHashMap10, linkedHashSet13, new LinkedHashSet());
        as2 as2VarT10 = y02.t(sQLiteConnection, "plan_portion");
        if (!as2Var10.equals(as2VarT10)) {
            return new az("plan_portion(com.familymeal.app.data.db.PlanPortionEntity).\n Expected:\n" + as2Var10 + "\n Found:\n" + as2VarT10, false);
        }
        LinkedHashMap linkedHashMap11 = new LinkedHashMap();
        linkedHashMap11.put("plan_id", new xr2("plan_id", "TEXT", true, 1, null, 1));
        linkedHashMap11.put("ingredient_id", new xr2("ingredient_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet14 = new LinkedHashSet();
        linkedHashSet14.add(new yr2("plan", "CASCADE", "NO ACTION", lt.P("plan_id"), lt.P("id")));
        as2 as2Var11 = new as2("shopping_check", linkedHashMap11, linkedHashSet14, new LinkedHashSet());
        as2 as2VarT11 = y02.t(sQLiteConnection, "shopping_check");
        if (!as2Var11.equals(as2VarT11)) {
            return new az("shopping_check(com.familymeal.app.data.db.ShoppingCheckEntity).\n Expected:\n" + as2Var11 + "\n Found:\n" + as2VarT11, false);
        }
        LinkedHashMap linkedHashMap12 = new LinkedHashMap();
        linkedHashMap12.put("person_id", new xr2("person_id", "TEXT", true, 1, null, 1));
        linkedHashMap12.put("date", new xr2("date", "TEXT", true, 2, null, 1));
        linkedHashMap12.put("weight_kg", new xr2("weight_kg", "REAL", true, 0, null, 1));
        LinkedHashSet linkedHashSet15 = new LinkedHashSet();
        linkedHashSet15.add(new yr2("person", "CASCADE", "NO ACTION", lt.P("person_id"), lt.P("id")));
        as2 as2Var12 = new as2("weight_entry", linkedHashMap12, linkedHashSet15, new LinkedHashSet());
        as2 as2VarT12 = y02.t(sQLiteConnection, "weight_entry");
        if (as2Var12.equals(as2VarT12)) {
            return new az((String) null, true);
        }
        return new az("weight_entry(com.familymeal.app.data.db.WeightEntryEntity).\n Expected:\n" + as2Var12 + "\n Found:\n" + as2VarT12, false);
    }
}
