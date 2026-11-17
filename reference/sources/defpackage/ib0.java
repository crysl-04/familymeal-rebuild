package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ib0 implements jb0 {
    public final ScheduledFuture h;

    public ib0(ScheduledFuture scheduledFuture) {
        this.h = scheduledFuture;
    }

    @Override // defpackage.jb0
    public final void a() {
        this.h.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.h + ']';
    }
}
