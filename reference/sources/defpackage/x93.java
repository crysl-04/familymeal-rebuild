package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class x93 extends wg1 {
    public final float h;
    public final Object i;

    public x93(float f, Object obj) {
        this.h = f;
        this.i = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x93)) {
            return false;
        }
        x93 x93Var = (x93) obj;
        return x93Var.h == this.h && uz0.g(x93Var.i, this.i);
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        y93 y93Var = new y93();
        y93Var.v = this.h;
        y93Var.w = this.i;
        return y93Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        y93 y93Var = (y93) qg1Var;
        y93Var.v = this.h;
        y93Var.w = this.i;
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.h) * 31;
        Object obj = this.i;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }
}
