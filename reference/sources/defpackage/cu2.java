package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class cu2 {
    public static final String a = jo2.L();

    public static long a(xw2 xw2Var, e90 e90Var, sm0 sm0Var) {
        g9 g9VarB = b(xw2Var, e90Var, sm0Var, 1, false);
        return (((long) rz1.g(g9VarB.a.b())) << 32) | (((long) rz1.g(g9VarB.f)) & 4294967295L);
    }

    public static final g9 b(xw2 xw2Var, e90 e90Var, sm0 sm0Var, int i, boolean z) {
        String strE0 = dv.E0(cy1.S(0, i), "\n", null, null, new ss2((byte) 1), 30);
        ag0 ag0Var = ag0.h;
        return new g9(new k9(strE0, xw2Var, ag0Var, ag0Var, sm0Var, e90Var, z), i, 1, l00.b(0, 0, 0, 0, 15));
    }
}
