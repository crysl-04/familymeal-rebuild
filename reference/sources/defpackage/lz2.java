package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class lz2 {
    public final s03 a;
    public final lu1 b = rz1.x(null);
    public final /* synthetic */ qz2 c;

    public lz2(qz2 qz2Var, s03 s03Var, String str) {
        this.c = qz2Var;
        this.a = s03Var;
    }

    public final kz2 a(vp0 vp0Var, Object obj, id idVar, vp0 vp0Var2) {
        lu1 lu1Var = this.b;
        kz2 kz2Var = (kz2) lu1Var.getValue();
        qz2 qz2Var = this.c;
        if (kz2Var == null) {
            Object objH = vp0Var2.h(qz2Var.a.g());
            Object objH2 = vp0Var2.h(qz2Var.a.g());
            s03 s03Var = this.a;
            id idVar2 = (id) s03Var.a.h(objH2);
            idVar2.d();
            oz2 oz2Var = new oz2(qz2Var, objH, idVar2, s03Var);
            kz2Var = new kz2(this, oz2Var, vp0Var, vp0Var2);
            lu1Var.setValue(kz2Var);
            qz2Var.j.add(oz2Var);
        }
        kz2Var.j = vp0Var2;
        kz2Var.i = vp0Var;
        kz2Var.a(qz2Var.f(), obj, idVar);
        return kz2Var;
    }
}
