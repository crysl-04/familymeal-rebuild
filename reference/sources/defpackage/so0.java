package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class so0 {
    public static final bj2 b = new bj2();
    public final /* synthetic */ yo0 a;

    public so0(yo0 yo0Var) {
        this.a = yo0Var;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        bj2 bj2Var = b;
        bj2 bj2Var2 = (bj2) bj2Var.get(classLoader);
        if (bj2Var2 == null) {
            bj2Var2 = new bj2();
            bj2Var.put(classLoader, bj2Var2);
        }
        Class cls = (Class) bj2Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        bj2Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new a42(wi0.h("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e, (byte) 2);
        } catch (ClassNotFoundException e2) {
            throw new a42(wi0.h("Unable to instantiate fragment ", str, ": make sure class name exists"), e2, (byte) 2);
        }
    }

    public final jo0 a(String str) {
        try {
            return (jo0) c(this.a.w.m.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new a42(wi0.h("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e, (byte) 2);
        } catch (InstantiationException e2) {
            throw new a42(wi0.h("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2, (byte) 2);
        } catch (NoSuchMethodException e3) {
            throw new a42(wi0.h("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3, (byte) 2);
        } catch (InvocationTargetException e4) {
            throw new a42(wi0.h("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4, (byte) 2);
        }
    }
}
