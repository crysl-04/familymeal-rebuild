package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s7 implements zp0 {
    public final /* synthetic */ byte h = 1;
    public final /* synthetic */ long i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ s7(long j, d13 d13Var, zp0 zp0Var, int i) {
        this.i = j;
        this.j = d13Var;
        this.k = zp0Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        Object obj3 = this.k;
        Object obj4 = this.j;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = m02.A(1);
                w7.a((yp1) obj4, (rg1) obj3, this.i, (dr0) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = m02.A(49);
                cu.n(this.i, (d13) obj4, (zp0) obj3, (dr0) obj, iA2);
                break;
        }
        return j23Var;
    }

    public /* synthetic */ s7(yp1 yp1Var, rg1 rg1Var, long j, int i) {
        this.j = yp1Var;
        this.k = rg1Var;
        this.i = j;
    }
}
