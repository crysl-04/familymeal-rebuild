package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class lq1 extends wg1 {
    public final vp0 h;

    public lq1(vp0 vp0Var) {
        this.h = vp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lq1) {
            return this.h == ((lq1) obj).h;
        }
        return false;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        mq1 mq1Var = new mq1();
        mq1Var.v = this.h;
        return mq1Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        ((mq1) qg1Var).v = this.h;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }
}
