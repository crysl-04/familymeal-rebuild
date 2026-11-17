package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ap1 {
    public final double a;
    public final double b;

    public ap1(double d, double d2) {
        this.a = d;
        this.b = d2;
        if (d < 0.0d || Double.isNaN(d)) {
            wg.m("min must be >= 0");
            throw null;
        }
        if (d2 >= d) {
            return;
        }
        wg.m("max must be >= min");
        throw null;
    }

    public final boolean a() {
        return Math.abs(this.b) <= Double.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap1)) {
            return false;
        }
        ap1 ap1Var = (ap1) obj;
        return Double.compare(this.a, ap1Var.a) == 0 && Double.compare(this.b, ap1Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "NutrientRange(min=" + this.a + ", max=" + this.b + ")";
    }

    public /* synthetic */ ap1(double d) {
        this(d, Double.POSITIVE_INFINITY);
    }
}
