package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class oc implements ic {
    public final qz2 a;
    public dm b;
    public final lu1 c = rz1.x(new vy0(0));
    public final mj1 d;

    public oc(qz2 qz2Var, dm dmVar) {
        this.a = qz2Var;
        this.b = dmVar;
        long[] jArr = bd2.a;
        this.d = new mj1();
    }

    @Override // defpackage.ic
    public final z00 a(z00 z00Var, ak2 ak2Var) {
        z00Var.d = ak2Var;
        return z00Var;
    }

    @Override // defpackage.mz2
    public final Object b() {
        return this.a.f().b();
    }

    @Override // defpackage.mz2
    public final Object d() {
        return this.a.f().d();
    }
}
