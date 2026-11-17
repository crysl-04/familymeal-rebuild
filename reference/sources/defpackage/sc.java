package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class sc extends m31 implements zp0 {
    public final /* synthetic */ boolean i;
    public final /* synthetic */ rg1 j;
    public final /* synthetic */ ah0 k;
    public final /* synthetic */ wh0 l;
    public final /* synthetic */ String m;
    public final /* synthetic */ nx n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(boolean z, rg1 rg1Var, ah0 ah0Var, wh0 wh0Var, String str, nx nxVar, int i) {
        super(2);
        this.i = z;
        this.j = rg1Var;
        this.k = ah0Var;
        this.l = wh0Var;
        this.m = str;
        this.n = nxVar;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA = m02.A(196657);
        t03.b(this.i, this.j, this.k, this.l, this.m, this.n, (dr0) obj, iA);
        return j23.a;
    }
}
