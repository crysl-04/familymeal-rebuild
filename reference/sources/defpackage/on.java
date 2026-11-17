package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class on extends v {
    public final Thread k;
    public final nh0 l;

    public on(o20 o20Var, Thread thread, nh0 nh0Var) {
        super(o20Var, true);
        this.k = thread;
        this.l = nh0Var;
    }

    @Override // defpackage.z01
    public final void y(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.k;
        if (uz0.g(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
