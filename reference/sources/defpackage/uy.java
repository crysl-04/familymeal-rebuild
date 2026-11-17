package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uy implements zp0 {
    public final /* synthetic */ byte h = 0;
    public final /* synthetic */ wy i;
    public final /* synthetic */ t6 j;
    public final /* synthetic */ nx k;

    public /* synthetic */ uy(t6 t6Var, wy wyVar, nx nxVar) {
        this.j = t6Var;
        this.i = wyVar;
        this.k = nxVar;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        nx nxVar = this.k;
        t6 t6Var = this.j;
        wy wyVar = this.i;
        dr0 dr0Var = (dr0) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    dr0Var.V(866651995);
                    uz.a(t6Var, wyVar.l, nxVar, dr0Var, 0);
                    dr0Var.p(false);
                }
                break;
            default:
                num.getClass();
                wyVar.a(t6Var, nxVar, dr0Var, m02.A(1));
                break;
        }
        return j23Var;
    }

    public /* synthetic */ uy(wy wyVar, t6 t6Var, nx nxVar, int i) {
        this.i = wyVar;
        this.j = t6Var;
        this.k = nxVar;
    }
}
