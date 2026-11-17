package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yb extends m31 implements zp0 {
    public final /* synthetic */ byte i = 0;
    public final /* synthetic */ qz2 j;
    public final /* synthetic */ vp0 k;
    public final /* synthetic */ rg1 l;
    public final /* synthetic */ nx m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(qz2 qz2Var, vp0 vp0Var, rg1 rg1Var, ah0 ah0Var, wh0 wh0Var, zp0 zp0Var, nx nxVar, int i) {
        super(2);
        this.j = qz2Var;
        this.k = vp0Var;
        this.l = rg1Var;
        this.o = ah0Var;
        this.p = wh0Var;
        this.q = zp0Var;
        this.m = nxVar;
        this.n = i;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.i;
        j23 j23Var = j23.a;
        int i = this.n;
        Object obj3 = this.q;
        Object obj4 = this.p;
        Object obj5 = this.o;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iA = m02.A(i | 1);
                qz2 qz2Var = this.j;
                rg1 rg1Var = this.l;
                vp0 vp0Var = this.k;
                ia2.c(qz2Var, rg1Var, vp0Var, (dm) obj3, (vp0) obj5, (vp0) obj4, this.m, (dr0) obj, iA);
                break;
            default:
                ((Number) obj2).intValue();
                int iA2 = m02.A(i | 1);
                qz2 qz2Var2 = this.j;
                vp0 vp0Var2 = this.k;
                rg1 rg1Var2 = this.l;
                t03.a(qz2Var2, vp0Var2, rg1Var2, (ah0) obj5, (wh0) obj4, (zp0) obj3, this.m, (dr0) obj, iA2);
                break;
        }
        return j23Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(qz2 qz2Var, rg1 rg1Var, vp0 vp0Var, dm dmVar, vp0 vp0Var2, vp0 vp0Var3, nx nxVar, int i) {
        super(2);
        this.j = qz2Var;
        this.l = rg1Var;
        this.k = vp0Var;
        this.q = dmVar;
        this.o = vp0Var2;
        this.p = vp0Var3;
        this.m = nxVar;
        this.n = i;
    }
}
