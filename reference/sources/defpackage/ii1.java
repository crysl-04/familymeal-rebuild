package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ii1 implements oe1 {
    public static final u8 h = fu1.j.a();
    public static final hi1 i = new hi1();
    public static final byte j = 44;

    public static void a(gz2 gz2Var, a1 a1Var, int i2, a1 a1Var2) {
        int iMin;
        int iMax;
        int iY0;
        int iL;
        int iT = gz2Var.T();
        int i3 = 0;
        if (i2 == 0) {
            vc2 vc2VarP = p(gz2Var);
            while (i3 < iT) {
                gz2Var.y0(0L, i3, vc2VarP);
                i3++;
            }
            return;
        }
        vc2 vc2VarP2 = p(a1Var);
        k1 k1VarL = l(1, i2, a1Var);
        if (k1VarL != null) {
            iMax = Math.max(k1VarL.n0(0), 0);
            iMin = Math.min(k1VarL.V(0), i2);
        } else {
            iMin = i2;
            iMax = 0;
        }
        vc2[] vc2VarArr = (vc2[]) Array.newInstance(vc2VarP2.getClass(), i2);
        Arrays.fill(vc2VarArr, vc2VarP2);
        for (int i4 = iMax; i4 < iMin; i4++) {
            vc2VarArr[i4] = (vc2) a1Var.G(i4);
        }
        k1 k1VarL2 = l(i2, iT, a1Var2);
        while (i3 < iT) {
            if (k1VarL2 != null) {
                iL = no2.L(k1VarL2, i3, iMax);
                iY0 = no2.Y0(k1VarL2, i3, iMin);
            } else {
                iY0 = iMin;
                iL = iMax;
            }
            vc2 vc2VarZ1 = vc2VarP2;
            while (iL < iY0) {
                vc2VarZ1 = vc2VarZ1.z1((vc2) vc2VarArr[iL].i((vc2) (k1VarL2 != null ? k1VarL2.H(iL, i3) : a1Var2.G((((long) i3) * ((long) i2)) + ((long) iL)))));
                iL++;
                vc2VarP2 = vc2VarP2;
                iMin = iMin;
            }
            gz2Var.y0(0L, i3, (Comparable) vc2VarZ1.get());
            i3++;
            vc2VarP2 = vc2VarP2;
        }
    }

    public static void b(gz2 gz2Var, a1 a1Var, int i2, a1 a1Var2) {
        int iMin;
        int iMax;
        int iY0;
        int iL;
        int iT = gz2Var.T();
        k1 k1VarL = l(1, i2, a1Var);
        if (k1VarL != null) {
            iMax = Math.max(k1VarL.n0(0), 0);
            iMin = Math.min(k1VarL.V(0), i2);
        } else {
            iMin = i2;
            iMax = 0;
        }
        double[] dArr = new double[i2];
        for (int i3 = iMax; i3 < iMin; i3++) {
            dArr[i3] = a1Var.A(i3);
        }
        double[] dArr2 = a1Var2 instanceof l52 ? ((l52) a1Var2).j : null;
        k1 k1VarL2 = l(i2, iT, a1Var2);
        for (int i4 = 0; i4 < iT; i4++) {
            if (k1VarL2 != null) {
                iL = no2.L(k1VarL2, i4, iMax);
                iY0 = no2.Y0(k1VarL2, i4, iMin);
            } else {
                iY0 = iMin;
                iL = iMax;
            }
            double dA = h32.a;
            if (dArr2 != null) {
                dA = es.f0(0, i4 * i2, iL, iY0, dArr, dArr2);
            } else {
                if (k1VarL2 != null) {
                    double dC = dA;
                    for (int i5 = iL; i5 < iY0; i5++) {
                        dC = wi0.c(k1VarL2, i5, i4, dArr[i5], dC);
                    }
                    dA = dC;
                } else {
                    int i6 = (i4 * i2) + iL;
                    while (iL < iY0) {
                        dA = (a1Var2.A(i6) * dArr[iL]) + dA;
                        iL++;
                        i6++;
                    }
                }
                gz2Var.b0(dA, 0, i4);
            }
            gz2Var.b0(dA, 0, i4);
        }
    }

    public static void c(gz2 gz2Var, int i2, int i3, vc2[] vc2VarArr, int[] iArr, int[] iArr2, int i4, a1 a1Var, vc2[] vc2VarArr2, vc2[] vc2VarArr3, vc2 vc2Var) {
        vc2[] vc2VarArr4;
        int iY0;
        int iL;
        vc2 vc2Var2;
        int i5 = i4;
        a1 a1Var2 = a1Var;
        int iZ1 = gz2Var.Z1();
        if (vc2VarArr3 != null) {
            vc2VarArr4 = vc2VarArr3;
        } else {
            vc2VarArr4 = (vc2[]) Array.newInstance(vc2Var.getClass(), iZ1);
            Arrays.fill(vc2VarArr4, vc2Var);
        }
        k1 k1VarL = l(i5, gz2Var.T(), a1Var2);
        int i6 = i2;
        while (i6 < i3) {
            int i7 = vc2VarArr3 != null ? i6 * iZ1 : 0;
            Arrays.fill(vc2VarArr4, i7, i7 + iZ1, vc2Var);
            if (k1VarL != null) {
                iL = no2.L(k1VarL, i6, 0);
                iY0 = no2.Y0(k1VarL, i6, i5);
            } else {
                iY0 = i5;
                iL = 0;
            }
            int i8 = i6 * i5;
            while (iL < iY0) {
                if (vc2VarArr2 != null) {
                    vc2Var2 = vc2VarArr2[i8 + iL];
                    i7 = i7;
                } else {
                    vc2Var2 = (vc2) (k1VarL != null ? k1VarL.H(iL, i6) : a1Var2.G(i8 + iL));
                }
                int i9 = iL * iZ1;
                for (int i10 = iArr[iL]; i10 < iArr2[iL]; i10++) {
                    int i11 = i7 + i10;
                    vc2VarArr4[i11] = (vc2) vc2VarArr4[i11].z1((vc2) vc2VarArr[i9 + i10].i(vc2Var2)).get();
                }
                iL++;
                a1Var2 = a1Var;
                i7 = i7;
            }
            if (vc2VarArr3 == null) {
                for (int i12 = 0; i12 < iZ1; i12++) {
                    gz2Var.y0(i12, i6, vc2VarArr4[i12]);
                }
            }
            i6++;
            i5 = i4;
            a1Var2 = a1Var;
        }
    }

    public static void d(gz2 gz2Var, int i2, int i3, double[] dArr, int[] iArr, int[] iArr2, int i4, a1 a1Var, double[] dArr2, double[] dArr3) {
        int iY0;
        int iL;
        int iZ1 = gz2Var.Z1();
        double[] dArr4 = dArr3 != null ? dArr3 : new double[iZ1];
        k1 k1VarL = l(i4, gz2Var.T(), a1Var);
        for (int i5 = i2; i5 < i3; i5++) {
            int i6 = dArr3 != null ? i5 * iZ1 : 0;
            Arrays.fill(dArr4, i6, i6 + iZ1, h32.a);
            if (k1VarL != null) {
                iL = no2.L(k1VarL, i5, 0);
                iY0 = no2.Y0(k1VarL, i5, i4);
            } else {
                iY0 = i4;
                iL = 0;
            }
            int i7 = i5 * i4;
            while (iL < iY0) {
                double dJ = dArr2 != null ? dArr2[i7 + iL] : k1VarL != null ? k1VarL.J(iL, i5) : a1Var.A(i7 + iL);
                if (dJ != h32.a) {
                    aa3.w(dArr4, i6, dJ, dArr, iL * iZ1, iArr[iL], iArr2[iL]);
                }
                iL++;
            }
            if (dArr3 == null) {
                for (int i8 = 0; i8 < iZ1; i8++) {
                    gz2Var.b0(dArr4[i8], i8, i5);
                }
            }
        }
    }

    public static void e(final gz2 gz2Var, a1 a1Var, final int i2, final a1 a1Var2) {
        final double[] dArr;
        int iMax;
        int iL;
        int iY0;
        int i3;
        double[] dArr2;
        int i4;
        int iZ1 = gz2Var.Z1();
        int iT = gz2Var.T();
        if (iZ1 == 1) {
            b(gz2Var, a1Var, i2, a1Var2);
        }
        int iK = oe1.k(j, iZ1, i2);
        k1 k1VarL = l(iZ1, i2, a1Var);
        k1 k1VarL2 = l(i2, iT, a1Var2);
        int i5 = 0;
        if (iZ1 > 10 || iT > iK || k1VarL == null || k1VarL2 == null) {
            int i6 = 0;
            if (iT == 1 && (a1Var instanceof l52) && (gz2Var instanceof l52)) {
                double[] dArr3 = ((l52) gz2Var).j;
                double[] dArr4 = ((l52) a1Var).j;
                int length = dArr3.length;
                Arrays.fill(dArr3, h32.a);
                if (k1VarL2 != null) {
                    int iL2 = no2.L(k1VarL2, 0, 0);
                    iY0 = no2.Y0(k1VarL2, 0, i2);
                    i3 = iL2;
                } else {
                    iY0 = i2;
                    i3 = 0;
                }
                while (i3 < iY0) {
                    double dA = a1Var2.A(i3);
                    if (dA != h32.a) {
                        dArr2 = dArr4;
                        i4 = length;
                        aa3.w(dArr3, 0, dA, dArr2, i3 * length, 0, i4);
                    } else {
                        dArr2 = dArr4;
                        i4 = length;
                    }
                    i3++;
                    dArr4 = dArr2;
                    length = i4;
                }
                return;
            }
            final int[] iArr = new int[i2];
            final int[] iArr2 = new int[i2];
            if (a1Var instanceof l52) {
                double[] dArr5 = ((l52) a1Var).j;
                Arrays.fill(iArr2, iZ1);
                dArr = dArr5;
            } else {
                double[] dArr6 = new double[iZ1 * i2];
                int i7 = 0;
                while (i7 < i2) {
                    if (k1VarL != null) {
                        iL = no2.L(k1VarL, i7, i6);
                        iMax = Math.max(iL, no2.Y0(k1VarL, i7, iZ1));
                    } else {
                        iMax = iZ1;
                        iL = i6;
                    }
                    iArr[i7] = iL;
                    iArr2[i7] = iMax;
                    int i8 = i7 * iZ1;
                    while (iL < iMax) {
                        int i9 = i8 + iL;
                        dArr6[i9] = k1VarL != null ? k1VarL.J(iL, i7) : a1Var.A(i9);
                        iL++;
                    }
                    i7++;
                    i6 = 0;
                }
                dArr = dArr6;
            }
            double[] dArr7 = a1Var2 instanceof l52 ? ((l52) a1Var2).j : null;
            final double[] dArr8 = gz2Var instanceof l52 ? ((l52) gz2Var).j : null;
            if (iT <= iK) {
                d(gz2Var, 0, iT, dArr, iArr, iArr2, i2, a1Var2, dArr7, dArr8);
                return;
            }
            u8 u8Var = h;
            u8Var.a = iK;
            final double[] dArr9 = dArr7;
            u8Var.b(0, iT, new sb0() { // from class: di1
                @Override // defpackage.sb0
                public final void a(int i10, int i11) {
                    ii1.d(gz2Var, i10, i11, dArr, iArr, iArr2, i2, a1Var2, dArr9, dArr8);
                }
            });
            return;
        }
        int i10 = 7;
        int i11 = 6;
        int i12 = 5;
        int i13 = 4;
        int i14 = 3;
        int i15 = 2;
        switch (iZ1) {
            case 2:
                int i16 = 0;
                int iT2 = gz2Var.T();
                int iG = g(k1VarL, 2, i2);
                int i17 = i(k1VarL, 2, i2);
                int i18 = 0;
                while (i18 < iT2) {
                    int iL3 = no2.L(k1VarL2, i18, iG);
                    int iY1 = no2.Y0(k1VarL2, i18, i17);
                    double dC = h32.a;
                    double dC2 = dC;
                    int i19 = iL3;
                    while (i19 < iY1) {
                        double dJ = k1VarL2.J(i19, i18);
                        int i20 = i16;
                        dC = wi0.c(k1VarL, i20, i19, dJ, dC);
                        k1 k1Var = k1VarL;
                        int i21 = i19;
                        dC2 = wi0.c(k1Var, 1, i21, dJ, dC2);
                        k1VarL = k1Var;
                        i19 = i21 + 1;
                        i16 = i20;
                    }
                    int i22 = i16;
                    gz2Var.b0(dC, i22, i18);
                    gz2Var.b0(dC2, 1, i18);
                    i18++;
                    i16 = i22;
                }
                break;
            case 3:
                int i23 = 0;
                int i24 = 2;
                int iT3 = gz2Var.T();
                int iG2 = g(k1VarL, 3, i2);
                int i25 = i(k1VarL, 3, i2);
                int i26 = 0;
                while (i26 < iT3) {
                    int iL4 = no2.L(k1VarL2, i26, iG2);
                    int iY2 = no2.Y0(k1VarL2, i26, i25);
                    double d = h32.a;
                    double dC3 = d;
                    double dC4 = dC3;
                    int i27 = iL4;
                    while (i27 < iY2) {
                        double dJ2 = k1VarL2.J(i27, i26);
                        int i28 = i23;
                        double dC5 = wi0.c(k1VarL, i28, i27, dJ2, d);
                        k1 k1Var2 = k1VarL;
                        int i29 = i27;
                        dC3 = wi0.c(k1Var2, 1, i29, dJ2, dC3);
                        k1VarL = k1Var2;
                        dC4 = wi0.c(k1VarL, 2, i29, dJ2, dC4);
                        i27 = i29 + 1;
                        d = dC5;
                        i23 = i28;
                        i24 = 2;
                    }
                    int i30 = i24;
                    int i31 = i23;
                    gz2Var.b0(d, i31, i26);
                    gz2Var.b0(dC3, 1, i26);
                    gz2Var.b0(dC4, i30, i26);
                    i26++;
                    iT3 = iT3;
                    iG2 = iG2;
                    i23 = i31;
                    i24 = i30;
                }
                break;
            case 4:
                int i32 = 0;
                int i33 = 3;
                int i34 = 2;
                int iT4 = gz2Var.T();
                int iG3 = g(k1VarL, 4, i2);
                int i35 = i(k1VarL, 4, i2);
                int i36 = 0;
                while (i36 < iT4) {
                    int iL5 = no2.L(k1VarL2, i36, iG3);
                    int iY3 = no2.Y0(k1VarL2, i36, i35);
                    double d2 = h32.a;
                    double dC6 = d2;
                    double dC7 = dC6;
                    double dC8 = dC7;
                    int i37 = iL5;
                    while (i37 < iY3) {
                        double dJ3 = k1VarL2.J(i37, i36);
                        int i38 = i32;
                        double dC9 = wi0.c(k1VarL, i38, i37, dJ3, d2);
                        int i39 = iY3;
                        k1 k1Var3 = k1VarL;
                        int i40 = i37;
                        dC6 = wi0.c(k1Var3, 1, i40, dJ3, dC6);
                        k1VarL = k1Var3;
                        dC7 = wi0.c(k1VarL, i34, i40, dJ3, dC7);
                        dC8 = wi0.c(k1VarL, i33, i40, dJ3, dC8);
                        i37 = i40 + 1;
                        iY3 = i39;
                        d2 = dC9;
                        i32 = i38;
                    }
                    int i41 = i33;
                    gz2Var.b0(d2, i32, i36);
                    gz2Var.b0(dC6, 1, i36);
                    i34 = 2;
                    gz2Var.b0(dC7, 2, i36);
                    gz2Var.b0(dC8, i41, i36);
                    i36++;
                    iT4 = iT4;
                    i35 = i35;
                    iG3 = iG3;
                    i33 = i41;
                }
                break;
            case 5:
                k1 k1Var4 = k1VarL2;
                int i42 = 0;
                int i43 = 4;
                int i44 = 3;
                int iT5 = gz2Var.T();
                int iG4 = g(k1VarL, 5, i2);
                int i45 = i(k1VarL, 5, i2);
                int i46 = 0;
                while (i46 < iT5) {
                    k1 k1Var5 = k1Var4;
                    int iL6 = no2.L(k1Var5, i46, iG4);
                    int iY4 = no2.Y0(k1Var5, i46, i45);
                    double d3 = h32.a;
                    double d4 = d3;
                    double dC10 = d4;
                    double dC11 = dC10;
                    double dC12 = dC11;
                    int i47 = iL6;
                    while (i47 < iY4) {
                        double dJ4 = k1Var5.J(i47, i46);
                        int i48 = iY4;
                        int i49 = i42;
                        double dC13 = wi0.c(k1VarL, i49, i47, dJ4, d3);
                        double d5 = d4;
                        int i50 = i43;
                        k1 k1Var6 = k1VarL;
                        int i51 = i47;
                        double dC14 = wi0.c(k1Var6, 1, i51, dJ4, d5);
                        k1VarL = k1Var6;
                        dC10 = wi0.c(k1VarL, 2, i51, dJ4, dC10);
                        dC11 = wi0.c(k1VarL, i44, i51, dJ4, dC11);
                        dC12 = wi0.c(k1VarL, i50, i51, dJ4, dC12);
                        i47 = i51 + 1;
                        i43 = i50;
                        d3 = dC13;
                        d4 = dC14;
                        iY4 = i48;
                        i42 = i49;
                    }
                    int i52 = i42;
                    int i53 = i43;
                    gz2Var.b0(d3, i52, i46);
                    gz2Var.b0(d4, 1, i46);
                    gz2Var.b0(dC10, 2, i46);
                    i44 = 3;
                    gz2Var.b0(dC11, 3, i46);
                    gz2Var.b0(dC12, i53, i46);
                    i46++;
                    iT5 = iT5;
                    k1Var4 = k1Var5;
                    i42 = i52;
                    iG4 = iG4;
                    i43 = i53;
                }
                break;
            case 6:
                k1 k1Var7 = k1VarL2;
                int i54 = 0;
                int i55 = 3;
                int i56 = 2;
                int i57 = 4;
                int iT6 = gz2Var.T();
                int iG5 = g(k1VarL, 6, i2);
                int i58 = i(k1VarL, 6, i2);
                int i59 = 0;
                while (i59 < iT6) {
                    int iL7 = no2.L(k1Var7, i59, iG5);
                    int iY5 = no2.Y0(k1Var7, i59, i58);
                    double d6 = h32.a;
                    double dC15 = d6;
                    double dC16 = dC15;
                    double dC17 = dC16;
                    double dC18 = dC17;
                    double dC19 = dC18;
                    while (iL7 < iY5) {
                        double dJ5 = k1Var7.J(iL7, i59);
                        int i60 = iL7;
                        int i61 = i54;
                        double dC20 = wi0.c(k1VarL, i61, i60, dJ5, d6);
                        int i62 = i55;
                        k1 k1Var8 = k1VarL;
                        dC15 = wi0.c(k1Var8, 1, i60, dJ5, dC15);
                        k1VarL = k1Var8;
                        dC16 = wi0.c(k1VarL, i56, i60, dJ5, dC16);
                        dC17 = wi0.c(k1VarL, i62, i60, dJ5, dC17);
                        int i63 = i57;
                        dC18 = wi0.c(k1VarL, i63, i60, dJ5, dC18);
                        dC19 = wi0.c(k1VarL, 5, i60, dJ5, dC19);
                        iY5 = iY5;
                        i54 = i61;
                        iL7 = i60 + 1;
                        i55 = i62;
                        i57 = i63;
                        d6 = dC20;
                    }
                    int i64 = i54;
                    int i65 = i57;
                    gz2Var.b0(d6, i64, i59);
                    gz2Var.b0(dC15, 1, i59);
                    i56 = 2;
                    gz2Var.b0(dC16, 2, i59);
                    gz2Var.b0(dC17, 3, i59);
                    gz2Var.b0(dC18, i65, i59);
                    gz2Var.b0(dC19, 5, i59);
                    i59++;
                    iT6 = iT6;
                    i58 = i58;
                    iG5 = iG5;
                    i57 = i65;
                    k1VarL = k1VarL;
                    k1Var7 = k1Var7;
                    i55 = 3;
                    i54 = i64;
                }
                break;
            case 7:
                k1 k1Var9 = k1VarL2;
                int i66 = 6;
                int i67 = 5;
                int i68 = 0;
                int i69 = 4;
                int i70 = 3;
                int iT7 = gz2Var.T();
                int iG6 = g(k1VarL, 7, i2);
                int i71 = i(k1VarL, 7, i2);
                int i72 = 0;
                while (i72 < iT7) {
                    k1 k1Var10 = k1Var9;
                    int iL8 = no2.L(k1Var10, i72, iG6);
                    int iY6 = no2.Y0(k1Var10, i72, i71);
                    double d7 = h32.a;
                    double dC21 = d7;
                    double dC22 = dC21;
                    double dC23 = dC22;
                    double dC24 = dC23;
                    double dC25 = dC24;
                    double d8 = dC25;
                    while (iL8 < iY6) {
                        int i73 = iY6;
                        double dJ6 = k1Var10.J(iL8, i72);
                        k1 k1Var11 = k1Var10;
                        int i74 = i68;
                        double dC26 = wi0.c(k1VarL, i74, iL8, dJ6, d8);
                        double d9 = d7;
                        int i75 = i69;
                        k1 k1Var12 = k1VarL;
                        int i76 = iL8;
                        double dC27 = wi0.c(k1Var12, 1, i76, dJ6, d9);
                        k1VarL = k1Var12;
                        dC21 = wi0.c(k1VarL, 2, i76, dJ6, dC21);
                        dC22 = wi0.c(k1VarL, 3, i76, dJ6, dC22);
                        dC23 = wi0.c(k1VarL, i75, i76, dJ6, dC23);
                        int i77 = i67;
                        dC24 = wi0.c(k1VarL, i77, i76, dJ6, dC24);
                        int i78 = i66;
                        dC25 = wi0.c(k1VarL, i78, i76, dJ6, dC25);
                        iL8 = i76 + 1;
                        i68 = i74;
                        i70 = 3;
                        i69 = i75;
                        i67 = i77;
                        i66 = i78;
                        k1Var10 = k1Var11;
                        iY6 = i73;
                        d8 = dC26;
                        d7 = dC27;
                    }
                    int i79 = i69;
                    int i80 = i70;
                    int i81 = i68;
                    k1 k1Var13 = k1Var10;
                    int i82 = i66;
                    gz2Var.b0(d8, i81, i72);
                    gz2Var.b0(d7, 1, i72);
                    gz2Var.b0(dC21, 2, i72);
                    gz2Var.b0(dC22, i80, i72);
                    gz2Var.b0(dC23, i79, i72);
                    gz2Var.b0(dC24, 5, i72);
                    gz2Var.b0(dC25, i82, i72);
                    i72++;
                    i71 = i71;
                    iT7 = iT7;
                    k1Var9 = k1Var13;
                    iG6 = iG6;
                    i68 = i81;
                    i70 = i80;
                    i69 = i79;
                    i67 = 5;
                    i66 = i82;
                }
                break;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                int i83 = 7;
                int i84 = 0;
                int i85 = 2;
                k1 k1Var14 = k1VarL2;
                int i86 = 4;
                int i87 = 3;
                int iT8 = gz2Var.T();
                k1 k1Var15 = k1VarL;
                int iG7 = g(k1Var15, 8, i2);
                int i88 = i(k1Var15, 8, i2);
                int i89 = 0;
                while (i89 < iT8) {
                    k1 k1Var16 = k1Var14;
                    int iL9 = no2.L(k1Var16, i89, iG7);
                    int iY7 = no2.Y0(k1Var16, i89, i88);
                    double dC28 = h32.a;
                    double dC29 = dC28;
                    double dC30 = dC29;
                    double dC31 = dC30;
                    double dC32 = dC31;
                    double dC33 = dC32;
                    double dC34 = dC33;
                    double d10 = dC34;
                    while (iL9 < iY7) {
                        int i90 = iL9;
                        double dJ7 = k1Var16.J(i90, i89);
                        k1 k1Var17 = k1Var15;
                        int i91 = i83;
                        double dC35 = wi0.c(k1Var17, 0, i90, dJ7, d10);
                        int i92 = i85;
                        i84 = 0;
                        dC28 = wi0.c(k1Var17, 1, i90, dJ7, dC28);
                        dC29 = wi0.c(k1Var17, i92, i90, dJ7, dC29);
                        int i93 = i87;
                        dC30 = wi0.c(k1Var17, i93, i90, dJ7, dC30);
                        int i94 = i86;
                        dC31 = wi0.c(k1Var17, i94, i90, dJ7, dC31);
                        dC32 = wi0.c(k1Var17, 5, i90, dJ7, dC32);
                        dC33 = wi0.c(k1Var17, 6, i90, dJ7, dC33);
                        i83 = i91;
                        dC34 = wi0.c(k1Var17, i83, i90, dJ7, dC34);
                        iL9 = i90 + 1;
                        i87 = i93;
                        i86 = i94;
                        i85 = i92;
                        k1Var16 = k1Var16;
                        k1Var15 = k1Var17;
                        d10 = dC35;
                    }
                    int i95 = i86;
                    double d11 = dC28;
                    k1Var14 = k1Var16;
                    gz2Var.b0(d10, i84, i89);
                    gz2Var.b0(d11, 1, i89);
                    gz2Var.b0(dC29, 2, i89);
                    gz2Var.b0(dC30, 3, i89);
                    gz2Var.b0(dC31, i95, i89);
                    gz2Var.b0(dC32, 5, i89);
                    gz2Var.b0(dC33, 6, i89);
                    i83 = 7;
                    gz2Var.b0(dC34, 7, i89);
                    i89++;
                    iT8 = iT8;
                    i86 = i95;
                    k1Var15 = k1Var15;
                    i85 = 2;
                    i87 = 3;
                    iG7 = iG7;
                }
                break;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                int i96 = 2;
                int i97 = 8;
                k1 k1Var18 = k1VarL2;
                int i98 = 7;
                int i99 = 5;
                int i100 = 4;
                int iT9 = gz2Var.T();
                k1 k1Var19 = k1VarL;
                int iG8 = g(k1Var19, 9, i2);
                int i101 = i(k1Var19, 9, i2);
                int i102 = 0;
                while (i102 < iT9) {
                    k1 k1Var20 = k1Var18;
                    int iL10 = no2.L(k1Var20, i102, iG8);
                    int iY8 = no2.Y0(k1Var20, i102, i101);
                    double d12 = h32.a;
                    int i103 = iL10;
                    double dC36 = d12;
                    double dC37 = dC36;
                    double dC38 = dC37;
                    double dC39 = dC38;
                    double dC40 = dC39;
                    double dC41 = dC40;
                    double dC42 = dC41;
                    double dC43 = dC42;
                    while (i103 < iY8) {
                        k1 k1Var21 = k1Var20;
                        double dJ8 = k1Var21.J(i103, i102);
                        int i104 = i102;
                        int i105 = i103;
                        int i106 = i98;
                        int i107 = i97;
                        k1 k1Var22 = k1Var19;
                        double dC44 = wi0.c(k1Var22, 0, i105, dJ8, d12);
                        int i108 = i96;
                        dC36 = wi0.c(k1Var22, 1, i105, dJ8, dC36);
                        dC37 = wi0.c(k1Var22, i108, i105, dJ8, dC37);
                        i96 = i108;
                        dC38 = wi0.c(k1Var22, 3, i105, dJ8, dC38);
                        int i109 = i100;
                        dC39 = wi0.c(k1Var22, i109, i105, dJ8, dC39);
                        dC40 = wi0.c(k1Var22, i99, i105, dJ8, dC40);
                        dC41 = wi0.c(k1Var22, 6, i105, dJ8, dC41);
                        dC42 = wi0.c(k1Var22, i106, i105, dJ8, dC42);
                        i97 = i107;
                        dC43 = wi0.c(k1Var22, i97, i105, dJ8, dC43);
                        int i110 = i105 + 1;
                        i102 = i104;
                        i103 = i110;
                        k1Var20 = k1Var21;
                        i100 = i109;
                        k1Var19 = k1Var22;
                        d12 = dC44;
                        i99 = 5;
                        i98 = 7;
                    }
                    int i111 = i102;
                    k1Var18 = k1Var20;
                    gz2Var.b0(d12, 0, i111);
                    gz2Var.b0(dC36, 1, i111);
                    gz2Var.b0(dC37, i96, i111);
                    gz2Var.b0(dC38, 3, i111);
                    gz2Var.b0(dC39, 4, i111);
                    gz2Var.b0(dC40, 5, i111);
                    gz2Var.b0(dC41, 6, i111);
                    gz2Var.b0(dC42, 7, i111);
                    gz2Var.b0(dC43, 8, i111);
                    i102 = i111 + 1;
                    i98 = 7;
                    i97 = 8;
                    iT9 = iT9;
                    i101 = i101;
                    i100 = 4;
                    i99 = 5;
                    k1Var19 = k1Var19;
                }
                break;
            default:
                int iT10 = gz2Var.T();
                int iG9 = g(k1VarL, 10, i2);
                int i112 = i(k1VarL, 10, i2);
                int i113 = 0;
                while (i113 < iT10) {
                    int iL11 = no2.L(k1VarL2, i113, iG9);
                    int iY9 = no2.Y0(k1VarL2, i113, i112);
                    double d13 = h32.a;
                    double dC45 = d13;
                    double dC46 = dC45;
                    double dC47 = dC46;
                    double dC48 = dC47;
                    double dC49 = dC48;
                    double dC50 = dC49;
                    double dC51 = dC50;
                    double dC52 = dC51;
                    double d14 = dC52;
                    while (iL11 < iY9) {
                        int i114 = iY9;
                        double dJ9 = k1VarL2.J(iL11, i113);
                        double dC53 = wi0.c(k1VarL, i5, iL11, dJ9, d14);
                        int i115 = i5;
                        double d15 = d13;
                        int i116 = iG9;
                        k1 k1Var23 = k1VarL;
                        int i117 = iL11;
                        double dC54 = wi0.c(k1Var23, 1, i117, dJ9, d15);
                        int i118 = i15;
                        k1VarL = k1Var23;
                        dC45 = wi0.c(k1VarL, i118, i117, dJ9, dC45);
                        int i119 = i14;
                        dC46 = wi0.c(k1VarL, i119, i117, dJ9, dC46);
                        int i120 = i13;
                        dC47 = wi0.c(k1VarL, i120, i117, dJ9, dC47);
                        int i121 = i12;
                        dC48 = wi0.c(k1VarL, i121, i117, dJ9, dC48);
                        int i122 = i11;
                        dC49 = wi0.c(k1VarL, i122, i117, dJ9, dC49);
                        dC50 = wi0.c(k1VarL, i10, i117, dJ9, dC50);
                        dC51 = wi0.c(k1VarL, 8, i117, dJ9, dC51);
                        dC52 = wi0.c(k1VarL, 9, i117, dJ9, dC52);
                        iL11 = i117 + 1;
                        i5 = i115;
                        i14 = i119;
                        i13 = i120;
                        i15 = i118;
                        iG9 = i116;
                        iY9 = i114;
                        d14 = dC53;
                        d13 = dC54;
                        i12 = i121;
                        i11 = i122;
                        i10 = 7;
                    }
                    int i123 = i5;
                    double d16 = d13;
                    int i124 = iG9;
                    int i125 = i15;
                    gz2Var.b0(d14, i123, i113);
                    gz2Var.b0(d16, 1, i113);
                    gz2Var.b0(dC45, i125, i113);
                    gz2Var.b0(dC46, 3, i113);
                    gz2Var.b0(dC47, 4, i113);
                    gz2Var.b0(dC48, 5, i113);
                    gz2Var.b0(dC49, 6, i113);
                    gz2Var.b0(dC50, 7, i113);
                    gz2Var.b0(dC51, 8, i113);
                    gz2Var.b0(dC52, 9, i113);
                    i113++;
                    i112 = i112;
                    i5 = i123;
                    i14 = 3;
                    i13 = 4;
                    k1VarL2 = k1VarL2;
                    i12 = 5;
                    i15 = i125;
                    iG9 = i124;
                    i11 = 6;
                    i10 = 7;
                    k1VarL = k1VarL;
                }
                break;
        }
    }

    public static int f(k1 k1Var, int i2, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = Math.min(i3, no2.L(k1Var, i4, 0));
        }
        return i3;
    }

    public static int g(k1 k1Var, int i2, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = Math.min(i3, Math.max(k1Var.n0(i4), 0));
        }
        return i3;
    }

    public static int h(k1 k1Var, int i2, int i3) {
        int iMax = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            iMax = Math.max(iMax, no2.Y0(k1Var, i4, i3));
        }
        return iMax;
    }

    public static int i(k1 k1Var, int i2, int i3) {
        int iMax = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            iMax = Math.max(iMax, Math.min(k1Var.V(i4), i3));
        }
        return iMax;
    }

    public static k1 l(int i2, int i3, a1 a1Var) {
        if (!(a1Var instanceof k1)) {
            return null;
        }
        k1 k1Var = (k1) a1Var;
        if (k1Var.h1() == i2 && k1Var.B1() == i3) {
            return k1Var;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [gi1] */
    /* JADX WARN: Type inference failed for: r1v2, types: [gi1] */
    public static gi1 m(int i2) {
        if (i2 == 1) {
            final byte b = 0;
            return new fz2() { // from class: gi1
                @Override // defpackage.fz2
                public final void a(final gz2 gz2Var, a1 a1Var, final int i3, final a1 a1Var2) {
                    final vc2[] vc2VarArr;
                    int iMax;
                    int iL;
                    switch (b) {
                        case 0:
                            ii1.a(gz2Var, a1Var, i3, a1Var2);
                            break;
                        default:
                            int iZ1 = gz2Var.Z1();
                            int iT = gz2Var.T();
                            if (iZ1 == 1) {
                                ii1.a(gz2Var, a1Var, i3, a1Var2);
                            } else {
                                int i4 = 0;
                                if (i3 == 0) {
                                    vc2 vc2VarP = ii1.p(gz2Var);
                                    for (int i5 = 0; i5 < iT; i5++) {
                                        for (int i6 = 0; i6 < iZ1; i6++) {
                                            gz2Var.y0(i6, i5, vc2VarP);
                                        }
                                    }
                                } else {
                                    final vc2 vc2VarP2 = ii1.p(a1Var);
                                    int[] iArr = new int[i3];
                                    final int[] iArr2 = new int[i3];
                                    if (a1Var instanceof or0) {
                                        vc2[] vc2VarArr2 = (vc2[]) ((or0) a1Var).j;
                                        Arrays.fill(iArr2, iZ1);
                                        vc2VarArr = vc2VarArr2;
                                    } else {
                                        vc2VarArr = (vc2[]) Array.newInstance(vc2VarP2.getClass(), iZ1 * i3);
                                        Arrays.fill(vc2VarArr, vc2VarP2);
                                        k1 k1VarL = ii1.l(iZ1, i3, a1Var);
                                        int i7 = 0;
                                        while (i7 < i3) {
                                            if (k1VarL != null) {
                                                iL = no2.L(k1VarL, i7, i4);
                                                iMax = Math.max(iL, no2.Y0(k1VarL, i7, iZ1));
                                            } else {
                                                iMax = iZ1;
                                                iL = i4;
                                            }
                                            iArr[i7] = iL;
                                            iArr2[i7] = iMax;
                                            int i8 = i7 * iZ1;
                                            while (iL < iMax) {
                                                int i9 = i8 + iL;
                                                vc2[] vc2VarArr3 = vc2VarArr;
                                                int[] iArr3 = iArr;
                                                vc2VarArr3[i9] = (vc2) (k1VarL != null ? k1VarL.H(iL, i7) : a1Var.G(i9));
                                                iL++;
                                                iArr = iArr3;
                                                vc2VarArr = vc2VarArr3;
                                                iMax = iMax;
                                            }
                                            i7++;
                                            i4 = 0;
                                        }
                                    }
                                    final int[] iArr4 = iArr;
                                    vc2[] vc2VarArr4 = a1Var2 instanceof or0 ? (vc2[]) ((or0) a1Var2).j : null;
                                    vc2[] vc2VarArr5 = gz2Var instanceof or0 ? (vc2[]) ((or0) gz2Var).j : null;
                                    int iK = oe1.k(ii1.j, iZ1, i3);
                                    if (iT > iK) {
                                        u8 u8Var = ii1.h;
                                        u8Var.a = iK;
                                        final vc2[] vc2VarArr6 = vc2VarArr4;
                                        final vc2[] vc2VarArr7 = vc2VarArr5;
                                        u8Var.b(0, iT, new sb0() { // from class: ei1
                                            @Override // defpackage.sb0
                                            public final void a(int i10, int i11) {
                                                ii1.c(gz2Var, i10, i11, vc2VarArr, iArr4, iArr2, i3, a1Var2, vc2VarArr6, vc2VarArr7, vc2VarP2);
                                            }
                                        });
                                    } else {
                                        ii1.c(gz2Var, 0, iT, vc2VarArr, iArr4, iArr2, i3, a1Var2, vc2VarArr4, vc2VarArr5, vc2VarP2);
                                    }
                                }
                            }
                            break;
                    }
                }
            };
        }
        final byte b2 = 1;
        return new fz2() { // from class: gi1
            @Override // defpackage.fz2
            public final void a(final gz2 gz2Var, a1 a1Var, final int i3, final a1 a1Var2) {
                final vc2[] vc2VarArr;
                int iMax;
                int iL;
                switch (b2) {
                    case 0:
                        ii1.a(gz2Var, a1Var, i3, a1Var2);
                        break;
                    default:
                        int iZ1 = gz2Var.Z1();
                        int iT = gz2Var.T();
                        if (iZ1 == 1) {
                            ii1.a(gz2Var, a1Var, i3, a1Var2);
                        } else {
                            int i4 = 0;
                            if (i3 == 0) {
                                vc2 vc2VarP = ii1.p(gz2Var);
                                for (int i5 = 0; i5 < iT; i5++) {
                                    for (int i6 = 0; i6 < iZ1; i6++) {
                                        gz2Var.y0(i6, i5, vc2VarP);
                                    }
                                }
                            } else {
                                final vc2 vc2VarP2 = ii1.p(a1Var);
                                int[] iArr = new int[i3];
                                final int[] iArr2 = new int[i3];
                                if (a1Var instanceof or0) {
                                    vc2[] vc2VarArr2 = (vc2[]) ((or0) a1Var).j;
                                    Arrays.fill(iArr2, iZ1);
                                    vc2VarArr = vc2VarArr2;
                                } else {
                                    vc2VarArr = (vc2[]) Array.newInstance(vc2VarP2.getClass(), iZ1 * i3);
                                    Arrays.fill(vc2VarArr, vc2VarP2);
                                    k1 k1VarL = ii1.l(iZ1, i3, a1Var);
                                    int i7 = 0;
                                    while (i7 < i3) {
                                        if (k1VarL != null) {
                                            iL = no2.L(k1VarL, i7, i4);
                                            iMax = Math.max(iL, no2.Y0(k1VarL, i7, iZ1));
                                        } else {
                                            iMax = iZ1;
                                            iL = i4;
                                        }
                                        iArr[i7] = iL;
                                        iArr2[i7] = iMax;
                                        int i8 = i7 * iZ1;
                                        while (iL < iMax) {
                                            int i9 = i8 + iL;
                                            vc2[] vc2VarArr3 = vc2VarArr;
                                            int[] iArr3 = iArr;
                                            vc2VarArr3[i9] = (vc2) (k1VarL != null ? k1VarL.H(iL, i7) : a1Var.G(i9));
                                            iL++;
                                            iArr = iArr3;
                                            vc2VarArr = vc2VarArr3;
                                            iMax = iMax;
                                        }
                                        i7++;
                                        i4 = 0;
                                    }
                                }
                                final int[] iArr4 = iArr;
                                vc2[] vc2VarArr4 = a1Var2 instanceof or0 ? (vc2[]) ((or0) a1Var2).j : null;
                                vc2[] vc2VarArr5 = gz2Var instanceof or0 ? (vc2[]) ((or0) gz2Var).j : null;
                                int iK = oe1.k(ii1.j, iZ1, i3);
                                if (iT > iK) {
                                    u8 u8Var = ii1.h;
                                    u8Var.a = iK;
                                    final vc2[] vc2VarArr6 = vc2VarArr4;
                                    final vc2[] vc2VarArr7 = vc2VarArr5;
                                    u8Var.b(0, iT, new sb0() { // from class: ei1
                                        @Override // defpackage.sb0
                                        public final void a(int i10, int i11) {
                                            ii1.c(gz2Var, i10, i11, vc2VarArr, iArr4, iArr2, i3, a1Var2, vc2VarArr6, vc2VarArr7, vc2VarP2);
                                        }
                                    });
                                } else {
                                    ii1.c(gz2Var, 0, iT, vc2VarArr, iArr4, iArr2, i3, a1Var2, vc2VarArr4, vc2VarArr5, vc2VarP2);
                                }
                            }
                        }
                        break;
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [fi1] */
    /* JADX WARN: Type inference failed for: r1v2, types: [fi1] */
    /* JADX WARN: Type inference failed for: r1v3, types: [fi1] */
    /* JADX WARN: Type inference failed for: r1v4, types: [fi1] */
    /* JADX WARN: Type inference failed for: r1v5, types: [fi1] */
    /* JADX WARN: Type inference failed for: r1v6, types: [fi1] */
    public static fi1 o(int i2, int i3) {
        if (i2 == 5 && i3 == 5) {
            final byte b = 0;
            return new fz2() { // from class: fi1
                @Override // defpackage.fz2
                public final void a(gz2 gz2Var, a1 a1Var, int i4, a1 a1Var2) {
                    int i5 = 2;
                    int i6 = 1;
                    int i7 = 0;
                    switch (b) {
                        case 0:
                            k1 k1VarL = ii1.l(5, i4, a1Var);
                            k1 k1VarL2 = ii1.l(i4, 5, a1Var2);
                            if (k1VarL == null || k1VarL2 == null) {
                                ii1.e(gz2Var, a1Var, i4, a1Var2);
                            } else {
                                int iMax = Math.max(ii1.g(k1VarL, 5, i4), ii1.f(k1VarL2, 5, i4));
                                int iMin = Math.min(ii1.i(k1VarL, 5, i4), ii1.h(k1VarL2, 5, i4));
                                double d = h32.a;
                                double d2 = d;
                                double d3 = d2;
                                double d4 = d3;
                                double d5 = d4;
                                double d6 = d5;
                                double d7 = d6;
                                double d8 = d7;
                                double d9 = d8;
                                double d10 = d9;
                                double d11 = d10;
                                double d12 = d11;
                                double d13 = d12;
                                double d14 = d13;
                                double d15 = d14;
                                double d16 = d15;
                                double d17 = d16;
                                double d18 = d17;
                                double d19 = d18;
                                double d20 = d19;
                                double d21 = d20;
                                double d22 = d21;
                                double d23 = d22;
                                double d24 = d23;
                                double d25 = d24;
                                while (iMax < iMin) {
                                    double dJ = k1VarL.J(0, iMax);
                                    double dJ2 = k1VarL.J(1, iMax);
                                    double dJ3 = k1VarL.J(2, iMax);
                                    double dJ4 = k1VarL.J(3, iMax);
                                    double dJ5 = k1VarL.J(4, iMax);
                                    double dJ6 = k1VarL2.J(iMax, 0);
                                    double dJ7 = k1VarL2.J(iMax, 1);
                                    double dJ8 = k1VarL2.J(iMax, 2);
                                    double dJ9 = k1VarL2.J(iMax, 3);
                                    double dJ10 = k1VarL2.J(iMax, 4);
                                    d = (dJ * dJ6) + d;
                                    d3 = (dJ2 * dJ6) + d3;
                                    d4 = (dJ3 * dJ6) + d4;
                                    d5 = (dJ4 * dJ6) + d5;
                                    d7 = (dJ * dJ7) + d7;
                                    d8 = (dJ2 * dJ7) + d8;
                                    d9 = (dJ3 * dJ7) + d9;
                                    d10 = (dJ4 * dJ7) + d10;
                                    d11 = (dJ7 * dJ5) + d11;
                                    d12 = (dJ * dJ8) + d12;
                                    d13 = (dJ2 * dJ8) + d13;
                                    d14 = (dJ3 * dJ8) + d14;
                                    d15 = (dJ4 * dJ8) + d15;
                                    d16 = (dJ8 * dJ5) + d16;
                                    d17 = (dJ * dJ9) + d17;
                                    d18 = (dJ2 * dJ9) + d18;
                                    d19 = (dJ3 * dJ9) + d19;
                                    d20 = (dJ4 * dJ9) + d20;
                                    d21 = (dJ9 * dJ5) + d21;
                                    d22 = (dJ * dJ10) + d22;
                                    d23 = (dJ2 * dJ10) + d23;
                                    d24 = (dJ3 * dJ10) + d24;
                                    d25 = (dJ4 * dJ10) + d25;
                                    d6 = (dJ5 * dJ10) + d6;
                                    iMax++;
                                    d2 = (dJ6 * dJ5) + d2;
                                }
                                gz2Var.b0(d, 0, 0);
                                gz2Var.b0(d3, 1, 0);
                                gz2Var.b0(d4, 2, 0);
                                gz2Var.b0(d5, 3, 0);
                                gz2Var.b0(d2, 4, 0);
                                gz2Var.b0(d7, 0, 1);
                                gz2Var.b0(d8, 1, 1);
                                gz2Var.b0(d9, 2, 1);
                                gz2Var.b0(d10, 3, 1);
                                gz2Var.b0(d11, 4, 1);
                                gz2Var.b0(d12, 0, 2);
                                gz2Var.b0(d13, 1, 2);
                                gz2Var.b0(d14, 2, 2);
                                gz2Var.b0(d15, 3, 2);
                                gz2Var.b0(d16, 4, 2);
                                gz2Var.b0(d17, 0, 3);
                                gz2Var.b0(d18, 1, 3);
                                gz2Var.b0(d19, 2, 3);
                                gz2Var.b0(d20, 3, 3);
                                gz2Var.b0(d21, 4, 3);
                                gz2Var.b0(d22, 0, 4);
                                gz2Var.b0(d23, 1, 4);
                                gz2Var.b0(d24, 2, 4);
                                gz2Var.b0(d25, 3, 4);
                                gz2Var.b0(d6, 4, 4);
                            }
                            break;
                        case 1:
                            k1 k1VarL3 = ii1.l(4, i4, a1Var);
                            k1 k1VarL4 = ii1.l(i4, 4, a1Var2);
                            if (k1VarL3 == null || k1VarL4 == null) {
                                ii1.e(gz2Var, a1Var, i4, a1Var2);
                            } else {
                                int iMax2 = Math.max(ii1.g(k1VarL3, 4, i4), ii1.f(k1VarL4, 4, i4));
                                int iMin2 = Math.min(ii1.i(k1VarL3, 4, i4), ii1.h(k1VarL4, 4, i4));
                                double d26 = h32.a;
                                double d27 = d26;
                                double d28 = d27;
                                double d29 = d28;
                                double d30 = d29;
                                double d31 = d30;
                                double d32 = d31;
                                double d33 = d32;
                                double d34 = d33;
                                double d35 = d34;
                                double d36 = d35;
                                double d37 = d36;
                                double d38 = d37;
                                double d39 = d38;
                                double d40 = d39;
                                double d41 = d40;
                                while (iMax2 < iMin2) {
                                    double dJ11 = k1VarL3.J(0, iMax2);
                                    double dJ12 = k1VarL3.J(1, iMax2);
                                    double dJ13 = k1VarL3.J(2, iMax2);
                                    double dJ14 = k1VarL3.J(3, iMax2);
                                    double dJ15 = k1VarL4.J(iMax2, 0);
                                    double dJ16 = k1VarL4.J(iMax2, 1);
                                    double dJ17 = k1VarL4.J(iMax2, 2);
                                    double dJ18 = k1VarL4.J(iMax2, 3);
                                    d26 = (dJ11 * dJ15) + d26;
                                    d27 = (dJ12 * dJ15) + d27;
                                    d28 = (dJ13 * dJ15) + d28;
                                    d29 = (dJ15 * dJ14) + d29;
                                    d30 = (dJ11 * dJ16) + d30;
                                    d31 = (dJ12 * dJ16) + d31;
                                    d32 = (dJ13 * dJ16) + d32;
                                    d33 = (dJ16 * dJ14) + d33;
                                    d34 = (dJ11 * dJ17) + d34;
                                    d35 = (dJ12 * dJ17) + d35;
                                    d36 = (dJ13 * dJ17) + d36;
                                    d37 = (dJ17 * dJ14) + d37;
                                    d38 = (dJ11 * dJ18) + d38;
                                    d39 = (dJ12 * dJ18) + d39;
                                    d40 = (dJ13 * dJ18) + d40;
                                    d41 = (dJ14 * dJ18) + d41;
                                    iMax2++;
                                    iMin2 = iMin2;
                                    k1VarL4 = k1VarL4;
                                }
                                gz2Var.b0(d26, 0, 0);
                                gz2Var.b0(d27, 1, 0);
                                gz2Var.b0(d28, 2, 0);
                                gz2Var.b0(d29, 3, 0);
                                gz2Var.b0(d30, 0, 1);
                                gz2Var.b0(d31, 1, 1);
                                gz2Var.b0(d32, 2, 1);
                                gz2Var.b0(d33, 3, 1);
                                gz2Var.b0(d34, 0, 2);
                                gz2Var.b0(d35, 1, 2);
                                gz2Var.b0(d36, 2, 2);
                                gz2Var.b0(d37, 3, 2);
                                gz2Var.b0(d38, 0, 3);
                                gz2Var.b0(d39, 1, 3);
                                gz2Var.b0(d40, 2, 3);
                                gz2Var.b0(d41, 3, 3);
                            }
                            break;
                        case 2:
                            k1 k1VarL5 = ii1.l(3, i4, a1Var);
                            k1 k1VarL6 = ii1.l(i4, 3, a1Var2);
                            if (k1VarL5 == null || k1VarL6 == null) {
                                ii1.e(gz2Var, a1Var, i4, a1Var2);
                            } else {
                                int iMax3 = Math.max(ii1.g(k1VarL5, 3, i4), ii1.f(k1VarL6, 3, i4));
                                int iMin3 = Math.min(ii1.i(k1VarL5, 3, i4), ii1.h(k1VarL6, 3, i4));
                                double d42 = h32.a;
                                double d43 = d42;
                                double d44 = d43;
                                double d45 = d44;
                                double d46 = d45;
                                double d47 = d46;
                                double d48 = d47;
                                double d49 = d48;
                                double d50 = d49;
                                while (iMax3 < iMin3) {
                                    double dJ19 = k1VarL5.J(i7, iMax3);
                                    double dJ20 = k1VarL5.J(i6, iMax3);
                                    double dJ21 = k1VarL5.J(i5, iMax3);
                                    double dJ22 = k1VarL6.J(iMax3, i7);
                                    double dJ23 = k1VarL6.J(iMax3, i6);
                                    double dJ24 = k1VarL6.J(iMax3, i5);
                                    d43 = (dJ20 * dJ22) + d43;
                                    d44 = (dJ22 * dJ21) + d44;
                                    d45 = (dJ19 * dJ23) + d45;
                                    d46 = (dJ20 * dJ23) + d46;
                                    d47 = (dJ23 * dJ21) + d47;
                                    d48 = (dJ19 * dJ24) + d48;
                                    d49 = (dJ20 * dJ24) + d49;
                                    d50 = (dJ21 * dJ24) + d50;
                                    iMax3++;
                                    d42 = (dJ19 * dJ22) + d42;
                                    i5 = 2;
                                    i6 = 1;
                                    i7 = 0;
                                }
                                int i8 = i7;
                                gz2Var.b0(d42, i8, i8);
                                gz2Var.b0(d43, 1, i8);
                                gz2Var.b0(d44, 2, i8);
                                gz2Var.b0(d45, i8, 1);
                                gz2Var.b0(d46, 1, 1);
                                gz2Var.b0(d47, 2, 1);
                                gz2Var.b0(d48, i8, 2);
                                gz2Var.b0(d49, 1, 2);
                                gz2Var.b0(d50, 2, 2);
                            }
                            break;
                        case 3:
                            k1 k1VarL7 = ii1.l(2, i4, a1Var);
                            k1 k1VarL8 = ii1.l(i4, 2, a1Var2);
                            if (k1VarL7 == null || k1VarL8 == null) {
                                ii1.e(gz2Var, a1Var, i4, a1Var2);
                            } else {
                                int iMin4 = Math.min(ii1.i(k1VarL7, 2, i4), ii1.h(k1VarL8, 2, i4));
                                double d51 = h32.a;
                                double d52 = d51;
                                double d53 = d52;
                                double d54 = d53;
                                for (int iMax4 = Math.max(ii1.g(k1VarL7, 2, i4), ii1.f(k1VarL8, 2, i4)); iMax4 < iMin4; iMax4++) {
                                    double dJ25 = k1VarL7.J(0, iMax4);
                                    double dJ26 = k1VarL7.J(1, iMax4);
                                    double dJ27 = k1VarL8.J(iMax4, 0);
                                    double dJ28 = k1VarL8.J(iMax4, 1);
                                    d51 = (dJ25 * dJ27) + d51;
                                    d52 = (dJ27 * dJ26) + d52;
                                    d53 = (dJ25 * dJ28) + d53;
                                    d54 = (dJ26 * dJ28) + d54;
                                }
                                gz2Var.b0(d51, 0, 0);
                                gz2Var.b0(d52, 1, 0);
                                gz2Var.b0(d53, 0, 1);
                                gz2Var.b0(d54, 1, 1);
                            }
                            break;
                        case 4:
                            ii1.b(gz2Var, a1Var, i4, a1Var2);
                            break;
                        default:
                            ii1.e(gz2Var, a1Var, i4, a1Var2);
                            break;
                    }
                }
            };
        }
        if (i2 == 4 && i3 == 4) {
            final byte b2 = 1;
            return new fz2() { // from class: fi1
                @Override // defpackage.fz2
                public final void a(gz2 gz2Var, a1 a1Var, int i4, a1 a1Var2) {
                    int i5 = 2;
                    int i6 = 1;
                    int i7 = 0;
                    switch (b2) {
                        case 0:
                            k1 k1VarL = ii1.l(5, i4, a1Var);
                            k1 k1VarL2 = ii1.l(i4, 5, a1Var2);
                            if (k1VarL == null || k1VarL2 == null) {
                                ii1.e(gz2Var, a1Var, i4, a1Var2);
                            } else {
                                int iMax = Math.max(ii1.g(k1VarL, 5, i4), ii1.f(k1VarL2, 5, i4));
                                int iMin = Math.min(ii1.i(k1VarL, 5, i4), ii1.h(k1VarL2, 5, i4));
                                double d = h32.a;
                                double d2 = d;
                                double d3 = d2;
                                double d4 = d3;
                                double d5 = d4;
                                double d6 = d5;
                                double d7 = d6;
                                double d8 = d7;
                                double d9 = d8;
                                double d10 = d9;
                                double d11 = d10;
                                double d12 = d11;
                                double d13 = d12;
                                double d14 = d13;
                                double d15 = d14;
                                double d16 = d15;
                                double d17 = d16;
                                double d18 = d17;
                                double d19 = d18;
                                double d20 = d19;
                                double d21 = d20;
                                double d22 = d21;
                                double d23 = d22;
                                double d24 = d23;
                                double d25 = d24;
                                while (iMax < iMin) {
                                    double dJ = k1VarL.J(0, iMax);
                                    double dJ2 = k1VarL.J(1, iMax);
                                    double dJ3 = k1VarL.J(2, iMax);
                                    double dJ4 = k1VarL.J(3, iMax);
                                    double dJ5 = k1VarL.J(4, iMax);
                                    double dJ6 = k1VarL2.J(iMax, 0);
                                    double dJ7 = k1VarL2.J(iMax, 1);
                                    double dJ8 = k1VarL2.J(iMax, 2);
                                    double dJ9 = k1VarL2.J(iMax, 3);
                                    double dJ10 = k1VarL2.J(iMax, 4);
                                    d = (dJ * dJ6) + d;
                                    d3 = (dJ2 * dJ6) + d3;
                                    d4 = (dJ3 * dJ6) + d4;
                                    d5 = (dJ4 * dJ6) + d5;
                                    d7 = (dJ * dJ7) + d7;
                                    d8 = (dJ2 * dJ7) + d8;
                                    d9 = (dJ3 * dJ7) + d9;
                                    d10 = (dJ4 * dJ7) + d10;
                                    d11 = (dJ7 * dJ5) + d11;
                                    d12 = (dJ * dJ8) + d12;
                                    d13 = (dJ2 * dJ8) + d13;
                                    d14 = (dJ3 * dJ8) + d14;
                                    d15 = (dJ4 * dJ8) + d15;
                                    d16 = (dJ8 * dJ5) + d16;
                                    d17 = (dJ * dJ9) + d17;
                                    d18 = (dJ2 * dJ9) + d18;
                                    d19 = (dJ3 * dJ9) + d19;
                                    d20 = (dJ4 * dJ9) + d20;
                                    d21 = (dJ9 * dJ5) + d21;
                                    d22 = (dJ * dJ10) + d22;
                                    d23 = (dJ2 * dJ10) + d23;
                                    d24 = (dJ3 * dJ10) + d24;
                                    d25 = (dJ4 * dJ10) + d25;
                                    d6 = (dJ5 * dJ10) + d6;
                                    iMax++;
                                    d2 = (dJ6 * dJ5) + d2;
                                }
                                gz2Var.b0(d, 0, 0);
                                gz2Var.b0(d3, 1, 0);
                                gz2Var.b0(d4, 2, 0);
                                gz2Var.b0(d5, 3, 0);
                                gz2Var.b0(d2, 4, 0);
                                gz2Var.b0(d7, 0, 1);
                                gz2Var.b0(d8, 1, 1);
                                gz2Var.b0(d9, 2, 1);
                                gz2Var.b0(d10, 3, 1);
                                gz2Var.b0(d11, 4, 1);
                                gz2Var.b0(d12, 0, 2);
                                gz2Var.b0(d13, 1, 2);
                                gz2Var.b0(d14, 2, 2);
                                gz2Var.b0(d15, 3, 2);
                                gz2Var.b0(d16, 4, 2);
                                gz2Var.b0(d17, 0, 3);
                                gz2Var.b0(d18, 1, 3);
                                gz2Var.b0(d19, 2, 3);
                                gz2Var.b0(d20, 3, 3);
                                gz2Var.b0(d21, 4, 3);
                                gz2Var.b0(d22, 0, 4);
                                gz2Var.b0(d23, 1, 4);
                                gz2Var.b0(d24, 2, 4);
                                gz2Var.b0(d25, 3, 4);
                                gz2Var.b0(d6, 4, 4);
                            }
                            break;
                        case 1:
                            k1 k1VarL3 = ii1.l(4, i4, a1Var);
                            k1 k1VarL4 = ii1.l(i4, 4, a1Var2);
                            if (k1VarL3 == null || k1VarL4 == null) {
                                ii1.e(gz2Var, a1Var, i4, a1Var2);
                            } else {
                                int iMax2 = Math.max(ii1.g(k1VarL3, 4, i4), ii1.f(k1VarL4, 4, i4));
                                int iMin2 = Math.min(ii1.i(k1VarL3, 4, i4), ii1.h(k1VarL4, 4, i4));
                                double d26 = h32.a;
                                double d27 = d26;
                                double d28 = d27;
                                double d29 = d28;
                                double d30 = d29;
                                double d31 = d30;
                                double d32 = d31;
                                double d33 = d32;
                                double d34 = d33;
                                double d35 = d34;
                                double d36 = d35;
                                double d37 = d36;
                                double d38 = d37;
                                double d39 = d38;
                                double d40 = d39;
                                double d41 = d40;
                                while (iMax2 < iMin2) {
                                    double dJ11 = k1VarL3.J(0, iMax2);
                                    double dJ12 = k1VarL3.J(1, iMax2);
                                    double dJ13 = k1VarL3.J(2, iMax2);
                                    double dJ14 = k1VarL3.J(3, iMax2);
                                    double dJ15 = k1VarL4.J(iMax2, 0);
                                    double dJ16 = k1VarL4.J(iMax2, 1);
                                    double dJ17 = k1VarL4.J(iMax2, 2);
                                    double dJ18 = k1VarL4.J(iMax2, 3);
                                    d26 = (dJ11 * dJ15) + d26;
                                    d27 = (dJ12 * dJ15) + d27;
                                    d28 = (dJ13 * dJ15) + d28;
                                    d29 = (dJ15 * dJ14) + d29;
                                    d30 = (dJ11 * dJ16) + d30;
                                    d31 = (dJ12 * dJ16) + d31;
                                    d32 = (dJ13 * dJ16) + d32;
                                    d33 = (dJ16 * dJ14) + d33;
                                    d34 = (dJ11 * dJ17) + d34;
                                    d35 = (dJ12 * dJ17) + d35;
                                    d36 = (dJ13 * dJ17) + d36;
                                    d37 = (dJ17 * dJ14) + d37;
                                    d38 = (dJ11 * dJ18) + d38;
                                    d39 = (dJ12 * dJ18) + d39;
                                    d40 = (dJ13 * dJ18) + d40;
                                    d41 = (dJ14 * dJ18) + d41;
                                    iMax2++;
                                    iMin2 = iMin2;
                                    k1VarL4 = k1VarL4;
                                }
                                gz2Var.b0(d26, 0, 0);
                                gz2Var.b0(d27, 1, 0);
                                gz2Var.b0(d28, 2, 0);
                                gz2Var.b0(d29, 3, 0);
                                gz2Var.b0(d30, 0, 1);
                                gz2Var.b0(d31, 1, 1);
                                gz2Var.b0(d32, 2, 1);
                                gz2Var.b0(d33, 3, 1);
                                gz2Var.b0(d34, 0, 2);
                                gz2Var.b0(d35, 1, 2);
                                gz2Var.b0(d36, 2, 2);
                                gz2Var.b0(d37, 3, 2);
                                gz2Var.b0(d38, 0, 3);
                                gz2Var.b0(d39, 1, 3);
                                gz2Var.b0(d40, 2, 3);
                                gz2Var.b0(d41, 3, 3);
                            }
                            break;
                        case 2:
                            k1 k1VarL5 = ii1.l(3, i4, a1Var);
                            k1 k1VarL6 = ii1.l(i4, 3, a1Var2);
                            if (k1VarL5 == null || k1VarL6 == null) {
                                ii1.e(gz2Var, a1Var, i4, a1Var2);
                            } else {
                                int iMax3 = Math.max(ii1.g(k1VarL5, 3, i4), ii1.f(k1VarL6, 3, i4));
                                int iMin3 = Math.min(ii1.i(k1VarL5, 3, i4), ii1.h(k1VarL6, 3, i4));
                                double d42 = h32.a;
                                double d43 = d42;
                                double d44 = d43;
                                double d45 = d44;
                                double d46 = d45;
                                double d47 = d46;
                                double d48 = d47;
                                double d49 = d48;
                                double d50 = d49;
                                while (iMax3 < iMin3) {
                                    double dJ19 = k1VarL5.J(i7, iMax3);
                                    double dJ20 = k1VarL5.J(i6, iMax3);
                                    double dJ21 = k1VarL5.J(i5, iMax3);
                                    double dJ22 = k1VarL6.J(iMax3, i7);
                                    double dJ23 = k1VarL6.J(iMax3, i6);
                                    double dJ24 = k1VarL6.J(iMax3, i5);
                                    d43 = (dJ20 * dJ22) + d43;
                                    d44 = (dJ22 * dJ21) + d44;
                                    d45 = (dJ19 * dJ23) + d45;
                                    d46 = (dJ20 * dJ23) + d46;
                                    d47 = (dJ23 * dJ21) + d47;
                                    d48 = (dJ19 * dJ24) + d48;
                                    d49 = (dJ20 * dJ24) + d49;
                                    d50 = (dJ21 * dJ24) + d50;
                                    iMax3++;
                                    d42 = (dJ19 * dJ22) + d42;
                                    i5 = 2;
                                    i6 = 1;
                                    i7 = 0;
                                }
                                int i8 = i7;
                                gz2Var.b0(d42, i8, i8);
                                gz2Var.b0(d43, 1, i8);
                                gz2Var.b0(d44, 2, i8);
                                gz2Var.b0(d45, i8, 1);
                                gz2Var.b0(d46, 1, 1);
                                gz2Var.b0(d47, 2, 1);
                                gz2Var.b0(d48, i8, 2);
                                gz2Var.b0(d49, 1, 2);
                                gz2Var.b0(d50, 2, 2);
                            }
                            break;
                        case 3:
                            k1 k1VarL7 = ii1.l(2, i4, a1Var);
                            k1 k1VarL8 = ii1.l(i4, 2, a1Var2);
                            if (k1VarL7 == null || k1VarL8 == null) {
                                ii1.e(gz2Var, a1Var, i4, a1Var2);
                            } else {
                                int iMin4 = Math.min(ii1.i(k1VarL7, 2, i4), ii1.h(k1VarL8, 2, i4));
                                double d51 = h32.a;
                                double d52 = d51;
                                double d53 = d52;
                                double d54 = d53;
                                for (int iMax4 = Math.max(ii1.g(k1VarL7, 2, i4), ii1.f(k1VarL8, 2, i4)); iMax4 < iMin4; iMax4++) {
                                    double dJ25 = k1VarL7.J(0, iMax4);
                                    double dJ26 = k1VarL7.J(1, iMax4);
                                    double dJ27 = k1VarL8.J(iMax4, 0);
                                    double dJ28 = k1VarL8.J(iMax4, 1);
                                    d51 = (dJ25 * dJ27) + d51;
                                    d52 = (dJ27 * dJ26) + d52;
                                    d53 = (dJ25 * dJ28) + d53;
                                    d54 = (dJ26 * dJ28) + d54;
                                }
                                gz2Var.b0(d51, 0, 0);
                                gz2Var.b0(d52, 1, 0);
                                gz2Var.b0(d53, 0, 1);
                                gz2Var.b0(d54, 1, 1);
                            }
                            break;
                        case 4:
                            ii1.b(gz2Var, a1Var, i4, a1Var2);
                            break;
                        default:
                            ii1.e(gz2Var, a1Var, i4, a1Var2);
                            break;
                    }
                }
            };
        }
        if (i2 == 3 && i3 == 3) {
            final byte b3 = 2;
            return new fz2() { // from class: fi1
                @Override // defpackage.fz2
                public final void a(gz2 gz2Var, a1 a1Var, int i4, a1 a1Var2) {
                    int i5 = 2;
                    int i6 = 1;
                    int i7 = 0;
                    switch (b3) {
                        case 0:
                            k1 k1VarL = ii1.l(5, i4, a1Var);
                            k1 k1VarL2 = ii1.l(i4, 5, a1Var2);
                            if (k1VarL == null || k1VarL2 == null) {
                                ii1.e(gz2Var, a1Var, i4, a1Var2);
                            } else {
                                int iMax = Math.max(ii1.g(k1VarL, 5, i4), ii1.f(k1VarL2, 5, i4));
                                int iMin = Math.min(ii1.i(k1VarL, 5, i4), ii1.h(k1VarL2, 5, i4));
                                double d = h32.a;
                                double d2 = d;
                                double d3 = d2;
                                double d4 = d3;
                                double d5 = d4;
                                double d6 = d5;
                                double d7 = d6;
                                double d8 = d7;
                                double d9 = d8;
                                double d10 = d9;
                                double d11 = d10;
                                double d12 = d11;
                                double d13 = d12;
                                double d14 = d13;
                                double d15 = d14;
                                double d16 = d15;
                                double d17 = d16;
                                double d18 = d17;
                                double d19 = d18;
                                double d20 = d19;
                                double d21 = d20;
                                double d22 = d21;
                                double d23 = d22;
                                double d24 = d23;
                                double d25 = d24;
                                while (iMax < iMin) {
                                    double dJ = k1VarL.J(0, iMax);
                                    double dJ2 = k1VarL.J(1, iMax);
                                    double dJ3 = k1VarL.J(2, iMax);
                                    double dJ4 = k1VarL.J(3, iMax);
                                    double dJ5 = k1VarL.J(4, iMax);
                                    double dJ6 = k1VarL2.J(iMax, 0);
                                    double dJ7 = k1VarL2.J(iMax, 1);
                                    double dJ8 = k1VarL2.J(iMax, 2);
                                    double dJ9 = k1VarL2.J(iMax, 3);
                                    double dJ10 = k1VarL2.J(iMax, 4);
                                    d = (dJ * dJ6) + d;
                                    d3 = (dJ2 * dJ6) + d3;
                                    d4 = (dJ3 * dJ6) + d4;
                                    d5 = (dJ4 * dJ6) + d5;
                                    d7 = (dJ * dJ7) + d7;
                                    d8 = (dJ2 * dJ7) + d8;
                                    d9 = (dJ3 * dJ7) + d9;
                                    d10 = (dJ4 * dJ7) + d10;
                                    d11 = (dJ7 * dJ5) + d11;
                                    d12 = (dJ * dJ8) + d12;
                                    d13 = (dJ2 * dJ8) + d13;
                                    d14 = (dJ3 * dJ8) + d14;
                                    d15 = (dJ4 * dJ8) + d15;
                                    d16 = (dJ8 * dJ5) + d16;
                                    d17 = (dJ * dJ9) + d17;
                                    d18 = (dJ2 * dJ9) + d18;
                                    d19 = (dJ3 * dJ9) + d19;
                                    d20 = (dJ4 * dJ9) + d20;
                                    d21 = (dJ9 * dJ5) + d21;
                                    d22 = (dJ * dJ10) + d22;
                                    d23 = (dJ2 * dJ10) + d23;
                                    d24 = (dJ3 * dJ10) + d24;
                                    d25 = (dJ4 * dJ10) + d25;
                                    d6 = (dJ5 * dJ10) + d6;
                                    iMax++;
                                    d2 = (dJ6 * dJ5) + d2;
                                }
                                gz2Var.b0(d, 0, 0);
                                gz2Var.b0(d3, 1, 0);
                                gz2Var.b0(d4, 2, 0);
                                gz2Var.b0(d5, 3, 0);
                                gz2Var.b0(d2, 4, 0);
                                gz2Var.b0(d7, 0, 1);
                                gz2Var.b0(d8, 1, 1);
                                gz2Var.b0(d9, 2, 1);
                                gz2Var.b0(d10, 3, 1);
                                gz2Var.b0(d11, 4, 1);
                                gz2Var.b0(d12, 0, 2);
                                gz2Var.b0(d13, 1, 2);
                                gz2Var.b0(d14, 2, 2);
                                gz2Var.b0(d15, 3, 2);
                                gz2Var.b0(d16, 4, 2);
                                gz2Var.b0(d17, 0, 3);
                                gz2Var.b0(d18, 1, 3);
                                gz2Var.b0(d19, 2, 3);
                                gz2Var.b0(d20, 3, 3);
                                gz2Var.b0(d21, 4, 3);
                                gz2Var.b0(d22, 0, 4);
                                gz2Var.b0(d23, 1, 4);
                                gz2Var.b0(d24, 2, 4);
                                gz2Var.b0(d25, 3, 4);
                                gz2Var.b0(d6, 4, 4);
                            }
                            break;
                        case 1:
                            k1 k1VarL3 = ii1.l(4, i4, a1Var);
                            k1 k1VarL4 = ii1.l(i4, 4, a1Var2);
                            if (k1VarL3 == null || k1VarL4 == null) {
                                ii1.e(gz2Var, a1Var, i4, a1Var2);
                            } else {
                                int iMax2 = Math.max(ii1.g(k1VarL3, 4, i4), ii1.f(k1VarL4, 4, i4));
                                int iMin2 = Math.min(ii1.i(k1VarL3, 4, i4), ii1.h(k1VarL4, 4, i4));
                                double d26 = h32.a;
                                double d27 = d26;
                                double d28 = d27;
                                double d29 = d28;
                                double d30 = d29;
                                double d31 = d30;
                                double d32 = d31;
                                double d33 = d32;
                                double d34 = d33;
                                double d35 = d34;
                                double d36 = d35;
                                double d37 = d36;
                                double d38 = d37;
                                double d39 = d38;
                                double d40 = d39;
                                double d41 = d40;
                                while (iMax2 < iMin2) {
                                    double dJ11 = k1VarL3.J(0, iMax2);
                                    double dJ12 = k1VarL3.J(1, iMax2);
                                    double dJ13 = k1VarL3.J(2, iMax2);
                                    double dJ14 = k1VarL3.J(3, iMax2);
                                    double dJ15 = k1VarL4.J(iMax2, 0);
                                    double dJ16 = k1VarL4.J(iMax2, 1);
                                    double dJ17 = k1VarL4.J(iMax2, 2);
                                    double dJ18 = k1VarL4.J(iMax2, 3);
                                    d26 = (dJ11 * dJ15) + d26;
                                    d27 = (dJ12 * dJ15) + d27;
                                    d28 = (dJ13 * dJ15) + d28;
                                    d29 = (dJ15 * dJ14) + d29;
                                    d30 = (dJ11 * dJ16) + d30;
                                    d31 = (dJ12 * dJ16) + d31;
                                    d32 = (dJ13 * dJ16) + d32;
                                    d33 = (dJ16 * dJ14) + d33;
                                    d34 = (dJ11 * dJ17) + d34;
                                    d35 = (dJ12 * dJ17) + d35;
                                    d36 = (dJ13 * dJ17) + d36;
                                    d37 = (dJ17 * dJ14) + d37;
                                    d38 = (dJ11 * dJ18) + d38;
                                    d39 = (dJ12 * dJ18) + d39;
                                    d40 = (dJ13 * dJ18) + d40;
                                    d41 = (dJ14 * dJ18) + d41;
                                    iMax2++;
                                    iMin2 = iMin2;
                                    k1VarL4 = k1VarL4;
                                }
                                gz2Var.b0(d26, 0, 0);
                                gz2Var.b0(d27, 1, 0);
                                gz2Var.b0(d28, 2, 0);
                                gz2Var.b0(d29, 3, 0);
                                gz2Var.b0(d30, 0, 1);
                                gz2Var.b0(d31, 1, 1);
                                gz2Var.b0(d32, 2, 1);
                                gz2Var.b0(d33, 3, 1);
                                gz2Var.b0(d34, 0, 2);
                                gz2Var.b0(d35, 1, 2);
                                gz2Var.b0(d36, 2, 2);
                                gz2Var.b0(d37, 3, 2);
                                gz2Var.b0(d38, 0, 3);
                                gz2Var.b0(d39, 1, 3);
                                gz2Var.b0(d40, 2, 3);
                                gz2Var.b0(d41, 3, 3);
                            }
                            break;
                        case 2:
                            k1 k1VarL5 = ii1.l(3, i4, a1Var);
                            k1 k1VarL6 = ii1.l(i4, 3, a1Var2);
                            if (k1VarL5 == null || k1VarL6 == null) {
                                ii1.e(gz2Var, a1Var, i4, a1Var2);
                            } else {
                                int iMax3 = Math.max(ii1.g(k1VarL5, 3, i4), ii1.f(k1VarL6, 3, i4));
                                int iMin3 = Math.min(ii1.i(k1VarL5, 3, i4), ii1.h(k1VarL6, 3, i4));
                                double d42 = h32.a;
                                double d43 = d42;
                                double d44 = d43;
                                double d45 = d44;
                                double d46 = d45;
                                double d47 = d46;
                                double d48 = d47;
                                double d49 = d48;
                                double d50 = d49;
                                while (iMax3 < iMin3) {
                                    double dJ19 = k1VarL5.J(i7, iMax3);
                                    double dJ20 = k1VarL5.J(i6, iMax3);
                                    double dJ21 = k1VarL5.J(i5, iMax3);
                                    double dJ22 = k1VarL6.J(iMax3, i7);
                                    double dJ23 = k1VarL6.J(iMax3, i6);
                                    double dJ24 = k1VarL6.J(iMax3, i5);
                                    d43 = (dJ20 * dJ22) + d43;
                                    d44 = (dJ22 * dJ21) + d44;
                                    d45 = (dJ19 * dJ23) + d45;
                                    d46 = (dJ20 * dJ23) + d46;
                                    d47 = (dJ23 * dJ21) + d47;
                                    d48 = (dJ19 * dJ24) + d48;
                                    d49 = (dJ20 * dJ24) + d49;
                                    d50 = (dJ21 * dJ24) + d50;
                                    iMax3++;
                                    d42 = (dJ19 * dJ22) + d42;
                                    i5 = 2;
                                    i6 = 1;
                                    i7 = 0;
                                }
                                int i8 = i7;
                                gz2Var.b0(d42, i8, i8);
                                gz2Var.b0(d43, 1, i8);
                                gz2Var.b0(d44, 2, i8);
                                gz2Var.b0(d45, i8, 1);
                                gz2Var.b0(d46, 1, 1);
                                gz2Var.b0(d47, 2, 1);
                                gz2Var.b0(d48, i8, 2);
                                gz2Var.b0(d49, 1, 2);
                                gz2Var.b0(d50, 2, 2);
                            }
                            break;
                        case 3:
                            k1 k1VarL7 = ii1.l(2, i4, a1Var);
                            k1 k1VarL8 = ii1.l(i4, 2, a1Var2);
                            if (k1VarL7 == null || k1VarL8 == null) {
                                ii1.e(gz2Var, a1Var, i4, a1Var2);
                            } else {
                                int iMin4 = Math.min(ii1.i(k1VarL7, 2, i4), ii1.h(k1VarL8, 2, i4));
                                double d51 = h32.a;
                                double d52 = d51;
                                double d53 = d52;
                                double d54 = d53;
                                for (int iMax4 = Math.max(ii1.g(k1VarL7, 2, i4), ii1.f(k1VarL8, 2, i4)); iMax4 < iMin4; iMax4++) {
                                    double dJ25 = k1VarL7.J(0, iMax4);
                                    double dJ26 = k1VarL7.J(1, iMax4);
                                    double dJ27 = k1VarL8.J(iMax4, 0);
                                    double dJ28 = k1VarL8.J(iMax4, 1);
                                    d51 = (dJ25 * dJ27) + d51;
                                    d52 = (dJ27 * dJ26) + d52;
                                    d53 = (dJ25 * dJ28) + d53;
                                    d54 = (dJ26 * dJ28) + d54;
                                }
                                gz2Var.b0(d51, 0, 0);
                                gz2Var.b0(d52, 1, 0);
                                gz2Var.b0(d53, 0, 1);
                                gz2Var.b0(d54, 1, 1);
                            }
                            break;
                        case 4:
                            ii1.b(gz2Var, a1Var, i4, a1Var2);
                            break;
                        default:
                            ii1.e(gz2Var, a1Var, i4, a1Var2);
                            break;
                    }
                }
            };
        }
        if (i2 == 2 && i3 == 2) {
            final byte b4 = 3;
            return new fz2() { // from class: fi1
                @Override // defpackage.fz2
                public final void a(gz2 gz2Var, a1 a1Var, int i4, a1 a1Var2) {
                    int i5 = 2;
                    int i6 = 1;
                    int i7 = 0;
                    switch (b4) {
                        case 0:
                            k1 k1VarL = ii1.l(5, i4, a1Var);
                            k1 k1VarL2 = ii1.l(i4, 5, a1Var2);
                            if (k1VarL == null || k1VarL2 == null) {
                                ii1.e(gz2Var, a1Var, i4, a1Var2);
                            } else {
                                int iMax = Math.max(ii1.g(k1VarL, 5, i4), ii1.f(k1VarL2, 5, i4));
                                int iMin = Math.min(ii1.i(k1VarL, 5, i4), ii1.h(k1VarL2, 5, i4));
                                double d = h32.a;
                                double d2 = d;
                                double d3 = d2;
                                double d4 = d3;
                                double d5 = d4;
                                double d6 = d5;
                                double d7 = d6;
                                double d8 = d7;
                                double d9 = d8;
                                double d10 = d9;
                                double d11 = d10;
                                double d12 = d11;
                                double d13 = d12;
                                double d14 = d13;
                                double d15 = d14;
                                double d16 = d15;
                                double d17 = d16;
                                double d18 = d17;
                                double d19 = d18;
                                double d20 = d19;
                                double d21 = d20;
                                double d22 = d21;
                                double d23 = d22;
                                double d24 = d23;
                                double d25 = d24;
                                while (iMax < iMin) {
                                    double dJ = k1VarL.J(0, iMax);
                                    double dJ2 = k1VarL.J(1, iMax);
                                    double dJ3 = k1VarL.J(2, iMax);
                                    double dJ4 = k1VarL.J(3, iMax);
                                    double dJ5 = k1VarL.J(4, iMax);
                                    double dJ6 = k1VarL2.J(iMax, 0);
                                    double dJ7 = k1VarL2.J(iMax, 1);
                                    double dJ8 = k1VarL2.J(iMax, 2);
                                    double dJ9 = k1VarL2.J(iMax, 3);
                                    double dJ10 = k1VarL2.J(iMax, 4);
                                    d = (dJ * dJ6) + d;
                                    d3 = (dJ2 * dJ6) + d3;
                                    d4 = (dJ3 * dJ6) + d4;
                                    d5 = (dJ4 * dJ6) + d5;
                                    d7 = (dJ * dJ7) + d7;
                                    d8 = (dJ2 * dJ7) + d8;
                                    d9 = (dJ3 * dJ7) + d9;
                                    d10 = (dJ4 * dJ7) + d10;
                                    d11 = (dJ7 * dJ5) + d11;
                                    d12 = (dJ * dJ8) + d12;
                                    d13 = (dJ2 * dJ8) + d13;
                                    d14 = (dJ3 * dJ8) + d14;
                                    d15 = (dJ4 * dJ8) + d15;
                                    d16 = (dJ8 * dJ5) + d16;
                                    d17 = (dJ * dJ9) + d17;
                                    d18 = (dJ2 * dJ9) + d18;
                                    d19 = (dJ3 * dJ9) + d19;
                                    d20 = (dJ4 * dJ9) + d20;
                                    d21 = (dJ9 * dJ5) + d21;
                                    d22 = (dJ * dJ10) + d22;
                                    d23 = (dJ2 * dJ10) + d23;
                                    d24 = (dJ3 * dJ10) + d24;
                                    d25 = (dJ4 * dJ10) + d25;
                                    d6 = (dJ5 * dJ10) + d6;
                                    iMax++;
                                    d2 = (dJ6 * dJ5) + d2;
                                }
                                gz2Var.b0(d, 0, 0);
                                gz2Var.b0(d3, 1, 0);
                                gz2Var.b0(d4, 2, 0);
                                gz2Var.b0(d5, 3, 0);
                                gz2Var.b0(d2, 4, 0);
                                gz2Var.b0(d7, 0, 1);
                                gz2Var.b0(d8, 1, 1);
                                gz2Var.b0(d9, 2, 1);
                                gz2Var.b0(d10, 3, 1);
                                gz2Var.b0(d11, 4, 1);
                                gz2Var.b0(d12, 0, 2);
                                gz2Var.b0(d13, 1, 2);
                                gz2Var.b0(d14, 2, 2);
                                gz2Var.b0(d15, 3, 2);
                                gz2Var.b0(d16, 4, 2);
                                gz2Var.b0(d17, 0, 3);
                                gz2Var.b0(d18, 1, 3);
                                gz2Var.b0(d19, 2, 3);
                                gz2Var.b0(d20, 3, 3);
                                gz2Var.b0(d21, 4, 3);
                                gz2Var.b0(d22, 0, 4);
                                gz2Var.b0(d23, 1, 4);
                                gz2Var.b0(d24, 2, 4);
                                gz2Var.b0(d25, 3, 4);
                                gz2Var.b0(d6, 4, 4);
                            }
                            break;
                        case 1:
                            k1 k1VarL3 = ii1.l(4, i4, a1Var);
                            k1 k1VarL4 = ii1.l(i4, 4, a1Var2);
                            if (k1VarL3 == null || k1VarL4 == null) {
                                ii1.e(gz2Var, a1Var, i4, a1Var2);
                            } else {
                                int iMax2 = Math.max(ii1.g(k1VarL3, 4, i4), ii1.f(k1VarL4, 4, i4));
                                int iMin2 = Math.min(ii1.i(k1VarL3, 4, i4), ii1.h(k1VarL4, 4, i4));
                                double d26 = h32.a;
                                double d27 = d26;
                                double d28 = d27;
                                double d29 = d28;
                                double d30 = d29;
                                double d31 = d30;
                                double d32 = d31;
                                double d33 = d32;
                                double d34 = d33;
                                double d35 = d34;
                                double d36 = d35;
                                double d37 = d36;
                                double d38 = d37;
                                double d39 = d38;
                                double d40 = d39;
                                double d41 = d40;
                                while (iMax2 < iMin2) {
                                    double dJ11 = k1VarL3.J(0, iMax2);
                                    double dJ12 = k1VarL3.J(1, iMax2);
                                    double dJ13 = k1VarL3.J(2, iMax2);
                                    double dJ14 = k1VarL3.J(3, iMax2);
                                    double dJ15 = k1VarL4.J(iMax2, 0);
                                    double dJ16 = k1VarL4.J(iMax2, 1);
                                    double dJ17 = k1VarL4.J(iMax2, 2);
                                    double dJ18 = k1VarL4.J(iMax2, 3);
                                    d26 = (dJ11 * dJ15) + d26;
                                    d27 = (dJ12 * dJ15) + d27;
                                    d28 = (dJ13 * dJ15) + d28;
                                    d29 = (dJ15 * dJ14) + d29;
                                    d30 = (dJ11 * dJ16) + d30;
                                    d31 = (dJ12 * dJ16) + d31;
                                    d32 = (dJ13 * dJ16) + d32;
                                    d33 = (dJ16 * dJ14) + d33;
                                    d34 = (dJ11 * dJ17) + d34;
                                    d35 = (dJ12 * dJ17) + d35;
                                    d36 = (dJ13 * dJ17) + d36;
                                    d37 = (dJ17 * dJ14) + d37;
                                    d38 = (dJ11 * dJ18) + d38;
                                    d39 = (dJ12 * dJ18) + d39;
                                    d40 = (dJ13 * dJ18) + d40;
                                    d41 = (dJ14 * dJ18) + d41;
                                    iMax2++;
                                    iMin2 = iMin2;
                                    k1VarL4 = k1VarL4;
                                }
                                gz2Var.b0(d26, 0, 0);
                                gz2Var.b0(d27, 1, 0);
                                gz2Var.b0(d28, 2, 0);
                                gz2Var.b0(d29, 3, 0);
                                gz2Var.b0(d30, 0, 1);
                                gz2Var.b0(d31, 1, 1);
                                gz2Var.b0(d32, 2, 1);
                                gz2Var.b0(d33, 3, 1);
                                gz2Var.b0(d34, 0, 2);
                                gz2Var.b0(d35, 1, 2);
                                gz2Var.b0(d36, 2, 2);
                                gz2Var.b0(d37, 3, 2);
                                gz2Var.b0(d38, 0, 3);
                                gz2Var.b0(d39, 1, 3);
                                gz2Var.b0(d40, 2, 3);
                                gz2Var.b0(d41, 3, 3);
                            }
                            break;
                        case 2:
                            k1 k1VarL5 = ii1.l(3, i4, a1Var);
                            k1 k1VarL6 = ii1.l(i4, 3, a1Var2);
                            if (k1VarL5 == null || k1VarL6 == null) {
                                ii1.e(gz2Var, a1Var, i4, a1Var2);
                            } else {
                                int iMax3 = Math.max(ii1.g(k1VarL5, 3, i4), ii1.f(k1VarL6, 3, i4));
                                int iMin3 = Math.min(ii1.i(k1VarL5, 3, i4), ii1.h(k1VarL6, 3, i4));
                                double d42 = h32.a;
                                double d43 = d42;
                                double d44 = d43;
                                double d45 = d44;
                                double d46 = d45;
                                double d47 = d46;
                                double d48 = d47;
                                double d49 = d48;
                                double d50 = d49;
                                while (iMax3 < iMin3) {
                                    double dJ19 = k1VarL5.J(i7, iMax3);
                                    double dJ20 = k1VarL5.J(i6, iMax3);
                                    double dJ21 = k1VarL5.J(i5, iMax3);
                                    double dJ22 = k1VarL6.J(iMax3, i7);
                                    double dJ23 = k1VarL6.J(iMax3, i6);
                                    double dJ24 = k1VarL6.J(iMax3, i5);
                                    d43 = (dJ20 * dJ22) + d43;
                                    d44 = (dJ22 * dJ21) + d44;
                                    d45 = (dJ19 * dJ23) + d45;
                                    d46 = (dJ20 * dJ23) + d46;
                                    d47 = (dJ23 * dJ21) + d47;
                                    d48 = (dJ19 * dJ24) + d48;
                                    d49 = (dJ20 * dJ24) + d49;
                                    d50 = (dJ21 * dJ24) + d50;
                                    iMax3++;
                                    d42 = (dJ19 * dJ22) + d42;
                                    i5 = 2;
                                    i6 = 1;
                                    i7 = 0;
                                }
                                int i8 = i7;
                                gz2Var.b0(d42, i8, i8);
                                gz2Var.b0(d43, 1, i8);
                                gz2Var.b0(d44, 2, i8);
                                gz2Var.b0(d45, i8, 1);
                                gz2Var.b0(d46, 1, 1);
                                gz2Var.b0(d47, 2, 1);
                                gz2Var.b0(d48, i8, 2);
                                gz2Var.b0(d49, 1, 2);
                                gz2Var.b0(d50, 2, 2);
                            }
                            break;
                        case 3:
                            k1 k1VarL7 = ii1.l(2, i4, a1Var);
                            k1 k1VarL8 = ii1.l(i4, 2, a1Var2);
                            if (k1VarL7 == null || k1VarL8 == null) {
                                ii1.e(gz2Var, a1Var, i4, a1Var2);
                            } else {
                                int iMin4 = Math.min(ii1.i(k1VarL7, 2, i4), ii1.h(k1VarL8, 2, i4));
                                double d51 = h32.a;
                                double d52 = d51;
                                double d53 = d52;
                                double d54 = d53;
                                for (int iMax4 = Math.max(ii1.g(k1VarL7, 2, i4), ii1.f(k1VarL8, 2, i4)); iMax4 < iMin4; iMax4++) {
                                    double dJ25 = k1VarL7.J(0, iMax4);
                                    double dJ26 = k1VarL7.J(1, iMax4);
                                    double dJ27 = k1VarL8.J(iMax4, 0);
                                    double dJ28 = k1VarL8.J(iMax4, 1);
                                    d51 = (dJ25 * dJ27) + d51;
                                    d52 = (dJ27 * dJ26) + d52;
                                    d53 = (dJ25 * dJ28) + d53;
                                    d54 = (dJ26 * dJ28) + d54;
                                }
                                gz2Var.b0(d51, 0, 0);
                                gz2Var.b0(d52, 1, 0);
                                gz2Var.b0(d53, 0, 1);
                                gz2Var.b0(d54, 1, 1);
                            }
                            break;
                        case 4:
                            ii1.b(gz2Var, a1Var, i4, a1Var2);
                            break;
                        default:
                            ii1.e(gz2Var, a1Var, i4, a1Var2);
                            break;
                    }
                }
            };
        }
        if (i2 == 1) {
            final byte b5 = 4;
            return new fz2() { // from class: fi1
                @Override // defpackage.fz2
                public final void a(gz2 gz2Var, a1 a1Var, int i4, a1 a1Var2) {
                    int i5 = 2;
                    int i6 = 1;
                    int i7 = 0;
                    switch (b5) {
                        case 0:
                            k1 k1VarL = ii1.l(5, i4, a1Var);
                            k1 k1VarL2 = ii1.l(i4, 5, a1Var2);
                            if (k1VarL == null || k1VarL2 == null) {
                                ii1.e(gz2Var, a1Var, i4, a1Var2);
                            } else {
                                int iMax = Math.max(ii1.g(k1VarL, 5, i4), ii1.f(k1VarL2, 5, i4));
                                int iMin = Math.min(ii1.i(k1VarL, 5, i4), ii1.h(k1VarL2, 5, i4));
                                double d = h32.a;
                                double d2 = d;
                                double d3 = d2;
                                double d4 = d3;
                                double d5 = d4;
                                double d6 = d5;
                                double d7 = d6;
                                double d8 = d7;
                                double d9 = d8;
                                double d10 = d9;
                                double d11 = d10;
                                double d12 = d11;
                                double d13 = d12;
                                double d14 = d13;
                                double d15 = d14;
                                double d16 = d15;
                                double d17 = d16;
                                double d18 = d17;
                                double d19 = d18;
                                double d20 = d19;
                                double d21 = d20;
                                double d22 = d21;
                                double d23 = d22;
                                double d24 = d23;
                                double d25 = d24;
                                while (iMax < iMin) {
                                    double dJ = k1VarL.J(0, iMax);
                                    double dJ2 = k1VarL.J(1, iMax);
                                    double dJ3 = k1VarL.J(2, iMax);
                                    double dJ4 = k1VarL.J(3, iMax);
                                    double dJ5 = k1VarL.J(4, iMax);
                                    double dJ6 = k1VarL2.J(iMax, 0);
                                    double dJ7 = k1VarL2.J(iMax, 1);
                                    double dJ8 = k1VarL2.J(iMax, 2);
                                    double dJ9 = k1VarL2.J(iMax, 3);
                                    double dJ10 = k1VarL2.J(iMax, 4);
                                    d = (dJ * dJ6) + d;
                                    d3 = (dJ2 * dJ6) + d3;
                                    d4 = (dJ3 * dJ6) + d4;
                                    d5 = (dJ4 * dJ6) + d5;
                                    d7 = (dJ * dJ7) + d7;
                                    d8 = (dJ2 * dJ7) + d8;
                                    d9 = (dJ3 * dJ7) + d9;
                                    d10 = (dJ4 * dJ7) + d10;
                                    d11 = (dJ7 * dJ5) + d11;
                                    d12 = (dJ * dJ8) + d12;
                                    d13 = (dJ2 * dJ8) + d13;
                                    d14 = (dJ3 * dJ8) + d14;
                                    d15 = (dJ4 * dJ8) + d15;
                                    d16 = (dJ8 * dJ5) + d16;
                                    d17 = (dJ * dJ9) + d17;
                                    d18 = (dJ2 * dJ9) + d18;
                                    d19 = (dJ3 * dJ9) + d19;
                                    d20 = (dJ4 * dJ9) + d20;
                                    d21 = (dJ9 * dJ5) + d21;
                                    d22 = (dJ * dJ10) + d22;
                                    d23 = (dJ2 * dJ10) + d23;
                                    d24 = (dJ3 * dJ10) + d24;
                                    d25 = (dJ4 * dJ10) + d25;
                                    d6 = (dJ5 * dJ10) + d6;
                                    iMax++;
                                    d2 = (dJ6 * dJ5) + d2;
                                }
                                gz2Var.b0(d, 0, 0);
                                gz2Var.b0(d3, 1, 0);
                                gz2Var.b0(d4, 2, 0);
                                gz2Var.b0(d5, 3, 0);
                                gz2Var.b0(d2, 4, 0);
                                gz2Var.b0(d7, 0, 1);
                                gz2Var.b0(d8, 1, 1);
                                gz2Var.b0(d9, 2, 1);
                                gz2Var.b0(d10, 3, 1);
                                gz2Var.b0(d11, 4, 1);
                                gz2Var.b0(d12, 0, 2);
                                gz2Var.b0(d13, 1, 2);
                                gz2Var.b0(d14, 2, 2);
                                gz2Var.b0(d15, 3, 2);
                                gz2Var.b0(d16, 4, 2);
                                gz2Var.b0(d17, 0, 3);
                                gz2Var.b0(d18, 1, 3);
                                gz2Var.b0(d19, 2, 3);
                                gz2Var.b0(d20, 3, 3);
                                gz2Var.b0(d21, 4, 3);
                                gz2Var.b0(d22, 0, 4);
                                gz2Var.b0(d23, 1, 4);
                                gz2Var.b0(d24, 2, 4);
                                gz2Var.b0(d25, 3, 4);
                                gz2Var.b0(d6, 4, 4);
                            }
                            break;
                        case 1:
                            k1 k1VarL3 = ii1.l(4, i4, a1Var);
                            k1 k1VarL4 = ii1.l(i4, 4, a1Var2);
                            if (k1VarL3 == null || k1VarL4 == null) {
                                ii1.e(gz2Var, a1Var, i4, a1Var2);
                            } else {
                                int iMax2 = Math.max(ii1.g(k1VarL3, 4, i4), ii1.f(k1VarL4, 4, i4));
                                int iMin2 = Math.min(ii1.i(k1VarL3, 4, i4), ii1.h(k1VarL4, 4, i4));
                                double d26 = h32.a;
                                double d27 = d26;
                                double d28 = d27;
                                double d29 = d28;
                                double d30 = d29;
                                double d31 = d30;
                                double d32 = d31;
                                double d33 = d32;
                                double d34 = d33;
                                double d35 = d34;
                                double d36 = d35;
                                double d37 = d36;
                                double d38 = d37;
                                double d39 = d38;
                                double d40 = d39;
                                double d41 = d40;
                                while (iMax2 < iMin2) {
                                    double dJ11 = k1VarL3.J(0, iMax2);
                                    double dJ12 = k1VarL3.J(1, iMax2);
                                    double dJ13 = k1VarL3.J(2, iMax2);
                                    double dJ14 = k1VarL3.J(3, iMax2);
                                    double dJ15 = k1VarL4.J(iMax2, 0);
                                    double dJ16 = k1VarL4.J(iMax2, 1);
                                    double dJ17 = k1VarL4.J(iMax2, 2);
                                    double dJ18 = k1VarL4.J(iMax2, 3);
                                    d26 = (dJ11 * dJ15) + d26;
                                    d27 = (dJ12 * dJ15) + d27;
                                    d28 = (dJ13 * dJ15) + d28;
                                    d29 = (dJ15 * dJ14) + d29;
                                    d30 = (dJ11 * dJ16) + d30;
                                    d31 = (dJ12 * dJ16) + d31;
                                    d32 = (dJ13 * dJ16) + d32;
                                    d33 = (dJ16 * dJ14) + d33;
                                    d34 = (dJ11 * dJ17) + d34;
                                    d35 = (dJ12 * dJ17) + d35;
                                    d36 = (dJ13 * dJ17) + d36;
                                    d37 = (dJ17 * dJ14) + d37;
                                    d38 = (dJ11 * dJ18) + d38;
                                    d39 = (dJ12 * dJ18) + d39;
                                    d40 = (dJ13 * dJ18) + d40;
                                    d41 = (dJ14 * dJ18) + d41;
                                    iMax2++;
                                    iMin2 = iMin2;
                                    k1VarL4 = k1VarL4;
                                }
                                gz2Var.b0(d26, 0, 0);
                                gz2Var.b0(d27, 1, 0);
                                gz2Var.b0(d28, 2, 0);
                                gz2Var.b0(d29, 3, 0);
                                gz2Var.b0(d30, 0, 1);
                                gz2Var.b0(d31, 1, 1);
                                gz2Var.b0(d32, 2, 1);
                                gz2Var.b0(d33, 3, 1);
                                gz2Var.b0(d34, 0, 2);
                                gz2Var.b0(d35, 1, 2);
                                gz2Var.b0(d36, 2, 2);
                                gz2Var.b0(d37, 3, 2);
                                gz2Var.b0(d38, 0, 3);
                                gz2Var.b0(d39, 1, 3);
                                gz2Var.b0(d40, 2, 3);
                                gz2Var.b0(d41, 3, 3);
                            }
                            break;
                        case 2:
                            k1 k1VarL5 = ii1.l(3, i4, a1Var);
                            k1 k1VarL6 = ii1.l(i4, 3, a1Var2);
                            if (k1VarL5 == null || k1VarL6 == null) {
                                ii1.e(gz2Var, a1Var, i4, a1Var2);
                            } else {
                                int iMax3 = Math.max(ii1.g(k1VarL5, 3, i4), ii1.f(k1VarL6, 3, i4));
                                int iMin3 = Math.min(ii1.i(k1VarL5, 3, i4), ii1.h(k1VarL6, 3, i4));
                                double d42 = h32.a;
                                double d43 = d42;
                                double d44 = d43;
                                double d45 = d44;
                                double d46 = d45;
                                double d47 = d46;
                                double d48 = d47;
                                double d49 = d48;
                                double d50 = d49;
                                while (iMax3 < iMin3) {
                                    double dJ19 = k1VarL5.J(i7, iMax3);
                                    double dJ20 = k1VarL5.J(i6, iMax3);
                                    double dJ21 = k1VarL5.J(i5, iMax3);
                                    double dJ22 = k1VarL6.J(iMax3, i7);
                                    double dJ23 = k1VarL6.J(iMax3, i6);
                                    double dJ24 = k1VarL6.J(iMax3, i5);
                                    d43 = (dJ20 * dJ22) + d43;
                                    d44 = (dJ22 * dJ21) + d44;
                                    d45 = (dJ19 * dJ23) + d45;
                                    d46 = (dJ20 * dJ23) + d46;
                                    d47 = (dJ23 * dJ21) + d47;
                                    d48 = (dJ19 * dJ24) + d48;
                                    d49 = (dJ20 * dJ24) + d49;
                                    d50 = (dJ21 * dJ24) + d50;
                                    iMax3++;
                                    d42 = (dJ19 * dJ22) + d42;
                                    i5 = 2;
                                    i6 = 1;
                                    i7 = 0;
                                }
                                int i8 = i7;
                                gz2Var.b0(d42, i8, i8);
                                gz2Var.b0(d43, 1, i8);
                                gz2Var.b0(d44, 2, i8);
                                gz2Var.b0(d45, i8, 1);
                                gz2Var.b0(d46, 1, 1);
                                gz2Var.b0(d47, 2, 1);
                                gz2Var.b0(d48, i8, 2);
                                gz2Var.b0(d49, 1, 2);
                                gz2Var.b0(d50, 2, 2);
                            }
                            break;
                        case 3:
                            k1 k1VarL7 = ii1.l(2, i4, a1Var);
                            k1 k1VarL8 = ii1.l(i4, 2, a1Var2);
                            if (k1VarL7 == null || k1VarL8 == null) {
                                ii1.e(gz2Var, a1Var, i4, a1Var2);
                            } else {
                                int iMin4 = Math.min(ii1.i(k1VarL7, 2, i4), ii1.h(k1VarL8, 2, i4));
                                double d51 = h32.a;
                                double d52 = d51;
                                double d53 = d52;
                                double d54 = d53;
                                for (int iMax4 = Math.max(ii1.g(k1VarL7, 2, i4), ii1.f(k1VarL8, 2, i4)); iMax4 < iMin4; iMax4++) {
                                    double dJ25 = k1VarL7.J(0, iMax4);
                                    double dJ26 = k1VarL7.J(1, iMax4);
                                    double dJ27 = k1VarL8.J(iMax4, 0);
                                    double dJ28 = k1VarL8.J(iMax4, 1);
                                    d51 = (dJ25 * dJ27) + d51;
                                    d52 = (dJ27 * dJ26) + d52;
                                    d53 = (dJ25 * dJ28) + d53;
                                    d54 = (dJ26 * dJ28) + d54;
                                }
                                gz2Var.b0(d51, 0, 0);
                                gz2Var.b0(d52, 1, 0);
                                gz2Var.b0(d53, 0, 1);
                                gz2Var.b0(d54, 1, 1);
                            }
                            break;
                        case 4:
                            ii1.b(gz2Var, a1Var, i4, a1Var2);
                            break;
                        default:
                            ii1.e(gz2Var, a1Var, i4, a1Var2);
                            break;
                    }
                }
            };
        }
        final byte b6 = 5;
        return new fz2() { // from class: fi1
            @Override // defpackage.fz2
            public final void a(gz2 gz2Var, a1 a1Var, int i4, a1 a1Var2) {
                int i5 = 2;
                int i6 = 1;
                int i7 = 0;
                switch (b6) {
                    case 0:
                        k1 k1VarL = ii1.l(5, i4, a1Var);
                        k1 k1VarL2 = ii1.l(i4, 5, a1Var2);
                        if (k1VarL == null || k1VarL2 == null) {
                            ii1.e(gz2Var, a1Var, i4, a1Var2);
                        } else {
                            int iMax = Math.max(ii1.g(k1VarL, 5, i4), ii1.f(k1VarL2, 5, i4));
                            int iMin = Math.min(ii1.i(k1VarL, 5, i4), ii1.h(k1VarL2, 5, i4));
                            double d = h32.a;
                            double d2 = d;
                            double d3 = d2;
                            double d4 = d3;
                            double d5 = d4;
                            double d6 = d5;
                            double d7 = d6;
                            double d8 = d7;
                            double d9 = d8;
                            double d10 = d9;
                            double d11 = d10;
                            double d12 = d11;
                            double d13 = d12;
                            double d14 = d13;
                            double d15 = d14;
                            double d16 = d15;
                            double d17 = d16;
                            double d18 = d17;
                            double d19 = d18;
                            double d20 = d19;
                            double d21 = d20;
                            double d22 = d21;
                            double d23 = d22;
                            double d24 = d23;
                            double d25 = d24;
                            while (iMax < iMin) {
                                double dJ = k1VarL.J(0, iMax);
                                double dJ2 = k1VarL.J(1, iMax);
                                double dJ3 = k1VarL.J(2, iMax);
                                double dJ4 = k1VarL.J(3, iMax);
                                double dJ5 = k1VarL.J(4, iMax);
                                double dJ6 = k1VarL2.J(iMax, 0);
                                double dJ7 = k1VarL2.J(iMax, 1);
                                double dJ8 = k1VarL2.J(iMax, 2);
                                double dJ9 = k1VarL2.J(iMax, 3);
                                double dJ10 = k1VarL2.J(iMax, 4);
                                d = (dJ * dJ6) + d;
                                d3 = (dJ2 * dJ6) + d3;
                                d4 = (dJ3 * dJ6) + d4;
                                d5 = (dJ4 * dJ6) + d5;
                                d7 = (dJ * dJ7) + d7;
                                d8 = (dJ2 * dJ7) + d8;
                                d9 = (dJ3 * dJ7) + d9;
                                d10 = (dJ4 * dJ7) + d10;
                                d11 = (dJ7 * dJ5) + d11;
                                d12 = (dJ * dJ8) + d12;
                                d13 = (dJ2 * dJ8) + d13;
                                d14 = (dJ3 * dJ8) + d14;
                                d15 = (dJ4 * dJ8) + d15;
                                d16 = (dJ8 * dJ5) + d16;
                                d17 = (dJ * dJ9) + d17;
                                d18 = (dJ2 * dJ9) + d18;
                                d19 = (dJ3 * dJ9) + d19;
                                d20 = (dJ4 * dJ9) + d20;
                                d21 = (dJ9 * dJ5) + d21;
                                d22 = (dJ * dJ10) + d22;
                                d23 = (dJ2 * dJ10) + d23;
                                d24 = (dJ3 * dJ10) + d24;
                                d25 = (dJ4 * dJ10) + d25;
                                d6 = (dJ5 * dJ10) + d6;
                                iMax++;
                                d2 = (dJ6 * dJ5) + d2;
                            }
                            gz2Var.b0(d, 0, 0);
                            gz2Var.b0(d3, 1, 0);
                            gz2Var.b0(d4, 2, 0);
                            gz2Var.b0(d5, 3, 0);
                            gz2Var.b0(d2, 4, 0);
                            gz2Var.b0(d7, 0, 1);
                            gz2Var.b0(d8, 1, 1);
                            gz2Var.b0(d9, 2, 1);
                            gz2Var.b0(d10, 3, 1);
                            gz2Var.b0(d11, 4, 1);
                            gz2Var.b0(d12, 0, 2);
                            gz2Var.b0(d13, 1, 2);
                            gz2Var.b0(d14, 2, 2);
                            gz2Var.b0(d15, 3, 2);
                            gz2Var.b0(d16, 4, 2);
                            gz2Var.b0(d17, 0, 3);
                            gz2Var.b0(d18, 1, 3);
                            gz2Var.b0(d19, 2, 3);
                            gz2Var.b0(d20, 3, 3);
                            gz2Var.b0(d21, 4, 3);
                            gz2Var.b0(d22, 0, 4);
                            gz2Var.b0(d23, 1, 4);
                            gz2Var.b0(d24, 2, 4);
                            gz2Var.b0(d25, 3, 4);
                            gz2Var.b0(d6, 4, 4);
                        }
                        break;
                    case 1:
                        k1 k1VarL3 = ii1.l(4, i4, a1Var);
                        k1 k1VarL4 = ii1.l(i4, 4, a1Var2);
                        if (k1VarL3 == null || k1VarL4 == null) {
                            ii1.e(gz2Var, a1Var, i4, a1Var2);
                        } else {
                            int iMax2 = Math.max(ii1.g(k1VarL3, 4, i4), ii1.f(k1VarL4, 4, i4));
                            int iMin2 = Math.min(ii1.i(k1VarL3, 4, i4), ii1.h(k1VarL4, 4, i4));
                            double d26 = h32.a;
                            double d27 = d26;
                            double d28 = d27;
                            double d29 = d28;
                            double d30 = d29;
                            double d31 = d30;
                            double d32 = d31;
                            double d33 = d32;
                            double d34 = d33;
                            double d35 = d34;
                            double d36 = d35;
                            double d37 = d36;
                            double d38 = d37;
                            double d39 = d38;
                            double d40 = d39;
                            double d41 = d40;
                            while (iMax2 < iMin2) {
                                double dJ11 = k1VarL3.J(0, iMax2);
                                double dJ12 = k1VarL3.J(1, iMax2);
                                double dJ13 = k1VarL3.J(2, iMax2);
                                double dJ14 = k1VarL3.J(3, iMax2);
                                double dJ15 = k1VarL4.J(iMax2, 0);
                                double dJ16 = k1VarL4.J(iMax2, 1);
                                double dJ17 = k1VarL4.J(iMax2, 2);
                                double dJ18 = k1VarL4.J(iMax2, 3);
                                d26 = (dJ11 * dJ15) + d26;
                                d27 = (dJ12 * dJ15) + d27;
                                d28 = (dJ13 * dJ15) + d28;
                                d29 = (dJ15 * dJ14) + d29;
                                d30 = (dJ11 * dJ16) + d30;
                                d31 = (dJ12 * dJ16) + d31;
                                d32 = (dJ13 * dJ16) + d32;
                                d33 = (dJ16 * dJ14) + d33;
                                d34 = (dJ11 * dJ17) + d34;
                                d35 = (dJ12 * dJ17) + d35;
                                d36 = (dJ13 * dJ17) + d36;
                                d37 = (dJ17 * dJ14) + d37;
                                d38 = (dJ11 * dJ18) + d38;
                                d39 = (dJ12 * dJ18) + d39;
                                d40 = (dJ13 * dJ18) + d40;
                                d41 = (dJ14 * dJ18) + d41;
                                iMax2++;
                                iMin2 = iMin2;
                                k1VarL4 = k1VarL4;
                            }
                            gz2Var.b0(d26, 0, 0);
                            gz2Var.b0(d27, 1, 0);
                            gz2Var.b0(d28, 2, 0);
                            gz2Var.b0(d29, 3, 0);
                            gz2Var.b0(d30, 0, 1);
                            gz2Var.b0(d31, 1, 1);
                            gz2Var.b0(d32, 2, 1);
                            gz2Var.b0(d33, 3, 1);
                            gz2Var.b0(d34, 0, 2);
                            gz2Var.b0(d35, 1, 2);
                            gz2Var.b0(d36, 2, 2);
                            gz2Var.b0(d37, 3, 2);
                            gz2Var.b0(d38, 0, 3);
                            gz2Var.b0(d39, 1, 3);
                            gz2Var.b0(d40, 2, 3);
                            gz2Var.b0(d41, 3, 3);
                        }
                        break;
                    case 2:
                        k1 k1VarL5 = ii1.l(3, i4, a1Var);
                        k1 k1VarL6 = ii1.l(i4, 3, a1Var2);
                        if (k1VarL5 == null || k1VarL6 == null) {
                            ii1.e(gz2Var, a1Var, i4, a1Var2);
                        } else {
                            int iMax3 = Math.max(ii1.g(k1VarL5, 3, i4), ii1.f(k1VarL6, 3, i4));
                            int iMin3 = Math.min(ii1.i(k1VarL5, 3, i4), ii1.h(k1VarL6, 3, i4));
                            double d42 = h32.a;
                            double d43 = d42;
                            double d44 = d43;
                            double d45 = d44;
                            double d46 = d45;
                            double d47 = d46;
                            double d48 = d47;
                            double d49 = d48;
                            double d50 = d49;
                            while (iMax3 < iMin3) {
                                double dJ19 = k1VarL5.J(i7, iMax3);
                                double dJ20 = k1VarL5.J(i6, iMax3);
                                double dJ21 = k1VarL5.J(i5, iMax3);
                                double dJ22 = k1VarL6.J(iMax3, i7);
                                double dJ23 = k1VarL6.J(iMax3, i6);
                                double dJ24 = k1VarL6.J(iMax3, i5);
                                d43 = (dJ20 * dJ22) + d43;
                                d44 = (dJ22 * dJ21) + d44;
                                d45 = (dJ19 * dJ23) + d45;
                                d46 = (dJ20 * dJ23) + d46;
                                d47 = (dJ23 * dJ21) + d47;
                                d48 = (dJ19 * dJ24) + d48;
                                d49 = (dJ20 * dJ24) + d49;
                                d50 = (dJ21 * dJ24) + d50;
                                iMax3++;
                                d42 = (dJ19 * dJ22) + d42;
                                i5 = 2;
                                i6 = 1;
                                i7 = 0;
                            }
                            int i8 = i7;
                            gz2Var.b0(d42, i8, i8);
                            gz2Var.b0(d43, 1, i8);
                            gz2Var.b0(d44, 2, i8);
                            gz2Var.b0(d45, i8, 1);
                            gz2Var.b0(d46, 1, 1);
                            gz2Var.b0(d47, 2, 1);
                            gz2Var.b0(d48, i8, 2);
                            gz2Var.b0(d49, 1, 2);
                            gz2Var.b0(d50, 2, 2);
                        }
                        break;
                    case 3:
                        k1 k1VarL7 = ii1.l(2, i4, a1Var);
                        k1 k1VarL8 = ii1.l(i4, 2, a1Var2);
                        if (k1VarL7 == null || k1VarL8 == null) {
                            ii1.e(gz2Var, a1Var, i4, a1Var2);
                        } else {
                            int iMin4 = Math.min(ii1.i(k1VarL7, 2, i4), ii1.h(k1VarL8, 2, i4));
                            double d51 = h32.a;
                            double d52 = d51;
                            double d53 = d52;
                            double d54 = d53;
                            for (int iMax4 = Math.max(ii1.g(k1VarL7, 2, i4), ii1.f(k1VarL8, 2, i4)); iMax4 < iMin4; iMax4++) {
                                double dJ25 = k1VarL7.J(0, iMax4);
                                double dJ26 = k1VarL7.J(1, iMax4);
                                double dJ27 = k1VarL8.J(iMax4, 0);
                                double dJ28 = k1VarL8.J(iMax4, 1);
                                d51 = (dJ25 * dJ27) + d51;
                                d52 = (dJ27 * dJ26) + d52;
                                d53 = (dJ25 * dJ28) + d53;
                                d54 = (dJ26 * dJ28) + d54;
                            }
                            gz2Var.b0(d51, 0, 0);
                            gz2Var.b0(d52, 1, 0);
                            gz2Var.b0(d53, 0, 1);
                            gz2Var.b0(d54, 1, 1);
                        }
                        break;
                    case 4:
                        ii1.b(gz2Var, a1Var, i4, a1Var2);
                        break;
                    default:
                        ii1.e(gz2Var, a1Var, i4, a1Var2);
                        break;
                }
            }
        };
    }

    public static vc2 p(a1 a1Var) {
        return (vc2) i.get(((vc2) a1Var.G(0L)).getClass());
    }
}
