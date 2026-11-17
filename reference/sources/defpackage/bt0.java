package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class bt0 extends wg1 {
    public final xw2 h;
    public final boolean i;
    public final int j;

    /* JADX WARN: Multi-variable type inference failed */
    public bt0(xw2 xw2Var, int i, int i2) {
        this.h = xw2Var;
        this.i = i;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt0)) {
            return false;
        }
        bt0 bt0Var = (bt0) obj;
        return uz0.g(this.h, bt0Var.h) && this.i == bt0Var.i && this.j == bt0Var.j;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        dt0 dt0Var = new dt0();
        dt0Var.v = this.h;
        dt0Var.w = this.i;
        dt0Var.x = this.j;
        dt0Var.z = -1;
        dt0Var.A = -1;
        return dt0Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        dt0 dt0Var = (dt0) qg1Var;
        xw2 xw2Var = dt0Var.v;
        xw2 xw2Var2 = this.h;
        boolean zG = uz0.g(xw2Var, xw2Var2);
        boolean z = this.i;
        int i = this.j;
        if (zG && dt0Var.w == z && dt0Var.x == i) {
            return;
        }
        dt0Var.v = xw2Var2;
        dt0Var.w = z;
        dt0Var.x = i;
        dt0Var.B = p02.H(xw2Var2, cu.Y(dt0Var).F);
        dt0Var.y = true;
        vs.E(dt0Var);
    }

    public final int hashCode() {
        return (((this.h.hashCode() * 31) + (this.i ? 1 : 0)) * 31) + this.j;
    }
}
