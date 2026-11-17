package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xg implements zg {
    public final /* synthetic */ byte h;

    public /* synthetic */ xg(byte b) {
        this.h = b;
    }

    @Override // defpackage.zg
    public final void d(e90 e90Var, int i, int[] iArr, u31 u31Var, int[] iArr2) {
        byte b = this.h;
        u31 u31Var2 = u31.h;
        int i2 = 0;
        switch (b) {
            case 0:
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i2 < length) {
                    int i5 = iArr[i2];
                    iArr2[i3] = i4;
                    i4 += i5;
                    i2++;
                    i3++;
                }
                break;
            case 1:
                int i6 = 0;
                for (int i7 : iArr) {
                    i6 += i7;
                }
                int i8 = i - i6;
                int length2 = iArr.length;
                int i9 = 0;
                while (i2 < length2) {
                    int i10 = iArr[i2];
                    iArr2[i9] = i8;
                    i8 += i10;
                    i2++;
                    i9++;
                }
                break;
            case 2:
                if (u31Var == u31Var2) {
                    uz0.s(i, iArr, iArr2, false);
                } else {
                    uz0.r(iArr, iArr2, true);
                }
                break;
            default:
                if (u31Var == u31Var2) {
                    uz0.r(iArr, iArr2, false);
                } else {
                    uz0.s(i, iArr, iArr2, true);
                }
                break;
        }
    }

    public final String toString() {
        switch (this.h) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "Arrangement#End";
            default:
                return "Arrangement#Start";
        }
    }
}
