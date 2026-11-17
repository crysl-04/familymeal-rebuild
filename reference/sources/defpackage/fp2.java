package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fp2 extends jp2 {
    public final gz2 i;
    public final int j;
    public final int k;

    public fp2(gz2 gz2Var, fz2 fz2Var, int i, int i2) {
        super(fz2Var, gz2Var.h1() - ((long) i), gz2Var.B1() - ((long) i2));
        this.i = gz2Var;
        this.j = i;
        this.k = i2;
    }

    @Override // defpackage.no2
    public final long B1() {
        return this.i.B1() - ((long) this.k);
    }

    @Override // defpackage.k1
    public final Comparable H(long j, long j2) {
        return this.i.H(((long) this.j) + j, ((long) this.k) + j2);
    }

    @Override // defpackage.bk1
    public final void I0(long j, long j2, double d) {
        this.i.I0(j + ((long) this.j), j2 + ((long) this.k), d);
    }

    @Override // defpackage.k1
    public final double J(int i, int i2) {
        return this.i.J(this.j + i, this.k + i2);
    }

    @Override // defpackage.bk1
    public final void Q(long j, long j2, sm smVar) {
        this.i.Q(j + ((long) this.j), j2 + ((long) this.k), smVar);
    }

    @Override // defpackage.bk1
    public final void S0(long j, long j2, Comparable comparable) {
        this.i.S0(j + ((long) this.j), j2 + ((long) this.k), comparable);
    }

    @Override // defpackage.no2
    public final int T() {
        return this.i.T() - this.k;
    }

    @Override // defpackage.bk1
    public final void W0(long j, long j2, c23 c23Var) {
        this.i.W0(j + ((long) this.j), j2 + ((long) this.k), c23Var);
    }

    @Override // defpackage.no2
    public final int Z1() {
        return this.i.Z1() - this.j;
    }

    @Override // defpackage.dk1
    public final void b0(double d, int i, int i2) {
        this.i.b0(d, this.j + i, this.k + i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp2)) {
            return false;
        }
        fp2 fp2Var = (fp2) obj;
        return this.i.equals(fp2Var.i) && this.k == fp2Var.k && this.j == fp2Var.j;
    }

    @Override // defpackage.no2
    public final long h1() {
        return this.i.h1() - ((long) this.j);
    }

    public final int hashCode() {
        return ((((this.i.hashCode() + 31) * 31) + this.k) * 31) + this.j;
    }

    @Override // defpackage.bk1
    public final void q0(double d, int i, int i2) {
        this.i.q0(d, this.j + i, this.k + i2);
    }

    @Override // defpackage.dk1
    public final void y0(long j, long j2, Comparable comparable) {
        this.i.y0(j + ((long) this.j), j2 + ((long) this.k), comparable);
    }
}
