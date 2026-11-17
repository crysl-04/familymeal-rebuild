package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class o73 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ v73 a;
    public final /* synthetic */ q83 b;
    public final /* synthetic */ q83 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public o73(v73 v73Var, q83 q83Var, q83 q83Var2, int i, View view) {
        this.a = v73Var;
        this.b = q83Var;
        this.c = q83Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        c83 x73Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        v73 v73Var = this.a;
        u73 u73Var = v73Var.a;
        u73Var.e(animatedFraction);
        float fC = u73Var.c();
        PathInterpolator pathInterpolator = r73.e;
        int i = Build.VERSION.SDK_INT;
        q83 q83Var = this.b;
        if (i >= 36) {
            x73Var = new b83(q83Var);
        } else if (i >= 35) {
            x73Var = new a83(q83Var);
        } else if (i >= 34) {
            x73Var = new z73(q83Var);
        } else if (i >= 31) {
            x73Var = new y73(q83Var);
        } else {
            x73Var = i >= 30 ? new x73(q83Var) : new w73(q83Var);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            m83 m83Var = q83Var.a;
            if (i3 == 0) {
                x73Var.d(i2, m83Var.h(i2));
            } else {
                ox0 ox0VarH = m83Var.h(i2);
                ox0 ox0VarH2 = this.c.a.h(i2);
                float f = 1.0f - fC;
                x73Var.d(i2, q83.a(ox0VarH, (int) (((double) ((ox0VarH.a - ox0VarH2.a) * f)) + 0.5d), (int) (((double) ((ox0VarH.b - ox0VarH2.b) * f)) + 0.5d), (int) (((double) ((ox0VarH.c - ox0VarH2.c) * f)) + 0.5d), (int) (((double) ((ox0VarH.d - ox0VarH2.d) * f)) + 0.5d)));
            }
        }
        r73.h(this.e, x73Var.b(), Collections.singletonList(v73Var));
    }
}
