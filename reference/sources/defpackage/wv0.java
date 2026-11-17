package defpackage;

import androidx.sqlite.SQLiteStatement;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wv0 extends es {
    public final /* synthetic */ byte l;

    public /* synthetic */ wv0(byte b) {
        this.l = b;
    }

    @Override // defpackage.es
    public final void q(SQLiteStatement sQLiteStatement, Object obj) {
        switch (this.l) {
            case 0:
                mw0 mw0Var = (mw0) obj;
                sQLiteStatement.getClass();
                mw0Var.getClass();
                sQLiteStatement.bindText(1, mw0Var.a);
                sQLiteStatement.bindText(2, mw0Var.b);
                sQLiteStatement.bindText(3, mw0Var.c);
                sQLiteStatement.bindDouble(4, mw0Var.d);
                sQLiteStatement.bindDouble(5, mw0Var.e);
                sQLiteStatement.bindDouble(6, mw0Var.f);
                sQLiteStatement.bindDouble(7, mw0Var.g);
                sQLiteStatement.bindDouble(8, mw0Var.h);
                break;
            case 1:
                mw0 mw0Var2 = (mw0) obj;
                sQLiteStatement.getClass();
                mw0Var2.getClass();
                sQLiteStatement.bindText(1, mw0Var2.a);
                sQLiteStatement.bindText(2, mw0Var2.b);
                sQLiteStatement.bindText(3, mw0Var2.c);
                sQLiteStatement.bindDouble(4, mw0Var2.d);
                sQLiteStatement.bindDouble(5, mw0Var2.e);
                sQLiteStatement.bindDouble(6, mw0Var2.f);
                sQLiteStatement.bindDouble(7, mw0Var2.g);
                sQLiteStatement.bindDouble(8, mw0Var2.h);
                break;
            case 2:
                bg1 bg1Var = (bg1) obj;
                sQLiteStatement.getClass();
                bg1Var.getClass();
                sQLiteStatement.bindText(1, bg1Var.a);
                sQLiteStatement.bindText(2, bg1Var.b);
                break;
            case 3:
                by1 by1Var = (by1) obj;
                sQLiteStatement.getClass();
                by1Var.getClass();
                sQLiteStatement.bindText(1, by1Var.a);
                sQLiteStatement.bindText(2, by1Var.b);
                sQLiteStatement.bindText(3, by1Var.c);
                Integer num = by1Var.d;
                if (num == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindLong(4, num.intValue());
                }
                Double d = by1Var.e;
                if (d == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindDouble(5, d.doubleValue());
                }
                Double d2 = by1Var.f;
                if (d2 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindDouble(6, d2.doubleValue());
                }
                sQLiteStatement.bindText(7, by1Var.g);
                sQLiteStatement.bindText(8, by1Var.h);
                Double d3 = by1Var.i;
                if (d3 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindDouble(9, d3.doubleValue());
                }
                sQLiteStatement.bindText(10, by1Var.j);
                sQLiteStatement.bindText(11, by1Var.k);
                sQLiteStatement.bindLong(12, by1Var.l);
                Double d4 = by1Var.m;
                if (d4 == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindDouble(13, d4.doubleValue());
                }
                Double d5 = by1Var.n;
                if (d5 == null) {
                    sQLiteStatement.bindNull(14);
                } else {
                    sQLiteStatement.bindDouble(14, d5.doubleValue());
                }
                Double d6 = by1Var.o;
                if (d6 == null) {
                    sQLiteStatement.bindNull(15);
                } else {
                    sQLiteStatement.bindDouble(15, d6.doubleValue());
                }
                Double d7 = by1Var.p;
                if (d7 == null) {
                    sQLiteStatement.bindNull(16);
                } else {
                    sQLiteStatement.bindDouble(16, d7.doubleValue());
                }
                Double d8 = by1Var.q;
                if (d8 == null) {
                    sQLiteStatement.bindNull(17);
                } else {
                    sQLiteStatement.bindDouble(17, d8.doubleValue());
                }
                Double d9 = by1Var.r;
                if (d9 == null) {
                    sQLiteStatement.bindNull(18);
                } else {
                    sQLiteStatement.bindDouble(18, d9.doubleValue());
                }
                Double d10 = by1Var.s;
                if (d10 == null) {
                    sQLiteStatement.bindNull(19);
                } else {
                    sQLiteStatement.bindDouble(19, d10.doubleValue());
                }
                Double d11 = by1Var.t;
                if (d11 == null) {
                    sQLiteStatement.bindNull(20);
                } else {
                    sQLiteStatement.bindDouble(20, d11.doubleValue());
                }
                sQLiteStatement.bindDouble(21, by1Var.u);
                String str = by1Var.v;
                if (str != null) {
                    sQLiteStatement.bindText(22, str);
                } else {
                    sQLiteStatement.bindNull(22);
                }
                break;
            case 4:
                by1 by1Var2 = (by1) obj;
                sQLiteStatement.getClass();
                by1Var2.getClass();
                sQLiteStatement.bindText(1, by1Var2.a);
                sQLiteStatement.bindText(2, by1Var2.b);
                sQLiteStatement.bindText(3, by1Var2.c);
                Integer num2 = by1Var2.d;
                if (num2 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindLong(4, num2.intValue());
                }
                Double d12 = by1Var2.e;
                if (d12 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindDouble(5, d12.doubleValue());
                }
                Double d13 = by1Var2.f;
                if (d13 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindDouble(6, d13.doubleValue());
                }
                sQLiteStatement.bindText(7, by1Var2.g);
                sQLiteStatement.bindText(8, by1Var2.h);
                Double d14 = by1Var2.i;
                if (d14 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindDouble(9, d14.doubleValue());
                }
                sQLiteStatement.bindText(10, by1Var2.j);
                sQLiteStatement.bindText(11, by1Var2.k);
                sQLiteStatement.bindLong(12, by1Var2.l);
                Double d15 = by1Var2.m;
                if (d15 == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindDouble(13, d15.doubleValue());
                }
                Double d16 = by1Var2.n;
                if (d16 == null) {
                    sQLiteStatement.bindNull(14);
                } else {
                    sQLiteStatement.bindDouble(14, d16.doubleValue());
                }
                Double d17 = by1Var2.o;
                if (d17 == null) {
                    sQLiteStatement.bindNull(15);
                } else {
                    sQLiteStatement.bindDouble(15, d17.doubleValue());
                }
                Double d18 = by1Var2.p;
                if (d18 == null) {
                    sQLiteStatement.bindNull(16);
                } else {
                    sQLiteStatement.bindDouble(16, d18.doubleValue());
                }
                Double d19 = by1Var2.q;
                if (d19 == null) {
                    sQLiteStatement.bindNull(17);
                } else {
                    sQLiteStatement.bindDouble(17, d19.doubleValue());
                }
                Double d20 = by1Var2.r;
                if (d20 == null) {
                    sQLiteStatement.bindNull(18);
                } else {
                    sQLiteStatement.bindDouble(18, d20.doubleValue());
                }
                Double d21 = by1Var2.s;
                if (d21 == null) {
                    sQLiteStatement.bindNull(19);
                } else {
                    sQLiteStatement.bindDouble(19, d21.doubleValue());
                }
                Double d22 = by1Var2.t;
                if (d22 == null) {
                    sQLiteStatement.bindNull(20);
                } else {
                    sQLiteStatement.bindDouble(20, d22.doubleValue());
                }
                sQLiteStatement.bindDouble(21, by1Var2.u);
                String str2 = by1Var2.v;
                if (str2 != null) {
                    sQLiteStatement.bindText(22, str2);
                } else {
                    sQLiteStatement.bindNull(22);
                }
                break;
            case 5:
                xy1 xy1Var = (xy1) obj;
                sQLiteStatement.getClass();
                xy1Var.getClass();
                sQLiteStatement.bindText(1, xy1Var.a);
                sQLiteStatement.bindText(2, xy1Var.b);
                sQLiteStatement.bindText(3, xy1Var.c);
                sQLiteStatement.bindText(4, xy1Var.d);
                sQLiteStatement.bindText(5, xy1Var.e);
                sQLiteStatement.bindLong(6, xy1Var.f ? 1L : 0L);
                break;
            case 6:
                wy1 wy1Var = (wy1) obj;
                sQLiteStatement.getClass();
                wy1Var.getClass();
                sQLiteStatement.bindText(1, wy1Var.a);
                sQLiteStatement.bindText(2, wy1Var.b);
                sQLiteStatement.bindText(3, wy1Var.c);
                sQLiteStatement.bindText(4, wy1Var.d);
                break;
            case 7:
                cz1 cz1Var = (cz1) obj;
                sQLiteStatement.getClass();
                cz1Var.getClass();
                sQLiteStatement.bindText(1, cz1Var.a);
                sQLiteStatement.bindText(2, cz1Var.b);
                sQLiteStatement.bindText(3, cz1Var.c);
                sQLiteStatement.bindText(4, cz1Var.d);
                sQLiteStatement.bindText(5, cz1Var.e);
                sQLiteStatement.bindDouble(6, cz1Var.f);
                break;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                vi2 vi2Var = (vi2) obj;
                sQLiteStatement.getClass();
                vi2Var.getClass();
                sQLiteStatement.bindText(1, vi2Var.a);
                sQLiteStatement.bindText(2, vi2Var.b);
                break;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                yy1 yy1Var = (yy1) obj;
                sQLiteStatement.getClass();
                yy1Var.getClass();
                sQLiteStatement.bindText(1, yy1Var.a);
                sQLiteStatement.bindText(2, yy1Var.b);
                sQLiteStatement.bindLong(3, yy1Var.c);
                sQLiteStatement.bindLong(4, yy1Var.d);
                sQLiteStatement.bindText(5, yy1Var.e);
                Double d23 = yy1Var.f;
                if (d23 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindDouble(6, d23.doubleValue());
                }
                sQLiteStatement.bindText(7, yy1Var.g);
                break;
            case 10:
                y62 y62Var = (y62) obj;
                sQLiteStatement.getClass();
                y62Var.getClass();
                sQLiteStatement.bindText(1, y62Var.a);
                sQLiteStatement.bindText(2, y62Var.b);
                sQLiteStatement.bindText(3, y62Var.c);
                sQLiteStatement.bindText(4, y62Var.d);
                sQLiteStatement.bindLong(5, y62Var.e);
                sQLiteStatement.bindLong(6, y62Var.f);
                sQLiteStatement.bindText(7, y62Var.g);
                sQLiteStatement.bindLong(8, y62Var.h ? 1L : 0L);
                sQLiteStatement.bindText(9, y62Var.i);
                sQLiteStatement.bindDouble(10, y62Var.j);
                sQLiteStatement.bindDouble(11, y62Var.k);
                sQLiteStatement.bindDouble(12, y62Var.l);
                sQLiteStatement.bindDouble(13, y62Var.m);
                sQLiteStatement.bindDouble(14, y62Var.n);
                break;
            case 11:
                d72 d72Var = (d72) obj;
                sQLiteStatement.getClass();
                d72Var.getClass();
                sQLiteStatement.bindText(1, d72Var.a);
                sQLiteStatement.bindText(2, d72Var.b);
                sQLiteStatement.bindDouble(3, d72Var.c);
                sQLiteStatement.bindLong(4, d72Var.d);
                break;
            case 12:
                y62 y62Var2 = (y62) obj;
                sQLiteStatement.getClass();
                y62Var2.getClass();
                sQLiteStatement.bindText(1, y62Var2.a);
                sQLiteStatement.bindText(2, y62Var2.b);
                sQLiteStatement.bindText(3, y62Var2.c);
                sQLiteStatement.bindText(4, y62Var2.d);
                sQLiteStatement.bindLong(5, y62Var2.e);
                sQLiteStatement.bindLong(6, y62Var2.f);
                sQLiteStatement.bindText(7, y62Var2.g);
                sQLiteStatement.bindLong(8, y62Var2.h ? 1L : 0L);
                sQLiteStatement.bindText(9, y62Var2.i);
                sQLiteStatement.bindDouble(10, y62Var2.j);
                sQLiteStatement.bindDouble(11, y62Var2.k);
                sQLiteStatement.bindDouble(12, y62Var2.l);
                sQLiteStatement.bindDouble(13, y62Var2.m);
                sQLiteStatement.bindDouble(14, y62Var2.n);
                break;
            case 13:
                s63 s63Var = (s63) obj;
                sQLiteStatement.getClass();
                s63Var.getClass();
                sQLiteStatement.bindText(1, s63Var.a);
                sQLiteStatement.bindText(2, s63Var.b);
                sQLiteStatement.bindDouble(3, s63Var.c);
                break;
            case 14:
                kd2 kd2Var = (kd2) obj;
                sQLiteStatement.getClass();
                kd2Var.getClass();
                sQLiteStatement.bindText(1, kd2Var.a);
                sQLiteStatement.bindText(2, kd2Var.b);
                sQLiteStatement.bindText(3, kd2Var.c);
                break;
            default:
                s63 s63Var2 = (s63) obj;
                sQLiteStatement.getClass();
                s63Var2.getClass();
                sQLiteStatement.bindText(1, s63Var2.a);
                sQLiteStatement.bindText(2, s63Var2.b);
                sQLiteStatement.bindDouble(3, s63Var2.c);
                break;
        }
    }

    @Override // defpackage.es
    public final String y() {
        switch (this.l) {
            case 0:
                return "INSERT OR ABORT INTO `ingredient` (`id`,`name`,`category`,`kcal`,`protein`,`fat`,`carb`,`fiber`) VALUES (?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT INTO `ingredient` (`id`,`name`,`category`,`kcal`,`protein`,`fat`,`carb`,`fiber`) VALUES (?,?,?,?,?,?,?,?)";
            case 2:
                return "INSERT INTO `meta` (`key`,`value`) VALUES (?,?)";
            case 3:
                return "INSERT OR ABORT INTO `person` (`id`,`name`,`gender`,`birth_year`,`height_cm`,`weight_kg`,`activity`,`goal`,`target_weight_kg`,`pace`,`excluded`,`position`,`m_kcal_min`,`m_kcal_max`,`m_protein_min`,`m_fat_min`,`m_fat_max`,`m_carb_min`,`m_carb_max`,`m_fiber_min`,`kcal_offset`,`last_adjusted`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 4:
                return "INSERT INTO `person` (`id`,`name`,`gender`,`birth_year`,`height_cm`,`weight_kg`,`activity`,`goal`,`target_weight_kg`,`pace`,`excluded`,`position`,`m_kcal_min`,`m_kcal_max`,`m_protein_min`,`m_fat_min`,`m_fat_max`,`m_carb_min`,`m_carb_max`,`m_fiber_min`,`kcal_offset`,`last_adjusted`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 5:
                return "INSERT OR ABORT INTO `plan_dish` (`plan_id`,`day`,`meal`,`recipe_id`,`recipe_name`,`locked`) VALUES (?,?,?,?,?,?)";
            case 6:
                return "INSERT OR ABORT INTO `plan_diner` (`plan_id`,`day`,`meal`,`person_id`) VALUES (?,?,?,?)";
            case 7:
                return "INSERT OR ABORT INTO `plan_portion` (`plan_id`,`day`,`meal`,`person_id`,`recipe_id`,`servings`) VALUES (?,?,?,?,?,?)";
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                return "INSERT OR IGNORE INTO `shopping_check` (`plan_id`,`ingredient_id`) VALUES (?,?)";
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                return "INSERT INTO `plan` (`id`,`week_start`,`month`,`created_at`,`status`,`objective`,`note`) VALUES (?,?,?,?,?,?,?)";
            case 10:
                return "INSERT OR ABORT INTO `recipe` (`id`,`name`,`category`,`meal_types`,`base_servings`,`min_diners`,`season`,`quick`,`tags`,`kcal`,`protein`,`fat`,`carb`,`fiber`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 11:
                return "INSERT OR ABORT INTO `recipe_ingredient` (`recipe_id`,`ingredient_id`,`grams`,`position`) VALUES (?,?,?,?)";
            case 12:
                return "INSERT INTO `recipe` (`id`,`name`,`category`,`meal_types`,`base_servings`,`min_diners`,`season`,`quick`,`tags`,`kcal`,`protein`,`fat`,`carb`,`fiber`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 13:
                return "INSERT OR ABORT INTO `weight_entry` (`person_id`,`date`,`weight_kg`) VALUES (?,?,?)";
            case 14:
                return "INSERT OR IGNORE INTO `schedule_slot` (`day`,`meal`,`person_id`) VALUES (?,?,?)";
            default:
                return "INSERT INTO `weight_entry` (`person_id`,`date`,`weight_kg`) VALUES (?,?,?)";
        }
    }
}
