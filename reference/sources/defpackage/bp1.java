package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bp1 {
    public static final bp1 f = new bp1(0.0d, 0.0d, 0.0d, 0.0d, 0.0d);
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;

    public bp1(double d, double d2, double d3, double d4, double d5) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
    }

    public final double a(zo1 zo1Var) {
        zo1Var.getClass();
        int iOrdinal = zo1Var.ordinal();
        if (iOrdinal == 0) {
            return this.a;
        }
        if (iOrdinal == 1) {
            return this.b;
        }
        if (iOrdinal == 2) {
            return this.c;
        }
        if (iOrdinal == 3) {
            return this.d;
        }
        if (iOrdinal == 4) {
            return this.e;
        }
        wg.n();
        return 0.0d;
    }

    public final bp1 b(bp1 bp1Var) {
        bp1Var.getClass();
        return new bp1(this.a + bp1Var.a, this.b + bp1Var.b, this.c + bp1Var.c, this.d + bp1Var.d, this.e + bp1Var.e);
    }

    public final bp1 c(double d) {
        return new bp1(this.a * d, this.b * d, this.c * d, this.d * d, this.e * d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp1)) {
            return false;
        }
        bp1 bp1Var = (bp1) obj;
        return Double.compare(this.a, bp1Var.a) == 0 && Double.compare(this.b, bp1Var.b) == 0 && Double.compare(this.c, bp1Var.c) == 0 && Double.compare(this.d, bp1Var.d) == 0 && Double.compare(this.e, bp1Var.e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.e) + jp1.a(this.d, jp1.a(this.c, jp1.a(this.b, Double.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "Nutrients(kcal=" + this.a + ", protein=" + this.b + ", fat=" + this.c + ", carb=" + this.d + ", fiber=" + this.e + ")";
    }
}
