package defpackage;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class lg1 {
    public static final BigDecimal[] a;
    public static final MathContext b = new MathContext(77, RoundingMode.HALF_EVEN);

    static {
        BigDecimal[] bigDecimalArr = new BigDecimal[256];
        a = bigDecimalArr;
        BigDecimal bigDecimalMultiply = BigDecimal.ONE;
        bigDecimalArr[0] = bigDecimalMultiply;
        bigDecimalArr[1] = bigDecimalMultiply;
        int i = 2;
        while (true) {
            BigDecimal[] bigDecimalArr2 = a;
            if (i >= bigDecimalArr2.length) {
                return;
            }
            bigDecimalMultiply = bigDecimalMultiply.multiply(BigDecimal.valueOf(i));
            bigDecimalArr2[i] = BigDecimal.ONE.divide(bigDecimalMultiply, b);
            i++;
        }
    }

    public static BigDecimal a(BigDecimal bigDecimal) {
        MathContext mathContext = b;
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimal, mathContext);
        BigDecimal[] bigDecimalArr = a;
        int i = 92;
        BigDecimal bigDecimalSubtract = bigDecimalArr[92];
        while (true) {
            i -= 2;
            if (i < 0) {
                BigDecimal bigDecimal2 = BigDecimal.ONE;
                return bigDecimalSubtract.add(bigDecimal2, mathContext).subtract(bigDecimal2);
            }
            bigDecimalSubtract = bigDecimalArr[i].subtract(bigDecimalMultiply.multiply(bigDecimalSubtract), mathContext);
        }
    }

    public static BigDecimal b(BigDecimal bigDecimal) {
        int iMin;
        int iSignum = bigDecimal.signum();
        if (iSignum == 0) {
            return BigDecimal.ONE;
        }
        MathContext mathContext = b;
        if (iSignum < 0) {
            return BigDecimal.ONE.divide(b(bigDecimal.negate()), mathContext);
        }
        int iCompareTo = bigDecimal.compareTo(om.m);
        BigDecimal[] bigDecimalArr = a;
        if (iCompareTo > 0) {
            double dMax = Math.max(1.0d, Math.log10(bigDecimal.doubleValue()));
            iMin = Math.min(Math.toIntExact(Math.round(53.0d * dMax * dMax)), bigDecimalArr.length - 1);
        } else {
            iMin = 53;
        }
        BigDecimal bigDecimalAdd = bigDecimalArr[iMin];
        while (true) {
            iMin--;
            if (iMin < 0) {
                return bigDecimalAdd;
            }
            bigDecimalAdd = bigDecimalArr[iMin].add(bigDecimal.multiply(bigDecimalAdd), mathContext);
        }
    }

    public static double c(double d, double d2) {
        if (Double.isNaN(d) || Double.isNaN(d2)) {
            return Double.NaN;
        }
        double dAbs = Math.abs(d);
        double dAbs2 = Math.abs(d2);
        if (dAbs > dAbs2) {
            double d3 = dAbs2 / dAbs;
            return Math.sqrt((d3 * d3) + 1.0d) * dAbs;
        }
        if (dAbs2 <= 0.0d) {
            return 0.0d;
        }
        double d4 = dAbs / dAbs2;
        return Math.sqrt((d4 * d4) + 1.0d) * dAbs2;
    }

    public static double d(int i, double d) {
        double d2 = 1.0d;
        if (i < 0) {
            return 1.0d / d(-i, d);
        }
        while (i > 0) {
            d2 *= d;
            i--;
        }
        return d2;
    }

    public static BigDecimal e(int i, BigDecimal bigDecimal) {
        if (i == 0) {
            return BigDecimal.ONE;
        }
        if (i == 1) {
            return bigDecimal;
        }
        MathContext mathContext = b;
        if (i == 2) {
            return bigDecimal.multiply(bigDecimal, mathContext);
        }
        if (i == 3) {
            return bigDecimal.multiply(bigDecimal).multiply(bigDecimal, mathContext);
        }
        if (i != 4) {
            return bigDecimal.pow(i, mathContext);
        }
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimal);
        return bigDecimalMultiply.multiply(bigDecimalMultiply, mathContext);
    }

    public static BigDecimal f(int i, BigDecimal bigDecimal) {
        if (i <= 0) {
            wg.f();
            return null;
        }
        if (i == 1) {
            return bigDecimal;
        }
        MathContext mathContext = b;
        BigDecimal bigDecimalRound = bigDecimal.round(mathContext);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i);
        BigDecimal bigDecimalSubtract = BigDecimal.ZERO;
        double dDoubleValue = bigDecimalRound.doubleValue();
        if (!Double.isInfinite(dDoubleValue) && !Double.isNaN(dDoubleValue)) {
            bigDecimalSubtract = BigDecimal.valueOf(Math.pow(dDoubleValue, 1.0d / ((double) i)));
        }
        while (true) {
            BigDecimal bigDecimalSubtract2 = e(i, bigDecimalSubtract).subtract(bigDecimalRound);
            if (bigDecimalSubtract2.signum() == 0) {
                return bigDecimalSubtract;
            }
            bigDecimalSubtract = bigDecimalSubtract.subtract(bigDecimalSubtract2.divide(bigDecimalValueOf.multiply(e(i - 1, bigDecimalSubtract)), mathContext));
        }
    }

    public static int g(long j, long j2) {
        return Math.toIntExact(Math.min(j, j2));
    }
}
