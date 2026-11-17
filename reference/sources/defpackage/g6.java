package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g6 implements Executor {
    public final /* synthetic */ t6 h;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.h.postOnAnimation(runnable);
    }
}
