package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class q52 {
    public static final p52 Companion = new p52();
    public final double a;
    public final Double b;

    public /* synthetic */ q52(int i, double d, Double d2) {
        this.a = (i & 1) == 0 ? 0.0d : d;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q52)) {
            return false;
        }
        q52 q52Var = (q52) obj;
        return Double.compare(this.a, q52Var.a) == 0 && uz0.g(this.b, q52Var.b);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.a) * 31;
        Double d = this.b;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }

    public final String toString() {
        return "RangeDto(min=" + this.a + ", max=" + this.b + ")";
    }

    public q52(double d, Double d2) {
        this.a = d;
        this.b = d2;
    }
}
