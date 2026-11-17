package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class p43 {
    public static q83 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        q83 q83VarC = q83.c(rootWindowInsets, null);
        m83 m83Var = q83VarC.a;
        m83Var.w(q83VarC);
        View rootView = view.getRootView();
        m83Var.d(rootView);
        m83Var.o(rootView);
        m83Var.p();
        return q83VarC;
    }
}
