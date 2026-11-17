package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class oz2 implements kn2 {
    public final s03 h;
    public final lu1 i;
    public final lu1 j;
    public final lu1 k;
    public hf2 l;
    public os2 m;
    public final lu1 n;
    public final hu1 o;
    public boolean p;
    public final lu1 q;
    public id r;
    public final ju1 s;
    public boolean t;
    public final zm2 u;
    public final /* synthetic */ qz2 v;

    public oz2(qz2 qz2Var, Object obj, id idVar, s03 s03Var) {
        this.v = qz2Var;
        this.h = s03Var;
        lu1 lu1VarX = rz1.x(obj);
        this.i = lu1VarX;
        Object objH = null;
        lu1 lu1VarX2 = rz1.x(uz0.y(0.0f, 0.0f, null, 7));
        this.j = lu1VarX2;
        this.k = rz1.x(new os2((oj0) lu1VarX2.getValue(), s03Var, obj, lu1VarX.getValue(), idVar));
        this.n = rz1.x(Boolean.TRUE);
        this.o = new hu1(-1.0f);
        this.q = rz1.x(obj);
        this.r = idVar;
        this.s = new ju1(a().c());
        Float f = (Float) u53.a.get(s03Var);
        if (f != null) {
            float fFloatValue = f.floatValue();
            id idVar2 = (id) s03Var.a.h(obj);
            int iB = idVar2.b();
            for (int i = 0; i < iB; i++) {
                idVar2.e(i, fFloatValue);
            }
            objH = this.h.b.h(idVar2);
        }
        this.u = uz0.y(0.0f, 0.0f, objH, 3);
    }

    public final os2 a() {
        return (os2) this.k.getValue();
    }

    public final void b(long j) {
        if (this.o.g() == -1.0f) {
            this.t = true;
            if (uz0.g(a().c, a().d)) {
                c(a().c);
            } else {
                c(a().b(j));
                this.r = a().f(j);
            }
        }
    }

    public final void c(Object obj) {
        this.q.setValue(obj);
    }

    public final void e(Object obj, boolean z) {
        os2 os2Var = this.m;
        Object obj2 = os2Var != null ? os2Var.c : null;
        lu1 lu1Var = this.i;
        boolean zG = uz0.g(obj2, lu1Var.getValue());
        ju1 ju1Var = this.s;
        lu1 lu1Var2 = this.k;
        oj0 oj0Var = this.u;
        if (zG) {
            lu1Var2.setValue(new os2(oj0Var, this.h, obj, obj, this.r.c()));
            this.p = true;
            ju1Var.h(a().c());
            return;
        }
        lu1 lu1Var3 = this.j;
        if (!z || this.t || (((oj0) lu1Var3.getValue()) instanceof zm2)) {
            oj0Var = (oj0) lu1Var3.getValue();
        }
        qz2 qz2Var = this.v;
        lu1Var2.setValue(new os2(qz2Var.e() <= 0 ? oj0Var : new gn2(oj0Var, qz2Var.e()), this.h, obj, lu1Var.getValue(), this.r));
        ju1Var.h(a().c());
        this.p = false;
        qz2Var.o(true);
        if (qz2Var.g()) {
            ll2 ll2Var = qz2Var.j;
            int size = ll2Var.size();
            for (int i = 0; i < size; i++) {
                oz2 oz2Var = (oz2) ll2Var.get(i);
                oz2Var.s.g();
                oz2Var.b(0L);
            }
            qz2Var.o(false);
        }
    }

    public final void f(Object obj, Object obj2, oj0 oj0Var) {
        this.i.setValue(obj2);
        this.j.setValue(oj0Var);
        if (uz0.g(a().d, obj) && uz0.g(a().c, obj2)) {
            return;
        }
        e(obj, false);
    }

    public final void g(Object obj, oj0 oj0Var, Object obj2, id idVar) {
        Object value;
        if (this.p) {
            os2 os2Var = this.m;
            if (uz0.g(obj, os2Var != null ? os2Var.c : null)) {
                return;
            }
        }
        lu1 lu1Var = this.i;
        boolean zG = uz0.g(lu1Var.getValue(), obj);
        hu1 hu1Var = this.o;
        if (zG && hu1Var.g() == -1.0f && (obj2 == null || obj2.equals(a().d))) {
            return;
        }
        lu1Var.setValue(obj);
        this.j.setValue(oj0Var);
        if (obj2 == null) {
            value = hu1Var.g() == -3.0f ? obj : this.q.getValue();
        } else {
            value = obj2;
        }
        if (obj2 != null) {
            c(value);
            if (idVar != null) {
                this.r = idVar;
            }
        }
        lu1 lu1Var2 = this.n;
        e(value, !((Boolean) lu1Var2.getValue()).booleanValue());
        lu1Var2.setValue(Boolean.valueOf(hu1Var.g() == -3.0f));
        if (hu1Var.g() >= 0.0f) {
            c(a().b((long) (hu1Var.g() * a().c())));
        } else if (hu1Var.g() == -3.0f) {
            c(obj);
        }
        this.p = false;
        hu1Var.h(-1.0f);
    }

    @Override // defpackage.kn2
    public final Object getValue() {
        return this.q.getValue();
    }

    public final String toString() {
        return "current value: " + this.q.getValue() + ", target: " + this.i.getValue() + ", spec: " + ((oj0) this.j.getValue());
    }
}
