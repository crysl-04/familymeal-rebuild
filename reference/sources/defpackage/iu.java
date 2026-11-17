package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class iu extends wg1 implements sg2 {
    public final vp0 h;

    public iu(vp0 vp0Var) {
        this.h = vp0Var;
    }

    @Override // defpackage.sg2
    public final rg2 d() {
        rg2 rg2Var = new rg2();
        rg2Var.j = false;
        rg2Var.k = true;
        this.h.h(rg2Var);
        return rg2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof iu) {
            return this.h == ((iu) obj).h;
        }
        return false;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        return new s10(false, true, this.h);
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        ((s10) qg1Var).x = this.h;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }
}
