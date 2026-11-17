package defpackage;

import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ly1 {
    public final BitSet a = new BitSet();
    public boolean b;
    public int[] c;
    public int[] d;
    public boolean e;

    public final void a(int i, int i2) {
        if (i != i2) {
            int[] iArr = this.c;
            int i3 = iArr[i];
            int i4 = iArr[i2];
            iArr[i] = i4;
            iArr[i2] = i3;
            int[] iArr2 = this.d;
            if (iArr2 == null || this.e || iArr2.length != iArr.length) {
                this.e = true;
            } else {
                iArr2[i3] = i2;
                iArr2[i4] = i;
            }
            this.b = true;
        }
    }

    public final void b(double[] dArr, int[] iArr) {
        BitSet bitSet = this.a;
        bitSet.clear();
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (!bitSet.get(i)) {
                double d = dArr[i];
                int i2 = i;
                while (!bitSet.get(i2)) {
                    bitSet.set(i2);
                    int i3 = iArr[i2];
                    if (i3 != i2) {
                        double d2 = dArr[i3];
                        dArr[i3] = d;
                        i2 = i3;
                        d = d2;
                    }
                }
            }
        }
    }

    public final void c(int i) {
        int[] iArr = this.c;
        if (iArr != null && iArr.length == i) {
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.c;
                if (i2 >= iArr2.length) {
                    break;
                }
                iArr2[i2] = i2;
                i2++;
            }
        } else {
            this.c = mo2.E1(0, i);
        }
        this.b = false;
        this.e = true;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000a  */
    public final int[] d() {
        int[] iArr;
        int[] iArr2 = this.d;
        if (iArr2 != null) {
            int length = iArr2.length;
            iArr = this.c;
            if (length != iArr.length) {
                iArr = this.c;
                iArr2 = new int[iArr.length];
                this.d = iArr2;
                this.e = true;
            }
        } else {
            iArr = this.c;
            iArr2 = new int[iArr.length];
            this.d = iArr2;
            this.e = true;
        }
        if (this.e) {
            for (int i = 0; i < iArr.length; i++) {
                iArr2[iArr[i]] = i;
            }
            this.e = false;
        }
        return this.d;
    }

    public final String toString() {
        return Arrays.toString(this.c) + "/" + Arrays.toString(d());
    }
}
