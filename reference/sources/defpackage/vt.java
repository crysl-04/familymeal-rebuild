package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vt implements zp0 {
    public final /* synthetic */ tf2 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ nx k;
    public final /* synthetic */ xw2 l;
    public final /* synthetic */ float m;
    public final /* synthetic */ rt1 n;

    public vt(tf2 tf2Var, boolean z, boolean z2, nx nxVar, xw2 xw2Var, float f, rt1 rt1Var) {
        this.h = tf2Var;
        this.i = z;
        this.j = z2;
        this.k = nxVar;
        this.l = xw2Var;
        this.m = f;
        this.n = rt1Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        long j;
        long j2;
        long j3;
        dr0 dr0Var = (dr0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            tf2 tf2Var = this.h;
            boolean z = this.i;
            boolean z2 = this.j;
            if (z) {
                j = !z2 ? tf2Var.b : tf2Var.k;
            } else {
                j = tf2Var.f;
            }
            long j4 = j;
            if (z) {
                j2 = !z2 ? tf2Var.c : tf2Var.l;
            } else {
                j2 = tf2Var.g;
            }
            if (z) {
                j3 = !z2 ? tf2Var.d : tf2Var.m;
            } else {
                j3 = tf2Var.h;
            }
            wt.a(this.k, this.l, j4, j2, j3, this.m, this.n, dr0Var, 0);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
