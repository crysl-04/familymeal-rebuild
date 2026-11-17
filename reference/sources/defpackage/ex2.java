package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ex2 implements m20 {
    public final Object h;
    public final ThreadLocal i;
    public final gx2 j;

    public ex2(Object obj, ThreadLocal threadLocal) {
        this.h = obj;
        this.i = threadLocal;
        this.j = new gx2(threadLocal);
    }

    public final void c(Object obj) {
        this.i.set(obj);
    }

    public final Object d() {
        ThreadLocal threadLocal = this.i;
        Object obj = threadLocal.get();
        threadLocal.set(this.h);
        return obj;
    }

    @Override // defpackage.m20
    public final n20 getKey() {
        return this.j;
    }

    @Override // defpackage.o20
    public final o20 i(o20 o20Var) {
        return cu.Q(this, o20Var);
    }

    @Override // defpackage.o20
    public final m20 m(n20 n20Var) {
        if (this.j.equals(n20Var)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.o20
    public final Object p(zp0 zp0Var, Object obj) {
        return zp0Var.f(obj, this);
    }

    @Override // defpackage.o20
    public final o20 t(n20 n20Var) {
        return this.j.equals(n20Var) ? xf0.h : this;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.h + ", threadLocal = " + this.i + ')';
    }
}
