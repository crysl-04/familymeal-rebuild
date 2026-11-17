package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class qt1 extends wg1 {
    public final pt1 h;

    public qt1(pt1 pt1Var) {
        this.h = pt1Var;
    }

    public final boolean equals(Object obj) {
        qt1 qt1Var = obj instanceof qt1 ? (qt1) obj : null;
        if (qt1Var == null) {
            return false;
        }
        return uz0.g(this.h, qt1Var.h);
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        st1 st1Var = new st1();
        st1Var.v = this.h;
        return st1Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        ((st1) qg1Var).v = this.h;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }
}
