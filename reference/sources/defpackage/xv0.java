package defpackage;

import androidx.sqlite.SQLiteStatement;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xv0 extends ou {
    public final /* synthetic */ byte g;

    public /* synthetic */ xv0(byte b) {
        this.g = b;
    }

    @Override // defpackage.ou
    public final void m(SQLiteStatement sQLiteStatement, Object obj) {
        switch (this.g) {
            case 0:
                mw0 mw0Var = (mw0) obj;
                sQLiteStatement.getClass();
                mw0Var.getClass();
                String str = mw0Var.a;
                sQLiteStatement.bindText(1, str);
                sQLiteStatement.bindText(2, mw0Var.b);
                sQLiteStatement.bindText(3, mw0Var.c);
                sQLiteStatement.bindDouble(4, mw0Var.d);
                sQLiteStatement.bindDouble(5, mw0Var.e);
                sQLiteStatement.bindDouble(6, mw0Var.f);
                sQLiteStatement.bindDouble(7, mw0Var.g);
                sQLiteStatement.bindDouble(8, mw0Var.h);
                sQLiteStatement.bindText(9, str);
                break;
            case 1:
                bg1 bg1Var = (bg1) obj;
                sQLiteStatement.getClass();
                bg1Var.getClass();
                String str2 = bg1Var.a;
                sQLiteStatement.bindText(1, str2);
                sQLiteStatement.bindText(2, bg1Var.b);
                sQLiteStatement.bindText(3, str2);
                break;
            case 2:
                by1 by1Var = (by1) obj;
                sQLiteStatement.getClass();
                by1Var.getClass();
                String str3 = by1Var.a;
                sQLiteStatement.bindText(1, str3);
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
                String str4 = by1Var.v;
                if (str4 == null) {
                    sQLiteStatement.bindNull(22);
                } else {
                    sQLiteStatement.bindText(22, str4);
                }
                sQLiteStatement.bindText(23, str3);
                break;
            case 3:
                yy1 yy1Var = (yy1) obj;
                sQLiteStatement.getClass();
                yy1Var.getClass();
                String str5 = yy1Var.a;
                sQLiteStatement.bindText(1, str5);
                sQLiteStatement.bindText(2, yy1Var.b);
                sQLiteStatement.bindLong(3, yy1Var.c);
                sQLiteStatement.bindLong(4, yy1Var.d);
                sQLiteStatement.bindText(5, yy1Var.e);
                Double d12 = yy1Var.f;
                if (d12 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindDouble(6, d12.doubleValue());
                }
                sQLiteStatement.bindText(7, yy1Var.g);
                sQLiteStatement.bindText(8, str5);
                break;
            case 4:
                y62 y62Var = (y62) obj;
                sQLiteStatement.getClass();
                y62Var.getClass();
                String str6 = y62Var.a;
                sQLiteStatement.bindText(1, str6);
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
                sQLiteStatement.bindText(15, str6);
                break;
            default:
                s63 s63Var = (s63) obj;
                sQLiteStatement.getClass();
                s63Var.getClass();
                String str7 = s63Var.a;
                sQLiteStatement.bindText(1, str7);
                String str8 = s63Var.b;
                sQLiteStatement.bindText(2, str8);
                sQLiteStatement.bindDouble(3, s63Var.c);
                sQLiteStatement.bindText(4, str7);
                sQLiteStatement.bindText(5, str8);
                break;
        }
    }

    @Override // defpackage.ou
    public final String s() {
        switch (this.g) {
            case 0:
                return "UPDATE `ingredient` SET `id` = ?,`name` = ?,`category` = ?,`kcal` = ?,`protein` = ?,`fat` = ?,`carb` = ?,`fiber` = ? WHERE `id` = ?";
            case 1:
                return "UPDATE `meta` SET `key` = ?,`value` = ? WHERE `key` = ?";
            case 2:
                return "UPDATE `person` SET `id` = ?,`name` = ?,`gender` = ?,`birth_year` = ?,`height_cm` = ?,`weight_kg` = ?,`activity` = ?,`goal` = ?,`target_weight_kg` = ?,`pace` = ?,`excluded` = ?,`position` = ?,`m_kcal_min` = ?,`m_kcal_max` = ?,`m_protein_min` = ?,`m_fat_min` = ?,`m_fat_max` = ?,`m_carb_min` = ?,`m_carb_max` = ?,`m_fiber_min` = ?,`kcal_offset` = ?,`last_adjusted` = ? WHERE `id` = ?";
            case 3:
                return "UPDATE `plan` SET `id` = ?,`week_start` = ?,`month` = ?,`created_at` = ?,`status` = ?,`objective` = ?,`note` = ? WHERE `id` = ?";
            case 4:
                return "UPDATE `recipe` SET `id` = ?,`name` = ?,`category` = ?,`meal_types` = ?,`base_servings` = ?,`min_diners` = ?,`season` = ?,`quick` = ?,`tags` = ?,`kcal` = ?,`protein` = ?,`fat` = ?,`carb` = ?,`fiber` = ? WHERE `id` = ?";
            default:
                return "UPDATE `weight_entry` SET `person_id` = ?,`date` = ?,`weight_kg` = ? WHERE `person_id` = ? AND `date` = ?";
        }
    }
}
