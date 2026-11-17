package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class j53 extends z43 {
    public final mj1 b;

    public j53() {
        long[] jArr = bd2.a;
        this.b = new mj1();
    }

    @Override // defpackage.z43
    public final void d() {
        mj1 mj1Var;
        mj1 mj1Var2 = this.b;
        if (mj1Var2.i()) {
            mj1Var = bd2.b;
            mj1Var.getClass();
        } else {
            mj1Var = new mj1(mj1Var2.e);
            mj1Var.k(mj1Var2);
        }
        Object[] objArr = mj1Var.c;
        long[] jArr = mj1Var.a;
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
                        i53 i53Var = (i53) objArr[(i << 3) + i3];
                        i53Var.c = true;
                        i53 i53Var2 = (i53) mj1Var2.l(i53Var.a);
                        if (i53Var2 != null) {
                            i53Var2.b.a();
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
