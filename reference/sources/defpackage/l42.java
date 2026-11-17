package defpackage;

import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class l42 implements pg2 {
    public static final jy1 k = new jy1(7);
    public static final l42 l = new l42(Double.NaN, Double.NaN);
    public static final l42 m = new l42(Double.NEGATIVE_INFINITY, 0.0d);
    public static final l42 n = new l42(1.0d, 0.0d);
    public static final l42 o = new l42(Double.POSITIVE_INFINITY, 0.0d);
    public static final l42 p = new l42(0.0d, 0.0d);
    public final double h;
    public transient BigDecimal i = null;
    public final double j;

    public l42(double d, double d2) {
        this.h = d;
        this.j = d2;
    }

    public static l42 b(double d, double d2, double d3, double d4) {
        double d5 = d + d3;
        double d6 = d5 - d;
        double d7 = (d - (d5 - d6)) + (d3 - d6) + d2 + d4;
        double d8 = d5 + d7;
        return new l42(d8, d7 - (d8 - d5));
    }

    public static l42 d(double d, double d2, double d3, double d4) {
        double d5 = d3 + d4;
        double d6 = (d + d2) / d5;
        double d7 = d6 * d3;
        double d8 = d6 * 1.34217729E8d;
        double d9 = 1.34217729E8d * d3;
        double d10 = d8 - (d8 - d6);
        double d11 = d9 - (d9 - d3);
        double d12 = d6 - d10;
        double d13 = d3 - d11;
        double d14 = ((d10 * d11) - d7) + (d13 * d10) + (d12 * d11) + (d12 * d13);
        double d15 = d6 * d4;
        double d16 = d7 + d15;
        double d17 = d16 - d7;
        double d18 = (d7 - (d16 - d17)) + (d15 - d17) + d14;
        double d19 = d - d16;
        double d20 = d2 - d18;
        double d21 = d19 + d20;
        double d22 = ((d20 - (d21 - d19)) + d21) / d5;
        double d23 = d6 + d22;
        double d24 = d23 - d6;
        return new l42(d23, (d6 - (d23 - d24)) + (d22 - d24));
    }

    public static boolean f(l42 l42Var) {
        return Double.isInfinite(l42Var.h) || Double.isInfinite(l42Var.j);
    }

    public static boolean g(l42 l42Var) {
        return Double.isNaN(l42Var.h) || Double.isNaN(l42Var.j);
    }

    public static l42 l(double d, double d2, double d3, double d4) {
        double d5 = d * 1.34217729E8d;
        double d6 = 1.34217729E8d * d3;
        double d7 = d5 - (d5 - d);
        double d8 = d6 - (d6 - d3);
        double d9 = d - d7;
        double d10 = d3 - d8;
        double d11 = d * d3;
        double d12 = ((d7 * d8) - d11) + (d10 * d7) + (d9 * d8) + (d9 * d10);
        double d13 = (d2 * d3) + (d * d4);
        double d14 = d11 + d13;
        double d15 = d14 - d11;
        double d16 = (d11 - (d14 - d15)) + (d13 - d15) + (d2 * d4) + d12;
        double d17 = d14 + d16;
        return new l42(d17, d16 - (d17 - d14));
    }

    public static l42 r(double d) {
        if (!Double.isFinite(d)) {
            return new l42(d, h32.a);
        }
        if (d == Math.rint(d) && Math.abs(d) <= 9.007199254740992E15d) {
            return new l42(d, h32.a);
        }
        double d2 = 1.34217729E8d * d;
        double d3 = d2 - (d2 - d);
        return new l42(d3, d - d3);
    }

    public static l42 s(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return p;
        }
        double dDoubleValue = bigDecimal.doubleValue();
        return new l42(dDoubleValue, bigDecimal.subtract(new BigDecimal(dDoubleValue)).doubleValue());
    }

    @Override // defpackage.xo1
    public final double A0() {
        return this.h + this.j;
    }

    @Override // defpackage.vc2
    public final BigDecimal F1() {
        BigDecimal bigDecimal = this.i;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        BigDecimal bigDecimalAdd = new BigDecimal(this.h).add(new BigDecimal(this.j), qm.l.k);
        this.i = bigDecimalAdd;
        return bigDecimalAdd;
    }

    @Override // defpackage.vo1
    public final Object M0(wo1 wo1Var) {
        return s(new BigDecimal(this.h).add(new BigDecimal(this.j), wo1Var.k));
    }

    @Override // defpackage.xo1
    public final int U0() {
        return F1().intValue();
    }

    @Override // defpackage.vc2
    public final Object X1() {
        return n.f1(this);
    }

    @Override // defpackage.xo1
    public final long a0() {
        return Math.round(this.h + this.j);
    }

    @Override // defpackage.ko1
    public final double a1() {
        return Math.abs(A0());
    }

    @Override // defpackage.xc2
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final l42 i0(l42 l42Var) {
        boolean zG = g(this);
        l42 l42Var2 = l;
        if (zG || g(l42Var)) {
            return l42Var2;
        }
        if (f(this)) {
            return (!f(l42Var) || p() == l42Var.p()) ? this : l42Var2;
        }
        return b(this.h, this.j, l42Var.h, l42Var.j);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Double.compare(A0(), ((l42) obj).A0());
    }

    @Override // defpackage.xo1
    public final float d0() {
        return F1().floatValue();
    }

    @Override // defpackage.yc2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final l42 f1(l42 l42Var) {
        if (g(this) || g(l42Var)) {
            return l;
        }
        return d(this.h, this.j, l42Var.h, l42Var.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l42)) {
            return false;
        }
        l42 l42Var = (l42) obj;
        return Double.doubleToLongBits(this.h) == Double.doubleToLongBits(l42Var.h) && Double.doubleToLongBits(this.j) == Double.doubleToLongBits(l42Var.j);
    }

    @Override // defpackage.ko1
    public final Object h(double d) {
        double d2 = 1.34217729E8d * d;
        double d3 = d2 - (d2 - d);
        return l(this.h, this.j, d3, d - d3);
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.h);
        int i = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.j);
        return (i * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    @Override // defpackage.ko1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final l42 i(l42 l42Var) {
        if (g(this) || g(l42Var)) {
            return l;
        }
        if (f(this)) {
            return l42Var.p() > 0 ? this : o();
        }
        return l(this.h, this.j, l42Var.h, l42Var.j);
    }

    public final l42 o() {
        return new l42(-this.h, -this.j);
    }

    public final int p() {
        return Double.compare(A0(), 0.0d);
    }

    @Override // defpackage.zc2
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final l42 R(l42 l42Var) {
        boolean zG = g(this);
        l42 l42Var2 = l;
        if (zG || g(l42Var)) {
            return l42Var2;
        }
        if (f(this)) {
            return (f(l42Var) && p() == l42Var.p()) ? l42Var2 : this;
        }
        return b(this.h, this.j, -l42Var.h, -l42Var.j);
    }

    public final String toString() {
        return F1().toString();
    }

    @Override // defpackage.yc2
    public final Object u1(double d) {
        double d2 = 1.34217729E8d * d;
        double d3 = d2 - (d2 - d);
        return d(this.h, this.j, d3, d - d3);
    }

    @Override // defpackage.vc2
    public final vc2 T0() {
        return this;
    }

    @Override // defpackage.l1
    public final Object get() {
        return this;
    }
}
