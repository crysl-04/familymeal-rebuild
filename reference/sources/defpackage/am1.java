package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class am1 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ iu1 i;

    public /* synthetic */ am1(iu1 iu1Var, byte b) {
        this.h = b;
        this.i = iu1Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        j23 j23Var = j23.a;
        iu1 iu1Var = this.i;
        switch (b) {
            case 0:
                iu1Var.h((int) (((vy0) obj).a >> 32));
                break;
            default:
                iu1Var.h(((Integer) obj).intValue());
                break;
        }
        return j23Var;
    }
}
