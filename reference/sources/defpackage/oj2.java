package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class oj2 extends lj2 implements k1, dk1 {
    public static final wo1 C = wo1.K(8);
    public static final wo1 D = wo1.G(15);
    public final double[] A;
    public double B;
    public transient a90 w;
    public transient r22 x;
    public transient r22 y;
    public double[] z;

    public oj2(ea1 ea1Var) {
        super(ea1Var);
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.B = h32.a;
        this.A = new double[this.t];
    }

    @Override // defpackage.lj2
    public final r22 A2(int i) {
        return new nj2(this, d0(), i, this.t - this.s);
    }

    @Override // defpackage.lj2
    public final void C2(jj2 jj2Var) {
        int i = jj2Var.b.c;
        int iA = jj2Var.a.a();
        double dJ = J(i, iA);
        if (wo1.D(dJ, lj2.v.j)) {
            return;
        }
        double[] dArr = this.p;
        double d = dArr[i];
        double d2 = h32.b;
        for (int i2 = 0; i2 < this.r.length; i2++) {
            if (i2 != i) {
                double dJ2 = J(i2, iA) / dJ;
                double d3 = dJ2 * dJ2 * d;
                if (d3 > dArr[i2]) {
                    dArr[i2] = d3;
                }
                double d4 = dArr[i2];
                if (d4 > d2) {
                    d2 = d4;
                }
            }
        }
        double d5 = h32.b;
        double dMax = Math.max(d / (dJ * dJ), d5);
        dArr[i] = dMax;
        if (dMax > d2) {
            d2 = dMax;
        }
        if (d2 > 1.0E8d) {
            Arrays.fill(dArr, d5);
        }
    }

    @Override // defpackage.lj2
    public final void D2(jj2 jj2Var) {
        int i = jj2Var.b.c;
        int i2 = jj2Var.a.d;
        int[] iArr = this.q;
        double dJ = J(i, iArr[i2]);
        if (wo1.D(dJ, lj2.v.j)) {
            return;
        }
        double[] dArr = this.p;
        double d = dArr[i2];
        double d2 = h32.b;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (i3 != i2) {
                double dJ2 = J(i, iArr[i3]) / dJ;
                double d3 = dJ2 * dJ2 * d;
                if (d3 > dArr[i3]) {
                    dArr[i3] = d3;
                }
                double d4 = dArr[i3];
                if (d4 > d2) {
                    d2 = d4;
                }
            }
        }
        double d5 = h32.b;
        double dMax = Math.max(d / (dJ * dJ), d5);
        dArr[i2] = dMax;
        if (dMax > d2) {
            d2 = dMax;
        }
        if (d2 > 1.0E8d) {
            Arrays.fill(dArr, d5);
        }
    }

    @Override // defpackage.lj2
    public final void E2(int i, double d, double d2) {
        double d3 = h32.b;
        double d4 = this.A[i];
        this.j[i] = (d * d3) - d4;
        this.o[i] = (d2 * d3) - d4;
    }

    @Override // defpackage.lj2
    public final void F0(yy yyVar) {
        this.u.getClass();
        yyVar.getClass();
        r22 r22VarI0 = i0();
        int i = this.s;
        this.z = new double[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.z[i2] = r22VarI0.A(i2);
        }
    }

    @Override // defpackage.lj2
    /* JADX INFO: renamed from: F2, reason: merged with bridge method [inline-methods] */
    public final a90 d0() {
        a90 a90Var = this.w;
        if (a90Var != null) {
            return a90Var;
        }
        a90 a90VarM2 = M2();
        this.w = a90VarM2;
        return a90VarM2;
    }

    @Override // defpackage.lj2
    /* JADX INFO: renamed from: G2, reason: merged with bridge method [inline-methods] */
    public final r22 i0() {
        r22 r22Var = this.x;
        if (r22Var != null) {
            return r22Var;
        }
        r22 r22VarN2 = N2();
        this.x = r22VarN2;
        return r22VarN2;
    }

    @Override // defpackage.k1
    public final Comparable H(long j, long j2) {
        return Double.valueOf(y1(j, j2));
    }

    public abstract void H2(int i, int i2);

    public final int I2(zk zkVar, b90 b90Var) {
        af0 it = zkVar.b().iterator();
        int i = -1;
        double d = Double.MAX_VALUE;
        while (it.hasNext()) {
            af0 af0Var = (af0) it.next();
            int iD0 = (int) af0Var.D0();
            if (iD0 >= this.u.h()) {
                break;
            }
            double dA0 = af0Var.A0();
            if (dA0 < h32.a && !wo1.D(dA0, C.j)) {
                double dAbs = Math.abs(b90Var.A(iD0) / dA0);
                if (dAbs < d) {
                    i = iD0;
                    d = dAbs;
                }
            }
        }
        return i;
    }

    public abstract boolean J2(int i, double d);

    public abstract double K2();

    public abstract double L2();

    public a90 M2() {
        ea1 ea1Var = this.u;
        return new a90(this, ea1Var.d, ea1Var.h(), (byte) 0);
    }

    public r22 N2() {
        return new b90(this, this.u.d, (byte) 0);
    }

    public abstract r22 O2();

    public void P2(int i, double d) {
        double[] dArr = this.j;
        dArr[i] = dArr[i] - d;
        double[] dArr2 = this.o;
        dArr2[i] = dArr2[i] - d;
        double[] dArr3 = this.A;
        dArr3[i] = dArr3[i] + d;
        this.B = (f1(i) * d) + this.B;
    }

    @Override // defpackage.lj2
    public final double Q1(int i) {
        int i2 = this.r[i];
        double dZ1 = z1(i);
        double d = this.j[i2];
        double d2 = this.o[i2];
        if (dZ1 < d) {
            return dZ1 - d;
        }
        return dZ1 > d2 ? dZ1 - d2 : h32.a;
    }

    @Override // defpackage.lj2
    public final void R(jj2 jj2Var) {
        double d;
        int iA = jj2Var.a.a();
        kj2 kj2Var = jj2Var.b.d;
        double d2 = h32.a;
        if (kj2Var == kj2.LOWER) {
            d = this.j[iA];
        } else {
            d = kj2Var == kj2.UPPER ? this.o[iA] : d2;
        }
        if (d != d2) {
            P2(iA, d);
        }
    }

    @Override // defpackage.lj2
    public final double[] T0() {
        int i = this.t;
        double[] dArr = new double[i];
        int i2 = 0;
        while (true) {
            int[] iArr = this.q;
            if (i2 >= iArr.length) {
                break;
            }
            int i3 = iArr[i2];
            kj2 kj2VarC1 = c1(i3);
            if (kj2VarC1 == kj2.LOWER) {
                double d = this.j[i3];
                if (Double.isFinite(d)) {
                    dArr[i3] = d;
                }
            } else if (kj2VarC1 == kj2.UPPER) {
                double d2 = this.o[i3];
                if (Double.isFinite(d2)) {
                    dArr[i3] = d2;
                }
            }
            i2++;
        }
        m0(dArr);
        for (int i4 = 0; i4 < i; i4++) {
            dArr[i4] = dArr[i4] + this.A[i4];
        }
        return dArr;
    }

    @Override // defpackage.lj2
    public final double T1(int i) {
        return this.j[i] + this.A[i];
    }

    @Override // defpackage.lj2
    public final double U1(int i) {
        return this.z[i];
    }

    @Override // defpackage.lj2
    public final double X1(int i) {
        return this.o[i] + this.A[i];
    }

    @Override // defpackage.lj2
    public final mh0 a1(r22 r22Var, int i, double d, double d2, boolean[] zArr, double[] dArr, double[] dArr2, boolean[] zArr2) {
        int[] iArr = this.q;
        mh0 mh0VarA = bs2.a(r22Var, i, d, d2, iArr, zArr, dArr, dArr2, zArr2);
        if (mh0VarA != null) {
            int iD = this.u.d();
            double d3 = mh0VarA.k;
            for (int i2 : iArr) {
                if (i2 < iD) {
                    double dA = mh0VarA.i.A(i2);
                    if (dA != h32.a) {
                        boolean z = zArr2[i2];
                        double[] dArr3 = this.A;
                        if (z) {
                            d3 -= (dArr2[i2] + dArr3[i2]) * dA;
                            mh0VarA.y(i2, -dA);
                        } else {
                            d3 = ((dArr[i2] + dArr3[i2]) * dA) + d3;
                        }
                    }
                }
            }
            mh0VarA.k = d3;
        }
        return mh0VarA;
    }

    @Override // defpackage.lj2
    public final double f1(int i) {
        r22 r22VarO2 = this.y;
        if (r22VarO2 == null) {
            r22VarO2 = O2();
            this.y = r22VarO2;
        }
        return r22VarO2.A(i);
    }

    @Override // defpackage.lj2
    public final zj1 m2() {
        r22 r22Var = this.y;
        if (r22Var != null) {
            return r22Var;
        }
        r22 r22VarO2 = O2();
        this.y = r22VarO2;
        return r22VarO2;
    }

    @Override // defpackage.lj2
    public final void p2(jj2 jj2Var) {
        H2(jj2Var.b.c, jj2Var.a.a());
        super.p2(jj2Var);
    }

    @Override // defpackage.lj2
    public final double s1(int i, hj2 hj2Var) {
        return d0().J(i, hj2Var.a());
    }

    @Override // defpackage.lj2
    public final double u1(ij2 ij2Var, int i) {
        return d0().J(ij2Var.c, this.q[i]);
    }

    @Override // defpackage.lj2
    public final void v2(int i) {
        l2(i);
        double d = this.j[i];
        if (d != h32.a) {
            P2(i, d);
        }
    }

    @Override // defpackage.lj2
    public final void w2(int i) {
        u2(i, kj2.UPPER);
        double d = this.o[i];
        if (d != h32.a) {
            P2(i, d);
        }
    }

    @Override // defpackage.dk1
    public final void y0(long j, long j2, Comparable comparable) {
        Y1(j, j2, xo1.c1(comparable));
    }

    @Override // defpackage.lj2
    public final r22 y2(int i) {
        return new mj2(this, d0(), i, (byte) 0);
    }

    @Override // defpackage.lj2
    public final double z1(int i) {
        return i0().A(i);
    }

    @Override // defpackage.lj2
    public final r22 z2() {
        r22 r22VarO2 = this.y;
        if (r22VarO2 == null) {
            r22VarO2 = O2();
            this.y = r22VarO2;
        }
        return new mj2(this, r22VarO2, this.t - this.s, (byte) 1);
    }
}
