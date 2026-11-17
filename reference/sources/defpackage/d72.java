package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class d72 {
    public final String a;
    public final String b;
    public final double c;
    public final int d;

    public d72(double d, int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = d;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d72)) {
            return false;
        }
        d72 d72Var = (d72) obj;
        return uz0.g(this.a, d72Var.a) && uz0.g(this.b, d72Var.b) && Double.compare(this.c, d72Var.c) == 0 && this.d == d72Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + jp1.a(this.c, jp1.f(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbL = wi0.l("RecipeIngredientEntity(recipeId=", this.a, ", ingredientId=", this.b, ", grams=");
        sbL.append(this.c);
        sbL.append(", position=");
        sbL.append(this.d);
        sbL.append(")");
        return sbL.toString();
    }
}
