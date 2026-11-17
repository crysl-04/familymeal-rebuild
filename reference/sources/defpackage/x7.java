package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x7 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ rg1 i;
    public final /* synthetic */ zp0 j;

    public /* synthetic */ x7(rg1 rg1Var, zp0 zp0Var, int i, byte b) {
        this.h = b;
        this.i = rg1Var;
        this.j = zp0Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        zp0 zp0Var = this.j;
        rg1 rg1Var = this.i;
        dr0 dr0Var = (dr0) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                uz0.d(rg1Var, zp0Var, dr0Var, m02.A(1));
                break;
            default:
                tz0.e(rg1Var, zp0Var, dr0Var, m02.A(1));
                break;
        }
        return j23Var;
    }
}
