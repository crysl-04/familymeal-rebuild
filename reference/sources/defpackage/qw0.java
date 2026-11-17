package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qw0 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ uv0 i;

    public /* synthetic */ qw0(uv0 uv0Var, byte b) {
        this.h = b;
        this.i = uv0Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        uv0 uv0Var = this.i;
        switch (b) {
            case 0:
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    gw2.b(uv0Var.b, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var, 0, 0, 262142);
                }
                break;
            case 1:
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dr0Var2.Q();
                } else {
                    bp1 bp1Var = uv0Var.d;
                    String strT = t03.t(0, bp1Var.a);
                    String strT2 = t03.t(1, bp1Var.b);
                    String strT3 = t03.t(1, bp1Var.c);
                    String strT4 = t03.t(1, bp1Var.d);
                    StringBuilder sbL = wi0.l("每100g ", strT, " kcal · 蛋白 ", strT2, "g · 脂肪 ");
                    sbL.append(strT3);
                    sbL.append("g · 碳水 ");
                    sbL.append(strT4);
                    sbL.append("g");
                    gw2.b(sbL.toString(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var2, 0, 0, 262142);
                }
                break;
            case 2:
                dr0 dr0Var3 = (dr0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!dr0Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dr0Var3.Q();
                } else {
                    gw2.b(uv0Var.b, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var3, 0, 0, 262142);
                }
                break;
            default:
                dr0 dr0Var4 = (dr0) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!dr0Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    dr0Var4.Q();
                } else {
                    gw2.b(uv0Var.c + " · 每100g " + t03.t(0, uv0Var.d.a) + " kcal", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var4, 0, 0, 262142);
                }
                break;
        }
        return j23Var;
    }
}
