package defpackage;

import android.content.Context;
import com.familymeal.app.MealPlannerApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nw0 implements aq0 {
    public final /* synthetic */ byte h = 0;
    public final /* synthetic */ sj1 i;
    public final /* synthetic */ sj1 j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ nw0(x20 x20Var, Context context, sj1 sj1Var, sj1 sj1Var2, sj1 sj1Var3) {
        this.m = x20Var;
        this.l = context;
        this.i = sj1Var;
        this.j = sj1Var2;
        this.k = sj1Var3;
    }

    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        sj1 sj1Var;
        sj1 sj1Var2;
        byte b = this.h;
        sj1 sj1Var3 = this.j;
        sj1 sj1Var4 = this.i;
        jw0 jw0Var = l41.W;
        og1 og1Var = og1.h;
        j23 j23Var = j23.a;
        yy yyVar = zy.a;
        Object obj4 = this.k;
        Object obj5 = this.l;
        Object obj6 = this.m;
        byte b2 = 1;
        switch (b) {
            case 0:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj6;
                vp0 vp0Var = (vp0) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                pt1 pt1Var = (pt1) obj;
                dr0 dr0Var = (dr0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                pt1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dr0Var.f(pt1Var) ? 4 : 2;
                }
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    dr0Var.Q();
                } else {
                    yi0 yi0Var = yj2.b;
                    rg1 rg1VarF = t03.F(yi0Var, pt1Var);
                    aw awVarA = yv.a(uz0.g, c5.u, dr0Var, 0);
                    int iHashCode = Long.hashCode(dr0Var.T);
                    dx1 dx1VarL = dr0Var.l();
                    rg1 rg1VarU = ls.U(dr0Var, rg1VarF);
                    sy.f.getClass();
                    dr0Var.Y();
                    if (dr0Var.S) {
                        dr0Var.k(jw0Var);
                    } else {
                        dr0Var.i0();
                    }
                    h12.y(c5.F, dr0Var, awVarA);
                    h12.y(c5.E, dr0Var, dx1VarL);
                    h12.y(c5.G, dr0Var, Integer.valueOf(iHashCode));
                    h12.t(dr0Var);
                    h12.y(c5.D, dr0Var, rg1VarU);
                    String strI = jp1.i(((List) sj1Var3.getValue()).size(), "食材（", "）");
                    xw2 xw2Var = ((c13) dr0Var.j(e13.a)).f;
                    rg1 rg1VarI = t03.I(og1Var, 16.0f, 16.0f, 16.0f, 8.0f);
                    Object objK = dr0Var.K();
                    if (objK == yyVar) {
                        objK = new vv0((byte) 6);
                        dr0Var.f0(objK);
                    }
                    gw2.b(strI, tg2.a(rg1VarI, false, (vp0) objK), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, xw2Var, dr0Var, 0, 0, 131068);
                    String str = (String) sj1Var4.getValue();
                    rg1 rg1VarH = t03.H(yj2.a, 16.0f, 0.0f, 2);
                    boolean zF = dr0Var.f(sj1Var4);
                    Object objK2 = dr0Var.K();
                    if (zF || objK2 == yyVar) {
                        objK2 = new cb(sj1Var4, (byte) 4);
                        dr0Var.f0(objK2);
                    }
                    ls.h(str, (vp0) objK2, rg1VarH, false, null, null, ie1.o, ie1.p, null, null, false, null, null, null, true, 0, 0, null, null, dr0Var, 113246592, 12582912, 8257144);
                    boolean zH = dr0Var.h(linkedHashMap) | dr0Var.f(vp0Var) | dr0Var.h(arrayList);
                    Object objK3 = dr0Var.K();
                    if (zH || objK3 == yyVar) {
                        objK3 = new qb((Object) linkedHashMap, (Object) arrayList, (Object) vp0Var, (byte) 9);
                        dr0Var.f0(objK3);
                    }
                    cu.h(yi0Var, null, null, null, null, null, false, null, (vp0) objK3, dr0Var, 6, 510);
                    dr0Var.p(true);
                }
                break;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj4;
                vp0 vp0Var2 = (vp0) obj5;
                sj1 sj1Var5 = (sj1) obj6;
                pt1 pt1Var2 = (pt1) obj;
                dr0 dr0Var2 = (dr0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                pt1Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= dr0Var2.f(pt1Var2) ? 4 : 2;
                }
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    dr0Var2.Q();
                } else {
                    yi0 yi0Var2 = yj2.b;
                    rg1 rg1VarF2 = t03.F(yi0Var2, pt1Var2);
                    aw awVarA2 = yv.a(uz0.g, c5.u, dr0Var2, 0);
                    int iHashCode2 = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL2 = dr0Var2.l();
                    rg1 rg1VarU2 = ls.U(dr0Var2, rg1VarF2);
                    sy.f.getClass();
                    dr0Var2.Y();
                    if (dr0Var2.S) {
                        dr0Var2.k(jw0Var);
                    } else {
                        dr0Var2.i0();
                    }
                    h12.y(c5.F, dr0Var2, awVarA2);
                    h12.y(c5.E, dr0Var2, dx1VarL2);
                    h12.y(c5.G, dr0Var2, Integer.valueOf(iHashCode2));
                    h12.t(dr0Var2);
                    h12.y(c5.D, dr0Var2, rg1VarU2);
                    String strI2 = jp1.i(((List) sj1Var5.getValue()).size(), "菜谱（", "）");
                    xw2 xw2Var2 = ((c13) dr0Var2.j(e13.a)).f;
                    rg1 rg1VarI2 = t03.I(og1Var, 16.0f, 16.0f, 16.0f, 8.0f);
                    Object objK4 = dr0Var2.K();
                    if (objK4 == yyVar) {
                        objK4 = new vw1((byte) 24);
                        dr0Var2.f0(objK4);
                    }
                    gw2.b(strI2, tg2.a(rg1VarI2, false, (vp0) objK4), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, xw2Var2, dr0Var2, 0, 0, 131068);
                    String str2 = (String) sj1Var4.getValue();
                    rg1 rg1VarH2 = t03.H(yj2.a, 16.0f, 0.0f, 2);
                    boolean zF2 = dr0Var2.f(sj1Var4);
                    Object objK5 = dr0Var2.K();
                    if (zF2 || objK5 == yyVar) {
                        objK5 = new cb(sj1Var4, (byte) 7);
                        dr0Var2.f0(objK5);
                    }
                    ls.h(str2, (vp0) objK5, rg1VarH2, false, null, null, s60.g, s60.h, null, null, false, null, null, null, true, 0, 0, null, null, dr0Var2, 113246592, 12582912, 8257144);
                    ArrayList arrayListI0 = dv.I0(lt.P(null), zr.p);
                    Set setC = r02.C((zr) sj1Var3.getValue());
                    Object objK6 = dr0Var2.K();
                    if (objK6 == yyVar) {
                        objK6 = new vw1((byte) 25);
                        dr0Var2.f0(objK6);
                    }
                    vp0 vp0Var3 = (vp0) objK6;
                    boolean zF3 = dr0Var2.f(sj1Var3);
                    Object objK7 = dr0Var2.K();
                    if (zF3 || objK7 == yyVar) {
                        objK7 = new cb(sj1Var3, (byte) 8);
                        dr0Var2.f0(objK7);
                    }
                    aa3.b(arrayListI0, setC, vp0Var3, (vp0) objK7, t03.H(og1Var, 16.0f, 0.0f, 2), dr0Var2, 24960, 0);
                    boolean zH2 = dr0Var2.h(arrayList2) | dr0Var2.f(vp0Var2);
                    Object objK8 = dr0Var2.K();
                    if (zH2 || objK8 == yyVar) {
                        objK8 = new uy1((Object) arrayList2, (Object) vp0Var2, (byte) 6);
                        dr0Var2.f0(objK8);
                    }
                    cu.h(yi0Var2, null, null, null, null, null, false, null, (vp0) objK8, dr0Var2, 6, 510);
                    dr0Var2.p(true);
                }
                break;
            case 2:
                x20 x20Var = (x20) obj6;
                Context context = (Context) obj5;
                sj1 sj1Var6 = (sj1) obj4;
                dr0 dr0Var3 = (dr0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((bw) obj).getClass();
                if (!dr0Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    dr0Var3.Q();
                } else {
                    rg1 rg1VarG = t03.G(og1Var, 16.0f);
                    aw awVarA3 = yv.a(new ah(4.0f, new wg((byte) 0)), c5.u, dr0Var3, 6);
                    int iHashCode3 = Long.hashCode(dr0Var3.T);
                    dx1 dx1VarL3 = dr0Var3.l();
                    rg1 rg1VarU3 = ls.U(dr0Var3, rg1VarG);
                    sy.f.getClass();
                    dr0Var3.Y();
                    if (dr0Var3.S) {
                        dr0Var3.k(jw0Var);
                    } else {
                        dr0Var3.i0();
                    }
                    h12.y(c5.F, dr0Var3, awVarA3);
                    h12.y(c5.E, dr0Var3, dx1VarL3);
                    h12.y(c5.G, dr0Var3, Integer.valueOf(iHashCode3));
                    h12.t(dr0Var3);
                    h12.y(c5.D, dr0Var3, rg1VarU3);
                    gw2.b("求解器测试（本月，当前菜谱库）", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var3.j(e13.a)).h, dr0Var3, 6, 0, 131070);
                    dr0 dr0Var4 = dr0Var3;
                    sj1 sj1Var7 = this.i;
                    boolean z = !((Boolean) sj1Var7.getValue()).booleanValue();
                    boolean zH3 = dr0Var4.h(x20Var) | dr0Var4.h(context);
                    Object objK9 = dr0Var4.K();
                    sj1 sj1Var8 = this.j;
                    if (zH3 || objK9 == yyVar) {
                        sj1Var = sj1Var8;
                        objK9 = new v9(x20Var, sj1Var7, sj1Var, context, sj1Var6, (byte) 3);
                        sj1Var2 = sj1Var7;
                        dr0Var4.f0(objK9);
                    } else {
                        sj1Var = sj1Var8;
                        sj1Var2 = sj1Var7;
                    }
                    aa3.a((kp0) objK9, null, z, null, null, null, null, null, dt.N(-1618614615, new x90(sj1Var2, b2), dr0Var4), dr0Var4, 805306368, 506);
                    if (((Boolean) sj1Var2.getValue()).booleanValue()) {
                        dr0Var4.V(837028788);
                        e42.a(null, 0L, 0.0f, 0L, 0, 0.0f, dr0Var4, 0, 63);
                    } else {
                        dr0Var4.V(178114601);
                    }
                    dr0Var4.p(false);
                    u90 u90Var = (u90) sj1Var6.getValue();
                    if (u90Var == null) {
                        dr0Var4.V(178153970);
                        dr0Var4.p(false);
                    } else {
                        String str3 = u90Var.i;
                        dr0Var4.V(178153971);
                        gw2.b(jp1.j("状态：", u90Var.a), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var4, 0, 0, 262142);
                        gw2.b(String.format("耗时：%.1f 秒（建模 %.1f + 求解 %.1f）", Arrays.copyOf(new Object[]{Double.valueOf(u90Var.b), Double.valueOf(u90Var.c), Double.valueOf(u90Var.d)}, 3)), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var4, 0, 0, 262142);
                        gw2.b("预算：".concat(u90Var.e), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var4, 0, 0, 262142);
                        Double d = u90Var.f;
                        gw2.b("目标值：".concat(d != null ? String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d.doubleValue())}, 1)) : "—"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var4, 0, 0, 262142);
                        Integer num = u90Var.g;
                        gw2.b("违反硬约束：" + (num != null ? num : "—"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var4, 0, 0, 262142);
                        gw2.b(jp1.h(u90Var.h, "菜谱数："), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var4, 0, 0, 262142);
                        dr0Var4 = dr0Var4;
                        if (co2.X(str3)) {
                            dr0Var4.V(1955453395);
                        } else {
                            dr0Var4.V(1448551843);
                            gw2.b("备注：".concat(str3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var4, 0, 0, 262142);
                        }
                        dr0Var4.p(false);
                        dr0Var4.p(false);
                    }
                    String str4 = (String) sj1Var.getValue();
                    if (str4 == null) {
                        dr0Var4.V(178637167);
                    } else {
                        dr0Var4.V(178637168);
                        gw2.b(str4, null, ((pv) dr0Var4.j(rv.a)).w, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var4, 0, 0, 262138);
                    }
                    dr0Var4.p(false);
                    dr0Var4.p(true);
                }
                break;
            default:
                x20 x20Var2 = (x20) obj6;
                MealPlannerApp mealPlannerApp = (MealPlannerApp) obj5;
                String str5 = (String) obj4;
                dr0 dr0Var5 = (dr0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((g61) obj).getClass();
                if (!dr0Var5.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    dr0Var5.Q();
                } else {
                    sj1 sj1Var9 = this.i;
                    i4 i4Var = (i4) sj1Var9.getValue();
                    sj1 sj1Var10 = this.j;
                    String str6 = (String) sj1Var10.getValue();
                    boolean zH4 = dr0Var5.h(x20Var2) | dr0Var5.h(mealPlannerApp) | dr0Var5.f(str5);
                    Object objK10 = dr0Var5.K();
                    if (zH4 || objK10 == yyVar) {
                        objK10 = new v9(x20Var2, mealPlannerApp, str5, sj1Var10, sj1Var9);
                        dr0Var5.f0(objK10);
                    }
                    tz0.a(i4Var, str6, (kp0) objK10, dr0Var5, 0);
                }
                break;
        }
        return j23Var;
    }

    public /* synthetic */ nw0(x20 x20Var, MealPlannerApp mealPlannerApp, String str, sj1 sj1Var, sj1 sj1Var2) {
        this.m = x20Var;
        this.l = mealPlannerApp;
        this.k = str;
        this.i = sj1Var;
        this.j = sj1Var2;
    }

    public /* synthetic */ nw0(sj1 sj1Var, sj1 sj1Var2, ArrayList arrayList, vp0 vp0Var, sj1 sj1Var3) {
        this.i = sj1Var;
        this.j = sj1Var2;
        this.k = arrayList;
        this.l = vp0Var;
        this.m = sj1Var3;
    }

    public /* synthetic */ nw0(sj1 sj1Var, LinkedHashMap linkedHashMap, vp0 vp0Var, ArrayList arrayList, sj1 sj1Var2) {
        this.i = sj1Var;
        this.m = linkedHashMap;
        this.l = vp0Var;
        this.k = arrayList;
        this.j = sj1Var2;
    }
}
