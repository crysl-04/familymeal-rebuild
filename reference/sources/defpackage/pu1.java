package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class pu1 extends wg1 {
    public final iu1 h;

    public pu1(iu1 iu1Var) {
        this.h = iu1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof pu1) && uz0.g(this.h, ((pu1) obj).h);
        }
        return true;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        qu1 qu1Var = new qu1();
        qu1Var.v = 1.0f;
        qu1Var.w = this.h;
        return qu1Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        qu1 qu1Var = (qu1) qg1Var;
        qu1Var.v = 1.0f;
        qu1Var.w = this.h;
    }

    public final int hashCode() {
        iu1 iu1Var = this.h;
        return ((iu1Var != null ? iu1Var.hashCode() : 0) * 961) + 1065353216;
    }
}
