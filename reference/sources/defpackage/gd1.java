package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gd1 extends ny1 implements ue1, i5, eh1 {
    public boolean B;
    public final ed1 C;
    public Object E;
    public final ed1 G;
    public final ed1 H;
    public boolean I;
    public final p41 m;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean t;
    public k00 u;
    public vp0 w;
    public int o = Integer.MAX_VALUE;
    public int p = Integer.MAX_VALUE;
    public j41 q = j41.j;
    public long v = 0;
    public fd1 x = fd1.j;
    public final m41 y = new m41(this, (byte) 1);
    public final uj1 z = new uj1(new gd1[16]);
    public boolean A = true;
    public boolean D = true;
    public long F = l00.b(0, 0, 0, 0, 15);

    /* JADX WARN: Type inference failed for: r0v6, types: [ed1] */
    /* JADX WARN: Type inference failed for: r5v4, types: [ed1] */
    /* JADX WARN: Type inference failed for: r5v5, types: [ed1] */
    public gd1(p41 p41Var) {
        this.m = p41Var;
        final byte b = 1;
        final byte b2 = 0;
        this.C = new kp0(this) { // from class: ed1
            public final /* synthetic */ gd1 i;

            {
                this.i = this;
            }

            @Override // defpackage.kp0
            public final Object a() {
                cd1 cd1VarT0;
                byte b3 = b2;
                j23 j23Var = j23.a;
                fj1 fj1Var = null;
                placementScope = null;
                placementScope = null;
                my1 placementScope = null;
                gd1 gd1Var = this.i;
                switch (b3) {
                    case 0:
                        p41 p41Var2 = gd1Var.m;
                        p41Var2.h = 0;
                        l41 l41Var = p41Var2.a;
                        uj1 uj1VarZ = l41Var.z();
                        Object[] objArr = uj1VarZ.h;
                        int i = uj1VarZ.j;
                        for (int i2 = 0; i2 < i; i2++) {
                            gd1 gd1Var2 = ((l41) objArr[i2]).M.q;
                            gd1Var2.getClass();
                            gd1Var2.o = gd1Var2.p;
                            gd1Var2.p = Integer.MAX_VALUE;
                            if (gd1Var2.q == j41.i) {
                                gd1Var2.q = j41.j;
                            }
                        }
                        uj1 uj1VarZ2 = l41Var.z();
                        Object[] objArr2 = uj1VarZ2.h;
                        int i3 = uj1VarZ2.j;
                        for (int i4 = 0; i4 < i3; i4++) {
                            gd1 gd1Var3 = ((l41) objArr2[i4]).M.q;
                            gd1Var3.getClass();
                            gd1Var3.y.d = false;
                        }
                        fx0 fx0Var = gd1Var.p().j0;
                        if (fx0Var == null) {
                            li1.g("Expected lookahead delegate");
                            return null;
                        }
                        dj1 dj1Var = (dj1) l41Var.n();
                        int i5 = ((uj1) dj1Var.i).j;
                        for (int i6 = 0; i6 < i5; i6++) {
                            l41 l41Var2 = (l41) dj1Var.get(i6);
                            cd1 cd1VarT1 = l41Var2.L.d.T0();
                            if (cd1VarT1 != null) {
                                if (cd1VarT1.v) {
                                    if (fj1Var == null) {
                                        fj1Var = new fj1();
                                    }
                                    fj1Var.a(l41Var2);
                                }
                                cd1VarT1.v = fx0Var.v;
                            }
                        }
                        fx0Var.C0().b();
                        dj1 dj1Var2 = (dj1) l41Var.n();
                        int i7 = ((uj1) dj1Var2.i).j;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= i7) {
                                uj1 uj1VarZ3 = l41Var.z();
                                Object[] objArr3 = uj1VarZ3.h;
                                int i9 = uj1VarZ3.j;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    gd1 gd1Var4 = ((l41) objArr3[i10]).M.q;
                                    gd1Var4.getClass();
                                    int i11 = gd1Var4.o;
                                    int i12 = gd1Var4.p;
                                    if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                                        gd1Var4.s0(true);
                                    }
                                }
                                uj1 uj1VarZ4 = l41Var.z();
                                Object[] objArr4 = uj1VarZ4.h;
                                int i13 = uj1VarZ4.j;
                                for (int i14 = 0; i14 < i13; i14++) {
                                    gd1 gd1Var5 = ((l41) objArr4[i14]).M.q;
                                    gd1Var5.getClass();
                                    m41 m41Var = gd1Var5.y;
                                    m41Var.e = m41Var.d;
                                }
                                return j23Var;
                            }
                            l41 l41Var3 = (l41) dj1Var2.get(i8);
                            boolean z = fj1Var != null && fj1Var.e(l41Var3);
                            cd1 cd1VarT2 = l41Var3.L.d.T0();
                            if (cd1VarT2 != null) {
                                cd1VarT2.v = z;
                            }
                            i8++;
                        }
                        break;
                    case 1:
                        cd1 cd1VarT3 = gd1Var.m.a().T0();
                        cd1VarT3.getClass();
                        cd1VarT3.e(gd1Var.F);
                        return j23Var;
                    default:
                        p41 p41Var3 = gd1Var.m;
                        if (ys.R(p41Var3.a) || p41Var3.c) {
                            pn1 pn1Var = p41Var3.a().D;
                            if (pn1Var != null) {
                                placementScope = pn1Var.w;
                            }
                        } else {
                            pn1 pn1Var2 = p41Var3.a().D;
                            if (pn1Var2 != null && (cd1VarT0 = pn1Var2.T0()) != null) {
                                placementScope = cd1VarT0.w;
                            }
                        }
                        if (placementScope == null) {
                            placementScope = o41.a(p41Var3.a).getPlacementScope();
                        }
                        cd1 cd1VarT4 = p41Var3.a().T0();
                        cd1VarT4.getClass();
                        my1.j(placementScope, cd1VarT4, gd1Var.v);
                        return j23Var;
                }
            }
        };
        this.E = p41Var.p.y;
        this.G = new kp0(this) { // from class: ed1
            public final /* synthetic */ gd1 i;

            {
                this.i = this;
            }

            @Override // defpackage.kp0
            public final Object a() {
                cd1 cd1VarT0;
                byte b3 = b;
                j23 j23Var = j23.a;
                fj1 fj1Var = null;
                placementScope = null;
                placementScope = null;
                my1 placementScope = null;
                gd1 gd1Var = this.i;
                switch (b3) {
                    case 0:
                        p41 p41Var2 = gd1Var.m;
                        p41Var2.h = 0;
                        l41 l41Var = p41Var2.a;
                        uj1 uj1VarZ = l41Var.z();
                        Object[] objArr = uj1VarZ.h;
                        int i = uj1VarZ.j;
                        for (int i2 = 0; i2 < i; i2++) {
                            gd1 gd1Var2 = ((l41) objArr[i2]).M.q;
                            gd1Var2.getClass();
                            gd1Var2.o = gd1Var2.p;
                            gd1Var2.p = Integer.MAX_VALUE;
                            if (gd1Var2.q == j41.i) {
                                gd1Var2.q = j41.j;
                            }
                        }
                        uj1 uj1VarZ2 = l41Var.z();
                        Object[] objArr2 = uj1VarZ2.h;
                        int i3 = uj1VarZ2.j;
                        for (int i4 = 0; i4 < i3; i4++) {
                            gd1 gd1Var3 = ((l41) objArr2[i4]).M.q;
                            gd1Var3.getClass();
                            gd1Var3.y.d = false;
                        }
                        fx0 fx0Var = gd1Var.p().j0;
                        if (fx0Var == null) {
                            li1.g("Expected lookahead delegate");
                            return null;
                        }
                        dj1 dj1Var = (dj1) l41Var.n();
                        int i5 = ((uj1) dj1Var.i).j;
                        for (int i6 = 0; i6 < i5; i6++) {
                            l41 l41Var2 = (l41) dj1Var.get(i6);
                            cd1 cd1VarT1 = l41Var2.L.d.T0();
                            if (cd1VarT1 != null) {
                                if (cd1VarT1.v) {
                                    if (fj1Var == null) {
                                        fj1Var = new fj1();
                                    }
                                    fj1Var.a(l41Var2);
                                }
                                cd1VarT1.v = fx0Var.v;
                            }
                        }
                        fx0Var.C0().b();
                        dj1 dj1Var2 = (dj1) l41Var.n();
                        int i7 = ((uj1) dj1Var2.i).j;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= i7) {
                                uj1 uj1VarZ3 = l41Var.z();
                                Object[] objArr3 = uj1VarZ3.h;
                                int i9 = uj1VarZ3.j;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    gd1 gd1Var4 = ((l41) objArr3[i10]).M.q;
                                    gd1Var4.getClass();
                                    int i11 = gd1Var4.o;
                                    int i12 = gd1Var4.p;
                                    if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                                        gd1Var4.s0(true);
                                    }
                                }
                                uj1 uj1VarZ4 = l41Var.z();
                                Object[] objArr4 = uj1VarZ4.h;
                                int i13 = uj1VarZ4.j;
                                for (int i14 = 0; i14 < i13; i14++) {
                                    gd1 gd1Var5 = ((l41) objArr4[i14]).M.q;
                                    gd1Var5.getClass();
                                    m41 m41Var = gd1Var5.y;
                                    m41Var.e = m41Var.d;
                                }
                                return j23Var;
                            }
                            l41 l41Var3 = (l41) dj1Var2.get(i8);
                            boolean z = fj1Var != null && fj1Var.e(l41Var3);
                            cd1 cd1VarT2 = l41Var3.L.d.T0();
                            if (cd1VarT2 != null) {
                                cd1VarT2.v = z;
                            }
                            i8++;
                        }
                        break;
                    case 1:
                        cd1 cd1VarT3 = gd1Var.m.a().T0();
                        cd1VarT3.getClass();
                        cd1VarT3.e(gd1Var.F);
                        return j23Var;
                    default:
                        p41 p41Var3 = gd1Var.m;
                        if (ys.R(p41Var3.a) || p41Var3.c) {
                            pn1 pn1Var = p41Var3.a().D;
                            if (pn1Var != null) {
                                placementScope = pn1Var.w;
                            }
                        } else {
                            pn1 pn1Var2 = p41Var3.a().D;
                            if (pn1Var2 != null && (cd1VarT0 = pn1Var2.T0()) != null) {
                                placementScope = cd1VarT0.w;
                            }
                        }
                        if (placementScope == null) {
                            placementScope = o41.a(p41Var3.a).getPlacementScope();
                        }
                        cd1 cd1VarT4 = p41Var3.a().T0();
                        cd1VarT4.getClass();
                        my1.j(placementScope, cd1VarT4, gd1Var.v);
                        return j23Var;
                }
            }
        };
        final byte b3 = 2;
        this.H = new kp0(this) { // from class: ed1
            public final /* synthetic */ gd1 i;

            {
                this.i = this;
            }

            @Override // defpackage.kp0
            public final Object a() {
                cd1 cd1VarT0;
                byte b4 = b3;
                j23 j23Var = j23.a;
                fj1 fj1Var = null;
                placementScope = null;
                placementScope = null;
                my1 placementScope = null;
                gd1 gd1Var = this.i;
                switch (b4) {
                    case 0:
                        p41 p41Var2 = gd1Var.m;
                        p41Var2.h = 0;
                        l41 l41Var = p41Var2.a;
                        uj1 uj1VarZ = l41Var.z();
                        Object[] objArr = uj1VarZ.h;
                        int i = uj1VarZ.j;
                        for (int i2 = 0; i2 < i; i2++) {
                            gd1 gd1Var2 = ((l41) objArr[i2]).M.q;
                            gd1Var2.getClass();
                            gd1Var2.o = gd1Var2.p;
                            gd1Var2.p = Integer.MAX_VALUE;
                            if (gd1Var2.q == j41.i) {
                                gd1Var2.q = j41.j;
                            }
                        }
                        uj1 uj1VarZ2 = l41Var.z();
                        Object[] objArr2 = uj1VarZ2.h;
                        int i3 = uj1VarZ2.j;
                        for (int i4 = 0; i4 < i3; i4++) {
                            gd1 gd1Var3 = ((l41) objArr2[i4]).M.q;
                            gd1Var3.getClass();
                            gd1Var3.y.d = false;
                        }
                        fx0 fx0Var = gd1Var.p().j0;
                        if (fx0Var == null) {
                            li1.g("Expected lookahead delegate");
                            return null;
                        }
                        dj1 dj1Var = (dj1) l41Var.n();
                        int i5 = ((uj1) dj1Var.i).j;
                        for (int i6 = 0; i6 < i5; i6++) {
                            l41 l41Var2 = (l41) dj1Var.get(i6);
                            cd1 cd1VarT1 = l41Var2.L.d.T0();
                            if (cd1VarT1 != null) {
                                if (cd1VarT1.v) {
                                    if (fj1Var == null) {
                                        fj1Var = new fj1();
                                    }
                                    fj1Var.a(l41Var2);
                                }
                                cd1VarT1.v = fx0Var.v;
                            }
                        }
                        fx0Var.C0().b();
                        dj1 dj1Var2 = (dj1) l41Var.n();
                        int i7 = ((uj1) dj1Var2.i).j;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= i7) {
                                uj1 uj1VarZ3 = l41Var.z();
                                Object[] objArr3 = uj1VarZ3.h;
                                int i9 = uj1VarZ3.j;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    gd1 gd1Var4 = ((l41) objArr3[i10]).M.q;
                                    gd1Var4.getClass();
                                    int i11 = gd1Var4.o;
                                    int i12 = gd1Var4.p;
                                    if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                                        gd1Var4.s0(true);
                                    }
                                }
                                uj1 uj1VarZ4 = l41Var.z();
                                Object[] objArr4 = uj1VarZ4.h;
                                int i13 = uj1VarZ4.j;
                                for (int i14 = 0; i14 < i13; i14++) {
                                    gd1 gd1Var5 = ((l41) objArr4[i14]).M.q;
                                    gd1Var5.getClass();
                                    m41 m41Var = gd1Var5.y;
                                    m41Var.e = m41Var.d;
                                }
                                return j23Var;
                            }
                            l41 l41Var3 = (l41) dj1Var2.get(i8);
                            boolean z = fj1Var != null && fj1Var.e(l41Var3);
                            cd1 cd1VarT2 = l41Var3.L.d.T0();
                            if (cd1VarT2 != null) {
                                cd1VarT2.v = z;
                            }
                            i8++;
                        }
                        break;
                    case 1:
                        cd1 cd1VarT3 = gd1Var.m.a().T0();
                        cd1VarT3.getClass();
                        cd1VarT3.e(gd1Var.F);
                        return j23Var;
                    default:
                        p41 p41Var3 = gd1Var.m;
                        if (ys.R(p41Var3.a) || p41Var3.c) {
                            pn1 pn1Var = p41Var3.a().D;
                            if (pn1Var != null) {
                                placementScope = pn1Var.w;
                            }
                        } else {
                            pn1 pn1Var2 = p41Var3.a().D;
                            if (pn1Var2 != null && (cd1VarT0 = pn1Var2.T0()) != null) {
                                placementScope = cd1VarT0.w;
                            }
                        }
                        if (placementScope == null) {
                            placementScope = o41.a(p41Var3.a).getPlacementScope();
                        }
                        cd1 cd1VarT4 = p41Var3.a().T0();
                        cd1VarT4.getClass();
                        my1.j(placementScope, cd1VarT4, gd1Var.v);
                        return j23Var;
                }
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006a A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:10:0x001a, B:12:0x001e, B:13:0x0023, B:15:0x0032, B:17:0x0036, B:20:0x003c, B:19:0x003a, B:21:0x003f, B:23:0x0049, B:27:0x0052, B:29:0x007e, B:28:0x006a), top: B:34:0x0007 }] */
    public final void A0(long j, vp0 vp0Var) {
        p41 p41Var = this.m;
        l41 l41Var = p41Var.a;
        l41 l41Var2 = p41Var.a;
        try {
            l41 l41VarU = l41Var.u();
            h41 h41Var = l41VarU != null ? l41VarU.M.d : null;
            h41 h41Var2 = h41.k;
            if (h41Var == h41Var2) {
                p41Var.c = false;
            }
            if (l41Var2.U) {
                ax0.a("place is called on a deactivated node");
            }
            p41Var.d = h41Var2;
            this.s = true;
            this.I = false;
            if (!ny0.a(j, this.v)) {
                if (p41Var.n || p41Var.m) {
                    p41Var.f = true;
                }
                x0();
            }
            t6 t6VarA = o41.a(l41Var2);
            this.v = j;
            if (p41Var.f) {
                p41Var.h(false);
                this.y.g = false;
                it1 snapshotObserver = t6VarA.getSnapshotObserver();
                snapshotObserver.a.d(l41Var2, snapshotObserver.g, this.H);
            } else {
                if (this.x != fd1.j) {
                    cd1 cd1VarT0 = p41Var.a().T0();
                    cd1VarT0.getClass();
                    cd1VarT0.L0(ny0.c(j, cd1VarT0.l));
                    z0();
                } else {
                    p41Var.h(false);
                    this.y.g = false;
                    it1 snapshotObserver2 = t6VarA.getSnapshotObserver();
                    snapshotObserver2.a.d(l41Var2, snapshotObserver2.g, this.H);
                }
            }
            this.w = vp0Var;
            p41Var.d = h41.l;
        } catch (Throwable th) {
            l41Var.Z(th);
            throw null;
        }
    }

    public final boolean B0(long j) {
        p41 p41Var = this.m;
        l41 l41Var = p41Var.a;
        l41 l41Var2 = p41Var.a;
        try {
            if (l41Var.U) {
                ax0.a("measure is called on a deactivated node");
            }
            l41 l41VarU = l41Var2.u();
            l41Var2.K = l41Var2.K || (l41VarU != null && l41VarU.K);
            if (!l41Var2.M.e) {
                k00 k00Var = this.u;
                if (k00Var == null ? false : k00.c(k00Var.a, j)) {
                    t6 t6Var = l41Var2.u;
                    if (t6Var != null) {
                        t6Var.i(l41Var2, true);
                    }
                    l41Var2.Y();
                    return false;
                }
            }
            this.u = new k00(j);
            p0(j);
            this.y.f = false;
            uj1 uj1VarZ = l41Var2.z();
            Object[] objArr = uj1VarZ.h;
            int i = uj1VarZ.j;
            for (int i2 = 0; i2 < i; i2++) {
                gd1 gd1Var = ((l41) objArr[i2]).M.q;
                gd1Var.getClass();
                gd1Var.y.c = false;
            }
            long j2 = this.t ? this.j : -9223372034707292160L;
            this.t = true;
            cd1 cd1VarT0 = p41Var.a().T0();
            if (cd1VarT0 == null) {
                ax0.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            p41Var.c(j);
            o0((((long) cd1VarT0.h) << 32) | (((long) cd1VarT0.i) & 4294967295L));
            return (((int) (j2 >> 32)) == cd1VarT0.h && ((int) (j2 & 4294967295L)) == cd1VarT0.i) ? false : true;
        } catch (Throwable th) {
            l41Var.Z(th);
            throw null;
        }
    }

    @Override // defpackage.ue1
    public final int U(int i) {
        y0();
        cd1 cd1VarT0 = this.m.a().T0();
        cd1VarT0.getClass();
        return cd1VarT0.U(i);
    }

    @Override // defpackage.i5
    public final int W() {
        return this.p;
    }

    @Override // defpackage.i5
    public final void Y() {
        l41.U(this.m.a, false, 7);
    }

    @Override // defpackage.i5
    public final m41 a() {
        return this.y;
    }

    @Override // defpackage.ue1
    public final int a0(int i) {
        y0();
        cd1 cd1VarT0 = this.m.a().T0();
        cd1VarT0.getClass();
        return cd1VarT0.a0(i);
    }

    @Override // defpackage.ue1
    public final int d0(int i) {
        y0();
        cd1 cd1VarT0 = this.m.a().T0();
        cd1VarT0.getClass();
        return cd1VarT0.d0(i);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    @Override // defpackage.ue1
    public final ny1 e(long j) {
        j41 j41Var;
        p41 p41Var = this.m;
        l41 l41Var = p41Var.a;
        l41 l41Var2 = p41Var.a;
        l41 l41VarU = l41Var.u();
        if ((l41VarU != null ? l41VarU.M.d : null) == h41.i) {
            p41Var.b = false;
        } else {
            l41 l41VarU2 = l41Var2.u();
            if ((l41VarU2 != null ? l41VarU2.M.d : null) == h41.k) {
                p41Var.b = false;
            }
        }
        l41 l41VarU3 = l41Var2.u();
        j41 j41Var2 = j41.j;
        if (l41VarU3 != null) {
            p41 p41Var2 = l41VarU3.M;
            if (this.q != j41Var2 && !l41Var2.K) {
                ax0.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = p41Var2.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                j41Var = j41.h;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    wg.o(p41Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                j41Var = j41.i;
            }
            this.q = j41Var;
        } else {
            this.q = j41Var2;
        }
        if (l41Var2.I == j41Var2) {
            l41Var2.e();
        }
        B0(j);
        return this;
    }

    @Override // defpackage.ue1
    public final int g(int i) {
        y0();
        cd1 cd1VarT0 = this.m.a().T0();
        cd1VarT0.getClass();
        return cd1VarT0.g(i);
    }

    @Override // defpackage.ny1
    public final int h0(e5 e5Var) {
        p41 p41Var = this.m;
        l41 l41VarU = p41Var.a.u();
        h41 h41Var = l41VarU != null ? l41VarU.M.d : null;
        h41 h41Var2 = h41.i;
        m41 m41Var = this.y;
        if (h41Var == h41Var2) {
            m41Var.c = true;
        } else {
            l41 l41VarU2 = p41Var.a.u();
            if ((l41VarU2 != null ? l41VarU2.M.d : null) == h41.k) {
                m41Var.d = true;
            }
        }
        this.r = true;
        cd1 cd1VarT0 = p41Var.a().T0();
        cd1VarT0.getClass();
        int iH0 = cd1VarT0.h0(e5Var);
        this.r = false;
        return iH0;
    }

    @Override // defpackage.i5
    public final void j(p pVar) {
        uj1 uj1VarZ = this.m.a.z();
        Object[] objArr = uj1VarZ.h;
        int i = uj1VarZ.j;
        for (int i2 = 0; i2 < i; i2++) {
            gd1 gd1Var = ((l41) objArr[i2]).M.q;
            gd1Var.getClass();
            pVar.h(gd1Var);
        }
    }

    @Override // defpackage.ny1
    public final int j0() {
        cd1 cd1VarT0 = this.m.a().T0();
        cd1VarT0.getClass();
        return cd1VarT0.j0();
    }

    @Override // defpackage.ny1
    public final int k0() {
        cd1 cd1VarT0 = this.m.a().T0();
        cd1VarT0.getClass();
        return cd1VarT0.k0();
    }

    @Override // defpackage.ny1, defpackage.ue1
    public final Object l() {
        return this.E;
    }

    @Override // defpackage.ny1
    public final void n0(long j, float f, vp0 vp0Var) {
        A0(j, vp0Var);
    }

    @Override // defpackage.eh1
    public final void o(boolean z) {
        cd1 cd1VarT0;
        p41 p41Var = this.m;
        cd1 cd1VarT1 = p41Var.a().T0();
        if (Boolean.valueOf(z).equals(cd1VarT1 != null ? Boolean.valueOf(cd1VarT1.s) : null) || (cd1VarT0 = p41Var.a().T0()) == null) {
            return;
        }
        cd1VarT0.s = z;
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
        return p41Var.q;
    }

    public final boolean q0() {
        p41 p41Var = this.m;
        return ys.R(p41Var.a) || p41Var.c;
    }

    @Override // defpackage.i5
    public final void r() {
        this.B = true;
        m41 m41Var = this.y;
        m41Var.h();
        p41 p41Var = this.m;
        boolean z = p41Var.f;
        l41 l41Var = p41Var.a;
        if (z) {
            uj1 uj1VarZ = l41Var.z();
            Object[] objArr = uj1VarZ.h;
            int i = uj1VarZ.j;
            for (int i2 = 0; i2 < i; i2++) {
                l41 l41Var2 = (l41) objArr[i2];
                p41 p41Var2 = l41Var2.M;
                if (p41Var2.e && l41Var2.s() == j41.h) {
                    gd1 gd1Var = p41Var2.q;
                    gd1Var.getClass();
                    gd1 gd1Var2 = p41Var2.q;
                    k00 k00Var = gd1Var2 != null ? gd1Var2.u : null;
                    k00Var.getClass();
                    if (gd1Var.B0(k00Var.a)) {
                        l41.U(l41Var, false, 7);
                    }
                }
            }
        }
        fx0 fx0Var = p().j0;
        fx0Var.getClass();
        if (p41Var.g || (!this.r && !fx0Var.v && p41Var.f)) {
            p41Var.f = false;
            h41 h41Var = p41Var.d;
            p41Var.d = h41.k;
            p41Var.i(false);
            it1 snapshotObserver = o41.a(l41Var).getSnapshotObserver();
            snapshotObserver.a.d(l41Var, snapshotObserver.h, this.C);
            p41Var.d = h41Var;
            if (p41Var.m && fx0Var.v) {
                requestLayout();
            }
            p41Var.g = false;
        }
        if (m41Var.d) {
            m41Var.e = true;
        }
        if (m41Var.b && m41Var.e()) {
            m41Var.g();
        }
        this.B = false;
    }

    @Override // defpackage.i5
    public final void requestLayout() {
        this.m.a.T(false);
    }

    public final void s0(boolean z) {
        if (z) {
            if (q0()) {
                return;
            }
        } else if (!q0()) {
            return;
        }
        this.x = fd1.j;
        uj1 uj1VarZ = this.m.a.z();
        Object[] objArr = uj1VarZ.h;
        int i = uj1VarZ.j;
        for (int i2 = 0; i2 < i; i2++) {
            gd1 gd1Var = ((l41) objArr[i2]).M.q;
            gd1Var.getClass();
            gd1Var.s0(true);
        }
    }

    public final void t0() {
        fd1 fd1Var = this.x;
        p41 p41Var = this.m;
        boolean z = p41Var.c;
        l41 l41Var = p41Var.a;
        fd1 fd1Var2 = fd1.h;
        if (z) {
            this.x = fd1.i;
        } else {
            this.x = fd1Var2;
        }
        if (fd1Var != fd1Var2 && p41Var.e) {
            l41.U(l41Var, true, 6);
        }
        uj1 uj1VarZ = l41Var.z();
        Object[] objArr = uj1VarZ.h;
        int i = uj1VarZ.j;
        for (int i2 = 0; i2 < i; i2++) {
            l41 l41Var2 = (l41) objArr[i2];
            gd1 gd1Var = l41Var2.M.q;
            if (gd1Var == null) {
                wg.m("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (gd1Var.p != Integer.MAX_VALUE) {
                gd1Var.t0();
                l41.X(l41Var2);
            }
        }
    }

    public final void x0() {
        p41 p41Var = this.m;
        if (p41Var.o > 0) {
            uj1 uj1VarZ = p41Var.a.z();
            Object[] objArr = uj1VarZ.h;
            int i = uj1VarZ.j;
            for (int i2 = 0; i2 < i; i2++) {
                l41 l41Var = (l41) objArr[i2];
                p41 p41Var2 = l41Var.M;
                if ((p41Var2.m || p41Var2.n) && !p41Var2.f) {
                    l41Var.T(false);
                }
                gd1 gd1Var = p41Var2.q;
                if (gd1Var != null) {
                    gd1Var.x0();
                }
            }
        }
    }

    public final void y0() {
        j41 j41Var;
        p41 p41Var = this.m;
        l41.U(p41Var.a, false, 7);
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

    public final void z0() {
        h41 h41Var;
        this.I = true;
        p41 p41Var = this.m;
        l41 l41VarU = p41Var.a.u();
        fd1 fd1Var = this.x;
        if ((fd1Var != fd1.h && !p41Var.c) || (fd1Var != fd1.i && p41Var.c)) {
            t0();
            if (this.n && l41VarU != null) {
                l41VarU.T(false);
            }
        }
        if (l41VarU != null) {
            p41 p41Var2 = l41VarU.M;
            if (!this.n && ((h41Var = p41Var2.d) == h41.j || h41Var == h41.k)) {
                if (this.p != Integer.MAX_VALUE) {
                    ax0.b("Place was called on a node which was placed already");
                }
                int i = p41Var2.h;
                this.p = i;
                p41Var2.h = i + 1;
            }
        } else {
            this.p = 0;
        }
        r();
    }
}
