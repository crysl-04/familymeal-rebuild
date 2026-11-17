package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import com.familymeal.app.MainActivity;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pe0 implements Runnable {
    public final /* synthetic */ te0 h;
    public final /* synthetic */ zq2 i;
    public final /* synthetic */ zq2 j;
    public final /* synthetic */ MainActivity k;
    public final /* synthetic */ View l;

    public /* synthetic */ pe0(te0 te0Var, zq2 zq2Var, zq2 zq2Var2, MainActivity mainActivity, View view) {
        this.h = te0Var;
        this.i = zq2Var;
        this.j = zq2Var2;
        this.k = mainActivity;
        this.l = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window = this.k.getWindow();
        window.getClass();
        zq2 zq2Var = this.i;
        vp0 vp0Var = zq2Var.c;
        View view = this.l;
        Resources resources = view.getResources();
        resources.getClass();
        boolean zBooleanValue = ((Boolean) vp0Var.h(resources)).booleanValue();
        zq2 zq2Var2 = this.j;
        vp0 vp0Var2 = zq2Var2.c;
        Resources resources2 = view.getResources();
        resources2.getClass();
        this.h.b(zq2Var, zq2Var2, window, view, zBooleanValue, ((Boolean) vp0Var2.h(resources2)).booleanValue());
    }
}
