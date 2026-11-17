package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class oq1 extends wg1 {
    public final vp0 h;

    public oq1(vp0 vp0Var) {
        this.h = vp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oq1) {
            return this.h == ((oq1) obj).h;
        }
        return false;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        pq1 pq1Var = new pq1();
        pq1Var.v = this.h;
        pq1Var.w = -9223372034707292160L;
        return pq1Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        pq1 pq1Var = (pq1) qg1Var;
        pq1Var.v = this.h;
        pq1Var.w = -9223372034707292160L;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }
}
