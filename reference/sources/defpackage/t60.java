package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class t60 implements xc {
    public final s33 a;
    public final s03 b;
    public final Object c;
    public final id d;
    public final id e;
    public final id f;
    public final Object g;
    public final long h;

    public t60(u60 u60Var, s03 s03Var, Object obj, id idVar) {
        s33 s33Var = new s33(u60Var.a);
        this.a = s33Var;
        this.b = s03Var;
        this.c = obj;
        id idVar2 = (id) s03Var.a.h(obj);
        this.d = idVar2;
        this.e = ia2.i(idVar);
        vp0 vp0Var = s03Var.b;
        id idVarC = s33Var.d;
        if (idVarC == null) {
            idVarC = idVar2.c();
            s33Var.d = idVarC;
        }
        int iB = idVarC.b();
        int i = 0;
        while (true) {
            id idVar3 = s33Var.d;
            ak0 ak0Var = s33Var.a;
            if (i >= iB) {
                if (idVar3 == null) {
                    uz0.A("targetVector");
                    throw null;
                }
                this.g = vp0Var.h(idVar3);
                id idVarC2 = s33Var.c;
                if (idVarC2 == null) {
                    idVarC2 = idVar2.c();
                    s33Var.c = idVarC2;
                }
                int iB2 = idVarC2.b();
                long jMax = 0;
                for (int i2 = 0; i2 < iB2; i2++) {
                    idVar2.getClass();
                    jMax = Math.max(jMax, ak0Var.c(idVar.a(i2)));
                }
                this.h = jMax;
                id idVarI = ia2.i(this.a.a(jMax, this.d, idVar));
                this.f = idVarI;
                int iB3 = idVarI.b();
                for (int i3 = 0; i3 < iB3; i3++) {
                    id idVar4 = this.f;
                    float fA = idVar4.a(i3);
                    float f = this.a.e;
                    idVar4.e(i3, cy1.m(fA, -f, f));
                }
                return;
            }
            if (idVar3 == null) {
                uz0.A("targetVector");
                throw null;
            }
            idVar3.e(i, ak0Var.f(idVar2.a(i), idVar.a(i)));
            i++;
        }
    }

    @Override // defpackage.xc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.xc
    public final Object b(long j) {
        if (g(j)) {
            return this.g;
        }
        vp0 vp0Var = this.b.b;
        s33 s33Var = this.a;
        id idVarC = s33Var.b;
        id idVar = this.d;
        if (idVarC == null) {
            idVarC = idVar.c();
            s33Var.b = idVarC;
        }
        int iB = idVarC.b();
        int i = 0;
        while (true) {
            id idVar2 = s33Var.b;
            if (i >= iB) {
                if (idVar2 != null) {
                    return vp0Var.h(idVar2);
                }
                uz0.A("valueVector");
                throw null;
            }
            if (idVar2 == null) {
                uz0.A("valueVector");
                throw null;
            }
            idVar2.e(i, s33Var.a.h(idVar.a(i), this.e.a(i), j));
            i++;
        }
    }

    @Override // defpackage.xc
    public final long c() {
        return this.h;
    }

    @Override // defpackage.xc
    public final s03 d() {
        return this.b;
    }

    @Override // defpackage.xc
    public final Object e() {
        return this.g;
    }

    @Override // defpackage.xc
    public final id f(long j) {
        if (g(j)) {
            return this.f;
        }
        return this.a.a(j, this.d, this.e);
    }
}
