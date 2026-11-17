package defpackage;

import java.math.BigDecimal;
import java.math.MathContext;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class uw implements pg2, k1, e1 {
    public static final pm j = new pm(1);
    public static final uw k;
    public static final uw l;
    public static final uw m;
    public static final uw n;
    public static final double o;
    public final double h;
    public final double i;

    static {
        double d = h32.a;
        double d2 = h32.b;
        k = new uw(d, d2);
        l = f2(Double.POSITIVE_INFINITY, d);
        double d3 = h32.e;
        i2(Double.NaN, Double.NaN);
        new uw(d3);
        m = new uw(d2);
        new uw(h32.c);
        n = new uw(d);
        o = i32.l.w() * h32.k;
    }

    public uw(double d) {
        this.i = d;
        this.h = h32.a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    public static uw f2(double d, double d2) {
        double d3;
        double d4 = h32.m;
        double d5 = d2 % d4;
        double d6 = h32.a;
        if (d5 < d6) {
            d5 += d4;
        }
        double d7 = o;
        if (d5 <= d7) {
            return new uw(d);
        }
        e32 e32Var = h32.q;
        double d8 = d5 - h32.k;
        e32Var.getClass();
        if (Math.abs(d8) <= d7) {
            return new uw(-d);
        }
        if (d != d6) {
            h32.u.getClass();
            double dCos = Math.cos(d5);
            if (dCos != d6) {
                d3 = dCos * d;
            } else {
                d3 = d6;
            }
        } else {
            d3 = d6;
        }
        if (d != d6) {
            h32.G.getClass();
            double dSin = Math.sin(d5);
            if (dSin != d6) {
                d6 = d * dSin;
            }
        }
        return new uw(d3, d6);
    }

    public static uw i2(double d, double d2) {
        return i32.l.B(d, d2) ? new uw(d) : new uw(d, d2);
    }

    public static uw l2(Comparable comparable) {
        if (comparable == null) {
            return n;
        }
        return comparable instanceof uw ? (uw) comparable : new uw(xo1.c1(comparable));
    }

    @Override // defpackage.k1, defpackage.a1
    public final double A(int i) {
        double d = this.i;
        if (i == 0) {
            return d;
        }
        double d2 = this.h;
        if (i == 1) {
            return d2;
        }
        if (i == 2) {
            return -d2;
        }
        if (i == 3) {
            return d;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    @Override // defpackage.xo1
    public final double A0() {
        return this.i;
    }

    @Override // defpackage.no2
    public final long B1() {
        return 2L;
    }

    @Override // defpackage.vc2
    public final BigDecimal F1() {
        return new BigDecimal(this.i, MathContext.DECIMAL64);
    }

    @Override // defpackage.k1, defpackage.a1
    public final Comparable G(long j2) {
        return Double.valueOf(z(j2));
    }

    @Override // defpackage.k1
    public final Comparable H(long j2, long j3) {
        return Double.valueOf(y1(j2, j3));
    }

    @Override // defpackage.k1
    public final double J(int i, int i2) {
        if (i == i2) {
            return this.i;
        }
        double d = this.h;
        if (i == 1) {
            return d;
        }
        if (i2 == 1) {
            return -d;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    @Override // defpackage.vo1
    public final Object M0(wo1 wo1Var) {
        return new uw(wo1Var.u(this.i), wo1Var.u(this.h));
    }

    @Override // defpackage.no2
    public final int T() {
        return 2;
    }

    @Override // defpackage.vc2
    public final vc2 T0() {
        return new uw(this.i, -this.h);
    }

    @Override // defpackage.xo1
    public final int U0() {
        return (int) this.i;
    }

    @Override // defpackage.vc2
    public final Object X1() {
        return f2(h32.b / a1(), -j2());
    }

    @Override // defpackage.no2
    public final int Z1() {
        return 2;
    }

    @Override // defpackage.e1
    public final void a(dk1 dk1Var) {
        double d = this.i;
        dk1Var.y(0L, d);
        double d2 = this.h;
        dk1Var.y(1L, d2);
        dk1Var.y(2L, -d2);
        dk1Var.y(3L, d);
    }

    @Override // defpackage.xo1
    public final long a0() {
        return (long) this.i;
    }

    @Override // defpackage.ko1
    public final double a1() {
        h32.x.getClass();
        return lg1.c(this.i, this.h);
    }

    @Override // defpackage.xc2
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public final uw i0(uw uwVar) {
        return new uw(this.i + uwVar.i, this.h + uwVar.h);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public final int compareTo(uw uwVar) {
        int iCompare = Double.compare(this.i, uwVar.i);
        return iCompare != 0 ? iCompare : Double.compare(this.h, uwVar.h);
    }

    @Override // defpackage.no2, defpackage.mo2
    public final long count() {
        return 4L;
    }

    @Override // defpackage.xo1
    public final float d0() {
        return (float) this.i;
    }

    @Override // defpackage.yc2
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public final uw u1(double d) {
        return new uw(this.i / d, this.h / d);
    }

    @Override // defpackage.yc2
    /* JADX INFO: renamed from: e2, reason: merged with bridge method [inline-methods] */
    public final uw f1(uw uwVar) {
        double d = uwVar.i;
        double d2 = uwVar.h;
        e32 e32Var = h32.q;
        e32Var.getClass();
        double dAbs = Math.abs(d);
        e32Var.getClass();
        double dAbs2 = Math.abs(d2);
        double d3 = this.h;
        double d4 = this.i;
        if (dAbs > dAbs2) {
            double d5 = d2 / d;
            double d6 = (d2 * d5) + d;
            return new uw(((d5 * d3) + d4) / d6, (d3 - (d5 * d4)) / d6);
        }
        double d7 = d / d2;
        double d8 = (d * d7) + d2;
        return new uw(((d7 * d4) + d3) / d8, ((d7 * d3) - d4) / d8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw)) {
            return false;
        }
        uw uwVar = (uw) obj;
        return Double.doubleToLongBits(this.i) == Double.doubleToLongBits(uwVar.i) && Double.doubleToLongBits(this.h) == Double.doubleToLongBits(uwVar.h);
    }

    @Override // defpackage.ko1
    /* JADX INFO: renamed from: g2, reason: merged with bridge method [inline-methods] */
    public final uw i(uw uwVar) {
        double d = uwVar.i;
        double d2 = uwVar.h;
        double d3 = this.i;
        double d4 = this.h;
        return new uw((d3 * d) - (d4 * d2), (d4 * d) + (d3 * d2));
    }

    @Override // defpackage.ko1
    public final Object h(double d) {
        return new uw(this.i * d, this.h * d);
    }

    @Override // defpackage.no2
    public final long h1() {
        return 2L;
    }

    public final uw h2() {
        return new uw(-this.i, -this.h);
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.h);
        int i = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.i);
        return (i * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public final double j2() {
        return Math.atan2(this.h, this.i);
    }

    @Override // defpackage.zc2
    /* JADX INFO: renamed from: k2, reason: merged with bridge method [inline-methods] */
    public final uw R(uw uwVar) {
        return new uw(this.i - uwVar.i, this.h - uwVar.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(Double.toString(this.i));
        double d = h32.a;
        double d2 = this.h;
        if (d2 < d) {
            sb.append(" - ");
        } else {
            sb.append(" + ");
        }
        h32.q.getClass();
        sb.append(Double.toString(Math.abs(d2)));
        sb.append("i)");
        return sb.toString();
    }

    public uw(double d, double d2) {
        this.i = d;
        this.h = d2;
    }

    @Override // defpackage.l1
    public final Object get() {
        return this;
    }
}
