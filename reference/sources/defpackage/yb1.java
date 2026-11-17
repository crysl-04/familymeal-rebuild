package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class yb1 {
    public static final /* synthetic */ long h;
    public static final /* synthetic */ long i;
    public static final /* synthetic */ long j;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = hi.a;
        h = unsafe.objectFieldOffset(yb1.class.getDeclaredField("_next$volatile"));
        i = unsafe.objectFieldOffset(yb1.class.getDeclaredField("_prev$volatile"));
        j = unsafe.objectFieldOffset(yb1.class.getDeclaredField("_removedRef$volatile"));
    }

    public final boolean e(yb1 yb1Var, int i2) {
        yb1 yb1Var2;
        yb1 yb1Var3;
        while (true) {
            yb1 yb1VarJ = this.j();
            if (yb1VarJ instanceof oa1) {
                return (((oa1) yb1VarJ).k & i2) == 0 && yb1VarJ.e(yb1Var, i2);
            }
            Unsafe unsafe = hi.a;
            unsafe.putObjectVolatile(yb1Var, i, yb1VarJ);
            long j2 = h;
            unsafe.putObjectVolatile(yb1Var, j2, this);
            while (true) {
                Unsafe unsafe2 = hi.a;
                yb1Var2 = this;
                yb1Var3 = yb1Var;
                if (unsafe2.compareAndSwapObject(yb1VarJ, h, yb1Var2, yb1Var3)) {
                    yb1Var3.g(yb1Var2);
                    return true;
                }
                if (unsafe2.getObjectVolatile(yb1VarJ, j2) != yb1Var2) {
                    break;
                }
                this = yb1Var2;
                yb1Var = yb1Var3;
            }
            this = yb1Var2;
            yb1Var = yb1Var3;
        }
    }

    public final yb1 f() {
        while (true) {
            Unsafe unsafe = hi.a;
            long j2 = i;
            yb1 yb1Var = (yb1) unsafe.getObjectVolatile(this, j2);
            yb1 yb1Var2 = null;
            yb1 yb1Var3 = yb1Var;
            while (true) {
                if (yb1Var3 == null) {
                    li1.c();
                    return null;
                }
                Unsafe unsafe2 = hi.a;
                long j3 = h;
                Object objectVolatile = unsafe2.getObjectVolatile(yb1Var3, j3);
                if (objectVolatile == this) {
                    if (yb1Var != yb1Var3) {
                        while (true) {
                            Unsafe unsafe3 = hi.a;
                            yb1 yb1Var4 = this;
                            boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(yb1Var4, i, yb1Var, yb1Var3);
                            yb1 yb1Var5 = yb1Var;
                            this = yb1Var4;
                            if (!zCompareAndSwapObject) {
                                if (unsafe3.getObjectVolatile(this, j2) != yb1Var5) {
                                    break;
                                }
                                this = this;
                                yb1Var = yb1Var5;
                            }
                        }
                    }
                    return yb1Var3;
                }
                yb1Var = yb1Var;
                this = this;
                if (this.k()) {
                    return null;
                }
                if (!(objectVolatile instanceof k82)) {
                    objectVolatile.getClass();
                    yb1Var2 = yb1Var3;
                    yb1Var3 = (yb1) objectVolatile;
                } else if (yb1Var2 != null) {
                    yb1 yb1Var6 = ((k82) objectVolatile).a;
                    while (true) {
                        yb1 yb1Var7 = yb1Var3;
                        Unsafe unsafe4 = hi.a;
                        boolean zCompareAndSwapObject2 = unsafe4.compareAndSwapObject(yb1Var2, h, yb1Var7, yb1Var6);
                        yb1Var3 = yb1Var7;
                        if (zCompareAndSwapObject2) {
                            yb1Var3 = yb1Var2;
                            yb1Var2 = null;
                            break;
                        }
                        if (unsafe4.getObjectVolatile(yb1Var2, j3) != yb1Var3) {
                            break;
                        }
                    }
                } else {
                    if (yb1Var3 == null) {
                        li1.c();
                        return null;
                    }
                    yb1Var3 = (yb1) unsafe2.getObjectVolatile(yb1Var3, j2);
                }
            }
            this = this;
        }
    }

    public final void g(yb1 yb1Var) {
        yb1 yb1Var2;
        while (true) {
            Unsafe unsafe = hi.a;
            long j2 = i;
            yb1 yb1Var3 = (yb1) unsafe.getObjectVolatile(yb1Var, j2);
            if (this.h() != yb1Var) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = hi.a;
                yb1Var2 = this;
                yb1 yb1Var4 = yb1Var;
                if (unsafe2.compareAndSwapObject(yb1Var4, i, yb1Var3, yb1Var2)) {
                    if (yb1Var2.k()) {
                        yb1Var4.f();
                        return;
                    }
                    return;
                } else {
                    yb1Var = yb1Var4;
                    if (unsafe2.getObjectVolatile(yb1Var4, j2) != yb1Var3) {
                        break;
                    } else {
                        this = yb1Var2;
                    }
                }
            }
            this = yb1Var2;
        }
    }

    public final Object h() {
        return hi.a.getObjectVolatile(this, h);
    }

    public final yb1 i() {
        Object objH = h();
        k82 k82Var = objH instanceof k82 ? (k82) objH : null;
        if (k82Var != null) {
            return k82Var.a;
        }
        objH.getClass();
        return (yb1) objH;
    }

    public final yb1 j() {
        yb1 yb1VarF = f();
        if (yb1VarF != null) {
            return yb1VarF;
        }
        Unsafe unsafe = hi.a;
        long j2 = i;
        Object objectVolatile = unsafe.getObjectVolatile(this, j2);
        while (true) {
            yb1 yb1Var = (yb1) objectVolatile;
            if (!yb1Var.k()) {
                return yb1Var;
            }
            objectVolatile = hi.a.getObjectVolatile(yb1Var, j2);
        }
    }

    public boolean k() {
        return h() instanceof k82;
    }

    public String toString() {
        return new m51(this, s60.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1, (byte) 2) + '@' + s60.o(this);
    }
}
