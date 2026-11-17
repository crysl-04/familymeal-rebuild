package defpackage;

import com.familymeal.app.MealPlannerApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hd2 implements aq0 {
    public final /* synthetic */ p60 h;
    public final /* synthetic */ sj1 i;
    public final /* synthetic */ x20 j;
    public final /* synthetic */ MealPlannerApp k;
    public final /* synthetic */ sj1 l;

    public hd2(p60 p60Var, sj1 sj1Var, x20 x20Var, MealPlannerApp mealPlannerApp, sj1 sj1Var2) {
        this.h = p60Var;
        this.i = sj1Var;
        this.j = x20Var;
        this.k = mealPlannerApp;
        this.l = sj1Var2;
    }

    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        Set set;
        dr0 dr0Var = (dr0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((bw) obj).getClass();
        if (dr0Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
            og1 og1Var = og1.h;
            rg1 rg1VarG = t03.G(og1Var, 12.0f);
            aw awVarA = yv.a(new ah(4.0f, new wg((byte) 0)), c5.u, dr0Var, 6);
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            rg1 rg1VarU = ls.U(dr0Var, rg1VarG);
            sy.f.getClass();
            dr0Var.Y();
            if (dr0Var.S) {
                dr0Var.k(l41.W);
            } else {
                dr0Var.i0();
            }
            h12.y(c5.F, dr0Var, awVarA);
            h12.y(c5.E, dr0Var, dx1VarL);
            h12.y(c5.G, dr0Var, Integer.valueOf(iHashCode));
            h12.t(dr0Var);
            h12.y(c5.D, dr0Var, rg1VarU);
            p60 p60Var = this.h;
            String str = p60Var.i;
            xw2 xw2Var = ((c13) dr0Var.j(e13.a)).h;
            Object objK = dr0Var.K();
            yy yyVar = zy.a;
            if (objK == yyVar) {
                objK = z9.o;
                dr0Var.f0(objK);
            }
            yy yyVar2 = yyVar;
            gw2.b(str, tg2.a(og1Var, false, (vp0) objK), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, xw2Var, dr0Var, 0, 0, 131068);
            dr0 dr0Var2 = dr0Var;
            dr0Var2.V(-1259431192);
            for (te1 te1Var : te1.o) {
                Set setU0 = dv.U0(((ed2) this.l.getValue()).a(p60Var, te1Var));
                dr0 dr0Var3 = dr0Var2;
                p60 p60Var2 = p60Var;
                gw2.b(te1Var.i + "（" + setU0.size() + " 人）", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var2.j(e13.a)).m, dr0Var3, 0, 0, 131070);
                dr0Var2 = dr0Var3;
                sj1 sj1Var = this.i;
                List list = (List) sj1Var.getValue();
                ArrayList arrayList = new ArrayList(ev.o0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((dy1) it.next()).a);
                }
                boolean zF = dr0Var2.f(sj1Var);
                Object objK2 = dr0Var2.K();
                yy yyVar3 = yyVar2;
                if (zF || objK2 == yyVar3) {
                    objK2 = new aa(sj1Var, (byte) 2);
                    dr0Var2.f0(objK2);
                }
                vp0 vp0Var = (vp0) objK2;
                x20 x20Var = this.j;
                boolean zH = dr0Var2.h(x20Var);
                MealPlannerApp mealPlannerApp = this.k;
                boolean zH2 = zH | dr0Var2.h(mealPlannerApp) | dr0Var2.d(p60Var2.ordinal()) | dr0Var2.d(te1Var.ordinal()) | dr0Var2.h(setU0);
                Object objK3 = dr0Var2.K();
                if (zH2 || objK3 == yyVar3) {
                    set = setU0;
                    gd2 gd2Var = new gd2(x20Var, mealPlannerApp, p60Var2, te1Var, set);
                    dr0Var2.f0(gd2Var);
                    objK3 = gd2Var;
                } else {
                    set = setU0;
                }
                aa3.b(arrayList, set, vp0Var, (vp0) objK3, null, dr0Var2, 0, 16);
                yyVar2 = yyVar3;
                p60Var = p60Var2;
            }
            dr0Var2.p(false);
            dr0Var2.p(true);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
