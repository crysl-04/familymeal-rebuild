package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class gp1 {
    public static final u8 a = fu1.j.a();

    public static void a(boolean z, int i, int i2, double[] dArr, int i3, double[] dArr2, double[] dArr3, int i4, int i5, int i6) {
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = z ? i7 : (i2 - 1) - i7;
            double d = dArr2[i8];
            if (d != h32.a) {
                int i9 = (i - i8) - 1;
                int i10 = (i8 * i3) + i8 + 1;
                int i11 = i5;
                while (i11 < i6) {
                    int i12 = (i11 * i4) + i8;
                    int i13 = i12 + 1;
                    int i14 = i9;
                    double dF0 = (dArr3[i12] + es.f0(i10, i13, 0, i14, dArr, dArr3)) * d;
                    dArr3[i12] = dArr3[i12] - dF0;
                    if (i14 > 0) {
                        int i15 = i10;
                        t03.w(-dF0, i14, i15, 1, i13, 1, dArr, dArr3);
                        i10 = i15;
                        i14 = i14;
                    }
                    i11++;
                    i9 = i14;
                }
            }
        }
    }
}
