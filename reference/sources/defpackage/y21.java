package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class y21 extends wg1 {
    public final vp0 h;
    public final vp0 i;

    public y21(vp0 vp0Var, vp0 vp0Var2) {
        this.h = vp0Var;
        this.i = vp0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y21)) {
            return false;
        }
        y21 y21Var = (y21) obj;
        return this.h == y21Var.h && this.i == y21Var.i;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        a31 a31Var = new a31();
        a31Var.v = this.h;
        a31Var.w = this.i;
        return a31Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        a31 a31Var = (a31) qg1Var;
        a31Var.v = this.h;
        a31Var.w = this.i;
    }

    public final int hashCode() {
        vp0 vp0Var = this.h;
        int iHashCode = (vp0Var != null ? vp0Var.hashCode() : 0) * 31;
        vp0 vp0Var2 = this.i;
        return iHashCode + (vp0Var2 != null ? vp0Var2.hashCode() : 0);
    }
}
