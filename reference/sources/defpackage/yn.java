package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yn extends wg1 {
    public final float h;
    public final rl2 i;
    public final hi2 j;

    public yn(float f, rl2 rl2Var, hi2 hi2Var) {
        this.h = f;
        this.i = rl2Var;
        this.j = hi2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn)) {
            return false;
        }
        yn ynVar = (yn) obj;
        return cc0.b(this.h, ynVar.h) && this.i.equals(ynVar.i) && uz0.g(this.j, ynVar.j);
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        return new xn(this.h, this.i, this.j);
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        xn xnVar = (xn) qg1Var;
        float f = xnVar.y;
        yp ypVar = xnVar.B;
        float f2 = this.h;
        if (!cc0.b(f, f2)) {
            xnVar.y = f2;
            ypVar.J0();
        }
        rl2 rl2Var = xnVar.z;
        rl2 rl2Var2 = this.i;
        if (!uz0.g(rl2Var, rl2Var2)) {
            xnVar.z = rl2Var2;
            ypVar.J0();
        }
        hi2 hi2Var = xnVar.A;
        hi2 hi2Var2 = this.j;
        if (uz0.g(hi2Var, hi2Var2)) {
            return;
        }
        xnVar.A = hi2Var2;
        ypVar.J0();
        y02.p(xnVar);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + (Float.hashCode(this.h) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + cc0.c(this.h) + ", brush=" + this.i + ", shape=" + this.j + ")";
    }
}
