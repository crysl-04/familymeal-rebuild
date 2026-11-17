package defpackage;

import android.content.res.Configuration;
import java.util.Arrays;
import java.util.Locale;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class w40 {
    public static final w40 a = new w40();

    static {
        new qy0(1900, 2100, 1);
    }

    public static s40 c(dr0 dr0Var) {
        pv pvVar = (pv) dr0Var.j(rv.a);
        s40 s40Var = pvVar.d0;
        if (s40Var != null) {
            dr0Var.V(642290457);
            dr0Var.p(false);
            return s40Var;
        }
        dr0Var.V(642416503);
        long jC = rv.c(pvVar, tz0.l);
        long jC2 = rv.c(pvVar, tz0.C);
        long jC3 = rv.c(pvVar, tz0.A);
        long jC4 = rv.c(pvVar, tz0.H);
        long jC5 = rv.c(pvVar, tz0.G);
        long j = pvVar.s;
        qv qvVar = tz0.P;
        long jC6 = rv.c(pvVar, qvVar);
        long jB = kv.b(0.38f, rv.c(pvVar, qvVar));
        qv qvVar2 = tz0.x;
        long jC7 = rv.c(pvVar, qvVar2);
        qv qvVar3 = tz0.N;
        long jC8 = rv.c(pvVar, qvVar3);
        long jB2 = kv.b(0.38f, rv.c(pvVar, qvVar3));
        qv qvVar4 = tz0.M;
        long jC9 = rv.c(pvVar, qvVar4);
        long jB3 = kv.b(0.38f, rv.c(pvVar, qvVar4));
        qv qvVar5 = tz0.y;
        long jC10 = rv.c(pvVar, qvVar5);
        long jB4 = kv.b(0.38f, rv.c(pvVar, qvVar5));
        qv qvVar6 = tz0.u;
        long jC11 = rv.c(pvVar, qvVar6);
        long jB5 = kv.b(0.38f, rv.c(pvVar, qvVar6));
        qv qvVar7 = tz0.t;
        s40 s40Var2 = new s40(jC, jC2, jC3, jC4, jC5, j, jC6, jB, jC7, jC8, jB2, jC9, jB3, jC10, jB4, jC11, jB5, rv.c(pvVar, qvVar7), kv.b(0.38f, rv.c(pvVar, qvVar7)), rv.c(pvVar, qvVar2), rv.c(pvVar, tz0.v), rv.c(pvVar, tz0.E), rv.c(pvVar, tz0.F), rv.c(pvVar, ia2.l), c5.m(pvVar, dr0Var));
        pvVar.d0 = s40Var2;
        dr0Var.p(false);
        return s40Var2;
    }

    public final void a(final Long l, final int i, final y40 y40Var, final rg1 rg1Var, final long j, dr0 dr0Var, final int i2) {
        dr0Var.W(1913724796);
        int i3 = i2 | (dr0Var.f(l) ? 4 : 2) | (dr0Var.d(i) ? 32 : 16) | (dr0Var.f(y40Var) ? 256 : 128) | (dr0Var.e(j) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192);
        byte b = 1;
        if (dr0Var.N(i3 & 1, (74899 & i3) != 74898)) {
            dr0Var.S();
            if ((i2 & 1) != 0 && !dr0Var.x()) {
                dr0Var.Q();
            }
            dr0Var.q();
            dr0Var.V(2088426481);
            Locale locale = ((Configuration) dr0Var.j(i7.a)).getLocales().get(0);
            dr0Var.p(false);
            String strA = y40Var.a(l, locale, false);
            String strA2 = y40Var.a(l, locale, true);
            String strL = "";
            if (strA2 == null) {
                dr0Var.V(380185931);
                if (i == 0) {
                    dr0Var.V(843549871);
                    strA2 = h12.l(R.string.m3c_date_picker_no_selection_description, dr0Var);
                    dr0Var.p(false);
                } else if (i == 1) {
                    dr0Var.V(843552842);
                    strA2 = h12.l(R.string.m3c_date_input_no_input_description, dr0Var);
                    dr0Var.p(false);
                } else {
                    dr0Var.V(380407362);
                    dr0Var.p(false);
                    strA2 = "";
                }
                dr0Var.p(false);
            } else {
                dr0Var.V(843542258);
                dr0Var.p(false);
            }
            if (strA == null) {
                dr0Var.V(380507587);
                if (i == 0) {
                    dr0Var.V(843560257);
                    strA = h12.l(R.string.m3c_date_picker_headline, dr0Var);
                    dr0Var.p(false);
                } else if (i == 1) {
                    dr0Var.V(843562784);
                    strA = h12.l(R.string.m3c_date_input_headline, dr0Var);
                    dr0Var.p(false);
                } else {
                    dr0Var.V(380705954);
                    dr0Var.p(false);
                    strA = "";
                }
                dr0Var.p(false);
            } else {
                dr0Var.V(843557408);
                dr0Var.p(false);
            }
            if (i == 0) {
                dr0Var.V(843570444);
                strL = h12.l(R.string.m3c_date_picker_headline_description, dr0Var);
                dr0Var.p(false);
            } else if (i == 1) {
                dr0Var.V(843573323);
                strL = h12.l(R.string.m3c_date_input_headline_description, dr0Var);
                dr0Var.p(false);
            } else {
                dr0Var.V(381043234);
                dr0Var.p(false);
            }
            String str = String.format(strL, Arrays.copyOf(new Object[]{strA2}, 1));
            boolean zF = dr0Var.f(str);
            Object objK = dr0Var.K();
            if (zF || objK == zy.a) {
                objK = new ql(str, b);
                dr0Var.f0(objK);
            }
            gw2.b(strA, tg2.a(rg1Var, false, (vp0) objK), j, 0L, null, 0L, null, 0L, 0, false, 1, 0, null, dr0Var, (i3 >> 6) & 896, 24576, 245752);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0(l, i, y40Var, rg1Var, j, i2) { // from class: t40
                public final /* synthetic */ Long i;
                public final /* synthetic */ int j;
                public final /* synthetic */ y40 k;
                public final /* synthetic */ rg1 l;
                public final /* synthetic */ long m;

                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(199681);
                    this.h.a(this.i, this.j, this.k, this.l, this.m, (dr0) obj, iA);
                    return j23.a;
                }
            };
        }
    }

    public final void b(int i, rg1 rg1Var, long j, dr0 dr0Var, int i2) {
        dr0 dr0Var2;
        dr0Var.W(-390880814);
        int i3 = i2 | (dr0Var.d(i) ? 4 : 2) | (dr0Var.e(j) ? 256 : 128);
        if (dr0Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            dr0Var.S();
            if ((i2 & 1) != 0 && !dr0Var.x()) {
                dr0Var.Q();
            }
            dr0Var.q();
            if (i == 0) {
                dr0Var.V(-1974299164);
                gw2.b(h12.l(R.string.m3c_date_picker_title, dr0Var), rg1Var, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var, i3 & 1008, 0, 262136);
                dr0Var2 = dr0Var;
                dr0Var2.p(false);
            } else {
                dr0Var2 = dr0Var;
                if (i == 1) {
                    dr0Var2.V(-1974291869);
                    gw2.b(h12.l(R.string.m3c_date_input_title, dr0Var2), rg1Var, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var2, i3 & 1008, 0, 262136);
                    dr0Var2 = dr0Var2;
                    dr0Var2.p(false);
                } else {
                    dr0Var2.V(-1073325776);
                    dr0Var2.p(false);
                }
            }
        } else {
            dr0Var2 = dr0Var;
            dr0Var2.Q();
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new u40(this, i, rg1Var, j, i2);
        }
    }
}
