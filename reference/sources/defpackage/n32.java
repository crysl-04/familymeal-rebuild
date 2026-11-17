package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class n32 extends uf0 {
    final /* synthetic */ o32 this$0;

    /* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
    public static final class a extends uf0 {
        final /* synthetic */ o32 this$0;

        public a(o32 o32Var) {
            this.this$0 = o32Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            o32 o32Var = this.this$0;
            int i = o32Var.i + 1;
            o32Var.i = i;
            if (i == 1) {
                if (o32Var.j) {
                    o32Var.m.d(w81.ON_RESUME);
                    o32Var.j = false;
                } else {
                    Handler handler = o32Var.l;
                    handler.getClass();
                    handler.removeCallbacks(o32Var.n);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            o32 o32Var = this.this$0;
            int i = o32Var.h + 1;
            o32Var.h = i;
            if (i == 1 && o32Var.k) {
                o32Var.m.d(w81.ON_START);
                o32Var.k = false;
            }
        }
    }

    public n32(o32 o32Var) {
        this.this$0 = o32Var;
    }

    @Override // defpackage.uf0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // defpackage.uf0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        o32 o32Var = this.this$0;
        int i = o32Var.i - 1;
        o32Var.i = i;
        if (i == 0) {
            Handler handler = o32Var.l;
            handler.getClass();
            handler.postDelayed(o32Var.n, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        activity.registerActivityLifecycleCallbacks(new a(this.this$0));
    }

    @Override // defpackage.uf0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        o32 o32Var = this.this$0;
        int i = o32Var.h - 1;
        o32Var.h = i;
        if (i == 0 && o32Var.j) {
            o32Var.m.d(w81.ON_STOP);
            o32Var.k = true;
        }
    }
}
