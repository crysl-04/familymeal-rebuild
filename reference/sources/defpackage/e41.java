package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class e41 extends pn1 {
    public static final e9 k0;
    public c41 i0;
    public d41 j0;

    static {
        e9 e9VarD = aa3.d();
        int i = kv.h;
        e9VarD.e(kv.e);
        e9VarD.k(1.0f);
        e9VarD.l(1);
        k0 = e9VarD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e41(l41 l41Var, c41 c41Var) {
        super(l41Var);
        this.i0 = c41Var;
        this.j0 = l41Var.o != null ? new d41(this) : null;
        if ((((qg1) c41Var).h.j & 512) == 0) {
            return;
        }
        li1.c();
        throw null;
    }

    @Override // defpackage.pn1
    public final void Q0() {
        if (this.j0 == null) {
            this.j0 = new d41(this);
        }
    }

    @Override // defpackage.pn1
    public final cd1 T0() {
        return this.j0;
    }

    @Override // defpackage.ue1
    public final int U(int i) {
        c41 c41Var = this.i0;
        pn1 pn1Var = this.C;
        pn1Var.getClass();
        return c41Var.S(this, pn1Var, i);
    }

    @Override // defpackage.pn1
    public final qg1 V0() {
        return ((qg1) this.i0).h;
    }

    @Override // defpackage.ue1
    public final int a0(int i) {
        c41 c41Var = this.i0;
        pn1 pn1Var = this.C;
        pn1Var.getClass();
        return c41Var.g(this, pn1Var, i);
    }

    @Override // defpackage.ue1
    public final int d0(int i) {
        c41 c41Var = this.i0;
        pn1 pn1Var = this.C;
        pn1Var.getClass();
        return c41Var.E(this, pn1Var, i);
    }

    @Override // defpackage.ue1
    public final ny1 e(long j) {
        p0(j);
        c41 c41Var = this.i0;
        pn1 pn1Var = this.C;
        pn1Var.getClass();
        p1(c41Var.e(this, pn1Var, j));
        g1();
        return this;
    }

    @Override // defpackage.ue1
    public final int g(int i) {
        c41 c41Var = this.i0;
        pn1 pn1Var = this.C;
        pn1Var.getClass();
        return c41Var.p(this, pn1Var, i);
    }

    @Override // defpackage.pn1
    public final void l1(wq wqVar, cs0 cs0Var) {
        pn1 pn1Var;
        pn1 pn1Var2 = this.C;
        pn1Var2.getClass();
        pn1Var2.O0(wqVar, cs0Var);
        if (!o41.a(this.B).getShowLayoutBounds() || (pn1Var = this.C) == null) {
            return;
        }
        if (vy0.a(this.j, pn1Var.j) && ny0.a(pn1Var.M, 0L)) {
            return;
        }
        long j = this.j;
        wqVar.p(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, k0);
    }

    @Override // defpackage.ny1
    public final void n0(long j, float f, vp0 vp0Var) {
        m1(j, f, vp0Var);
        if (this.u) {
            return;
        }
        h1();
        pn1 pn1Var = this.C;
        pn1Var.getClass();
        boolean z = pn1Var.v;
        pn1Var.v = this.v;
        C0().b();
        pn1Var.v = z;
    }

    @Override // defpackage.ad1
    public final int s0(e5 e5Var) {
        d41 d41Var = this.j0;
        if (d41Var == null) {
            return ls.p(this, e5Var);
        }
        bj1 bj1Var = d41Var.G;
        int iD = bj1Var.d(e5Var);
        if (iD >= 0) {
            return bj1Var.c[iD];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y1(c41 c41Var) {
        if (c41Var.equals(this.i0) || (((qg1) c41Var).h.j & 512) == 0) {
            this.i0 = c41Var;
        } else {
            li1.c();
        }
    }
}
