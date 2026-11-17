package defpackage;

import java.math.BigDecimal;
import java.math.MathContext;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class i32 implements vc2, vo1 {
    public static final pm i = new pm(2);
    public static final i32 j;
    public static final i32 k;
    public static final wo1 l;
    public final double h;

    static {
        double d = h32.e;
        j = new i32(h32.b);
        k = new i32(h32.a);
        l = wo1.I(MathContext.DECIMAL64);
    }

    public i32(double d) {
        this.h = d;
    }

    @Override // defpackage.xo1
    public final double A0() {
        return this.h;
    }

    @Override // defpackage.vc2
    public final BigDecimal F1() {
        return new BigDecimal(this.h, l.k);
    }

    @Override // defpackage.vo1
    public final Object M0(wo1 wo1Var) {
        return new i32(wo1Var.u(this.h));
    }

    @Override // defpackage.zc2
    public final Object R(Comparable comparable) {
        return new i32(this.h - ((Double) comparable).doubleValue());
    }

    @Override // defpackage.xo1
    public final int U0() {
        return (int) this.h;
    }

    @Override // defpackage.vc2
    public final Object X1() {
        return new i32(h32.b / this.h);
    }

    @Override // defpackage.xo1
    public final long a0() {
        return (long) this.h;
    }

    @Override // defpackage.ko1
    public final double a1() {
        h32.q.getClass();
        return Math.abs(this.h);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return wo1.t(this.h, ((Double) obj).doubleValue());
    }

    @Override // defpackage.xo1
    public final float d0() {
        return (float) this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i32) && Double.doubleToLongBits(this.h) == Double.doubleToLongBits(((i32) obj).h);
    }

    @Override // defpackage.yc2
    public final Object f1(Comparable comparable) {
        return new i32(this.h / ((Double) comparable).doubleValue());
    }

    @Override // defpackage.l1
    public final Object get() {
        return Double.valueOf(this.h);
    }

    @Override // defpackage.ko1
    public final Object h(double d) {
        return new i32(this.h * d);
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.h);
        return 31 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    @Override // defpackage.ko1
    public final Object i(Comparable comparable) {
        return new i32(((Double) comparable).doubleValue() * this.h);
    }

    @Override // defpackage.xc2
    public final Object i0(Comparable comparable) {
        return new i32(((Double) comparable).doubleValue() + this.h);
    }

    public final String toString() {
        return Double.toString(this.h);
    }

    @Override // defpackage.yc2
    public final Object u1(double d) {
        return new i32(this.h / d);
    }

    @Override // defpackage.vc2
    public final vc2 T0() {
        return this;
    }
}
