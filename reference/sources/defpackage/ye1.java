package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ye1 extends ny1 implements ue1, i5, eh1 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean H;
    public final xe1 J;
    public final xe1 K;
    public float L;
    public boolean M;
    public vp0 N;
    public float P;
    public final xe1 Q;
    public boolean R;
    public final p41 m;
    public boolean n;
    public boolean q;
    public boolean r;
    public boolean t;
    public vp0 v;
    public float w;
    public Object y;
    public boolean z;
    public int o = Integer.MAX_VALUE;
    public int p = Integer.MAX_VALUE;
    public j41 s = j41.j;
    public long u = 0;
    public boolean x = true;
    public final m41 E = new m41(this, (byte) 0);
    public final uj1 F = new uj1(new ye1[16]);
    public boolean G = true;
    public long I = l00.b(0, 0, 0, 0, 15);
    public long O = 0;

    /* JADX WARN: Type inference failed for: r2v3, types: [xe1] */
    /* JADX WARN: Type inference failed for: r2v4, types: [xe1] */
    /* JADX WARN: Type inference failed for: r7v4, types: [xe1] */
    public ye1(p41 p41Var) {
        this.m = p41Var;
        final byte b = 1;
        final byte b2 = 0;
        this.J = new kp0(this) { // from class: xe1
            public final /* synthetic */ ye1 i;

            {
                this.i = this;
            }

            /* JADX WARN: Code duplicated, block: B:37:0x00fa  */
            @Override // defpackage.kp0
            public final Object a() {
                boolean z;
                byte b3 = b2;
                fj1 fj1Var = null;
                j23 j23Var = j23.a;
                ye1 ye1Var = this.i;
                switch (b3) {
                    case 0:
                        ye1Var.m.a().e(ye1Var.I);
                        break;
                    case 1:
                        p41 p41Var2 = ye1Var.m;
                        p41Var2.i = 0;
                        l41 l41Var = p41Var2.a;
                        uj1 uj1VarZ = l41Var.z();
                        Object[] objArr = uj1VarZ.h;
                        int i = uj1VarZ.j;
                        for (int i2 = 0; i2 < i; i2++) {
                            ye1 ye1Var2 = ((l41) objArr[i2]).M.p;
                            ye1Var2.o = ye1Var2.p;
                            ye1Var2.p = Integer.MAX_VALUE;
                            ye1Var2.A = false;
                            if (ye1Var2.s == j41.i) {
                                ye1Var2.s = j41.j;
                            }
                        }
                        uj1 uj1VarZ2 = l41Var.z();
                        Object[] objArr2 = uj1VarZ2.h;
                        int i3 = uj1VarZ2.j;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((l41) objArr2[i4]).M.p.E.d = false;
                        }
                        dj1 dj1Var = (dj1) l41Var.n();
                        int i5 = ((uj1) dj1Var.i).j;
                        for (int i6 = 0; i6 < i5; i6++) {
                            l41 l41Var2 = (l41) dj1Var.get(i6);
                            if (l41Var2.L.d.v) {
                                if (fj1Var == null) {
                                    fj1Var = new fj1();
                                }
                                fj1Var.a(l41Var2);
                            }
                            l41Var2.L.d.v = ye1Var.p().v;
                        }
                        ye1Var.p().C0().b();
                        dj1 dj1Var2 = (dj1) l41Var.n();
                        int i7 = ((uj1) dj1Var2.i).j;
                        for (int i8 = 0; i8 < i7; i8++) {
                            l41 l41Var3 = (l41) dj1Var2.get(i8);
                            if (fj1Var != null) {
                                z = true;
                                if (!fj1Var.e(l41Var3)) {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            l41Var3.L.d.v = z;
                        }
                        uj1 uj1VarZ3 = l41Var.z();
                        Object[] objArr3 = uj1VarZ3.h;
                        int i9 = uj1VarZ3.j;
                        for (int i10 = 0; i10 < i9; i10++) {
                            l41 l41Var4 = (l41) objArr3[i10];
                            p41 p41Var3 = l41Var4.M;
                            if (p41Var3.p.o != l41Var4.v()) {
                                l41Var.P();
                                l41Var.D();
                                if (l41Var4.v() == Integer.MAX_VALUE) {
                                    if (p41Var3.c || ys.R(l41Var4)) {
                                        gd1 gd1Var = p41Var3.q;
                                        gd1Var.getClass();
                                        gd1Var.s0(false);
                                    }
                                    p41Var3.p.t0();
                                }
                            }
                        }
                        uj1 uj1VarZ4 = l41Var.z();
                        Object[] objArr4 = uj1VarZ4.h;
                        int i11 = uj1VarZ4.j;
                        for (int i12 = 0; i12 < i11; i12++) {
                            m41 m41Var = ((l41) objArr4[i12]).M.p.E;
                            m41Var.e = m41Var.d;
                        }
                        break;
                    default:
                        p41 p41Var4 = ye1Var.m;
                        pn1 pn1Var = p41Var4.a().D;
                        my1 placementScope = pn1Var != null ? pn1Var.w : o41.a(p41Var4.a).getPlacementScope();
                        vp0 vp0Var = ye1Var.N;
                        if (vp0Var == null) {
                            pn1 pn1VarA = p41Var4.a();
                            long j = ye1Var.O;
                            float f = ye1Var.P;
                            placementScope.g(pn1VarA);
                            pn1VarA.n0(ny0.c(j, pn1VarA.l), f, null);
                        } else {
                            pn1 pn1VarA2 = p41Var4.a();
                            long j2 = ye1Var.O;
                            float f2 = ye1Var.P;
                            placementScope.g(pn1VarA2);
                            pn1VarA2.n0(ny0.c(j2, pn1VarA2.l), f2, vp0Var);
                        }
                        break;
                }
                return j23Var;
            }
        };
        this.K = new kp0(this) { // from class: xe1
            public final /* synthetic */ ye1 i;

            {
                this.i = this;
            }

            /* JADX WARN: Code duplicated, block: B:37:0x00fa  */
            @Override // defpackage.kp0
            public final Object a() {
                boolean z;
                byte b3 = b;
                fj1 fj1Var = null;
                j23 j23Var = j23.a;
                ye1 ye1Var = this.i;
                switch (b3) {
                    case 0:
                        ye1Var.m.a().e(ye1Var.I);
                        break;
                    case 1:
                        p41 p41Var2 = ye1Var.m;
                        p41Var2.i = 0;
                        l41 l41Var = p41Var2.a;
                        uj1 uj1VarZ = l41Var.z();
                        Object[] objArr = uj1VarZ.h;
                        int i = uj1VarZ.j;
                        for (int i2 = 0; i2 < i; i2++) {
                            ye1 ye1Var2 = ((l41) objArr[i2]).M.p;
                            ye1Var2.o = ye1Var2.p;
                            ye1Var2.p = Integer.MAX_VALUE;
                            ye1Var2.A = false;
                            if (ye1Var2.s == j41.i) {
                                ye1Var2.s = j41.j;
                            }
                        }
                        uj1 uj1VarZ2 = l41Var.z();
                        Object[] objArr2 = uj1VarZ2.h;
                        int i3 = uj1VarZ2.j;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((l41) objArr2[i4]).M.p.E.d = false;
                        }
                        dj1 dj1Var = (dj1) l41Var.n();
                        int i5 = ((uj1) dj1Var.i).j;
                        for (int i6 = 0; i6 < i5; i6++) {
                            l41 l41Var2 = (l41) dj1Var.get(i6);
                            if (l41Var2.L.d.v) {
                                if (fj1Var == null) {
                                    fj1Var = new fj1();
                                }
                                fj1Var.a(l41Var2);
                            }
                            l41Var2.L.d.v = ye1Var.p().v;
                        }
                        ye1Var.p().C0().b();
                        dj1 dj1Var2 = (dj1) l41Var.n();
                        int i7 = ((uj1) dj1Var2.i).j;
                        for (int i8 = 0; i8 < i7; i8++) {
                            l41 l41Var3 = (l41) dj1Var2.get(i8);
                            if (fj1Var != null) {
                                z = true;
                                if (!fj1Var.e(l41Var3)) {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            l41Var3.L.d.v = z;
                        }
                        uj1 uj1VarZ3 = l41Var.z();
                        Object[] objArr3 = uj1VarZ3.h;
                        int i9 = uj1VarZ3.j;
                        for (int i10 = 0; i10 < i9; i10++) {
                            l41 l41Var4 = (l41) objArr3[i10];
                            p41 p41Var3 = l41Var4.M;
                            if (p41Var3.p.o != l41Var4.v()) {
                                l41Var.P();
                                l41Var.D();
                                if (l41Var4.v() == Integer.MAX_VALUE) {
                                    if (p41Var3.c || ys.R(l41Var4)) {
                                        gd1 gd1Var = p41Var3.q;
                                        gd1Var.getClass();
                                        gd1Var.s0(false);
                                    }
                                    p41Var3.p.t0();
                                }
                            }
                        }
                        uj1 uj1VarZ4 = l41Var.z();
                        Object[] objArr4 = uj1VarZ4.h;
                        int i11 = uj1VarZ4.j;
                        for (int i12 = 0; i12 < i11; i12++) {
                            m41 m41Var = ((l41) objArr4[i12]).M.p.E;
                            m41Var.e = m41Var.d;
                        }
                        break;
                    default:
                        p41 p41Var4 = ye1Var.m;
                        pn1 pn1Var = p41Var4.a().D;
                        my1 placementScope = pn1Var != null ? pn1Var.w : o41.a(p41Var4.a).getPlacementScope();
                        vp0 vp0Var = ye1Var.N;
                        if (vp0Var == null) {
                            pn1 pn1VarA = p41Var4.a();
                            long j = ye1Var.O;
                            float f = ye1Var.P;
                            placementScope.g(pn1VarA);
                            pn1VarA.n0(ny0.c(j, pn1VarA.l), f, null);
                        } else {
                            pn1 pn1VarA2 = p41Var4.a();
                            long j2 = ye1Var.O;
                            float f2 = ye1Var.P;
                            placementScope.g(pn1VarA2);
                            pn1VarA2.n0(ny0.c(j2, pn1VarA2.l), f2, vp0Var);
                        }
                        break;
                }
                return j23Var;
            }
        };
        final byte b3 = 2;
        this.Q = new kp0(this) { // from class: xe1
            public final /* synthetic */ ye1 i;

            {
                this.i = this;
            }

            /* JADX WARN: Code duplicated, block: B:37:0x00fa  */
            @Override // defpackage.kp0
            public final Object a() {
                boolean z;
                byte b4 = b3;
                fj1 fj1Var = null;
                j23 j23Var = j23.a;
                ye1 ye1Var = this.i;
                switch (b4) {
                    case 0:
                        ye1Var.m.a().e(ye1Var.I);
                        break;
                    case 1:
                        p41 p41Var2 = ye1Var.m;
                        p41Var2.i = 0;
                        l41 l41Var = p41Var2.a;
                        uj1 uj1VarZ = l41Var.z();
                        Object[] objArr = uj1VarZ.h;
                        int i = uj1VarZ.j;
                        for (int i2 = 0; i2 < i; i2++) {
                            ye1 ye1Var2 = ((l41) objArr[i2]).M.p;
                            ye1Var2.o = ye1Var2.p;
                            ye1Var2.p = Integer.MAX_VALUE;
                            ye1Var2.A = false;
                            if (ye1Var2.s == j41.i) {
                                ye1Var2.s = j41.j;
                            }
                        }
                        uj1 uj1VarZ2 = l41Var.z();
                        Object[] objArr2 = uj1VarZ2.h;
                        int i3 = uj1VarZ2.j;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((l41) objArr2[i4]).M.p.E.d = false;
                        }
                        dj1 dj1Var = (dj1) l41Var.n();
                        int i5 = ((uj1) dj1Var.i).j;
                        for (int i6 = 0; i6 < i5; i6++) {
                            l41 l41Var2 = (l41) dj1Var.get(i6);
                            if (l41Var2.L.d.v) {
                                if (fj1Var == null) {
                                    fj1Var = new fj1();
                                }
                                fj1Var.a(l41Var2);
                            }
                            l41Var2.L.d.v = ye1Var.p().v;
                        }
                        ye1Var.p().C0().b();
                        dj1 dj1Var2 = (dj1) l41Var.n();
                        int i7 = ((uj1) dj1Var2.i).j;
                        for (int i8 = 0; i8 < i7; i8++) {
                            l41 l41Var3 = (l41) dj1Var2.get(i8);
                            if (fj1Var != null) {
                                z = true;
                                if (!fj1Var.e(l41Var3)) {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            l41Var3.L.d.v = z;
                        }
                        uj1 uj1VarZ3 = l41Var.z();
                        Object[] objArr3 = uj1VarZ3.h;
                        int i9 = uj1VarZ3.j;
                        for (int i10 = 0; i10 < i9; i10++) {
                            l41 l41Var4 = (l41) objArr3[i10];
                            p41 p41Var3 = l41Var4.M;
                            if (p41Var3.p.o != l41Var4.v()) {
                                l41Var.P();
                                l41Var.D();
                                if (l41Var4.v() == Integer.MAX_VALUE) {
                                    if (p41Var3.c || ys.R(l41Var4)) {
                                        gd1 gd1Var = p41Var3.q;
                                        gd1Var.getClass();
                                        gd1Var.s0(false);
                                    }
                                    p41Var3.p.t0();
                                }
                            }
                        }
                        uj1 uj1VarZ4 = l41Var.z();
                        Object[] objArr4 = uj1VarZ4.h;
                        int i11 = uj1VarZ4.j;
                        for (int i12 = 0; i12 < i11; i12++) {
                            m41 m41Var = ((l41) objArr4[i12]).M.p.E;
                            m41Var.e = m41Var.d;
                        }
                        break;
                    default:
                        p41 p41Var4 = ye1Var.m;
                        pn1 pn1Var = p41Var4.a().D;
                        my1 placementScope = pn1Var != null ? pn1Var.w : o41.a(p41Var4.a).getPlacementScope();
                        vp0 vp0Var = ye1Var.N;
                        if (vp0Var == null) {
                            pn1 pn1VarA = p41Var4.a();
                            long j = ye1Var.O;
                            float f = ye1Var.P;
                            placementScope.g(pn1VarA);
                            pn1VarA.n0(ny0.c(j, pn1VarA.l), f, null);
                        } else {
                            pn1 pn1VarA2 = p41Var4.a();
                            long j2 = ye1Var.O;
                            float f2 = ye1Var.P;
                            placementScope.g(pn1VarA2);
                            pn1VarA2.n0(ny0.c(j2, pn1VarA2.l), f2, vp0Var);
                        }
                        break;
                }
                return j23Var;
            }
        };
    }

    public final boolean A0(long j) {
        p41 p41Var = this.m;
        l41 l41Var = p41Var.a;
        l41 l41Var2 = p41Var.a;
        try {
            if (l41Var.U) {
                ax0.a("measure is called on a deactivated node");
            }
            t6 t6VarA = o41.a(l41Var2);
            l41 l41VarU = l41Var2.u();
            boolean z = true;
            l41Var2.K = l41Var2.K || (l41VarU != null && l41VarU.K);
            if (!l41Var2.q() && k00.c(this.k, j)) {
                t6VarA.i(l41Var2, false);
                l41Var2.Y();
                return false;
            }
            this.E.f = false;
            uj1 uj1VarZ = l41Var2.z();
            Object[] objArr = uj1VarZ.h;
            int i = uj1VarZ.j;
            for (int i2 = 0; i2 < i; i2++) {
                ((l41) objArr[i2]).M.p.E.c = false;
            }
            this.q = true;
            long j2 = p41Var.a().j;
            p0(j);
            h41 h41Var = p41Var.d;
            h41 h41Var2 = h41.l;
            if (h41Var != h41Var2) {
                ax0.b("layout state is not idle before measure starts");
            }
            this.I = j;
            h41 h41Var3 = h41.h;
            p41Var.d = h41Var3;
            this.B = false;
            it1 snapshotObserver = o41.a(l41Var2).getSnapshotObserver();
            snapshotObserver.a.d(l41Var2, snapshotObserver.c, this.J);
            if (p41Var.d == h41Var3) {
                this.C = true;
                this.D = true;
                p41Var.d = h41Var2;
            }
            if (vy0.a(p41Var.a().j, j2) && p41Var.a().h == this.h && p41Var.a().i == this.i) {
                z = false;
            }
            o0((((long) p41Var.a().h) << 32) | (((long) p41Var.a().i) & 4294967295L));
            return z;
        } catch (Throwable th) {
            l41Var.Z(th);
            throw null;
        }
    }

    public final void B0() {
        p41 p41Var = this.m;
        l41 l41Var = p41Var.a;
        l41 l41Var2 = p41Var.a;
        if (!l41Var.J() || p41Var.l <= 0) {
            return;
        }
        p41 p41Var2 = l41Var2.M;
        if ((p41Var2.j || p41Var2.k) && !p41Var2.p.C) {
            l41Var2.V(false);
        }
        uj1 uj1VarZ = l41Var2.z();
        Object[] objArr = uj1VarZ.h;
        int i = uj1VarZ.j;
        for (int i2 = 0; i2 < i; i2++) {
            ((l41) objArr[i2]).M.p.B0();
        }
    }

    @Override // defpackage.ue1
    public final int U(int i) {
        p41 p41Var = this.m;
        if (!ys.R(p41Var.a)) {
            x0();
            return p41Var.a().U(i);
        }
        gd1 gd1Var = p41Var.q;
        gd1Var.getClass();
        return gd1Var.U(i);
    }

    @Override // defpackage.i5
    public final int W() {
        return this.p;
    }

    @Override // defpackage.i5
    public final void Y() {
        l41.W(this.m.a, false, 7);
    }

    @Override // defpackage.i5
    public final m41 a() {
        return this.E;
    }

    @Override // defpackage.ue1
    public final int a0(int i) {
        p41 p41Var = this.m;
        if (!ys.R(p41Var.a)) {
            x0();
            return p41Var.a().a0(i);
        }
        gd1 gd1Var = p41Var.q;
        gd1Var.getClass();
        return gd1Var.a0(i);
    }

    @Override // defpackage.ue1
    public final int d0(int i) {
        p41 p41Var = this.m;
        if (!ys.R(p41Var.a)) {
            x0();
            return p41Var.a().d0(i);
        }
        gd1 gd1Var = p41Var.q;
        gd1Var.getClass();
        return gd1Var.d0(i);
    }

    @Override // defpackage.ue1
    public final ny1 e(long j) {
        j41 j41Var;
        p41 p41Var = this.m;
        l41 l41Var = p41Var.a;
        l41 l41Var2 = p41Var.a;
        j41 j41Var2 = l41Var.I;
        j41 j41Var3 = j41.j;
        if (j41Var2 == j41Var3) {
            l41Var.e();
        }
        if (ys.R(l41Var2)) {
            gd1 gd1Var = p41Var.q;
            gd1Var.getClass();
            gd1Var.q = j41Var3;
            gd1Var.e(j);
        }
        l41 l41VarU = l41Var2.u();
        if (l41VarU != null) {
            p41 p41Var2 = l41VarU.M;
            if (this.s != j41Var3 && !l41Var2.K) {
                ax0.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = p41Var2.d.ordinal();
            if (iOrdinal == 0) {
                j41Var = j41.h;
            } else {
                if (iOrdinal != 2) {
                    wg.o(p41Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                j41Var = j41.i;
            }
            this.s = j41Var;
        } else {
            this.s = j41Var3;
        }
        A0(j);
        return this;
    }

    @Override // defpackage.ue1
    public final int g(int i) {
        p41 p41Var = this.m;
        if (!ys.R(p41Var.a)) {
            x0();
            return p41Var.a().g(i);
        }
        gd1 gd1Var = p41Var.q;
        gd1Var.getClass();
        return gd1Var.g(i);
    }

    @Override // defpackage.ny1
    public final int h0(e5 e5Var) {
        p41 p41Var = this.m;
        l41 l41VarU = p41Var.a.u();
        h41 h41Var = l41VarU != null ? l41VarU.M.d : null;
        h41 h41Var2 = h41.h;
        m41 m41Var = this.E;
        if (h41Var == h41Var2) {
            m41Var.c = true;
        } else {
            l41 l41VarU2 = p41Var.a.u();
            if ((l41VarU2 != null ? l41VarU2.M.d : null) == h41.j) {
                m41Var.d = true;
            }
        }
        this.t = true;
        int iH0 = p41Var.a().h0(e5Var);
        this.t = false;
        return iH0;
    }

    @Override // defpackage.i5
    public final void j(p pVar) {
        uj1 uj1VarZ = this.m.a.z();
        Object[] objArr = uj1VarZ.h;
        int i = uj1VarZ.j;
        for (int i2 = 0; i2 < i; i2++) {
            pVar.h(((l41) objArr[i2]).M.p);
        }
    }

    @Override // defpackage.ny1
    public final int j0() {
        return this.m.a().j0();
    }

    @Override // defpackage.ny1
    public final int k0() {
        return this.m.a().k0();
    }

    @Override // defpackage.ny1, defpackage.ue1
    public final Object l() {
        return this.y;
    }

    @Override // defpackage.ny1
    public final void n0(long j, float f, vp0 vp0Var) {
        p41 p41Var = this.m;
        l41 l41Var = p41Var.a;
        l41 l41Var2 = p41Var.a;
        try {
            this.A = true;
            if ((!ny0.a(j, this.u) || vp0Var != this.v || this.R) && (p41Var.k || p41Var.j || this.R)) {
                this.C = true;
                this.R = false;
            }
            gd1 gd1Var = p41Var.q;
            if (gd1Var != null) {
                p41 p41Var2 = gd1Var.m;
                if (gd1Var.x == fd1.j && !ys.R(p41Var2.a)) {
                    p41Var2.c = true;
                }
            }
            gd1 gd1Var2 = p41Var.q;
            if (gd1Var2 != null && gd1Var2.q0()) {
                pn1 pn1Var = p41Var.a().D;
                my1 placementScope = pn1Var != null ? pn1Var.w : o41.a(l41Var2).getPlacementScope();
                gd1 gd1Var3 = p41Var.q;
                gd1Var3.getClass();
                l41 l41VarU = l41Var2.u();
                if (l41VarU != null) {
                    l41VarU.M.h = 0;
                }
                gd1Var3.p = Integer.MAX_VALUE;
                my1.i(placementScope, gd1Var3, (int) (j >> 32), (int) (4294967295L & j));
            }
            gd1 gd1Var4 = p41Var.q;
            if (gd1Var4 != null && !gd1Var4.s) {
                ax0.b("Error: Placement happened before lookahead.");
            }
            z0(j, f, vp0Var);
        } catch (Throwable th) {
            l41Var.Z(th);
            throw null;
        }
    }

    @Override // defpackage.eh1
    public final void o(boolean z) {
        p41 p41Var = this.m;
        if (z != p41Var.a().s) {
            p41Var.a().s = z;
            this.R = true;
        }
    }

    @Override // defpackage.i5
    public final gx0 p() {
        return this.m.a.L.c;
    }

    @Override // defpackage.i5
    public final i5 q() {
        p41 p41Var;
        l41 l41VarU = this.m.a.u();
        if (l41VarU == null || (p41Var = l41VarU.M) == null) {
            return null;
        }
        return p41Var.p;
    }

    public final List q0() {
        p41 p41Var = this.m;
        p41Var.a.g0();
        boolean z = this.G;
        uj1 uj1Var = this.F;
        if (!z) {
            return uj1Var.f();
        }
        l41 l41Var = p41Var.a;
        uj1 uj1VarZ = l41Var.z();
        Object[] objArr = uj1VarZ.h;
        int i = uj1VarZ.j;
        for (int i2 = 0; i2 < i; i2++) {
            l41 l41Var2 = (l41) objArr[i2];
            int i3 = uj1Var.j;
            ye1 ye1Var = l41Var2.M.p;
            if (i3 <= i2) {
                uj1Var.b(ye1Var);
            } else {
                Object[] objArr2 = uj1Var.h;
                Object obj = objArr2[i2];
                objArr2[i2] = ye1Var;
            }
        }
        uj1Var.l(((uj1) ((dj1) l41Var.n()).i).j, uj1Var.j);
        this.G = false;
        return uj1Var.f();
    }

    @Override // defpackage.i5
    public final void r() {
        boolean zA0;
        this.H = true;
        m41 m41Var = this.E;
        m41Var.h();
        boolean z = this.C;
        p41 p41Var = this.m;
        if (z) {
            uj1 uj1VarZ = p41Var.a.z();
            Object[] objArr = uj1VarZ.h;
            int i = uj1VarZ.j;
            for (int i2 = 0; i2 < i; i2++) {
                l41 l41Var = (l41) objArr[i2];
                boolean zQ = l41Var.q();
                p41 p41Var2 = l41Var.M;
                if (zQ && l41Var.r() == j41.h) {
                    ye1 ye1Var = p41Var2.p;
                    k00 k00Var = ye1Var.q ? new k00(ye1Var.k) : null;
                    if (k00Var != null) {
                        if (l41Var.I == j41.j) {
                            l41Var.e();
                        }
                        zA0 = p41Var2.p.A0(k00Var.a);
                    } else {
                        zA0 = false;
                    }
                    if (zA0) {
                        l41.W(p41Var.a, false, 7);
                    }
                }
            }
        }
        if (this.D || (!this.t && !p().v && this.C)) {
            this.C = false;
            h41 h41Var = p41Var.d;
            p41Var.d = h41.j;
            p41Var.g(false);
            l41 l41Var2 = p41Var.a;
            it1 snapshotObserver = o41.a(l41Var2).getSnapshotObserver();
            snapshotObserver.a.d(l41Var2, snapshotObserver.e, this.K);
            p41Var.d = h41Var;
            this.D = false;
        }
        if (m41Var.d) {
            m41Var.e = true;
        }
        if (m41Var.b && m41Var.e()) {
            m41Var.g();
        }
        this.H = false;
    }

    @Override // defpackage.i5
    public final void requestLayout() {
        this.m.a.V(false);
    }

    public final void s0() {
        boolean z = this.z;
        this.z = true;
        p41 p41Var = this.m;
        l41 l41Var = p41Var.a;
        ln1 ln1Var = l41Var.L;
        if (!z) {
            ln1Var.c.h1();
            o41.a(l41Var).getRectManager().g(p41Var.a);
            if (l41Var.q()) {
                l41.W(l41Var, true, 6);
            } else if (l41Var.M.e) {
                l41.U(l41Var, true, 6);
            }
        }
        pn1 pn1Var = ln1Var.c.C;
        for (pn1 pn1Var2 = ln1Var.d; !uz0.g(pn1Var2, pn1Var) && pn1Var2 != null; pn1Var2 = pn1Var2.C) {
            if (pn1Var2.Z) {
                pn1Var2.d1();
            }
        }
        uj1 uj1VarZ = l41Var.z();
        Object[] objArr = uj1VarZ.h;
        int i = uj1VarZ.j;
        for (int i2 = 0; i2 < i; i2++) {
            l41 l41Var2 = (l41) objArr[i2];
            if (l41Var2.v() != Integer.MAX_VALUE) {
                l41Var2.M.p.s0();
                l41.X(l41Var2);
            }
        }
    }

    public final void t0() {
        if (this.z) {
            this.z = false;
            p41 p41Var = this.m;
            l41 l41Var = p41Var.a;
            l41 l41Var2 = p41Var.a;
            o41.a(l41Var).getRectManager().h(l41Var2);
            ln1 ln1Var = l41Var2.L;
            pn1 pn1Var = ln1Var.c.C;
            for (pn1 pn1Var2 = ln1Var.d; !uz0.g(pn1Var2, pn1Var) && pn1Var2 != null; pn1Var2 = pn1Var2.C) {
                pn1Var2.j1();
                pn1Var2.o1();
            }
            uj1 uj1VarZ = l41Var2.z();
            Object[] objArr = uj1VarZ.h;
            int i = uj1VarZ.j;
            for (int i2 = 0; i2 < i; i2++) {
                ((l41) objArr[i2]).M.p.t0();
            }
        }
    }

    public final void x0() {
        j41 j41Var;
        p41 p41Var = this.m;
        l41.W(p41Var.a, false, 7);
        l41 l41Var = p41Var.a;
        l41 l41VarU = l41Var.u();
        if (l41VarU == null || l41Var.I != j41.j) {
            return;
        }
        int iOrdinal = l41VarU.M.d.ordinal();
        if (iOrdinal != 0) {
            j41Var = iOrdinal != 2 ? l41VarU.I : j41.i;
        } else {
            j41Var = j41.h;
        }
        l41Var.I = j41Var;
    }

    public final void y0() {
        this.M = true;
        p41 p41Var = this.m;
        l41 l41VarU = p41Var.a.u();
        float f = p().N;
        l41 l41Var = p41Var.a;
        ln1 ln1Var = l41Var.L;
        pn1 pn1Var = ln1Var.d;
        gx0 gx0Var = ln1Var.c;
        while (pn1Var != gx0Var) {
            pn1Var.getClass();
            e41 e41Var = (e41) pn1Var;
            f += e41Var.N;
            pn1Var = e41Var.C;
        }
        if (f != this.L) {
            this.L = f;
            if (l41VarU != null) {
                l41VarU.P();
                l41VarU.D();
            }
        }
        if (!p().v) {
            boolean z = this.z;
            if (!z || this.E.d()) {
                s0();
            }
            if (z) {
                l41Var.L.c.h1();
            } else {
                if (l41VarU != null) {
                    l41VarU.D();
                }
                if (this.n && l41VarU != null) {
                    l41VarU.V(false);
                }
            }
        }
        if (l41VarU != null) {
            p41 p41Var2 = l41VarU.M;
            if (!this.n && p41Var2.d == h41.j) {
                if (this.p != Integer.MAX_VALUE) {
                    ax0.b("Place was called on a node which was placed already");
                }
                int i = p41Var2.i;
                this.p = i;
                p41Var2.i = i + 1;
            }
        } else {
            this.p = 0;
        }
        r();
    }

    public final void z0(long j, float f, vp0 vp0Var) {
        p41 p41Var = this.m;
        l41 l41Var = p41Var.a;
        l41 l41Var2 = p41Var.a;
        if (l41Var.U) {
            ax0.a("place is called on a deactivated node");
        }
        p41Var.d = h41.j;
        this.u = j;
        this.w = f;
        this.v = vp0Var;
        this.M = false;
        t6 t6VarA = o41.a(l41Var2);
        if (this.C || !this.z) {
            this.E.g = false;
            p41Var.f(false);
            this.N = vp0Var;
            this.O = j;
            this.P = f;
            it1 snapshotObserver = t6VarA.getSnapshotObserver();
            snapshotObserver.a.d(l41Var2, snapshotObserver.f, this.Q);
        } else {
            pn1 pn1VarA = p41Var.a();
            pn1VarA.m1(ny0.c(j, pn1VarA.l), f, vp0Var);
            y0();
        }
        p41Var.d = h41.l;
        if (p41Var.a().v && (p41Var.k || p41Var.j)) {
            requestLayout();
        }
        this.r = true;
    }
}
