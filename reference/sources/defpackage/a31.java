package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class a31 extends qg1 implements z21 {
    public vp0 v;
    public vp0 w;

    @Override // defpackage.z21
    public final boolean U(KeyEvent keyEvent) {
        vp0 vp0Var = this.v;
        if (vp0Var != null) {
            return ((Boolean) vp0Var.h(new v21(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.z21
    public final boolean m(KeyEvent keyEvent) {
        vp0 vp0Var = this.w;
        if (vp0Var != null) {
            return ((Boolean) vp0Var.h(new v21(keyEvent))).booleanValue();
        }
        return false;
    }
}
