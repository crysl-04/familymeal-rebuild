package defpackage;

import android.content.Context;
import com.familymeal.app.MealPlannerApp;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v9 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ v9(x20 x20Var, MealPlannerApp mealPlannerApp, String str, sj1 sj1Var, sj1 sj1Var2) {
        this.h = (byte) 4;
        this.i = x20Var;
        this.j = mealPlannerApp;
        this.l = str;
        this.k = sj1Var;
        this.m = sj1Var2;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        j23 j23Var = j23.a;
        Object obj = this.m;
        Object obj2 = this.k;
        Object obj3 = this.l;
        Object obj4 = this.j;
        Object obj5 = this.i;
        switch (b) {
            case 0:
                ((m12) obj5).o((kp0) obj4, (p12) obj2, (String) obj3, (u31) obj);
                return j23Var;
            case 1:
                Locale locale = (Locale) obj3;
                sj1 sj1Var = (sj1) obj;
                return rz1.x(((vv2) sj1Var.getValue()).a.i.length() > 0 ? ((r40) obj5).a(((hq) obj4).e(((vv2) sj1Var.getValue()).a.i, ((k40) obj2).c, locale), locale) : "");
            case 2:
                return new o60((Long) obj5, (Long) obj4, (qy0) obj2, 0, (vf2) obj3, (Locale) obj);
            case 3:
                sj1 sj1Var2 = (sj1) obj4;
                sj1 sj1Var3 = (sj1) obj2;
                sj1Var2.setValue(Boolean.TRUE);
                sj1Var3.setValue(null);
                ie1.p((x20) obj5, null, new a9((Context) obj3, (sj1) obj, sj1Var3, sj1Var2, null, (byte) 4), 3);
                return j23Var;
            default:
                ie1.p((x20) obj5, null, new if2((MealPlannerApp) obj4, (String) obj3, (sj1) obj2, (sj1) obj, null), 3);
                return j23Var;
        }
    }

    public /* synthetic */ v9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
        this.l = obj4;
        this.m = obj5;
    }
}
