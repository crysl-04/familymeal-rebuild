package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gc0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gc0) && cc0.b(10.0f, 10.0f) && cc0.b(40.0f, 40.0f) && cc0.b(10.0f, 10.0f) && cc0.b(40.0f, 40.0f);
    }

    public final int hashCode() {
        return 905970895;
    }

    public final String toString() {
        String strC = cc0.c(10.0f);
        String strC2 = cc0.c(40.0f);
        String strC3 = cc0.c(10.0f);
        String strC4 = cc0.c(40.0f);
        StringBuilder sbL = wi0.l("DpTouchBoundsExpansion(start=", strC, ", top=", strC2, ", end=");
        sbL.append(strC3);
        sbL.append(", bottom=");
        sbL.append(strC4);
        sbL.append(", isLayoutDirectionAware=true)");
        return sbL.toString();
    }
}
