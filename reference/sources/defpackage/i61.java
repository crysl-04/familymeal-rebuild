package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class i61 extends wg1 {
    public final m61 h;
    public final lo i;
    public final ks1 j;

    public i61(m61 m61Var, lo loVar, ks1 ks1Var) {
        this.h = m61Var;
        this.i = loVar;
        this.j = ks1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i61)) {
            return false;
        }
        i61 i61Var = (i61) obj;
        return uz0.g(this.h, i61Var.h) && uz0.g(this.i, i61Var.i) && this.j == i61Var.j;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        l61 l61Var = new l61();
        l61Var.v = this.h;
        l61Var.w = this.i;
        l61Var.x = this.j;
        return l61Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        l61 l61Var = (l61) qg1Var;
        l61Var.v = this.h;
        l61Var.w = this.i;
        l61Var.x = this.j;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((((this.i.hashCode() + (this.h.hashCode() * 31)) * 31) + 1237) * 31);
    }
}
