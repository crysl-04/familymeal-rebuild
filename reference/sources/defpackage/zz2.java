package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class zz2 extends wg1 {
    public final d71 h;

    public zz2(d71 d71Var) {
        this.h = d71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zz2) && uz0.g(this.h, ((zz2) obj).h);
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        a03 a03Var = new a03();
        a03Var.v = this.h;
        return a03Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        ((a03) qg1Var).v = this.h;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.h + ")";
    }
}
