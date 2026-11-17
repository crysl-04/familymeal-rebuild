package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class w01 extends rq {
    public final jw p;

    public w01(m10 m10Var, jw jwVar) {
        super(1, m10Var);
        this.p = jwVar;
    }

    @Override // defpackage.rq
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // defpackage.rq
    public final Throwable s(z01 z01Var) {
        Throwable thC;
        Object objN = this.p.N();
        if (!(objN instanceof y01) || (thC = ((y01) objN).c()) == null) {
            return objN instanceof mw ? ((mw) objN).a : z01Var.o();
        }
        return thC;
    }
}
