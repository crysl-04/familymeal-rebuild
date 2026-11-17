package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hm2 {
    public final int a;
    public final wk b;
    public double c;
    public final double[] d;
    public final int[] e;
    public final int[] f;
    public final int[][] g;
    public final double[][] h;
    public final int[][] i;
    public final int[] j;
    public final int[] k;
    public int[] l;
    public final int[] m;
    public int n;
    public int o;
    public double p;
    public final int[] q;
    public final int r;
    public final wk s;
    public int t;
    public int[] u;
    public int[] v;
    public double[] w;

    public hm2(int i, int i2) {
        double d = h32.a;
        this.c = d;
        this.l = new int[16];
        this.n = -1;
        this.o = -1;
        this.p = d;
        this.t = 0;
        this.u = new int[16];
        this.v = new int[16];
        this.w = new double[16];
        this.r = i;
        this.a = i2;
        this.b = new wk(i2, i);
        this.s = new wk(i, i2);
        this.q = new int[Math.max(i, i2)];
        this.k = new int[i];
        this.m = new int[i + 1];
        this.g = new int[i2][];
        this.h = new double[i2][];
        this.f = new int[i2];
        this.i = new int[i][];
        this.j = new int[i];
        this.e = new int[i];
        this.d = new double[i];
    }

    public final void a(double d, int i, int i2) {
        int i3 = this.t;
        int[] iArr = this.v;
        if (i3 >= iArr.length) {
            this.v = h7.m0(iArr, i3 + 1);
            this.u = h7.m0(this.u, this.t + 1);
            this.w = h7.l0(this.t + 1, this.w);
        }
        int[] iArr2 = this.v;
        int i4 = this.t;
        iArr2[i4] = i;
        this.u[i4] = i2;
        this.w[i4] = d;
        this.t = i4 + 1;
    }

    public final void b(int i, int i2, int i3, double d, im2 im2Var, gm2 gm2Var) {
        double[] dArr;
        int[] iArr;
        double[][] dArr2;
        int[][] iArr2;
        int[] iArr3;
        hm2 hm2Var = this;
        im2Var.a(i, i2, i3, d);
        int[][] iArr4 = hm2Var.g;
        int[] iArr5 = iArr4[i3];
        double[][] dArr3 = hm2Var.h;
        double[] dArr4 = dArr3[i3];
        int[] iArr6 = hm2Var.f;
        int i4 = iArr6[i3];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            dArr = hm2Var.d;
            iArr = hm2Var.e;
            if (i5 >= i4) {
                break;
            }
            int i7 = iArr5[i5];
            if (i7 != i2) {
                double d2 = dArr4[i5] / d;
                iArr[i6] = i7;
                dArr[i6] = d2;
                i6++;
                gm2Var.a(i7, d2);
            }
            i5++;
        }
        if (i6 > 0) {
            gm2Var.b(i2);
        }
        wk wkVar = hm2Var.b;
        wkVar.E(i3);
        wk wkVar2 = hm2Var.s;
        wkVar2.E(i2);
        int[][] iArr7 = hm2Var.i;
        int[] iArr8 = iArr7[i2];
        int[] iArr9 = hm2Var.j;
        int i8 = iArr9[i2];
        int i9 = 0;
        while (i9 < i8) {
            int i10 = i8;
            int i11 = iArr8[i9];
            if (i11 != i3) {
                int[] iArr10 = iArr4[i11];
                double[] dArr5 = dArr3[i11];
                int i12 = iArr6[i11];
                double d3 = h32.a;
                dArr2 = dArr3;
                int i13 = 0;
                while (i13 < i12) {
                    int i14 = i12;
                    if (iArr10[i13] == i2) {
                        d3 = dArr5[i13];
                        i12 = i14 - 1;
                        iArr10[i13] = iArr10[i12];
                        dArr5[i13] = dArr5[i12];
                        break;
                    }
                    i13++;
                    i12 = i14;
                }
                double d4 = d3;
                iArr2 = iArr7;
                hm2Var.a(d4, i, i11);
                if (i6 > 0 && d4 != h32.a) {
                    int i15 = 0;
                    while (true) {
                        iArr3 = hm2Var.k;
                        if (i15 >= i12) {
                            break;
                        }
                        int i16 = iArr10[i15];
                        i15++;
                        iArr3[i16] = i15;
                    }
                    int[] iArrM0 = iArr10;
                    int i17 = 0;
                    double[] dArrL0 = dArr5;
                    while (i17 < i6) {
                        int i18 = iArr[i17];
                        int i19 = i17;
                        double d5 = (-dArr[i19]) * d4;
                        int i20 = iArr3[i18];
                        if (i20 > 0) {
                            int i21 = i20 - 1;
                            dArrL0[i21] = dArrL0[i21] + d5;
                        } else if (Math.abs(d5) > hm2Var.c) {
                            if (i12 >= iArrM0.length) {
                                int i22 = i12 + 1;
                                iArrM0 = h7.m0(iArrM0, i22);
                                iArr4[i11] = iArrM0;
                                dArrL0 = h7.l0(i22, dArrL0);
                                dArr2[i11] = dArrL0;
                            }
                            iArrM0[i12] = i18;
                            dArrL0[i12] = d5;
                            i12++;
                            int i23 = iArr9[i18];
                            int[] iArr11 = iArr2[i18];
                            if (i23 >= iArr11.length) {
                                iArr2[i18] = h7.m0(iArr11, i23 + 1);
                            }
                            iArr2[i18][i23] = i11;
                            iArr9[i18] = i23 + 1;
                        }
                        i17 = i19 + 1;
                        hm2Var = this;
                    }
                    for (int i24 = 0; i24 < i12; i24++) {
                        iArr3[iArrM0[i24]] = 0;
                    }
                }
                iArr6[i11] = i12;
                wkVar.E(i11);
                wkVar.z(i11, i12);
            } else {
                dArr2 = dArr3;
                iArr6 = iArr6;
                iArr2 = iArr7;
            }
            i9++;
            hm2Var = this;
            i8 = i10;
            iArr8 = iArr8;
            iArr7 = iArr2;
            iArr6 = iArr6;
            dArr3 = dArr2;
        }
        int[][] iArr12 = iArr7;
        for (int i25 = 0; i25 < i4; i25++) {
            int i26 = iArr5[i25];
            if (i26 != i2) {
                int[] iArr13 = iArr12[i26];
                int i27 = iArr9[i26];
                for (int i28 = 0; i28 < i27; i28++) {
                    if (iArr13[i28] == i3) {
                        i27--;
                        iArr13[i28] = iArr13[i27];
                        break;
                    }
                }
                iArr9[i26] = i27;
                wkVar2.E(i26);
                wkVar2.z(i26, i27);
            }
        }
    }
}
