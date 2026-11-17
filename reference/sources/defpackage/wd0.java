package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class wd0 extends wg1 {
    public final vp0 h;

    public wd0(vp0 vp0Var) {
        this.h = vp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wd0) {
            return this.h == ((wd0) obj).h;
        }
        return false;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        return new yp(new zp(), this.h);
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        yp ypVar = (yp) qg1Var;
        ypVar.x = this.h;
        ypVar.J0();
    }

    public final int hashCode() {
        return this.h.hashCode();
    }
}
