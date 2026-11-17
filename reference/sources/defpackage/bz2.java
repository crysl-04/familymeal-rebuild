package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bz2 implements Executor {
    public final Executor h;
    public Runnable j;
    public final ArrayDeque i = new ArrayDeque();
    public final Object k = new Object();

    public bz2(Executor executor) {
        this.h = executor;
    }

    public final void a() {
        synchronized (this.k) {
            Object objPoll = this.i.poll();
            Runnable runnable = (Runnable) objPoll;
            this.j = runnable;
            if (objPoll != null) {
                this.h.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.k) {
            this.i.offer(new l7(runnable, this, (byte) 3));
            if (this.j == null) {
                a();
            }
        }
    }
}
