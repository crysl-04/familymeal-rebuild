package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hz2 {
    public final od a;
    public final xp1 b;

    public hz2(od odVar, xp1 xp1Var) {
        this.a = odVar;
        this.b = xp1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz2)) {
            return false;
        }
        hz2 hz2Var = (hz2) obj;
        return uz0.g(this.a, hz2Var.a) && this.b.equals(hz2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ")";
    }
}
