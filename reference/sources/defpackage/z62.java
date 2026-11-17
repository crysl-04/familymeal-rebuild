package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class z62 {
    public final String a;
    public final double b;

    public z62(String str, double d) {
        str.getClass();
        this.a = str;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z62)) {
            return false;
        }
        z62 z62Var = (z62) obj;
        return uz0.g(this.a, z62Var.a) && Double.compare(this.b, z62Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RecipeIngredient(ingredientId=" + this.a + ", grams=" + this.b + ")";
    }
}
