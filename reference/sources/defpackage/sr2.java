package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sr2 implements zp0 {
    public final /* synthetic */ byte h = 1;
    public final /* synthetic */ int i;
    public final /* synthetic */ rg1 j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ nx m;
    public final /* synthetic */ nx n;
    public final /* synthetic */ nx o;

    public /* synthetic */ sr2(int i, rg1 rg1Var, long j, long j2, nx nxVar, nx nxVar2, nx nxVar3, int i2) {
        this.i = i;
        this.j = rg1Var;
        this.k = j;
        this.l = j2;
        this.m = nxVar;
        this.n = nxVar2;
        this.o = nxVar3;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = m02.A(this.i | 1);
                r02.b(this.j, this.k, this.l, this.m, this.n, this.o, (dr0) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = m02.A(1572865);
                r02.a(this.i, this.j, this.k, this.l, this.m, this.n, this.o, (dr0) obj, iA2);
                break;
        }
        return j23Var;
    }

    public /* synthetic */ sr2(rg1 rg1Var, long j, long j2, nx nxVar, nx nxVar2, nx nxVar3, int i) {
        this.j = rg1Var;
        this.k = j;
        this.l = j2;
        this.m = nxVar;
        this.n = nxVar2;
        this.o = nxVar3;
        this.i = i;
    }
}
