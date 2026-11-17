package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class s63 {
    public final String a;
    public final String b;
    public final double c;

    public s63(String str, String str2, double d) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s63)) {
            return false;
        }
        s63 s63Var = (s63) obj;
        return uz0.g(this.a, s63Var.a) && uz0.g(this.b, s63Var.b) && Double.compare(this.c, s63Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + jp1.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbL = wi0.l("WeightEntryEntity(personId=", this.a, ", date=", this.b, ", weightKg=");
        sbL.append(this.c);
        sbL.append(")");
        return sbL.toString();
    }
}
