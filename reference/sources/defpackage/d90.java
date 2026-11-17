package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class d90 extends oj2 {
    public final int E;
    public double[] F;
    public final double[][] G;

    public d90(ea1 ea1Var) {
        super(ea1Var);
        this.F = null;
        int i = this.s + 1;
        int i2 = this.t + 1;
        this.G = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i, i2);
        this.E = i2;
        this.F = new double[i2];
    }

    @Override // defpackage.oj2
    public final void H2(int i, int i2) {
        double[] dArr = this.G[i];
        double d = dArr[i2];
        if (d != h32.b) {
            ys.s(dArr, 0, this.E, 1, dArr, d);
        }
        Q2(i, i2, dArr);
    }

    @Override // defpackage.k1
    public final double J(int i, int i2) {
        return i == this.s + 1 ? this.F[i2] : this.G[i][i2];
    }

    @Override // defpackage.oj2
    public final boolean J2(int i, double d) {
        int[] iArr = this.r;
        int iH = ys.H(0, iArr.length, i, iArr);
        if (iH >= 0) {
            double[][] dArr = this.G;
            xh xhVar = new xh(dArr[iH]);
            int i2 = this.E;
            int i3 = i2 - 1;
            double d2 = xhVar.j[i3];
            xh xhVarL2 = xh.l2(i2);
            double[] dArr2 = xhVarL2.j;
            if (d2 <= d) {
                if (d2 < d) {
                    xhVar.m1(h32.b, xhVarL2);
                    dArr2[i] = h32.a;
                    dArr2[i3] = d2 - d;
                }
                return true;
            }
            xhVar.m1(h32.e, xhVarL2);
            dArr2[i] = h32.a;
            dArr2[i3] = d - d2;
            int iI2 = I2(xhVarL2, new b90(this, this.s, (byte) 2));
            if (iI2 >= 0) {
                double d3 = dArr2[iI2];
                if (d3 != h32.b) {
                    ys.s(dArr2, 0, this.E, 1, dArr2, d3);
                }
                Q2(-1, iI2, dArr2);
                dArr[iH] = dArr2;
                r22 r22VarG2 = i0();
                r22VarG2.size();
                long jCount = r22VarG2.count() - 1;
                long j = -1;
                do {
                    if (!(j < jCount)) {
                        B2(iH, iI2);
                        return true;
                    }
                    j++;
                } while (r22VarG2.z(j) >= h32.a);
            }
        }
        return false;
    }

    @Override // defpackage.oj2
    public final double K2() {
        double[] dArr = this.F;
        return dArr != null ? dArr[this.t] : h32.a;
    }

    @Override // defpackage.oj2
    public final double L2() {
        return this.G[this.s][this.t];
    }

    @Override // defpackage.oj2
    public final r22 O2() {
        return new c90(this, (byte) 0);
    }

    @Override // defpackage.oj2
    public final void P2(int i, double d) {
        super.P2(i, d);
        for (int i2 = 0; i2 < this.s; i2++) {
            double[] dArr = this.G[i2];
            int i3 = this.t;
            dArr[i3] = dArr[i3] - (dArr[i] * d);
        }
    }

    public final void Q2(int i, int i2, double[] dArr) {
        double[][] dArr2 = this.G;
        int length = dArr2.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (i3 != i) {
                double[] dArr3 = dArr2[i3];
                double d = dArr3[i2];
                if (d != h32.a && ((this.F != null && i3 == this.s) || !wo1.D(d, oj2.D.j))) {
                    aa3.w(dArr3, 0, -d, dArr, 0, 0, this.E);
                }
            }
        }
        double[] dArr4 = this.F;
        if (dArr4 != null) {
            double d2 = dArr4[i2];
            if (d2 != h32.a) {
                aa3.w(dArr4, 0, -d2, dArr, 0, 0, this.E);
            }
        }
    }

    @Override // defpackage.no2
    public final int T() {
        return this.E;
    }

    @Override // defpackage.lj2
    public final double U0() {
        double[][] dArr = this.G;
        int i = this.s;
        double d = -dArr[i][this.t];
        int i2 = 0;
        while (true) {
            int[] iArr = this.q;
            if (i2 >= iArr.length) {
                return d + this.B;
            }
            int i3 = iArr[i2];
            kj2 kj2VarC1 = c1(i3);
            if (kj2VarC1 == kj2.LOWER) {
                double d2 = this.j[i3];
                if (d2 != h32.a) {
                    d += d2 * dArr[i][i3];
                }
            } else if (kj2VarC1 == kj2.UPPER) {
                double d3 = this.o[i3];
                if (d3 != h32.a) {
                    d = (d3 * dArr[i][i3]) + d;
                }
            }
            i2++;
        }
    }

    @Override // defpackage.no2
    public final int Z1() {
        double[] dArr = this.F;
        double[][] dArr2 = this.G;
        return dArr != null ? dArr2.length + 1 : dArr2.length;
    }

    @Override // defpackage.dk1
    public final void b0(double d, int i, int i2) {
        this.G[i][i2] = d;
    }

    @Override // defpackage.lj2
    public final double d2(int i) {
        double[] dArr = this.F;
        int[] iArr = this.q;
        return dArr != null ? dArr[iArr[i]] : this.G[this.s][iArr[i]];
    }

    @Override // defpackage.lj2
    public final boolean i2() {
        return this.F != null;
    }

    @Override // defpackage.lj2
    public final void m0(double[] dArr) {
        int i = 0;
        while (true) {
            int[] iArr = this.r;
            if (i >= iArr.length) {
                return;
            }
            dArr[iArr[i]] = this.G[i][this.t];
            i++;
        }
    }

    @Override // defpackage.lj2
    public final zj1 n2() {
        if (this.F == null) {
            this.F = new double[this.t + 1];
        }
        return new c90(this, (byte) 1);
    }

    @Override // defpackage.lj2
    public final void o2() {
        double[] dArr = this.F;
        int i = this.t;
        if (dArr == null) {
            dArr = new double[i + 1];
            this.F = dArr;
        }
        System.arraycopy(this.G[this.s], 0, dArr, 0, i + 1);
    }

    @Override // defpackage.lj2
    public final void t2() {
        this.F = null;
    }

    @Override // defpackage.lj2
    public final void x2(int i, double d) {
        double[] dArr = this.F;
        int i2 = this.q[i];
        dArr[i2] = dArr[i2] + d;
    }
}
