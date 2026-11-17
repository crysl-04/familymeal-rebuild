package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class rq extends va0 implements qq, z20, x53 {
    public static final /* synthetic */ long m;
    public static final /* synthetic */ long n;
    public static final /* synthetic */ long o;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final m10 k;
    public final o20 l;

    static {
        Unsafe unsafe = hi.a;
        m = unsafe.objectFieldOffset(rq.class.getDeclaredField("_decisionAndIndex$volatile"));
        o = unsafe.objectFieldOffset(rq.class.getDeclaredField("_state$volatile"));
        n = unsafe.objectFieldOffset(rq.class.getDeclaredField("_parentHandle$volatile"));
    }

    public rq(int i, m10 m10Var) {
        super(i);
        this.k = m10Var;
        this.l = m10Var.e();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = g3.a;
    }

    public static Object F(lo1 lo1Var, Object obj, int i, aq0 aq0Var) {
        if (obj instanceof mw) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (aq0Var != null || (lo1Var instanceof nq)) {
            return new kw(obj, lo1Var instanceof nq ? (nq) lo1Var : null, aq0Var, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void z(lo1 lo1Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lo1Var + ", already has " + obj).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    @Override // defpackage.qq
    public final void B(Object obj) {
        r(this.j);
    }

    public final void C() {
        rq rqVar;
        m10 m10Var = this.k;
        Throwable th = null;
        ta0 ta0Var = m10Var instanceof ta0 ? (ta0) m10Var : null;
        if (ta0Var != null) {
            long j = ta0.o;
            loop0: while (true) {
                Object objectVolatile = hi.a.getObjectVolatile(ta0Var, j);
                qf0 qf0Var = tz0.R;
                if (objectVolatile == qf0Var) {
                    while (true) {
                        Unsafe unsafe = hi.a;
                        rq rqVar2 = this;
                        rqVar = rqVar2;
                        if (unsafe.compareAndSwapObject(ta0Var, ta0.o, qf0Var, rqVar2)) {
                            break loop0;
                        } else if (unsafe.getObjectVolatile(ta0Var, j) != qf0Var) {
                            break;
                        } else {
                            this = rqVar;
                        }
                    }
                    this = rqVar;
                } else {
                    rqVar = this;
                    if (!(objectVolatile instanceof Throwable)) {
                        wg.h(objectVolatile, "Inconsistent state ");
                        return;
                    }
                    while (true) {
                        Unsafe unsafe2 = hi.a;
                        if (unsafe2.compareAndSwapObject(ta0Var, ta0.o, objectVolatile, (Object) null)) {
                            th = (Throwable) objectVolatile;
                            break;
                        } else if (unsafe2.getObjectVolatile(ta0Var, j) != objectVolatile) {
                            wg.m("Failed requirement.");
                            return;
                        }
                    }
                }
            }
            if (th != null) {
                rqVar.q();
                rqVar.l(th);
            }
        }
    }

    public final void D(Object obj, int i, aq0 aq0Var) {
        rq rqVar;
        while (true) {
            Unsafe unsafe = hi.a;
            long j = o;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof lo1)) {
                rq rqVar2 = this;
                if (objectVolatile instanceof uq) {
                    uq uqVar = (uq) objectVolatile;
                    if (unsafe.compareAndSwapInt(uqVar, uq.c, 0, 1)) {
                        if (aq0Var != null) {
                            rqVar2.o(aq0Var, uqVar.a, obj);
                            return;
                        }
                        return;
                    }
                }
                wg.h(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objF = F((lo1) objectVolatile, obj, i, aq0Var);
            while (true) {
                Unsafe unsafe2 = hi.a;
                rqVar = this;
                if (unsafe2.compareAndSwapObject(rqVar, o, objectVolatile, objF)) {
                    if (!rqVar.y()) {
                        rqVar.q();
                    }
                    rqVar.r(i);
                    return;
                } else if (unsafe2.getObjectVolatile(rqVar, j) != objectVolatile) {
                    break;
                } else {
                    this = rqVar;
                }
            }
            this = rqVar;
        }
    }

    public final void E(q20 q20Var) {
        m10 m10Var = this.k;
        ta0 ta0Var = m10Var instanceof ta0 ? (ta0) m10Var : null;
        D(j23.a, (ta0Var != null ? ta0Var.k : null) == q20Var ? 4 : this.j, null);
    }

    @Override // defpackage.x53
    public final void a(qf2 qf2Var, int i) {
        while (true) {
            Unsafe unsafe = hi.a;
            long j = m;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if ((intVolatile & 536870911) != 536870911) {
                li1.g("invokeOnCancellation should be called at most once");
                return;
            }
            rq rqVar = this;
            if (unsafe.compareAndSwapInt(rqVar, j, intVolatile, ((intVolatile >> 29) << 29) + i)) {
                rqVar.x(qf2Var);
                return;
            }
            this = rqVar;
        }
    }

    @Override // defpackage.va0
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        rq rqVar;
        while (true) {
            Unsafe unsafe = hi.a;
            long j = o;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof lo1) {
                li1.g("Not completed");
                return;
            }
            if (objectVolatile instanceof mw) {
                return;
            }
            if (objectVolatile instanceof kw) {
                kw kwVar = (kw) objectVolatile;
                if (kwVar.e != null) {
                    li1.g("Must be called at most once");
                    return;
                }
                kw kwVarA = kw.a(kwVar, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = hi.a;
                    rq rqVar2 = this;
                    if (unsafe2.compareAndSwapObject(rqVar2, o, objectVolatile, kwVarA)) {
                        nq nqVar = kwVar.b;
                        if (nqVar != null) {
                            rqVar2.n(nqVar, cancellationException);
                        }
                        aq0 aq0Var = kwVar.c;
                        if (aq0Var != null) {
                            rqVar2.o(aq0Var, cancellationException, kwVar.a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(rqVar2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        rqVar = rqVar2;
                        break;
                    }
                    this = rqVar2;
                }
            } else {
                rq rqVar3 = this;
                CancellationException cancellationException3 = cancellationException;
                kw kwVar2 = new kw(objectVolatile, (nq) null, (aq0) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    kw kwVar3 = kwVar2;
                    Unsafe unsafe3 = hi.a;
                    rqVar = rqVar3;
                    boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(rqVar, o, objectVolatile, kwVar3);
                    kwVar2 = kwVar3;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(rqVar, j) != objectVolatile) {
                        break;
                    } else {
                        rqVar3 = rqVar;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = rqVar;
        }
    }

    @Override // defpackage.va0
    public final m10 c() {
        return this.k;
    }

    @Override // defpackage.z20
    public final z20 d() {
        m10 m10Var = this.k;
        if (m10Var instanceof z20) {
            return (z20) m10Var;
        }
        return null;
    }

    @Override // defpackage.m10
    public final o20 e() {
        return this.l;
    }

    @Override // defpackage.va0
    public final Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // defpackage.m10
    public final void g(Object obj) {
        Throwable thA = e92.a(obj);
        if (thA != null) {
            obj = new mw(thA, false);
        }
        D(obj, this.j, null);
    }

    @Override // defpackage.va0
    public final Object h(Object obj) {
        return obj instanceof kw ? ((kw) obj).a : obj;
    }

    @Override // defpackage.qq
    public final void j(Object obj, aq0 aq0Var) {
        D(obj, this.j, aq0Var);
    }

    @Override // defpackage.qq
    public final qf0 k(Object obj, aq0 aq0Var) {
        rq rqVar;
        qf0 qf0Var = ia2.a;
        while (true) {
            Unsafe unsafe = hi.a;
            long j = o;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof lo1)) {
                return null;
            }
            Object objF = F((lo1) objectVolatile, obj, this.j, aq0Var);
            while (true) {
                Unsafe unsafe2 = hi.a;
                rqVar = this;
                if (unsafe2.compareAndSwapObject(rqVar, o, objectVolatile, objF)) {
                    if (!rqVar.y()) {
                        rqVar.q();
                    }
                    return qf0Var;
                }
                if (unsafe2.getObjectVolatile(rqVar, j) != objectVolatile) {
                    break;
                }
                this = rqVar;
            }
            this = rqVar;
        }
    }

    @Override // defpackage.qq
    public final boolean l(Throwable th) {
        rq rqVar;
        while (true) {
            Unsafe unsafe = hi.a;
            long j = o;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof lo1)) {
                return false;
            }
            uq uqVar = new uq(this, th, (objectVolatile instanceof nq) || (objectVolatile instanceof qf2));
            while (true) {
                Unsafe unsafe2 = hi.a;
                rqVar = this;
                if (unsafe2.compareAndSwapObject(rqVar, o, objectVolatile, uqVar)) {
                    lo1 lo1Var = (lo1) objectVolatile;
                    if (lo1Var instanceof nq) {
                        rqVar.n((nq) objectVolatile, th);
                    } else if (lo1Var instanceof qf2) {
                        rqVar.p((qf2) objectVolatile, th);
                    }
                    if (!rqVar.y()) {
                        rqVar.q();
                    }
                    rqVar.r(rqVar.j);
                    return true;
                }
                if (unsafe2.getObjectVolatile(rqVar, j) != objectVolatile) {
                    break;
                }
                this = rqVar;
            }
            this = rqVar;
        }
    }

    public final void n(nq nqVar, Throwable th) {
        try {
            switch (nqVar.a) {
                case 0:
                    ((ScheduledFuture) nqVar.b).cancel(false);
                    break;
                case 1:
                    ((vp0) nqVar.b).h(th);
                    break;
                default:
                    ((jb0) nqVar.b).a();
                    break;
            }
        } catch (Throwable th2) {
            ls.E(this.l, new a42("Exception in invokeOnCancellation handler for " + this, th2, (byte) 1));
        }
    }

    public final void o(aq0 aq0Var, Throwable th, Object obj) {
        o20 o20Var = this.l;
        try {
            aq0Var.c(th, obj, o20Var);
        } catch (Throwable th2) {
            ls.E(o20Var, new a42("Exception in resume onCancellation handler for " + this, th2, (byte) 1));
        }
    }

    public final void p(qf2 qf2Var, Throwable th) {
        o20 o20Var = this.l;
        int intVolatile = hi.a.getIntVolatile(this, m) & 536870911;
        if (intVolatile == 536870911) {
            li1.g("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            qf2Var.g(intVolatile, o20Var);
        } catch (Throwable th2) {
            ls.E(o20Var, new a42("Exception in invokeOnCancellation handler for " + this, th2, (byte) 1));
        }
    }

    public final void q() {
        Unsafe unsafe = hi.a;
        long j = n;
        jb0 jb0Var = (jb0) unsafe.getObjectVolatile(this, j);
        if (jb0Var == null) {
            return;
        }
        jb0Var.a();
        unsafe.putObjectVolatile(this, j, fo1.h);
    }

    public final void r(int i) {
        while (true) {
            Unsafe unsafe = hi.a;
            long j = m;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i2 = intVolatile >> 29;
            if (i2 != 0) {
                if (i2 != 1) {
                    li1.g("Already resumed");
                    return;
                }
                boolean z = i == 4;
                m10 m10Var = this.k;
                if (!z && (m10Var instanceof ta0)) {
                    boolean z2 = i == 1 || i == 2;
                    int i3 = this.j;
                    if (z2 == (i3 == 1 || i3 == 2)) {
                        ta0 ta0Var = (ta0) m10Var;
                        q20 q20Var = ta0Var.k;
                        o20 o20VarE = ta0Var.l.e();
                        if (q20Var.f(o20VarE)) {
                            q20Var.e(o20VarE, this);
                            return;
                        }
                        nh0 nh0VarA = fx2.a();
                        if (nh0VarA.j >= 4294967296L) {
                            nh0VarA.k(this);
                            return;
                        }
                        nh0VarA.l(true);
                        try {
                            ys.a0(this, m10Var, true);
                            do {
                            } while (nh0VarA.s());
                        } catch (Throwable th) {
                            try {
                                this.i(th);
                            } finally {
                                nh0VarA.j(true);
                            }
                        }
                        return;
                    }
                }
                ys.a0(this, m10Var, z);
                return;
            }
            rq rqVar = this;
            if (unsafe.compareAndSwapInt(rqVar, j, intVolatile, 1073741824 + (536870911 & intVolatile))) {
                return;
            } else {
                this = rqVar;
            }
        }
    }

    public Throwable s(z01 z01Var) {
        return z01Var.o();
    }

    public final Object t() {
        s01 s01Var;
        boolean zY = y();
        while (true) {
            Unsafe unsafe = hi.a;
            long j = m;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i = intVolatile >> 29;
            if (i != 0) {
                if (i != 2) {
                    li1.g("Already suspended");
                    return null;
                }
                if (zY) {
                    this.C();
                }
                Object objectVolatile = unsafe.getObjectVolatile(this, o);
                if (objectVolatile instanceof mw) {
                    throw ((mw) objectVolatile).a;
                }
                int i2 = this.j;
                if ((i2 != 1 && i2 != 2) || (s01Var = (s01) this.l.m(c5.Z)) == null || s01Var.b()) {
                    return this.h(objectVolatile);
                }
                CancellationException cancellationExceptionO = s01Var.o();
                this.b(cancellationExceptionO);
                throw cancellationExceptionO;
            }
            rq rqVar = this;
            if (unsafe.compareAndSwapInt(rqVar, j, intVolatile, SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING + (536870911 & intVolatile))) {
                if (((jb0) unsafe.getObjectVolatile(rqVar, n)) == null) {
                    rqVar.v();
                }
                if (zY) {
                    rqVar.C();
                }
                return y20.h;
            }
            this = rqVar;
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(A());
        sb.append('(');
        sb.append(s60.K(this.k));
        sb.append("){");
        Object objectVolatile = hi.a.getObjectVolatile(this, o);
        if (objectVolatile instanceof lo1) {
            str = "Active";
        } else {
            str = objectVolatile instanceof uq ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(s60.o(this));
        return sb.toString();
    }

    public final void u() {
        jb0 jb0VarV = v();
        if (jb0VarV != null) {
            Unsafe unsafe = hi.a;
            if (unsafe.getObjectVolatile(this, o) instanceof lo1) {
                return;
            }
            jb0VarV.a();
            unsafe.putObjectVolatile(this, n, fo1.h);
        }
    }

    public final jb0 v() {
        s01 s01Var = (s01) this.l.m(c5.Z);
        if (s01Var == null) {
            return null;
        }
        jb0 jb0VarM = ys.M(s01Var, true, new gt(this));
        while (true) {
            Unsafe unsafe = hi.a;
            long j = n;
            rq rqVar = this;
            if (unsafe.compareAndSwapObject(rqVar, j, (Object) null, jb0VarM) || unsafe.getObjectVolatile(rqVar, j) != null) {
                break;
            }
            this = rqVar;
        }
        return jb0VarM;
    }

    public final void w(vp0 vp0Var) {
        x(new nq(vp0Var, (byte) 1));
    }

    public final void x(lo1 lo1Var) {
        lo1 lo1Var2;
        rq rqVar;
        rq rqVar2;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = hi.a;
            long j = o;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof g3) {
                while (true) {
                    Unsafe unsafe3 = hi.a;
                    rq rqVar3 = this;
                    lo1 lo1Var3 = lo1Var;
                    rqVar = rqVar3;
                    lo1Var2 = lo1Var3;
                    if (!unsafe3.compareAndSwapObject(rqVar3, o, objectVolatile, lo1Var3)) {
                        if (unsafe3.getObjectVolatile(rqVar, j) != objectVolatile) {
                            break;
                        }
                        this = rqVar;
                        lo1Var = lo1Var2;
                    } else {
                        return;
                    }
                }
            } else {
                lo1Var2 = lo1Var;
                rqVar = this;
                if ((objectVolatile instanceof nq) || (objectVolatile instanceof qf2)) {
                    z(lo1Var2, objectVolatile);
                    throw null;
                }
                if (objectVolatile instanceof mw) {
                    mw mwVar = (mw) objectVolatile;
                    if (!unsafe2.compareAndSwapInt(mwVar, mw.b, 0, 1)) {
                        z(lo1Var2, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof uq) {
                        Throwable th = mwVar.a;
                        if (lo1Var2 instanceof nq) {
                            rqVar.n((nq) lo1Var2, th);
                            return;
                        } else {
                            rqVar.p((qf2) lo1Var2, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof kw) {
                    kw kwVar = (kw) objectVolatile;
                    if (kwVar.b != null) {
                        z(lo1Var2, objectVolatile);
                        throw null;
                    }
                    if (lo1Var2 instanceof qf2) {
                        return;
                    }
                    nq nqVar = (nq) lo1Var2;
                    Throwable th2 = kwVar.e;
                    if (th2 != null) {
                        rqVar.n(nqVar, th2);
                        return;
                    }
                    kw kwVarA = kw.a(kwVar, nqVar, null, 29);
                    do {
                        unsafe = hi.a;
                        if (unsafe.compareAndSwapObject(rqVar, o, objectVolatile, kwVarA)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(rqVar, j) == objectVolatile);
                } else {
                    if (lo1Var2 instanceof qf2) {
                        return;
                    }
                    kw kwVar2 = new kw(objectVolatile, (nq) lo1Var2, (aq0) null, (CancellationException) null, 28);
                    while (true) {
                        kw kwVar3 = kwVar2;
                        Unsafe unsafe4 = hi.a;
                        rqVar2 = rqVar;
                        boolean zCompareAndSwapObject = unsafe4.compareAndSwapObject(rqVar2, o, objectVolatile, kwVar3);
                        kwVar2 = kwVar3;
                        if (zCompareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(rqVar2, j) != objectVolatile) {
                            break;
                        } else {
                            rqVar = rqVar2;
                        }
                    }
                }
                this = rqVar2;
                lo1Var = lo1Var2;
            }
            rqVar2 = rqVar;
            this = rqVar2;
            lo1Var = lo1Var2;
        }
    }

    public final boolean y() {
        if (this.j == 2) {
            return hi.a.getObjectVolatile((ta0) this.k, ta0.o) != null;
        }
        return false;
    }
}
