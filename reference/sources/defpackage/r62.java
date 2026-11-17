package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r62 implements aq0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ x62 i;
    public final /* synthetic */ sj1 j;

    public /* synthetic */ r62(x62 x62Var, sj1 sj1Var, byte b) {
        this.h = b;
        this.i = x62Var;
        this.j = sj1Var;
    }

    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        String str;
        byte b = this.h;
        j23 j23Var = j23.a;
        yy yyVar = zy.a;
        sj1 sj1Var = this.j;
        final byte b2 = 1;
        switch (b) {
            case 0:
                yx yxVar = c5.D;
                yx yxVar2 = c5.G;
                yx yxVar3 = c5.E;
                yx yxVar4 = c5.F;
                pt1 pt1Var = (pt1) obj;
                dr0 dr0Var = (dr0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                xg xgVar = uz0.e;
                cm cmVar = c5.s;
                pt1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dr0Var.f(pt1Var) ? 4 : 2;
                }
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    dr0Var.Q();
                    return j23Var;
                }
                final x62 x62Var = this.i;
                boolean zBooleanValue = ((Boolean) x62Var.d.getValue()).booleanValue();
                og1 og1Var = og1.h;
                if (!zBooleanValue) {
                    dr0Var.V(-555412806);
                    e42.a(t03.G(t03.F(og1Var, pt1Var), 32.0f), 0L, 0.0f, 0L, 0, 0.0f, dr0Var, 0, 62);
                    dr0Var.p(false);
                    return j23Var;
                }
                dr0Var.V(-555328238);
                dr0Var.p(false);
                Map map = (Map) x62Var.q.getValue();
                rg1 rg1VarC = uz0.C(t03.G(ia2.p(t03.F(yj2.b, pt1Var)), 16.0f), uz0.v(dr0Var));
                aw awVarA = yv.a(new ah(8.0f, new wg((byte) 0)), c5.u, dr0Var, 6);
                int iHashCode = Long.hashCode(dr0Var.T);
                dx1 dx1VarL = dr0Var.l();
                rg1 rg1VarU = ls.U(dr0Var, rg1VarC);
                sy.f.getClass();
                dr0Var.Y();
                boolean z = dr0Var.S;
                jw0 jw0Var = l41.W;
                if (z) {
                    dr0Var.k(jw0Var);
                } else {
                    dr0Var.i0();
                }
                h12.y(yxVar4, dr0Var, awVarA);
                h12.y(yxVar3, dr0Var, dx1VarL);
                wi0.p(iHashCode, dr0Var, yxVar2, dr0Var);
                h12.y(yxVar, dr0Var, rg1VarU);
                String str2 = (String) x62Var.e.getValue();
                boolean zH = dr0Var.h(x62Var);
                Object objK = dr0Var.K();
                if (zH || objK == yyVar) {
                    final byte b3 = 0;
                    objK = new vp0() { // from class: u62
                        @Override // defpackage.vp0
                        public final Object h(Object obj4) {
                            byte b4 = b3;
                            j23 j23Var2 = j23.a;
                            x62 x62Var2 = x62Var;
                            switch (b4) {
                                case 0:
                                    String str3 = (String) obj4;
                                    str3.getClass();
                                    x62Var2.e.setValue(str3);
                                    break;
                                case 1:
                                    zr zrVar = (zr) obj4;
                                    zrVar.getClass();
                                    x62Var2.f.setValue(zrVar);
                                    break;
                                case 2:
                                    cf2 cf2Var = (cf2) obj4;
                                    cf2Var.getClass();
                                    x62Var2.h.setValue(cf2Var);
                                    break;
                                case 3:
                                    String str4 = (String) obj4;
                                    str4.getClass();
                                    x62Var2.i.setValue(str4);
                                    break;
                                case 4:
                                    String str5 = (String) obj4;
                                    str5.getClass();
                                    x62Var2.j.setValue(str5);
                                    break;
                                default:
                                    Boolean bool = (Boolean) obj4;
                                    bool.booleanValue();
                                    x62Var2.k.setValue(bool);
                                    break;
                            }
                            return j23Var2;
                        }
                    };
                    dr0Var.f0(objK);
                }
                vp0 vp0Var = (vp0) objK;
                String str3 = (String) map.get("name");
                if (str3 == null) {
                    str3 = (String) map.get("id");
                }
                String str4 = str3;
                cm cmVar2 = cmVar;
                Map map2 = map;
                t03.h("菜名", str2, vp0Var, str4, null, 0, dr0Var, 6, 48);
                ie0 ie0Var = e13.a;
                gw2.b("类别", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var.j(ie0Var)).i, dr0Var, 6, 0, 131070);
                Set setC = r02.C((zr) x62Var.f.getValue());
                Object objK2 = dr0Var.K();
                if (objK2 == yyVar) {
                    objK2 = new vw1((byte) 19);
                    dr0Var.f0(objK2);
                }
                vp0 vp0Var2 = (vp0) objK2;
                boolean zH2 = dr0Var.h(x62Var);
                Object objK3 = dr0Var.K();
                if (zH2 || objK3 == yyVar) {
                    objK3 = new vp0() { // from class: u62
                        @Override // defpackage.vp0
                        public final Object h(Object obj4) {
                            byte b4 = b2;
                            j23 j23Var2 = j23.a;
                            x62 x62Var2 = x62Var;
                            switch (b4) {
                                case 0:
                                    String str5 = (String) obj4;
                                    str5.getClass();
                                    x62Var2.e.setValue(str5);
                                    break;
                                case 1:
                                    zr zrVar = (zr) obj4;
                                    zrVar.getClass();
                                    x62Var2.f.setValue(zrVar);
                                    break;
                                case 2:
                                    cf2 cf2Var = (cf2) obj4;
                                    cf2Var.getClass();
                                    x62Var2.h.setValue(cf2Var);
                                    break;
                                case 3:
                                    String str6 = (String) obj4;
                                    str6.getClass();
                                    x62Var2.i.setValue(str6);
                                    break;
                                case 4:
                                    String str7 = (String) obj4;
                                    str7.getClass();
                                    x62Var2.j.setValue(str7);
                                    break;
                                default:
                                    Boolean bool = (Boolean) obj4;
                                    bool.booleanValue();
                                    x62Var2.k.setValue(bool);
                                    break;
                            }
                            return j23Var2;
                        }
                    };
                    dr0Var.f0(objK3);
                }
                aa3.b(zr.p, setC, vp0Var2, (vp0) objK3, null, dr0Var, 384, 16);
                gw2.b("适用餐次", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var.j(ie0Var)).i, dr0Var, 6, 0, 131070);
                Set set = (Set) x62Var.g.getValue();
                Object objK4 = dr0Var.K();
                if (objK4 == yyVar) {
                    objK4 = new vw1((byte) 20);
                    dr0Var.f0(objK4);
                }
                vp0 vp0Var3 = (vp0) objK4;
                boolean zH3 = dr0Var.h(x62Var);
                Object objK5 = dr0Var.K();
                if (zH3 || objK5 == yyVar) {
                    objK5 = new i(1, x62Var, x62.class, "toggleMeal", "toggleMeal(Lcom/familymeal/core/model/MealType;)V", 0, (byte) 10);
                    dr0Var.f0(objK5);
                }
                aa3.b(te1.o, set, vp0Var3, (vp0) ((kq0) objK5), null, dr0Var, 384, 16);
                dr0 dr0Var2 = dr0Var;
                String str5 = (String) map2.get("meals");
                if (str5 == null) {
                    dr0Var2.V(-1322616242);
                } else {
                    dr0Var2.V(-1322616241);
                    gw2.b(str5, null, ((pv) dr0Var2.j(rv.a)).w, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var2, 0, 0, 262138);
                    dr0Var2 = dr0Var2;
                }
                dr0Var2.p(false);
                dr0 dr0Var3 = dr0Var2;
                gw2.b("季节", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var2.j(ie0Var)).i, dr0Var3, 6, 0, 131070);
                Set setC2 = r02.C((cf2) x62Var.h.getValue());
                Object objK6 = dr0Var3.K();
                if (objK6 == yyVar) {
                    objK6 = new vw1((byte) 21);
                    dr0Var3.f0(objK6);
                }
                vp0 vp0Var4 = (vp0) objK6;
                boolean zH4 = dr0Var3.h(x62Var);
                Object objK7 = dr0Var3.K();
                if (zH4 || objK7 == yyVar) {
                    final byte b4 = 2;
                    objK7 = new vp0() { // from class: u62
                        @Override // defpackage.vp0
                        public final Object h(Object obj4) {
                            byte b5 = b4;
                            j23 j23Var2 = j23.a;
                            x62 x62Var2 = x62Var;
                            switch (b5) {
                                case 0:
                                    String str6 = (String) obj4;
                                    str6.getClass();
                                    x62Var2.e.setValue(str6);
                                    break;
                                case 1:
                                    zr zrVar = (zr) obj4;
                                    zrVar.getClass();
                                    x62Var2.f.setValue(zrVar);
                                    break;
                                case 2:
                                    cf2 cf2Var = (cf2) obj4;
                                    cf2Var.getClass();
                                    x62Var2.h.setValue(cf2Var);
                                    break;
                                case 3:
                                    String str7 = (String) obj4;
                                    str7.getClass();
                                    x62Var2.i.setValue(str7);
                                    break;
                                case 4:
                                    String str8 = (String) obj4;
                                    str8.getClass();
                                    x62Var2.j.setValue(str8);
                                    break;
                                default:
                                    Boolean bool = (Boolean) obj4;
                                    bool.booleanValue();
                                    x62Var2.k.setValue(bool);
                                    break;
                            }
                            return j23Var2;
                        }
                    };
                    dr0Var3.f0(objK7);
                }
                aa3.b(cf2.n, setC2, vp0Var4, (vp0) objK7, null, dr0Var3, 384, 16);
                ua2 ua2VarA = ta2.a(new ah(8.0f, new wg((byte) 0)), c5.r, dr0Var3, 6);
                int iHashCode2 = Long.hashCode(dr0Var3.T);
                dx1 dx1VarL2 = dr0Var3.l();
                rg1 rg1VarU2 = ls.U(dr0Var3, og1Var);
                dr0Var3.Y();
                if (dr0Var3.S) {
                    dr0Var3.k(jw0Var);
                } else {
                    dr0Var3.i0();
                }
                h12.y(yxVar4, dr0Var3, ua2VarA);
                h12.y(yxVar3, dr0Var3, dx1VarL2);
                wi0.p(iHashCode2, dr0Var3, yxVar2, dr0Var3);
                h12.y(yxVar, dr0Var3, rg1VarU2);
                String str6 = (String) x62Var.i.getValue();
                boolean zH5 = dr0Var3.h(x62Var);
                Object objK8 = dr0Var3.K();
                if (zH5 || objK8 == yyVar) {
                    final byte b5 = 3;
                    objK8 = new vp0() { // from class: u62
                        @Override // defpackage.vp0
                        public final Object h(Object obj4) {
                            byte b6 = b5;
                            j23 j23Var2 = j23.a;
                            x62 x62Var2 = x62Var;
                            switch (b6) {
                                case 0:
                                    String str7 = (String) obj4;
                                    str7.getClass();
                                    x62Var2.e.setValue(str7);
                                    break;
                                case 1:
                                    zr zrVar = (zr) obj4;
                                    zrVar.getClass();
                                    x62Var2.f.setValue(zrVar);
                                    break;
                                case 2:
                                    cf2 cf2Var = (cf2) obj4;
                                    cf2Var.getClass();
                                    x62Var2.h.setValue(cf2Var);
                                    break;
                                case 3:
                                    String str8 = (String) obj4;
                                    str8.getClass();
                                    x62Var2.i.setValue(str8);
                                    break;
                                case 4:
                                    String str9 = (String) obj4;
                                    str9.getClass();
                                    x62Var2.j.setValue(str9);
                                    break;
                                default:
                                    Boolean bool = (Boolean) obj4;
                                    bool.booleanValue();
                                    x62Var2.k.setValue(bool);
                                    break;
                            }
                            return j23Var2;
                        }
                    };
                    dr0Var3.f0(objK8);
                }
                String str7 = (String) map2.get("servings");
                wa2 wa2Var = wa2.a;
                t03.e("基准份数", str6, (vp0) objK8, str7, wa2Var.a(og1Var, 1.0f), true, "份", dr0Var3, 1769478, 0);
                String str8 = (String) x62Var.j.getValue();
                boolean zH6 = dr0Var3.h(x62Var);
                Object objK9 = dr0Var3.K();
                if (zH6 || objK9 == yyVar) {
                    final byte b6 = 4;
                    objK9 = new vp0() { // from class: u62
                        @Override // defpackage.vp0
                        public final Object h(Object obj4) {
                            byte b7 = b6;
                            j23 j23Var2 = j23.a;
                            x62 x62Var2 = x62Var;
                            switch (b7) {
                                case 0:
                                    String str9 = (String) obj4;
                                    str9.getClass();
                                    x62Var2.e.setValue(str9);
                                    break;
                                case 1:
                                    zr zrVar = (zr) obj4;
                                    zrVar.getClass();
                                    x62Var2.f.setValue(zrVar);
                                    break;
                                case 2:
                                    cf2 cf2Var = (cf2) obj4;
                                    cf2Var.getClass();
                                    x62Var2.h.setValue(cf2Var);
                                    break;
                                case 3:
                                    String str10 = (String) obj4;
                                    str10.getClass();
                                    x62Var2.i.setValue(str10);
                                    break;
                                case 4:
                                    String str11 = (String) obj4;
                                    str11.getClass();
                                    x62Var2.j.setValue(str11);
                                    break;
                                default:
                                    Boolean bool = (Boolean) obj4;
                                    bool.booleanValue();
                                    x62Var2.k.setValue(bool);
                                    break;
                            }
                            return j23Var2;
                        }
                    };
                    dr0Var3.f0(objK9);
                }
                t03.e("最少用餐人数", str8, (vp0) objK9, (String) map2.get("minDiners"), wa2Var.a(og1Var, 1.0f), true, "人", dr0Var3, 1769478, 0);
                dr0Var3.p(true);
                yi0 yi0Var = yj2.a;
                ua2 ua2VarA2 = ta2.a(xgVar, cmVar2, dr0Var3, 48);
                int iHashCode3 = Long.hashCode(dr0Var3.T);
                dx1 dx1VarL3 = dr0Var3.l();
                rg1 rg1VarU3 = ls.U(dr0Var3, yi0Var);
                dr0Var3.Y();
                if (dr0Var3.S) {
                    dr0Var3.k(jw0Var);
                } else {
                    dr0Var3.i0();
                }
                h12.y(yxVar4, dr0Var3, ua2VarA2);
                h12.y(yxVar3, dr0Var3, dx1VarL3);
                wi0.p(iHashCode3, dr0Var3, yxVar2, dr0Var3);
                h12.y(yxVar, dr0Var3, rg1VarU3);
                rg1 rg1VarA = wa2Var.a(og1Var, 1.0f);
                xg xgVar2 = xgVar;
                int i = 48;
                gw2.b("快手菜（30 分钟以内）", rg1VarA, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var3, 6, 0, 262140);
                boolean zBooleanValue2 = ((Boolean) x62Var.k.getValue()).booleanValue();
                boolean zH7 = dr0Var3.h(x62Var);
                Object objK10 = dr0Var3.K();
                if (zH7 || objK10 == yyVar) {
                    final byte b7 = 5;
                    objK10 = new vp0() { // from class: u62
                        @Override // defpackage.vp0
                        public final Object h(Object obj4) {
                            byte b8 = b7;
                            j23 j23Var2 = j23.a;
                            x62 x62Var2 = x62Var;
                            switch (b8) {
                                case 0:
                                    String str9 = (String) obj4;
                                    str9.getClass();
                                    x62Var2.e.setValue(str9);
                                    break;
                                case 1:
                                    zr zrVar = (zr) obj4;
                                    zrVar.getClass();
                                    x62Var2.f.setValue(zrVar);
                                    break;
                                case 2:
                                    cf2 cf2Var = (cf2) obj4;
                                    cf2Var.getClass();
                                    x62Var2.h.setValue(cf2Var);
                                    break;
                                case 3:
                                    String str10 = (String) obj4;
                                    str10.getClass();
                                    x62Var2.i.setValue(str10);
                                    break;
                                case 4:
                                    String str11 = (String) obj4;
                                    str11.getClass();
                                    x62Var2.j.setValue(str11);
                                    break;
                                default:
                                    Boolean bool = (Boolean) obj4;
                                    bool.booleanValue();
                                    x62Var2.k.setValue(bool);
                                    break;
                            }
                            return j23Var2;
                        }
                    };
                    dr0Var3.f0(objK10);
                }
                xq2.a(zBooleanValue2, (vp0) objK10, null, false, null, dr0Var3, 0);
                dr0Var3.p(true);
                gw2.b("规则标签", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var3.j(ie0Var)).i, dr0Var3, 6, 0, 131070);
                dr0 dr0Var4 = dr0Var3;
                dr0Var4.V(-1012465983);
                for (wt1 wt1Var : v62.a) {
                    String str9 = (String) wt1Var.h;
                    String str10 = (String) wt1Var.i;
                    yi0 yi0Var2 = yj2.a;
                    ba2 ba2Var = new ba2(1);
                    boolean zH8 = dr0Var4.h(x62Var) | dr0Var4.f(str9);
                    Object objK11 = dr0Var4.K();
                    if (zH8 || objK11 == yyVar) {
                        objK11 = new h6(x62Var, str9, (byte) 29);
                        dr0Var4.f0(objK11);
                    }
                    rg1 rg1VarX = h7.X(yi0Var2, false, null, ba2Var, (kp0) objK11, 11);
                    ua2 ua2VarA3 = ta2.a(xgVar2, cmVar2, dr0Var4, i);
                    xg xgVar3 = xgVar2;
                    int iHashCode4 = Long.hashCode(dr0Var4.T);
                    dx1 dx1VarL4 = dr0Var4.l();
                    rg1 rg1VarU4 = ls.U(dr0Var4, rg1VarX);
                    sy.f.getClass();
                    dr0Var4.Y();
                    if (dr0Var4.S) {
                        dr0Var4.k(jw0Var);
                    } else {
                        dr0Var4.i0();
                    }
                    h12.y(yxVar4, dr0Var4, ua2VarA3);
                    h12.y(yxVar3, dr0Var4, dx1VarL4);
                    wi0.p(iHashCode4, dr0Var4, yxVar2, dr0Var4);
                    h12.y(yxVar, dr0Var4, rg1VarU4);
                    dt.f(x62Var.f().contains(str9), null, false, null, dr0Var4, 48);
                    dr0 dr0Var5 = dr0Var4;
                    gw2.b(str10, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var5, 0, 0, 262142);
                    dr0Var4 = dr0Var5;
                    dr0Var4.p(true);
                    xgVar2 = xgVar3;
                    i = 48;
                }
                xg xgVar4 = xgVar2;
                dr0Var4.p(false);
                dr0 dr0Var6 = dr0Var4;
                gw2.b("食材（整道菜用量）", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var4.j(e13.a)).i, dr0Var6, 6, 0, 131070);
                dr0 dr0Var7 = dr0Var6;
                dr0Var7.V(-1012450200);
                Iterator it = x62Var.e().iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        lt.h0();
                        throw null;
                    }
                    w62 w62Var = (w62) next;
                    uv0 uv0Var = (uv0) ((Map) x62Var.o.getValue()).get(w62Var.a);
                    yi0 yi0Var3 = yj2.a;
                    Iterator it2 = it;
                    Map map3 = map2;
                    xg xgVar5 = xgVar4;
                    ua2 ua2VarA4 = ta2.a(xgVar5, cmVar2, dr0Var7, 48);
                    int i4 = i2;
                    int iHashCode5 = Long.hashCode(dr0Var7.T);
                    dx1 dx1VarL5 = dr0Var7.l();
                    rg1 rg1VarU5 = ls.U(dr0Var7, yi0Var3);
                    sy.f.getClass();
                    dr0Var7.Y();
                    cm cmVar3 = cmVar2;
                    if (dr0Var7.S) {
                        dr0Var7.k(jw0Var);
                    } else {
                        dr0Var7.i0();
                    }
                    h12.y(yxVar4, dr0Var7, ua2VarA4);
                    h12.y(yxVar3, dr0Var7, dx1VarL5);
                    wi0.p(iHashCode5, dr0Var7, yxVar2, dr0Var7);
                    h12.y(yxVar, dr0Var7, rg1VarU5);
                    if (uv0Var == null || (str = uv0Var.b) == null) {
                        str = w62Var.a;
                    }
                    dr0 dr0Var8 = dr0Var7;
                    gw2.b(str, new b51(1.0f, true), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var8, 0, 0, 262140);
                    String str11 = w62Var.b;
                    boolean zH9 = dr0Var8.h(x62Var) | dr0Var8.d(i4);
                    Object objK12 = dr0Var8.K();
                    if (zH9 || objK12 == yyVar) {
                        objK12 = new ao0(x62Var, i4, (byte) 2);
                        dr0Var8.f0(objK12);
                    }
                    t03.e("用量", str11, (vp0) objK12, null, new xj2(140.0f, 0.0f, 140.0f, 0.0f, true, 10), false, "g", dr0Var8, 1600518, 32);
                    boolean zH10 = dr0Var8.h(x62Var) | dr0Var8.d(i4);
                    Object objK13 = dr0Var8.K();
                    if (zH10 || objK13 == yyVar) {
                        objK13 = new j60(x62Var, i4, (byte) 1);
                        dr0Var8.f0(objK13);
                    }
                    cu.e((kp0) objK13, null, false, null, null, dt.N(-38003633, new s(uv0Var, (byte) 18), dr0Var8), dr0Var8, 1572864, 62);
                    dr0Var7 = dr0Var8;
                    dr0Var7.p(true);
                    it = it2;
                    xgVar4 = xgVar5;
                    i2 = i3;
                    map2 = map3;
                    cmVar2 = cmVar3;
                }
                boolean z2 = false;
                dr0Var7.p(false);
                String str12 = (String) map2.get("ingredients");
                if (str12 == null) {
                    dr0Var7.V(-1320611410);
                } else {
                    dr0Var7.V(-1320611409);
                    dr0 dr0Var9 = dr0Var7;
                    gw2.b(str12, null, ((pv) dr0Var7.j(rv.a)).w, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var9, 0, 0, 262138);
                    dr0Var7 = dr0Var9;
                    z2 = false;
                }
                dr0Var7.p(z2);
                boolean zF = dr0Var7.f(sj1Var);
                Object objK14 = dr0Var7.K();
                if (zF || objK14 == yyVar) {
                    objK14 = new bb(sj1Var, (byte) 26);
                    dr0Var7.f0(objK14);
                }
                dr0 dr0Var10 = dr0Var7;
                aa3.c((kp0) objK14, null, false, null, null, null, null, h7.u, dr0Var10, 805306368, 510);
                dr0 dr0Var11 = dr0Var10;
                boolean z3 = false;
                v62.b(x62Var, dr0Var11, 0);
                String str13 = (String) map2.get("total");
                if (str13 == null) {
                    dr0Var11.V(-1320327698);
                } else {
                    dr0Var11.V(-1320327697);
                    gw2.b(str13, null, ((pv) dr0Var11.j(rv.a)).w, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var11, 0, 0, 262138);
                    dr0Var11 = dr0Var11;
                    z3 = false;
                }
                dr0Var11.p(z3);
                String str14 = (String) map2.get("tags");
                if (str14 == null) {
                    dr0Var11.V(-1320242386);
                } else {
                    dr0Var11.V(-1320242385);
                    dr0 dr0Var12 = dr0Var11;
                    gw2.b(str14, null, ((pv) dr0Var11.j(rv.a)).w, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var12, 0, 0, 262138);
                    dr0Var11 = dr0Var12;
                    z3 = false;
                }
                dr0Var11.p(z3);
                boolean zH11 = dr0Var11.h(x62Var);
                Object objK15 = dr0Var11.K();
                if (zH11 || objK15 == yyVar) {
                    objK15 = new o6(0, x62Var, x62.class, "save", "save()V", 0, (byte) 6);
                    dr0Var11.f0(objK15);
                }
                dr0 dr0Var13 = dr0Var11;
                aa3.a((kp0) ((kq0) objK15), yj2.a, false, null, null, null, null, null, h7.v, dr0Var13, 805306416, 508);
                dr0Var13.p(true);
                return j23Var;
            default:
                dr0 dr0Var14 = (dr0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (dr0Var14.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    if (this.i.c == null) {
                        dr0Var14.V(-1029788724);
                    } else {
                        dr0Var14.V(1213703743);
                        boolean zF2 = dr0Var14.f(sj1Var);
                        Object objK16 = dr0Var14.K();
                        if (zF2 || objK16 == yyVar) {
                            objK16 = new bb(sj1Var, (byte) 27);
                            dr0Var14.f0(objK16);
                        }
                        cu.e((kp0) objK16, null, false, null, null, h7.t, dr0Var14, 1572864, 62);
                    }
                    dr0Var14.p(false);
                } else {
                    dr0Var14.Q();
                }
                return j23Var;
        }
    }
}
