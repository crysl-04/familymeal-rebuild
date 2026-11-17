package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qz1 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ rg1 i;
    public final /* synthetic */ nx j;

    public /* synthetic */ qz1(rg1 rg1Var, nx nxVar, int i, byte b) {
        this.h = b;
        this.i = rg1Var;
        this.j = nxVar;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        nx nxVar = this.j;
        rg1 rg1Var = this.i;
        dr0 dr0Var = (dr0) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                rz1.b(rg1Var, nxVar, dr0Var, m02.A(49));
                break;
            default:
                rz1.d(rg1Var, nxVar, dr0Var, m02.A(49));
                break;
        }
        return j23Var;
    }
}
