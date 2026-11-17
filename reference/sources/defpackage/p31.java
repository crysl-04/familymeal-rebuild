package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class p31 {
    public static final p31 a;

    static {
        p31 p31Var = new p31();
        if (cc0.a(0.0f, 0.0f) < 0 || cc0.a(0.0f, 0.0f) < 0 || cc0.a(0.0f, 0.0f) < 0 || cc0.a(0.0f, 0.0f) < 0) {
            zw0.a("Layer outsets must be non-negative");
        }
        a = p31Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof p31) && cc0.b(0.0f, 0.0f) && cc0.b(0.0f, 0.0f) && cc0.b(0.0f, 0.0f) && cc0.b(0.0f, 0.0f);
        }
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        String strC = cc0.c(0.0f);
        String strC2 = cc0.c(0.0f);
        String strC3 = cc0.c(0.0f);
        String strC4 = cc0.c(0.0f);
        StringBuilder sbL = wi0.l("LayerOutsets(left=", strC, ", top=", strC2, ", right=");
        sbL.append(strC3);
        sbL.append(", bottom=");
        sbL.append(strC4);
        sbL.append(")");
        return sbL.toString();
    }
}
