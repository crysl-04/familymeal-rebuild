package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class k52 extends pi0 implements sm2 {
    public final int[] n;
    public final int[] o;
    public final double[] p;
    public final /* synthetic */ byte q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k52(int i, int i2, int i3) {
        this(i, i2, new double[i3], new int[i3], new int[i2 + 1]);
        this.q = (byte) 0;
    }

    public static void A0(k52 k52Var, double[] dArr) {
        int i = k52Var.h;
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = k52Var.o;
            int i3 = i2 + 1;
            int i4 = iArr[i3];
            for (int i5 = iArr[i2]; i5 < i4; i5++) {
                int i6 = k52Var.n[i5];
                double dAbs = Math.abs(k52Var.p[i5]);
                dArr[i2] = Math.max(dAbs, dArr[i2]);
                if (i6 != i2) {
                    dArr[i6] = Math.max(dAbs, dArr[i6]);
                }
            }
            i2 = i3;
        }
    }

    public static k52 D0(k52 k52Var, li1 li1Var) {
        int i = k52Var.j;
        int[] iArr = k52Var.n;
        double[] dArr = k52Var.p;
        int[] iArr2 = k52Var.o;
        int i2 = k52Var.h;
        int[] iArr3 = new int[i2 + 1];
        int i3 = 0;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = i4 + 1;
            int i6 = iArr2[i5];
            int i7 = 0;
            for (int i8 = iArr2[i4]; i8 < i6; i8++) {
                if (dArr[i8] != h32.a && iArr[i8] <= i4) {
                    i7++;
                }
            }
            iArr3[i5] = iArr3[i4] + i7;
            i4 = i5;
        }
        int i9 = iArr3[i2];
        int[] iArr4 = new int[i9];
        double[] dArr2 = new double[i9];
        int i10 = 0;
        while (i3 < i2) {
            int i11 = i3 + 1;
            int i12 = iArr2[i11];
            for (int i13 = iArr2[i3]; i13 < i12; i13++) {
                int i14 = iArr[i13];
                double d = dArr[i13];
                if (d != h32.a && i14 <= i3) {
                    iArr4[i10] = i14;
                    dArr2[i10] = d;
                    i10++;
                }
            }
            i3 = i11;
        }
        return new k52(i, i2, dArr2, iArr4, iArr3, (byte) 0);
    }

    public static void F0(double[] dArr, k52 k52Var, double[] dArr2) {
        Arrays.fill(dArr, h32.a);
        if (k52Var.j > 0) {
            int i = k52Var.h;
            if (i > 0) {
                int[] iArr = k52Var.o;
                int[] iArr2 = k52Var.n;
                double[] dArr3 = k52Var.p;
                int i2 = 0;
                while (i2 < i) {
                    double d = dArr2[i2];
                    i2++;
                    int i3 = iArr[i2];
                    for (int i4 = iArr[i2]; i4 < i3; i4++) {
                        int i5 = iArr2[i4];
                        dArr[i5] = (dArr3[i4] * d) + dArr[i5];
                    }
                }
            }
        }
    }

    public static void M0(double[] dArr, double[] dArr2, k52 k52Var) {
        int[] iArr = k52Var.o;
        int[] iArr2 = k52Var.n;
        double[] dArr3 = k52Var.p;
        int i = k52Var.h;
        int i2 = 0;
        while (i2 < i) {
            double d = h32.a;
            int i3 = i2 + 1;
            int i4 = iArr[i3];
            for (int i5 = iArr[i2]; i5 < i4; i5++) {
                d += dArr2[iArr2[i5]] * dArr3[i5];
            }
            dArr[i2] = d;
            i2 = i3;
        }
    }

    public static void Q1(k52 k52Var, double[] dArr) {
        int i = k52Var.h;
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = k52Var.o;
            i2++;
            int i3 = iArr[i2];
            for (int i4 = iArr[i2]; i4 < i3; i4++) {
                double[] dArr2 = k52Var.p;
                dArr2[i4] = dArr2[i4] * dArr[k52Var.n[i4]];
            }
        }
    }

    public static k52 T1(k1 k1Var, li1 li1Var) {
        int iZ1 = k1Var.Z1();
        int iT = k1Var.T();
        int[] iArr = new int[iT + 1];
        int iMax = Math.max(16, iT);
        int[] iArrM0 = new int[iMax];
        double[] dArrL0 = new double[iMax];
        int i = 0;
        for (int i2 = 0; i2 < iT; i2++) {
            iArr[i2] = i;
            for (int i3 = 0; i3 < iZ1; i3++) {
                if (li1Var == null || i3 <= i2) {
                    double dJ = k1Var.J(i3, i2);
                    if (dJ != h32.a) {
                        int i4 = i + 1;
                        iArrM0 = h7.m0(iArrM0, i4);
                        dArrL0 = h7.l0(i4, dArrL0);
                        iArrM0[i] = i3;
                        dArrL0[i] = dJ;
                        i = i4;
                    }
                }
            }
        }
        iArr[iT] = i;
        return new k52(iZ1, iT, Arrays.copyOf(dArrL0, i), Arrays.copyOf(iArrM0, i), iArr, (byte) 0);
    }

    public static void U0(double[] dArr, k52 k52Var, double[] dArr2) {
        F0(dArr, k52Var, dArr2);
        int[] iArr = k52Var.o;
        int[] iArr2 = k52Var.n;
        double[] dArr3 = k52Var.p;
        int i = k52Var.h;
        int i2 = 0;
        while (i2 < i) {
            double d = h32.a;
            int i3 = i2 + 1;
            int i4 = iArr[i3];
            for (int i5 = iArr[i2]; i5 < i4; i5++) {
                int i6 = iArr2[i5];
                if (i6 < i2) {
                    d = (dArr3[i5] * dArr2[i6]) + d;
                }
            }
            dArr[i2] = dArr[i2] + d;
            i2 = i3;
        }
    }

    public static void c1(k52 k52Var, double[] dArr) {
        int i = k52Var.h;
        int i2 = 0;
        while (i2 < i) {
            double d = dArr[i2];
            int[] iArr = k52Var.o;
            i2++;
            int i3 = iArr[i2];
            for (int i4 = iArr[i2]; i4 < i3; i4++) {
                double[] dArr2 = k52Var.p;
                dArr2[i4] = dArr2[i4] * d;
            }
        }
    }

    @Override // defpackage.re1, defpackage.k1
    public final double J(int i, int i2) {
        byte b = this.q;
        double[] dArr = this.p;
        int[] iArr = this.n;
        int[] iArr2 = this.o;
        switch (b) {
            case 0:
                int i3 = iArr2[i2 + 1];
                for (int i4 = iArr2[i2]; i4 < i3; i4++) {
                    if (iArr[i4] == i) {
                        return dArr[i4];
                    }
                }
                return h32.a;
            default:
                int i5 = iArr2[i + 1];
                for (int i6 = iArr2[i]; i6 < i5; i6++) {
                    if (iArr[i6] == i2) {
                        return dArr[i6];
                    }
                }
                return h32.a;
        }
    }

    @Override // defpackage.w0, defpackage.no2
    public final int P(int i) {
        byte b = this.q;
        int[] iArr = this.n;
        int[] iArr2 = this.o;
        int i2 = this.j;
        switch (b) {
            case 0:
                int i3 = iArr2[i];
                int i4 = iArr2[i + 1];
                return i3 < i4 ? iArr[i4 - 1] : i2;
            default:
                for (int i5 = i2 - 1; i5 >= 0; i5--) {
                    int i6 = iArr2[i5];
                    for (int i7 = iArr2[i5 + 1] - 1; i7 >= i6; i7--) {
                        if (iArr[i7] == i) {
                            return i5;
                        }
                    }
                }
                return i2;
        }
    }

    @Override // defpackage.no2
    public final int P0(int i) {
        byte b = this.q;
        int[] iArr = this.n;
        int[] iArr2 = this.o;
        switch (b) {
            case 0:
                int i2 = iArr2[i];
                if (i2 < iArr2[i + 1]) {
                    return iArr[i2];
                }
                return 0;
            default:
                int i3 = 0;
                while (i3 < this.j) {
                    int i4 = i3 + 1;
                    int i5 = iArr2[i4];
                    for (int i6 = iArr2[i3]; i6 < i5; i6++) {
                        if (iArr[i6] == i) {
                            return i3;
                        }
                    }
                    i3 = i4;
                }
                return 0;
        }
    }

    @Override // defpackage.re1
    public final re1 Q0() {
        switch (this.q) {
            case 0:
                return new k52(this.h, this.j, this.p, this.n, this.o, (byte) 1);
            default:
                return new k52(this.h, this.j, this.p, this.n, this.o, (byte) 0);
        }
    }

    public final void U1(int i, i90 i90Var) {
        i90Var.reset();
        int[] iArrA0 = i90Var.a0();
        int[] iArr = this.o;
        int i2 = iArr[i + 1];
        int i3 = 0;
        for (int i4 = iArr[i]; i4 < i2; i4++) {
            double d = this.p[i4];
            if (d != h32.a) {
                int i5 = this.n[i4];
                i90Var.h[i5] = d;
                iArrA0[i3] = i5;
                i3++;
            }
        }
        i90Var.m0(i3);
    }

    @Override // defpackage.w0, defpackage.no2
    public final int V(int i) {
        byte b = this.q;
        int i2 = this.h;
        int[] iArr = this.n;
        int[] iArr2 = this.o;
        switch (b) {
            case 0:
                for (int i3 = i2 - 1; i3 >= 0; i3--) {
                    int i4 = iArr2[i3];
                    for (int i5 = iArr2[i3 + 1] - 1; i5 >= i4; i5--) {
                        if (iArr[i5] == i) {
                            return i3;
                        }
                    }
                }
                return i2;
            default:
                int i6 = iArr2[i];
                int i7 = iArr2[i + 1];
                return i6 < i7 ? iArr[i7 - 1] : i2;
        }
    }

    @Override // defpackage.k1, defpackage.a1
    public final af0 b() {
        switch (this.q) {
            case 0:
                return new j52(this, -1);
            default:
                return new j52(this, -1, (byte) 0);
        }
    }

    public final void b2(int i, double[] dArr) {
        Arrays.fill(dArr, h32.a);
        int[] iArr = this.o;
        int i2 = iArr[i + 1];
        for (int i3 = iArr[i]; i3 < i2; i3++) {
            dArr[this.n[i3]] = this.p[i3];
        }
    }

    public final void d0(double d, int i, double[] dArr) {
        int[] iArr = this.o;
        int i2 = iArr[i + 1];
        for (int i3 = iArr[i]; i3 < i2; i3++) {
            int i4 = this.n[i3];
            dArr[i4] = (this.p[i3] * d) + dArr[i4];
        }
    }

    @Override // defpackage.re1
    public final Comparable h0(int i, int i2) {
        return Double.valueOf(J(i, i2));
    }

    @Override // defpackage.no2
    public final int n0(int i) {
        byte b = this.q;
        int[] iArr = this.n;
        int[] iArr2 = this.o;
        switch (b) {
            case 0:
                int i2 = 0;
                while (i2 < this.h) {
                    int i3 = i2 + 1;
                    int i4 = iArr2[i3];
                    for (int i5 = iArr2[i2]; i5 < i4; i5++) {
                        if (iArr[i5] == i) {
                            return i2;
                        }
                    }
                    i2 = i3;
                }
                return 0;
            default:
                int i6 = iArr2[i];
                if (i6 < iArr2[i + 1]) {
                    return iArr[i6];
                }
                return 0;
        }
    }

    @Override // defpackage.re1
    public final void r1(a1 a1Var, gz2 gz2Var) {
        byte b = this.q;
        double[] dArr = this.p;
        int[] iArr = this.n;
        int[] iArr2 = this.o;
        int i = this.h;
        switch (b) {
            case 0:
                gz2Var.reset();
                int size = ((q22) a1Var).size() / i;
                int i2 = 0;
                while (i2 < i) {
                    int i3 = iArr2[i2];
                    int i4 = i2 + 1;
                    int i5 = iArr2[i4];
                    while (i3 < i5) {
                        int i6 = iArr[i3];
                        double d = dArr[i3];
                        int i7 = 0;
                        while (i7 < size) {
                            int i8 = i3;
                            int i9 = i2;
                            gz2Var.q0(a1Var.z((((long) i7) * ((long) i)) + ((long) i2)) * d, i6, i7);
                            i7++;
                            iArr = iArr;
                            i3 = i8;
                            i2 = i9;
                        }
                        i3++;
                    }
                    i2 = i4;
                }
                break;
            default:
                gz2Var.reset();
                int size2 = ((q22) a1Var).size() / i;
                int i10 = 0;
                while (i10 < this.j) {
                    int i11 = i10 + 1;
                    int i12 = iArr2[i11];
                    for (int i13 = iArr2[i10]; i13 < i12; i13++) {
                        int i14 = iArr[i13];
                        double d2 = dArr[i13];
                        int i15 = 0;
                        while (i15 < size2) {
                            int i16 = size2;
                            gz2Var.q0(a1Var.z((((long) i15) * ((long) i)) + ((long) i14)) * d2, i10, i15);
                            i15++;
                            dArr = dArr;
                            size2 = i16;
                        }
                    }
                    i10 = i11;
                }
                break;
        }
    }

    @Override // defpackage.sm2
    public final k52 t0() {
        switch (this.q) {
            case 0:
                return this;
            default:
                double[] dArr = this.p;
                int length = dArr.length;
                int i = this.h;
                int[] iArr = new int[i];
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int[] iArr2 = this.n;
                    if (i3 < length) {
                        int i4 = iArr2[i3];
                        iArr[i4] = iArr[i4] + 1;
                        i3++;
                    } else {
                        int[] iArr3 = new int[i + 1];
                        int i5 = 0;
                        while (i5 < i) {
                            int i6 = i5 + 1;
                            iArr3[i6] = iArr3[i5] + iArr[i5];
                            i5 = i6;
                        }
                        double[] dArr2 = new double[length];
                        int[] iArr4 = new int[length];
                        int[] iArrCopyOf = Arrays.copyOf(iArr3, i);
                        while (true) {
                            int i7 = this.j;
                            if (i2 >= i7) {
                                return new k52(i7, i, dArr2, iArr4, iArr3, (byte) 0);
                            }
                            int[] iArr5 = this.o;
                            int i8 = i2 + 1;
                            int i9 = iArr5[i8];
                            for (int i10 = iArr5[i2]; i10 < i9; i10++) {
                                int i11 = iArr2[i10];
                                int i12 = iArrCopyOf[i11];
                                iArrCopyOf[i11] = i12 + 1;
                                dArr2[i12] = dArr[i10];
                                iArr4[i12] = i2;
                            }
                            i2 = i8;
                        }
                    }
                }
                break;
        }
    }

    public k52(int i, int i2, double[] dArr, int[] iArr, int[] iArr2) {
        super((fy1) l52.q, i, i2);
        this.p = dArr;
        this.n = iArr;
        this.o = iArr2;
    }

    @Override // defpackage.k1, defpackage.a1
    public final bf0 b() {
        switch (this.q) {
            case 0:
                return new j52(this, -1);
            default:
                return new j52(this, -1, (byte) 0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k52(int i, int i2, double[] dArr, int[] iArr, int[] iArr2, byte b) {
        this(i, i2, dArr, iArr, iArr2);
        this.q = b;
    }
}
