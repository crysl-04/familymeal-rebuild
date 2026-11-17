package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t4 implements zp0 {
    public final /* synthetic */ byte h = 0;
    public final /* synthetic */ Object i;
    public final /* synthetic */ nx j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ t4(nx nxVar, fl flVar, gt2 gt2Var, kp0 kp0Var, int i) {
        this.j = nxVar;
        this.i = flVar;
        this.m = gt2Var;
        this.l = kp0Var;
        this.k = i;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        int i = this.k;
        Object obj3 = this.l;
        Object obj4 = this.m;
        Object obj5 = this.i;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = m02.A(i | 1);
                b5.d((kp0) obj3, (rg1) obj5, (la0) obj4, this.j, (dr0) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = m02.A(i | 1);
                uz0.f((ry2) obj3, (sj1) obj4, (rg1) obj5, this.j, (dr0) obj, iA2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA3 = m02.A(i) | 1;
                this.j.e((fl) obj5, (gt2) obj4, (kp0) obj3, (dr0) obj, iA3);
                break;
        }
        return j23Var;
    }

    public /* synthetic */ t4(kp0 kp0Var, rg1 rg1Var, la0 la0Var, nx nxVar, int i) {
        this.l = kp0Var;
        this.i = rg1Var;
        this.m = la0Var;
        this.j = nxVar;
        this.k = i;
    }

    public /* synthetic */ t4(ry2 ry2Var, sj1 sj1Var, rg1 rg1Var, nx nxVar, int i) {
        this.l = ry2Var;
        this.m = sj1Var;
        this.i = rg1Var;
        this.j = nxVar;
        this.k = i;
    }
}
