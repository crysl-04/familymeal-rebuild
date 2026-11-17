package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class r73 extends u73 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final ti0 f = new ti0();
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(v73 v73Var, View view) {
        n73 n73VarJ = j(view);
        if (n73VarJ != null) {
            n73VarJ.b(v73Var);
            if (n73VarJ.i == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(v73Var, viewGroup.getChildAt(i));
            }
        }
    }

    public static void g(View view, v73 v73Var, q83 q83Var, boolean z) {
        n73 n73VarJ = j(view);
        if (n73VarJ != null) {
            n73VarJ.h = q83Var;
            if (!z) {
                n73VarJ.c(v73Var);
                z = n73VarJ.i == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), v73Var, q83Var, z);
            }
        }
    }

    public static void h(View view, q83 q83Var, List list) {
        n73 n73VarJ = j(view);
        if (n73VarJ != null) {
            q83Var = n73VarJ.d(q83Var, list);
            if (n73VarJ.i == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), q83Var, list);
            }
        }
    }

    public static void i(View view, v73 v73Var, k42 k42Var) {
        n73 n73VarJ = j(view);
        if (n73VarJ != null) {
            n73VarJ.e(v73Var, k42Var);
            if (n73VarJ.i == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), v73Var, k42Var);
            }
        }
    }

    public static n73 j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof q73) {
            return ((q73) tag).a;
        }
        return null;
    }
}
