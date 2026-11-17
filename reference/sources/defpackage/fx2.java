package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class fx2 {
    public static final ThreadLocal a = new ThreadLocal();

    public static nh0 a() {
        ThreadLocal threadLocal = a;
        nh0 nh0Var = (nh0) threadLocal.get();
        if (nh0Var != null) {
            return nh0Var;
        }
        pn pnVar = new pn(Thread.currentThread());
        threadLocal.set(pnVar);
        return pnVar;
    }
}
