package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class t5 implements ci0 {
    public final int[] a;
    public final double[] b;
    public m00 c;
    public final int[] d;
    public final int e;

    public t5(int i, int i2) {
        this.e = i2;
        int[] iArr = new int[i2];
        this.a = iArr;
        Arrays.fill(iArr, -1);
        this.b = new double[i2];
        m00 m00VarA0 = m00.a0(i, true);
        this.c = m00VarA0;
        m00VarA0.l = true;
        this.d = new int[i2];
    }

    @Override // defpackage.ci0
    public final int b() {
        return 0;
    }

    @Override // defpackage.ci0
    public final boolean c(int i) {
        return false;
    }

    @Override // defpackage.ci0
    public final int d() {
        return this.e;
    }

    @Override // defpackage.ci0
    public final ih0 e(int i) {
        return null;
    }

    @Override // defpackage.ci0
    public final int f(int i) {
        return this.d[i];
    }
}
