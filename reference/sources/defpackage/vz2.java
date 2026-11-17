package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vz2 extends uk2 {
    public final uk2 e;
    public final boolean f;
    public final boolean g;
    public vp0 h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz2(uk2 uk2Var, vp0 vp0Var, boolean z, boolean z2) {
        vp0 vp0VarE;
        super(0L, zk2.l);
        jc2 jc2Var = bl2.a;
        this.e = uk2Var;
        this.f = z;
        this.g = z2;
        this.h = bl2.i(vp0Var, (uk2Var == null || (vp0VarE = uk2Var.e()) == null) ? bl2.j.e : vp0VarE, z);
        this.i = y02.i();
    }

    @Override // defpackage.uk2
    public final void c() {
        uk2 uk2Var;
        this.c = true;
        if (!this.g || (uk2Var = this.e) == null) {
            return;
        }
        uk2Var.c();
    }

    @Override // defpackage.uk2
    public final zk2 d() {
        return v().d();
    }

    @Override // defpackage.uk2
    public final vp0 e() {
        return this.h;
    }

    @Override // defpackage.uk2
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.uk2
    public final long g() {
        return v().g();
    }

    @Override // defpackage.uk2
    public final vp0 i() {
        return null;
    }

    @Override // defpackage.uk2
    public final void k() {
        m02.z();
        throw null;
    }

    @Override // defpackage.uk2
    public final void l() {
        m02.z();
        throw null;
    }

    @Override // defpackage.uk2
    public final void m() {
        v().m();
    }

    @Override // defpackage.uk2
    public final void n(qn2 qn2Var) {
        v().n(qn2Var);
    }

    @Override // defpackage.uk2
    public final uk2 u(vp0 vp0Var) {
        vp0 vp0VarI = bl2.i(vp0Var, this.h, true);
        return !this.f ? bl2.e(v().u(null), vp0VarI, true) : v().u(vp0VarI);
    }

    public final uk2 v() {
        uk2 uk2Var = this.e;
        return uk2Var == null ? bl2.j : uk2Var;
    }
}
