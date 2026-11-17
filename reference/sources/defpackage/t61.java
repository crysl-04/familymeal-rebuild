package defpackage;

import android.os.Build;
import android.view.View;
import com.familymeal.app.MealPlannerApp;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t61 implements aq0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ t61(zp0 zp0Var, f10 f10Var, aq0 aq0Var, kp0 kp0Var) {
        this.h = (byte) 3;
        this.j = zp0Var;
        this.k = f10Var;
        this.l = aq0Var;
        this.i = kp0Var;
    }

    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        rg1 rg1VarC;
        Object obj4;
        boolean z;
        boolean z2;
        Object objL;
        byte b = this.h;
        byte b2 = 16;
        byte b3 = 10;
        byte b4 = 18;
        j23 j23Var = j23.a;
        byte b5 = 4;
        yy yyVar = zy.a;
        Object obj5 = this.i;
        Object obj6 = this.l;
        Object obj7 = this.k;
        Object obj8 = this.j;
        switch (b) {
            case 0:
                d71 d71Var = (d71) obj8;
                rg1 rg1Var = (rg1) obj7;
                u61 u61Var = (u61) obj6;
                sj1 sj1Var = (sj1) obj5;
                ob2 ob2Var = (ob2) obj;
                dr0 dr0Var = (dr0) obj2;
                ((Integer) obj3).getClass();
                Object objK = dr0Var.K();
                Object obj9 = objK;
                if (objK == yyVar) {
                    r61 r61Var = new r61(ob2Var, new bb(sj1Var, b2));
                    dr0Var.f0(r61Var);
                    obj9 = r61Var;
                }
                r61 r61Var2 = (r61) obj9;
                Object objK2 = dr0Var.K();
                Object obj10 = objK2;
                if (objK2 == yyVar) {
                    zo2 zo2Var = new zo2(new ix0(r61Var2));
                    dr0Var.f0(zo2Var);
                    obj10 = zo2Var;
                }
                zo2 zo2Var2 = (zo2) obj10;
                if (d71Var != null) {
                    dr0Var.V(1743490539);
                    dr0Var.V(887527095);
                    String str = Build.FINGERPRINT;
                    if (str == null || !str.equals("robolectric")) {
                        dr0Var.V(1345729441);
                        View view = (View) dr0Var.j(i7.f);
                        boolean zF = dr0Var.f(view);
                        Object objK3 = dr0Var.K();
                        if (zF || objK3 == yyVar) {
                            Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                            c22 faVar = tag instanceof c22 ? (c22) tag : null;
                            if (faVar == null) {
                                faVar = new fa(view);
                                view.setTag(R.id.compose_prefetch_scheduler, faVar);
                            }
                            objK3 = faVar;
                            dr0Var.f0(objK3);
                        }
                        obj4 = (c22) objK3;
                        z = false;
                        dr0Var.p(false);
                    } else {
                        dr0Var.V(1345548711);
                        Object objK4 = dr0Var.K();
                        if (objK4 == yyVar) {
                            objK4 = new d22();
                            dr0Var.f0(objK4);
                        }
                        obj4 = (d22) objK4;
                        z = false;
                        dr0Var.p(false);
                    }
                    dr0Var.p(z);
                    Object[] objArr = {d71Var, r61Var2, zo2Var2, obj4};
                    boolean zF2 = dr0Var.f(d71Var) | dr0Var.h(r61Var2) | dr0Var.h(zo2Var2) | dr0Var.h(obj4);
                    Object objK5 = dr0Var.K();
                    if (zF2 || objK5 == yyVar) {
                        b20 b20Var = new b20((Object) d71Var, (Object) r61Var2, (Object) zo2Var2, obj4, (byte) 3);
                        dr0Var.f0(b20Var);
                        objK5 = b20Var;
                    }
                    vp0 vp0Var = (vp0) objK5;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
                    boolean zD = dr0Var.d(objArrCopyOf.length);
                    for (Object obj11 : objArrCopyOf) {
                        zD |= dr0Var.f(obj11);
                    }
                    Object objK6 = dr0Var.K();
                    if (zD || objK6 == yyVar) {
                        dr0Var.f0(new fb0(vp0Var));
                    }
                    dr0Var.p(false);
                } else {
                    dr0Var.V(1744076749);
                    dr0Var.p(false);
                }
                int i = e71.a;
                if (d71Var != null && (rg1VarC = rg1Var.c(new zz2(d71Var))) != null) {
                    rg1Var = rg1VarC;
                }
                boolean zF3 = dr0Var.f(r61Var2) | dr0Var.f(u61Var);
                Object objK7 = dr0Var.K();
                Object obj12 = objK7;
                if (zF3 || objK7 == yyVar) {
                    j7 j7Var = new j7(r61Var2, u61Var, b4);
                    dr0Var.f0(j7Var);
                    obj12 = j7Var;
                }
                tz0.f(zo2Var2, rg1Var, (zp0) obj12, dr0Var, 8);
                return j23Var;
            case 1:
                sj1 sj1Var2 = (sj1) obj5;
                sj1 sj1Var3 = (sj1) obj8;
                x20 x20Var = (x20) obj7;
                MealPlannerApp mealPlannerApp = (MealPlannerApp) obj6;
                pt1 pt1Var = (pt1) obj;
                dr0 dr0Var2 = (dr0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                pt1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dr0Var2.f(pt1Var) ? (byte) 4 : (byte) 2;
                }
                if (dr0Var2.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    rg1 rg1VarH = t03.H(t03.F(yj2.b, pt1Var), 16.0f, 0.0f, 2);
                    ah ahVar = new ah(12.0f, new wg((byte) 0));
                    boolean zF4 = dr0Var2.f(sj1Var2) | dr0Var2.f(sj1Var3) | dr0Var2.h(x20Var) | dr0Var2.h(mealPlannerApp);
                    Object objK8 = dr0Var2.K();
                    if (zF4 || objK8 == yyVar) {
                        b20 b20Var2 = new b20((Object) sj1Var3, (Object) x20Var, (Object) mealPlannerApp, (Object) sj1Var2, (byte) 6);
                        dr0Var2.f0(b20Var2);
                        objK8 = b20Var2;
                    }
                    cu.h(rg1VarH, null, null, ahVar, null, null, false, null, (vp0) objK8, dr0Var2, 24576, 494);
                } else {
                    dr0Var2.Q();
                }
                return j23Var;
            case 2:
                List list = (List) obj8;
                Set set = (Set) obj7;
                vp0 vp0Var2 = (vp0) obj6;
                vp0 vp0Var3 = (vp0) obj5;
                dr0 dr0Var3 = (dr0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((pl0) obj).getClass();
                if (dr0Var3.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    for (Object obj13 : list) {
                        boolean zContains = set.contains(obj13);
                        boolean zF5 = dr0Var3.f(vp0Var2) | dr0Var3.h(obj13);
                        Object objK9 = dr0Var3.K();
                        if (zF5 || objK9 == yyVar) {
                            objK9 = new h6(vp0Var2, obj13, b3);
                            dr0Var3.f0(objK9);
                        }
                        wt.b(zContains, (kp0) objK9, dt.N(-1352231614, new j7(vp0Var3, obj13, b5), dr0Var3), null, false, null, null, null, null, dr0Var3, 384);
                    }
                } else {
                    dr0Var3.Q();
                }
                return j23Var;
            case 3:
                zp0 zp0Var = (zp0) obj8;
                f10 f10Var = (f10) obj7;
                aq0 aq0Var = (aq0) obj6;
                kp0 kp0Var = (kp0) obj5;
                e10 e10Var = (e10) obj;
                dr0 dr0Var4 = (dr0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= dr0Var4.f(e10Var) ? 4 : 2;
                }
                if (dr0Var4.N(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    String str2 = (String) zp0Var.f(dr0Var4, 0);
                    if (co2.X(str2)) {
                        dx0.c("Label must not be blank");
                    }
                    f10Var.getClass();
                    h7.q.n(str2, Boolean.TRUE, e10Var, aq0Var, kp0Var, dr0Var4, Integer.valueOf((iIntValue3 << 9) & 7168));
                } else {
                    dr0Var4.Q();
                }
                return j23Var;
            default:
                rl2 rl2Var = (rl2) obj8;
                p81 p81Var = (p81) obj7;
                vv2 vv2Var = (vv2) obj6;
                xp1 xp1Var = (xp1) obj5;
                rg1 rg1Var2 = (rg1) obj;
                dr0 dr0Var5 = (dr0) obj2;
                ((Integer) obj3).getClass();
                dr0Var5.V(-84507373);
                boolean zBooleanValue = ((Boolean) dr0Var5.j(uz.y)).booleanValue();
                boolean zG = dr0Var5.g(zBooleanValue);
                Object objK10 = dr0Var5.K();
                if (zG || objK10 == yyVar) {
                    objK10 = new q30(zBooleanValue);
                    dr0Var5.f0(objK10);
                }
                q30 q30Var = (q30) objK10;
                boolean z3 = rl2Var.a != 16;
                if (((i81) ((k73) dr0Var5.j(uz.u))).a() && p81Var.b() && qw2.c(vv2Var.b) && z3) {
                    dr0Var5.V(-707487962);
                    od odVar = vv2Var.a;
                    qw2 qw2Var = new qw2(vv2Var.b);
                    boolean zH = dr0Var5.h(q30Var);
                    Object objK11 = dr0Var5.K();
                    if (zH || objK11 == yyVar) {
                        objK11 = new qj(q30Var, false ? 1 : 0, b3);
                        dr0Var5.f0(objK11);
                    }
                    h7.K(odVar, qw2Var, (zp0) objK11, dr0Var5);
                    boolean zH2 = dr0Var5.h(q30Var) | dr0Var5.h(xp1Var) | dr0Var5.f(vv2Var) | dr0Var5.h(p81Var) | dr0Var5.f(rl2Var);
                    Object objK12 = dr0Var5.K();
                    if (zH2 || objK12 == yyVar) {
                        u3 u3Var = new u3(q30Var, xp1Var, vv2Var, p81Var, rl2Var, (byte) 6);
                        dr0Var5.f0(u3Var);
                        objK12 = u3Var;
                    }
                    objL = aa3.l(rg1Var2, (vp0) objK12);
                    z2 = false;
                    dr0Var5.p(false);
                } else {
                    z2 = false;
                    dr0Var5.V(-705473241);
                    dr0Var5.p(false);
                    objL = og1.h;
                }
                dr0Var5.p(z2);
                return objL;
        }
    }

    public /* synthetic */ t61(sj1 sj1Var, sj1 sj1Var2, x20 x20Var, MealPlannerApp mealPlannerApp) {
        this.h = (byte) 1;
        this.i = sj1Var;
        this.j = sj1Var2;
        this.k = x20Var;
        this.l = mealPlannerApp;
    }

    public /* synthetic */ t61(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.h = b;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
        this.i = obj4;
    }
}
