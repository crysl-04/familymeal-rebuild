package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class uz2 extends rj1 {
    public final rj1 o;
    public final boolean p;
    public final boolean q;
    public vp0 r;
    public vp0 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    public uz2(rj1 rj1Var, vp0 vp0Var, vp0 vp0Var2, boolean z, boolean z2) {
        vp0 vp0VarI;
        vp0 vp0VarE;
        jc2 jc2Var = bl2.a;
        super(0L, zk2.l, bl2.i(vp0Var, (rj1Var == null || (vp0VarE = rj1Var.e()) == null) ? bl2.j.e : vp0VarE, z), bl2.j(vp0Var2, (rj1Var == null || (vp0VarI = rj1Var.i()) == null) ? bl2.j.f : vp0VarI));
        this.o = rj1Var;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = y02.i();
    }

    @Override // defpackage.rj1
    public final void B(nj1 nj1Var) {
        m02.z();
        throw null;
    }

    @Override // defpackage.rj1
    public final rj1 C(vp0 vp0Var, vp0 vp0Var2) {
        vp0 vp0VarI = bl2.i(vp0Var, this.r, true);
        vp0 vp0VarJ = bl2.j(vp0Var2, this.s);
        return !this.p ? new uz2(D().C(null, vp0VarJ), vp0VarI, vp0VarJ, false, true) : D().C(vp0VarI, vp0VarJ);
    }

    public final rj1 D() {
        rj1 rj1Var = this.o;
        return rj1Var == null ? bl2.j : rj1Var;
    }

    @Override // defpackage.rj1, defpackage.uk2
    public final void c() {
        rj1 rj1Var;
        this.c = true;
        if (!this.q || (rj1Var = this.o) == null) {
            return;
        }
        rj1Var.c();
    }

    @Override // defpackage.uk2
    public final zk2 d() {
        return D().d();
    }

    @Override // defpackage.rj1, defpackage.uk2
    public final vp0 e() {
        return this.r;
    }

    @Override // defpackage.uk2
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.uk2
    public final long g() {
        return D().g();
    }

    @Override // defpackage.rj1, defpackage.uk2
    public final int h() {
        return D().h();
    }

    @Override // defpackage.rj1, defpackage.uk2
    public final vp0 i() {
        return this.s;
    }

    @Override // defpackage.rj1, defpackage.uk2
    public final void k() {
        m02.z();
        throw null;
    }

    @Override // defpackage.rj1, defpackage.uk2
    public final void l() {
        m02.z();
        throw null;
    }

    @Override // defpackage.rj1, defpackage.uk2
    public final void m() {
        D().m();
    }

    @Override // defpackage.rj1, defpackage.uk2
    public final void n(qn2 qn2Var) {
        D().n(qn2Var);
    }

    @Override // defpackage.uk2
    public final void r(zk2 zk2Var) {
        m02.z();
        throw null;
    }

    @Override // defpackage.uk2
    public final void s(long j) {
        m02.z();
        throw null;
    }

    @Override // defpackage.rj1, defpackage.uk2
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.rj1, defpackage.uk2
    public final uk2 u(vp0 vp0Var) {
        vp0 vp0VarI = bl2.i(vp0Var, this.r, true);
        return !this.p ? bl2.e(D().u(null), vp0VarI, true) : D().u(vp0VarI);
    }

    @Override // defpackage.rj1
    public final h12 w() {
        return D().w();
    }

    @Override // defpackage.rj1
    public final nj1 x() {
        return D().x();
    }

    @Override // defpackage.rj1
    /* JADX INFO: renamed from: y */
    public final vp0 e() {
        return this.r;
    }
}
