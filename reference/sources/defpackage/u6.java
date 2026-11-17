package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u6 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ a7 i;

    public /* synthetic */ u6(a7 a7Var, byte b) {
        this.h = b;
        this.i = a7Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        a7 a7Var = this.i;
        switch (b) {
            case 0:
                View view = a7Var.k;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                vd2 vd2Var = (vd2) obj;
                if (vd2Var.i.contains(vd2Var)) {
                    it1 snapshotObserver = a7Var.k.getSnapshotObserver();
                    snapshotObserver.a.d(vd2Var, a7Var.T, new h6((Object) vd2Var, (Object) a7Var, (byte) 1));
                }
                return j23.a;
        }
    }
}
