package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tn {
    public t8 a = null;
    public a6 b = null;
    public yq c = null;
    public l9 d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn)) {
            return false;
        }
        tn tnVar = (tn) obj;
        return uz0.g(this.a, tnVar.a) && uz0.g(this.b, tnVar.b) && uz0.g(this.c, tnVar.c) && uz0.g(this.d, tnVar.d);
    }

    public final int hashCode() {
        t8 t8Var = this.a;
        int iHashCode = (t8Var == null ? 0 : t8Var.hashCode()) * 31;
        a6 a6Var = this.b;
        int iHashCode2 = (iHashCode + (a6Var == null ? 0 : a6Var.hashCode())) * 31;
        yq yqVar = this.c;
        int iHashCode3 = (iHashCode2 + (yqVar == null ? 0 : yqVar.hashCode())) * 31;
        l9 l9Var = this.d;
        return iHashCode3 + (l9Var != null ? l9Var.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ")";
    }
}
