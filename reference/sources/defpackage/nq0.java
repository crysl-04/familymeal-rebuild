package defpackage;

import com.sun.management.HotSpotDiagnosticMXBean;
import java.lang.management.ManagementFactory;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class nq0 {
    public static final u8 a = fu1.j.a();

    static {
        e();
    }

    public static void a(double[] dArr, int i, double d, double d2, double d3) {
        double d4 = d * d2;
        if (d3 != h32.a) {
            d4 += d3 * dArr[i];
        }
        dArr[i] = d4;
    }

    public static void b(final boolean z, final boolean z2, final int i, int i2, final int i3, final double d, final double[] dArr, final int i4, final int i5, final double[] dArr2, final int i6, final int i7, final double d2, final double[] dArr3, final int i8, final int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        u8 u8Var;
        double d3 = h32.a;
        if (d != d3 && i3 > 0 && (i == 1 || i2 == 1 || i3 == 1)) {
            if (i2 == 1) {
                int i15 = z2 ? i7 : 1;
                if (z) {
                    pq0.b(true, i3, i, d, dArr, i4, i5, dArr2, i6, i15, d2, dArr3, i8, 1);
                    return;
                } else {
                    pq0.b(false, i, i3, d, dArr, i4, i5, dArr2, i6, i15, d2, dArr3, i8, 1);
                    return;
                }
            }
            if (i == 1) {
                int i16 = z ? 1 : i5;
                if (z2) {
                    pq0.b(false, i2, i3, d, dArr2, i6, i7, dArr, i4, i16, d2, dArr3, i8, i9);
                    return;
                } else {
                    pq0.b(true, i3, i2, d, dArr2, i6, i7, dArr, i4, i16, d2, dArr3, i8, i9);
                    return;
                }
            }
            double[] dArr4 = dArr3;
            for (int i17 = 0; i17 < i2; i17++) {
                int i18 = (i17 * i9) + i8;
                p02.J(dArr4, i18, i18 + i, d2);
            }
            int i19 = z ? i5 : 1;
            int i20 = z2 ? 1 : i7;
            int i21 = i20 < 0 ? i6 - ((i2 - 1) * i20) : i6;
            if (i19 != 1) {
                int i22 = i21;
                int i23 = 0;
                while (i23 < i2) {
                    t03.w(dArr2[i22] * d, i, i4, i19, (i23 * i9) + i8, 1, dArr, dArr4);
                    i23++;
                    i22 += i20;
                    dArr4 = dArr3;
                }
                return;
            }
            int i24 = 0;
            while (i24 < i2) {
                double d4 = dArr2[i21] * d;
                int i25 = (i24 * i9) + i8;
                for (int i26 = 0; i26 < i; i26++) {
                    int i27 = i25 + i26;
                    dArr3[i27] = (dArr[i4 + i26] * d4) + dArr3[i27];
                }
                i24++;
                i21 += i20;
            }
            return;
        }
        int i28 = i3;
        int i29 = i;
        int i30 = i2;
        u8 u8Var2 = a;
        int i31 = 70;
        if (d == d3 || i29 <= 3000 || i28 <= 3000) {
            int iK = oe1.k(70, i, i3);
            if (i30 <= iK) {
                c(z, z2, i, 0, i30, i3, d, dArr, i4, i5, dArr2, i6, i7, d2, dArr3, i8, i9);
                return;
            }
            u8Var2.a = iK;
            final byte b = 0;
            u8Var2.b(0, i2, new sb0() { // from class: mq0
                @Override // defpackage.sb0
                public final void a(int i32, int i33) {
                    switch (b) {
                        case 0:
                            nq0.c(z, z2, i, i32, i33, i3, d, dArr, i4, i5, dArr2, i6, i7, d2, dArr3, i8, i9);
                            break;
                        default:
                            nq0.c(z, z2, i, i32, i33, i3, d, dArr, i4, i5, dArr2, i6, i7, d2, dArr3, i8, i9);
                            break;
                    }
                }
            });
            return;
        }
        int i32 = z2 ? i7 : 1;
        int i33 = 0;
        while (i33 < i28) {
            int i34 = 512;
            int iMin = Math.min(512, i28 - i33);
            double d5 = i33 == 0 ? d2 : h32.b;
            final int i35 = (i33 * i32) + i6;
            int i36 = 0;
            while (i36 < i29) {
                final int iMin2 = Math.min(i34, i29 - i36);
                if (z) {
                    i10 = i4 + i33;
                    i11 = i36 * i5;
                } else {
                    i10 = i4 + i36;
                    i11 = i33 * i5;
                }
                final int i37 = i11 + i10;
                final int i38 = i8 + i36;
                int i39 = i35;
                u8 u8Var3 = u8Var2;
                int iK2 = oe1.k(i31, iMin2, iMin);
                if (i30 > iK2) {
                    u8Var3.a = iK2;
                    final byte b2 = 1;
                    i12 = i33;
                    final int i40 = iMin;
                    final double d6 = d5;
                    i35 = i39;
                    i14 = 512;
                    sb0 sb0Var = new sb0() { // from class: mq0
                        @Override // defpackage.sb0
                        public final void a(int i310, int i311) {
                            switch (b2) {
                                case 0:
                                    nq0.c(z, z2, iMin2, i310, i311, i40, d, dArr, i37, i5, dArr2, i35, i7, d6, dArr3, i38, i9);
                                    break;
                                default:
                                    nq0.c(z, z2, iMin2, i310, i311, i40, d, dArr, i37, i5, dArr2, i35, i7, d6, dArr3, i38, i9);
                                    break;
                            }
                        }
                    };
                    iMin = i40;
                    d5 = d6;
                    i13 = i2;
                    u8Var3.b(0, i13, sb0Var);
                    u8Var = u8Var3;
                } else {
                    i12 = i33;
                    i13 = i30;
                    i14 = 512;
                    u8Var = u8Var3;
                    c(z, z2, iMin2, 0, i13, iMin, d, dArr, i37, i5, dArr2, i39, i7, d5, dArr3, i38, i9);
                    i35 = i39;
                }
                i36 += 512;
                i29 = i;
                i30 = i13;
                i34 = i14;
                i33 = i12;
                u8Var2 = u8Var;
                i31 = 70;
            }
            i28 = i3;
            i33 += 512;
            i31 = 70;
            i29 = i;
        }
    }

    public static void c(boolean z, boolean z2, int i, int i2, int i3, int i4, double d, double[] dArr, int i5, int i6, double[] dArr2, int i7, int i8, double d2, double[] dArr3, int i9, int i10) {
        if (d == h32.a || i4 == 0) {
            for (int i11 = i2; i11 < i3; i11++) {
                int i12 = (i11 * i10) + i9;
                p02.J(dArr3, i12, i12 + i, d2);
            }
            return;
        }
        if (!z) {
            if (z2) {
                d(i, i2, i3, i4, d, dArr, i5, i6, dArr2, i7, i8, 1, d2, dArr3, i9, i10);
                return;
            } else {
                d(i, i2, i3, i4, d, dArr, i5, i6, dArr2, i7, 1, i8, d2, dArr3, i9, i10);
                return;
            }
        }
        int i13 = i4;
        if (z2) {
            int i14 = i13;
            int i15 = i - (i % 4);
            int i16 = i2;
            while (i16 + 3 < i3) {
                int i17 = (i16 * i10) + i9;
                int i18 = i17 + i10;
                int i19 = i18 + i10;
                int i20 = i19 + i10;
                int i21 = 0;
                while (i21 < i15) {
                    int i22 = (i21 * i6) + i5;
                    int i23 = i22 + i6;
                    int i24 = i23 + i6;
                    int i25 = i24 + i6;
                    double d3 = h32.a;
                    int i26 = i7 + i16;
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
                    int i27 = 0;
                    while (i27 < i14) {
                        double d19 = dArr[i22 + i27];
                        double d20 = dArr[i23 + i27];
                        double d21 = dArr[i24 + i27];
                        double d22 = dArr[i25 + i27];
                        double d23 = dArr2[i26];
                        double d24 = dArr2[i26 + 1];
                        double d25 = dArr2[i26 + 2];
                        double d26 = dArr2[i26 + 3];
                        d3 = (d19 * d23) + d3;
                        d4 = (d20 * d23) + d4;
                        d5 = (d21 * d23) + d5;
                        d6 = (d23 * d22) + d6;
                        d7 = (d19 * d24) + d7;
                        d8 = (d20 * d24) + d8;
                        d9 = (d21 * d24) + d9;
                        d10 = (d24 * d22) + d10;
                        d11 = (d19 * d25) + d11;
                        d12 = (d20 * d25) + d12;
                        d13 = (d21 * d25) + d13;
                        d14 = (d25 * d22) + d14;
                        d15 = (d19 * d26) + d15;
                        d16 = (d20 * d26) + d16;
                        d17 = (d21 * d26) + d17;
                        d18 = (d22 * d26) + d18;
                        i27++;
                        i26 += i8;
                    }
                    int i28 = i17 + i21;
                    int i29 = i21;
                    a(dArr3, i28, d, d3, d2);
                    a(dArr3, i28 + 1, d, d4, d2);
                    a(dArr3, i28 + 2, d, d5, d2);
                    a(dArr3, i28 + 3, d, d6, d2);
                    int i30 = i18 + i29;
                    a(dArr3, i30, d, d7, d2);
                    a(dArr3, i30 + 1, d, d8, d2);
                    a(dArr3, i30 + 2, d, d9, d2);
                    a(dArr3, i30 + 3, d, d10, d2);
                    int i31 = i19 + i29;
                    a(dArr3, i31, d, d11, d2);
                    a(dArr3, i31 + 1, d, d12, d2);
                    a(dArr3, i31 + 2, d, d13, d2);
                    a(dArr3, i31 + 3, d, d14, d2);
                    int i32 = i20 + i29;
                    a(dArr3, i32, d, d15, d2);
                    a(dArr3, i32 + 1, d, d16, d2);
                    a(dArr3, i32 + 2, d, d17, d2);
                    a(dArr3, i32 + 3, d, d18, d2);
                    i21 = i29 + 4;
                }
                int i33 = i15;
                while (i33 < i) {
                    int i34 = (i33 * i6) + i5;
                    int i35 = i7 + i16;
                    a(dArr3, i17 + i33, d, ou.B(i14, i34, i35, i8, dArr, dArr2), d2);
                    a(dArr3, i18 + i33, d, ou.B(i4, i34, i35 + 1, i8, dArr, dArr2), d2);
                    a(dArr3, i19 + i33, d, ou.B(i4, i34, i35 + 2, i8, dArr, dArr2), d2);
                    a(dArr3, i20 + i33, d, ou.B(i4, i34, i35 + 3, i8, dArr, dArr2), d2);
                    i33++;
                    i14 = i4;
                }
                i16 += 4;
                i14 = i4;
            }
            while (i16 < i3) {
                int i36 = (i16 * i10) + i9;
                for (int i37 = 0; i37 < i; i37++) {
                    a(dArr3, i36 + i37, d, ou.B(i4, (i37 * i6) + i5, i7 + i16, i8, dArr, dArr2), d2);
                }
                i16++;
            }
            return;
        }
        int i38 = i - (i % 4);
        int i39 = i2;
        while (i39 + 3 < i3) {
            int i40 = (i39 * i8) + i7;
            int i41 = i40 + i8;
            int i42 = i41 + i8;
            int i43 = i42 + i8;
            int i44 = (i39 * i10) + i9;
            int i45 = i44 + i10;
            int i46 = i45 + i10;
            int i47 = i46 + i10;
            int i48 = 0;
            while (i48 < i38) {
                int i49 = (i48 * i6) + i5;
                int i50 = i49 + i6;
                int i51 = i50 + i6;
                int i52 = i51 + i6;
                double d27 = h32.a;
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
                double d42 = d41;
                for (int i53 = 0; i53 < i13; i53++) {
                    double d43 = dArr[i49 + i53];
                    double d44 = dArr[i50 + i53];
                    double d45 = dArr[i51 + i53];
                    double d46 = dArr[i52 + i53];
                    double d47 = dArr2[i40 + i53];
                    double d48 = dArr2[i41 + i53];
                    double d49 = dArr2[i42 + i53];
                    double d50 = dArr2[i43 + i53];
                    d27 = (d43 * d47) + d27;
                    d28 = (d44 * d47) + d28;
                    d29 = (d45 * d47) + d29;
                    d30 = (d47 * d46) + d30;
                    d31 = (d43 * d48) + d31;
                    d32 = (d44 * d48) + d32;
                    d33 = (d45 * d48) + d33;
                    d34 = (d48 * d46) + d34;
                    d35 = (d43 * d49) + d35;
                    d36 = (d44 * d49) + d36;
                    d37 = (d45 * d49) + d37;
                    d38 = (d49 * d46) + d38;
                    d39 = (d43 * d50) + d39;
                    d40 = (d44 * d50) + d40;
                    d41 = (d45 * d50) + d41;
                    d42 = (d46 * d50) + d42;
                }
                int i54 = i44 + i48;
                int i55 = i48;
                a(dArr3, i54, d, d27, d2);
                a(dArr3, i54 + 1, d, d28, d2);
                a(dArr3, i54 + 2, d, d29, d2);
                a(dArr3, i54 + 3, d, d30, d2);
                int i56 = i45 + i55;
                a(dArr3, i56, d, d31, d2);
                a(dArr3, i56 + 1, d, d32, d2);
                a(dArr3, i56 + 2, d, d33, d2);
                a(dArr3, i56 + 3, d, d34, d2);
                int i57 = i46 + i55;
                a(dArr3, i57, d, d35, d2);
                a(dArr3, i57 + 1, d, d36, d2);
                a(dArr3, i57 + 2, d, d37, d2);
                a(dArr3, i57 + 3, d, d38, d2);
                int i58 = i47 + i55;
                a(dArr3, i58, d, d39, d2);
                a(dArr3, i58 + 1, d, d40, d2);
                a(dArr3, i58 + 2, d, d41, d2);
                a(dArr3, i58 + 3, d, d42, d2);
                i48 = i55 + 4;
            }
            int i59 = i38;
            while (i59 < i) {
                int i60 = (i59 * i6) + i5;
                int i61 = i40;
                int i62 = i59;
                a(dArr3, i44 + i59, d, es.f0(i60, i61, 0, i13, dArr, dArr2), d2);
                a(dArr3, i45 + i62, d, es.f0(i60, i41, 0, i4, dArr, dArr2), d2);
                a(dArr3, i46 + i62, d, es.f0(i60, i42, 0, i4, dArr, dArr2), d2);
                a(dArr3, i47 + i62, d, es.f0(i60, i43, 0, i4, dArr, dArr2), d2);
                i59 = i62 + 1;
                i40 = i61;
                i13 = i4;
            }
            i39 += 4;
            i13 = i4;
        }
        while (i39 < i3) {
            int i63 = (i39 * i8) + i7;
            int i64 = (i39 * i10) + i9;
            int i65 = 0;
            while (i65 < i) {
                a(dArr3, i64 + i65, d, es.f0((i65 * i6) + i5, i63, 0, i4, dArr, dArr2), d2);
                i65++;
                i63 = i63;
            }
            i39++;
        }
    }

    public static void d(int i, int i2, int i3, int i4, double d, double[] dArr, int i5, int i6, double[] dArr2, int i7, int i8, int i9, double d2, double[] dArr3, int i10, int i11) {
        int i12 = i3;
        int i13 = i4 - (i4 % 4);
        int i14 = i8 << 1;
        int i15 = i14 + i8;
        int i16 = i2;
        while (i16 + 3 < i12) {
            int i17 = (i16 * i9) + i7;
            int i18 = i17 + i9;
            int i19 = i18 + i9;
            int i20 = i19 + i9;
            int i21 = (i16 * i11) + i10;
            int i22 = i21 + i11;
            int i23 = i22 + i11;
            int i24 = i23 + i11;
            int i25 = i14;
            p02.J(dArr3, i21, i21 + i, d2);
            p02.J(dArr3, i22, i22 + i, d2);
            p02.J(dArr3, i23, i23 + i, d2);
            p02.J(dArr3, i24, i24 + i, d2);
            int i26 = 0;
            while (i26 < i13) {
                int i27 = i26 * i8;
                int i28 = i17 + i27;
                double d3 = dArr2[i28] * d;
                double d4 = dArr2[i28 + i8] * d;
                double d5 = dArr2[i28 + i25] * d;
                double d6 = dArr2[i28 + i15] * d;
                int i29 = i18 + i27;
                double d7 = dArr2[i29] * d;
                double d8 = dArr2[i29 + i8] * d;
                double d9 = dArr2[i29 + i25] * d;
                double d10 = dArr2[i29 + i15] * d;
                int i30 = i19 + i27;
                double d11 = dArr2[i30] * d;
                double d12 = dArr2[i30 + i8] * d;
                double d13 = dArr2[i30 + i25] * d;
                double d14 = dArr2[i30 + i15] * d;
                int i31 = i20 + i27;
                double d15 = dArr2[i31] * d;
                double d16 = dArr2[i31 + i8] * d;
                double d17 = dArr2[i31 + i25] * d;
                double d18 = dArr2[i31 + i15] * d;
                int i32 = (i26 * i6) + i5;
                int i33 = i32 + i6;
                int i34 = i33 + i6;
                int i35 = i34 + i6;
                int i36 = i26;
                for (int i37 = 0; i37 < i; i37++) {
                    double d19 = dArr[i32 + i37];
                    double d20 = dArr[i33 + i37];
                    double d21 = dArr[i34 + i37];
                    double d22 = dArr[i35 + i37];
                    int i38 = i21 + i37;
                    dArr3[i38] = (d6 * d22) + (d5 * d21) + (d4 * d20) + (d3 * d19) + dArr3[i38];
                    int i39 = i22 + i37;
                    dArr3[i39] = (d10 * d22) + (d9 * d21) + (d8 * d20) + (d7 * d19) + dArr3[i39];
                    int i40 = i23 + i37;
                    dArr3[i40] = (d14 * d22) + (d13 * d21) + (d12 * d20) + (d11 * d19) + dArr3[i40];
                    int i41 = i24 + i37;
                    double d23 = d20 * d16;
                    double d24 = d21 * d17;
                    double d25 = d22 * d18;
                    dArr3[i41] = d25 + d24 + d23 + (d19 * d15) + dArr3[i41];
                }
                i26 = i36 + 4;
            }
            int i42 = i13 * i8;
            int i43 = (i13 * i6) + i5;
            int i44 = i43 + i6;
            int i45 = i44 + i6;
            int i46 = i4 - i13;
            int i47 = i15;
            if (i46 == 1) {
                double d26 = dArr2[i17 + i42] * d;
                double d27 = dArr2[i18 + i42] * d;
                double d28 = dArr2[i19 + i42] * d;
                double d29 = dArr2[i20 + i42] * d;
                for (int i48 = 0; i48 < i; i48++) {
                    double d30 = dArr[i43 + i48];
                    int i49 = i21 + i48;
                    dArr3[i49] = (d26 * d30) + dArr3[i49];
                    int i50 = i22 + i48;
                    dArr3[i50] = (d27 * d30) + dArr3[i50];
                    int i51 = i23 + i48;
                    dArr3[i51] = (d28 * d30) + dArr3[i51];
                    int i52 = i24 + i48;
                    dArr3[i52] = (d30 * d29) + dArr3[i52];
                }
            } else if (i46 == 2) {
                int i53 = i17 + i42;
                double d31 = dArr2[i53] * d;
                double d32 = dArr2[i53 + i8] * d;
                int i54 = i18 + i42;
                double d33 = dArr2[i54] * d;
                double d34 = dArr2[i54 + i8] * d;
                int i55 = i19 + i42;
                double d35 = dArr2[i55] * d;
                double d36 = dArr2[i55 + i8] * d;
                int i56 = i20 + i42;
                double d37 = dArr2[i56] * d;
                double d38 = dArr2[i56 + i8] * d;
                for (int i57 = 0; i57 < i; i57++) {
                    double d39 = dArr[i43 + i57];
                    double d40 = dArr[i44 + i57];
                    int i58 = i21 + i57;
                    dArr3[i58] = (d32 * d40) + (d31 * d39) + dArr3[i58];
                    int i59 = i22 + i57;
                    dArr3[i59] = (d34 * d40) + (d33 * d39) + dArr3[i59];
                    int i60 = i23 + i57;
                    dArr3[i60] = (d36 * d40) + (d35 * d39) + dArr3[i60];
                    int i61 = i24 + i57;
                    double d41 = d40 * d38;
                    dArr3[i61] = d41 + (d39 * d37) + dArr3[i61];
                }
            } else if (i46 == 3) {
                int i62 = i17 + i42;
                double d42 = dArr2[i62] * d;
                double d43 = dArr2[i62 + i8] * d;
                double d44 = dArr2[i62 + i25] * d;
                int i63 = i18 + i42;
                double d45 = dArr2[i63] * d;
                double d46 = dArr2[i63 + i8] * d;
                double d47 = dArr2[i63 + i25] * d;
                int i64 = i19 + i42;
                double d48 = dArr2[i64] * d;
                double d49 = dArr2[i64 + i8] * d;
                double d50 = dArr2[i64 + i25] * d;
                int i65 = i20 + i42;
                double d51 = dArr2[i65] * d;
                double d52 = dArr2[i65 + i8] * d;
                double d53 = dArr2[i65 + i25] * d;
                for (int i66 = 0; i66 < i; i66++) {
                    double d54 = dArr[i43 + i66];
                    double d55 = dArr[i44 + i66];
                    double d56 = dArr[i45 + i66];
                    int i67 = i21 + i66;
                    dArr3[i67] = (d44 * d56) + (d43 * d55) + (d42 * d54) + dArr3[i67];
                    int i68 = i22 + i66;
                    dArr3[i68] = (d47 * d56) + (d46 * d55) + (d45 * d54) + dArr3[i68];
                    int i69 = i23 + i66;
                    dArr3[i69] = (d50 * d56) + (d49 * d55) + (d48 * d54) + dArr3[i69];
                    int i70 = i24 + i66;
                    double d57 = d55 * d52;
                    double d58 = d56 * d53;
                    dArr3[i70] = d58 + d57 + (d54 * d51) + dArr3[i70];
                }
            }
            i16 += 4;
            i14 = i25;
            i15 = i47;
        }
        int i71 = i14;
        int i72 = i15;
        while (i16 < i12) {
            int i73 = (i16 * i9) + i7;
            int i74 = (i16 * i11) + i10;
            p02.J(dArr3, i74, i74 + i, d2);
            for (int i75 = 0; i75 < i13; i75 += 4) {
                int i76 = (i75 * i8) + i73;
                double d59 = dArr2[i76] * d;
                double d60 = dArr2[i76 + i8] * d;
                double d61 = dArr2[i76 + i71] * d;
                double d62 = dArr2[i76 + i72] * d;
                int i77 = (i75 * i6) + i5;
                int i78 = i77 + i6;
                int i79 = i78 + i6;
                int i80 = i79 + i6;
                for (int i81 = 0; i81 < i; i81++) {
                    int i82 = i74 + i81;
                    double d63 = dArr[i80 + i81];
                    double d64 = dArr[i79 + i81];
                    double d65 = dArr[i78 + i81];
                    double d66 = d65 * d60;
                    double d67 = d64 * d61;
                    double d68 = d63 * d62;
                    dArr3[i82] = d68 + d67 + d66 + (dArr[i77 + i81] * d59) + dArr3[i82];
                }
            }
            int i83 = i13 * i8;
            int i84 = (i13 * i6) + i5;
            int i85 = i84 + i6;
            int i86 = i85 + i6;
            int i87 = i4 - i13;
            if (i87 == 1) {
                double d69 = dArr2[i73 + i83] * d;
                for (int i88 = 0; i88 < i; i88++) {
                    int i89 = i74 + i88;
                    dArr3[i89] = (dArr[i84 + i88] * d69) + dArr3[i89];
                }
            } else if (i87 == 2) {
                int i90 = i73 + i83;
                double d70 = dArr2[i90] * d;
                double d71 = dArr2[i90 + i8] * d;
                for (int i91 = 0; i91 < i; i91++) {
                    int i92 = i74 + i91;
                    double d72 = dArr[i85 + i91];
                    double d73 = d72 * d71;
                    dArr3[i92] = d73 + (dArr[i84 + i91] * d70) + dArr3[i92];
                }
            } else if (i87 == 3) {
                int i93 = i73 + i83;
                double d74 = dArr2[i93] * d;
                double d75 = dArr2[i93 + i8] * d;
                double d76 = dArr2[i93 + i71] * d;
                for (int i94 = 0; i94 < i; i94++) {
                    int i95 = i74 + i94;
                    double d77 = dArr[i86 + i94];
                    double d78 = dArr[i85 + i94];
                    double d79 = d78 * d75;
                    double d80 = d77 * d76;
                    dArr3[i95] = d80 + d79 + (dArr[i84 + i94] * d74) + dArr3[i95];
                }
            }
            i16++;
            i12 = i3;
        }
    }

    public static void e() {
        try {
            HotSpotDiagnosticMXBean platformMXBean = ManagementFactory.getPlatformMXBean(HotSpotDiagnosticMXBean.class);
            if (platformMXBean != null) {
                platformMXBean.getVMOption("UseFMA").getValue();
                return;
            }
        } catch (LinkageError | RuntimeException unused) {
        }
        zs0.a();
    }
}
