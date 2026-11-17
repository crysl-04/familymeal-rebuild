package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class zz {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ int c = 0;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = hi.a;
        a = unsafe.objectFieldOffset(zz.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(zz.class.getDeclaredField("_prev$volatile"));
    }

    public zz(qf2 qf2Var) {
        this._prev$volatile = qf2Var;
    }

    public final void a() {
        hi.a.putObjectVolatile(this, b, (Object) null);
    }

    public final zz b() {
        Object objectVolatile = hi.a.getObjectVolatile(this, a);
        if (objectVolatile == h7.D) {
            return null;
        }
        return (zz) objectVolatile;
    }

    public abstract boolean c();

    public final void d() {
        zz zzVar;
        Unsafe unsafe;
        if (b() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = hi.a;
            long j = b;
            zz zzVar2 = (zz) unsafe2.getObjectVolatile(this, j);
            while (zzVar2 != null && zzVar2.c()) {
                zzVar2 = (zz) hi.a.getObjectVolatile(zzVar2, j);
            }
            zz zzVarB = b();
            zzVarB.getClass();
            do {
                zzVar = zzVarB;
                if (!zzVar.c()) {
                    break;
                } else {
                    zzVarB = zzVar.b();
                }
            } while (zzVarB != null);
            while (true) {
                Object objectVolatile = hi.a.getObjectVolatile(zzVar, j);
                zz zzVar3 = ((zz) objectVolatile) == null ? null : zzVar2;
                while (true) {
                    unsafe = hi.a;
                    if (unsafe.compareAndSwapObject(zzVar, b, objectVolatile, zzVar3)) {
                        break;
                    } else if (unsafe.getObjectVolatile(zzVar, j) != objectVolatile) {
                    }
                }
            }
            if (zzVar2 != null) {
                unsafe.putObjectVolatile(zzVar2, a, zzVar);
            }
            if (!zzVar.c() || zzVar.b() == null) {
                if (zzVar2 == null || !zzVar2.c()) {
                    return;
                }
            }
        }
    }
}
