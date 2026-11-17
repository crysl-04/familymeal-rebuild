package defpackage;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ql implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ String i;

    public /* synthetic */ ql(String str, byte b) {
        this.h = b;
        this.i = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vp0
    public final Object h(Object obj) throws Exception {
        byte b = this.h;
        Object text = null;
        j23 j23Var = j23.a;
        String str = this.i;
        switch (b) {
            case 0:
                dh2 dh2Var = (dh2) obj;
                bh2.j(dh2Var, 1);
                ch2 ch2Var = ah2.d;
                q21 q21Var = bh2.a[2];
                ch2Var.getClass();
                dh2Var.a(ch2Var, str);
                return j23Var;
            case 1:
                dh2 dh2Var2 = (dh2) obj;
                bh2.j(dh2Var2, 0);
                bh2.f(dh2Var2, str);
                return j23Var;
            case 2:
                dh2 dh2Var3 = (dh2) obj;
                od odVar = new od(str);
                q21[] q21VarArr = bh2.a;
                dh2Var3.a(ah2.C, lt.P(odVar));
                bh2.k(dh2Var3, 0);
                return j23Var;
            case 3:
                dh2 dh2Var4 = (dh2) obj;
                od odVar2 = new od(str);
                q21[] q21VarArr2 = bh2.a;
                dh2Var4.a(ah2.C, lt.P(odVar2));
                bh2.k(dh2Var4, 0);
                return j23Var;
            case 4:
                q21[] q21VarArr3 = bh2.a;
                ch2 ch2Var2 = ah2.d;
                q21 q21Var2 = bh2.a[2];
                ch2Var2.getClass();
                ((dh2) obj).a(ch2Var2, str);
                return j23Var;
            case 5:
                dh2 dh2Var5 = (dh2) obj;
                bh2.j(dh2Var5, 0);
                bh2.f(dh2Var5, str);
                return j23Var;
            case 6:
                q21[] q21VarArr4 = bh2.a;
                ch2 ch2Var3 = ah2.d;
                q21 q21Var3 = bh2.a[2];
                ch2Var3.getClass();
                ((dh2) obj).a(ch2Var3, str);
                return j23Var;
            case 7:
                dh2 dh2Var6 = (dh2) obj;
                bh2.f(dh2Var6, str);
                bh2.k(dh2Var6, 5);
                return j23Var;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM ingredient WHERE id = ?");
                try {
                    sQLiteStatementPrepare.bindText(1, str);
                    sQLiteStatementPrepare.step();
                    return Integer.valueOf(r02.u(sQLiteConnection));
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj;
                sQLiteConnection2.getClass();
                SQLiteStatement sQLiteStatementPrepare2 = sQLiteConnection2.prepare("SELECT r.name FROM recipe r JOIN recipe_ingredient ri ON ri.recipe_id = r.id WHERE ri.ingredient_id = ? ORDER BY r.name");
                try {
                    sQLiteStatementPrepare2.bindText(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        arrayList.add(sQLiteStatementPrepare2.getText(0));
                    }
                    sQLiteStatementPrepare2.close();
                    return arrayList;
                } catch (Throwable th) {
                    sQLiteStatementPrepare2.close();
                    throw th;
                }
            case 10:
                SQLiteConnection sQLiteConnection3 = (SQLiteConnection) obj;
                sQLiteConnection3.getClass();
                SQLiteStatement sQLiteStatementPrepare3 = sQLiteConnection3.prepare("SELECT * FROM ingredient WHERE id = ?");
                try {
                    sQLiteStatementPrepare3.bindText(1, str);
                    return sQLiteStatementPrepare3.step() ? new mw0(sQLiteStatementPrepare3.getText(y02.m(sQLiteStatementPrepare3, "id")), sQLiteStatementPrepare3.getText(y02.m(sQLiteStatementPrepare3, "name")), sQLiteStatementPrepare3.getText(y02.m(sQLiteStatementPrepare3, "category")), sQLiteStatementPrepare3.getDouble(y02.m(sQLiteStatementPrepare3, "kcal")), sQLiteStatementPrepare3.getDouble(y02.m(sQLiteStatementPrepare3, "protein")), sQLiteStatementPrepare3.getDouble(y02.m(sQLiteStatementPrepare3, "fat")), sQLiteStatementPrepare3.getDouble(y02.m(sQLiteStatementPrepare3, "carb")), sQLiteStatementPrepare3.getDouble(y02.m(sQLiteStatementPrepare3, "fiber"))) : null;
                } finally {
                    sQLiteStatementPrepare3.close();
                }
            case 11:
                SQLiteConnection sQLiteConnection4 = (SQLiteConnection) obj;
                sQLiteConnection4.getClass();
                SQLiteStatement sQLiteStatementPrepare4 = sQLiteConnection4.prepare("SELECT value FROM meta WHERE `key` = ?");
                try {
                    sQLiteStatementPrepare4.bindText(1, str);
                    if (sQLiteStatementPrepare4.step() && !sQLiteStatementPrepare4.isNull(0)) {
                        text = sQLiteStatementPrepare4.getText(0);
                        break;
                    }
                    return text;
                } finally {
                    sQLiteStatementPrepare4.close();
                }
            case 12:
                SQLiteConnection sQLiteConnection5 = (SQLiteConnection) obj;
                sQLiteConnection5.getClass();
                SQLiteStatement sQLiteStatementPrepare5 = sQLiteConnection5.prepare("DELETE FROM person WHERE id = ?");
                try {
                    sQLiteStatementPrepare5.bindText(1, str);
                    sQLiteStatementPrepare5.step();
                    return Integer.valueOf(r02.u(sQLiteConnection5));
                } finally {
                    sQLiteStatementPrepare5.close();
                }
            case 13:
                SQLiteConnection sQLiteConnection6 = (SQLiteConnection) obj;
                sQLiteConnection6.getClass();
                SQLiteStatement sQLiteStatementPrepare6 = sQLiteConnection6.prepare("SELECT * FROM person WHERE id = ?");
                try {
                    sQLiteStatementPrepare6.bindText(1, str);
                    int iM = y02.m(sQLiteStatementPrepare6, "id");
                    int iM2 = y02.m(sQLiteStatementPrepare6, "name");
                    int iM3 = y02.m(sQLiteStatementPrepare6, "gender");
                    int iM4 = y02.m(sQLiteStatementPrepare6, "birth_year");
                    int iM5 = y02.m(sQLiteStatementPrepare6, "height_cm");
                    int iM6 = y02.m(sQLiteStatementPrepare6, "weight_kg");
                    int iM7 = y02.m(sQLiteStatementPrepare6, "activity");
                    int iM8 = y02.m(sQLiteStatementPrepare6, "goal");
                    int iM9 = y02.m(sQLiteStatementPrepare6, "target_weight_kg");
                    int iM10 = y02.m(sQLiteStatementPrepare6, "pace");
                    int iM11 = y02.m(sQLiteStatementPrepare6, "excluded");
                    int iM12 = y02.m(sQLiteStatementPrepare6, "position");
                    int iM13 = y02.m(sQLiteStatementPrepare6, "m_kcal_min");
                    int iM14 = y02.m(sQLiteStatementPrepare6, "m_kcal_max");
                    int iM15 = y02.m(sQLiteStatementPrepare6, "m_protein_min");
                    int iM16 = y02.m(sQLiteStatementPrepare6, "m_fat_min");
                    int iM17 = y02.m(sQLiteStatementPrepare6, "m_fat_max");
                    int iM18 = y02.m(sQLiteStatementPrepare6, "m_carb_min");
                    int iM19 = y02.m(sQLiteStatementPrepare6, "m_carb_max");
                    int iM20 = y02.m(sQLiteStatementPrepare6, "m_fiber_min");
                    int iM21 = y02.m(sQLiteStatementPrepare6, "kcal_offset");
                    int iM22 = y02.m(sQLiteStatementPrepare6, "last_adjusted");
                    if (sQLiteStatementPrepare6.step()) {
                        text = new by1(sQLiteStatementPrepare6.getText(iM), sQLiteStatementPrepare6.getText(iM2), sQLiteStatementPrepare6.getText(iM3), sQLiteStatementPrepare6.isNull(iM4) ? null : Integer.valueOf((int) sQLiteStatementPrepare6.getLong(iM4)), sQLiteStatementPrepare6.isNull(iM5) ? null : Double.valueOf(sQLiteStatementPrepare6.getDouble(iM5)), sQLiteStatementPrepare6.isNull(iM6) ? null : Double.valueOf(sQLiteStatementPrepare6.getDouble(iM6)), sQLiteStatementPrepare6.getText(iM7), sQLiteStatementPrepare6.getText(iM8), sQLiteStatementPrepare6.isNull(iM9) ? null : Double.valueOf(sQLiteStatementPrepare6.getDouble(iM9)), sQLiteStatementPrepare6.getText(iM10), sQLiteStatementPrepare6.getText(iM11), (int) sQLiteStatementPrepare6.getLong(iM12), sQLiteStatementPrepare6.isNull(iM13) ? null : Double.valueOf(sQLiteStatementPrepare6.getDouble(iM13)), sQLiteStatementPrepare6.isNull(iM14) ? null : Double.valueOf(sQLiteStatementPrepare6.getDouble(iM14)), sQLiteStatementPrepare6.isNull(iM15) ? null : Double.valueOf(sQLiteStatementPrepare6.getDouble(iM15)), sQLiteStatementPrepare6.isNull(iM16) ? null : Double.valueOf(sQLiteStatementPrepare6.getDouble(iM16)), sQLiteStatementPrepare6.isNull(iM17) ? null : Double.valueOf(sQLiteStatementPrepare6.getDouble(iM17)), sQLiteStatementPrepare6.isNull(iM18) ? null : Double.valueOf(sQLiteStatementPrepare6.getDouble(iM18)), sQLiteStatementPrepare6.isNull(iM19) ? null : Double.valueOf(sQLiteStatementPrepare6.getDouble(iM19)), sQLiteStatementPrepare6.isNull(iM20) ? null : Double.valueOf(sQLiteStatementPrepare6.getDouble(iM20)), sQLiteStatementPrepare6.getDouble(iM21), sQLiteStatementPrepare6.isNull(iM22) ? null : sQLiteStatementPrepare6.getText(iM22));
                    }
                    return text;
                } finally {
                    sQLiteStatementPrepare6.close();
                }
            case 14:
                SQLiteConnection sQLiteConnection7 = (SQLiteConnection) obj;
                sQLiteConnection7.getClass();
                SQLiteStatement sQLiteStatementPrepare7 = sQLiteConnection7.prepare("DELETE FROM plan_portion WHERE plan_id = ?");
                try {
                    sQLiteStatementPrepare7.bindText(1, str);
                    sQLiteStatementPrepare7.step();
                    return j23Var;
                } finally {
                    sQLiteStatementPrepare7.close();
                }
            case 15:
                SQLiteConnection sQLiteConnection8 = (SQLiteConnection) obj;
                sQLiteConnection8.getClass();
                SQLiteStatement sQLiteStatementPrepare8 = sQLiteConnection8.prepare("SELECT * FROM plan WHERE week_start = ?");
                try {
                    sQLiteStatementPrepare8.bindText(1, str);
                    int iM23 = y02.m(sQLiteStatementPrepare8, "id");
                    int iM24 = y02.m(sQLiteStatementPrepare8, "week_start");
                    int iM25 = y02.m(sQLiteStatementPrepare8, "month");
                    int iM26 = y02.m(sQLiteStatementPrepare8, "created_at");
                    int iM27 = y02.m(sQLiteStatementPrepare8, "status");
                    int iM28 = y02.m(sQLiteStatementPrepare8, "objective");
                    int iM29 = y02.m(sQLiteStatementPrepare8, "note");
                    if (sQLiteStatementPrepare8.step()) {
                        text = new yy1(sQLiteStatementPrepare8.getText(iM23), sQLiteStatementPrepare8.getText(iM24), (int) sQLiteStatementPrepare8.getLong(iM25), sQLiteStatementPrepare8.getLong(iM26), sQLiteStatementPrepare8.getText(iM27), sQLiteStatementPrepare8.isNull(iM28) ? null : Double.valueOf(sQLiteStatementPrepare8.getDouble(iM28)), sQLiteStatementPrepare8.getText(iM29));
                    }
                    return text;
                } finally {
                    sQLiteStatementPrepare8.close();
                }
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                SQLiteConnection sQLiteConnection9 = (SQLiteConnection) obj;
                sQLiteConnection9.getClass();
                SQLiteStatement sQLiteStatementPrepare9 = sQLiteConnection9.prepare("SELECT * FROM plan_dish WHERE plan_id = ?");
                try {
                    sQLiteStatementPrepare9.bindText(1, str);
                    int iM30 = y02.m(sQLiteStatementPrepare9, "plan_id");
                    int iM31 = y02.m(sQLiteStatementPrepare9, "day");
                    int iM32 = y02.m(sQLiteStatementPrepare9, "meal");
                    int iM33 = y02.m(sQLiteStatementPrepare9, "recipe_id");
                    int iM34 = y02.m(sQLiteStatementPrepare9, "recipe_name");
                    int iM35 = y02.m(sQLiteStatementPrepare9, "locked");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare9.step()) {
                        arrayList2.add(new xy1(sQLiteStatementPrepare9.getText(iM30), sQLiteStatementPrepare9.getText(iM31), sQLiteStatementPrepare9.getText(iM32), sQLiteStatementPrepare9.getText(iM33), sQLiteStatementPrepare9.getText(iM34), ((int) sQLiteStatementPrepare9.getLong(iM35)) != 0));
                    }
                    sQLiteStatementPrepare9.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    sQLiteStatementPrepare9.close();
                    throw th2;
                }
            case 17:
                SQLiteConnection sQLiteConnection10 = (SQLiteConnection) obj;
                sQLiteConnection10.getClass();
                SQLiteStatement sQLiteStatementPrepare10 = sQLiteConnection10.prepare("SELECT ingredient_id FROM shopping_check WHERE plan_id = ?");
                try {
                    sQLiteStatementPrepare10.bindText(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare10.step()) {
                        arrayList3.add(sQLiteStatementPrepare10.getText(0));
                    }
                    sQLiteStatementPrepare10.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    sQLiteStatementPrepare10.close();
                    throw th3;
                }
            case 18:
                SQLiteConnection sQLiteConnection11 = (SQLiteConnection) obj;
                sQLiteConnection11.getClass();
                SQLiteStatement sQLiteStatementPrepare11 = sQLiteConnection11.prepare("SELECT * FROM plan_diner WHERE plan_id = ?");
                try {
                    sQLiteStatementPrepare11.bindText(1, str);
                    int iM36 = y02.m(sQLiteStatementPrepare11, "plan_id");
                    int iM37 = y02.m(sQLiteStatementPrepare11, "day");
                    int iM38 = y02.m(sQLiteStatementPrepare11, "meal");
                    int iM39 = y02.m(sQLiteStatementPrepare11, "person_id");
                    ArrayList arrayList4 = new ArrayList();
                    while (sQLiteStatementPrepare11.step()) {
                        arrayList4.add(new wy1(sQLiteStatementPrepare11.getText(iM36), sQLiteStatementPrepare11.getText(iM37), sQLiteStatementPrepare11.getText(iM38), sQLiteStatementPrepare11.getText(iM39)));
                    }
                    sQLiteStatementPrepare11.close();
                    return arrayList4;
                } catch (Throwable th4) {
                    sQLiteStatementPrepare11.close();
                    throw th4;
                }
            case 19:
                SQLiteConnection sQLiteConnection12 = (SQLiteConnection) obj;
                sQLiteConnection12.getClass();
                SQLiteStatement sQLiteStatementPrepare12 = sQLiteConnection12.prepare("SELECT * FROM plan_portion WHERE plan_id = ?");
                try {
                    sQLiteStatementPrepare12.bindText(1, str);
                    int iM40 = y02.m(sQLiteStatementPrepare12, "plan_id");
                    int iM41 = y02.m(sQLiteStatementPrepare12, "day");
                    int iM42 = y02.m(sQLiteStatementPrepare12, "meal");
                    int iM43 = y02.m(sQLiteStatementPrepare12, "person_id");
                    int iM44 = y02.m(sQLiteStatementPrepare12, "recipe_id");
                    int iM45 = y02.m(sQLiteStatementPrepare12, "servings");
                    ArrayList arrayList5 = new ArrayList();
                    while (sQLiteStatementPrepare12.step()) {
                        arrayList5.add(new cz1(sQLiteStatementPrepare12.getText(iM40), sQLiteStatementPrepare12.getText(iM41), sQLiteStatementPrepare12.getText(iM42), sQLiteStatementPrepare12.getText(iM43), sQLiteStatementPrepare12.getText(iM44), sQLiteStatementPrepare12.getDouble(iM45)));
                    }
                    sQLiteStatementPrepare12.close();
                    return arrayList5;
                } catch (Throwable th5) {
                    sQLiteStatementPrepare12.close();
                    throw th5;
                }
            case 20:
                SQLiteConnection sQLiteConnection13 = (SQLiteConnection) obj;
                sQLiteConnection13.getClass();
                SQLiteStatement sQLiteStatementPrepare13 = sQLiteConnection13.prepare("DELETE FROM shopping_check WHERE plan_id = ?");
                try {
                    sQLiteStatementPrepare13.bindText(1, str);
                    sQLiteStatementPrepare13.step();
                    return j23Var;
                } finally {
                    sQLiteStatementPrepare13.close();
                }
            case 21:
                SQLiteConnection sQLiteConnection14 = (SQLiteConnection) obj;
                sQLiteConnection14.getClass();
                SQLiteStatement sQLiteStatementPrepare14 = sQLiteConnection14.prepare("DELETE FROM plan_dish WHERE plan_id = ?");
                try {
                    sQLiteStatementPrepare14.bindText(1, str);
                    sQLiteStatementPrepare14.step();
                    return j23Var;
                } finally {
                    sQLiteStatementPrepare14.close();
                }
            case 22:
                SQLiteConnection sQLiteConnection15 = (SQLiteConnection) obj;
                sQLiteConnection15.getClass();
                SQLiteStatement sQLiteStatementPrepare15 = sQLiteConnection15.prepare("DELETE FROM plan_diner WHERE plan_id = ?");
                try {
                    sQLiteStatementPrepare15.bindText(1, str);
                    sQLiteStatementPrepare15.step();
                    return j23Var;
                } finally {
                    sQLiteStatementPrepare15.close();
                }
            case 23:
                SQLiteConnection sQLiteConnection16 = (SQLiteConnection) obj;
                sQLiteConnection16.getClass();
                SQLiteStatement sQLiteStatementPrepare16 = sQLiteConnection16.prepare("DELETE FROM recipe WHERE id = ?");
                try {
                    sQLiteStatementPrepare16.bindText(1, str);
                    sQLiteStatementPrepare16.step();
                    return Integer.valueOf(r02.u(sQLiteConnection16));
                } finally {
                    sQLiteStatementPrepare16.close();
                }
            case 24:
                SQLiteConnection sQLiteConnection17 = (SQLiteConnection) obj;
                sQLiteConnection17.getClass();
                SQLiteStatement sQLiteStatementPrepare17 = sQLiteConnection17.prepare("DELETE FROM recipe_ingredient WHERE recipe_id = ?");
                try {
                    sQLiteStatementPrepare17.bindText(1, str);
                    sQLiteStatementPrepare17.step();
                    return j23Var;
                } finally {
                    sQLiteStatementPrepare17.close();
                }
            case 25:
                SQLiteConnection sQLiteConnection18 = (SQLiteConnection) obj;
                sQLiteConnection18.getClass();
                SQLiteStatement sQLiteStatementPrepare18 = sQLiteConnection18.prepare("SELECT * FROM recipe WHERE id = ?");
                try {
                    sQLiteStatementPrepare18.bindText(1, str);
                    int iM46 = y02.m(sQLiteStatementPrepare18, "id");
                    int iM47 = y02.m(sQLiteStatementPrepare18, "name");
                    int iM48 = y02.m(sQLiteStatementPrepare18, "category");
                    int iM49 = y02.m(sQLiteStatementPrepare18, "meal_types");
                    int iM50 = y02.m(sQLiteStatementPrepare18, "base_servings");
                    int iM51 = y02.m(sQLiteStatementPrepare18, "min_diners");
                    int iM52 = y02.m(sQLiteStatementPrepare18, "season");
                    int iM53 = y02.m(sQLiteStatementPrepare18, "quick");
                    int iM54 = y02.m(sQLiteStatementPrepare18, "tags");
                    int iM55 = y02.m(sQLiteStatementPrepare18, "kcal");
                    int iM56 = y02.m(sQLiteStatementPrepare18, "protein");
                    int iM57 = y02.m(sQLiteStatementPrepare18, "fat");
                    int iM58 = y02.m(sQLiteStatementPrepare18, "carb");
                    int iM59 = y02.m(sQLiteStatementPrepare18, "fiber");
                    if (sQLiteStatementPrepare18.step()) {
                        text = new y62(sQLiteStatementPrepare18.getText(iM46), sQLiteStatementPrepare18.getText(iM47), sQLiteStatementPrepare18.getText(iM48), sQLiteStatementPrepare18.getText(iM49), (int) sQLiteStatementPrepare18.getLong(iM50), (int) sQLiteStatementPrepare18.getLong(iM51), sQLiteStatementPrepare18.getText(iM52), ((int) sQLiteStatementPrepare18.getLong(iM53)) != 0, sQLiteStatementPrepare18.getText(iM54), sQLiteStatementPrepare18.getDouble(iM55), sQLiteStatementPrepare18.getDouble(iM56), sQLiteStatementPrepare18.getDouble(iM57), sQLiteStatementPrepare18.getDouble(iM58), sQLiteStatementPrepare18.getDouble(iM59));
                    }
                    return text;
                } finally {
                    sQLiteStatementPrepare18.close();
                }
            case 26:
                SQLiteConnection sQLiteConnection19 = (SQLiteConnection) obj;
                sQLiteConnection19.getClass();
                SQLiteStatement sQLiteStatementPrepare19 = sQLiteConnection19.prepare("SELECT * FROM recipe_ingredient WHERE recipe_id = ? ORDER BY position");
                try {
                    sQLiteStatementPrepare19.bindText(1, str);
                    int iM60 = y02.m(sQLiteStatementPrepare19, "recipe_id");
                    int iM61 = y02.m(sQLiteStatementPrepare19, "ingredient_id");
                    int iM62 = y02.m(sQLiteStatementPrepare19, "grams");
                    int iM63 = y02.m(sQLiteStatementPrepare19, "position");
                    ArrayList arrayList6 = new ArrayList();
                    while (sQLiteStatementPrepare19.step()) {
                        arrayList6.add(new d72(sQLiteStatementPrepare19.getDouble(iM62), (int) sQLiteStatementPrepare19.getLong(iM63), sQLiteStatementPrepare19.getText(iM60), sQLiteStatementPrepare19.getText(iM61)));
                    }
                    sQLiteStatementPrepare19.close();
                    return arrayList6;
                } catch (Throwable th6) {
                    sQLiteStatementPrepare19.close();
                    throw th6;
                }
            case 27:
                bh2.f((dh2) obj, str);
                return j23Var;
            case 28:
                q21[] q21VarArr5 = bh2.a;
                ((dh2) obj).a(ah2.O, str);
                return j23Var;
            default:
                SQLiteConnection sQLiteConnection20 = (SQLiteConnection) obj;
                sQLiteConnection20.getClass();
                SQLiteStatement sQLiteStatementPrepare20 = sQLiteConnection20.prepare("SELECT COUNT(*) FROM weight_entry WHERE person_id = ?");
                try {
                    sQLiteStatementPrepare20.bindText(1, str);
                    int i = sQLiteStatementPrepare20.step() ? (int) sQLiteStatementPrepare20.getLong(0) : 0;
                    sQLiteStatementPrepare20.close();
                    return Integer.valueOf(i);
                } catch (Throwable th7) {
                    sQLiteStatementPrepare20.close();
                    throw th7;
                }
        }
    }
}
