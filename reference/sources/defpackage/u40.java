package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u40 implements zp0 {
    public final /* synthetic */ byte h = 1;
    public final /* synthetic */ long i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ u40(long j, xw2 xw2Var, zp0 zp0Var, int i) {
        this.i = j;
        this.k = xw2Var;
        this.l = zp0Var;
        this.j = i;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        Object obj3 = this.l;
        Object obj4 = this.k;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = m02.A(3121);
                ((w40) obj4).b(this.j, (rg1) obj3, this.i, (dr0) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = m02.A(this.j | 1);
                h12.a(this.i, (xw2) obj4, (zp0) obj3, (dr0) obj, iA2);
                break;
        }
        return j23Var;
    }

    public /* synthetic */ u40(w40 w40Var, int i, rg1 rg1Var, long j, int i2) {
        this.k = w40Var;
        this.j = i;
        this.l = rg1Var;
        this.i = j;
    }
}
