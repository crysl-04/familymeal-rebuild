package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rv2 {
    public u31 a;
    public e90 b;
    public sm0 c;
    public xw2 d;
    public Object e;
    public final lu1 f = rz1.x(Boolean.TRUE);
    public long g = 0;

    public rv2(u31 u31Var, e90 e90Var, sm0 sm0Var, xw2 xw2Var, Object obj) {
        this.a = u31Var;
        this.b = e90Var;
        this.c = sm0Var;
        this.d = xw2Var;
        this.e = obj;
    }

    public static void a(rv2 rv2Var, u31 u31Var, e90 e90Var, xw2 xw2Var, int i) {
        if ((i & 1) != 0) {
            u31Var = rv2Var.a;
        }
        if ((i & 2) != 0) {
            e90Var = rv2Var.b;
        }
        sm0 sm0Var = rv2Var.c;
        if ((i & 8) != 0) {
            xw2Var = rv2Var.d;
        }
        Object obj = rv2Var.e;
        u31 u31Var2 = rv2Var.a;
        lu1 lu1Var = rv2Var.f;
        if (u31Var == u31Var2 && uz0.g(e90Var, rv2Var.b) && uz0.g(sm0Var, rv2Var.c) && xw2Var.equals(rv2Var.d)) {
            if (uz0.g(obj, rv2Var.e)) {
                return;
            }
            rv2Var.e = obj;
            lu1Var.setValue(Boolean.TRUE);
            return;
        }
        rv2Var.a = u31Var;
        rv2Var.b = e90Var;
        rv2Var.c = sm0Var;
        rv2Var.d = xw2Var;
        lu1Var.setValue(Boolean.TRUE);
    }
}
