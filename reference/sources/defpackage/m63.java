package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.zetetic.database.CursorWindow;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class m63 {
    public static final Map a = ee1.L(new wt1(zo1.h, "热量"), new wt1(zo1.i, "蛋白质"), new wt1(zo1.j, "脂肪"), new wt1(zo1.k, "碳水"), new wt1(zo1.l, "膳食纤维"));

    public static final void a(String str, kp0 kp0Var, dr0 dr0Var, int i) {
        kp0 kp0Var2 = kp0Var;
        dr0 dr0Var2 = dr0Var;
        dr0Var2.W(1136951235);
        int i2 = i | (dr0Var2.f(str) ? 4 : 2) | (dr0Var2.h(kp0Var2) ? 32 : 16);
        if (dr0Var2.N(i2 & 1, (i2 & 19) != 18)) {
            Object objK = dr0Var2.K();
            yy yyVar = zy.a;
            if (objK == yyVar) {
                objK = new iu1(0);
                dr0Var2.f0(objK);
            }
            iu1 iu1Var = (iu1) objK;
            Object objK2 = dr0Var2.K();
            if (objK2 == yyVar) {
                objK2 = new qj(iu1Var, null, (byte) 15);
                dr0Var2.f0(objK2);
            }
            h7.J((zp0) objK2, dr0Var2, j23.a);
            rg1 rg1VarG = t03.G(yj2.b, 32.0f);
            aw awVarA = yv.a(uz0.h, c5.v, dr0Var2, 54);
            int iHashCode = Long.hashCode(dr0Var2.T);
            dx1 dx1VarL = dr0Var2.l();
            rg1 rg1VarU = ls.U(dr0Var2, rg1VarG);
            sy.f.getClass();
            dr0Var2.Y();
            if (dr0Var2.S) {
                dr0Var2.k(l41.W);
            } else {
                dr0Var2.i0();
            }
            h12.y(c5.F, dr0Var2, awVarA);
            h12.y(c5.E, dr0Var2, dx1VarL);
            h12.y(c5.G, dr0Var2, Integer.valueOf(iHashCode));
            h12.t(dr0Var2);
            h12.y(c5.D, dr0Var2, rg1VarU);
            e42.a(null, 0L, 0.0f, 0L, 0, 0.0f, dr0Var, 0, 63);
            og1 og1Var = og1.h;
            y02.d(dr0Var, yj2.b(og1Var, 16.0f));
            gw2.b(str + "…（" + iu1Var.g() + " 秒）", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var, 0, 0, 262142);
            gw2.b("通常需要 10–30 秒", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var.j(e13.a)).l, dr0Var, 6, 0, 131070);
            dr0Var2 = dr0Var;
            y02.d(dr0Var2, yj2.b(og1Var, 16.0f));
            kp0Var2 = kp0Var;
            aa3.e(kp0Var2, null, false, null, null, null, ie1.s, dr0Var2, ((i2 >> 3) & 14) | 805306368, 510);
            dr0Var2.p(true);
        } else {
            dr0Var2.Q();
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new iw0(str, kp0Var2, i, (byte) 2);
        }
    }

    public static final void b(ez1 ez1Var, ek2 ek2Var, String str, kp0 kp0Var, dr0 dr0Var, int i) {
        dr0Var.W(228378280);
        int i2 = i | (dr0Var.h(ez1Var) ? 4 : 2) | (dr0Var.h(ek2Var) ? 32 : 16) | (dr0Var.f(str) ? 256 : 128);
        if (dr0Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            j62 j62Var = (j62) ez1Var.f.get(str);
            uz0.a(kp0Var, dt.N(-1122756256, new gw0(kp0Var, (byte) 11), dr0Var), null, null, dt.N(-928606756, new s62((Object) j62Var, (Object) ez1Var, (Object) str, (byte) 14), dr0Var), dt.N(193672443, new s62((Object) j62Var, (Object) ez1Var, (Object) ek2Var, (byte) 15), dr0Var), null, 0L, 0L, 0L, 0L, null, dr0Var, 1769526, 16284);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new hl(ez1Var, ek2Var, str, kp0Var, i, (byte) 4);
        }
    }

    public static final void c(ez1 ez1Var, p63 p63Var, final ek2 ek2Var, String str, kp0 kp0Var, dr0 dr0Var, int i) {
        final p63 p63Var2;
        String str2;
        String str3;
        zr zrVar;
        final String str4 = str;
        dr0 dr0Var2 = dr0Var;
        dr0Var2.W(-1272903885);
        int i2 = i | (dr0Var2.h(ez1Var) ? 4 : 2) | (dr0Var2.h(p63Var) ? 32 : 16) | (dr0Var2.h(ek2Var) ? 256 : 128) | (dr0Var2.f(str4) ? 2048 : 1024) | (dr0Var2.h(kp0Var) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192);
        if (dr0Var2.N(i2 & 1, (i2 & 9363) != 9362)) {
            j62 j62Var = (j62) ez1Var.f.get(str4);
            if (j62Var == null || (str2 = j62Var.b) == null) {
                String str5 = (String) ez1Var.d.get(str4);
                if (str5 == null) {
                    str5 = str4;
                }
                str2 = str5 + "（已删除）";
            }
            final boolean zContains = ez1Var.c.contains(new wt1(ek2Var, str4));
            cm cmVar = c5.s;
            yi0 yi0Var = yj2.a;
            ua2 ua2VarA = ta2.a(uz0.e, cmVar, dr0Var2, 48);
            int iHashCode = Long.hashCode(dr0Var2.T);
            dx1 dx1VarL = dr0Var2.l();
            rg1 rg1VarU = ls.U(dr0Var2, yi0Var);
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
            h12.y(yxVar, dr0Var2, ua2VarA);
            yx yxVar2 = c5.E;
            h12.y(yxVar2, dr0Var2, dx1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yx yxVar3 = c5.G;
            h12.y(yxVar3, dr0Var2, numValueOf);
            h12.t(dr0Var2);
            yx yxVar4 = c5.D;
            h12.y(yxVar4, dr0Var2, rg1VarU);
            String str6 = str2;
            rg1 rg1VarH = t03.H(h7.X(new b51(1.0f, true), false, "查看用量", null, kp0Var, 13), 0.0f, 6.0f, 1);
            aw awVarA = yv.a(uz0.g, c5.u, dr0Var2, 0);
            int iHashCode2 = Long.hashCode(dr0Var2.T);
            dx1 dx1VarL2 = dr0Var2.l();
            rg1 rg1VarU2 = ls.U(dr0Var2, rg1VarH);
            dr0Var2.Y();
            if (dr0Var2.S) {
                dr0Var2.k(jw0Var);
            } else {
                dr0Var2.i0();
            }
            h12.y(yxVar, dr0Var2, awVarA);
            h12.y(yxVar2, dr0Var2, dx1VarL2);
            wi0.p(iHashCode2, dr0Var2, yxVar3, dr0Var2);
            h12.y(yxVar4, dr0Var2, rg1VarU2);
            gw2.b(str6, null, 0L, 0L, zContains ? qn0.l : qn0.j, 0L, null, 0L, 0, false, 0, 0, null, dr0Var, 0, 0, 262078);
            dr0Var2 = dr0Var;
            zr zrVar2 = j62Var != null ? j62Var.d : null;
            zr zrVar3 = zr.n;
            if (zrVar2 == zrVar3) {
                dr0Var2.V(672160043);
                List<String> listA = ez1Var.e.a(ek2Var.a, ek2Var.b);
                ArrayList arrayList = new ArrayList(ev.o0(listA, 10));
                for (String str7 : listA) {
                    String str8 = (String) ez1Var.i.get(str7);
                    if (str8 == null) {
                        str8 = str7;
                    }
                    arrayList.add(str8 + " " + t03.t(1, ez1Var.b.b(ek2Var, str7, str4)) + "份");
                }
                zrVar = zrVar3;
                str3 = str6;
                gw2.b(dv.E0(arrayList, " · ", null, null, null, 62), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var2.j(e13.a)).l, dr0Var, 0, 0, 131070);
                dr0Var2 = dr0Var;
                dr0Var2.p(false);
            } else {
                str3 = str6;
                zrVar = zrVar3;
                if (j62Var != null) {
                    dr0Var2.V(672433122);
                    gw2.b(j62Var.d.h, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var2.j(e13.a)).l, dr0Var, 0, 0, 131070);
                    dr0Var2 = dr0Var;
                    dr0Var2.p(false);
                } else {
                    dr0Var2.V(672532105);
                    dr0Var2.p(false);
                }
            }
            dr0Var2.p(true);
            int i3 = i2 & 112;
            p63Var2 = p63Var;
            int i4 = i2 & 7168;
            boolean zH = (i3 == 32 || dr0Var2.h(p63Var2)) | dr0Var2.h(ek2Var) | (i4 == 2048);
            Object objK = dr0Var2.K();
            yy yyVar = zy.a;
            if (zH || objK == yyVar) {
                final byte b = 0;
                objK = new kp0() { // from class: d63
                    @Override // defpackage.kp0
                    public final Object a() {
                        byte b2 = b;
                        j23 j23Var = j23.a;
                        switch (b2) {
                            case 0:
                                String str9 = str4;
                                str9.getClass();
                                p63 p63Var3 = p63Var2;
                                ez1 ez1Var2 = (ez1) p63Var3.f.getValue();
                                if (ez1Var2 != null) {
                                    Set set = ez1Var2.c;
                                    ek2 ek2Var2 = ek2Var;
                                    ie1.p(h7.h0(p63Var3), null, new o63(p63Var3, ez1Var2, ek2Var2, str9, set.contains(new wt1(ek2Var2, str9)), null), 3);
                                }
                                break;
                            default:
                                String str10 = str4;
                                str10.getClass();
                                p63 p63Var4 = p63Var2;
                                p63Var4.g(n63.j, new vu1(p63Var4, ek2Var, str10, null, (byte) 2));
                                break;
                        }
                        return j23Var;
                    }
                };
                dr0Var2.f0(objK);
            }
            kp0 kp0Var2 = (kp0) objK;
            boolean zG = dr0Var2.g(zContains);
            Object objK2 = dr0Var2.K();
            if (zG || objK2 == yyVar) {
                objK2 = new vp0() { // from class: e63
                    @Override // defpackage.vp0
                    public final Object h(Object obj) {
                        dh2 dh2Var = (dh2) obj;
                        dh2Var.getClass();
                        String str9 = zContains ? "已锁定" : "未锁定";
                        q21[] q21VarArr = bh2.a;
                        ch2 ch2Var = ah2.b;
                        q21 q21Var = bh2.a[0];
                        ch2Var.getClass();
                        dh2Var.a(ch2Var, str9);
                        return j23.a;
                    }
                };
                dr0Var2.f0(objK2);
            }
            String str9 = str3;
            cu.e(kp0Var2, tg2.a(og1.h, false, (vp0) objK2), false, null, null, dt.N(-1503725199, new t7(str9, zContains), dr0Var2), dr0Var2, 1572864, 60);
            if ((j62Var != null ? j62Var.d : null) != zrVar) {
                dr0Var2.V(-968397313);
                boolean zH2 = (i3 == 32 || dr0Var2.h(p63Var2)) | dr0Var2.h(ek2Var) | (i4 == 2048);
                Object objK3 = dr0Var2.K();
                if (zH2 || objK3 == yyVar) {
                    str4 = str;
                    final byte b2 = 1;
                    objK3 = new kp0() { // from class: d63
                        @Override // defpackage.kp0
                        public final Object a() {
                            byte b3 = b2;
                            j23 j23Var = j23.a;
                            switch (b3) {
                                case 0:
                                    String str10 = str4;
                                    str10.getClass();
                                    p63 p63Var3 = p63Var2;
                                    ez1 ez1Var2 = (ez1) p63Var3.f.getValue();
                                    if (ez1Var2 != null) {
                                        Set set = ez1Var2.c;
                                        ek2 ek2Var2 = ek2Var;
                                        ie1.p(h7.h0(p63Var3), null, new o63(p63Var3, ez1Var2, ek2Var2, str10, set.contains(new wt1(ek2Var2, str10)), null), 3);
                                    }
                                    break;
                                default:
                                    String str11 = str4;
                                    str11.getClass();
                                    p63 p63Var4 = p63Var2;
                                    p63Var4.g(n63.j, new vu1(p63Var4, ek2Var, str11, null, (byte) 2));
                                    break;
                            }
                            return j23Var;
                        }
                    };
                    dr0Var2.f0(objK3);
                } else {
                    str4 = str;
                }
                cu.e((kp0) objK3, null, !zContains, null, null, dt.N(-1301476426, new xn0(str9, (byte) 5), dr0Var2), dr0Var2, 1572864, 58);
                dr0Var2.p(false);
            } else {
                str4 = str;
                dr0Var2.V(-968224333);
                dr0Var2.p(false);
            }
            dr0Var2.p(true);
        } else {
            p63Var2 = p63Var;
            dr0Var2.Q();
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new cr(ez1Var, p63Var2, ek2Var, str4, kp0Var, i, (byte) 5);
        }
    }

    public static final void d(kp0 kp0Var, dr0 dr0Var, int i) {
        dr0 dr0Var2 = dr0Var;
        dr0Var2.W(-1138771434);
        int i2 = i | (dr0Var2.h(kp0Var) ? 4 : 2);
        if (dr0Var2.N(i2 & 1, (i2 & 3) != 2)) {
            rg1 rg1VarG = t03.G(yj2.b, 16.0f);
            aw awVarA = yv.a(new ah(12.0f, new wg((byte) 0)), c5.u, dr0Var2, 6);
            int iHashCode = Long.hashCode(dr0Var2.T);
            dx1 dx1VarL = dr0Var2.l();
            rg1 rg1VarU = ls.U(dr0Var2, rg1VarG);
            sy.f.getClass();
            dr0Var2.Y();
            if (dr0Var2.S) {
                dr0Var2.k(l41.W);
            } else {
                dr0Var2.i0();
            }
            h12.y(c5.F, dr0Var2, awVarA);
            h12.y(c5.E, dr0Var2, dx1VarL);
            h12.y(c5.G, dr0Var2, Integer.valueOf(iHashCode));
            h12.t(dr0Var2);
            h12.y(c5.D, dr0Var2, rg1VarU);
            gw2.b("这一周还没有食谱。", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var, 6, 0, 262142);
            gw2.b("会根据「家人」里的营养目标和用餐时间表，从菜谱库里挑选当季的菜，安排一周三餐。", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var.j(e13.a)).k, dr0Var, 6, 0, 131070);
            dr0Var2 = dr0Var;
            aa3.a(kp0Var, yj2.a, false, null, null, null, null, null, ie1.t, dr0Var2, (i2 & 14) | 805306416, 508);
            dr0Var2.p(true);
        } else {
            dr0Var2.Q();
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new gw0(kp0Var, i, (byte) 10);
        }
    }

    public static final void e(ez1 ez1Var, p63 p63Var, dr0 dr0Var, int i) {
        e72 e72VarR;
        f63 f63Var;
        dr0Var.W(1962955215);
        int i2 = (dr0Var.h(ez1Var) ? 4 : 2) | i | (dr0Var.h(p63Var) ? 32 : 16);
        byte b = 0;
        byte b2 = 1;
        if (dr0Var.N(i2 & 1, (i2 & 19) != 18)) {
            az1 az1Var = (az1) p63Var.g.getValue();
            if (az1Var == null) {
                e72VarR = dr0Var.r();
                if (e72VarR == null) {
                    return;
                } else {
                    f63Var = new f63(ez1Var, p63Var, i, b);
                }
            } else {
                List list = ez1Var.h;
                int iK = ee1.K(ev.o0(list, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iK >= 16 ? iK : 16);
                for (Object obj : list) {
                    linkedHashMap.put(((rx1) obj).a, obj);
                }
                ArrayList arrayList = az1Var.c;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    p60 p60Var = ((zy1) obj2).b;
                    Object arrayList2 = linkedHashMap2.get(p60Var);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap2.put(p60Var, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                yi0 yi0Var = yj2.b;
                rt1 rt1Var = new rt1(16.0f, 16.0f, 16.0f, 16.0f);
                ah ahVar = new ah(12.0f, new wg((byte) 0));
                boolean zH = dr0Var.h(az1Var) | dr0Var.h(linkedHashMap2) | dr0Var.h(linkedHashMap);
                Object objK = dr0Var.K();
                if (zH || objK == zy.a) {
                    objK = new qb((Object) az1Var, (Object) linkedHashMap2, (Object) linkedHashMap, (byte) 20);
                    dr0Var.f0(objK);
                }
                cu.h(yi0Var, null, rt1Var, ahVar, null, null, false, null, (vp0) objK, dr0Var, 24966, 490);
            }
            e72VarR.d = f63Var;
        }
        dr0Var.Q();
        e72VarR = dr0Var.r();
        if (e72VarR != null) {
            f63Var = new f63(ez1Var, p63Var, i, b2);
            e72VarR.d = f63Var;
        }
    }

    public static final void f(ez1 ez1Var, p63 p63Var, dr0 dr0Var, int i) {
        dr0 dr0Var2 = dr0Var;
        dr0Var2.W(1120756152);
        char c = 2;
        int i2 = i | (dr0Var2.h(ez1Var) ? 4 : 2) | (dr0Var2.h(p63Var) ? 32 : 16);
        if (dr0Var2.N(i2 & 1, (i2 & 19) != 18)) {
            Object objK = dr0Var2.K();
            yy yyVar = zy.a;
            if (objK == yyVar) {
                objK = rz1.x(null);
                dr0Var2.f0(objK);
            }
            sj1 sj1Var = (sj1) objK;
            yi0 yi0Var = yj2.b;
            rt1 rt1Var = new rt1(16.0f, 16.0f, 16.0f, 16.0f);
            boolean z = true;
            ah ahVar = new ah(12.0f, new wg((byte) 0));
            int i3 = i2 & 14;
            boolean z2 = i3 == 4 || dr0Var2.h(ez1Var);
            if ((i2 & 112) != 32 && !dr0Var2.h(p63Var)) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objK2 = dr0Var2.K();
            if (z3 || objK2 == yyVar) {
                objK2 = new qb((Object) ez1Var, (Object) p63Var, (Object) sj1Var, (byte) 21);
                dr0Var2.f0(objK2);
            }
            cu.h(yi0Var, null, rt1Var, ahVar, null, null, false, null, (vp0) objK2, dr0Var2, 24966, 490);
            wt1 wt1Var = (wt1) sj1Var.getValue();
            if (wt1Var == null) {
                dr0Var2.V(-627886371);
                dr0Var2.p(false);
                dr0Var2 = dr0Var2;
            } else {
                dr0Var2.V(-627886370);
                ek2 ek2Var = (ek2) wt1Var.h;
                String str = (String) wt1Var.i;
                Object objK3 = dr0Var2.K();
                if (objK3 == yyVar) {
                    objK3 = new bb(sj1Var, (byte) 29);
                    dr0Var2.f0(objK3);
                }
                dr0Var2 = dr0Var2;
                b(ez1Var, ek2Var, str, (kp0) objK3, dr0Var2, 3080 | i3);
                dr0Var2.p(false);
            }
        } else {
            dr0Var2.Q();
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new f63(ez1Var, p63Var, i, c);
        }
    }

    public static final void g(p63 p63Var, dr0 dr0Var, int i) {
        String str;
        dr0Var.W(-333332881);
        int i2 = (dr0Var.h(p63Var) ? 4 : 2) | i;
        if (dr0Var.N(i2 & 1, (i2 & 3) != 2)) {
            Object objU0 = dv.U0((List) pz1.h((pk0) p63Var.i.getValue(), ag0.h, dr0Var, 48, 2).getValue());
            List list = (List) p63Var.h.getValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                uv0 uv0Var = ((nz1) obj).a;
                if (uv0Var == null || (str = uv0Var.c) == null) {
                    str = "其他";
                }
                Object arrayList = linkedHashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(str, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            yi0 yi0Var = yj2.b;
            rt1 rt1VarF = t03.f(1);
            boolean zH = ((i2 & 14) == 4 || dr0Var.h(p63Var)) | dr0Var.h(objU0) | dr0Var.h(linkedHashMap);
            Object objK = dr0Var.K();
            if (zH || objK == zy.a) {
                objK = new qb((Object) linkedHashMap, (Object) p63Var, objU0, (byte) 22);
                dr0Var.f0(objK);
            }
            cu.h(yi0Var, null, rt1VarF, null, null, null, false, null, (vp0) objK, dr0Var, 390, 506);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new s(p63Var, i, (byte) 28);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r6v1, types: [dr0] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [dr0] */
    /* JADX WARN: Type inference failed for: r6v12, types: [dr0] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v4, types: [dr0] */
    /* JADX WARN: Type inference failed for: r6v6, types: [dr0] */
    /* JADX WARN: Type inference failed for: r6v7, types: [dr0] */
    /* JADX WARN: Type inference failed for: r6v8, types: [dr0] */
    /* JADX WARN: Type inference failed for: r6v9, types: [dr0] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    public static final void h(int r54, defpackage.dr0 r55) {
        /*
            Method dump skipped, instruction units count: 1369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m63.h(int, dr0):void");
    }
}
