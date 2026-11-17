package defpackage;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class li1 implements mi1, yb0 {
    public static final /* synthetic */ int i = 0;
    public final /* synthetic */ byte h;

    public /* synthetic */ li1(byte b) {
        this.h = b;
    }

    public static /* synthetic */ void c() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void e(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void f(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void g(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void k(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void l(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void m(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public final void b(final vc2[] vc2VarArr, final vc2[] vc2VarArr2, final boolean z, final int i2, final vc2[] vc2VarArr3, final boolean z2, final uc2 uc2Var) {
        switch (this.h) {
            case 4:
                if (z) {
                    int length = vc2VarArr.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        vc2VarArr[i3] = es.S(vc2VarArr2, i3 * i2, vc2VarArr3, 0, i2, uc2Var);
                    }
                } else {
                    Arrays.fill(vc2VarArr, uc2Var.k().get());
                    int length2 = vc2VarArr.length;
                    for (int i4 = 0; i4 < i2; i4++) {
                        aa3.y(vc2VarArr, 0, vc2VarArr3[i4], vc2VarArr2, i4 * length2, 0, length2);
                    }
                }
                break;
            case 5:
                int length3 = vc2VarArr.length;
                if (z2) {
                    for (int i5 = 0; i5 < length3; i5++) {
                        vc2 vc2VarK = uc2Var.k();
                        for (int i6 = 0; i6 < i2; i6++) {
                            vc2VarK = vc2VarK.z1((vc2) vc2VarArr2[i6].i(vc2VarArr3[(i6 * length3) + i5]));
                        }
                        vc2VarArr[i5] = (vc2) vc2VarK.get();
                    }
                } else {
                    for (int i7 = 0; i7 < length3; i7++) {
                        vc2VarArr[i7] = es.S(vc2VarArr2, 0, vc2VarArr3, i7 * i2, i2, uc2Var);
                    }
                }
                break;
            default:
                int length4 = vc2VarArr2.length / i2;
                int length5 = vc2VarArr3.length / i2;
                int iK = oe1.k(44, length4, i2);
                if (!z && !z2) {
                    Arrays.fill(vc2VarArr, uc2Var.k().get());
                    if (length5 > iK) {
                        ni1.c(length5, iK, new dj0((byte) 1, i2, vc2VarArr, vc2VarArr2, vc2VarArr3));
                    } else {
                        ni1.b(vc2VarArr, 0, length5, vc2VarArr2, i2, vc2VarArr3);
                    }
                } else if (length5 > iK) {
                    ni1.c(length5, iK, new sb0() { // from class: ki1
                        @Override // defpackage.sb0
                        public final void a(int i8, int i9) {
                            ni1.e(vc2VarArr, i8, i9, vc2VarArr2, z, i2, vc2VarArr3, z2, uc2Var);
                        }
                    });
                } else {
                    ni1.e(vc2VarArr, 0, length5, vc2VarArr2, z, i2, vc2VarArr3, z2, uc2Var);
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0503  */
    /* JADX WARN: Code duplicated, block: B:99:0x04e8  */
    @Override // defpackage.mi1
    public final void d(double[] dArr, double[] dArr2, boolean z, int i2, double[] dArr3, boolean z2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 1;
        switch (this.h) {
            case 0:
                double d = h32.a;
                int length = dArr2.length / i2;
                for (int i8 = 0; i8 < i2; i8++) {
                    d += dArr2[i8 * length] * dArr3[i8];
                }
                dArr[0] = d;
                break;
            case 1:
                if (i2 == 0) {
                    Arrays.fill(dArr, 0.0d);
                } else if (z) {
                    vs.H(true, i2, dArr.length, h32.b, dArr2, i2, dArr3, h32.a, dArr);
                } else {
                    vs.H(false, dArr.length, i2, h32.b, dArr2, Math.max(1, dArr.length), dArr3, h32.a, dArr);
                }
                break;
            case 2:
                if (i2 == 0) {
                    Arrays.fill(dArr, 0.0d);
                } else if (z2) {
                    vs.H(false, dArr.length, i2, h32.b, dArr3, Math.max(1, dArr.length), dArr2, h32.a, dArr);
                } else {
                    vs.H(true, i2, dArr.length, h32.b, dArr3, i2, dArr2, h32.a, dArr);
                }
                break;
            default:
                int length2 = dArr2.length / i2;
                int length3 = dArr3.length / i2;
                int iMax = Math.max(1, z ? i2 : length2);
                int iMax2 = Math.max(1, z2 ? length3 : i2);
                char c = 5;
                if (length2 >= 5) {
                    i3 = 0;
                    if (length3 <= oe1.k(70, length2, i2)) {
                        i4 = 1;
                    }
                    char c2 = 4;
                    if (i4 == 0 && !z && !z2 && length2 <= 10 && (i2 < 140 || length3 < 4)) {
                        switch (length2) {
                            case 5:
                                int length4 = dArr3.length / i2;
                                for (int i9 = i3; i9 < length4; i9++) {
                                    double d2 = h32.a;
                                    int i10 = i3;
                                    int i11 = i10;
                                    double d3 = d2;
                                    double d4 = d3;
                                    double d5 = d4;
                                    double d6 = d5;
                                    while (i10 < i2) {
                                        double d7 = dArr3[(i9 * i2) + i10];
                                        double d8 = dArr2[i11];
                                        u8 u8Var = nq0.a;
                                        d2 = (d8 * d7) + d2;
                                        d3 = (dArr2[i11 + 1] * d7) + d3;
                                        d4 = (dArr2[i11 + 2] * d7) + d4;
                                        int i12 = i11 + 4;
                                        d5 = (dArr2[i11 + 3] * d7) + d5;
                                        i11 += 5;
                                        d6 = (dArr2[i12] * d7) + d6;
                                        i10++;
                                    }
                                    int i13 = i9 * 5;
                                    dArr[i13] = d2;
                                    dArr[i13 + 1] = d3;
                                    dArr[i13 + 2] = d4;
                                    dArr[i13 + 3] = d5;
                                    dArr[i13 + 4] = d6;
                                }
                                break;
                            case 6:
                                int length5 = dArr3.length / i2;
                                for (int i14 = i3; i14 < length5; i14++) {
                                    double d9 = h32.a;
                                    int i15 = i3;
                                    int i16 = i15;
                                    double d10 = d9;
                                    double d11 = d10;
                                    double d12 = d11;
                                    double d13 = d12;
                                    double d14 = d13;
                                    while (i15 < i2) {
                                        double d15 = dArr3[(i14 * i2) + i15];
                                        double d16 = dArr2[i16];
                                        u8 u8Var2 = nq0.a;
                                        d9 = (d16 * d15) + d9;
                                        d10 = (dArr2[i16 + 1] * d15) + d10;
                                        d11 = (dArr2[i16 + 2] * d15) + d11;
                                        d12 = (dArr2[i16 + 3] * d15) + d12;
                                        int i17 = i16 + 5;
                                        d13 = (dArr2[i16 + 4] * d15) + d13;
                                        i16 += 6;
                                        d14 = (dArr2[i17] * d15) + d14;
                                        i15++;
                                    }
                                    int i18 = i14 * 6;
                                    dArr[i18] = d9;
                                    dArr[i18 + 1] = d10;
                                    dArr[i18 + 2] = d11;
                                    dArr[i18 + 3] = d12;
                                    dArr[i18 + 4] = d13;
                                    dArr[i18 + 5] = d14;
                                }
                                break;
                            case 7:
                                int length6 = dArr3.length / i2;
                                for (int i19 = i3; i19 < length6; i19++) {
                                    double d17 = h32.a;
                                    int i20 = i3;
                                    int i21 = i20;
                                    double d18 = d17;
                                    double d19 = d18;
                                    double d20 = d19;
                                    double d21 = d20;
                                    double d22 = d21;
                                    double d23 = d22;
                                    while (i20 < i2) {
                                        double d24 = dArr3[(i19 * i2) + i20];
                                        double d25 = dArr2[i21];
                                        u8 u8Var3 = nq0.a;
                                        d17 = (d25 * d24) + d17;
                                        d18 = (dArr2[i21 + 1] * d24) + d18;
                                        d19 = (dArr2[i21 + 2] * d24) + d19;
                                        d20 = (dArr2[i21 + 3] * d24) + d20;
                                        d21 = (dArr2[i21 + 4] * d24) + d21;
                                        int i22 = i21 + 6;
                                        d22 = (dArr2[i21 + 5] * d24) + d22;
                                        i21 += 7;
                                        d23 = (dArr2[i22] * d24) + d23;
                                        i20++;
                                    }
                                    int i23 = i19 * 7;
                                    dArr[i23] = d17;
                                    dArr[i23 + 1] = d18;
                                    dArr[i23 + 2] = d19;
                                    dArr[i23 + 3] = d20;
                                    dArr[i23 + 4] = d21;
                                    dArr[i23 + 5] = d22;
                                    dArr[i23 + 6] = d23;
                                }
                                break;
                            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                                int length7 = dArr3.length / i2;
                                for (int i24 = i3; i24 < length7; i24++) {
                                    double d26 = h32.a;
                                    int i25 = i3;
                                    int i26 = i25;
                                    double d27 = d26;
                                    double d28 = d27;
                                    double d29 = d28;
                                    double d30 = d29;
                                    double d31 = d30;
                                    double d32 = d31;
                                    double d33 = d32;
                                    while (i25 < i2) {
                                        double d34 = dArr3[(i24 * i2) + i25];
                                        double d35 = dArr2[i26];
                                        u8 u8Var4 = nq0.a;
                                        d26 = (d35 * d34) + d26;
                                        d27 = (dArr2[i26 + 1] * d34) + d27;
                                        d28 = (dArr2[i26 + 2] * d34) + d28;
                                        d29 = (dArr2[i26 + 3] * d34) + d29;
                                        d30 = (dArr2[i26 + 4] * d34) + d30;
                                        d31 = (dArr2[i26 + 5] * d34) + d31;
                                        int i27 = i26 + 7;
                                        d32 = (dArr2[i26 + 6] * d34) + d32;
                                        i26 += 8;
                                        d33 = (dArr2[i27] * d34) + d33;
                                        i25++;
                                    }
                                    int i28 = i24 << 3;
                                    dArr[i28] = d26;
                                    dArr[i28 + 1] = d27;
                                    dArr[i28 + 2] = d28;
                                    dArr[i28 + 3] = d29;
                                    dArr[i28 + 4] = d30;
                                    dArr[i28 + 5] = d31;
                                    dArr[i28 + 6] = d32;
                                    dArr[i28 + 7] = d33;
                                }
                                break;
                            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                                int length8 = dArr3.length / i2;
                                int i29 = i3;
                                while (i29 < length8) {
                                    double d36 = h32.a;
                                    int i30 = i3;
                                    int i31 = length8;
                                    double d37 = d36;
                                    double d38 = d37;
                                    double d39 = d38;
                                    double d40 = d39;
                                    double d41 = d40;
                                    double d42 = d41;
                                    double d43 = d42;
                                    double d44 = d43;
                                    for (int i32 = i30; i32 < i2; i32++) {
                                        double d45 = dArr3[(i29 * i2) + i32];
                                        double d46 = dArr2[i30];
                                        u8 u8Var5 = nq0.a;
                                        d36 = (d46 * d45) + d36;
                                        d37 = (dArr2[i30 + 1] * d45) + d37;
                                        d38 = (dArr2[i30 + 2] * d45) + d38;
                                        d39 = (dArr2[i30 + 3] * d45) + d39;
                                        d40 = (dArr2[i30 + 4] * d45) + d40;
                                        d41 = (dArr2[i30 + 5] * d45) + d41;
                                        d42 = (dArr2[i30 + 6] * d45) + d42;
                                        int i33 = i30 + 8;
                                        d43 = (dArr2[i30 + 7] * d45) + d43;
                                        i30 += 9;
                                        d44 = (dArr2[i33] * d45) + d44;
                                    }
                                    int i34 = i29 * 9;
                                    dArr[i34] = d36;
                                    dArr[i34 + 1] = d37;
                                    dArr[i34 + 2] = d38;
                                    dArr[i34 + 3] = d39;
                                    dArr[i34 + 4] = d40;
                                    dArr[i34 + 5] = d41;
                                    dArr[i34 + 6] = d42;
                                    dArr[i34 + 7] = d43;
                                    dArr[i34 + 8] = d44;
                                    i29++;
                                    length8 = i31;
                                }
                                break;
                            default:
                                int length9 = dArr3.length / i2;
                                for (int i35 = i3; i35 < length9; i35++) {
                                    double d47 = h32.a;
                                    int i36 = i3;
                                    int i37 = i36;
                                    double d48 = d47;
                                    double d49 = d48;
                                    double d50 = d49;
                                    double d51 = d50;
                                    double d52 = d51;
                                    double d53 = d52;
                                    double d54 = d53;
                                    double d55 = d54;
                                    double d56 = d55;
                                    while (i36 < i2) {
                                        double d57 = dArr3[(i35 * i2) + i36];
                                        double d58 = dArr2[i37];
                                        u8 u8Var6 = nq0.a;
                                        d47 = (d58 * d57) + d47;
                                        d48 = (dArr2[i37 + 1] * d57) + d48;
                                        d49 = (dArr2[i37 + 2] * d57) + d49;
                                        d50 = (dArr2[i37 + 3] * d57) + d50;
                                        d51 = (dArr2[i37 + 4] * d57) + d51;
                                        d52 = (dArr2[i37 + 5] * d57) + d52;
                                        d53 = (dArr2[i37 + 6] * d57) + d53;
                                        d54 = (dArr2[i37 + 7] * d57) + d54;
                                        int i38 = i37 + 9;
                                        d55 = (dArr2[i37 + 8] * d57) + d55;
                                        i37 += 10;
                                        d56 = (dArr2[i38] * d57) + d56;
                                        i36++;
                                    }
                                    int i39 = i35 * 10;
                                    dArr[i39] = d47;
                                    dArr[i39 + 1] = d48;
                                    dArr[i39 + 2] = d49;
                                    dArr[i39 + 3] = d50;
                                    dArr[i39 + 4] = d51;
                                    dArr[i39 + 5] = d52;
                                    dArr[i39 + 6] = d53;
                                    dArr[i39 + 7] = d54;
                                    dArr[i39 + 8] = d55;
                                    dArr[i39 + 9] = d56;
                                }
                                break;
                        }
                    } else {
                        if (i4 == 0 && length2 <= 7 && (!z ? !(i2 < 140 || length3 < 4) : i2 >= 10)) {
                            if (z) {
                                i6 = i2;
                                i5 = 1;
                            } else {
                                i5 = length2;
                                i6 = 1;
                            }
                            if (!z2) {
                                length3 = 1;
                                i7 = i2;
                            }
                            if (length2 == 5) {
                                int length10 = dArr3.length / i2;
                                int i40 = i6 << 1;
                                int i41 = i6 * 3;
                                int i42 = i6 << 2;
                                int i43 = i3;
                                while (i43 < length10) {
                                    double d59 = h32.a;
                                    double d60 = d59;
                                    double d61 = d60;
                                    double d62 = d61;
                                    char c3 = c2;
                                    int i44 = i43 * i7;
                                    int i45 = i3;
                                    double d63 = d62;
                                    while (i45 < i2) {
                                        double d64 = dArr3[i44];
                                        int i46 = i45 * i5;
                                        double d65 = dArr2[i46];
                                        u8 u8Var7 = nq0.a;
                                        d59 = (d65 * d64) + d59;
                                        d63 = (dArr2[i46 + i6] * d64) + d63;
                                        d60 = (dArr2[i46 + i40] * d64) + d60;
                                        d61 = (dArr2[i46 + i41] * d64) + d61;
                                        d62 = (dArr2[i46 + i42] * d64) + d62;
                                        i45++;
                                        i44 += length3;
                                    }
                                    int i47 = i43 * 5;
                                    dArr[i47] = d59;
                                    dArr[i47 + 1] = d63;
                                    dArr[i47 + 2] = d60;
                                    dArr[i47 + 3] = d61;
                                    dArr[i47 + 4] = d62;
                                    i43++;
                                    c2 = c3;
                                }
                            } else if (length2 != 6) {
                                int length11 = dArr3.length / i2;
                                int i48 = i6 << 1;
                                int i49 = i6 * 3;
                                int i50 = i6 << 2;
                                int i51 = i6 * 5;
                                int i52 = i6 * 6;
                                int i53 = i3;
                                while (i53 < length11) {
                                    double d66 = h32.a;
                                    int i54 = length11;
                                    double d67 = d66;
                                    double d68 = d67;
                                    double d69 = d68;
                                    double d70 = d69;
                                    double d71 = d70;
                                    int i55 = i53 * i7;
                                    int i56 = i3;
                                    double d72 = d71;
                                    while (i56 < i2) {
                                        double d73 = dArr3[i55];
                                        int i57 = i56 * i5;
                                        double d74 = dArr2[i57];
                                        u8 u8Var8 = nq0.a;
                                        d66 = (d74 * d73) + d66;
                                        d72 = (dArr2[i57 + i6] * d73) + d72;
                                        d67 = (dArr2[i57 + i48] * d73) + d67;
                                        d68 = (dArr2[i57 + i49] * d73) + d68;
                                        d69 = (dArr2[i57 + i50] * d73) + d69;
                                        d70 = (dArr2[i57 + i51] * d73) + d70;
                                        d71 = (dArr2[i57 + i52] * d73) + d71;
                                        i56++;
                                        i55 += length3;
                                    }
                                    int i58 = i53 * 7;
                                    dArr[i58] = d66;
                                    dArr[i58 + 1] = d72;
                                    dArr[i58 + 2] = d67;
                                    dArr[i58 + 3] = d68;
                                    dArr[i58 + 4] = d69;
                                    dArr[i58 + 5] = d70;
                                    dArr[i58 + 6] = d71;
                                    i53++;
                                    length11 = i54;
                                }
                            } else {
                                int length12 = dArr3.length / i2;
                                int i59 = i6 << 1;
                                int i60 = i6 * 3;
                                int i61 = i6 << 2;
                                int i62 = i6 * 5;
                                int i63 = i3;
                                while (i63 < length12) {
                                    double d75 = h32.a;
                                    char c4 = c;
                                    double d76 = d75;
                                    double d77 = d76;
                                    double d78 = d77;
                                    double d79 = d78;
                                    int i64 = i63 * i7;
                                    int i65 = i3;
                                    double d80 = d79;
                                    while (i65 < i2) {
                                        double d81 = dArr3[i64];
                                        int i66 = i65 * i5;
                                        double d82 = dArr2[i66];
                                        u8 u8Var9 = nq0.a;
                                        d75 = (d82 * d81) + d75;
                                        d80 = (dArr2[i66 + i6] * d81) + d80;
                                        d76 = (dArr2[i66 + i59] * d81) + d76;
                                        d77 = (dArr2[i66 + i60] * d81) + d77;
                                        d78 = (dArr2[i66 + i61] * d81) + d78;
                                        d79 = (dArr2[i66 + i62] * d81) + d79;
                                        i65++;
                                        i64 += length3;
                                    }
                                    int i67 = i63 * 6;
                                    dArr[i67] = d75;
                                    dArr[i67 + 1] = d80;
                                    dArr[i67 + 2] = d76;
                                    dArr[i67 + 3] = d77;
                                    dArr[i67 + 4] = d78;
                                    dArr[i67 + 5] = d79;
                                    i63++;
                                    c = c4;
                                }
                            }
                        } else if (z) {
                            nq0.b(z, z2, length2, length3, i2, h32.b, dArr2, 0, iMax, dArr3, 0, iMax2, h32.a, dArr, 0, length2);
                        } else {
                            Arrays.fill(dArr, 0.0d);
                            double d83 = h32.b;
                            nq0.b(false, z2, length2, length3, i2, d83, dArr2, 0, iMax, dArr3, 0, iMax2, d83, dArr, 0, length2);
                        }
                        break;
                    }
                } else {
                    i3 = 0;
                }
                i4 = i3;
                char c5 = 4;
                if (i4 == 0) {
                }
                if (i4 == 0) {
                }
                if (z) {
                    nq0.b(z, z2, length2, length3, i2, h32.b, dArr2, 0, iMax, dArr3, 0, iMax2, h32.a, dArr, 0, length2);
                } else {
                    Arrays.fill(dArr, 0.0d);
                    double d84 = h32.b;
                    nq0.b(false, z2, length2, length3, i2, d84, dArr2, 0, iMax, dArr3, 0, iMax2, d84, dArr, 0, length2);
                }
                break;
        }
    }

    @Override // defpackage.yb0
    public final double a(double d) {
        return d;
    }
}
