package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wr2 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ nx i;
    public final /* synthetic */ nx j;
    public final /* synthetic */ nx k;

    public /* synthetic */ wr2(nx nxVar, nx nxVar2, nx nxVar3, byte b) {
        this.h = b;
        this.i = nxVar;
        this.j = nxVar2;
        this.k = nxVar3;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:33:0x0101  */
    /* JADX WARN: Code duplicated, block: B:38:0x011c  */
    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        int i;
        int iHashCode;
        int iHashCode2;
        byte b = this.h;
        j23 j23Var = j23.a;
        jw0 jw0Var = l41.W;
        nx nxVar = this.k;
        nx nxVar2 = this.j;
        nx nxVar3 = this.i;
        switch (b) {
            case 0:
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    zm2 zm2VarA0 = ls.a0(gh1.h, dr0Var);
                    Object objK = dr0Var.K();
                    yy yyVar = zy.a;
                    if (objK == yyVar) {
                        objK = new vr2(zm2VarA0);
                        dr0Var.f0(objK);
                    }
                    vr2 vr2Var = (vr2) objK;
                    yi0 yi0Var = yj2.a;
                    List listQ = lt.Q(nxVar3, nxVar2, dt.N(-1333331860, new rl(nxVar, vr2Var, (byte) 10, false), dr0Var));
                    Object objK2 = dr0Var.K();
                    if (objK2 == yyVar) {
                        objK2 = new ur2(vr2Var);
                        dr0Var.f0(objK2);
                    }
                    qh1 qh1Var = (qh1) objK2;
                    nx nxVar4 = new nx(1271844412, true, new hw0(listQ, (byte) 1));
                    Object objK3 = dr0Var.K();
                    if (objK3 == yyVar) {
                        objK3 = new rh1(qh1Var);
                        dr0Var.f0(objK3);
                    }
                    ze1 ze1Var = (ze1) objK3;
                    int iHashCode3 = Long.hashCode(dr0Var.T);
                    dx1 dx1VarL = dr0Var.l();
                    rg1 rg1VarU = ls.U(dr0Var, yi0Var);
                    sy.f.getClass();
                    dr0Var.Y();
                    if (dr0Var.S) {
                        dr0Var.k(jw0Var);
                    } else {
                        dr0Var.i0();
                    }
                    h12.y(c5.F, dr0Var, ze1Var);
                    h12.y(c5.E, dr0Var, dx1VarL);
                    yx yxVar = c5.G;
                    if (dr0Var.S || !uz0.g(dr0Var.K(), Integer.valueOf(iHashCode3))) {
                        wi0.o(iHashCode3, dr0Var, iHashCode3, yxVar);
                    }
                    h12.y(c5.D, dr0Var, rg1VarU);
                    wi0.n(0, nxVar4, dr0Var, true);
                }
                break;
            default:
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dr0Var2.Q();
                } else {
                    aw awVarA = yv.a(uz0.j, c5.u, dr0Var2, 6);
                    int iHashCode4 = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL2 = dr0Var2.l();
                    rg1 rg1VarU2 = ls.U(dr0Var2, og1.h);
                    sy.f.getClass();
                    dr0Var2.Y();
                    if (dr0Var2.S) {
                        dr0Var2.k(jw0Var);
                    } else {
                        dr0Var2.i0();
                    }
                    yx yxVar2 = c5.F;
                    h12.y(yxVar2, dr0Var2, awVarA);
                    yx yxVar3 = c5.E;
                    h12.y(yxVar3, dr0Var2, dx1VarL2);
                    yx yxVar4 = c5.G;
                    if (!dr0Var2.S) {
                        i = 6;
                        if (!uz0.g(dr0Var2.K(), Integer.valueOf(iHashCode4))) {
                        }
                        yx yxVar5 = c5.D;
                        h12.y(yxVar5, dr0Var2, rg1VarU2);
                        rg1 rg1VarA = bw.a();
                        dm dmVar = c5.i;
                        ze1 ze1VarC = ho.c(dmVar, false);
                        iHashCode = Long.hashCode(dr0Var2.T);
                        dx1 dx1VarL3 = dr0Var2.l();
                        rg1 rg1VarU3 = ls.U(dr0Var2, rg1VarA);
                        dr0Var2.Y();
                        if (dr0Var2.S) {
                            dr0Var2.k(jw0Var);
                        } else {
                            dr0Var2.i0();
                        }
                        h12.y(yxVar2, dr0Var2, ze1VarC);
                        h12.y(yxVar3, dr0Var2, dx1VarL3);
                        if (dr0Var2.S || !uz0.g(dr0Var2.K(), Integer.valueOf(iHashCode))) {
                            wi0.o(iHashCode, dr0Var2, iHashCode, yxVar4);
                        }
                        h12.y(yxVar5, dr0Var2, rg1VarU3);
                        nxVar3.c(bw.a, dr0Var2, Integer.valueOf(i));
                        dr0Var2.p(true);
                        rg1 rg1VarF = t03.F(new kt0(c5.w), x40.a);
                        ze1 ze1VarC2 = ho.c(dmVar, false);
                        iHashCode2 = Long.hashCode(dr0Var2.T);
                        dx1 dx1VarL4 = dr0Var2.l();
                        rg1 rg1VarU4 = ls.U(dr0Var2, rg1VarF);
                        dr0Var2.Y();
                        if (dr0Var2.S) {
                            dr0Var2.k(jw0Var);
                        } else {
                            dr0Var2.i0();
                        }
                        h12.y(yxVar2, dr0Var2, ze1VarC2);
                        h12.y(yxVar3, dr0Var2, dx1VarL4);
                        if (dr0Var2.S || !uz0.g(dr0Var2.K(), Integer.valueOf(iHashCode2))) {
                            wi0.o(iHashCode2, dr0Var2, iHashCode2, yxVar4);
                        }
                        h12.y(yxVar5, dr0Var2, rg1VarU4);
                        h12.a(rv.d(s60.m, dr0Var2), e13.a(s60.n, dr0Var2), dt.N(-1103927529, new z4(nxVar2, nxVar, (byte) 3), dr0Var2), dr0Var2, 384);
                        dr0Var2.p(true);
                        dr0Var2.p(true);
                    } else {
                        i = 6;
                    }
                    wi0.o(iHashCode4, dr0Var2, iHashCode4, yxVar4);
                    yx yxVar6 = c5.D;
                    h12.y(yxVar6, dr0Var2, rg1VarU2);
                    rg1 rg1VarA2 = bw.a();
                    dm dmVar2 = c5.i;
                    ze1 ze1VarC3 = ho.c(dmVar2, false);
                    iHashCode = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL5 = dr0Var2.l();
                    rg1 rg1VarU5 = ls.U(dr0Var2, rg1VarA2);
                    dr0Var2.Y();
                    if (dr0Var2.S) {
                        dr0Var2.k(jw0Var);
                    } else {
                        dr0Var2.i0();
                    }
                    h12.y(yxVar2, dr0Var2, ze1VarC3);
                    h12.y(yxVar3, dr0Var2, dx1VarL5);
                    if (dr0Var2.S) {
                        wi0.o(iHashCode, dr0Var2, iHashCode, yxVar4);
                    } else {
                        wi0.o(iHashCode, dr0Var2, iHashCode, yxVar4);
                    }
                    h12.y(yxVar6, dr0Var2, rg1VarU5);
                    nxVar3.c(bw.a, dr0Var2, Integer.valueOf(i));
                    dr0Var2.p(true);
                    rg1 rg1VarF2 = t03.F(new kt0(c5.w), x40.a);
                    ze1 ze1VarC4 = ho.c(dmVar2, false);
                    iHashCode2 = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL6 = dr0Var2.l();
                    rg1 rg1VarU6 = ls.U(dr0Var2, rg1VarF2);
                    dr0Var2.Y();
                    if (dr0Var2.S) {
                        dr0Var2.k(jw0Var);
                    } else {
                        dr0Var2.i0();
                    }
                    h12.y(yxVar2, dr0Var2, ze1VarC4);
                    h12.y(yxVar3, dr0Var2, dx1VarL6);
                    if (dr0Var2.S) {
                        wi0.o(iHashCode2, dr0Var2, iHashCode2, yxVar4);
                    } else {
                        wi0.o(iHashCode2, dr0Var2, iHashCode2, yxVar4);
                    }
                    h12.y(yxVar6, dr0Var2, rg1VarU6);
                    h12.a(rv.d(s60.m, dr0Var2), e13.a(s60.n, dr0Var2), dt.N(-1103927529, new z4(nxVar2, nxVar, (byte) 3), dr0Var2), dr0Var2, 384);
                    dr0Var2.p(true);
                    dr0Var2.p(true);
                }
                break;
        }
        return j23Var;
    }
}
