package defpackage;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class mg1 implements Comparable {
    public static final BigDecimal m = new BigDecimal("1.7976931348623157E308", new MathContext(8, RoundingMode.DOWN));
    public static final BigDecimal n = new BigDecimal("2.2250738585072014E-308", new MathContext(8, RoundingMode.UP));
    public static final wo1 o = wo1.G(6);
    public transient int h;
    public BigDecimal i;
    public BigDecimal j;
    public final String k;
    public BigDecimal l;

    public mg1(mg1 mg1Var) {
        this.h = Integer.MIN_VALUE;
        this.i = null;
        this.j = null;
        this.l = null;
        this.k = mg1Var.k;
        this.i = mg1Var.i;
        this.j = mg1Var.j;
        this.l = mg1Var.l;
        this.h = mg1Var.h;
    }

    public static BigDecimal A(Comparable comparable) {
        if (comparable == null) {
            return null;
        }
        if (comparable instanceof BigDecimal) {
            return (BigDecimal) comparable;
        }
        BigDecimal bigDecimalC = pz1.C(comparable);
        BigDecimal bigDecimalAbs = bigDecimalC.abs();
        if (bigDecimalAbs.compareTo(m) >= 0) {
            return null;
        }
        return bigDecimalAbs.compareTo(n) <= 0 ? om.a : bigDecimalC;
    }

    public static int f(im imVar, im imVar2) {
        double dA0 = imVar.A0();
        double dLog10 = h32.a;
        if (Math.abs(dA0) >= Double.MIN_NORMAL) {
            dLog10 = Math.log10(dA0);
        }
        double dA1 = imVar2.A0();
        return Math.toIntExact(Math.round((Math.max(Math.abs(dA1) < Double.MIN_NORMAL ? -8.0d : Math.log10(dA1), dLog10 - 8.0d) + dLog10) / (-h32.c)));
    }

    public static BigDecimal z(double d) {
        if (Double.isFinite(d)) {
            return BigDecimal.valueOf(d);
        }
        return null;
    }

    public mg1 B(BigDecimal bigDecimal) {
        this.l = A(bigDecimal);
        return this;
    }

    public boolean C(BigDecimal bigDecimal, wo1 wo1Var, cl clVar) {
        boolean z;
        BigDecimal bigDecimal2 = this.j;
        if (bigDecimal2 != null && bigDecimal.subtract(bigDecimal2).signum() == -1 && wo1Var.y(bigDecimal2.doubleValue(), bigDecimal.doubleValue())) {
            if (clVar != null && clVar != cl.c) {
                clVar.println(String.valueOf(bigDecimal) + " ! " + toString());
            }
            z = false;
        } else {
            z = true;
        }
        BigDecimal bigDecimal3 = this.l;
        if (bigDecimal3 == null || bigDecimal.subtract(bigDecimal3).signum() != 1 || !wo1Var.y(bigDecimal3.doubleValue(), bigDecimal.doubleValue())) {
            return z;
        }
        if (clVar != null && clVar != cl.c) {
            clVar.println(String.valueOf(bigDecimal) + " ! " + toString());
        }
        return false;
    }

    public final void D(BigDecimal bigDecimal) {
        BigDecimal bigDecimalA = A(bigDecimal);
        this.i = bigDecimalA;
        if (bigDecimalA == null || bigDecimalA.signum() != 0) {
            return;
        }
        this.i = null;
    }

    public abstract void a(zh0 zh0Var, BigDecimal bigDecimal);

    public final void b(StringBuilder sb, wo1 wo1Var) {
        if (r() || p()) {
            sb.append(wo1Var.v(this.j).toPlainString());
            sb.append(" <= ");
        }
    }

    public void c(StringBuilder sb, wo1 wo1Var) {
        sb.append(this.k);
        if (t()) {
            sb.append(" (");
            sb.append(wo1Var.v(this.i).toPlainString());
            sb.append(")");
        }
    }

    public final void d(StringBuilder sb, wo1 wo1Var) {
        if (u() || p()) {
            sb.append(" <= ");
            sb.append(wo1Var.v(this.l).toPlainString());
        }
    }

    public abstract int e();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg1)) {
            return false;
        }
        mg1 mg1Var = (mg1) obj;
        return Objects.equals(this.i, mg1Var.i) && Objects.equals(this.j, mg1Var.j) && this.k.equals(mg1Var.k) && Objects.equals(this.l, mg1Var.l);
    }

    public final int g() {
        int i = this.h;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        int iE = e();
        this.h = iE;
        return iE;
    }

    public final double h() {
        return BigDecimal.ONE.scaleByPowerOfTen(g()).doubleValue();
    }

    public int hashCode() {
        return Objects.hash(this.i, this.j, this.k, this.l);
    }

    public final BigDecimal i(boolean z) {
        if (!z || this.j == null) {
            return this.j;
        }
        int iG = g();
        BigDecimal bigDecimal = this.j;
        return iG != 0 ? bigDecimal.scaleByPowerOfTen(iG) : bigDecimal;
    }

    public final double k(boolean z) {
        BigDecimal bigDecimalI = i(z);
        if (bigDecimalI != null) {
            return bigDecimalI.doubleValue();
        }
        return Double.NEGATIVE_INFINITY;
    }

    public final BigDecimal m(boolean z) {
        if (!z || this.l == null) {
            return this.l;
        }
        int iG = g();
        BigDecimal bigDecimal = this.l;
        return iG != 0 ? bigDecimal.scaleByPowerOfTen(iG) : bigDecimal;
    }

    public final double n(boolean z, double d) {
        BigDecimal bigDecimalM = m(z);
        return bigDecimalM != null ? bigDecimalM.doubleValue() : d;
    }

    public final boolean o() {
        return (this.j == null && this.l == null) ? false : true;
    }

    public final boolean p() {
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2 = this.j;
        return (bigDecimal2 == null || (bigDecimal = this.l) == null || bigDecimal2.compareTo(bigDecimal) != 0) ? false : true;
    }

    public abstract boolean q();

    public final boolean r() {
        return (this.j == null || p()) ? false : true;
    }

    public final boolean s() {
        return this.j != null;
    }

    public final boolean t() {
        BigDecimal bigDecimal = this.i;
        return (bigDecimal == null || bigDecimal.signum() == 0) ? false : true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        wo1 wo1Var = o;
        b(sb, wo1Var);
        c(sb, wo1Var);
        d(sb, wo1Var);
        return sb.toString();
    }

    public final boolean u() {
        return (this.l == null || p()) ? false : true;
    }

    public final boolean v() {
        return this.l != null;
    }

    public final mg1 w(long j) {
        return x(BigDecimal.valueOf(j));
    }

    public mg1 x(BigDecimal bigDecimal) {
        this.j = A(bigDecimal);
        return this;
    }

    public final void y(BigDecimal bigDecimal) {
        if (s()) {
            x(this.j.add(bigDecimal));
        }
        if (v()) {
            B(this.l.add(bigDecimal));
        }
    }

    public mg1(String str) {
        this.h = Integer.MIN_VALUE;
        this.i = null;
        this.j = null;
        this.l = null;
        this.k = str;
    }

    public mg1 l() {
        return this;
    }
}
