package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class uq1 extends zr1 {
    public static final uq1 c = new uq1(0, 2, 1);

    @Override // defpackage.zr1
    public final void a(yq0 yq0Var, rg rgVar, ik2 ik2Var, g82 g82Var, as1 as1Var) {
        xq0 xq0Var = (xq0) yq0Var.d(0);
        Object objD = yq0Var.d(1);
        if (objD instanceof hr0) {
            hr0 hr0Var = (hr0) objD;
            g82Var.e.b(hr0Var);
            g82Var.d.a(hr0Var);
        }
        if (ik2Var.n != 0) {
            ez.a("Can only append a slot if not current inserting");
        }
        int i = ik2Var.i;
        int i2 = ik2Var.j;
        int iC = ik2Var.c(xq0Var);
        int iF = ik2Var.f(ik2Var.b, ik2Var.q(iC + 1));
        ik2Var.i = iF;
        ik2Var.j = iF;
        ik2Var.w(1, iC);
        if (i >= iF) {
            i++;
            i2++;
        }
        ik2Var.c[iF] = objD;
        ik2Var.i = i;
        ik2Var.j = i2;
    }
}
