package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class k70 {
    public int a;
    public boolean b;
    public int c;
    public float d;
    public Object e;

    public static int a(u71 u71Var, boolean z) {
        return z ? ((v71) dv.F0(u71Var.l)).a + 1 : ((v71) dv.x0(u71Var.l)).a - 1;
    }

    public static int b(t51 t51Var, boolean z) {
        ks1 ks1Var = ks1.h;
        if (z) {
            u51 u51Var = (u51) dv.F0(t51Var.n);
            return (t51Var.r == ks1Var ? u51Var.s : u51Var.t) + 1;
        }
        u51 u51Var2 = (u51) dv.x0(t51Var.n);
        return (t51Var.r == ks1Var ? u51Var2.s : u51Var2.t) - 1;
    }
}
