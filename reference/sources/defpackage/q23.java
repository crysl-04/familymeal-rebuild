package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class q23 extends wg1 {
    public final float h;
    public final float i;

    public q23(float f, float f2) {
        this.h = f;
        this.i = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q23)) {
            return false;
        }
        q23 q23Var = (q23) obj;
        return cc0.b(this.h, q23Var.h) && cc0.b(this.i, q23Var.i);
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        r23 r23Var = new r23();
        r23Var.v = this.h;
        r23Var.w = this.i;
        return r23Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        r23 r23Var = (r23) qg1Var;
        r23Var.v = this.h;
        r23Var.w = this.i;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + (Float.hashCode(this.h) * 31);
    }
}
