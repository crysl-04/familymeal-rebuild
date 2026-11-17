package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class du implements au {
    public static final Map b;
    public final Class a;

    static {
        List listQ = lt.Q(kp0.class, vp0.class, zp0.class, aq0.class, bq0.class, cq0.class, dq0.class, eq0.class, fq0.class, gq0.class, lp0.class, mp0.class, np0.class, op0.class, pp0.class, qp0.class, rp0.class, sp0.class, tp0.class, up0.class, wp0.class, xp0.class, yp0.class);
        ArrayList arrayList = new ArrayList(ev.o0(listQ, 10));
        int i = 0;
        for (Object obj : listQ) {
            int i2 = i + 1;
            if (i < 0) {
                lt.h0();
                throw null;
            }
            arrayList.add(new wt1((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = ee1.M(arrayList);
    }

    public du(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    public final Class a() {
        return this.a;
    }

    public final String b() {
        String strW;
        Class cls = this.a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strW2 = cu.w(cls.getName());
            return strW2 == null ? cls.getCanonicalName() : strW2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strW = cu.w(componentType.getName())) != null) {
            strConcat = strW.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final String c() {
        String strB0;
        Class cls = this.a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strB1 = cu.b0(cls.getName());
                return strB1 == null ? cls.getSimpleName() : strB1;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strB0 = cu.b0(componentType.getName())) != null) {
                strConcat = strB0.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return co2.c0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iU = co2.U(simpleName, '$', 0, 6);
            return iU == -1 ? simpleName : simpleName.substring(iU + 1, simpleName.length());
        }
        return co2.c0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final boolean d(Object obj) {
        Class clsY = this.a;
        clsY.getClass();
        Map map = b;
        map.getClass();
        Integer num = (Integer) map.get(clsY);
        if (num != null) {
            return t03.x(num.intValue(), obj);
        }
        if (clsY.isPrimitive()) {
            clsY = ls.y(z72.a(clsY));
        }
        return clsY.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof du) && ls.y(this).equals(ls.y((du) obj));
    }

    public final int hashCode() {
        return ls.y(this).hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
