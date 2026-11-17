package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class hk2 {
    public static final fk2 a(fk2 fk2Var) {
        if (!(fk2Var instanceof fk2)) {
            fk2Var = null;
        }
        if (fk2Var != null) {
            return fk2Var;
        }
        ez.b("Inconsistent composition");
        wg.k();
        return null;
    }

    public static final int b(ArrayList arrayList, int i, int i2) {
        int iC = c(arrayList, i, i2);
        return iC >= 0 ? iC : -(iC + 1);
    }

    public static final int c(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((xq0) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int i6 = uz0.i(i5, i);
            if (i6 < 0) {
                i3 = i4 + 1;
            } else {
                if (i6 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int d(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void e() {
        throw new ConcurrentModificationException();
    }

    public static final void f(int i, int i2, int[] iArr) {
        int i3 = (i * 5) + 1;
        iArr[i3] = (iArr[i3] & (-67108864)) | i2;
    }
}
