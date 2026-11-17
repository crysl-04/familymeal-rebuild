package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ap0 extends z43 {
    public static final g80 h = new g80(1);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public ap0(boolean z) {
        this.e = z;
    }

    @Override // defpackage.z43
    public final void d() {
        if (yo0.J(3)) {
            toString();
        }
        this.f = true;
    }

    public final void e(String str, boolean z) {
        HashMap map = this.c;
        ap0 ap0Var = (ap0) map.get(str);
        if (ap0Var != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(ap0Var.c.keySet());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ap0Var.e((String) obj, true);
                }
            }
            ap0Var.d();
            map.remove(str);
        }
        HashMap map2 = this.d;
        g53 g53Var = (g53) map2.get(str);
        if (g53Var != null) {
            g53Var.a();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ap0.class != obj.getClass()) {
            return false;
        }
        ap0 ap0Var = (ap0) obj;
        return this.b.equals(ap0Var.b) && this.c.equals(ap0Var.c) && this.d.equals(ap0Var.d);
    }

    public final void f(jo0 jo0Var) {
        if (this.g || this.b.remove(jo0Var.l) == null || !yo0.J(2)) {
            return;
        }
        jo0Var.toString();
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
