package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class h4 implements i4 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final String e;

    public h4(double d, double d2, double d3, double d4, String str) {
        str.getClass();
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj;
        return Double.compare(this.a, h4Var.a) == 0 && Double.compare(this.b, h4Var.b) == 0 && Double.compare(this.c, h4Var.c) == 0 && Double.compare(this.d, h4Var.d) == 0 && uz0.g(this.e, h4Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + jp1.a(this.d, jp1.a(this.c, jp1.a(this.b, Double.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "Suggest(deltaKcal=" + this.a + ", newOffset=" + this.b + ", actualPerWeek=" + this.c + ", expectedPerWeek=" + this.d + ", reason=" + this.e + ")";
    }
}
