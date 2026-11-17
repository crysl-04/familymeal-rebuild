package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class my2 implements zp0 {
    public final /* synthetic */ float h;
    public final /* synthetic */ long i;
    public final /* synthetic */ nx j;

    public my2(float f, long j, nx nxVar) {
        this.h = f;
        this.i = j;
        this.j = nxVar;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        dr0 dr0Var = (dr0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            rt1 rt1Var = ny2.a;
            rg1 rg1VarF = t03.F(yj2.l(og1.h, 40.0f, 24.0f, this.h, 8), ny2.a);
            ze1 ze1VarC = ho.c(c5.i, false);
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            rg1 rg1VarU = ls.U(dr0Var, rg1VarF);
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
            ys.b(new i42[]{s00.a.a(new kv(this.i)), gw2.a.a(e13.a(s60.v0, dr0Var))}, this.j, dr0Var, 8);
            dr0Var.p(true);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
