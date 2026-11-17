package defpackage;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wo1 extends f3 {
    public static final MathContext p = MathContext.DECIMAL64;
    public static final wo1[] q = new wo1[16];
    public final double j;
    public final MathContext k;
    public final int l;
    public final double m;
    public final double n;
    public final int o;

    static {
        int i = 0;
        while (true) {
            wo1[] wo1VarArr = q;
            if (i >= wo1VarArr.length) {
                return;
            }
            int i2 = i + 1;
            wo1VarArr[i] = F(i2, i2);
            i = i2;
        }
    }

    public wo1(NumberFormat numberFormat, MathContext mathContext, int i) {
        super(numberFormat);
        this.k = mathContext;
        int precision = mathContext.getPrecision();
        this.l = precision;
        if (precision > 0) {
            this.m = Math.pow(h32.d, 1 - precision);
        } else {
            this.m = h32.o;
        }
        this.o = i;
        if (i <= Integer.MIN_VALUE) {
            this.j = Double.MIN_NORMAL;
            this.n = h32.b;
        } else {
            double d = h32.f;
            double d2 = h32.d;
            this.j = Math.pow(d2, -i) * d;
            this.n = lg1.d(i, d2);
        }
    }

    public static boolean D(double d, double d2) {
        return d == 0.0d || Math.abs(d) < d2;
    }

    public static wo1 F(int i, int i2) {
        return new wo1(wi0.b(2, Locale.getDefault()), new MathContext(i, p.getRoundingMode()), i2);
    }

    public static wo1 G(int i) {
        return (1 > i || i > 16) ? F(i, i) : q[i - 1];
    }

    public static wo1 H(int i, int i2) {
        return (i != i2 || 1 > i || i > 16) ? F(i, i2) : q[i - 1];
    }

    public static wo1 I(MathContext mathContext) {
        return new wo1(wi0.b(2, Locale.getDefault()), mathContext, Integer.MIN_VALUE);
    }

    public static wo1 J(int i) {
        return new wo1(wi0.b(2, Locale.getDefault()), new MathContext(i, p.getRoundingMode()), Integer.MIN_VALUE);
    }

    public static wo1 K(int i) {
        return new wo1(wi0.b(2, Locale.getDefault()), p, i);
    }

    public static int t(double d, double d2) {
        if (d == d2) {
            return 0;
        }
        return Double.compare(d, d2);
    }

    public final boolean A(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        if (bigDecimal2.compareTo(bigDecimal) > 0) {
            if (bigDecimal.compareTo(bigDecimal2) == 0 ? false : !C(bigDecimal.abs().max(bigDecimal2.abs()), bigDecimal2.subtract(bigDecimal))) {
                return true;
            }
        }
        return false;
    }

    public final boolean B(double d, double d2) {
        double d3 = this.j;
        if (D(d, d3)) {
            return D(d2, d3);
        }
        return Math.abs(d2) < Math.abs(d) * this.m;
    }

    public final boolean C(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        if (E(bigDecimal)) {
            return E(bigDecimal2);
        }
        int i = this.l;
        if (i > 0) {
            return bigDecimal2.abs().compareTo(bigDecimal.abs().scaleByPowerOfTen(1 - i)) < 0;
        }
        return Math.abs(bigDecimal2.doubleValue()) < Math.abs(bigDecimal.doubleValue()) * this.m;
    }

    public final boolean E(BigDecimal bigDecimal) {
        if (bigDecimal.signum() == 0) {
            return true;
        }
        int i = this.o;
        if (i <= Integer.MIN_VALUE) {
            return false;
        }
        BigDecimal[] bigDecimalArr = lg1.a;
        return (bigDecimal.signum() != 0 ? (bigDecimal.precision() - bigDecimal.scale()) - 1 : Integer.MIN_VALUE) < (-i) && bigDecimal.setScale(i, this.k.getRoundingMode()).signum() == 0;
    }

    public final wo1 L(RoundingMode roundingMode) {
        return new wo1((NumberFormat) ((Format) this.i), new MathContext(this.l, roundingMode), this.o);
    }

    public final void M(int i) {
        new wo1((NumberFormat) ((Format) this.i), this.k, i);
    }

    @Override // defpackage.f3
    public final void a(Format format, Object obj) {
        if (format instanceof DecimalFormat) {
            DecimalFormat decimalFormat = (DecimalFormat) format;
            int iRound = this.o - Math.round((float) h32.z.a(decimalFormat.getMultiplier()));
            decimalFormat.setMaximumFractionDigits(iRound);
            decimalFormat.setMinimumFractionDigits(Math.min(2, iRound));
            boolean z = obj instanceof BigDecimal;
            Format format2 = (Format) this.i;
            if (z) {
                ((DecimalFormat) ((NumberFormat) ((Format) format2.clone()))).setParseBigDecimal(true);
            } else {
                ((DecimalFormat) ((NumberFormat) ((Format) format2.clone()))).setParseBigDecimal(false);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo1)) {
            return false;
        }
        wo1 wo1Var = (wo1) obj;
        MathContext mathContext = wo1Var.k;
        MathContext mathContext2 = this.k;
        if (mathContext2 == null) {
            if (mathContext != null) {
                return false;
            }
        } else if (!mathContext2.equals(mathContext)) {
            return false;
        }
        return this.o == wo1Var.o;
    }

    public final int hashCode() {
        MathContext mathContext = this.k;
        return ((mathContext == null ? 0 : mathContext.hashCode()) * 31) + this.o;
    }

    public final BigDecimal s(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        if (bigDecimal.compareTo(bigDecimal2) == 0) {
            return bigDecimal;
        }
        if (v(bigDecimal).compareTo(v(bigDecimal2)) != 0) {
            return null;
        }
        mm mmVar = om.U;
        BigDecimal bigDecimalAdd = bigDecimal.add(bigDecimal2);
        BigDecimal bigDecimal3 = om.c;
        mmVar.getClass();
        return bigDecimalAdd.divide(bigDecimal3, lg1.b);
    }

    public final String toString() {
        String simpleName = wo1.class.getSimpleName();
        String string = this.k.getRoundingMode().toString();
        StringBuilder sb = new StringBuilder(simpleName);
        sb.append(" ");
        sb.append(this.l);
        sb.append(":");
        sb.append(this.o);
        return wi0.i(sb, " ", string);
    }

    public final double u(double d) {
        if (this.l > 0) {
            return v(BigDecimal.valueOf(d)).doubleValue();
        }
        if (this.o <= Integer.MIN_VALUE) {
            return d;
        }
        e32 e32Var = h32.F;
        double d2 = this.n;
        e32Var.getClass();
        return Math.rint(d * d2) / d2;
    }

    public final BigDecimal v(BigDecimal bigDecimal) {
        int i = this.l;
        MathContext mathContext = this.k;
        if (i > 0) {
            bigDecimal = bigDecimal.plus(mathContext);
        }
        int i2 = this.o;
        return (i2 <= Integer.MIN_VALUE || bigDecimal.scale() <= i2) ? bigDecimal : bigDecimal.setScale(i2, mathContext.getRoundingMode());
    }

    public final double w() {
        return Math.max(this.m, this.j);
    }

    public final double x(double d) {
        return Math.max(Math.abs(d) * this.m, this.j);
    }

    public final boolean y(double d, double d2) {
        if (d == d2) {
            return false;
        }
        return !B(Math.max(Math.abs(d), Math.abs(d2)), d2 - d);
    }

    public final boolean z(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        if (bigDecimal2.compareTo(bigDecimal) < 0) {
            if (bigDecimal.compareTo(bigDecimal2) == 0 ? false : !C(bigDecimal.abs().max(bigDecimal2.abs()), bigDecimal2.subtract(bigDecimal))) {
                return true;
            }
        }
        return false;
    }

    public wo1(NumberFormat numberFormat, int i, int i2, RoundingMode roundingMode) {
        this(numberFormat, new MathContext(i, roundingMode), i2);
    }
}
