package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class x31 extends wg1 {
    public final String h;

    public x31(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof x31) && this.h.equals(((x31) obj).h);
        }
        return true;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        y31 y31Var = new y31();
        y31Var.v = this.h;
        return y31Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        ((y31) qg1Var).v = this.h;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.h) + ")";
    }
}
