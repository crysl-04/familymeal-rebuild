package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class pq0 {
    public static final u8 a = fu1.j.a();

    public static void a(double[] dArr, int i, double d, double d2, double d3) {
        double d4 = d * d2;
        if (d3 != h32.a) {
            d4 += d3 * dArr[i];
        }
        dArr[i] = d4;
    }

    public static void b(boolean z, int i, int i2, double d, double[] dArr, int i3, int i4, double[] dArr2, int i5, int i6, double d2, double[] dArr3, int i7, int i8) {
        int i9;
        int i10;
        if (z) {
            i10 = i;
            i9 = i2;
        } else {
            i9 = i;
            i10 = i2;
        }
        int iMin = (int) Math.min(2.147483647E9d, Math.max(320.0d, Math.ceil(102400.0d / ((double) i10))));
        if (d == h32.a) {
            p02.I(i9, d2, dArr3, i7, i8);
            return;
        }
        if (i8 != 1 || i9 <= iMin) {
            if (z) {
                d(i, i2, d, dArr, i3, i4, dArr2, i5, i6, d2, dArr3, i7, i8);
                return;
            } else {
                p02.I(i, d2, dArr3, i7, i8);
                c(i, i2, d, dArr, i3, i4, dArr2, i5, i6, dArr3, i7, i8);
                return;
            }
        }
        u8 u8Var = a;
        if (z) {
            u8Var.a = iMin;
            u8Var.b(0, i2, new oq0(i, d, dArr, i3, i4, dArr2, i5, i6, d2, dArr3, i7));
        } else {
            u8Var.a = iMin;
            u8Var.b(0, i, new oq0(d2, dArr3, i7, i2, d, dArr, i3, i4, dArr2, i5, i6));
        }
    }

    public static void c(int i, int i2, double d, double[] dArr, int i3, int i4, double[] dArr2, int i5, int i6, double[] dArr3, int i7, int i8) {
        int i9 = i6 < 0 ? i5 - ((i2 - 1) * i6) : i5;
        int i10 = i8;
        if (i10 != 1) {
            int i11 = i9;
            int i12 = 0;
            while (i12 < i2) {
                t03.w(dArr2[i11] * d, i, (i12 * i4) + i3, 1, i7, i10, dArr, dArr3);
                i12++;
                i11 += i6;
                i10 = i8;
            }
            return;
        }
        int i13 = i2 - (i2 % 4);
        int i14 = 0;
        while (i14 < i13) {
            double d2 = dArr2[i9] * d;
            double d3 = dArr2[i9 + i6] * d;
            double d4 = dArr2[(i6 << 1) + i9] * d;
            double d5 = dArr2[(i6 * 3) + i9] * d;
            int i15 = (i14 * i4) + i3;
            int i16 = i15 + i4;
            int i17 = i16 + i4;
            int i18 = i17 + i4;
            for (int i19 = 0; i19 < i; i19++) {
                int i20 = i7 + i19;
                double d6 = dArr[i18 + i19];
                double d7 = dArr[i17 + i19];
                double d8 = dArr[i16 + i19];
                double d9 = dArr[i15 + i19];
                double d10 = dArr3[i20];
                u8 u8Var = nq0.a;
                dArr3[i20] = (d6 * d5) + (d7 * d4) + (d8 * d3) + (d9 * d2) + d10;
            }
            i14 += 4;
            i9 += i6 << 2;
        }
        while (i14 < i2) {
            double d11 = dArr2[i9] * d;
            int i21 = (i14 * i4) + i3;
            for (int i22 = 0; i22 < i; i22++) {
                int i23 = i7 + i22;
                double d12 = dArr[i21 + i22];
                double d13 = dArr3[i23];
                u8 u8Var2 = nq0.a;
                dArr3[i23] = (d12 * d11) + d13;
            }
            i14++;
            i9 += i6;
        }
    }

    public static void d(int i, int i2, double d, double[] dArr, int i3, int i4, double[] dArr2, int i5, int i6, double d2, double[] dArr3, int i7, int i8) {
        int i9 = i8 < 0 ? i7 - ((i2 - 1) * i8) : i7;
        int i10 = i6;
        if (i10 != 1) {
            int i11 = i9;
            int i12 = 0;
            while (i12 < i2) {
                a(dArr3, i11, d, ou.B(i, (i12 * i4) + i3, i5, i10, dArr, dArr2), d2);
                i12++;
                i11 += i8;
                i10 = i6;
            }
            return;
        }
        int i13 = i;
        int i14 = i13 < 256 ? i2 - (i2 % 4) : 0;
        int i15 = i9;
        int i16 = 0;
        while (i16 < i14) {
            int i17 = (i16 * i4) + i3;
            int i18 = i17 + i4;
            int i19 = i18 + i4;
            int i20 = i19 + i4;
            double d3 = h32.a;
            double d4 = d3;
            double d5 = d4;
            double d6 = d5;
            for (int i21 = 0; i21 < i13; i21++) {
                double d7 = dArr2[i5 + i21];
                double d8 = dArr[i17 + i21];
                u8 u8Var = nq0.a;
                d6 = (d8 * d7) + d6;
                d3 = (dArr[i18 + i21] * d7) + d3;
                d4 = (dArr[i19 + i21] * d7) + d4;
                d5 = (dArr[i20 + i21] * d7) + d5;
            }
            a(dArr3, i15, d, d6, d2);
            int i22 = i15;
            a(dArr3, i22 + i8, d, d3, d2);
            a(dArr3, i22 + (i8 << 1), d, d4, d2);
            a(dArr3, (i8 * 3) + i22, d, d5, d2);
            i16 += 4;
            i15 = i22 + (i8 << 2);
        }
        int i23 = i16;
        while (i23 < i2) {
            a(dArr3, i15, d, es.f0((i23 * i4) + i3, i5, 0, i13, dArr, dArr2), d2);
            i23++;
            i15 += i8;
            i13 = i;
        }
    }
}
