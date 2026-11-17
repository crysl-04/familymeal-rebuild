package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fm2 implements g01 {
    public final int h;
    public final lm2 i;
    public boolean j;
    public int k;

    public fm2(int i) {
        lm2 lm2Var = new lm2(l52.q);
        lm2Var.k = 0;
        lm2Var.l = h32.a;
        lm2Var.p = 0;
        lm2Var.s = new jm2();
        this.i = lm2Var;
        this.j = false;
        this.k = 0;
        this.h = i;
    }

    public final void R(int i, i90 i90Var) {
        int iZ;
        int[] iArr;
        double[] dArr = i90Var.h;
        lm2 lm2Var = this.i;
        if (!lm2Var.h) {
            Arrays.fill(dArr, h32.a);
            dArr[i] = h32.b;
            j(dArr);
            i90Var.i0();
            return;
        }
        i90Var.reset();
        double d = lm2Var.s.a;
        k01 k01Var = lm2Var.u;
        if (d < 0.1d) {
            ((i90) k01Var.j).o(i, h32.b);
            lm2Var.D0((i90) lm2Var.u.j, i90Var);
            i90Var.A0((i90) lm2Var.u.n);
            gm2 gm2Var = lm2Var.o;
            fe feVar = lm2Var.q;
            gm2Var.getClass();
            int[] iArrA0 = i90Var.a0();
            int iJ = i90Var.j();
            int[] iArr2 = (int[]) feVar.f;
            int i2 = feVar.b;
            if (i2 == Integer.MAX_VALUE) {
                Arrays.fill(iArr2, 0);
                feVar.b = 0;
                i2 = 0;
            }
            feVar.b = i2 + 1;
            for (int i3 = 0; i3 < iJ; i3++) {
                iArr2[iArrA0[i3]] = feVar.b;
            }
            for (int i4 = gm2Var.a - 1; i4 >= 0; i4--) {
                double d2 = dArr[gm2Var.d[i4]];
                if (d2 != h32.a) {
                    int[] iArr3 = gm2Var.i;
                    int i5 = iArr3[i4 + 1];
                    for (int i6 = iArr3[i4]; i6 < i5; i6++) {
                        int i7 = gm2Var.c[i6];
                        dArr[i7] = dArr[i7] - (gm2Var.j[i6] * d2);
                        if (feVar.H(i7)) {
                            iArrA0[iJ] = i7;
                            iJ++;
                        }
                    }
                }
            }
            i90Var.m0(iJ);
            boolean zT0 = lm2.T0(i90Var.j(), lm2Var.p, lm2Var.s.a, 0.1d);
            gm2 gm2Var2 = lm2Var.n;
            fe feVar2 = lm2Var.q;
            int[] iArr4 = lm2Var.r.b.c;
            gm2Var2.getClass();
            int[] iArrA1 = i90Var.a0();
            int iJ2 = i90Var.j();
            if (zT0) {
                iZ = feVar2.z(iArrA1, iJ2, null, gm2Var2.e, null, gm2Var2.f, null);
                int i8 = iZ - 1;
                while (true) {
                    iArr = (int[]) feVar2.g;
                    if (i8 < 0) {
                        break;
                    }
                    int i9 = iArr[i8];
                    double d3 = dArr[i9];
                    if (d3 != h32.a) {
                        int[] iArr5 = gm2Var2.e;
                        int i10 = iArr5[i9];
                        int i11 = iArr5[i9 + 1];
                        while (i10 < i11) {
                            int i12 = gm2Var2.f[i10];
                            dArr[i12] = dArr[i12] - (gm2Var2.g[i10] * d3);
                            i10++;
                            i8 = i8;
                        }
                    }
                    i8--;
                }
                System.arraycopy(iArr, 0, iArrA1, 0, iZ);
            } else {
                int length = iArr4.length - 1;
                while (length >= 0) {
                    int i13 = iArr4[length];
                    double d4 = dArr[i13];
                    if (d4 != h32.a) {
                        int[] iArr6 = gm2Var2.e;
                        int i14 = iArr6[i13];
                        int i15 = iArr6[i13 + 1];
                        while (i14 < i15) {
                            int i16 = gm2Var2.f[i14];
                            int i17 = length;
                            dArr[i16] = dArr[i16] - (gm2Var2.g[i14] * d4);
                            if (feVar2.H(i16)) {
                                iArrA1[iJ2] = i16;
                                iJ2++;
                            }
                            i14++;
                            length = i17;
                        }
                    }
                    length--;
                }
                iZ = iJ2;
            }
            i90Var.m0(iZ);
        } else {
            double[] dArr2 = ((i90) k01Var.j).h;
            dArr2[i] = h32.b;
            lm2Var.t.a(dArr2, dArr, lm2Var.r);
            Arrays.fill(((i90) lm2Var.u.j).h, h32.a);
            i90Var.i0();
            i90Var.A0((i90) lm2Var.u.n);
            lm2Var.A0(dArr);
            i90Var.i0();
        }
        lm2Var.u.i = i;
        i90Var.D0(lm2Var.l);
        jm2 jm2Var = lm2Var.s;
        jm2Var.a = (i90Var.R() * 0.05d) + (jm2Var.a * 0.95d);
    }

    @Override // defpackage.no2
    public final int T() {
        return this.h;
    }

    @Override // defpackage.no2
    public final int Z1() {
        return this.h;
    }

    public final void a0(k52 k52Var, int[] iArr) {
        lm2 lm2Var = this.i;
        lm2Var.F0(k52Var, iArr, true);
        this.j = lm2Var.s.e < 1.0E-11d;
        this.k = 0;
    }

    public final void j(double[] dArr) {
        lm2 lm2Var = this.i;
        if (lm2Var.h) {
            System.arraycopy(dArr, 0, (double[]) lm2Var.u.k, 0, lm2Var.k);
            lm2Var.t.a((double[]) lm2Var.u.k, dArr, lm2Var.r);
            lm2Var.A0(dArr);
        }
    }

    @Override // defpackage.g01
    public final void x1(double[] dArr) {
        lm2 lm2Var = this.i;
        if (lm2Var.h) {
            lm2Var.x1(dArr);
        }
    }
}
