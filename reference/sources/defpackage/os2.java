package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class os2 implements xc {
    public final o33 a;
    public final s03 b;
    public Object c;
    public Object d;
    public id e;
    public id f;
    public final id g;
    public long h;
    public id i;

    public os2(cd cdVar, s03 s03Var, Object obj, Object obj2, id idVar) {
        this.a = cdVar.a(s03Var);
        this.b = s03Var;
        this.c = obj2;
        this.d = obj;
        this.e = (id) s03Var.a.h(obj);
        vp0 vp0Var = s03Var.a;
        this.f = (id) vp0Var.h(obj2);
        this.g = idVar != null ? ia2.i(idVar) : ((id) vp0Var.h(obj)).c();
        this.h = -1L;
    }

    @Override // defpackage.xc
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.xc
    public final Object b(long j) {
        if (g(j)) {
            return this.c;
        }
        id idVarP = this.a.p(j, this.e, this.f, this.g);
        int iB = idVarP.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(idVarP.a(i))) {
                y12.b("AnimationVector cannot contain a NaN. " + idVarP + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.b.b.h(idVarP);
    }

    @Override // defpackage.xc
    public final long c() {
        long j = this.h;
        if (j >= 0) {
            return j;
        }
        long jB = this.a.b(this.e, this.f, this.g);
        this.h = jB;
        return jB;
    }

    @Override // defpackage.xc
    public final s03 d() {
        return this.b;
    }

    @Override // defpackage.xc
    public final Object e() {
        return this.c;
    }

    @Override // defpackage.xc
    public final id f(long j) {
        if (!g(j)) {
            return this.a.l(j, this.e, this.f, this.g);
        }
        id idVar = this.i;
        if (idVar != null) {
            return idVar;
        }
        id idVarQ = this.a.q(this.e, this.f, this.g);
        this.i = idVarQ;
        return idVarQ;
    }

    public final void h(Object obj) {
        if (uz0.g(obj, this.d)) {
            return;
        }
        this.d = obj;
        this.e = (id) this.b.a.h(obj);
        this.i = null;
        this.h = -1L;
    }

    public final void i(Object obj) {
        if (uz0.g(this.c, obj)) {
            return;
        }
        this.c = obj;
        this.f = (id) this.b.a.h(obj);
        this.i = null;
        this.h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
