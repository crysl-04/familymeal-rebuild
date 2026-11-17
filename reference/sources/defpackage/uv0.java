package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class uv0 {
    public final String a;
    public final String b;
    public final String c;
    public final bp1 d;

    public uv0(String str, String str2, String str3, bp1 bp1Var) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bp1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv0)) {
            return false;
        }
        uv0 uv0Var = (uv0) obj;
        return uz0.g(this.a, uv0Var.a) && uz0.g(this.b, uv0Var.b) && uz0.g(this.c, uv0Var.c) && this.d.equals(uv0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + jp1.f(this.c, jp1.f(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbL = wi0.l("Ingredient(id=", this.a, ", name=", this.b, ", category=");
        sbL.append(this.c);
        sbL.append(", per100g=");
        sbL.append(this.d);
        sbL.append(")");
        return sbL.toString();
    }
}
