package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wc1 implements SortedMap, a1, mo2 {
    public final vh h;
    public final ns0 i;
    public final cm2 j;

    public wc1(vh vhVar, ns0 ns0Var) {
        this.h = vhVar;
        this.i = ns0Var;
        this.j = new cm2(vhVar, ns0Var, Integer.MAX_VALUE);
    }

    @Override // defpackage.a1
    public final double A(int i) {
        cm2 cm2Var = this.j;
        int iQ1 = cm2Var.Q1(i);
        if (iQ1 >= 0) {
            return cm2Var.n.A(iQ1);
        }
        return Double.NaN;
    }

    @Override // defpackage.a1
    public final Comparable G(long j) {
        cm2 cm2Var = this.j;
        int iQ1 = cm2Var.Q1((int) j);
        if (iQ1 >= 0) {
            return cm2Var.n.U1(iQ1);
        }
        return null;
    }

    public final wc1 a0(long j, long j2) {
        wc1 wc1Var = new wc1(this.h, this.i);
        am2 it = this.j.b().iterator();
        while (it.hasNext()) {
            it.c();
            long jD0 = it.D0();
            if (j <= jD0 && jD0 < j2) {
                Comparable comparable = it.get();
                cm2 cm2Var = wc1Var.j;
                int iQ1 = cm2Var.Q1((int) jD0);
                if (iQ1 >= 0) {
                    cm2Var.n.U1(iQ1);
                }
                cm2Var.d2(jD0, iQ1, comparable, true);
            }
        }
        return wc1Var;
    }

    @Override // defpackage.a1
    public final af0 b() {
        return this.j.b();
    }

    @Override // java.util.Map
    public final void clear() {
        this.j.i = 0;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return null;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof Comparable) {
            return this.j.Q1((int) xo1.T1((Comparable) obj)) >= 0;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        am2 it = this.j.b().iterator();
        while (it.hasNext()) {
            it.c();
            if (obj.equals(it.get())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.mo2
    public final long count() {
        return this.j.i;
    }

    @Override // java.util.SortedMap, java.util.Map
    public final Set entrySet() {
        return new mh(this, (byte) 1);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        cm2 cm2Var = this.j;
        return Long.valueOf(cm2Var.i > 0 ? cm2Var.l[0] : -1);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj instanceof Comparable) {
            return G(xo1.T1((Comparable) obj));
        }
        return null;
    }

    @Override // java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        cm2 cm2Var = this.j;
        return a0(cm2Var.i > 0 ? cm2Var.l[0] : -1, jLongValue);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.j.i == 0;
    }

    @Override // java.util.SortedMap, java.util.Map
    public final Set keySet() {
        cm2 cm2Var = this.j;
        return (Set) Arrays.stream(cm2Var.l, 0, cm2Var.i).mapToObj(new n5((byte) 2)).collect(Collectors.toSet());
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        cm2 cm2Var = this.j;
        int i = cm2Var.i;
        return Long.valueOf(i > 0 ? cm2Var.l[i - 1] : -1);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj2;
        long jLongValue = ((Long) obj).longValue();
        cm2 cm2Var = this.j;
        int iQ1 = cm2Var.Q1((int) jLongValue);
        Comparable comparableU1 = iQ1 >= 0 ? cm2Var.n.U1(iQ1) : null;
        cm2Var.d2(jLongValue, iQ1, comparable, true);
        return comparableU1;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.j.B(((Long) entry.getKey()).longValue(), (Comparable) entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Comparable comparableU1 = null;
        if (obj instanceof Comparable) {
            int iT1 = (int) xo1.T1((Comparable) obj);
            cm2 cm2Var = this.j;
            int iQ1 = cm2Var.Q1(iT1);
            comparableU1 = iQ1 >= 0 ? cm2Var.n.U1(iQ1) : null;
            cm2Var.U1(iQ1);
        }
        return comparableU1;
    }

    @Override // java.util.Map, defpackage.mo2
    public final int size() {
        return this.j.i;
    }

    @Override // java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return a0(((Long) obj).longValue(), ((Long) obj2).longValue());
    }

    @Override // java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        cm2 cm2Var = this.j;
        int i = cm2Var.i;
        return a0(jLongValue, ((long) (i > 0 ? cm2Var.l[i - 1] : -1)) + 1);
    }

    public final String toString() {
        am2 am2VarB = this.j.b();
        if (!am2VarB.hasNext()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        while (true) {
            am2VarB.c();
            long jD0 = am2VarB.D0();
            Comparable comparable = am2VarB.get();
            sb.append(jD0);
            sb.append('=');
            sb.append(comparable);
            if (!am2VarB.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            sb.append(", ");
        }
    }

    @Override // java.util.SortedMap, java.util.Map
    public final Collection values() {
        cm2 cm2Var = this.j;
        return new yo1(this.h, this.i, cm2Var.n, cm2Var.i);
    }

    @Override // defpackage.a1
    public final double z(long j) {
        cm2 cm2Var = this.j;
        int iQ1 = cm2Var.Q1((int) j);
        if (iQ1 >= 0) {
            return cm2Var.n.A(iQ1);
        }
        return Double.NaN;
    }
}
