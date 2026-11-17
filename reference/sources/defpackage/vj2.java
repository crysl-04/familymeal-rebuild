package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class vj2 {
    static {
        uz0.y(0.0f, 0.0f, null, 7);
    }

    public static final kn2 a(long j, zm2 zm2Var, dr0 dr0Var) {
        boolean zF = dr0Var.f(kv.e(j));
        Object objK = dr0Var.K();
        if (zF || objK == zy.a) {
            s03 s03Var = new s03(wb.m, new zb(kv.e(j), (byte) 2));
            dr0Var.f0(s03Var);
            objK = s03Var;
        }
        return vb.b(new kv(j), (s03) objK, zm2Var, null, "ColorAnimation", dr0Var, 8);
    }
}
