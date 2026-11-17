package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class im2 {
    public final ly1 a;
    public final ly1 b;
    public int c = 0;
    public double[] d;
    public int[] e;
    public int[] f;
    public final int[] g;
    public final int[] h;

    public im2(int i, int i2, int i3) {
        this.d = new double[i3];
        this.e = new int[i3];
        this.f = new int[i3];
        this.g = new int[i2];
        this.h = new int[i];
        ly1 ly1Var = new ly1();
        this.a = ly1Var;
        ly1Var.c(i2);
        ly1 ly1Var2 = new ly1();
        this.b = ly1Var2;
        ly1Var2.c(i);
    }

    public final void a(int i, int i2, int i3, double d) {
        this.f[i] = i2;
        this.e[i] = i3;
        this.d[i] = d;
        this.h[i2] = i;
        this.g[i3] = i;
    }
}
