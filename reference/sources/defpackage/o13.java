package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class o13 extends a32 {
    public int[] a;
    public int b;

    @Override // defpackage.a32
    public final Object a() {
        return new n13(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.a32
    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int length = iArr.length << 1;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // defpackage.a32
    public final int d() {
        return this.b;
    }
}
