package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class r70 extends uh0 {
    public static final r70 k;
    public w20 j;

    static {
        int i = ys2.c;
        int i2 = ys2.d;
        long j = ys2.e;
        String str = ys2.a;
        r70 r70Var = new r70();
        r70Var.j = new w20(j, str, i, i2);
        k = r70Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.q20
    public final void e(o20 o20Var, Runnable runnable) {
        w20.c(this.j, runnable, 6);
    }

    @Override // defpackage.q20
    public final String toString() {
        return "Dispatchers.Default";
    }
}
