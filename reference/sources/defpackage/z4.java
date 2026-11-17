package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class z4 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ nx i;
    public final /* synthetic */ nx j;

    public /* synthetic */ z4(nx nxVar, nx nxVar2, byte b) {
        this.h = b;
        this.i = nxVar;
        this.j = nxVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        nx nxVar = this.j;
        nx nxVar2 = this.i;
        byte b2 = 2;
        switch (b) {
            case 0:
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    if (nxVar2 == null) {
                        dr0Var.V(-1102039173);
                    } else {
                        dr0Var.V(795734342);
                        nxVar2.f(dr0Var, 0);
                    }
                    dr0Var.p(false);
                    nxVar.f(dr0Var, 0);
                }
                break;
            case 1:
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dr0Var2.Q();
                } else {
                    rt1 rt1Var = b5.a;
                    b5.b(8.0f, 12.0f, dt.N(-459506658, new z4(nxVar2, nxVar, null == true ? 1 : 0), dr0Var2), dr0Var2, 438);
                }
                break;
            case 2:
                dr0 dr0Var3 = (dr0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!dr0Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dr0Var3.Q();
                } else {
                    if (nxVar2 == null) {
                        dr0Var3.V(322524505);
                    } else {
                        dr0Var3.V(-266690648);
                        nxVar2.f(dr0Var3, 0);
                    }
                    dr0Var3.p(false);
                    nxVar.f(dr0Var3, 0);
                }
                break;
            default:
                dr0 dr0Var4 = (dr0) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!dr0Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    dr0Var4.Q();
                } else {
                    b5.b(x40.b, x40.c, dt.N(-1980163584, new z4(nxVar2, nxVar, b2), dr0Var4), dr0Var4, 438);
                }
                break;
        }
        return j23Var;
    }
}
