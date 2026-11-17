package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qc1 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ zt2 i;

    public /* synthetic */ qc1(zt2 zt2Var, byte b) {
        this.h = b;
        this.i = zt2Var;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        j23 j23Var = j23.a;
        zt2 zt2Var = this.i;
        switch (b) {
            case 0:
                zt2Var.a();
                break;
            default:
                zt2Var.onCancel();
                break;
        }
        return j23Var;
    }
}
