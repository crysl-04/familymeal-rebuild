package defpackage;

import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class e73 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ t63 i;

    public /* synthetic */ e73(t63 t63Var, byte b) {
        this.h = b;
        this.i = t63Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        t63 t63Var = this.i;
        switch (b) {
            case 0:
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    gw2.b(t03.t(1, t63Var.b).concat(" kg"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var, 0, 0, 262142);
                }
                break;
            case 1:
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dr0Var2.Q();
                } else {
                    LocalDate localDate = t63Var.a;
                    gw2.b(localDate.getMonthValue() + "月" + localDate.getDayOfMonth() + "日（" + localDate.getYear() + "）", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var2, 0, 0, 262142);
                }
                break;
            default:
                dr0 dr0Var3 = (dr0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!dr0Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dr0Var3.Q();
                } else {
                    eu0.a(es.J(), "删除 " + t63Var.a + " 的记录", null, 0L, dr0Var3, 0, 12);
                }
                break;
        }
        return j23Var;
    }
}
