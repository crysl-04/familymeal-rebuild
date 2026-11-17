package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class km2 {
    public int[] a;
    public int[] b;
    public int c;
    public int[] d;
    public double[] e;
    public int[] f;
    public int[] g;
    public int[] h;
    public int i;
    public int[] j;
    public double[] k;

    public final void a(double[] dArr, double[] dArr2, im2 im2Var) {
        for (int i = 0; i < im2Var.c; i++) {
            int i2 = im2Var.f[i];
            if (i2 >= 0) {
                double d = dArr[im2Var.e[i]];
                if (d != h32.a) {
                    d /= im2Var.d[i];
                    int i3 = this.g[i];
                    for (int i4 = this.j[i]; i4 < i3; i4++) {
                        int i5 = this.h[i4];
                        dArr[i5] = dArr[i5] - (this.k[i4] * d);
                    }
                }
                dArr2[i2] = d;
            }
        }
    }
}
