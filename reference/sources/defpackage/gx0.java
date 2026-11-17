package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gx0 extends pn1 {
    public static final e9 k0;
    public final cs2 i0;
    public fx0 j0;

    static {
        e9 e9VarD = aa3.d();
        int i = kv.h;
        e9VarD.e(kv.d);
        e9VarD.k(1.0f);
        e9VarD.l(1);
        k0 = e9VarD;
    }

    public gx0(l41 l41Var) {
        super(l41Var);
        cs2 cs2Var = new cs2();
        cs2Var.k = 0;
        this.i0 = cs2Var;
        cs2Var.o = this;
        this.j0 = l41Var.o != null ? new fx0(this) : null;
    }

    @Override // defpackage.pn1
    public final void Q0() {
        if (this.j0 == null) {
            this.j0 = new fx0(this);
        }
    }

    @Override // defpackage.pn1
    public final cd1 T0() {
        return this.j0;
    }

    @Override // defpackage.ue1
    public final int U(int i) {
        ix0 ix0VarT = this.B.t();
        ze1 ze1VarG = ix0VarT.G();
        l41 l41Var = (l41) ix0VarT.i;
        return ze1VarG.e(l41Var.L.d, l41Var.m(), i);
    }

    @Override // defpackage.pn1
    public final qg1 V0() {
        return this.i0;
    }

    @Override // defpackage.ue1
    public final int a0(int i) {
        ix0 ix0VarT = this.B.t();
        ze1 ze1VarG = ix0VarT.G();
        l41 l41Var = (l41) ix0VarT.i;
        return ze1VarG.b(l41Var.L.d, l41Var.m(), i);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.pn1
    public final void c1(on1 on1Var, long j, jt0 jt0Var, int i, boolean z) {
        int i2;
        boolean z2;
        Object[] objArr;
        int i3;
        l41 l41Var;
        long jA;
        l41 l41Var2 = this.B;
        boolean z3 = false;
        if (on1Var.f(l41Var2)) {
            i2 = i;
            if (!x1(j)) {
                if (i2 == 1 && (Float.floatToRawIntBits(N0(j, U0())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
                if (z3) {
                    int i4 = jt0Var.j;
                    uj1 uj1VarY = l41Var2.y();
                    objArr = uj1VarY.h;
                    i3 = uj1VarY.j - 1;
                    while (i3 >= 0) {
                        l41Var = (l41) objArr[i3];
                        if (l41Var.J()) {
                            on1Var.d(l41Var, j, jt0Var, i2, z2);
                            jA = jt0Var.a();
                            if (lt.D(jA) >= 0.0f && lt.O(jA) && !lt.N(jA) && !on1Var.e(jt0Var, l41Var)) {
                                break;
                            }
                        }
                        i3--;
                        i2 = i;
                    }
                    jt0Var.j = i4;
                }
            }
            z2 = z;
            z3 = true;
            if (z3) {
                int i5 = jt0Var.j;
                uj1 uj1VarY2 = l41Var2.y();
                objArr = uj1VarY2.h;
                i3 = uj1VarY2.j - 1;
                while (i3 >= 0) {
                    l41Var = (l41) objArr[i3];
                    if (l41Var.J()) {
                        on1Var.d(l41Var, j, jt0Var, i2, z2);
                        jA = jt0Var.a();
                        if (lt.D(jA) >= 0.0f) {
                            continue;
                        }
                    }
                    i3--;
                    i2 = i;
                }
                jt0Var.j = i5;
            }
        }
        i2 = i;
        z2 = z;
        if (z3) {
            int i6 = jt0Var.j;
            uj1 uj1VarY3 = l41Var2.y();
            objArr = uj1VarY3.h;
            i3 = uj1VarY3.j - 1;
            while (i3 >= 0) {
                l41Var = (l41) objArr[i3];
                if (l41Var.J()) {
                    on1Var.d(l41Var, j, jt0Var, i2, z2);
                    jA = jt0Var.a();
                    if (lt.D(jA) >= 0.0f) {
                        continue;
                    }
                }
                i3--;
                i2 = i;
            }
            jt0Var.j = i6;
        }
    }

    @Override // defpackage.ue1
    public final int d0(int i) {
        ix0 ix0VarT = this.B.t();
        ze1 ze1VarG = ix0VarT.G();
        l41 l41Var = (l41) ix0VarT.i;
        return ze1VarG.d(l41Var.L.d, l41Var.m(), i);
    }

    @Override // defpackage.ue1
    public final ny1 e(long j) {
        p0(j);
        l41 l41Var = this.B;
        uj1 uj1VarZ = l41Var.z();
        Object[] objArr = uj1VarZ.h;
        int i = uj1VarZ.j;
        for (int i2 = 0; i2 < i; i2++) {
            ((l41) objArr[i2]).M.p.s = j41.j;
        }
        p1(l41Var.C.c(this, l41Var.m(), j));
        g1();
        return this;
    }

    @Override // defpackage.ue1
    public final int g(int i) {
        ix0 ix0VarT = this.B.t();
        ze1 ze1VarG = ix0VarT.G();
        l41 l41Var = (l41) ix0VarT.i;
        return ze1VarG.a(l41Var.L.d, l41Var.m(), i);
    }

    @Override // defpackage.ny1
    public final void n0(long j, float f, vp0 vp0Var) {
        m1(j, f, vp0Var);
        if (this.u) {
            return;
        }
        this.B.M.p.y0();
    }

    @Override // defpackage.ad1
    public final int s0(e5 e5Var) {
        fx0 fx0Var = this.j0;
        if (fx0Var != null) {
            return fx0Var.s0(e5Var);
        }
        ye1 ye1Var = this.B.M.p;
        m41 m41Var = ye1Var.E;
        if (!ye1Var.t) {
            if (ye1Var.m.d == h41.h) {
                m41Var.f = true;
                if (m41Var.b) {
                    ye1Var.C = true;
                    ye1Var.D = true;
                }
            } else {
                m41Var.g = true;
            }
        }
        gx0 gx0VarP = ye1Var.p();
        boolean z = gx0VarP.v;
        gx0VarP.v = true;
        ye1Var.r();
        gx0VarP.v = z;
        Integer num = (Integer) m41Var.i.get(e5Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
