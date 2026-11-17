package defpackage;

import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rf1 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ sf1 h;

    public rf1(sf1 sf1Var) {
        this.h = sf1Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.h.c();
    }
}
