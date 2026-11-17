package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ou1 extends wg1 {
    public final qb h;

    public ou1(qb qbVar) {
        this.h = qbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ou1) {
            return this.h == ((ou1) obj).h;
        }
        return false;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        nu1 nu1Var = new nu1();
        nu1Var.v = this.h;
        return nu1Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        nu1 nu1Var = (nu1) qg1Var;
        nu1Var.v = this.h;
        y02.p(nu1Var);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }
}
