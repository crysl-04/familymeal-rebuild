package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class a5 implements zp0 {
    public final /* synthetic */ nx h;
    public final /* synthetic */ nx i;
    public final /* synthetic */ hi2 j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;
    public final /* synthetic */ nx o;
    public final /* synthetic */ nx p;

    public a5(nx nxVar, nx nxVar2, hi2 hi2Var, long j, long j2, long j3, long j4, nx nxVar3, nx nxVar4) {
        this.h = nxVar;
        this.i = nxVar2;
        this.j = hi2Var;
        this.k = j;
        this.l = j2;
        this.m = j3;
        this.n = j4;
        this.o = nxVar3;
        this.p = nxVar4;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        dr0 dr0Var = (dr0) obj;
        int iIntValue = ((Number) obj2).intValue();
        byte b = 1;
        if (dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            b5.a(dt.N(1367541877, new z4(this.o, this.p, b), dr0Var), null, this.h, this.i, this.j, this.k, rv.d(s60.m, dr0Var), this.l, this.m, this.n, dr0Var, 6);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
