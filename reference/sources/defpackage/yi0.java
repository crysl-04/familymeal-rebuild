package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class yi0 extends wg1 {
    public final ra0 h;

    public yi0(ra0 ra0Var) {
        this.h = ra0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yi0) {
            return this.h == ((yi0) obj).h;
        }
        return false;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        hj0 hj0Var = new hj0();
        hj0Var.v = this.h;
        hj0Var.w = 1.0f;
        return hj0Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        hj0 hj0Var = (hj0) qg1Var;
        hj0Var.v = this.h;
        hj0Var.w = 1.0f;
    }

    public final int hashCode() {
        return (this.h.hashCode() * 31) + 1065353216;
    }
}
