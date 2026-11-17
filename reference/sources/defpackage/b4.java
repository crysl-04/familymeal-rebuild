package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class b4 extends wg1 {
    public final j7 h;

    public b4(j7 j7Var) {
        this.h = j7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b4) {
            return this.h == ((b4) obj).h;
        }
        return false;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        c4 c4Var = new c4();
        c4Var.x = this.h;
        p pVar = new p(c4Var, (byte) 2);
        a4 a4Var = new a4();
        a4Var.v = pVar;
        c4Var.J0(a4Var);
        return c4Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        ((c4) qg1Var).x = this.h;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }
}
