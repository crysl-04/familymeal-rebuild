package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class v4 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ nx i;

    public /* synthetic */ v4(nx nxVar, byte b) {
        this.h = b;
        this.i = nxVar;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        og1 og1Var = og1.h;
        j23 j23Var = j23.a;
        jw0 jw0Var = l41.W;
        nx nxVar = this.i;
        switch (b) {
            case 0:
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    rg1 rg1VarC = t03.F(og1Var, b5.b).c(new kt0(c5.u));
                    ze1 ze1VarC = ho.c(c5.i, false);
                    int iHashCode = Long.hashCode(dr0Var.T);
                    dx1 dx1VarL = dr0Var.l();
                    rg1 rg1VarU = ls.U(dr0Var, rg1VarC);
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
                    rg1 rg1VarC2 = t03.F(bw.a(), b5.c).c(new kt0(c5.u));
                    ze1 ze1VarC2 = ho.c(c5.i, false);
                    int iHashCode2 = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL2 = dr0Var2.l();
                    rg1 rg1VarU2 = ls.U(dr0Var2, rg1VarC2);
                    sy.f.getClass();
                    dr0Var2.Y();
                    if (dr0Var2.S) {
                        dr0Var2.k(jw0Var);
                    } else {
                        dr0Var2.i0();
                    }
                    h12.y(c5.F, dr0Var2, ze1VarC2);
                    h12.y(c5.E, dr0Var2, dx1VarL2);
                    yx yxVar2 = c5.G;
                    if (dr0Var2.S || !uz0.g(dr0Var2.K(), Integer.valueOf(iHashCode2))) {
                        wi0.o(iHashCode2, dr0Var2, iHashCode2, yxVar2);
                    }
                    h12.y(c5.D, dr0Var2, rg1VarU2);
                    wi0.n(0, nxVar, dr0Var2, true);
                }
                break;
            case 2:
                dr0 dr0Var3 = (dr0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!dr0Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dr0Var3.Q();
                } else {
                    aw awVarA = yv.a(uz0.g, c5.u, dr0Var3, 0);
                    int iHashCode3 = Long.hashCode(dr0Var3.T);
                    dx1 dx1VarL3 = dr0Var3.l();
                    rg1 rg1VarU3 = ls.U(dr0Var3, og1Var);
                    sy.f.getClass();
                    dr0Var3.Y();
                    if (dr0Var3.S) {
                        dr0Var3.k(jw0Var);
                    } else {
                        dr0Var3.i0();
                    }
                    h12.y(c5.F, dr0Var3, awVarA);
                    h12.y(c5.E, dr0Var3, dx1VarL3);
                    yx yxVar3 = c5.G;
                    if (dr0Var3.S || !uz0.g(dr0Var3.K(), Integer.valueOf(iHashCode3))) {
                        wi0.o(iHashCode3, dr0Var3, iHashCode3, yxVar3);
                    }
                    h12.y(c5.D, dr0Var3, rg1VarU3);
                    nxVar.c(bw.a, dr0Var3, 6);
                    dr0Var3.p(true);
                }
                break;
            case 3:
                dr0 dr0Var4 = (dr0) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!dr0Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    dr0Var4.Q();
                } else {
                    if (1.0f <= 0.0d) {
                        yw0.a("invalid weight; must be greater than zero");
                    }
                    b51 b51Var = new b51(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    ze1 ze1VarC3 = ho.c(c5.i, false);
                    int iHashCode4 = Long.hashCode(dr0Var4.T);
                    dx1 dx1VarL4 = dr0Var4.l();
                    rg1 rg1VarU4 = ls.U(dr0Var4, b51Var);
                    sy.f.getClass();
                    dr0Var4.Y();
                    if (dr0Var4.S) {
                        dr0Var4.k(jw0Var);
                    } else {
                        dr0Var4.i0();
                    }
                    h12.y(c5.F, dr0Var4, ze1VarC3);
                    h12.y(c5.E, dr0Var4, dx1VarL4);
                    yx yxVar4 = c5.G;
                    if (dr0Var4.S || !uz0.g(dr0Var4.K(), Integer.valueOf(iHashCode4))) {
                        wi0.o(iHashCode4, dr0Var4, iHashCode4, yxVar4);
                    }
                    h12.y(c5.D, dr0Var4, rg1VarU4);
                    wi0.n(0, nxVar, dr0Var4, true);
                }
                break;
            case 4:
                dr0 dr0Var5 = (dr0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (!dr0Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    dr0Var5.Q();
                } else {
                    ze1 ze1VarC4 = ho.c(c5.o, false);
                    int iHashCode5 = Long.hashCode(dr0Var5.T);
                    dx1 dx1VarL5 = dr0Var5.l();
                    rg1 rg1VarU5 = ls.U(dr0Var5, og1Var);
                    sy.f.getClass();
                    dr0Var5.Y();
                    if (dr0Var5.S) {
                        dr0Var5.k(jw0Var);
                    } else {
                        dr0Var5.i0();
                    }
                    h12.y(c5.F, dr0Var5, ze1VarC4);
                    h12.y(c5.E, dr0Var5, dx1VarL5);
                    yx yxVar5 = c5.G;
                    if (dr0Var5.S || !uz0.g(dr0Var5.K(), Integer.valueOf(iHashCode5))) {
                        wi0.o(iHashCode5, dr0Var5, iHashCode5, yxVar5);
                    }
                    h12.y(c5.D, dr0Var5, rg1VarU5);
                    wi0.n(0, nxVar, dr0Var5, true);
                }
                break;
            case 5:
                dr0 dr0Var6 = (dr0) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (!dr0Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    dr0Var6.Q();
                } else {
                    ze1 ze1VarC5 = ho.c(c5.i, false);
                    int iHashCode6 = Long.hashCode(dr0Var6.T);
                    dx1 dx1VarL6 = dr0Var6.l();
                    rg1 rg1VarU6 = ls.U(dr0Var6, og1Var);
                    sy.f.getClass();
                    dr0Var6.Y();
                    if (dr0Var6.S) {
                        dr0Var6.k(jw0Var);
                    } else {
                        dr0Var6.i0();
                    }
                    h12.y(c5.F, dr0Var6, ze1VarC5);
                    h12.y(c5.E, dr0Var6, dx1VarL6);
                    yx yxVar6 = c5.G;
                    if (dr0Var6.S || !uz0.g(dr0Var6.K(), Integer.valueOf(iHashCode6))) {
                        wi0.o(iHashCode6, dr0Var6, iHashCode6, yxVar6);
                    }
                    h12.y(c5.D, dr0Var6, rg1VarU6);
                    wi0.n(0, nxVar, dr0Var6, true);
                }
                break;
            case 6:
                dr0 dr0Var7 = (dr0) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (!dr0Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    dr0Var7.Q();
                } else {
                    ze1 ze1VarC6 = ho.c(c5.i, false);
                    int iHashCode7 = Long.hashCode(dr0Var7.T);
                    dx1 dx1VarL7 = dr0Var7.l();
                    rg1 rg1VarU7 = ls.U(dr0Var7, og1Var);
                    sy.f.getClass();
                    dr0Var7.Y();
                    if (dr0Var7.S) {
                        dr0Var7.k(jw0Var);
                    } else {
                        dr0Var7.i0();
                    }
                    h12.y(c5.F, dr0Var7, ze1VarC6);
                    h12.y(c5.E, dr0Var7, dx1VarL7);
                    yx yxVar7 = c5.G;
                    if (dr0Var7.S || !uz0.g(dr0Var7.K(), Integer.valueOf(iHashCode7))) {
                        wi0.o(iHashCode7, dr0Var7, iHashCode7, yxVar7);
                    }
                    h12.y(c5.D, dr0Var7, rg1VarU7);
                    wi0.n(0, nxVar, dr0Var7, true);
                }
                break;
            case 7:
                dr0 dr0Var8 = (dr0) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (!dr0Var8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    dr0Var8.Q();
                } else {
                    ze1 ze1VarC7 = ho.c(c5.i, false);
                    int iHashCode8 = Long.hashCode(dr0Var8.T);
                    dx1 dx1VarL8 = dr0Var8.l();
                    rg1 rg1VarU8 = ls.U(dr0Var8, og1Var);
                    sy.f.getClass();
                    dr0Var8.Y();
                    if (dr0Var8.S) {
                        dr0Var8.k(jw0Var);
                    } else {
                        dr0Var8.i0();
                    }
                    h12.y(c5.F, dr0Var8, ze1VarC7);
                    h12.y(c5.E, dr0Var8, dx1VarL8);
                    yx yxVar8 = c5.G;
                    if (dr0Var8.S || !uz0.g(dr0Var8.K(), Integer.valueOf(iHashCode8))) {
                        wi0.o(iHashCode8, dr0Var8, iHashCode8, yxVar8);
                    }
                    h12.y(c5.D, dr0Var8, rg1VarU8);
                    wi0.n(0, nxVar, dr0Var8, true);
                }
                break;
            default:
                dr0 dr0Var9 = (dr0) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (!dr0Var9.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    dr0Var9.Q();
                } else {
                    ze1 ze1VarC8 = ho.c(c5.i, false);
                    int iHashCode9 = Long.hashCode(dr0Var9.T);
                    dx1 dx1VarL9 = dr0Var9.l();
                    rg1 rg1VarU9 = ls.U(dr0Var9, og1Var);
                    sy.f.getClass();
                    dr0Var9.Y();
                    if (dr0Var9.S) {
                        dr0Var9.k(jw0Var);
                    } else {
                        dr0Var9.i0();
                    }
                    h12.y(c5.F, dr0Var9, ze1VarC8);
                    h12.y(c5.E, dr0Var9, dx1VarL9);
                    yx yxVar9 = c5.G;
                    if (dr0Var9.S || !uz0.g(dr0Var9.K(), Integer.valueOf(iHashCode9))) {
                        wi0.o(iHashCode9, dr0Var9, iHashCode9, yxVar9);
                    }
                    h12.y(c5.D, dr0Var9, rg1VarU9);
                    wi0.n(0, nxVar, dr0Var9, true);
                }
                break;
        }
        return j23Var;
    }
}
