package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ok1 extends ih2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(ok1.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long j = hi.a.objectFieldOffset(ok1.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public ok1() {
        super(1);
        this.owner$volatile = t03.y;
    }

    public final boolean c() {
        return Math.max(hi.a.getIntVolatile(this, ih2.f), 0) == 0;
    }

    public final Object d(m10 m10Var) {
        boolean zE = e();
        j23 j23Var = j23.a;
        if (!zE) {
            rq rqVarK = uz0.k(ls.F(m10Var));
            try {
                nk1 nk1Var = new nk1(this, rqVarK);
                while (true) {
                    int andDecrement = ih2.e.getAndDecrement(this);
                    if (andDecrement <= this.a) {
                        if (andDecrement > 0) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                            ok1 ok1Var = nk1Var.i;
                            atomicReferenceFieldUpdater.set(ok1Var, null);
                            rq rqVar = nk1Var.h;
                            rqVar.D(j23Var, rqVar.j, new kw0((Object) new z61(ok1Var, nk1Var, (byte) 6), (byte) 2));
                            break;
                        }
                        if (a(nk1Var)) {
                            break;
                        }
                    }
                }
                Object objT = rqVarK.t();
                y20 y20Var = y20.h;
                if (objT != y20Var) {
                    objT = j23Var;
                }
                if (objT == y20Var) {
                    return objT;
                }
            } catch (Throwable th) {
                rqVarK.C();
                throw th;
            }
        }
        return j23Var;
    }

    public final boolean e() {
        ok1 ok1Var;
        while (true) {
            Unsafe unsafe = hi.a;
            long j2 = ih2.f;
            int intVolatile = unsafe.getIntVolatile(this, j2);
            if (intVolatile > this.a) {
                while (true) {
                    Unsafe unsafe2 = hi.a;
                    long j3 = ih2.f;
                    int intVolatile2 = unsafe2.getIntVolatile(this, j3);
                    byte b = this.a;
                    if (intVolatile2 <= b) {
                        ok1Var = this;
                        break;
                    }
                    ok1 ok1Var2 = this;
                    ok1Var = ok1Var2;
                    if (unsafe2.compareAndSwapInt(ok1Var2, j3, intVolatile2, b)) {
                        break;
                    }
                    this = ok1Var;
                }
            } else {
                ok1Var = this;
                if (intVolatile <= 0) {
                    return false;
                }
                if (unsafe.compareAndSwapInt(ok1Var, j2, intVolatile, intVolatile - 1)) {
                    unsafe.putObjectVolatile(ok1Var, j, (Object) null);
                    return true;
                }
            }
            this = ok1Var;
        }
    }

    public final void f(Object obj) {
        while (this.c()) {
            Unsafe unsafe = hi.a;
            long j2 = j;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            qf0 qf0Var = t03.y;
            if (objectVolatile != qf0Var) {
                if (objectVolatile != obj && obj != null) {
                    li1.j("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                while (true) {
                    ok1 ok1Var = this;
                    if (hi.a.compareAndSwapObject(ok1Var, j, objectVolatile, qf0Var)) {
                        ok1Var.b();
                        return;
                    } else {
                        if (hi.a.getObjectVolatile(ok1Var, j2) != objectVolatile) {
                            this = ok1Var;
                            break;
                        }
                        this = ok1Var;
                    }
                }
            }
        }
        li1.g("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + s60.o(this) + "[isLocked=" + c() + ",owner=" + hi.a.getObjectVolatile(this, j) + ']';
    }
}
