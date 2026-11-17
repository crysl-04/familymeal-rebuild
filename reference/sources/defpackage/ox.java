package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ox implements aq0 {
    public static final ox i = new ox();
    public final /* synthetic */ byte h;

    public /* synthetic */ ox() {
        this.h = (byte) 0;
    }

    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        byte b = this.h;
        jw0 jw0Var = l41.W;
        og1 og1Var = og1.h;
        yy yyVar = zy.a;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                dr0 dr0Var = (dr0) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dr0Var.Q();
                }
                break;
            case 1:
                dr0 dr0Var2 = (dr0) obj2;
                ((Number) obj3).intValue();
                rt1 rt1Var = wt.a;
                dr0Var2.V(1575618259);
                dr0Var2.p(false);
                Object objK = dr0Var2.K();
                if (objK == yyVar) {
                    objK = rz1.x(null);
                    dr0Var2.f0(objK);
                }
                sj1 sj1Var = (sj1) objK;
                ze1 ze1VarC = ho.c(c5.m, false);
                int iB = lt.B(dr0Var2);
                dx1 dx1VarL = dr0Var2.l();
                rg1 rg1VarU = ls.U(dr0Var2, og1Var);
                sy.f.getClass();
                dr0Var2.Y();
                if (dr0Var2.S) {
                    dr0Var2.k(jw0Var);
                } else {
                    dr0Var2.i0();
                }
                h12.y(c5.F, dr0Var2, ze1VarC);
                h12.y(c5.E, dr0Var2, dx1VarL);
                yx yxVar = c5.G;
                if (dr0Var2.S || !uz0.g(dr0Var2.K(), Integer.valueOf(iB))) {
                    wi0.o(iB, dr0Var2, iB, yxVar);
                }
                h12.y(c5.D, dr0Var2, rg1VarU);
                zp0 zp0Var = (zp0) sj1Var.getValue();
                if (zp0Var == null) {
                    dr0Var2.V(-1538103400);
                } else {
                    dr0Var2.V(-326710903);
                    zp0Var.f(dr0Var2, 0);
                }
                dr0Var2.p(false);
                dr0Var2.p(true);
                break;
            default:
                dr0 dr0Var3 = (dr0) obj2;
                ((Number) obj3).intValue();
                rt1 rt1Var2 = wt.a;
                dr0Var3.V(-1218863531);
                dr0Var3.p(false);
                Object objK2 = dr0Var3.K();
                if (objK2 == yyVar) {
                    objK2 = rz1.x(null);
                    dr0Var3.f0(objK2);
                }
                sj1 sj1Var2 = (sj1) objK2;
                ze1 ze1VarC2 = ho.c(c5.m, false);
                int iB2 = lt.B(dr0Var3);
                dx1 dx1VarL2 = dr0Var3.l();
                rg1 rg1VarU2 = ls.U(dr0Var3, og1Var);
                sy.f.getClass();
                dr0Var3.Y();
                if (dr0Var3.S) {
                    dr0Var3.k(jw0Var);
                } else {
                    dr0Var3.i0();
                }
                h12.y(c5.F, dr0Var3, ze1VarC2);
                h12.y(c5.E, dr0Var3, dx1VarL2);
                yx yxVar2 = c5.G;
                if (dr0Var3.S || !uz0.g(dr0Var3.K(), Integer.valueOf(iB2))) {
                    wi0.o(iB2, dr0Var3, iB2, yxVar2);
                }
                h12.y(c5.D, dr0Var3, rg1VarU2);
                zp0 zp0Var2 = (zp0) sj1Var2.getValue();
                if (zp0Var2 == null) {
                    dr0Var3.V(-2101783313);
                } else {
                    dr0Var3.V(-344894126);
                    zp0Var2.f(dr0Var3, 0);
                }
                dr0Var3.p(false);
                dr0Var3.p(true);
                break;
        }
        return j23Var;
    }
}
