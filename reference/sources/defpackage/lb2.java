package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class lb2 implements Iterable {
    public ib2 h;
    public ib2 i;
    public final WeakHashMap j = new WeakHashMap();
    public int k = 0;

    public final Object a(qp1 qp1Var, kb1 kb1Var) {
        for (ib2 ib2Var = this.h; ib2Var != null; ib2Var = ib2Var.j) {
            if (ib2Var.h.equals(qp1Var)) {
                return ib2Var.i;
            }
        }
        ib2 ib2Var2 = new ib2(qp1Var, kb1Var);
        this.k++;
        ib2 ib2Var3 = this.i;
        if (ib2Var3 == null) {
            this.h = ib2Var2;
            this.i = ib2Var2;
            return null;
        }
        ib2Var3.j = ib2Var2;
        ib2Var2.k = ib2Var3;
        this.i = ib2Var2;
        return null;
    }

    public final boolean equals(Object obj) {
        hb2 hb2Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lb2)) {
            return false;
        }
        lb2 lb2Var = (lb2) obj;
        if (this.k != lb2Var.k) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = lb2Var.iterator();
        while (true) {
            hb2Var = (hb2) it;
            if (!hb2Var.hasNext()) {
                break;
            }
            hb2 hb2Var2 = (hb2) it2;
            if (!hb2Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) hb2Var.next();
            Object next = hb2Var2.next();
            if (entry == null) {
                if (next != null) {
                    return false;
                }
            } else if (!entry.equals(next)) {
                return false;
            }
        }
        return (hb2Var.hasNext() || ((hb2) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            hb2 hb2Var = (hb2) it;
            if (!hb2Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) hb2Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ib2 ib2Var = this.h;
        ib2 ib2Var2 = this.i;
        hb2 hb2Var = new hb2();
        hb2Var.h = ib2Var2;
        hb2Var.i = ib2Var;
        this.j.put(hb2Var, Boolean.FALSE);
        return hb2Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            hb2 hb2Var = (hb2) it;
            if (!hb2Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) hb2Var.next()).toString());
            if (hb2Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
