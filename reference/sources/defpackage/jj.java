package defpackage;

import android.app.PendingIntent;
import com.familymeal.app.MealPlannerApp;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jj implements kp0 {
    public final /* synthetic */ byte h = 1;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ jj(x20 x20Var, sj1 sj1Var, sj1 sj1Var2, sj1 sj1Var3, sj1 sj1Var4, MealPlannerApp mealPlannerApp) {
        this.i = x20Var;
        this.j = sj1Var;
        this.k = sj1Var2;
        this.n = mealPlannerApp;
        this.l = sj1Var3;
        this.m = sj1Var4;
    }

    @Override // defpackage.kp0
    public final Object a() throws PendingIntent.CanceledException {
        boolean z;
        byte b = this.h;
        j23 j23Var = j23.a;
        boolean z2 = true;
        Object obj = this.n;
        Object obj2 = this.m;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.i;
        switch (b) {
            case 0:
                sj1 sj1Var = (sj1) obj4;
                ((sj1) obj5).setValue(Boolean.FALSE);
                ia2.e(sj1Var, true);
                ie1.p((x20) obj6, null, new ub((MealPlannerApp) obj, (sj1) obj3, sj1Var, (sj1) obj2, (m10) null), 3);
                break;
            default:
                nb2 nb2Var = (nb2) obj6;
                hc2 hc2Var = (hc2) obj5;
                qb2 qb2Var = (qb2) obj4;
                String str = (String) obj3;
                Object[] objArr = (Object[]) obj;
                if (nb2Var.i != qb2Var) {
                    nb2Var.i = qb2Var;
                    z = true;
                } else {
                    z = false;
                }
                if (uz0.g(nb2Var.j, str)) {
                    z2 = z;
                } else {
                    nb2Var.j = str;
                }
                nb2Var.h = hc2Var;
                nb2Var.k = obj2;
                nb2Var.l = objArr;
                eg egVar = nb2Var.m;
                if (egVar != null && z2) {
                    egVar.K();
                    nb2Var.m = null;
                    nb2Var.a();
                }
                break;
        }
        return j23Var;
    }

    public /* synthetic */ jj(nb2 nb2Var, hc2 hc2Var, qb2 qb2Var, String str, Object obj, Object[] objArr) {
        this.i = nb2Var;
        this.j = hc2Var;
        this.k = qb2Var;
        this.l = str;
        this.m = obj;
        this.n = objArr;
    }
}
