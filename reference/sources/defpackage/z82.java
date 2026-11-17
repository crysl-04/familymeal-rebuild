package defpackage;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z82 implements vp0 {
    public final /* synthetic */ byte h;

    @Override // defpackage.vp0
    public final Object h(Object obj) throws Exception {
        kv kvVar;
        byte b = this.h;
        j23 j23Var = j23.a;
        yl2 yl2Var = null;
        mw2Var = null;
        mw2 mw2Var = null;
        mw2Var = null;
        mw2 mw2Var2 = null;
        yl2Var = null;
        int i = 0;
        switch (b) {
            case 0:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM weight_entry");
                try {
                    sQLiteStatementPrepare.step();
                    return j23Var;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 1:
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj;
                sQLiteConnection2.getClass();
                SQLiteStatement sQLiteStatementPrepare2 = sQLiteConnection2.prepare("DELETE FROM schedule_slot");
                try {
                    sQLiteStatementPrepare2.step();
                    return j23Var;
                } finally {
                    sQLiteStatementPrepare2.close();
                }
            case 2:
                SQLiteConnection sQLiteConnection3 = (SQLiteConnection) obj;
                sQLiteConnection3.getClass();
                SQLiteStatement sQLiteStatementPrepare3 = sQLiteConnection3.prepare("DELETE FROM person");
                try {
                    sQLiteStatementPrepare3.step();
                    return j23Var;
                } finally {
                    sQLiteStatementPrepare3.close();
                }
            case 3:
                ((h40) obj).getClass();
                throw new mo1(0);
            case 4:
                return j23Var;
            case 5:
                return new pb2((Map) obj);
            case 6:
                return obj;
            case 7:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                vp0 vp0Var = (vp0) mc2.i.j;
                Boolean bool = Boolean.FALSE;
                yl2 yl2Var2 = (uz0.g(obj2, bool) || obj2 == null) ? null : (yl2) vp0Var.h(obj2);
                Object obj3 = list.get(1);
                yl2 yl2Var3 = (uz0.g(obj3, bool) || obj3 == null) ? null : (yl2) vp0Var.h(obj3);
                Object obj4 = list.get(2);
                yl2 yl2Var4 = (uz0.g(obj4, bool) || obj4 == null) ? null : (yl2) vp0Var.h(obj4);
                Object obj5 = list.get(3);
                if (!uz0.g(obj5, bool) && obj5 != null) {
                    yl2Var = (yl2) vp0Var.h(obj5);
                }
                return new mw2(yl2Var2, yl2Var3, yl2Var4, yl2Var);
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                obj.getClass();
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (uz0.g(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((vp0) mc2.b.j).h(obj6);
                Object obj7 = list2.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                str.getClass();
                return new od(list3, str);
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                obj.getClass();
                return new vt2(((Integer) obj).intValue());
            case 10:
                obj.getClass();
                List list4 = (List) obj;
                return new yv2(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 11:
                obj.getClass();
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                bx2[] bx2VarArr = ax2.b;
                vp0 vp0Var2 = mc2.x.i;
                Boolean bool2 = Boolean.FALSE;
                uz0.g(obj8, bool2);
                ax2 ax2Var = obj8 != null ? (ax2) vp0Var2.h(obj8) : null;
                ax2Var.getClass();
                long j = ax2Var.a;
                Object obj9 = list5.get(1);
                uz0.g(obj9, bool2);
                ax2 ax2Var2 = obj9 != null ? (ax2) vp0Var2.h(obj9) : null;
                ax2Var2.getClass();
                return new zv2(j, ax2Var2.a);
            case 12:
                obj.getClass();
                return new qn0(((Integer) obj).intValue());
            case 13:
                obj.getClass();
                return new uk(((Float) obj).floatValue());
            case 14:
                obj.getClass();
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                num2.getClass();
                return new qw2(m02.a(iIntValue, num2.intValue()));
            case 15:
                obj.getClass();
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i2 = kv.h;
                Boolean bool3 = Boolean.FALSE;
                uz0.g(obj12, bool3);
                if (obj12 != null) {
                    kvVar = uz0.g(obj12, Boolean.FALSE) ? new kv(kv.g) : new kv(cu.b(((Integer) obj12).intValue()));
                } else {
                    kvVar = null;
                }
                kvVar.getClass();
                long j2 = kvVar.a;
                Object obj13 = list7.get(1);
                lc2 lc2Var = mc2.z;
                uz0.g(obj13, bool3);
                up1 up1Var = obj13 != null ? (up1) lc2Var.i.h(obj13) : null;
                up1Var.getClass();
                long j3 = up1Var.a;
                Object obj14 = list7.get(2);
                Float f = obj14 != null ? (Float) obj14 : null;
                f.getClass();
                return new ei2(f.floatValue(), j2, j3);
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                obj.getClass();
                return new zs2(((Integer) obj).intValue());
            case 17:
                obj.getClass();
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                String str2 = obj15 != null ? (String) obj15 : null;
                str2.getClass();
                Object obj16 = list8.get(1);
                k42 k42Var = mc2.j;
                if (!uz0.g(obj16, Boolean.FALSE) && obj16 != null) {
                    mw2Var2 = (mw2) ((vp0) k42Var.j).h(obj16);
                }
                return new ha1(str2, mw2Var2);
            case 18:
                obj.getClass();
                return new yt2(((Integer) obj).intValue());
            case 19:
                obj.getClass();
                return new wt0(((Integer) obj).intValue());
            case 20:
                obj.getClass();
                List list9 = (List) obj;
                ArrayList arrayList = new ArrayList(list9.size());
                int size = list9.size();
                while (i < size) {
                    Object obj17 = list9.get(i);
                    nd ndVar = (uz0.g(obj17, Boolean.FALSE) || obj17 == null) ? null : (nd) ((vp0) mc2.c.j).h(obj17);
                    ndVar.getClass();
                    arrayList.add(ndVar);
                    i++;
                }
                return arrayList;
            case 21:
                obj.getClass();
                return new on0(((Integer) obj).intValue());
            case 22:
                obj.getClass();
                return new pn0(((Integer) obj).intValue());
            case 23:
                Boolean bool4 = Boolean.FALSE;
                if (uz0.g(obj, bool4)) {
                    return new ax2(ax2.c);
                }
                obj.getClass();
                List list10 = (List) obj;
                Object obj18 = list10.get(0);
                Float f2 = obj18 != null ? (Float) obj18 : null;
                f2.getClass();
                float fFloatValue = f2.floatValue();
                Object obj19 = list10.get(1);
                lc2 lc2Var2 = mc2.y;
                uz0.g(obj19, bool4);
                bx2 bx2Var = obj19 != null ? (bx2) lc2Var2.i.h(obj19) : null;
                bx2Var.getClass();
                return new ax2(r02.z(fFloatValue, bx2Var.a));
            case 24:
                if (uz0.g(obj, 0)) {
                    return new bx2(8589934592L);
                }
                return uz0.g(obj, 1) ? new bx2(4294967296L) : new bx2(0L);
            case 25:
                if (uz0.g(obj, Boolean.FALSE)) {
                    return new up1(9205357640488583168L);
                }
                obj.getClass();
                List list11 = (List) obj;
                Object obj20 = list11.get(0);
                Float f3 = obj20 != null ? (Float) obj20 : null;
                f3.getClass();
                float fFloatValue2 = f3.floatValue();
                Object obj21 = list11.get(1);
                Float f4 = obj21 != null ? (Float) obj21 : null;
                f4.getClass();
                return new up1((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f4.floatValue())) & 4294967295L));
            case 26:
                obj.getClass();
                List list12 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list12.size());
                int size2 = list12.size();
                while (i < size2) {
                    Object obj22 = list12.get(i);
                    tb1 tb1Var = (uz0.g(obj22, Boolean.FALSE) || obj22 == null) ? null : (tb1) ((vp0) mc2.B.j).h(obj22);
                    tb1Var.getClass();
                    arrayList2.add(tb1Var);
                    i++;
                }
                return new ub1(arrayList2);
            case 27:
                obj.getClass();
                String str3 = (String) obj;
                Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                if (uz0.g(localeForLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new tb1(localeForLanguageTag);
            case 28:
                obj.getClass();
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                String str4 = obj23 != null ? (String) obj23 : null;
                str4.getClass();
                Object obj24 = list13.get(1);
                k42 k42Var2 = mc2.j;
                if (!uz0.g(obj24, Boolean.FALSE) && obj24 != null) {
                    mw2Var = (mw2) ((vp0) k42Var2.j).h(obj24);
                }
                return new ga1(str4, mw2Var);
            default:
                obj.getClass();
                List list14 = (List) obj;
                Object obj25 = list14.get(0);
                float f5 = t91.b;
                lc2 lc2Var3 = mc2.D;
                Boolean bool5 = Boolean.FALSE;
                uz0.g(obj25, bool5);
                t91 t91Var = obj25 != null ? (t91) lc2Var3.i.h(obj25) : null;
                t91Var.getClass();
                float f6 = t91Var.a;
                Object obj26 = list14.get(1);
                lc2 lc2Var4 = mc2.E;
                uz0.g(obj26, bool5);
                v91 v91Var = obj26 != null ? (v91) lc2Var4.i.h(obj26) : null;
                v91Var.getClass();
                int i3 = v91Var.a;
                Object obj27 = list14.get(2);
                lc2 lc2Var5 = mc2.F;
                uz0.g(obj27, bool5);
                u91 u91Var = obj27 != null ? (u91) lc2Var5.i.h(obj27) : null;
                u91Var.getClass();
                return new w91(f6, i3, u91Var.a);
        }
    }

    public /* synthetic */ z82(byte b) {
        this.h = b;
    }
}
