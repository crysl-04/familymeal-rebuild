package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nk0 implements zp0 {
    public final /* synthetic */ long h;
    public final /* synthetic */ xw2 i;
    public final /* synthetic */ float j;
    public final /* synthetic */ nx k;

    public nk0(long j, xw2 xw2Var, float f, nx nxVar) {
        this.h = j;
        this.i = xw2Var;
        this.j = f;
        this.k = nxVar;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        dr0 dr0Var = (dr0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            h12.a(this.h, this.i, dt.N(-1767363041, new mk0(this.j, this.k), dr0Var), dr0Var, 384);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
