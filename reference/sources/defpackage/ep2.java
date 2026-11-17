package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ep2 extends jp2 {
    public final gz2 i;
    public final int j;
    public final int k;

    public ep2(gz2 gz2Var, fz2 fz2Var, int i, int i2) {
        super(fz2Var, i, i2);
        this.i = gz2Var;
        this.j = i;
        this.k = i2;
    }

    @Override // defpackage.no2
    public final long B1() {
        return this.k;
    }

    @Override // defpackage.k1
    public final Comparable H(long j, long j2) {
        return this.i.H(j, j2);
    }

    @Override // defpackage.bk1
    public final void I0(long j, long j2, double d) {
        this.i.I0(j, j2, d);
    }

    @Override // defpackage.k1
    public final double J(int i, int i2) {
        return this.i.J(i, i2);
    }

    @Override // defpackage.bk1
    public final void S0(long j, long j2, Comparable comparable) {
        this.i.S0(j, j2, comparable);
    }

    @Override // defpackage.no2
    public final int T() {
        return this.k;
    }

    @Override // defpackage.bk1
    public final void W0(long j, long j2, c23 c23Var) {
        this.i.W0(j, j2, c23Var);
    }

    @Override // defpackage.no2
    public final int Z1() {
        return this.j;
    }

    @Override // defpackage.dk1
    public final void b0(double d, int i, int i2) {
        this.i.b0(d, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep2)) {
            return false;
        }
        ep2 ep2Var = (ep2) obj;
        return this.i.equals(ep2Var.i) && this.k == ep2Var.k && this.j == ep2Var.j;
    }

    @Override // defpackage.no2
    public final long h1() {
        return this.j;
    }

    public final int hashCode() {
        return ((((this.i.hashCode() + 31) * 31) + this.k) * 31) + this.j;
    }

    @Override // defpackage.bk1
    public final void q0(double d, int i, int i2) {
        this.i.q0(d, i, i2);
    }

    @Override // defpackage.dk1
    public final void y0(long j, long j2, Comparable comparable) {
        this.i.y0(j, j2, comparable);
    }
}
