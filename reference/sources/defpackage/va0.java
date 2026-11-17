package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class va0 extends ws2 {
    public int j;

    public va0(int i) {
        super(0L, false);
        this.j = i;
    }

    public abstract m10 c();

    public Throwable f(Object obj) {
        mw mwVar = obj instanceof mw ? (mw) obj : null;
        if (mwVar != null) {
            return mwVar.a;
        }
        return null;
    }

    public final void i(Throwable th) {
        ls.E(c().e(), new b30("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public Object m() {
        return hi.a.getObjectVolatile(this, rq.o);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            m10 m10VarC = c();
            m10VarC.getClass();
            ta0 ta0Var = (ta0) m10VarC;
            n10 n10Var = ta0Var.l;
            Object obj = ta0Var.n;
            o20 o20VarE = n10Var.e();
            Object objE = ie1.E(o20VarE, obj);
            s01 s01Var = null;
            g23 g23VarI = objE != ie1.u0 ? ou.I(n10Var, o20VarE, objE) : null;
            try {
                o20 o20VarE2 = n10Var.e();
                Object objM = m();
                Throwable thF = f(objM);
                if (thF == null) {
                    int i = this.j;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        s01Var = (s01) o20VarE2.m(c5.Z);
                    }
                }
                if (s01Var != null && !s01Var.b()) {
                    CancellationException cancellationExceptionO = s01Var.o();
                    b(cancellationExceptionO);
                    n10Var.g(m02.e(cancellationExceptionO));
                } else if (thF != null) {
                    n10Var.g(new d92(thF));
                } else {
                    n10Var.g(h(objM));
                }
                if (g23VarI == null || g23VarI.j0()) {
                }
            } finally {
                if (g23VarI == null || g23VarI.j0()) {
                    ie1.v(o20VarE, objE);
                }
            }
        } catch (Throwable th) {
            i(th);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object h(Object obj) {
        return obj;
    }
}
