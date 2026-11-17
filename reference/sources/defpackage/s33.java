package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class s33 {
    public final ak0 a;
    public id b;
    public id c;
    public id d;
    public final float e;

    public s33(ak0 ak0Var) {
        this.a = ak0Var;
        this.e = ak0Var.d();
    }

    public final id a(long j, id idVar, id idVar2) {
        id idVarC = this.c;
        if (idVarC == null) {
            idVarC = idVar.c();
            this.c = idVarC;
        }
        int iB = idVarC.b();
        int i = 0;
        while (true) {
            id idVar3 = this.c;
            if (i >= iB) {
                if (idVar3 != null) {
                    return idVar3;
                }
                uz0.A("velocityVector");
                throw null;
            }
            if (idVar3 == null) {
                uz0.A("velocityVector");
                throw null;
            }
            idVar.getClass();
            idVar3.e(i, this.a.g(idVar2.a(i), j));
            i++;
        }
    }
}
