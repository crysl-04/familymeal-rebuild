package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ot1 extends qg1 implements c41 {
    public float v;
    public float w;
    public float x;
    public float y;
    public boolean z;

    @Override // defpackage.c41
    public final af1 e(bf1 bf1Var, ue1 ue1Var, long j) {
        int iR = bf1Var.R(this.x) + bf1Var.R(this.v);
        int iR2 = bf1Var.R(this.y) + bf1Var.R(this.w);
        ny1 ny1VarE = ue1Var.e(l00.i(j, -iR, -iR2));
        return bf1Var.g0(l00.g(ny1VarE.h + iR, j), l00.f(ny1VarE.i + iR2, j), bg0.h, new g(this, ny1VarE, (byte) 27));
    }
}
