package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wo2 extends if1 implements SubMenu {
    public final lf1 A;
    public final if1 z;

    public wo2(Context context, if1 if1Var, lf1 lf1Var) {
        super(context);
        this.z = if1Var;
        this.A = lf1Var;
    }

    @Override // defpackage.if1
    public final boolean d(lf1 lf1Var) {
        return this.z.d(lf1Var);
    }

    @Override // defpackage.if1
    public final boolean e(if1 if1Var, MenuItem menuItem) {
        return super.e(if1Var, menuItem) || this.z.e(if1Var, menuItem);
    }

    @Override // defpackage.if1
    public final boolean f(lf1 lf1Var) {
        return this.z.f(lf1Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.if1
    public final String j() {
        int i = this.A.a;
        if (i == 0) {
            return null;
        }
        return jp1.h(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.if1
    public final if1 k() {
        return this.z.k();
    }

    @Override // defpackage.if1
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.if1
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.if1
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.if1, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // defpackage.if1, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }
}
