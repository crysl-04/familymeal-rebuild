package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class e62 implements gy1, mi0 {
    public static final g52 j = new g52((byte) 2);
    public final double[][] h;
    public final int i;

    public e62(int i, int i2) {
        this.i = i2;
        this.h = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i, i2);
    }

    public static double[][] j(a1 a1Var, int i) {
        if (a1Var instanceof e62) {
            double[][] dArr = ((e62) a1Var).h;
            if (dArr.length == i) {
                return dArr;
            }
        }
        if (a1Var instanceof k1) {
            k1 k1Var = (k1) a1Var;
            if (k1Var.Z1() == i) {
                return k1Var.X();
            }
        }
        int intExact = i != 0 ? Math.toIntExact(a1Var.count() / ((long) i)) : 0;
        double[][] dArr2 = new double[i][];
        for (int i2 = 0; i2 < i; i2++) {
            double[] dArr3 = new double[intExact];
            dArr2[i2] = dArr3;
            for (int i3 = 0; i3 < intExact; i3++) {
                dArr3[i3] = a1Var.z((((long) i3) * ((long) i)) + ((long) i2));
            }
        }
        return dArr2;
    }

    @Override // defpackage.gy1
    public final void B0(boolean z, boolean z2, double[] dArr) {
        u8 u8Var = pp2.h;
        int length = dArr.length;
        double[][] dArr2 = this.h;
        if (z) {
            for (int i = 0; i < length; i++) {
                if (!z2) {
                    dArr[i] = dArr[i] / dArr2[i][i];
                }
                double d = dArr[i];
                if (d != h32.a) {
                    aa3.w(dArr, 0, -d, dArr2[i], 0, i + 1, length);
                }
            }
            return;
        }
        if (length > 80) {
            for (int i2 = 0; i2 < length; i2++) {
                double dF0 = dArr[i2] - es.f0(0, 0, 0, i2, dArr2[i2], dArr);
                if (!z2) {
                    dF0 /= dArr2[i2][i2];
                }
                dArr[i2] = dF0;
            }
            return;
        }
        for (int i3 = 0; i3 < length; i3++) {
            double[] dArr3 = dArr2[i3];
            double d2 = h32.a;
            for (int i4 = 0; i4 < i3; i4++) {
                d2 += dArr3[i4] * dArr[i4];
            }
            double d3 = dArr[i3] - d2;
            if (!z2) {
                d3 /= dArr3[i3];
            }
            dArr[i3] = d3;
        }
    }

    @Override // defpackage.no2
    public final long B1() {
        return this.i;
    }

    @Override // defpackage.re1
    public final fy1 C0() {
        return j;
    }

    @Override // defpackage.ck1, java.util.function.Consumer
    /* JADX INFO: renamed from: D1 */
    public final void accept(k1 k1Var) {
        double[][] dArr = this.h;
        int iG = lg1.g(dArr.length, k1Var.h1());
        int iG2 = lg1.g(this.i, k1Var.B1());
        for (int i = 0; i < iG; i++) {
            long j2 = i;
            double[] dArr2 = dArr[i];
            for (int i2 = 0; i2 < iG2; i2++) {
                dArr2[i2] = k1Var.y1(j2, i2);
            }
        }
    }

    @Override // defpackage.gz2, defpackage.ak1
    public final void E(long j2, long j3) {
        int intExact = Math.toIntExact(j2);
        int intExact2 = Math.toIntExact(j3);
        for (double[] dArr : this.h) {
            double d = dArr[intExact];
            dArr[intExact] = dArr[intExact2];
            dArr[intExact2] = d;
        }
    }

    @Override // defpackage.gy1
    public final void E0(k1 k1Var, boolean z, boolean z2) {
        u8 u8Var = op2.h;
        double[][] dArr = this.h;
        int length = dArr[0].length;
        int iG = lg1.g(k1Var.h1(), k1Var.B1());
        double[] dArr2 = new double[iG];
        for (int i = iG - 1; i >= 0; i--) {
            for (int i2 = i; i2 < iG; i2++) {
                dArr2[i2] = z2 ? k1Var.J(i2, i) : k1Var.J(i, i2);
            }
            for (int i3 = 0; i3 < length; i3++) {
                double d = h32.a;
                for (int i4 = i + 1; i4 < iG; i4++) {
                    d += dArr2[i4] * dArr[i4][i3];
                }
                double[] dArr3 = dArr[i];
                double d2 = dArr3[i3] - d;
                if (!z) {
                    d2 /= dArr2[i];
                }
                dArr3[i3] = d2;
            }
        }
    }

    @Override // defpackage.yj1
    public final void G1(a1 a1Var, f32 f32Var) {
        double[][] dArr = this.h;
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            double[] dArr2 = dArr[i];
            for (int i2 = 0; i2 < this.i; i2++) {
                double dZ = a1Var.z((((long) i2) * ((long) length)) + ((long) i));
                double d = dArr2[i2];
                f32Var.getClass();
                dArr2[i2] = dZ - d;
            }
        }
    }

    @Override // defpackage.gz2
    public final ep2 H0(int i, int i2) {
        return new ep2(this, ii1.o(this.h.length, this.i), i, i2);
    }

    @Override // defpackage.bk1
    public final void I0(long j2, long j3, double d) {
        double[] dArr = this.h[Math.toIntExact(j2)];
        int intExact = Math.toIntExact(j3);
        dArr[intExact] = dArr[intExact] + d;
    }

    @Override // defpackage.re1, defpackage.k1
    public final double J(int i, int i2) {
        return this.h[i][i2];
    }

    @Override // defpackage.j1
    public final void J0(im imVar) {
        double[][] dArr = this.h;
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            double[] dArr2 = dArr[i];
            if (i >= dArr2.length) {
                return;
            }
            imVar.b(dArr2[i]);
        }
    }

    @Override // defpackage.gz2, defpackage.ak1
    public final void K(long j2, long j3) {
        int intExact = Math.toIntExact(j2);
        int intExact2 = Math.toIntExact(j3);
        double[][] dArr = this.h;
        double[] dArr2 = dArr[intExact];
        dArr[intExact] = dArr[intExact2];
        dArr[intExact2] = dArr2;
    }

    @Override // defpackage.gz2
    public final void K1(a1 a1Var, a1 a1Var2) {
        long jCount = a1Var.count();
        double[][] dArr = this.h;
        int intExact = Math.toIntExact(jCount / ((long) dArr.length));
        if (intExact != Math.toIntExact(a1Var2.count() / ((long) this.i))) {
            a42.a();
            throw null;
        }
        double[][] dArrJ = j(a1Var, dArr.length);
        double[][] dArrJ2 = j(a1Var2, intExact);
        u8 u8Var = ni1.h;
        ni1.c(dArr.length, oe1.j(44, ((double) dArrJ2.length) * ((double) (dArrJ2.length > 0 ? dArrJ2[0].length : 0))), new ji1(dArr, dArrJ, dArrJ2, (byte) 1));
    }

    @Override // defpackage.gz2
    public final gp2 L0(int... iArr) {
        return new gp2(this, ii1.o(this.h.length, this.i), iArr);
    }

    @Override // defpackage.gz2
    public final dp2 N0(int... iArr) {
        return new dp2(this, ii1.o(this.h.length, this.i), iArr);
    }

    @Override // defpackage.i1
    public final a1 N1(long j2) {
        return new q22(this.h[Math.toIntExact(j2)], (byte) 0);
    }

    @Override // defpackage.gy1
    public final void O(k1 k1Var, boolean z, boolean z2) {
        u8 u8Var = pp2.h;
        double[][] dArr = this.h;
        int length = dArr[0].length;
        int iG = lg1.g(k1Var.h1(), k1Var.B1());
        double[] dArr2 = new double[iG];
        for (int i = 0; i < iG; i++) {
            for (int i2 = 0; i2 <= i; i2++) {
                dArr2[i2] = z2 ? k1Var.J(i2, i) : k1Var.J(i, i2);
            }
            for (int i3 = 0; i3 < length; i3++) {
                double d = h32.a;
                for (int i4 = 0; i4 < i; i4++) {
                    d += dArr2[i4] * dArr[i4][i3];
                }
                double[] dArr3 = dArr[i];
                double d2 = dArr3[i3] - d;
                if (!z) {
                    d2 /= dArr2[i];
                }
                dArr3[i3] = d2;
            }
        }
    }

    @Override // defpackage.yj1
    public final void O1(c23 c23Var) {
        u8 u8Var = xg1.h;
        double[][] dArr = this.h;
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            int length2 = dArr[i].length;
            for (int i2 = 0; i2 < length2; i2++) {
                double[] dArr2 = dArr[i];
                dArr2[i2] = c23Var.applyAsDouble(dArr2[i2]);
            }
        }
    }

    @Override // defpackage.bk1
    public final void Q(long j2, long j3, sm smVar) {
        double[][] dArr = this.h;
        long jMin = Math.min(((long) dArr.length) - j2, ((long) this.i) - j3);
        int length = (int) (((j3 + jMin) * ((long) dArr.length)) + j2 + jMin);
        int length2 = dArr.length + 1;
        for (int length3 = (int) ((((long) dArr.length) * j3) + j2); length3 < length; length3 += length2) {
            o(length3, smVar.a(A(length3)));
        }
    }

    @Override // defpackage.bk1
    public final void S0(long j2, long j3, Comparable comparable) {
        double[] dArr = this.h[Math.toIntExact(j2)];
        int intExact = Math.toIntExact(j3);
        dArr[intExact] = xo1.c1(comparable) + dArr[intExact];
    }

    @Override // defpackage.z0
    public final void S1(im imVar) {
        double[][] dArr = this.h;
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            int length2 = dArr[i].length;
            for (int i2 = 0; i2 < length2; i2++) {
                imVar.accept(dArr[i][i2]);
            }
        }
    }

    @Override // defpackage.no2
    public final int T() {
        return this.i;
    }

    @Override // defpackage.re1
    public final gy1 U() {
        return new e62(X(), this.i);
    }

    @Override // defpackage.re1
    public final Comparable W(int i) {
        x22 x22Var = x22.L0;
        if (i == 0) {
            throw null;
        }
        im imVarM = x22Var.m(i);
        S1(imVarM);
        return (Double) imVarM.get();
    }

    @Override // defpackage.bk1
    public final void W0(long j2, long j3, c23 c23Var) {
        Y1(j2, j3, c23Var.a(y1(j2, j3)));
    }

    @Override // defpackage.xj1
    public final void Z(a1 a1Var) {
        double[][] dArr = this.h;
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            double[] dArr2 = dArr[i];
            for (int i2 = 0; i2 < this.i; i2++) {
                dArr2[i2] = a1Var.z((((long) i2) * ((long) length)) + ((long) i));
            }
        }
    }

    @Override // defpackage.no2
    public final int Z1() {
        return this.h.length;
    }

    @Override // defpackage.dk1
    public final void b0(double d, int i, int i2) {
        this.h[i][i2] = d;
    }

    @Override // defpackage.no2, defpackage.mo2
    public final long count() {
        return ((long) this.h.length) * ((long) this.i);
    }

    @Override // defpackage.re1
    public final re1 e1(re1 re1Var) {
        double[][] dArr = this.h;
        e62 e62Var = new e62(dArr.length, Math.toIntExact(re1Var.B1()));
        double[][] dArrJ = j(re1Var, this.i);
        u8 u8Var = ni1.h;
        byte b = 0;
        int iJ = oe1.j(44, ((double) dArrJ.length) * ((double) (dArrJ.length > 0 ? dArrJ[0].length : 0)));
        double[][] dArr2 = e62Var.h;
        ni1.c(dArr2.length, iJ, new ji1(dArr2, dArr, dArrJ, b));
        return e62Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e62)) {
            return false;
        }
        e62 e62Var = (e62) obj;
        return this.i == e62Var.i && Arrays.deepEquals(this.h, e62Var.h);
    }

    @Override // defpackage.re1
    public final Comparable h0(int i, int i2) {
        return Double.valueOf(this.h[i][i2]);
    }

    @Override // defpackage.no2
    public final long h1() {
        return this.h.length;
    }

    public final int hashCode() {
        return ((Arrays.deepHashCode(this.h) + 31) * 31) + this.i;
    }

    @Override // defpackage.gz2
    public final gz2 j0() {
        return new ip2(this, ii1.o(this.h.length, this.i));
    }

    @Override // defpackage.ck1
    public final void k0(re1 re1Var, tm tmVar, re1 re1Var2) {
        double[][] dArr = this.h;
        int length = dArr.length;
        int i = 0;
        int length2 = length > 0 ? dArr[0].length : 0;
        int iZ1 = re1Var.Z1();
        int iT = re1Var.T();
        int iZ2 = re1Var2.Z1();
        int iT2 = re1Var2.T();
        int i2 = 0;
        while (i2 < length2) {
            int i3 = i2 % iT;
            int i4 = i2 % iT2;
            int i5 = i;
            while (i5 < length) {
                double[][] dArr2 = dArr;
                dArr2[i5][i2] = tmVar.c(re1Var.J(i5 % iZ1, i3), re1Var2.J(i5 % iZ2, i4));
                i5++;
                length2 = length2;
                dArr = dArr2;
                length = length;
            }
            i2++;
            i = 0;
        }
    }

    @Override // defpackage.gy1, defpackage.re1, defpackage.e1
    /* JADX INFO: renamed from: m */
    public final void a(gz2 gz2Var) {
        int i = 0;
        while (true) {
            double[][] dArr = this.h;
            if (i >= dArr.length) {
                return;
            }
            double[] dArr2 = dArr[i];
            for (int i2 = 0; i2 < this.i; i2++) {
                gz2Var.b0(dArr2[i2], i, i2);
            }
            i++;
        }
    }

    @Override // defpackage.bk1
    public final void q0(double d, int i, int i2) {
        double[] dArr = this.h[i];
        dArr[i2] = dArr[i2] + d;
    }

    @Override // defpackage.gy1
    public final void q1(boolean z, boolean z2, double[] dArr) {
        u8 u8Var = op2.h;
        int length = dArr.length;
        double[][] dArr2 = this.h;
        if (z) {
            for (int i = length - 1; i >= 0; i--) {
                if (!z2) {
                    dArr[i] = dArr[i] / dArr2[i][i];
                }
                double d = dArr[i];
                if (d != h32.a) {
                    aa3.w(dArr, 0, -d, dArr2[i], 0, 0, i);
                }
            }
            return;
        }
        if (length > 80) {
            for (int i2 = length - 1; i2 >= 0; i2--) {
                double dF0 = dArr[i2] - es.f0(0, 0, i2 + 1, length, dArr2[i2], dArr);
                if (!z2) {
                    dF0 /= dArr2[i2][i2];
                }
                dArr[i2] = dF0;
            }
            return;
        }
        int i3 = length - 1;
        for (int i4 = i3; i4 >= 0; i4--) {
            double[] dArr3 = dArr2[i4];
            double d2 = h32.a;
            for (int i5 = i3; i5 > i4; i5--) {
                d2 += dArr3[i5] * dArr[i5];
            }
            double d3 = dArr[i4] - d2;
            if (!z2) {
                d3 /= dArr3[i4];
            }
            dArr[i4] = d3;
        }
    }

    @Override // defpackage.re1
    public final Comparable r0(q22 q22Var) {
        long size = q22Var.size();
        g52 g52Var = j;
        gy1 gy1Var = (gy1) g52Var.b(1L, size);
        gy1 gy1Var2 = (gy1) g52Var.b(1L, 1L);
        gy1Var.K1(q22Var, this);
        gy1Var2.K1(gy1Var, q22Var);
        return (Double) gy1Var2.G(0L);
    }

    @Override // defpackage.zj1
    public final void reset() {
        int i = 0;
        while (true) {
            double[][] dArr = this.h;
            if (i >= dArr.length) {
                return;
            }
            double[] dArr2 = dArr[i];
            lt.v(h32.a, this.i, dArr2);
            i++;
        }
    }

    public final String toString() {
        return k1.l0(this);
    }

    @Override // defpackage.gz2
    public final fp2 v0(int i, int i2) {
        return new fp2(this, ii1.o(this.h.length, this.i), i, i2);
    }

    @Override // defpackage.yj1
    public final void v1(tm tmVar, a1 a1Var) {
        double[][] dArr = this.h;
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            double[] dArr2 = dArr[i];
            for (int i2 = 0; i2 < this.i; i2++) {
                dArr2[i2] = tmVar.c(dArr2[i2], a1Var.z((((long) i2) * ((long) length)) + ((long) i)));
            }
        }
    }

    @Override // defpackage.z0
    public final void w0(long j2, im imVar) {
        int i = (int) j2;
        double[][] dArr = this.h;
        int length = dArr.length;
        for (int i2 = 0; i2 < i; i2++) {
            imVar.b(dArr[i2 % length][i2 / length]);
        }
    }

    @Override // defpackage.dk1
    public final void y0(long j2, long j3, Comparable comparable) {
        this.h[Math.toIntExact(j2)][Math.toIntExact(j3)] = xo1.c1(comparable);
    }

    public e62(double[][] dArr, int i) {
        this.h = dArr;
        this.i = i;
    }

    @Override // defpackage.mi0
    public final no2 build() {
        return this;
    }
}
