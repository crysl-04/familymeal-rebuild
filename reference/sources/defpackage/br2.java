package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class br2 extends wg1 {
    public final vp0 h;

    public br2(vp0 vp0Var) {
        this.h = vp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof br2) {
            return this.h == ((br2) obj).h;
        }
        return false;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        cr2 cr2Var = new cr2(uz0.M);
        cr2Var.y = this.h;
        return cr2Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        cr2 cr2Var = (cr2) qg1Var;
        vp0 vp0Var = cr2Var.y;
        vp0 vp0Var2 = this.h;
        if (vp0Var != vp0Var2) {
            cr2Var.y = vp0Var2;
            u83 u83Var = cr2Var.z;
            if (u83Var != null) {
                m73 m73Var = (m73) vp0Var2.h(u83Var);
                if (uz0.g(m73Var, cr2Var.x)) {
                    return;
                }
                cr2Var.x = m73Var;
                cr2Var.K0();
            }
        }
    }

    public final int hashCode() {
        return this.h.hashCode();
    }
}
