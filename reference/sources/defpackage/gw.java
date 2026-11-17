package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gw implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ kv2 i;
    public final /* synthetic */ nx j;

    public /* synthetic */ gw(kv2 kv2Var, nx nxVar, int i, byte b) {
        this.h = b;
        this.i = kv2Var;
        this.j = nxVar;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        nx nxVar = this.j;
        kv2 kv2Var = this.i;
        dr0 dr0Var = (dr0) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ls.b(kv2Var, nxVar, dr0Var, m02.A(49));
                break;
            default:
                vs.a(kv2Var, nxVar, dr0Var, m02.A(49));
                break;
        }
        return j23Var;
    }
}
