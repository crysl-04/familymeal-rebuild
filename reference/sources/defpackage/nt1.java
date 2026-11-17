package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class nt1 extends wg1 {
    public final float h;
    public final float i;
    public final float j;
    public final float k;

    public nt1(float f, float f2, float f3, float f4) {
        this.h = f;
        this.i = f2;
        this.j = f3;
        this.k = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            yw0.a("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        nt1 nt1Var = obj instanceof nt1 ? (nt1) obj : null;
        return nt1Var != null && cc0.b(this.h, nt1Var.h) && cc0.b(this.i, nt1Var.i) && cc0.b(this.j, nt1Var.j) && cc0.b(this.k, nt1Var.k);
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        ot1 ot1Var = new ot1();
        ot1Var.v = this.h;
        ot1Var.w = this.i;
        ot1Var.x = this.j;
        ot1Var.y = this.k;
        ot1Var.z = true;
        return ot1Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        ot1 ot1Var = (ot1) qg1Var;
        ot1Var.v = this.h;
        ot1Var.w = this.i;
        ot1Var.x = this.j;
        ot1Var.y = this.k;
        ot1Var.z = true;
    }

    public final int hashCode() {
        return ((Float.hashCode(this.k) + wi0.d(this.j, wi0.d(this.i, Float.hashCode(this.h) * 31, 31), 31)) * 31) + 1231;
    }
}
