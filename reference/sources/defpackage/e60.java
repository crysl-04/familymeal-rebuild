package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class e60 implements zp0 {
    public final /* synthetic */ kp0 h;
    public final /* synthetic */ rg1 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ iu0 k;
    public final /* synthetic */ String l;

    public e60(kp0 kp0Var, rg1 rg1Var, boolean z, iu0 iu0Var, String str) {
        this.h = kp0Var;
        this.i = rg1Var;
        this.j = z;
        this.k = iu0Var;
        this.l = str;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        dr0 dr0Var = (dr0) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean z = false;
        if (dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            cu.e(this.h, this.i, this.j, null, null, dt.N(-1301085432, new rl(this.k, this.l, (byte) 3, z), dr0Var), dr0Var, 1572864, 56);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
