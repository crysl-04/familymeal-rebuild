package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class bn2 {
    public static final /* synthetic */ int a = 0;

    static {
        Object d92Var;
        Object d92Var2;
        Exception exc = new Exception();
        String simpleName = aa3.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            d92Var = rk.class.getCanonicalName();
        } catch (Throwable th) {
            d92Var = new d92(th);
        }
        if (e92.a(d92Var) != null) {
            d92Var = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            d92Var2 = bn2.class.getCanonicalName();
        } catch (Throwable th2) {
            d92Var2 = new d92(th2);
        }
        if (e92.a(d92Var2) != null) {
            d92Var2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
