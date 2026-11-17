package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class sz0 extends qg1 implements c41 {
    public pz0 v;
    public boolean w;

    @Override // defpackage.c41
    public final int E(ad1 ad1Var, ue1 ue1Var, int i) {
        return ue1Var.d0(i);
    }

    @Override // defpackage.c41
    public final int S(ad1 ad1Var, ue1 ue1Var, int i) {
        return this.v == pz0.h ? ue1Var.U(i) : ue1Var.a0(i);
    }

    @Override // defpackage.c41
    public final af1 e(bf1 bf1Var, ue1 ue1Var, long j) {
        int iU = this.v == pz0.h ? ue1Var.U(k00.h(j)) : ue1Var.a0(k00.h(j));
        if (iU < 0) {
            iU = 0;
        }
        if (iU < 0) {
            cx0.a("width must be >= 0");
        }
        long jH = l00.h(iU, iU, 0, Integer.MAX_VALUE);
        if (this.w) {
            jH = l00.e(j, jH);
        }
        ny1 ny1VarE = ue1Var.e(jH);
        return bf1Var.g0(ny1VarE.h, ny1VarE.i, bg0.h, new m6(ny1VarE, (byte) 4));
    }

    @Override // defpackage.c41
    public final int g(ad1 ad1Var, ue1 ue1Var, int i) {
        return this.v == pz0.h ? ue1Var.U(i) : ue1Var.a0(i);
    }

    @Override // defpackage.c41
    public final int p(ad1 ad1Var, ue1 ue1Var, int i) {
        return ue1Var.g(i);
    }
}
