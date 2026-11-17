package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ot extends wg1 {
    public final s0 h;

    public ot(s0 s0Var) {
        this.h = s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ot) {
            return this.h == ((ot) obj).h;
        }
        return false;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        nt ntVar = new nt();
        ntVar.v = this.h;
        return ntVar;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        nt ntVar = (nt) qg1Var;
        ntVar.v = this.h;
        y02.p(ntVar);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }
}
