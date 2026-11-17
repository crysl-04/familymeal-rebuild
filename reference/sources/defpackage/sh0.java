package defpackage;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class sh0 extends nh0 implements h80 {
    public static final /* synthetic */ long n;
    public static final /* synthetic */ long o;
    public static final /* synthetic */ long p;
    public static final /* synthetic */ int q = 0;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = hi.a;
        p = unsafe.objectFieldOffset(sh0.class.getDeclaredField("_queue$volatile"));
        n = unsafe.objectFieldOffset(sh0.class.getDeclaredField("_delayed$volatile"));
        o = unsafe.objectFieldOffset(sh0.class.getDeclaredField("_isCompleted$volatile"));
    }

    public abstract Thread A();

    public final boolean B() {
        ih ihVar = this.l;
        if (ihVar != null ? ihVar.isEmpty() : true) {
            Unsafe unsafe = hi.a;
            rh0 rh0Var = (rh0) unsafe.getObjectVolatile(this, n);
            if (rh0Var != null && rh0Var.b() != 0) {
                return false;
            }
            Object objectVolatile = unsafe.getObjectVolatile(this, p);
            if (objectVolatile != null) {
                if (objectVolatile instanceof bc1) {
                    long longVolatile = unsafe.getLongVolatile((bc1) objectVolatile, bc1.g);
                    return ((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == tz0.T) {
                }
            }
            return true;
        }
        return false;
    }

    public void C(long j, qh0 qh0Var) {
        b70.r.D(j, qh0Var);
    }

    public final void D(long j, qh0 qh0Var) {
        sh0 sh0Var;
        int iB;
        Unsafe unsafe;
        Thread threadA;
        long j2 = n;
        Unsafe unsafe2 = hi.a;
        if (unsafe2.getIntVolatile(this, o) != 0) {
            sh0Var = this;
            iB = 1;
        } else {
            rh0 rh0Var = (rh0) unsafe2.getObjectVolatile(this, j2);
            if (rh0Var == null) {
                rh0 rh0Var2 = new rh0();
                rh0Var2.c = j;
                while (true) {
                    unsafe = hi.a;
                    sh0Var = this;
                    if (unsafe.compareAndSwapObject(sh0Var, n, (Object) null, rh0Var2) || unsafe.getObjectVolatile(sh0Var, j2) != null) {
                        break;
                    } else {
                        this = sh0Var;
                    }
                }
                Object objectVolatile = unsafe.getObjectVolatile(sh0Var, j2);
                objectVolatile.getClass();
                rh0Var = (rh0) objectVolatile;
                unsafe2 = unsafe;
            } else {
                sh0Var = this;
            }
            iB = qh0Var.b(j, rh0Var, sh0Var);
        }
        if (iB != 0) {
            if (iB == 1) {
                sh0Var.C(j, qh0Var);
                return;
            } else {
                if (iB != 2) {
                    li1.g("unexpected result");
                    return;
                }
                return;
            }
        }
        rh0 rh0Var3 = (rh0) unsafe2.getObjectVolatile(sh0Var, j2);
        qh0 qh0Var2 = null;
        if (rh0Var3 != null) {
            synchronized (rh0Var3) {
                qh0[] qh0VarArr = rh0Var3.a;
                qh0Var2 = qh0VarArr != null ? qh0VarArr[0] : null;
            }
        }
        if (qh0Var2 != qh0Var || Thread.currentThread() == (threadA = sh0Var.A())) {
            return;
        }
        LockSupport.unpark(threadA);
    }

    @Override // defpackage.h80
    public final void c(long j, rq rqVar) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            oh0 oh0Var = new oh0(this, j2 + jNanoTime, rqVar);
            D(jNanoTime, oh0Var);
            rqVar.x(new nq(oh0Var, (byte) 2));
        }
    }

    public jb0 d(long j, Runnable runnable, o20 o20Var) {
        return c70.a.d(j, runnable, o20Var);
    }

    @Override // defpackage.q20
    public final void e(o20 o20Var, Runnable runnable) {
        v(runnable);
    }

    @Override // defpackage.nh0
    public final long q() {
        Unsafe unsafe;
        sh0 sh0Var;
        Unsafe unsafe2;
        Runnable runnable;
        qh0 qh0Var;
        qf0 qf0Var = tz0.T;
        long j = p;
        if (!s()) {
            y();
            loop0: while (true) {
                unsafe = hi.a;
                Object objectVolatile = unsafe.getObjectVolatile(this, j);
                if (objectVolatile == null) {
                    sh0Var = this;
                } else if (objectVolatile instanceof bc1) {
                    bc1 bc1Var = (bc1) objectVolatile;
                    Object objD = bc1Var.d();
                    if (objD != bc1.e) {
                        Runnable runnable2 = (Runnable) objD;
                        sh0Var = this;
                        runnable = runnable2;
                        unsafe2 = unsafe;
                        break;
                    }
                    bc1 bc1VarC = bc1Var.c();
                    while (true) {
                        Unsafe unsafe3 = hi.a;
                        sh0Var = this;
                        if (unsafe3.compareAndSwapObject(sh0Var, p, objectVolatile, bc1VarC) || unsafe3.getObjectVolatile(sh0Var, j) != objectVolatile) {
                            break;
                        }
                        this = sh0Var;
                    }
                    this = sh0Var;
                } else {
                    sh0Var = this;
                    if (objectVolatile != qf0Var) {
                        do {
                            unsafe2 = hi.a;
                            if (unsafe2.compareAndSwapObject(sh0Var, p, objectVolatile, (Object) null)) {
                                runnable = (Runnable) objectVolatile;
                                unsafe = unsafe2;
                                break loop0;
                            }
                        } while (unsafe2.getObjectVolatile(sh0Var, j) == objectVolatile);
                        this = sh0Var;
                    }
                }
                unsafe2 = unsafe;
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            ih ihVar = sh0Var.l;
            if (((ihVar == null || ihVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object objectVolatile2 = unsafe.getObjectVolatile(sh0Var, j);
                if (objectVolatile2 != null) {
                    if (objectVolatile2 instanceof bc1) {
                        long longVolatile = unsafe2.getLongVolatile((bc1) objectVolatile2, bc1.g);
                        if (((int) (1073741823 & longVolatile)) != ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (objectVolatile2 == qf0Var) {
                        return Long.MAX_VALUE;
                    }
                }
                rh0 rh0Var = (rh0) unsafe.getObjectVolatile(sh0Var, n);
                if (rh0Var != null) {
                    synchronized (rh0Var) {
                        qh0[] qh0VarArr = rh0Var.a;
                        qh0Var = qh0VarArr != null ? qh0VarArr[0] : null;
                    }
                    if (qh0Var != null) {
                        long jNanoTime = qh0Var.h - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    @Override // defpackage.nh0
    public void shutdown() {
        qf0 qf0Var;
        Unsafe unsafe;
        qh0 qh0VarC;
        fx2.a.set(null);
        hi.a.putIntVolatile(this, o, 1);
        qf0 qf0Var2 = tz0.T;
        long j = p;
        loop0: while (true) {
            Object objectVolatile = hi.a.getObjectVolatile(this, j);
            if (objectVolatile != null) {
                qf0Var = qf0Var2;
                if (!(objectVolatile instanceof bc1)) {
                    if (objectVolatile == qf0Var) {
                        break;
                    }
                    bc1 bc1Var = new bc1(8, true);
                    bc1Var.a((Runnable) objectVolatile);
                    do {
                        unsafe = hi.a;
                        if (unsafe.compareAndSwapObject(this, p, objectVolatile, bc1Var)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                    qf0Var2 = qf0Var;
                } else {
                    ((bc1) objectVolatile).b();
                    break;
                }
            } else {
                while (true) {
                    Unsafe unsafe2 = hi.a;
                    qf0Var = qf0Var2;
                    if (!unsafe2.compareAndSwapObject(this, p, (Object) null, qf0Var2)) {
                        if (unsafe2.getObjectVolatile(this, j) != null) {
                            break;
                        } else {
                            qf0Var2 = qf0Var;
                        }
                    } else {
                        break loop0;
                    }
                }
                qf0Var2 = qf0Var;
            }
        }
        while (q() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            rh0 rh0Var = (rh0) hi.a.getObjectVolatile(this, n);
            if (rh0Var == null) {
                return;
            }
            synchronized (rh0Var) {
                qh0VarC = rh0Var.b() > 0 ? rh0Var.c(0) : null;
            }
            if (qh0VarC == null) {
                return;
            } else {
                C(jNanoTime, qh0VarC);
            }
        }
    }

    public void v(Runnable runnable) {
        y();
        if (!z(runnable)) {
            b70.r.v(runnable);
            return;
        }
        Thread threadA = A();
        if (Thread.currentThread() != threadA) {
            LockSupport.unpark(threadA);
        }
    }

    public final void y() {
        qh0 qh0VarC;
        rh0 rh0Var = (rh0) hi.a.getObjectVolatile(this, n);
        if (rh0Var == null || rh0Var.b() == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (rh0Var) {
                qh0[] qh0VarArr = rh0Var.a;
                qh0VarC = null;
                qh0 qh0Var = qh0VarArr != null ? qh0VarArr[0] : null;
                if (qh0Var != null) {
                    qh0VarC = ((jNanoTime - qh0Var.h) > 0L ? 1 : ((jNanoTime - qh0Var.h) == 0L ? 0 : -1)) >= 0 ? z(qh0Var) : false ? rh0Var.c(0) : null;
                }
            }
        } while (qh0VarC != null);
    }

    public final boolean z(Runnable runnable) {
        sh0 sh0Var;
        Runnable runnable2;
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            Unsafe unsafe3 = hi.a;
            long j = p;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (unsafe3.getIntVolatile(this, o) != 0) {
                return false;
            }
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe4 = hi.a;
                    sh0 sh0Var2 = this;
                    runnable2 = runnable;
                    sh0Var = sh0Var2;
                    if (!unsafe4.compareAndSwapObject(sh0Var2, p, (Object) null, runnable2)) {
                        if (unsafe4.getObjectVolatile(sh0Var, j) != null) {
                            break;
                        }
                        this = sh0Var;
                        runnable = runnable2;
                    } else {
                        return true;
                    }
                }
                this = sh0Var;
                runnable = runnable2;
            } else {
                sh0Var = this;
                runnable2 = runnable;
                if (objectVolatile instanceof bc1) {
                    bc1 bc1Var = (bc1) objectVolatile;
                    int iA = bc1Var.a(runnable2);
                    if (iA == 0) {
                        return true;
                    }
                    if (iA == 1) {
                        bc1 bc1VarC = bc1Var.c();
                        do {
                            unsafe2 = hi.a;
                            if (unsafe2.compareAndSwapObject(sh0Var, p, objectVolatile, bc1VarC)) {
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(sh0Var, j) == objectVolatile);
                    } else if (iA == 2) {
                        return false;
                    }
                    this = sh0Var;
                    runnable = runnable2;
                } else {
                    if (objectVolatile == tz0.T) {
                        return false;
                    }
                    bc1 bc1Var2 = new bc1(8, true);
                    bc1Var2.a((Runnable) objectVolatile);
                    bc1Var2.a(runnable2);
                    do {
                        unsafe = hi.a;
                        if (unsafe.compareAndSwapObject(sh0Var, p, objectVolatile, bc1Var2)) {
                            return true;
                        }
                    } while (unsafe.getObjectVolatile(sh0Var, j) == objectVolatile);
                    this = sh0Var;
                    runnable = runnable2;
                }
            }
        }
    }
}
