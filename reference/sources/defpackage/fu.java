package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fu {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public fu(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            w81 w81Var = (w81) entry.getValue();
            List arrayList = (List) this.a.get(w81Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(w81Var, arrayList);
            }
            arrayList.add((gu) entry.getKey());
        }
    }

    public static void a(List list, e91 e91Var, w81 w81Var, d91 d91Var) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                gu guVar = (gu) list.get(size);
                Method method = guVar.b;
                try {
                    byte b = guVar.a;
                    if (b == 0) {
                        method.invoke(d91Var, null);
                    } else if (b == 1) {
                        method.invoke(d91Var, e91Var);
                    } else if (b == 2) {
                        method.invoke(d91Var, e91Var, w81Var);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
