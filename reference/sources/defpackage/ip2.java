package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ip2 extends jp2 {
    public final gz2 i;

    public ip2(gz2 gz2Var, fz2 fz2Var) {
        super(fz2Var, gz2Var.B1(), gz2Var.h1());
        this.i = gz2Var;
    }

    @Override // defpackage.no2
    public final long B1() {
        return this.i.h1();
    }

    @Override // defpackage.k1
    public final Comparable H(long j, long j2) {
        return this.i.H(j2, j);
    }

    @Override // defpackage.bk1
    public final void I0(long j, long j2, double d) {
        this.i.I0(j2, j, d);
    }

    @Override // defpackage.k1
    public final double J(int i, int i2) {
        return this.i.J(i2, i);
    }

    @Override // defpackage.bk1
    public final void Q(long j, long j2, sm smVar) {
        this.i.Q(j2, j, smVar);
    }

    @Override // defpackage.bk1
    public final void S0(long j, long j2, Comparable comparable) {
        this.i.S0(j2, j, comparable);
    }

    @Override // defpackage.no2
    public final int T() {
        return this.i.Z1();
    }

    @Override // defpackage.bk1
    public final void W0(long j, long j2, c23 c23Var) {
        this.i.W0(j2, j, c23Var);
    }

    @Override // defpackage.no2
    public final int Z1() {
        return this.i.T();
    }

    @Override // defpackage.dk1
    public final void b0(double d, int i, int i2) {
        this.i.b0(d, i2, i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ip2) && this.i.equals(((ip2) obj).i);
        }
        return true;
    }

    @Override // defpackage.no2
    public final long h1() {
        return this.i.B1();
    }

    public final int hashCode() {
        return this.i.hashCode() + 31;
    }

    @Override // defpackage.jp2, defpackage.gz2
    public final gz2 j0() {
        return this.i;
    }

    @Override // defpackage.bk1
    public final void q0(double d, int i, int i2) {
        this.i.q0(d, i2, i);
    }

    @Override // defpackage.zj1
    public final void reset() {
        this.i.reset();
    }

    @Override // defpackage.dk1
    public final void y0(long j, long j2, Comparable comparable) {
        this.i.y0(j2, j, comparable);
    }
}
