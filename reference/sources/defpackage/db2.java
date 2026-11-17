package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class db2 extends n10 implements qk0 {
    public final qk0 k;
    public final o20 l;
    public final int m;
    public o20 n;
    public m10 o;

    public db2(qk0 qk0Var, o20 o20Var) {
        super(lw.j, xf0.h);
        this.k = qk0Var;
        this.l = o20Var;
        this.m = ((Number) o20Var.p(new yx((byte) 27), 0)).intValue();
    }

    @Override // defpackage.rk, defpackage.z20
    public final z20 d() {
        m10 m10Var = this.o;
        if (m10Var instanceof z20) {
            return (z20) m10Var;
        }
        return null;
    }

    @Override // defpackage.n10, defpackage.m10
    public final o20 e() {
        o20 o20Var = this.n;
        return o20Var == null ? xf0.h : o20Var;
    }

    @Override // defpackage.qk0
    public final Object m(Object obj, m10 m10Var) {
        try {
            Object objT = t(m10Var, obj);
            return objT == y20.h ? objT : j23.a;
        } catch (Throwable th) {
            this.n = new bc0(m10Var.e(), th);
            throw th;
        }
    }

    @Override // defpackage.rk
    public final StackTraceElement q() {
        return null;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        Throwable thA = e92.a(obj);
        if (thA != null) {
            this.n = new bc0(e(), thA);
        }
        m10 m10Var = this.o;
        if (m10Var != null) {
            m10Var.g(obj);
        }
        return y20.h;
    }

    public final Object t(m10 m10Var, Object obj) {
        o20 o20VarE = m10Var.e();
        ys.u(o20VarE);
        o20 o20Var = this.n;
        if (o20Var != o20VarE) {
            if (o20Var instanceof bc0) {
                throw new IllegalStateException(do2.H("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((bc0) o20Var).i + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) o20VarE.p(new s((Object) this, (byte) 20), 0)).intValue() != this.m) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.l + ",\n\t\tbut emission happened in " + o20VarE + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.n = o20VarE;
        }
        this.o = m10Var;
        aq0 aq0Var = fb2.a;
        qk0 qk0Var = this.k;
        qk0Var.getClass();
        Object objC = aq0Var.c(qk0Var, obj, this);
        if (!uz0.g(objC, y20.h)) {
            this.o = null;
        }
        return objC;
    }
}
