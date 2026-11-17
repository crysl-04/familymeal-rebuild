package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class g63 implements aq0 {
    public final /* synthetic */ p60 h;
    public final /* synthetic */ LinkedHashMap i;
    public final /* synthetic */ LinkedHashMap j;

    public g63(p60 p60Var, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.h = p60Var;
        this.i = linkedHashMap;
        this.j = linkedHashMap2;
    }

    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        yy yyVar;
        yx yxVar;
        yx yxVar2;
        yx yxVar3;
        boolean z;
        jw0 jw0Var;
        yy yyVar2;
        wt1 wt1Var;
        int i;
        String strConcat;
        g63 g63Var = this;
        yx yxVar4 = c5.D;
        yx yxVar5 = c5.G;
        yx yxVar6 = c5.E;
        yx yxVar7 = c5.F;
        dr0 dr0Var = (dr0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((bw) obj).getClass();
        if (dr0Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
            og1 og1Var = og1.h;
            rg1 rg1VarG = t03.G(og1Var, 12.0f);
            aw awVarA = yv.a(new ah(2.0f, new wg((byte) 0)), c5.u, dr0Var, 6);
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            rg1 rg1VarU = ls.U(dr0Var, rg1VarG);
            sy.f.getClass();
            dr0Var.Y();
            boolean z2 = dr0Var.S;
            jw0 jw0Var2 = l41.W;
            if (z2) {
                dr0Var.k(jw0Var2);
            } else {
                dr0Var.i0();
            }
            h12.y(yxVar7, dr0Var, awVarA);
            h12.y(yxVar6, dr0Var, dx1VarL);
            wi0.p(iHashCode, dr0Var, yxVar5, dr0Var);
            h12.y(yxVar4, dr0Var, rg1VarU);
            p60 p60Var = g63Var.h;
            String str = p60Var.i;
            xw2 xw2Var = ((c13) dr0Var.j(e13.a)).h;
            Object objK = dr0Var.K();
            yy yyVar3 = zy.a;
            if (objK == yyVar3) {
                objK = z9.p;
                dr0Var.f0(objK);
            }
            yx yxVar8 = yxVar4;
            yy yyVar4 = yyVar3;
            yx yxVar9 = yxVar6;
            boolean z3 = false;
            yx yxVar10 = yxVar5;
            jw0 jw0Var3 = jw0Var2;
            gw2.b(str, tg2.a(og1Var, false, (vp0) objK), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, xw2Var, dr0Var, 0, 0, 131068);
            dr0 dr0Var2 = dr0Var;
            dr0Var2.V(-1772887146);
            Iterable<zy1> iterable = (List) g63Var.i.get(p60Var);
            if (iterable == null) {
                iterable = ag0.h;
            }
            for (zy1 zy1Var : iterable) {
                rx1 rx1Var = (rx1) g63Var.j.get(zy1Var.a);
                if (rx1Var == null) {
                    yyVar = yyVar4;
                    z = z3;
                    yxVar = yxVar7;
                    yxVar2 = yxVar8;
                    yxVar3 = yxVar10;
                    jw0Var = jw0Var3;
                } else {
                    String str2 = rx1Var.b;
                    ArrayList arrayList = zy1Var.f;
                    Object objK2 = dr0Var2.K();
                    if (objK2 == yyVar4) {
                        objK2 = z9.q;
                        dr0Var2.f0(objK2);
                    }
                    dr0 dr0Var3 = dr0Var2;
                    zy1 zy1Var2 = zy1Var;
                    gw2.b(str2 + "（在家：" + dv.E0(arrayList, "、", null, null, (vp0) objK2, 30) + "）", t03.J(og1Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var2.j(e13.a)).m, dr0Var3, 48, 0, 131068);
                    dr0Var2 = dr0Var3;
                    dr0Var2.V(-1772873900);
                    for (zo1 zo1Var : zo1.n) {
                        ap1 ap1VarA = zy1Var2.e.a(zo1Var);
                        double d = ap1VarA.a;
                        double dA = zy1Var2.c.a(zo1Var);
                        double d2 = ap1VarA.b;
                        if (dA < d) {
                            dr0Var2.V(-2053070081);
                            yyVar2 = yyVar4;
                            wt1Var = new wt1("偏低", new kv(((pv) dr0Var2.j(rv.a)).w));
                            dr0Var2.p(false);
                        } else {
                            yyVar2 = yyVar4;
                            if (!ap1VarA.a() || dA <= d2) {
                                dr0Var2.V(-2053063967);
                                wt1Var = new wt1("达标", new kv(((pv) dr0Var2.j(rv.a)).a));
                                dr0Var2.p(false);
                            } else {
                                dr0Var2.V(-2053066529);
                                wt1Var = new wt1("偏高", new kv(((pv) dr0Var2.j(rv.a)).w));
                                dr0Var2.p(false);
                            }
                        }
                        String str3 = (String) wt1Var.h;
                        long j = ((kv) wt1Var.i).a;
                        String str4 = zo1Var == zo1.h ? "kcal" : "g";
                        if (ap1VarA.a()) {
                            i = 0;
                            strConcat = wi0.h(t03.t(0, d), "–", t03.t(0, d2));
                        } else {
                            i = 0;
                            strConcat = "≥".concat(t03.t(0, d));
                        }
                        yi0 yi0Var = yj2.a;
                        ua2 ua2VarA = ta2.a(uz0.e, c5.r, dr0Var2, i);
                        int iHashCode2 = Long.hashCode(dr0Var2.T);
                        dx1 dx1VarL2 = dr0Var2.l();
                        rg1 rg1VarU2 = ls.U(dr0Var2, yi0Var);
                        sy.f.getClass();
                        dr0Var2.Y();
                        if (dr0Var2.S) {
                            dr0Var2.k(jw0Var3);
                        } else {
                            dr0Var2.i0();
                        }
                        h12.y(yxVar7, dr0Var2, ua2VarA);
                        yx yxVar11 = yxVar9;
                        h12.y(yxVar11, dr0Var2, dx1VarL2);
                        yx yxVar12 = yxVar10;
                        wi0.p(iHashCode2, dr0Var2, yxVar12, dr0Var2);
                        yx yxVar13 = yxVar8;
                        h12.y(yxVar13, dr0Var2, rg1VarU2);
                        String str5 = (String) ee1.J(zo1Var, m63.a);
                        jw0 jw0Var4 = jw0Var3;
                        if (1.0f <= 0.0d) {
                            yw0.a("invalid weight; must be greater than zero");
                        }
                        dr0 dr0Var4 = dr0Var2;
                        yxVar9 = yxVar11;
                        zy1 zy1Var3 = zy1Var2;
                        yx yxVar14 = yxVar7;
                        gw2.b(str5, new b51(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var4, 0, 0, 262140);
                        String strK = jp1.k(t03.t(0, dA), " / ", strConcat, " ", str4);
                        if (2.0f <= 0.0d) {
                            yw0.a("invalid weight; must be greater than zero");
                        }
                        gw2.b(strK, new b51(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var4, 0, 0, 262140);
                        gw2.b(str3, null, j, 0L, qn0.l, 0L, null, 0L, 0, false, 0, 0, null, dr0Var4, 1572864, 0, 262074);
                        dr0Var2 = dr0Var4;
                        dr0Var2.p(true);
                        yyVar4 = yyVar2;
                        jw0Var3 = jw0Var4;
                        zy1Var2 = zy1Var3;
                        yxVar8 = yxVar13;
                        yxVar10 = yxVar12;
                        yxVar7 = yxVar14;
                    }
                    yyVar = yyVar4;
                    yxVar = yxVar7;
                    yxVar2 = yxVar8;
                    yxVar3 = yxVar10;
                    z = false;
                    jw0Var = jw0Var3;
                    dr0Var2.p(false);
                }
                g63Var = this;
                z3 = z;
                jw0Var3 = jw0Var;
                yxVar8 = yxVar2;
                yxVar10 = yxVar3;
                yxVar7 = yxVar;
                yyVar4 = yyVar;
            }
            dr0Var2.p(z3);
            dr0Var2.p(true);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
