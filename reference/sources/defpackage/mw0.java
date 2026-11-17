package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class mw0 {
    public final String a;
    public final String b;
    public final String c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;

    public mw0(String str, String str2, String str3, double d, double d2, double d3, double d4, double d5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = d4;
        this.h = d5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw0)) {
            return false;
        }
        mw0 mw0Var = (mw0) obj;
        return uz0.g(this.a, mw0Var.a) && uz0.g(this.b, mw0Var.b) && uz0.g(this.c, mw0Var.c) && Double.compare(this.d, mw0Var.d) == 0 && Double.compare(this.e, mw0Var.e) == 0 && Double.compare(this.f, mw0Var.f) == 0 && Double.compare(this.g, mw0Var.g) == 0 && Double.compare(this.h, mw0Var.h) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.h) + jp1.a(this.g, jp1.a(this.f, jp1.a(this.e, jp1.a(this.d, jp1.f(this.c, jp1.f(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbL = wi0.l("IngredientEntity(id=", this.a, ", name=", this.b, ", category=");
        sbL.append(this.c);
        sbL.append(", kcal=");
        sbL.append(this.d);
        sbL.append(", protein=");
        sbL.append(this.e);
        sbL.append(", fat=");
        sbL.append(this.f);
        sbL.append(", carb=");
        sbL.append(this.g);
        sbL.append(", fiber=");
        sbL.append(this.h);
        sbL.append(")");
        return sbL.toString();
    }
}
