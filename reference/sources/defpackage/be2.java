package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class be2 extends wg1 {
    public final av2 h;
    public final ks1 i;
    public final boolean j;
    public final boolean k;
    public final ui1 l;

    public be2(av2 av2Var, ks1 ks1Var, boolean z, boolean z2, ui1 ui1Var) {
        this.h = av2Var;
        this.i = ks1Var;
        this.j = z;
        this.k = z2;
        this.l = ui1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be2)) {
            return false;
        }
        be2 be2Var = (be2) obj;
        return uz0.g(this.h, be2Var.h) && this.i == be2Var.i && this.j == be2Var.j && this.k == be2Var.k && uz0.g(this.l, be2Var.l);
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        return new je2(null, null, this.l, this.i, this.h, null, this.j, this.k);
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        ((je2) qg1Var).c1(null, null, this.l, this.i, this.h, null, this.j, this.k);
    }

    public final int hashCode() {
        int iC = jp1.c(jp1.c((this.i.hashCode() + (this.h.hashCode() * 31)) * 961, 31, this.j), 961, this.k);
        ui1 ui1Var = this.l;
        return (iC + (ui1Var != null ? ui1Var.hashCode() : 0)) * 31;
    }
}
