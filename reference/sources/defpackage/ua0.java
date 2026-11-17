package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ua0 extends ld2 {
    public static final /* synthetic */ long l = hi.a.objectFieldOffset(ua0.class.getDeclaredField("_decision$volatile"));
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.ld2, defpackage.z01
    public final void y(Object obj) {
        z(obj);
    }

    @Override // defpackage.ld2, defpackage.z01
    public final void z(Object obj) {
        while (true) {
            Unsafe unsafe = hi.a;
            long j = l;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1) {
                    tz0.F(ls.F(this.k), ys.Y(obj));
                    return;
                } else {
                    li1.g("Already resumed");
                    return;
                }
            }
            ua0 ua0Var = this;
            if (unsafe.compareAndSwapInt(ua0Var, j, 0, 2)) {
                return;
            } else {
                this = ua0Var;
            }
        }
    }
}
