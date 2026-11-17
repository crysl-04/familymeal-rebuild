package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class z90 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ ca0 h;

    public z90(ca0 ca0Var) {
        this.h = ca0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ca0 ca0Var = this.h;
        Dialog dialog = ca0Var.q0;
        if (dialog != null) {
            ca0Var.onCancel(dialog);
        }
    }
}
