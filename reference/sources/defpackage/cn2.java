package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cn2 extends f3 implements gf1 {
    public Context j;
    public ActionBarContextView k;
    public ix0 l;
    public WeakReference m;
    public boolean n;
    public if1 o;

    @Override // defpackage.gf1
    public final boolean b(if1 if1Var, MenuItem menuItem) {
        return ((wk) this.l.i).C(this, menuItem);
    }

    @Override // defpackage.f3
    public final void c() {
        if (this.n) {
            return;
        }
        this.n = true;
        this.k.sendAccessibilityEvent(32);
        this.l.L(this);
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
        return this.o;
    }

    @Override // defpackage.gf1
    public final void g(if1 if1Var) {
        k();
        b3 b3Var = this.k.k;
        if (b3Var != null) {
            b3Var.l();
        }
    }

    @Override // defpackage.f3
    public final yp2 h() {
        return new yp2(this.k.getContext());
    }

    @Override // defpackage.f3
    public final CharSequence i() {
        return this.k.getSubtitle();
    }

    @Override // defpackage.f3
    public final CharSequence j() {
        return this.k.getTitle();
    }

    @Override // defpackage.f3
    public final void k() {
        this.l.M(this, this.o);
    }

    @Override // defpackage.f3
    public final boolean l() {
        return this.k.y;
    }

    @Override // defpackage.f3
    public final void m(View view) {
        this.k.setCustomView(view);
        this.m = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.f3
    public final void n(int i) {
        o(this.j.getString(i));
    }

    @Override // defpackage.f3
    public final void o(CharSequence charSequence) {
        this.k.setSubtitle(charSequence);
    }

    @Override // defpackage.f3
    public final void p(int i) {
        q(this.j.getString(i));
    }

    @Override // defpackage.f3
    public final void q(CharSequence charSequence) {
        this.k.setTitle(charSequence);
    }

    @Override // defpackage.f3
    public final void r(boolean z) {
        this.h = z;
        this.k.setTitleOptional(z);
    }
}
