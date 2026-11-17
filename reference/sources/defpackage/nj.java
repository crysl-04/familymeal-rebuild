package defpackage;

import android.content.Context;
import com.familymeal.app.MealPlannerApp;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nj implements zp0 {
    public final /* synthetic */ byte h = 1;
    public final /* synthetic */ x20 i;
    public final /* synthetic */ MealPlannerApp j;
    public final /* synthetic */ sj1 k;
    public final /* synthetic */ sj1 l;
    public final /* synthetic */ sj1 m;
    public final /* synthetic */ sj1 n;
    public final /* synthetic */ Object o;

    public /* synthetic */ nj(hk hkVar, x20 x20Var, sj1 sj1Var, sj1 sj1Var2, sj1 sj1Var3, sj1 sj1Var4, MealPlannerApp mealPlannerApp) {
        this.o = hkVar;
        this.i = x20Var;
        this.j = mealPlannerApp;
        this.k = sj1Var;
        this.l = sj1Var2;
        this.m = sj1Var3;
        this.n = sj1Var4;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        yy yyVar = zy.a;
        Object obj3 = this.o;
        switch (b) {
            case 0:
                Context context = (Context) obj3;
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    x20 x20Var = this.i;
                    boolean zH = dr0Var.h(x20Var);
                    MealPlannerApp mealPlannerApp = this.j;
                    boolean zH2 = zH | dr0Var.h(mealPlannerApp);
                    sj1 sj1Var = this.k;
                    boolean zF = zH2 | dr0Var.f(sj1Var) | dr0Var.h(context);
                    Object objK = dr0Var.K();
                    if (zF || objK == yyVar) {
                        oj ojVar = new oj(x20Var, this.l, this.m, sj1Var, this.n, context, mealPlannerApp);
                        dr0Var.f0(ojVar);
                        objK = ojVar;
                    }
                    aa3.e((kp0) objK, null, false, null, null, null, t03.f, dr0Var, 805306368, 510);
                }
                break;
            default:
                hk hkVar = (hk) obj3;
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dr0Var2.Q();
                } else {
                    boolean zH3 = dr0Var2.h(hkVar);
                    x20 x20Var2 = this.i;
                    boolean zH4 = zH3 | dr0Var2.h(x20Var2);
                    MealPlannerApp mealPlannerApp2 = this.j;
                    boolean zH5 = zH4 | dr0Var2.h(mealPlannerApp2);
                    Object objK2 = dr0Var2.K();
                    if (zH5 || objK2 == yyVar) {
                        oj ojVar2 = new oj(hkVar, x20Var2, this.k, this.l, this.m, this.n, mealPlannerApp2);
                        dr0Var2.f0(ojVar2);
                        objK2 = ojVar2;
                    }
                    aa3.e((kp0) objK2, null, false, null, null, null, t03.i, dr0Var2, 805306368, 510);
                }
                break;
        }
        return j23Var;
    }

    public /* synthetic */ nj(x20 x20Var, sj1 sj1Var, sj1 sj1Var2, sj1 sj1Var3, sj1 sj1Var4, Context context, MealPlannerApp mealPlannerApp) {
        this.i = x20Var;
        this.j = mealPlannerApp;
        this.k = sj1Var;
        this.o = context;
        this.l = sj1Var2;
        this.m = sj1Var3;
        this.n = sj1Var4;
    }
}
