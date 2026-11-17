package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class nr0 implements hs1 {
    public final ds1 a;
    public volatile long b = -1;
    public final AtomicInteger c = new AtomicInteger(0);
    public final jh0 d;
    public is1 e;

    public nr0(ds1 ds1Var) {
        jh0 jh0Var = new jh0();
        jh0Var.a = System.nanoTime();
        this.d = jh0Var;
        this.e = is1.UNEXPLORED;
        Objects.requireNonNull(ds1Var);
        this.a = ds1Var;
    }

    @Override // defpackage.hs1
    public final gs1 f(gs1 gs1Var) {
        this.c.set(0);
        this.b = -1L;
        this.d.a = System.nanoTime();
        try {
            return h(gs1Var);
        } finally {
            this.b = System.nanoTime() - this.d.a;
        }
    }

    public abstract gs1 h(gs1 gs1Var);

    public final void i() {
        this.c.incrementAndGet();
        l();
    }

    public final boolean j() {
        AtomicInteger atomicInteger = this.c;
        ds1 ds1Var = this.a;
        if (this.e.b() || Thread.currentThread().isInterrupted() || this.e.d()) {
            return false;
        }
        if (this.e.c()) {
            long jNanoTime = this.b;
            if (jNanoTime < 0) {
                jNanoTime = System.nanoTime() - this.d.a;
            }
            if (jNanoTime / 1000000 >= ds1Var.i || atomicInteger.get() >= ds1Var.d) {
                return false;
            }
        }
        long jNanoTime2 = this.b;
        if (jNanoTime2 < 0) {
            jNanoTime2 = System.nanoTime() - this.d.a;
        }
        return jNanoTime2 / 1000000 < ds1Var.h && atomicInteger.get() < ds1Var.c;
    }

    public final void k() {
        if (this.a.e) {
            l();
        }
    }

    public final void l() {
        this.a.getClass();
    }
}
