package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ah implements zg, bh {
    public final float h;
    public final wg i;
    public final float j;

    public ah(float f, wg wgVar) {
        this.h = f;
        this.i = wgVar;
        this.j = f;
    }

    @Override // defpackage.zg, defpackage.bh
    public final float a() {
        return this.j;
    }

    @Override // defpackage.zg
    public final void d(e90 e90Var, int i, int[] iArr, u31 u31Var, int[] iArr2) {
        int i2;
        if (iArr.length != 0) {
            int iR = e90Var.R(this.h);
            boolean z = u31Var == u31.i;
            if (z) {
                int length = iArr.length;
                int i3 = 0;
                int iMin = 0;
                int i4 = 0;
                while (i3 < length) {
                    int iMax = Math.max(0, i - iArr[i3]);
                    iArr2[i4] = iMax;
                    iMin = Math.min(iR, iMax);
                    i = iArr2[i4] - iMin;
                    i3++;
                    i4++;
                }
                i2 = i + iMin;
            } else {
                int length2 = iArr.length;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (i5 < length2) {
                    int i9 = iArr[i5];
                    int iMin2 = Math.min(i6, i - i9);
                    iArr2[i8] = iMin2;
                    int iMin3 = Math.min(iR, (i - iMin2) - i9);
                    int i10 = iArr2[i8] + i9 + iMin3;
                    i5++;
                    i7 = iMin3;
                    i6 = i10;
                    i8++;
                }
                i2 = i - (i6 - i7);
            }
            if (i2 > 0) {
                int iRound = Math.round((1.0f + (u31Var == u31.h ? -1.0f : 1.0f)) * (i2 / 2.0f));
                if (z) {
                    iRound -= i2;
                }
                if (iRound != 0) {
                    int length3 = iArr2.length;
                    for (int i11 = 0; i11 < length3; i11++) {
                        iArr2[i11] = iArr2[i11] + iRound;
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ah) {
            ah ahVar = (ah) obj;
            return cc0.b(this.h, ahVar.h) && this.i == ahVar.i;
        }
        return false;
    }

    @Override // defpackage.bh
    public final void f(e90 e90Var, int i, int[] iArr, int[] iArr2) {
        d(e90Var, i, iArr, u31.h, iArr2);
    }

    public final int hashCode() {
        return this.i.hashCode() + (((Float.hashCode(this.h) * 31) + 1231) * 31);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + cc0.c(this.h) + ", " + this.i + ")";
    }
}
