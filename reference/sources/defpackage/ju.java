package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class ju extends wg1 {
    public final ui1 h;
    public final aa2 i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final ba2 m;
    public final kp0 n;

    public ju(ui1 ui1Var, aa2 aa2Var, boolean z, boolean z2, String str, ba2 ba2Var, kp0 kp0Var) {
        this.h = ui1Var;
        this.i = aa2Var;
        this.j = z;
        this.k = z2;
        this.l = str;
        this.m = ba2Var;
        this.n = kp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ju.class != obj.getClass()) {
            return false;
        }
        ju juVar = (ju) obj;
        return uz0.g(this.h, juVar.h) && uz0.g(this.i, juVar.i) && this.j == juVar.j && this.k == juVar.k && uz0.g(this.l, juVar.l) && uz0.g(this.m, juVar.m) && this.n == juVar.n;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        return new lu(this.h, this.i, this.j, this.k, this.l, this.m, this.n);
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        ((lu) qg1Var).T0(this.h, this.i, this.j, this.k, this.l, this.m, this.n);
    }

    public final int hashCode() {
        ui1 ui1Var = this.h;
        int iHashCode = (ui1Var != null ? ui1Var.hashCode() : 0) * 31;
        aa2 aa2Var = this.i;
        int iC = jp1.c(jp1.c((iHashCode + (aa2Var != null ? aa2Var.hashCode() : 0)) * 31, 31, this.j), 31, this.k);
        String str = this.l;
        int iHashCode2 = (iC + (str != null ? str.hashCode() : 0)) * 31;
        ba2 ba2Var = this.m;
        return this.n.hashCode() + ((iHashCode2 + (ba2Var != null ? Integer.hashCode(ba2Var.a) : 0)) * 31);
    }
}
