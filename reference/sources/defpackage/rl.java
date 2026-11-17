package defpackage;

import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rl implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ rl(Object obj, Object obj2, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Object obj5;
        byte b = this.h;
        jw0 jw0Var = l41.W;
        yy yyVar = zy.a;
        og1 og1Var = og1.h;
        j23 j23Var = j23.a;
        Object obj6 = this.j;
        Object obj7 = this.i;
        switch (b) {
            case 0:
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Number) obj2).intValue();
                String str = (String) obj7;
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    boolean zF = dr0Var.f(str);
                    Object objK = dr0Var.K();
                    if (zF || objK == yyVar) {
                        obj3 = objK;
                        ql qlVar = new ql(str, false ? (byte) 1 : (byte) 0);
                        dr0Var.f0(qlVar);
                        obj3 = qlVar;
                    }
                    rg1 rg1VarA = tg2.a(og1Var, false, (vp0) obj3);
                    nx nxVar = (nx) obj6;
                    ze1 ze1VarC = ho.c(c5.i, false);
                    int iHashCode = Long.hashCode(dr0Var.T);
                    dx1 dx1VarL = dr0Var.l();
                    rg1 rg1VarU = ls.U(dr0Var, rg1VarA);
                    sy.f.getClass();
                    dr0Var.Y();
                    if (dr0Var.S) {
                        dr0Var.k(jw0Var);
                    } else {
                        dr0Var.i0();
                    }
                    h12.y(c5.F, dr0Var, ze1VarC);
                    h12.y(c5.E, dr0Var, dx1VarL);
                    yx yxVar = c5.G;
                    if (dr0Var.S || !uz0.g(dr0Var.K(), Integer.valueOf(iHashCode))) {
                        wi0.o(iHashCode, dr0Var, iHashCode, yxVar);
                    }
                    h12.y(c5.D, dr0Var, rg1VarU);
                    wi0.n(0, nxVar, dr0Var, true);
                }
                break;
            case 1:
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dr0Var2.Q();
                } else {
                    rg1 rg1VarF = t03.F(yj2.a(og1Var, mp.c, mp.d), (rt1) obj7);
                    aq0 aq0Var = (aq0) obj6;
                    ua2 ua2VarA = ta2.a(uz0.h, c5.s, dr0Var2, 54);
                    int iHashCode2 = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL2 = dr0Var2.l();
                    rg1 rg1VarU2 = ls.U(dr0Var2, rg1VarF);
                    sy.f.getClass();
                    dr0Var2.Y();
                    if (dr0Var2.S) {
                        dr0Var2.k(jw0Var);
                    } else {
                        dr0Var2.i0();
                    }
                    h12.y(c5.F, dr0Var2, ua2VarA);
                    h12.y(c5.E, dr0Var2, dx1VarL2);
                    yx yxVar2 = c5.G;
                    if (dr0Var2.S || !uz0.g(dr0Var2.K(), Integer.valueOf(iHashCode2))) {
                        wi0.o(iHashCode2, dr0Var2, iHashCode2, yxVar2);
                    }
                    h12.y(c5.D, dr0Var2, rg1VarU2);
                    aq0Var.c(wa2.a, dr0Var2, 6);
                    dr0Var2.p(true);
                }
                break;
            case 2:
                dr0 dr0Var3 = (dr0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                String str2 = (String) obj6;
                if (!dr0Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dr0Var3.Q();
                } else {
                    String str3 = (String) obj7;
                    boolean zF2 = dr0Var3.f(str3) | dr0Var3.f(str2);
                    String str4 = (String) obj7;
                    Object objK2 = dr0Var3.K();
                    if (zF2 || objK2 == yyVar) {
                        obj4 = objK2;
                        o40 o40Var = new o40(str4, str2, (byte) 0);
                        dr0Var3.f0(o40Var);
                        obj4 = o40Var;
                    }
                    gw2.b(str3, tg2.a(og1Var, false, (vp0) obj4), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var3, 0, 0, 262140);
                }
                break;
            case 3:
                dr0 dr0Var4 = (dr0) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!dr0Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    dr0Var4.Q();
                } else {
                    eu0.a((iu0) obj6, (String) obj7, null, 0L, dr0Var4, 0, 12);
                }
                break;
            case 4:
                String str5 = (String) obj7;
                dr0 dr0Var5 = (dr0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (!dr0Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    dr0Var5.Q();
                } else {
                    boolean zF3 = dr0Var5.f(str5);
                    Object objK3 = dr0Var5.K();
                    if (zF3 || objK3 == yyVar) {
                        objK3 = new ql(str5, (byte) 5);
                        dr0Var5.f0(objK3);
                    }
                    gw2.b(str5, tg2.a(og1Var, false, (vp0) objK3), ((s40) obj6).f, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var5, 0, 0, 262136);
                }
                break;
            case 5:
                dr0 dr0Var6 = (dr0) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (!dr0Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    dr0Var6.Q();
                } else {
                    cu.n(((pa1) obj7).b, s60.h0, (nx) obj6, dr0Var6, 48);
                }
                break;
            case 6:
                dr0 dr0Var7 = (dr0) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (!dr0Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    dr0Var7.Q();
                } else {
                    gw2.a(((c13) obj7).j, (nx) obj6, dr0Var7, 0);
                }
                break;
            case 7:
                dr0 dr0Var8 = (dr0) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                kn2 kn2Var = (kn2) obj7;
                if (!dr0Var8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    dr0Var8.Q();
                } else {
                    rg1 rg1VarW = s60.w(og1Var, "indicator");
                    boolean zF4 = dr0Var8.f(kn2Var);
                    Object objK4 = dr0Var8.K();
                    if (zF4 || objK4 == yyVar) {
                        obj5 = objK4;
                        u70 u70Var = new u70(kn2Var, (byte) 1);
                        dr0Var8.f0(u70Var);
                        obj5 = u70Var;
                    }
                    ho.a(ie1.e(h7.i0(rg1VarW, (vp0) obj5), ((yl1) obj6).c, mi2.a(aa3.G, dr0Var8)), dr0Var8, 0);
                }
                break;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                dr0 dr0Var9 = (dr0) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                bp1 bp1Var = (bp1) obj6;
                if (!dr0Var9.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    dr0Var9.Q();
                } else {
                    j62 j62Var = (j62) obj7;
                    gw2.b(dv.E0(gi.W(new String[]{j62Var.d.h, j62Var.j.h, j62Var.k ? "快手" : "慢炖", jp1.k("每份 ", t03.t(0, bp1Var.a), " kcal · 蛋白 ", t03.t(1, bp1Var.b), "g")}), " · ", null, null, null, 62), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var9, 0, 0, 262142);
                }
                break;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                dr0 dr0Var10 = (dr0) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (!dr0Var10.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    dr0Var10.Q();
                } else {
                    nx nxVar2 = (nx) obj6;
                    sc2 sc2Var = (sc2) obj7;
                    ze1 ze1VarC2 = ho.c(c5.i, false);
                    int iHashCode3 = Long.hashCode(dr0Var10.T);
                    dx1 dx1VarL3 = dr0Var10.l();
                    rg1 rg1VarU3 = ls.U(dr0Var10, og1Var);
                    sy.f.getClass();
                    dr0Var10.Y();
                    if (dr0Var10.S) {
                        dr0Var10.k(jw0Var);
                    } else {
                        dr0Var10.i0();
                    }
                    h12.y(c5.F, dr0Var10, ze1VarC2);
                    h12.y(c5.E, dr0Var10, dx1VarL3);
                    yx yxVar3 = c5.G;
                    if (dr0Var10.S || !uz0.g(dr0Var10.K(), Integer.valueOf(iHashCode3))) {
                        wi0.o(iHashCode3, dr0Var10, iHashCode3, yxVar3);
                    }
                    h12.y(c5.D, dr0Var10, rg1VarU3);
                    nxVar2.c(sc2Var, dr0Var10, 6);
                    dr0Var10.p(true);
                }
                break;
            case 10:
                dr0 dr0Var11 = (dr0) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                if (!dr0Var11.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    dr0Var11.Q();
                } else {
                    ((nx) obj6).c((vr2) obj7, dr0Var11, 6);
                }
                break;
            case 11:
                dr0 dr0Var12 = (dr0) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                if (!dr0Var12.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    dr0Var12.Q();
                } else {
                    ((nx) obj6).c((nu2) obj7, dr0Var12, 6);
                }
                break;
            default:
                dr0 dr0Var13 = (dr0) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                if (!dr0Var13.N(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    dr0Var13.Q();
                } else {
                    sj1 sj1Var = (sj1) obj7;
                    Object objK5 = dr0Var13.K();
                    if (objK5 == yyVar) {
                        objK5 = new cb(sj1Var, (byte) 11);
                        dr0Var13.f0(objK5);
                    }
                    rg1 rg1VarV = tz0.v(og1Var, (vp0) objK5);
                    nx nxVar3 = (nx) obj6;
                    ze1 ze1VarC3 = ho.c(c5.i, false);
                    int iHashCode4 = Long.hashCode(dr0Var13.T);
                    dx1 dx1VarL4 = dr0Var13.l();
                    rg1 rg1VarU4 = ls.U(dr0Var13, rg1VarV);
                    sy.f.getClass();
                    dr0Var13.Y();
                    if (dr0Var13.S) {
                        dr0Var13.k(jw0Var);
                    } else {
                        dr0Var13.i0();
                    }
                    h12.y(c5.F, dr0Var13, ze1VarC3);
                    h12.y(c5.E, dr0Var13, dx1VarL4);
                    yx yxVar4 = c5.G;
                    if (dr0Var13.S || !uz0.g(dr0Var13.K(), Integer.valueOf(iHashCode4))) {
                        wi0.o(iHashCode4, dr0Var13, iHashCode4, yxVar4);
                    }
                    h12.y(c5.D, dr0Var13, rg1VarU4);
                    wi0.n(0, nxVar3, dr0Var13, true);
                }
                break;
        }
        return j23Var;
    }

    public /* synthetic */ rl(Object obj, Object obj2, byte b, boolean z) {
        this.h = b;
        this.j = obj;
        this.i = obj2;
    }
}
