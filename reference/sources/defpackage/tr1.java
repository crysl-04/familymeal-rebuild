package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tr1 extends zr1 {
    public static final tr1 c = new tr1(0, 1, 1);

    @Override // defpackage.zr1
    public final void a(yq0 yq0Var, rg rgVar, ik2 ik2Var, g82 g82Var, as1 as1Var) {
        e72 e72Var = (e72) yq0Var.d(0);
        mj1 mj1Var = g82Var.i;
        xv1 xv1Var = mj1Var != null ? (xv1) mj1Var.g(e72Var) : null;
        if (xv1Var != null) {
            ArrayList arrayList = g82Var.j;
            if (arrayList == null) {
                arrayList = new ArrayList();
                g82Var.j = arrayList;
            }
            arrayList.add(g82Var.e);
            g82Var.e = xv1Var.i;
        }
    }
}
