package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kx implements zp0 {
    public final /* synthetic */ byte h = 0;
    public final /* synthetic */ nx i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ kx(nx nxVar, String str, Boolean bool, e10 e10Var, Object obj, Object obj2, int i) {
        this.i = nxVar;
        this.k = str;
        this.l = bool;
        this.m = e10Var;
        this.n = obj;
        this.o = obj2;
        this.j = i;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        int i = this.j;
        Object obj3 = this.m;
        Object obj4 = this.l;
        Object obj5 = this.k;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = m02.A(i) | 1;
                this.i.k((String) obj5, (Boolean) obj4, (e10) obj3, this.n, this.o, (dr0) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = m02.A(i | 1);
                ou.f((rg1) obj5, (zg) obj4, (yg) obj3, (cm) this.n, (c5) this.o, this.i, (dr0) obj, iA2);
                break;
        }
        return j23Var;
    }

    public /* synthetic */ kx(rg1 rg1Var, zg zgVar, yg ygVar, cm cmVar, c5 c5Var, nx nxVar, int i) {
        this.k = rg1Var;
        this.l = zgVar;
        this.m = ygVar;
        this.n = cmVar;
        this.o = c5Var;
        this.i = nxVar;
        this.j = i;
    }
}
