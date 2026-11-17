package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class f10 {
    public final ll2 a = new ll2();

    public static void b(f10 f10Var, zp0 zp0Var, nx nxVar, kp0 kp0Var, int i) {
        if ((i & 8) != 0) {
            nxVar = null;
        }
        f10Var.a.add(new nx(-1789283891, true, new t61(zp0Var, f10Var, nxVar, kp0Var)));
    }

    public final void a(e10 e10Var, dr0 dr0Var, int i) {
        dr0Var.W(-798501095);
        int i2 = (dr0Var.f(e10Var) ? 4 : 2) | i | (dr0Var.f(this) ? 32 : 16);
        if (dr0Var.N(i2 & 1, (i2 & 19) != 18)) {
            ll2 ll2Var = this.a;
            int size = ll2Var.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((aq0) ll2Var.get(i3)).c(e10Var, dr0Var, Integer.valueOf(i2 & 14));
            }
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new j7((byte) 5, i, this, e10Var);
        }
    }
}
