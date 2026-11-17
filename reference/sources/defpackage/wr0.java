package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wr0 extends rj1 {
    @Override // defpackage.rj1
    public final rj1 C(vp0 vp0Var, vp0 vp0Var2) {
        return (rj1) ((uk2) bl2.b(new rr0(new q9(vp0Var, vp0Var2, (byte) 5), (byte) 1)));
    }

    @Override // defpackage.rj1, defpackage.uk2
    public final void c() {
        synchronized (bl2.c) {
            o();
        }
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
        bl2.c();
    }

    @Override // defpackage.rj1, defpackage.uk2
    public final uk2 u(vp0 vp0Var) {
        return (h62) ((uk2) bl2.b(new rr0(new vr0(vp0Var, (byte) 0), (byte) 1)));
    }

    @Override // defpackage.rj1
    public final h12 w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
