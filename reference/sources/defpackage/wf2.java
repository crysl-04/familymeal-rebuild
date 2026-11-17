package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class wf2 extends wg1 {
    public final boolean h;
    public final ui1 i;
    public final aa2 j;
    public final boolean k;
    public final ba2 l;
    public final kp0 m;

    public wf2(boolean z, ui1 ui1Var, aa2 aa2Var, boolean z2, ba2 ba2Var, kp0 kp0Var) {
        this.h = z;
        this.i = ui1Var;
        this.j = aa2Var;
        this.k = z2;
        this.l = ba2Var;
        this.m = kp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wf2.class != obj.getClass()) {
            return false;
        }
        wf2 wf2Var = (wf2) obj;
        return this.h == wf2Var.h && uz0.g(this.i, wf2Var.i) && uz0.g(this.j, wf2Var.j) && this.k == wf2Var.k && uz0.g(this.l, wf2Var.l) && this.m == wf2Var.m;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        yf2 yf2Var = new yf2(this.i, this.j, false, this.k, null, this.l, this.m);
        yf2Var.T = this.h;
        return yf2Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        yf2 yf2Var = (yf2) qg1Var;
        boolean z = yf2Var.T;
        boolean z2 = this.h;
        if (z != z2) {
            yf2Var.T = z2;
            y02.p(yf2Var);
        }
        yf2Var.T0(this.i, this.j, false, this.k, null, this.l, this.m);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.h) * 31;
        ui1 ui1Var = this.i;
        int iHashCode2 = (iHashCode + (ui1Var != null ? ui1Var.hashCode() : 0)) * 31;
        aa2 aa2Var = this.j;
        int iC = jp1.c((((iHashCode2 + (aa2Var != null ? aa2Var.hashCode() : 0)) * 31) + 1237) * 31, 31, this.k);
        ba2 ba2Var = this.l;
        return this.m.hashCode() + ((iC + (ba2Var != null ? Integer.hashCode(ba2Var.a) : 0)) * 31);
    }
}
