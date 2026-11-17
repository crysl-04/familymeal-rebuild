package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class z01 implements s01 {
    public static final /* synthetic */ long h;
    public static final /* synthetic */ long i;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = hi.a;
        i = unsafe.objectFieldOffset(z01.class.getDeclaredField("_state$volatile"));
        h = unsafe.objectFieldOffset(z01.class.getDeclaredField("_parentHandle$volatile"));
    }

    public z01(boolean z) {
        this._state$volatile = z ? ie1.H : ie1.G;
    }

    public static jt W(yb1 yb1Var) {
        while (yb1Var.k()) {
            yb1Var = yb1Var.j();
        }
        while (true) {
            yb1Var = yb1Var.i();
            if (!yb1Var.k()) {
                if (yb1Var instanceof jt) {
                    return (jt) yb1Var;
                }
                if (yb1Var instanceof wn1) {
                    return null;
                }
            }
        }
    }

    public static String d0(Object obj) {
        if (!(obj instanceof y01)) {
            if (obj instanceof tu0) {
                return ((tu0) obj).b() ? "Active" : "New";
            }
            return obj instanceof mw ? "Cancelled" : "Completed";
        }
        y01 y01Var = (y01) obj;
        if (y01Var.e()) {
            return "Cancelling";
        }
        return y01Var.f() ? "Completing" : "Active";
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037 A[PHI: r0
  0x0037: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v10 java.lang.Object) binds: [B:3:0x0008, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0055 A[Catch: all -> 0x0086, TRY_LEAVE, TryCatch #0 {, blocks: (B:22:0x0046, B:24:0x0055, B:27:0x005c, B:29:0x0065, B:30:0x0069), top: B:77:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x005c A[Catch: all -> 0x0086, TRY_ENTER, TryCatch #0 {, blocks: (B:22:0x0046, B:24:0x0055, B:27:0x005c, B:29:0x0065, B:30:0x0069), top: B:77:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0065 A[Catch: all -> 0x0086, TryCatch #0 {, blocks: (B:22:0x0046, B:24:0x0055, B:27:0x005c, B:29:0x0065, B:30:0x0069), top: B:77:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0078  */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:41:0x008a  */
    /* JADX WARN: Code duplicated, block: B:43:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    /* JADX WARN: Code duplicated, block: B:47:0x009d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2 A[LOOP:2: B:51:0x00aa->B:57:0x00c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:77:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x003b, please report this as an issue */
    public final boolean A(Object obj) {
        z01 z01Var;
        Throwable thH;
        Object objN;
        Throwable thC;
        qf0 qf0Var;
        Object objE0;
        tu0 tu0Var;
        wn1 wn1VarM;
        y01 y01Var;
        Unsafe unsafe;
        long j;
        Object objE1 = ie1.B;
        if (L()) {
            do {
                Object objN2 = N();
                if (!(objN2 instanceof tu0) || ((objN2 instanceof y01) && ((y01) objN2).f())) {
                    objE1 = ie1.B;
                    break;
                }
                objE1 = e0(objN2, new mw(H(obj), false));
            } while (objE1 == ie1.D);
            if (objE1 != ie1.C) {
                if (objE1 == ie1.B) {
                    thH = null;
                    loop1: while (true) {
                        objN = this.N();
                        if (objN instanceof y01) {
                            if (objN instanceof tu0) {
                                if (thH == null) {
                                    thH = this.H(obj);
                                }
                                tu0Var = (tu0) objN;
                                if (tu0Var.b()) {
                                    wn1VarM = this.M(tu0Var);
                                    if (wn1VarM == null) {
                                        z01Var = this;
                                    } else {
                                        y01Var = new y01(wn1VarM, thH);
                                        while (true) {
                                            unsafe = hi.a;
                                            j = i;
                                            z01Var = this;
                                            if (unsafe.compareAndSwapObject(z01Var, j, tu0Var, y01Var)) {
                                                z01Var.X(wn1VarM, thH);
                                                objE0 = ie1.B;
                                            } else if (unsafe.getObjectVolatile(z01Var, j) == tu0Var) {
                                                this = z01Var;
                                            }
                                        }
                                    }
                                    this = z01Var;
                                } else {
                                    z01Var = this;
                                    objE0 = z01Var.e0(objN, new mw(thH, false));
                                    if (objE0 != ie1.B) {
                                        wg.h(objN, "Cannot happen in ");
                                        return false;
                                    }
                                    if (objE0 == ie1.D) {
                                        this = z01Var;
                                    }
                                }
                            } else {
                                z01Var = this;
                                objE0 = ie1.E;
                            }
                            objE1 = objE0;
                            break;
                        }
                        synchronized (objN) {
                            if (hi.a.getObjectVolatile((y01) objN, y01.i) == ie1.F) {
                                qf0Var = ie1.E;
                            } else {
                                boolean zE = ((y01) objN).e();
                                if (thH == null) {
                                    thH = this.H(obj);
                                }
                                ((y01) objN).a(thH);
                                thC = zE ? null : ((y01) objN).c();
                                if (thC != null) {
                                    this.X(((y01) objN).h, thC);
                                }
                                qf0Var = ie1.B;
                            }
                        }
                        z01Var = this;
                        objE1 = qf0Var;
                        break;
                    }
                }
                z01Var = this;
                if (objE1 != ie1.B && objE1 != ie1.C) {
                    if (objE1 == ie1.E) {
                        return false;
                    }
                    z01Var.y(objE1);
                    return true;
                }
            }
        } else {
            if (objE1 == ie1.B) {
                thH = null;
                loop1: while (true) {
                    objN = this.N();
                    if (objN instanceof y01) {
                        if (objN instanceof tu0) {
                            if (thH == null) {
                                thH = this.H(obj);
                            }
                            tu0Var = (tu0) objN;
                            if (tu0Var.b()) {
                                wn1VarM = this.M(tu0Var);
                                if (wn1VarM == null) {
                                    z01Var = this;
                                } else {
                                    y01Var = new y01(wn1VarM, thH);
                                    while (true) {
                                        unsafe = hi.a;
                                        j = i;
                                        z01Var = this;
                                        if (unsafe.compareAndSwapObject(z01Var, j, tu0Var, y01Var)) {
                                            z01Var.X(wn1VarM, thH);
                                            objE0 = ie1.B;
                                        } else if (unsafe.getObjectVolatile(z01Var, j) == tu0Var) {
                                            this = z01Var;
                                        }
                                    }
                                }
                                this = z01Var;
                            } else {
                                z01Var = this;
                                objE0 = z01Var.e0(objN, new mw(thH, false));
                                if (objE0 != ie1.B) {
                                    wg.h(objN, "Cannot happen in ");
                                    return false;
                                }
                                if (objE0 == ie1.D) {
                                    this = z01Var;
                                }
                            }
                        } else {
                            z01Var = this;
                            objE0 = ie1.E;
                        }
                        objE1 = objE0;
                        break;
                    }
                    synchronized (objN) {
                        if (hi.a.getObjectVolatile((y01) objN, y01.i) == ie1.F) {
                            qf0Var = ie1.E;
                        } else {
                            boolean zE2 = ((y01) objN).e();
                            if (thH == null) {
                                thH = this.H(obj);
                            }
                            ((y01) objN).a(thH);
                            if (zE2) {
                            }
                            if (thC != null) {
                                this.X(((y01) objN).h, thC);
                            }
                            qf0Var = ie1.B;
                        }
                        z01Var = this;
                        objE1 = qf0Var;
                        break;
                    }
                }
            }
            z01Var = this;
            if (objE1 != ie1.B) {
                if (objE1 == ie1.E) {
                    return false;
                }
                z01Var.y(objE1);
                return true;
            }
        }
        return true;
    }

    public void C(CancellationException cancellationException) {
        A(cancellationException);
    }

    public final boolean D(Throwable th) {
        if (S()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        ht htVar = (ht) hi.a.getObjectVolatile(this, h);
        if (htVar == null || htVar == fo1.h) {
            return z;
        }
        return htVar.c(th) || z;
    }

    public String E() {
        return "Job was cancelled";
    }

    public boolean F(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return A(th) && K();
    }

    public final void G(tu0 tu0Var, Object obj) {
        Unsafe unsafe = hi.a;
        long j = h;
        ht htVar = (ht) unsafe.getObjectVolatile(this, j);
        if (htVar != null) {
            htVar.a();
            unsafe.putObjectVolatile(this, j, fo1.h);
        }
        a42 a42Var = null;
        mw mwVar = obj instanceof mw ? (mw) obj : null;
        Throwable th = mwVar != null ? mwVar.a : null;
        if (tu0Var instanceof v01) {
            try {
                ((v01) tu0Var).n(th);
                return;
            } catch (Throwable th2) {
                P(new a42("Exception in completion handler " + tu0Var + " for " + this, th2, (byte) 1));
                return;
            }
        }
        wn1 wn1VarD = tu0Var.d();
        if (wn1VarD != null) {
            wn1VarD.e(new oa1(1), 1);
            Object objH = wn1VarD.h();
            objH.getClass();
            for (yb1 yb1VarI = (yb1) objH; !yb1VarI.equals(wn1VarD); yb1VarI = yb1VarI.i()) {
                if (yb1VarI instanceof v01) {
                    try {
                        ((v01) yb1VarI).n(th);
                    } catch (Throwable th3) {
                        if (a42Var != null) {
                            vs.l(a42Var, th3);
                        } else {
                            a42Var = new a42("Exception in completion handler " + yb1VarI + " for " + this, th3, (byte) 1);
                        }
                    }
                }
            }
            if (a42Var != null) {
                P(a42Var);
            }
        }
    }

    public final Throwable H(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        z01 z01Var = (z01) obj;
        Object objN = z01Var.N();
        if (objN instanceof y01) {
            thC = ((y01) objN).c();
        } else if (objN instanceof mw) {
            thC = ((mw) objN).a;
        } else {
            if (objN instanceof tu0) {
                wg.h(objN, "Cannot be cancelling child in this state: ");
                return null;
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new t01("Parent job is ".concat(d0(objN)), thC, z01Var) : cancellationException;
    }

    public final Object I(y01 y01Var, Object obj) throws Throwable {
        Throwable th;
        z01 z01Var;
        y01 y01Var2;
        mw mwVar = obj instanceof mw ? (mw) obj : null;
        Throwable th2 = mwVar != null ? mwVar.a : null;
        synchronized (y01Var) {
            try {
                y01Var.e();
                ArrayList arrayListG = y01Var.g(th2);
                Throwable thJ = J(y01Var, arrayListG);
                if (thJ != null) {
                    try {
                        if (arrayListG.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListG.size()));
                            int size = arrayListG.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj2 = arrayListG.get(i2);
                                i2++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != thJ && th3 != thJ && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    vs.l(thJ, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
                if (thJ != null && thJ != th2) {
                    obj = new mw(thJ, false);
                }
                if (thJ != null && (D(thJ) || O(thJ))) {
                    obj.getClass();
                    hi.a.compareAndSwapInt((mw) obj, mw.b, 0, 1);
                }
                Y(obj);
                Object uu0Var = obj instanceof tu0 ? new uu0((tu0) obj) : obj;
                while (true) {
                    Unsafe unsafe = hi.a;
                    long j = i;
                    z01Var = this;
                    y01Var2 = y01Var;
                    if (unsafe.compareAndSwapObject(z01Var, j, y01Var2, uu0Var) || unsafe.getObjectVolatile(z01Var, j) != y01Var2) {
                        break;
                    }
                    this = z01Var;
                    y01Var = y01Var2;
                }
                z01Var.G(y01Var2, obj);
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final Throwable J(y01 y01Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (y01Var.e()) {
                return new t01(E(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        do {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i3);
            i3++;
        } while (((Throwable) obj) instanceof CancellationException);
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof sx2) {
            int size2 = arrayList.size();
            while (i2 < size2) {
                Object obj3 = arrayList.get(i2);
                i2++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof sx2)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean K() {
        return true;
    }

    public boolean L() {
        return this instanceof jw;
    }

    public final wn1 M(tu0 tu0Var) {
        wn1 wn1VarD = tu0Var.d();
        if (wn1VarD != null) {
            return wn1VarD;
        }
        if (tu0Var instanceof tf0) {
            return new wn1();
        }
        if (tu0Var instanceof v01) {
            b0((v01) tu0Var);
            return null;
        }
        wg.h(tu0Var, "State should have list: ");
        return null;
    }

    public final Object N() {
        return hi.a.getObjectVolatile(this, i);
    }

    public boolean O(Throwable th) {
        return false;
    }

    public final void Q(s01 s01Var) {
        long j = h;
        fo1 fo1Var = fo1.h;
        if (s01Var == null) {
            hi.a.putObjectVolatile(this, j, fo1Var);
            return;
        }
        s01Var.start();
        ht htVarH = s01Var.h(this);
        Unsafe unsafe = hi.a;
        unsafe.putObjectVolatile(this, j, htVarH);
        if (N() instanceof tu0) {
            return;
        }
        htVarH.a();
        unsafe.putObjectVolatile(this, j, fo1Var);
    }

    public final jb0 R(boolean z, v01 v01Var) {
        z01 z01Var;
        v01 v01Var2;
        boolean zE;
        v01Var.k = this;
        loop0: while (true) {
            Object objN = this.N();
            if (!(objN instanceof tf0)) {
                z01Var = this;
                v01Var2 = v01Var;
                boolean z2 = objN instanceof tu0;
                fo1 fo1Var = fo1.h;
                if (z2) {
                    tu0 tu0Var = (tu0) objN;
                    wn1 wn1VarD = tu0Var.d();
                    if (wn1VarD == null) {
                        z01Var.b0((v01) objN);
                    } else {
                        if (v01Var2.m()) {
                            y01 y01Var = tu0Var instanceof y01 ? (y01) tu0Var : null;
                            Throwable thC = y01Var != null ? y01Var.c() : null;
                            if (thC == null) {
                                zE = wn1VarD.e(v01Var2, 5);
                            } else if (z) {
                                v01Var2.n(thC);
                                return fo1Var;
                            }
                        } else {
                            zE = wn1VarD.e(v01Var2, 1);
                        }
                        if (zE) {
                            break;
                        }
                    }
                    this = z01Var;
                    v01Var = v01Var2;
                } else if (z) {
                    Object objN2 = z01Var.N();
                    mw mwVar = objN2 instanceof mw ? (mw) objN2 : null;
                    v01Var2.n(mwVar != null ? mwVar.a : null);
                }
                return fo1Var;
            }
            tf0 tf0Var = (tf0) objN;
            if (tf0Var.h) {
                while (true) {
                    Unsafe unsafe = hi.a;
                    long j = i;
                    z01Var = this;
                    v01Var2 = v01Var;
                    if (!unsafe.compareAndSwapObject(z01Var, j, objN, v01Var2)) {
                        if (unsafe.getObjectVolatile(z01Var, j) != objN) {
                            break;
                        }
                        this = z01Var;
                        v01Var = v01Var2;
                    } else {
                        break loop0;
                    }
                }
            } else {
                z01Var = this;
                v01Var2 = v01Var;
                z01Var.a0(tf0Var);
            }
            this = z01Var;
            v01Var = v01Var2;
        }
        return v01Var2;
    }

    public boolean S() {
        return this instanceof on;
    }

    public final boolean T(Object obj) {
        Object objE0;
        do {
            objE0 = e0(N(), obj);
            if (objE0 == ie1.B) {
                return false;
            }
            if (objE0 == ie1.C) {
                return true;
            }
        } while (objE0 == ie1.D);
        y(objE0);
        return true;
    }

    public final Object U(Object obj) {
        Object objE0;
        do {
            objE0 = e0(N(), obj);
            if (objE0 == ie1.B) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                mw mwVar = obj instanceof mw ? (mw) obj : null;
                throw new IllegalStateException(str, mwVar != null ? mwVar.a : null);
            }
        } while (objE0 == ie1.D);
        return objE0;
    }

    public String V() {
        return getClass().getSimpleName();
    }

    public final void X(wn1 wn1Var, Throwable th) {
        wn1Var.e(new oa1(4), 4);
        Object objH = wn1Var.h();
        objH.getClass();
        a42 a42Var = null;
        for (yb1 yb1VarI = (yb1) objH; !yb1VarI.equals(wn1Var); yb1VarI = yb1VarI.i()) {
            if ((yb1VarI instanceof v01) && ((v01) yb1VarI).m()) {
                try {
                    ((v01) yb1VarI).n(th);
                } catch (Throwable th2) {
                    if (a42Var != null) {
                        vs.l(a42Var, th2);
                    } else {
                        a42Var = new a42("Exception in completion handler " + yb1VarI + " for " + this, th2, (byte) 1);
                    }
                }
            }
        }
        if (a42Var != null) {
            P(a42Var);
        }
        D(th);
    }

    @Override // defpackage.s01
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new t01(E(), null, this);
        }
        C(cancellationException);
    }

    public final void a0(tf0 tf0Var) {
        wn1 wn1Var = new wn1();
        Object su0Var = tf0Var.h ? wn1Var : new su0(wn1Var);
        while (true) {
            Unsafe unsafe = hi.a;
            long j = i;
            z01 z01Var = this;
            tf0 tf0Var2 = tf0Var;
            if (unsafe.compareAndSwapObject(z01Var, j, tf0Var2, su0Var) || unsafe.getObjectVolatile(z01Var, j) != tf0Var2) {
                return;
            }
            this = z01Var;
            tf0Var = tf0Var2;
        }
    }

    @Override // defpackage.s01
    public final boolean b() {
        Object objN = N();
        return (objN instanceof tu0) && ((tu0) objN).b();
    }

    public final void b0(v01 v01Var) {
        v01 v01Var2;
        z01 z01Var;
        wn1 wn1Var = new wn1();
        Unsafe unsafe = hi.a;
        unsafe.putObjectVolatile(wn1Var, yb1.i, v01Var);
        long j = yb1.h;
        unsafe.putObjectVolatile(wn1Var, j, v01Var);
        loop0: while (true) {
            if (v01Var.h() != v01Var) {
                v01Var2 = v01Var;
                break;
            }
            while (true) {
                Unsafe unsafe2 = hi.a;
                v01Var2 = v01Var;
                if (unsafe2.compareAndSwapObject(v01Var2, yb1.h, v01Var, wn1Var)) {
                    wn1Var.g(v01Var2);
                    break loop0;
                }
                z01Var = this;
                v01Var = v01Var2;
                if (unsafe2.getObjectVolatile(v01Var2, j) != v01Var2) {
                    break;
                } else {
                    this = z01Var;
                }
            }
            this = z01Var;
        }
        yb1 yb1VarI = v01Var2.i();
        while (true) {
            Unsafe unsafe3 = hi.a;
            long j2 = i;
            z01 z01Var2 = this;
            if (unsafe3.compareAndSwapObject(z01Var2, j2, v01Var2, yb1VarI) || unsafe3.getObjectVolatile(z01Var2, j2) != v01Var2) {
                return;
            } else {
                this = z01Var2;
            }
        }
    }

    public final int c0(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof tf0;
        long j = i;
        if (z) {
            if (((tf0) obj).h) {
                return 0;
            }
            tf0 tf0Var = ie1.H;
            do {
                unsafe2 = hi.a;
                if (unsafe2.compareAndSwapObject(this, i, obj, tf0Var)) {
                    Z();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof su0)) {
            return 0;
        }
        wn1 wn1Var = ((su0) obj).h;
        do {
            unsafe = hi.a;
            if (unsafe.compareAndSwapObject(this, i, obj, wn1Var)) {
                Z();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    public final Object e0(Object obj, Object obj2) {
        if (!(obj instanceof tu0)) {
            return ie1.B;
        }
        if ((!(obj instanceof tf0) && !(obj instanceof v01)) || (obj instanceof jt) || (obj2 instanceof mw)) {
            z01 z01Var = this;
            tu0 tu0Var = (tu0) obj;
            wn1 wn1VarM = z01Var.M(tu0Var);
            if (wn1VarM == null) {
                return ie1.D;
            }
            y01 y01Var = tu0Var instanceof y01 ? (y01) tu0Var : null;
            if (y01Var == null) {
                y01Var = new y01(wn1VarM, null);
            }
            y01 y01Var2 = y01Var;
            synchronized (y01Var2) {
                if (y01Var2.f()) {
                    return ie1.B;
                }
                hi.a.putIntVolatile(y01Var2, y01.j, 1);
                if (y01Var2 != tu0Var) {
                    while (true) {
                        Unsafe unsafe = hi.a;
                        long j = i;
                        z01 z01Var2 = z01Var;
                        z01Var = z01Var2;
                        if (unsafe.compareAndSwapObject(z01Var2, j, tu0Var, y01Var2)) {
                            break;
                        }
                        if (unsafe.getObjectVolatile(z01Var, j) != tu0Var) {
                            return ie1.D;
                        }
                    }
                }
                boolean zE = y01Var2.e();
                mw mwVar = obj2 instanceof mw ? (mw) obj2 : null;
                if (mwVar != null) {
                    y01Var2.a(mwVar.a);
                }
                Throwable thC = zE ? null : y01Var2.c();
                if (thC != null) {
                    z01Var.X(wn1VarM, thC);
                }
                jt jtVarW = W(wn1VarM);
                if (jtVarW != null && z01Var.f0(y01Var2, jtVarW, obj2)) {
                    return ie1.C;
                }
                wn1VarM.e(new oa1(2), 2);
                jt jtVarW2 = W(wn1VarM);
                return (jtVarW2 == null || !z01Var.f0(y01Var2, jtVarW2, obj2)) ? z01Var.I(y01Var2, obj2) : ie1.C;
            }
        }
        tu0 tu0Var2 = (tu0) obj;
        Object uu0Var = obj2 instanceof tu0 ? new uu0((tu0) obj2) : obj2;
        while (true) {
            Unsafe unsafe2 = hi.a;
            long j2 = i;
            z01 z01Var3 = this;
            if (unsafe2.compareAndSwapObject(z01Var3, j2, tu0Var2, uu0Var)) {
                z01Var3.Y(obj2);
                z01Var3.G(tu0Var2, obj2);
                return obj2;
            }
            if (unsafe2.getObjectVolatile(z01Var3, j2) != tu0Var2) {
                return ie1.D;
            }
            this = z01Var3;
        }
    }

    public final boolean f0(y01 y01Var, jt jtVar, Object obj) {
        while (ys.M(jtVar.l, false, new x01(this, y01Var, jtVar, obj)) == fo1.h) {
            jtVar = W(jtVar);
            if (jtVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.m20
    public final n20 getKey() {
        return c5.Z;
    }

    @Override // defpackage.s01
    public final ht h(z01 z01Var) {
        z01 z01Var2;
        jt jtVar = new jt(z01Var);
        jtVar.k = this;
        loop0: while (true) {
            Object objN = this.N();
            if (objN instanceof tf0) {
                tf0 tf0Var = (tf0) objN;
                if (tf0Var.h) {
                    while (true) {
                        Unsafe unsafe = hi.a;
                        long j = i;
                        z01Var2 = this;
                        if (!unsafe.compareAndSwapObject(z01Var2, j, objN, jtVar)) {
                            if (unsafe.getObjectVolatile(z01Var2, j) != objN) {
                                break;
                            }
                            this = z01Var2;
                        } else {
                            break loop0;
                        }
                    }
                } else {
                    z01Var2 = this;
                    z01Var2.a0(tf0Var);
                }
                this = z01Var2;
            } else {
                z01Var2 = this;
                boolean z = objN instanceof tu0;
                fo1 fo1Var = fo1.h;
                Throwable thC = null;
                if (!z) {
                    Object objN2 = z01Var2.N();
                    mw mwVar = objN2 instanceof mw ? (mw) objN2 : null;
                    jtVar.n(mwVar != null ? mwVar.a : null);
                    return fo1Var;
                }
                wn1 wn1VarD = ((tu0) objN).d();
                if (wn1VarD != null) {
                    if (wn1VarD.e(jtVar, 7)) {
                        break;
                    }
                    boolean zE = wn1VarD.e(jtVar, 3);
                    Object objN3 = z01Var2.N();
                    if (objN3 instanceof y01) {
                        thC = ((y01) objN3).c();
                    } else {
                        mw mwVar2 = objN3 instanceof mw ? (mw) objN3 : null;
                        if (mwVar2 != null) {
                            thC = mwVar2.a;
                        }
                    }
                    jtVar.n(thC);
                    if (zE) {
                        break;
                    }
                    return fo1Var;
                }
                z01Var2.b0((v01) objN);
                this = z01Var2;
            }
        }
        return jtVar;
    }

    @Override // defpackage.o20
    public final o20 i(o20 o20Var) {
        return cu.Q(this, o20Var);
    }

    @Override // defpackage.o20
    public final m20 m(n20 n20Var) {
        return cu.F(this, n20Var);
    }

    @Override // defpackage.s01
    public final CancellationException o() {
        CancellationException cancellationException;
        Object objN = N();
        if (objN instanceof y01) {
            Throwable thC = ((y01) objN).c();
            if (thC == null) {
                wg.h(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
            return cancellationException == null ? new t01(strConcat, thC, this) : cancellationException;
        }
        if (objN instanceof tu0) {
            wg.h(this, "Job is still new or active: ");
            return null;
        }
        if (!(objN instanceof mw)) {
            return new t01(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((mw) objN).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new t01(E(), th, this) : cancellationException;
    }

    @Override // defpackage.o20
    public final Object p(zp0 zp0Var, Object obj) {
        return zp0Var.f(obj, this);
    }

    @Override // defpackage.s01
    public final jb0 r(vp0 vp0Var) {
        return R(true, new i01(vp0Var));
    }

    @Override // defpackage.s01
    public final boolean start() {
        int iC0;
        do {
            iC0 = c0(N());
            if (iC0 == 0) {
                return false;
            }
        } while (iC0 != 1);
        return true;
    }

    @Override // defpackage.o20
    public final o20 t(n20 n20Var) {
        return cu.M(this, n20Var);
    }

    public final String toString() {
        return (V() + '{' + d0(N()) + '}') + '@' + s60.o(this);
    }

    @Override // defpackage.s01
    public final jb0 w(boolean z, boolean z2, i iVar) {
        return R(z2, z ? new h01(iVar) : new i01(iVar));
    }

    @Override // defpackage.s01
    public final Object x(m10 m10Var) {
        Object objN;
        j23 j23Var;
        do {
            objN = N();
            boolean z = objN instanceof tu0;
            j23Var = j23.a;
            if (!z) {
                ys.u(m10Var.e());
                return j23Var;
            }
        } while (c0(objN) < 0);
        rq rqVar = new rq(1, ls.F(m10Var));
        rqVar.u();
        rqVar.x(new nq(ys.M(this, true, new g92(rqVar)), (byte) 2));
        Object objT = rqVar.t();
        y20 y20Var = y20.h;
        if (objT != y20Var) {
            objT = j23Var;
        }
        return objT == y20Var ? objT : j23Var;
    }

    public void z(Object obj) {
        y(obj);
    }

    public void Z() {
    }

    public void P(a42 a42Var) {
        throw a42Var;
    }

    public void Y(Object obj) {
    }

    public void y(Object obj) {
    }
}
