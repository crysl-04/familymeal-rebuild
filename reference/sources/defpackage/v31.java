package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class v31 extends wg1 {
    public final aq0 h;

    public v31(aq0 aq0Var) {
        this.h = aq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v31) {
            return this.h == ((v31) obj).h;
        }
        return false;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        b41 b41Var = new b41();
        b41Var.v = this.h;
        return b41Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        ((b41) qg1Var).v = this.h;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }
}
