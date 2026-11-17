package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class l91 extends z43 {
    public final si1 b;

    public l91() {
        si1 si1Var = my0.a;
        this.b = new si1();
    }

    @Override // defpackage.z43
    public final void d() {
        si1 si1Var = this.b;
        int[] iArr = si1Var.b;
        Object[] objArr = si1Var.c;
        long[] jArr = si1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        fj1 fj1Var = (fj1) objArr[i4];
                        Object[] objArr2 = fj1Var.a;
                        int i6 = fj1Var.b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            k91 k91Var = (k91) objArr2[i7];
                            sq sqVar = k91Var.d;
                            if (sqVar != null) {
                                sqVar.cancel();
                            }
                            k91Var.d = null;
                            sd1 sd1Var = (sd1) k91Var.a.i;
                            sd1Var.i = true;
                            sd1Var.h = false;
                            sd1Var.a();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
