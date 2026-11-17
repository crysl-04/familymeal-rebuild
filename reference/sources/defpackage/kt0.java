package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kt0 extends wg1 {
    public final bm h;

    public kt0(bm bmVar) {
        this.h = bmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        kt0 kt0Var = obj instanceof kt0 ? (kt0) obj : null;
        if (kt0Var == null) {
            return false;
        }
        return this.h.equals(kt0Var.h);
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        lt0 lt0Var = new lt0();
        lt0Var.v = this.h;
        return lt0Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        ((lt0) qg1Var).v = this.h;
    }

    public final int hashCode() {
        return Float.hashCode(this.h.a);
    }
}
