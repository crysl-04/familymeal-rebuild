package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class l52 extends xh implements gy1, mi0 {
    public static final g52 q = new g52(1);
    public final fi1 l;
    public final mi1 m;
    public final int n;
    public final int o;
    public final eh p;

    static {
        r01 r01Var = r01.BYTE;
        jh0.a(l52.class);
    }

    public l52(int i, int i2, double[] dArr) {
        super(dArr);
        this.o = i;
        this.n = i2;
        long j = i;
        this.p = new eh(this, j);
        this.l = ii1.o(i, i2);
        long j2 = i2;
        u8 u8Var = ni1.h;
        this.m = (j == 4 && j2 == 4) ? new wg((byte) 24) : (j == 3 && j2 == 3) ? new wg((byte) 28) : (j == 2 && j2 == 2) ? new v53() : (j == 1 && j2 == 1) ? new li1((byte) 0) : j2 == 1 ? new li1((byte) 1) : j == 1 ? new li1((byte) 2) : new li1((byte) 3);
    }

    @Override // defpackage.gy1
    public final void B0(boolean z, boolean z2, double[] dArr) {
        u8 u8Var = pp2.h;
        m02.o(z, z, z2, dArr.length, this.j, Math.max(1, this.o), dArr, 0);
    }

    @Override // defpackage.no2
    public final long B1() {
        return this.n;
    }

    @Override // defpackage.re1
    public final fy1 C0() {
        return q;
    }

    @Override // defpackage.ck1, java.util.function.Consumer
    /* JADX INFO: renamed from: D1 */
    public final void accept(k1 k1Var) {
        for (long j = 0; j < k1Var.B1(); j++) {
            for (long j2 = 0; j2 < k1Var.h1(); j2++) {
                Y1(j2, j, k1Var.y1(j2, j));
            }
        }
    }

    @Override // defpackage.gz2, defpackage.ak1
    public final void E(long j, long j2) {
        this.p.E(j, j2);
    }

    @Override // defpackage.gy1
    public final void E0(k1 k1Var, boolean z, boolean z2) {
        int length;
        double[] dArr = this.j;
        int i = this.o;
        if (i > 0) {
            u8 u8Var = op2.h;
            length = dArr.length / i;
        } else {
            length = 0;
        }
        if (length <= 64) {
            op2.a(dArr, i, 0, length, k1Var, z, z2);
            return;
        }
        u8 u8Var2 = op2.h;
        u8Var2.a = 64;
        u8Var2.b(0, length, new mp2(dArr, i, k1Var, z, z2, (byte) 0));
    }

    @Override // defpackage.ck1
    public final void G0(long j, a1 a1Var) {
        this.p.G0(j, a1Var);
    }

    @Override // defpackage.gz2
    public final ep2 H0(int i, int i2) {
        return new ep2(this, this.l, i, i2);
    }

    @Override // defpackage.re1, defpackage.i1
    public final a1 I(long j) {
        return this.p.I(j);
    }

    @Override // defpackage.bk1
    public final void I0(long j, long j2, double d) {
        this.p.I0(j, j2, d);
    }

    @Override // defpackage.re1, defpackage.k1
    public final double J(int i, int i2) {
        return this.p.J(i, i2);
    }

    @Override // defpackage.j1
    public final void J0(im imVar) {
        this.p.J0(imVar);
    }

    @Override // defpackage.gz2, defpackage.ak1
    public final void K(long j, long j2) {
        this.p.K(j, j2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    @Override // defpackage.gz2
    public final void K1(a1 a1Var, a1 a1Var2) {
        l52 l52Var;
        int intExact = Math.toIntExact(a1Var.count() / ((long) this.o));
        l52 l52Var2 = null;
        if (intExact != Math.toIntExact(a1Var2.count() / ((long) this.n))) {
            a42.a();
            throw null;
        }
        boolean z = a1Var instanceof l52;
        boolean z2 = !z;
        boolean z3 = a1Var2 instanceof l52;
        boolean z4 = !z3;
        if (z) {
            l52Var = (l52) a1Var;
        } else if (a1Var instanceof tz2) {
            re1 re1Var = ((tz2) a1Var).k;
            if (re1Var instanceof l52) {
                l52Var = (l52) re1Var;
            } else {
                l52Var = null;
            }
        } else {
            l52Var = null;
        }
        if (z3) {
            l52Var2 = (l52) a1Var2;
        } else if (a1Var2 instanceof tz2) {
            re1 re1Var2 = ((tz2) a1Var2).k;
            if (re1Var2 instanceof l52) {
                l52Var2 = (l52) re1Var2;
            }
        }
        if (intExact == 0) {
            Arrays.fill(this.j, h32.a);
            return;
        }
        if (l52Var == null || l52Var2 == null) {
            a(this, a1Var, intExact, a1Var2);
            return;
        }
        this.m.d(this.j, l52Var.j, z2, intExact, l52Var2.j, z4);
    }

    @Override // defpackage.gz2
    public final gp2 L0(int... iArr) {
        return new gp2(this, this.l, iArr);
    }

    @Override // defpackage.gz2
    public final dp2 N0(int... iArr) {
        return new dp2(this, this.l, iArr);
    }

    @Override // defpackage.i1
    public final a1 N1(long j) {
        return this.p.I(j);
    }

    @Override // defpackage.gy1
    public final void O(k1 k1Var, boolean z, boolean z2) {
        int length;
        double[] dArr = this.j;
        int i = this.o;
        if (i > 0) {
            u8 u8Var = pp2.h;
            length = dArr.length / i;
        } else {
            length = 0;
        }
        if (length <= 64) {
            pp2.a(dArr, i, 0, length, k1Var, z, z2);
            return;
        }
        u8 u8Var2 = pp2.h;
        u8Var2.a = 64;
        u8Var2.b(0, length, new mp2(dArr, i, k1Var, z, z2, (byte) 1));
    }

    @Override // defpackage.zk, defpackage.yj1
    public final void O1(c23 c23Var) {
        u8 u8Var = xg1.h;
        double[] dArr = this.j;
        int i = this.o;
        int length = i > 0 ? dArr.length / i : 0;
        if (length <= 64) {
            ys.K(dArr, 0, i * length, 1, dArr, c23Var);
            return;
        }
        u8 u8Var2 = xg1.h;
        u8Var2.a = 64;
        u8Var2.b(0, length, new fj0((byte) 2, i, dArr, c23Var));
    }

    @Override // defpackage.bk1
    public final void Q(long j, long j2, sm smVar) {
        this.p.Q(j, j2, smVar);
    }

    @Override // defpackage.bk1
    public final void S0(long j, long j2, Comparable comparable) {
        this.p.S0(j, j2, comparable);
    }

    @Override // defpackage.no2
    public final int T() {
        return this.n;
    }

    @Override // defpackage.bk1
    public final void W0(long j, long j2, c23 c23Var) {
        Y1(j, j2, c23Var.a(y1(j, j2)));
    }

    @Override // defpackage.xh, defpackage.xj1
    public final void Z(a1 a1Var) {
        int length;
        final int length2;
        if (!(a1Var instanceof tz2)) {
            super.Z(a1Var);
            return;
        }
        re1 re1Var = ((tz2) a1Var).k;
        byte b = 0;
        if (re1Var instanceof l52) {
            l52 l52Var = (l52) re1Var;
            if (l52Var.o == this.n) {
                int i = l52Var.n;
                final int i2 = this.o;
                if (i == i2) {
                    final double[] dArr = l52Var.j;
                    final double[] dArr2 = this.j;
                    if (i2 > 0) {
                        u8 u8Var = gj0.h;
                        length2 = dArr2.length / i2;
                    } else {
                        length2 = 0;
                    }
                    if (length2 <= 256) {
                        gj0.c(i2, 0, length2, length2, dArr2, dArr);
                        return;
                    }
                    u8 u8Var2 = gj0.h;
                    u8Var2.a = 256;
                    u8Var2.b(0, length2, new sb0() { // from class: bj0
                        @Override // defpackage.sb0
                        public final void a(int i3, int i4) {
                            double[] dArr3 = dArr;
                            gj0.c(i2, i3, i4, length2, dArr2, dArr3);
                        }
                    });
                    return;
                }
            }
        }
        double[] dArr3 = this.j;
        int i3 = this.o;
        if (i3 > 0) {
            u8 u8Var3 = gj0.h;
            length = dArr3.length / i3;
        } else {
            length = 0;
        }
        if (length > 256) {
            u8 u8Var4 = gj0.h;
            u8Var4.a = 256;
            u8Var4.b(0, length, new ej0(dArr3, i3, re1Var, b));
            return;
        }
        u8 u8Var5 = gj0.h;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = 0;
            while (i6 < i3) {
                dArr3[i4] = re1Var.J(i5, i6);
                i6++;
                i4++;
            }
        }
    }

    @Override // defpackage.no2
    public final int Z1() {
        return this.o;
    }

    @Override // defpackage.dk1
    public final void b0(double d, int i, int i2) {
        this.p.b0(d, i, i2);
    }

    @Override // defpackage.re1
    public final re1 e1(re1 re1Var) {
        long j = this.o;
        long jB1 = re1Var.B1();
        g52 g52Var = q;
        l52 l52Var = (l52) g52Var.b(j, jB1);
        int i = this.n;
        if (i == 0) {
            return l52Var;
        }
        boolean z = re1Var instanceof l52;
        if (!z) {
            l52Var.K1(this, re1Var);
            return l52Var;
        }
        l52Var.m.d(l52Var.j, this.j, false, i, (z ? (l52) re1Var : (l52) g52Var.Q(re1Var)).j, false);
        return l52Var;
    }

    @Override // defpackage.xh, defpackage.zk
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && (obj instanceof l52)) {
            l52 l52Var = (l52) obj;
            if (this.n == l52Var.n && this.o == l52Var.o) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.i1
    public final a1 g0(long j) {
        return this.p.u(j);
    }

    @Override // defpackage.re1
    public final Comparable h0(int i, int i2) {
        return (Double) this.p.H(i, i2);
    }

    @Override // defpackage.no2
    public final long h1() {
        return this.o;
    }

    @Override // defpackage.xh, defpackage.zk
    public final int hashCode() {
        return (((super.hashCode() * 31) + this.n) * 31) + this.o;
    }

    @Override // defpackage.gz2
    public final gz2 j0() {
        return new ip2(this, this.l);
    }

    @Override // defpackage.ck1
    public final void k0(re1 re1Var, tm tmVar, re1 re1Var2) {
        double[] dArr = this.j;
        int length = dArr.length;
        int i = this.o;
        int i2 = length / i;
        int iZ1 = re1Var.Z1();
        int iT = re1Var.T();
        int iZ2 = re1Var2.Z1();
        int iT2 = re1Var2.T();
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 % iT;
            int i5 = i3 % iT2;
            int i6 = 0;
            while (i6 < i) {
                int i7 = i3;
                int i8 = i;
                double[] dArr2 = dArr;
                dArr2[(i7 * i8) + i6] = tmVar.c(re1Var.J(i6 % iZ1, i4), re1Var2.J(i6 % iZ2, i5));
                i6++;
                i3 = i7;
                dArr = dArr2;
                i = i8;
            }
            i3++;
        }
    }

    @Override // defpackage.re1
    /* JADX INFO: renamed from: m2, reason: merged with bridge method [inline-methods] */
    public final Double W(int i) {
        int iX = wi0.x(i);
        double[] dArr = this.j;
        int i2 = 0;
        if (iX == 2) {
            double dMax = h32.a;
            while (i2 < dArr.length) {
                dMax = Math.max(dMax, Math.abs(dArr[i2]));
                i2++;
            }
            return Double.valueOf(dMax);
        }
        if (iX == 3) {
            double dMax2 = Double.NEGATIVE_INFINITY;
            while (i2 < dArr.length) {
                dMax2 = Math.max(dMax2, dArr[i2]);
                i2++;
            }
            if (dArr.length <= 0) {
                dMax2 = h32.a;
            }
            return Double.valueOf(dMax2);
        }
        if (iX == 4) {
            double dMin = Double.POSITIVE_INFINITY;
            while (i2 < dArr.length) {
                dMin = Math.min(dMin, dArr[i2]);
                i2++;
            }
            if (dArr.length <= 0) {
                dMin = h32.a;
            }
            return Double.valueOf(dMin);
        }
        if (iX == 5) {
            double dAbs = h32.a;
            while (i2 < dArr.length) {
                dAbs += Math.abs(dArr[i2]);
                i2++;
            }
            return Double.valueOf(dAbs);
        }
        if (iX == 6) {
            double d = h32.a;
            while (i2 < dArr.length) {
                double d2 = dArr[i2];
                d += d2 * d2;
                i2++;
            }
            return Double.valueOf(Math.sqrt(d));
        }
        if (iX == 10) {
            double d3 = h32.a;
            while (i2 < dArr.length) {
                d3 += dArr[i2];
                i2++;
            }
            return Double.valueOf(d3);
        }
        if (iX != 11) {
            im imVarM = x22.L0.m(i);
            S1(imVarM);
            return (Double) imVarM.get();
        }
        double d4 = h32.a;
        while (i2 < dArr.length) {
            double d5 = dArr[i2];
            d4 += d5 * d5;
            i2++;
        }
        return Double.valueOf(d4);
    }

    @Override // defpackage.re1
    /* JADX INFO: renamed from: n2, reason: merged with bridge method [inline-methods] */
    public final l52 U() {
        double[] dArr = this.j;
        int length = dArr.length;
        double[] dArr2 = new double[length];
        System.arraycopy(dArr, 0, dArr2, 0, length);
        return new l52(this.o, this.n, dArr2);
    }

    @Override // defpackage.bk1
    public final void q0(double d, int i, int i2) {
        this.p.q0(d, i, i2);
    }

    @Override // defpackage.gy1
    public final void q1(boolean z, boolean z2, double[] dArr) {
        u8 u8Var = op2.h;
        m02.o(!z, z, z2, dArr.length, this.j, Math.max(1, this.o), dArr, 0);
    }

    @Override // defpackage.re1
    public final Comparable r0(q22 q22Var) {
        long size = q22Var.size();
        g52 g52Var = q;
        gy1 gy1Var = (gy1) g52Var.b(1L, size);
        gy1 gy1Var2 = (gy1) g52Var.b(1L, 1L);
        gy1Var.K1(q22Var, this);
        gy1Var2.K1(gy1Var, q22Var);
        return (Double) gy1Var2.G(0L);
    }

    @Override // defpackage.zk
    public final String toString() {
        return k1.l0(this);
    }

    @Override // defpackage.re1, defpackage.i1
    public final a1 u(long j) {
        return this.p.u(j);
    }

    @Override // defpackage.gz2
    public final fp2 v0(int i, int i2) {
        return new fp2(this, this.l, i, i2);
    }

    @Override // defpackage.dk1
    public final void y0(long j, long j2, Comparable comparable) {
        this.p.y0(j, j2, comparable);
    }

    @Override // defpackage.mi0
    public final no2 build() {
        return this;
    }
}
