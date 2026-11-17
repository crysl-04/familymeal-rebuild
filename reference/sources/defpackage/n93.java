package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class n93 extends wg1 {
    public final ra0 h;
    public final zp0 i;
    public final Object j;

    public n93(ra0 ra0Var, zp0 zp0Var, Object obj) {
        this.h = ra0Var;
        this.i = zp0Var;
        this.j = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n93.class != obj.getClass()) {
            return false;
        }
        n93 n93Var = (n93) obj;
        return this.h == n93Var.h && this.j.equals(n93Var.j);
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        p93 p93Var = new p93();
        p93Var.v = this.h;
        p93Var.w = this.i;
        return p93Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        p93 p93Var = (p93) qg1Var;
        p93Var.v = this.h;
        p93Var.w = this.i;
    }

    public final int hashCode() {
        return this.j.hashCode() + (((this.h.hashCode() * 31) + 1237) * 31);
    }
}
