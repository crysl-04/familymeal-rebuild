package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class y13 extends a32 {
    public short[] a;
    public int b;

    @Override // defpackage.a32
    public final Object a() {
        return new x13(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.a32
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            int length = sArr.length << 1;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // defpackage.a32
    public final int d() {
        return this.b;
    }
}
