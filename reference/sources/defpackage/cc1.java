package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cc1 implements aq0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ String i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ hq0 k;

    public /* synthetic */ cc1(ay1 ay1Var, String str, vp0 vp0Var) {
        this.h = (byte) 1;
        this.j = ay1Var;
        this.i = str;
        this.k = vp0Var;
    }

    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        yy yyVar;
        boolean z2;
        ay1 ay1Var;
        int i;
        yi0 yi0Var;
        boolean z3;
        byte b = this.h;
        yy yyVar2 = zy.a;
        j23 j23Var = j23.a;
        jw0 jw0Var = l41.W;
        og1 og1Var = og1.h;
        hq0 hq0Var = this.k;
        Object obj4 = this.j;
        switch (b) {
            case 0:
                fg fgVar = (fg) obj4;
                kp0 kp0Var = (kp0) hq0Var;
                pt1 pt1Var = (pt1) obj;
                dr0 dr0Var = (dr0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                pt1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dr0Var.f(pt1Var) ? 4 : 2;
                }
                if (dr0Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    rg1 rg1VarG = t03.G(t03.F(yj2.b, pt1Var), 32.0f);
                    aw awVarA = yv.a(uz0.h, c5.v, dr0Var, 54);
                    int iHashCode = Long.hashCode(dr0Var.T);
                    dx1 dx1VarL = dr0Var.l();
                    rg1 rg1VarU = ls.U(dr0Var, rg1VarG);
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
                    xw2 xw2Var = ((c13) dr0Var.j(e13.a)).e;
                    Object objK = dr0Var.K();
                    if (objK == yyVar2) {
                        objK = new vv0((byte) 26);
                        dr0Var.f0(objK);
                    }
                    gw2.b("家庭食谱", tg2.a(og1Var, false, (vp0) objK), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, xw2Var, dr0Var, 6, 0, 131068);
                    y02.d(dr0Var, yj2.b(og1Var, 24.0f));
                    int iOrdinal = fgVar.ordinal();
                    if (iOrdinal == 0) {
                        dr0Var.V(-1619717405);
                        aa3.a(kp0Var, null, false, null, null, null, null, null, ia2.d, dr0Var, 805306368, 510);
                        String str = this.i;
                        if (str == null) {
                            dr0Var.V(-1619630513);
                            dr0Var.p(false);
                            z = false;
                        } else {
                            dr0Var.V(-1619630512);
                            y02.d(dr0Var, yj2.b(og1Var, 16.0f));
                            gw2.b(str, null, ((pv) dr0Var.j(rv.a)).w, 0L, null, 0L, new zs2(3), 0L, 0, false, 0, 0, null, dr0Var, 0, 0, 261114);
                            z = false;
                            dr0Var.p(false);
                        }
                        dr0Var.p(z);
                    } else if (iOrdinal == 1) {
                        dr0Var.V(-467879847);
                        gw2.b("本应用保存家人的身高体重等信息，需要手机设置锁屏密码后才能使用。\n请到 系统设置 → 安全 中设置锁屏密码，然后重新打开应用。", null, 0L, 0L, null, 0L, new zs2(3), 0L, 0, false, 0, 0, null, dr0Var, 6, 0, 261118);
                        dr0Var.p(false);
                    } else {
                        if (iOrdinal != 2) {
                            dr0Var.V(-467892591);
                            dr0Var.p(false);
                            wg.n();
                            return null;
                        }
                        dr0Var.V(-1619160552);
                        gw2.b("无法使用系统身份验证，暂时不能打开应用。", null, ((pv) dr0Var.j(rv.a)).w, 0L, null, 0L, new zs2(3), 0L, 0, false, 0, 0, null, dr0Var, 6, 0, 261114);
                        dr0Var.p(false);
                    }
                    dr0Var.p(true);
                } else {
                    dr0Var.Q();
                }
                return j23Var;
            case 1:
                ay1 ay1Var2 = (ay1) obj4;
                lu1 lu1Var = ay1Var2.r;
                lu1 lu1Var2 = ay1Var2.l;
                vp0 vp0Var = (vp0) hq0Var;
                pt1 pt1Var2 = (pt1) obj;
                dr0 dr0Var2 = (dr0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                pt1Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= dr0Var2.f(pt1Var2) ? 4 : 2;
                }
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    dr0Var2.Q();
                    return j23Var;
                }
                if (!((Boolean) ay1Var2.f.getValue()).booleanValue()) {
                    dr0Var2.V(-245207155);
                    e42.a(t03.G(t03.F(og1Var, pt1Var2), 32.0f), 0L, 0.0f, 0L, 0, 0.0f, dr0Var2, 0, 62);
                    dr0Var2.p(false);
                    return j23Var;
                }
                dr0Var2.V(-245122587);
                dr0Var2.p(false);
                Map map = (Map) ay1Var2.t.getValue();
                rg1 rg1VarC = uz0.C(t03.G(ia2.p(t03.F(yj2.b, pt1Var2)), 16.0f), uz0.v(dr0Var2));
                aw awVarA2 = yv.a(new ah(8.0f, new wg((byte) 0)), c5.u, dr0Var2, 6);
                int iHashCode2 = Long.hashCode(dr0Var2.T);
                dx1 dx1VarL2 = dr0Var2.l();
                rg1 rg1VarU2 = ls.U(dr0Var2, rg1VarC);
                sy.f.getClass();
                dr0Var2.Y();
                if (dr0Var2.S) {
                    dr0Var2.k(jw0Var);
                } else {
                    dr0Var2.i0();
                }
                yx yxVar = c5.F;
                h12.y(yxVar, dr0Var2, awVarA2);
                yx yxVar2 = c5.E;
                h12.y(yxVar2, dr0Var2, dx1VarL2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                yx yxVar3 = c5.G;
                h12.y(yxVar3, dr0Var2, numValueOf);
                h12.t(dr0Var2);
                yx yxVar4 = c5.D;
                h12.y(yxVar4, dr0Var2, rg1VarU2);
                String str2 = this.i;
                if (str2 != null) {
                    dr0Var2.V(-896881333);
                    boolean zF = dr0Var2.f(vp0Var) | dr0Var2.f(str2);
                    Object objK2 = dr0Var2.K();
                    if (zF) {
                        yyVar = yyVar2;
                    } else {
                        yyVar = yyVar2;
                        if (objK2 != yyVar) {
                        }
                        aa3.c((kp0) objK2, yj2.a, false, null, null, null, null, aa3.n, dr0Var2, 805306416, 508);
                        dr0Var2.p(false);
                    }
                    objK2 = new h6((Object) vp0Var, (Object) str2, (byte) 27);
                    dr0Var2.f0(objK2);
                    aa3.c((kp0) objK2, yj2.a, false, null, null, null, null, aa3.n, dr0Var2, 805306416, 508);
                    dr0Var2.p(false);
                } else {
                    yyVar = yyVar2;
                    lu1Var = lu1Var;
                    dr0Var2.V(-896692977);
                    dr0Var2.p(false);
                }
                String str3 = (String) ay1Var2.g.getValue();
                boolean zH = dr0Var2.h(ay1Var2);
                Object objK3 = dr0Var2.K();
                byte b2 = 5;
                if (zH || objK3 == yyVar) {
                    objK3 = new wx1(ay1Var2, b2);
                    dr0Var2.f0(objK3);
                }
                vp0 vp0Var2 = (vp0) objK3;
                String str4 = (String) map.get("name");
                if (str4 == null) {
                    str4 = (String) map.get("id");
                }
                t03.h("称呼（建议不用真名）", str3, vp0Var2, str4, null, 0, dr0Var2, 6, 48);
                gw2.b("性别", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, es.N(dr0Var2).i, dr0Var2, 6, 0, 131070);
                Set setC = r02.C((ir0) ay1Var2.h.getValue());
                Object objK4 = dr0Var2.K();
                if (objK4 == yyVar) {
                    objK4 = new vw1((byte) 6);
                    dr0Var2.f0(objK4);
                }
                vp0 vp0Var3 = (vp0) objK4;
                boolean zH2 = dr0Var2.h(ay1Var2);
                Object objK5 = dr0Var2.K();
                byte b3 = 7;
                if (zH2 || objK5 == yyVar) {
                    objK5 = new wx1(ay1Var2, b3);
                    dr0Var2.f0(objK5);
                }
                aa3.b(ir0.l, setC, vp0Var3, (vp0) objK5, null, dr0Var2, 384, 16);
                ua2 ua2VarA = ta2.a(new ah(8.0f, new wg((byte) 0)), c5.r, dr0Var2, 6);
                int iHashCode3 = Long.hashCode(dr0Var2.T);
                dx1 dx1VarL3 = dr0Var2.l();
                rg1 rg1VarU3 = ls.U(dr0Var2, og1Var);
                dr0Var2.Y();
                if (dr0Var2.S) {
                    dr0Var2.k(jw0Var);
                } else {
                    dr0Var2.i0();
                }
                h12.y(yxVar, dr0Var2, ua2VarA);
                h12.y(yxVar2, dr0Var2, dx1VarL3);
                wi0.p(iHashCode3, dr0Var2, yxVar3, dr0Var2);
                h12.y(yxVar4, dr0Var2, rg1VarU3);
                String str5 = (String) ay1Var2.i.getValue();
                boolean zH3 = dr0Var2.h(ay1Var2);
                Object objK6 = dr0Var2.K();
                if (zH3 || objK6 == yyVar) {
                    objK6 = new i(1, ay1Var2, ay1.class, "onBirthYear", "onBirthYear(Ljava/lang/String;)V", 0, (byte) 7);
                    dr0Var2.f0(objK6);
                }
                String str6 = (String) map.get("birthYear");
                wa2 wa2Var = wa2.a;
                t03.e("出生年份", str5, (vp0) ((kq0) objK6), str6, wa2Var.a(og1Var, 1.0f), true, null, dr0Var2, 196614, 64);
                String str7 = (String) ay1Var2.j.getValue();
                boolean zH4 = dr0Var2.h(ay1Var2);
                Object objK7 = dr0Var2.K();
                byte b4 = 8;
                if (zH4 || objK7 == yyVar) {
                    objK7 = new wx1(ay1Var2, b4);
                    dr0Var2.f0(objK7);
                }
                t03.e("身高", str7, (vp0) objK7, (String) map.get("height"), wa2Var.a(og1Var, 1.0f), false, "cm", dr0Var2, 1572870, 32);
                String str8 = (String) ay1Var2.k.getValue();
                boolean zH5 = dr0Var2.h(ay1Var2);
                Object objK8 = dr0Var2.K();
                if (zH5 || objK8 == yyVar) {
                    objK8 = new wx1(ay1Var2, (byte) 9);
                    dr0Var2.f0(objK8);
                }
                t03.e("体重", str8, (vp0) objK8, (String) map.get("weight"), wa2Var.a(og1Var, 1.0f), false, "kg", dr0Var2, 1572870, 32);
                dr0Var2.p(true);
                gw2.b("日常活动", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, es.N(dr0Var2).i, dr0Var2, 6, 0, 131070);
                Set setC2 = r02.C((i3) lu1Var2.getValue());
                Object objK9 = dr0Var2.K();
                if (objK9 == yyVar) {
                    objK9 = new vw1((byte) 7);
                    dr0Var2.f0(objK9);
                }
                vp0 vp0Var4 = (vp0) objK9;
                boolean zH6 = dr0Var2.h(ay1Var2);
                Object objK10 = dr0Var2.K();
                if (zH6 || objK10 == yyVar) {
                    objK10 = new wx1(ay1Var2, (byte) 10);
                    dr0Var2.f0(objK10);
                }
                aa3.b(i3.o, setC2, vp0Var4, (vp0) objK10, null, dr0Var2, 384, 16);
                gw2.b(((i3) lu1Var2.getValue()).i, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, es.N(dr0Var2).l, dr0Var2, 0, 0, 131070);
                gw2.b("饮食目标", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, es.N(dr0Var2).i, dr0Var2, 6, 0, 131070);
                dr0 dr0Var3 = dr0Var2;
                List listE = ay1Var2.e();
                Set setC3 = r02.C(ay1Var2.h());
                Object objK11 = dr0Var3.K();
                if (objK11 == yyVar) {
                    objK11 = new vw1((byte) 8);
                    dr0Var3.f0(objK11);
                }
                vp0 vp0Var5 = (vp0) objK11;
                boolean zH7 = dr0Var3.h(ay1Var2);
                Object objK12 = dr0Var3.K();
                if (zH7 || objK12 == yyVar) {
                    objK12 = new wx1(ay1Var2, (byte) 11);
                    dr0Var3.f0(objK12);
                }
                aa3.b(listE, setC3, vp0Var5, (vp0) objK12, null, dr0Var3, 384, 16);
                if (ay1Var2.e().equals(lt.P(as0.l))) {
                    dr0Var3.V(-1137265923);
                    gw2.b("未满 18 岁固定为「成长」，不会安排减重。", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, es.N(dr0Var3).l, dr0Var3, 6, 0, 131070);
                    z2 = false;
                } else {
                    z2 = false;
                    dr0Var3.V(-895434129);
                }
                dr0Var3.p(z2);
                String str9 = (String) map.get("goal");
                if (str9 == null) {
                    dr0Var3.V(-895397643);
                } else {
                    dr0Var3.V(-895397642);
                    gw2.b(str9, null, ((pv) dr0Var3.j(rv.a)).w, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var3, 0, 0, 262138);
                    z2 = false;
                }
                dr0Var3.p(z2);
                if (ay1Var2.h() == as0.i) {
                    dr0Var3.V(-895290072);
                    String str10 = (String) ay1Var2.n.getValue();
                    boolean zH8 = dr0Var3.h(ay1Var2);
                    Object objK13 = dr0Var3.K();
                    if (zH8 || objK13 == yyVar) {
                        objK13 = new wx1(ay1Var2, (byte) 3);
                        dr0Var3.f0(objK13);
                    }
                    t03.e("目标体重", str10, (vp0) objK13, (String) map.get("targetWeight"), yj2.a, false, "kg", dr0Var3, 1597446, 32);
                    gw2.b("减重速度", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, es.N(dr0Var3).i, dr0Var3, 6, 0, 131070);
                    dr0Var3 = dr0Var3;
                    Set setC4 = r02.C((lt1) ay1Var2.o.getValue());
                    Object objK14 = dr0Var3.K();
                    if (objK14 == yyVar) {
                        objK14 = new vw1((byte) 4);
                        dr0Var3.f0(objK14);
                    }
                    vp0 vp0Var6 = (vp0) objK14;
                    boolean zH9 = dr0Var3.h(ay1Var2);
                    Object objK15 = dr0Var3.K();
                    if (zH9 || objK15 == yyVar) {
                        objK15 = new wx1(ay1Var2, (byte) 4);
                        dr0Var3.f0(objK15);
                    }
                    aa3.b(lt1.m, setC4, vp0Var6, (vp0) objK15, null, dr0Var3, 384, 16);
                    dr0Var3.p(false);
                } else {
                    dr0Var3.V(-894975825);
                    dr0Var3.p(false);
                }
                gw2.b("忌口（不吃的食材类别）", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, es.N(dr0Var3).i, dr0Var3, 6, 0, 131070);
                List list = (List) ay1Var2.q.getValue();
                Set setG = ay1Var2.g();
                Object objK16 = dr0Var3.K();
                if (objK16 == yyVar) {
                    objK16 = new vw1((byte) 5);
                    dr0Var3.f0(objK16);
                }
                vp0 vp0Var7 = (vp0) objK16;
                boolean zH10 = dr0Var3.h(ay1Var2);
                Object objK17 = dr0Var3.K();
                if (zH10 || objK17 == yyVar) {
                    ay1Var = ay1Var2;
                    objK17 = new i(1, ay1Var, ay1.class, "toggleExcluded", "toggleExcluded(Ljava/lang/String;)V", 0, (byte) 5);
                    dr0Var3.f0(objK17);
                } else {
                    ay1Var = ay1Var2;
                }
                aa3.b(list, setG, vp0Var7, (vp0) ((kq0) objK17), null, dr0Var3, 384, 16);
                String str11 = (String) map.get("excluded");
                if (str11 == null) {
                    dr0Var3.V(-894775659);
                    dr0Var3.p(false);
                    i = 0;
                } else {
                    dr0Var3.V(-894775658);
                    gw2.b(str11, null, ((pv) dr0Var3.j(rv.a)).w, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var3, 0, 0, 262138);
                    i = 0;
                    dr0Var3.p(false);
                }
                h7.T(ay1Var, dr0Var3, i);
                cm cmVar = c5.s;
                yi0 yi0Var2 = yj2.a;
                ua2 ua2VarA2 = ta2.a(uz0.e, cmVar, dr0Var3, 48);
                yy yyVar3 = yyVar;
                int iHashCode4 = Long.hashCode(dr0Var3.T);
                dx1 dx1VarL4 = dr0Var3.l();
                rg1 rg1VarU4 = ls.U(dr0Var3, yi0Var2);
                dr0Var3.Y();
                if (dr0Var3.S) {
                    dr0Var3.k(jw0Var);
                } else {
                    dr0Var3.i0();
                }
                h12.y(yxVar, dr0Var3, ua2VarA2);
                h12.y(yxVar2, dr0Var3, dx1VarL4);
                wi0.p(iHashCode4, dr0Var3, yxVar3, dr0Var3);
                h12.y(yxVar4, dr0Var3, rg1VarU4);
                gw2.b("手动设置营养目标", wa2Var.a(og1Var, 1.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var3, 6, 0, 262140);
                boolean zBooleanValue = ((Boolean) lu1Var.getValue()).booleanValue();
                boolean zH11 = dr0Var3.h(ay1Var);
                Object objK18 = dr0Var3.K();
                if (zH11 || objK18 == yyVar3) {
                    yi0Var = yi0Var2;
                    i iVar = new i(1, ay1Var, ay1.class, "switchManual", "switchManual(Z)V", 0, (byte) 6);
                    dr0Var3.f0(iVar);
                    objK18 = iVar;
                } else {
                    yi0Var = yi0Var2;
                }
                xq2.a(zBooleanValue, (vp0) ((kq0) objK18), null, false, null, dr0Var3, 0);
                dr0Var3.p(true);
                if (((Boolean) lu1Var.getValue()).booleanValue()) {
                    dr0Var3.V(-1137230748);
                    z3 = false;
                    h7.L(ay1Var, dr0Var3, 0);
                } else {
                    z3 = false;
                    dr0Var3.V(-894398481);
                }
                dr0Var3.p(z3);
                String str12 = (String) map.get("manual");
                if (str12 == null) {
                    dr0Var3.V(-894360011);
                } else {
                    dr0Var3.V(-894360010);
                    gw2.b(str12, null, ((pv) dr0Var3.j(rv.a)).w, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var3, 0, 0, 262138);
                    z3 = false;
                }
                dr0Var3.p(z3);
                boolean zH12 = dr0Var3.h(ay1Var);
                Object objK19 = dr0Var3.K();
                if (zH12 || objK19 == yyVar3) {
                    o6 o6Var = new o6(0, ay1Var, ay1.class, "save", "save()V", 0, (byte) 5);
                    dr0Var3.f0(o6Var);
                    objK19 = o6Var;
                }
                aa3.a((kp0) ((kq0) objK19), yi0Var, false, null, null, null, null, null, aa3.o, dr0Var3, 805306416, 508);
                dr0Var3.p(true);
                return j23Var;
            default:
                i4 i4Var = (i4) obj4;
                kp0 kp0Var2 = (kp0) hq0Var;
                dr0 dr0Var4 = (dr0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((bw) obj).getClass();
                if (dr0Var4.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    rg1 rg1VarG2 = t03.G(og1Var, 16.0f);
                    aw awVarA3 = yv.a(new ah(6.0f, new wg((byte) 0)), c5.u, dr0Var4, 6);
                    int iHashCode5 = Long.hashCode(dr0Var4.T);
                    dx1 dx1VarL5 = dr0Var4.l();
                    rg1 rg1VarU5 = ls.U(dr0Var4, rg1VarG2);
                    sy.f.getClass();
                    dr0Var4.Y();
                    if (dr0Var4.S) {
                        dr0Var4.k(jw0Var);
                    } else {
                        dr0Var4.i0();
                    }
                    h12.y(c5.F, dr0Var4, awVarA3);
                    h12.y(c5.E, dr0Var4, dx1VarL5);
                    h12.y(c5.G, dr0Var4, Integer.valueOf(iHashCode5));
                    h12.t(dr0Var4);
                    h12.y(c5.D, dr0Var4, rg1VarU5);
                    ie0 ie0Var = e13.a;
                    gw2.b("智能调整", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var4.j(ie0Var)).i, dr0Var4, 6, 0, 131070);
                    if (i4Var == null) {
                        dr0Var4.V(1147069539);
                        gw2.b("…", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var4, 6, 0, 262142);
                        dr0Var4.p(false);
                    } else if (i4Var instanceof f4) {
                        dr0Var4.V(1147071533);
                        gw2.b(((f4) i4Var).a, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var4, 0, 0, 262142);
                        dr0Var4.p(false);
                    } else if (i4Var instanceof e4) {
                        dr0Var4.V(1147074146);
                        StringBuilder sb = new StringBuilder("数据还不够：需要至少 4 次称重、跨度 14 天以上");
                        e4 e4Var = (e4) i4Var;
                        sb.append("（现在 " + e4Var.a + " 次、" + e4Var.b + " 天）。");
                        long j = e4Var.c;
                        if (j > 0) {
                            sb.append("距上次调整还需 " + j + " 天。");
                        }
                        gw2.b(sb.toString(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var4, 0, 0, 262142);
                        dr0Var4.p(false);
                    } else if (i4Var instanceof g4) {
                        dr0Var4.V(1147086903);
                        g4 g4Var = (g4) i4Var;
                        gw2.b(jp1.k("进度正常：实际每周 ", tz0.I(g4Var.a), " kg，计划 ", tz0.I(g4Var.b), " kg。"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var4, 0, 0, 262142);
                        dr0Var4.p(false);
                    } else if (i4Var instanceof d4) {
                        dr0Var4.V(1147091447);
                        d4 d4Var = (d4) i4Var;
                        gw2.b(jp1.k("实际每周 ", tz0.I(d4Var.a), " kg，比计划 ", tz0.I(d4Var.b), " kg 慢，但热量目标已在安全下限，不再下调。可以考虑增加活动量。"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var4, 0, 0, 262142);
                        dr0Var4.p(false);
                    } else {
                        if (!(i4Var instanceof h4)) {
                            dr0Var4.V(1147069540);
                            dr0Var4.p(false);
                            wg.n();
                            return null;
                        }
                        dr0Var4.V(1200304904);
                        h4 h4Var = (h4) i4Var;
                        gw2.b(wi0.i(wi0.l("实际每周 ", tz0.I(h4Var.c), " kg，计划 ", tz0.I(h4Var.d), " kg。"), h4Var.e, "。"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var4, 0, 0, 262142);
                        double d = h4Var.a;
                        gw2.b(jp1.k("建议每日热量目标 ", d > 0.0d ? "增加" : "减少", " ", t03.t(0, Math.abs(d)), " kcal。"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var4, 0, 0, 262142);
                        aa3.c(kp0Var2, null, false, null, null, null, null, ia2.j, dr0Var4, 805306368, 510);
                        dr0Var4 = dr0Var4;
                        dr0Var4.p(false);
                    }
                    String str13 = this.i;
                    if (str13 == null) {
                        dr0Var4.V(1200677771);
                    } else {
                        dr0Var4.V(1200677772);
                        gw2.b(str13, null, ((pv) dr0Var4.j(rv.a)).j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var4, 0, 0, 262138);
                    }
                    dr0Var4.p(false);
                    gw2.b("仅供参考，不是医疗建议。", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var4.j(ie0Var)).l, dr0Var4, 6, 0, 131070);
                    dr0Var4.p(true);
                } else {
                    dr0Var4.Q();
                }
                return j23Var;
        }
    }

    public /* synthetic */ cc1(Object obj, kp0 kp0Var, String str, byte b) {
        this.h = b;
        this.j = obj;
        this.k = kp0Var;
        this.i = str;
    }
}
