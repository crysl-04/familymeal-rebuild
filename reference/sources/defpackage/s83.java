package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class s83 extends pz1 {
    public final WindowInsetsController d;
    public final Window e;

    public s83(Window window) {
        this.d = window.getInsetsController();
        this.e = window;
    }

    public final void G(int i, int i2, boolean z) {
        Window window = this.e;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.d;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | i);
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (~i));
        }
    }

    @Override // defpackage.pz1
    public void w(boolean z) {
        G(16, 16, z);
    }

    @Override // defpackage.pz1
    public void x(boolean z) {
        G(8192, 8, z);
    }
}
