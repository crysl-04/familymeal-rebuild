package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class uf1 extends fb1 implements kf1 {
    public g2 G;

    @Override // defpackage.kf1
    public final void g(if1 if1Var, lf1 lf1Var) {
        g2 g2Var = this.G;
        if (g2Var != null) {
            g2Var.g(if1Var, lf1Var);
        }
    }

    @Override // defpackage.kf1
    public final void k(if1 if1Var, lf1 lf1Var) {
        g2 g2Var = this.G;
        if (g2Var != null) {
            g2Var.k(if1Var, lf1Var);
        }
    }

    @Override // defpackage.fb1
    public final be0 q(Context context, boolean z) {
        tf1 tf1Var = new tf1(context, z);
        tf1Var.setHoverListener(this);
        return tf1Var;
    }
}
