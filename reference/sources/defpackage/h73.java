package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class h73 extends pz1 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ j73 e;

    public /* synthetic */ h73(j73 j73Var, byte b) {
        this.d = b;
        this.e = j73Var;
    }

    @Override // defpackage.o53
    public final void a() {
        View view;
        byte b = this.d;
        j73 j73Var = this.e;
        switch (b) {
            case 0:
                if (j73Var.o && (view = j73Var.g) != null) {
                    view.setTranslationY(0.0f);
                    j73Var.d.setTranslationY(0.0f);
                }
                j73Var.d.setVisibility(8);
                j73Var.d.setTransitioning(false);
                j73Var.s = null;
                ix0 ix0Var = j73Var.k;
                if (ix0Var != null) {
                    ix0Var.L(j73Var.j);
                    j73Var.j = null;
                    j73Var.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = j73Var.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = t43.a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
                break;
            default:
                j73Var.s = null;
                j73Var.d.requestLayout();
                break;
        }
    }
}
