package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ed2 {
    public final Map a;

    public ed2(Map map) {
        this.a = map;
    }

    public final List a(p60 p60Var, te1 te1Var) {
        p60Var.getClass();
        te1Var.getClass();
        Map map = (Map) this.a.get(p60Var);
        List list = map != null ? (List) map.get(te1Var) : null;
        return list == null ? ag0.h : list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ed2) && this.a.equals(((ed2) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Schedule(slots=" + this.a + ")";
    }
}
