package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class b70 extends sh0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final b70 r;
    public static final long s;

    static {
        Long l;
        b70 b70Var = new b70();
        r = b70Var;
        b70Var.l(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        s = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.sh0
    public final Thread A() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(r.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.sh0
    public final void C(long j, qh0 qh0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void E() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            Unsafe unsafe = hi.a;
            unsafe.putObjectVolatile(this, sh0.p, (Object) null);
            unsafe.putObjectVolatile(this, sh0.n, (Object) null);
            notifyAll();
        }
    }

    @Override // defpackage.sh0, defpackage.h80
    public final jb0 d(long j, Runnable runnable, o20 o20Var) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= 4611686018427387903L) {
            return fo1.h;
        }
        long jNanoTime = System.nanoTime();
        ph0 ph0Var = new ph0(j2 + jNanoTime, runnable);
        D(jNanoTime, ph0Var);
        return ph0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fx2.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    E();
                    if (B()) {
                        return;
                    }
                } else {
                    debugStatus = 1;
                    notifyAll();
                    long j = Long.MAX_VALUE;
                    while (true) {
                        Thread.interrupted();
                        long jQ = q();
                        if (jQ == Long.MAX_VALUE) {
                            long jNanoTime = System.nanoTime();
                            if (j == Long.MAX_VALUE) {
                                j = s + jNanoTime;
                            }
                            long j2 = j - jNanoTime;
                            if (j2 <= 0) {
                                _thread = null;
                                E();
                                if (!B()) {
                                    break;
                                } else {
                                    return;
                                }
                            }
                            if (jQ > j2) {
                                jQ = j2;
                            }
                        } else {
                            j = Long.MAX_VALUE;
                        }
                        if (jQ > 0) {
                            int i2 = debugStatus;
                            if (i2 == 2 || i2 == 3) {
                                _thread = null;
                                E();
                                if (!B()) {
                                    break;
                                } else {
                                    return;
                                }
                            }
                            LockSupport.parkNanos(this, jQ);
                        }
                    }
                }
            }
            A();
        } catch (Throwable th) {
            _thread = null;
            E();
            if (!B()) {
                A();
            }
            throw th;
        }
    }

    @Override // defpackage.sh0, defpackage.nh0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.q20
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // defpackage.sh0
    public final void v(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.v(runnable);
    }
}
