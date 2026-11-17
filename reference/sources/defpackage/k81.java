package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class k81 extends qg1 implements pz, sr0 {
    public c9 v;
    public p81 w;
    public kv2 x;
    public final lu1 y = rz1.x(null);

    public k81(c9 c9Var, p81 p81Var, kv2 kv2Var) {
        this.v = c9Var;
        this.w = p81Var;
        this.x = kv2Var;
    }

    @Override // defpackage.qg1
    public final void B0() {
        c9 c9Var = this.v;
        if (c9Var.a != null) {
            dx0.c("Expected textInputModifierNode to be null");
        }
        c9Var.a = this;
    }

    @Override // defpackage.qg1
    public final void C0() {
        this.v.k(this);
    }

    @Override // defpackage.sr0
    public final void v(pn1 pn1Var) {
        this.y.setValue(pn1Var);
    }
}
