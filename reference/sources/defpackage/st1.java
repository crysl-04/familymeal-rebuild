package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class st1 extends qg1 implements c41 {
    public pt1 v;

    @Override // defpackage.c41
    public final af1 e(bf1 bf1Var, ue1 ue1Var, long j) {
        float fA = this.v.a(bf1Var.getLayoutDirection());
        float fD = this.v.d();
        float fB = this.v.b(bf1Var.getLayoutDirection());
        float fC = this.v.c();
        if (!((cc0.a(fA, 0.0f) >= 0) & (cc0.a(fD, 0.0f) >= 0) & (cc0.a(fB, 0.0f) >= 0) & (cc0.a(fC, 0.0f) >= 0))) {
            yw0.a("Padding must be non-negative");
        }
        int iR = bf1Var.R(fA);
        int iR2 = bf1Var.R(fB) + iR;
        int iR3 = bf1Var.R(fD);
        int iR4 = bf1Var.R(fC) + iR3;
        ny1 ny1VarE = ue1Var.e(l00.i(j, -iR2, -iR4));
        return bf1Var.g0(l00.g(ny1VarE.h + iR2, j), l00.f(ny1VarE.i + iR4, j), bg0.h, new ux0(ny1VarE, iR, iR3, (byte) 2));
    }
}
