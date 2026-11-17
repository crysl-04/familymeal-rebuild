package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class aq1 {
    public static final t53 a;

    static {
        ys0 ys0VarA = zs0.a();
        long jB = zs0.b();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        try {
            a = new t53(zs0.c(ys0VarA, jB, iAvailableProcessors), Runtime.getRuntime());
        } catch (Exception e) {
            cl.b(e, "Hardware detection failed: {}, {} bytes, {} threads", ys0VarA, Long.valueOf(jB), Integer.valueOf(iAvailableProcessors));
            a = new t53(zs0.c(ys0.m, 17179869184L, 4), Runtime.getRuntime());
        }
    }
}
