package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class zb1 {
    public static final /* synthetic */ long a = hi.a.objectFieldOffset(zb1.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new bc1(8, false);

    public final boolean a(Runnable runnable) {
        zb1 zb1Var;
        while (true) {
            Unsafe unsafe = hi.a;
            long j = a;
            bc1 bc1Var = (bc1) unsafe.getObjectVolatile(this, j);
            int iA = bc1Var.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                bc1 bc1VarC = bc1Var.c();
                while (true) {
                    Unsafe unsafe2 = hi.a;
                    zb1Var = this;
                    if (unsafe2.compareAndSwapObject(zb1Var, a, bc1Var, bc1VarC) || unsafe2.getObjectVolatile(zb1Var, j) != bc1Var) {
                        break;
                    }
                    this = zb1Var;
                }
            } else {
                if (iA == 2) {
                    return false;
                }
                zb1Var = this;
            }
            this = zb1Var;
        }
    }

    public final void b() {
        zb1 zb1Var;
        while (true) {
            Unsafe unsafe = hi.a;
            long j = a;
            bc1 bc1Var = (bc1) unsafe.getObjectVolatile(this, j);
            if (bc1Var.b()) {
                return;
            }
            bc1 bc1VarC = bc1Var.c();
            while (true) {
                zb1Var = this;
                if (hi.a.compareAndSwapObject(zb1Var, a, bc1Var, bc1VarC) || hi.a.getObjectVolatile(zb1Var, j) != bc1Var) {
                    break;
                } else {
                    this = zb1Var;
                }
            }
            this = zb1Var;
        }
    }

    public final int c() {
        bc1 bc1Var = (bc1) hi.a.getObjectVolatile(this, a);
        bc1Var.getClass();
        long longVolatile = hi.a.getLongVolatile(bc1Var, bc1.g);
        return (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile))) & 1073741823;
    }

    public final Object d() {
        zb1 zb1Var;
        while (true) {
            Unsafe unsafe = hi.a;
            long j = a;
            bc1 bc1Var = (bc1) unsafe.getObjectVolatile(this, j);
            Object objD = bc1Var.d();
            if (objD != bc1.e) {
                return objD;
            }
            bc1 bc1VarC = bc1Var.c();
            while (true) {
                zb1Var = this;
                if (hi.a.compareAndSwapObject(zb1Var, a, bc1Var, bc1VarC) || hi.a.getObjectVolatile(zb1Var, j) != bc1Var) {
                    break;
                }
                this = zb1Var;
            }
            this = zb1Var;
        }
    }
}
