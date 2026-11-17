package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ju2 implements zp0 {
    public final /* synthetic */ long h;
    public final /* synthetic */ nx i;

    public ju2(long j, nx nxVar) {
        this.h = j;
        this.i = nxVar;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        dr0 dr0Var = (dr0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            y02.c(this.h, this.i, dr0Var, 0);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
