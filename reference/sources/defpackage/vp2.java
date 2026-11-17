package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vp2 extends ActionMode {
    public final Context a;
    public final f3 b;

    public vp2(Context context, f3 f3Var) {
        this.a = context;
        this.b = f3Var;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.b.c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.b.e();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new zf1(this.a, this.b.f());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.b.i();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.b.i;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.h;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.k();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.l();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.b.m(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.b.i = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.b.q(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.b.r(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.b.n(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.b.p(i);
    }
}
