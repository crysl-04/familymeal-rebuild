package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class db0 extends wg1 {
    public final p61 h;

    public db0(p61 p61Var) {
        this.h = p61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof db0) && uz0.g(this.h, ((db0) obj).h);
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        eb0 eb0Var = new eb0();
        eb0Var.v = this.h;
        return eb0Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        eb0 eb0Var = (eb0) qg1Var;
        p61 p61Var = eb0Var.v;
        p61 p61Var2 = this.h;
        if (uz0.g(p61Var, p61Var2) || !eb0Var.h.u) {
            return;
        }
        p61 p61Var3 = eb0Var.v;
        p61Var3.d();
        p61Var3.b = null;
        p61Var2.getClass();
        eb0Var.v = p61Var2;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.h + ")";
    }
}
