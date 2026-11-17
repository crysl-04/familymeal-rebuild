package defpackage;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xw implements c91 {
    public final /* synthetic */ kq1 h;
    public final /* synthetic */ gx i;

    public /* synthetic */ xw(kq1 kq1Var, gx gxVar) {
        this.h = kq1Var;
        this.i = gxVar;
    }

    @Override // defpackage.c91
    public final void e(e91 e91Var, w81 w81Var) {
        if (w81Var == w81.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = this.i.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            this.h.c(onBackInvokedDispatcher);
        }
    }
}
