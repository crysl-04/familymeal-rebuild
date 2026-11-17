package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fa implements c22, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long o;
    public final View h;
    public boolean j;
    public boolean m;
    public long n;
    public final PriorityQueue i = new PriorityQueue(11, new da(0));
    public final Choreographer k = Choreographer.getInstance();
    public final ea l = new ea();

    /* JADX WARN: Code duplicated, block: B:9:0x003f  */
    public fa(View view) {
        float refreshRate;
        this.h = view;
        if (o == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            o = (long) (1.0E9f / refreshRate);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.m = true;
        }
    }

    @Override // defpackage.c22
    public final void a(b22 b22Var) {
        this.i.add(new l32(1, b22Var));
        if (this.j) {
            return;
        }
        this.j = true;
        this.h.post(this);
    }

    public final boolean b() {
        ea eaVar = this.l;
        long jA = eaVar.a();
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", jA);
        boolean z = true;
        if (jA > 0) {
            PriorityQueue priorityQueue = this.i;
            Object objPeek = priorityQueue.peek();
            objPeek.getClass();
            if (!((l32) objPeek).b.c(eaVar)) {
                priorityQueue.poll();
                z = false;
            }
            eaVar.a = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.m) {
            this.n = j;
            this.h.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.m = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.m = false;
        this.h.removeCallbacks(this);
        this.k.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.i;
        if (!priorityQueue.isEmpty() && this.j && this.m) {
            View view = this.h;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (o << 1) + nanos;
                ea eaVar = this.l;
                eaVar.a = z;
                eaVar.b = Math.max(this.n, nanos) + o;
                boolean zB = false;
                while (!priorityQueue.isEmpty() && !zB) {
                    if (eaVar.a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zB = b();
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } else {
                        zB = b();
                    }
                }
                if (zB) {
                    this.k.postFrameCallback(this);
                } else {
                    this.j = false;
                }
                Trace.setCounter("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.j = false;
    }
}
