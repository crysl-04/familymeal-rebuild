package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jh0 {
    public long a;

    public jh0(long j) {
        this.a = j;
    }

    public static jh0 a(Class cls) {
        jh0 jh0Var;
        r01 r01Var;
        Class superclass = cls.getSuperclass();
        if (Object.class.equals(superclass)) {
            r01 r01Var2 = r01.BYTE;
            jh0Var = new jh0(12L);
        } else {
            long j = a(superclass).a;
            long j2 = j % 4;
            if (j2 != 0) {
                j += 4 - j2;
            }
            jh0Var = new jh0(j);
        }
        for (Field field : cls.getDeclaredFields()) {
            if (!Modifier.isStatic(field.getModifiers())) {
                Class<?> type = field.getType();
                r01[] r01VarArrValues = r01.values();
                int length = r01VarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        r01Var = null;
                        break;
                    }
                    r01Var = r01VarArrValues[i];
                    if (r01Var.h.isAssignableFrom(type)) {
                        break;
                    }
                    i++;
                }
                jh0Var.a += (long) r01Var.i;
            }
        }
        return jh0Var;
    }
}
