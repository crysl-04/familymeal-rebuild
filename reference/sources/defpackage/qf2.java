package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class qf2 extends zz implements lo1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(qf2.class, "cleanedAndPointers$volatile");
    public static final /* synthetic */ long f = hi.a.objectFieldOffset(qf2.class.getDeclaredField("cleanedAndPointers$volatile"));
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long d;

    public qf2(long j, qf2 qf2Var, int i) {
        super(qf2Var);
        this.d = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // defpackage.zz
    public final boolean c() {
        return hi.a.getIntVolatile(this, f) == f() && b() != null;
    }

    public final boolean e() {
        return e.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i, o20 o20Var);

    public final void h() {
        if (e.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        while (true) {
            Unsafe unsafe = hi.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == this.f() && this.b() != null) {
                return false;
            }
            qf2 qf2Var = this;
            if (unsafe.compareAndSwapInt(qf2Var, j, intVolatile, intVolatile + 65536)) {
                return true;
            }
            this = qf2Var;
        }
    }
}
