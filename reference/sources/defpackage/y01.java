package defpackage;

import java.util.ArrayList;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class y01 implements tu0 {
    public static final /* synthetic */ long i;
    public static final /* synthetic */ long j;
    public static final /* synthetic */ long k;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final wn1 h;

    static {
        Unsafe unsafe = hi.a;
        j = unsafe.objectFieldOffset(y01.class.getDeclaredField("_isCompleting$volatile"));
        k = unsafe.objectFieldOffset(y01.class.getDeclaredField("_rootCause$volatile"));
        i = unsafe.objectFieldOffset(y01.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public y01(wn1 wn1Var, Throwable th) {
        this.h = wn1Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable thC = c();
        if (thC == null) {
            hi.a.putObjectVolatile(this, k, th);
            return;
        }
        if (th != thC) {
            Unsafe unsafe = hi.a;
            long j2 = i;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j2, th);
                return;
            }
            if (!(objectVolatile instanceof Throwable)) {
                if (objectVolatile instanceof ArrayList) {
                    ((ArrayList) objectVolatile).add(th);
                    return;
                } else {
                    wg.h(objectVolatile, "State is ");
                    return;
                }
            }
            if (th == objectVolatile) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(objectVolatile);
            arrayList.add(th);
            unsafe.putObjectVolatile(this, j2, arrayList);
        }
    }

    @Override // defpackage.tu0
    public final boolean b() {
        return c() == null;
    }

    public final Throwable c() {
        return (Throwable) hi.a.getObjectVolatile(this, k);
    }

    @Override // defpackage.tu0
    public final wn1 d() {
        return this.h;
    }

    public final boolean e() {
        return c() != null;
    }

    public final boolean f() {
        return hi.a.getIntVolatile(this, j) != 0;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        Unsafe unsafe = hi.a;
        long j2 = i;
        Object objectVolatile = unsafe.getObjectVolatile(this, j2);
        if (objectVolatile == null) {
            arrayList = new ArrayList(4);
        } else if (objectVolatile instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objectVolatile);
            arrayList = arrayList2;
        } else {
            if (!(objectVolatile instanceof ArrayList)) {
                wg.h(objectVolatile, "State is ");
                return null;
            }
            arrayList = (ArrayList) objectVolatile;
        }
        Throwable thC = c();
        if (thC != null) {
            arrayList.add(0, thC);
        }
        if (th != null && !th.equals(thC)) {
            arrayList.add(th);
        }
        unsafe.putObjectVolatile(this, j2, ie1.F);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + c() + ", exceptions=" + hi.a.getObjectVolatile(this, i) + ", list=" + this.h + ']';
    }
}
