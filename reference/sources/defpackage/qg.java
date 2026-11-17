package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qg extends wg1 implements sg2 {
    public final boolean h;
    public final vp0 i;

    public qg(vp0 vp0Var, boolean z) {
        this.h = z;
        this.i = vp0Var;
    }

    @Override // defpackage.sg2
    public final rg2 d() {
        rg2 rg2Var = new rg2();
        rg2Var.j = this.h;
        this.i.h(rg2Var);
        return rg2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg)) {
            return false;
        }
        qg qgVar = (qg) obj;
        return this.h == qgVar.h && this.i == qgVar.i;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        return new s10(this.h, false, this.i);
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        s10 s10Var = (s10) qg1Var;
        s10Var.v = this.h;
        s10Var.x = this.i;
    }

    public final int hashCode() {
        return this.i.hashCode() + (Boolean.hashCode(this.h) * 31);
    }
}
