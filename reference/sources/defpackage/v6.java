package defpackage;

import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class v6 {
    public static final void a(wg2 wg2Var, AccessibilityEvent accessibilityEvent) {
        rg2 rg2Var = wg2Var.d;
        Object objG = rg2Var.h.g(ah2.M);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            li1.c();
        } else {
            Object objG2 = rg2Var.h.g(ah2.I);
            accessibilityEvent.setTextChangeTypes(accessibilityEvent.getTextChangeTypes() | (((qw2) (objG2 != null ? objG2 : null)) != null ? 1 : 0));
        }
    }
}
