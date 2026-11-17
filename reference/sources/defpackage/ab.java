package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ab implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ rg1 i;
    public final /* synthetic */ nx j;
    public final /* synthetic */ int k;

    public /* synthetic */ ab(rg1 rg1Var, nx nxVar, int i, byte b) {
        this.h = b;
        this.i = rg1Var;
        this.j = nxVar;
        this.k = i;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        int i = this.k;
        nx nxVar = this.j;
        rg1 rg1Var = this.i;
        dr0 dr0Var = (dr0) obj;
        ((Integer) obj2).getClass();
        int i2 = i | 1;
        switch (b) {
            case 0:
                s60.d(rg1Var, nxVar, dr0Var, m02.A(i2));
                break;
            case 1:
                s60.e(rg1Var, nxVar, dr0Var, m02.A(i2));
                break;
            case 2:
                e80.d(rg1Var, nxVar, dr0Var, m02.A(i2));
                break;
            default:
                rz1.a(rg1Var, nxVar, dr0Var, m02.A(i2));
                break;
        }
        return j23Var;
    }
}
