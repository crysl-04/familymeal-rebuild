package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class tx0 extends wg1 {
    public final o91 h;

    public tx0(o91 o91Var) {
        this.h = o91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tx0) {
            return uz0.g(((tx0) obj).h, this.h);
        }
        return false;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        return new vx0(this.h);
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        vx0 vx0Var = (vx0) qg1Var;
        m73 m73Var = vx0Var.x;
        o91 o91Var = this.h;
        if (uz0.g(o91Var, m73Var)) {
            return;
        }
        vx0Var.x = o91Var;
        vx0Var.K0();
    }

    public final int hashCode() {
        return this.h.hashCode();
    }
}
