package defpackage;

import android.os.Trace;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k6 implements Runnable {
    public final /* synthetic */ byte h;
    public final /* synthetic */ t6 i;

    public /* synthetic */ k6(t6 t6Var, byte b) {
        this.h = b;
        this.i = t6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.h;
        t6 t6Var = this.i;
        switch (b) {
            case 0:
                ih ihVar = t6Var.p;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!ihVar.isEmpty()) {
                    try {
                        ((kp0) ihVar.removeLast()).a();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Trace.endSection();
                return;
            case 1:
                t6Var.D0 = false;
                MotionEvent motionEvent = t6Var.t0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    t6Var.G(motionEvent);
                    return;
                } else {
                    li1.g("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                t6.k(t6Var.getRoot());
                return;
            default:
                t6.k(t6Var.getRoot());
                return;
        }
    }
}
