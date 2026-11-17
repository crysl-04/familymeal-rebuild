package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vw1 implements vp0 {
    public final /* synthetic */ byte h;

    public /* synthetic */ vw1(byte b) {
        this.h = b;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x036c  */
    @Override // defpackage.vp0
    public final Object h(Object obj) throws Exception {
        String str;
        String str2;
        String str3;
        byte b = this.h;
        Object objH = null;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                dh2 dh2Var = (dh2) obj;
                dh2Var.getClass();
                bh2.b(dh2Var);
                return j23Var;
            case 1:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT COALESCE(MAX(position), -1) + 1 FROM person");
                try {
                    int i = sQLiteStatementPrepare.step() ? (int) sQLiteStatementPrepare.getLong(0) : 0;
                    sQLiteStatementPrepare.close();
                    return Integer.valueOf(i);
                } catch (Throwable th) {
                    sQLiteStatementPrepare.close();
                    throw th;
                }
            case 2:
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj;
                sQLiteConnection2.getClass();
                SQLiteStatement sQLiteStatementPrepare2 = sQLiteConnection2.prepare("SELECT * FROM person ORDER BY position, name");
                try {
                    int iM = y02.m(sQLiteStatementPrepare2, "id");
                    int iM2 = y02.m(sQLiteStatementPrepare2, "name");
                    int iM3 = y02.m(sQLiteStatementPrepare2, "gender");
                    int iM4 = y02.m(sQLiteStatementPrepare2, "birth_year");
                    int iM5 = y02.m(sQLiteStatementPrepare2, "height_cm");
                    int iM6 = y02.m(sQLiteStatementPrepare2, "weight_kg");
                    int iM7 = y02.m(sQLiteStatementPrepare2, "activity");
                    int iM8 = y02.m(sQLiteStatementPrepare2, "goal");
                    int iM9 = y02.m(sQLiteStatementPrepare2, "target_weight_kg");
                    int iM10 = y02.m(sQLiteStatementPrepare2, "pace");
                    int iM11 = y02.m(sQLiteStatementPrepare2, "excluded");
                    int iM12 = y02.m(sQLiteStatementPrepare2, "position");
                    int iM13 = y02.m(sQLiteStatementPrepare2, "m_kcal_min");
                    int iM14 = y02.m(sQLiteStatementPrepare2, "m_kcal_max");
                    int iM15 = y02.m(sQLiteStatementPrepare2, "m_protein_min");
                    int iM16 = y02.m(sQLiteStatementPrepare2, "m_fat_min");
                    int iM17 = y02.m(sQLiteStatementPrepare2, "m_fat_max");
                    int iM18 = y02.m(sQLiteStatementPrepare2, "m_carb_min");
                    int iM19 = y02.m(sQLiteStatementPrepare2, "m_carb_max");
                    int iM20 = y02.m(sQLiteStatementPrepare2, "m_fiber_min");
                    int iM21 = y02.m(sQLiteStatementPrepare2, "kcal_offset");
                    int iM22 = y02.m(sQLiteStatementPrepare2, "last_adjusted");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        String text = sQLiteStatementPrepare2.getText(iM);
                        String text2 = sQLiteStatementPrepare2.getText(iM2);
                        String text3 = sQLiteStatementPrepare2.getText(iM3);
                        Integer numValueOf = sQLiteStatementPrepare2.isNull(iM4) ? null : Integer.valueOf((int) sQLiteStatementPrepare2.getLong(iM4));
                        Double dValueOf = sQLiteStatementPrepare2.isNull(iM5) ? null : Double.valueOf(sQLiteStatementPrepare2.getDouble(iM5));
                        Double dValueOf2 = sQLiteStatementPrepare2.isNull(iM6) ? null : Double.valueOf(sQLiteStatementPrepare2.getDouble(iM6));
                        String text4 = sQLiteStatementPrepare2.getText(iM7);
                        String text5 = sQLiteStatementPrepare2.getText(iM8);
                        Double dValueOf3 = sQLiteStatementPrepare2.isNull(iM9) ? null : Double.valueOf(sQLiteStatementPrepare2.getDouble(iM9));
                        String text6 = sQLiteStatementPrepare2.getText(iM10);
                        String text7 = sQLiteStatementPrepare2.getText(iM11);
                        int i2 = (int) sQLiteStatementPrepare2.getLong(iM12);
                        Double dValueOf4 = sQLiteStatementPrepare2.isNull(iM13) ? null : Double.valueOf(sQLiteStatementPrepare2.getDouble(iM13));
                        Double dValueOf5 = sQLiteStatementPrepare2.isNull(iM14) ? null : Double.valueOf(sQLiteStatementPrepare2.getDouble(iM14));
                        int i3 = iM15;
                        Double dValueOf6 = sQLiteStatementPrepare2.isNull(i3) ? null : Double.valueOf(sQLiteStatementPrepare2.getDouble(i3));
                        int i4 = iM12;
                        int i5 = iM16;
                        Double dValueOf7 = sQLiteStatementPrepare2.isNull(i5) ? null : Double.valueOf(sQLiteStatementPrepare2.getDouble(i5));
                        iM16 = i5;
                        int i6 = iM17;
                        Double dValueOf8 = sQLiteStatementPrepare2.isNull(i6) ? null : Double.valueOf(sQLiteStatementPrepare2.getDouble(i6));
                        iM17 = i6;
                        int i7 = iM18;
                        Double dValueOf9 = sQLiteStatementPrepare2.isNull(i7) ? null : Double.valueOf(sQLiteStatementPrepare2.getDouble(i7));
                        iM18 = i7;
                        int i8 = iM19;
                        Double dValueOf10 = sQLiteStatementPrepare2.isNull(i8) ? null : Double.valueOf(sQLiteStatementPrepare2.getDouble(i8));
                        iM19 = i8;
                        int i9 = iM20;
                        Double dValueOf11 = sQLiteStatementPrepare2.isNull(i9) ? null : Double.valueOf(sQLiteStatementPrepare2.getDouble(i9));
                        iM20 = i9;
                        int i10 = iM21;
                        double d = sQLiteStatementPrepare2.getDouble(i10);
                        iM21 = i10;
                        int i11 = iM22;
                        arrayList.add(new by1(text, text2, text3, numValueOf, dValueOf, dValueOf2, text4, text5, dValueOf3, text6, text7, i2, dValueOf4, dValueOf5, dValueOf6, dValueOf7, dValueOf8, dValueOf9, dValueOf10, dValueOf11, d, sQLiteStatementPrepare2.isNull(i11) ? null : sQLiteStatementPrepare2.getText(i11)));
                        iM22 = i11;
                        iM2 = iM2;
                        iM12 = i4;
                        iM15 = i3;
                        iM = iM;
                        break;
                    }
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare2.close();
                }
            case 3:
                SQLiteConnection sQLiteConnection3 = (SQLiteConnection) obj;
                sQLiteConnection3.getClass();
                SQLiteStatement sQLiteStatementPrepare3 = sQLiteConnection3.prepare("SELECT * FROM person ORDER BY position, name");
                try {
                    int iM23 = y02.m(sQLiteStatementPrepare3, "id");
                    int iM24 = y02.m(sQLiteStatementPrepare3, "name");
                    int iM25 = y02.m(sQLiteStatementPrepare3, "gender");
                    int iM26 = y02.m(sQLiteStatementPrepare3, "birth_year");
                    int iM27 = y02.m(sQLiteStatementPrepare3, "height_cm");
                    int iM28 = y02.m(sQLiteStatementPrepare3, "weight_kg");
                    int iM29 = y02.m(sQLiteStatementPrepare3, "activity");
                    int iM30 = y02.m(sQLiteStatementPrepare3, "goal");
                    int iM31 = y02.m(sQLiteStatementPrepare3, "target_weight_kg");
                    int iM32 = y02.m(sQLiteStatementPrepare3, "pace");
                    int iM33 = y02.m(sQLiteStatementPrepare3, "excluded");
                    int iM34 = y02.m(sQLiteStatementPrepare3, "position");
                    int iM35 = y02.m(sQLiteStatementPrepare3, "m_kcal_min");
                    int iM36 = y02.m(sQLiteStatementPrepare3, "m_kcal_max");
                    int iM37 = y02.m(sQLiteStatementPrepare3, "m_protein_min");
                    int iM38 = y02.m(sQLiteStatementPrepare3, "m_fat_min");
                    int iM39 = y02.m(sQLiteStatementPrepare3, "m_fat_max");
                    int iM40 = y02.m(sQLiteStatementPrepare3, "m_carb_min");
                    int iM41 = y02.m(sQLiteStatementPrepare3, "m_carb_max");
                    int iM42 = y02.m(sQLiteStatementPrepare3, "m_fiber_min");
                    int iM43 = y02.m(sQLiteStatementPrepare3, "kcal_offset");
                    int iM44 = y02.m(sQLiteStatementPrepare3, "last_adjusted");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare3.step()) {
                        String text8 = sQLiteStatementPrepare3.getText(iM23);
                        String text9 = sQLiteStatementPrepare3.getText(iM24);
                        String text10 = sQLiteStatementPrepare3.getText(iM25);
                        Integer numValueOf2 = sQLiteStatementPrepare3.isNull(iM26) ? null : Integer.valueOf((int) sQLiteStatementPrepare3.getLong(iM26));
                        Double dValueOf12 = sQLiteStatementPrepare3.isNull(iM27) ? null : Double.valueOf(sQLiteStatementPrepare3.getDouble(iM27));
                        Double dValueOf13 = sQLiteStatementPrepare3.isNull(iM28) ? null : Double.valueOf(sQLiteStatementPrepare3.getDouble(iM28));
                        String text11 = sQLiteStatementPrepare3.getText(iM29);
                        String text12 = sQLiteStatementPrepare3.getText(iM30);
                        Double dValueOf14 = sQLiteStatementPrepare3.isNull(iM31) ? null : Double.valueOf(sQLiteStatementPrepare3.getDouble(iM31));
                        String text13 = sQLiteStatementPrepare3.getText(iM32);
                        String text14 = sQLiteStatementPrepare3.getText(iM33);
                        int i12 = (int) sQLiteStatementPrepare3.getLong(iM34);
                        Double dValueOf15 = sQLiteStatementPrepare3.isNull(iM35) ? null : Double.valueOf(sQLiteStatementPrepare3.getDouble(iM35));
                        Double dValueOf16 = sQLiteStatementPrepare3.isNull(iM36) ? null : Double.valueOf(sQLiteStatementPrepare3.getDouble(iM36));
                        int i13 = iM37;
                        Double dValueOf17 = sQLiteStatementPrepare3.isNull(i13) ? null : Double.valueOf(sQLiteStatementPrepare3.getDouble(i13));
                        int i14 = iM34;
                        int i15 = iM38;
                        Double dValueOf18 = sQLiteStatementPrepare3.isNull(i15) ? null : Double.valueOf(sQLiteStatementPrepare3.getDouble(i15));
                        iM38 = i15;
                        int i16 = iM39;
                        Double dValueOf19 = sQLiteStatementPrepare3.isNull(i16) ? null : Double.valueOf(sQLiteStatementPrepare3.getDouble(i16));
                        iM39 = i16;
                        int i17 = iM40;
                        Double dValueOf20 = sQLiteStatementPrepare3.isNull(i17) ? null : Double.valueOf(sQLiteStatementPrepare3.getDouble(i17));
                        iM40 = i17;
                        int i18 = iM41;
                        Double dValueOf21 = sQLiteStatementPrepare3.isNull(i18) ? null : Double.valueOf(sQLiteStatementPrepare3.getDouble(i18));
                        iM41 = i18;
                        int i19 = iM42;
                        Double dValueOf22 = sQLiteStatementPrepare3.isNull(i19) ? null : Double.valueOf(sQLiteStatementPrepare3.getDouble(i19));
                        iM42 = i19;
                        int i20 = iM43;
                        double d2 = sQLiteStatementPrepare3.getDouble(i20);
                        iM43 = i20;
                        int i21 = iM44;
                        arrayList2.add(new by1(text8, text9, text10, numValueOf2, dValueOf12, dValueOf13, text11, text12, dValueOf14, text13, text14, i12, dValueOf15, dValueOf16, dValueOf17, dValueOf18, dValueOf19, dValueOf20, dValueOf21, dValueOf22, d2, sQLiteStatementPrepare3.isNull(i21) ? null : sQLiteStatementPrepare3.getText(i21)));
                        iM44 = i21;
                        iM24 = iM24;
                        iM34 = i14;
                        iM37 = i13;
                        iM23 = iM23;
                        break;
                    }
                    return arrayList2;
                } finally {
                    sQLiteStatementPrepare3.close();
                }
            case 4:
                lt1 lt1Var = (lt1) obj;
                lt1Var.getClass();
                return lt1Var.h;
            case 5:
                String str4 = (String) obj;
                str4.getClass();
                return str4;
            case 6:
                ir0 ir0Var = (ir0) obj;
                ir0Var.getClass();
                return ir0Var.h;
            case 7:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                return i3Var.h;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                as0 as0Var = (as0) obj;
                as0Var.getClass();
                return as0Var.h;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                return j23Var;
            case 10:
                nz1 nz1Var = (nz1) obj;
                nz1Var.getClass();
                uv0 uv0Var = nz1Var.a;
                return (uv0Var == null || (str = uv0Var.c) == null) ? "~" : str;
            case 11:
                nz1 nz1Var2 = (nz1) obj;
                nz1Var2.getClass();
                uv0 uv0Var2 = nz1Var2.a;
                return (uv0Var2 == null || (str2 = uv0Var2.b) == null) ? nz1Var2.b : str2;
            case 12:
                m12 m12Var = (m12) obj;
                if (m12Var.isAttachedToWindow()) {
                    m12Var.r();
                }
                return j23Var;
            case 13:
                Context context = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList3 = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                for (int i22 = 0; i22 < size; i22++) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i22);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        arrayList3.add(resolveInfo);
                    } else {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str3 = activityInfo.permission) == null || context.checkSelfPermission(str3) == 0)) {
                            arrayList3.add(resolveInfo);
                        }
                    }
                }
                return arrayList3;
            case 14:
                f31 f31Var = (f31) obj;
                f31Var.a = (short) 6000;
                Float fValueOf = Float.valueOf(90.0f);
                f31Var.a(fValueOf, 300).b = hh1.a;
                f31Var.a(fValueOf, 1500);
                Float fValueOf2 = Float.valueOf(180.0f);
                f31Var.a(fValueOf2, 1800);
                f31Var.a(fValueOf2, 3000);
                Float fValueOf3 = Float.valueOf(270.0f);
                f31Var.a(fValueOf3, 3300);
                f31Var.a(fValueOf3, 4500);
                Float fValueOf4 = Float.valueOf(360.0f);
                f31Var.a(fValueOf4, 4800);
                f31Var.a(fValueOf4, 6000);
                return j23Var;
            case 15:
                q21[] q21VarArr = bh2.a;
                ch2 ch2Var = ah2.c;
                q21 q21Var = bh2.a[1];
                ch2Var.getClass();
                ((dh2) obj).a(ch2Var, b42.b);
                return j23Var;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                SQLiteConnection sQLiteConnection4 = (SQLiteConnection) obj;
                sQLiteConnection4.getClass();
                SQLiteStatement sQLiteStatementPrepare4 = sQLiteConnection4.prepare("SELECT * FROM recipe ORDER BY category, name");
                try {
                    int iM45 = y02.m(sQLiteStatementPrepare4, "id");
                    int iM46 = y02.m(sQLiteStatementPrepare4, "name");
                    int iM47 = y02.m(sQLiteStatementPrepare4, "category");
                    int iM48 = y02.m(sQLiteStatementPrepare4, "meal_types");
                    int iM49 = y02.m(sQLiteStatementPrepare4, "base_servings");
                    int iM50 = y02.m(sQLiteStatementPrepare4, "min_diners");
                    int iM51 = y02.m(sQLiteStatementPrepare4, "season");
                    int iM52 = y02.m(sQLiteStatementPrepare4, "quick");
                    int iM53 = y02.m(sQLiteStatementPrepare4, "tags");
                    int iM54 = y02.m(sQLiteStatementPrepare4, "kcal");
                    int iM55 = y02.m(sQLiteStatementPrepare4, "protein");
                    int iM56 = y02.m(sQLiteStatementPrepare4, "fat");
                    int iM57 = y02.m(sQLiteStatementPrepare4, "carb");
                    int iM58 = y02.m(sQLiteStatementPrepare4, "fiber");
                    ArrayList arrayList4 = new ArrayList();
                    while (sQLiteStatementPrepare4.step()) {
                        int i23 = iM45;
                        int i24 = iM46;
                        arrayList4.add(new y62(sQLiteStatementPrepare4.getText(iM45), sQLiteStatementPrepare4.getText(iM46), sQLiteStatementPrepare4.getText(iM47), sQLiteStatementPrepare4.getText(iM48), (int) sQLiteStatementPrepare4.getLong(iM49), (int) sQLiteStatementPrepare4.getLong(iM50), sQLiteStatementPrepare4.getText(iM51), ((int) sQLiteStatementPrepare4.getLong(iM52)) != 0, sQLiteStatementPrepare4.getText(iM53), sQLiteStatementPrepare4.getDouble(iM54), sQLiteStatementPrepare4.getDouble(iM55), sQLiteStatementPrepare4.getDouble(iM56), sQLiteStatementPrepare4.getDouble(iM57), sQLiteStatementPrepare4.getDouble(iM58)));
                        iM45 = i23;
                        iM46 = i24;
                    }
                    sQLiteStatementPrepare4.close();
                    return arrayList4;
                } catch (Throwable th2) {
                    sQLiteStatementPrepare4.close();
                    throw th2;
                }
            case 17:
                SQLiteConnection sQLiteConnection5 = (SQLiteConnection) obj;
                sQLiteConnection5.getClass();
                SQLiteStatement sQLiteStatementPrepare5 = sQLiteConnection5.prepare("SELECT * FROM recipe_ingredient ORDER BY recipe_id, position");
                try {
                    int iM59 = y02.m(sQLiteStatementPrepare5, "recipe_id");
                    int iM60 = y02.m(sQLiteStatementPrepare5, "ingredient_id");
                    int iM61 = y02.m(sQLiteStatementPrepare5, "grams");
                    int iM62 = y02.m(sQLiteStatementPrepare5, "position");
                    ArrayList arrayList5 = new ArrayList();
                    while (sQLiteStatementPrepare5.step()) {
                        arrayList5.add(new d72(sQLiteStatementPrepare5.getDouble(iM61), (int) sQLiteStatementPrepare5.getLong(iM62), sQLiteStatementPrepare5.getText(iM59), sQLiteStatementPrepare5.getText(iM60)));
                    }
                    sQLiteStatementPrepare5.close();
                    return arrayList5;
                } catch (Throwable th3) {
                    sQLiteStatementPrepare5.close();
                    throw th3;
                }
            case 18:
                SQLiteConnection sQLiteConnection6 = (SQLiteConnection) obj;
                sQLiteConnection6.getClass();
                SQLiteStatement sQLiteStatementPrepare6 = sQLiteConnection6.prepare("SELECT * FROM recipe");
                try {
                    int iM63 = y02.m(sQLiteStatementPrepare6, "id");
                    int iM64 = y02.m(sQLiteStatementPrepare6, "name");
                    int iM65 = y02.m(sQLiteStatementPrepare6, "category");
                    int iM66 = y02.m(sQLiteStatementPrepare6, "meal_types");
                    int iM67 = y02.m(sQLiteStatementPrepare6, "base_servings");
                    int iM68 = y02.m(sQLiteStatementPrepare6, "min_diners");
                    int iM69 = y02.m(sQLiteStatementPrepare6, "season");
                    int iM70 = y02.m(sQLiteStatementPrepare6, "quick");
                    int iM71 = y02.m(sQLiteStatementPrepare6, "tags");
                    int iM72 = y02.m(sQLiteStatementPrepare6, "kcal");
                    int iM73 = y02.m(sQLiteStatementPrepare6, "protein");
                    int iM74 = y02.m(sQLiteStatementPrepare6, "fat");
                    int iM75 = y02.m(sQLiteStatementPrepare6, "carb");
                    int iM76 = y02.m(sQLiteStatementPrepare6, "fiber");
                    ArrayList arrayList6 = new ArrayList();
                    while (sQLiteStatementPrepare6.step()) {
                        int i25 = iM63;
                        int i26 = iM64;
                        arrayList6.add(new y62(sQLiteStatementPrepare6.getText(iM63), sQLiteStatementPrepare6.getText(iM64), sQLiteStatementPrepare6.getText(iM65), sQLiteStatementPrepare6.getText(iM66), (int) sQLiteStatementPrepare6.getLong(iM67), (int) sQLiteStatementPrepare6.getLong(iM68), sQLiteStatementPrepare6.getText(iM69), ((int) sQLiteStatementPrepare6.getLong(iM70)) != 0, sQLiteStatementPrepare6.getText(iM71), sQLiteStatementPrepare6.getDouble(iM72), sQLiteStatementPrepare6.getDouble(iM73), sQLiteStatementPrepare6.getDouble(iM74), sQLiteStatementPrepare6.getDouble(iM75), sQLiteStatementPrepare6.getDouble(iM76)));
                        iM63 = i25;
                        iM64 = i26;
                    }
                    sQLiteStatementPrepare6.close();
                    return arrayList6;
                } catch (Throwable th4) {
                    sQLiteStatementPrepare6.close();
                    throw th4;
                }
            case 19:
                zr zrVar = (zr) obj;
                zrVar.getClass();
                return zrVar.h;
            case 20:
                te1 te1Var = (te1) obj;
                te1Var.getClass();
                return te1Var.i;
            case 21:
                cf2 cf2Var = (cf2) obj;
                cf2Var.getClass();
                return cf2Var.h;
            case 22:
                uv0 uv0Var3 = (uv0) obj;
                uv0Var3.getClass();
                return uv0Var3.a;
            case 23:
                j62 j62Var = (j62) obj;
                j62Var.getClass();
                return j62Var.a;
            case 24:
                dh2 dh2Var2 = (dh2) obj;
                dh2Var2.getClass();
                bh2.b(dh2Var2);
                return j23Var;
            case 25:
                zr zrVar2 = (zr) obj;
                return zrVar2 != null ? zrVar2.h : "全部";
            case 26:
                sj1 sj1Var = (sj1) obj;
                if (!(sj1Var instanceof fl2)) {
                    wg.m("Failed requirement.");
                    return null;
                }
                fl2 fl2Var = (fl2) sj1Var;
                if (fl2Var.getValue() != null) {
                    Object value = fl2Var.getValue();
                    value.getClass();
                    objH = ((vp0) vv2.d.j).h(value);
                }
                hl2 hl2VarD = fl2Var.d();
                hl2VarD.getClass();
                return new lu1(objH, hl2VarD);
            case 27:
                SQLiteConnection sQLiteConnection7 = (SQLiteConnection) obj;
                sQLiteConnection7.getClass();
                SQLiteStatement sQLiteStatementPrepare7 = sQLiteConnection7.prepare("DELETE FROM recipe");
                try {
                    sQLiteStatementPrepare7.step();
                    return j23Var;
                } finally {
                    sQLiteStatementPrepare7.close();
                }
            case 28:
                SQLiteConnection sQLiteConnection8 = (SQLiteConnection) obj;
                sQLiteConnection8.getClass();
                SQLiteStatement sQLiteStatementPrepare8 = sQLiteConnection8.prepare("DELETE FROM recipe_ingredient");
                try {
                    sQLiteStatementPrepare8.step();
                    return j23Var;
                } finally {
                    sQLiteStatementPrepare8.close();
                }
            default:
                SQLiteConnection sQLiteConnection9 = (SQLiteConnection) obj;
                sQLiteConnection9.getClass();
                SQLiteStatement sQLiteStatementPrepare9 = sQLiteConnection9.prepare("DELETE FROM ingredient");
                try {
                    sQLiteStatementPrepare9.step();
                    return j23Var;
                } finally {
                    sQLiteStatementPrepare9.close();
                }
        }
    }
}
