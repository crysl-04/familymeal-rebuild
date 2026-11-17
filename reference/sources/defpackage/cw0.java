package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cw0 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ lw0 i;

    public /* synthetic */ cw0(lw0 lw0Var, byte b) {
        this.h = b;
        this.i = lw0Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        lw0 lw0Var = this.i;
        switch (b) {
            case 0:
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    gw2.b(wi0.h("删除「", (String) lw0Var.e.getValue(), "」？"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var, 0, 0, 262142);
                }
                break;
            case 1:
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dr0Var2.Q();
                } else {
                    boolean zH = dr0Var2.h(lw0Var);
                    Object objK = dr0Var2.K();
                    if (zH || objK == zy.a) {
                        objK = new dw0(lw0Var, (byte) 1);
                        dr0Var2.f0(objK);
                    }
                    aa3.e((kp0) objK, null, false, null, null, null, uz0.u, dr0Var2, 805306368, 510);
                }
                break;
            default:
                dr0 dr0Var3 = (dr0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!dr0Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dr0Var3.Q();
                } else {
                    gw2.b(lw0Var.c == null ? "添加食材" : "编辑食材", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var3, 0, 0, 262142);
                }
                break;
        }
        return j23Var;
    }
}
