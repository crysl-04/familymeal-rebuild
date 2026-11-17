package defpackage;

import com.familymeal.app.MealPlannerApp;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jd2 implements bq0 {
    public final /* synthetic */ lh0 h;
    public final /* synthetic */ sj1 i;
    public final /* synthetic */ x20 j;
    public final /* synthetic */ MealPlannerApp k;
    public final /* synthetic */ sj1 l;

    public jd2(lh0 lh0Var, sj1 sj1Var, x20 x20Var, MealPlannerApp mealPlannerApp, sj1 sj1Var2) {
        this.h = lh0Var;
        this.i = sj1Var;
        this.j = x20Var;
        this.k = mealPlannerApp;
        this.l = sj1Var2;
    }

    @Override // defpackage.bq0
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g61 g61Var = (g61) obj;
        int iIntValue = ((Number) obj2).intValue();
        dr0 dr0Var = (dr0) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (dr0Var.f(g61Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= dr0Var.d(iIntValue) ? 32 : 16;
        }
        if (dr0Var.N(i & 1, (i & 147) != 146)) {
            p60 p60Var = (p60) this.h.get(iIntValue);
            dr0Var.V(-2093657225);
            t03.d(yj2.a, null, null, null, dt.N(1260568542, new hd2(p60Var, this.i, this.j, this.k, this.l), dr0Var), dr0Var, 196614);
            dr0Var.p(false);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
