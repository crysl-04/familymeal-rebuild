package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class b03 extends wg1 {
    public final by2 h;
    public final ui1 i;
    public final aa2 j;
    public final boolean k;
    public final ba2 l;
    public final kp0 m;

    public b03(by2 by2Var, ui1 ui1Var, aa2 aa2Var, boolean z, ba2 ba2Var, kp0 kp0Var) {
        this.h = by2Var;
        this.i = ui1Var;
        this.j = aa2Var;
        this.k = z;
        this.l = ba2Var;
        this.m = kp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b03.class != obj.getClass()) {
            return false;
        }
        b03 b03Var = (b03) obj;
        return this.h == b03Var.h && uz0.g(this.i, b03Var.i) && uz0.g(this.j, b03Var.j) && this.k == b03Var.k && this.l.equals(b03Var.l) && this.m == b03Var.m;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        c03 c03Var = new c03(this.i, this.j, false, this.k, null, this.l, this.m);
        c03Var.T = this.h;
        return c03Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        c03 c03Var = (c03) qg1Var;
        by2 by2Var = c03Var.T;
        by2 by2Var2 = this.h;
        if (by2Var != by2Var2) {
            c03Var.T = by2Var2;
            y02.p(c03Var);
        }
        c03Var.T0(this.i, this.j, false, this.k, null, this.l, this.m);
    }

    public final int hashCode() {
        int iHashCode = this.h.hashCode() * 31;
        ui1 ui1Var = this.i;
        int iHashCode2 = (iHashCode + (ui1Var != null ? ui1Var.hashCode() : 0)) * 31;
        aa2 aa2Var = this.j;
        return this.m.hashCode() + jp1.b(this.l.a, jp1.c((((iHashCode2 + (aa2Var != null ? aa2Var.hashCode() : 0)) * 31) + 1237) * 31, 31, this.k), 31);
    }
}
