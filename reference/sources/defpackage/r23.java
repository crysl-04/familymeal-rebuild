package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class r23 extends qg1 implements c41 {
    public float v;
    public float w;

    @Override // defpackage.c41
    public final int E(ad1 ad1Var, ue1 ue1Var, int i) {
        int iD0 = ue1Var.d0(i);
        int iR = !Float.isNaN(this.w) ? ad1Var.R(this.w) : 0;
        return iD0 < iR ? iR : iD0;
    }

    @Override // defpackage.c41
    public final int S(ad1 ad1Var, ue1 ue1Var, int i) {
        int iU = ue1Var.U(i);
        int iR = !Float.isNaN(this.v) ? ad1Var.R(this.v) : 0;
        return iU < iR ? iR : iU;
    }

    @Override // defpackage.c41
    public final af1 e(bf1 bf1Var, ue1 ue1Var, long j) {
        int iK;
        int iJ;
        if (Float.isNaN(this.v) || k00.k(j) != 0) {
            iK = k00.k(j);
        } else {
            int iR = bf1Var.R(this.v);
            iK = k00.i(j);
            if (iR < 0) {
                iR = 0;
            }
            if (iR <= iK) {
                iK = iR;
            }
        }
        int i = k00.i(j);
        if (Float.isNaN(this.w) || k00.j(j) != 0) {
            iJ = k00.j(j);
        } else {
            int iR2 = bf1Var.R(this.w);
            iJ = k00.h(j);
            int i2 = iR2 >= 0 ? iR2 : 0;
            if (i2 <= iJ) {
                iJ = i2;
            }
        }
        ny1 ny1VarE = ue1Var.e(l00.a(iK, i, iJ, k00.h(j)));
        return bf1Var.g0(ny1VarE.h, ny1VarE.i, bg0.h, new m6(ny1VarE, (byte) 13));
    }

    @Override // defpackage.c41
    public final int g(ad1 ad1Var, ue1 ue1Var, int i) {
        int iA0 = ue1Var.a0(i);
        int iR = !Float.isNaN(this.v) ? ad1Var.R(this.v) : 0;
        return iA0 < iR ? iR : iA0;
    }

    @Override // defpackage.c41
    public final int p(ad1 ad1Var, ue1 ue1Var, int i) {
        int iG = ue1Var.g(i);
        int iR = !Float.isNaN(this.w) ? ad1Var.R(this.w) : 0;
        return iG < iR ? iR : iG;
    }
}
