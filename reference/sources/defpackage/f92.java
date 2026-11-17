package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class f92 extends v01 {
    public final w01 l;

    public f92(w01 w01Var) {
        this.l = w01Var;
    }

    @Override // defpackage.v01
    public final boolean m() {
        return false;
    }

    @Override // defpackage.v01
    public final void n(Throwable th) {
        Object objN = l().N();
        boolean z = objN instanceof mw;
        w01 w01Var = this.l;
        if (z) {
            w01Var.g(m02.e(((mw) objN).a));
        } else {
            w01Var.g(ie1.D(objN));
        }
    }
}
