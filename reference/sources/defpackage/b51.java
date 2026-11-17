package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class b51 extends wg1 {
    public final float h;
    public final boolean i;

    public b51(float f, boolean z) {
        this.h = f;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        b51 b51Var = obj instanceof b51 ? (b51) obj : null;
        return b51Var != null && this.h == b51Var.h && this.i == b51Var.i;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        c51 c51Var = new c51();
        c51Var.v = this.h;
        c51Var.w = this.i;
        return c51Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        c51 c51Var = (c51) qg1Var;
        c51Var.v = this.h;
        c51Var.w = this.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + (Float.hashCode(this.h) * 31);
    }
}
