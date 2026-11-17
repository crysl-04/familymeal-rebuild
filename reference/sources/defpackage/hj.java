package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class hj extends wg1 {
    public final long h;
    public final hi2 i;

    public hj(long j, hi2 hi2Var) {
        this.h = j;
        this.i = hi2Var;
    }

    public final boolean equals(Object obj) {
        hj hjVar = obj instanceof hj ? (hj) obj : null;
        if (hjVar == null) {
            return false;
        }
        long j = hjVar.h;
        int i = kv.h;
        return r13.a(this.h, j) && uz0.g(this.i, hjVar.i);
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        ij ijVar = new ij();
        ijVar.v = this.h;
        ijVar.w = this.i;
        ijVar.x = 9205357640488583168L;
        return ijVar;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        ij ijVar = (ij) qg1Var;
        ijVar.v = this.h;
        hi2 hi2Var = ijVar.w;
        hi2 hi2Var2 = this.i;
        if (!uz0.g(hi2Var, hi2Var2)) {
            ijVar.w = hi2Var2;
            y02.p(ijVar);
        }
        dt.H(ijVar);
    }

    public final int hashCode() {
        int i = kv.h;
        return this.i.hashCode() + (((Long.hashCode(this.h) * 961) + 1065353216) * 31);
    }
}
