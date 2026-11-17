package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class vq0 {
    public static final u8 a = fu1.j.a();

    public static void a(int i, int[] iArr, double[] dArr, int i2, boolean z) {
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = z ? (i - 1) - i3 : i3;
            int i5 = iArr[i4] - 1;
            if (i5 != i4) {
                int i6 = i4 + i2;
                double d = dArr[i6];
                int i7 = i5 + i2;
                dArr[i6] = dArr[i7];
                dArr[i7] = d;
            }
        }
    }

    public static void b(boolean z, int i, double[] dArr, int i2, int[] iArr, double[] dArr2, int i3, int i4, int i5) {
        for (int i6 = i4; i6 < i5; i6++) {
            int i7 = i6 * i3;
            if (z) {
                rz1.s(true, true, false, i, dArr, i2, dArr2, i7);
                rz1.s(false, true, true, i, dArr, i2, dArr2, i7);
                a(i, iArr, dArr2, i7, true);
            } else {
                a(i, iArr, dArr2, i7, false);
                rz1.s(false, false, true, i, dArr, i2, dArr2, i7);
                rz1.s(true, false, false, i, dArr, i2, dArr2, i7);
            }
        }
    }
}
