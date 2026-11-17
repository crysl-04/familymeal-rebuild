package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class vx0 extends qx0 implements c41 {
    public m73 x;

    public vx0(m73 m73Var) {
        this.x = m73Var;
    }

    @Override // defpackage.qx0
    public final m73 J0(m73 m73Var) {
        return new i23(m73Var, this.x);
    }

    @Override // defpackage.qx0
    public final void K0() {
        super.K0();
        vs.E(this);
    }

    @Override // defpackage.c41
    public final af1 e(bf1 bf1Var, ue1 ue1Var, long j) {
        int iD = this.w.d(bf1Var, bf1Var.getLayoutDirection()) - this.v.d(bf1Var, bf1Var.getLayoutDirection());
        int iB = this.w.b(bf1Var) - this.v.b(bf1Var);
        int iC = (this.w.c(bf1Var, bf1Var.getLayoutDirection()) - this.v.c(bf1Var, bf1Var.getLayoutDirection())) + iD;
        int iA = (this.w.a(bf1Var) - this.v.a(bf1Var)) + iB;
        ny1 ny1VarE = ue1Var.e(l00.i(j, -iC, -iA));
        return bf1Var.g0(l00.g(ny1VarE.h + iC, j), l00.f(ny1VarE.i + iA, j), bg0.h, new ux0(ny1VarE, iD, iB, (byte) 0));
    }
}
