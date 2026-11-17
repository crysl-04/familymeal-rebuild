package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ny1 {
    public int h;
    public int i;
    public long j = 0;
    public long k = oy1.b;
    public long l = 0;

    public abstract int h0(e5 e5Var);

    public int j0() {
        return (int) (this.j & 4294967295L);
    }

    public int k0() {
        return (int) (this.j >> 32);
    }

    public Object l() {
        return null;
    }

    public final void l0() {
        this.h = cy1.n((int) (this.j >> 32), k00.k(this.k), k00.i(this.k));
        int iN = cy1.n((int) (this.j & 4294967295L), k00.j(this.k), k00.h(this.k));
        this.i = iN;
        int i = this.h;
        long j = this.j;
        this.l = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (((long) ((iN - ((int) (j & 4294967295L))) / 2)) & 4294967295L);
    }

    public abstract void n0(long j, float f, vp0 vp0Var);

    public final void o0(long j) {
        if (vy0.a(this.j, j)) {
            return;
        }
        this.j = j;
        l0();
    }

    public final void p0(long j) {
        if (k00.c(this.k, j)) {
            return;
        }
        this.k = j;
        l0();
    }
}
