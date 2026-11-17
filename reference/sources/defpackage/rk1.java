package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rk1 implements zp0 {
    public final /* synthetic */ byte h = 0;
    public final /* synthetic */ pk1 i;
    public final /* synthetic */ pb2 j;
    public final /* synthetic */ nx k;

    public /* synthetic */ rk1(pk1 pk1Var, pb2 pb2Var, nx nxVar, int i) {
        this.i = pk1Var;
        this.j = pb2Var;
        this.k = nxVar;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        nx nxVar = this.k;
        pb2 pb2Var = this.j;
        pk1 pk1Var = this.i;
        dr0 dr0Var = (dr0) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    ou.j(pb2Var, dt.N(65670941, new j7(pk1Var, nxVar, (byte) 21), dr0Var), dr0Var, 48);
                }
                break;
            default:
                num.getClass();
                ou.i(pk1Var, pb2Var, nxVar, dr0Var, m02.A(385));
                break;
        }
        return j23Var;
    }

    public /* synthetic */ rk1(pb2 pb2Var, pk1 pk1Var, nx nxVar) {
        this.j = pb2Var;
        this.i = pk1Var;
        this.k = nxVar;
    }
}
