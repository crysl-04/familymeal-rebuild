package defpackage;

import com.familymeal.app.MealPlannerApp;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class k63 implements bq0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ List i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ k63(List list, Object obj, Object obj2, Object obj3, byte b) {
        this.h = b;
        this.i = list;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
    }

    @Override // defpackage.bq0
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.h;
        j23 j23Var = j23.a;
        Object obj5 = this.l;
        Object obj6 = this.k;
        Object obj7 = this.j;
        List list = this.i;
        byte b2 = 1;
        byte b3 = 0;
        switch (b) {
            case 0:
                g61 g61Var = (g61) obj;
                int iIntValue = ((Number) obj2).intValue();
                dr0 dr0Var = (dr0) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i = (iIntValue2 & 6) == 0 ? (dr0Var.f(g61Var) ? 4 : 2) | iIntValue2 : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i |= dr0Var.d(iIntValue) ? 32 : 16;
                }
                if (!dr0Var.N(i & 1, (i & 147) != 146)) {
                    dr0Var.Q();
                } else {
                    p60 p60Var = (p60) ((lh0) list).get(iIntValue);
                    dr0Var.V(604701593);
                    t03.d(yj2.a, null, null, null, dt.N(-1201424933, new j63(p60Var, (ez1) obj7, (p63) obj6, (sj1) obj5), dr0Var), dr0Var, 196614);
                    dr0Var.p(false);
                }
                break;
            default:
                g61 g61Var2 = (g61) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dr0 dr0Var2 = (dr0) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i2 = (iIntValue4 & 6) == 0 ? (dr0Var2.f(g61Var2) ? 4 : 2) | iIntValue4 : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i2 |= dr0Var2.d(iIntValue3) ? 32 : 16;
                }
                if (!dr0Var2.N(i2 & 1, (i2 & 147) != 146)) {
                    dr0Var2.Q();
                } else {
                    t63 t63Var = (t63) list.get(iIntValue3);
                    dr0Var2.V(388082644);
                    cu.k(dt.N(-236027601, new e73(t63Var, b3), dr0Var2), null, dt.N(-1767387470, new e73(t63Var, b2), dr0Var2), dt.N(-1356638284, new hu2((x20) obj7, (MealPlannerApp) obj6, (String) obj5, t63Var, (byte) 1), dr0Var2), null, dr0Var2, 199686, 470);
                    ie1.c(null, 0.0f, 0L, dr0Var2, 0, 7);
                    dr0Var2.p(false);
                }
                break;
        }
        return j23Var;
    }
}
