package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class e30 {
    public final LinkedHashMap a = new LinkedHashMap();

    public Object a(d30 d30Var) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e30) {
            return this.a.equals(((e30) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ")";
    }
}
