package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kl0 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ nx i;

    public /* synthetic */ kl0(nx nxVar) {
        this.h = (byte) 0;
        this.i = nxVar;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        nx nxVar = this.i;
        dr0 dr0Var = (dr0) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    nxVar.c(pl0.a, dr0Var, 6);
                }
                break;
            case 1:
                num.getClass();
                cu.j(nxVar, dr0Var, m02.A(7));
                break;
            case 2:
                num.getClass();
                pr2.c(nxVar, dr0Var, m02.A(1));
                break;
            default:
                num.getClass();
                cx2.a(nxVar, dr0Var, m02.A(7));
                break;
        }
        return j23Var;
    }

    public /* synthetic */ kl0(nx nxVar, int i, byte b) {
        this.h = b;
        this.i = nxVar;
    }
}
