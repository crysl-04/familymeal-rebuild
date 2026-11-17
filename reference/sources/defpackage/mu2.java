package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class mu2 implements zp0 {
    public final /* synthetic */ oz2 h;
    public final /* synthetic */ long i;
    public final /* synthetic */ xw2 j;
    public final /* synthetic */ nx k;

    public mu2(oz2 oz2Var, long j, xw2 xw2Var, nx nxVar) {
        this.h = oz2Var;
        this.i = j;
        this.j = xw2Var;
        this.k = nxVar;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        dr0 dr0Var = (dr0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            oz2 oz2Var = this.h;
            boolean zF = dr0Var.f(oz2Var);
            Object objK = dr0Var.K();
            if (zF || objK == zy.a) {
                objK = new ku2(oz2Var, (byte) 1);
                dr0Var.f0(objK);
            }
            rg1 rg1VarI0 = h7.i0(og1.h, (vp0) objK);
            ze1 ze1VarC = ho.c(c5.i, false);
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            rg1 rg1VarU = ls.U(dr0Var, rg1VarI0);
            sy.f.getClass();
            dr0Var.Y();
            if (dr0Var.S) {
                dr0Var.k(l41.W);
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
            y02.b(this.i, this.j, this.k, dr0Var, 0);
            dr0Var.p(true);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
