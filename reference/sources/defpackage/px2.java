package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class px2 extends wg1 {
    public final ui1 h;
    public final boolean i;
    public final zm2 j;

    public px2(ui1 ui1Var, boolean z, zm2 zm2Var) {
        this.h = ui1Var;
        this.i = z;
        this.j = zm2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px2)) {
            return false;
        }
        px2 px2Var = (px2) obj;
        return uz0.g(this.h, px2Var.h) && this.i == px2Var.i && this.j.equals(px2Var.j);
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        rx2 rx2Var = new rx2();
        rx2Var.v = this.h;
        rx2Var.w = this.i;
        rx2Var.x = this.j;
        rx2Var.B = Float.NaN;
        rx2Var.C = Float.NaN;
        return rx2Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        rx2 rx2Var = (rx2) qg1Var;
        rx2Var.v = this.h;
        boolean z = rx2Var.w;
        boolean z2 = this.i;
        if (z != z2) {
            vs.E(rx2Var);
        }
        rx2Var.w = z2;
        rx2Var.x = this.j;
        if (rx2Var.A == null && !Float.isNaN(rx2Var.C)) {
            rx2Var.A = ie1.a(rx2Var.C);
        }
        if (rx2Var.z != null || Float.isNaN(rx2Var.B)) {
            return;
        }
        rx2Var.z = ie1.a(rx2Var.B);
    }

    public final int hashCode() {
        return this.j.hashCode() + jp1.c(this.h.hashCode() * 31, 31, this.i);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.h + ", checked=" + this.i + ", animationSpec=" + this.j + ')';
    }
}
