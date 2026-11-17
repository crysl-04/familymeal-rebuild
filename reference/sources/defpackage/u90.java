package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class u90 {
    public final String a;
    public final double b;
    public final double c;
    public final double d;
    public final String e;
    public final Double f;
    public final Integer g;
    public final int h;
    public final String i;

    public u90(String str, double d, double d2, double d3, String str2, Double d4, Integer num, int i, String str3) {
        str.getClass();
        this.a = str;
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = str2;
        this.f = d4;
        this.g = num;
        this.h = i;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u90)) {
            return false;
        }
        u90 u90Var = (u90) obj;
        return uz0.g(this.a, u90Var.a) && Double.compare(this.b, u90Var.b) == 0 && Double.compare(this.c, u90Var.c) == 0 && Double.compare(this.d, u90Var.d) == 0 && this.e.equals(u90Var.e) && uz0.g(this.f, u90Var.f) && uz0.g(this.g, u90Var.g) && this.h == u90Var.h && this.i.equals(u90Var.i);
    }

    public final int hashCode() {
        int iF = jp1.f(this.e, jp1.a(this.d, jp1.a(this.c, jp1.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        Double d = this.f;
        int iHashCode = (iF + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.g;
        return this.i.hashCode() + jp1.b(this.h, (iHashCode + (num != null ? num.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "SolverStatus(status=" + this.a + ", seconds=" + this.b + ", buildSeconds=" + this.c + ", solveSeconds=" + this.d + ", budget=" + this.e + ", objective=" + this.f + ", violations=" + this.g + ", recipes=" + this.h + ", note=" + this.i + ")";
    }
}
