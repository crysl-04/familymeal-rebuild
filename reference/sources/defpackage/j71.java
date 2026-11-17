package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class j71 extends wg1 {
    public final p21 h;
    public final h71 i;
    public final ks1 j;
    public final boolean k;

    public j71(p21 p21Var, h71 h71Var, ks1 ks1Var, boolean z) {
        this.h = p21Var;
        this.i = h71Var;
        this.j = ks1Var;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j71)) {
            return false;
        }
        j71 j71Var = (j71) obj;
        return this.h == j71Var.h && uz0.g(this.i, j71Var.i) && this.j == j71Var.j && this.k == j71Var.k;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        return new m71(this.h, this.i, this.j, this.k);
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        m71 m71Var = (m71) qg1Var;
        m71Var.v = this.h;
        m71Var.w = this.i;
        ks1 ks1Var = m71Var.x;
        ks1 ks1Var2 = this.j;
        if (ks1Var != ks1Var2) {
            m71Var.x = ks1Var2;
            y02.p(m71Var);
        }
        boolean z = m71Var.y;
        boolean z2 = this.k;
        if (z == z2) {
            return;
        }
        m71Var.y = z2;
        m71Var.J0();
        y02.p(m71Var);
    }

    public final int hashCode() {
        return ((Boolean.hashCode(this.k) + ((this.j.hashCode() + ((this.i.hashCode() + (this.h.hashCode() * 31)) * 31)) * 31)) * 31) + 1237;
    }
}
