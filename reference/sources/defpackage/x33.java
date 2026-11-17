package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class x33 extends wg1 {
    public final qz2 h;
    public final lz2 i;
    public final ah0 j;
    public final wh0 k;
    public final si2 l;

    public x33(qz2 qz2Var, lz2 lz2Var, ah0 ah0Var, wh0 wh0Var, si2 si2Var) {
        this.h = qz2Var;
        this.i = lz2Var;
        this.j = ah0Var;
        this.k = wh0Var;
        this.l = si2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x33) {
            x33 x33Var = (x33) obj;
            return this.h == x33Var.h && uz0.g(this.i, x33Var.i) && this.j.equals(x33Var.j) && uz0.g(this.k, x33Var.k) && this.l == x33Var.l;
        }
        return false;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        z33 z33Var = new z33();
        z33Var.v = this.i;
        z33Var.w = this.j;
        z33Var.x = this.k;
        z33Var.y = this.l;
        return z33Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        z33 z33Var = (z33) qg1Var;
        z33Var.getClass();
        z33Var.v = this.i;
        z33Var.w = this.j;
        z33Var.x = this.k;
        z33Var.y = this.l;
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.a.hashCode() + ((this.j.a.hashCode() + ((this.i.hashCode() + (this.h.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VeilModifierElement(transition=" + this.h + ", veilAnimation=" + this.i + ", enter=" + this.j + ", exit=" + this.k + ", mutableTransformState=" + this.l + ")";
    }
}
