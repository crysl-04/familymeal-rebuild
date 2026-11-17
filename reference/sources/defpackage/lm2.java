package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class lm2 extends x implements k31 {
    public int k;
    public double l;
    public hm2 m;
    public gm2 n;
    public gm2 o;
    public int p;
    public fe q;
    public im2 r;
    public jm2 s;
    public km2 t;
    public k01 u;

    public static boolean T0(int i, int i2, double d, double d2) {
        return ((double) i) / ((double) i2) < 0.05d && d < d2;
    }

    public final void A0(double[] dArr) {
        gm2 gm2Var = this.o;
        for (int i = gm2Var.a - 1; i >= 0; i--) {
            double d = dArr[gm2Var.d[i]];
            if (d != h32.a) {
                int[] iArr = gm2Var.i;
                int i2 = iArr[i + 1];
                for (int i3 = iArr[i]; i3 < i2; i3++) {
                    int i4 = gm2Var.c[i3];
                    dArr[i4] = dArr[i4] - (gm2Var.j[i3] * d);
                }
            }
        }
        gm2 gm2Var2 = this.n;
        for (int i5 = gm2Var2.a - 1; i5 >= 0; i5--) {
            int i6 = gm2Var2.d[i5];
            double d2 = dArr[i6];
            int[] iArr2 = gm2Var2.i;
            int i7 = iArr2[i5 + 1];
            for (int i8 = iArr2[i5]; i8 < i7; i8++) {
                d2 -= gm2Var2.j[i8] * dArr[gm2Var2.c[i8]];
            }
            dArr[i6] = d2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00e4  */
    public final void D0(i90 i90Var, i90 i90Var2) {
        int[] iArr;
        int iJ = i90Var.j();
        double[] dArr = i90Var.h;
        boolean zT0 = T0(iJ, this.k, this.s.a, 0.15d);
        km2 km2Var = this.t;
        im2 im2Var = this.r;
        fe feVar = this.q;
        km2Var.getClass();
        int[] iArrA0 = i90Var2.a0();
        double[] dArr2 = i90Var2.h;
        int i = 0;
        if (zT0) {
            int iZ = feVar.z(i90Var.a0(), i90Var.j(), im2Var.g, km2Var.j, km2Var.g, km2Var.h, km2Var.k) - 1;
            while (iZ >= 0) {
                int i2 = ((int[]) feVar.g)[iZ];
                double d = dArr[i2];
                double d2 = h32.a;
                if (d != d2) {
                    dArr[i2] = d2;
                    int i3 = im2Var.g[i2];
                    double d3 = d / im2Var.d[i3];
                    int i4 = km2Var.j[i3];
                    int i5 = km2Var.g[i3];
                    while (i4 < i5) {
                        int i6 = km2Var.h[i4];
                        dArr[i6] = dArr[i6] - (km2Var.k[i4] * d3);
                        i4++;
                        iArrA0 = iArrA0;
                    }
                    iArr = iArrA0;
                    int i7 = im2Var.f[i3];
                    dArr2[i7] = d3;
                    iArr[i] = i7;
                    i++;
                } else {
                    iArr = iArrA0;
                }
                iZ--;
                iArrA0 = iArr;
            }
        } else {
            int i8 = 0;
            while (i < im2Var.c) {
                int i9 = im2Var.f[i];
                if (i9 >= 0) {
                    int i10 = im2Var.e[i];
                    double d4 = dArr[i10];
                    double d5 = h32.a;
                    if (d4 != d5) {
                        dArr[i10] = d5;
                        double d6 = d4 / im2Var.d[i];
                        int i11 = km2Var.j[i];
                        int i12 = km2Var.g[i];
                        while (i11 < i12) {
                            int i13 = km2Var.h[i11];
                            dArr[i13] = dArr[i13] - (km2Var.k[i11] * d6);
                            i11++;
                            i8 = i8;
                        }
                        int i14 = i8;
                        dArr2[i9] = d6;
                        i8 = i14 + 1;
                        iArrA0[i14] = i9;
                    } else {
                        i8 = i8;
                    }
                } else {
                    i8 = i8;
                }
                i++;
            }
            i = i8;
        }
        i90Var.reset();
        i90Var2.m0(i);
    }

    /* JADX WARN: Code duplicated, block: B:233:0x056c  */
    /* JADX WARN: Code duplicated, block: B:399:0x0592 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x0572 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x0572 A[SYNTHETIC] */
    public final void F0(k52 k52Var, int[] iArr, boolean z) {
        int[][] iArr2;
        im2 im2Var;
        int i;
        im2 im2Var2;
        int[] iArr3;
        int iMin;
        int i2;
        int i3;
        int i4;
        gm2 gm2Var;
        wk wkVar;
        int[] iArr4;
        int[] iArr5;
        int i5;
        int i6;
        long j;
        int i7;
        int i8;
        int i9;
        im2 im2Var3;
        int i10;
        im2 im2Var4;
        int i11;
        int i12;
        int[] iArr6;
        int[][] iArr7;
        im2 im2Var5;
        int i13;
        int i14;
        int i15;
        im2 im2Var6;
        k52Var = k52Var;
        reset();
        int i16 = k52Var.j;
        int[] iArr8 = k52Var.n;
        double[] dArr = k52Var.p;
        int[] iArr9 = k52Var.o;
        int length = iArr.length;
        if (this.r == null || i16 != this.p || length != this.k) {
            this.p = i16;
            this.k = length;
            int iMin2 = Math.min(i16, length);
            int iMax = Math.max(i16, length);
            int iMax2 = Math.max(16, iMax << 1);
            int i17 = iMin2 + 64;
            this.r = new im2(i16, length, i17);
            this.n = new gm2(iMin2, iMax2);
            this.o = new gm2(16, 16);
            km2 km2Var = new km2();
            km2Var.c = 0;
            km2Var.i = 0;
            km2Var.d = new int[i17];
            km2Var.a = new int[i17];
            km2Var.b = new int[iMax2];
            km2Var.e = new double[iMax2];
            km2Var.j = new int[i17];
            km2Var.g = new int[i17];
            km2Var.f = new int[i17];
            km2Var.h = new int[iMax2];
            km2Var.k = new double[iMax2];
            this.t = km2Var;
            this.u = new k01(i16, length);
            this.q = new fe(iMax);
            this.m = new hm2(i16, length);
            this.s = new jm2();
        }
        this.l = z ? 1.0E-14d : h32.a;
        k01 k01Var = this.u;
        k01Var.h = -1;
        k01Var.i = -1;
        double[] dArr2 = ((i90) k01Var.j).h;
        double d = h32.a;
        Arrays.fill(dArr2, d);
        Arrays.fill(((i90) k01Var.l).h, d);
        gm2 gm2Var2 = this.o;
        gm2Var2.a = 0;
        gm2Var2.h = 0;
        gm2Var2.i[0] = 0;
        hm2 hm2Var = this.m;
        double d2 = this.l;
        im2 im2Var7 = this.r;
        gm2 gm2Var3 = this.n;
        km2 km2Var2 = this.t;
        int[][] iArr10 = hm2Var.i;
        int[] iArr11 = hm2Var.j;
        int[] iArr12 = hm2Var.f;
        int[][] iArr13 = hm2Var.g;
        double[][] dArr3 = hm2Var.h;
        int[] iArr14 = hm2Var.k;
        wk wkVar2 = hm2Var.b;
        int[] iArr15 = (int[]) wkVar2.i;
        int[] iArr16 = (int[]) wkVar2.l;
        int[] iArr17 = hm2Var.m;
        int i18 = hm2Var.r;
        int i19 = hm2Var.a;
        int iMin3 = Math.min(i18, i19);
        hm2Var.c = d2;
        im2Var7.c = 0;
        int[] iArr18 = im2Var7.h;
        Arrays.fill(iArr18, -1);
        int[] iArr19 = im2Var7.g;
        Arrays.fill(iArr19, -1);
        gm2Var3.a = 0;
        gm2Var3.h = 0;
        gm2Var3.i[0] = 0;
        hm2Var.t = 0;
        wk wkVar3 = hm2Var.s;
        int[] iArr20 = (int[]) wkVar3.i;
        int[] iArr21 = (int[]) wkVar3.l;
        im2 im2Var8 = im2Var7;
        Arrays.fill(iArr21, 0);
        int i20 = 0;
        int i21 = 0;
        while (i21 < i19) {
            int i22 = iArr[i21];
            int i23 = iArr9[i22];
            int i24 = iArr9[i22 + 1];
            int i25 = i21;
            int i26 = 0;
            for (int i27 = i23; i27 < i24; i27++) {
                if (dArr[i27] != h32.a) {
                    i26++;
                    int i28 = iArr8[i27];
                    iArr21[i28] = iArr21[i28] + 1;
                }
            }
            iArr16[i25] = i26;
            i20 += i26;
            i21 = i25 + 1;
        }
        int i29 = 1;
        iArr17[0] = 0;
        int i30 = 0;
        while (i30 < i18) {
            int i31 = i30 + 1;
            iArr17[i31] = iArr17[i30] + iArr21[i30];
            i30 = i31;
        }
        hm2Var.l = h7.m0(hm2Var.l, i20);
        System.arraycopy(iArr17, 0, iArr14, 0, i18);
        for (int i32 = 0; i32 < i19; i32++) {
            int i33 = iArr[i32];
            int i34 = iArr9[i33];
            int i35 = iArr9[i33 + 1];
            while (i34 < i35) {
                int[] iArr22 = iArr17;
                if (dArr[i34] != h32.a) {
                    int[] iArr23 = hm2Var.l;
                    int i36 = iArr8[i34];
                    int i37 = iArr14[i36];
                    iArr14[i36] = i37 + 1;
                    iArr23[i37] = i32;
                }
                i34++;
                iArr17 = iArr22;
            }
        }
        int[] iArr24 = iArr17;
        Arrays.fill(iArr14, 0);
        if (z) {
            int[] iArr25 = hm2Var.q;
            int i38 = 0;
            int i39 = 0;
            while (i38 < i19) {
                if (iArr16[i38] == i29) {
                    iArr25[i39] = i38;
                    i39++;
                }
                i38++;
                i29 = 1;
            }
            int[][] iArr26 = iArr10;
            int i40 = 0;
            int i41 = 0;
            while (i40 < i39) {
                int i42 = i40 + 1;
                int i43 = iArr25[i40];
                if (iArr19[i43] < 0) {
                    iArr6 = iArr25;
                    if (iArr16[i43] == 1) {
                        int i44 = iArr[i43];
                        double d3 = h32.a;
                        int i45 = iArr9[i44];
                        int i46 = iArr9[i44 + 1];
                        int i47 = i45;
                        while (true) {
                            if (i47 >= i46) {
                                i13 = -1;
                                break;
                            }
                            double d4 = dArr[i47];
                            if (d4 != h32.a) {
                                i13 = iArr8[i47];
                                if (iArr18[i13] < 0) {
                                    d3 = d4;
                                    break;
                                }
                            }
                            i47++;
                        }
                        int[][] iArr27 = iArr26;
                        im2 im2Var9 = im2Var8;
                        im2Var9.a(i41, i13, i43, d3);
                        int i48 = i13;
                        int i49 = iArr24[i48];
                        iArr7 = iArr27;
                        int i50 = iArr24[i48 + 1];
                        while (i49 < i50) {
                            int i51 = i50;
                            int i52 = hm2Var.l[i49];
                            if (iArr19[i52] < 0) {
                                i14 = i39;
                                i15 = i49;
                                im2Var6 = im2Var9;
                                hm2Var.a(k52Var.J(i48, iArr[i52]), i41, i52);
                                int i53 = iArr16[i52] - 1;
                                iArr16[i52] = i53;
                                if (i53 == 1) {
                                    i39 = i14 + 1;
                                    iArr6[i14] = i52;
                                }
                                i49 = i15 + 1;
                                i50 = i51;
                                im2Var9 = im2Var6;
                            } else {
                                i14 = i39;
                                i15 = i49;
                                im2Var6 = im2Var9;
                            }
                            i39 = i14;
                            i49 = i15 + 1;
                            i50 = i51;
                            im2Var9 = im2Var6;
                        }
                        im2Var5 = im2Var9;
                        i41++;
                    }
                    im2Var8 = im2Var5;
                    i40 = i42;
                    iArr25 = iArr6;
                    iArr26 = iArr7;
                } else {
                    iArr6 = iArr25;
                }
                iArr7 = iArr26;
                im2Var5 = im2Var8;
                im2Var8 = im2Var5;
                i40 = i42;
                iArr25 = iArr6;
                iArr26 = iArr7;
            }
            int[] iArr28 = iArr25;
            iArr2 = iArr26;
            im2 im2Var10 = im2Var8;
            int i54 = 0;
            int i55 = 0;
            while (i54 < i18) {
                if (iArr18[i54] < 0) {
                    int i56 = iArr24[i54];
                    int i57 = iArr24[i54 + 1];
                    int i58 = 0;
                    while (true) {
                        i12 = i54;
                        if (i56 >= i57) {
                            break;
                        }
                        if (iArr19[hm2Var.l[i56]] < 0) {
                            i58++;
                        }
                        i56++;
                        i54 = i12;
                    }
                    iArr21[i12] = i58;
                    if (i58 == 1) {
                        iArr28[i55] = i12;
                        i55++;
                    }
                } else {
                    i12 = i54;
                }
                i54 = i12 + 1;
            }
            int i59 = 0;
            while (i59 < i55) {
                i59++;
                int i60 = iArr28[i59];
                if (iArr18[i60] >= 0 || iArr21[i60] != 1) {
                    i9 = i55;
                    im2Var3 = im2Var10;
                    i41 = i41;
                } else {
                    int i61 = iArr24[i60];
                    int i62 = iArr24[i60 + 1];
                    while (true) {
                        i9 = i55;
                        if (i61 >= i62) {
                            i10 = -1;
                            break;
                        }
                        int i63 = hm2Var.l[i61];
                        if (iArr19[i63] < 0) {
                            i10 = i63;
                            break;
                        } else {
                            i61++;
                            i55 = i9;
                        }
                    }
                    int i64 = iArr[i10];
                    im2 im2Var11 = im2Var10;
                    double dJ = k52Var.J(i60, i64);
                    im2Var11.a(i41, i60, i10, dJ);
                    int i65 = gm2Var3.h;
                    int i66 = iArr9[i64];
                    int i67 = iArr9[i64 + 1];
                    int i68 = i66;
                    while (i68 < i67) {
                        int i69 = i68;
                        int i70 = iArr8[i69];
                        double d5 = dArr[i69];
                        if (d5 == h32.a || iArr18[i70] >= 0) {
                            im2Var4 = im2Var11;
                            i11 = i41;
                        } else {
                            im2Var4 = im2Var11;
                            i11 = i41;
                            gm2Var3.a(i70, d5 / dJ);
                            int i71 = iArr21[i70] - 1;
                            iArr21[i70] = i71;
                            if (i71 == 1) {
                                iArr28[i9] = i70;
                                i9++;
                            }
                        }
                        i68 = i69 + 1;
                        i41 = i11;
                        im2Var11 = im2Var4;
                    }
                    im2Var3 = im2Var11;
                    int i72 = i41;
                    if (gm2Var3.h > i65) {
                        gm2Var3.b(i60);
                    }
                    i41 = i72 + 1;
                }
                i55 = i9;
                im2Var10 = im2Var3;
            }
            im2Var = im2Var10;
            i = i41;
        } else {
            iArr2 = iArr10;
            im2Var = im2Var8;
            i = 0;
        }
        if (i < iMin3) {
            Arrays.fill(iArr15, -1);
            Arrays.fill(iArr20, -1);
            for (int i73 = 0; i73 < i19; i73++) {
                if (iArr19[i73] < 0) {
                    int i74 = iArr[i73];
                    int i75 = iArr9[i74 + 1];
                    int i76 = iArr9[i74];
                    int i77 = i75 - i76;
                    int[] iArr29 = iArr13[i73];
                    if (iArr29 == null || iArr29.length < i77 + 4) {
                        int i78 = i77 + 8;
                        iArr13[i73] = new int[i78];
                        dArr3[i73] = new double[i78];
                    }
                    int i79 = 0;
                    while (i76 < i75) {
                        double d6 = dArr[i76];
                        if (d6 != h32.a) {
                            int i80 = iArr8[i76];
                            if (iArr18[i80] < 0) {
                                iArr13[i73][i79] = i80;
                                dArr3[i73][i79] = d6;
                                i79++;
                            }
                        }
                        i76++;
                    }
                    iArr12[i73] = i79;
                    wkVar2.z(i73, i79);
                }
            }
            for (int i81 = 0; i81 < i18; i81++) {
                if (iArr18[i81] < 0) {
                    int i82 = i81 + 1;
                    int i83 = iArr24[i82];
                    int i84 = 0;
                    for (int i85 = iArr24[i81]; i85 < i83; i85++) {
                        if (iArr19[hm2Var.l[i85]] < 0) {
                            i84++;
                        }
                    }
                    int[] iArr30 = iArr2[i81];
                    if (iArr30 == null || iArr30.length < i84 + 4) {
                        iArr2[i81] = new int[i84 + 8];
                    }
                    int i86 = iArr24[i82];
                    int i87 = 0;
                    for (int i88 = iArr24[i81]; i88 < i86; i88++) {
                        int i89 = hm2Var.l[i88];
                        if (iArr19[i89] < 0) {
                            iArr2[i81][i87] = i89;
                            i87++;
                        }
                    }
                    iArr11[i81] = i87;
                    wkVar3.z(i81, i87);
                }
            }
            if (z) {
                iMin = Math.min(i18, i19);
                while (i < iMin) {
                    hm2Var.o = -1;
                    hm2Var.n = -1;
                    hm2Var.p = h32.a;
                    int iMax3 = Math.max(i18, i19);
                    long j2 = Long.MAX_VALUE;
                    int i90 = 0;
                    int i91 = 1;
                    while (true) {
                        int i92 = i;
                        if (i91 > iMax3) {
                            i4 = iMin;
                            gm2Var = gm2Var3;
                            wkVar = wkVar2;
                            iArr4 = iArr15;
                            iArr5 = iArr20;
                            i5 = hm2Var.o;
                            if (i5 < 0) {
                                iMin = i92;
                                break;
                            }
                        } else {
                            if (i91 <= i18) {
                                int i93 = iArr15[i91];
                                while (true) {
                                    if (i93 >= 0) {
                                        int[] iArr31 = iArr13[i93];
                                        double[] dArr4 = dArr3[i93];
                                        i4 = iMin;
                                        int i94 = iArr12[i93];
                                        gm2Var = gm2Var3;
                                        int i95 = iMax3;
                                        int i96 = 0;
                                        iArr4 = iArr15;
                                        double dMax = h32.a;
                                        while (i96 < i94) {
                                            dMax = Math.max(dMax, Math.abs(dArr4[i96]));
                                            i96++;
                                            iArr20 = iArr20;
                                            j2 = j2;
                                        }
                                        iArr5 = iArr20;
                                        double d7 = dMax * 0.1d;
                                        int i97 = 0;
                                        while (i97 < i94) {
                                            double dAbs = Math.abs(dArr4[i97]);
                                            if (dAbs < d7 || dAbs <= h32.a) {
                                                i7 = i94;
                                                i8 = i97;
                                            } else {
                                                i7 = i94;
                                                i8 = i97;
                                                long j3 = ((long) (i91 - 1)) * ((long) (iArr11[iArr31[i97]] - 1));
                                                if (j3 < j2 || (j3 == j2 && dAbs > Math.abs(hm2Var.p))) {
                                                    hm2Var.o = iArr31[i8];
                                                    hm2Var.n = i93;
                                                    hm2Var.p = dArr4[i8];
                                                    j2 = j3;
                                                }
                                            }
                                            i97 = i8 + 1;
                                            i94 = i7;
                                        }
                                        int i98 = hm2Var.o;
                                        if (i98 >= 0) {
                                            i90++;
                                            if (i90 < 8) {
                                                long j4 = i91 - 1;
                                                if (j2 <= j4 * j4) {
                                                }
                                            }
                                            i6 = i98;
                                            wkVar = wkVar2;
                                        }
                                        i93 = ((int[]) wkVar2.j)[i93];
                                        iMin = i4;
                                        iMax3 = i95;
                                        gm2Var3 = gm2Var;
                                        iArr15 = iArr4;
                                        iArr20 = iArr5;
                                    }
                                    gm2 gm2Var4 = gm2Var;
                                    im2 im2Var12 = im2Var;
                                    hm2Var.b(i92, i6, hm2Var.n, hm2Var.p, im2Var12, gm2Var4);
                                    i = i92 + 1;
                                    iMin = i4;
                                    im2Var = im2Var12;
                                    gm2Var3 = gm2Var4;
                                    iArr15 = iArr4;
                                    iArr20 = iArr5;
                                    wkVar2 = wkVar;
                                }
                            }
                            i4 = iMin;
                            gm2Var = gm2Var3;
                            iArr4 = iArr15;
                            int i99 = iMax3;
                            iArr5 = iArr20;
                            if (i91 <= i19) {
                                int i100 = iArr5[i91];
                                while (true) {
                                    if (i100 >= 0) {
                                        int[] iArr32 = iArr2[i100];
                                        int i101 = iArr11[i100];
                                        int i102 = 0;
                                        while (i102 < i101) {
                                            int i103 = iArr32[i102];
                                            int[] iArr33 = iArr13[i103];
                                            double[] dArr5 = dArr3[i103];
                                            int[] iArr34 = iArr32;
                                            int i104 = iArr12[i103];
                                            double d8 = h32.a;
                                            int i105 = i101;
                                            wk wkVar4 = wkVar2;
                                            int i106 = i102;
                                            double dMax2 = d8;
                                            int i107 = 0;
                                            while (i107 < i104) {
                                                int i108 = i104;
                                                int i109 = i107;
                                                dMax2 = Math.max(dMax2, Math.abs(dArr5[i107]));
                                                if (iArr33[i109] == i100) {
                                                    d8 = dArr5[i109];
                                                }
                                                i107 = i109 + 1;
                                                i104 = i108;
                                            }
                                            int i110 = i104;
                                            double dAbs2 = Math.abs(d8);
                                            if (dAbs2 >= dMax2 * 0.1d && dAbs2 > h32.a) {
                                                long j5 = ((long) (i91 - 1)) * ((long) (i110 - 1));
                                                if (j5 < j2 || (j5 == j2 && dAbs2 > Math.abs(hm2Var.p))) {
                                                    hm2Var.o = i100;
                                                    hm2Var.n = i103;
                                                    hm2Var.p = d8;
                                                    j2 = j5;
                                                }
                                            }
                                            i102 = i106 + 1;
                                            iArr32 = iArr34;
                                            i101 = i105;
                                            wkVar2 = wkVar4;
                                        }
                                        wkVar = wkVar2;
                                        i5 = hm2Var.o;
                                        if (i5 >= 0) {
                                            i90++;
                                            if (i90 < 8) {
                                                long j6 = i91 - 1;
                                                if (j2 > j6 * j6) {
                                                }
                                            }
                                        }
                                        i100 = ((int[]) wkVar3.j)[i100];
                                        wkVar2 = wkVar;
                                    } else {
                                        wkVar = wkVar2;
                                        i5 = hm2Var.o;
                                        if (i5 >= 0) {
                                            j = i91;
                                            if (j2 > j * j) {
                                            }
                                        }
                                        i91++;
                                        iMin = i4;
                                        iMax3 = i99;
                                        i = i92;
                                        gm2Var3 = gm2Var;
                                        iArr15 = iArr4;
                                        iArr20 = iArr5;
                                        wkVar2 = wkVar;
                                    }
                                }
                            } else {
                                wkVar = wkVar2;
                                i5 = hm2Var.o;
                                if (i5 >= 0) {
                                    j = i91;
                                    if (j2 > j * j) {
                                    }
                                }
                                i91++;
                                iMin = i4;
                                iMax3 = i99;
                                i = i92;
                                gm2Var3 = gm2Var;
                                iArr15 = iArr4;
                                iArr20 = iArr5;
                                wkVar2 = wkVar;
                            }
                        }
                        i6 = i5;
                        gm2 gm2Var5 = gm2Var;
                        im2 im2Var13 = im2Var;
                        hm2Var.b(i92, i6, hm2Var.n, hm2Var.p, im2Var13, gm2Var5);
                        i = i92 + 1;
                        iMin = i4;
                        im2Var = im2Var13;
                        gm2Var3 = gm2Var5;
                        iArr15 = iArr4;
                        iArr20 = iArr5;
                        wkVar2 = wkVar;
                    }
                }
                im2Var2 = im2Var;
            } else {
                int iMin4 = Math.min(i18, i19);
                im2 im2Var14 = im2Var;
                int i111 = 0;
                int i112 = 0;
                while (i112 < i19 && i111 < iMin4) {
                    int[] iArr35 = iArr13[i112];
                    double[] dArr6 = dArr3[i112];
                    int i113 = iArr12[i112];
                    double dMax3 = h32.a;
                    for (int i114 = 0; i114 < i113; i114++) {
                        dMax3 = Math.max(dMax3, Math.abs(dArr6[i114]));
                    }
                    double d9 = dMax3 * 0.1d;
                    double d10 = h32.a;
                    if (dMax3 > d10) {
                        int i115 = 0;
                        int i116 = -1;
                        while (i115 < i113) {
                            double dAbs3 = Math.abs(dArr6[i115]);
                            if (dAbs3 >= d9) {
                                int i117 = iArr35[i115];
                                if (i116 >= 0) {
                                    int i118 = iArr11[i117];
                                    i3 = iMin4;
                                    int i119 = iArr11[i116];
                                    if (i118 < i119 || (i118 == i119 && dAbs3 > Math.abs(d10))) {
                                    }
                                } else {
                                    i3 = iMin4;
                                }
                                d10 = dArr6[i115];
                                i116 = i117;
                            } else {
                                i3 = iMin4;
                            }
                            i115++;
                            iMin4 = i3;
                        }
                        i2 = iMin4;
                        hm2Var.b(i111, i116, i112, d10, im2Var14, gm2Var3);
                        i111++;
                    } else {
                        i2 = iMin4;
                    }
                    im2Var14 = im2Var14;
                    i112++;
                    iMin4 = i2;
                }
                im2Var2 = im2Var14;
                iMin = i111;
            }
            int i120 = iMin;
            int i121 = 0;
            int i122 = 0;
            while (i120 < iMin3) {
                int i123 = i121;
                while (iArr18[i123] >= 0) {
                    i123++;
                }
                int i124 = i122;
                while (iArr19[i124] >= 0) {
                    i124++;
                }
                im2Var2.a(i120, i123, i124, h32.a);
                i120++;
                i121 = i123;
                i122 = i124;
            }
        } else {
            im2Var2 = im2Var;
        }
        int i125 = hm2Var.t;
        int[] iArr36 = hm2Var.v;
        int[] iArr37 = hm2Var.u;
        double[] dArr7 = hm2Var.w;
        km2Var2.b = h7.m0(km2Var2.b, i125);
        km2Var2.e = h7.l0(i125, km2Var2.e);
        km2Var2.h = h7.m0(km2Var2.h, i125);
        km2Var2.k = h7.l0(i125, km2Var2.k);
        Arrays.fill(km2Var2.d, 0, iMin3, 0);
        Arrays.fill(km2Var2.f, 0, iMin3, 0);
        for (int i126 = 0; i126 < i125; i126++) {
            int i127 = iArr19[iArr37[i126]];
            if (i127 >= 0) {
                int[] iArr38 = km2Var2.d;
                iArr38[i127] = iArr38[i127] + 1;
            }
            int[] iArr39 = km2Var2.f;
            int i128 = iArr36[i126];
            iArr39[i128] = iArr39[i128] + 1;
        }
        int i129 = 0;
        int i130 = 0;
        for (int i131 = 0; i131 < iMin3; i131++) {
            int[] iArr40 = km2Var2.d;
            int i132 = iArr40[i131];
            iArr40[i131] = i129;
            km2Var2.a[i131] = i129;
            i129 += i132;
            km2Var2.j[i131] = i130;
            km2Var2.g[i131] = i130;
            i130 += km2Var2.f[i131];
        }
        for (int i133 = 0; i133 < i125; i133++) {
            int i134 = iArr36[i133];
            int i135 = iArr37[i133];
            double d11 = dArr7[i133];
            int i136 = iArr19[i135];
            if (i136 >= 0) {
                int[] iArr41 = km2Var2.a;
                int i137 = iArr41[i136];
                iArr41[i136] = i137 + 1;
                km2Var2.b[i137] = im2Var2.f[i134];
                km2Var2.e[i137] = d11;
            }
            int[] iArr42 = km2Var2.g;
            int i138 = iArr42[i134];
            iArr42[i134] = i138 + 1;
            km2Var2.h[i138] = i135;
            km2Var2.k[i138] = d11;
        }
        km2Var2.c = i129;
        km2Var2.i = i130;
        int i139 = hm2Var.t;
        int iMin5 = Math.min(this.p, this.k);
        im2 im2Var15 = this.r;
        im2Var15.c = iMin5;
        ly1 ly1Var = im2Var15.b;
        ly1Var.c(im2Var15.h.length);
        ly1 ly1Var2 = im2Var15.a;
        ly1Var2.c(im2Var15.g.length);
        for (int i140 = 0; i140 < iMin5; i140++) {
            ly1Var.a(i140, ly1Var.d()[im2Var15.f[i140]]);
            ly1Var2.a(i140, ly1Var2.d()[im2Var15.e[i140]]);
        }
        gm2 gm2Var6 = this.n;
        int i141 = this.p;
        int[] iArr43 = gm2Var6.b;
        if (iArr43 == null || iArr43.length != i141) {
            gm2Var6.b = new int[i141];
            gm2Var6.e = new int[i141 + 1];
            int iMax4 = Math.max(16, gm2Var6.h);
            gm2Var6.f = new int[iMax4];
            gm2Var6.g = new double[iMax4];
        } else {
            gm2Var6.f = h7.m0(gm2Var6.f, gm2Var6.h);
            gm2Var6.g = h7.l0(gm2Var6.h, gm2Var6.g);
        }
        Arrays.fill(gm2Var6.b, -1);
        Arrays.fill(gm2Var6.e, 0);
        int i142 = 0;
        while (i142 < gm2Var6.a) {
            gm2Var6.b[gm2Var6.d[i142]] = i142;
            int[] iArr44 = gm2Var6.i;
            i142++;
            int i143 = iArr44[i142];
            for (int i144 = iArr44[i142]; i144 < i143; i144++) {
                int[] iArr45 = gm2Var6.e;
                int i145 = gm2Var6.c[i144] + 1;
                iArr45[i145] = iArr45[i145] + 1;
            }
        }
        int i146 = 0;
        while (i146 < i141) {
            int[] iArr46 = gm2Var6.e;
            int i147 = i146 + 1;
            iArr46[i147] = iArr46[i147] + iArr46[i146];
            i146 = i147;
        }
        int i148 = 0;
        while (i148 < gm2Var6.a) {
            int[] iArr47 = gm2Var6.i;
            int i149 = i148 + 1;
            int i150 = iArr47[i149];
            for (int i151 = iArr47[i148]; i151 < i150; i151++) {
                int[] iArr48 = gm2Var6.e;
                int i152 = gm2Var6.c[i151];
                int i153 = iArr48[i152];
                iArr48[i152] = i153 + 1;
                gm2Var6.f[i153] = gm2Var6.d[i148];
                gm2Var6.g[i153] = gm2Var6.j[i151];
            }
            i148 = i149;
        }
        while (true) {
            iArr3 = gm2Var6.e;
            if (i141 <= 0) {
                break;
            }
            iArr3[i141] = iArr3[i141 - 1];
            i141--;
        }
        iArr3[0] = 0;
        double dMax4 = h32.a;
        double dMin = Double.MAX_VALUE;
        for (int i154 = 0; i154 < iMin5; i154++) {
            double d12 = this.r.d[i154];
            double dAbs4 = Double.isFinite(d12) ? Math.abs(d12) : h32.a;
            dMax4 = Math.max(dMax4, dAbs4);
            dMin = Math.min(dMin, dAbs4);
        }
        jm2 jm2Var = this.s;
        jm2Var.b = this.n.h + i139 + iMin5;
        jm2Var.f = 0;
        jm2Var.d = dMax4;
        jm2Var.e = dMin;
        this.j = null;
        this.h = true;
    }

    @Override // defpackage.me1
    public final re1 H1(e1 e1Var, gy1 gy1Var) {
        e1Var.a(gy1Var);
        x.d0(this, gy1Var);
        return gy1Var;
    }

    public final void M0(i90 i90Var) {
        int iZ;
        int[] iArr;
        boolean zT0 = T0(i90Var.j(), this.p, this.s.c, 0.5d);
        gm2 gm2Var = this.n;
        fe feVar = this.q;
        gm2Var.getClass();
        int[] iArrA0 = i90Var.a0();
        double[] dArr = i90Var.h;
        int iJ = i90Var.j();
        if (zT0) {
            iZ = feVar.z(iArrA0, iJ, gm2Var.b, gm2Var.i, null, gm2Var.c, null);
            int i = iZ - 1;
            while (true) {
                iArr = (int[]) feVar.g;
                if (i < 0) {
                    break;
                }
                int i2 = iArr[i];
                int i3 = gm2Var.b[i2];
                if (i3 >= 0) {
                    double d = dArr[i2];
                    if (d != h32.a) {
                        int[] iArr2 = gm2Var.i;
                        int i4 = iArr2[i3 + 1];
                        for (int i5 = iArr2[i3]; i5 < i4; i5++) {
                            int i6 = gm2Var.c[i5];
                            dArr[i6] = dArr[i6] - (gm2Var.j[i5] * d);
                        }
                    }
                }
                i--;
            }
            System.arraycopy(iArr, 0, iArrA0, 0, iZ);
        } else {
            iZ = iJ;
            int[] iArr3 = (int[]) feVar.f;
            int i7 = feVar.b;
            if (i7 == Integer.MAX_VALUE) {
                Arrays.fill(iArr3, 0);
                feVar.b = 0;
                i7 = 0;
            }
            feVar.b = i7 + 1;
            for (int i8 = 0; i8 < iZ; i8++) {
                iArr3[iArrA0[i8]] = feVar.b;
            }
            for (int i9 = 0; i9 < gm2Var.a; i9++) {
                double d2 = dArr[gm2Var.d[i9]];
                if (d2 != h32.a) {
                    int[] iArr4 = gm2Var.i;
                    int i10 = iArr4[i9 + 1];
                    for (int i11 = iArr4[i9]; i11 < i10; i11++) {
                        int i12 = gm2Var.c[i11];
                        dArr[i12] = dArr[i12] - (gm2Var.j[i11] * d2);
                        if (feVar.H(i12)) {
                            iArrA0[iZ] = i12;
                            iZ++;
                        }
                    }
                }
            }
        }
        i90Var.m0(iZ);
        gm2 gm2Var2 = this.o;
        fe feVar2 = this.q;
        gm2Var2.getClass();
        int[] iArrA1 = i90Var.a0();
        int iJ2 = i90Var.j();
        int i13 = 0;
        while (i13 < gm2Var2.a) {
            int i14 = gm2Var2.d[i13];
            double d3 = dArr[i14];
            int[] iArr5 = gm2Var2.i;
            i13++;
            int i15 = iArr5[i13];
            for (int i16 = iArr5[i13]; i16 < i15; i16++) {
                d3 -= gm2Var2.j[i16] * dArr[gm2Var2.c[i16]];
            }
            dArr[i14] = d3;
            if (d3 != h32.a && feVar2.H(i14)) {
                iArrA1[iJ2] = i14;
                iJ2++;
            }
        }
        i90Var.m0(iJ2);
    }

    @Override // defpackage.no2
    public final int T() {
        return this.k;
    }

    @Override // defpackage.le1
    public final int Y(double d) {
        int i = 0;
        int i2 = 0;
        while (true) {
            im2 im2Var = this.r;
            if (i >= im2Var.c) {
                return i2;
            }
            if (im2Var.f[i] >= 0 && Math.abs(im2Var.d[i]) > d) {
                i2++;
            }
            i++;
        }
    }

    @Override // defpackage.no2
    public final int Z1() {
        return this.p;
    }

    @Override // defpackage.x
    public final boolean a0() {
        return N() && n1();
    }

    @Override // defpackage.ul2
    public final gy1 j(int i, int i2, int i3) {
        return m0(i, i3);
    }

    @Override // defpackage.le1
    public final double j1() {
        double dMax = Double.MIN_NORMAL;
        int i = 0;
        while (true) {
            im2 im2Var = this.r;
            if (i >= im2Var.c) {
                return i0() * dMax;
            }
            if (im2Var.f[i] >= 0) {
                dMax = Math.max(dMax, Math.abs(im2Var.d[i]));
            }
            i++;
        }
    }

    @Override // defpackage.ne1
    public final boolean p0(e1 e1Var) {
        k52 k52VarT1;
        if (e1Var instanceof sm2) {
            k52VarT1 = ((sm2) e1Var).t0();
        } else {
            k52VarT1 = e1Var instanceof k1 ? k52.T1((k1) e1Var, null) : ((rm2) e1Var.o1(rm2.r)).t0();
        }
        F0(k52VarT1, mo2.E1(0, k52VarT1.h), false);
        return true;
    }

    @Override // defpackage.g01
    public final void x1(double[] dArr) {
        int i = 0;
        System.arraycopy(dArr, 0, (double[]) this.u.k, 0, this.p);
        double[] dArr2 = (double[]) this.u.k;
        gm2 gm2Var = this.n;
        for (int i2 = 0; i2 < gm2Var.a; i2++) {
            double d = dArr2[gm2Var.d[i2]];
            if (d != h32.a) {
                int[] iArr = gm2Var.i;
                int i3 = iArr[i2 + 1];
                for (int i4 = iArr[i2]; i4 < i3; i4++) {
                    int i5 = gm2Var.c[i4];
                    dArr2[i5] = dArr2[i5] - (gm2Var.j[i4] * d);
                }
            }
        }
        gm2 gm2Var2 = this.o;
        while (i < gm2Var2.a) {
            int i6 = gm2Var2.d[i];
            double d2 = dArr2[i6];
            int[] iArr2 = gm2Var2.i;
            i++;
            int i7 = iArr2[i];
            for (int i8 = iArr2[i]; i8 < i7; i8++) {
                d2 -= gm2Var2.j[i8] * dArr2[gm2Var2.c[i8]];
            }
            dArr2[i6] = d2;
        }
        km2 km2Var = this.t;
        double[] dArr3 = (double[]) this.u.k;
        im2 im2Var = this.r;
        km2Var.getClass();
        for (int i9 = im2Var.c - 1; i9 >= 0; i9--) {
            int i10 = im2Var.f[i9];
            if (i10 >= 0) {
                double d3 = dArr3[i10];
                if (d3 != h32.a) {
                    d3 /= im2Var.d[i9];
                    int i11 = km2Var.a[i9];
                    for (int i12 = km2Var.d[i9]; i12 < i11; i12++) {
                        int i13 = km2Var.b[i12];
                        dArr3[i13] = dArr3[i13] - (km2Var.e[i12] * d3);
                    }
                }
                dArr[im2Var.e[i9]] = d3;
            }
        }
    }
}
