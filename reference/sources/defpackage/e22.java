package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class e22 extends gi0 {
    public final /* synthetic */ byte j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e22(int i, byte b) {
        super(i);
        this.j = b;
    }

    @Override // defpackage.gi0
    public final boolean a(mg1 mg1Var) {
        switch (this.j) {
            case 0:
                return ((zh0) mg1Var).o();
            default:
                zh0 zh0Var = (zh0) mg1Var;
                return zh0Var.t() && !zh0Var.U() && zh0Var.T();
        }
    }
}
