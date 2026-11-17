package defpackage;

import com.familymeal.app.MealPlannerApp;
import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v63 implements aq0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ LocalDate i;
    public final /* synthetic */ iu1 j;
    public final /* synthetic */ sj1 k;
    public final /* synthetic */ sj1 l;
    public final /* synthetic */ x20 m;
    public final /* synthetic */ MealPlannerApp n;
    public final /* synthetic */ String o;
    public final /* synthetic */ sj1 p;
    public final /* synthetic */ sj1 q;

    public /* synthetic */ v63(LocalDate localDate, iu1 iu1Var, sj1 sj1Var, sj1 sj1Var2, x20 x20Var, MealPlannerApp mealPlannerApp, String str, sj1 sj1Var3, sj1 sj1Var4, byte b) {
        this.h = b;
        this.i = localDate;
        this.j = iu1Var;
        this.k = sj1Var;
        this.l = sj1Var2;
        this.m = x20Var;
        this.n = mealPlannerApp;
        this.o = str;
        this.p = sj1Var3;
        this.q = sj1Var4;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0250  */
    /* JADX WARN: Code duplicated, block: B:51:0x0259  */
    /* JADX WARN: Code duplicated, block: B:55:0x029b  */
    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        yy yyVar;
        final sj1 sj1Var;
        final x20 x20Var;
        final MealPlannerApp mealPlannerApp;
        final String str;
        boolean zF;
        Object objK;
        byte b = this.h;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                dr0 dr0Var = (dr0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((g61) obj).getClass();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dr0Var.Q();
                } else {
                    t03.d(yj2.a, null, null, null, dt.N(-1192011599, new v63(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, (byte) 1), dr0Var), dr0Var, 196614);
                }
                break;
            default:
                dr0 dr0Var2 = (dr0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((bw) obj).getClass();
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    dr0Var2.Q();
                } else {
                    og1 og1Var = og1.h;
                    rg1 rg1VarG = t03.G(og1Var, 16.0f);
                    aw awVarA = yv.a(new ah(8.0f, new wg((byte) 0)), c5.u, dr0Var2, 6);
                    int iHashCode = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL = dr0Var2.l();
                    rg1 rg1VarU = ls.U(dr0Var2, rg1VarG);
                    sy.f.getClass();
                    dr0Var2.Y();
                    boolean z = dr0Var2.S;
                    jw0 jw0Var = l41.W;
                    if (z) {
                        dr0Var2.k(jw0Var);
                    } else {
                        dr0Var2.i0();
                    }
                    yx yxVar = c5.F;
                    h12.y(yxVar, dr0Var2, awVarA);
                    yx yxVar2 = c5.E;
                    h12.y(yxVar2, dr0Var2, dx1VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    yx yxVar3 = c5.G;
                    h12.y(yxVar3, dr0Var2, numValueOf);
                    h12.t(dr0Var2);
                    yx yxVar4 = c5.D;
                    h12.y(yxVar4, dr0Var2, rg1VarU);
                    ie0 ie0Var = e13.a;
                    gw2.b("记一次体重", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var2.j(ie0Var)).i, dr0Var2, 6, 0, 131070);
                    final iu1 iu1Var = this.j;
                    long jG = iu1Var.g();
                    final LocalDate localDate = this.i;
                    LocalDate localDateMinusDays = localDate.minusDays(jG);
                    cm cmVar = c5.s;
                    ua2 ua2VarA = ta2.a(uz0.e, cmVar, dr0Var2, 48);
                    int iHashCode2 = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL2 = dr0Var2.l();
                    rg1 rg1VarU2 = ls.U(dr0Var2, og1Var);
                    dr0Var2.Y();
                    if (dr0Var2.S) {
                        dr0Var2.k(jw0Var);
                    } else {
                        dr0Var2.i0();
                    }
                    h12.y(yxVar, dr0Var2, ua2VarA);
                    h12.y(yxVar2, dr0Var2, dx1VarL2);
                    wi0.p(iHashCode2, dr0Var2, yxVar3, dr0Var2);
                    h12.y(yxVar4, dr0Var2, rg1VarU2);
                    int monthValue = localDateMinusDays.getMonthValue();
                    int dayOfMonth = localDateMinusDays.getDayOfMonth();
                    String str2 = iu1Var.g() == 0 ? "（今天）" : "";
                    StringBuilder sbK = wi0.k("日期：", monthValue, "月", dayOfMonth, "日");
                    sbK.append(str2);
                    String string = sbK.toString();
                    if (1.0f <= 0.0d) {
                        yw0.a("invalid weight; must be greater than zero");
                    }
                    gw2.b(string, new b51(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var2, 0, 0, 262140);
                    sj1 sj1Var2 = this.k;
                    boolean zF2 = dr0Var2.f(sj1Var2);
                    Object objK2 = dr0Var2.K();
                    yy yyVar2 = zy.a;
                    if (zF2 || objK2 == yyVar2) {
                        objK2 = new x63(sj1Var2, (byte) 0);
                        dr0Var2.f0(objK2);
                    }
                    aa3.e((kp0) objK2, null, false, null, null, null, ia2.f, dr0Var2, 805306368, 510);
                    dr0Var2.p(true);
                    ua2 ua2VarA2 = ta2.a(new ah(8.0f, new wg((byte) 0)), cmVar, dr0Var2, 54);
                    int iHashCode3 = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL3 = dr0Var2.l();
                    rg1 rg1VarU3 = ls.U(dr0Var2, og1Var);
                    dr0Var2.Y();
                    if (dr0Var2.S) {
                        dr0Var2.k(jw0Var);
                    } else {
                        dr0Var2.i0();
                    }
                    h12.y(yxVar, dr0Var2, ua2VarA2);
                    h12.y(yxVar2, dr0Var2, dx1VarL3);
                    wi0.p(iHashCode3, dr0Var2, yxVar3, dr0Var2);
                    h12.y(yxVar4, dr0Var2, rg1VarU3);
                    final sj1 sj1Var3 = this.l;
                    String str3 = (String) sj1Var3.getValue();
                    boolean zF3 = dr0Var2.f(sj1Var3);
                    Object objK3 = dr0Var2.K();
                    if (!zF3) {
                        yyVar = yyVar2;
                        if (objK3 == yyVar) {
                        }
                        vp0 vp0Var = (vp0) objK3;
                        sj1Var = this.p;
                        String str4 = (String) sj1Var.getValue();
                        if (1.0f <= 0.0d) {
                            yw0.a("invalid weight; must be greater than zero");
                        }
                        t03.e("体重", str3, vp0Var, str4, new b51(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, "kg", dr0Var2, 1572870, 32);
                        boolean zF4 = dr0Var2.f(sj1Var3);
                        x20Var = this.m;
                        boolean zH = zF4 | dr0Var2.h(x20Var);
                        mealPlannerApp = this.n;
                        boolean zH2 = zH | dr0Var2.h(mealPlannerApp);
                        str = this.o;
                        zF = zH2 | dr0Var2.f(str) | dr0Var2.h(localDate) | dr0Var2.f(iu1Var);
                        objK = dr0Var2.K();
                        if (zF || objK == yyVar) {
                            final sj1 sj1Var4 = this.q;
                            kp0 kp0Var = new kp0() { // from class: y63
                                @Override // defpackage.kp0
                                public final Object a() {
                                    sj1 sj1Var5 = sj1Var3;
                                    Double dK = t03.K((String) sj1Var5.getValue());
                                    sj1 sj1Var6 = sj1Var;
                                    j23 j23Var2 = j23.a;
                                    if (dK == null) {
                                        sj1Var6.setValue("请输入数字");
                                        return j23Var2;
                                    }
                                    ie1.p(x20Var, null, new d73(mealPlannerApp, str, localDate, dK, iu1Var, sj1Var5, sj1Var6, sj1Var4, null), 3);
                                    return j23Var2;
                                }
                            };
                            dr0Var2.f0(kp0Var);
                            objK = kp0Var;
                        }
                        aa3.a((kp0) objK, null, false, null, null, null, null, null, ia2.g, dr0Var2, 805306368, 510);
                        dr0Var2.p(true);
                        gw2.b("建议每周固定时间称 2–3 次，早上空腹。同一天再记一次会覆盖。", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var2.j(ie0Var)).l, dr0Var2, 6, 0, 131070);
                        dr0Var2.p(true);
                    } else {
                        yyVar = yyVar2;
                    }
                    objK3 = new cb(sj1Var3, (byte) 12);
                    dr0Var2.f0(objK3);
                    vp0 vp0Var2 = (vp0) objK3;
                    sj1Var = this.p;
                    String str5 = (String) sj1Var.getValue();
                    if (1.0f <= 0.0d) {
                        yw0.a("invalid weight; must be greater than zero");
                    }
                    t03.e("体重", str3, vp0Var2, str5, new b51(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, "kg", dr0Var2, 1572870, 32);
                    boolean zF5 = dr0Var2.f(sj1Var3);
                    x20Var = this.m;
                    boolean zH3 = zF5 | dr0Var2.h(x20Var);
                    mealPlannerApp = this.n;
                    boolean zH4 = zH3 | dr0Var2.h(mealPlannerApp);
                    str = this.o;
                    zF = zH4 | dr0Var2.f(str) | dr0Var2.h(localDate) | dr0Var2.f(iu1Var);
                    objK = dr0Var2.K();
                    if (zF) {
                        final sj1 sj1Var5 = this.q;
                        kp0 kp0Var2 = new kp0() { // from class: y63
                            @Override // defpackage.kp0
                            public final Object a() {
                                sj1 sj1Var6 = sj1Var3;
                                Double dK = t03.K((String) sj1Var6.getValue());
                                sj1 sj1Var7 = sj1Var;
                                j23 j23Var2 = j23.a;
                                if (dK == null) {
                                    sj1Var7.setValue("请输入数字");
                                    return j23Var2;
                                }
                                ie1.p(x20Var, null, new d73(mealPlannerApp, str, localDate, dK, iu1Var, sj1Var6, sj1Var7, sj1Var5, null), 3);
                                return j23Var2;
                            }
                        };
                        dr0Var2.f0(kp0Var2);
                        objK = kp0Var2;
                    } else {
                        final sj1 sj1Var6 = this.q;
                        kp0 kp0Var3 = new kp0() { // from class: y63
                            @Override // defpackage.kp0
                            public final Object a() {
                                sj1 sj1Var7 = sj1Var3;
                                Double dK = t03.K((String) sj1Var7.getValue());
                                sj1 sj1Var8 = sj1Var;
                                j23 j23Var2 = j23.a;
                                if (dK == null) {
                                    sj1Var8.setValue("请输入数字");
                                    return j23Var2;
                                }
                                ie1.p(x20Var, null, new d73(mealPlannerApp, str, localDate, dK, iu1Var, sj1Var7, sj1Var8, sj1Var6, null), 3);
                                return j23Var2;
                            }
                        };
                        dr0Var2.f0(kp0Var3);
                        objK = kp0Var3;
                    }
                    aa3.a((kp0) objK, null, false, null, null, null, null, null, ia2.g, dr0Var2, 805306368, 510);
                    dr0Var2.p(true);
                    gw2.b("建议每周固定时间称 2–3 次，早上空腹。同一天再记一次会覆盖。", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var2.j(ie0Var)).l, dr0Var2, 6, 0, 131070);
                    dr0Var2.p(true);
                }
                break;
        }
        return j23Var;
    }
}
