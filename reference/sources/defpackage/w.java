package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class w implements m20 {
    public final n20 h;

    public w(n20 n20Var) {
        this.h = n20Var;
    }

    @Override // defpackage.m20
    public final n20 getKey() {
        return this.h;
    }

    @Override // defpackage.o20
    public final /* bridge */ o20 i(o20 o20Var) {
        return cu.Q(this, o20Var);
    }

    @Override // defpackage.o20
    public /* bridge */ m20 m(n20 n20Var) {
        return cu.F(this, n20Var);
    }

    @Override // defpackage.o20
    public final Object p(zp0 zp0Var, Object obj) {
        return zp0Var.f(obj, this);
    }

    @Override // defpackage.o20
    public /* bridge */ o20 t(n20 n20Var) {
        return cu.M(this, n20Var);
    }
}
