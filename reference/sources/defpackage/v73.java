package defpackage;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class v73 {
    public u73 a;

    public v73(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new t73(w1.i(i, interpolator, j));
        } else {
            this.a = new r73(i, interpolator, j);
        }
    }

    public static void a(View view, n73 n73Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(n73Var != null ? new s73(n73Var) : null);
            return;
        }
        PathInterpolator pathInterpolator = r73.e;
        View.OnApplyWindowInsetsListener q73Var = n73Var != null ? new q73(view, n73Var) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, q73Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(q73Var);
        }
    }
}
