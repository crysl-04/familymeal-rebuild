package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ij extends qg1 implements sd0, rp1, ug2 {
    public hi2 A;
    public ou B;
    public long v;
    public hi2 w;
    public long x;
    public u31 y;
    public ou z;

    @Override // defpackage.rp1
    public final void M() {
        this.x = 9205357640488583168L;
        this.y = null;
        this.z = null;
        this.A = null;
        dt.H(this);
    }

    @Override // defpackage.sd0
    public final void O(n41 n41Var) {
        n41 n41Var2;
        ou ouVar;
        yq yqVar = n41Var.h;
        if (this.w != t03.A) {
            n41Var2 = n41Var;
            if (wj2.a(yqVar.d(), this.x) && n41Var2.getLayoutDirection() == this.y && uz0.g(this.A, this.w)) {
                ouVar = this.z;
                ouVar.getClass();
            } else {
                ou.D(this, new h6((Object) this, (Object) n41Var2, (byte) 5));
                ouVar = this.B;
                this.B = null;
            }
            this.z = ouVar;
            this.x = yqVar.d();
            this.y = n41Var2.getLayoutDirection();
            this.A = this.w;
            ouVar.getClass();
            if (!r13.a(this.v, kv.g)) {
                es.z(n41Var2, ouVar, this.v);
            }
        } else if (r13.a(this.v, kv.g)) {
            n41Var2 = n41Var;
        } else {
            n41Var2 = n41Var;
            td0.H(n41Var2, this.v, 0L, 126);
        }
        n41Var2.a();
    }

    @Override // defpackage.ug2
    public final void h0(dh2 dh2Var) {
        bh2.l(dh2Var, this.w);
    }

    @Override // defpackage.ug2
    public final boolean j() {
        return false;
    }
}
