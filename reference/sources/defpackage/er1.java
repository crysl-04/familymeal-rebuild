package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class er1 extends zr1 {
    public static final er1 c = new er1(0, 1, 1);

    @Override // defpackage.zr1
    public final void a(yq0 yq0Var, rg rgVar, ik2 ik2Var, g82 g82Var, as1 as1Var) {
        uj1 uj1Var;
        e72 e72Var = (e72) yq0Var.d(0);
        mj1 mj1Var = g82Var.i;
        if (mj1Var == null || ((xv1) mj1Var.g(e72Var)) == null) {
            return;
        }
        ArrayList arrayList = g82Var.j;
        if (arrayList != null && (uj1Var = (uj1) arrayList.remove(arrayList.size() - 1)) != null) {
            g82Var.e = uj1Var;
        }
        mj1Var.l(e72Var);
    }
}
