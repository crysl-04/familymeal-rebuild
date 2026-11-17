package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uw1 implements aq0 {
    public final /* synthetic */ byte h = 1;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ uw1(kp0 kp0Var, sj1 sj1Var, int i, vp0 vp0Var) {
        this.j = kp0Var;
        this.k = sj1Var;
        this.i = i;
        this.l = vp0Var;
    }

    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        byte b = this.h;
        j23 j23Var = j23.a;
        yy yyVar = zy.a;
        jw0 jw0Var = l41.W;
        og1 og1Var = og1.h;
        Object obj4 = this.l;
        Object obj5 = this.k;
        int i = this.i;
        Object obj6 = this.j;
        switch (b) {
            case 0:
                kp0 kp0Var = (kp0) obj6;
                sj1 sj1Var = (sj1) obj5;
                vp0 vp0Var = (vp0) obj4;
                pt1 pt1Var = (pt1) obj;
                dr0 dr0Var = (dr0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                pt1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dr0Var.f(pt1Var) ? 4 : 2;
                }
                if (dr0Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    yi0 yi0Var = yj2.b;
                    rg1 rg1VarF = t03.F(yi0Var, pt1Var);
                    aw awVarA = yv.a(uz0.g, c5.u, dr0Var, 0);
                    int iHashCode = Long.hashCode(dr0Var.T);
                    dx1 dx1VarL = dr0Var.l();
                    rg1 rg1VarU = ls.U(dr0Var, rg1VarF);
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
                    String strI = jp1.i(((List) sj1Var.getValue()).size(), "家人（", "）");
                    xw2 xw2Var = ((c13) dr0Var.j(e13.a)).f;
                    rg1 rg1VarI = t03.I(og1Var, 16.0f, 16.0f, 16.0f, 8.0f);
                    Object objK = dr0Var.K();
                    if (objK == yyVar) {
                        z = false;
                        objK = new vw1((byte) 0);
                        dr0Var.f0(objK);
                    } else {
                        z = false;
                    }
                    gw2.b(strI, tg2.a(rg1VarI, z, (vp0) objK), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, xw2Var, dr0Var, 0, 0, 131068);
                    aa3.c(kp0Var, t03.H(yj2.a, 16.0f, 0.0f, 2), false, null, null, null, null, t03.q, dr0Var, 805306416, 508);
                    boolean zF = dr0Var.f(sj1Var) | dr0Var.d(i) | dr0Var.f(vp0Var);
                    Object objK2 = dr0Var.K();
                    if (zF || objK2 == yyVar) {
                        objK2 = new ww1((byte) 0, i, sj1Var, vp0Var);
                        dr0Var.f0(objK2);
                    }
                    cu.h(yi0Var, null, null, null, null, null, false, null, (vp0) objK2, dr0Var, 6, 510);
                    dr0Var.p(true);
                } else {
                    dr0Var.Q();
                }
                break;
            default:
                bp1 bp1Var = (bp1) obj6;
                bp1 bp1Var2 = (bp1) obj5;
                x62 x62Var = (x62) obj4;
                dr0 dr0Var2 = (dr0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((bw) obj).getClass();
                if (dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    rg1 rg1VarG = t03.G(og1Var, 16.0f);
                    aw awVarA2 = yv.a(new ah(4.0f, new wg((byte) 0)), c5.u, dr0Var2, 6);
                    int iHashCode2 = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL2 = dr0Var2.l();
                    rg1 rg1VarU2 = ls.U(dr0Var2, rg1VarG);
                    sy.f.getClass();
                    dr0Var2.Y();
                    if (dr0Var2.S) {
                        dr0Var2.k(jw0Var);
                    } else {
                        dr0Var2.i0();
                    }
                    h12.y(c5.F, dr0Var2, awVarA2);
                    h12.y(c5.E, dr0Var2, dx1VarL2);
                    h12.y(c5.G, dr0Var2, Integer.valueOf(iHashCode2));
                    h12.t(dr0Var2);
                    h12.y(c5.D, dr0Var2, rg1VarU2);
                    gw2.b("营养（按食材计算）", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var2.j(e13.a)).i, dr0Var2, 6, 0, 131070);
                    String strT = t03.t(0, bp1Var.a);
                    String strT2 = t03.t(1, bp1Var.b);
                    String strT3 = t03.t(1, bp1Var.c);
                    String strT4 = t03.t(1, bp1Var.d);
                    String strT5 = t03.t(1, bp1Var.e);
                    StringBuilder sbL = wi0.l("整道菜：", strT, " kcal · 蛋白 ", strT2, "g · 脂肪 ");
                    wi0.v(sbL, strT3, "g · 碳水 ", strT4, "g · 纤维 ");
                    gw2.b(wi0.i(sbL, strT5, "g"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var2, 0, 0, 262142);
                    String strT6 = t03.t(0, bp1Var2.a);
                    String strT7 = t03.t(1, bp1Var2.b);
                    StringBuilder sb = new StringBuilder("每份（");
                    sb.append(i);
                    sb.append(" 份）：");
                    sb.append(strT6);
                    sb.append(" kcal · 蛋白 ");
                    gw2.b(wi0.i(sb, strT7, "g"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var2, 0, 0, 262142);
                    bp1 bp1Var3 = (bp1) x62Var.p.getValue();
                    if (bp1Var3 == null) {
                        dr0Var2.V(-1793464061);
                        dr0Var2.p(false);
                        z2 = true;
                    } else {
                        dr0Var2.V(-1793464060);
                        b82 b82Var = bh0.a;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj7 : zo1.n) {
                            zo1 zo1Var = (zo1) obj7;
                            double d = zo1Var == zo1.h ? 20.0d : 5.0d;
                            double dA = bp1Var3.a(zo1Var);
                            double dA2 = bp1Var.a(zo1Var);
                            double dMax = Math.max(dA, dA2);
                            if ((dMax < d ? 0.0d : Math.abs(dA - dA2) / dMax) > 0.1d) {
                                arrayList.add(obj7);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            dr0Var2.V(-745822873);
                            dr0Var2.p(false);
                        } else {
                            dr0Var2.V(-746267816);
                            boolean zH = dr0Var2.h(bp1Var3) | dr0Var2.h(bp1Var);
                            Object objK3 = dr0Var2.K();
                            if (zH || objK3 == yyVar) {
                                objK3 = new uy1((Object) bp1Var3, (Object) bp1Var, (byte) 5);
                                dr0Var2.f0(objK3);
                            }
                            gw2.b(wi0.h("原数据与按食材计算的结果相差超过 10%：", dv.E0(arrayList, "、", null, null, (vp0) objK3, 30), "。保存后将改用计算值。"), null, ((pv) dr0Var2.j(rv.a)).j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var2, 0, 0, 262138);
                            dr0Var2.p(false);
                        }
                        dr0Var2.p(false);
                        z2 = true;
                    }
                    dr0Var2.p(z2);
                } else {
                    dr0Var2.Q();
                }
                break;
        }
        return j23Var;
    }

    public /* synthetic */ uw1(bp1 bp1Var, int i, bp1 bp1Var2, x62 x62Var) {
        this.j = bp1Var;
        this.i = i;
        this.k = bp1Var2;
        this.l = x62Var;
    }
}
