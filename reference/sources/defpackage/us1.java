package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class us1 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public us1(yl1 yl1Var, boolean z, boolean z2, zm2 zm2Var, zp0 zp0Var) {
        this.h = (byte) 2;
        this.k = yl1Var;
        this.i = z;
        this.j = z2;
        this.l = zm2Var;
        this.m = zp0Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        Object obj3 = this.m;
        Object obj4 = this.l;
        Object obj5 = this.k;
        switch (b) {
            case 0:
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    c5.h0.g(this.i, this.j, (ui1) obj5, null, (au2) obj4, (hi2) obj3, 0.0f, 0.0f, dr0Var, 100663296, 200);
                }
                break;
            case 1:
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dr0Var2.Q();
                } else {
                    c5.h0.g(this.i, this.j, (ui1) obj5, null, (au2) obj4, (hi2) obj3, 0.0f, 0.0f, dr0Var2, 100663296, 200);
                }
                break;
            default:
                dr0 dr0Var3 = (dr0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!dr0Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dr0Var3.Q();
                } else {
                    yl1 yl1Var = (yl1) obj5;
                    h12.a(((kv) vj2.a(this.j ? this.i ? yl1Var.b : yl1Var.e : yl1Var.g, (zm2) obj4, dr0Var3).getValue()).a, e13.a(aa3.L, dr0Var3), (zp0) obj3, dr0Var3, 0);
                }
                break;
        }
        return j23Var;
    }

    public /* synthetic */ us1(boolean z, boolean z2, ui1 ui1Var, au2 au2Var, hi2 hi2Var, byte b) {
        this.h = b;
        this.i = z;
        this.j = z2;
        this.k = ui1Var;
        this.l = au2Var;
        this.m = hi2Var;
    }
}
