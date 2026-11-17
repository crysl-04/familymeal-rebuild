package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nr1 extends zr1 {
    public static final nr1 c = new nr1(0, 1, 1);

    @Override // defpackage.zr1
    public final void a(yq0 yq0Var, rg rgVar, ik2 ik2Var, g82 g82Var, as1 as1Var) {
        e72 e72Var = (e72) yq0Var.d(0);
        Set set = g82Var.a;
        if (set == null) {
            return;
        }
        xv1 xv1Var = new xv1(set);
        mj1 mj1Var = g82Var.i;
        if (mj1Var == null) {
            long[] jArr = bd2.a;
            mj1Var = new mj1();
            g82Var.i = mj1Var;
        }
        mj1Var.n(e72Var, xv1Var);
        g82Var.e.b(new hr0(xv1Var, -1));
    }
}
