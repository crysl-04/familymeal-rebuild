package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.familymeal.app.MainActivity;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cx implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long h = SystemClock.uptimeMillis() + 10000;
    public Runnable i;
    public boolean j;
    public final /* synthetic */ MainActivity k;

    public cx(MainActivity mainActivity) {
        this.k = mainActivity;
    }

    public final void a(View view) {
        if (this.j) {
            return;
        }
        this.j = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.i = runnable;
        View decorView = this.k.getWindow().getDecorView();
        decorView.getClass();
        if (!this.j) {
            decorView.postOnAnimation(new t(this, (byte) 5));
        } else if (uz0.g(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.i;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.h) {
                this.j = false;
                this.k.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.i = null;
        jp0 jp0Var = (jp0) this.k.n.getValue();
        synchronized (jp0Var.b) {
            z = jp0Var.c;
        }
        if (z) {
            this.j = false;
            this.k.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.k.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
