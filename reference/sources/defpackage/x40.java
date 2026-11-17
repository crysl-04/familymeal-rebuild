package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class x40 {
    public static final rt1 a = t03.g(0.0f, 0.0f, 6.0f, 8.0f, 3);
    public static final float b = 8.0f;
    public static final float c = 12.0f;

    public static final void a(kp0 kp0Var, nx nxVar, rg1 rg1Var, nx nxVar2, hi2 hi2Var, s40 s40Var, la0 la0Var, nx nxVar3, dr0 dr0Var, int i) {
        rg1 rg1Var2;
        hi2 hi2Var2;
        s40 s40Var2;
        la0 la0Var2;
        int i2;
        rg1 rg1Var3;
        hi2 hi2Var3;
        la0 la0Var3;
        s40 s40Var3;
        dr0Var.W(219718641);
        int i3 = i | (dr0Var.h(kp0Var) ? 4 : 2) | 13312384;
        if (dr0Var.N(i3 & 1, (38347923 & i3) != 38347922)) {
            dr0Var.S();
            if ((i & 1) == 0 || dr0Var.x()) {
                w40 w40Var = w40.a;
                hi2 hi2VarA = mi2.a(tz0.n, dr0Var);
                w40 w40Var2 = w40.a;
                s40 s40VarC = w40.c(dr0Var);
                i2 = i3 & (-3727361);
                la0 la0Var4 = new la0(3);
                rg1Var3 = og1.h;
                hi2Var3 = hi2VarA;
                la0Var3 = la0Var4;
                s40Var3 = s40VarC;
            } else {
                dr0Var.Q();
                i2 = i3 & (-3727361);
                rg1Var3 = rg1Var;
                hi2Var3 = hi2Var;
                s40Var3 = s40Var;
                la0Var3 = la0Var;
            }
            dr0Var.q();
            b5.d(kp0Var, yj2.m(rg1Var3), la0Var3, dt.N(1108953335, new q50(hi2Var3, s40Var3, nxVar3, nxVar2, nxVar), dr0Var), dr0Var, (i2 & 14) | 3456);
            rg1Var2 = rg1Var3;
            hi2Var2 = hi2Var3;
            s40Var2 = s40Var3;
            la0Var2 = la0Var3;
        } else {
            dr0Var.Q();
            rg1Var2 = rg1Var;
            hi2Var2 = hi2Var;
            s40Var2 = s40Var;
            la0Var2 = la0Var;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new l40(kp0Var, nxVar, rg1Var2, nxVar2, hi2Var2, s40Var2, la0Var2, nxVar3, i);
        }
    }
}
