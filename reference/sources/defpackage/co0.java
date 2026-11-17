package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class co0 implements Runnable {
    public final /* synthetic */ byte h;
    public final /* synthetic */ do0 i;

    public /* synthetic */ co0(do0 do0Var, byte b) {
        this.h = b;
        this.i = do0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.h;
        do0 do0Var = this.i;
        switch (b) {
            case 0:
                ViewParent parent = do0Var.k.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                do0Var.a();
                View view = do0Var.k;
                if (view.isEnabled() && !view.isLongClickable() && do0Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    do0Var.n = true;
                    break;
                }
                break;
        }
    }
}
