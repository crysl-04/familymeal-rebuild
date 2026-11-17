package defpackage;

import android.content.Context;
import com.familymeal.app.MealPlannerApp;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oj implements kp0 {
    public final /* synthetic */ byte h = 1;
    public final /* synthetic */ x20 i;
    public final /* synthetic */ sj1 j;
    public final /* synthetic */ sj1 k;
    public final /* synthetic */ MealPlannerApp l;
    public final /* synthetic */ sj1 m;
    public final /* synthetic */ sj1 n;
    public final /* synthetic */ Object o;

    public /* synthetic */ oj(hk hkVar, x20 x20Var, sj1 sj1Var, sj1 sj1Var2, sj1 sj1Var3, sj1 sj1Var4, MealPlannerApp mealPlannerApp) {
        this.o = hkVar;
        this.i = x20Var;
        this.j = sj1Var;
        this.k = sj1Var2;
        this.l = mealPlannerApp;
        this.m = sj1Var3;
        this.n = sj1Var4;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        j23 j23Var = j23.a;
        sj1 sj1Var = this.j;
        x20 x20Var = this.i;
        Object obj = this.o;
        switch (b) {
            case 0:
                sj1Var.setValue(Boolean.FALSE);
                sj1 sj1Var2 = this.k;
                ia2.e(sj1Var2, true);
                ie1.p(x20Var, null, new a9((Context) obj, this.l, this.m, this.n, sj1Var2, null, (byte) 1), 3);
                break;
            default:
                gk gkVar = ((hk) obj).a;
                sj1Var.setValue(null);
                sj1 sj1Var3 = this.k;
                ia2.e(sj1Var3, true);
                ie1.p(x20Var, null, new pj(this.l, gkVar, this.m, sj1Var3, this.n, null), 3);
                break;
        }
        return j23Var;
    }

    public /* synthetic */ oj(x20 x20Var, sj1 sj1Var, sj1 sj1Var2, sj1 sj1Var3, sj1 sj1Var4, Context context, MealPlannerApp mealPlannerApp) {
        this.i = x20Var;
        this.j = sj1Var;
        this.k = sj1Var2;
        this.o = context;
        this.l = mealPlannerApp;
        this.m = sj1Var3;
        this.n = sj1Var4;
    }
}
