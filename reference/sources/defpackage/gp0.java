package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class gp0 {
    public static final fp0 a = fp0.a;

    public static fp0 a(jo0 jo0Var) {
        while (jo0Var != null) {
            if (jo0Var.p()) {
                jo0Var.l();
            }
            jo0Var = jo0Var.D;
        }
        return a;
    }

    public static void b(cp0 cp0Var) {
        if (yo0.J(3)) {
            cp0Var.h.getClass();
        }
    }

    public static final void c(jo0 jo0Var, String str) {
        str.getClass();
        b(new cp0(jo0Var, "Attempting to reuse fragment " + jo0Var + " with previous ID " + str));
        a(jo0Var).getClass();
    }
}
