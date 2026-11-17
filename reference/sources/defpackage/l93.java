package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class l93 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Unsafe unsafe = hi.a;
        f = unsafe.objectFieldOffset(l93.class.getDeclaredField("lastScheduledTask$volatile"));
        b = AtomicIntegerFieldUpdater.newUpdater(l93.class, "producerIndex$volatile");
        g = unsafe.objectFieldOffset(l93.class.getDeclaredField("producerIndex$volatile"));
        e = unsafe.objectFieldOffset(l93.class.getDeclaredField("consumerIndex$volatile"));
        c = AtomicIntegerFieldUpdater.newUpdater(l93.class, "blockingTasksInBuffer$volatile");
        d = unsafe.objectFieldOffset(l93.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    public final ws2 a(ws2 ws2Var) {
        if (b() == 127) {
            return ws2Var;
        }
        if (ws2Var.i) {
            c.incrementAndGet(this);
        }
        int intVolatile = hi.a.getIntVolatile(this, g) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(intVolatile) == null) {
                atomicReferenceArray.lazySet(intVolatile, ws2Var);
                b.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int b() {
        return hi.a.getIntVolatile(this, g) - hi.a.getIntVolatile(this, e);
    }

    public final ws2 c() {
        ws2 ws2Var;
        while (true) {
            Unsafe unsafe = hi.a;
            long j = e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, g) == 0) {
                return null;
            }
            int i = intVolatile & 127;
            l93 l93Var = this;
            if (unsafe.compareAndSwapInt(l93Var, j, intVolatile, intVolatile + 1) && (ws2Var = (ws2) l93Var.a.getAndSet(i, null)) != null) {
                if (ws2Var.i) {
                    c.decrementAndGet(l93Var);
                }
                return ws2Var;
            }
            this = l93Var;
        }
    }

    public final ws2 d(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        ws2 ws2Var = (ws2) atomicReferenceArray.get(i2);
        if (ws2Var != null && ws2Var.i == z) {
            while (!atomicReferenceArray.compareAndSet(i2, ws2Var, null)) {
                if (atomicReferenceArray.get(i2) != ws2Var) {
                }
            }
            if (z) {
                c.decrementAndGet(this);
            }
            return ws2Var;
        }
        return null;
    }
}
