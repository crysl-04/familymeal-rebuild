package defpackage;

import java.math.BigDecimal;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class u42 implements pg2, k1, e1 {
    public static final pm n = new pm(3);
    public static final u42 o;
    public static final u42 p;
    public static final u42 q;
    public static final u42 r;
    public static final u42 s;
    public static final double t;
    public final double h;
    public final double i;
    public final double j;
    public final boolean k;
    public final boolean l;
    public final double m;

    static {
        u42 u42Var;
        double d = h32.b;
        double d2 = h32.a;
        o = new u42(d, d2, d2);
        u42 u42Var2 = new u42(d, d, d);
        double dA1 = u42Var2.a1();
        boolean zK2 = u42Var2.k2();
        double d3 = u42Var2.m;
        if (zK2) {
            u42Var = new u42(d3 / dA1);
        } else {
            boolean zJ2 = u42Var2.j2();
            double d4 = u42Var2.j;
            double d5 = u42Var2.i;
            double d6 = u42Var2.h;
            u42Var = zJ2 ? new u42(d6 / dA1, d5 / dA1, d4 / dA1) : new u42(d3 / dA1, d6 / dA1, d5 / dA1, d4 / dA1);
        }
        p = u42Var;
        l52 l52Var = (l52) l52.q.b(3L, 1L);
        double[] dArr = l52Var.j;
        dArr[0] = u42Var.h;
        dArr[1] = u42Var.i;
        dArr[2] = u42Var.j;
        q = l2(Double.POSITIVE_INFINITY, l52Var.u0(), d2);
        new u42(d2, d, d2);
        new u42(d2, d2, d);
        new u42(h32.e);
        r = new u42(d);
        new u42(h32.c);
        s = new u42();
        t = i32.l.w() * h32.k;
    }

    public u42(double d) {
        this.m = d;
        this.l = true;
        this.k = false;
        double d2 = h32.a;
        this.h = d2;
        this.i = d2;
        this.j = d2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    public static u42 l2(double d, double[] dArr, double d2) {
        double d3;
        double d4;
        double d5;
        double d6;
        double d7 = h32.m;
        double d8 = d2 % d7;
        double d9 = h32.a;
        if (d8 < d9) {
            d8 += d7;
        }
        double d10 = t;
        if (d8 <= d10) {
            return new u42(d);
        }
        e32 e32Var = h32.q;
        double d11 = d8 - h32.k;
        e32Var.getClass();
        if (Math.abs(d11) <= d10) {
            return new u42(-d);
        }
        if (d != d9) {
            h32.u.getClass();
            double dCos = Math.cos(d8);
            if (dCos != d9) {
                d3 = dCos * d;
            } else {
                d3 = d9;
            }
        } else {
            d3 = d9;
        }
        if (d != d9) {
            h32.G.getClass();
            double dSin = Math.sin(d8);
            if (dSin != d9) {
                double d12 = dArr[0] * d * dSin;
                double d13 = dArr[1] * d * dSin;
                d6 = dArr[2] * d * dSin;
                d5 = d13;
                d4 = d12;
            } else {
                d4 = d9;
                d5 = d4;
                d6 = d5;
            }
        } else {
            d4 = d9;
            d5 = d4;
            d6 = d5;
        }
        return new u42(d3, d4, d5, d6);
    }

    public static u42 r2(Comparable comparable) {
        if (comparable == null) {
            return s;
        }
        if (comparable instanceof u42) {
            return (u42) comparable;
        }
        if (!(comparable instanceof uw)) {
            return new u42(xo1.c1(comparable));
        }
        uw uwVar = (uw) comparable;
        double d = uwVar.i;
        double d2 = uwVar.h;
        double d3 = h32.a;
        return new u42(d, d2, d3, d3);
    }

    @Override // defpackage.k1, defpackage.a1
    public final double A(int i) {
        double d = this.j;
        double d2 = this.i;
        double d3 = this.h;
        double d4 = this.m;
        switch (i) {
            case 0:
                return d4;
            case 1:
                return d3;
            case 2:
                return d2;
            case 3:
                return d;
            case 4:
            case 14:
                return -d3;
            case 5:
                return d4;
            case 6:
                return d;
            case 7:
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                return -d2;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
            case 12:
                return -d;
            case 10:
                return d4;
            case 11:
                return d3;
            case 13:
                return d2;
            case 15:
                return d4;
            default:
                throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override // defpackage.xo1
    public final double A0() {
        return this.m;
    }

    @Override // defpackage.no2
    public final long B1() {
        return 4L;
    }

    @Override // defpackage.vc2
    public final BigDecimal F1() {
        return new BigDecimal(this.m, i32.l.k);
    }

    @Override // defpackage.k1, defpackage.a1
    public final Comparable G(long j) {
        return Double.valueOf(z(j));
    }

    @Override // defpackage.k1
    public final Comparable H(long j, long j2) {
        return Double.valueOf(y1(j, j2));
    }

    @Override // defpackage.k1
    public final double J(int i, int i2) {
        return i == i2 ? this.m : A(i + (i2 << 2));
    }

    @Override // defpackage.vo1
    public final Object M0(wo1 wo1Var) {
        return new u42(wo1Var.u(this.m), wo1Var.u(this.h), wo1Var.u(this.i), wo1Var.u(this.j));
    }

    @Override // defpackage.no2
    public final int T() {
        return 4;
    }

    @Override // defpackage.xo1
    public final int U0() {
        return (int) this.m;
    }

    @Override // defpackage.no2
    public final int Z1() {
        return 4;
    }

    @Override // defpackage.e1
    public final void a(dk1 dk1Var) {
        double d = this.m;
        dk1Var.y(0L, d);
        double d2 = this.h;
        dk1Var.y(1L, d2);
        double d3 = this.i;
        dk1Var.y(2L, d3);
        double d4 = this.j;
        dk1Var.y(3L, d4);
        double d5 = -d2;
        dk1Var.y(4L, d5);
        dk1Var.y(5L, d);
        dk1Var.y(6L, d4);
        double d6 = -d3;
        dk1Var.y(7L, d6);
        dk1Var.y(8L, d6);
        double d7 = -d4;
        dk1Var.y(9L, d7);
        dk1Var.y(10L, d);
        dk1Var.y(11L, d2);
        dk1Var.y(12L, d7);
        dk1Var.y(13L, d3);
        dk1Var.y(14L, d5);
        dk1Var.y(15L, d);
    }

    @Override // defpackage.xo1
    public final long a0() {
        return (long) this.m;
    }

    @Override // defpackage.ko1
    public final double a1() {
        e32 e32Var = h32.H;
        double d = this.m;
        double d2 = this.h;
        double d3 = this.i;
        double d4 = (d3 * d3) + (d2 * d2);
        double d5 = this.j;
        double d6 = (d5 * d5) + d4;
        e32Var.getClass();
        return Math.sqrt(d6 + (d * d));
    }

    public final u42 b2(double d) {
        boolean zK2 = k2();
        double d2 = this.m;
        if (zK2) {
            return new u42(d2 + d);
        }
        return new u42(d2 + d, this.h, this.i, this.j);
    }

    @Override // defpackage.xc2
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public final u42 i0(u42 u42Var) {
        boolean zK2 = k2();
        double d = this.m;
        return zK2 ? u42Var.b2(d) : new u42(d + u42Var.m, this.h + u42Var.h, this.i + u42Var.i, this.j + u42Var.j);
    }

    @Override // defpackage.no2, defpackage.mo2
    public final long count() {
        return 16L;
    }

    @Override // defpackage.xo1
    public final float d0() {
        return (float) this.m;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public final int compareTo(u42 u42Var) {
        int iCompare = Double.compare(this.m, u42Var.m);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Double.compare(this.h, u42Var.h);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Double.compare(this.i, u42Var.i);
        return iCompare3 != 0 ? iCompare3 : Double.compare(this.j, u42Var.j);
    }

    @Override // defpackage.vc2
    /* JADX INFO: renamed from: e2, reason: merged with bridge method [inline-methods] */
    public final u42 T0() {
        return new u42(this.m, -this.h, -this.i, -this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u42)) {
            return false;
        }
        u42 u42Var = (u42) obj;
        return Double.doubleToLongBits(this.m) == Double.doubleToLongBits(u42Var.m) && Double.doubleToLongBits(this.h) == Double.doubleToLongBits(u42Var.h) && Double.doubleToLongBits(this.i) == Double.doubleToLongBits(u42Var.i) && Double.doubleToLongBits(this.j) == Double.doubleToLongBits(u42Var.j);
    }

    @Override // defpackage.yc2
    public final Object f1(Comparable comparable) {
        return i(((u42) comparable).X1());
    }

    @Override // defpackage.yc2
    /* JADX INFO: renamed from: f2, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final u42 u1(double d) {
        boolean zK2 = k2();
        double d2 = this.m;
        if (zK2) {
            return new u42(d2 / d);
        }
        boolean zJ2 = j2();
        double d3 = this.j;
        double d4 = this.i;
        double d5 = this.h;
        return zJ2 ? new u42(d5 / d, d4 / d, d3 / d) : new u42(d2 / d, d5 / d, d4 / d, d3 / d);
    }

    @Override // defpackage.no2
    public final long h1() {
        return 4L;
    }

    public final double h2() {
        e32 e32Var = h32.H;
        double d = this.h;
        double d2 = this.i;
        double d3 = (d2 * d2) + (d * d);
        double d4 = this.j;
        e32Var.getClass();
        return Math.sqrt((d4 * d4) + d3);
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.h);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.i);
        int i = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.j);
        int i2 = (i * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.m);
        return (i2 * 31) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)));
    }

    @Override // defpackage.vc2
    /* JADX INFO: renamed from: i2, reason: merged with bridge method [inline-methods] */
    public final u42 X1() {
        u42 u42VarT0 = T0();
        double d = this.m;
        double d2 = this.h;
        double d3 = this.i;
        double d4 = (d3 * d3) + (d2 * d2);
        double d5 = this.j;
        return u42VarT0.u1((d5 * d5) + d4 + (d * d));
    }

    public final boolean j2() {
        return this.k || i32.l.B(a1(), this.m);
    }

    public final boolean k2() {
        wo1 wo1Var = i32.l;
        if (this.l) {
            return true;
        }
        double d = this.h;
        double d2 = this.m;
        return wo1Var.B(d2, d) && wo1Var.B(d2, this.i) && wo1Var.B(d2, this.j);
    }

    @Override // defpackage.ko1
    /* JADX INFO: renamed from: m2, reason: merged with bridge method [inline-methods] */
    public final u42 h(double d) {
        boolean zK2 = k2();
        double d2 = this.m;
        if (zK2) {
            return new u42(d2 * d);
        }
        boolean zJ2 = j2();
        double d3 = this.j;
        double d4 = this.i;
        double d5 = this.h;
        return zJ2 ? new u42(d5 * d, d4 * d, d3 * d) : new u42(d2 * d, d5 * d, d4 * d, d3 * d);
    }

    @Override // defpackage.ko1
    /* JADX INFO: renamed from: n2, reason: merged with bridge method [inline-methods] */
    public final u42 i(u42 u42Var) {
        boolean zK2 = k2();
        double d = this.m;
        if (zK2) {
            return u42Var.h(d);
        }
        double d2 = u42Var.m;
        double d3 = u42Var.h;
        double d4 = this.h;
        double d5 = (d * d2) - (d4 * d3);
        double d6 = u42Var.i;
        double d7 = this.i;
        double d8 = u42Var.j;
        double d9 = this.j;
        return new u42((d5 - (d7 * d6)) - (d9 * d8), ((d7 * d8) + ((d4 * d2) + (d * d3))) - (d9 * d6), (d9 * d3) + (d7 * d2) + ((d * d6) - (d4 * d8)), (d9 * d2) + (((d4 * d6) + (d * d8)) - (d7 * d3)));
    }

    public final u42 o2() {
        return new u42(-this.m, -this.h, -this.i, -this.j);
    }

    @Override // defpackage.zc2
    /* JADX INFO: renamed from: p2, reason: merged with bridge method [inline-methods] */
    public final u42 R(u42 u42Var) {
        return new u42(this.m - u42Var.m, this.h - u42Var.h, this.i - u42Var.i, this.j - u42Var.j);
    }

    public final double[] q2() {
        double dH2 = h2();
        if (dH2 > 0.0d) {
            return new double[]{this.h / dH2, this.i / dH2, this.j / dH2};
        }
        u42 u42Var = p;
        return new double[]{u42Var.h, u42Var.i, u42Var.j};
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(Double.toString(this.m));
        double d = h32.a;
        double d2 = this.h;
        if (d2 < d) {
            sb.append(" - ");
        } else {
            sb.append(" + ");
        }
        e32 e32Var = h32.q;
        e32Var.getClass();
        sb.append(Double.toString(Math.abs(d2)));
        sb.append("i");
        double d3 = this.i;
        if (d3 < d) {
            sb.append(" - ");
        } else {
            sb.append(" + ");
        }
        e32Var.getClass();
        sb.append(Double.toString(Math.abs(d3)));
        sb.append("j");
        double d4 = this.j;
        if (d4 < d) {
            sb.append(" - ");
        } else {
            sb.append(" + ");
        }
        e32Var.getClass();
        sb.append(Double.toString(Math.abs(d4)));
        sb.append("k)");
        return sb.toString();
    }

    public u42() {
        double d = h32.a;
        this.m = d;
        this.l = true;
        this.k = true;
        this.h = d;
        this.i = d;
        this.j = d;
    }

    public u42(double d, double d2, double d3) {
        this.m = h32.a;
        this.l = false;
        this.k = true;
        this.h = d;
        this.i = d2;
        this.j = d3;
    }

    public u42(double d, double d2, double d3, double d4) {
        this.m = d;
        this.l = false;
        this.k = false;
        this.h = d2;
        this.i = d3;
        this.j = d4;
    }

    @Override // defpackage.l1
    public final Object get() {
        return this;
    }
}
