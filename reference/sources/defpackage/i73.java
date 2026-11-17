package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class i73 extends f3 implements gf1 {
    public final Context j;
    public final if1 k;
    public ix0 l;
    public WeakReference m;
    public final /* synthetic */ j73 n;

    public i73(j73 j73Var, Context context, ix0 ix0Var) {
        this.n = j73Var;
        this.j = context;
        this.l = ix0Var;
        if1 if1Var = new if1(context);
        if1Var.l = true;
        this.k = if1Var;
        if1Var.e = this;
    }

    @Override // defpackage.gf1
    public final boolean b(if1 if1Var, MenuItem menuItem) {
        ix0 ix0Var = this.l;
        if (ix0Var != null) {
            return ((wk) ix0Var.i).C(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.f3
    public final void c() {
        j73 j73Var = this.n;
        if (j73Var.i != this) {
            return;
        }
        if (j73Var.p) {
            j73Var.j = this;
            j73Var.k = this.l;
        } else {
            this.l.L(this);
        }
        this.l = null;
        j73Var.a(false);
        ActionBarContextView actionBarContextView = j73Var.f;
        if (actionBarContextView.r == null) {
            actionBarContextView.removeAllViews();
            actionBarContextView.s = null;
            actionBarContextView.j = null;
        }
        ((jy2) j73Var.e).a.sendAccessibilityEvent(32);
        j73Var.c.setHideOnContentScrollEnabled(j73Var.t);
        j73Var.i = null;
    }

    @Override // defpackage.f3
    public final View e() {
        WeakReference weakReference = this.m;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.f3
    public final if1 f() {
        return this.k;
    }

    @Override // defpackage.gf1
    public final void g(if1 if1Var) {
        if (this.l != null) {
            k();
            b3 b3Var = this.n.f.k;
            if (b3Var != null) {
                b3Var.l();
            }
        }
    }

    @Override // defpackage.f3
    public final yp2 h() {
        return new yp2(this.j);
    }

    @Override // defpackage.f3
    public final CharSequence i() {
        return this.n.f.getSubtitle();
    }

    @Override // defpackage.f3
    public final CharSequence j() {
        return this.n.f.getTitle();
    }

    @Override // defpackage.f3
    public final void k() {
        if (this.n.i != this) {
            return;
        }
        if1 if1Var = this.k;
        if1Var.w();
        try {
            this.l.M(this, if1Var);
        } finally {
            if1Var.v();
        }
    }

    @Override // defpackage.f3
    public final boolean l() {
        return this.n.f.y;
    }

    @Override // defpackage.f3
    public final void m(View view) {
        this.n.f.setCustomView(view);
        this.m = new WeakReference(view);
    }

    @Override // defpackage.f3
    public final void n(int i) {
        o(this.n.a.getResources().getString(i));
    }

    @Override // defpackage.f3
    public final void o(CharSequence charSequence) {
        this.n.f.setSubtitle(charSequence);
    }

    @Override // defpackage.f3
    public final void p(int i) {
        q(this.n.a.getResources().getString(i));
    }

    @Override // defpackage.f3
    public final void q(CharSequence charSequence) {
        this.n.f.setTitle(charSequence);
    }

    @Override // defpackage.f3
    public final void r(boolean z) {
        this.h = z;
        this.n.f.setTitleOptional(z);
    }
}
