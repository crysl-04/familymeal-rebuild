package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class fp implements ds {
    public static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(fp.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater j;
    public static final /* synthetic */ AtomicLongFieldUpdater k;
    public static final /* synthetic */ AtomicLongFieldUpdater l;
    public static final /* synthetic */ AtomicReferenceFieldUpdater m;
    public static final /* synthetic */ long n;
    public static final /* synthetic */ long o;
    public static final /* synthetic */ long p;
    public static final /* synthetic */ long q;
    public static final /* synthetic */ long r;
    public static final /* synthetic */ long s;
    public static final /* synthetic */ long t;
    public static final /* synthetic */ long u;
    public static final /* synthetic */ long v;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final int h;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = hi.a;
        v = unsafe.objectFieldOffset(fp.class.getDeclaredField("sendersAndCloseStatus$volatile"));
        j = AtomicLongFieldUpdater.newUpdater(fp.class, "receivers$volatile");
        t = unsafe.objectFieldOffset(fp.class.getDeclaredField("receivers$volatile"));
        k = AtomicLongFieldUpdater.newUpdater(fp.class, "bufferEnd$volatile");
        o = unsafe.objectFieldOffset(fp.class.getDeclaredField("bufferEnd$volatile"));
        l = AtomicLongFieldUpdater.newUpdater(fp.class, "completedExpandBuffersAndPauseFlag$volatile");
        r = unsafe.objectFieldOffset(fp.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
        u = unsafe.objectFieldOffset(fp.class.getDeclaredField("sendSegment$volatile"));
        m = AtomicReferenceFieldUpdater.newUpdater(fp.class, Object.class, "receiveSegment$volatile");
        s = unsafe.objectFieldOffset(fp.class.getDeclaredField("receiveSegment$volatile"));
        p = unsafe.objectFieldOffset(fp.class.getDeclaredField("bufferEndSegment$volatile"));
        n = unsafe.objectFieldOffset(fp.class.getDeclaredField("_closeCause$volatile"));
        q = unsafe.objectFieldOffset(fp.class.getDeclaredField("closeHandler$volatile"));
    }

    public fp(int i2) {
        this.h = i2;
        if (i2 < 0) {
            li1.e(jp1.i(i2, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        os osVar = hp.a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = j();
        os osVar2 = new os(0L, null, this, 3);
        this.sendSegment$volatile = osVar2;
        this.receiveSegment$volatile = osVar2;
        if (y()) {
            osVar2 = hp.a;
            osVar2.getClass();
        }
        this.bufferEndSegment$volatile = osVar2;
        this._closeCause$volatile = hp.s;
    }

    public static boolean E(Object obj) {
        if (!(obj instanceof qq)) {
            wg.h(obj, "Unexpected waiter: ");
            return false;
        }
        qq qqVar = (qq) obj;
        os osVar = hp.a;
        qf0 qf0VarK = qqVar.k(j23.a, null);
        if (qf0VarK == null) {
            return false;
        }
        qqVar.B(qf0VarK);
        return true;
    }

    public final Object A(m10 m10Var, Object obj) {
        rq rqVar = new rq(1, ls.F(m10Var));
        rqVar.u();
        rqVar.g(new d92(n()));
        Object objT = rqVar.t();
        return objT == y20.h ? objT : j23.a;
    }

    public final void B(Object obj, rq rqVar) {
        rqVar.g(new d92(n()));
    }

    public final void C(x53 x53Var, boolean z) {
        if (x53Var instanceof qq) {
            ((m10) x53Var).g(new d92(z ? l() : n()));
            return;
        }
        if (!(x53Var instanceof ep)) {
            wg.h(x53Var, "Unexpected waiter: ");
            return;
        }
        ep epVar = (ep) x53Var;
        rq rqVar = epVar.i;
        rqVar.getClass();
        epVar.i = null;
        epVar.h = hp.l;
        Throwable thK = epVar.j.k();
        if (thK == null) {
            rqVar.g(Boolean.FALSE);
        } else {
            rqVar.g(new d92(thK));
        }
    }

    public final boolean D(Object obj, Object obj2) {
        if (!(obj instanceof ep)) {
            if (!(obj instanceof qq)) {
                wg.h(obj, "Unexpected receiver type: ");
                return false;
            }
            qq qqVar = (qq) obj;
            os osVar = hp.a;
            qf0 qf0VarK = qqVar.k(obj2, null);
            if (qf0VarK == null) {
                return false;
            }
            qqVar.B(qf0VarK);
            return true;
        }
        ep epVar = (ep) obj;
        rq rqVar = epVar.i;
        rqVar.getClass();
        epVar.i = null;
        epVar.h = obj2;
        Boolean bool = Boolean.TRUE;
        epVar.j.getClass();
        os osVar2 = hp.a;
        qf0 qf0VarK2 = rqVar.k(bool, null);
        if (qf0VarK2 == null) {
            return false;
        }
        rqVar.B(qf0VarK2);
        return true;
    }

    public final Object F(os osVar, int i2, long j2, Object obj) {
        AtomicReferenceArray atomicReferenceArray = osVar.h;
        Object objK = osVar.k(i2);
        long j3 = v;
        if (objK == null) {
            if (j2 >= (hi.a.getLongVolatile(this, j3) & 1152921504606846975L)) {
                if (obj == null) {
                    return hp.n;
                }
                if (osVar.j(i2, objK, obj)) {
                    g();
                    return hp.m;
                }
            }
        } else if (objK == hp.d && osVar.j(i2, objK, hp.i)) {
            g();
            Object obj2 = atomicReferenceArray.get(i2 << 1);
            osVar.m(i2, null);
            return obj2;
        }
        while (true) {
            Object objK2 = osVar.k(i2);
            if (objK2 == null || objK2 == hp.e) {
                if (j2 < (hi.a.getLongVolatile(this, j3) & 1152921504606846975L)) {
                    if (osVar.j(i2, objK2, hp.h)) {
                        g();
                        return hp.o;
                    }
                } else {
                    if (obj == null) {
                        return hp.n;
                    }
                    if (osVar.j(i2, objK2, obj)) {
                        g();
                        return hp.m;
                    }
                }
            } else if (objK2 != hp.d) {
                qf0 qf0Var = hp.j;
                if (objK2 == qf0Var) {
                    return hp.o;
                }
                if (objK2 == hp.h) {
                    return hp.o;
                }
                if (objK2 == hp.l) {
                    g();
                    return hp.o;
                }
                if (objK2 != hp.g && osVar.j(i2, objK2, hp.f)) {
                    boolean z = objK2 instanceof y53;
                    if (z) {
                        objK2 = ((y53) objK2).a;
                    }
                    if (E(objK2)) {
                        osVar.n(i2, hp.i);
                        g();
                        Object obj3 = atomicReferenceArray.get(i2 << 1);
                        osVar.m(i2, null);
                        return obj3;
                    }
                    osVar.n(i2, qf0Var);
                    osVar.h();
                    if (z) {
                        g();
                    }
                    return hp.o;
                }
            } else if (osVar.j(i2, objK2, hp.i)) {
                g();
                Object obj4 = atomicReferenceArray.get(i2 << 1);
                osVar.m(i2, null);
                return obj4;
            }
        }
    }

    public final int G(os osVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        osVar.m(i2, obj);
        if (z) {
            return H(osVar, i2, obj, j2, obj2, z);
        }
        Object objK = osVar.k(i2);
        if (objK == null) {
            if (b(j2)) {
                if (osVar.j(i2, null, hp.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (osVar.j(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (objK instanceof x53) {
            osVar.m(i2, null);
            if (D(objK, obj)) {
                osVar.n(i2, hp.i);
                return 0;
            }
            qf0 qf0Var = hp.k;
            if (osVar.h.getAndSet((i2 << 1) + 1, qf0Var) == qf0Var) {
                return 5;
            }
            osVar.l(i2, true);
            return 5;
        }
        return H(osVar, i2, obj, j2, obj2, z);
    }

    public final int H(os osVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object objK = osVar.k(i2);
            if (objK == null) {
                if (!b(j2) || z) {
                    if (z) {
                        if (osVar.j(i2, null, hp.j)) {
                            osVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (osVar.j(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (osVar.j(i2, null, hp.d)) {
                    break;
                }
            } else {
                if (objK != hp.e) {
                    qf0 qf0Var = hp.k;
                    if (objK == qf0Var) {
                        osVar.m(i2, null);
                        return 5;
                    }
                    if (objK == hp.h) {
                        osVar.m(i2, null);
                        return 5;
                    }
                    if (objK == hp.l) {
                        osVar.m(i2, null);
                        w();
                        return 4;
                    }
                    osVar.m(i2, null);
                    if (objK instanceof y53) {
                        objK = ((y53) objK).a;
                    }
                    if (D(objK, obj)) {
                        osVar.n(i2, hp.i);
                        return 0;
                    }
                    if (osVar.h.getAndSet((i2 << 1) + 1, qf0Var) != qf0Var) {
                        osVar.l(i2, true);
                    }
                    return 5;
                }
                if (osVar.j(i2, objK, hp.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void I(long j2) {
        fp fpVar = this;
        if (fpVar.y()) {
            return;
        }
        while (fpVar.j() <= j2) {
            fpVar = this;
        }
        int i2 = hp.c;
        int i3 = 0;
        while (true) {
            long j3 = r;
            if (i3 < i2) {
                long j4 = fpVar.j();
                if (j4 == (hi.a.getLongVolatile(fpVar, j3) & 4611686018427387903L) && j4 == fpVar.j()) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    Unsafe unsafe = hi.a;
                    long longVolatile = unsafe.getLongVolatile(fpVar, j3);
                    if (unsafe.compareAndSwapLong(fpVar, r, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                        break;
                    } else {
                        fpVar = this;
                    }
                }
                while (true) {
                    long j5 = fpVar.j();
                    Unsafe unsafe2 = hi.a;
                    long longVolatile2 = unsafe2.getLongVolatile(fpVar, j3);
                    long j6 = longVolatile2 & 4611686018427387903L;
                    boolean z = (longVolatile2 & 4611686018427387904L) != 0;
                    if (j5 == j6 && j5 == fpVar.j()) {
                        break;
                    }
                    if (z) {
                        fpVar = this;
                    } else {
                        fpVar = this;
                        unsafe2.compareAndSwapLong(fpVar, r, longVolatile2, j6 + 4611686018427387904L);
                    }
                }
                while (true) {
                    Unsafe unsafe3 = hi.a;
                    long longVolatile3 = unsafe3.getLongVolatile(fpVar, j3);
                    if (unsafe3.compareAndSwapLong(fpVar, r, longVolatile3, longVolatile3 & 4611686018427387903L)) {
                        return;
                    } else {
                        fpVar = this;
                    }
                }
            }
        }
    }

    @Override // defpackage.ds
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        d(cancellationException, true);
    }

    public final boolean b(long j2) {
        return j2 < j() || j2 < m() + ((long) this.h);
    }

    /* JADX WARN: Code duplicated, block: B:82:0x014f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0152 A[RETURN] */
    @Override // defpackage.lh2
    public Object c(m10 m10Var, Object obj) {
        j23 j23Var;
        y20 y20Var;
        Object objT;
        y20 y20Var2;
        int i2;
        fp fpVar = this;
        Unsafe unsafe = hi.a;
        long j2 = u;
        os osVar = (os) unsafe.getObjectVolatile(fpVar, j2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = i;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(fpVar);
            long j3 = andIncrement & 1152921504606846975L;
            boolean zT = fpVar.t(andIncrement, false);
            int i3 = hp.b;
            long j4 = i3;
            long j5 = j3 / j4;
            int i4 = (int) (j3 % j4);
            long j6 = osVar.d;
            y20 y20Var3 = y20.h;
            j23Var = j23.a;
            if (j6 != j5) {
                os osVarI = fpVar.i(j5, osVar);
                if (osVarI != null) {
                    osVar = osVarI;
                } else if (zT) {
                    Object objA = A(m10Var, obj);
                    if (objA == y20Var3) {
                        return objA;
                    }
                }
            }
            int iG = fpVar.G(osVar, i4, obj, j3, null, zT);
            if (iG == 0) {
                osVar.a();
                return j23Var;
            }
            if (iG != 1) {
                if (iG == 2) {
                    if (!zT) {
                        break;
                    }
                    osVar.h();
                    Object objA2 = A(m10Var, obj);
                    if (objA2 == y20Var3) {
                        return objA2;
                    }
                } else if (iG == 3) {
                    rq rqVarK = uz0.k(ls.F(m10Var));
                    try {
                        int iG2 = G(osVar, i4, obj, j3, rqVarK, false);
                        if (iG2 != 0) {
                            if (iG2 == 1) {
                                y20Var = y20Var3;
                                rqVarK.g(j23Var);
                            } else if (iG2 != 2) {
                                if (iG2 != 4) {
                                    String str = "unexpected";
                                    if (iG2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    osVar.a();
                                    os osVar2 = (os) hi.a.getObjectVolatile(this, j2);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                        long j7 = andIncrement2 & 1152921504606846975L;
                                        boolean zT2 = t(andIncrement2, false);
                                        int i5 = hp.b;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                                        long j8 = i5;
                                        y20Var = y20Var3;
                                        long j9 = j7 / j8;
                                        int i6 = (int) (j7 % j8);
                                        if (osVar2.d != j9) {
                                            os osVarI2 = i(j9, osVar2);
                                            if (osVarI2 != null) {
                                                i2 = i6;
                                                osVar2 = osVarI2;
                                            } else if (!zT2) {
                                                atomicLongFieldUpdater = atomicLongFieldUpdater2;
                                                y20Var3 = y20Var;
                                            }
                                        } else {
                                            i2 = i6;
                                        }
                                        int iG3 = G(osVar2, i2, obj, j7, rqVarK, zT2);
                                        if (iG3 == 0) {
                                            osVar2.a();
                                        } else if (iG3 != 1) {
                                            if (iG3 == 2) {
                                                if (!zT2) {
                                                    rqVarK.a(osVar2, i2 + i5);
                                                    break;
                                                }
                                                osVar2.h();
                                            } else {
                                                if (iG3 == 3) {
                                                    throw new IllegalStateException(str);
                                                }
                                                if (iG3 != 4) {
                                                    if (iG3 == 5) {
                                                        osVar2.a();
                                                    }
                                                    str = str;
                                                    atomicLongFieldUpdater = atomicLongFieldUpdater2;
                                                    y20Var3 = y20Var;
                                                } else if (j7 < m()) {
                                                    osVar2.a();
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    y20Var = y20Var3;
                                    if (j3 < m()) {
                                        osVar.a();
                                    }
                                }
                                B(obj, rqVarK);
                                break;
                            } else {
                                y20Var = y20Var3;
                                rqVarK.a(osVar, i4 + i3);
                            }
                            objT = rqVarK.t();
                            y20Var2 = y20Var;
                            if (objT != y20Var2) {
                                objT = j23Var;
                            }
                            if (objT == y20Var2) {
                                return objT;
                            }
                        } else {
                            y20Var = y20Var3;
                            osVar.a();
                        }
                        rqVarK.g(j23Var);
                        objT = rqVarK.t();
                        y20Var2 = y20Var;
                        if (objT != y20Var2) {
                            objT = j23Var;
                        }
                        if (objT == y20Var2) {
                            return objT;
                        }
                    } catch (Throwable th) {
                        rqVarK.C();
                        throw th;
                    }
                } else if (iG != 4) {
                    if (iG == 5) {
                        osVar.a();
                    }
                    fpVar = this;
                } else {
                    if (j3 < m()) {
                        osVar.a();
                    }
                    Object objA3 = A(m10Var, obj);
                    if (objA3 == y20Var3) {
                        return objA3;
                    }
                }
            } else {
                break;
            }
        }
        return j23Var;
    }

    public final boolean d(Throwable th, boolean z) {
        boolean z2;
        Unsafe unsafe;
        long j2;
        long longVolatile;
        long j3;
        Object objectVolatile;
        Unsafe unsafe2;
        Unsafe unsafe3;
        long j4;
        long longVolatile2;
        Unsafe unsafe4;
        long j5;
        long longVolatile3;
        if (z) {
            do {
                unsafe4 = hi.a;
                j5 = v;
                longVolatile3 = unsafe4.getLongVolatile(this, j5);
                if (((int) (longVolatile3 >> 60)) != 0) {
                    break;
                }
                os osVar = hp.a;
            } while (!unsafe4.compareAndSwapLong(this, j5, longVolatile3, (longVolatile3 & 1152921504606846975L) + 1152921504606846976L));
        }
        qf0 qf0Var = hp.s;
        while (true) {
            Unsafe unsafe5 = hi.a;
            long j6 = n;
            if (unsafe5.compareAndSwapObject(this, j6, qf0Var, th)) {
                z2 = true;
                break;
            }
            if (unsafe5.getObjectVolatile(this, j6) != qf0Var) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                unsafe3 = hi.a;
                j4 = v;
                longVolatile2 = unsafe3.getLongVolatile(this, j4);
            } while (!unsafe3.compareAndSwapLong(this, j4, longVolatile2, (longVolatile2 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            do {
                unsafe = hi.a;
                j2 = v;
                longVolatile = unsafe.getLongVolatile(this, j2);
                int i2 = (int) (longVolatile >> 60);
                if (i2 == 0) {
                    j3 = (longVolatile & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = (longVolatile & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!unsafe.compareAndSwapLong(this, j2, longVolatile, j3));
        }
        w();
        if (z2) {
            loop3: while (true) {
                Unsafe unsafe6 = hi.a;
                long j7 = q;
                objectVolatile = unsafe6.getObjectVolatile(this, j7);
                qf0 qf0Var2 = objectVolatile == null ? hp.q : hp.r;
                do {
                    unsafe2 = hi.a;
                    if (unsafe2.compareAndSwapObject(this, q, objectVolatile, qf0Var2)) {
                        break loop3;
                    }
                } while (unsafe2.getObjectVolatile(this, j7) == objectVolatile);
            }
            if (objectVolatile != null) {
                t03.k(1, objectVolatile);
                ((vp0) objectVolatile).h(k());
                return z2;
            }
        }
        return z2;
    }

    public final os e(long j2) {
        zz zzVar;
        long j3;
        Unsafe unsafe;
        long j4;
        Unsafe unsafe2 = hi.a;
        Object objectVolatile = unsafe2.getObjectVolatile(this, p);
        os osVar = (os) unsafe2.getObjectVolatile(this, u);
        if (osVar.d > ((os) objectVolatile).d) {
            objectVolatile = osVar;
        }
        os osVar2 = (os) unsafe2.getObjectVolatile(this, s);
        if (osVar2.d > ((os) objectVolatile).d) {
            objectVolatile = osVar2;
        }
        zz zzVar2 = (zz) objectVolatile;
        loop0: while (true) {
            zzVar = zzVar2;
            while (true) {
                int i2 = zz.c;
                zzVar.getClass();
                Object objectVolatile2 = hi.a.getObjectVolatile(zzVar, zz.a);
                qf0 qf0Var = h7.D;
                if (objectVolatile2 == qf0Var) {
                    break loop0;
                }
                zzVar2 = (zz) objectVolatile2;
                if (zzVar2 == null) {
                    do {
                        unsafe = hi.a;
                        j4 = zz.a;
                        if (unsafe.compareAndSwapObject(zzVar, j4, (Object) null, qf0Var)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(zzVar, j4) == null);
                }
            }
        }
        os osVar3 = (os) zzVar;
        if (x()) {
            os osVar4 = osVar3;
            loop3: while (true) {
                int i3 = hp.b - 1;
                while (true) {
                    if (-1 < i3) {
                        j3 = (osVar4.d * ((long) hp.b)) + ((long) i3);
                        if (j3 >= m()) {
                            while (true) {
                                Object objK = osVar4.k(i3);
                                if (objK != null && objK != hp.e) {
                                    if (objK != hp.d) {
                                        break;
                                    }
                                    break loop3;
                                }
                                if (osVar4.j(i3, objK, hp.l)) {
                                    osVar4.h();
                                    break;
                                }
                            }
                            i3--;
                        }
                    } else {
                        osVar4 = (os) ((zz) hi.a.getObjectVolatile(osVar4, zz.b));
                        if (osVar4 == null) {
                        }
                    }
                    j3 = -1;
                    break;
                }
            }
            if (j3 != -1) {
                f(j3);
            }
        }
        Object objR = null;
        loop6: for (os osVar5 = osVar3; osVar5 != null; osVar5 = (os) ((zz) hi.a.getObjectVolatile(osVar5, zz.b))) {
            for (int i4 = hp.b - 1; -1 < i4; i4--) {
                if ((osVar5.d * ((long) hp.b)) + ((long) i4) < j2) {
                    break loop6;
                }
                while (true) {
                    Object objK2 = osVar5.k(i4);
                    if (objK2 != null && objK2 != hp.e) {
                        if (!(objK2 instanceof y53)) {
                            if (!(objK2 instanceof x53)) {
                                break;
                            }
                            if (osVar5.j(i4, objK2, hp.l)) {
                                objR = vs.R(objR, objK2);
                                osVar5.l(i4, true);
                                break;
                            }
                        } else {
                            if (osVar5.j(i4, objK2, hp.l)) {
                                objR = vs.R(objR, ((y53) objK2).a);
                                osVar5.l(i4, true);
                                break;
                            }
                        }
                    } else {
                        if (osVar5.j(i4, objK2, hp.l)) {
                            osVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (objR != null) {
            if (!(objR instanceof ArrayList)) {
                C((x53) objR, true);
                return osVar3;
            }
            ArrayList arrayList = (ArrayList) objR;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                C((x53) arrayList.get(size), true);
            }
        }
        return osVar3;
    }

    public final void f(long j2) {
        os osVar = (os) hi.a.getObjectVolatile(this, s);
        while (true) {
            Unsafe unsafe = hi.a;
            long j3 = t;
            long longVolatile = unsafe.getLongVolatile(this, j3);
            if (j2 < Math.max(((long) this.h) + longVolatile, this.j())) {
                return;
            }
            this = this;
            if (unsafe.compareAndSwapLong(this, j3, longVolatile, 1 + longVolatile)) {
                long j4 = hp.b;
                long j5 = longVolatile / j4;
                int i2 = (int) (longVolatile % j4);
                if (osVar.d != j5) {
                    os osVarH = this.h(j5, osVar);
                    if (osVarH != null) {
                        osVar = osVarH;
                    }
                }
                os osVar2 = osVar;
                if (this.F(osVar2, i2, longVolatile, null) != hp.o || longVolatile < this.o()) {
                    osVar2.a();
                }
                osVar = osVar2;
            }
        }
    }

    public final void g() {
        Object objE0;
        Unsafe unsafe;
        if (y()) {
            return;
        }
        Unsafe unsafe2 = hi.a;
        long j2 = p;
        os osVar = (os) unsafe2.getObjectVolatile(this, j2);
        while (true) {
            long andIncrement = k.getAndIncrement(this);
            long j3 = andIncrement / ((long) hp.b);
            if (o() <= andIncrement) {
                if (osVar.d < j3 && osVar.b() != null) {
                    z(j3, osVar);
                }
                p(1L);
                return;
            }
            if (osVar.d != j3) {
                gp gpVar = gp.o;
                while (true) {
                    objE0 = h7.e0(osVar, j3, gpVar);
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
                                unsafe = hi.a;
                                if (unsafe.compareAndSwapObject(this, p, qf2Var, qf2VarY)) {
                                    if (!qf2Var.e()) {
                                        break;
                                    }
                                    qf2Var.d();
                                    break;
                                }
                            } while (unsafe.getObjectVolatile(this, j2) == qf2Var);
                            if (qf2VarY.e()) {
                                qf2VarY.d();
                            }
                        }
                    }
                }
                os osVar2 = null;
                if (cy1.J(objE0)) {
                    w();
                    z(j3, osVar);
                    p(1L);
                } else {
                    os osVar3 = (os) cy1.y(objE0);
                    long j4 = osVar3.d;
                    if (j4 > j3) {
                        long j5 = ((long) hp.b) * j4;
                        if (hi.a.compareAndSwapLong(this, o, 1 + andIncrement, j5)) {
                            p(j5 - andIncrement);
                        } else {
                            p(1L);
                        }
                    } else {
                        osVar2 = osVar3;
                    }
                }
                if (osVar2 != null) {
                    osVar = osVar2;
                } else {
                    continue;
                }
            }
            int i2 = (int) (andIncrement % ((long) hp.b));
            Object objK = osVar.k(i2);
            boolean z = objK instanceof x53;
            long j6 = t;
            if (!z || andIncrement < hi.a.getLongVolatile(this, j6) || !osVar.j(i2, objK, hp.g)) {
                while (true) {
                    Object objK2 = osVar.k(i2);
                    if (objK2 instanceof x53) {
                        if (andIncrement < hi.a.getLongVolatile(this, j6)) {
                            if (osVar.j(i2, objK2, new y53((x53) objK2))) {
                                p(1L);
                                return;
                            }
                        } else if (osVar.j(i2, objK2, hp.g)) {
                            if (!E(objK2)) {
                                osVar.n(i2, hp.j);
                                osVar.h();
                                break;
                            } else {
                                osVar.n(i2, hp.d);
                                p(1L);
                                return;
                            }
                        }
                    } else {
                        if (objK2 == hp.j) {
                            break;
                        }
                        if (objK2 == null) {
                            if (osVar.j(i2, objK2, hp.e)) {
                                p(1L);
                                return;
                            }
                        } else if (objK2 == hp.d || objK2 == hp.h || objK2 == hp.i || objK2 == hp.k || objK2 == hp.l) {
                            p(1L);
                            return;
                        } else if (objK2 != hp.f) {
                            wg.h(objK2, "Unexpected cell state: ");
                            return;
                        }
                    }
                }
                p(1L);
            } else if (E(objK)) {
                osVar.n(i2, hp.d);
                p(1L);
                return;
            } else {
                osVar.n(i2, hp.j);
                osVar.h();
                p(1L);
            }
        }
    }

    public final os h(long j2, os osVar) {
        Object objE0;
        os osVar2;
        Unsafe unsafe;
        long j3;
        long longVolatile;
        Unsafe unsafe2;
        os osVar3 = hp.a;
        gp gpVar = gp.o;
        loop0: while (true) {
            objE0 = h7.e0(osVar, j2, gpVar);
            if (cy1.J(objE0)) {
                break;
            }
            qf2 qf2VarY = cy1.y(objE0);
            while (true) {
                Unsafe unsafe3 = hi.a;
                long j4 = s;
                qf2 qf2Var = (qf2) unsafe3.getObjectVolatile(this, j4);
                if (qf2Var.d >= qf2VarY.d) {
                    break loop0;
                }
                if (qf2VarY.i()) {
                    do {
                        unsafe2 = hi.a;
                        if (unsafe2.compareAndSwapObject(this, s, qf2Var, qf2VarY)) {
                            if (!qf2Var.e()) {
                                break loop0;
                            }
                            qf2Var.d();
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(this, j4) == qf2Var);
                    if (qf2VarY.e()) {
                        qf2VarY.d();
                    }
                }
            }
        }
        if (cy1.J(objE0)) {
            w();
            if (osVar.d * ((long) hp.b) < o()) {
                osVar.a();
                return null;
            }
        } else {
            os osVar4 = (os) cy1.y(objE0);
            long j5 = osVar4.d;
            if (y() || j2 > j() / ((long) hp.b)) {
                osVar2 = osVar4;
                break;
            }
            loop3: while (true) {
                Unsafe unsafe4 = hi.a;
                long j6 = p;
                qf2 qf2Var2 = (qf2) unsafe4.getObjectVolatile(this, j6);
                if (qf2Var2.d >= j5 || !osVar4.i()) {
                    osVar2 = osVar4;
                    break;
                }
                while (true) {
                    Unsafe unsafe5 = hi.a;
                    osVar2 = osVar4;
                    if (unsafe5.compareAndSwapObject(this, p, qf2Var2, osVar4)) {
                        if (!qf2Var2.e()) {
                            break loop3;
                        }
                        qf2Var2.d();
                        break loop3;
                    }
                    if (unsafe5.getObjectVolatile(this, j6) != qf2Var2) {
                        break;
                    }
                    osVar4 = osVar2;
                }
                if (osVar2.e()) {
                    osVar2.d();
                }
                osVar4 = osVar2;
            }
            if (j5 <= j2) {
                return osVar2;
            }
            long j7 = j5 * ((long) hp.b);
            do {
                unsafe = hi.a;
                j3 = t;
                longVolatile = unsafe.getLongVolatile(this, j3);
                if (longVolatile >= j7) {
                    break;
                }
            } while (!unsafe.compareAndSwapLong(this, j3, longVolatile, j7));
            if (j5 * ((long) hp.b) < o()) {
                osVar2.a();
            }
        }
        return null;
    }

    public final os i(long j2, os osVar) {
        Object objE0;
        os osVar2;
        long j3;
        Unsafe unsafe;
        fp fpVar = this;
        os osVar3 = hp.a;
        gp gpVar = gp.o;
        loop0: while (true) {
            objE0 = h7.e0(osVar, j2, gpVar);
            if (cy1.J(objE0)) {
                break;
            }
            qf2 qf2VarY = cy1.y(objE0);
            while (true) {
                Unsafe unsafe2 = hi.a;
                long j4 = u;
                qf2 qf2Var = (qf2) unsafe2.getObjectVolatile(fpVar, j4);
                if (qf2Var.d >= qf2VarY.d) {
                    break loop0;
                }
                if (qf2VarY.i()) {
                    do {
                        unsafe = hi.a;
                        if (unsafe.compareAndSwapObject(fpVar, u, qf2Var, qf2VarY)) {
                            if (!qf2Var.e()) {
                                break loop0;
                            }
                            qf2Var.d();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(fpVar, j4) == qf2Var);
                    if (qf2VarY.e()) {
                        qf2VarY.d();
                    }
                }
            }
        }
        os osVar4 = null;
        if (cy1.J(objE0)) {
            fpVar.w();
            if (osVar.d * ((long) hp.b) >= fpVar.m()) {
                return null;
            }
            osVar.a();
            return null;
        }
        os osVar5 = (os) cy1.y(objE0);
        long j5 = osVar5.d;
        if (j5 <= j2) {
            return osVar5;
        }
        long j6 = j5 * ((long) hp.b);
        while (true) {
            Unsafe unsafe3 = hi.a;
            long j7 = v;
            long longVolatile = unsafe3.getLongVolatile(fpVar, j7);
            long j8 = 1152921504606846975L & longVolatile;
            if (j8 >= j6) {
                osVar2 = osVar4;
                j3 = j5;
                break;
            }
            osVar2 = osVar4;
            j3 = j5;
            if (unsafe3.compareAndSwapLong(fpVar, j7, longVolatile, j8 + (((long) ((int) (longVolatile >> 60))) << 60))) {
                break;
            }
            fpVar = this;
            osVar4 = osVar2;
            j5 = j3;
        }
        if (j3 * ((long) hp.b) >= m()) {
            return osVar2;
        }
        osVar5.a();
        return osVar2;
    }

    @Override // defpackage.ds
    public final ep iterator() {
        return new ep(this);
    }

    public final long j() {
        return hi.a.getLongVolatile(this, o);
    }

    public final Throwable k() {
        return (Throwable) hi.a.getObjectVolatile(this, n);
    }

    public final Throwable l() {
        Throwable thK = k();
        return thK == null ? new yu("Channel was closed") : thK;
    }

    public final long m() {
        return hi.a.getLongVolatile(this, t);
    }

    public final Throwable n() {
        Throwable thK = k();
        return thK == null ? new zu("Channel was closed") : thK;
    }

    public final long o() {
        return hi.a.getLongVolatile(this, v) & 1152921504606846975L;
    }

    public final void p(long j2) {
        if ((l.addAndGet(this, j2) & 4611686018427387904L) != 0) {
            while ((hi.a.getLongVolatile(this, r) & 4611686018427387904L) != 0) {
            }
        }
    }

    @Override // defpackage.ds
    public final Object q() {
        os osVar;
        ns nsVar = t03.b;
        Unsafe unsafe = hi.a;
        long longVolatile = unsafe.getLongVolatile(this, t);
        long longVolatile2 = unsafe.getLongVolatile(this, v);
        if (t(longVolatile2, true)) {
            return new ms(k());
        }
        if (longVolatile >= (longVolatile2 & 1152921504606846975L)) {
            return nsVar;
        }
        of0 of0Var = hp.k;
        os osVar2 = (os) unsafe.getObjectVolatile(this, s);
        while (!this.u()) {
            long andIncrement = j.getAndIncrement(this);
            long j2 = hp.b;
            long j3 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (osVar2.d != j3) {
                os osVarH = this.h(j3, osVar2);
                if (osVarH != null) {
                    osVar = osVarH;
                } else {
                    continue;
                }
            } else {
                osVar = osVar2;
            }
            Object objF = this.F(osVar, i2, andIncrement, of0Var);
            osVar2 = osVar;
            if (objF == hp.m) {
                x53 x53Var = of0Var instanceof x53 ? (x53) of0Var : null;
                if (x53Var != null) {
                    x53Var.a(osVar2, i2);
                }
                this.I(andIncrement);
                osVar2.h();
                return nsVar;
            }
            if (objF != hp.o) {
                if (objF != hp.n) {
                    osVar2.a();
                    return objF;
                }
                li1.g("unexpected");
                return null;
            }
            if (andIncrement < this.o()) {
                osVar2.a();
            }
            this = this;
        }
        return new ms(this.k());
    }

    @Override // defpackage.lh2
    public Object s(Object obj) {
        fp fpVar = this;
        ns nsVar = t03.b;
        Unsafe unsafe = hi.a;
        long longVolatile = unsafe.getLongVolatile(fpVar, v);
        long j2 = 1152921504606846975L;
        if (fpVar.t(longVolatile, false) ? false : !fpVar.b(longVolatile & 1152921504606846975L)) {
            return nsVar;
        }
        Object obj2 = hp.j;
        os osVar = (os) unsafe.getObjectVolatile(fpVar, u);
        while (true) {
            long andIncrement = i.getAndIncrement(fpVar);
            long j3 = andIncrement & j2;
            boolean zT = fpVar.t(andIncrement, false);
            int i2 = hp.b;
            long j4 = i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (osVar.d != j5) {
                os osVarI = fpVar.i(j5, osVar);
                if (osVarI != null) {
                    osVar = osVarI;
                } else {
                    if (zT) {
                        return new ms(fpVar.n());
                    }
                    j2 = 1152921504606846975L;
                }
            }
            int iG = fpVar.G(osVar, i3, obj, j3, obj2, zT);
            j23 j23Var = j23.a;
            if (iG == 0) {
                osVar.a();
                return j23Var;
            }
            if (iG == 1) {
                return j23Var;
            }
            if (iG == 2) {
                if (zT) {
                    osVar.h();
                    return new ms(n());
                }
                x53 x53Var = obj2 instanceof x53 ? (x53) obj2 : null;
                if (x53Var != null) {
                    x53Var.a(osVar, i3 + i2);
                }
                osVar.h();
                return nsVar;
            }
            if (iG == 3) {
                li1.g("unexpected");
                return null;
            }
            if (iG == 4) {
                if (j3 < m()) {
                    osVar.a();
                }
                return new ms(n());
            }
            if (iG == 5) {
                osVar.a();
            }
            j2 = 1152921504606846975L;
            fpVar = this;
        }
    }

    public final boolean t(long j2, boolean z) {
        int i2 = (int) (j2 >> 60);
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                e(j2 & 1152921504606846975L);
                if (z) {
                    while (true) {
                        Unsafe unsafe = hi.a;
                        long j3 = s;
                        os osVarH = (os) unsafe.getObjectVolatile(this, j3);
                        long jM = m();
                        if (o() <= jM) {
                            break;
                        }
                        long j4 = hp.b;
                        long j5 = jM / j4;
                        if (osVarH.d != j5 && (osVarH = h(j5, osVarH)) == null) {
                            if (((os) unsafe.getObjectVolatile(this, j3)).d < j5) {
                                break;
                            }
                        } else {
                            osVarH.a();
                            int i3 = (int) (jM % j4);
                            while (true) {
                                Object objK = osVarH.k(i3);
                                if (objK != null && objK != hp.e) {
                                    if (objK != hp.d && (objK == hp.j || objK == hp.l || objK == hp.i || objK == hp.h || (objK != hp.g && (objK == hp.f || jM != m())))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (osVarH.j(i3, objK, hp.h)) {
                                    g();
                                    break;
                                }
                            }
                            hi.a.compareAndSwapLong(this, t, jM, jM + 1);
                        }
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException(jp1.h(i2, "unexpected close status: ").toString());
                }
                os osVarE = e(j2 & 1152921504606846975L);
                Object objR = null;
                loop0: do {
                    for (int i4 = hp.b - 1; -1 < i4; i4--) {
                        long j6 = (osVarE.d * ((long) hp.b)) + ((long) i4);
                        while (true) {
                            Object objK2 = osVarE.k(i4);
                            if (objK2 == hp.i) {
                                break loop0;
                            }
                            if (objK2 != hp.d) {
                                if (objK2 != hp.e && objK2 != null) {
                                    if (!(objK2 instanceof x53) && !(objK2 instanceof y53)) {
                                        qf0 qf0Var = hp.g;
                                        if (objK2 == qf0Var || objK2 == hp.f) {
                                            break loop0;
                                        }
                                        if (objK2 != qf0Var) {
                                            break;
                                        }
                                    } else {
                                        if (j6 < m()) {
                                            break loop0;
                                        }
                                        x53 x53Var = objK2 instanceof y53 ? ((y53) objK2).a : (x53) objK2;
                                        if (osVarE.j(i4, objK2, hp.l)) {
                                            objR = vs.R(objR, x53Var);
                                            osVarE.m(i4, null);
                                            osVarE.h();
                                            break;
                                        }
                                    }
                                } else {
                                    if (osVarE.j(i4, objK2, hp.l)) {
                                        osVarE.h();
                                        break;
                                    }
                                }
                            } else {
                                if (j6 < m()) {
                                    break loop0;
                                }
                                if (osVarE.j(i4, objK2, hp.l)) {
                                    osVarE.m(i4, null);
                                    osVarE.h();
                                    break;
                                }
                            }
                        }
                    }
                    osVarE = (os) ((zz) hi.a.getObjectVolatile(osVarE, zz.b));
                } while (osVarE != null);
                if (objR != null) {
                    if (objR instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objR;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            C((x53) arrayList.get(size), false);
                        }
                    } else {
                        C((x53) objR, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        String string;
        StringBuilder sb = new StringBuilder();
        Unsafe unsafe = hi.a;
        int longVolatile = (int) (unsafe.getLongVolatile(this, v) >> 60);
        if (longVolatile == 2) {
            sb.append("closed,");
        } else if (longVolatile == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.h + ',');
        sb.append("data=[");
        int i2 = 0;
        boolean z = true;
        List listQ = lt.Q(unsafe.getObjectVolatile(this, s), unsafe.getObjectVolatile(this, u), unsafe.getObjectVolatile(this, p));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQ) {
            if (((os) obj) != hp.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            wg.p();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((os) next).d;
            do {
                Object next2 = it.next();
                long j3 = ((os) next2).d;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        os osVar = (os) next;
        long jM = m();
        long jO = o();
        loop2: while (true) {
            int i3 = hp.b;
            int i4 = i2;
            while (i4 < i3) {
                str = null;
                long j4 = (osVar.d * ((long) hp.b)) + ((long) i4);
                if (j4 >= jO && j4 >= jM) {
                    break loop2;
                }
                Object objK = osVar.k(i4);
                boolean z2 = z;
                Object obj2 = osVar.h.get(i4 << 1);
                if (objK instanceof qq) {
                    string = (j4 >= jM || j4 < jO) ? (j4 >= jO || j4 < jM) ? "cont" : "send" : "receive";
                } else if (objK instanceof y53) {
                    string = "EB(" + objK + ')';
                } else if (uz0.g(objK, hp.f) || uz0.g(objK, hp.g)) {
                    string = "resuming_sender";
                } else {
                    if (objK != null && !objK.equals(hp.e) && !objK.equals(hp.i) && !objK.equals(hp.h) && !objK.equals(hp.k) && !objK.equals(hp.j) && !objK.equals(hp.l)) {
                        string = objK.toString();
                    }
                    i4++;
                    z = z2;
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i4++;
                z = z2;
            }
            boolean z3 = z;
            str = null;
            osVar = (os) osVar.b();
            if (osVar == null) {
                break;
            }
            z = z3;
            i2 = 0;
        }
        if (sb.length() == 0) {
            li1.m("Char sequence is empty.");
            return str;
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u() {
        return t(hi.a.getLongVolatile(this, v), true);
    }

    @Override // defpackage.ds
    public final Object v(m10 m10Var) throws Throwable {
        os osVar;
        Throwable th;
        os osVar2;
        Unsafe unsafe = hi.a;
        long j2 = s;
        os osVar3 = (os) unsafe.getObjectVolatile(this, j2);
        while (!this.u()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = j;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = hp.b;
            long j4 = andIncrement / j3;
            int i2 = (int) (andIncrement % j3);
            if (osVar3.d != j4) {
                os osVarH = this.h(j4, osVar3);
                if (osVarH != null) {
                    osVar = osVarH;
                } else {
                    continue;
                }
            } else {
                osVar = osVar3;
            }
            fp fpVar = this;
            Object objF = fpVar.F(osVar, i2, andIncrement, null);
            qf0 qf0Var = hp.m;
            if (objF == qf0Var) {
                li1.g("unexpected");
                return null;
            }
            qf0 qf0Var2 = hp.o;
            if (objF == qf0Var2) {
                if (andIncrement < fpVar.o()) {
                    osVar.a();
                }
                this = fpVar;
                osVar3 = osVar;
            } else {
                if (objF != hp.n) {
                    osVar.a();
                    return objF;
                }
                rq rqVarK = uz0.k(ls.F(m10Var));
                try {
                    Object objF2 = fpVar.F(osVar, i2, andIncrement, rqVarK);
                    if (objF2 != qf0Var) {
                        if (objF2 == qf0Var2) {
                            if (andIncrement < fpVar.o()) {
                                osVar.a();
                            }
                            os osVar4 = (os) hi.a.getObjectVolatile(fpVar, j2);
                            while (true) {
                                if (fpVar.u()) {
                                    rqVarK.g(new d92(fpVar.l()));
                                    break;
                                }
                                rq rqVar = rqVarK;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(fpVar);
                                    long j5 = hp.b;
                                    long j6 = andIncrement2 / j5;
                                    int i3 = (int) (andIncrement2 % j5);
                                    if (osVar4.d != j6) {
                                        try {
                                            os osVarH2 = fpVar.h(j6, osVar4);
                                            if (osVarH2 == null) {
                                                rqVarK = rqVar;
                                            } else {
                                                osVar2 = osVarH2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            rqVarK = rqVar;
                                            rqVarK.C();
                                            throw th;
                                        }
                                    } else {
                                        osVar2 = osVar4;
                                    }
                                    fp fpVar2 = fpVar;
                                    objF2 = fpVar2.F(osVar2, i3, andIncrement2, rqVar);
                                    fpVar = fpVar2;
                                    os osVar5 = osVar2;
                                    rqVarK = rqVar;
                                    if (objF2 == hp.m) {
                                        rqVarK.a(osVar5, i3);
                                        break;
                                    }
                                    if (objF2 == hp.o) {
                                        if (andIncrement2 < fpVar.o()) {
                                            osVar5.a();
                                        }
                                        osVar4 = osVar5;
                                    } else {
                                        if (objF2 == hp.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        osVar5.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    rqVarK = rqVar;
                                    th = th;
                                    rqVarK.C();
                                    throw th;
                                }
                            }
                        } else {
                            osVar.a();
                        }
                        rqVarK.j(objF2, null);
                        break;
                    }
                    rqVarK.a(osVar, i2);
                    return rqVarK.t();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thL = this.l();
        int i4 = bn2.a;
        throw thL;
    }

    public final boolean w() {
        return t(hi.a.getLongVolatile(this, v), false);
    }

    public boolean x() {
        return false;
    }

    public final boolean y() {
        long j2 = j();
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    public final void z(long j2, os osVar) {
        fp fpVar;
        os osVar2;
        os osVar3;
        while (osVar.d < j2 && (osVar3 = (os) osVar.b()) != null) {
            osVar = osVar3;
        }
        while (true) {
            os osVar4 = osVar;
            while (osVar4.c() && (osVar2 = (os) osVar4.b()) != null) {
                osVar4 = osVar2;
            }
            while (true) {
                Unsafe unsafe = hi.a;
                long j3 = p;
                qf2 qf2Var = (qf2) unsafe.getObjectVolatile(this, j3);
                if (qf2Var.d >= osVar4.d) {
                    return;
                }
                if (!osVar4.i()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = hi.a;
                    fpVar = this;
                    if (unsafe2.compareAndSwapObject(fpVar, p, qf2Var, osVar4)) {
                        if (qf2Var.e()) {
                            qf2Var.d();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(fpVar, j3) != qf2Var) {
                        break;
                    } else {
                        this = fpVar;
                    }
                }
                if (osVar4.e()) {
                    osVar4.d();
                }
                this = fpVar;
            }
            osVar = osVar4;
        }
    }
}
