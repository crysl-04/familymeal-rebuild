package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qd1 implements o12 {
    public final g2 h;
    public vy0 i;
    public u31 j;
    public vy0 k;
    public ny0 l;

    public qd1(g2 g2Var) {
        this.h = g2Var;
    }

    @Override // defpackage.o12
    public final long f(ry0 ry0Var, long j, u31 u31Var, long j2) {
        ny0 ny0Var = this.l;
        if (ny0Var != null) {
            vy0 vy0Var = this.i;
            if ((vy0Var == null ? false : vy0.a(vy0Var.a, j)) && this.j == u31Var) {
                vy0 vy0Var2 = this.k;
                if (vy0Var2 != null ? vy0.a(vy0Var2.a, j2) : false) {
                    return ny0Var.a;
                }
            }
        }
        long jF = this.h.f(ry0Var, j, u31Var, j2);
        this.i = new vy0(j);
        this.j = u31Var;
        this.k = new vy0(j2);
        this.l = new ny0(jF);
        return jF;
    }
}
