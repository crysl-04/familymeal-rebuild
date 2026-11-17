package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xx1 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ ay1 i;

    public /* synthetic */ xx1(ay1 ay1Var, byte b) {
        this.h = b;
        this.i = ay1Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        ay1 ay1Var = this.i;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                h7.T(ay1Var, (dr0) obj, m02.A(1));
                break;
            case 1:
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    gw2.b(wi0.h("删除「", (String) ay1Var.g.getValue(), "」？"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var, 0, 0, 262142);
                }
                break;
            case 2:
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dr0Var2.Q();
                } else {
                    gw2.b(ay1Var.d == null ? "添加家人" : "编辑家人", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var2, 0, 0, 262142);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                h7.L(ay1Var, (dr0) obj, m02.A(1));
                break;
        }
        return j23Var;
    }

    public /* synthetic */ xx1(ay1 ay1Var, int i, byte b) {
        this.h = b;
        this.i = ay1Var;
    }
}
