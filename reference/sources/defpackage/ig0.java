package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ig0 implements AutoCloseable {
    public static final ig0 j;
    public static r32 k;
    public static final hg0 l;
    public final Object h;
    public volatile boolean i;

    static {
        ig0 ig0Var = new ig0();
        j = ig0Var;
        dg0 dg0Var = new dg0(ig0Var);
        k = dg0Var;
        l = new hg0(-1L, -1L, "Empty Thread", dg0Var);
        hw.a.incrementAndGet();
    }

    public ig0() {
        jg0 jg0Var = jg0.h;
        this.h = new Object();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        jg0.h.close();
    }
}
