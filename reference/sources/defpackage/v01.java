package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class v01 extends yb1 implements jb0, tu0 {
    public z01 k;

    @Override // defpackage.jb0
    public final void a() {
        v01 v01Var;
        Unsafe unsafe;
        long j;
        z01 z01VarL = l();
        while (true) {
            Object objN = z01VarL.N();
            if (objN instanceof v01) {
                if (objN != this) {
                    return;
                }
                tf0 tf0Var = ie1.H;
                do {
                    unsafe = hi.a;
                    j = z01.i;
                    if (unsafe.compareAndSwapObject(z01VarL, j, objN, tf0Var)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(z01VarL, j) == objN);
            } else {
                if (!(objN instanceof tu0) || ((tu0) objN).d() == null) {
                    return;
                }
                while (true) {
                    Object objH = this.h();
                    if (objH instanceof k82) {
                        return;
                    }
                    if (objH == this) {
                        return;
                    }
                    objH.getClass();
                    yb1 yb1Var = (yb1) objH;
                    Unsafe unsafe2 = hi.a;
                    long j2 = yb1.j;
                    k82 k82Var = (k82) unsafe2.getObjectVolatile(yb1Var, j2);
                    if (k82Var == null) {
                        k82Var = new k82(yb1Var);
                        unsafe2.putObjectVolatile(yb1Var, j2, k82Var);
                    }
                    k82 k82Var2 = k82Var;
                    while (true) {
                        Unsafe unsafe3 = hi.a;
                        long j3 = yb1.h;
                        v01Var = this;
                        if (unsafe3.compareAndSwapObject(v01Var, j3, objH, k82Var2)) {
                            yb1Var.f();
                            return;
                        } else if (unsafe3.getObjectVolatile(v01Var, j3) != objH) {
                            break;
                        } else {
                            this = v01Var;
                        }
                    }
                    this = v01Var;
                }
            }
        }
    }

    @Override // defpackage.tu0
    public final boolean b() {
        return true;
    }

    @Override // defpackage.tu0
    public final wn1 d() {
        return null;
    }

    public final z01 l() {
        z01 z01Var = this.k;
        if (z01Var != null) {
            return z01Var;
        }
        uz0.A("job");
        throw null;
    }

    public boolean m() {
        return true;
    }

    public abstract void n(Throwable th);

    @Override // defpackage.yb1
    public final String toString() {
        return getClass().getSimpleName() + '@' + s60.o(this) + "[job@" + s60.o(l()) + ']';
    }
}
