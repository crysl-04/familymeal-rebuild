package defpackage;

import android.content.Context;
import android.net.Uri;
import com.familymeal.app.MealPlannerApp;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lj implements vp0 {
    public final /* synthetic */ byte h = 0;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ lj(x20 x20Var, sj1 sj1Var, Context context, MealPlannerApp mealPlannerApp, sj1 sj1Var2, sj1 sj1Var3) {
        this.i = x20Var;
        this.j = sj1Var;
        this.m = context;
        this.n = mealPlannerApp;
        this.k = sj1Var2;
        this.l = sj1Var3;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        j23 j23Var = j23.a;
        Object obj2 = this.n;
        Object obj3 = this.m;
        Object obj4 = this.l;
        Object obj5 = this.k;
        Object obj6 = this.j;
        Object obj7 = this.i;
        switch (b) {
            case 0:
                x20 x20Var = (x20) obj7;
                sj1 sj1Var = (sj1) obj6;
                Context context = (Context) obj3;
                MealPlannerApp mealPlannerApp = (MealPlannerApp) obj2;
                sj1 sj1Var2 = (sj1) obj5;
                sj1 sj1Var3 = (sj1) obj4;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    ia2.e(sj1Var, true);
                    ie1.p(x20Var, null, new sj(context, uri, mealPlannerApp, sj1Var2, sj1Var, sj1Var3, null), 3);
                }
                break;
            default:
                ny1[] ny1VarArr = (ny1[]) obj7;
                List list = (List) obj6;
                bf1 bf1Var = (bf1) obj5;
                v72 v72Var = (v72) obj4;
                v72 v72Var2 = (v72) obj3;
                jo joVar = (jo) obj2;
                my1 my1Var = (my1) obj;
                int length = ny1VarArr.length;
                int i = 0;
                int i2 = 0;
                while (i2 < length) {
                    ny1 ny1Var = ny1VarArr[i2];
                    ny1Var.getClass();
                    ho.d(my1Var, ny1Var, (ue1) list.get(i), bf1Var.getLayoutDirection(), v72Var.h, v72Var2.h, joVar.a);
                    i2++;
                    i++;
                }
                break;
        }
        return j23Var;
    }

    public /* synthetic */ lj(ny1[] ny1VarArr, List list, bf1 bf1Var, v72 v72Var, v72 v72Var2, jo joVar) {
        this.i = ny1VarArr;
        this.j = list;
        this.k = bf1Var;
        this.l = v72Var;
        this.m = v72Var2;
        this.n = joVar;
    }
}
