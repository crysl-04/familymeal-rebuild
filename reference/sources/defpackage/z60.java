package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class z60 extends qg1 implements sd0 {
    public final hz0 v;
    public boolean w;
    public boolean x;
    public boolean y;

    public z60(hz0 hz0Var) {
        this.v = hz0Var;
    }

    @Override // defpackage.qg1
    public final void B0() {
        ie1.p(x0(), null, new qj(this, null, (byte) 2), 3);
    }

    @Override // defpackage.sd0
    public final void O(n41 n41Var) {
        n41Var.a();
        yq yqVar = n41Var.h;
        if (this.w) {
            td0.H(n41Var, kv.b(0.3f, kv.b), yqVar.d(), 122);
        } else if (this.x || this.y) {
            td0.H(n41Var, kv.b(0.1f, kv.b), yqVar.d(), 122);
        }
    }
}
