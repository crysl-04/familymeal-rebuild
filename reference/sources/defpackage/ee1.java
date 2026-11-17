package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ee1 extends ou {
    public static Object J(Object obj, Map map) {
        map.getClass();
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int K(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map L(wt1... wt1VarArr) {
        if (wt1VarArr.length <= 0) {
            return bg0.h;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(K(wt1VarArr.length));
        for (wt1 wt1Var : wt1VarArr) {
            linkedHashMap.put(wt1Var.h, wt1Var.i);
        }
        return linkedHashMap;
    }

    public static Map M(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return bg0.h;
        }
        int i = 0;
        if (size == 1) {
            wt1 wt1Var = (wt1) arrayList.get(0);
            wt1Var.getClass();
            Map mapSingletonMap = Collections.singletonMap(wt1Var.h, wt1Var.i);
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(K(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            wt1 wt1Var2 = (wt1) obj;
            linkedHashMap.put(wt1Var2.h, wt1Var2.i);
        }
        return linkedHashMap;
    }

    public static Map N(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return bg0.h;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }
}
