package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pc1 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ zt2 i;

    public /* synthetic */ pc1(zt2 zt2Var, byte b) {
        this.h = b;
        this.i = zt2Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        j23 j23Var = j23.a;
        zt2 zt2Var = this.i;
        switch (b) {
            case 0:
                zt2Var.c(((up1) obj).a, vz1.o);
                break;
            case 1:
                z02 z02Var = (z02) obj;
                zt2Var.e(r02.B(z02Var, false));
                z02Var.a();
                break;
            default:
                z02 z02Var2 = (z02) obj;
                zt2Var.e(r02.B(z02Var2, false));
                z02Var2.a();
                break;
        }
        return j23Var;
    }
}
