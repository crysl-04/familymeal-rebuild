package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class n10 extends rk {
    public final o20 i;
    public transient m10 j;

    public n10(m10 m10Var) {
        this(m10Var, m10Var != null ? m10Var.e() : null);
    }

    @Override // defpackage.m10
    public o20 e() {
        o20 o20Var = this.i;
        o20Var.getClass();
        return o20Var;
    }

    @Override // defpackage.rk
    public final void s() {
        Unsafe unsafe;
        long j;
        m10 m10Var = this.j;
        if (m10Var != null && m10Var != this) {
            m20 m20VarM = e().m(c5.L);
            m20VarM.getClass();
            ta0 ta0Var = (ta0) m10Var;
            do {
                unsafe = hi.a;
                j = ta0.o;
            } while (unsafe.getObjectVolatile(ta0Var, j) == tz0.R);
            Object objectVolatile = unsafe.getObjectVolatile(ta0Var, j);
            rq rqVar = objectVolatile instanceof rq ? (rq) objectVolatile : null;
            if (rqVar != null) {
                rqVar.q();
            }
        }
        this.j = lw.i;
    }

    public n10(m10 m10Var, o20 o20Var) {
        super(m10Var);
        this.i = o20Var;
    }
}
