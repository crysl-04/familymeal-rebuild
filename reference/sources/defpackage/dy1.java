package defpackage;

import java.time.LocalDate;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dy1 {
    public final String a;
    public final String b;
    public final ir0 c;
    public final Integer d;
    public final Double e;
    public final Double f;
    public final i3 g;
    public final as0 h;
    public final Double i;
    public final lt1 j;
    public final Set k;
    public final e40 l;
    public final double m;
    public final LocalDate n;

    public dy1(String str, String str2, ir0 ir0Var, Integer num, Double d, Double d2, i3 i3Var, as0 as0Var, Double d3, lt1 lt1Var, Set set, e40 e40Var, double d4, LocalDate localDate) {
        str.getClass();
        str2.getClass();
        ir0Var.getClass();
        i3Var.getClass();
        as0Var.getClass();
        lt1Var.getClass();
        set.getClass();
        this.a = str;
        this.b = str2;
        this.c = ir0Var;
        this.d = num;
        this.e = d;
        this.f = d2;
        this.g = i3Var;
        this.h = as0Var;
        this.i = d3;
        this.j = lt1Var;
        this.k = set;
        this.l = e40Var;
        this.m = d4;
        this.n = localDate;
    }

    public static dy1 a(dy1 dy1Var, String str, Integer num, Double d, Double d2, Double d3, e40 e40Var, double d4, LocalDate localDate, int i) {
        String str2 = (i & 1) != 0 ? dy1Var.a : str;
        String str3 = dy1Var.b;
        ir0 ir0Var = dy1Var.c;
        Integer num2 = (i & 8) != 0 ? dy1Var.d : num;
        Double d5 = (i & 16) != 0 ? dy1Var.e : d;
        Double d6 = (i & 32) != 0 ? dy1Var.f : d2;
        i3 i3Var = dy1Var.g;
        as0 as0Var = dy1Var.h;
        Double d7 = (i & 256) != 0 ? dy1Var.i : d3;
        lt1 lt1Var = dy1Var.j;
        Set set = dy1Var.k;
        e40 e40Var2 = (i & 2048) != 0 ? dy1Var.l : e40Var;
        double d8 = (i & 4096) != 0 ? dy1Var.m : d4;
        LocalDate localDate2 = (i & 8192) != 0 ? dy1Var.n : localDate;
        dy1Var.getClass();
        str2.getClass();
        str3.getClass();
        ir0Var.getClass();
        i3Var.getClass();
        as0Var.getClass();
        lt1Var.getClass();
        set.getClass();
        return new dy1(str2, str3, ir0Var, num2, d5, d6, i3Var, as0Var, d7, lt1Var, set, e40Var2, d8, localDate2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy1)) {
            return false;
        }
        dy1 dy1Var = (dy1) obj;
        return uz0.g(this.a, dy1Var.a) && uz0.g(this.b, dy1Var.b) && this.c == dy1Var.c && uz0.g(this.d, dy1Var.d) && uz0.g(this.e, dy1Var.e) && uz0.g(this.f, dy1Var.f) && this.g == dy1Var.g && this.h == dy1Var.h && uz0.g(this.i, dy1Var.i) && this.j == dy1Var.j && uz0.g(this.k, dy1Var.k) && uz0.g(this.l, dy1Var.l) && Double.compare(this.m, dy1Var.m) == 0 && uz0.g(this.n, dy1Var.n);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + jp1.f(this.b, this.a.hashCode() * 31, 31)) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.e;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f;
        int iHashCode4 = (this.h.hashCode() + ((this.g.hashCode() + ((iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31)) * 31)) * 31;
        Double d3 = this.i;
        int iHashCode5 = (this.k.hashCode() + ((this.j.hashCode() + ((iHashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31)) * 31)) * 31;
        e40 e40Var = this.l;
        int iA = jp1.a(this.m, (iHashCode5 + (e40Var == null ? 0 : e40Var.hashCode())) * 31, 31);
        LocalDate localDate = this.n;
        return iA + (localDate != null ? localDate.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = wi0.l("PersonProfile(id=", this.a, ", name=", this.b, ", gender=");
        sbL.append(this.c);
        sbL.append(", birthYear=");
        sbL.append(this.d);
        sbL.append(", heightCm=");
        sbL.append(this.e);
        sbL.append(", weightKg=");
        sbL.append(this.f);
        sbL.append(", activity=");
        sbL.append(this.g);
        sbL.append(", goal=");
        sbL.append(this.h);
        sbL.append(", targetWeightKg=");
        sbL.append(this.i);
        sbL.append(", pace=");
        sbL.append(this.j);
        sbL.append(", excludedIngredientCategories=");
        sbL.append(this.k);
        sbL.append(", manualTargets=");
        sbL.append(this.l);
        sbL.append(", kcalOffset=");
        sbL.append(this.m);
        sbL.append(", lastAdjusted=");
        sbL.append(this.n);
        sbL.append(")");
        return sbL.toString();
    }
}
