package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class sv2 extends wg1 {
    public final xw2 h;

    public sv2(xw2 xw2Var) {
        this.h = xw2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv2)) {
            return false;
        }
        return uz0.g(this.h, ((sv2) obj).h);
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        return new tv2(this.h);
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        tv2 tv2Var = (tv2) qg1Var;
        tv2Var.getClass();
        xw2 xw2VarH = p02.H(this.h, cu.Y(tv2Var).F);
        tv2Var.J0(xw2VarH, (sm0) vs.z(tv2Var, uz.k));
        rv2 rv2Var = tv2Var.x;
        if (rv2Var == null) {
            throw wi0.w("Min size state is not set.");
        }
        rv2.a(rv2Var, null, null, xw2VarH, 23);
        vs.E(tv2Var);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }
}
