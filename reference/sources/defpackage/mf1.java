package defpackage;

import android.view.ActionProvider;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class mf1 implements ActionProvider.VisibilityListener {
    public final ActionProvider a;
    public g2 b;

    public mf1(pf1 pf1Var, ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        g2 g2Var = this.b;
        if (g2Var != null) {
            if1 if1Var = ((lf1) g2Var.i).n;
            if1Var.h = true;
            if1Var.p(true);
        }
    }
}
