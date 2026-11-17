package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.KeyEvent;
import com.familymeal.app.MealPlannerApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.LinkedHashMap;
import java.util.Map;
import net.zetetic.database.CursorWindow;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class h7 implements v60, hz, sh {
    public static final nx A;
    public static final nx B;
    public static final nx C;
    public static final qf0 D;
    public static final hb0 E;
    public static final qv F;
    public static final ji2 G;
    public static final qv H;
    public static final float I;
    public static final float J;
    public static final float K;
    public static j92 L;
    public static final yy M;
    public static final jw0 N;
    public static final s9 O;
    public static final s9 P;
    public static final jy1 Q;
    public static final jy1 R;
    public static final jy1 S;
    public static final ch2 T;
    public static final ch2 U;
    public static final ch2 V;
    public static final qf0 W;
    public static final qf0 X;
    public static final Object Y;
    public static final Object Z;
    public static final Object a0;
    public static final Object b0;
    public static final Object c0;
    public static final jy1 d0;
    public static iu0 e0;
    public static final am h = new am(-1.0f);
    public static final am i = new am(1.0f);
    public static final qv j = qv.v;
    public static final qv k;
    public static final qv l;
    public static final qv m;
    public static final qv n;
    public static final qv o;
    public static final h42 p;
    public static final nx q;
    public static final nx r;
    public static final nx s;
    public static final nx t;
    public static final nx u;
    public static final nx v;
    public static final nx w;
    public static final nx x;
    public static final nx y;
    public static final nx z;

    static {
        qv qvVar = qv.n;
        k = qvVar;
        l = qv.w;
        qv qvVar2 = qv.o;
        m = qvVar2;
        n = qvVar;
        o = qvVar2;
        p = new h42();
        q = new nx(-1571120048, false, new sx());
        r = new nx(-1455401925, false, new tx((byte) 0));
        byte b = 22;
        s = new nx(-1741515999, false, new ig(b));
        byte b2 = 24;
        t = new nx(-1388769041, false, new ig(b2));
        byte b3 = 25;
        u = new nx(-1463553944, false, new tx(b3));
        byte b4 = 26;
        v = new nx(-1830897110, false, new tx(b4));
        w = new nx(-381996242, false, new tx((byte) 27));
        x = new nx(-93176852, false, new tx((byte) 28));
        y = new nx(1190828454, false, new ig(b3));
        z = new nx(1906708315, false, new tx((byte) 29));
        A = new nx(223989556, false, new ig(b4));
        B = new nx(1663079876, false, new ig((byte) 23));
        C = new nx(1843471981, false, new tx(b2));
        D = new qf0("CLOSED", (byte) 1);
        E = new hb0();
        F = qv.y;
        G = ji2.l;
        H = qv.z;
        I = 0.38f;
        J = 6.0f;
        K = 1.0f;
        M = new yy((byte) 18);
        byte b5 = 20;
        N = new jw0(b5);
        O = new s9(1000);
        new s9(1007);
        P = new s9(1008);
        new s9(1002);
        Q = new jy1((byte) 9);
        R = new jy1((byte) 10);
        S = new jy1((byte) 11);
        T = new ch2("TestTagsAsResourceId", false, new kc2((byte) 21));
        U = new ch2("AccessibilityClassName", true, new kc2((byte) 13));
        V = new ch2("CredentialRequest", false, new kc2(b));
        W = new qf0("NONE", (byte) 1);
        X = new qf0("PENDING", (byte) 1);
        Y = new Object();
        Z = new Object();
        a0 = new Object();
        b0 = new Object();
        c0 = new Object();
        d0 = new jy1(b5);
    }

    public static final void F(rg1 rg1Var, dr0 dr0Var, int i2) {
        byte b;
        rg1 rg1Var2;
        dr0 dr0Var2 = dr0Var;
        dr0Var2.W(465647460);
        int i3 = i2 | 6;
        byte b2 = 0;
        if (dr0Var2.N(i3 & 1, (i3 & 3) != 2)) {
            Context context = (Context) dr0Var2.j(i7.b);
            Object objK = dr0Var2.K();
            yy yyVar = zy.a;
            if (objK == yyVar) {
                objK = Y(dr0Var2);
                dr0Var2.f0(objK);
            }
            x20 x20Var = (x20) objK;
            Object objK2 = dr0Var2.K();
            m10 m10Var = null;
            if (objK2 == yyVar) {
                objK2 = rz1.x(null);
                dr0Var2.f0(objK2);
            }
            sj1 sj1Var = (sj1) objK2;
            Object objK3 = dr0Var2.K();
            if (objK3 == yyVar) {
                objK3 = rz1.x(null);
                dr0Var2.f0(objK3);
            }
            sj1 sj1Var2 = (sj1) objK3;
            Object objK4 = dr0Var2.K();
            if (objK4 == yyVar) {
                objK4 = rz1.x(null);
                dr0Var2.f0(objK4);
            }
            sj1 sj1Var3 = (sj1) objK4;
            Object objK5 = dr0Var2.K();
            if (objK5 == yyVar) {
                objK5 = rz1.x(Boolean.FALSE);
                dr0Var2.f0(objK5);
            }
            sj1 sj1Var4 = (sj1) objK5;
            boolean zH = dr0Var2.h(context);
            Object objK6 = dr0Var2.K();
            if (zH || objK6 == yyVar) {
                objK6 = new j(context, sj1Var, m10Var, (byte) 7);
                dr0Var2.f0(objK6);
            }
            J((zp0) objK6, dr0Var2, j23.a);
            rg1 rg1VarC = uz0.C(t03.G(ia2.v(yj2.b), 16.0f), uz0.v(dr0Var2));
            aw awVarA = yv.a(new ah(16.0f, new wg(b2)), c5.u, dr0Var2, 6);
            int iHashCode = Long.hashCode(dr0Var2.T);
            dx1 dx1VarL = dr0Var2.l();
            rg1 rg1VarU = ls.U(dr0Var2, rg1VarC);
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
            ie0 ie0Var = e13.a;
            xw2 xw2Var = ((c13) dr0Var2.j(ie0Var)).f;
            Object objK7 = dr0Var2.K();
            if (objK7 == yyVar) {
                objK7 = new rt((byte) 16);
                dr0Var2.f0(objK7);
            }
            og1 og1Var = og1.h;
            gw2.b("设置", tg2.a(og1Var, false, (vp0) objK7), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, xw2Var, dr0Var, 6, 0, 131068);
            ia2.d(0, dr0Var);
            xw2 xw2Var2 = ((c13) dr0Var.j(ie0Var)).h;
            Object objK8 = dr0Var.K();
            if (objK8 == yyVar) {
                objK8 = new rt((byte) 17);
                dr0Var.f0(objK8);
            }
            gw2.b("诊断", tg2.a(og1Var, false, (vp0) objK8), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, xw2Var2, dr0Var, 6, 0, 131068);
            yi0 yi0Var = yj2.a;
            t03.d(yi0Var, null, null, null, dt.N(1188788556, new x90(sj1Var, (byte) 0), dr0Var), dr0Var, 196614);
            dr0Var2 = dr0Var;
            t03.d(yi0Var, null, null, null, dt.N(-2128258621, new nw0(x20Var, context, sj1Var4, sj1Var3, sj1Var2), dr0Var), dr0Var2, 196614);
            b = 1;
            dr0Var2.p(true);
            rg1Var2 = og1Var;
        } else {
            b = 1;
            dr0Var2.Q();
            rg1Var2 = rg1Var;
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new go(rg1Var2, i2, b);
        }
    }

    public static final void G(Object obj, vp0 vp0Var, dr0 dr0Var) {
        boolean zF = dr0Var.f(obj);
        Object objK = dr0Var.K();
        if (zF || objK == zy.a) {
            objK = new fb0(vp0Var);
            dr0Var.f0(objK);
        }
    }

    public static final void H(Object obj, Object obj2, vp0 vp0Var, dr0 dr0Var) {
        boolean zF = dr0Var.f(obj) | dr0Var.f(obj2);
        Object objK = dr0Var.K();
        if (zF || objK == zy.a) {
            objK = new fb0(vp0Var);
            dr0Var.f0(objK);
        }
    }

    public static final void I(yp1 yp1Var, d5 d5Var, nx nxVar, dr0 dr0Var, int i2) {
        int i3;
        dr0Var.W(-1090171650);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? dr0Var.f(yp1Var) : dr0Var.h(yp1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dr0Var.f(d5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dr0Var.h(nxVar) ? 256 : 128;
        }
        boolean z2 = true;
        if (dr0Var.N(i3 & 1, (i3 & 147) != 146)) {
            boolean z3 = (i3 & 112) == 32;
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !dr0Var.f(yp1Var))) {
                z2 = false;
            }
            boolean z4 = z3 | z2;
            Object objK = dr0Var.K();
            if (z4 || objK == zy.a) {
                objK = new ps0(d5Var, yp1Var);
                dr0Var.f0(objK);
            }
            ca.a((ps0) objK, null, new p12(0, false, false), nxVar, dr0Var, ((i3 << 3) & 7168) | 384, 2);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new ha((Object) yp1Var, (Object) d5Var, (hq0) nxVar, i2, (byte) 0);
        }
    }

    public static final void J(zp0 zp0Var, dr0 dr0Var, Object obj) {
        o20 o20Var = dr0Var.R;
        boolean zF = dr0Var.f(obj);
        Object objK = dr0Var.K();
        if (zF || objK == zy.a) {
            objK = new o31(o20Var, zp0Var);
            dr0Var.f0(objK);
        }
    }

    public static final void K(Object obj, Object obj2, zp0 zp0Var, dr0 dr0Var) {
        o20 o20Var = dr0Var.R;
        boolean zF = dr0Var.f(obj) | dr0Var.f(obj2);
        Object objK = dr0Var.K();
        if (zF || objK == zy.a) {
            objK = new o31(o20Var, zp0Var);
            dr0Var.f0(objK);
        }
    }

    public static final void L(ay1 ay1Var, dr0 dr0Var, int i2) {
        byte b;
        dr0Var.W(2001511482);
        int i3 = i2 | (dr0Var.h(ay1Var) ? 4 : 2);
        byte b2 = 0;
        if (dr0Var.N(i3 & 1, (i3 & 3) != 2)) {
            ah ahVar = new ah(8.0f, new wg(b2));
            cm cmVar = c5.r;
            ua2 ua2VarA = ta2.a(ahVar, cmVar, dr0Var, 6);
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            og1 og1Var = og1.h;
            rg1 rg1VarU = ls.U(dr0Var, og1Var);
            sy.f.getClass();
            dr0Var.Y();
            boolean z2 = dr0Var.S;
            jw0 jw0Var = l41.W;
            if (z2) {
                dr0Var.k(jw0Var);
            } else {
                dr0Var.i0();
            }
            yx yxVar = c5.F;
            h12.y(yxVar, dr0Var, ua2VarA);
            yx yxVar2 = c5.E;
            h12.y(yxVar2, dr0Var, dx1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yx yxVar3 = c5.G;
            h12.y(yxVar3, dr0Var, numValueOf);
            h12.t(dr0Var);
            yx yxVar4 = c5.D;
            h12.y(yxVar4, dr0Var, rg1VarU);
            String str = (String) ay1Var.i().get(0);
            boolean zH = dr0Var.h(ay1Var);
            Object objK = dr0Var.K();
            yy yyVar = zy.a;
            if (zH || objK == yyVar) {
                objK = new wx1(ay1Var, b2);
                dr0Var.f0(objK);
            }
            wa2 wa2Var = wa2.a;
            t03.e("热量下限", str, (vp0) objK, null, wa2Var.a(og1Var, 1.0f), false, "kcal", dr0Var, 1575942, 32);
            String str2 = (String) ay1Var.i().get(1);
            boolean zH2 = dr0Var.h(ay1Var);
            Object objK2 = dr0Var.K();
            if (zH2 || objK2 == yyVar) {
                objK2 = new wx1(ay1Var, (byte) 2);
                dr0Var.f0(objK2);
            }
            t03.e("热量上限", str2, (vp0) objK2, null, wa2Var.a(og1Var, 1.0f), false, "kcal", dr0Var, 1575942, 32);
            dr0Var.p(true);
            String str3 = (String) ay1Var.i().get(2);
            boolean zH3 = dr0Var.h(ay1Var);
            Object objK3 = dr0Var.K();
            if (zH3 || objK3 == yyVar) {
                b = 6;
                objK3 = new wx1(ay1Var, b);
                dr0Var.f0(objK3);
            } else {
                b = 6;
            }
            yi0 yi0Var = yj2.a;
            t03.e("蛋白质下限", str3, (vp0) objK3, null, yi0Var, false, "g", dr0Var, 1600518, 32);
            ua2 ua2VarA2 = ta2.a(new ah(8.0f, new wg((byte) 0)), cmVar, dr0Var, b);
            int iHashCode2 = Long.hashCode(dr0Var.T);
            dx1 dx1VarL2 = dr0Var.l();
            rg1 rg1VarU2 = ls.U(dr0Var, og1Var);
            dr0Var.Y();
            if (dr0Var.S) {
                dr0Var.k(jw0Var);
            } else {
                dr0Var.i0();
            }
            h12.y(yxVar, dr0Var, ua2VarA2);
            h12.y(yxVar2, dr0Var, dx1VarL2);
            wi0.p(iHashCode2, dr0Var, yxVar3, dr0Var);
            h12.y(yxVar4, dr0Var, rg1VarU2);
            String str4 = (String) ay1Var.i().get(3);
            boolean zH4 = dr0Var.h(ay1Var);
            Object objK4 = dr0Var.K();
            if (zH4 || objK4 == yyVar) {
                objK4 = new wx1(ay1Var, (byte) 12);
                dr0Var.f0(objK4);
            }
            t03.e("脂肪下限", str4, (vp0) objK4, null, wa2Var.a(og1Var, 1.0f), false, "g", dr0Var, 1575942, 32);
            String str5 = (String) ay1Var.i().get(4);
            boolean zH5 = dr0Var.h(ay1Var);
            Object objK5 = dr0Var.K();
            if (zH5 || objK5 == yyVar) {
                objK5 = new wx1(ay1Var, (byte) 13);
                dr0Var.f0(objK5);
            }
            t03.e("脂肪上限", str5, (vp0) objK5, null, wa2Var.a(og1Var, 1.0f), false, "g", dr0Var, 1575942, 32);
            dr0Var.p(true);
            ua2 ua2VarA3 = ta2.a(new ah(8.0f, new wg((byte) 0)), cmVar, dr0Var, 6);
            int iHashCode3 = Long.hashCode(dr0Var.T);
            dx1 dx1VarL3 = dr0Var.l();
            rg1 rg1VarU3 = ls.U(dr0Var, og1Var);
            dr0Var.Y();
            if (dr0Var.S) {
                dr0Var.k(jw0Var);
            } else {
                dr0Var.i0();
            }
            h12.y(yxVar, dr0Var, ua2VarA3);
            h12.y(yxVar2, dr0Var, dx1VarL3);
            wi0.p(iHashCode3, dr0Var, yxVar3, dr0Var);
            h12.y(yxVar4, dr0Var, rg1VarU3);
            String str6 = (String) ay1Var.i().get(5);
            boolean zH6 = dr0Var.h(ay1Var);
            Object objK6 = dr0Var.K();
            if (zH6 || objK6 == yyVar) {
                objK6 = new wx1(ay1Var, (byte) 14);
                dr0Var.f0(objK6);
            }
            t03.e("碳水下限", str6, (vp0) objK6, null, wa2Var.a(og1Var, 1.0f), false, "g", dr0Var, 1575942, 32);
            String str7 = (String) ay1Var.i().get(6);
            boolean zH7 = dr0Var.h(ay1Var);
            Object objK7 = dr0Var.K();
            if (zH7 || objK7 == yyVar) {
                objK7 = new wx1(ay1Var, (byte) 15);
                dr0Var.f0(objK7);
            }
            t03.e("碳水上限", str7, (vp0) objK7, null, wa2Var.a(og1Var, 1.0f), false, "g", dr0Var, 1575942, 32);
            dr0Var.p(true);
            String str8 = (String) ay1Var.i().get(7);
            boolean zH8 = dr0Var.h(ay1Var);
            Object objK8 = dr0Var.K();
            if (zH8 || objK8 == yyVar) {
                objK8 = new wx1(ay1Var, (byte) 16);
                dr0Var.f0(objK8);
            }
            t03.e("膳食纤维下限", str8, (vp0) objK8, null, yi0Var, false, "g", dr0Var, 1600518, 32);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new xx1(ay1Var, i2, (byte) 3);
        }
    }

    public static final void M(ay1 ay1Var, int i2, String str) {
        ArrayList arrayListS0 = dv.S0(ay1Var.i());
        arrayListS0.set(i2, str);
        ay1Var.s.setValue(arrayListS0);
    }

    public static final nn2 N(Object obj) {
        if (obj == null) {
            obj = s60.r0;
        }
        return new nn2(obj);
    }

    public static final void O(String str, kp0 kp0Var, vp0 vp0Var, dr0 dr0Var, int i2) {
        dr0 dr0Var2 = dr0Var;
        kp0Var.getClass();
        dr0Var2.W(1794244748);
        int i3 = i2 | (dr0Var2.f(str) ? 4 : 2) | (dr0Var2.h(kp0Var) ? 32 : 16) | (dr0Var2.h(vp0Var) ? 256 : 128);
        byte b = 1;
        if (dr0Var2.N(i3 & 1, (i3 & 147) != 146)) {
            Context applicationContext = ((Context) dr0Var2.j(i7.b)).getApplicationContext();
            applicationContext.getClass();
            MealPlannerApp mealPlannerApp = (MealPlannerApp) applicationContext;
            String strJ = jp1.j("person_", str);
            boolean zH = dr0Var2.h(mealPlannerApp) | ((i3 & 14) == 4);
            Object objK = dr0Var2.K();
            yy yyVar = zy.a;
            if (zH || objK == yyVar) {
                objK = new fw0(mealPlannerApp, str, b);
                dr0Var2.f0(objK);
            }
            vp0 vp0Var2 = (vp0) objK;
            h53 h53VarA = sb1.a(dr0Var2);
            if (h53VarA == null) {
                li1.g("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            du duVarA = z72.a(ay1.class);
            vw0 vw0Var = new vw0((byte) 0);
            vw0Var.a(z72.a(ay1.class), vp0Var2);
            ay1 ay1Var = (ay1) h12.D(duVarA, h53VarA, strJ, vw0Var.b(), cy1.z(h53VarA), dr0Var2);
            Object[] objArr = new Object[0];
            Object objK2 = dr0Var2.K();
            if (objK2 == yyVar) {
                objK2 = new jw0((byte) 26);
                dr0Var2.f0(objK2);
            }
            sj1 sj1Var = (sj1) rz1.z(objArr, (kp0) objK2, dr0Var2, 48);
            Boolean bool = (Boolean) ay1Var.u.getValue();
            bool.getClass();
            boolean zH2 = dr0Var2.h(ay1Var) | ((i3 & 112) == 32);
            Object objK3 = dr0Var2.K();
            m10 m10Var = null;
            if (zH2 || objK3 == yyVar) {
                objK3 = new rj(ay1Var, kp0Var, m10Var, (byte) 5);
                dr0Var2.f0(objK3);
            }
            J((zp0) objK3, dr0Var2, bool);
            boolean zH3 = dr0Var2.h(ay1Var);
            Object objK4 = dr0Var2.K();
            if (zH3 || objK4 == yyVar) {
                objK4 = new wx1(ay1Var, b);
                dr0Var2.f0(objK4);
            }
            vs.d(null, (vp0) objK4, dr0Var2, 6);
            cy1.a(null, dt.N(-1179354552, new s62((z43) ay1Var, kp0Var, sj1Var, (byte) 10), dr0Var2), null, null, null, 0, 0L, 0L, null, dt.N(-1987391139, new cc1(ay1Var, str, vp0Var), dr0Var2), dr0Var, 805306416, 509);
            dr0Var2 = dr0Var;
            if (((Boolean) sj1Var.getValue()).booleanValue()) {
                dr0Var2.V(1481366690);
                boolean zF = dr0Var2.f(sj1Var);
                Object objK5 = dr0Var2.K();
                if (zF || objK5 == yyVar) {
                    objK5 = new bb(sj1Var, (byte) 19);
                    dr0Var2.f0(objK5);
                }
                uz0.a((kp0) objK5, dt.N(-1876642599, new j7(sj1Var, ay1Var, (byte) 25), dr0Var2), null, dt.N(630454875, new y7(sj1Var, (byte) 6), dr0Var2), dt.N(-1157414947, new xx1(ay1Var, b), dr0Var2), aa3.r, null, 0L, 0L, 0L, 0L, null, dr0Var, 1772592, 16276);
                dr0Var2 = dr0Var;
                dr0Var2.p(false);
            } else {
                dr0Var2.V(1481754934);
                dr0Var2.p(false);
            }
        } else {
            dr0Var2.Q();
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new s62(str, kp0Var, vp0Var, i2, (byte) 9);
        }
    }

    public static final void P(rg1 rg1Var, ie0 ie0Var, nx nxVar, dr0 dr0Var, int i2) {
        int i3;
        nx nxVar2 = s60.d;
        dr0Var.W(-714464401);
        if ((i2 & 6) == 0) {
            i3 = (dr0Var.f(rg1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dr0Var.f(ie0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dr0Var.h(nxVar2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dr0Var.h(nxVar) ? 2048 : 1024;
        }
        if (dr0Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            Object objK = dr0Var.K();
            if (objK == zy.a) {
                Object lu1Var = new lu1(null, c5.f0);
                dr0Var.f0(lu1Var);
                objK = lu1Var;
            }
            gl glVarV = V(nxVar2, dr0Var, (i3 >> 6) & 14);
            ys.a(ie0Var.a(glVarV), dt.N(274270255, new hl(rg1Var, (sj1) objK, nxVar, glVarV), dr0Var), dr0Var, 56);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new ha((Object) rg1Var, (Object) ie0Var, (hq0) nxVar, i2, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    /* JADX WARN: Code duplicated, block: B:44:0x0099  */
    public static final void Q(final yp1 yp1Var, final boolean z2, final u82 u82Var, final boolean z3, long j2, final float f, final rg1 rg1Var, dr0 dr0Var, final int i2) {
        final long j3;
        int i3;
        final boolean z4;
        dr0Var.W(-466280168);
        int i4 = i2 | (dr0Var.f(yp1Var) ? 4 : 2) | (dr0Var.d(u82Var.ordinal()) ? 256 : 128) | (dr0Var.g(z3) ? 2048 : 1024) | 8192 | (dr0Var.f(rg1Var) ? 1048576 : 524288);
        if (dr0Var.N(i4 & 1, (533651 & i4) != 533650)) {
            dr0Var.S();
            if ((i2 & 1) == 0 || dr0Var.x()) {
                i3 = i4 & (-57345);
                j3 = 9205357640488583168L;
            } else {
                dr0Var.Q();
                i3 = i4 & (-57345);
                j3 = j2;
            }
            dr0Var.q();
            u82 u82Var2 = u82.i;
            u82 u82Var3 = u82.h;
            if (z2) {
                ch2 ch2Var = mg2.a;
                if ((u82Var != u82Var3 || z3) && !(u82Var == u82Var2 && z3)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
            } else {
                ch2 ch2Var2 = mg2.a;
                if ((u82Var != u82Var3 || z3) && !(u82Var == u82Var2 && z3)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            am amVar = z4 ? i : h;
            int i5 = i3 & 14;
            boolean zG = (i5 == 4) | dr0Var.g(z4);
            Object objK = dr0Var.K();
            if (zG || objK == zy.a) {
                objK = new vp0() { // from class: ja
                    @Override // defpackage.vp0
                    public final Object h(Object obj) {
                        dh2 dh2Var = (dh2) obj;
                        long jA = yp1Var.a();
                        dh2Var.a(mg2.a, new lg2(z2 ? os0.i : os0.j, jA, z4 ? kg2.h : kg2.j, (9223372034707292159L & jA) != 9205357640488583168L));
                        return j23.a;
                    }
                };
                dr0Var.f0(objK);
            }
            final rg1 rg1VarA = tg2.a(rg1Var, false, (vp0) objK);
            final v43 v43Var = (v43) dr0Var.j(uz.t);
            final boolean z5 = z4;
            I(yp1Var, amVar, dt.N(1365123137, new zp0() { // from class: ka
                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    dr0 dr0Var2 = (dr0) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (dr0Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        i42 i42VarA = uz.t.a(v43Var);
                        final long j4 = j3;
                        final boolean z6 = z5;
                        final rg1 rg1Var2 = rg1VarA;
                        final yp1 yp1Var2 = yp1Var;
                        ys.a(i42VarA, dt.N(1260045569, new zp0() { // from class: ma
                            @Override // defpackage.zp0
                            public final Object f(Object obj3, Object obj4) {
                                dr0 dr0Var3 = (dr0) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                final byte b = 1;
                                final byte b2 = 0;
                                if (dr0Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    long j5 = j4;
                                    boolean z7 = z6;
                                    rg1 rg1Var3 = rg1Var2;
                                    final yp1 yp1Var3 = yp1Var2;
                                    yy yyVar = zy.a;
                                    if (j5 != 9205357640488583168L) {
                                        dr0Var3.V(3458246);
                                        xg xgVar = z7 ? tz0.c : tz0.b;
                                        rg1 rg1VarG = yj2.g(rg1Var3, fc0.b(j5), fc0.a(j5), 0.0f, 0.0f, 12);
                                        ua2 ua2VarA = ta2.a(xgVar, c5.r, dr0Var3, 0);
                                        int iHashCode = Long.hashCode(dr0Var3.T);
                                        dx1 dx1VarL = dr0Var3.l();
                                        rg1 rg1VarU = ls.U(dr0Var3, rg1VarG);
                                        sy.f.getClass();
                                        dr0Var3.Y();
                                        if (dr0Var3.S) {
                                            dr0Var3.k(l41.W);
                                        } else {
                                            dr0Var3.i0();
                                        }
                                        h12.y(c5.F, dr0Var3, ua2VarA);
                                        h12.y(c5.E, dr0Var3, dx1VarL);
                                        h12.y(c5.G, dr0Var3, Integer.valueOf(iHashCode));
                                        h12.t(dr0Var3);
                                        h12.y(c5.D, dr0Var3, rg1VarU);
                                        boolean zH = dr0Var3.h(yp1Var3);
                                        Object objK2 = dr0Var3.K();
                                        if (zH || objK2 == yyVar) {
                                            objK2 = new kp0() { // from class: na
                                                /* JADX WARN: Code duplicated, block: B:9:0x0026  */
                                                @Override // defpackage.kp0
                                                public final Object a() {
                                                    byte b3 = b2;
                                                    boolean z8 = false;
                                                    yp1 yp1Var4 = yp1Var3;
                                                    switch (b3) {
                                                        case 0:
                                                            if ((yp1Var4.a() & 9223372034707292159L) != 9205357640488583168L) {
                                                                z8 = true;
                                                            }
                                                            break;
                                                        default:
                                                            if ((yp1Var4.a() & 9223372034707292159L) != 9205357640488583168L) {
                                                                z8 = true;
                                                            }
                                                            break;
                                                    }
                                                    return Boolean.valueOf(z8);
                                                }
                                            };
                                            dr0Var3.f0(objK2);
                                        }
                                        h7.R(og1.h, (kp0) objK2, z7, dr0Var3, 6);
                                        dr0Var3.p(true);
                                        dr0Var3.p(false);
                                    } else {
                                        dr0Var3.V(4389176);
                                        boolean zH2 = dr0Var3.h(yp1Var3);
                                        Object objK3 = dr0Var3.K();
                                        if (zH2 || objK3 == yyVar) {
                                            objK3 = new kp0() { // from class: na
                                                /* JADX WARN: Code duplicated, block: B:9:0x0026  */
                                                @Override // defpackage.kp0
                                                public final Object a() {
                                                    byte b3 = b;
                                                    boolean z8 = false;
                                                    yp1 yp1Var4 = yp1Var3;
                                                    switch (b3) {
                                                        case 0:
                                                            if ((yp1Var4.a() & 9223372034707292159L) != 9205357640488583168L) {
                                                                z8 = true;
                                                            }
                                                            break;
                                                        default:
                                                            if ((yp1Var4.a() & 9223372034707292159L) != 9205357640488583168L) {
                                                                z8 = true;
                                                            }
                                                            break;
                                                    }
                                                    return Boolean.valueOf(z8);
                                                }
                                            };
                                            dr0Var3.f0(objK3);
                                        }
                                        h7.R(rg1Var3, (kp0) objK3, z7, dr0Var3, 0);
                                        dr0Var3.p(false);
                                    }
                                } else {
                                    dr0Var3.Q();
                                }
                                return j23.a;
                            }
                        }, dr0Var2), dr0Var2, 56);
                    } else {
                        dr0Var2.Q();
                    }
                    return j23.a;
                }
            }, dr0Var), dr0Var, i5 | 384);
        } else {
            dr0Var.Q();
            j3 = j2;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            final long j4 = j3;
            e72VarR.d = new zp0(z2, u82Var, z3, j4, f, rg1Var, i2) { // from class: la
                public final /* synthetic */ boolean i;
                public final /* synthetic */ u82 j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ long l;
                public final /* synthetic */ float m;
                public final /* synthetic */ rg1 n;

                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(49);
                    h7.Q(this.h, this.i, this.j, this.k, this.l, this.m, this.n, (dr0) obj, iA);
                    return j23.a;
                }
            };
        }
    }

    public static final void R(final rg1 rg1Var, final kp0 kp0Var, final boolean z2, dr0 dr0Var, final int i2) {
        int i3;
        dr0Var.W(2111672474);
        if ((i2 & 6) == 0) {
            i3 = (dr0Var.f(rg1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (dr0Var.h(kp0Var) ? 32 : 16) | (dr0Var.g(z2) ? 256 : 128);
        if (dr0Var.N(i4 & 1, (i4 & 147) != 146)) {
            ch2 ch2Var = mg2.a;
            y02.d(dr0Var, ls.t(yj2.j(rg1Var, 25.0f, 25.0f), new aq0() { // from class: pa
                @Override // defpackage.aq0
                public final Object c(Object obj, Object obj2, Object obj3) {
                    rg1 rg1Var2 = (rg1) obj;
                    dr0 dr0Var2 = (dr0) obj2;
                    ((Integer) obj3).getClass();
                    dr0Var2.V(-196777734);
                    final long j2 = ((rw2) dr0Var2.j(sw2.a)).a;
                    boolean zE = dr0Var2.e(j2);
                    final kp0 kp0Var2 = kp0Var;
                    boolean zF = zE | dr0Var2.f(kp0Var2);
                    final boolean z3 = z2;
                    boolean zG = zF | dr0Var2.g(z3);
                    Object objK = dr0Var2.K();
                    if (zG || objK == zy.a) {
                        objK = new vp0() { // from class: qa
                            @Override // defpackage.vp0
                            public final Object h(Object obj4) {
                                zp zpVar = (zp) obj4;
                                final t8 t8VarZ = h7.Z(zpVar, Float.intBitsToFloat((int) (zpVar.h.d() >> 32)) / 2.0f);
                                final ln lnVar = new ln(5, j2);
                                final kp0 kp0Var3 = kp0Var2;
                                final boolean z4 = z3;
                                return zpVar.a(new vp0() { // from class: ia
                                    @Override // defpackage.vp0
                                    public final Object h(Object obj5) {
                                        n41 n41Var = (n41) obj5;
                                        n41Var.a();
                                        yq yqVar = n41Var.h;
                                        boolean zBooleanValue = ((Boolean) kp0Var3.a()).booleanValue();
                                        j23 j23Var = j23.a;
                                        if (!zBooleanValue) {
                                            return j23Var;
                                        }
                                        boolean z5 = z4;
                                        t8 t8Var = t8VarZ;
                                        ln lnVar2 = lnVar;
                                        if (!z5) {
                                            td0.N(n41Var, t8Var, lnVar2);
                                            return j23Var;
                                        }
                                        long jX = yqVar.X();
                                        eg egVar = yqVar.i;
                                        long jQ = egVar.q();
                                        egVar.g().l();
                                        try {
                                            ((g2) egVar.i).M(-1.0f, 1.0f, jX);
                                            td0.N(n41Var, t8Var, lnVar2);
                                            return j23Var;
                                        } finally {
                                            wi0.r(egVar, jQ);
                                        }
                                    }
                                });
                            }
                        };
                        dr0Var2.f0(objK);
                    }
                    rg1 rg1VarI = aa3.i(rg1Var2, (vp0) objK);
                    dr0Var2.p(false);
                    return rg1VarI;
                }
            }));
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: oa
                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(i2 | 1);
                    h7.R(rg1Var, kp0Var, z2, (dr0) obj, iA);
                    return j23.a;
                }
            };
        }
    }

    public static final void S(kp0 kp0Var, dr0 dr0Var) {
        bs1 bs1Var = dr0Var.M.b.h;
        bs1Var.r0(rr1.c);
        dt.Q(bs1Var, 0, kp0Var);
    }

    public static final void T(ay1 ay1Var, dr0 dr0Var, int i2) {
        dr0 dr0Var2;
        ps2 ps2VarA;
        dr0Var.W(-66370780);
        int i3 = (dr0Var.h(ay1Var) ? 4 : 2) | i2;
        byte b = 0;
        if (dr0Var.N(i3 & 1, (i3 & 3) != 2)) {
            dy1 dy1VarF = ay1Var.f();
            if (dy1VarF != null) {
                Map map = rs2.a;
                ps2VarA = rs2.a(dy1VarF, ay1Var.e);
            } else {
                ps2VarA = null;
            }
            dr0Var2 = dr0Var;
            t03.d(yj2.a, null, null, null, dt.N(2046341106, new kw0((Object) ps2VarA, (byte) 6), dr0Var), dr0Var2, 196614);
        } else {
            dr0Var2 = dr0Var;
            dr0Var2.Q();
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new xx1(ay1Var, i2, b);
        }
    }

    public static final void U(e2 e2Var, wg2 wg2Var) {
        rg2 rg2Var = wg2Var.d;
        mj1 mj1Var = rg2Var.h;
        Object objG = rg2Var.h.g(ah2.z);
        if (objG == null) {
            objG = null;
        }
        ba2 ba2Var = (ba2) objG;
        if (s60.l(wg2Var)) {
            if (ba2Var == null || ba2Var.a != 8) {
                Object objG2 = mj1Var.g(qg2.y);
                if (objG2 == null) {
                    objG2 = null;
                }
                m1 m1Var = (m1) objG2;
                if (m1Var != null) {
                    e2Var.a(new z1(null, R.id.accessibilityActionPageUp, m1Var.a, null));
                }
                Object objG3 = mj1Var.g(qg2.A);
                if (objG3 == null) {
                    objG3 = null;
                }
                m1 m1Var2 = (m1) objG3;
                if (m1Var2 != null) {
                    e2Var.a(new z1(null, R.id.accessibilityActionPageDown, m1Var2.a, null));
                }
                Object objG4 = mj1Var.g(qg2.z);
                if (objG4 == null) {
                    objG4 = null;
                }
                m1 m1Var3 = (m1) objG4;
                if (m1Var3 != null) {
                    e2Var.a(new z1(null, R.id.accessibilityActionPageLeft, m1Var3.a, null));
                }
                Object objG5 = mj1Var.g(qg2.B);
                if (objG5 == null) {
                    objG5 = null;
                }
                m1 m1Var4 = (m1) objG5;
                if (m1Var4 != null) {
                    e2Var.a(new z1(null, R.id.accessibilityActionPageRight, m1Var4.a, null));
                }
            }
        }
    }

    public static final gl V(nx nxVar, dr0 dr0Var, int i2) {
        boolean z2 = (((i2 & 14) ^ 6) > 4 && dr0Var.f(nxVar)) || (i2 & 6) == 4;
        Object objK = dr0Var.K();
        Object obj = zy.a;
        if (z2 || objK == obj) {
            objK = new gl(nxVar);
            dr0Var.f0(objK);
        }
        gl glVar = (gl) objK;
        boolean zF = dr0Var.f(glVar);
        Object objK2 = dr0Var.K();
        if (zF || objK2 == obj) {
            objK2 = new p((Object) glVar, (byte) 9);
            dr0Var.f0(objK2);
        }
        G(glVar, (vp0) objK2, dr0Var);
        return glVar;
    }

    public static rg1 W(rg1 rg1Var, ui1 ui1Var, aa2 aa2Var, boolean z2, ba2 ba2Var, kp0 kp0Var, int i2) {
        rg1 rg1VarC;
        if ((i2 & 16) != 0) {
            ba2Var = null;
        }
        ba2 ba2Var2 = ba2Var;
        if (aa2Var != null) {
            rg1VarC = new ju(ui1Var, aa2Var, false, z2, null, ba2Var2, kp0Var);
        } else if (aa2Var == null) {
            rg1VarC = new ju(ui1Var, null, false, z2, null, ba2Var2, kp0Var);
        } else {
            og1 og1Var = og1.h;
            rg1VarC = ui1Var != null ? av0.a(og1Var, ui1Var, aa2Var).c(new ju(ui1Var, null, false, z2, null, ba2Var2, kp0Var)) : ls.t(og1Var, new ku(aa2Var, z2, ba2Var2, kp0Var));
        }
        return rg1Var.c(rg1VarC);
    }

    public static rg1 X(rg1 rg1Var, boolean z2, String str, ba2 ba2Var, kp0 kp0Var, int i2) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return rg1Var.c(new ju(null, null, true, z2, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : ba2Var, kp0Var));
    }

    public static final x20 Y(dr0 dr0Var) {
        return new j82(dr0Var.R);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    public static final t8 Z(zp zpVar, float f) {
        int iCeil = ((int) Math.ceil(f)) << 1;
        t8 t8VarD = ou.a;
        a6 a6Var = ou.b;
        yq yqVar = ou.c;
        if (t8VarD == null || a6Var == null) {
            t8VarD = ls.d(iCeil, iCeil, 1);
            ou.a = t8VarD;
            Canvas canvas = b6.a;
            a6Var = new a6();
            a6Var.a = new Canvas(ie1.d(t8VarD));
            ou.b = a6Var;
        } else {
            Bitmap bitmap = t8VarD.a;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                t8VarD = ls.d(iCeil, iCeil, 1);
                ou.a = t8VarD;
                Canvas canvas2 = b6.a;
                a6Var = new a6();
                a6Var.a = new Canvas(ie1.d(t8VarD));
                ou.b = a6Var;
            }
        }
        t8 t8Var = t8VarD;
        a6 a6Var2 = a6Var;
        if (yqVar == null) {
            yqVar = new yq();
            ou.c = yqVar;
        }
        yq yqVar2 = yqVar;
        xq xqVar = yqVar2.h;
        u31 layoutDirection = zpVar.h.getLayoutDirection();
        Bitmap bitmap2 = t8Var.a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        e90 e90Var = xqVar.a;
        u31 u31Var = xqVar.b;
        wq wqVar = xqVar.c;
        long j2 = xqVar.d;
        xqVar.a = zpVar;
        xqVar.b = layoutDirection;
        xqVar.c = a6Var2;
        xqVar.d = jFloatToRawIntBits;
        a6Var2.l();
        td0.H(yqVar2, kv.b, yqVar2.d(), 58);
        td0.H(yqVar2, cu.c(4278190080L), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), 120);
        td0.e0(yqVar2, cu.c(4278190080L), f, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), 120);
        a6Var2.i();
        xqVar.a = e90Var;
        xqVar.b = u31Var;
        xqVar.c = wqVar;
        xqVar.d = j2;
        return t8Var;
    }

    public static final ub2 a0(e30 e30Var) {
        ub2 ub2Var;
        e30Var.getClass();
        dc2 dc2Var = (dc2) e30Var.a(Q);
        Bundle bundle = null;
        if (dc2Var == null) {
            wg.m("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        h53 h53Var = (h53) e30Var.a(R);
        if (h53Var == null) {
            wg.m("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) e30Var.a(S);
        String str = (String) e30Var.a(s60.B0);
        if (str == null) {
            wg.m("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        bc2 bc2VarD = dc2Var.b().d("androidx.lifecycle.internal.SavedStateHandlesProvider");
        yb2 yb2Var = bc2VarD instanceof yb2 ? (yb2) bc2VarD : null;
        if (yb2Var == null) {
            li1.g("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap = g0(h53Var).b;
        ub2 ub2Var2 = (ub2) linkedHashMap.get(str);
        if (ub2Var2 != null) {
            return ub2Var2;
        }
        yb2Var.b();
        Bundle bundle3 = yb2Var.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                yb2Var.c = null;
            }
            bundle = bundle4;
        }
        if (bundle != null) {
            bundle2 = bundle;
        }
        if (bundle2 == null) {
            ub2Var = new ub2();
        } else {
            ClassLoader classLoader = ub2.class.getClassLoader();
            classLoader.getClass();
            bundle2.setClassLoader(classLoader);
            wd1 wd1Var = new wd1(bundle2.size());
            for (String str2 : bundle2.keySet()) {
                str2.getClass();
                wd1Var.put(str2, bundle2.get(str2));
            }
            ub2Var = new ub2(wd1Var.b());
        }
        linkedHashMap.put(str, ub2Var);
        return ub2Var;
    }

    public static final float c0(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 << 2;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    public static final void d0(dc2 dc2Var) {
        x81 x81Var = dc2Var.g().h;
        if (x81Var != x81.i && x81Var != x81.j) {
            li1.o("Failed to enable `SavedStateHandle` for `", dc2Var, "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", x81Var, "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.");
        } else if (dc2Var.b().d("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            yb2 yb2Var = new yb2(dc2Var.b(), (h53) dc2Var);
            dc2Var.b().h("androidx.lifecycle.internal.SavedStateHandlesProvider", yb2Var);
            dc2Var.g().a(new q72(yb2Var, (byte) 3));
        }
    }

    public static final Object e0(qf2 qf2Var, long j2, zp0 zp0Var) {
        Unsafe unsafe;
        long j3;
        while (true) {
            qf2 qf2Var2 = qf2Var;
            while (true) {
                if (qf2Var2.d >= j2 && !qf2Var2.c()) {
                    return qf2Var2;
                }
                Object objectVolatile = hi.a.getObjectVolatile(qf2Var2, zz.a);
                qf0 qf0Var = D;
                if (objectVolatile == qf0Var) {
                    return qf0Var;
                }
                qf2Var = (qf2) ((zz) objectVolatile);
                if (qf2Var == null) {
                    qf2 qf2Var3 = (qf2) zp0Var.f(Long.valueOf(qf2Var2.d + 1), qf2Var2);
                    do {
                        unsafe = hi.a;
                        j3 = zz.a;
                        if (unsafe.compareAndSwapObject(qf2Var2, j3, (Object) null, qf2Var3)) {
                            if (qf2Var2.c()) {
                                qf2Var2.d();
                            }
                            qf2Var2 = qf2Var3;
                            break;
                        }
                    } while (unsafe.getObjectVolatile(qf2Var2, j3) == null);
                }
            }
        }
    }

    public static final iu0 f0() {
        iu0 iu0Var = e0;
        if (iu0Var != null) {
            return iu0Var;
        }
        hu0 hu0Var = new hu0("Filled.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = k33.a;
        rl2 rl2Var = new rl2(kv.b);
        xl1 xl1Var = new xl1((byte) 3);
        xl1Var.A(19.0f, 13.0f);
        xl1Var.x(-6.0f);
        xl1Var.I(6.0f);
        xl1Var.x(-2.0f);
        xl1Var.I(-6.0f);
        xl1Var.w(5.0f);
        xl1Var.I(-2.0f);
        xl1Var.x(6.0f);
        xl1Var.H(5.0f);
        xl1Var.x(2.0f);
        xl1Var.I(6.0f);
        xl1Var.x(6.0f);
        xl1Var.I(2.0f);
        xl1Var.m();
        hu0.a(hu0Var, (ArrayList) xl1Var.i, rl2Var);
        iu0 iu0VarB = hu0Var.b();
        e0 = iu0VarB;
        return iu0VarB;
    }

    public static final zb2 g0(h53 h53Var) {
        xb2 xb2Var = new xb2();
        e30 e30VarZ = cy1.z(h53Var);
        e30VarZ.getClass();
        g53 g53VarF = h53Var.f();
        g53VarF.getClass();
        return (zb2) new wk(g53VarF, xb2Var, e30VarZ).y(z72.a(zb2.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final tu h0(z43 z43Var) {
        tu tuVar;
        z43Var.getClass();
        synchronized (d0) {
            tuVar = (tu) z43Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (tuVar == null) {
                o20 o20Var = xf0.h;
                try {
                    r70 r70Var = ya0.a;
                    o20Var = pd1.a.m;
                } catch (IllegalStateException | mo1 unused) {
                }
                tu tuVar2 = new tu(o20Var.i(new up2(null)));
                z43Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", tuVar2);
                tuVar = tuVar2;
            }
        }
        return tuVar;
    }

    public static final rg1 i0(rg1 rg1Var, vp0 vp0Var) {
        return rg1Var.c(new mn(vp0Var));
    }

    public static rg1 j0(rg1 rg1Var, float f, float f2, float f3, float f4, float f5, long j2, hi2 hi2Var, boolean z2, long j3, long j4, int i2) {
        return rg1Var.c(new ds0((i2 & 1) != 0 ? 1.0f : f, (i2 & 2) != 0 ? 1.0f : f2, (i2 & 4) != 0 ? 1.0f : f3, 0.0f, 0.0f, (i2 & 32) != 0 ? 0.0f : f4, 0.0f, 0.0f, (i2 & 256) != 0 ? 0.0f : f5, 8.0f, (i2 & 1024) != 0 ? ez2.b : j2, (i2 & 2048) != 0 ? t03.A : hi2Var, (i2 & 4096) != 0 ? false : z2, (i2 & CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE) != 0 ? fs0.a : j3, (i2 & 32768) != 0 ? fs0.a : j4, 0, 3, null, p31.a));
    }

    public static rg1 k0(rg1 rg1Var, float f, float f2, float f3, float f4, hi2 hi2Var, int i2) {
        float f5 = (i2 & 1) != 0 ? 1.0f : f;
        float f6 = (i2 & 2) != 0 ? 1.0f : f2;
        float f7 = (i2 & 4) != 0 ? 1.0f : f3;
        float f8 = (i2 & 32) != 0 ? 0.0f : f4;
        hi2 hi2Var2 = (i2 & 2048) != 0 ? t03.A : hi2Var;
        long j2 = fs0.a;
        return j0(rg1Var, f5, f6, f7, f8, 0.0f, ez2.b, hi2Var2, false, j2, j2, 524288);
    }

    public static double[] l0(int i2, double[] dArr) {
        return i2 <= dArr.length ? dArr : Arrays.copyOf(dArr, Math.max(i2, dArr.length << 1));
    }

    public static int[] m0(int[] iArr, int i2) {
        return i2 <= iArr.length ? iArr : Arrays.copyOf(iArr, Math.max(i2, iArr.length << 1));
    }

    public static final int n0(bi biVar, Object obj, int i2) {
        int i3 = biVar.j;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iH = s60.h(i3, i2, biVar.h);
            if (iH < 0 || uz0.g(obj, biVar.i[iH])) {
                return iH;
            }
            int i4 = iH + 1;
            while (i4 < i3 && biVar.h[i4] == i2) {
                if (uz0.g(obj, biVar.i[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iH - 1; i5 >= 0 && biVar.h[i5] == i2; i5--) {
                if (uz0.g(obj, biVar.i[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final boolean o0(KeyEvent keyEvent) {
        long jF = ys.F(keyEvent);
        int i2 = t21.O;
        return t21.a(jF, t21.h) || t21.a(jF, t21.r) || t21.a(jF, t21.E) || t21.a(jF, t21.q);
    }

    public static final long p0(float f, long j2) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j2 >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    @Override // defpackage.v60
    public abstract short A();

    @Override // defpackage.v60
    public String B() {
        b0();
        throw null;
    }

    @Override // defpackage.v60
    public float C() {
        b0();
        throw null;
    }

    @Override // defpackage.v60
    public hz D(rh2 rh2Var) {
        rh2Var.getClass();
        return this;
    }

    @Override // defpackage.v60
    public double E() {
        b0();
        throw null;
    }

    @Override // defpackage.v60
    public abstract long b();

    public final void b0() {
        throw new wh2(z72.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // defpackage.hz
    public final v60 c(b32 b32Var, int i2) {
        return x(b32Var.j(i2));
    }

    @Override // defpackage.v60
    public boolean d() {
        b0();
        throw null;
    }

    @Override // defpackage.v60
    public boolean e() {
        return true;
    }

    @Override // defpackage.v60
    public char f() {
        b0();
        throw null;
    }

    @Override // defpackage.hz
    public final Object g(rh2 rh2Var, int i2, r21 r21Var, Object obj) {
        rh2Var.getClass();
        if (r21Var.d().h() || e()) {
            return a(r21Var);
        }
        return null;
    }

    @Override // defpackage.hz
    public final char i(b32 b32Var, int i2) {
        return f();
    }

    @Override // defpackage.hz
    public final long l(b32 b32Var, int i2) {
        return b();
    }

    @Override // defpackage.hz
    public final float m(b32 b32Var, int i2) {
        return C();
    }

    @Override // defpackage.hz
    public final byte o(b32 b32Var, int i2) {
        return v();
    }

    @Override // defpackage.hz
    public final String p(rh2 rh2Var, int i2) {
        rh2Var.getClass();
        return B();
    }

    @Override // defpackage.v60
    public abstract int q();

    @Override // defpackage.hz
    public final short r(b32 b32Var, int i2) {
        return A();
    }

    @Override // defpackage.hz
    public void s(rh2 rh2Var) {
        rh2Var.getClass();
    }

    @Override // defpackage.hz
    public final boolean u(rh2 rh2Var, int i2) {
        rh2Var.getClass();
        return d();
    }

    @Override // defpackage.v60
    public abstract byte v();

    @Override // defpackage.hz
    public final double w(rh2 rh2Var, int i2) {
        rh2Var.getClass();
        return E();
    }

    @Override // defpackage.v60
    public v60 x(rh2 rh2Var) {
        rh2Var.getClass();
        return this;
    }

    @Override // defpackage.hz
    public Object y(rh2 rh2Var, int i2, r21 r21Var, Object obj) {
        rh2Var.getClass();
        r21Var.getClass();
        return a(r21Var);
    }

    @Override // defpackage.hz
    public final int z(rh2 rh2Var, int i2) {
        rh2Var.getClass();
        return q();
    }
}
