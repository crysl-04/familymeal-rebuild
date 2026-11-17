package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nz1 {
    public final uv0 a;
    public final String b;
    public final double c;

    public nz1(uv0 uv0Var, String str, double d) {
        str.getClass();
        this.a = uv0Var;
        this.b = str;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz1)) {
            return false;
        }
        nz1 nz1Var = (nz1) obj;
        return uz0.g(this.a, nz1Var.a) && uz0.g(this.b, nz1Var.b) && Double.compare(this.c, nz1Var.c) == 0;
    }

    public final int hashCode() {
        uv0 uv0Var = this.a;
        return Double.hashCode(this.c) + jp1.f(this.b, (uv0Var == null ? 0 : uv0Var.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "ShoppingItem(ingredient=" + this.a + ", ingredientId=" + this.b + ", grams=" + this.c + ")";
    }
}
