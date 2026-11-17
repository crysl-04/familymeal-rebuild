package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class n00 extends wg1 {
    public final vp0 h;

    public n00(vp0 vp0Var) {
        this.h = vp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n00) && ((n00) obj).h == this.h;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        o00 o00Var = new o00();
        o00Var.x = this.h;
        return o00Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        o00 o00Var = (o00) qg1Var;
        vp0 vp0Var = o00Var.x;
        vp0 vp0Var2 = this.h;
        if (vp0Var2 != vp0Var) {
            o00Var.x = vp0Var2;
            o00Var.K0();
        }
    }

    public final int hashCode() {
        return this.h.hashCode();
    }
}
