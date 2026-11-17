package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jg0 implements AutoCloseable {
    public static final jg0 h = new jg0();
    public static final AtomicInteger i = new AtomicInteger(0);

    @Override // java.lang.AutoCloseable
    public final void close() {
        i.set(0);
    }
}
