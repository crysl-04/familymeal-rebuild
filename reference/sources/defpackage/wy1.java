package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wy1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public wy1(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy1)) {
            return false;
        }
        wy1 wy1Var = (wy1) obj;
        return uz0.g(this.a, wy1Var.a) && uz0.g(this.b, wy1Var.b) && uz0.g(this.c, wy1Var.c) && uz0.g(this.d, wy1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + jp1.f(this.c, jp1.f(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbL = wi0.l("PlanDinerEntity(planId=", this.a, ", day=", this.b, ", meal=");
        sbL.append(this.c);
        sbL.append(", personId=");
        sbL.append(this.d);
        sbL.append(")");
        return sbL.toString();
    }
}
