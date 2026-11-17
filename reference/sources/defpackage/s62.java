package defpackage;

import java.util.ArrayList;
import java.util.List;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s62 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ s62(vp0 vp0Var, kp0 kp0Var, kp0 kp0Var2, int i) {
        this.h = (byte) 8;
        this.k = vp0Var;
        this.i = kp0Var;
        this.j = kp0Var2;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        String str;
        String str2;
        String strT;
        String str3;
        byte b = this.h;
        byte b2 = 4;
        og1 og1Var = og1.h;
        m10 m10Var = null;
        jw0 jw0Var = l41.W;
        yy yyVar = zy.a;
        byte b3 = 3;
        byte b4 = 2;
        boolean z = false;
        byte b5 = 1;
        j23 j23Var = j23.a;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        switch (b) {
            case 0:
                sj1 sj1Var = (sj1) obj5;
                List list = (List) obj4;
                vp0 vp0Var = (vp0) obj3;
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    aw awVarA = yv.a(uz0.g, c5.u, dr0Var, 0);
                    int iHashCode = Long.hashCode(dr0Var.T);
                    dx1 dx1VarL = dr0Var.l();
                    rg1 rg1VarU = ls.U(dr0Var, og1Var);
                    sy.f.getClass();
                    dr0Var.Y();
                    if (dr0Var.S) {
                        dr0Var.k(jw0Var);
                    } else {
                        dr0Var.i0();
                    }
                    h12.y(c5.F, dr0Var, awVarA);
                    h12.y(c5.E, dr0Var, dx1VarL);
                    h12.y(c5.G, dr0Var, Integer.valueOf(iHashCode));
                    h12.t(dr0Var);
                    h12.y(c5.D, dr0Var, rg1VarU);
                    String str4 = (String) sj1Var.getValue();
                    yi0 yi0Var = yj2.a;
                    boolean zF = dr0Var.f(sj1Var);
                    Object objK = dr0Var.K();
                    if (zF || objK == yyVar) {
                        objK = new cb(sj1Var, (byte) 6);
                        dr0Var.f0(objK);
                    }
                    ls.h(str4, (vp0) objK, yi0Var, false, null, null, h7.B, null, null, null, false, null, null, null, true, 0, 0, null, null, dr0Var, 12583296, 12582912, 8257400);
                    rg1 rg1VarD = yj2.d(og1Var, 0.0f, 360.0f, 1);
                    boolean zH = dr0Var.h(list) | dr0Var.f(vp0Var);
                    Object objK2 = dr0Var.K();
                    if (zH || objK2 == yyVar) {
                        objK2 = new uy1(list, vp0Var, b2);
                        dr0Var.f0(objK2);
                    }
                    cu.h(rg1VarD, null, null, null, null, null, false, null, (vp0) objK2, dr0Var, 6, 510);
                    dr0Var.p(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                uz0.c((kp0) obj5, (la0) obj4, (nx) obj3, (dr0) obj, m02.A(385));
                break;
            case 2:
                rg1 rg1Var = (rg1) obj4;
                sj1 sj1Var2 = (sj1) obj5;
                nx nxVar = (nx) obj3;
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dr0Var2.Q();
                } else {
                    Object objK3 = dr0Var2.K();
                    if (objK3 == yyVar) {
                        objK3 = new cb(sj1Var2, (byte) 0);
                        dr0Var2.f0(objK3);
                    }
                    rg1 rg1VarV = tz0.v(rg1Var, (vp0) objK3);
                    ze1 ze1VarC = ho.c(c5.i, true);
                    int iHashCode2 = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL2 = dr0Var2.l();
                    rg1 rg1VarU2 = ls.U(dr0Var2, rg1VarV);
                    sy.f.getClass();
                    dr0Var2.Y();
                    if (dr0Var2.S) {
                        dr0Var2.k(jw0Var);
                    } else {
                        dr0Var2.i0();
                    }
                    h12.y(c5.F, dr0Var2, ze1VarC);
                    h12.y(c5.E, dr0Var2, dx1VarL2);
                    h12.y(c5.G, dr0Var2, Integer.valueOf(iHashCode2));
                    h12.t(dr0Var2);
                    h12.y(c5.D, dr0Var2, rg1VarU2);
                    wi0.n(0, nxVar, dr0Var2, true);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                uz.a((t6) obj5, (vz1) obj4, (nx) obj3, (dr0) obj, m02.A(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                dt.i((rg1) obj5, (kv2) obj4, (nx) obj3, (dr0) obj, m02.A(385));
                break;
            case 5:
                lw0 lw0Var = (lw0) obj4;
                kp0 kp0Var = (kp0) obj3;
                sj1 sj1Var3 = (sj1) obj5;
                dr0 dr0Var3 = (dr0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!dr0Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dr0Var3.Q();
                } else {
                    de.b(dt.N(973378491, new cw0(lw0Var, b4), dr0Var3), null, dt.N(283547001, new gw0(kp0Var, z ? (byte) 1 : (byte) 0), dr0Var3), dt.N(-1718383184, new ng(lw0Var, sj1Var3, b4), dr0Var3), 0.0f, null, null, dr0Var3, 3462, 242);
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                vs.h((fg) obj5, (String) obj4, (kp0) obj3, (dr0) obj, m02.A(1));
                break;
            case 7:
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                ie1.p((x20) obj5, null, new tl1(fFloatValue, (pf2) obj4, (pk1) obj3, null), 3);
                break;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                ((Integer) obj2).getClass();
                cu.m((vp0) obj3, (kp0) obj5, (kp0) obj4, (dr0) obj, m02.A(1));
                break;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                ((Integer) obj2).getClass();
                h7.O((String) obj5, (kp0) obj4, (vp0) obj3, (dr0) obj, m02.A(1));
                break;
            case 10:
                ay1 ay1Var = (ay1) obj4;
                kp0 kp0Var2 = (kp0) obj3;
                sj1 sj1Var4 = (sj1) obj5;
                dr0 dr0Var4 = (dr0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!dr0Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    dr0Var4.Q();
                } else {
                    de.b(dt.N(130551308, new xx1(ay1Var, b4), dr0Var4), null, dt.N(220611598, new gw0(kp0Var2, b3), dr0Var4), dt.N(-1709681993, new ng(ay1Var, sj1Var4, b2), dr0Var4), 0.0f, null, null, dr0Var4, 3462, 242);
                }
                break;
            case 11:
                x62 x62Var = (x62) obj4;
                kp0 kp0Var3 = (kp0) obj3;
                sj1 sj1Var5 = (sj1) obj5;
                dr0 dr0Var5 = (dr0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!dr0Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    dr0Var5.Q();
                } else {
                    de.b(dt.N(-412371007, new t62(x62Var, z ? (byte) 1 : (byte) 0), dr0Var5), null, dt.N(-1198368897, new gw0(kp0Var3, (byte) 5), dr0Var5), dt.N(622491318, new r62(x62Var, sj1Var5, b5), dr0Var5), 0.0f, null, null, dr0Var5, 3462, 242);
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                v62.a((ArrayList) obj5, (vp0) obj3, (kp0) obj4, (dr0) obj, m02.A(1));
                break;
            case 13:
                u72 u72Var = (u72) obj5;
                qe2 qe2Var = (qe2) obj4;
                float fFloatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jI = qe2Var.i(qe2Var.e(fFloatValue2 - u72Var.h));
                qe2 qe2Var2 = ((oe2) obj3).a;
                u72Var.h += qe2Var.e(qe2Var.h(qe2Var2.d(qe2Var2.k, jI, 1)));
                break;
            case 14:
                j62 j62Var = (j62) obj5;
                ez1 ez1Var = (ez1) obj4;
                String str5 = (String) obj3;
                dr0 dr0Var6 = (dr0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!dr0Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    dr0Var6.Q();
                } else {
                    gw2.b(((j62Var == null || (str = j62Var.b) == null) && (str = (String) ez1Var.d.get(str5)) == null) ? str5 : str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var6, 0, 0, 262142);
                }
                break;
            case 15:
                j62 j62Var2 = (j62) obj5;
                ez1 ez1Var2 = (ez1) obj4;
                c63 c63Var = ez1Var2.b;
                ek2 ek2Var = (ek2) obj3;
                dr0 dr0Var7 = (dr0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!dr0Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    dr0Var7.Q();
                } else {
                    if (j62Var2 == null) {
                        dr0Var7.V(1435625102);
                        gw2.b("这道菜已从菜谱库删除。", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var7, 6, 0, 262142);
                    } else {
                        dr0Var7.V(1435626616);
                        aw awVarA2 = yv.a(new ah(4.0f, new wg((byte) 0)), c5.u, dr0Var7, 6);
                        int iHashCode3 = Long.hashCode(dr0Var7.T);
                        dx1 dx1VarL3 = dr0Var7.l();
                        rg1 rg1VarU3 = ls.U(dr0Var7, og1Var);
                        sy.f.getClass();
                        dr0Var7.Y();
                        if (dr0Var7.S) {
                            dr0Var7.k(jw0Var);
                        } else {
                            dr0Var7.i0();
                        }
                        h12.y(c5.F, dr0Var7, awVarA2);
                        h12.y(c5.E, dr0Var7, dx1VarL3);
                        h12.y(c5.G, dr0Var7, Integer.valueOf(iHashCode3));
                        h12.t(dr0Var7);
                        h12.y(c5.D, dr0Var7, rg1VarU3);
                        ed2 ed2Var = ez1Var2.e;
                        gw2.b(jp1.k(ek2Var.a.i, ek2Var.b.i, "，共 ", t03.t(1, pz1.v(c63Var, ek2Var, j62Var2, ed2Var)), " 份"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var7.j(e13.a)).k, dr0Var7, 0, 0, 131070);
                        dr0Var7.V(1261623181);
                        ArrayList arrayListJ = pz1.j(c63Var, ek2Var, j62Var2, ed2Var);
                        int size = arrayListJ.size();
                        int i = 0;
                        while (i < size) {
                            Object obj6 = arrayListJ.get(i);
                            i++;
                            mz1 mz1Var = (mz1) obj6;
                            uv0 uv0Var = (uv0) ez1Var2.g.get(mz1Var.a);
                            if (uv0Var == null || (str2 = uv0Var.b) == null) {
                                str2 = mz1Var.a;
                            }
                            double d = mz1Var.b;
                            if (d >= 1000.0d) {
                                strT = t03.t(2, d / 1000.0d);
                                str3 = " kg";
                            } else {
                                strT = t03.t(0, d);
                                str3 = " g";
                            }
                            gw2.b(str2 + "：" + strT.concat(str3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var7, 0, 0, 262142);
                        }
                        dr0Var7.p(false);
                        bp1 bp1VarB = j62Var2.b();
                        String strT2 = t03.t(0, bp1VarB.a);
                        String strT3 = t03.t(1, bp1VarB.b);
                        String strT4 = t03.t(1, bp1VarB.c);
                        String strT5 = t03.t(1, bp1VarB.d);
                        StringBuilder sbL = wi0.l("每份 ", strT2, " kcal · 蛋白 ", strT3, "g · 脂肪 ");
                        sbL.append(strT4);
                        sbL.append("g · 碳水 ");
                        sbL.append(strT5);
                        sbL.append("g");
                        gw2.b(sbL.toString(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var7.j(e13.a)).l, dr0Var7, 0, 0, 131070);
                        dr0Var7.p(true);
                    }
                    dr0Var7.p(false);
                }
                break;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                ((Integer) obj2).getClass();
                tz0.a((i4) obj5, (String) obj4, (kp0) obj3, (dr0) obj, m02.A(1));
                break;
            default:
                r93 r93Var = (r93) obj5;
                wy wyVar = (wy) obj4;
                nx nxVar2 = (nx) obj3;
                dr0 dr0Var8 = (dr0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!dr0Var8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    dr0Var8.Q();
                } else {
                    t6 t6Var = r93Var.h;
                    boolean zH2 = dr0Var8.h(r93Var);
                    Object objK4 = dr0Var8.K();
                    if (zH2 || objK4 == yyVar) {
                        objK4 = new q93(r93Var, m10Var, z ? (byte) 1 : (byte) 0);
                        dr0Var8.f0(objK4);
                    }
                    h7.J((zp0) objK4, dr0Var8, t6Var);
                    boolean zH3 = dr0Var8.h(r93Var);
                    Object objK5 = dr0Var8.K();
                    if (zH3 || objK5 == yyVar) {
                        objK5 = new q93(r93Var, m10Var, b5);
                        dr0Var8.f0(objK5);
                    }
                    h7.J((zp0) objK5, dr0Var8, t6Var);
                    wyVar.a(t6Var, nxVar2, dr0Var8, 0);
                }
                break;
        }
        return j23Var;
    }

    public /* synthetic */ s62(rg1 rg1Var, sj1 sj1Var, nx nxVar) {
        this.h = (byte) 2;
        this.j = rg1Var;
        this.i = sj1Var;
        this.k = nxVar;
    }

    public /* synthetic */ s62(z43 z43Var, kp0 kp0Var, sj1 sj1Var, byte b) {
        this.h = b;
        this.j = z43Var;
        this.k = kp0Var;
        this.i = sj1Var;
    }

    public /* synthetic */ s62(Object obj, Object obj2, hq0 hq0Var, int i, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
        this.k = hq0Var;
    }

    public /* synthetic */ s62(Object obj, Object obj2, Object obj3, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
    }

    public /* synthetic */ s62(ArrayList arrayList, vp0 vp0Var, kp0 kp0Var, int i) {
        this.h = (byte) 12;
        this.i = arrayList;
        this.k = vp0Var;
        this.j = kp0Var;
    }
}
