package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hy2 implements View.OnClickListener {
    public final u2 h;
    public final /* synthetic */ jy2 i;

    public hy2(jy2 jy2Var) {
        this.i = jy2Var;
        Context context = jy2Var.a.getContext();
        CharSequence charSequence = jy2Var.h;
        u2 u2Var = new u2();
        u2Var.e = 4096;
        u2Var.g = 4096;
        u2Var.l = null;
        u2Var.m = null;
        u2Var.n = false;
        u2Var.o = false;
        u2Var.p = 16;
        u2Var.i = context;
        u2Var.a = charSequence;
        this.h = u2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jy2 jy2Var = this.i;
        Window.Callback callback = jy2Var.k;
        if (callback == null || !jy2Var.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.h);
    }
}
