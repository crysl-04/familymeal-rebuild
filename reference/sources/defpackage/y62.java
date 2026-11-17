package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class y62 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final String g;
    public final boolean h;
    public final String i;
    public final double j;
    public final double k;
    public final double l;
    public final double m;
    public final double n;

    public y62(String str, String str2, String str3, String str4, int i, int i2, String str5, boolean z, String str6, double d, double d2, double d3, double d4, double d5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = i2;
        this.g = str5;
        this.h = z;
        this.i = str6;
        this.j = d;
        this.k = d2;
        this.l = d3;
        this.m = d4;
        this.n = d5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y62)) {
            return false;
        }
        y62 y62Var = (y62) obj;
        return uz0.g(this.a, y62Var.a) && uz0.g(this.b, y62Var.b) && uz0.g(this.c, y62Var.c) && uz0.g(this.d, y62Var.d) && this.e == y62Var.e && this.f == y62Var.f && uz0.g(this.g, y62Var.g) && this.h == y62Var.h && uz0.g(this.i, y62Var.i) && Double.compare(this.j, y62Var.j) == 0 && Double.compare(this.k, y62Var.k) == 0 && Double.compare(this.l, y62Var.l) == 0 && Double.compare(this.m, y62Var.m) == 0 && Double.compare(this.n, y62Var.n) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.n) + jp1.a(this.m, jp1.a(this.l, jp1.a(this.k, jp1.a(this.j, jp1.f(this.i, jp1.c(jp1.f(this.g, jp1.b(this.f, jp1.b(this.e, jp1.f(this.d, jp1.f(this.c, jp1.f(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31, this.h), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbL = wi0.l("RecipeEntity(id=", this.a, ", name=", this.b, ", category=");
        wi0.v(sbL, this.c, ", mealTypes=", this.d, ", baseServings=");
        sbL.append(this.e);
        sbL.append(", minDiners=");
        sbL.append(this.f);
        sbL.append(", season=");
        sbL.append(this.g);
        sbL.append(", quick=");
        sbL.append(this.h);
        sbL.append(", tags=");
        sbL.append(this.i);
        sbL.append(", kcal=");
        sbL.append(this.j);
        sbL.append(", protein=");
        sbL.append(this.k);
        sbL.append(", fat=");
        sbL.append(this.l);
        sbL.append(", carb=");
        sbL.append(this.m);
        sbL.append(", fiber=");
        sbL.append(this.n);
        sbL.append(")");
        return sbL.toString();
    }
}
