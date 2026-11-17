package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dp2 extends jp2 {
    public final gz2 i;
    public final int[] j;

    public dp2(gz2 gz2Var, fz2 fz2Var, int... iArr) {
        super(fz2Var, gz2Var.h1(), iArr.length);
        this.i = gz2Var;
        this.j = iArr;
    }

    @Override // defpackage.no2
    public final long B1() {
        return this.j.length;
    }

    @Override // defpackage.k1
    public final Comparable H(long j, long j2) {
        return this.i.H(j, this.j[Math.toIntExact(j2)]);
    }

    @Override // defpackage.bk1
    public final void I0(long j, long j2, double d) {
        this.i.I0(j, this.j[(int) j2], d);
    }

    @Override // defpackage.k1
    public final double J(int i, int i2) {
        return this.i.J(i, this.j[i2]);
    }

    @Override // defpackage.bk1
    public final void S0(long j, long j2, Comparable comparable) {
        this.i.S0(j, this.j[(int) j2], comparable);
    }

    @Override // defpackage.no2
    public final int T() {
        return this.j.length;
    }

    @Override // defpackage.bk1
    public final void W0(long j, long j2, c23 c23Var) {
        this.i.W0(j, this.j[(int) j2], c23Var);
    }

    @Override // defpackage.no2
    public final int Z1() {
        return this.i.Z1();
    }

    @Override // defpackage.dk1
    public final void b0(double d, int i, int i2) {
        this.i.b0(d, i, this.j[i2]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp2)) {
            return false;
        }
        dp2 dp2Var = (dp2) obj;
        return this.i.equals(dp2Var.i) && Arrays.equals(this.j, dp2Var.j);
    }

    @Override // defpackage.no2
    public final long h1() {
        return this.i.h1();
    }

    public final int hashCode() {
        return Arrays.hashCode(this.j) + ((this.i.hashCode() + 31) * 31);
    }

    @Override // defpackage.bk1
    public final void q0(double d, int i, int i2) {
        this.i.q0(d, i, this.j[i2]);
    }

    @Override // defpackage.dk1
    public final void y0(long j, long j2, Comparable comparable) {
        this.i.y0(j, this.j[Math.toIntExact(j2)], comparable);
    }
}
