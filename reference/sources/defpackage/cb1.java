package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cb1 implements Runnable {
    public final /* synthetic */ byte h;
    public final /* synthetic */ fb1 i;

    public /* synthetic */ cb1(fb1 fb1Var, byte b) {
        this.h = b;
        this.i = fb1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.h;
        fb1 fb1Var = this.i;
        switch (b) {
            case 0:
                be0 be0Var = fb1Var.j;
                if (be0Var != null) {
                    be0Var.setListSelectionHidden(true);
                    be0Var.requestLayout();
                }
                break;
            default:
                be0 be0Var2 = fb1Var.j;
                if (be0Var2 != null) {
                    WeakHashMap weakHashMap = t43.a;
                    if (be0Var2.isAttachedToWindow() && fb1Var.j.getCount() > fb1Var.j.getChildCount() && fb1Var.j.getChildCount() <= fb1Var.t) {
                        fb1Var.F.setInputMethodMode(2);
                        fb1Var.d();
                        break;
                    }
                }
                break;
        }
    }
}
