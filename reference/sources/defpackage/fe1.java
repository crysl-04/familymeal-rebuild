package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fe1 {
    public final String a;
    public final qy0 b;

    public fe1(String str, qy0 qy0Var) {
        this.a = str;
        this.b = qy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe1)) {
            return false;
        }
        fe1 fe1Var = (fe1) obj;
        return this.a.equals(fe1Var.a) && this.b.equals(fe1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
