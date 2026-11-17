package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ng2 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ dd i;

    public /* synthetic */ ng2(dd ddVar, byte b) {
        this.h = b;
        this.i = ddVar;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        j23 j23Var = j23.a;
        dd ddVar = this.i;
        switch (b) {
            case 0:
                up1 up1Var = (up1) ddVar.i.getValue();
                long j = up1Var.a;
                return up1Var;
            case 1:
                ddVar.m = false;
                return j23Var;
            default:
                ddVar.m = false;
                return j23Var;
        }
    }
}
