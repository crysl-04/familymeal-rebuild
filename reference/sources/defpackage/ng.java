package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ng implements aq0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ ng(Object obj, Object obj2, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        byte b = this.h;
        byte b2 = 18;
        og1 og1Var = og1.h;
        m10 m10Var = null;
        yy yyVar = zy.a;
        j23 j23Var = j23.a;
        final byte b3 = 1;
        Object obj4 = this.j;
        Object obj5 = this.i;
        final byte b4 = 0;
        i = 0;
        int i = 0;
        switch (b) {
            case 0:
                String str = (String) obj5;
                kl1 kl1Var = (kl1) obj4;
                va2 va2Var = (va2) obj;
                dr0 dr0Var = (dr0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                va2Var.getClass();
                byte b5 = 4;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dr0Var.f(va2Var) ? 4 : 2;
                }
                if (dr0Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    for (final gr2 gr2Var : pg.a) {
                        boolean zG = uz0.g(str, gr2Var.a);
                        boolean zH = dr0Var.h(kl1Var) | dr0Var.f(gr2Var);
                        Object objK = dr0Var.K();
                        if (zH || objK == yyVar) {
                            objK = new h6(kl1Var, gr2Var, b5);
                            dr0Var.f0(objK);
                        }
                        hm1.b(va2Var, zG, (kp0) objK, dt.N(-775929787, new zp0() { // from class: kg
                            @Override // defpackage.zp0
                            public final Object f(Object obj6, Object obj7) {
                                byte b6 = b4;
                                j23 j23Var2 = j23.a;
                                gr2 gr2Var2 = gr2Var;
                                switch (b6) {
                                    case 0:
                                        dr0 dr0Var2 = (dr0) obj6;
                                        int iIntValue2 = ((Integer) obj7).intValue();
                                        if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            dr0Var2.Q();
                                        } else {
                                            eu0.a(gr2Var2.c, null, null, 0L, dr0Var2, 48, 12);
                                        }
                                        break;
                                    default:
                                        dr0 dr0Var3 = (dr0) obj6;
                                        int iIntValue3 = ((Integer) obj7).intValue();
                                        if (!dr0Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            dr0Var3.Q();
                                        } else {
                                            gw2.b(gr2Var2.b, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var3, 0, 0, 262142);
                                        }
                                        break;
                                }
                                return j23Var2;
                            }
                        }, dr0Var), null, false, dt.N(-1128840094, new zp0() { // from class: kg
                            @Override // defpackage.zp0
                            public final Object f(Object obj6, Object obj7) {
                                byte b6 = b3;
                                j23 j23Var2 = j23.a;
                                gr2 gr2Var2 = gr2Var;
                                switch (b6) {
                                    case 0:
                                        dr0 dr0Var2 = (dr0) obj6;
                                        int iIntValue2 = ((Integer) obj7).intValue();
                                        if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            dr0Var2.Q();
                                        } else {
                                            eu0.a(gr2Var2.c, null, null, 0L, dr0Var2, 48, 12);
                                        }
                                        break;
                                    default:
                                        dr0 dr0Var3 = (dr0) obj6;
                                        int iIntValue3 = ((Integer) obj7).intValue();
                                        if (!dr0Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            dr0Var3.Q();
                                        } else {
                                            gw2.b(gr2Var2.b, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var3, 0, 0, 262142);
                                        }
                                        break;
                                }
                                return j23Var2;
                            }
                        }, dr0Var), false, null, dr0Var, (iIntValue & 14) | 1575936);
                    }
                } else {
                    dr0Var.Q();
                }
                return j23Var;
            case 1:
                vp0 vp0Var = (vp0) obj5;
                e10 e10Var = (e10) obj4;
                dr0 dr0Var2 = (dr0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Object objK2 = dr0Var2.K();
                    if (objK2 == yyVar) {
                        objK2 = new f10();
                        dr0Var2.f0(objK2);
                    }
                    f10 f10Var = (f10) objK2;
                    f10Var.a.clear();
                    vp0Var.h(f10Var);
                    f10Var.a(e10Var, dr0Var2, 0);
                } else {
                    dr0Var2.Q();
                }
                return j23Var;
            case 2:
                lw0 lw0Var = (lw0) obj5;
                sj1 sj1Var = (sj1) obj4;
                dr0 dr0Var3 = (dr0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (!dr0Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    dr0Var3.Q();
                } else if (lw0Var.c == null) {
                    dr0Var3.V(-638092654);
                    dr0Var3.p(false);
                } else {
                    dr0Var3.V(-2098796871);
                    boolean zF = dr0Var3.f(sj1Var);
                    Object objK3 = dr0Var3.K();
                    if (zF || objK3 == yyVar) {
                        objK3 = new bb(sj1Var, (byte) 12);
                        dr0Var3.f0(objK3);
                    }
                    cu.e((kp0) objK3, null, false, null, null, uz0.p, dr0Var3, 1572864, 62);
                    dr0Var3.p(false);
                }
                return j23Var;
            case 3:
                String str2 = (String) obj5;
                List list = (List) obj4;
                dr0 dr0Var4 = (dr0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((g61) obj).getClass();
                if (dr0Var4.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    String str3 = str2 + "（" + list.size() + "）";
                    xw2 xw2Var = ((c13) dr0Var4.j(e13.a)).i;
                    long j = ((pv) dr0Var4.j(rv.a)).a;
                    rg1 rg1VarI = t03.I(og1Var, 16.0f, 16.0f, 16.0f, 4.0f);
                    Object objK4 = dr0Var4.K();
                    if (objK4 == yyVar) {
                        objK4 = new vv0((byte) 5);
                        dr0Var4.f0(objK4);
                    }
                    gw2.b(str3, tg2.a(rg1VarI, false, (vp0) objK4), j, 0L, null, 0L, null, 0L, 0, false, 0, 0, xw2Var, dr0Var4, 0, 0, 131064);
                } else {
                    dr0Var4.Q();
                }
                return j23Var;
            case 4:
                ay1 ay1Var = (ay1) obj5;
                sj1 sj1Var2 = (sj1) obj4;
                dr0 dr0Var5 = (dr0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (!dr0Var5.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    dr0Var5.Q();
                } else if (ay1Var.d == null) {
                    dr0Var5.V(881030827);
                    dr0Var5.p(false);
                } else {
                    dr0Var5.V(1968079744);
                    boolean zF2 = dr0Var5.f(sj1Var2);
                    Object objK5 = dr0Var5.K();
                    if (zF2 || objK5 == yyVar) {
                        objK5 = new bb(sj1Var2, (byte) 21);
                        dr0Var5.f0(objK5);
                    }
                    cu.e((kp0) objK5, null, false, null, null, aa3.m, dr0Var5, 1572864, 62);
                    dr0Var5.p(false);
                }
                return j23Var;
            case 5:
                kp0 kp0Var = (kp0) obj5;
                vp0 vp0Var2 = (vp0) obj4;
                dr0 dr0Var6 = (dr0) obj2;
                ((Integer) obj3).getClass();
                dr0Var6.V(759876635);
                Object objK6 = dr0Var6.K();
                Object obj6 = objK6;
                if (objK6 == yyVar) {
                    o90 o90VarB = il2.b(kp0Var);
                    dr0Var6.f0(o90VarB);
                    obj6 = o90VarB;
                }
                kn2 kn2Var = (kn2) obj6;
                Object objK7 = dr0Var6.K();
                Object obj7 = objK7;
                if (objK7 == yyVar) {
                    up1 up1Var = (up1) kn2Var.getValue();
                    long j2 = up1Var.a;
                    tb tbVar = new tb(up1Var, t03.C, new up1(4333543705419175690L), 8);
                    dr0Var6.f0(tbVar);
                    obj7 = tbVar;
                }
                tb tbVar2 = (tb) obj7;
                boolean zH2 = dr0Var6.h(tbVar2);
                Object objK8 = dr0Var6.K();
                Object obj8 = objK8;
                if (zH2 || objK8 == yyVar) {
                    j jVar = new j(kn2Var, tbVar2, m10Var, (byte) 15);
                    dr0Var6.f0(jVar);
                    obj8 = jVar;
                }
                h7.J((zp0) obj8, dr0Var6, j23Var);
                dd ddVar = tbVar2.c;
                boolean zF3 = dr0Var6.f(ddVar);
                Object objK9 = dr0Var6.K();
                if (zF3 || objK9 == yyVar) {
                    objK9 = new ng2(ddVar, (byte) 0);
                    dr0Var6.f0(objK9);
                }
                rg1 rg1Var = (rg1) vp0Var2.h((kp0) objK9);
                dr0Var6.p(false);
                return rg1Var;
            case 6:
                Spannable spannable = (Spannable) obj5;
                j9 j9Var = (j9) obj4;
                yl2 yl2Var = (yl2) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int iIntValue7 = ((Integer) obj3).intValue();
                ar2 ar2Var = yl2Var.f;
                qn0 qn0Var = yl2Var.c;
                if (qn0Var == null) {
                    qn0Var = qn0.j;
                }
                on0 on0Var = yl2Var.d;
                b4 = on0Var != null ? on0Var.a : 0;
                pn0 pn0Var = yl2Var.e;
                int i2 = pn0Var != null ? pn0Var.a : 65535;
                k9 k9Var = (k9) j9Var.i;
                a13 a13VarB = ((tm0) k9Var.l).b(ar2Var, qn0Var, b4, i2);
                if (a13VarB instanceof a13) {
                    Object obj9 = a13VarB.h;
                    obj9.getClass();
                    typeface = (Typeface) obj9;
                } else {
                    eg egVar = new eg(a13VarB, k9Var.q);
                    k9Var.q = egVar;
                    Object obj10 = egVar.k;
                    obj10.getClass();
                    typeface = (Typeface) obj10;
                }
                spannable.setSpan(new vm0(typeface, (byte) 1), iIntValue6, iIntValue7, 33);
                return j23Var;
            case 7:
                vk1 vk1Var = (vk1) obj5;
                ui1 ui1Var = (ui1) obj4;
                dr0 dr0Var7 = (dr0) obj2;
                ((Integer) obj3).getClass();
                dr0Var7.V(-102778667);
                Object objK10 = dr0Var7.K();
                Object obj11 = objK10;
                if (objK10 == yyVar) {
                    x20 x20VarY = h7.Y(dr0Var7);
                    dr0Var7.f0(x20VarY);
                    obj11 = x20VarY;
                }
                x20 x20Var = (x20) obj11;
                Object objK11 = dr0Var7.K();
                Object obj12 = objK11;
                if (objK11 == yyVar) {
                    lu1 lu1VarX = rz1.x(null);
                    dr0Var7.f0(lu1VarX);
                    obj12 = lu1VarX;
                }
                sj1 sj1Var3 = (sj1) obj12;
                sj1 sj1VarC = rz1.C(vk1Var, dr0Var7);
                boolean zF4 = dr0Var7.f(ui1Var);
                Object objK12 = dr0Var7.K();
                Object obj13 = objK12;
                if (zF4 || objK12 == yyVar) {
                    uy1 uy1Var = new uy1(sj1Var3, ui1Var, b2);
                    dr0Var7.f0(uy1Var);
                    obj13 = uy1Var;
                }
                h7.G(ui1Var, (vp0) obj13, dr0Var7);
                boolean zH3 = dr0Var7.h(x20Var) | dr0Var7.f(ui1Var) | dr0Var7.f(sj1VarC);
                Object objK13 = dr0Var7.K();
                Object obj14 = objK13;
                if (zH3 || objK13 == yyVar) {
                    wu2 wu2Var = new wu2(x20Var, sj1Var3, ui1Var, sj1VarC);
                    dr0Var7.f0(wu2Var);
                    obj14 = wu2Var;
                }
                rg1 rg1VarA = oq2.a(og1Var, ui1Var, (PointerInputEventHandler) obj14);
                dr0Var7.p(false);
                return rg1VarA;
            default:
                lu1 lu1Var = ((p63) obj5).h;
                Set set = (Set) obj4;
                dr0 dr0Var8 = (dr0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((g61) obj).getClass();
                if (dr0Var8.N(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    int size = ((List) lu1Var.getValue()).size();
                    List list2 = (List) lu1Var.getValue();
                    if (list2 == null || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (set.contains(((nz1) it.next()).b) && (i = i + 1) < 0) {
                                lt.g0();
                                throw null;
                            }
                        }
                    }
                    gw2.b(wi0.g("共 ", size, " 种，已买 ", i, " 种"), t03.H(og1Var, 16.0f, 0.0f, 2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var8.j(e13.a)).k, dr0Var8, 48, 0, 131068);
                } else {
                    dr0Var8.Q();
                }
                return j23Var;
        }
    }
}
