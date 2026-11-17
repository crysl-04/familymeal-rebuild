package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c70 {
    public static final h80 a;

    static {
        String property;
        ss0 ss0Var;
        h80 h80Var;
        int i = dr2.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            r70 r70Var = ya0.a;
            ss0Var = pd1.a;
            ss0 ss0Var2 = ss0Var.m;
            if (ss0Var == null) {
                h80Var = ss0Var;
                h80Var = b70.r;
            }
        } else {
            h80Var = b70.r;
        }
        h80Var = ss0Var;
        a = h80Var;
    }
}
