package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tb {
    public final s03 a;
    public final Object b;
    public final dd c;
    public final lu1 d;
    public final lu1 e;
    public final mk1 f;
    public final id g;
    public final id h;
    public final id i;
    public final id j;

    public tb(Object obj, s03 s03Var, Object obj2) {
        this.a = s03Var;
        this.b = obj2;
        dd ddVar = new dd(s03Var, obj, null, 60);
        this.c = ddVar;
        this.d = rz1.x(Boolean.FALSE);
        this.e = rz1.x(obj);
        this.f = new mk1();
        new zm2(obj2);
        id idVar = ddVar.j;
        boolean z = idVar instanceof ed;
        id idVar2 = z ? ie1.e : idVar instanceof fd ? ie1.f : idVar instanceof gd ? ie1.g : ie1.h;
        this.g = idVar2;
        id idVar3 = z ? ie1.a : idVar instanceof fd ? ie1.b : idVar instanceof gd ? ie1.c : ie1.d;
        this.h = idVar3;
        this.i = idVar2;
        this.j = idVar3;
    }

    public static Object a(tb tbVar, Object obj, cd cdVar, n10 n10Var) {
        Object objH = tbVar.a.b.h(tbVar.c.j);
        Object objD = tbVar.d();
        s03 s03Var = tbVar.a;
        return mk1.a(tbVar.f, new rb(tbVar, objH, new os2(cdVar, s03Var, objD, obj, (id) s03Var.a.h(objH)), tbVar.c.k, null), n10Var);
    }

    public final Object b(Object obj) {
        id idVar = this.g;
        id idVar2 = this.i;
        boolean zG = uz0.g(idVar2, idVar);
        id idVar3 = this.j;
        if (!zG || !uz0.g(idVar3, this.h)) {
            s03 s03Var = this.a;
            id idVar4 = (id) s03Var.a.h(obj);
            int iB = idVar4.b();
            boolean z = false;
            for (int i = 0; i < iB; i++) {
                if (idVar4.a(i) < idVar2.a(i) || idVar4.a(i) > idVar3.a(i)) {
                    idVar4.e(i, cy1.m(idVar4.a(i), idVar2.a(i), idVar3.a(i)));
                    z = true;
                }
            }
            if (z) {
                return s03Var.b.h(idVar4);
            }
        }
        return obj;
    }

    public final void c() {
        dd ddVar = this.c;
        ddVar.j.d();
        ddVar.k = Long.MIN_VALUE;
        this.d.setValue(Boolean.FALSE);
    }

    public final Object d() {
        return this.c.i.getValue();
    }

    public final Object e(m10 m10Var, Object obj) {
        Object objA = mk1.a(this.f, new sb(this, obj, null), m10Var);
        return objA == y20.h ? objA : j23.a;
    }

    public /* synthetic */ tb(Object obj, s03 s03Var, Object obj2, int i) {
        this(obj, s03Var, (i & 4) != 0 ? null : obj2);
    }
}
