package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class kc<S> extends wg1 {
    public final lz2 h;
    public final sj1 i;
    public final oc j;

    public kc(lz2 lz2Var, sj1 sj1Var, oc ocVar) {
        this.h = lz2Var;
        this.i = sj1Var;
        this.j = ocVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kc)) {
            return false;
        }
        kc kcVar = (kc) obj;
        return uz0.g(kcVar.h, this.h) && kcVar.i.equals(this.i);
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        return new nc(this.h, this.i, this.j);
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        nc ncVar = (nc) qg1Var;
        ncVar.v = this.h;
        ncVar.w = this.i;
        ncVar.x = this.j;
    }

    public final int hashCode() {
        int iHashCode = this.j.hashCode() * 31;
        lz2 lz2Var = this.h;
        return this.i.hashCode() + ((iHashCode + (lz2Var != null ? lz2Var.hashCode() : 0)) * 31);
    }
}
