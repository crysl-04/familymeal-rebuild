package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class mz implements as1, m20 {
    public static final yy i = new yy((byte) 1);
    public final dr0 h;

    public mz(dr0 dr0Var) {
        this.h = dr0Var;
    }

    @Override // defpackage.as1
    public final List d(Integer num) {
        return this.h.D();
    }

    @Override // defpackage.as1
    public final boolean f() {
        return this.h.C;
    }

    @Override // defpackage.m20
    public final n20 getKey() {
        return i;
    }

    @Override // defpackage.o20
    public final /* bridge */ o20 i(o20 o20Var) {
        return cu.Q(this, o20Var);
    }

    @Override // defpackage.o20
    public final /* bridge */ m20 m(n20 n20Var) {
        return cu.F(this, n20Var);
    }

    @Override // defpackage.o20
    public final Object p(zp0 zp0Var, Object obj) {
        return zp0Var.f(obj, this);
    }

    @Override // defpackage.o20
    public final /* bridge */ o20 t(n20 n20Var) {
        return cu.M(this, n20Var);
    }
}
