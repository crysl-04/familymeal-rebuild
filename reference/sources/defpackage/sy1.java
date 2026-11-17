package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class sy1 {
    public final bz1 a;
    public final lz1 b;
    public final ArrayList c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;
    public final ArrayList g;
    public final ArrayList h;

    public sy1(bz1 bz1Var) {
        this.a = bz1Var;
        this.b = bz1Var.f;
        int i = bz1Var.e;
        cf2.i.getClass();
        if (1 > i || i >= 13) {
            wg.m("month must be 1..12");
            throw null;
        }
        cf2 cf2Var = cf2.j;
        Set setC0 = (4 > i || i >= 11) ? gi.c0(new cf2[]{cf2Var, cf2.l}) : gi.c0(new cf2[]{cf2Var, cf2.k});
        List list = bz1Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (setC0.contains(((j62) obj).j)) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
        List list2 = this.a.a;
        int iK = ee1.K(ev.o0(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iK < 16 ? 16 : iK);
        for (Object obj2 : list2) {
            linkedHashMap.put(((j62) obj2).a, obj2);
        }
        this.d = linkedHashMap;
        List<uv0> list3 = this.a.b;
        int iK2 = ee1.K(ev.o0(list3, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iK2 < 16 ? 16 : iK2);
        for (uv0 uv0Var : list3) {
            linkedHashMap2.put(uv0Var.a, uv0Var.c);
        }
        this.e = linkedHashMap2;
        List list4 = this.a.c;
        int iK3 = ee1.K(ev.o0(list4, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iK3 >= 16 ? iK3 : 16);
        for (Object obj3 : list4) {
            linkedHashMap3.put(((rx1) obj3).a, obj3);
        }
        this.f = linkedHashMap3;
        ArrayList arrayList2 = new ArrayList();
        lh0 lh0Var = p60.p;
        lh0Var.getClass();
        z zVar = new z(lh0Var, (byte) 0);
        while (zVar.hasNext()) {
            p60 p60Var = (p60) zVar.next();
            ArrayList arrayList3 = new ArrayList();
            lh0 lh0Var2 = te1.o;
            lh0Var2.getClass();
            z zVar2 = new z(lh0Var2, (byte) 0);
            while (zVar2.hasNext()) {
                te1 te1Var = (te1) zVar2.next();
                ek2 ek2Var = new ek2(p60Var, te1Var);
                ed2 ed2Var = this.a.d;
                ed2Var.getClass();
                ek2Var = ed2Var.a(p60Var, te1Var).isEmpty() ? null : ek2Var;
                if (ek2Var != null) {
                    arrayList3.add(ek2Var);
                }
            }
            iv.q0(arrayList3, arrayList2);
        }
        this.g = arrayList2;
        p60 p60Var2 = p60.SATURDAY;
        te1 te1Var2 = te1.LUNCH;
        List listQ = lt.Q(new ek2(p60Var2, te1Var2), new ek2(p60.SUNDAY, te1Var2));
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : listQ) {
            if (this.g.contains((ek2) obj4)) {
                arrayList4.add(obj4);
            }
        }
        this.h = arrayList4;
    }

    public static boolean e(j62 j62Var) {
        j62Var.getClass();
        Set set = j62Var.i;
        return set.contains("fish_whole") || set.contains("fish_portion");
    }

    public static final ap1 h(double d, ap1 ap1Var) {
        return new ap1(ap1Var.a * d, ap1Var.a() ? ap1Var.b * d : Double.POSITIVE_INFINITY);
    }

    public final List a(ek2 ek2Var) {
        ek2Var.getClass();
        return this.a.d.a(ek2Var.a, ek2Var.b);
    }

    public final boolean b(j62 j62Var, ek2 ek2Var) {
        j62Var.getClass();
        ek2Var.getClass();
        te1 te1Var = ek2Var.b;
        int size = a(ek2Var).size();
        if (size == 0) {
            return false;
        }
        te1Var.getClass();
        if (!j62Var.c.contains(te1Var)) {
            return false;
        }
        lz1 lz1Var = this.b;
        Map map = (Map) lz1Var.a.get(te1Var);
        if (map == null) {
            map = bg0.h;
        }
        if (!map.containsKey(j62Var.d) || size < j62Var.f) {
            return false;
        }
        Set set = (Set) this.a.h.get(ek2Var);
        if (set != null && set.contains(j62Var.a)) {
            return false;
        }
        if (lz1Var.f && ek2Var.a.ordinal() < 5 && te1Var != te1.BREAKFAST && !j62Var.k) {
            Set set2 = j62Var.i;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                return false;
            }
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                if (lz1Var.g.contains((String) it.next())) {
                }
            }
            return false;
        }
        if (lz1Var.k) {
            List listA = a(ek2Var);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listA.iterator();
            while (it2.hasNext()) {
                rx1 rx1Var = (rx1) this.f.get((String) it2.next());
                Set set3 = rx1Var != null ? rx1Var.d : null;
                if (set3 == null) {
                    set3 = gg0.h;
                }
                iv.q0(set3, arrayList);
            }
            Set setU0 = dv.U0(arrayList);
            if (!setU0.isEmpty()) {
                List list = j62Var.g;
                if (!list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (dv.v0(setU0, this.e.get(((z62) it3.next()).a))) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public final vp0 c(ek2 ek2Var) {
        ek2Var.getClass();
        lz1 lz1Var = this.b;
        if (!lz1Var.h.contains(ek2Var) || a(ek2Var).isEmpty()) {
            return null;
        }
        return a(ek2Var).size() >= lz1Var.i ? new i(1, this, sy1.class, "isWholeFish", "isWholeFish(Lcom/familymeal/core/model/Recipe;)Z", 0, (byte) 8) : new i(1, this, sy1.class, "isFish", "isFish(Lcom/familymeal/core/model/Recipe;)Z", 0, (byte) 9);
    }

    public final int d(te1 te1Var) {
        te1Var.getClass();
        lz1 lz1Var = this.b;
        Map map = (Map) lz1Var.a.get(te1Var);
        if (map == null) {
            map = bg0.h;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            zr zrVar = (zr) entry.getKey();
            qy0 qy0Var = (qy0) entry.getValue();
            if (!lz1Var.c.contains(zrVar) && qy0Var.h == qy0Var.i) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((qy0) it.next()).h;
        }
        return i;
    }

    public final boolean f(j62 j62Var) {
        j62Var.getClass();
        return this.b.c.contains(j62Var.d);
    }

    public final e40 g(rx1 rx1Var, p60 p60Var) {
        rx1Var.getClass();
        e40 e40Var = rx1Var.c;
        p60Var.getClass();
        Map map = this.b.n;
        if (map != null) {
            String str = rx1Var.a;
            str.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : te1.o) {
                te1 te1Var = (te1) obj;
                te1Var.getClass();
                if (this.a.d.a(p60Var, te1Var).contains(str)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            double dDoubleValue = 0.0d;
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                dDoubleValue += ((Number) ee1.J((te1) obj2, map)).doubleValue();
            }
            if (dDoubleValue < 0.999999999d) {
                return new e40(h(dDoubleValue, e40Var.a), h(dDoubleValue, e40Var.b), h(dDoubleValue, e40Var.c), h(dDoubleValue, e40Var.d), h(dDoubleValue, e40Var.e));
            }
        }
        return e40Var;
    }
}
