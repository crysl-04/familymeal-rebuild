package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ep1 {
    public static final dp1 Companion = new dp1();
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;

    public /* synthetic */ ep1(int i, double d, double d2, double d3, double d4, double d5) {
        if (31 != (i & 31)) {
            m02.x(i, 31, cp1.a.d());
            throw null;
        }
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep1)) {
            return false;
        }
        ep1 ep1Var = (ep1) obj;
        return Double.compare(this.a, ep1Var.a) == 0 && Double.compare(this.b, ep1Var.b) == 0 && Double.compare(this.c, ep1Var.c) == 0 && Double.compare(this.d, ep1Var.d) == 0 && Double.compare(this.e, ep1Var.e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.e) + jp1.a(this.d, jp1.a(this.c, jp1.a(this.b, Double.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NutrientsDto(kcal=" + this.a + ", protein=" + this.b + ", fat=" + this.c + ", carb=" + this.d + ", fiber=" + this.e + ")";
    }

    public ep1(double d, double d2, double d3, double d4, double d5) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
    }
}
