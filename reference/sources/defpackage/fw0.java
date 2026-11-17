package defpackage;

import com.familymeal.app.MealPlannerApp;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fw0 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ MealPlannerApp i;
    public final /* synthetic */ String j;

    public /* synthetic */ fw0(MealPlannerApp mealPlannerApp, String str, byte b) {
        this.h = b;
        this.i = mealPlannerApp;
        this.j = str;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        String str = this.j;
        MealPlannerApp mealPlannerApp = this.i;
        e30 e30Var = (e30) obj;
        switch (b) {
            case 0:
                e30Var.getClass();
                return new lw0(mealPlannerApp.b(), str);
            case 1:
                e30Var.getClass();
                return new ay1(mealPlannerApp.c(), mealPlannerApp.b(), str);
            default:
                e30Var.getClass();
                return new x62(mealPlannerApp.b(), str);
        }
    }
}
