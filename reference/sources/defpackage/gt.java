package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gt extends v01 {
    public final rq l;

    public gt(rq rqVar) {
        this.l = rqVar;
    }

    @Override // defpackage.v01
    public final void n(Throwable th) {
        Unsafe unsafe;
        Unsafe unsafe2;
        z01 z01VarL = l();
        rq rqVar = this.l;
        Throwable thS = rqVar.s(z01VarL);
        if (rqVar.y()) {
            ta0 ta0Var = (ta0) rqVar.k;
            long j = ta0.o;
            loop0: while (true) {
                Object objectVolatile = hi.a.getObjectVolatile(ta0Var, j);
                qf0 qf0Var = tz0.R;
                if (uz0.g(objectVolatile, qf0Var)) {
                    do {
                        unsafe = hi.a;
                        if (unsafe.compareAndSwapObject(ta0Var, ta0.o, qf0Var, thS)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(ta0Var, j) == qf0Var);
                } else {
                    if (objectVolatile instanceof Throwable) {
                        return;
                    }
                    do {
                        unsafe2 = hi.a;
                        if (unsafe2.compareAndSwapObject(ta0Var, ta0.o, objectVolatile, (Object) null)) {
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(ta0Var, j) == objectVolatile);
                }
            }
        }
        rqVar.l(thS);
        if (rqVar.y()) {
            return;
        }
        rqVar.q();
    }
}
