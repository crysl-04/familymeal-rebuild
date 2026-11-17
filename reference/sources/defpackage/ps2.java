package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ps2 {
    public final e40 a;
    public final qs2 b;
    public final as0 c;
    public final Double d;
    public final Double e;
    public final double f;
    public final List g;

    public ps2(e40 e40Var, qs2 qs2Var, as0 as0Var, Double d, Double d2, double d3, List list) {
        as0Var.getClass();
        this.a = e40Var;
        this.b = qs2Var;
        this.c = as0Var;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps2)) {
            return false;
        }
        ps2 ps2Var = (ps2) obj;
        return uz0.g(this.a, ps2Var.a) && this.b == ps2Var.b && this.c == ps2Var.c && uz0.g(this.d, ps2Var.d) && uz0.g(this.e, ps2Var.e) && Double.compare(this.f, ps2Var.f) == 0 && uz0.g(this.g, ps2Var.g);
    }

    public final int hashCode() {
        e40 e40Var = this.a;
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + ((e40Var == null ? 0 : e40Var.hashCode()) * 31)) * 31)) * 31;
        Double d = this.d;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.e;
        return this.g.hashCode() + jp1.a(this.f, (iHashCode2 + (d2 != null ? d2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "Result(targets=" + this.a + ", source=" + this.b + ", effectiveGoal=" + this.c + ", bmr=" + this.d + ", maintenanceKcal=" + this.e + ", dailyAdjustment=" + this.f + ", notes=" + this.g + ")";
    }

    public /* synthetic */ ps2(e40 e40Var, qs2 qs2Var, as0 as0Var, Double d, List list, int i) {
        this(e40Var, qs2Var, as0Var, null, (i & 16) != 0 ? null : d, 0.0d, list);
    }
}
