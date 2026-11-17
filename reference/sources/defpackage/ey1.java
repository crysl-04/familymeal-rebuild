package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ey1 extends da1 {
    public static final wo1 B = wo1.G(7);
    public static final wo1 C = wo1.G(10);
    public static final wo1 D = wo1.G(6);
    public static final wo1 E = wo1.J(9);
    public static final wo1 F = wo1.J(10);
    public static final wo1 G = wo1.G(9);
    public final lj2 A;
    public int j;
    public double k;
    public int l;
    public double m;
    public int n;
    public boolean o;
    public jj2 p;
    public int q;
    public long r;
    public boolean s;
    public boolean[] t;
    public int[] u;
    public double[] v;
    public double[] w;
    public kj2[] x;
    public double[] y;
    public final long[] z;

    public ey1(ds1 ds1Var, lj2 lj2Var) {
        super(ds1Var);
        this.j = 0;
        double d = h32.a;
        this.k = d;
        this.l = -1;
        this.m = d;
        this.n = 0;
        this.o = false;
        this.p = null;
        this.q = 0;
        this.r = 0L;
        this.s = false;
        this.z = new long[32];
        this.A = lj2Var;
    }

    public static double x(int i, double d) {
        long j = (((long) i) + 1) * (-7046029254386353131L);
        long j2 = (j ^ (j >>> 31)) * (-4658895280553007687L);
        long j3 = j2 ^ (j2 >>> 29);
        double d2 = h32.b;
        return (Math.abs(d) + d2) * 5.0E-7d * (((j3 >>> 11) * 1.1102230246251565E-16d) + d2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a1 A[PHI: r3 r23 r25
  0x00a1: PHI (r3v10 int) = (r3v9 int), (r3v21 int) binds: [B:25:0x009f, B:18:0x0089] A[DONT_GENERATE, DONT_INLINE]
  0x00a1: PHI (r23v4 double) = (r23v3 double), (r23v8 double) binds: [B:25:0x009f, B:18:0x0089] A[DONT_GENERATE, DONT_INLINE]
  0x00a1: PHI (r25v2 double) = (r25v1 double), (r25v4 double) binds: [B:25:0x009f, B:18:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b2 A[PHI: r3 r23 r25
  0x00b2: PHI (r3v12 int) = (r3v9 int), (r3v22 int) binds: [B:29:0x00b0, B:15:0x007a] A[DONT_GENERATE, DONT_INLINE]
  0x00b2: PHI (r23v5 double) = (r23v2 double), (r23v9 double) binds: [B:29:0x00b0, B:15:0x007a] A[DONT_GENERATE, DONT_INLINE]
  0x00b2: PHI (r25v3 double) = (r25v0 double), (r25v5 double) binds: [B:29:0x00b0, B:15:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x010a  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e3  */
    public final boolean A(jj2 jj2Var, boolean z) {
        wo1 wo1Var;
        wo1 wo1Var2;
        boolean z2;
        boolean z3;
        double d;
        wo1 wo1Var3;
        boolean z4;
        int i;
        double dZ1;
        double d2;
        double dZ2;
        double d3;
        boolean z5;
        k();
        lj2 lj2Var = this.A;
        boolean zK2 = lj2Var.k2();
        double[] dArr = lj2Var.j;
        double[] dArr2 = lj2Var.o;
        hj2 hj2Var = jj2Var.a;
        ij2 ij2Var = jj2Var.b;
        int i2 = hj2Var.b;
        double dC2 = lj2Var.c2(hj2Var.a());
        double d4 = G.j;
        int[] iArr = lj2Var.r;
        int[] iArrB2 = lj2Var.b2();
        int iD0 = lj2Var.D0();
        r(iArr.length);
        int i3 = iD0 - 1;
        double d5 = h32.a;
        int i4 = 0;
        while (i3 >= 0) {
            int i5 = iArrB2 != null ? iArrB2[i3] : i3;
            double dS1 = lj2Var.s1(i5, hj2Var);
            int i6 = i5;
            double dAbs = Math.abs(dS1);
            double dMax = Math.max(d5, dAbs);
            double d6 = h32.a;
            if (dS1 != d6) {
                if (i2 != 2) {
                    i = i6;
                    if (i2 != 1) {
                        throw new IllegalStateException();
                    }
                    if (dS1 < d6) {
                        dZ2 = lj2Var.z1(i);
                        d3 = dArr[iArr[i]];
                        if (dZ2 > d3) {
                            d6 = dZ2 - d3;
                        }
                        z5 = false;
                        double d7 = (d6 + d4) / dAbs;
                        double d8 = d6 / dAbs;
                        if (zK2) {
                            k();
                        }
                        this.u[i4] = i;
                        this.v[i4] = d7;
                        this.w[i4] = dAbs;
                        this.y[i4] = d8;
                        this.t[i4] = z5;
                        i4++;
                    } else {
                        dZ1 = lj2Var.z1(i);
                        d2 = dArr2[iArr[i]];
                        if (d2 > dZ1) {
                            d6 = d2 - dZ1;
                        }
                        z5 = true;
                        double d9 = (d6 + d4) / dAbs;
                        double d10 = d6 / dAbs;
                        if (zK2) {
                            k();
                        }
                        this.u[i4] = i;
                        this.v[i4] = d9;
                        this.w[i4] = dAbs;
                        this.y[i4] = d10;
                        this.t[i4] = z5;
                        i4++;
                    }
                } else if (dS1 < d6) {
                    i = i6;
                    dZ1 = lj2Var.z1(i);
                    d2 = dArr2[iArr[i]];
                    if (d2 > dZ1) {
                        d6 = d2 - dZ1;
                    }
                    z5 = true;
                    double d11 = (d6 + d4) / dAbs;
                    double d12 = d6 / dAbs;
                    if (zK2) {
                        k();
                    }
                    this.u[i4] = i;
                    this.v[i4] = d11;
                    this.w[i4] = dAbs;
                    this.y[i4] = d12;
                    this.t[i4] = z5;
                    i4++;
                } else {
                    i = i6;
                    dZ2 = lj2Var.z1(i);
                    d3 = dArr[iArr[i]];
                    if (dZ2 > d3) {
                        d6 = dZ2 - d3;
                    }
                    z5 = false;
                    double d13 = (d6 + d4) / dAbs;
                    double d14 = d6 / dAbs;
                    if (zK2) {
                        k();
                    }
                    this.u[i4] = i;
                    this.v[i4] = d13;
                    this.w[i4] = dAbs;
                    this.y[i4] = d14;
                    this.t[i4] = z5;
                    i4++;
                }
            }
            i3--;
            d5 = dMax;
        }
        int i7 = 0;
        double d15 = dC2;
        while (true) {
            wo1Var = F;
            wo1Var2 = D;
            if (i7 >= i4) {
                break;
            }
            double d16 = this.w[i7];
            double d17 = d15;
            if (wo1.D(d16, wo1Var2.j) || wo1Var.B(d5, d16)) {
                d15 = d17;
            } else {
                d15 = this.v[i7];
                if (d15 >= d17) {
                    d15 = d17;
                }
            }
            i7++;
        }
        double d18 = d15;
        double dW = this.a.b.w();
        boolean zIsFinite = Double.isFinite(d18);
        wo1 wo1Var4 = E;
        double d19 = Double.POSITIVE_INFINITY;
        if (!zIsFinite) {
            int i8 = 0;
            double dMin = Double.POSITIVE_INFINITY;
            while (i8 < i4) {
                int i9 = i8;
                ij2 ij2Var2 = ij2Var;
                double d20 = this.w[i9];
                double d21 = d4;
                if (wo1.D(d20, wo1Var2.j) && (d20 < 1.0E-11d || wo1Var.B(d5, d20) || wo1Var4.B(d5, d20))) {
                    double dQ1 = lj2Var.Q1(this.u[i9]);
                    if (!this.t[i9]) {
                        dQ1 = -dQ1;
                    }
                    if (dQ1 <= h32.a) {
                        dMin = Math.min(dMin, (dW / d20) + this.y[i9]);
                    }
                }
                i8 = i9 + 1;
                ij2Var = ij2Var2;
                d4 = d21;
            }
            d19 = dMin;
        }
        ij2 ij2Var3 = ij2Var;
        double d22 = d4;
        int i10 = 0;
        boolean z6 = false;
        int i11 = 0;
        double d23 = dC2;
        while (i10 < i4) {
            double d24 = this.v[i10];
            int i12 = i4;
            int i13 = i10;
            double d25 = this.w[i13];
            boolean zIsFinite2 = z6;
            double d26 = d23;
            boolean zD = wo1.D(d25, wo1Var2.j);
            boolean zB = wo1Var.B(d5, d25);
            if (zD) {
                if (zB || d25 < 1.0E-11d) {
                    d = d22;
                    wo1Var3 = wo1Var;
                } else {
                    z2 = zD;
                    z3 = zB;
                    double dQ2 = lj2Var.Q1(this.u[i13]);
                    if (!this.t[i13]) {
                        dQ2 = -dQ2;
                    }
                    double d27 = this.y[i13] - (dQ2 / d25);
                    d = d22;
                    wo1Var3 = wo1Var;
                    if (d27 < (-d) || wo1Var4.B(d5, d25)) {
                        z4 = false;
                    } else {
                        double d28 = this.y[i13];
                        if ((d18 - d28) * d25 <= dW || d28 > d19) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                    }
                    if (z4 || Math.abs(d27) <= d) {
                    }
                }
                i10 = i13 + 1;
                i4 = i12;
                wo1Var = wo1Var3;
                d22 = d;
                z6 = zIsFinite2;
                d23 = d26;
            } else {
                z2 = zD;
                z3 = zB;
                d = d22;
                wo1Var3 = wo1Var;
                z4 = false;
            }
            if (!z || (!(z2 || z3) || z4)) {
                if (d24 >= d26) {
                    d24 = d26;
                }
                int[] iArr2 = this.u;
                iArr2[i11] = iArr2[i13];
                double[] dArr3 = this.w;
                dArr3[i11] = dArr3[i13];
                double[] dArr4 = this.y;
                dArr4[i11] = dArr4[i13];
                boolean[] zArr = this.t;
                zArr[i11] = zArr[i13];
                i11++;
                d26 = d24;
            } else {
                zIsFinite2 = Double.isFinite(d24) | zIsFinite2;
            }
            i10 = i13 + 1;
            i4 = i12;
            wo1Var = wo1Var3;
            d22 = d;
            z6 = zIsFinite2;
            d23 = d26;
        }
        double d29 = d23;
        this.s = z6 && !Double.isFinite(d29);
        if (d29 >= dC2) {
            if (Double.isFinite(d29)) {
                k();
                ij2Var3.c = -1;
                ij2Var3.d = kj2.BASIS;
                ij2Var3.b = 3;
                if (jj2Var.a.b == 2) {
                    ij2Var3.b = 2;
                    ij2Var3.d = kj2.UPPER;
                } else {
                    ij2Var3.b = 1;
                    ij2Var3.d = kj2.LOWER;
                }
            }
            k();
            return jj2Var.b();
        }
        double d30 = -h32.b;
        for (int i14 = 0; i14 < i11; i14++) {
            double d31 = this.w[i14];
            if (this.y[i14] <= d29 && d31 > d30) {
                ij2Var3.c = this.u[i14];
                if (this.t[i14]) {
                    ij2Var3.b = 2;
                    ij2Var3.d = kj2.UPPER;
                } else {
                    ij2Var3.b = 1;
                    ij2Var3.d = kj2.LOWER;
                }
                k();
                d30 = d31;
            }
        }
        k();
        return ij2Var3.c >= 0 || jj2Var.b();
    }

    public final void B(jj2 jj2Var) {
        boolean zA = jj2Var.a();
        hj2 hj2Var = jj2Var.a;
        lj2 lj2Var = this.A;
        if (zA) {
            k();
            lj2Var.p2(jj2Var);
            lj2Var.R(jj2Var);
            return;
        }
        if (!jj2Var.b()) {
            k();
            return;
        }
        k();
        int iA = hj2Var.a();
        kj2 kj2Var = hj2Var.c;
        if (kj2Var == kj2.LOWER) {
            lj2Var.w2(iA);
        } else if (kj2Var == kj2.UPPER) {
            lj2Var.v2(iA);
        } else {
            if (kj2Var != kj2.UNBOUNDED) {
                throw new IllegalStateException();
            }
            this.e = is1.UNBOUNDED;
        }
    }

    public final boolean C() {
        ds1 ds1Var = this.a;
        double dW = ds1Var.b.w();
        lj2 lj2Var = this.A;
        int length = lj2Var.r.length;
        boolean z = true;
        for (int i = 0; i < length; i++) {
            int i2 = lj2Var.r[i];
            double dZ1 = lj2Var.z1(i);
            double d = lj2Var.j[i2];
            double d2 = lj2Var.o[i2];
            if (dZ1 < d - dW || dZ1 > d2 + dW) {
                ds1Var.getClass();
                z = false;
            }
        }
        return z;
    }

    public final boolean D(hj2 hj2Var, int i, double d, boolean z) {
        double d2;
        lj2 lj2Var = this.A;
        int[] iArr = lj2Var.q;
        boolean z2 = false;
        this.n = 0;
        double d3 = d;
        int i2 = 0;
        while (i2 < i) {
            double d4 = Double.POSITIVE_INFINITY;
            for (int i3 = i2; i3 < i; i3++) {
                double d5 = this.v[i3];
                if (d5 < d4) {
                    d4 = d5;
                }
            }
            double d6 = -h32.b;
            double d7 = h32.a;
            int i4 = -1;
            int[] iArr2 = iArr;
            boolean z3 = z2;
            int i5 = i2;
            int i6 = i5;
            while (true) {
                d2 = d3;
                if (i6 >= i) {
                    break;
                }
                if (this.y[i6] <= d4) {
                    z(i6, i5);
                    double d8 = this.w[i5];
                    double dC2 = (lj2Var.c2(iArr2[this.u[i5]]) * d8) + d7;
                    if (d8 > d6) {
                        i4 = i5;
                        d6 = d8;
                    }
                    i5++;
                    d7 = dC2;
                }
                i6++;
                d3 = d2;
            }
            if (i4 < 0) {
                return z3;
            }
            d3 = d2 - d7;
            if (d3 <= h32.a || (i5 >= i && z)) {
                this.n = i2;
                kj2 kj2Var = this.x[i4];
                hj2Var.d = this.u[i4];
                hj2Var.c = kj2Var;
                hj2Var.b = kj2Var == kj2.UPPER ? 1 : 2;
                k();
                return true;
            }
            if (i5 == i) {
                return z3;
            }
            i2 = i5;
            z2 = z3;
            iArr = iArr2;
        }
        return z2;
    }

    @Override // defpackage.u23
    public final boolean c(int i, double d, double d2) {
        if (this.e.b()) {
            return false;
        }
        this.A.E2(i, d, d2);
        this.f = null;
        this.g = null;
        if (this.e.h > 0) {
            lj2 lj2Var = this.A;
            if (lj2Var.h2(i)) {
                kj2 kj2VarC1 = lj2Var.c1(i);
                if (kj2VarC1 == kj2.LOWER) {
                    lj2Var.v2(i);
                } else if (kj2VarC1 == kj2.UPPER) {
                    lj2Var.w2(i);
                }
            }
        }
        if (!this.e.d()) {
            return true;
        }
        this.e = is1.APPROXIMATE;
        return true;
    }

    @Override // defpackage.u23
    public final Optional d() {
        lj2 lj2Var = this.A;
        return lj2Var.u.a.j() ? Optional.of(lj2Var.u) : Optional.empty();
    }

    @Override // defpackage.u23
    public final boolean e(int i, double d) {
        return c(i, d, d);
    }

    @Override // defpackage.u23
    public final Collection g(boolean[] zArr, cz0 cz0Var) {
        mh0 mh0VarA1;
        bl blVar;
        boolean[] zArr2 = zArr;
        wo1 wo1Var = this.a.k.d;
        double d = cz0Var.c;
        lj2 lj2Var = this.A;
        if (lj2Var.l > 0) {
            return Collections.EMPTY_LIST;
        }
        int length = zArr2.length;
        if (length != lj2Var.u.h() && (blVar = cl.a) != null) {
            blVar.println("generateCutCandidates: integer.length != structure.countVariables()");
        }
        double[] dArr = lj2Var.j;
        double[] dArr2 = lj2Var.o;
        boolean[] zArr3 = new boolean[length];
        int i = 0;
        while (true) {
            int[] iArr = lj2Var.q;
            if (i >= iArr.length) {
                break;
            }
            int i2 = iArr[i];
            if (i2 < length) {
                zArr3[i2] = lj2Var.c1(i2) == kj2.UPPER;
            }
            i++;
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < lj2Var.s) {
            int i4 = lj2Var.r[i3];
            if (i4 >= 0 && i4 < length && zArr2[i4]) {
                double dZ1 = lj2Var.z1(i3);
                wo1Var.getClass();
                if (!wo1Var.B(h32.b, Math.rint(dZ1) - dZ1) && (mh0VarA1 = lj2Var.a1(lj2Var.y2(i3), i4, dZ1, d, zArr2, dArr, dArr2, zArr3)) != null) {
                    arrayList.add(mh0VarA1);
                }
            }
            i3++;
            zArr2 = zArr;
        }
        return arrayList;
    }

    @Override // defpackage.nr0
    public final gs1 h(gs1 gs1Var) {
        int i = 0;
        while (true) {
            lj2 lj2Var = this.A;
            if (i >= lj2Var.t) {
                is1 is1Var = this.e;
                is1 is1Var2 = is1.APPROXIMATE;
                if (is1Var == is1Var2) {
                    w(y(false), false);
                } else {
                    jj2 jj2VarY = y(true);
                    p(jj2VarY, true);
                    lj2Var.t2();
                    q(jj2VarY);
                    if (this.e.d() && (!C() || v())) {
                        this.e = is1Var2;
                        w(jj2VarY, true);
                    }
                }
                return s();
            }
            if (lj2Var.j[i] > lj2Var.o[i]) {
                this.e = is1.INFEASIBLE;
                this.l = -1;
                return s();
            }
            i++;
        }
    }

    @Override // defpackage.da1
    public final double[] m() {
        lj2 lj2Var = this.A;
        int i = lj2Var.s;
        int i2 = lj2Var.s;
        double[] dArr = new double[i];
        if (this.e != is1.INFEASIBLE) {
            r22 r22VarZ2 = lj2Var.z2();
            for (int i3 = 0; i3 < i2; i3++) {
                dArr[i3] = r22VarZ2.A(i3);
            }
        } else {
            int i4 = this.l;
            if (i4 < 0) {
                Arrays.fill(dArr, Double.NaN);
                return dArr;
            }
            r22 r22VarA2 = lj2Var.A2(i4);
            for (int i5 = 0; i5 < i2; i5++) {
                dArr[i5] = r22VarA2.A(i5);
            }
            for (int i6 = 0; i6 < i; i6++) {
                dArr[i6] = dArr[i6] * this.m;
            }
        }
        for (int i7 = 0; i7 < i; i7++) {
            if (lj2Var.u.a.k.get(i7)) {
                dArr[i7] = -dArr[i7];
            }
        }
        return dArr;
    }

    @Override // defpackage.da1
    public final double[] n() {
        lj2 lj2Var = this.A;
        int i = lj2Var.t;
        double[] dArr = new double[i];
        if (this.e != is1.INFEASIBLE) {
            lj2Var.M0(dArr);
        } else {
            int i2 = this.l;
            if (i2 < 0) {
                Arrays.fill(dArr, Double.NaN);
                return dArr;
            }
            int[] iArr = lj2Var.r;
            r22 r22VarY2 = lj2Var.y2(i2);
            for (int i3 : iArr) {
                dArr[i3] = h32.a;
            }
            int i4 = 0;
            while (true) {
                int[] iArr2 = lj2Var.q;
                if (i4 >= iArr2.length) {
                    break;
                }
                int i5 = iArr2[i4];
                dArr[i5] = lj2Var.f2(i5) ? h32.a : r22VarY2.A(i5);
                i4++;
            }
            dArr[iArr[i2]] = h32.b;
            for (int i6 = 0; i6 < i; i6++) {
                dArr[i6] = dArr[i6] * this.m;
            }
        }
        double d = lj2Var.u.a.j;
        if (d != h32.b) {
            for (int i7 = 0; i7 < i; i7++) {
                dArr[i7] = dArr[i7] / d;
            }
        }
        return dArr;
    }

    /* JADX WARN: Code duplicated, block: B:180:0x03da  */
    /* JADX WARN: Code duplicated, block: B:182:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:190:0x040b  */
    /* JADX WARN: Code duplicated, block: B:191:0x040d  */
    /* JADX WARN: Code duplicated, block: B:193:0x0411  */
    /* JADX WARN: Code duplicated, block: B:194:0x0413  */
    /* JADX WARN: Code duplicated, block: B:196:0x0417  */
    /* JADX WARN: Code duplicated, block: B:198:0x041f  */
    /* JADX WARN: Code duplicated, block: B:199:0x0422  */
    /* JADX WARN: Code duplicated, block: B:201:0x0428  */
    /* JADX WARN: Code duplicated, block: B:205:0x0434  */
    /* JADX WARN: Code duplicated, block: B:209:0x043c  */
    /* JADX WARN: Code duplicated, block: B:211:0x044a  */
    /* JADX WARN: Code duplicated, block: B:212:0x044e  */
    /* JADX WARN: Code duplicated, block: B:215:0x0456  */
    /* JADX WARN: Code duplicated, block: B:218:0x045f  */
    /* JADX WARN: Code duplicated, block: B:221:0x046e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:222:0x0470  */
    /* JADX WARN: Code duplicated, block: B:223:0x0472  */
    /* JADX WARN: Code duplicated, block: B:224:0x0474  */
    /* JADX WARN: Code duplicated, block: B:237:0x047e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x03fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x0454 A[EDGE_INSN: B:267:0x0454->B:214:0x0454 BREAK  A[LOOP:8: B:207:0x0438->B:213:0x0451], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x01d3 A[PHI: r14
  0x01d3: PHI (r14v27 double) = (r14v23 double), (r14v25 double), (r14v23 double) binds: [B:86:0x01d1, B:92:0x01dd, B:77:0x01c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e8  */
    public final void p(jj2 jj2Var, boolean z) {
        boolean z2;
        boolean z3;
        int i;
        int i2;
        wo1 wo1Var;
        wo1 wo1Var2;
        boolean z4;
        boolean z5;
        boolean zD;
        double dD2;
        kj2 kj2Var;
        double d;
        int i3;
        int i4;
        int i5;
        is1 is1Var;
        is1 is1Var2;
        int i6;
        int i7;
        is1 is1Var3;
        wo1 wo1Var3;
        double d2;
        boolean z6;
        double d3;
        jj2 jj2Var2 = jj2Var;
        this.a.getClass();
        lj2 lj2Var = this.A;
        if (z) {
            Arrays.fill(lj2Var.p, h32.b);
        }
        boolean zI2 = lj2Var.i2();
        int i8 = lj2Var.s;
        int[] iArr = lj2Var.q;
        int iMax = zI2 ? Math.max(10, i8) : 10;
        int i9 = 0;
        this.q = 0;
        this.r = 0L;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        int i10 = 0;
        while (j() && !z9) {
            if (z8 || i10 < iMax) {
                z2 = z7;
                z3 = z8;
            } else {
                boolean zI3 = lj2Var.i2();
                boolean z10 = !zI3;
                if (!zI3) {
                    lj2Var.o2();
                }
                for (int i11 = i9; i11 < iArr.length; i11++) {
                    int i12 = iArr[i11];
                    if (!lj2Var.f2(i12) && lj2Var.c2(i12) > h32.a) {
                        kj2 kj2VarC1 = lj2Var.c1(i12);
                        if (kj2VarC1 == kj2.LOWER) {
                            lj2Var.x2(i11, x(i12, lj2Var.d2(i11)));
                        } else if (kj2VarC1 == kj2.UPPER) {
                            lj2Var.x2(i11, -x(i12, lj2Var.d2(i11)));
                        }
                    }
                }
                z2 = z10;
                z3 = true;
            }
            jj2Var2.c();
            hj2 hj2Var = jj2Var2.a;
            ij2 ij2Var = jj2Var2.b;
            boolean zG2 = lj2Var.g2();
            is1 is1Var4 = is1.FAILED;
            if (zG2) {
                this.e = is1Var4;
                i = i8;
                iArr = iArr;
                iMax = iMax;
                i2 = i9;
                z7 = z2;
                z8 = z3;
            } else {
                k();
                boolean zK2 = lj2Var.k2();
                int[] iArr2 = lj2Var.r;
                int i13 = 1;
                double d4 = Double.MIN_NORMAL;
                int length = iArr2.length - 1;
                boolean z11 = false;
                while (true) {
                    wo1Var = C;
                    iMax = iMax;
                    if (length < 0) {
                        break;
                    }
                    int i14 = iArr2[length];
                    int[] iArr3 = iArr2;
                    double dQ1 = lj2Var.Q1(length);
                    boolean z12 = z11;
                    double d5 = (dQ1 * dQ1) / lj2Var.p[length];
                    if (zK2) {
                        k();
                    }
                    boolean z13 = zK2;
                    if (d5 <= d4 || wo1.D(dQ1, wo1Var.j)) {
                        z11 = z12;
                    } else {
                        ij2Var.c = length;
                        if (dQ1 > h32.a) {
                            ij2Var.b = i13;
                            ij2Var.d = kj2.UPPER;
                        } else {
                            ij2Var.b = 2;
                            ij2Var.d = kj2.LOWER;
                        }
                        k();
                        d4 = d5;
                        z11 = true;
                    }
                    length--;
                    iMax = iMax;
                    iArr2 = iArr3;
                    zK2 = z13;
                    i13 = 1;
                }
                boolean z14 = z11;
                k();
                is1 is1Var5 = is1.FEASIBLE;
                if (z14) {
                    lj2Var.j(ij2Var);
                    k();
                    boolean zK3 = lj2Var.k2();
                    int i15 = ij2Var.b;
                    wo1 wo1Var4 = B;
                    double d6 = wo1Var4.j;
                    int iH = lj2Var.u.h();
                    int[] iArrF1 = lj2Var.F1();
                    int iA0 = lj2Var.A0();
                    r(iArr.length);
                    z8 = z3;
                    boolean z15 = z9;
                    int i16 = i10;
                    double d7 = h32.a;
                    int i17 = 0;
                    iArr = iArr;
                    z7 = z2;
                    double dMax = d7;
                    int i18 = 0;
                    while (i17 < iA0) {
                        if (iArrF1 != null) {
                            i6 = iArrF1[i17];
                            i7 = i17;
                        } else {
                            i6 = i17;
                            i7 = i6;
                        }
                        int i19 = iArr[i6];
                        if (i19 >= iH) {
                            is1Var3 = is1Var5;
                            wo1Var3 = wo1Var4;
                        } else {
                            double dC2 = lj2Var.c2(i19);
                            is1Var3 = is1Var5;
                            wo1Var3 = wo1Var4;
                            double d8 = h32.a;
                            if (dC2 > d8) {
                                double dU1 = lj2Var.u1(ij2Var, i6);
                                double dAbs = Math.abs(dU1);
                                double dMax2 = Math.max(d7, dAbs);
                                if (dU1 == d8) {
                                    d2 = dMax2;
                                } else {
                                    kj2 kj2VarC2 = lj2Var.c1(i19);
                                    d2 = dMax2;
                                    if (kj2VarC2 == kj2.UNBOUNDED) {
                                        d3 = d8;
                                    } else {
                                        double dD3 = lj2Var.d2(i6);
                                        if (i15 == 2) {
                                            if (kj2VarC2 == kj2.LOWER && dU1 < d8) {
                                                z6 = true;
                                            } else if (kj2VarC2 != kj2.UPPER || dU1 <= d8) {
                                                dD3 = d8;
                                                z6 = false;
                                            } else {
                                                dD3 = -dD3;
                                                z6 = true;
                                            }
                                            if (z6) {
                                                double dMax3 = Math.max(d8, dD3 + d6) / dAbs;
                                                double dMax4 = Math.max(d8, dD3) / dAbs;
                                                d8 = dMax3;
                                                d3 = dMax4;
                                            }
                                            d7 = d2;
                                        } else {
                                            if (i15 == 1) {
                                                if (kj2VarC2 == kj2.LOWER && dU1 > d8) {
                                                    z6 = true;
                                                } else if (kj2VarC2 == kj2.UPPER && dU1 < d8) {
                                                    dD3 = -dD3;
                                                    z6 = true;
                                                }
                                                if (z6) {
                                                    double dMax5 = Math.max(d8, dD3 + d6) / dAbs;
                                                    double dMax6 = Math.max(d8, dD3) / dAbs;
                                                    d8 = dMax5;
                                                    d3 = dMax6;
                                                }
                                                d7 = d2;
                                            }
                                            dD3 = d8;
                                            z6 = false;
                                            if (z6) {
                                                double dMax7 = Math.max(d8, dD3 + d6) / dAbs;
                                                double dMax8 = Math.max(d8, dD3) / dAbs;
                                                d8 = dMax7;
                                                d3 = dMax8;
                                            }
                                            d7 = d2;
                                        }
                                    }
                                    if (zK3) {
                                        k();
                                    }
                                    dMax = Math.max(dMax, dAbs);
                                    this.u[i18] = i6;
                                    this.v[i18] = d8;
                                    this.w[i18] = dAbs;
                                    this.y[i18] = d3;
                                    this.x[i18] = kj2VarC2;
                                    i18++;
                                    d7 = d2;
                                }
                                i15 = i15;
                                d7 = d2;
                            }
                            i17 = i7 + 1;
                            iA0 = iA0;
                            i15 = i15;
                            is1Var5 = is1Var3;
                            wo1Var4 = wo1Var3;
                            ij2Var = ij2Var;
                            iH = iH;
                        }
                        i15 = i15;
                        i17 = i7 + 1;
                        iA0 = iA0;
                        i15 = i15;
                        is1Var5 = is1Var3;
                        wo1Var4 = wo1Var3;
                        ij2Var = ij2Var;
                        iH = iH;
                    }
                    ij2 ij2Var2 = ij2Var;
                    is1 is1Var6 = is1Var5;
                    wo1 wo1Var5 = wo1Var4;
                    int i20 = 0;
                    int i21 = 0;
                    while (true) {
                        wo1Var2 = F;
                        if (i20 >= i18) {
                            break;
                        }
                        double d9 = this.w[i20];
                        if (!wo1.D(d9, D.j) && !wo1Var2.B(dMax, d9)) {
                            z(i20, i21);
                            i21++;
                        }
                        i20++;
                    }
                    int i22 = i21;
                    int i23 = i22;
                    while (i22 < i18) {
                        if (!wo1Var2.B(d7, this.w[i22])) {
                            z(i22, i23);
                            i23++;
                        }
                        i22++;
                    }
                    hj2 hj2Var2 = hj2Var;
                    if (D(hj2Var2, i21, Math.abs(lj2Var.Q1(ij2Var2.c)), false)) {
                        this.j = 0;
                        this.k = h32.a;
                        z4 = true;
                    } else {
                        double dC3 = h32.a;
                        for (int i24 = 0; i24 < i23; i24++) {
                            dC3 = (lj2Var.c2(iArr[this.u[i24]]) * this.w[i24]) + dC3;
                        }
                        this.j = i23;
                        this.k = dC3;
                        k();
                        z4 = false;
                    }
                    if (z4) {
                        z5 = z4;
                        i = i8;
                    } else {
                        if (lj2Var.s2()) {
                            z9 = z15;
                        } else {
                            double d10 = h32.a;
                            r22 r22VarA2 = lj2Var.A2(ij2Var2.c);
                            double d11 = d10;
                            double dAbs2 = d11;
                            for (int i25 = 0; i25 < i8; i25++) {
                                double dU2 = lj2Var.U1(i25) * r22VarA2.A(i25);
                                d11 += dU2;
                                dAbs2 = Math.abs(dU2) + dAbs2;
                            }
                            int[] iArrF2 = lj2Var.F1();
                            int iA1 = lj2Var.A0();
                            double dAbs3 = dAbs2;
                            int i26 = 0;
                            while (i26 < iA1) {
                                int i27 = iArrF2 != null ? iArrF2[i26] : i26;
                                int[] iArr4 = iArrF2;
                                int i28 = iArr[i27];
                                boolean z16 = z4;
                                kj2 kj2VarC3 = lj2Var.c1(i28);
                                double d12 = h32.a;
                                int i29 = iA1;
                                double dT1 = kj2VarC3 == kj2.LOWER ? lj2Var.T1(i28) : kj2VarC3 == kj2.UPPER ? lj2Var.X1(i28) : d12;
                                if (dT1 != d12) {
                                    double dU3 = lj2Var.u1(ij2Var2, i27) * dT1;
                                    d11 -= dU3;
                                    dAbs3 = Math.abs(dU3) + dAbs3;
                                }
                                i26++;
                                hj2Var2 = hj2Var2;
                                iArrF2 = iArr4;
                                z4 = z16;
                                iA1 = i29;
                            }
                            hj2 hj2Var3 = hj2Var2;
                            z5 = z4;
                            int i30 = ij2Var2.c;
                            if (i30 >= 0) {
                                i30 = ij2Var2.a[i30];
                            }
                            double dT2 = ij2Var2.b == 2 ? lj2Var.T1(i30) - d11 : d11 - lj2Var.X1(i30);
                            double d13 = h32.b;
                            double dMax9 = Math.max(d13, dAbs3);
                            i = i8;
                            double d14 = dAbs3;
                            double d15 = h32.a;
                            boolean zB = wo1Var.B(dMax9, Math.max(d15, dT2));
                            is1 is1Var7 = is1.INFEASIBLE;
                            if (zB) {
                                is1Var = is1Var6;
                                is1Var2 = is1Var;
                            } else {
                                double d16 = this.k;
                                double d17 = dT2 - d16;
                                is1Var = (d17 <= d15 || wo1Var.B(Math.max(d13, d14 + d16), d17)) ? null : is1Var7;
                                is1Var2 = is1Var6;
                            }
                            if (is1Var == is1Var2) {
                                this.e = is1Var2;
                                hj2Var2 = hj2Var3;
                                zD = z5;
                                z9 = true;
                            } else {
                                if (is1Var == is1Var7) {
                                    this.e = is1Var7;
                                    this.l = ij2Var2.c;
                                    if (ij2Var2.b != 2) {
                                        d13 = h32.e;
                                    }
                                    this.m = d13;
                                    hj2Var2 = hj2Var3;
                                } else {
                                    hj2Var2 = hj2Var3;
                                    zD = D(hj2Var2, this.j, Math.abs(lj2Var.Q1(ij2Var2.c)), true);
                                    if (!zD) {
                                        this.e = is1Var4;
                                    }
                                }
                                z9 = z15;
                            }
                            if (zD) {
                                if (jj2Var.a()) {
                                    lj2Var.a0(hj2Var2);
                                    jj2Var2 = jj2Var;
                                    if (lj2Var.j2(jj2Var2) && lj2Var.s2()) {
                                        i8 = i;
                                    }
                                } else {
                                    jj2Var2 = jj2Var;
                                }
                                dD2 = lj2Var.d2(hj2Var2.d);
                                kj2Var = hj2Var2.c;
                                if (kj2Var == kj2.LOWER) {
                                    d = dD2;
                                } else if (kj2Var == kj2.UPPER) {
                                    d = -dD2;
                                } else {
                                    d = h32.a;
                                }
                                if (!z8) {
                                    if (d <= wo1Var5.j) {
                                        i10 = i16 + 1;
                                    }
                                    if (this.n > 0) {
                                        this.o = true;
                                    }
                                    i3 = 0;
                                    while (true) {
                                        i4 = this.n;
                                        if (i3 < i4) {
                                            break;
                                        }
                                        i5 = iArr[this.u[i3]];
                                        if (this.x[i3] == kj2.LOWER) {
                                            lj2Var.w2(i5);
                                        } else {
                                            lj2Var.v2(i5);
                                        }
                                        i3++;
                                    }
                                    if (i4 > 0) {
                                        k();
                                    }
                                    if (jj2Var2.a()) {
                                        lj2Var.C2(jj2Var2);
                                    }
                                    B(jj2Var);
                                    i();
                                    if (!u()) {
                                        i2 = 0;
                                    } else if (z8) {
                                        this.e = is1Var4;
                                        i2 = 0;
                                    } else {
                                        i2 = 0;
                                        this.q = 0;
                                        this.r = 0L;
                                        i10 = iMax;
                                    }
                                } else if (d < h32.a) {
                                    lj2Var.x2(hj2Var2.d, -dD2);
                                }
                                i10 = i16;
                                if (this.n > 0) {
                                    this.o = true;
                                }
                                i3 = 0;
                                while (true) {
                                    i4 = this.n;
                                    if (i3 < i4) {
                                        break;
                                        break;
                                    }
                                    i5 = iArr[this.u[i3]];
                                    if (this.x[i3] == kj2.LOWER) {
                                        lj2Var.w2(i5);
                                    } else {
                                        lj2Var.v2(i5);
                                    }
                                    i3++;
                                }
                                if (i4 > 0) {
                                    k();
                                }
                                if (jj2Var2.a()) {
                                    lj2Var.C2(jj2Var2);
                                }
                                B(jj2Var);
                                i();
                                if (!u()) {
                                    i2 = 0;
                                } else if (z8) {
                                    this.e = is1Var4;
                                    i2 = 0;
                                } else {
                                    i2 = 0;
                                    this.q = 0;
                                    this.r = 0L;
                                    i10 = iMax;
                                }
                            } else {
                                jj2Var2 = jj2Var;
                                i2 = 0;
                                i10 = i16;
                            }
                        }
                        i10 = i16;
                        i9 = 0;
                    }
                    zD = z5;
                    z9 = z15;
                    if (zD) {
                        if (jj2Var.a()) {
                            lj2Var.a0(hj2Var2);
                            jj2Var2 = jj2Var;
                            if (lj2Var.j2(jj2Var2)) {
                            }
                        } else {
                            jj2Var2 = jj2Var;
                        }
                        dD2 = lj2Var.d2(hj2Var2.d);
                        kj2Var = hj2Var2.c;
                        if (kj2Var == kj2.LOWER) {
                            d = dD2;
                        } else if (kj2Var == kj2.UPPER) {
                            d = -dD2;
                        } else {
                            d = h32.a;
                        }
                        if (!z8) {
                            if (d <= wo1Var5.j) {
                                i10 = i16 + 1;
                            }
                            if (this.n > 0) {
                                this.o = true;
                            }
                            i3 = 0;
                            while (true) {
                                i4 = this.n;
                                if (i3 < i4) {
                                    break;
                                    break;
                                }
                                i5 = iArr[this.u[i3]];
                                if (this.x[i3] == kj2.LOWER) {
                                    lj2Var.w2(i5);
                                } else {
                                    lj2Var.v2(i5);
                                }
                                i3++;
                            }
                            if (i4 > 0) {
                                k();
                            }
                            if (jj2Var2.a()) {
                                lj2Var.C2(jj2Var2);
                            }
                            B(jj2Var);
                            i();
                            if (!u()) {
                                i2 = 0;
                            } else if (z8) {
                                this.e = is1Var4;
                                i2 = 0;
                            } else {
                                i2 = 0;
                                this.q = 0;
                                this.r = 0L;
                                i10 = iMax;
                            }
                        } else if (d < h32.a) {
                            lj2Var.x2(hj2Var2.d, -dD2);
                        }
                        i10 = i16;
                        if (this.n > 0) {
                            this.o = true;
                        }
                        i3 = 0;
                        while (true) {
                            i4 = this.n;
                            if (i3 < i4) {
                                break;
                                break;
                            }
                            i5 = iArr[this.u[i3]];
                            if (this.x[i3] == kj2.LOWER) {
                                lj2Var.w2(i5);
                            } else {
                                lj2Var.v2(i5);
                            }
                            i3++;
                        }
                        if (i4 > 0) {
                            k();
                        }
                        if (jj2Var2.a()) {
                            lj2Var.C2(jj2Var2);
                        }
                        B(jj2Var);
                        i();
                        if (!u()) {
                            i2 = 0;
                        } else if (z8) {
                            this.e = is1Var4;
                            i2 = 0;
                        } else {
                            i2 = 0;
                            this.q = 0;
                            this.r = 0L;
                            i10 = iMax;
                        }
                    } else {
                        jj2Var2 = jj2Var;
                        i2 = 0;
                        i10 = i16;
                    }
                } else {
                    i = i8;
                    iArr = iArr;
                    z7 = z2;
                    z8 = z3;
                    i2 = 0;
                    this.e = is1Var5;
                    z9 = true;
                }
            }
            k();
            i9 = i2;
            i8 = i;
            iMax = iMax;
            iArr = iArr;
            z7 = z7;
            z8 = z8;
        }
        if (z7) {
            lj2Var.t2();
        }
    }

    public final void q(jj2 jj2Var) {
        this.a.getClass();
        lj2 lj2Var = this.A;
        Arrays.fill(lj2Var.p, h32.b);
        this.q = 0;
        this.r = 0L;
        boolean z = false;
        while (j() && !z) {
            jj2Var.c();
            boolean zG2 = lj2Var.g2();
            is1 is1Var = is1.FAILED;
            if (zG2) {
                this.e = is1Var;
            } else if (t(jj2Var)) {
                lj2Var.a0(jj2Var.a);
                boolean zA = A(jj2Var, true);
                if (!zA && this.s && !lj2Var.s2()) {
                    zA = A(jj2Var, false);
                }
                if (zA) {
                    if (jj2Var.a()) {
                        lj2Var.j(jj2Var.b);
                        if (lj2Var.j2(jj2Var) || !lj2Var.s2()) {
                            lj2Var.D2(jj2Var);
                        }
                    }
                    B(jj2Var);
                    this.o = true;
                    i();
                    if (u()) {
                        this.e = is1Var;
                    }
                } else if (!this.s) {
                    this.e = is1.UNBOUNDED;
                }
            } else {
                this.e = is1.OPTIMAL;
                z = true;
            }
            k();
        }
    }

    public final void r(int i) {
        int[] iArr = this.u;
        if (iArr == null || iArr.length < i) {
            this.u = new int[i];
            this.v = new double[i];
            this.w = new double[i];
            this.y = new double[i];
            this.x = new kj2[i];
            this.t = new boolean[i];
        }
    }

    public final gs1 s() {
        lj2 lj2Var = this.A;
        double dU0 = lj2Var.U0();
        ea1 ea1Var = lj2Var.u;
        gs1 gs1Var = new gs1(this.e, dU0 / ea1Var.a.j, new xh(lj2Var.T0()));
        k();
        if (this.e == is1.INFEASIBLE && this.l < 0) {
            return gs1Var;
        }
        final byte b = 0;
        gs1Var.k = new Supplier(this) { // from class: ej2
            public final /* synthetic */ ey1 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Supplier
            public final Object get() {
                byte b2 = b;
                ey1 ey1Var = this.b;
                switch (b2) {
                    case 0:
                        return new xh(ey1Var.n());
                    default:
                        return new gj2(ey1Var, ey1Var.A.u.g(), (byte) 0);
                }
            }
        };
        final byte b2 = 1;
        if (!ea1Var.a.j()) {
            gs1Var.i = new Supplier(this) { // from class: ej2
                public final /* synthetic */ ey1 b;

                {
                    this.b = this;
                }

                @Override // java.util.function.Supplier
                public final Object get() {
                    byte b3 = b2;
                    ey1 ey1Var = this.b;
                    switch (b3) {
                        case 0:
                            return new xh(ey1Var.n());
                        default:
                            return new gj2(ey1Var, ey1Var.A.u.g(), (byte) 0);
                    }
                }
            };
            return gs1Var;
        }
        m00 m00Var = ea1Var.a;
        Supplier supplier = new Supplier(this) { // from class: ej2
            public final /* synthetic */ ey1 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Supplier
            public final Object get() {
                byte b3 = b2;
                ey1 ey1Var = this.b;
                switch (b3) {
                    case 0:
                        return new xh(ey1Var.n());
                    default:
                        return new gj2(ey1Var, ey1Var.A.u.g(), (byte) 0);
                }
            }
        };
        gs1Var.h = m00Var;
        gs1Var.i = supplier;
        return gs1Var;
    }

    public final boolean t(jj2 jj2Var) {
        boolean z;
        if (jj2Var != null) {
            k();
        }
        lj2 lj2Var = this.A;
        boolean zK2 = lj2Var.k2();
        hj2 hj2Var = jj2Var != null ? jj2Var.a : null;
        int iH = lj2Var.u.h();
        int[] iArr = lj2Var.q;
        double d = Double.MIN_NORMAL;
        boolean z2 = false;
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 < iH) {
                kj2 kj2VarC1 = lj2Var.c1(i2);
                double dD2 = lj2Var.d2(i);
                double d2 = (dD2 * dD2) / lj2Var.p[i];
                if (zK2) {
                    k();
                }
                if (d2 > d && !wo1.D(dD2, B.j)) {
                    double d3 = h32.a;
                    if (dD2 <= d3 && kj2VarC1 != kj2.UPPER) {
                        if (hj2Var != null) {
                            hj2Var.d = i;
                            hj2Var.c = kj2VarC1;
                            hj2Var.b = 2;
                            k();
                        }
                        d = d2;
                        z2 = true;
                    } else if (dD2 >= d3 && kj2VarC1 != kj2.LOWER) {
                        if (hj2Var != null) {
                            hj2Var.d = i;
                            hj2Var.c = kj2VarC1;
                            z = true;
                            hj2Var.b = 1;
                            k();
                        } else {
                            z = true;
                        }
                        z2 = z;
                        d = d2;
                    }
                }
            }
        }
        if (jj2Var != null) {
            k();
        }
        return z2;
    }

    public final boolean u() {
        long[] jArr;
        long j = this.A.m;
        int iMin = (int) Math.min(this.r, 32L);
        int i = 0;
        while (true) {
            jArr = this.z;
            if (i >= iMin) {
                break;
            }
            if (jArr[i] == j) {
                this.q++;
                break;
            }
            i++;
        }
        long j2 = this.r;
        this.r = 1 + j2;
        jArr[(int) (j2 % 32)] = j;
        return this.q > 100;
    }

    public final boolean v() {
        if (this.e.d() && this.o) {
            this.A.r2();
            this.o = false;
            if (!C()) {
                this.e = is1.APPROXIMATE;
                return true;
            }
        }
        return false;
    }

    public final void w(jj2 jj2Var, boolean z) {
        int i = 0;
        while (true) {
            p(jj2Var, z);
            if (this.e.c()) {
                if (t(null)) {
                    int i2 = i + 1;
                    if (i < 10) {
                        q(jj2Var);
                    }
                    i = i2;
                } else {
                    this.e = is1.OPTIMAL;
                }
            }
            if (!v()) {
                return;
            } else {
                z = true;
            }
        }
    }

    public final jj2 y(boolean z) {
        this.e = is1.UNEXPLORED;
        this.l = -1;
        this.o = false;
        this.f = null;
        this.g = null;
        lj2 lj2Var = this.A;
        if (z) {
            zj1 zj1VarN2 = lj2Var.n2();
            int[] iArr = lj2Var.q;
            int length = iArr.length;
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                double dF1 = lj2Var.f1(i2);
                double d = lj2Var.j[i2];
                double d2 = lj2Var.o[i2];
                if (d > d2) {
                    throw new IllegalStateException();
                }
                double d3 = h32.a;
                if (dF1 > d3 && Double.isFinite(d)) {
                    lj2Var.v2(i2);
                    zj1VarN2.o(i2, dF1);
                } else if (dF1 < d3 && Double.isFinite(d2)) {
                    lj2Var.w2(i2);
                    zj1VarN2.o(i2, dF1);
                } else if (!Double.isFinite(d) && !Double.isFinite(d2)) {
                    lj2Var.u2(i2, kj2.UNBOUNDED);
                    zj1VarN2.o(i2, d3);
                } else if (Math.abs(d) <= Math.abs(d2)) {
                    lj2Var.v2(i2);
                    zj1VarN2.o(i2, Math.max(h32.b, lj2Var.d2(i)));
                } else if (Math.abs(d) >= Math.abs(d2)) {
                    lj2Var.w2(i2);
                    zj1VarN2.o(i2, Math.min(h32.e, lj2Var.d2(i)));
                } else {
                    lj2Var.l2(i2);
                    zj1VarN2.o(i2, h32.b);
                }
            }
        }
        lj2Var.q2(z);
        k();
        jj2 jj2Var = this.p;
        if (jj2Var == null) {
            this.p = new jj2(lj2Var);
        } else {
            jj2Var.c();
        }
        return this.p;
    }

    public final void z(int i, int i2) {
        if (i == i2) {
            return;
        }
        int[] iArr = this.u;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        double[] dArr = this.v;
        double d = dArr[i];
        dArr[i] = dArr[i2];
        dArr[i2] = d;
        double[] dArr2 = this.w;
        double d2 = dArr2[i];
        dArr2[i] = dArr2[i2];
        dArr2[i2] = d2;
        double[] dArr3 = this.y;
        double d3 = dArr3[i];
        dArr3[i] = dArr3[i2];
        dArr3[i2] = d3;
        kj2[] kj2VarArr = this.x;
        kj2 kj2Var = kj2VarArr[i];
        kj2VarArr[i] = kj2VarArr[i2];
        kj2VarArr[i2] = kj2Var;
    }
}
