package defpackage;

import com.familymeal.app.MealPlannerApp;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hu2 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ hu2(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
        this.l = obj4;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        Object obj3 = this.l;
        Object obj4 = this.i;
        Object obj5 = this.j;
        Object obj6 = this.k;
        byte b2 = 2;
        switch (b) {
            case 0:
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    rg1 rg1VarW = s60.w(og1.h, "Container");
                    gu2 gu2Var = new gu2((sj1) obj4, sj1.class, "value", "getValue()Ljava/lang/Object;", 0);
                    y02.o((su2) obj5);
                    rg1 rg1VarL = aa3.l(rg1VarW, new qb((Object) gu2Var, obj6, (Object) c5.u, (byte) 13));
                    nx nxVar = (nx) obj3;
                    ze1 ze1VarC = ho.c(c5.i, true);
                    int iHashCode = Long.hashCode(dr0Var.T);
                    dx1 dx1VarL = dr0Var.l();
                    rg1 rg1VarU = ls.U(dr0Var, rg1VarL);
                    sy.f.getClass();
                    dr0Var.Y();
                    if (dr0Var.S) {
                        dr0Var.k(l41.W);
                    } else {
                        dr0Var.i0();
                    }
                    h12.y(c5.F, dr0Var, ze1VarC);
                    h12.y(c5.E, dr0Var, dx1VarL);
                    yx yxVar = c5.G;
                    if (dr0Var.S || !uz0.g(dr0Var.K(), Integer.valueOf(iHashCode))) {
                        wi0.o(iHashCode, dr0Var, iHashCode, yxVar);
                    }
                    h12.y(c5.D, dr0Var, rg1VarU);
                    wi0.n(0, nxVar, dr0Var, true);
                }
                break;
            default:
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                String str = (String) obj6;
                MealPlannerApp mealPlannerApp = (MealPlannerApp) obj5;
                x20 x20Var = (x20) obj4;
                t63 t63Var = (t63) obj3;
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dr0Var2.Q();
                } else {
                    boolean zH = dr0Var2.h(x20Var) | dr0Var2.h(mealPlannerApp) | dr0Var2.f(str) | dr0Var2.h(t63Var);
                    Object objK = dr0Var2.K();
                    if (zH || objK == zy.a) {
                        objK = new f73(x20Var, mealPlannerApp, str, t63Var);
                        dr0Var2.f0(objK);
                    }
                    cu.e((kp0) objK, null, false, null, null, dt.N(1563668306, new e73(t63Var, b2), dr0Var2), dr0Var2, 1572864, 62);
                }
                break;
        }
        return j23Var;
    }
}
