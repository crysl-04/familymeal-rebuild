package defpackage;

import android.content.res.Resources;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jc2 implements vp0 {
    public final /* synthetic */ byte h;

    public /* synthetic */ jc2(byte b) {
        this.h = b;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) throws Exception {
        nd ndVar;
        kv kvVar;
        kv kvVar2;
        byte b = this.h;
        boolean z = true;
        j23 j23Var = j23.a;
        cu1 cu1Var = null;
        sf0Var = null;
        sf0 sf0Var = null;
        ei2Var = null;
        ei2 ei2Var = null;
        ow2Var = null;
        ow2 ow2Var = null;
        ga1Var = null;
        ga1 ga1Var = null;
        ha1Var = null;
        ha1 ha1Var = null;
        w23Var = null;
        w23 w23Var = null;
        f43Var = null;
        f43 f43Var = null;
        yl2Var = null;
        yl2 yl2Var = null;
        cu1Var = null;
        switch (b) {
            case 0:
                obj.getClass();
                float fFloatValue = ((Float) obj).floatValue();
                t91.a(fFloatValue);
                return new t91(fFloatValue);
            case 1:
                obj.getClass();
                return new v91(((Integer) obj).intValue());
            case 2:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                qd qdVar = obj2 != null ? (qd) obj2 : null;
                qdVar.getClass();
                Object obj3 = list.get(2);
                Integer num = obj3 != null ? (Integer) obj3 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj4 = list.get(3);
                Integer num2 = obj4 != null ? (Integer) obj4 : null;
                num2.getClass();
                int iIntValue2 = num2.intValue();
                Object obj5 = list.get(4);
                String str = obj5 != null ? (String) obj5 : null;
                str.getClass();
                switch (qdVar.ordinal()) {
                    case 0:
                        Object obj6 = list.get(1);
                        k42 k42Var = mc2.h;
                        if (!uz0.g(obj6, Boolean.FALSE) && obj6 != null) {
                            cu1Var = (cu1) ((vp0) k42Var.j).h(obj6);
                        }
                        cu1 cu1Var2 = cu1Var;
                        cu1Var2.getClass();
                        ndVar = new nd(cu1Var2, iIntValue, iIntValue2, str);
                        break;
                    case 1:
                        Object obj7 = list.get(1);
                        k42 k42Var2 = mc2.i;
                        if (!uz0.g(obj7, Boolean.FALSE) && obj7 != null) {
                            yl2Var = (yl2) ((vp0) k42Var2.j).h(obj7);
                        }
                        yl2 yl2Var2 = yl2Var;
                        yl2Var2.getClass();
                        ndVar = new nd(yl2Var2, iIntValue, iIntValue2, str);
                        break;
                    case 2:
                        Object obj8 = list.get(1);
                        k42 k42Var3 = mc2.d;
                        if (!uz0.g(obj8, Boolean.FALSE) && obj8 != null) {
                            f43Var = (f43) ((vp0) k42Var3.j).h(obj8);
                        }
                        f43 f43Var2 = f43Var;
                        f43Var2.getClass();
                        ndVar = new nd(f43Var2, iIntValue, iIntValue2, str);
                        break;
                    case 3:
                        Object obj9 = list.get(1);
                        k42 k42Var4 = mc2.e;
                        if (!uz0.g(obj9, Boolean.FALSE) && obj9 != null) {
                            w23Var = (w23) ((vp0) k42Var4.j).h(obj9);
                        }
                        w23 w23Var2 = w23Var;
                        w23Var2.getClass();
                        ndVar = new nd(w23Var2, iIntValue, iIntValue2, str);
                        break;
                    case 4:
                        Object obj10 = list.get(1);
                        k42 k42Var5 = mc2.f;
                        if (!uz0.g(obj10, Boolean.FALSE) && obj10 != null) {
                            ha1Var = (ha1) ((vp0) k42Var5.j).h(obj10);
                        }
                        ha1 ha1Var2 = ha1Var;
                        ha1Var2.getClass();
                        ndVar = new nd(ha1Var2, iIntValue, iIntValue2, str);
                        break;
                    case 5:
                        Object obj11 = list.get(1);
                        k42 k42Var6 = mc2.g;
                        if (!uz0.g(obj11, Boolean.FALSE) && obj11 != null) {
                            ga1Var = (ga1) ((vp0) k42Var6.j).h(obj11);
                        }
                        ga1 ga1Var2 = ga1Var;
                        ga1Var2.getClass();
                        ndVar = new nd(ga1Var2, iIntValue, iIntValue2, str);
                        break;
                    case 6:
                        Object obj12 = list.get(1);
                        String str2 = obj12 != null ? (String) obj12 : null;
                        str2.getClass();
                        ndVar = new nd(new xn2(str2), iIntValue, iIntValue2, str);
                        break;
                    default:
                        wg.n();
                        return null;
                }
                return ndVar;
            case 3:
                obj.getClass();
                return new u91(((Integer) obj).intValue());
            case 4:
                String str3 = obj != null ? (String) obj : null;
                str3.getClass();
                return new f43(str3);
            case 5:
                String str4 = obj != null ? (String) obj : null;
                str4.getClass();
                return new w23(str4);
            case 6:
                obj.getClass();
                List list2 = (List) obj;
                Object obj13 = list2.get(0);
                lc2 lc2Var = mc2.s;
                Boolean bool = Boolean.FALSE;
                uz0.g(obj13, bool);
                zs2 zs2Var = obj13 != null ? (zs2) lc2Var.i.h(obj13) : null;
                zs2Var.getClass();
                int i = zs2Var.a;
                Object obj14 = list2.get(1);
                lc2 lc2Var2 = mc2.t;
                uz0.g(obj14, bool);
                yt2 yt2Var = obj14 != null ? (yt2) lc2Var2.i.h(obj14) : null;
                yt2Var.getClass();
                int i2 = yt2Var.a;
                Object obj15 = list2.get(2);
                bx2[] bx2VarArr = ax2.b;
                lc2 lc2Var3 = mc2.x;
                uz0.g(obj15, bool);
                ax2 ax2Var = obj15 != null ? (ax2) lc2Var3.i.h(obj15) : null;
                ax2Var.getClass();
                long j = ax2Var.a;
                Object obj16 = list2.get(3);
                zv2 zv2Var = zv2.c;
                zv2 zv2Var2 = (uz0.g(obj16, bool) || obj16 == null) ? null : (zv2) ((vp0) mc2.m.j).h(obj16);
                Object obj17 = list2.get(4);
                xz1 xz1Var = (uz0.g(obj17, bool) || obj17 == null) ? null : (xz1) ((vp0) tz0.d0.j).h(obj17);
                Object obj18 = list2.get(5);
                w91 w91Var = w91.d;
                w91 w91Var2 = (uz0.g(obj18, bool) || obj18 == null) ? null : (w91) ((vp0) mc2.C.j).h(obj18);
                Object obj19 = list2.get(6);
                r91 r91Var = (uz0.g(obj19, bool) || obj19 == null) ? null : (r91) ((vp0) tz0.f0.j).h(obj19);
                r91Var.getClass();
                int i3 = r91Var.a;
                Object obj20 = list2.get(7);
                lc2 lc2Var4 = mc2.u;
                uz0.g(obj20, bool);
                wt0 wt0Var = obj20 != null ? (wt0) lc2Var4.i.h(obj20) : null;
                wt0Var.getClass();
                int i4 = wt0Var.a;
                Object obj21 = list2.get(8);
                k42 k42Var7 = tz0.g0;
                if (!uz0.g(obj21, bool) && obj21 != null) {
                    ow2Var = (ow2) ((vp0) k42Var7.j).h(obj21);
                }
                return new cu1(i, i2, j, zv2Var2, xz1Var, w91Var2, i3, i4, ow2Var);
            case 7:
                obj.getClass();
                List list3 = (List) obj;
                Object obj22 = list3.get(0);
                int i5 = kv.h;
                Boolean bool2 = Boolean.FALSE;
                uz0.g(obj22, bool2);
                if (obj22 != null) {
                    kvVar = uz0.g(obj22, Boolean.FALSE) ? new kv(kv.g) : new kv(cu.b(((Integer) obj22).intValue()));
                } else {
                    kvVar = null;
                }
                kvVar.getClass();
                long j2 = kvVar.a;
                Object obj23 = list3.get(1);
                bx2[] bx2VarArr2 = ax2.b;
                vp0 vp0Var = mc2.x.i;
                uz0.g(obj23, bool2);
                ax2 ax2Var2 = obj23 != null ? (ax2) vp0Var.h(obj23) : null;
                ax2Var2.getClass();
                long j3 = ax2Var2.a;
                Object obj24 = list3.get(2);
                qn0 qn0Var = qn0.i;
                qn0 qn0Var2 = (uz0.g(obj24, bool2) || obj24 == null) ? null : (qn0) ((vp0) mc2.n.j).h(obj24);
                Object obj25 = list3.get(3);
                on0 on0Var = (uz0.g(obj25, bool2) || obj25 == null) ? null : (on0) ((vp0) mc2.v.j).h(obj25);
                Object obj26 = list3.get(4);
                pn0 pn0Var = (uz0.g(obj26, bool2) || obj26 == null) ? null : (pn0) ((vp0) mc2.w.j).h(obj26);
                Object obj27 = list3.get(6);
                String str5 = obj27 != null ? (String) obj27 : null;
                Object obj28 = list3.get(7);
                uz0.g(obj28, bool2);
                ax2 ax2Var3 = obj28 != null ? (ax2) vp0Var.h(obj28) : null;
                ax2Var3.getClass();
                long j4 = ax2Var3.a;
                Object obj29 = list3.get(8);
                uk ukVar = (uz0.g(obj29, bool2) || obj29 == null) ? null : (uk) ((vp0) mc2.o.j).h(obj29);
                Object obj30 = list3.get(9);
                yv2 yv2Var = (uz0.g(obj30, bool2) || obj30 == null) ? null : (yv2) ((vp0) mc2.l.j).h(obj30);
                Object obj31 = list3.get(10);
                ub1 ub1Var = ub1.j;
                ub1 ub1Var2 = (uz0.g(obj31, bool2) || obj31 == null) ? null : (ub1) ((vp0) mc2.A.j).h(obj31);
                Object obj32 = list3.get(11);
                uz0.g(obj32, bool2);
                if (obj32 != null) {
                    kvVar2 = uz0.g(obj32, Boolean.FALSE) ? new kv(kv.g) : new kv(cu.b(((Integer) obj32).intValue()));
                } else {
                    kvVar2 = null;
                }
                kvVar2.getClass();
                long j5 = kvVar2.a;
                Object obj33 = list3.get(12);
                vt2 vt2Var = (uz0.g(obj33, bool2) || obj33 == null) ? null : (vt2) ((vp0) mc2.k.j).h(obj33);
                Object obj34 = list3.get(13);
                ei2 ei2Var2 = ei2.d;
                k42 k42Var8 = mc2.q;
                if (!uz0.g(obj34, bool2) && obj34 != null) {
                    ei2Var = (ei2) ((vp0) k42Var8.j).h(obj34);
                }
                return new yl2(j2, j3, qn0Var2, on0Var, pn0Var, (ar2) null, str5, j4, ukVar, yv2Var, ub1Var2, j5, vt2Var, ei2Var, 49184);
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                obj.getClass();
                List list4 = (List) obj;
                Object obj35 = list4.get(0);
                Boolean bool3 = obj35 != null ? (Boolean) obj35 : null;
                bool3.getClass();
                boolean zBooleanValue = bool3.booleanValue();
                Object obj36 = list4.get(1);
                k42 k42Var9 = tz0.e0;
                if (!uz0.g(obj36, Boolean.FALSE) && obj36 != null) {
                    sf0Var = (sf0) ((vp0) k42Var9.j).h(obj36);
                }
                sf0 sf0Var2 = sf0Var;
                sf0Var2.getClass();
                return new xz1(sf0Var2.a, zBooleanValue);
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                obj.getClass();
                return new sf0(((Integer) obj).intValue());
            case 10:
                obj.getClass();
                return new r91(((Integer) obj).intValue());
            case 11:
                obj.getClass();
                List list5 = (List) obj;
                Object obj37 = list5.get(0);
                nw2 nw2Var = (uz0.g(obj37, Boolean.FALSE) || obj37 == null) ? null : (nw2) ((vp0) tz0.h0.j).h(obj37);
                nw2Var.getClass();
                int i6 = nw2Var.a;
                Object obj38 = list5.get(1);
                Boolean bool4 = obj38 != null ? (Boolean) obj38 : null;
                bool4.getClass();
                return new ow2(i6, bool4.booleanValue());
            case 12:
                obj.getClass();
                return new nw2(((Integer) obj).intValue());
            case 13:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM schedule_slot");
                try {
                    int iM = y02.m(sQLiteStatementPrepare, "day");
                    int iM2 = y02.m(sQLiteStatementPrepare, "meal");
                    int iM3 = y02.m(sQLiteStatementPrepare, "person_id");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new kd2(sQLiteStatementPrepare.getText(iM), sQLiteStatementPrepare.getText(iM2), sQLiteStatementPrepare.getText(iM3)));
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } catch (Throwable th) {
                    sQLiteStatementPrepare.close();
                    throw th;
                }
            case 14:
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj;
                sQLiteConnection2.getClass();
                SQLiteStatement sQLiteStatementPrepare2 = sQLiteConnection2.prepare("SELECT * FROM schedule_slot");
                try {
                    int iM4 = y02.m(sQLiteStatementPrepare2, "day");
                    int iM5 = y02.m(sQLiteStatementPrepare2, "meal");
                    int iM6 = y02.m(sQLiteStatementPrepare2, "person_id");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        arrayList2.add(new kd2(sQLiteStatementPrepare2.getText(iM4), sQLiteStatementPrepare2.getText(iM5), sQLiteStatementPrepare2.getText(iM6)));
                    }
                    sQLiteStatementPrepare2.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    sQLiteStatementPrepare2.close();
                    throw th2;
                }
            case 15:
                p60 p60Var = (p60) obj;
                p60Var.getClass();
                return p60Var.name();
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                return Integer.valueOf(((pd2) obj).b);
            case 17:
                ry0 ry0Var = ((pd2) obj).c;
                return Integer.valueOf(ry0Var.d - ry0Var.b);
            case 18:
                return new yd2(((Integer) obj).intValue());
            case 19:
                h11 h11Var = (h11) obj;
                h11Var.getClass();
                h11Var.b = false;
                return j23Var;
            case 20:
                q21[] q21VarArr = bh2.a;
                ((dh2) obj).a(ah2.e, j23Var);
                return j23Var;
            case 21:
                up1 up1Var = (up1) obj;
                long j6 = up1Var.a;
                return (9223372034707292159L & j6) != 9205357640488583168L ? new fd(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (up1Var.a & 4294967295L))) : t03.B;
            case 22:
                fd fdVar = (fd) obj;
                return new up1((((long) Float.floatToRawIntBits(fdVar.a)) << 32) | (((long) Float.floatToRawIntBits(fdVar.b)) & 4294967295L));
            case 23:
                if (obj != null) {
                }
                return Boolean.valueOf(z);
            case 24:
                return j23Var;
            case 25:
            default:
                return j23Var;
            case 26:
                bh2.d((dh2) obj);
                return j23Var;
            case 27:
                return j23Var;
            case 28:
                Resources resources = (Resources) obj;
                resources.getClass();
                if ((resources.getConfiguration().uiMode & 48) != 32) {
                }
                return Boolean.valueOf(z);
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
