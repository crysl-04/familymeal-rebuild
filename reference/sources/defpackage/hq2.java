package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hq2 implements zp0 {
    public final /* synthetic */ rg1 h;
    public final /* synthetic */ hi2 i;
    public final /* synthetic */ long j;
    public final /* synthetic */ float k;
    public final /* synthetic */ zn l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ ui1 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ kp0 p;
    public final /* synthetic */ float q;
    public final /* synthetic */ nx r;

    public hq2(rg1 rg1Var, hi2 hi2Var, long j, float f, zn znVar, boolean z, ui1 ui1Var, boolean z2, kp0 kp0Var, float f2, nx nxVar) {
        this.h = rg1Var;
        this.i = hi2Var;
        this.j = j;
        this.k = f;
        this.l = znVar;
        this.m = z;
        this.n = ui1Var;
        this.o = z2;
        this.p = kp0Var;
        this.q = f2;
        this.r = nxVar;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        dr0 dr0Var = (dr0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            mt0 mt0Var = kz0.a;
            rg1 rg1VarM = lt.m(ia2.t(iq2.d(this.h.c(hg1.h), this.i, iq2.e(this.j, this.k, dr0Var), this.l, ((e90) dr0Var.j(uz.h)).A(this.q)), this.m, this.n, y92.a(0.0f, 7, 0L, false), this.o, null, this.p));
            ze1 ze1VarC = ho.c(c5.i, true);
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            rg1 rg1VarU = ls.U(dr0Var, rg1VarM);
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
            wi0.n(0, this.r, dr0Var, true);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
