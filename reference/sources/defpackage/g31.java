package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class g31 implements ee0 {
    public final f31 a;

    public g31(f31 f31Var) {
        this.a = f31Var;
    }

    @Override // defpackage.ee0, defpackage.cd
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final v33 a(s03 s03Var) {
        int[] iArr;
        Object[] objArr;
        f31 f31Var = this.a;
        si1 si1Var = f31Var.b;
        ri1 ri1Var = new ri1(si1Var.e + 2);
        si1 si1Var2 = new si1(si1Var.e);
        int[] iArr2 = si1Var.b;
        Object[] objArr2 = si1Var.c;
        long[] jArr = si1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8;
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr2[i5];
                            e31 e31Var = (e31) objArr2[i5];
                            ri1Var.a(i6);
                            si1Var2.h(i6, new u33((id) s03Var.a.h(e31Var.a), e31Var.b));
                        }
                        j >>= i2;
                        i4++;
                        i2 = i2;
                        iArr2 = iArr2;
                        objArr2 = objArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i3 != i2) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                }
                if (i == length) {
                    break;
                }
                i++;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        }
        if (!si1Var.a(0)) {
            int i7 = ri1Var.b;
            if (i7 < 0) {
                wg.i("Index must be between 0 and size");
                return null;
            }
            ri1Var.b(i7 + 1);
            int[] iArr3 = ri1Var.a;
            int i8 = ri1Var.b;
            if (i8 != 0) {
                gi.O(1, 0, i8, iArr3, iArr3);
            }
            iArr3[0] = 0;
            ri1Var.b++;
        }
        if (!si1Var.a(f31Var.a)) {
            ri1Var.a(f31Var.a);
        }
        int i9 = ri1Var.b;
        if (i9 != 0) {
            int[] iArr4 = ri1Var.a;
            iArr4.getClass();
            Arrays.sort(iArr4, 0, i9);
        }
        return new v33(ri1Var, si1Var2, f31Var.a, le0.c);
    }
}
