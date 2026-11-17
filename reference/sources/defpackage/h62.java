package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class h62 extends uk2 {
    public final vp0 e;
    public int f;

    public h62(long j, zk2 zk2Var, vp0 vp0Var) {
        super(j, zk2Var);
        this.e = vp0Var;
        this.f = 1;
    }

    @Override // defpackage.uk2
    public final void c() {
        if (this.c) {
            return;
        }
        l();
        this.c = true;
        synchronized (bl2.c) {
            o();
        }
    }

    @Override // defpackage.uk2
    public final vp0 e() {
        return this.e;
    }

    @Override // defpackage.uk2
    public final boolean f() {
        return true;
    }

    @Override // defpackage.uk2
    public final vp0 i() {
        return null;
    }

    @Override // defpackage.uk2
    public final void k() {
        this.f++;
    }

    @Override // defpackage.uk2
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // defpackage.uk2
    public final void n(qn2 qn2Var) {
        jc2 jc2Var = bl2.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.uk2
    public final uk2 u(vp0 vp0Var) {
        bl2.v(this);
        return new wm1(this.b, this.a, bl2.i(vp0Var, this.e, true), this);
    }

    @Override // defpackage.uk2
    public final void m() {
    }
}
