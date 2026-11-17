package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class rb1 {
    public static final g42 a;

    static {
        Object d92Var;
        try {
            ClassLoader classLoader = dc2.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof g42) {
                        d92Var = (g42) objInvoke;
                        break;
                    }
                } else if (!(annotations[i] instanceof k90)) {
                    i++;
                }
                d92Var = null;
                break;
            }
        } catch (Throwable th) {
            d92Var = new d92(th);
        }
        g42 ie0Var = (g42) (d92Var instanceof d92 ? null : d92Var);
        if (ie0Var == null) {
            ie0Var = new ie0(new jw0((byte) 15), (byte) 1);
        }
        a = ie0Var;
    }
}
