package defpackage;

import java.util.Arrays;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wg implements sq, yb0, ke0, zi2, mi1 {
    public final /* synthetic */ byte h;

    public /* synthetic */ wg(byte b) {
        this.h = b;
    }

    public static /* synthetic */ void f() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void g(Object obj, Object obj2) {
        throw new sp2("Fragment " + obj + obj2);
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void i(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void k() {
        throw new a42((byte) 3);
    }

    public static /* synthetic */ void l(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void m(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void n() {
        throw new a42((byte) 4);
    }

    public static /* synthetic */ void o(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void p() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.yb0
    public final double a(double d) {
        switch (this.h) {
            case 3:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 4:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 5:
                float[] fArr = uv.a;
                return uv.b(uv.c, d);
            case 6:
                float[] fArr2 = uv.a;
                return uv.a(uv.c, d);
            case 7:
                float[] fArr3 = uv.a;
                return uv.d(uv.d, d);
            default:
                float[] fArr4 = uv.a;
                return uv.c(uv.d, d);
        }
    }

    @Override // defpackage.zi2
    public final boolean b() {
        return false;
    }

    @Override // defpackage.mi1
    public final void d(double[] dArr, double[] dArr2, boolean z, int i, double[] dArr3, boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        switch (this.h) {
            case 24:
                if (z) {
                    i2 = 1;
                    i3 = i;
                } else if (!z2) {
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
                    for (int i10 = 0; i10 < i; i10++) {
                        int i11 = i10 << 2;
                        double d17 = dArr2[i11];
                        double d18 = dArr2[i11 + 1];
                        double d19 = dArr2[i11 + 2];
                        double d20 = dArr2[i11 + 3];
                        double d21 = dArr3[i10];
                        int i12 = i10 + i;
                        double d22 = dArr3[i12];
                        int i13 = i12 + i;
                        double d23 = dArr3[i13];
                        double d24 = dArr3[i13 + i];
                        u8 u8Var = nq0.a;
                        d = (d17 * d21) + d;
                        d2 = (d18 * d21) + d2;
                        d3 = (d19 * d21) + d3;
                        d4 = (d21 * d20) + d4;
                        d5 = (d17 * d22) + d5;
                        d6 = (d18 * d22) + d6;
                        d7 = (d19 * d22) + d7;
                        d8 = (d22 * d20) + d8;
                        d9 = (d17 * d23) + d9;
                        d10 = (d18 * d23) + d10;
                        d11 = (d19 * d23) + d11;
                        d12 = (d23 * d20) + d12;
                        d13 = (d17 * d24) + d13;
                        d14 = (d18 * d24) + d14;
                        d15 = (d19 * d24) + d15;
                        d16 = (d20 * d24) + d16;
                    }
                    dArr[0] = d;
                    dArr[1] = d2;
                    dArr[2] = d3;
                    dArr[3] = d4;
                    dArr[4] = d5;
                    dArr[5] = d6;
                    dArr[6] = d7;
                    dArr[7] = d8;
                    dArr[8] = d9;
                    dArr[9] = d10;
                    dArr[10] = d11;
                    dArr[11] = d12;
                    dArr[12] = d13;
                    dArr[13] = d14;
                    dArr[14] = d15;
                    dArr[15] = d16;
                } else {
                    i3 = 1;
                    i2 = 4;
                }
                if (z2) {
                    i5 = 1;
                    i4 = 4;
                } else {
                    i4 = 1;
                    i5 = i;
                }
                double d25 = h32.a;
                double d26 = d25;
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
                for (int i14 = 0; i14 < i; i14++) {
                    int i15 = i14 * i2;
                    int i16 = i14 * i4;
                    double d41 = dArr2[i15];
                    double d42 = dArr2[i15 + i3];
                    double d43 = dArr2[i15 + (i3 << 1)];
                    double d44 = dArr2[(i3 * 3) + i15];
                    double d45 = dArr3[i16];
                    double d46 = dArr3[i16 + i5];
                    double d47 = dArr3[i16 + (i5 << 1)];
                    double d48 = dArr3[(i5 * 3) + i16];
                    u8 u8Var2 = nq0.a;
                    d25 = (d41 * d45) + d25;
                    d26 = (d42 * d45) + d26;
                    d27 = (d43 * d45) + d27;
                    d28 = (d45 * d44) + d28;
                    d29 = (d41 * d46) + d29;
                    d30 = (d42 * d46) + d30;
                    d31 = (d43 * d46) + d31;
                    d32 = (d46 * d44) + d32;
                    d33 = (d41 * d47) + d33;
                    d34 = (d42 * d47) + d34;
                    d35 = (d43 * d47) + d35;
                    d36 = (d47 * d44) + d36;
                    d37 = (d41 * d48) + d37;
                    d38 = (d42 * d48) + d38;
                    d39 = (d43 * d48) + d39;
                    d40 = (d44 * d48) + d40;
                }
                dArr[0] = d25;
                dArr[1] = d26;
                dArr[2] = d27;
                dArr[3] = d28;
                dArr[4] = d29;
                dArr[5] = d30;
                dArr[6] = d31;
                dArr[7] = d32;
                dArr[8] = d33;
                dArr[9] = d34;
                dArr[10] = d35;
                dArr[11] = d36;
                dArr[12] = d37;
                dArr[13] = d38;
                dArr[14] = d39;
                dArr[15] = d40;
                break;
            default:
                if (z) {
                    i6 = i;
                    i7 = 1;
                } else if (!z2) {
                    double d49 = h32.a;
                    double d50 = d49;
                    double d51 = d50;
                    double d52 = d51;
                    double d53 = d52;
                    double d54 = d53;
                    double d55 = d54;
                    double d56 = d55;
                    double d57 = d56;
                    for (int i17 = 0; i17 < i; i17++) {
                        int i18 = i17 * 3;
                        double d58 = dArr2[i18];
                        double d59 = dArr2[i18 + 1];
                        double d60 = dArr2[i18 + 2];
                        double d61 = dArr3[i17];
                        int i19 = i17 + i;
                        double d62 = dArr3[i19];
                        double d63 = dArr3[i19 + i];
                        u8 u8Var3 = nq0.a;
                        d49 = (d58 * d61) + d49;
                        d50 = (d59 * d61) + d50;
                        d51 = (d61 * d60) + d51;
                        d52 = (d58 * d62) + d52;
                        d53 = (d59 * d62) + d53;
                        d54 = (d62 * d60) + d54;
                        d55 = (d58 * d63) + d55;
                        d56 = (d59 * d63) + d56;
                        d57 = (d60 * d63) + d57;
                    }
                    dArr[0] = d49;
                    dArr[1] = d50;
                    dArr[2] = d51;
                    dArr[3] = d52;
                    dArr[4] = d53;
                    dArr[5] = d54;
                    dArr[6] = d55;
                    dArr[7] = d56;
                    dArr[8] = d57;
                } else {
                    i6 = 1;
                    i7 = 3;
                }
                if (z2) {
                    i8 = 1;
                    i9 = 3;
                } else {
                    i8 = i;
                    i9 = 1;
                }
                double d64 = h32.a;
                double d65 = d64;
                double d66 = d65;
                double d67 = d66;
                double d68 = d67;
                double d69 = d68;
                double d70 = d69;
                double d71 = d70;
                double d72 = d71;
                for (int i20 = 0; i20 < i; i20++) {
                    int i21 = i20 * i7;
                    int i22 = i20 * i9;
                    double d73 = dArr2[i21];
                    double d74 = dArr2[i21 + i6];
                    double d75 = dArr2[i21 + (i6 << 1)];
                    double d76 = dArr3[i22];
                    double d77 = dArr3[i22 + i8];
                    double d78 = dArr3[i22 + (i8 << 1)];
                    u8 u8Var4 = nq0.a;
                    d64 = (d73 * d76) + d64;
                    d65 = (d74 * d76) + d65;
                    d66 = (d76 * d75) + d66;
                    d67 = (d73 * d77) + d67;
                    d68 = (d74 * d77) + d68;
                    d69 = (d77 * d75) + d69;
                    d70 = (d73 * d78) + d70;
                    d71 = (d74 * d78) + d71;
                    d72 = (d75 * d78) + d72;
                }
                dArr[0] = d64;
                dArr[1] = d65;
                dArr[2] = d66;
                dArr[3] = d67;
                dArr[4] = d68;
                dArr[5] = d69;
                dArr[6] = d70;
                dArr[7] = d71;
                dArr[8] = d72;
                break;
        }
    }

    public final void e(float[] fArr, float[] fArr2, boolean z, int i, float[] fArr3, boolean z2) {
        switch (this.h) {
            case 25:
                if (z) {
                    int length = fArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        fArr[i2] = es.g0(fArr2, i2 * i, fArr3, 0, i);
                    }
                } else {
                    Arrays.fill(fArr, 0.0f);
                    int length2 = fArr.length;
                    for (int i3 = 0; i3 < i; i3++) {
                        aa3.x(fArr, 0, fArr3[i3], fArr2, i3 * length2, 0, length2);
                    }
                }
                break;
            case 26:
                int length3 = fArr.length;
                if (z2) {
                    Arrays.fill(fArr, 0.0f);
                    int i4 = 0;
                    while (i4 < i) {
                        int i5 = length3;
                        aa3.x(fArr, 0, fArr2[i4], fArr3, i4 * length3, 0, i5);
                        i4++;
                        length3 = i5;
                    }
                } else {
                    for (int i6 = 0; i6 < length3; i6++) {
                        fArr[i6] = es.g0(fArr2, 0, fArr3, i6 * i, i);
                    }
                }
                break;
            default:
                int length4 = fArr2.length / i;
                int length5 = fArr3.length / i;
                int iK = oe1.k(44, length4, i);
                if (!z && !z2) {
                    Arrays.fill(fArr, 0.0f);
                    if (length5 > iK) {
                        ni1.c(length5, iK, new dj0((byte) 2, i, fArr, fArr2, fArr3));
                    } else {
                        ni1.a(fArr, 0, length5, fArr2, i, fArr3);
                    }
                } else if (length5 > iK) {
                    ni1.c(length5, iK, new lp2(fArr, fArr2, z, i, fArr3, z2));
                } else {
                    ni1.d(fArr, 0, length5, fArr2, z, i, fArr3, z2);
                }
                break;
        }
    }

    @Override // defpackage.sq
    public final void cancel() {
    }

    @Override // defpackage.ke0
    public final float c(float f) {
        return f;
    }
}
