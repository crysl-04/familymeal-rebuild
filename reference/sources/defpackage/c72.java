package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class c72 {
    public static final b72 Companion = new b72();
    public final String a;
    public final double b;

    public /* synthetic */ c72(int i, String str, double d) {
        if (3 != (i & 3)) {
            m02.x(i, 3, a72.a.d());
            throw null;
        }
        this.a = str;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c72)) {
            return false;
        }
        c72 c72Var = (c72) obj;
        return uz0.g(this.a, c72Var.a) && Double.compare(this.b, c72Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RecipeIngredientDto(id=" + this.a + ", amountG=" + this.b + ")";
    }

    public c72(String str, double d) {
        str.getClass();
        this.a = str;
        this.b = d;
    }
}
