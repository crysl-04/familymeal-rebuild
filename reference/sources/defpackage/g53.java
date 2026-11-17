package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class g53 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        Map mapN = ee1.N(linkedHashMap);
        linkedHashMap.clear();
        Iterator it = mapN.values().iterator();
        while (it.hasNext()) {
            ((z43) it.next()).b();
        }
    }

    public final String toString() {
        String strC = z72.a(g53.class).c();
        if (strC == null) {
            strC = "ViewModelStore";
        }
        int iHashCode = hashCode();
        vs.r(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        return strC + "@" + string + "(keys=" + dv.U0(this.a.keySet()) + ")";
    }
}
