package defpackage;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class d40 extends ThreadPoolExecutor implements AutoCloseable {
    public static final AtomicInteger h = new AtomicInteger();
    public static final d40 i;

    static {
        final ThreadGroup threadGroup = new ThreadGroup("ojAlgo-daemon-group");
        final String str = "ojAlgo-daemon-";
        i = new d40(aq1.a.m, Integer.MAX_VALUE, 5L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: b40
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(threadGroup, runnable, jp1.h(d40.h.incrementAndGet(), str));
                thread.setDaemon(true);
                thread.setUncaughtExceptionHandler(new c40());
                return thread;
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }
}
