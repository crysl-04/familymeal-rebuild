package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class dt1 {
    public static final vz a = new vz(new de1((byte) 20));

    public static final rg1 a(rg1 rg1Var) {
        return rg1Var.c(new et1());
    }

    public static final j8 b(dr0 dr0Var) {
        dr0Var.V(282942128);
        k8 k8Var = (k8) dr0Var.j(a);
        if (k8Var == null) {
            dr0Var.p(false);
            return null;
        }
        boolean zF = dr0Var.f(k8Var);
        Object objK = dr0Var.K();
        if (zF || objK == zy.a) {
            Object j8Var = new j8(k8Var.a, k8Var.b, k8Var.c, k8Var.d);
            dr0Var.f0(j8Var);
            objK = j8Var;
        }
        j8 j8Var2 = (j8) objK;
        dr0Var.p(false);
        return j8Var2;
    }
}
