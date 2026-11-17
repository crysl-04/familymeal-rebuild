package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ut2 extends k80 implements pz, gt2 {
    public a20 A;
    public dn2 B;
    public final o90 C = il2.b(new xu1(this, 15));
    public r72 D = r72.e;
    public k42 x;
    public dv2 y;
    public ev2 z;

    public ut2(k42 k42Var, dv2 dv2Var, ev2 ev2Var, a20 a20Var) {
        this.x = k42Var;
        this.y = dv2Var;
        this.z = ev2Var;
        this.A = a20Var;
    }

    @Override // defpackage.qg1
    public final void B0() {
        k42 k42Var = this.x;
        k42Var.j = gy2.j;
        k42Var.i = this;
    }

    @Override // defpackage.qg1
    public final void C0() {
        k42 k42Var = this.x;
        k42Var.j = gy2.i;
        k42Var.i = null;
    }

    @Override // defpackage.gt2
    public final long i(t31 t31Var) {
        return o(t31Var).d();
    }

    @Override // defpackage.gt2
    public final r72 o(t31 t31Var) {
        if (!this.u) {
            return this.D;
        }
        r72 r72Var = (r72) this.A.h(t31Var);
        if (r72Var == null) {
            return this.D;
        }
        this.D = r72Var;
        return r72Var;
    }

    @Override // defpackage.gt2
    public final ft2 s0() {
        return (ft2) this.C.getValue();
    }
}
