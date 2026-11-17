package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class qz0 extends wg1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qz0 ? (qz0) obj : null) != null;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        sz0 sz0Var = new sz0();
        sz0Var.v = pz0.i;
        sz0Var.w = true;
        return sz0Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        sz0 sz0Var = (sz0) qg1Var;
        sz0Var.v = pz0.i;
        sz0Var.w = true;
    }

    public final int hashCode() {
        return (pz0.i.hashCode() * 31) + 1231;
    }
}
