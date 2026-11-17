package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vj {
    public static final uj Companion = new uj();
    public static final d51[] o = {null, null, null, null, null, null, vs.N(g81.h, new r3(16)), null, null, null, null, null, null, null};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final Integer h;
    public final Double i;
    public final Double j;
    public final Double k;
    public final vs2 l;
    public final Double m;
    public final String n;

    public /* synthetic */ vj(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, Integer num, Double d, Double d2, Double d3, vs2 vs2Var, Double d4, String str7) {
        if (63 != (i & 63)) {
            m02.x(i, 63, tj.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        if ((i & 64) == 0) {
            this.g = ag0.h;
        } else {
            this.g = list;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = d;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = d2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = d3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = vs2Var;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = d4;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj)) {
            return false;
        }
        vj vjVar = (vj) obj;
        return uz0.g(this.a, vjVar.a) && uz0.g(this.b, vjVar.b) && uz0.g(this.c, vjVar.c) && uz0.g(this.d, vjVar.d) && uz0.g(this.e, vjVar.e) && uz0.g(this.f, vjVar.f) && uz0.g(this.g, vjVar.g) && uz0.g(this.h, vjVar.h) && uz0.g(this.i, vjVar.i) && uz0.g(this.j, vjVar.j) && uz0.g(this.k, vjVar.k) && uz0.g(this.l, vjVar.l) && uz0.g(this.m, vjVar.m) && uz0.g(this.n, vjVar.n);
    }

    public final int hashCode() {
        int iG = jp1.g(this.g, jp1.f(this.f, jp1.f(this.e, jp1.f(this.d, jp1.f(this.c, jp1.f(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        Integer num = this.h;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.i;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.j;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.k;
        int iHashCode4 = (iHashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        vs2 vs2Var = this.l;
        int iHashCode5 = (iHashCode4 + (vs2Var == null ? 0 : vs2Var.hashCode())) * 31;
        Double d4 = this.m;
        int iHashCode6 = (iHashCode5 + (d4 == null ? 0 : d4.hashCode())) * 31;
        String str = this.n;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = wi0.l("BackupPersonDto(id=", this.a, ", name=", this.b, ", gender=");
        wi0.v(sbL, this.c, ", activity=", this.d, ", goal=");
        wi0.v(sbL, this.e, ", pace=", this.f, ", excludedIngredients=");
        sbL.append(this.g);
        sbL.append(", birthYear=");
        sbL.append(this.h);
        sbL.append(", heightCm=");
        sbL.append(this.i);
        sbL.append(", weightKg=");
        sbL.append(this.j);
        sbL.append(", targetWeightKg=");
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

    public vj(String str, String str2, String str3, String str4, String str5, String str6, List list, Integer num, Double d, Double d2, Double d3, vs2 vs2Var, Double d4, String str7) {
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
        this.e = str5;
        this.f = str6;
        this.g = list;
        this.h = num;
        this.i = d;
        this.j = d2;
        this.k = d3;
        this.l = vs2Var;
        this.m = d4;
        this.n = str7;
    }
}
