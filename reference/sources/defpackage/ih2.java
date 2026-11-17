package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class ih2 {
    public static final /* synthetic */ AtomicLongFieldUpdater c;
    public static final /* synthetic */ AtomicLongFieldUpdater d;
    public static final /* synthetic */ AtomicIntegerFieldUpdater e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final byte a;
    public final kw0 b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = hi.a;
        g = unsafe.objectFieldOffset(ih2.class.getDeclaredField("head$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(ih2.class, "deqIdx$volatile");
        h = unsafe.objectFieldOffset(ih2.class.getDeclaredField("tail$volatile"));
        d = AtomicLongFieldUpdater.newUpdater(ih2.class, "enqIdx$volatile");
        e = AtomicIntegerFieldUpdater.newUpdater(ih2.class, "_availablePermits$volatile");
        f = unsafe.objectFieldOffset(ih2.class.getDeclaredField("_availablePermits$volatile"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ih2(int i) {
        this.a = i;
        if (i <= 0) {
            li1.e(jp1.h(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i < 0) {
            li1.e(jp1.h(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        kh2 kh2Var = new kh2(0L, null, 2);
        this.head$volatile = kh2Var;
        this.tail$volatile = kh2Var;
        this._availablePermits$volatile = i;
        this.b = new kw0((Object) this, (byte) 7);
    }

    public final boolean a(x53 x53Var) {
        Object objE0;
        Unsafe unsafe;
        ih2 ih2Var = this;
        Unsafe unsafe2 = hi.a;
        long j = h;
        kh2 kh2Var = (kh2) unsafe2.getObjectVolatile(ih2Var, j);
        long andIncrement = d.getAndIncrement(ih2Var);
        gh2 gh2Var = gh2.o;
        long j2 = andIncrement / ((long) jh2.f);
        loop0: while (true) {
            objE0 = h7.e0(kh2Var, j2, gh2Var);
            if (cy1.J(objE0)) {
                break;
            }
            qf2 qf2VarY = cy1.y(objE0);
            while (true) {
                qf2 qf2Var = (qf2) hi.a.getObjectVolatile(ih2Var, j);
                if (qf2Var.d >= qf2VarY.d) {
                    ih2Var = this;
                    break loop0;
                }
                if (!qf2VarY.i()) {
                    break;
                }
                do {
                    unsafe = hi.a;
                    ih2Var = this;
                    if (unsafe.compareAndSwapObject(ih2Var, h, qf2Var, qf2VarY)) {
                        if (!qf2Var.e()) {
                            break loop0;
                        }
                        qf2Var.d();
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(ih2Var, j) == qf2Var);
                if (qf2VarY.e()) {
                    qf2VarY.d();
                }
            }
            ih2Var = this;
        }
        kh2 kh2Var2 = (kh2) cy1.y(objE0);
        AtomicReferenceArray atomicReferenceArray = kh2Var2.g;
        int i = (int) (andIncrement % ((long) jh2.f));
        while (!atomicReferenceArray.compareAndSet(i, null, x53Var)) {
            if (atomicReferenceArray.get(i) != null) {
                qf0 qf0Var = jh2.b;
                qf0 qf0Var2 = jh2.c;
                while (!atomicReferenceArray.compareAndSet(i, qf0Var, qf0Var2)) {
                    if (atomicReferenceArray.get(i) != qf0Var) {
                        return false;
                    }
                }
                ((qq) x53Var).j(j23.a, ih2Var.b);
                return true;
            }
        }
        x53Var.a(kh2Var2, i);
        return true;
    }

    public final void b() {
        Unsafe unsafe;
        long j;
        int intVolatile;
        byte b;
        Object objE0;
        boolean z;
        Unsafe unsafe2;
        do {
            int andIncrement = e.getAndIncrement(this);
            byte b2 = this.a;
            if (andIncrement >= b2) {
                do {
                    unsafe = hi.a;
                    j = f;
                    intVolatile = unsafe.getIntVolatile(this, j);
                    b = this.a;
                    if (intVolatile <= b) {
                        break;
                    }
                } while (!unsafe.compareAndSwapInt(this, j, intVolatile, b));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + ((int) b2)).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            Unsafe unsafe3 = hi.a;
            long j2 = g;
            kh2 kh2Var = (kh2) unsafe3.getObjectVolatile(this, j2);
            long andIncrement2 = c.getAndIncrement(this);
            long j3 = andIncrement2 / ((long) jh2.f);
            hh2 hh2Var = hh2.o;
            while (true) {
                objE0 = h7.e0(kh2Var, j3, hh2Var);
                if (cy1.J(objE0)) {
                    break;
                }
                qf2 qf2VarY = cy1.y(objE0);
                while (true) {
                    qf2 qf2Var = (qf2) hi.a.getObjectVolatile(this, j2);
                    if (qf2Var.d >= qf2VarY.d) {
                        break;
                    }
                    if (qf2VarY.i()) {
                        do {
                            unsafe2 = hi.a;
                            if (unsafe2.compareAndSwapObject(this, g, qf2Var, qf2VarY)) {
                                if (!qf2Var.e()) {
                                    break;
                                }
                                qf2Var.d();
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(this, j2) == qf2Var);
                        if (qf2VarY.e()) {
                            qf2VarY.d();
                        }
                    }
                }
            }
            kh2 kh2Var2 = (kh2) cy1.y(objE0);
            AtomicReferenceArray atomicReferenceArray = kh2Var2.g;
            kh2Var2.a();
            z = false;
            if (kh2Var2.d <= j3) {
                int i = (int) (andIncrement2 % ((long) jh2.f));
                Object andSet = atomicReferenceArray.getAndSet(i, jh2.b);
                if (andSet == null) {
                    int i2 = jh2.a;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            qf0 qf0Var = jh2.b;
                            qf0 qf0Var2 = jh2.d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i, qf0Var, qf0Var2)) {
                                    z = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i) == qf0Var);
                            z = !z;
                            break;
                        }
                        if (atomicReferenceArray.get(i) == jh2.c) {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                } else if (andSet != jh2.e) {
                    if (!(andSet instanceof qq)) {
                        wg.h(andSet, "unexpected: ");
                        return;
                    }
                    qq qqVar = (qq) andSet;
                    qf0 qf0VarK = qqVar.k(j23.a, this.b);
                    if (qf0VarK != null) {
                        qqVar.B(qf0VarK);
                        z = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z);
    }
}
