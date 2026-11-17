package defpackage;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ba0 extends es {
    public final /* synthetic */ byte l = 0;
    public final /* synthetic */ jo0 m;

    public ba0(ca0 ca0Var, ba0 ba0Var) {
        this.m = ca0Var;
    }

    @Override // defpackage.es
    public final View W(int i) {
        byte b = this.l;
        jo0 jo0Var = this.m;
        switch (b) {
            case 0:
                Dialog dialog = ((ca0) jo0Var).q0;
                if (dialog != null) {
                    return dialog.findViewById(i);
                }
                return null;
            default:
                throw new IllegalStateException("Fragment " + jo0Var + " does not have a view");
        }
    }

    @Override // defpackage.es
    public final boolean X() {
        switch (this.l) {
            case 0:
                return ((ca0) this.m).u0;
            default:
                return false;
        }
    }

    public ba0(jo0 jo0Var) {
        this.m = jo0Var;
    }
}
