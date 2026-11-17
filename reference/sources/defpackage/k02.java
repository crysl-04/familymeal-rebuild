package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class k02 {
    public final f02 a;
    public final xz1 b;

    public k02(f02 f02Var, xz1 xz1Var) {
        this.a = f02Var;
        this.b = xz1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k02)) {
            return false;
        }
        k02 k02Var = (k02) obj;
        return uz0.g(this.b, k02Var.b) && uz0.g(this.a, k02Var.a);
    }

    public final int hashCode() {
        f02 f02Var = this.a;
        int iHashCode = (f02Var != null ? f02Var.hashCode() : 0) * 31;
        xz1 xz1Var = this.b;
        return iHashCode + (xz1Var != null ? xz1Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ")";
    }
}
