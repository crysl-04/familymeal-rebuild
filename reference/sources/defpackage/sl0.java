package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class sl0 extends wg1 {
    public final vp0 h;

    public sl0(vp0 vp0Var) {
        this.h = vp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sl0) {
            return this.h == ((sl0) obj).h;
        }
        return false;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        tl0 tl0Var = new tl0();
        tl0Var.v = this.h;
        return tl0Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        ((tl0) qg1Var).v = this.h;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }
}
