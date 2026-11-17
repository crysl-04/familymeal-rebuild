package defpackage;

import java.math.BigDecimal;
import java.math.MathContext;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qm implements vc2, vo1 {
    public static final pm i = new pm(0);
    public static final qm j;
    public static final qm k;
    public static final wo1 l;
    public final BigDecimal h;

    static {
        BigDecimal bigDecimal = BigDecimal.ONE;
        bigDecimal.negate();
        j = new qm(bigDecimal);
        bigDecimal.add(bigDecimal);
        k = new qm(BigDecimal.ZERO);
        l = wo1.I(MathContext.DECIMAL128);
    }

    public qm(BigDecimal bigDecimal) {
        this.h = bigDecimal;
    }

    @Override // defpackage.xo1
    public final double A0() {
        return this.h.doubleValue();
    }

    @Override // defpackage.vc2
    public final BigDecimal F1() {
        return this.h;
    }

    @Override // defpackage.vo1
    public final Object M0(wo1 wo1Var) {
        return new qm(wo1Var.v(this.h));
    }

    @Override // defpackage.zc2
    public final Object R(Comparable comparable) {
        return new qm(this.h.subtract((BigDecimal) comparable));
    }

    @Override // defpackage.xo1
    public final int U0() {
        return this.h.intValueExact();
    }

    @Override // defpackage.vc2
    public final Object X1() {
        return j.f1(this.h);
    }

    @Override // defpackage.xo1
    public final long a0() {
        return this.h.longValueExact();
    }

    @Override // defpackage.ko1
    public final double a1() {
        return this.h.abs().doubleValue();
    }

    @Override // defpackage.yc2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final qm f1(BigDecimal bigDecimal) {
        om.U.getClass();
        return new qm(this.h.divide(bigDecimal, lg1.b));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.h.compareTo((BigDecimal) obj);
    }

    @Override // defpackage.xo1
    public final float d0() {
        return this.h.floatValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm)) {
            return false;
        }
        BigDecimal bigDecimal = ((qm) obj).h;
        BigDecimal bigDecimal2 = this.h;
        if (bigDecimal2 == null) {
            if (bigDecimal != null) {
                return false;
            }
        } else if (!bigDecimal2.equals(bigDecimal)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.l1
    public final Object get() {
        return this.h;
    }

    @Override // defpackage.ko1
    public final Object h(double d) {
        return new qm(this.h.multiply(new BigDecimal(d)));
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.h;
        return 31 + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }

    @Override // defpackage.ko1
    public final Object i(Comparable comparable) {
        return new qm(this.h.multiply((BigDecimal) comparable));
    }

    @Override // defpackage.xc2
    public final Object i0(Comparable comparable) {
        return new qm(this.h.add((BigDecimal) comparable));
    }

    public final String toString() {
        return this.h.toString();
    }

    @Override // defpackage.yc2
    /* JADX INFO: renamed from: u1 */
    public final Object g2(double d) {
        return f1(new BigDecimal(d));
    }

    @Override // defpackage.vc2
    public final vc2 T0() {
        return this;
    }
}
