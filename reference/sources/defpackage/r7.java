package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r7 implements zp0 {
    public final /* synthetic */ byte h = 1;
    public final /* synthetic */ long i;
    public final /* synthetic */ Object j;

    public /* synthetic */ r7(long j, nx nxVar, int i) {
        this.i = j;
        this.j = nxVar;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        Object obj3 = this.j;
        long j = this.i;
        switch (b) {
            case 0:
                rg1 rg1Var = (rg1) obj3;
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else if (j == 9205357640488583168L) {
                    dr0Var.V(-1243644858);
                    w7.b(rg1Var, dr0Var, 0, 0);
                    dr0Var.p(false);
                } else {
                    dr0Var.V(-1244013944);
                    rg1 rg1VarG = yj2.g(rg1Var, fc0.b(j), fc0.a(j), 0.0f, 0.0f, 12);
                    ze1 ze1VarC = ho.c(c5.j, false);
                    int iHashCode = Long.hashCode(dr0Var.T);
                    dx1 dx1VarL = dr0Var.l();
                    rg1 rg1VarU = ls.U(dr0Var, rg1VarG);
                    sy.f.getClass();
                    dr0Var.Y();
                    if (dr0Var.S) {
                        dr0Var.k(l41.W);
                    } else {
                        dr0Var.i0();
                    }
                    h12.y(c5.F, dr0Var, ze1VarC);
                    h12.y(c5.E, dr0Var, dx1VarL);
                    h12.y(c5.G, dr0Var, Integer.valueOf(iHashCode));
                    h12.t(dr0Var);
                    h12.y(c5.D, dr0Var, rg1VarU);
                    w7.b(null, dr0Var, 0, 1);
                    dr0Var.p(true);
                    dr0Var.p(false);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                y02.c(j, (nx) obj3, (dr0) obj, m02.A(1));
                break;
        }
        return j23Var;
    }

    public /* synthetic */ r7(long j, rg1 rg1Var) {
        this.i = j;
        this.j = rg1Var;
    }
}
