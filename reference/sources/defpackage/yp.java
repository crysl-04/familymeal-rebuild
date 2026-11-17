package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yp extends qg1 implements rp1, kp, sd0 {
    public final zp v;
    public boolean w;
    public vp0 x;

    public yp(zp zpVar, vp0 vp0Var) {
        this.v = zpVar;
        this.x = vp0Var;
        zpVar.h = this;
    }

    @Override // defpackage.qg1
    public final void D0() {
        J0();
    }

    public final void J0() {
        this.w = false;
        this.v.i = null;
        dt.H(this);
    }

    @Override // defpackage.rp1
    public final void M() {
        J0();
    }

    @Override // defpackage.sd0
    public final void O(n41 n41Var) {
        boolean z = this.w;
        zp zpVar = this.v;
        if (!z) {
            zpVar.i = null;
            ou.D(this, new h6((Object) this, (Object) zpVar, (byte) 9));
            if (zpVar.i == null) {
                throw wi0.e("DrawResult not defined, did you forget to call onDraw?");
            }
            this.w = true;
        }
        g2 g2Var = zpVar.i;
        g2Var.getClass();
        ((vp0) g2Var.i).h(n41Var);
    }

    @Override // defpackage.j80
    public final void a() {
        J0();
    }

    @Override // defpackage.kp
    public final e90 b() {
        return cu.Y(this).E;
    }

    @Override // defpackage.kp
    public final long d() {
        return ou.G(cu.W(this, 4).j);
    }

    @Override // defpackage.kp
    public final u31 getLayoutDirection() {
        return cu.Y(this).F;
    }

    @Override // defpackage.sd0
    public final void o0() {
        J0();
    }

    @Override // defpackage.j80
    public final void t0() {
        J0();
    }

    @Override // defpackage.qg1
    public final void C0() {
    }
}
