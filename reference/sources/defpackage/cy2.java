package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cy2 implements wf1 {
    public if1 h;
    public lf1 i;
    public final /* synthetic */ Toolbar j;

    public cy2(Toolbar toolbar) {
        this.j = toolbar;
    }

    @Override // defpackage.wf1
    public final boolean b(lf1 lf1Var) {
        Toolbar toolbar = this.j;
        KeyEvent.Callback callback = toolbar.p;
        if (callback instanceof av) {
            ((av) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.p);
        toolbar.removeView(toolbar.o);
        toolbar.p = null;
        ArrayList arrayList = toolbar.L;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.i = null;
        toolbar.requestLayout();
        lf1Var.C = false;
        lf1Var.n.p(false);
        return true;
    }

    @Override // defpackage.wf1
    public final boolean f(lf1 lf1Var) {
        Toolbar toolbar = this.j;
        toolbar.c();
        ViewParent parent = toolbar.o.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.o);
            }
            toolbar.addView(toolbar.o);
        }
        View actionView = lf1Var.getActionView();
        toolbar.p = actionView;
        this.i = lf1Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.p);
            }
            dy2 dy2VarH = Toolbar.h();
            dy2VarH.a = (toolbar.u & 112) | 8388611;
            dy2VarH.b = (byte) 2;
            toolbar.p.setLayoutParams(dy2VarH);
            toolbar.addView(toolbar.p);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((dy2) childAt.getLayoutParams()).b != 2 && childAt != toolbar.h) {
                toolbar.removeViewAt(childCount);
                toolbar.L.add(childAt);
            }
        }
        toolbar.requestLayout();
        lf1Var.C = true;
        lf1Var.n.p(false);
        KeyEvent.Callback callback = toolbar.p;
        if (callback instanceof av) {
            ((av) callback).onActionViewExpanded();
        }
        return true;
    }

    @Override // defpackage.wf1
    public final void g() {
        if (this.i != null) {
            if1 if1Var = this.h;
            if (if1Var != null) {
                int size = if1Var.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.h.getItem(i) == this.i) {
                        return;
                    }
                }
            }
            b(this.i);
        }
    }

    @Override // defpackage.wf1
    public final void i(Context context, if1 if1Var) {
        lf1 lf1Var;
        if1 if1Var2 = this.h;
        if (if1Var2 != null && (lf1Var = this.i) != null) {
            if1Var2.d(lf1Var);
        }
        this.h = if1Var;
    }

    @Override // defpackage.wf1
    public final boolean j(wo2 wo2Var) {
        return false;
    }

    @Override // defpackage.wf1
    public final boolean k() {
        return false;
    }

    @Override // defpackage.wf1
    public final void c(if1 if1Var, boolean z) {
    }
}
