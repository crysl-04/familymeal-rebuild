package defpackage;

import android.app.Activity;
import android.app.FragmentManager;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class m82 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, w81 w81Var) {
        w81Var.getClass();
        if (activity instanceof e91) {
            h91 h91VarG = ((e91) activity).g();
            if (h91VarG instanceof h91) {
                h91VarG.d(w81Var);
            }
        }
    }

    public static void b(Activity activity) {
        o82.a.Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new o82.a());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new o82(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
