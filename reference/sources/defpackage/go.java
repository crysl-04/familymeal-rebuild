package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class go implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ rg1 i;

    public /* synthetic */ go(rg1 rg1Var, int i, byte b) {
        this.h = b;
        this.i = rg1Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        rg1 rg1Var = this.i;
        dr0 dr0Var = (dr0) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ho.a(rg1Var, dr0Var, m02.A(1));
                break;
            default:
                h7.F(rg1Var, dr0Var, m02.A(1));
                break;
        }
        return j23Var;
    }
}
