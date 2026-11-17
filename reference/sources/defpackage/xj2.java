package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class xj2 extends wg1 {
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final boolean l;

    public xj2(float f, float f2, float f3, float f4, boolean z, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj2)) {
            return false;
        }
        xj2 xj2Var = (xj2) obj;
        return cc0.b(this.h, xj2Var.h) && cc0.b(this.i, xj2Var.i) && cc0.b(this.j, xj2Var.j) && cc0.b(this.k, xj2Var.k) && this.l == xj2Var.l;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        zj2 zj2Var = new zj2();
        zj2Var.v = this.h;
        zj2Var.w = this.i;
        zj2Var.x = this.j;
        zj2Var.y = this.k;
        zj2Var.z = this.l;
        return zj2Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        zj2 zj2Var = (zj2) qg1Var;
        zj2Var.v = this.h;
        zj2Var.w = this.i;
        zj2Var.x = this.j;
        zj2Var.y = this.k;
        zj2Var.z = this.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + wi0.d(this.k, wi0.d(this.j, wi0.d(this.i, Float.hashCode(this.h) * 31, 31), 31), 31);
    }

    public xj2(float f, float f2, float f3, float f4, boolean z) {
        this.h = f;
        this.i = f2;
        this.j = f3;
        this.k = f4;
        this.l = z;
    }
}
