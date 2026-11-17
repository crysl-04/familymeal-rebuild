package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class r12 {
    public static final int[] a;
    public static final long[] b;

    static {
        int[] iArr = new int[31];
        a = iArr;
        e32 e32Var = h32.q;
        b = new long[63];
        iArr[0] = 1;
        int i = 1;
        while (true) {
            int[] iArr2 = a;
            if (i >= 31) {
                break;
            }
            iArr2[i] = iArr2[i - 1] << 1;
            i++;
        }
        b[0] = 1;
        int i2 = 1;
        while (true) {
            long[] jArr = b;
            if (i2 >= jArr.length) {
                long j = jArr[jArr.length - 1];
                return;
            } else {
                jArr[i2] = jArr[i2 - 1] << 1;
                i2++;
            }
        }
    }
}
