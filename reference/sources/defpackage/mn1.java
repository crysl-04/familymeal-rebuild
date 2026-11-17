package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mn1 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ pn1 i;

    public /* synthetic */ mn1(pn1 pn1Var, byte b) {
        this.h = b;
        this.i = pn1Var;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        j23 j23Var = j23.a;
        pn1 pn1Var = this.i;
        switch (b) {
            case 0:
                wq wqVar = pn1Var.W;
                wqVar.getClass();
                pn1Var.P0(wqVar, pn1Var.V);
                break;
            default:
                pn1 pn1Var2 = pn1Var.D;
                if (pn1Var2 != null) {
                    pn1Var2.d1();
                }
                break;
        }
        return j23Var;
    }
}
