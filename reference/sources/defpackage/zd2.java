package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class zd2 extends wg1 {
    public final ke2 h;
    public final ks1 i;
    public final boolean j;
    public final tj0 k;
    public final ui1 l;
    public final un2 m;
    public final boolean n;
    public final j8 o;

    public zd2(j8 j8Var, tj0 tj0Var, ui1 ui1Var, ks1 ks1Var, ke2 ke2Var, un2 un2Var, boolean z, boolean z2) {
        this.h = ke2Var;
        this.i = ks1Var;
        this.j = z;
        this.k = tj0Var;
        this.l = ui1Var;
        this.m = un2Var;
        this.n = z2;
        this.o = j8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zd2.class != obj.getClass()) {
            return false;
        }
        zd2 zd2Var = (zd2) obj;
        return this.h.equals(zd2Var.h) && this.i == zd2Var.i && this.j == zd2Var.j && uz0.g(this.k, zd2Var.k) && uz0.g(this.l, zd2Var.l) && uz0.g(this.m, zd2Var.m) && this.n == zd2Var.n && uz0.g(this.o, zd2Var.o);
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        ae2 ae2Var = new ae2();
        ae2Var.x = this.h;
        ae2Var.y = this.i;
        ae2Var.z = this.j;
        ae2Var.A = this.k;
        ae2Var.B = this.l;
        ae2Var.C = this.m;
        ae2Var.D = this.n;
        ae2Var.E = this.o;
        return ae2Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        ((ae2) qg1Var).O0(this.o, this.k, this.l, this.i, this.h, this.m, this.n, this.j);
    }

    public final int hashCode() {
        int iHashCode = (((Boolean.hashCode(this.j) + ((this.i.hashCode() + (this.h.hashCode() * 31)) * 31)) * 31) + 1237) * 31;
        tj0 tj0Var = this.k;
        int iHashCode2 = (iHashCode + (tj0Var != null ? tj0Var.hashCode() : 0)) * 31;
        ui1 ui1Var = this.l;
        int iHashCode3 = (iHashCode2 + (ui1Var != null ? ui1Var.hashCode() : 0)) * 31;
        un2 un2Var = this.m;
        int iC = jp1.c((iHashCode3 + (un2Var != null ? un2Var.hashCode() : 0)) * 31, 31, this.n);
        j8 j8Var = this.o;
        return iC + (j8Var != null ? j8Var.hashCode() : 0);
    }
}
