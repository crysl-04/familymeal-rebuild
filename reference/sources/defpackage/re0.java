package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class re0 {
    public abstract void a(Window window);

    public void b(zq2 zq2Var, zq2 zq2Var2, Window window, View view, boolean z, boolean z2) {
        pz1 s83Var;
        zq2Var.getClass();
        zq2Var2.getClass();
        window.getClass();
        view.getClass();
        h12.A(window, false);
        window.setStatusBarColor(z ? zq2Var.b : zq2Var.a);
        window.setNavigationBarColor(z2 ? zq2Var2.b : zq2Var2.a);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            s83Var = new t83(window);
        } else {
            s83Var = i >= 30 ? new s83(window) : new r83(window);
        }
        s83Var.x(!z);
        s83Var.w(!z2);
    }
}
