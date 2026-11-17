package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kw0 implements aq0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ kw0(ok1 ok1Var, nk1 nk1Var) {
        this.h = (byte) 5;
        this.i = ok1Var;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0609  */
    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        dr0 dr0Var;
        int i;
        byte b = this.h;
        jw0 jw0Var = l41.W;
        final byte b2 = 2;
        byte b3 = 5;
        byte b4 = 3;
        yy yyVar = zy.a;
        og1 og1Var = og1.h;
        byte b5 = 6;
        boolean z = true;
        boolean z2 = true;
        j23 j23Var = j23.a;
        Object obj4 = this.i;
        boolean z3 = false;
        switch (b) {
            case 0:
                final lw0 lw0Var = (lw0) obj4;
                lu1 lu1Var = lw0Var.f;
                pt1 pt1Var = (pt1) obj;
                dr0 dr0Var2 = (dr0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                pt1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dr0Var2.f(pt1Var) ? 4 : 2;
                }
                if (!dr0Var2.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    dr0Var2.Q();
                } else if (((Boolean) lw0Var.d.getValue()).booleanValue()) {
                    dr0Var2.V(-1228626472);
                    dr0Var2.p(false);
                    rg1 rg1VarC = uz0.C(t03.G(ia2.p(t03.F(yj2.b, pt1Var)), 16.0f), uz0.v(dr0Var2));
                    aw awVarA = yv.a(new ah(8.0f, new wg((byte) 0)), c5.u, dr0Var2, 6);
                    int iHashCode = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL = dr0Var2.l();
                    rg1 rg1VarU = ls.U(dr0Var2, rg1VarC);
                    sy.f.getClass();
                    dr0Var2.Y();
                    if (dr0Var2.S) {
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
                    Map map = (Map) lw0Var.l.getValue();
                    String str = (String) lw0Var.e.getValue();
                    boolean zH = dr0Var2.h(lw0Var);
                    Object objK = dr0Var2.K();
                    if (zH || objK == yyVar) {
                        final byte b6 = z3 ? (byte) 1 : (byte) 0;
                        objK = new vp0() { // from class: ew0
                            @Override // defpackage.vp0
                            public final Object h(Object obj5) {
                                byte b7 = b6;
                                j23 j23Var2 = j23.a;
                                lw0 lw0Var2 = lw0Var;
                                String str2 = (String) obj5;
                                switch (b7) {
                                    case 0:
                                        str2.getClass();
                                        lw0Var2.e.setValue(str2);
                                        break;
                                    case 1:
                                        str2.getClass();
                                        lw0Var2.f.setValue(str2);
                                        break;
                                    case 2:
                                        str2.getClass();
                                        lw0Var2.f.setValue(str2);
                                        break;
                                    case 3:
                                        str2.getClass();
                                        lw0Var2.g.setValue(str2);
                                        break;
                                    case 4:
                                        str2.getClass();
                                        lw0Var2.h.setValue(str2);
                                        break;
                                    case 5:
                                        str2.getClass();
                                        lw0Var2.i.setValue(str2);
                                        break;
                                    case 6:
                                        str2.getClass();
                                        lw0Var2.j.setValue(str2);
                                        break;
                                    default:
                                        str2.getClass();
                                        lw0Var2.k.setValue(str2);
                                        break;
                                }
                                return j23Var2;
                            }
                        };
                        dr0Var2.f0(objK);
                    }
                    vp0 vp0Var = (vp0) objK;
                    String str2 = (String) map.get("name");
                    if (str2 == null) {
                        str2 = (String) map.get("id");
                    }
                    t03.h("名称", str, vp0Var, str2, null, 0, dr0Var2, 6, 48);
                    String str3 = (String) lu1Var.getValue();
                    boolean zH2 = dr0Var2.h(lw0Var);
                    Object objK2 = dr0Var2.K();
                    if (zH2 || objK2 == yyVar) {
                        final boolean z4 = z2 ? 1 : 0;
                        objK2 = new vp0() { // from class: ew0
                            @Override // defpackage.vp0
                            public final Object h(Object obj5) {
                                byte b7 = z4;
                                j23 j23Var2 = j23.a;
                                lw0 lw0Var2 = lw0Var;
                                String str4 = (String) obj5;
                                switch (b7) {
                                    case 0:
                                        str4.getClass();
                                        lw0Var2.e.setValue(str4);
                                        break;
                                    case 1:
                                        str4.getClass();
                                        lw0Var2.f.setValue(str4);
                                        break;
                                    case 2:
                                        str4.getClass();
                                        lw0Var2.f.setValue(str4);
                                        break;
                                    case 3:
                                        str4.getClass();
                                        lw0Var2.g.setValue(str4);
                                        break;
                                    case 4:
                                        str4.getClass();
                                        lw0Var2.h.setValue(str4);
                                        break;
                                    case 5:
                                        str4.getClass();
                                        lw0Var2.i.setValue(str4);
                                        break;
                                    case 6:
                                        str4.getClass();
                                        lw0Var2.j.setValue(str4);
                                        break;
                                    default:
                                        str4.getClass();
                                        lw0Var2.k.setValue(str4);
                                        break;
                                }
                                return j23Var2;
                            }
                        };
                        dr0Var2.f0(objK2);
                    }
                    t03.h("类别", str3, (vp0) objK2, (String) map.get("category"), null, 20, dr0Var2, 196614, 16);
                    List listN0 = dv.N0((List) lw0Var.m.getValue(), 20);
                    Set setC = r02.C((String) lu1Var.getValue());
                    Object objK3 = dr0Var2.K();
                    if (objK3 == yyVar) {
                        objK3 = new vv0((byte) 3);
                        dr0Var2.f0(objK3);
                    }
                    vp0 vp0Var2 = (vp0) objK3;
                    boolean zH3 = dr0Var2.h(lw0Var);
                    Object objK4 = dr0Var2.K();
                    if (zH3 || objK4 == yyVar) {
                        objK4 = new vp0() { // from class: ew0
                            @Override // defpackage.vp0
                            public final Object h(Object obj5) {
                                byte b7 = b2;
                                j23 j23Var2 = j23.a;
                                lw0 lw0Var2 = lw0Var;
                                String str4 = (String) obj5;
                                switch (b7) {
                                    case 0:
                                        str4.getClass();
                                        lw0Var2.e.setValue(str4);
                                        break;
                                    case 1:
                                        str4.getClass();
                                        lw0Var2.f.setValue(str4);
                                        break;
                                    case 2:
                                        str4.getClass();
                                        lw0Var2.f.setValue(str4);
                                        break;
                                    case 3:
                                        str4.getClass();
                                        lw0Var2.g.setValue(str4);
                                        break;
                                    case 4:
                                        str4.getClass();
                                        lw0Var2.h.setValue(str4);
                                        break;
                                    case 5:
                                        str4.getClass();
                                        lw0Var2.i.setValue(str4);
                                        break;
                                    case 6:
                                        str4.getClass();
                                        lw0Var2.j.setValue(str4);
                                        break;
                                    default:
                                        str4.getClass();
                                        lw0Var2.k.setValue(str4);
                                        break;
                                }
                                return j23Var2;
                            }
                        };
                        dr0Var2.f0(objK4);
                    }
                    aa3.b(listN0, setC, vp0Var2, (vp0) objK4, null, dr0Var2, 384, 16);
                    gw2.b("每 100 克含量", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var2.j(e13.a)).i, dr0Var2, 6, 0, 131070);
                    String str4 = (String) lw0Var.g.getValue();
                    boolean zH4 = dr0Var2.h(lw0Var);
                    Object objK5 = dr0Var2.K();
                    if (zH4 || objK5 == yyVar) {
                        final byte b7 = 3;
                        objK5 = new vp0() { // from class: ew0
                            @Override // defpackage.vp0
                            public final Object h(Object obj5) {
                                byte b8 = b7;
                                j23 j23Var2 = j23.a;
                                lw0 lw0Var2 = lw0Var;
                                String str5 = (String) obj5;
                                switch (b8) {
                                    case 0:
                                        str5.getClass();
                                        lw0Var2.e.setValue(str5);
                                        break;
                                    case 1:
                                        str5.getClass();
                                        lw0Var2.f.setValue(str5);
                                        break;
                                    case 2:
                                        str5.getClass();
                                        lw0Var2.f.setValue(str5);
                                        break;
                                    case 3:
                                        str5.getClass();
                                        lw0Var2.g.setValue(str5);
                                        break;
                                    case 4:
                                        str5.getClass();
                                        lw0Var2.h.setValue(str5);
                                        break;
                                    case 5:
                                        str5.getClass();
                                        lw0Var2.i.setValue(str5);
                                        break;
                                    case 6:
                                        str5.getClass();
                                        lw0Var2.j.setValue(str5);
                                        break;
                                    default:
                                        str5.getClass();
                                        lw0Var2.k.setValue(str5);
                                        break;
                                }
                                return j23Var2;
                            }
                        };
                        dr0Var2.f0(objK5);
                    }
                    String str5 = (String) map.get("kcal");
                    yi0 yi0Var = yj2.a;
                    t03.e("热量", str4, (vp0) objK5, str5, yi0Var, false, "kcal", dr0Var2, 1597446, 32);
                    ah ahVar = new ah(8.0f, new wg((byte) 0));
                    cm cmVar = c5.r;
                    ua2 ua2VarA = ta2.a(ahVar, cmVar, dr0Var2, 6);
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
                    String str6 = (String) lw0Var.h.getValue();
                    boolean zH5 = dr0Var2.h(lw0Var);
                    Object objK6 = dr0Var2.K();
                    if (zH5 || objK6 == yyVar) {
                        final byte b8 = 4;
                        objK6 = new vp0() { // from class: ew0
                            @Override // defpackage.vp0
                            public final Object h(Object obj5) {
                                byte b9 = b8;
                                j23 j23Var2 = j23.a;
                                lw0 lw0Var2 = lw0Var;
                                String str7 = (String) obj5;
                                switch (b9) {
                                    case 0:
                                        str7.getClass();
                                        lw0Var2.e.setValue(str7);
                                        break;
                                    case 1:
                                        str7.getClass();
                                        lw0Var2.f.setValue(str7);
                                        break;
                                    case 2:
                                        str7.getClass();
                                        lw0Var2.f.setValue(str7);
                                        break;
                                    case 3:
                                        str7.getClass();
                                        lw0Var2.g.setValue(str7);
                                        break;
                                    case 4:
                                        str7.getClass();
                                        lw0Var2.h.setValue(str7);
                                        break;
                                    case 5:
                                        str7.getClass();
                                        lw0Var2.i.setValue(str7);
                                        break;
                                    case 6:
                                        str7.getClass();
                                        lw0Var2.j.setValue(str7);
                                        break;
                                    default:
                                        str7.getClass();
                                        lw0Var2.k.setValue(str7);
                                        break;
                                }
                                return j23Var2;
                            }
                        };
                        dr0Var2.f0(objK6);
                    }
                    String str7 = (String) map.get("protein");
                    wa2 wa2Var = wa2.a;
                    t03.e("蛋白质", str6, (vp0) objK6, str7, wa2Var.a(og1Var, 1.0f), false, "g", dr0Var2, 1572870, 32);
                    String str8 = (String) lw0Var.i.getValue();
                    boolean zH6 = dr0Var2.h(lw0Var);
                    Object objK7 = dr0Var2.K();
                    if (zH6 || objK7 == yyVar) {
                        final byte b9 = 5;
                        objK7 = new vp0() { // from class: ew0
                            @Override // defpackage.vp0
                            public final Object h(Object obj5) {
                                byte b10 = b9;
                                j23 j23Var2 = j23.a;
                                lw0 lw0Var2 = lw0Var;
                                String str9 = (String) obj5;
                                switch (b10) {
                                    case 0:
                                        str9.getClass();
                                        lw0Var2.e.setValue(str9);
                                        break;
                                    case 1:
                                        str9.getClass();
                                        lw0Var2.f.setValue(str9);
                                        break;
                                    case 2:
                                        str9.getClass();
                                        lw0Var2.f.setValue(str9);
                                        break;
                                    case 3:
                                        str9.getClass();
                                        lw0Var2.g.setValue(str9);
                                        break;
                                    case 4:
                                        str9.getClass();
                                        lw0Var2.h.setValue(str9);
                                        break;
                                    case 5:
                                        str9.getClass();
                                        lw0Var2.i.setValue(str9);
                                        break;
                                    case 6:
                                        str9.getClass();
                                        lw0Var2.j.setValue(str9);
                                        break;
                                    default:
                                        str9.getClass();
                                        lw0Var2.k.setValue(str9);
                                        break;
                                }
                                return j23Var2;
                            }
                        };
                        dr0Var2.f0(objK7);
                    }
                    t03.e("脂肪", str8, (vp0) objK7, (String) map.get("fat"), wa2Var.a(og1Var, 1.0f), false, "g", dr0Var2, 1572870, 32);
                    dr0Var2.p(true);
                    ua2 ua2VarA2 = ta2.a(new ah(8.0f, new wg((byte) 0)), cmVar, dr0Var2, 6);
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
                    String str9 = (String) lw0Var.j.getValue();
                    boolean zH7 = dr0Var2.h(lw0Var);
                    Object objK8 = dr0Var2.K();
                    if (zH7 || objK8 == yyVar) {
                        final byte b10 = 6;
                        objK8 = new vp0() { // from class: ew0
                            @Override // defpackage.vp0
                            public final Object h(Object obj5) {
                                byte b11 = b10;
                                j23 j23Var2 = j23.a;
                                lw0 lw0Var2 = lw0Var;
                                String str10 = (String) obj5;
                                switch (b11) {
                                    case 0:
                                        str10.getClass();
                                        lw0Var2.e.setValue(str10);
                                        break;
                                    case 1:
                                        str10.getClass();
                                        lw0Var2.f.setValue(str10);
                                        break;
                                    case 2:
                                        str10.getClass();
                                        lw0Var2.f.setValue(str10);
                                        break;
                                    case 3:
                                        str10.getClass();
                                        lw0Var2.g.setValue(str10);
                                        break;
                                    case 4:
                                        str10.getClass();
                                        lw0Var2.h.setValue(str10);
                                        break;
                                    case 5:
                                        str10.getClass();
                                        lw0Var2.i.setValue(str10);
                                        break;
                                    case 6:
                                        str10.getClass();
                                        lw0Var2.j.setValue(str10);
                                        break;
                                    default:
                                        str10.getClass();
                                        lw0Var2.k.setValue(str10);
                                        break;
                                }
                                return j23Var2;
                            }
                        };
                        dr0Var2.f0(objK8);
                    }
                    t03.e("碳水", str9, (vp0) objK8, (String) map.get("carb"), wa2Var.a(og1Var, 1.0f), false, "g", dr0Var2, 1572870, 32);
                    String str10 = (String) lw0Var.k.getValue();
                    boolean zH8 = dr0Var2.h(lw0Var);
                    Object objK9 = dr0Var2.K();
                    if (zH8 || objK9 == yyVar) {
                        final byte b11 = 7;
                        objK9 = new vp0() { // from class: ew0
                            @Override // defpackage.vp0
                            public final Object h(Object obj5) {
                                byte b12 = b11;
                                j23 j23Var2 = j23.a;
                                lw0 lw0Var2 = lw0Var;
                                String str11 = (String) obj5;
                                switch (b12) {
                                    case 0:
                                        str11.getClass();
                                        lw0Var2.e.setValue(str11);
                                        break;
                                    case 1:
                                        str11.getClass();
                                        lw0Var2.f.setValue(str11);
                                        break;
                                    case 2:
                                        str11.getClass();
                                        lw0Var2.f.setValue(str11);
                                        break;
                                    case 3:
                                        str11.getClass();
                                        lw0Var2.g.setValue(str11);
                                        break;
                                    case 4:
                                        str11.getClass();
                                        lw0Var2.h.setValue(str11);
                                        break;
                                    case 5:
                                        str11.getClass();
                                        lw0Var2.i.setValue(str11);
                                        break;
                                    case 6:
                                        str11.getClass();
                                        lw0Var2.j.setValue(str11);
                                        break;
                                    default:
                                        str11.getClass();
                                        lw0Var2.k.setValue(str11);
                                        break;
                                }
                                return j23Var2;
                            }
                        };
                        dr0Var2.f0(objK9);
                    }
                    t03.e("膳食纤维", str10, (vp0) objK9, (String) map.get("fiber"), wa2Var.a(og1Var, 1.0f), false, "g", dr0Var2, 1572870, 32);
                    dr0Var2.p(true);
                    String str11 = (String) map.get("total");
                    if (str11 == null) {
                        dr0Var2.V(552553236);
                        dr0Var2.p(false);
                        dr0Var = dr0Var2;
                    } else {
                        dr0Var2.V(552553237);
                        gw2.b(str11, null, ((pv) dr0Var2.j(rv.a)).w, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var2, 0, 0, 262138);
                        dr0Var = dr0Var2;
                        dr0Var.p(false);
                    }
                    boolean zH9 = dr0Var.h(lw0Var);
                    Object objK10 = dr0Var.K();
                    if (zH9 || objK10 == yyVar) {
                        o6 o6Var = new o6(0, lw0Var, lw0.class, "save", "save()V", 0, (byte) 4);
                        dr0Var.f0(o6Var);
                        objK10 = o6Var;
                    }
                    dr0 dr0Var3 = dr0Var;
                    aa3.a((kp0) ((kq0) objK10), yi0Var, false, null, null, null, null, null, uz0.q, dr0Var3, 805306416, 508);
                    dr0Var3.p(true);
                } else {
                    dr0Var2.V(-1228711040);
                    e42.a(t03.G(t03.F(og1Var, pt1Var), 32.0f), 0L, 0.0f, 0L, 0, 0.0f, dr0Var2, 0, 62);
                    dr0Var2.p(false);
                }
                return j23Var;
            case 1:
                kl1 kl1Var = (kl1) obj4;
                pt1 pt1Var2 = (pt1) obj;
                dr0 dr0Var4 = (dr0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                pt1Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= dr0Var4.f(pt1Var2) ? (byte) 4 : (byte) 2;
                }
                if (dr0Var4.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    rg1 rg1VarF = t03.F(og1Var, pt1Var2);
                    boolean zH10 = dr0Var4.h(kl1Var);
                    Object objK11 = dr0Var4.K();
                    if (zH10 || objK11 == yyVar) {
                        objK11 = new lg(kl1Var, b3);
                        dr0Var4.f0(objK11);
                    }
                    dt.m(kl1Var, rg1VarF, null, null, null, null, null, null, null, (vp0) objK11, dr0Var4, 48);
                } else {
                    dr0Var4.Q();
                }
                return j23Var;
            case 2:
                ((z61) obj4).h((Throwable) obj);
                return j23Var;
            case 3:
                k20 k20Var = (k20) obj4;
                int iIntValue3 = ((Integer) obj).intValue();
                int iIntValue4 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                if (!zBooleanValue) {
                    iIntValue3 = k20Var.B.n(iIntValue3);
                    iIntValue4 = k20Var.B.n(iIntValue4);
                }
                if (k20Var.A) {
                    long j = k20Var.y.b;
                    int i2 = qw2.c;
                    if (iIntValue3 == ((int) (j >> 32)) && iIntValue4 == ((int) (j & 4294967295L))) {
                        z = false;
                    } else {
                        int iMin = Math.min(iIntValue3, iIntValue4);
                        qs0 qs0Var = qs0.h;
                        if (iMin < 0 || Math.max(iIntValue3, iIntValue4) > k20Var.y.a.i.length()) {
                            kv2 kv2Var = k20Var.C;
                            kv2Var.u(false);
                            kv2Var.r(qs0Var);
                            z = false;
                        } else {
                            if (zBooleanValue || iIntValue3 == iIntValue4) {
                                kv2 kv2Var2 = k20Var.C;
                                kv2Var2.u(false);
                                kv2Var2.r(qs0Var);
                            } else {
                                k20Var.C.e(true);
                            }
                            k20Var.z.v.h(new vv2(k20Var.y.a, m02.a(iIntValue3, iIntValue4), (qw2) null));
                        }
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                ((pc1) obj4).i.c(((z02) obj2).c, vz1.o);
                return j23Var;
            case 5:
                ok1 ok1Var = (ok1) obj4;
                ok1.i.set(ok1Var, null);
                ok1Var.f(null);
                return j23Var;
            case 6:
                ps2 ps2Var = (ps2) obj4;
                dr0 dr0Var5 = (dr0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((bw) obj).getClass();
                if (dr0Var5.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    rg1 rg1VarG = t03.G(og1Var, 16.0f);
                    aw awVarA2 = yv.a(new ah(4.0f, new wg((byte) 0)), c5.u, dr0Var5, 6);
                    int iHashCode4 = Long.hashCode(dr0Var5.T);
                    dx1 dx1VarL4 = dr0Var5.l();
                    rg1 rg1VarU4 = ls.U(dr0Var5, rg1VarG);
                    sy.f.getClass();
                    dr0Var5.Y();
                    if (dr0Var5.S) {
                        dr0Var5.k(jw0Var);
                    } else {
                        dr0Var5.i0();
                    }
                    h12.y(c5.F, dr0Var5, awVarA2);
                    h12.y(c5.E, dr0Var5, dx1VarL4);
                    h12.y(c5.G, dr0Var5, Integer.valueOf(iHashCode4));
                    h12.t(dr0Var5);
                    h12.y(c5.D, dr0Var5, rg1VarU4);
                    dr0Var5.V(991846253);
                    gw2.b("每日营养目标", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var5.j(e13.a)).i, dr0Var5, 6, 0, 131070);
                    dr0 dr0Var6 = dr0Var5;
                    if (ps2Var == null) {
                        dr0Var6.V(991903075);
                        gw2.b("请先填写出生年份", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var6, 6, 0, 262142);
                        dr0Var6.p(false);
                    } else {
                        double d = ps2Var.f;
                        dr0Var6.V(991936710);
                        dr0Var6.p(false);
                        Double d2 = ps2Var.d;
                        if (d2 == null) {
                            dr0Var6.V(991957851);
                        } else {
                            dr0Var6.V(991957852);
                            gw2.b(wi0.h("基础代谢 ", t03.t(0, d2.doubleValue()), " kcal"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var6, 0, 0, 262142);
                        }
                        dr0Var6.p(false);
                        Double d3 = ps2Var.e;
                        if (d3 == null) {
                            dr0Var6.V(992031383);
                        } else {
                            dr0Var6.V(992031384);
                            gw2.b(wi0.h("维持体重约需 ", t03.t(0, d3.doubleValue()), " kcal/天"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var6, 0, 0, 262142);
                        }
                        dr0Var6.p(false);
                        if (d > 0.0d) {
                            dr0Var6.V(1833119087);
                            gw2.b(wi0.h("每天热量缺口 ", t03.t(0, d), " kcal"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var6, 0, 0, 262142);
                        } else {
                            dr0Var6.V(992165862);
                        }
                        dr0Var6.p(false);
                        if (d < 0.0d) {
                            dr0Var6.V(1833122002);
                            gw2.b(wi0.h("每天热量盈余 ", t03.t(0, -d), " kcal"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var6, 0, 0, 262142);
                        } else {
                            dr0Var6.V(992259110);
                        }
                        dr0Var6.p(false);
                        e40 e40Var = ps2Var.a;
                        if (e40Var == null) {
                            dr0Var6.V(992293364);
                            dr0Var6.p(false);
                        } else {
                            ap1 ap1Var = e40Var.d;
                            ap1 ap1Var2 = e40Var.c;
                            ap1 ap1Var3 = e40Var.a;
                            dr0Var6.V(992293365);
                            gw2.b(jp1.k("热量 ", t03.t(0, ap1Var3.a), "–", t03.t(0, ap1Var3.b), " kcal"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var6, 0, 0, 262142);
                            gw2.b(wi0.i(wi0.l("蛋白质 ≥ ", t03.t(0, e40Var.b.a), " g · 脂肪 ", t03.t(0, ap1Var2.a), "–"), t03.t(0, ap1Var2.b), " g"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var6, 0, 0, 262142);
                            gw2.b(wi0.i(wi0.l("碳水 ", t03.t(0, ap1Var.a), "–", t03.t(0, ap1Var.b), " g · 膳食纤维 ≥ "), t03.t(0, e40Var.e.a), " g"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var6, 0, 0, 262142);
                            dr0Var6 = dr0Var6;
                            dr0Var6.p(false);
                        }
                        dr0Var6.V(1833135964);
                        Iterator it = ps2Var.g.iterator();
                        while (it.hasNext()) {
                            gw2.b((String) it.next(), null, ((pv) dr0Var6.j(rv.a)).j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var6, 0, 0, 262138);
                        }
                        dr0Var6.p(false);
                        gw2.b("仅供参考，不是医疗建议。孕期、哺乳期或有慢性病请遵医嘱。", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var6.j(e13.a)).l, dr0Var6, 6, 0, 131070);
                    }
                    dr0Var6.p(false);
                    dr0Var6.p(true);
                } else {
                    dr0Var5.Q();
                }
                return j23Var;
            case 7:
                ((ih2) obj4).b();
                return j23Var;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                bf1 bf1Var = (bf1) obj;
                ue1 ue1Var = (ue1) obj2;
                k00 k00Var = (k00) obj3;
                float f = ((cc0) ((kp0) obj4).a()).h;
                ny1 ny1VarE = ue1Var.e(k00.b(k00Var.a, 0, 0, l00.f(cc0.b(f, Float.NaN) ? 0 : bf1Var.R(f), k00Var.a), 0, 11));
                return bf1Var.g0(ny1VarE.h, ny1VarE.i, bg0.h, new m6(ny1VarE, (byte) 10));
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                kv2 kv2Var3 = (kv2) obj4;
                rg1 rg1Var = (rg1) obj;
                dr0 dr0Var7 = (dr0) obj2;
                ((Integer) obj3).getClass();
                dr0Var7.V(1980580247);
                e90 e90Var = (e90) dr0Var7.j(uz.h);
                Object objK12 = dr0Var7.K();
                Object obj5 = objK12;
                if (objK12 == yyVar) {
                    lu1 lu1VarX = rz1.x(new vy0(0L));
                    dr0Var7.f0(lu1VarX);
                    obj5 = lu1VarX;
                }
                sj1 sj1Var = (sj1) obj5;
                boolean zH11 = dr0Var7.h(kv2Var3);
                Object objK13 = dr0Var7.K();
                Object obj6 = objK13;
                if (zH11 || objK13 == yyVar) {
                    g72 g72Var = new g72(kv2Var3, sj1Var, b4);
                    dr0Var7.f0(g72Var);
                    obj6 = g72Var;
                }
                kp0 kp0Var = (kp0) obj6;
                boolean zF = dr0Var7.f(e90Var);
                Object objK14 = dr0Var7.K();
                Object obj7 = objK14;
                if (zF || objK14 == yyVar) {
                    ov2 ov2Var = new ov2(e90Var, sj1Var, z3 ? (byte) 1 : (byte) 0);
                    dr0Var7.f0(ov2Var);
                    obj7 = ov2Var;
                }
                rg1 rg1VarT = ls.t(rg1Var, new ng(kp0Var, (vp0) obj7, b3));
                dr0Var7.p(false);
                return rg1VarT;
            case 10:
                String str12 = (String) obj4;
                dr0 dr0Var8 = (dr0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((g61) obj).getClass();
                if (dr0Var8.N(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    xw2 xw2Var = ((c13) dr0Var8.j(e13.a)).i;
                    long j2 = ((pv) dr0Var8.j(rv.a)).a;
                    rg1 rg1VarI = t03.I(og1Var, 16.0f, 12.0f, 16.0f, 4.0f);
                    Object objK15 = dr0Var8.K();
                    if (objK15 == yyVar) {
                        objK15 = new h33(b5);
                        dr0Var8.f0(objK15);
                    }
                    gw2.b(str12, tg2.a(rg1VarI, false, (vp0) objK15), j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, xw2Var, dr0Var8, 0, 0, 131064);
                } else {
                    dr0Var8.Q();
                }
                return j23Var;
            case 11:
                ArrayList arrayList = ((az1) obj4).c;
                dr0 dr0Var9 = (dr0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((g61) obj).getClass();
                if (dr0Var9.N(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    int size = arrayList.size();
                    lh0<zo1> lh0Var = zo1.n;
                    int iA = lh0Var.a() * size;
                    int size2 = arrayList.size();
                    int i3 = 0;
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj8 = arrayList.get(i4);
                        i4++;
                        zy1 zy1Var = (zy1) obj8;
                        if (lh0Var == null || !lh0Var.isEmpty()) {
                            i = 0;
                            for (zo1 zo1Var : lh0Var) {
                                ap1 ap1VarA = zy1Var.e.a(zo1Var);
                                double dA = zy1Var.c.a(zo1Var);
                                int i5 = i;
                                if (dA < ap1VarA.a || dA > ap1VarA.b) {
                                    i = i5;
                                } else {
                                    i = i5 + 1;
                                    if (i < 0) {
                                        lt.g0();
                                        throw null;
                                    }
                                }
                            }
                        } else {
                            i = 0;
                        }
                        i3 += i;
                    }
                    gw2.b(wi0.g("本周 ", i3, " / ", iA, " 项达标。只统计在家吃的餐：目标按早餐 30%、午餐 40%、晚餐 30% 折算。菜按每人一份，米饭按各自份量。"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var9.j(e13.a)).k, dr0Var9, 0, 0, 131070);
                } else {
                    dr0Var9.Q();
                }
                return j23Var;
            default:
                o60 o60Var = (o60) obj4;
                dr0 dr0Var10 = (dr0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((bw) obj).getClass();
                if (dr0Var10.N(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    n60.b(o60Var, null, null, null, null, null, false, null, dr0Var10, 0);
                } else {
                    dr0Var10.Q();
                }
                return j23Var;
        }
    }

    public /* synthetic */ kw0(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }
}
