package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class lg0 extends wg1 {
    public final qz2 h;
    public final lz2 i;
    public final lz2 j;
    public final lz2 k;
    public final ah0 l;
    public final wh0 m;
    public final si2 n;
    public final kp0 o;
    public final mg0 p;

    public lg0(qz2 qz2Var, lz2 lz2Var, lz2 lz2Var2, lz2 lz2Var3, ah0 ah0Var, wh0 wh0Var, si2 si2Var, kp0 kp0Var, mg0 mg0Var) {
        this.h = qz2Var;
        this.i = lz2Var;
        this.j = lz2Var2;
        this.k = lz2Var3;
        this.l = ah0Var;
        this.m = wh0Var;
        this.n = si2Var;
        this.o = kp0Var;
        this.p = mg0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lg0)) {
            return false;
        }
        lg0 lg0Var = (lg0) obj;
        return lg0Var.h == this.h && uz0.g(lg0Var.i, this.i) && uz0.g(lg0Var.j, this.j) && uz0.g(lg0Var.k, this.k) && lg0Var.l.equals(this.l) && uz0.g(lg0Var.m, this.m) && lg0Var.n == this.n && lg0Var.o == this.o && uz0.g(lg0Var.p, this.p);
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        return new zg0(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p);
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        zg0 zg0Var = (zg0) qg1Var;
        zg0Var.v = this.h;
        zg0Var.w = this.i;
        zg0Var.x = this.j;
        zg0Var.y = this.k;
        zg0Var.z = this.l;
        zg0Var.A = this.m;
        zg0Var.B = this.n;
        zg0Var.C = this.o;
        zg0Var.D = this.p;
    }

    public final int hashCode() {
        int iHashCode = this.h.hashCode() * 31;
        lz2 lz2Var = this.i;
        int iHashCode2 = (iHashCode + (lz2Var != null ? lz2Var.hashCode() : 0)) * 31;
        lz2 lz2Var2 = this.j;
        int iHashCode3 = (iHashCode2 + (lz2Var2 != null ? lz2Var2.hashCode() : 0)) * 31;
        lz2 lz2Var3 = this.k;
        return this.n.hashCode() + (this.p.hashCode() * 31) + ((this.o.hashCode() + ((this.m.a.hashCode() + ((this.l.a.hashCode() + ((iHashCode3 + (lz2Var3 != null ? lz2Var3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
