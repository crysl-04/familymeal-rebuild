package defpackage;

import android.content.Context;
import com.familymeal.app.MealPlannerApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class pg {
    public static final List a;

    static {
        iu0 iu0VarB = dt.h;
        if (iu0VarB == null) {
            hu0 hu0Var = new hu0("Filled.Home", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = k33.a;
            rl2 rl2Var = new rl2(kv.b);
            xl1 xl1Var = new xl1((byte) 3);
            xl1Var.A(10.0f, 20.0f);
            xl1Var.I(-6.0f);
            xl1Var.x(4.0f);
            xl1Var.I(6.0f);
            xl1Var.x(5.0f);
            xl1Var.I(-8.0f);
            xl1Var.x(3.0f);
            xl1Var.y(12.0f, 3.0f);
            xl1Var.y(2.0f, 12.0f);
            xl1Var.x(3.0f);
            xl1Var.I(8.0f);
            xl1Var.m();
            hu0.a(hu0Var, (ArrayList) xl1Var.i, rl2Var);
            iu0VarB = hu0Var.b();
            dt.h = iu0VarB;
        }
        gr2 gr2Var = new gr2("week", "本周", iu0VarB);
        iu0 iu0VarB2 = ou.f;
        if (iu0VarB2 == null) {
            hu0 hu0Var2 = new hu0("AutoMirrored.Filled.List", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
            int i2 = k33.a;
            rl2 rl2Var2 = new rl2(kv.b);
            xl1 xl1Var2 = new xl1((byte) 3);
            xl1Var2.A(3.0f, 13.0f);
            xl1Var2.x(2.0f);
            xl1Var2.I(-2.0f);
            xl1Var2.y(3.0f, 11.0f);
            xl1Var2.I(2.0f);
            xl1Var2.m();
            xl1Var2.A(3.0f, 17.0f);
            xl1Var2.x(2.0f);
            xl1Var2.I(-2.0f);
            xl1Var2.y(3.0f, 15.0f);
            xl1Var2.I(2.0f);
            xl1Var2.m();
            xl1Var2.A(3.0f, 9.0f);
            xl1Var2.x(2.0f);
            xl1Var2.y(5.0f, 7.0f);
            xl1Var2.y(3.0f, 7.0f);
            xl1Var2.I(2.0f);
            xl1Var2.m();
            xl1Var2.A(7.0f, 13.0f);
            xl1Var2.x(14.0f);
            xl1Var2.I(-2.0f);
            xl1Var2.y(7.0f, 11.0f);
            xl1Var2.I(2.0f);
            xl1Var2.m();
            xl1Var2.A(7.0f, 17.0f);
            xl1Var2.x(14.0f);
            xl1Var2.I(-2.0f);
            xl1Var2.y(7.0f, 15.0f);
            xl1Var2.I(2.0f);
            xl1Var2.m();
            xl1Var2.A(7.0f, 7.0f);
            xl1Var2.I(2.0f);
            xl1Var2.x(14.0f);
            xl1Var2.y(21.0f, 7.0f);
            xl1Var2.y(7.0f, 7.0f);
            xl1Var2.m();
            hu0.a(hu0Var2, (ArrayList) xl1Var2.i, rl2Var2);
            iu0VarB2 = hu0Var2.b();
            ou.f = iu0VarB2;
        }
        gr2 gr2Var2 = new gr2("recipes", "菜谱", iu0VarB2);
        iu0 iu0VarB3 = pz1.a;
        if (iu0VarB3 == null) {
            hu0 hu0Var3 = new hu0("Filled.ShoppingCart", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i3 = k33.a;
            rl2 rl2Var3 = new rl2(kv.b);
            xl1 xl1Var3 = new xl1((byte) 3);
            xl1Var3.A(7.0f, 18.0f);
            xl1Var3.s(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
            xl1Var3.C(5.9f, 22.0f, 7.0f, 22.0f);
            xl1Var3.D(2.0f, -0.9f, 2.0f, -2.0f);
            xl1Var3.D(-0.9f, -2.0f, -2.0f, -2.0f);
            xl1Var3.m();
            xl1Var3.A(1.0f, 2.0f);
            xl1Var3.I(2.0f);
            xl1Var3.x(2.0f);
            xl1Var3.z(3.6f, 7.59f);
            xl1Var3.z(-1.35f, 2.45f);
            xl1Var3.s(-0.16f, 0.28f, -0.25f, 0.61f, -0.25f, 0.96f);
            xl1Var3.s(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
            xl1Var3.x(12.0f);
            xl1Var3.I(-2.0f);
            xl1Var3.y(7.42f, 15.0f);
            xl1Var3.s(-0.14f, 0.0f, -0.25f, -0.11f, -0.25f, -0.25f);
            xl1Var3.z(0.03f, -0.12f);
            xl1Var3.z(0.9f, -1.63f);
            xl1Var3.x(7.45f);
            xl1Var3.s(0.75f, 0.0f, 1.41f, -0.41f, 1.75f, -1.03f);
            xl1Var3.z(3.58f, -6.49f);
            xl1Var3.s(0.08f, -0.14f, 0.12f, -0.31f, 0.12f, -0.48f);
            xl1Var3.s(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
            xl1Var3.y(5.21f, 4.0f);
            xl1Var3.z(-0.94f, -2.0f);
            xl1Var3.y(1.0f, 2.0f);
            xl1Var3.m();
            xl1Var3.A(17.0f, 18.0f);
            xl1Var3.s(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
            xl1Var3.D(0.89f, 2.0f, 1.99f, 2.0f);
            xl1Var3.D(2.0f, -0.9f, 2.0f, -2.0f);
            xl1Var3.D(-0.9f, -2.0f, -2.0f, -2.0f);
            xl1Var3.m();
            hu0.a(hu0Var3, (ArrayList) xl1Var3.i, rl2Var3);
            iu0VarB3 = hu0Var3.b();
            pz1.a = iu0VarB3;
        }
        gr2 gr2Var3 = new gr2("ingredients", "食材", iu0VarB3);
        iu0 iu0VarB4 = cy1.a;
        if (iu0VarB4 == null) {
            hu0 hu0Var4 = new hu0("Filled.Person", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = k33.a;
            rl2 rl2Var4 = new rl2(kv.b);
            xl1 xl1Var4 = new xl1((byte) 3);
            xl1Var4.A(12.0f, 12.0f);
            xl1Var4.s(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
            xl1Var4.D(-1.79f, -4.0f, -4.0f, -4.0f);
            xl1Var4.D(-4.0f, 1.79f, -4.0f, 4.0f);
            xl1Var4.D(1.79f, 4.0f, 4.0f, 4.0f);
            xl1Var4.m();
            xl1Var4.A(12.0f, 14.0f);
            xl1Var4.s(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
            xl1Var4.I(2.0f);
            xl1Var4.x(16.0f);
            xl1Var4.I(-2.0f);
            xl1Var4.s(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
            xl1Var4.m();
            hu0.a(hu0Var4, (ArrayList) xl1Var4.i, rl2Var4);
            iu0VarB4 = hu0Var4.b();
            cy1.a = iu0VarB4;
        }
        gr2 gr2Var4 = new gr2("people", "家人", iu0VarB4);
        iu0 iu0VarB5 = y02.a;
        if (iu0VarB5 == null) {
            hu0 hu0Var5 = new hu0("Filled.Settings", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i5 = k33.a;
            rl2 rl2Var5 = new rl2(kv.b);
            xl1 xl1Var5 = new xl1((byte) 3);
            xl1Var5.A(19.14f, 12.94f);
            xl1Var5.s(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
            xl1Var5.s(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
            xl1Var5.z(2.03f, -1.58f);
            xl1Var5.s(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
            xl1Var5.z(-1.92f, -3.32f);
            xl1Var5.s(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
            xl1Var5.z(-2.39f, 0.96f);
            xl1Var5.s(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
            xl1Var5.y(14.4f, 2.81f);
            xl1Var5.s(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
            xl1Var5.x(-3.84f);
            xl1Var5.s(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
            xl1Var5.y(9.25f, 5.35f);
            xl1Var5.r(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
            xl1Var5.y(5.24f, 5.33f);
            xl1Var5.s(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
            xl1Var5.y(2.74f, 8.87f);
            xl1Var5.r(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
            xl1Var5.z(2.03f, 1.58f);
            xl1Var5.r(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
            xl1Var5.D(0.02f, 0.64f, 0.07f, 0.94f);
            xl1Var5.z(-2.03f, 1.58f);
            xl1Var5.s(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
            xl1Var5.z(1.92f, 3.32f);
            xl1Var5.s(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
            xl1Var5.z(2.39f, -0.96f);
            xl1Var5.s(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
            xl1Var5.z(0.36f, 2.54f);
            xl1Var5.s(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
            xl1Var5.x(3.84f);
            xl1Var5.s(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
            xl1Var5.z(0.36f, -2.54f);
            xl1Var5.s(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
            xl1Var5.z(2.39f, 0.96f);
            xl1Var5.s(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
            xl1Var5.z(1.92f, -3.32f);
            xl1Var5.s(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
            xl1Var5.y(19.14f, 12.94f);
            xl1Var5.m();
            xl1Var5.A(12.0f, 15.6f);
            xl1Var5.s(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
            xl1Var5.D(1.62f, -3.6f, 3.6f, -3.6f);
            xl1Var5.D(3.6f, 1.62f, 3.6f, 3.6f);
            xl1Var5.C(13.98f, 15.6f, 12.0f, 15.6f);
            xl1Var5.m();
            hu0.a(hu0Var5, (ArrayList) xl1Var5.i, rl2Var5);
            iu0VarB5 = hu0Var5.b();
            y02.a = iu0VarB5;
        }
        a = lt.Q(gr2Var, gr2Var2, gr2Var3, gr2Var4, new gr2("settings", "设置", iu0VarB5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static final void a(int i, dr0 dr0Var) {
        e72 e72VarR;
        ig igVar;
        dl1 dl1Var;
        ?? r0;
        dr0 dr0Var2;
        dr0 dr0Var3;
        dr0 dr0Var4 = dr0Var;
        dr0Var4.W(-416787429);
        if (dr0Var4.N(i & 1, i != 0)) {
            ie0 ie0Var = i7.b;
            Context applicationContext = ((Context) dr0Var4.j(ie0Var)).getApplicationContext();
            applicationContext.getClass();
            MealPlannerApp mealPlannerApp = (MealPlannerApp) applicationContext;
            Object objK = dr0Var4.K();
            yy yyVar = zy.a;
            if (objK == yyVar) {
                objK = rz1.x(Boolean.FALSE);
                dr0Var4.f0(objK);
            }
            sj1 sj1Var = (sj1) objK;
            Object objK2 = dr0Var4.K();
            Object obj = null;
            if (objK2 == yyVar) {
                objK2 = rz1.x(null);
                dr0Var4.f0(objK2);
            }
            sj1 sj1Var2 = (sj1) objK2;
            boolean zH = dr0Var4.h(mealPlannerApp);
            Object objK3 = dr0Var4.K();
            if (zH || objK3 == yyVar) {
                j jVar = new j(mealPlannerApp, sj1Var, sj1Var2, null, (byte) 2);
                dr0Var4.f0(jVar);
                objK3 = jVar;
            }
            j23 j23Var = j23.a;
            h7.J((zp0) objK3, dr0Var4, j23Var);
            if (((Boolean) sj1Var.getValue()).booleanValue()) {
                dr0Var4.V(237013479);
                dr0Var4.p(false);
                Context context = (Context) dr0Var4.j(ie0Var);
                Object[] objArrCopyOf = Arrays.copyOf(new sm1[0], 0);
                k42 k42Var = new k42(new yx((byte) 21), new z61(context, (byte) 7), (byte) 4);
                boolean zH2 = dr0Var4.h(context);
                Object objK4 = dr0Var4.K();
                if (zH2 || objK4 == yyVar) {
                    objK4 = new o9(context, (byte) 25);
                    dr0Var4.f0(objK4);
                }
                kl1 kl1Var = (kl1) rz1.B(objArrCopyOf, k42Var, (kp0) objK4, dr0Var4, 0);
                pk1 pk1Var = (pk1) pz1.h(new g62(kl1Var.b.z), null, dr0Var4, 48, 2).getValue();
                if (pk1Var != null && (dl1Var = pk1Var.i) != null) {
                    obj = (String) dl1Var.i.f;
                }
                cy1.a(null, null, dt.N(-1038035296, new j7(obj, kl1Var, (byte) 1), dr0Var4), null, null, 0, 0L, 0L, new qj0(), dt.N(582031082, new kw0(kl1Var, (byte) 1), dr0Var4), dr0Var, 805306752, 251);
            } else {
                dr0Var4.V(236839538);
                yi0 yi0Var = yj2.b;
                ze1 ze1VarC = ho.c(c5.m, false);
                int iHashCode = Long.hashCode(dr0Var4.T);
                dx1 dx1VarL = dr0Var4.l();
                rg1 rg1VarU = ls.U(dr0Var4, yi0Var);
                sy.f.getClass();
                dr0Var4.Y();
                if (dr0Var4.S) {
                    dr0Var4.k(l41.W);
                } else {
                    dr0Var4.i0();
                }
                h12.y(c5.F, dr0Var4, ze1VarC);
                h12.y(c5.E, dr0Var4, dx1VarL);
                h12.y(c5.G, dr0Var4, Integer.valueOf(iHashCode));
                h12.t(dr0Var4);
                h12.y(c5.D, dr0Var4, rg1VarU);
                String str = (String) sj1Var2.getValue();
                if (str == null) {
                    dr0Var4.V(785620149);
                    dr0Var4.p(false);
                    r0 = 0;
                } else {
                    dr0Var4.V(785620150);
                    r0 = 0;
                    gw2.b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var, 0, 0, 262142);
                    dr0Var2 = dr0Var;
                    dr0Var2.p(false);
                    obj = j23Var;
                }
                if (obj == null) {
                    dr0Var3 = dr0Var2;
                    dr0Var3 = dr0Var4;
                    dr0Var3.V(-1498677417);
                    e42.a(null, 0L, 0.0f, 0L, 0, 0.0f, dr0Var3, 0, 63);
                } else {
                    dr0Var3 = dr0Var2;
                    dr0Var3 = dr0Var4;
                    dr0Var3.V(-1498678471);
                }
                dr0Var3.p(r0);
                dr0Var3.p(true);
                dr0Var3.p(r0);
                e72VarR = dr0Var3.r();
                if (e72VarR == null) {
                    return;
                } else {
                    igVar = new ig(i, r0);
                }
            }
            e72VarR.d = igVar;
        }
        dr0Var.Q();
        e72VarR = dr0Var.r();
        if (e72VarR != null) {
            igVar = new ig(i, (byte) 1);
            e72VarR.d = igVar;
        }
    }
}
