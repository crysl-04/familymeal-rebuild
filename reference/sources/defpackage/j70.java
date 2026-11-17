package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class j70 extends uh0 implements Executor {
    public static final j70 j = new j70();
    public static final q20 k;

    static {
        m23 m23Var = m23.j;
        int i = dr2.a;
        if (64 >= i) {
            i = 64;
        }
        k = m23Var.g(pz1.A("kotlinx.coroutines.io.parallelism", i, 12));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(xf0.h, runnable);
    }

    @Override // defpackage.q20
    public final String toString() {
        return "Dispatchers.IO";
    }
}
