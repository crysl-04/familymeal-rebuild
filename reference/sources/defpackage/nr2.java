package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nr2 implements zp0 {
    public final /* synthetic */ rg1 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ aa2 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ kp0 l;
    public final /* synthetic */ nx m;

    public nr2(rg1 rg1Var, boolean z, aa2 aa2Var, boolean z2, kp0 kp0Var, nx nxVar) {
        this.h = rg1Var;
        this.i = z;
        this.j = aa2Var;
        this.k = z2;
        this.l = kp0Var;
        this.m = nxVar;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        dr0 dr0Var = (dr0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            rg1 rg1VarC = ia2.t(this.h, this.i, null, this.j, this.k, new ba2(4), this.l).c(yj2.a);
            aw awVarA = yv.a(uz0.h, c5.v, dr0Var, 54);
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            rg1 rg1VarU = ls.U(dr0Var, rg1VarC);
            sy.f.getClass();
            dr0Var.Y();
            if (dr0Var.S) {
                dr0Var.k(l41.W);
            } else {
                dr0Var.i0();
            }
            h12.y(c5.F, dr0Var, awVarA);
            h12.y(c5.E, dr0Var, dx1VarL);
            yx yxVar = c5.G;
            if (dr0Var.S || !uz0.g(dr0Var.K(), Integer.valueOf(iHashCode))) {
                wi0.o(iHashCode, dr0Var, iHashCode, yxVar);
            }
            h12.y(c5.D, dr0Var, rg1VarU);
            this.m.c(bw.a, dr0Var, 6);
            dr0Var.p(true);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
