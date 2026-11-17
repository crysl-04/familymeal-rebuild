package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ur1 extends zr1 {
    public static final ur1 c = new ur1(1, 0, 2);

    @Override // defpackage.zr1
    public final void a(yq0 yq0Var, rg rgVar, ik2 ik2Var, g82 g82Var, as1 as1Var) {
        int iC = yq0Var.c(0);
        int i = ik2Var.v;
        int iM = ik2Var.M(ik2Var.b, ik2Var.q(i));
        int iF = ik2Var.f(ik2Var.b, ik2Var.q(i + 1));
        for (int iMax = Math.max(iM, iF - iC); iMax < iF; iMax++) {
            Object obj = ik2Var.c[ik2Var.g(iMax)];
            if (obj instanceof hr0) {
                g82Var.e((hr0) obj);
            } else if (obj instanceof e72) {
                ((e72) obj).c();
            }
        }
        if (iC <= 0) {
            ez.a("Check failed");
        }
        int i2 = ik2Var.v;
        int iM2 = ik2Var.M(ik2Var.b, ik2Var.q(i2));
        int iF2 = ik2Var.f(ik2Var.b, ik2Var.q(i2 + 1)) - iC;
        if (iF2 < iM2) {
            ez.a("Check failed");
        }
        ik2Var.I(iF2, iC, i2);
        int i3 = ik2Var.i;
        if (i3 >= iM2) {
            ik2Var.i = i3 - iC;
        }
    }
}
