package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class q91 extends q20 implements h80 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater o = AtomicIntegerFieldUpdater.newUpdater(q91.class, "runningWorkers$volatile");
    public static final /* synthetic */ long p = hi.a.objectFieldOffset(q91.class.getDeclaredField("runningWorkers$volatile"));
    public final /* synthetic */ h80 j;
    public final q20 k;
    public final int l;
    public final zb1 m;
    public final Object n;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public q91(q20 q20Var, int i) {
        h80 h80Var = q20Var instanceof h80 ? (h80) q20Var : null;
        this.j = h80Var == null ? c70.a : h80Var;
        this.k = q20Var;
        this.l = i;
        this.m = new zb1();
        this.n = new Object();
    }

    @Override // defpackage.h80
    public final void c(long j, rq rqVar) {
        this.j.c(j, rqVar);
    }

    @Override // defpackage.h80
    public final jb0 d(long j, Runnable runnable, o20 o20Var) {
        return this.j.d(j, runnable, o20Var);
    }

    @Override // defpackage.q20
    public final void e(o20 o20Var, Runnable runnable) {
        boolean z;
        Runnable runnableJ;
        this.m.a(runnable);
        if (hi.a.getIntVolatile(this, p) < this.l) {
            synchronized (this.n) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = o;
                if (hi.a.getIntVolatile(this, p) >= this.l) {
                    z = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z = true;
                }
            }
            if (!z || (runnableJ = j()) == null) {
                return;
            }
            this.k.e(this, new z2((Object) this, (Object) runnableJ, (byte) 5));
        }
    }

    public final Runnable j() {
        while (true) {
            Runnable runnable = (Runnable) this.m.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.n) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = o;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.m.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // defpackage.q20
    public final String toString() {
        return this.k + ".limitedParallelism(" + this.l + ')';
    }
}
