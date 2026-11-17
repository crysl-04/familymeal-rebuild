package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class u20 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater p = AtomicIntegerFieldUpdater.newUpdater(u20.class, "workerCtl$volatile");
    public static final /* synthetic */ long q = hi.a.objectFieldOffset(u20.class.getDeclaredField("workerCtl$volatile"));
    public final l93 h;
    public final x72 i;
    private volatile int indexInArray;
    public v20 j;
    public long k;
    public long l;
    public int m;
    public boolean n;
    private volatile Object nextParkedWorker;
    public final /* synthetic */ w20 o;
    private volatile /* synthetic */ int workerCtl$volatile;

    public u20(w20 w20Var, int i) {
        this.o = w20Var;
        setDaemon(true);
        setContextClassLoader(w20.class.getClassLoader());
        this.h = new l93();
        this.i = new x72();
        this.j = v20.k;
        this.nextParkedWorker = w20.r;
        int iNanoTime = (int) System.nanoTime();
        this.m = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    public final ws2 a(boolean z) {
        ws2 ws2VarE;
        ws2 ws2VarE2;
        long j;
        Unsafe unsafe;
        v20 v20Var = this.j;
        w20 w20Var = this.o;
        ws2 ws2Var = null;
        l93 l93Var = this.h;
        v20 v20Var2 = v20.h;
        if (v20Var != v20Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = w20.p;
            do {
                j = atomicLongFieldUpdater.get(w20Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    l93Var.getClass();
                    long j2 = l93.f;
                    loop1: while (true) {
                        Unsafe unsafe2 = hi.a;
                        ws2 ws2Var2 = (ws2) unsafe2.getObjectVolatile(l93Var, j2);
                        if (ws2Var2 == null || !ws2Var2.i) {
                            int intVolatile = unsafe2.getIntVolatile(l93Var, l93.e);
                            int intVolatile2 = unsafe2.getIntVolatile(l93Var, l93.g);
                            while (intVolatile != intVolatile2 && hi.a.getIntVolatile(l93Var, l93.d) != 0) {
                                intVolatile2--;
                                ws2 ws2VarD = l93Var.d(intVolatile2, true);
                                if (ws2VarD != null) {
                                    ws2Var = ws2VarD;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            unsafe = hi.a;
                            if (unsafe.compareAndSwapObject(l93Var, l93.f, ws2Var2, (Object) null)) {
                                ws2Var = ws2Var2;
                                break loop1;
                            }
                        } while (unsafe.getObjectVolatile(l93Var, j2) == ws2Var2);
                    }
                    if (ws2Var != null) {
                        return ws2Var;
                    }
                    ws2 ws2Var3 = (ws2) w20Var.m.d();
                    return ws2Var3 == null ? i(1) : ws2Var3;
                }
            } while (!w20.p.compareAndSet(w20Var, j, j - 4398046511104L));
            this.j = v20Var2;
        }
        if (z) {
            boolean z2 = d(w20Var.h << 1) == 0;
            if (z2 && (ws2VarE2 = e()) != null) {
                return ws2VarE2;
            }
            l93Var.getClass();
            ws2 ws2VarC = (ws2) hi.a.getAndSetObject(l93Var, l93.f, (Object) null);
            if (ws2VarC == null) {
                ws2VarC = l93Var.c();
            }
            if (ws2VarC != null) {
                return ws2VarC;
            }
            if (!z2 && (ws2VarE = e()) != null) {
                return ws2VarE;
            }
        } else {
            ws2 ws2VarE3 = e();
            if (ws2VarE3 != null) {
                return ws2VarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.m;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.m = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    public final ws2 e() {
        int iD = d(2);
        w20 w20Var = this.o;
        tr0 tr0Var = w20Var.m;
        tr0 tr0Var2 = w20Var.l;
        if (iD == 0) {
            ws2 ws2Var = (ws2) tr0Var2.d();
            return ws2Var != null ? ws2Var : (ws2) tr0Var.d();
        }
        ws2 ws2Var2 = (ws2) tr0Var.d();
        return ws2Var2 != null ? ws2Var2 : (ws2) tr0Var2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.o.k);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(v20 v20Var) {
        v20 v20Var2 = this.j;
        boolean z = v20Var2 == v20.h;
        if (z) {
            w20.p.addAndGet(this.o, 4398046511104L);
        }
        if (v20Var2 != v20Var) {
            this.j = v20Var;
        }
        return z;
    }

    public final ws2 i(int i) {
        int i2;
        long j;
        ws2 ws2VarC;
        long j2;
        long j3;
        Unsafe unsafe;
        AtomicLongFieldUpdater atomicLongFieldUpdater = w20.p;
        w20 w20Var = this.o;
        int i3 = (int) (atomicLongFieldUpdater.get(w20Var) & 2097151);
        ws2 ws2Var = null;
        if (i3 < 2) {
            return null;
        }
        int iD = d(i3);
        int i4 = 0;
        long jMin = Long.MAX_VALUE;
        while (i4 < i3) {
            iD++;
            if (iD > i3) {
                iD = 1;
            }
            u20 u20Var = (u20) w20Var.n.b(iD);
            if (u20Var == null || u20Var == this) {
                i2 = i3;
            } else {
                l93 l93Var = u20Var.h;
                if (i != 3) {
                    l93Var.getClass();
                    Unsafe unsafe2 = hi.a;
                    int intVolatile = unsafe2.getIntVolatile(l93Var, l93.e);
                    j = 0;
                    int intVolatile2 = unsafe2.getIntVolatile(l93Var, l93.g);
                    boolean z = i == 1;
                    while (true) {
                        if (intVolatile != intVolatile2) {
                            if (z) {
                                i2 = i3;
                                if (hi.a.getIntVolatile(l93Var, l93.d) == 0) {
                                }
                            } else {
                                i2 = i3;
                            }
                            int i5 = intVolatile + 1;
                            ws2 ws2VarD = l93Var.d(intVolatile, z);
                            if (ws2VarD != null) {
                                ws2VarC = ws2VarD;
                                break;
                            }
                            intVolatile = i5;
                            i3 = i2;
                        } else {
                            i2 = i3;
                        }
                        ws2VarC = ws2Var;
                        break;
                    }
                } else {
                    ws2VarC = l93Var.c();
                    i2 = i3;
                    j = 0;
                }
                x72 x72Var = this.i;
                if (ws2VarC == null) {
                    j2 = -1;
                    long j4 = l93.f;
                    while (true) {
                        ws2 ws2Var2 = (ws2) hi.a.getObjectVolatile(l93Var, j4);
                        if (ws2Var2 != null) {
                            if (((ws2Var2.i ? 1 : 2) & i) != 0) {
                                ys2.f.getClass();
                                l93 l93Var2 = l93Var;
                                long jNanoTime = System.nanoTime() - ws2Var2.h;
                                long j5 = ys2.b;
                                if (jNanoTime < j5) {
                                    j3 = j5 - jNanoTime;
                                    break;
                                }
                                do {
                                    unsafe = hi.a;
                                    if (unsafe.compareAndSwapObject(l93Var2, l93.f, ws2Var2, (Object) null)) {
                                        x72Var.h = ws2Var2;
                                        j3 = -1;
                                        break;
                                    }
                                } while (unsafe.getObjectVolatile(l93Var2, j4) == ws2Var2);
                                l93Var = l93Var2;
                            }
                        }
                        j3 = -2;
                        break;
                    }
                } else {
                    x72Var.h = ws2VarC;
                    j3 = -1;
                    j2 = -1;
                }
                if (j3 == j2) {
                    ws2 ws2Var3 = (ws2) x72Var.h;
                    x72Var.h = null;
                    return ws2Var3;
                }
                if (j3 > j) {
                    jMin = Math.min(jMin, j3);
                }
            }
            i4++;
            i3 = i2;
            ws2Var = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.l = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (w20.q.get(this.o) != 0) {
                    break loop0;
                }
                v20 v20Var = this.j;
                v20 v20Var2 = v20.l;
                if (v20Var == v20Var2) {
                    break loop0;
                }
                ws2 ws2VarA = a(this.n);
                if (ws2VarA != null) {
                    this.l = 0L;
                    w20 w20Var = this.o;
                    this.k = 0L;
                    if (this.j == v20.j) {
                        this.j = v20.i;
                    }
                    if (!ws2VarA.i) {
                        try {
                            ws2VarA.run();
                            break;
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                            break;
                        }
                    }
                    if (h(v20.i) && !w20Var.f() && !w20Var.e(w20.p.get(w20Var))) {
                        w20Var.f();
                    }
                    try {
                        ws2VarA.run();
                    } catch (Throwable th2) {
                        Thread threadCurrentThread2 = Thread.currentThread();
                        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                    }
                    w20.p.addAndGet(w20Var, -2097152L);
                    if (this.j == v20Var2) {
                        break;
                    }
                    this.j = v20.k;
                    break;
                }
                this.n = false;
                if (this.l == 0) {
                    Object obj = this.nextParkedWorker;
                    qf0 qf0Var = w20.r;
                    if (obj != qf0Var) {
                        int i = -1;
                        hi.a.putIntVolatile(this, q, -1);
                        while (this.nextParkedWorker != w20.r) {
                            Unsafe unsafe = hi.a;
                            long j = q;
                            if (unsafe.getIntVolatile(this, j) != i) {
                                break;
                            }
                            w20 w20Var2 = this.o;
                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = w20.q;
                            if (atomicIntegerFieldUpdater.get(w20Var2) != 0) {
                                break;
                            }
                            v20 v20Var3 = this.j;
                            v20 v20Var4 = v20.l;
                            if (v20Var3 == v20Var4) {
                                break;
                            }
                            h(v20.j);
                            Thread.interrupted();
                            if (this.k == 0) {
                                this.k = System.nanoTime() + this.o.j;
                            }
                            LockSupport.parkNanos(this.o.j);
                            if (System.nanoTime() - this.k >= 0) {
                                this.k = 0L;
                                w20 w20Var3 = this.o;
                                synchronized (w20Var3.n) {
                                    if (!(atomicIntegerFieldUpdater.get(w20Var3) != 0)) {
                                        AtomicLongFieldUpdater atomicLongFieldUpdater = w20.p;
                                        if (((int) (atomicLongFieldUpdater.get(w20Var3) & 2097151)) > w20Var3.h) {
                                            if (unsafe.compareAndSwapInt(this, j, -1, 1)) {
                                                int i2 = this.indexInArray;
                                                f(0);
                                                w20Var3.d(this, i2, 0);
                                                int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(w20Var3) & 2097151);
                                                if (andDecrement != i2) {
                                                    Object objB = w20Var3.n.b(andDecrement);
                                                    objB.getClass();
                                                    u20 u20Var = (u20) objB;
                                                    w20Var3.n.c(i2, u20Var);
                                                    u20Var.f(i2);
                                                    w20Var3.d(u20Var, andDecrement, i2);
                                                }
                                                w20Var3.n.c(andDecrement, null);
                                                this.j = v20Var4;
                                            }
                                        }
                                    }
                                }
                            }
                            i = -1;
                        }
                    } else {
                        w20 w20Var4 = this.o;
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = w20.o;
                        if (this.nextParkedWorker == qf0Var) {
                            while (true) {
                                long j2 = atomicLongFieldUpdater2.get(w20Var4);
                                int i3 = this.indexInArray;
                                this.nextParkedWorker = w20Var4.n.b((int) (j2 & 2097151));
                                w20 w20Var5 = w20Var4;
                                AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                                if (!atomicLongFieldUpdater3.compareAndSet(w20Var5, j2, ((j2 + 2097152) & (-2097152)) | ((long) i3))) {
                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                    w20Var4 = w20Var5;
                                }
                            }
                        }
                    }
                } else {
                    if (z) {
                        h(v20.j);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.l);
                        this.l = 0L;
                        break;
                    }
                    z = true;
                }
            }
        }
        h(v20.l);
    }
}
