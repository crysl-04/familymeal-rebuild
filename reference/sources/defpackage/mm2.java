package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class mm2 extends x implements me1, le1 {
    public s5 k;
    public k52 l;
    public int m;
    public final bj n;

    public mm2() {
        super(l52.q);
        bj bjVar = new bj();
        bjVar.a = null;
        bjVar.b = null;
        bjVar.c = null;
        bjVar.d = null;
        bjVar.e = null;
        this.n = bjVar;
    }

    public final x51 A0(k52 k52Var) {
        int i = k52Var.h;
        int[] iArr = k52Var.o;
        int[] iArr2 = k52Var.n;
        int[] iArr3 = new int[i];
        int[] iArr4 = new int[i];
        int[] iArr5 = new int[i];
        Arrays.fill(iArr4, -1);
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = iArr[i2];
            int i5 = i2 + 1;
            int i6 = iArr[i5];
            if (i4 >= i6) {
                throw new IllegalStateException();
            }
            iArr3[i2] = i2;
            while (i4 < i6) {
                int i7 = iArr2[i4];
                if (i7 > i2) {
                    throw new IllegalStateException();
                }
                while (iArr3[i7] != i2) {
                    if (iArr4[i7] < 0) {
                        iArr4[i7] = i2;
                    }
                    iArr5[i7] = iArr5[i7] + 1;
                    i3++;
                    iArr3[i7] = i2;
                    i7 = iArr4[i7];
                }
                i4++;
            }
            i2 = i5;
        }
        x51 x51Var = new x51(iArr5, iArr4, i3);
        k52 k52Var2 = this.l;
        if (k52Var2 == null || k52Var2.h != i || k52Var2.p.length != i3) {
            this.l = new k52(i, i, i3);
        }
        s5 s5Var = this.k;
        if (s5Var == null || s5Var.i.length != i) {
            this.k = new s5(i);
        }
        bj bjVar = this.n;
        int[] iArr6 = (int[]) bjVar.a;
        if (iArr6 != null && iArr6.length == i) {
            return x51Var;
        }
        bjVar.a = new int[i];
        bjVar.b = new int[i];
        bjVar.c = new int[i];
        bjVar.e = new double[i];
        bjVar.d = new boolean[i];
        return x51Var;
    }

    public final boolean D0(k52 k52Var, x51 x51Var, k52 k52Var2, s5 s5Var, bj bjVar) {
        int i = k52Var.h;
        int[] iArr = k52Var.o;
        int[] iArr2 = k52Var.n;
        double[] dArr = k52Var.p;
        int[] iArr3 = k52Var2.o;
        int[] iArr4 = k52Var2.n;
        double[] dArr2 = k52Var2.p;
        int[] iArr5 = x51Var.a;
        int[] iArr6 = x51Var.b;
        double[] dArr3 = s5Var.i;
        double[] dArr4 = s5Var.h;
        int[] iArr7 = (int[]) bjVar.a;
        int[] iArr8 = (int[]) bjVar.b;
        int[] iArr9 = (int[]) bjVar.c;
        double[] dArr5 = (double[]) bjVar.e;
        boolean[] zArr = (boolean[]) bjVar.d;
        int i2 = 0;
        this.m = 0;
        iArr3[0] = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            iArr3[i3] = iArr3[i2] + iArr5[i2];
            zArr[i2] = false;
            double d = h32.a;
            dArr5[i2] = d;
            dArr3[i2] = d;
            iArr9[i2] = iArr3[i2];
            i2 = i3;
        }
        double d2 = dArr[0];
        dArr3[0] = d2;
        double dAbs = Math.abs(d2);
        double d3 = dArr3[0];
        double d4 = h32.a;
        if (d3 != d4) {
            if (d3 > d4) {
                this.m++;
            }
            dArr4[0] = h32.b / d3;
            int i4 = 1;
            double dMax = dAbs;
            while (i4 < i) {
                int i5 = i4 + 1;
                int[] iArr10 = iArr6;
                int i6 = iArr[i5];
                double[] dArr6 = dArr2;
                int i7 = iArr[i4];
                int i8 = 0;
                while (i7 < i6) {
                    int i9 = i6;
                    int i10 = iArr2[i7];
                    if (i10 == i4) {
                        dArr3[i4] = dArr[i7];
                    } else {
                        dArr5[i10] = dArr[i7];
                        if (!zArr[i10]) {
                            zArr[i10] = true;
                            iArr8[0] = i10;
                            int i11 = 1;
                            for (int i12 = iArr10[i10]; i12 >= 0 && i12 < i4 && !zArr[i12]; i12 = iArr10[i12]) {
                                zArr[i12] = true;
                                iArr8[i11] = i12;
                                i11++;
                            }
                            while (i11 > 0) {
                                i11--;
                                iArr7[i8] = iArr8[i11];
                                i8++;
                            }
                        }
                    }
                    i7++;
                    i6 = i9;
                }
                int i13 = i8 - 1;
                while (i13 >= 0) {
                    int i14 = iArr7[i13];
                    int i15 = iArr9[i14];
                    double d5 = dArr5[i14];
                    int i16 = i4;
                    for (int i17 = iArr3[i14]; i17 < i15; i17++) {
                        int i18 = iArr4[i17];
                        dArr5[i18] = dArr5[i18] - (dArr6[i17] * d5);
                    }
                    iArr4[i15] = i16;
                    double d6 = dArr4[i14] * d5;
                    dArr6[i15] = d6;
                    dArr3[i16] = dArr3[i16] - (d5 * d6);
                    iArr9[i14] = iArr9[i14] + 1;
                    dArr5[i14] = h32.a;
                    zArr[i14] = false;
                    i13--;
                    i4 = i16;
                }
                int i19 = i4;
                dMax = Math.max(dMax, Math.abs(dArr3[i19]));
                double dI0 = i0() * dMax;
                if (Math.abs(dArr3[i19]) > dI0) {
                    double d7 = dArr3[i19];
                    if (d7 > dI0) {
                        this.m++;
                    }
                    dArr4[i19] = h32.b / d7;
                    i4 = i5;
                    iArr6 = iArr10;
                    dArr2 = dArr6;
                }
            }
            this.j = null;
            this.h = true;
            return true;
        }
        return false;
    }

    @Override // defpackage.me1
    public final re1 H1(e1 e1Var, gy1 gy1Var) {
        e1Var.a(gy1Var);
        if (T() > 0) {
            x.d0(this, gy1Var);
        }
        return gy1Var;
    }

    @Override // defpackage.no2
    public final int T() {
        k52 k52Var = this.l;
        if (k52Var != null) {
            return k52Var.h;
        }
        return 0;
    }

    @Override // defpackage.le1
    public final int Y(double d) {
        s5 s5Var = this.k;
        if (s5Var == null) {
            return 0;
        }
        int i = 0;
        for (double d2 : s5Var.i) {
            if (Math.abs(d2) > d) {
                i++;
            }
        }
        return i;
    }

    @Override // defpackage.no2
    public final int Z1() {
        k52 k52Var = this.l;
        if (k52Var != null) {
            return k52Var.j;
        }
        return 0;
    }

    @Override // defpackage.x
    public final boolean a0() {
        return n1();
    }

    @Override // defpackage.ul2
    public final gy1 j(int i, int i2, int i3) {
        return m0(i, i3);
    }

    @Override // defpackage.le1
    public final double j1() {
        s5 s5Var = this.k;
        if (s5Var != null) {
            double[] dArr = s5Var.i;
            if (dArr.length != 0) {
                return i0() * lt.J(0, dArr.length, dArr);
            }
        }
        return h32.a;
    }

    @Override // defpackage.ne1
    public final boolean p0(e1 e1Var) {
        k52 k52VarT1;
        li1 li1Var = new li1((byte) 23);
        if (e1Var instanceof sm2) {
            k52VarT1 = k52.D0(((sm2) e1Var).t0(), li1Var);
        } else {
            k52VarT1 = e1Var instanceof k1 ? k52.T1((k1) e1Var, li1Var) : k52.D0(((rm2) e1Var.o1(rm2.r)).t0(), li1Var);
        }
        k52 k52Var = k52VarT1;
        reset();
        return D0(k52Var, A0(k52Var), this.l, this.k, this.n);
    }

    @Override // defpackage.g01
    public final void x1(double[] dArr) {
        k52 k52Var = this.l;
        int[] iArr = k52Var.o;
        int[] iArr2 = k52Var.n;
        double[] dArr2 = k52Var.p;
        int length = dArr.length;
        int i = 0;
        while (i < length) {
            double d = dArr[i];
            i++;
            int i2 = iArr[i];
            for (int i3 = iArr[i]; i3 < i2; i3++) {
                int i4 = iArr2[i3];
                dArr[i4] = dArr[i4] - (dArr2[i3] * d);
            }
        }
        double[] dArr3 = this.k.h;
        int length2 = dArr.length;
        for (int i5 = 0; i5 < length2; i5++) {
            dArr[i5] = dArr[i5] * dArr3[i5];
        }
        for (int length3 = dArr.length - 1; length3 >= 0; length3--) {
            double d2 = h32.a;
            int i6 = iArr[length3 + 1];
            for (int i7 = iArr[length3]; i7 < i6; i7++) {
                d2 -= dArr2[i7] * dArr[iArr2[i7]];
            }
            dArr[length3] = dArr[length3] + d2;
        }
    }
}
