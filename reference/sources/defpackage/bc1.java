package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bc1 {
    public static final qf0 e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    static {
        Unsafe unsafe = hi.a;
        f = unsafe.objectFieldOffset(bc1.class.getDeclaredField("_next$volatile"));
        g = unsafe.objectFieldOffset(bc1.class.getDeclaredField("_state$volatile"));
        e = new qf0("REMOVE_FROZEN", (byte) 1);
    }

    public bc1(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            li1.g("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        li1.g("Check failed.");
        throw null;
    }

    public final int a(Runnable runnable) {
        bc1 bc1Var = this;
        while (true) {
            Unsafe unsafe = hi.a;
            long j = g;
            long longVolatile = unsafe.getLongVolatile(bc1Var, j);
            if ((3458764513820540928L & longVolatile) != 0) {
                return (longVolatile & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & longVolatile);
            int i2 = (int) ((1152921503533105152L & longVolatile) >> 30);
            int i3 = bc1Var.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = bc1Var.b;
            AtomicReferenceArray atomicReferenceArray = bc1Var.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (unsafe.compareAndSwapLong(bc1Var, g, longVolatile, ((-1152921503533105153L) & longVolatile) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i3 & i2, runnable);
                    bc1 bc1VarC = this;
                    while ((hi.a.getLongVolatile(bc1VarC, j) & 1152921504606846976L) != 0) {
                        bc1VarC = bc1VarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = bc1VarC.d;
                        int i4 = bc1VarC.c & i2;
                        Object obj = atomicReferenceArray2.get(i4);
                        if ((obj instanceof ac1) && ((ac1) obj).a == i2) {
                            atomicReferenceArray2.set(i4, runnable);
                        } else {
                            bc1VarC = null;
                        }
                        if (bc1VarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                bc1Var = this;
            } else {
                int i5 = bc1Var.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        while (true) {
            long longVolatile = hi.a.getLongVolatile(this, g);
            if ((longVolatile & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & longVolatile) != 0) {
                return false;
            }
            bc1 bc1Var = this;
            if (hi.a.compareAndSwapLong(bc1Var, g, longVolatile, longVolatile | 2305843009213693952L)) {
                return true;
            }
            this = bc1Var;
        }
    }

    public final bc1 c() {
        Unsafe unsafe;
        long j;
        long longVolatile;
        long j2;
        Unsafe unsafe2;
        do {
            unsafe = hi.a;
            j = g;
            longVolatile = unsafe.getLongVolatile(this, j);
            if ((longVolatile & 1152921504606846976L) != 0) {
                j2 = longVolatile;
                break;
            }
            j2 = 1152921504606846976L | longVolatile;
        } while (!unsafe.compareAndSwapLong(this, j, longVolatile, j2));
        while (true) {
            Unsafe unsafe3 = hi.a;
            long j3 = f;
            bc1 bc1Var = (bc1) unsafe3.getObjectVolatile(this, j3);
            if (bc1Var == null) {
                bc1 bc1Var2 = new bc1(this.a << 1, this.b);
                int i = (int) (1073741823 & j2);
                int i2 = (int) ((1152921503533105152L & j2) >> 30);
                while (true) {
                    int i3 = this.c;
                    int i4 = i & i3;
                    if (i4 == (i3 & i2)) {
                        break;
                    }
                    Object ac1Var = this.d.get(i4);
                    if (ac1Var == null) {
                        ac1Var = new ac1(i);
                    }
                    bc1Var2.d.set(bc1Var2.c & i, ac1Var);
                    i++;
                }
                hi.a.putLongVolatile(bc1Var2, g, j2 & (-1152921504606846977L));
                do {
                    unsafe2 = hi.a;
                    if (unsafe2.compareAndSwapObject(this, f, (Object) null, bc1Var2)) {
                        break;
                    }
                } while (unsafe2.getObjectVolatile(this, j3) == null);
            } else {
                return bc1Var;
            }
        }
    }

    public final Object d() {
        bc1 bc1VarC = this;
        while (true) {
            Unsafe unsafe = hi.a;
            long j = g;
            long longVolatile = unsafe.getLongVolatile(bc1VarC, j);
            if ((longVolatile & 1152921504606846976L) != 0) {
                return e;
            }
            int i = (int) (longVolatile & 1073741823);
            int i2 = bc1VarC.c;
            int i3 = ((int) ((1152921503533105152L & longVolatile) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 != i4) {
                AtomicReferenceArray atomicReferenceArray = bc1VarC.d;
                Object obj = atomicReferenceArray.get(i4);
                boolean z = bc1VarC.b;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof ac1)) {
                    long j2 = (i + 1) & 1073741823;
                    if (unsafe.compareAndSwapLong(bc1VarC, j, longVolatile, (longVolatile & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i4, null);
                        return obj;
                    }
                    bc1VarC = this;
                    if (z) {
                        while (true) {
                            Unsafe unsafe2 = hi.a;
                            long j3 = g;
                            long longVolatile2 = unsafe2.getLongVolatile(bc1VarC, j3);
                            int i5 = (int) (longVolatile2 & 1073741823);
                            if ((longVolatile2 & 1152921504606846976L) != 0) {
                                bc1VarC = bc1VarC.c();
                            } else {
                                if (unsafe2.compareAndSwapLong(bc1VarC, j3, longVolatile2, (longVolatile2 & (-1073741824)) | j2)) {
                                    bc1VarC.d.set(i5 & bc1VarC.c, null);
                                    bc1VarC = null;
                                } else {
                                    continue;
                                }
                            }
                            if (bc1VarC == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
