package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class l41 implements hy, ht1, sy {
    public static final ma2 V = new ma2("Undefined intrinsics block and it is required", 1);
    public static final jw0 W = new jw0(11);
    public static final g41 X = new g41();
    public static final da Y = new da(4);
    public final uj1 A;
    public boolean B;
    public ze1 C;
    public ix0 D;
    public e90 E;
    public u31 F;
    public v43 G;
    public rz H;
    public j41 I;
    public j41 J;
    public boolean K;
    public final ln1 L;
    public final p41 M;
    public z41 N;
    public pn1 O;
    public boolean P;
    public rg1 Q;
    public rg1 R;
    public boolean S;
    public int T;
    public boolean U;
    public final boolean h;
    public int i;
    public boolean j;
    public long k;
    public boolean l;
    public boolean m;
    public int n;
    public l41 o;
    public int p;
    public final ix0 q;
    public uj1 r;
    public boolean s;
    public l41 t;
    public t6 u;
    public int v;
    public boolean w;
    public boolean x;
    public rg2 y;
    public boolean z;

    public l41(int i, boolean z) {
        this.h = z;
        this.i = i;
        this.k = 9223372034707292159L;
        this.l = true;
        this.m = true;
        this.n = -4;
        this.q = new ix0(new uj1(new l41[16]), new o9((Object) this, (byte) 18), (byte) 23, false);
        this.A = new uj1(new l41[16]);
        this.B = true;
        this.C = V;
        this.E = o41.a;
        this.F = u31.h;
        this.G = X;
        rz.g.getClass();
        this.H = qz.b;
        j41 j41Var = j41.j;
        this.I = j41Var;
        this.J = j41Var;
        this.L = new ln1(this);
        this.M = new p41(this);
        this.P = true;
        this.Q = og1.h;
    }

    public static void U(l41 l41Var, boolean z, int i) {
        l41 l41VarU;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (l41Var.o == null) {
            ax0.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        t6 t6Var = l41Var.u;
        if (t6Var == null || l41Var.w || l41Var.h) {
            return;
        }
        t6Var.w(l41Var, true, z, z2);
        if (z3) {
            gd1 gd1Var = l41Var.M.q;
            gd1Var.getClass();
            p41 p41Var = gd1Var.m;
            l41 l41VarU2 = p41Var.a.u();
            j41 j41Var = p41Var.a.I;
            if (l41VarU2 == null || j41Var == j41.j) {
                return;
            }
            while (l41VarU2.I == j41Var && (l41VarU = l41VarU2.u()) != null) {
                l41VarU2 = l41VarU;
            }
            int iOrdinal = j41Var.ordinal();
            if (iOrdinal == 0) {
                if (l41VarU2.o != null) {
                    U(l41VarU2, z, 6);
                    return;
                } else {
                    W(l41VarU2, z, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                li1.g("Intrinsics isn't used by the parent");
            } else if (l41VarU2.o != null) {
                l41VarU2.T(z);
            } else {
                l41VarU2.V(z);
            }
        }
    }

    public static void W(l41 l41Var, boolean z, int i) {
        t6 t6Var;
        l41 l41VarU;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (l41Var.w || l41Var.h || (t6Var = l41Var.u) == null) {
            return;
        }
        t6Var.w(l41Var, false, z, z2);
        if (z3) {
            p41 p41Var = l41Var.M.p.m;
            l41 l41VarU2 = p41Var.a.u();
            j41 j41Var = p41Var.a.I;
            if (l41VarU2 == null || j41Var == j41.j) {
                return;
            }
            while (l41VarU2.I == j41Var && (l41VarU = l41VarU2.u()) != null) {
                l41VarU2 = l41VarU;
            }
            int iOrdinal = j41Var.ordinal();
            if (iOrdinal == 0) {
                W(l41VarU2, z, 6);
            } else if (iOrdinal == 1) {
                l41VarU2.V(z);
            } else {
                li1.g("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void X(l41 l41Var) {
        int i = k41.a[l41Var.M.d.ordinal()];
        p41 p41Var = l41Var.M;
        if (i != 1) {
            wg.o(p41Var.d, "Unexpected state ");
            return;
        }
        if (p41Var.e) {
            U(l41Var, true, 6);
            return;
        }
        if (p41Var.f) {
            l41Var.T(true);
        }
        if (l41Var.q()) {
            W(l41Var, true, 6);
        } else if (l41Var.p()) {
            l41Var.V(true);
        }
    }

    private final String j(l41 l41Var) {
        String strG = g(0);
        l41 l41Var2 = l41Var.t;
        return "Cannot insert " + l41Var + " because it already has a parent or an owner. This tree: " + strG + " Other tree: " + (l41Var2 != null ? l41Var2.g(0) : null);
    }

    public final void A(long j, jt0 jt0Var, int i, boolean z) {
        ln1 ln1Var = this.L;
        pn1 pn1Var = ln1Var.d;
        de1 de1Var = pn1.b0;
        ln1Var.d.b1(pn1.g0, pn1Var.S0(j), jt0Var, i, z);
    }

    @Override // defpackage.ht1
    public final boolean B() {
        return I();
    }

    public final void C(int i, l41 l41Var) {
        if (l41Var.t != null && l41Var.u != null) {
            ax0.b(j(l41Var));
        }
        l41Var.t = this;
        ix0 ix0Var = this.q;
        ((uj1) ix0Var.i).a(i, l41Var);
        ((o9) ix0Var.j).a();
        P();
        if (l41Var.h) {
            this.p++;
        }
        H();
        t6 t6Var = this.u;
        if (t6Var != null) {
            l41Var.d(t6Var);
        }
        if (l41Var.M.l > 0) {
            p41 p41Var = this.M;
            p41Var.d(p41Var.l + 1);
        }
        if (l41Var.T > 0) {
            b0(this.T + 1);
        }
    }

    public final void D() {
        if (this.P) {
            ln1 ln1Var = this.L;
            pn1 pn1Var = ln1Var.c;
            pn1 pn1Var2 = ln1Var.d.D;
            this.O = null;
            while (!uz0.g(pn1Var, pn1Var2)) {
                if ((pn1Var != null ? pn1Var.a0 : null) != null) {
                    this.O = pn1Var;
                    break;
                }
                pn1Var = pn1Var != null ? pn1Var.D : null;
            }
            this.P = false;
        }
        pn1 pn1Var3 = this.O;
        if (pn1Var3 != null) {
            if (pn1Var3.a0 == null) {
                throw wi0.e("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
            }
            pn1Var3.d1();
            return;
        }
        l41 l41VarU = u();
        if (l41VarU != null) {
            l41VarU.D();
            return;
        }
        t6 t6Var = this.u;
        if (t6Var != null) {
            t6Var.invalidate();
        }
    }

    public final void E() {
        ln1 ln1Var = this.L;
        pn1 pn1Var = ln1Var.d;
        gx0 gx0Var = ln1Var.c;
        while (pn1Var != gx0Var) {
            pn1Var.getClass();
            e41 e41Var = (e41) pn1Var;
            gt1 gt1Var = e41Var.a0;
            if (gt1Var != null) {
                ((es0) gt1Var).c();
            }
            pn1Var = e41Var.C;
        }
        gt1 gt1Var2 = gx0Var.a0;
        if (gt1Var2 != null) {
            ((es0) gt1Var2).c();
        }
    }

    public final void F() {
        if (this.h) {
            l41 l41VarU = u();
            if (l41VarU != null) {
                l41VarU.F();
                return;
            }
            return;
        }
        if (this.o != null) {
            U(this, false, 7);
        } else {
            W(this, false, 7);
        }
    }

    public final void G() {
        if (this.z) {
            return;
        }
        if (this.L.b.m != null || this.R != null) {
            this.x = true;
            return;
        }
        rg2 rg2Var = this.y;
        this.z = true;
        x72 x72Var = new x72();
        x72Var.h = new rg2();
        it1 snapshotObserver = o41.a(this).getSnapshotObserver();
        h6 h6Var = new h6((Object) this, (Object) x72Var, (byte) 20);
        snapshotObserver.a.d(this, snapshotObserver.d, h6Var);
        this.z = false;
        this.y = (rg2) x72Var.h;
        this.x = false;
        t6 t6VarA = o41.a(this);
        t6VarA.getSemanticsOwner().b(this, rg2Var);
        t6VarA.y();
    }

    public final void H() {
        l41 l41Var;
        if (this.p > 0) {
            this.s = true;
        }
        if (!this.h || (l41Var = this.t) == null) {
            return;
        }
        l41Var.H();
    }

    public final boolean I() {
        return this.u != null;
    }

    public final boolean J() {
        return this.M.p.z;
    }

    public final Boolean K() {
        gd1 gd1Var = this.M.q;
        if (gd1Var != null) {
            return Boolean.valueOf(gd1Var.x != fd1.j);
        }
        return null;
    }

    public final void L() {
        l41 l41VarU;
        if (this.I == j41.j) {
            f();
        }
        gd1 gd1Var = this.M.q;
        gd1Var.getClass();
        try {
            gd1Var.n = true;
            if (!gd1Var.s) {
                ax0.b("replace() called on item that was not placed");
            }
            gd1Var.I = false;
            boolean z = gd1Var.x != fd1.j;
            gd1Var.A0(gd1Var.v, gd1Var.w);
            if (z && !gd1Var.I && (l41VarU = gd1Var.m.a.u()) != null) {
                l41VarU.T(false);
            }
        } finally {
            gd1Var.n = false;
        }
    }

    public final void M(int i, int i2, int i3) {
        int i4;
        int i5;
        if (i == i2) {
            return;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            if (i > i2) {
                i5 = i + i6;
                i4 = i2 + i6;
            } else {
                i4 = (i2 + i3) - 2;
                i5 = i;
            }
            ix0 ix0Var = this.q;
            uj1 uj1Var = (uj1) ix0Var.i;
            o9 o9Var = (o9) ix0Var.j;
            Object objK = uj1Var.k(i5);
            o9Var.a();
            ((uj1) ix0Var.i).a(i4, (l41) objK);
            o9Var.a();
        }
        P();
        H();
        F();
    }

    public final void N(l41 l41Var) {
        if (l41Var.M.l > 0) {
            p41 p41Var = this.M;
            p41Var.d(p41Var.l - 1);
        }
        if (this.u != null) {
            l41Var.h();
        }
        l41Var.t = null;
        if (l41Var.T > 0) {
            b0(this.T - 1);
        }
        l41Var.L.d.D = null;
        if (l41Var.h) {
            this.p--;
            uj1 uj1Var = (uj1) l41Var.q.i;
            Object[] objArr = uj1Var.h;
            int i = uj1Var.j;
            for (int i2 = 0; i2 < i; i2++) {
                ((l41) objArr[i2]).L.d.D = null;
            }
        }
        H();
        P();
    }

    public final void O(pn1 pn1Var) {
        t6 t6Var = this.u;
        s72 rectManager = t6Var != null ? t6Var.getRectManager() : null;
        p41 p41Var = this.M;
        boolean z = p41Var.d != h41.l || q() || p();
        if (this.n != -4 && rectManager != null) {
            if (pn1Var == this.L.d) {
                this.m = true;
                if (!z) {
                    rectManager.g(this);
                }
            } else {
                this.l = true;
                uj1 uj1VarZ = z();
                Object[] objArr = uj1VarZ.h;
                int i = uj1VarZ.j;
                for (int i2 = 0; i2 < i; i2++) {
                    l41 l41Var = (l41) objArr[i2];
                    l41Var.m = true;
                    if (!z) {
                        rectManager.g(l41Var);
                    }
                }
                if (this.n != -4) {
                    rectManager.f = true;
                    int iD = rectManager.d(this);
                    long[] jArr = (long[]) rectManager.c.b;
                    int i3 = iD + 2;
                    long j = jArr[i3];
                    jArr[i3] = j | (((j >> 63) & 1) << 60);
                }
                rectManager.j();
            }
        }
        p41Var.p.B0();
    }

    public final void P() {
        if (!this.h) {
            this.B = true;
            return;
        }
        l41 l41VarU = u();
        if (l41VarU != null) {
            l41VarU.P();
        }
    }

    public final void Q() {
        ix0 ix0Var = this.q;
        int i = ((uj1) ix0Var.i).j;
        while (true) {
            i--;
            uj1 uj1Var = (uj1) ix0Var.i;
            if (-1 >= i) {
                uj1Var.g();
                ((o9) ix0Var.j).a();
                return;
            }
            N((l41) uj1Var.h[i]);
        }
    }

    public final void R(int i, int i2) {
        if (i2 < 0) {
            ax0.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            ix0 ix0Var = this.q;
            N((l41) ((uj1) ix0Var.i).h[i3]);
            Object objK = ((uj1) ix0Var.i).k(i3);
            ((o9) ix0Var.j).a();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void S() {
        l41 l41VarU;
        if (this.I == j41.j) {
            f();
        }
        ye1 ye1Var = this.M.p;
        p41 p41Var = ye1Var.m;
        try {
            ye1Var.n = true;
            if (!ye1Var.r) {
                ax0.b("replace called on unplaced item");
            }
            boolean z = ye1Var.z;
            ye1Var.z0(ye1Var.u, ye1Var.w, ye1Var.v);
            if (z && !ye1Var.M && (l41VarU = p41Var.a.u()) != null) {
                l41VarU.V(false);
            }
            ye1Var.n = false;
        } catch (Throwable th) {
            try {
                p41Var.a.Z(th);
                throw null;
            } catch (Throwable th2) {
                ye1Var.n = false;
                throw th2;
            }
        }
    }

    public final void T(boolean z) {
        t6 t6Var;
        if (this.h || (t6Var = this.u) == null) {
            return;
        }
        t6Var.x(this, true, z);
    }

    public final void V(boolean z) {
        t6 t6Var;
        if (this.h || (t6Var = this.u) == null) {
            return;
        }
        t6Var.x(this, false, z);
    }

    public final void Y() {
        uj1 uj1VarZ = z();
        Object[] objArr = uj1VarZ.h;
        int i = uj1VarZ.j;
        for (int i2 = 0; i2 < i; i2++) {
            l41 l41Var = (l41) objArr[i2];
            j41 j41Var = l41Var.J;
            l41Var.I = j41Var;
            if (j41Var != j41.j) {
                l41Var.Y();
            }
        }
    }

    public final void Z(Throwable th) {
        rz rzVar = this.H;
        ie0 ie0Var = nz.a;
        dx1 dx1Var = (dx1) rzVar;
        dx1Var.getClass();
        mz mzVar = (mz) dt.M(dx1Var, ie0Var);
        if (mzVar == null) {
            throw th;
        }
        ou.H(th, new h6((Object) mzVar, (Object) this, (byte) 11));
        throw th;
    }

    @Override // defpackage.hy
    public final void a() {
        z41 z41Var = this.N;
        if (z41Var != null) {
            z41Var.a();
        }
        ln1 ln1Var = this.L;
        pn1 pn1Var = ln1Var.c.C;
        for (pn1 pn1Var2 = ln1Var.d; !uz0.g(pn1Var2, pn1Var) && pn1Var2 != null; pn1Var2 = pn1Var2.C) {
            pn1Var2.i1();
        }
    }

    public final void a0(e90 e90Var) {
        if (uz0.g(this.E, e90Var)) {
            return;
        }
        this.E = e90Var;
        F();
        l41 l41VarU = u();
        if (l41VarU != null) {
            l41VarU.D();
        } else {
            t6 t6Var = this.u;
            if (t6Var != null) {
                t6Var.invalidate();
            }
        }
        E();
        for (qg1 qg1Var = this.L.f; qg1Var != null; qg1Var = qg1Var.m) {
            qg1Var.a();
        }
    }

    @Override // defpackage.hy
    public final void b() {
        z5 z5VarM7getAutofillManager;
        z41 z41Var = this.N;
        if (z41Var != null) {
            z41Var.i(true);
        }
        this.U = true;
        qg1 qg1Var = this.L.e;
        for (qg1 qg1Var2 = qg1Var; qg1Var2 != null; qg1Var2 = qg1Var2.l) {
            if (qg1Var2.u) {
                qg1Var2.E0();
            }
        }
        for (qg1 qg1Var3 = qg1Var; qg1Var3 != null; qg1Var3 = qg1Var3.l) {
            if (qg1Var3.u) {
                qg1Var3.G0();
            }
        }
        while (qg1Var != null) {
            if (qg1Var.u) {
                qg1Var.A0();
            }
            qg1Var = qg1Var.l;
        }
        if (I()) {
            this.y = null;
            this.x = false;
        }
        t6 t6Var = this.u;
        if (t6Var == null || (z5VarM7getAutofillManager = t6Var.getAutofillManager()) == null || !z5VarM7getAutofillManager.o.e(this.i)) {
            return;
        }
        z5VarM7getAutofillManager.h.K(z5VarM7getAutofillManager.j, this.i, false);
    }

    public final void b0(int i) {
        l41 l41VarU;
        l41 l41VarU2;
        int i2 = this.T;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (l41VarU2 = u()) != null) {
                l41VarU2.b0(l41VarU2.T + 1);
            }
            if (i == 0 && this.T > 0 && (l41VarU = u()) != null) {
                l41VarU.b0(l41VarU.T - 1);
            }
            this.T = i;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 5661. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void c(defpackage.rg1 r24) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l41.c(rg1):void");
    }

    public final void c0(l41 l41Var) {
        if (uz0.g(l41Var, this.o)) {
            return;
        }
        this.o = l41Var;
        p41 p41Var = this.M;
        if (l41Var != null) {
            if (p41Var.q == null) {
                p41Var.q = new gd1(p41Var);
            }
            ln1 ln1Var = this.L;
            pn1 pn1Var = ln1Var.c.C;
            for (pn1 pn1Var2 = ln1Var.d; !uz0.g(pn1Var2, pn1Var) && pn1Var2 != null; pn1Var2 = pn1Var2.C) {
                pn1Var2.Q0();
            }
        } else {
            p41Var.q = null;
            p41Var.f = false;
            p41Var.e = false;
        }
        F();
    }

    public final void d(t6 t6Var) {
        l41 l41Var;
        rg2 rg2VarW;
        if (this.u != null) {
            ax0.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        l41 l41Var2 = this.t;
        if (l41Var2 != null && !uz0.g(l41Var2.u, t6Var)) {
            l41 l41VarU = u();
            t6 t6Var2 = l41VarU != null ? l41VarU.u : null;
            String strG = g(0);
            l41 l41Var3 = this.t;
            ax0.b("Attaching to a different owner(" + t6Var + ") than the parent's owner(" + t6Var2 + "). This tree: " + strG + " Parent tree: " + (l41Var3 != null ? l41Var3.g(0) : null));
        }
        l41 l41VarU2 = u();
        p41 p41Var = this.M;
        if (l41VarU2 == null) {
            p41Var.p.z = true;
            t6Var.getRectManager().g(this);
            gd1 gd1Var = p41Var.q;
            if (gd1Var != null) {
                gd1Var.x = fd1.h;
            }
        }
        ln1 ln1Var = this.L;
        ln1Var.d.D = l41VarU2 != null ? l41VarU2.L.c : null;
        this.u = t6Var;
        this.v = (l41VarU2 != null ? l41VarU2.v : -1) + 1;
        rg1 rg1Var = this.R;
        if (rg1Var != null) {
            c(rg1Var);
        }
        this.R = null;
        t6Var.getLayoutNodes().h(this.i, this);
        l41 l41Var4 = this.t;
        if (l41Var4 == null || (l41Var = l41Var4.o) == null) {
            l41Var = this.o;
        }
        c0(l41Var);
        if (this.o == null && ln1Var.c(512)) {
            c0(this);
        }
        if (!this.U) {
            for (qg1 qg1Var = ln1Var.f; qg1Var != null; qg1Var = qg1Var.m) {
                qg1Var.z0();
            }
        }
        uj1 uj1Var = (uj1) this.q.i;
        Object[] objArr = uj1Var.h;
        int i = uj1Var.j;
        for (int i2 = 0; i2 < i; i2++) {
            ((l41) objArr[i2]).d(t6Var);
        }
        if (!this.U) {
            ln1Var.e();
        }
        F();
        if (l41VarU2 != null) {
            l41VarU2.F();
        }
        p41Var.j();
        if (!this.U && ln1Var.c(8)) {
            G();
        }
        z5 z5VarM7getAutofillManager = t6Var.getAutofillManager();
        if (z5VarM7getAutofillManager == null || (rg2VarW = w()) == null || !rg2VarW.h.b(ah2.r)) {
            return;
        }
        z5VarM7getAutofillManager.o.a(this.i);
        z5VarM7getAutofillManager.h.K(z5VarM7getAutofillManager.j, this.i, true);
    }

    public final void d0(ze1 ze1Var) {
        if (uz0.g(this.C, ze1Var)) {
            return;
        }
        this.C = ze1Var;
        ix0 ix0Var = this.D;
        if (ix0Var != null) {
            ((lu1) ix0Var.j).setValue(ze1Var);
        }
        F();
    }

    public final void e() {
        this.J = this.I;
        j41 j41Var = j41.j;
        this.I = j41Var;
        uj1 uj1VarZ = z();
        Object[] objArr = uj1VarZ.h;
        int i = uj1VarZ.j;
        for (int i2 = 0; i2 < i; i2++) {
            l41 l41Var = (l41) objArr[i2];
            if (l41Var.I != j41Var) {
                l41Var.e();
            }
        }
    }

    public final void e0(rg1 rg1Var) {
        if (this.h && this.Q != og1.h) {
            ax0.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.U) {
            ax0.a("modifier is updated when deactivated");
        }
        if (!I()) {
            this.R = rg1Var;
            return;
        }
        c(rg1Var);
        if (this.x) {
            G();
        }
    }

    public final void f() {
        this.J = this.I;
        this.I = j41.j;
        uj1 uj1VarZ = z();
        Object[] objArr = uj1VarZ.h;
        int i = uj1VarZ.j;
        for (int i2 = 0; i2 < i; i2++) {
            l41 l41Var = (l41) objArr[i2];
            if (l41Var.I == j41.i) {
                l41Var.f();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [qg1] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [qg1] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [uj1] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [uj1] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void f0(v43 v43Var) {
        if (uz0.g(this.G, v43Var)) {
            return;
        }
        this.G = v43Var;
        qg1 qg1Var = this.L.f;
        if ((qg1Var.k & 16) != 0) {
            while (qg1Var != null) {
                if ((qg1Var.j & 16) != 0) {
                    ?? R = qg1Var;
                    ?? uj1Var = 0;
                    while (R != 0) {
                        if (R instanceof c12) {
                            ((c12) R).d0();
                        } else if ((R.j & 16) != 0 && (R instanceof k80)) {
                            qg1 qg1Var2 = ((k80) R).w;
                            int i = 0;
                            R = R;
                            uj1Var = uj1Var;
                            while (qg1Var2 != null) {
                                if ((qg1Var2.j & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        uj1Var = uj1Var;
                                        R = qg1Var2;
                                    } else {
                                        if (uj1Var == 0) {
                                            uj1Var = new uj1(new qg1[16]);
                                        }
                                        if (R != 0) {
                                            uj1Var.b(R);
                                            R = 0;
                                        }
                                        uj1Var.b(qg1Var2);
                                    }
                                }
                                qg1Var2 = qg1Var2.m;
                                R = R;
                                uj1Var = uj1Var;
                            }
                            if (i != 1) {
                            }
                        }
                        R = cu.R(uj1Var);
                    }
                }
                if ((qg1Var.k & 16) == 0) {
                    return;
                } else {
                    qg1Var = qg1Var.m;
                }
            }
        }
    }

    public final String g(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        uj1 uj1VarZ = z();
        Object[] objArr = uj1VarZ.h;
        int i3 = uj1VarZ.j;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((l41) objArr[i4]).g(i + 1));
        }
        String string = sb.toString();
        return i == 0 ? string.substring(0, string.length() - 1) : string;
    }

    public final void g0() {
        if (this.p <= 0 || !this.s) {
            return;
        }
        this.s = false;
        uj1 uj1Var = this.r;
        if (uj1Var == null) {
            uj1Var = new uj1(new l41[16]);
            this.r = uj1Var;
        }
        uj1Var.g();
        uj1 uj1Var2 = (uj1) this.q.i;
        Object[] objArr = uj1Var2.h;
        int i = uj1Var2.j;
        for (int i2 = 0; i2 < i; i2++) {
            l41 l41Var = (l41) objArr[i2];
            if (l41Var.h) {
                uj1Var.c(uj1Var.j, l41Var.z());
            } else {
                uj1Var.b(l41Var);
            }
        }
        p41 p41Var = this.M;
        p41Var.p.G = true;
        gd1 gd1Var = p41Var.q;
        if (gd1Var != null) {
            gd1Var.A = true;
        }
    }

    public final void h() {
        m41 m41Var;
        t6 t6Var = this.u;
        if (t6Var == null) {
            l41 l41VarU = u();
            ax0.c("Cannot detach node that is already detached!  Tree: " + (l41VarU != null ? l41VarU.g(0) : null));
            wg.k();
            return;
        }
        l41 l41VarU2 = u();
        p41 p41Var = this.M;
        if (l41VarU2 != null) {
            l41VarU2.D();
            l41VarU2.F();
            ye1 ye1Var = p41Var.p;
            j41 j41Var = j41.j;
            ye1Var.s = j41Var;
            gd1 gd1Var = p41Var.q;
            if (gd1Var != null) {
                gd1Var.q = j41Var;
            }
        }
        m41 m41Var2 = p41Var.p.E;
        m41Var2.b = true;
        m41Var2.c = false;
        m41Var2.e = false;
        m41Var2.d = false;
        m41Var2.f = false;
        m41Var2.g = false;
        m41Var2.h = null;
        gd1 gd1Var2 = p41Var.q;
        if (gd1Var2 != null && (m41Var = gd1Var2.y) != null) {
            m41Var.b = true;
            m41Var.c = false;
            m41Var.e = false;
            m41Var.d = false;
            m41Var.f = false;
            m41Var.g = false;
            m41Var.h = null;
        }
        ln1 ln1Var = this.L;
        qg1 qg1Var = ln1Var.e;
        pn1 pn1Var = ln1Var.c.C;
        for (pn1 pn1Var2 = ln1Var.d; !uz0.g(pn1Var2, pn1Var) && pn1Var2 != null; pn1Var2 = pn1Var2.C) {
            pn1Var2.o1();
            if (pn1Var2.B.J()) {
                pn1Var2.j1();
            }
        }
        for (qg1 qg1Var2 = qg1Var; qg1Var2 != null; qg1Var2 = qg1Var2.l) {
            if (qg1Var2.u) {
                qg1Var2.G0();
            }
        }
        this.w = true;
        uj1 uj1Var = (uj1) this.q.i;
        Object[] objArr = uj1Var.h;
        int i = uj1Var.j;
        for (int i2 = 0; i2 < i; i2++) {
            ((l41) objArr[i2]).h();
        }
        this.w = false;
        while (qg1Var != null) {
            if (qg1Var.u) {
                qg1Var.A0();
            }
            qg1Var = qg1Var.l;
        }
        t6Var.getLayoutNodes().g(this.i);
        we1 we1Var = t6Var.W;
        eg egVar = we1Var.b;
        ((g2) egVar.i).K(this);
        ((g2) egVar.j).K(this);
        ((g2) egVar.k).K(this);
        ((uj1) we1Var.e.i).j(this);
        t6Var.Q = true;
        z5 z5VarM7getAutofillManager = t6Var.getAutofillManager();
        if (z5VarM7getAutofillManager != null && z5VarM7getAutofillManager.o.e(this.i)) {
            z5VarM7getAutofillManager.h.K(z5VarM7getAutofillManager.j, this.i, false);
        }
        t6Var.getRectManager().h(this);
        this.u = null;
        c0(null);
        this.v = 0;
        ye1 ye1Var2 = p41Var.p;
        ye1Var2.p = Integer.MAX_VALUE;
        ye1Var2.o = Integer.MAX_VALUE;
        ye1Var2.z = false;
        gd1 gd1Var3 = p41Var.q;
        if (gd1Var3 != null) {
            gd1Var3.p = Integer.MAX_VALUE;
            gd1Var3.o = Integer.MAX_VALUE;
            gd1Var3.x = fd1.j;
        }
        if (ln1Var.c(8)) {
            rg2 rg2Var = this.y;
            this.y = null;
            this.x = false;
            t6Var.getSemanticsOwner().b(this, rg2Var);
            t6Var.y();
        }
    }

    public final void i(wq wqVar, cs0 cs0Var) {
        try {
            this.L.d.O0(wqVar, cs0Var);
        } catch (Throwable th) {
            Z(th);
            throw null;
        }
    }

    public final void k() {
        if (this.o != null) {
            U(this, false, 5);
        } else {
            W(this, false, 5);
        }
        ye1 ye1Var = this.M.p;
        k00 k00Var = ye1Var.q ? new k00(ye1Var.k) : null;
        t6 t6Var = this.u;
        if (k00Var != null) {
            if (t6Var != null) {
                t6Var.t(this, k00Var.a);
            }
        } else if (t6Var != null) {
            t6Var.s(true);
        }
    }

    public final List l() {
        gd1 gd1Var = this.M.q;
        gd1Var.getClass();
        uj1 uj1Var = gd1Var.z;
        p41 p41Var = gd1Var.m;
        p41Var.a.n();
        if (!gd1Var.A) {
            return uj1Var.f();
        }
        l41 l41Var = p41Var.a;
        uj1 uj1VarZ = l41Var.z();
        Object[] objArr = uj1VarZ.h;
        int i = uj1VarZ.j;
        for (int i2 = 0; i2 < i; i2++) {
            l41 l41Var2 = (l41) objArr[i2];
            int i3 = uj1Var.j;
            gd1 gd1Var2 = l41Var2.M.q;
            gd1Var2.getClass();
            if (i3 <= i2) {
                uj1Var.b(gd1Var2);
            } else {
                Object[] objArr2 = uj1Var.h;
                Object obj = objArr2[i2];
                objArr2[i2] = gd1Var2;
            }
        }
        uj1Var.l(((uj1) ((dj1) l41Var.n()).i).j, uj1Var.j);
        gd1Var.A = false;
        return uj1Var.f();
    }

    public final List m() {
        return this.M.p.q0();
    }

    public final List n() {
        return z().f();
    }

    public final List o() {
        return ((uj1) this.q.i).f();
    }

    public final boolean p() {
        return this.M.p.C;
    }

    public final boolean q() {
        return this.M.p.B;
    }

    public final j41 r() {
        return this.M.p.s;
    }

    public final j41 s() {
        j41 j41Var;
        gd1 gd1Var = this.M.q;
        return (gd1Var == null || (j41Var = gd1Var.q) == null) ? j41.j : j41Var;
    }

    public final ix0 t() {
        ix0 ix0Var = this.D;
        if (ix0Var != null) {
            return ix0Var;
        }
        ix0 ix0Var2 = new ix0(this, this.C);
        this.D = ix0Var2;
        return ix0Var2;
    }

    public final String toString() {
        return es.c0(this) + " children: " + ((uj1) ((dj1) n()).i).j + " measurePolicy: " + this.C + " deactivated: " + this.U + " isVirtual: " + this.h + " isPlaced: " + J();
    }

    public final l41 u() {
        l41 l41Var = this.t;
        while (l41Var != null && l41Var.h) {
            l41Var = l41Var.t;
        }
        return l41Var;
    }

    public final int v() {
        return this.M.p.p;
    }

    public final rg2 w() {
        if (I() && !this.U && this.L.c(8)) {
            return this.y;
        }
        return null;
    }

    public final float x() {
        return this.M.p.L;
    }

    public final uj1 y() {
        boolean z = this.B;
        uj1 uj1Var = this.A;
        if (z) {
            uj1Var.g();
            uj1Var.c(uj1Var.j, z());
            Arrays.sort(uj1Var.h, 0, uj1Var.j, Y);
            this.B = false;
        }
        return uj1Var;
    }

    public final uj1 z() {
        g0();
        if (this.p == 0) {
            return (uj1) this.q.i;
        }
        uj1 uj1Var = this.r;
        uj1Var.getClass();
        return uj1Var;
    }

    public l41(int i) {
        this(tg2.a.addAndGet(1), (i & 1) == 0);
    }
}
