package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hu {
    public static final hu c = new hu();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap map, gu guVar, w81 w81Var, Class cls) {
        w81 w81Var2 = (w81) map.get(guVar);
        if (w81Var2 == null) {
            map.put(guVar, w81Var);
            return;
        }
        if (w81Var == w81Var2) {
            return;
        }
        String name = guVar.b.getName();
        String name2 = cls.getName();
        String strValueOf = String.valueOf(w81Var2);
        String strValueOf2 = String.valueOf(w81Var);
        StringBuilder sbL = wi0.l("Method ", name, " in ", name2, " already declared with different @OnLifecycleEvent value: previous value ");
        sbL.append(strValueOf);
        sbL.append(", new value ");
        sbL.append(strValueOf2);
        throw new IllegalArgumentException(sbL.toString());
    }

    public final fu a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            fu fuVarA = (fu) map2.get(superclass);
            if (fuVarA == null) {
                fuVarA = a(superclass, null);
            }
            map.putAll(fuVarA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            fu fuVarA2 = (fu) map2.get(cls2);
            if (fuVarA2 == null) {
                fuVarA2 = a(cls2, null);
            }
            for (Map.Entry entry : fuVarA2.b.entrySet()) {
                b(map, (gu) entry.getKey(), (w81) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            nq1 nq1Var = (nq1) method.getAnnotation(nq1.class);
            if (nq1Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!e91.class.isAssignableFrom(parameterTypes[0])) {
                        wg.m("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                w81 w81VarValue = nq1Var.value();
                if (parameterTypes.length > 1) {
                    if (!w81.class.isAssignableFrom(parameterTypes[1])) {
                        wg.m("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (w81VarValue != w81.ON_ANY) {
                        wg.m("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    wg.m("cannot have more than 2 params");
                    return null;
                }
                b(map, new gu(i, method), w81VarValue, cls);
                z = true;
            }
        }
        fu fuVar = new fu(map);
        map2.put(cls, fuVar);
        this.b.put(cls, Boolean.valueOf(z));
        return fuVar;
    }
}
