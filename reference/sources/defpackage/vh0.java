package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vh0 extends uh0 implements h80 {
    public final Executor j;

    public vh0(Executor executor) {
        this.j = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // defpackage.h80
    public final void c(long j, rq rqVar) {
        Executor executor = this.j;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            z2 z2Var = new z2(this, rqVar, (byte) 7, false);
            o20 o20Var = rqVar.l;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(z2Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                ys.m(o20Var, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            rqVar.x(new nq(scheduledFutureSchedule, (byte) 0));
        } else {
            b70.r.c(j, rqVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.j;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // defpackage.h80
    public final jb0 d(long j, Runnable runnable, o20 o20Var) {
        Executor executor = this.j;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                ys.m(o20Var, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new ib0(scheduledFutureSchedule) : b70.r.d(j, runnable, o20Var);
    }

    @Override // defpackage.q20
    public final void e(o20 o20Var, Runnable runnable) {
        try {
            this.j.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            ys.m(o20Var, cancellationException);
            r70 r70Var = ya0.a;
            j70.j.e(o20Var, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vh0) && ((vh0) obj).j == this.j;
    }

    public final int hashCode() {
        return System.identityHashCode(this.j);
    }

    @Override // defpackage.q20
    public final String toString() {
        return this.j.toString();
    }
}
