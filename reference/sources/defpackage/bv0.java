package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class bv0 extends wg1 {
    public final hz0 h;
    public final dv0 i;

    public bv0(hz0 hz0Var, dv0 dv0Var) {
        this.h = hz0Var;
        this.i = dv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv0)) {
            return false;
        }
        bv0 bv0Var = (bv0) obj;
        return uz0.g(this.h, bv0Var.h) && uz0.g(this.i, bv0Var.i);
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        j80 j80VarA = this.i.a(this.h);
        cv0 cv0Var = new cv0();
        cv0Var.x = j80VarA;
        cv0Var.J0(j80VarA);
        return cv0Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        cv0 cv0Var = (cv0) qg1Var;
        j80 j80VarA = this.i.a(this.h);
        cv0Var.K0(cv0Var.x);
        cv0Var.x = j80VarA;
        cv0Var.J0(j80VarA);
    }

    public final int hashCode() {
        return this.i.hashCode() + (this.h.hashCode() * 31);
    }
}
