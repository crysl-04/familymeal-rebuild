package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class le2 extends wg1 {
    public final yd2 h;

    public le2(yd2 yd2Var) {
        this.h = yd2Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof le2) {
            return uz0.g(this.h, ((le2) obj).h);
        }
        return false;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        ud2 ud2Var = new ud2();
        ud2Var.v = this.h;
        ud2Var.w = true;
        return ud2Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        ud2 ud2Var = (ud2) qg1Var;
        ud2Var.v = this.h;
        ud2Var.w = true;
    }

    public final int hashCode() {
        return (((this.h.hashCode() * 31) + 1237) * 31) + 1231;
    }
}
