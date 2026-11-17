package defpackage;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.ToLongFunction;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class un1 implements Comparable {
    public static final Comparator s;
    public static final Comparator t;
    public static final Comparator u;
    public static final Comparator v;
    public static final BigDecimal w;
    public static final BigDecimal x;
    public static final AtomicLong y;
    public final int h;
    public final double i;
    public final int j;
    public final double k;
    public final long l;
    public final long m;
    public final tn1 n;
    public final int[] o;
    public final boolean p;
    public final int[] q;
    public final boolean r;

    static {
        final byte b = 1;
        s = Comparator.comparingInt(new qn1((byte) 0)).thenComparingLong(new ToLongFunction() { // from class: rn1
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                long j;
                un1 un1Var = (un1) obj;
                switch (b) {
                    case 0:
                        j = un1Var.m;
                        break;
                    case 1:
                        return un1Var.m;
                    case 2:
                        j = un1Var.m;
                        break;
                    default:
                        return un1Var.m;
                }
                return -j;
            }
        });
        final byte b2 = 2;
        t = Comparator.comparingInt(new qn1((byte) 3)).thenComparingLong(new ToLongFunction() { // from class: rn1
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                long j;
                un1 un1Var = (un1) obj;
                switch (b2) {
                    case 0:
                        j = un1Var.m;
                        break;
                    case 1:
                        return un1Var.m;
                    case 2:
                        j = un1Var.m;
                        break;
                    default:
                        return un1Var.m;
                }
                return -j;
            }
        });
        final byte b3 = 3;
        Comparator.comparingLong(new ToLongFunction() { // from class: rn1
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                long j;
                un1 un1Var = (un1) obj;
                switch (b3) {
                    case 0:
                        j = un1Var.m;
                        break;
                    case 1:
                        return un1Var.m;
                    case 2:
                        j = un1Var.m;
                        break;
                    default:
                        return un1Var.m;
                }
                return -j;
            }
        });
        Comparator.comparingDouble(new sn1((byte) 5));
        final byte b4 = 0;
        Comparator.comparingLong(new ToLongFunction() { // from class: rn1
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                long j;
                un1 un1Var = (un1) obj;
                switch (b4) {
                    case 0:
                        j = un1Var.m;
                        break;
                    case 1:
                        return un1Var.m;
                    case 2:
                        j = un1Var.m;
                        break;
                    default:
                        return un1Var.m;
                }
                return -j;
            }
        });
        u = Comparator.comparingDouble(new sn1((byte) 0)).thenComparingInt(new qn1((byte) 1)).thenComparingDouble(new sn1((byte) 1));
        v = Comparator.comparingDouble(new sn1((byte) 2)).thenComparingInt(new qn1((byte) 2)).thenComparingDouble(new sn1((byte) 3));
        Comparator.comparingDouble(new sn1((byte) 4));
        wo1.H(8, 6);
        w = BigDecimal.valueOf(2147483647L);
        x = BigDecimal.valueOf(-2147483648L);
        y = new AtomicLong();
    }

    public un1(ii0 ii0Var) {
        this.m = 0L;
        List listH = ii0Var.h();
        int size = listH.size();
        tn1 tn1Var = new tn1(size);
        this.n = tn1Var;
        this.o = (int[]) tn1Var.c();
        this.q = (int[]) tn1Var.c();
        for (int i = 0; i < size; i++) {
            e33 e33Var = (e33) listH.get(i);
            int[] iArr = this.o;
            BigDecimal bigDecimal = e33Var.j;
            BigDecimal bigDecimal2 = w;
            BigDecimal bigDecimal3 = x;
            iArr[i] = (bigDecimal == null || bigDecimal.compareTo(bigDecimal3) <= 0 || bigDecimal.compareTo(bigDecimal2) > 0) ? Integer.MIN_VALUE : bigDecimal.intValue();
            int[] iArr2 = this.q;
            BigDecimal bigDecimal4 = e33Var.l;
            iArr2[i] = (bigDecimal4 == null || bigDecimal4.compareTo(bigDecimal3) < 0 || bigDecimal4.compareTo(bigDecimal2) >= 0) ? Integer.MAX_VALUE : bigDecimal4.intValue();
        }
        this.l = this.m;
        this.h = 0;
        this.j = -1;
        this.i = Double.NaN;
        this.k = Double.NaN;
        this.p = false;
        this.r = false;
    }

    public static boolean i(double d) {
        return -2.147483648E9d < d && d < 2.147483647E9d;
    }

    public static void k(e33 e33Var, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        BigDecimal bigDecimal3 = e33Var.j;
        BigDecimal bigDecimal4 = e33Var.l;
        if (bigDecimal != null && (bigDecimal3 == null || bigDecimal.compareTo(bigDecimal3) > 0)) {
            e33Var.I(bigDecimal);
        }
        if (bigDecimal2 != null && (bigDecimal4 == null || bigDecimal2.compareTo(bigDecimal4) < 0)) {
            e33Var.L(bigDecimal2);
        }
        BigDecimal bigDecimalE = e33Var.E();
        if (bigDecimalE != null) {
            e33Var.K(bigDecimalE);
        }
    }

    public final int[] a() {
        int[] iArr = (int[]) this.n.c();
        int[] iArr2 = this.o;
        System.arraycopy(iArr2, 0, iArr, 0, Math.min(iArr2.length, iArr.length));
        return iArr;
    }

    public final int[] b() {
        int[] iArr = (int[]) this.n.c();
        int[] iArr2 = this.q;
        System.arraycopy(iArr2, 0, iArr, 0, Math.min(iArr2.length, iArr.length));
        return iArr;
    }

    public final un1 c(int i, double d, double d2) {
        int[] iArrA = a();
        int[] iArrB = b();
        int iFloor = (int) Math.floor(h(i, d));
        int i2 = iArrB[i];
        if (iFloor < i2 || iFloor <= iArrA[i]) {
            iArrB[i] = iFloor;
        } else {
            iArrB[i] = iFloor - 1;
        }
        return new un1(iArrA, iArrB, this.m, this.h, i, d - ((double) iFloor), d2, i2 > 0 && iArrB[i] <= 0 && iArrA[i] < 0, false, this.n);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.m, ((un1) obj).m);
    }

    public final un1 d(int i, double d, double d2) {
        int[] iArrA = a();
        int[] iArrB = b();
        int iCeil = (int) Math.ceil(h(i, d));
        int i2 = iArrA[i];
        if (iCeil > i2 || iCeil >= iArrB[i]) {
            iArrA[i] = iCeil;
        } else {
            iArrA[i] = iCeil + 1;
        }
        return new un1(iArrA, iArrB, this.m, this.h, i, ((double) iCeil) - d, d2, i2 < 0 && iArrA[i] >= 0 && iArrB[i] <= 0, true, this.n);
    }

    public final void e() {
        int[] iArr = this.o;
        Objects.requireNonNull(iArr);
        tn1 tn1Var = this.n;
        tn1Var.q(iArr);
        LinkedTransferQueue linkedTransferQueue = (LinkedTransferQueue) tn1Var.a;
        linkedTransferQueue.offer(iArr);
        int[] iArr2 = this.q;
        Objects.requireNonNull(iArr2);
        tn1Var.q(iArr2);
        linkedTransferQueue.offer(iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof un1) && this.m == ((un1) obj).m;
    }

    public final void f(do1 do1Var, int i, ng1 ng1Var) {
        e33 e33VarK = do1Var.c.k(ng1Var.b[i]);
        BigDecimal bigDecimal = e33VarK.j;
        BigDecimal bigDecimal2 = e33VarK.l;
        g(e33VarK, do1Var, i, (bigDecimal2 != null && bigDecimal2.signum() <= 0 && bigDecimal != null && bigDecimal.signum() < 0) != (this.q[i] <= 0 && this.o[i] < 0));
    }

    public final void g(e33 e33Var, do1 do1Var, int i, boolean z) {
        int i2 = this.o[i];
        BigDecimal bigDecimalValueOf = i2 != Integer.MIN_VALUE ? BigDecimal.valueOf(i2) : null;
        int i3 = this.q[i];
        k(e33Var, bigDecimalValueOf, i3 != Integer.MAX_VALUE ? BigDecimal.valueOf(i3) : null);
        if (z || !do1Var.m()) {
            do1Var.j();
            return;
        }
        HashMap map = do1Var.f;
        ii0 ii0Var = do1Var.c;
        ii0Var.getClass();
        map.remove(Integer.valueOf(e33Var.p.h));
        if (do1Var.a) {
            hs1 hs1Var = do1Var.e;
            if (hs1Var instanceof u23) {
                u23 u23Var = (u23) hs1Var;
                int iD = do1Var.h().d(ii0Var, e33Var);
                if (iD >= 0) {
                    if (e33Var.p()) {
                        if (u23Var.e(iD, e33Var.E().doubleValue())) {
                            return;
                        }
                    } else if (u23Var.c(iD, e33Var.k(false), e33Var.n(false, Double.POSITIVE_INFINITY))) {
                        return;
                    }
                    gs1 gs1Var = do1Var.d;
                    if (gs1Var != null && gs1Var.m.b()) {
                        do1Var.e = null;
                        return;
                    }
                }
                do1Var.a = false;
            }
        }
        do1Var.e = null;
    }

    public final double h(int i, double d) {
        return Math.min(Math.max(this.o[i], d), this.q[i]);
    }

    public final int hashCode() {
        long j = this.m;
        return 31 + ((int) (j ^ (j >>> 32)));
    }

    public final un1 l(int i, double d) {
        if (d <= this.o[i] || d > 2.147483647E9d) {
            return this;
        }
        int[] iArrA = a();
        int[] iArrB = b();
        iArrA[i] = (int) d;
        return new un1(this, iArrA, iArrB);
    }

    public final un1 m(int i, double d) {
        if (d >= this.q[i] || d < -2.147483648E9d) {
            return this;
        }
        int[] iArrA = a();
        int[] iArrB = b();
        iArrB[i] = (int) d;
        return new un1(this, iArrA, iArrB);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.m);
        sb.append(" (");
        sb.append(this.l);
        sb.append(") ");
        sb.append(this.j);
        sb.append('=');
        sb.append(this.i);
        sb.append(' ');
        sb.append(this.k);
        sb.append(" [");
        int[] iArr = this.o;
        if (iArr.length <= 100) {
            int length = iArr.length;
            int[] iArr2 = this.q;
            if (length > 0) {
                sb.append("0=");
                sb.append(iArr[0]);
                sb.append('<');
                sb.append(iArr2[0]);
            }
            for (int i = 1; i < iArr.length; i++) {
                sb.append(", ");
                sb.append(i);
                sb.append('=');
                sb.append(iArr[i]);
                sb.append('<');
                sb.append(iArr2[i]);
            }
        } else {
            sb.append("...");
        }
        sb.append(']');
        return sb.toString();
    }

    public un1(un1 un1Var, int[] iArr, int[] iArr2) {
        this.m = un1Var.m;
        this.o = iArr;
        this.q = iArr2;
        this.l = un1Var.l;
        this.h = un1Var.h;
        this.j = un1Var.j;
        this.i = un1Var.i;
        this.k = un1Var.k;
        this.p = un1Var.p;
        this.r = un1Var.r;
        this.n = un1Var.n;
    }

    public un1(int[] iArr, int[] iArr2, long j, int i, int i2, double d, double d2, boolean z, boolean z2, tn1 tn1Var) {
        this.m = y.incrementAndGet();
        this.o = iArr;
        this.q = iArr2;
        this.l = j;
        this.h = i + 1;
        this.j = i2;
        this.i = Math.max(d, 1.0E-9d);
        this.k = d2;
        this.p = z;
        this.r = z2;
        this.n = tn1Var;
    }
}
