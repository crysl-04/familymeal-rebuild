package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yy1 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final String e;
    public final Double f;
    public final String g;

    public yy1(String str, String str2, int i, long j, String str3, Double d, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = str3;
        this.f = d;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy1)) {
            return false;
        }
        yy1 yy1Var = (yy1) obj;
        return uz0.g(this.a, yy1Var.a) && uz0.g(this.b, yy1Var.b) && this.c == yy1Var.c && this.d == yy1Var.d && uz0.g(this.e, yy1Var.e) && uz0.g(this.f, yy1Var.f) && uz0.g(this.g, yy1Var.g);
    }

    public final int hashCode() {
        int iF = jp1.f(this.e, jp1.d(this.d, jp1.b(this.c, jp1.f(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        Double d = this.f;
        return this.g.hashCode() + ((iF + (d == null ? 0 : d.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbL = wi0.l("PlanEntity(id=", this.a, ", weekStart=", this.b, ", month=");
        sbL.append(this.c);
        sbL.append(", createdAt=");
        sbL.append(this.d);
        sbL.append(", status=");
        sbL.append(this.e);
        sbL.append(", objective=");
        sbL.append(this.f);
        sbL.append(", note=");
        sbL.append(this.g);
        sbL.append(")");
        return sbL.toString();
    }
}
