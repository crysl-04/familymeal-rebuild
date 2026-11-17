package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class z52 implements pg2 {
    public static final pm k = new pm(4);
    public static final z52 l;
    public static final z52 m;
    public static final z52 n;
    public static final z52 o;
    public static final z52 p;
    public static final int q;
    public static final long r;
    public transient BigDecimal h = null;
    public final long i;
    public final long j;

    static {
        new z52(Long.MAX_VALUE, 1L);
        new z52(Long.MIN_VALUE, 1L);
        l = new z52(0L, 0L);
        new z52(-1L, 1L);
        m = new z52(-1L, 0L);
        n = new z52(1L, 1L);
        o = new z52(1L, 0L);
        new z52(2L, 1L);
        p = new z52(0L, 1L);
        q = BigInteger.valueOf(Long.MAX_VALUE).bitLength();
        r = 2147483648L;
    }

    public z52(long j, long j2) {
        this.j = j;
        this.i = j2;
        if (j2 == 0 && Math.abs(j) > 1) {
            throw new ArithmeticException("n / 0, where abs(n) > 1");
        }
    }

    public static boolean e(z52 z52Var) {
        return z52Var.j != 0 && z52Var.i == 0;
    }

    public static boolean f(z52 z52Var) {
        return z52Var.j == 0 && z52Var.i == 0;
    }

    public static z52 n(long j, long j2) {
        if (j2 == 0) {
            if (j > 0) {
                return o;
            }
            return j < 0 ? m : l;
        }
        if (j == 0) {
            return p;
        }
        long jAbs = Math.abs(j);
        long jAbs2 = Math.abs(j2);
        long jMax = Math.max(jAbs, jAbs2);
        long jMin = Math.min(jAbs, jAbs2);
        long j3 = jMax;
        long j4 = 1;
        while (jMin != 0) {
            j4 = jMin;
            jMin = j3 % jMin;
            j3 = j4;
        }
        if (j2 < 0) {
            j4 = -j4;
        }
        return j4 != 1 ? new z52(j / j4, j2 / j4) : new z52(j, j2);
    }

    public static z52 o(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigIntegerGcd = bigInteger.gcd(bigInteger2);
        if (bigIntegerGcd.compareTo(BigInteger.ONE) > 0) {
            bigInteger = bigInteger.divide(bigIntegerGcd);
            bigInteger2 = bigInteger2.divide(bigIntegerGcd);
        }
        if (bigInteger2.signum() == -1) {
            bigInteger = bigInteger.negate();
            bigInteger2 = bigInteger2.negate();
        }
        int iMax = Math.max(bigInteger.bitLength(), bigInteger2.bitLength());
        int i = q;
        if (iMax > i) {
            int i2 = iMax - i;
            bigInteger = bigInteger.shiftRight(i2);
            bigInteger2 = bigInteger2.shiftRight(i2);
        }
        if (bigInteger.bitLength() > 63) {
            throw new ArithmeticException("BigInteger out of long range");
        }
        long jLongValue = bigInteger.longValue();
        if (bigInteger2.bitLength() <= 63) {
            return n(jLongValue, bigInteger2.longValue());
        }
        throw new ArithmeticException("BigInteger out of long range");
    }

    public static z52 t(double d) {
        if (Double.isNaN(d)) {
            return l;
        }
        z52 z52Var = o;
        if (d == Double.POSITIVE_INFINITY) {
            return z52Var;
        }
        z52 z52Var2 = m;
        if (d == Double.NEGATIVE_INFINITY) {
            return z52Var2;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        int i = (jDoubleToLongBits >> 63) == 0 ? 1 : -1;
        int i2 = (int) ((jDoubleToLongBits >> 52) & 2047);
        long j = jDoubleToLongBits & 4503599627370495L;
        long j2 = i2 == 0 ? j << 1 : j | 4503599627370496L;
        int i3 = i2 - 1075;
        if (i3 >= 0) {
            long j3 = j2 << i3;
            if ((j3 >> i3) != j2) {
                return i > 0 ? z52Var : z52Var2;
            }
            return new z52(((long) i) * j3, 1L);
        }
        while ((j2 & 1) == 0 && i3 < 0) {
            j2 >>= 1;
            i3++;
        }
        int i4 = -i3;
        if (i4 < q) {
            return new z52(((long) i) * j2, 1 << i4);
        }
        BigInteger bigIntegerShiftLeft = BigInteger.ONE.shiftLeft(i4);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger bigIntegerDivide = bigIntegerShiftLeft.divide(bigIntegerValueOf);
        if (bigIntegerDivide.compareTo(bigIntegerValueOf) > 0) {
            return p;
        }
        long j4 = ((long) i) * j2;
        if (bigIntegerDivide.bitLength() <= 63) {
            return new z52(j4 / bigIntegerDivide.longValue(), Long.MAX_VALUE);
        }
        throw new ArithmeticException("BigInteger out of long range");
    }

    public static z52 v(Comparable comparable) {
        BigInteger bigIntegerUnscaledValue;
        BigInteger bigIntegerPow;
        if (comparable == null) {
            return p;
        }
        if (comparable instanceof z52) {
            return (z52) comparable;
        }
        BigDecimal bigDecimalC = pz1.C(comparable);
        int iScale = bigDecimalC.scale();
        if (iScale < 0) {
            bigIntegerUnscaledValue = bigDecimalC.unscaledValue().multiply(BigInteger.TEN.pow(-iScale));
            bigIntegerPow = BigInteger.ONE;
        } else {
            bigIntegerUnscaledValue = bigDecimalC.unscaledValue();
            bigIntegerPow = BigInteger.TEN.pow(iScale);
            BigInteger bigIntegerGcd = bigIntegerUnscaledValue.gcd(bigIntegerPow);
            if (bigIntegerGcd.compareTo(BigInteger.ONE) > 0) {
                bigIntegerUnscaledValue = bigIntegerUnscaledValue.divide(bigIntegerGcd);
                bigIntegerPow = bigIntegerPow.divide(bigIntegerGcd);
            }
        }
        int iMax = Math.max(bigIntegerUnscaledValue.bitLength(), bigIntegerPow.bitLength());
        int i = q;
        if (iMax > i) {
            int i2 = iMax - i;
            bigIntegerUnscaledValue = bigIntegerUnscaledValue.shiftRight(i2);
            bigIntegerPow = bigIntegerPow.shiftRight(i2);
        }
        return new z52(bigIntegerUnscaledValue.longValue(), bigIntegerPow.longValue());
    }

    @Override // defpackage.xo1
    public final double A0() {
        if (this.i != 0) {
            return F1().doubleValue();
        }
        int iCompare = Long.compare(this.j, 0L);
        if (iCompare != -1) {
            return iCompare != 1 ? Double.NaN : Double.POSITIVE_INFINITY;
        }
        return Double.NEGATIVE_INFINITY;
    }

    @Override // defpackage.vc2
    public final BigDecimal F1() {
        BigDecimal bigDecimal = this.h;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        BigDecimal bigDecimalS = s(qm.l.k);
        this.h = bigDecimalS;
        return bigDecimalS;
    }

    @Override // defpackage.vo1
    public final Object M0(wo1 wo1Var) {
        return v(s(wo1Var.k));
    }

    @Override // defpackage.xo1
    public final int U0() {
        return F1().intValue();
    }

    @Override // defpackage.vc2
    public final Object X1() {
        int iP = p();
        long j = this.j;
        long j2 = this.i;
        return iP >= 0 ? new z52(j2, j) : new z52(-j2, -j);
    }

    @Override // defpackage.xo1
    public final long a0() {
        return F1().longValue();
    }

    @Override // defpackage.ko1
    public final double a1() {
        e32 e32Var = h32.q;
        double dA0 = A0();
        e32Var.getClass();
        return Math.abs(dA0);
    }

    @Override // defpackage.xc2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final z52 i0(z52 z52Var) {
        if (!f(this)) {
            z52Var.getClass();
            long j = z52Var.i;
            long j2 = z52Var.j;
            if (!f(z52Var)) {
                if (!e(this)) {
                    long jMax = Math.max(q(), z52Var.q());
                    long j3 = r;
                    long j4 = this.j;
                    long j5 = this.i;
                    if (jMax <= j3) {
                        if (j5 == j) {
                            return new z52(j4 + j2, j5);
                        }
                        return n((j2 * j5) + (j4 * j), j5 * j);
                    }
                    BigInteger bigIntegerValueOf = BigInteger.valueOf(j4);
                    BigInteger bigIntegerValueOf2 = BigInteger.valueOf(j5);
                    BigInteger bigIntegerValueOf3 = BigInteger.valueOf(j2);
                    BigInteger bigIntegerValueOf4 = BigInteger.valueOf(j);
                    return o(bigIntegerValueOf.multiply(bigIntegerValueOf4).add(bigIntegerValueOf3.multiply(bigIntegerValueOf2)), bigIntegerValueOf2.multiply(bigIntegerValueOf4));
                }
                if (!e(z52Var) || p() == z52Var.p()) {
                    return this;
                }
            }
        }
        return l;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(z52 z52Var) {
        long j = z52Var.j;
        long j2 = z52Var.i;
        long j3 = this.j;
        long j4 = this.i;
        if (j2 == 0) {
            if (j4 == 0) {
                return Long.compare(j3, j);
            }
            return j > 0 ? -1 : 1;
        }
        if (j4 == 0) {
            return j3 > 0 ? 1 : -1;
        }
        return F1().compareTo(z52Var.F1());
    }

    @Override // defpackage.yc2
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final z52 f1(z52 z52Var) {
        if (!f(this)) {
            z52Var.getClass();
            long j = z52Var.j;
            long j2 = z52Var.i;
            if (!f(z52Var)) {
                if (!e(this)) {
                    long jMax = Math.max(q(), z52Var.q());
                    long j3 = r;
                    long j4 = this.i;
                    long j5 = this.j;
                    if (jMax <= j3) {
                        return n(j5 * j2, j4 * j);
                    }
                    return o(BigInteger.valueOf(j5).multiply(BigInteger.valueOf(j2)), BigInteger.valueOf(j4).multiply(BigInteger.valueOf(j)));
                }
                if (!e(z52Var)) {
                    return z52Var.p() > 0 ? this : l();
                }
            }
        }
        return l;
    }

    @Override // defpackage.xo1
    public final float d0() {
        return F1().floatValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z52)) {
            return false;
        }
        z52 z52Var = (z52) obj;
        return this.i == z52Var.i && this.j == z52Var.j;
    }

    @Override // defpackage.ko1
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final z52 i(z52 z52Var) {
        if (!f(this)) {
            z52Var.getClass();
            long j = z52Var.i;
            long j2 = z52Var.j;
            if (!f(z52Var)) {
                if (e(this)) {
                    return z52Var.p() > 0 ? this : l();
                }
                long jMax = Math.max(q(), z52Var.q());
                long j3 = r;
                long j4 = this.i;
                long j5 = this.j;
                if (jMax <= j3) {
                    return n(j5 * j2, j4 * j);
                }
                return o(BigInteger.valueOf(j5).multiply(BigInteger.valueOf(j2)), BigInteger.valueOf(j4).multiply(BigInteger.valueOf(j)));
            }
        }
        return l;
    }

    @Override // defpackage.ko1
    public final Object h(double d) {
        return i(t(d));
    }

    public final int hashCode() {
        long j = this.i;
        int i = (((int) (j ^ (j >>> 32))) + 31) * 31;
        long j2 = this.j;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final z52 l() {
        return new z52(-this.j, this.i);
    }

    public final int p() {
        return Long.compare(this.j, 0L);
    }

    public final long q() {
        return Math.max(Math.abs(this.j), this.i);
    }

    @Override // defpackage.zc2
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final z52 R(z52 z52Var) {
        if (!f(this)) {
            z52Var.getClass();
            long j = z52Var.i;
            long j2 = z52Var.j;
            if (!f(z52Var)) {
                if (!e(this)) {
                    long jMax = Math.max(q(), z52Var.q());
                    long j3 = r;
                    long j4 = this.j;
                    long j5 = this.i;
                    if (jMax <= j3) {
                        return j5 == j ? new z52(j4 - j2, j5) : n((j4 * j) - (j2 * j5), j5 * j);
                    }
                    BigInteger bigIntegerValueOf = BigInteger.valueOf(j4);
                    BigInteger bigIntegerValueOf2 = BigInteger.valueOf(j5);
                    BigInteger bigIntegerValueOf3 = BigInteger.valueOf(j2);
                    BigInteger bigIntegerValueOf4 = BigInteger.valueOf(j);
                    return o(bigIntegerValueOf.multiply(bigIntegerValueOf4).subtract(bigIntegerValueOf3.multiply(bigIntegerValueOf2)), bigIntegerValueOf2.multiply(bigIntegerValueOf4));
                }
                if (!e(z52Var) || p() != z52Var.p()) {
                    return this;
                }
            }
        }
        return l;
    }

    public final BigDecimal s(MathContext mathContext) {
        long j = this.i;
        if (j != 0) {
            return new BigDecimal(this.j).divide(new BigDecimal(j), mathContext);
        }
        throw new NumberFormatException();
    }

    public final String toString() {
        return "(" + this.j + " / " + this.i + ")";
    }

    @Override // defpackage.yc2
    public final Object u1(double d) {
        return f1(t(d));
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
