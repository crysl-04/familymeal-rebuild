package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class r61 {
    public final ob2 a;
    public final bb b;
    public final mj1 c;

    public r61(ob2 ob2Var, bb bbVar) {
        this.a = ob2Var;
        this.b = bbVar;
        long[] jArr = bd2.a;
        this.c = new mj1();
    }

    public final zp0 a(int i, Object obj, Object obj2) {
        mj1 mj1Var = this.c;
        q61 q61Var = (q61) mj1Var.g(obj);
        byte b = 17;
        if (q61Var != null && q61Var.c == i && uz0.g(q61Var.b, obj2)) {
            nx nxVar = q61Var.d;
            if (nxVar != null) {
                return nxVar;
            }
            nx nxVar2 = new nx(818252804, true, new j7(q61Var.e, q61Var, b));
            q61Var.d = nxVar2;
            return nxVar2;
        }
        q61 q61Var2 = new q61(this, i, obj, obj2);
        mj1Var.n(obj, q61Var2);
        nx nxVar3 = q61Var2.d;
        if (nxVar3 != null) {
            return nxVar3;
        }
        nx nxVar4 = new nx(818252804, true, new j7(this, q61Var2, b));
        q61Var2.d = nxVar4;
        return nxVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        q61 q61Var = (q61) this.c.g(obj);
        if (q61Var != null) {
            return q61Var.b;
        }
        s61 s61Var = (s61) this.b.a();
        int iE = s61Var.e(obj);
        if (iE != -1) {
            return s61Var.c(iE);
        }
        return null;
    }
}
