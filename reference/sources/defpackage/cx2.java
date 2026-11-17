package defpackage;

import android.content.res.Configuration;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class cx2 {
    public static final pv a = rv.e(-34, cu.c(4281236786L), cu.c(4283796271L));
    public static final pv b;

    static {
        long jC = cu.c(4286695300L);
        b = new pv(jC, lv.j, lv.z, lv.k, lv.e, cu.c(4289648001L), lv.n, lv.D, lv.o, lv.P, lv.t, lv.Q, lv.u, lv.a, lv.g, lv.G, lv.r, lv.O, lv.s, jC, lv.f, lv.d, lv.b, lv.h, lv.c, lv.i, lv.x, lv.y, lv.C, lv.H, lv.N, lv.I, lv.J, lv.K, lv.L, lv.M, lv.A, lv.B, lv.l, lv.m, lv.E, lv.F, lv.p, lv.q, lv.R, lv.S, lv.v, lv.w);
    }

    public static final void a(nx nxVar, dr0 dr0Var, int i) {
        nx nxVar2;
        dr0 dr0Var2;
        dr0Var.W(1865685384);
        if (dr0Var.N(i & 1, (i & 3) != 2)) {
            nxVar2 = nxVar;
            dr0Var2 = dr0Var;
            he1.b((((Configuration) dr0Var.j(i7.a)).uiMode & 48) == 32 ? b : a, null, null, nxVar2, dr0Var2, 3072);
        } else {
            nxVar2 = nxVar;
            dr0Var2 = dr0Var;
            dr0Var2.Q();
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new kl0(nxVar2, i, (byte) 3);
        }
    }
}
