package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class up implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ long i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ aq0 k;

    public /* synthetic */ up(long j, Object obj, aq0 aq0Var, byte b) {
        this.h = b;
        this.i = j;
        this.j = obj;
        this.k = aq0Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        aq0 aq0Var = this.k;
        Object obj3 = this.j;
        byte b2 = 1;
        switch (b) {
            case 0:
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    h12.a(this.i, ((c13) dr0Var.j(e13.a)).m, dt.N(417635459, new rl((rt1) obj3, aq0Var, b2), dr0Var), dr0Var, 384);
                }
                break;
            default:
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dr0Var2.Q();
                } else {
                    y02.b(this.i, (xw2) obj3, (nx) aq0Var, dr0Var2, 0);
                }
                break;
        }
        return j23Var;
    }
}
