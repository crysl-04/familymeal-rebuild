package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wm1 extends uk2 {
    public final vp0 e;
    public final uk2 f;

    public wm1(long j, zk2 zk2Var, vp0 vp0Var, uk2 uk2Var) {
        super(j, zk2Var);
        this.e = vp0Var;
        this.f = uk2Var;
        uk2Var.k();
    }

    @Override // defpackage.uk2
    public final void c() {
        uk2 uk2Var = this.f;
        if (this.c) {
            return;
        }
        if (this.b != uk2Var.g()) {
            a();
        }
        uk2Var.l();
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
    public final uk2 u(vp0 vp0Var) {
        return new wm1(this.b, this.a, bl2.i(vp0Var, this.e, true), this.f);
    }
}
