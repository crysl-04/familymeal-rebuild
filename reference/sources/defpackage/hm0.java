package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class hm0 extends wg1 {
    public final gm0 h;

    public hm0(gm0 gm0Var) {
        this.h = gm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hm0) && uz0.g(this.h, ((hm0) obj).h);
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        jm0 jm0Var = new jm0();
        jm0Var.v = this.h;
        return jm0Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        jm0 jm0Var = (jm0) qg1Var;
        jm0Var.v.a.j(jm0Var);
        gm0 gm0Var = this.h;
        jm0Var.v = gm0Var;
        gm0Var.a.b(jm0Var);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.h + ")";
    }
}
