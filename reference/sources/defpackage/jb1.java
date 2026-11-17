package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jb1 extends kb1 implements c91 {
    public final jo0 l;
    public final /* synthetic */ vi1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb1(vi1 vi1Var, jo0 jo0Var, qp1 qp1Var) {
        super(vi1Var, qp1Var);
        this.m = vi1Var;
        this.l = jo0Var;
    }

    @Override // defpackage.c91
    public final void e(e91 e91Var, w81 w81Var) {
        jo0 jo0Var = this.l;
        x81 x81Var = jo0Var.U.h;
        if (x81Var == x81.h) {
            this.m.e(this.h);
            return;
        }
        x81 x81Var2 = null;
        while (x81Var2 != x81Var) {
            d(h());
            x81Var2 = x81Var;
            x81Var = jo0Var.U.h;
        }
    }

    @Override // defpackage.kb1
    public final void f() {
        this.l.U.f(this);
    }

    @Override // defpackage.kb1
    public final boolean g(jo0 jo0Var) {
        return this.l == jo0Var;
    }

    @Override // defpackage.kb1
    public final boolean h() {
        return this.l.U.h.compareTo(x81.k) >= 0;
    }
}
