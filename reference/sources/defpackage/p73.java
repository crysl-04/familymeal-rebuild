package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class p73 extends AnimatorListenerAdapter {
    public final /* synthetic */ v73 a;
    public final /* synthetic */ View b;

    public p73(v73 v73Var, View view) {
        this.a = v73Var;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        v73 v73Var = this.a;
        v73Var.a.e(1.0f);
        r73.f(v73Var, this.b);
    }
}
