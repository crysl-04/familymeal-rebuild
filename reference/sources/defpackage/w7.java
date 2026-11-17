package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class w7 {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    public static final void a(yp1 yp1Var, rg1 rg1Var, long j, dr0 dr0Var, int i) {
        int i2;
        dr0Var.W(1776202187);
        int i3 = (dr0Var.f(yp1Var) ? 4 : 2) | i | (dr0Var.f(rg1Var) ? 32 : 16) | 128;
        if (dr0Var.N(i3 & 1, (i3 & 147) != 146)) {
            dr0Var.S();
            if ((i & 1) == 0 || dr0Var.x()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                dr0Var.Q();
                i2 = i3 & (-897);
            }
            dr0Var.q();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objK = dr0Var.K();
            if (z || objK == zy.a) {
                objK = new p(yp1Var, (byte) 8);
                dr0Var.f0(objK);
            }
            h7.I(yp1Var, c5.j, dt.N(-1653527038, new r7(j, tg2.a(rg1Var, false, (vp0) objK)), dr0Var), dr0Var, i4 | 432);
        } else {
            dr0Var.Q();
        }
        long j2 = j;
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new s7(yp1Var, rg1Var, j2, i);
        }
    }

    public static final void b(rg1 rg1Var, dr0 dr0Var, int i, int i2) {
        int i3;
        dr0Var.W(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (dr0Var.f(rg1Var) ? 4 : 2) | i;
        }
        byte b = 0;
        if (dr0Var.N(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                rg1Var = og1.h;
            }
            y02.d(dr0Var, aa3.i(yj2.j(rg1Var, a, 25.0f), new u7(((rw2) dr0Var.j(sw2.a)).a, b)));
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new t7(rg1Var, i, i2);
        }
    }
}
