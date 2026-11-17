package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class p93 extends qg1 implements c41 {
    public ra0 v;
    public zp0 w;

    @Override // defpackage.c41
    public final af1 e(final bf1 bf1Var, ue1 ue1Var, long j) {
        final ny1 ny1VarE = ue1Var.e(l00.a(this.v != ra0.h ? 0 : k00.k(j), k00.i(j), this.v == ra0.i ? k00.j(j) : 0, k00.h(j)));
        final int iN = cy1.n(ny1VarE.h, k00.k(j), k00.i(j));
        final int iN2 = cy1.n(ny1VarE.i, k00.j(j), k00.h(j));
        return bf1Var.g0(iN, iN2, bg0.h, new vp0() { // from class: o93
            @Override // defpackage.vp0
            public final Object h(Object obj) {
                zp0 zp0Var = this.h.w;
                ny1 ny1Var = ny1VarE;
                my1.j((my1) obj, ny1Var, ((ny0) zp0Var.f(new vy0((((long) (iN - ny1Var.h)) << 32) | (((long) (iN2 - ny1Var.i)) & 4294967295L)), bf1Var.getLayoutDirection())).a);
                return j23.a;
            }
        });
    }
}
