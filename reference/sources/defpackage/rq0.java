package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class rq0 {
    public static final u8 a = fu1.j.a();

    public static void a(final int i, final double[] dArr, final int i2, final double d, final double[] dArr2, final int i3, final int i4, final int i5, int i6, int i7) {
        int i8 = i6;
        int i9 = i - i5;
        int iJ = oe1.j(48, ((double) i9) * 2.0d);
        if (i7 - i8 > iJ) {
            u8 u8Var = a;
            u8Var.a = iJ;
            u8Var.b(i8, i7, new sb0() { // from class: qq0
                @Override // defpackage.sb0
                public final void a(int i10, int i11) {
                    int i12 = i;
                    int i13 = i5;
                    int i14 = i12 - i13;
                    while (i10 < i11) {
                        int i15 = (i4 * i10) + i3 + i13;
                        int i16 = i14;
                        int i17 = i2;
                        double[] dArr3 = dArr2;
                        double[] dArr4 = dArr;
                        i14 = i16;
                        t03.w(-(d * es.f0(i15, i17, 0, i16, dArr3, dArr4)), i14, i17, 1, i15, 1, dArr4, dArr3);
                        i10++;
                    }
                }
            });
            return;
        }
        while (i8 < i7) {
            int i10 = (i8 * i4) + i3 + i5;
            int i11 = i9;
            t03.w(-(d * es.f0(i10, i2, 0, i9, dArr2, dArr)), i11, i2, 1, i10, 1, dArr, dArr2);
            i9 = i11;
            i8++;
        }
    }
}
