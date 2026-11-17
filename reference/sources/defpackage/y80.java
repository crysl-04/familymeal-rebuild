package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class y80 implements g01 {
    public final double[] h;
    public final boolean i;
    public final int j;
    public final int k;
    public final double[] l;

    public y80(double[] dArr, double[] dArr2, int i, int i2, boolean z) {
        this.h = dArr;
        this.l = dArr2;
        this.j = i;
        this.k = i2;
        this.i = z;
    }

    @Override // defpackage.no2
    public final int T() {
        return this.j;
    }

    @Override // defpackage.no2
    public final int Z1() {
        return this.j;
    }

    @Override // defpackage.g01
    public final void x1(double[] dArr) {
        int i = this.j;
        lt.K(true, i, 1, this.k, this.h, Math.max(1, i), this.l, dArr, Math.max(1, this.j));
    }
}
