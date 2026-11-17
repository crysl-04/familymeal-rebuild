package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class yx2 extends wg1 {
    public final boolean h;
    public final ui1 i;
    public final boolean j;
    public final ba2 k;
    public final vp0 l;

    public yx2(boolean z, ui1 ui1Var, boolean z2, ba2 ba2Var, vp0 vp0Var) {
        this.h = z;
        this.i = ui1Var;
        this.j = z2;
        this.k = ba2Var;
        this.l = vp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yx2.class != obj.getClass()) {
            return false;
        }
        yx2 yx2Var = (yx2) obj;
        return this.h == yx2Var.h && uz0.g(this.i, yx2Var.i) && this.j == yx2Var.j && this.k.equals(yx2Var.k) && this.l == yx2Var.l;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        return new ay2(this.h, this.i, this.j, this.k, this.l);
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        ay2 ay2Var = (ay2) qg1Var;
        boolean z = ay2Var.T;
        boolean z2 = this.h;
        if (z != z2) {
            ay2Var.T = z2;
            y02.p(ay2Var);
        }
        ay2Var.U = this.l;
        ay2Var.T0(this.i, null, false, this.j, null, this.k, ay2Var.V);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.h) * 31;
        ui1 ui1Var = this.i;
        return this.l.hashCode() + jp1.b(this.k.a, jp1.c((((iHashCode + (ui1Var != null ? ui1Var.hashCode() : 0)) * 961) + 1237) * 31, 31, this.j), 31);
    }
}
