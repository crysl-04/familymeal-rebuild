package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rc2 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ nx i;
    public final /* synthetic */ nx j;
    public final /* synthetic */ nx k;
    public final /* synthetic */ nx l;
    public final /* synthetic */ wj1 m;
    public final /* synthetic */ nx n;

    /* JADX WARN: Multi-variable type inference failed */
    public rc2(int i, nx nxVar, nx nxVar2, nx nxVar3, nx nxVar4, wj1 wj1Var, nx nxVar5) {
        this.h = i;
        this.i = nxVar;
        this.j = nxVar2;
        this.k = nxVar3;
        this.l = nxVar4;
        this.m = wj1Var;
        this.n = nxVar5;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        dr0 dr0Var = (dr0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            cy1.b(this.h, this.i, this.j, this.k, this.l, this.m, this.n, dr0Var, 0);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
