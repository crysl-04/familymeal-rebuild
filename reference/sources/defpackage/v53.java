package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v53 implements w53, mi1 {
    @Override // defpackage.w53
    public final hz2 a(od odVar) {
        return new hz2(odVar, wp1.a);
    }

    @Override // defpackage.mi1
    public final void d(double[] dArr, double[] dArr2, boolean z, int i, double[] dArr3, boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (z) {
            i2 = i;
            i3 = 1;
        } else {
            if (!z2) {
                double d = h32.a;
                double d2 = d;
                double d3 = d2;
                double d4 = d3;
                for (int i6 = 0; i6 < i; i6++) {
                    int i7 = i6 << 1;
                    double d5 = dArr2[i7];
                    double d6 = dArr2[i7 + 1];
                    double d7 = dArr3[i6];
                    double d8 = dArr3[i6 + i];
                    u8 u8Var = nq0.a;
                    d = (d5 * d7) + d;
                    d2 = (d7 * d6) + d2;
                    d3 += d5 * d8;
                    d4 = (d6 * d8) + d4;
                }
                dArr[0] = d;
                dArr[1] = d2;
                dArr[2] = d3;
                dArr[3] = d4;
                return;
            }
            i3 = 2;
            i2 = 1;
        }
        if (z2) {
            i5 = 2;
            i4 = 1;
        } else {
            i4 = i;
            i5 = 1;
        }
        double d9 = h32.a;
        double d10 = d9;
        double d11 = d10;
        double d12 = d11;
        for (int i8 = 0; i8 < i; i8++) {
            int i9 = i8 * i3;
            int i10 = i8 * i5;
            double d13 = dArr2[i9];
            double d14 = dArr2[i9 + i2];
            double d15 = dArr3[i10];
            double d16 = dArr3[i10 + i4];
            u8 u8Var2 = nq0.a;
            d9 = (d13 * d15) + d9;
            d10 = (d15 * d14) + d10;
            d11 = (d13 * d16) + d11;
            d12 = (d14 * d16) + d12;
        }
        dArr[0] = d9;
        dArr[1] = d10;
        dArr[2] = d11;
        dArr[3] = d12;
    }
}
