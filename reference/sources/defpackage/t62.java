package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t62 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ x62 i;

    public /* synthetic */ t62(x62 x62Var, int i) {
        this.h = (byte) 1;
        this.i = x62Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        x62 x62Var = this.i;
        switch (b) {
            case 0:
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    gw2.b(x62Var.c == null ? "添加菜谱" : "编辑菜谱", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var, 0, 0, 262142);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                v62.b(x62Var, (dr0) obj, m02.A(1));
                break;
            default:
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dr0Var2.Q();
                } else {
                    gw2.b(wi0.h("删除「", (String) x62Var.e.getValue(), "」？"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var2, 0, 0, 262142);
                }
                break;
        }
        return j23Var;
    }

    public /* synthetic */ t62(x62 x62Var, byte b) {
        this.h = b;
        this.i = x62Var;
    }
}
