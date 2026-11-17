package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class g93 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View h;
    public final /* synthetic */ l72 i;

    public g93(View view, l72 l72Var) {
        this.h = view;
        this.i = l72Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.h.removeOnAttachStateChangeListener(this);
        this.i.x();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
