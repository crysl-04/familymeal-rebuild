package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zp1 extends gz {
    public final int l;
    public final int m;

    public zp1(re1 re1Var, long j, long j2) {
        super(re1Var, re1Var.h1() - j, re1Var.B1() - j2);
        this.l = Math.toIntExact(j);
        this.m = Math.toIntExact(j2);
    }

    @Override // defpackage.re1, defpackage.k1
    public final double J(int i, int i2) {
        return this.k.J(this.l + i, this.m + i2);
    }

    @Override // defpackage.w0, defpackage.no2
    public final int P(int i) {
        return Math.min(this.k.P(i) - this.l, this.j);
    }

    @Override // defpackage.no2
    public final int P0(int i) {
        return Math.max(this.k.P0(i) - this.l, 0);
    }

    @Override // defpackage.w0, defpackage.no2
    public final int V(int i) {
        return Math.min(this.k.V(i) - this.m, this.h);
    }

    @Override // defpackage.re1
    public final Comparable h0(int i, int i2) {
        return this.k.h0(this.l + i, this.m + i2);
    }

    @Override // defpackage.no2
    public final int n0(int i) {
        return Math.max(this.k.n0(i) - this.m, 0);
    }
}
