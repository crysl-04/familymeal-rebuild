package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class r2 implements Runnable {
    public final /* synthetic */ byte h;
    public final /* synthetic */ ActionBarOverlayLayout i;

    public /* synthetic */ r2(ActionBarOverlayLayout actionBarOverlayLayout, byte b) {
        this.h = b;
        this.i = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.h;
        ActionBarOverlayLayout actionBarOverlayLayout = this.i;
        switch (b) {
            case 0:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.D = actionBarOverlayLayout.k.animate().translationY(0.0f).setListener(actionBarOverlayLayout.E);
                break;
            default:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.D = actionBarOverlayLayout.k.animate().translationY(-actionBarOverlayLayout.k.getHeight()).setListener(actionBarOverlayLayout.E);
                break;
        }
    }
}
