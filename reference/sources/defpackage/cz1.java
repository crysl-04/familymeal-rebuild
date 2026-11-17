package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cz1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final double f;

    public cz1(String str, String str2, String str3, String str4, String str5, double d) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz1)) {
            return false;
        }
        cz1 cz1Var = (cz1) obj;
        return uz0.g(this.a, cz1Var.a) && uz0.g(this.b, cz1Var.b) && uz0.g(this.c, cz1Var.c) && uz0.g(this.d, cz1Var.d) && uz0.g(this.e, cz1Var.e) && Double.compare(this.f, cz1Var.f) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f) + jp1.f(this.e, jp1.f(this.d, jp1.f(this.c, jp1.f(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbL = wi0.l("PlanPortionEntity(planId=", this.a, ", day=", this.b, ", meal=");
        wi0.v(sbL, this.c, ", personId=", this.d, ", recipeId=");
        sbL.append(this.e);
        sbL.append(", servings=");
        sbL.append(this.f);
        sbL.append(")");
        return sbL.toString();
    }
}
