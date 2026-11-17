package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class en2 extends qf1 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public boolean A;
    public final Context i;
    public final if1 j;
    public final ff1 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final uf1 o;
    public rf1 r;
    public View s;
    public View t;
    public vf1 u;
    public ViewTreeObserver v;
    public boolean w;
    public boolean x;
    public int y;
    public final hf p = new hf(this, 3);
    public final r8 q = new r8(this, 2);
    public int z = 0;

    public en2(Context context, if1 if1Var, View view, int i, boolean z) {
        this.i = context;
        this.j = if1Var;
        this.l = z;
        this.k = new ff1(if1Var, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.n = i;
        Resources resources = context.getResources();
        this.m = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.s = view;
        this.o = new uf1(context, null, i);
        if1Var.b(this, context);
    }

    @Override // defpackage.aj2
    public final boolean a() {
        return !this.w && this.o.F.isShowing();
    }

    @Override // defpackage.wf1
    public final void c(if1 if1Var, boolean z) {
        if (if1Var == this.j) {
            dismiss();
            vf1 vf1Var = this.u;
            if (vf1Var != null) {
                vf1Var.c(if1Var, z);
            }
        }
    }

    @Override // defpackage.aj2
    public final void d() {
        View view;
        if (a()) {
            return;
        }
        if (this.w || (view = this.s) == null) {
            li1.g("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.t = view;
        uf1 uf1Var = this.o;
        af afVar = uf1Var.F;
        af afVar2 = uf1Var.F;
        afVar.setOnDismissListener(this);
        uf1Var.w = this;
        uf1Var.E = true;
        afVar2.setFocusable(true);
        View view2 = this.t;
        boolean z = this.v == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.v = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.p);
        }
        view2.addOnAttachStateChangeListener(this.q);
        uf1Var.v = view2;
        uf1Var.s = this.z;
        boolean z2 = this.x;
        Context context = this.i;
        ff1 ff1Var = this.k;
        if (!z2) {
            this.y = qf1.m(ff1Var, context, this.m);
            this.x = true;
        }
        uf1Var.r(this.y);
        afVar2.setInputMethodMode(2);
        Rect rect = this.h;
        uf1Var.D = rect != null ? new Rect(rect) : null;
        uf1Var.d();
        be0 be0Var = uf1Var.j;
        be0Var.setOnKeyListener(this);
        if (this.A) {
            if1 if1Var = this.j;
            if (if1Var.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) be0Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(if1Var.m);
                }
                frameLayout.setEnabled(false);
                be0Var.addHeaderView(frameLayout, null, false);
            }
        }
        uf1Var.p(ff1Var);
        uf1Var.d();
    }

    @Override // defpackage.aj2
    public final void dismiss() {
        if (a()) {
            this.o.dismiss();
        }
    }

    @Override // defpackage.wf1
    public final void e(vf1 vf1Var) {
        this.u = vf1Var;
    }

    @Override // defpackage.wf1
    public final void g() {
        this.x = false;
        ff1 ff1Var = this.k;
        if (ff1Var != null) {
            ff1Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.aj2
    public final be0 h() {
        return this.o.j;
    }

    @Override // defpackage.wf1
    public final boolean j(wo2 wo2Var) {
        boolean z;
        if (wo2Var.hasVisibleItems()) {
            sf1 sf1Var = new sf1(this.i, wo2Var, this.t, this.l, this.n, 0);
            vf1 vf1Var = this.u;
            sf1Var.h = vf1Var;
            qf1 qf1Var = sf1Var.i;
            if (qf1Var != null) {
                qf1Var.e(vf1Var);
            }
            int size = wo2Var.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = wo2Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            sf1Var.g = z;
            qf1 qf1Var2 = sf1Var.i;
            if (qf1Var2 != null) {
                qf1Var2.o(z);
            }
            sf1Var.j = this.r;
            this.r = null;
            this.j.c(false);
            uf1 uf1Var = this.o;
            int width = uf1Var.m;
            int iN = uf1Var.n();
            int i2 = this.z;
            View view = this.s;
            WeakHashMap weakHashMap = t43.a;
            if ((Gravity.getAbsoluteGravity(i2, view.getLayoutDirection()) & 7) == 5) {
                width += this.s.getWidth();
            }
            if (!sf1Var.b()) {
                if (sf1Var.e != null) {
                    sf1Var.d(width, iN, true, true);
                }
            }
            vf1 vf1Var2 = this.u;
            if (vf1Var2 != null) {
                vf1Var2.v(wo2Var);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.wf1
    public final boolean k() {
        return false;
    }

    @Override // defpackage.qf1
    public final void n(View view) {
        this.s = view;
    }

    @Override // defpackage.qf1
    public final void o(boolean z) {
        this.k.j = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.w = true;
        this.j.c(true);
        ViewTreeObserver viewTreeObserver = this.v;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.v = this.t.getViewTreeObserver();
            }
            this.v.removeGlobalOnLayoutListener(this.p);
            this.v = null;
        }
        this.t.removeOnAttachStateChangeListener(this.q);
        rf1 rf1Var = this.r;
        if (rf1Var != null) {
            rf1Var.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.qf1
    public final void p(int i) {
        this.z = i;
    }

    @Override // defpackage.qf1
    public final void q(int i) {
        this.o.m = i;
    }

    @Override // defpackage.qf1
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.r = (rf1) onDismissListener;
    }

    @Override // defpackage.qf1
    public final void s(boolean z) {
        this.A = z;
    }

    @Override // defpackage.qf1
    public final void t(int i) {
        this.o.i(i);
    }
}
