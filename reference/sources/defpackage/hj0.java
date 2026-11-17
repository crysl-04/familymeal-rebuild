package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hj0 extends qg1 implements c41 {
    public ra0 v;
    public float w;

    @Override // defpackage.c41
    public final af1 e(bf1 bf1Var, ue1 ue1Var, long j) {
        int iK;
        int i;
        int iH;
        int i2;
        if (!k00.e(j) || this.v == ra0.h) {
            iK = k00.k(j);
            i = k00.i(j);
        } else {
            int iRound = Math.round(k00.i(j) * this.w);
            int iK2 = k00.k(j);
            iK = k00.i(j);
            if (iRound < iK2) {
                iRound = iK2;
            }
            if (iRound <= iK) {
                iK = iRound;
            }
            i = iK;
        }
        if (!k00.d(j) || this.v == ra0.i) {
            int iJ = k00.j(j);
            int iH2 = k00.h(j);
            iH = iJ;
            i2 = iH2;
        } else {
            int iRound2 = Math.round(k00.h(j) * this.w);
            int iJ2 = k00.j(j);
            iH = k00.h(j);
            if (iRound2 < iJ2) {
                iRound2 = iJ2;
            }
            if (iRound2 <= iH) {
                iH = iRound2;
            }
            i2 = iH;
        }
        ny1 ny1VarE = ue1Var.e(l00.a(iK, i, iH, i2));
        return bf1Var.g0(ny1VarE.h, ny1VarE.i, bg0.h, new m6(ny1VarE, (byte) 2));
    }
}
