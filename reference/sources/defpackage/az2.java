package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class az2 implements m20 {
    public static final jy1 i = new jy1((byte) 27);
    public final q20 h;

    public az2(q20 q20Var) {
        this.h = q20Var;
    }

    @Override // defpackage.m20
    public final n20 getKey() {
        return i;
    }

    @Override // defpackage.o20
    public final o20 i(o20 o20Var) {
        return cu.Q(this, o20Var);
    }

    @Override // defpackage.o20
    public final m20 m(n20 n20Var) {
        return cu.F(this, n20Var);
    }

    @Override // defpackage.o20
    public final Object p(zp0 zp0Var, Object obj) {
        return zp0Var.f(obj, this);
    }

    @Override // defpackage.o20
    public final o20 t(n20 n20Var) {
        return cu.M(this, n20Var);
    }
}
