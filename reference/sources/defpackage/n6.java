package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class n6 extends qg1 implements ko, ug2, z21, c41, yz2 {
    public final p v = new p((Object) this, (byte) 5);
    public final /* synthetic */ t6 w;

    public n6(t6 t6Var) {
        this.w = t6Var;
    }

    @Override // defpackage.z21
    public final boolean U(KeyEvent keyEvent) {
        ul0 ul0Var;
        int[] iArr = yl0.a;
        long jF = ys.F(keyEvent);
        byte b = 4;
        if (t21.a(jF, t21.b)) {
            ul0Var = new ul0(2);
        } else if (t21.a(jF, t21.c)) {
            ul0Var = new ul0(1);
        } else if (t21.a(jF, t21.p)) {
            ul0Var = new ul0(keyEvent.isShiftPressed() ? 2 : 1);
        } else if (t21.a(jF, t21.g)) {
            ul0Var = new ul0(4);
        } else if (t21.a(jF, t21.f)) {
            ul0Var = new ul0(3);
        } else if (t21.a(jF, t21.d) || t21.a(jF, t21.C)) {
            ul0Var = new ul0(5);
        } else if (t21.a(jF, t21.e) || t21.a(jF, t21.D)) {
            ul0Var = new ul0(6);
        } else if (t21.a(jF, t21.h) || t21.a(jF, t21.r) || t21.a(jF, t21.E)) {
            ul0Var = new ul0(7);
        } else {
            ul0Var = (t21.a(jF, t21.a) || t21.a(jF, t21.u)) ? new ul0(8) : null;
        }
        if (ul0Var != null) {
            byte b2 = ul0Var.a;
            if (ys.G(keyEvent) == 2) {
                t6 t6Var = this.w;
                ((em0) t6Var.getFocusOwner()).f();
                Boolean boolE = ((em0) t6Var.getFocusOwner()).e(b2, t6Var.getEmbeddedViewFocusRect(), new p(ul0Var, b));
                if (boolE == null) {
                    return true;
                }
                if (boolE.booleanValue()) {
                    t6Var.getPlayNavigationSoundEffect$ui().f(ul0Var, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                    return true;
                }
                if (b2 != 1 && b2 != 2) {
                    return false;
                }
                Integer numB = yl0.b(b2);
                int iIntValue = numB != null ? numB.intValue() : 2;
                FocusFinder focusFinder = FocusFinder.getInstance();
                View rootView = t6Var.getRootView();
                rootView.getClass();
                View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, t6Var.getView(), iIntValue);
                if (viewFindNextFocus == null || viewFindNextFocus.equals(t6Var)) {
                    return ((em0) t6Var.getFocusOwner()).h(b2);
                }
            }
        }
        return false;
    }

    @Override // defpackage.ko
    public final Object Y(pn1 pn1Var, h6 h6Var, n10 n10Var) {
        long jS = pn1Var.S(0L);
        r72 r72Var = (r72) h6Var.a();
        r72 r72VarI = r72Var != null ? r72Var.i(jS) : null;
        if (r72VarI != null) {
            this.w.requestRectangleOnScreen(new Rect((int) r72VarI.a, (int) r72VarI.b, (int) r72VarI.c, (int) r72VarI.d), false);
        }
        return j23.a;
    }

    @Override // defpackage.c41
    public final af1 e(bf1 bf1Var, ue1 ue1Var, long j) {
        ny1 ny1VarE = ue1Var.e(j);
        return bf1Var.Q(ny1VarE.h, ny1VarE.i, bg0.h, this.v, new m6(ny1VarE, (byte) 0));
    }

    @Override // defpackage.z21
    public final boolean m(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.yz2
    public final Object r() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.ug2
    public final void h0(dh2 dh2Var) {
    }
}
