package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class w20 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater o = AtomicLongFieldUpdater.newUpdater(w20.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater p = AtomicLongFieldUpdater.newUpdater(w20.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater q = AtomicIntegerFieldUpdater.newUpdater(w20.class, "_isTerminated$volatile");
    public static final qf0 r = new qf0("NOT_IN_STACK", (byte) 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int h;
    public final int i;
    public final long j;
    public final String k;
    public final tr0 l;
    public final tr0 m;
    public final s82 n;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public w20(long j, String str, int i, int i2) {
        this.h = i;
        this.i = i2;
        this.j = j;
        this.k = str;
        if (i < 1) {
            li1.e(jp1.i(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            li1.e(wi0.f(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            li1.e(jp1.i(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.l = new tr0();
        this.m = new tr0();
        this.n = new s82((i + 1) << 1);
        this.controlState$volatile = ((long) i) << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void c(w20 w20Var, Runnable runnable, int i) {
        w20Var.b(runnable, false, (i & 4) == 0);
    }

    public final int a() {
        synchronized (this.n) {
            if (q.get(this) != 0) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = p;
            long j = atomicLongFieldUpdater.get(this);
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.h) {
                return 0;
            }
            if (i >= this.i) {
                return 0;
            }
            int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
            if (i3 <= 0 || this.n.b(i3) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            u20 u20Var = new u20(this, i3);
            this.n.c(i3, u20Var);
            if (i3 != ((int) (atomicLongFieldUpdater.incrementAndGet(this) & 2097151))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int i4 = i2 + 1;
            u20Var.start();
            return i4;
        }
    }

    public final void b(Runnable runnable, boolean z, boolean z2) {
        ws2 xs2Var;
        v20 v20Var;
        ys2.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof ws2) {
            xs2Var = (ws2) runnable;
            xs2Var.h = jNanoTime;
            xs2Var.i = z;
        } else {
            xs2Var = new xs2(runnable, jNanoTime, z);
        }
        boolean z3 = xs2Var.i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = p;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        u20 u20Var = threadCurrentThread instanceof u20 ? (u20) threadCurrentThread : null;
        if (u20Var == null || u20Var.o != this) {
            u20Var = null;
        }
        if (u20Var != null && (v20Var = u20Var.j) != v20.l && (xs2Var.i || v20Var != v20.i)) {
            u20Var.n = true;
            l93 l93Var = u20Var.h;
            if (z2) {
                xs2Var = l93Var.a(xs2Var);
            } else {
                l93Var.getClass();
                ws2 ws2Var = (ws2) hi.a.getAndSetObject(l93Var, l93.f, xs2Var);
                xs2Var = ws2Var == null ? null : l93Var.a(ws2Var);
            }
        }
        if (xs2Var != null) {
            if (!(xs2Var.i ? this.m.a(xs2Var) : this.l.a(xs2Var))) {
                throw new RejectedExecutionException(wi0.i(new StringBuilder(), this.k, " was terminated"));
            }
        }
        boolean z4 = z2 && u20Var != null;
        if (z3) {
            if (z4 || f() || e(jAddAndGet)) {
                return;
            }
            f();
            return;
        }
        if (z4 || f() || e(atomicLongFieldUpdater.get(this))) {
            return;
        }
        f();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        ws2 ws2VarA;
        if (q.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            u20 u20Var = threadCurrentThread instanceof u20 ? (u20) threadCurrentThread : null;
            if (u20Var == null || u20Var.o != this) {
                u20Var = null;
            }
            synchronized (this.n) {
                i = (int) (p.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objB = this.n.b(i2);
                    objB.getClass();
                    u20 u20Var2 = (u20) objB;
                    if (u20Var2 != u20Var) {
                        while (u20Var2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(u20Var2);
                            u20Var2.join(10000L);
                        }
                        l93 l93Var = u20Var2.h;
                        tr0 tr0Var = this.m;
                        l93Var.getClass();
                        ws2 ws2Var = (ws2) hi.a.getAndSetObject(l93Var, l93.f, (Object) null);
                        if (ws2Var != null) {
                            tr0Var.a(ws2Var);
                        }
                        while (true) {
                            ws2 ws2VarC = l93Var.c();
                            if (ws2VarC == null) {
                                break;
                            } else {
                                tr0Var.a(ws2VarC);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.m.b();
            this.l.b();
            while (true) {
                if (u20Var != null) {
                    ws2VarA = u20Var.a(true);
                    if (ws2VarA == null) {
                        ws2VarA = (ws2) this.l.d();
                        if (ws2VarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    ws2VarA = (ws2) this.l.d();
                    if (ws2VarA == null && (ws2VarA = (ws2) this.m.d()) == null) {
                        break;
                    }
                }
                try {
                    ws2VarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (u20Var != null) {
                u20Var.h(v20.l);
            }
            o.set(this, 0L);
            p.set(this, 0L);
        }
    }

    public final void d(u20 u20Var, int i, int i2) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = o;
            long j = atomicLongFieldUpdater.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objC = u20Var.c();
                    while (true) {
                        if (objC == r) {
                            i3 = -1;
                            break;
                        }
                        if (objC == null) {
                            i3 = 0;
                            break;
                        }
                        u20 u20Var2 = (u20) objC;
                        int iB = u20Var2.b();
                        if (iB != 0) {
                            i3 = iB;
                            break;
                        }
                        objC = u20Var2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                long j3 = j2 | ((long) i3);
                w20 w20Var = this;
                if (atomicLongFieldUpdater.compareAndSet(w20Var, j, j3)) {
                    return;
                } else {
                    this = w20Var;
                }
            }
        }
    }

    public final boolean e(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.h;
        if (i < i2) {
            int iA = a();
            if (iA == 1 && i2 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(this, runnable, 6);
    }

    public final boolean f() {
        w20 w20Var;
        qf0 qf0Var;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = o;
            long j = atomicLongFieldUpdater.get(this);
            u20 u20Var = (u20) this.n.b((int) (2097151 & j));
            if (u20Var == null) {
                u20Var = null;
                w20Var = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objC = u20Var.c();
                while (true) {
                    qf0Var = r;
                    if (objC == qf0Var) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    u20 u20Var2 = (u20) objC;
                    iB = u20Var2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = u20Var2.c();
                    atomicLongFieldUpdater = atomicLongFieldUpdater;
                    this = this;
                }
                if (iB >= 0) {
                    w20 w20Var2 = this;
                    boolean zCompareAndSet = atomicLongFieldUpdater.compareAndSet(w20Var2, j, j2 | ((long) iB));
                    w20Var = w20Var2;
                    if (zCompareAndSet) {
                        u20Var.g(qf0Var);
                    }
                    this = w20Var;
                } else {
                    continue;
                }
            }
            if (u20Var == null) {
                return false;
            }
            if (u20.p.compareAndSet(u20Var, -1, 0)) {
                LockSupport.unpark(u20Var);
                return true;
            }
            this = w20Var;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        s82 s82Var = this.n;
        int iA = s82Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            u20 u20Var = (u20) s82Var.b(i6);
            if (u20Var != null) {
                l93 l93Var = u20Var.h;
                l93Var.getClass();
                Object objectVolatile = hi.a.getObjectVolatile(l93Var, l93.f);
                int iB = l93Var.b();
                if (objectVolatile != null) {
                    iB++;
                }
                int iOrdinal = u20Var.j.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iB);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iB);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (iB > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iB);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        wg.n();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = p.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.k);
        sb4.append('@');
        sb4.append(s60.o(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.h;
        sb4.append(i7);
        sb4.append(", max = ");
        sb4.append(this.i);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.l.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.m.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
