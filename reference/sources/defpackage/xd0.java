package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class xd0 extends wg1 {
    public final vp0 h;

    public xd0(vp0 vp0Var) {
        this.h = vp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xd0) {
            return this.h == ((xd0) obj).h;
        }
        return false;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        yd0 yd0Var = new yd0();
        yd0Var.v = this.h;
        return yd0Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        ((yd0) qg1Var).v = this.h;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }
}
