package defpackage;

import android.content.Context;
import com.familymeal.app.MealPlannerApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class v62 {
    public static final List a = lt.Q(new wt1("fish_whole", "整条鱼（需 3 人以上用餐）"), new wt1("fish_portion", "可按份购买的鱼（如三文鱼）"), new wt1("shrimp", "虾"));

    public static final void a(ArrayList arrayList, vp0 vp0Var, kp0 kp0Var, dr0 dr0Var, int i) {
        dr0Var.W(854666752);
        int i2 = i | (dr0Var.f(arrayList) ? 4 : 2) | (dr0Var.h(vp0Var) ? 32 : 16) | (dr0Var.h(kp0Var) ? 256 : 128);
        if (dr0Var.N(i2 & 1, (i2 & 147) != 146)) {
            Object[] objArr = new Object[0];
            Object objK = dr0Var.K();
            if (objK == zy.a) {
                objK = new n62((byte) 5);
                dr0Var.f0(objK);
            }
            sj1 sj1Var = (sj1) rz1.z(objArr, (kp0) objK, dr0Var, 48);
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                uv0 uv0Var = (uv0) obj;
                if (co2.X((String) sj1Var.getValue()) || co2.Q(uv0Var.b, co2.g0((String) sj1Var.getValue()).toString(), false) || co2.Q(uv0Var.c, co2.g0((String) sj1Var.getValue()).toString(), false)) {
                    arrayList2.add(obj);
                }
            }
            uz0.a(kp0Var, dt.N(-836096840, new gw0(kp0Var, (byte) 4), dr0Var), null, null, h7.A, dt.N(1562752979, new s62(sj1Var, dv.M0(arrayList2, new mm0((byte) 9)), vp0Var, (byte) 0), dr0Var), null, 0L, 0L, 0L, 0L, null, dr0Var, ((i2 >> 6) & 14) | 1769520, 16284);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new s62(arrayList, vp0Var, kp0Var, i);
        }
    }

    public static final void b(x62 x62Var, dr0 dr0Var, int i) {
        dr0 dr0Var2;
        dr0Var.W(-1931529332);
        int i2 = (dr0Var.h(x62Var) ? 4 : 2) | i;
        int iIntValue = 1;
        if (dr0Var.N(i2 & 1, (i2 & 3) != 2)) {
            b82 b82Var = bh0.a;
            List listE = x62Var.e();
            ArrayList arrayList = new ArrayList();
            Iterator it = listE.iterator();
            while (true) {
                z62 z62Var = null;
                if (!it.hasNext()) {
                    break;
                }
                w62 w62Var = (w62) it.next();
                Double dK = t03.K(w62Var.b);
                if (dK != null) {
                    z62Var = new z62(w62Var.a, dK.doubleValue());
                }
                if (z62Var != null) {
                    arrayList.add(z62Var);
                }
            }
            bp1 bp1VarA = bh0.a(arrayList, (Map) x62Var.o.getValue());
            Integer numO = jo2.O((String) x62Var.i.getValue());
            if (numO != null) {
                Integer num = numO.intValue() >= 1 ? numO : null;
                if (num != null) {
                    iIntValue = num.intValue();
                }
            }
            dr0Var2 = dr0Var;
            t03.d(yj2.a, null, null, null, dt.N(-582489090, new uw1(bp1VarA, iIntValue, bp1VarA.c(1.0d / ((double) iIntValue)), x62Var), dr0Var), dr0Var2, 196614);
        } else {
            dr0Var2 = dr0Var;
            dr0Var2.Q();
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new t62(x62Var, i);
        }
    }

    public static final void c(String str, kp0 kp0Var, dr0 dr0Var, int i) {
        boolean z;
        dr0 dr0Var2 = dr0Var;
        kp0Var.getClass();
        dr0Var2.W(2018440513);
        int i2 = i | (dr0Var2.f(str) ? 4 : 2) | (dr0Var2.h(kp0Var) ? 32 : 16);
        byte b = 0;
        if (dr0Var2.N(i2 & 1, (i2 & 19) != 18)) {
            Context applicationContext = ((Context) dr0Var2.j(i7.b)).getApplicationContext();
            applicationContext.getClass();
            MealPlannerApp mealPlannerApp = (MealPlannerApp) applicationContext;
            String strJ = jp1.j("recipe_", str);
            boolean zH = dr0Var2.h(mealPlannerApp) | ((i2 & 14) == 4);
            Object objK = dr0Var2.K();
            yy yyVar = zy.a;
            if (zH || objK == yyVar) {
                objK = new fw0(mealPlannerApp, str, (byte) 2);
                dr0Var2.f0(objK);
            }
            vp0 vp0Var = (vp0) objK;
            h53 h53VarA = sb1.a(dr0Var2);
            if (h53VarA == null) {
                li1.g("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            du duVarA = z72.a(x62.class);
            vw0 vw0Var = new vw0((byte) 0);
            vw0Var.a(z72.a(x62.class), vp0Var);
            x62 x62Var = (x62) h12.D(duVarA, h53VarA, strJ, vw0Var.b(), cy1.z(h53VarA), dr0Var2);
            Object[] objArr = new Object[0];
            Object objK2 = dr0Var2.K();
            if (objK2 == yyVar) {
                objK2 = new n62((byte) 3);
                dr0Var2.f0(objK2);
            }
            sj1 sj1Var = (sj1) rz1.z(objArr, (kp0) objK2, dr0Var2, 48);
            Object[] objArr2 = new Object[0];
            Object objK3 = dr0Var2.K();
            if (objK3 == yyVar) {
                objK3 = new n62((byte) 4);
                dr0Var2.f0(objK3);
            }
            sj1 sj1Var2 = (sj1) rz1.z(objArr2, (kp0) objK3, dr0Var2, 48);
            Boolean bool = (Boolean) x62Var.r.getValue();
            bool.booleanValue();
            boolean zH2 = dr0Var2.h(x62Var) | ((i2 & 112) == 32);
            Object objK4 = dr0Var2.K();
            if (zH2 || objK4 == yyVar) {
                objK4 = new rj(x62Var, kp0Var, null, (byte) 6);
                dr0Var2.f0(objK4);
            }
            h7.J((zp0) objK4, dr0Var2, bool);
            cy1.a(null, dt.N(634738693, new s62((z43) x62Var, kp0Var, sj1Var2, (byte) 11), dr0Var2), null, null, null, 0, 0L, 0L, null, dt.N(-1079130800, new r62(x62Var, sj1Var, b), dr0Var2), dr0Var2, 805306416, 509);
            if (((Boolean) sj1Var.getValue()).booleanValue()) {
                dr0Var2.V(-1603747182);
                Collection collectionValues = ((Map) x62Var.o.getValue()).values();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionValues) {
                    uv0 uv0Var = (uv0) obj;
                    List listE = x62Var.e();
                    if (listE == null || !listE.isEmpty()) {
                        Iterator it = listE.iterator();
                        do {
                            if (it.hasNext()) {
                            }
                        } while (!uz0.g(((w62) it.next()).a, uv0Var.a));
                    }
                    arrayList.add(obj);
                }
                boolean zH3 = dr0Var2.h(x62Var) | dr0Var2.f(sj1Var);
                Object objK5 = dr0Var2.K();
                if (zH3 || objK5 == yyVar) {
                    objK5 = new uy1(x62Var, sj1Var, (byte) 3);
                    dr0Var2.f0(objK5);
                }
                vp0 vp0Var2 = (vp0) objK5;
                boolean zF = dr0Var2.f(sj1Var);
                Object objK6 = dr0Var2.K();
                if (zF || objK6 == yyVar) {
                    objK6 = new bb(sj1Var, (byte) 23);
                    dr0Var2.f0(objK6);
                }
                z = false;
                a(arrayList, vp0Var2, (kp0) objK6, dr0Var2, 0);
            } else {
                z = false;
                dr0Var2.V(1823615009);
            }
            dr0Var2.p(z);
            if (((Boolean) sj1Var2.getValue()).booleanValue()) {
                dr0Var2.V(1823651930);
                boolean zF2 = dr0Var2.f(sj1Var2);
                Object objK7 = dr0Var2.K();
                if (zF2 || objK7 == yyVar) {
                    objK7 = new bb(sj1Var2, (byte) 24);
                    dr0Var2.f0(objK7);
                }
                uz0.a((kp0) objK7, dt.N(468779979, new j7(sj1Var2, x62Var, (byte) 26), dr0Var2), null, dt.N(757599369, new y7(sj1Var2, (byte) 7), dr0Var2), dt.N(1046418759, new t62(x62Var, (byte) 2), dr0Var2), h7.y, null, 0L, 0L, 0L, 0L, null, dr0Var, 1772592, 16276);
                dr0Var2 = dr0Var;
                dr0Var2.p(z);
            } else {
                dr0Var2.V(1824027681);
                dr0Var2.p(z);
            }
        } else {
            dr0Var2.Q();
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new iw0(str, kp0Var, i, (byte) 1);
        }
    }
}
