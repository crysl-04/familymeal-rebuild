package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class mn extends wg1 {
    public final vp0 h;

    public mn(vp0 vp0Var) {
        this.h = vp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mn) {
            return this.h == ((mn) obj).h;
        }
        return false;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        return new nn(this.h);
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        pn1 pn1Var;
        nn nnVar = (nn) qg1Var;
        vp0 vp0Var = this.h;
        nnVar.v = vp0Var;
        if (!nnVar.h.u || (pn1Var = cu.W(nnVar, 2).C) == null) {
            return;
        }
        pn1Var.v1(vp0Var, true);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }
}
