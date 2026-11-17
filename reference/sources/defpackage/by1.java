package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class by1 {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Double e;
    public final Double f;
    public final String g;
    public final String h;
    public final Double i;
    public final String j;
    public final String k;
    public final int l;
    public final Double m;
    public final Double n;
    public final Double o;
    public final Double p;
    public final Double q;
    public final Double r;
    public final Double s;
    public final Double t;
    public final double u;
    public final String v;

    public by1(String str, String str2, String str3, Integer num, Double d, Double d2, String str4, String str5, Double d3, String str6, String str7, int i, Double d4, Double d5, Double d6, Double d7, Double d8, Double d9, Double d10, Double d11, double d12, String str8) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = d;
        this.f = d2;
        this.g = str4;
        this.h = str5;
        this.i = d3;
        this.j = str6;
        this.k = str7;
        this.l = i;
        this.m = d4;
        this.n = d5;
        this.o = d6;
        this.p = d7;
        this.q = d8;
        this.r = d9;
        this.s = d10;
        this.t = d11;
        this.u = d12;
        this.v = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by1)) {
            return false;
        }
        by1 by1Var = (by1) obj;
        return uz0.g(this.a, by1Var.a) && uz0.g(this.b, by1Var.b) && uz0.g(this.c, by1Var.c) && uz0.g(this.d, by1Var.d) && uz0.g(this.e, by1Var.e) && uz0.g(this.f, by1Var.f) && uz0.g(this.g, by1Var.g) && uz0.g(this.h, by1Var.h) && uz0.g(this.i, by1Var.i) && uz0.g(this.j, by1Var.j) && uz0.g(this.k, by1Var.k) && this.l == by1Var.l && uz0.g(this.m, by1Var.m) && uz0.g(this.n, by1Var.n) && uz0.g(this.o, by1Var.o) && uz0.g(this.p, by1Var.p) && uz0.g(this.q, by1Var.q) && uz0.g(this.r, by1Var.r) && uz0.g(this.s, by1Var.s) && uz0.g(this.t, by1Var.t) && Double.compare(this.u, by1Var.u) == 0 && uz0.g(this.v, by1Var.v);
    }

    public final int hashCode() {
        int iF = jp1.f(this.c, jp1.f(this.b, this.a.hashCode() * 31, 31), 31);
        Integer num = this.d;
        int iHashCode = (iF + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.e;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f;
        int iF2 = jp1.f(this.h, jp1.f(this.g, (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31, 31), 31);
        Double d3 = this.i;
        int iB = jp1.b(this.l, jp1.f(this.k, jp1.f(this.j, (iF2 + (d3 == null ? 0 : d3.hashCode())) * 31, 31), 31), 31);
        Double d4 = this.m;
        int iHashCode3 = (iB + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.n;
        int iHashCode4 = (iHashCode3 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.o;
        int iHashCode5 = (iHashCode4 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.p;
        int iHashCode6 = (iHashCode5 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this.q;
        int iHashCode7 = (iHashCode6 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Double d9 = this.r;
        int iHashCode8 = (iHashCode7 + (d9 == null ? 0 : d9.hashCode())) * 31;
        Double d10 = this.s;
        int iHashCode9 = (iHashCode8 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.t;
        int iA = jp1.a(this.u, (iHashCode9 + (d11 == null ? 0 : d11.hashCode())) * 31, 31);
        String str = this.v;
        return iA + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = wi0.l("PersonEntity(id=", this.a, ", name=", this.b, ", gender=");
        sbL.append(this.c);
        sbL.append(", birthYear=");
        sbL.append(this.d);
        sbL.append(", heightCm=");
        sbL.append(this.e);
        sbL.append(", weightKg=");
        sbL.append(this.f);
        sbL.append(", activity=");
        wi0.v(sbL, this.g, ", goal=", this.h, ", targetWeightKg=");
        sbL.append(this.i);
        sbL.append(", pace=");
        sbL.append(this.j);
        sbL.append(", excluded=");
        sbL.append(this.k);
        sbL.append(", position=");
        sbL.append(this.l);
        sbL.append(", mKcalMin=");
        sbL.append(this.m);
        sbL.append(", mKcalMax=");
        sbL.append(this.n);
        sbL.append(", mProteinMin=");
        sbL.append(this.o);
        sbL.append(", mFatMin=");
        sbL.append(this.p);
        sbL.append(", mFatMax=");
        sbL.append(this.q);
        sbL.append(", mCarbMin=");
        sbL.append(this.r);
        sbL.append(", mCarbMax=");
        sbL.append(this.s);
        sbL.append(", mFiberMin=");
        sbL.append(this.t);
        sbL.append(", kcalOffset=");
        sbL.append(this.u);
        sbL.append(", lastAdjusted=");
        sbL.append(this.v);
        sbL.append(")");
        return sbL.toString();
    }
}
