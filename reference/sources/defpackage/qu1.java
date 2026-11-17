package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qu1 extends qg1 implements c41 {
    public float v;
    public iu1 w;

    @Override // defpackage.c41
    public final af1 e(bf1 bf1Var, ue1 ue1Var, long j) {
        iu1 iu1Var = this.w;
        int iRound = (iu1Var == null || ((Number) iu1Var.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) iu1Var.getValue()).floatValue() * this.v);
        int iK = iRound != Integer.MAX_VALUE ? iRound : k00.k(j);
        int iJ = k00.j(j);
        if (iRound == Integer.MAX_VALUE) {
            iRound = k00.i(j);
        }
        ny1 ny1VarE = ue1Var.e(l00.a(iK, iRound, iJ, k00.h(j)));
        return bf1Var.g0(ny1VarE.h, ny1VarE.i, bg0.h, new m6(ny1VarE, (byte) 7));
    }
}
