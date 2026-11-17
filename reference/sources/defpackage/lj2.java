package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class lj2 {
    public static final wo1 v = wo1.K(9);
    public final double[] j;
    public final eg k;
    public int l;
    public final double[] o;
    public final double[] p;
    public final int[] q;
    public final int[] r;
    public final int s;
    public final int t;
    public final ea1 u;
    public transient int[] h = null;
    public transient boolean i = false;
    public long m = 0;
    public final ArrayList n = new ArrayList();

    public lj2(ea1 ea1Var) {
        this.u = ea1Var;
        int iG = ea1Var.g();
        this.s = iG;
        int i = ea1Var.i();
        this.t = i;
        this.j = new double[i];
        this.o = new double[i];
        int i2 = i - iG;
        this.q = mo2.E1(0, i2);
        this.r = mo2.E1(i2, iG);
        this.k = new eg(i, kj2.BASIS);
        this.l = ea1Var.b;
        this.p = new double[Math.max(iG, i2)];
    }

    public static long e2(int i, kj2 kj2Var) {
        if (kj2Var == kj2.BASIS) {
            return 0L;
        }
        long jOrdinal = ((((long) i) << 2) + ((long) kj2Var.ordinal())) * (-7046029254386353131L);
        long j = (jOrdinal ^ (jOrdinal >>> 30)) * (-4658895280553007687L);
        long j2 = (j ^ (j >>> 27)) * (-7723592293110705685L);
        return j2 ^ (j2 >>> 31);
    }

    public int A0() {
        return this.q.length;
    }

    public abstract r22 A2(int i);

    public final void B2(int i, int i2) {
        int[] iArr = this.r;
        int i3 = iArr[i];
        if (i3 >= 0) {
            l2(i3);
        }
        if (f2(i3)) {
            this.l--;
        }
        if (i2 >= 0) {
            u2(i2, kj2.BASIS);
        }
        iArr[i] = i2;
        byte bOrdinal = (byte) kj2.BASIS.ordinal();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            byte[] bArr = (byte[]) this.k.k;
            if (i4 >= bArr.length) {
                break;
            }
            int[] iArr2 = this.q;
            if (i5 >= iArr2.length) {
                break;
            }
            if (bArr[i4] != bOrdinal) {
                iArr2[i5] = i4;
                i5++;
            }
            i4++;
        }
        this.i = false;
    }

    public abstract void C2(jj2 jj2Var);

    public int D0() {
        return this.r.length;
    }

    public abstract void D2(jj2 jj2Var);

    public abstract void E2(int i, double d, double d2);

    public abstract void F0(yy yyVar);

    public int[] F1() {
        return null;
    }

    public final int[] I1() {
        if (!this.i) {
            int[] iArr = this.h;
            int i = this.t;
            if (iArr == null || iArr.length != i) {
                iArr = new int[i];
                this.h = iArr;
            }
            Arrays.fill(iArr, -1);
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.q;
                if (i2 >= iArr2.length) {
                    break;
                }
                this.h[iArr2[i2]] = i2;
                i2++;
            }
            this.i = true;
        }
        return this.h;
    }

    public final void M0(double[] dArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.r;
            if (i2 >= iArr.length) {
                break;
            }
            dArr[iArr[i2]] = h32.a;
            i2++;
        }
        while (true) {
            int[] iArr2 = this.q;
            if (i >= iArr2.length) {
                return;
            }
            dArr[iArr2[i]] = d2(i);
            i++;
        }
    }

    public abstract double Q1(int i);

    public abstract void R(jj2 jj2Var);

    public abstract double[] T0();

    public double T1(int i) {
        return this.j[i];
    }

    public abstract double U0();

    public abstract double U1(int i);

    public double X1(int i) {
        return this.o[i];
    }

    public mh0 a1(r22 r22Var, int i, double d, double d2, boolean[] zArr, double[] dArr, double[] dArr2, boolean[] zArr2) {
        int[] iArr = this.q;
        mh0 mh0VarA = bs2.a(r22Var, i, d, d2, iArr, zArr, dArr, dArr2, zArr2);
        if (mh0VarA != null) {
            int iD = this.u.d();
            double d3 = mh0VarA.k;
            for (int i2 : iArr) {
                if (i2 < iD) {
                    double dA = mh0VarA.i.A(i2);
                    double d4 = h32.a;
                    if (dA != d4) {
                        if (zArr2[i2]) {
                            d3 -= dArr2[i2] * dA;
                            mh0VarA.y(i2, -dA);
                        } else {
                            double d5 = dArr[i2];
                            if (d5 != d4) {
                                d3 = (dA * d5) + d3;
                            }
                        }
                    }
                }
            }
            mh0VarA.k = d3;
        }
        return mh0VarA;
    }

    public int[] b2() {
        return null;
    }

    public final kj2 c1(int i) {
        eg egVar = this.k;
        return (kj2) ((Enum[]) egVar.i)[((byte[]) egVar.k)[i]];
    }

    public final double c2(int i) {
        return this.o[i] - this.j[i];
    }

    public abstract dk1 d0();

    public abstract double d2(int i);

    public abstract double f1(int i);

    public final boolean f2(int i) {
        ea1 ea1Var = this.u;
        if (i >= 0) {
            return i >= ea1Var.h();
        }
        ea1Var.getClass();
        return true;
    }

    public boolean g2() {
        return false;
    }

    public final boolean h2(int i) {
        return !(((byte[]) this.k.k)[i] == kj2.BASIS.ordinal());
    }

    public abstract zj1 i0();

    public abstract boolean i2();

    public boolean j2(jj2 jj2Var) {
        return true;
    }

    public final boolean k2() {
        return this.u.i() <= 32;
    }

    public final void l2(int i) {
        u2(i, kj2.LOWER);
    }

    public abstract void m0(double[] dArr);

    public abstract zj1 m2();

    public abstract zj1 n2();

    public abstract void o2();

    public void p2(jj2 jj2Var) {
        ij2 ij2Var = jj2Var.b;
        hj2 hj2Var = jj2Var.a;
        int i = ij2Var.c;
        if (i >= 0) {
            i = ij2Var.a[i];
        }
        if (f2(i)) {
            this.l--;
        }
        int i2 = ij2Var.c;
        kj2 kj2Var = ij2Var.d;
        int i3 = hj2Var.d;
        int[] iArr = this.r;
        int i4 = iArr[i2];
        int[] iArr2 = this.q;
        int i5 = iArr2[i3];
        if (kj2Var == kj2.LOWER) {
            l2(i4);
        } else {
            kj2 kj2Var2 = kj2.UPPER;
            if (kj2Var != kj2Var2) {
                wg.f();
                return;
            }
            u2(i4, kj2Var2);
        }
        u2(i5, kj2.BASIS);
        iArr[i2] = i5;
        iArr2[i3] = i4;
        if (this.i) {
            int[] iArr3 = this.h;
            iArr3[i5] = -1;
            iArr3[i4] = i3;
        }
    }

    public abstract double s1(int i, hj2 hj2Var);

    public boolean s2() {
        return false;
    }

    public abstract void t2();

    public final String toString() {
        ArrayList arrayList = this.n;
        arrayList.clear();
        int i = 0;
        while (true) {
            eg egVar = this.k;
            byte[] bArr = (byte[]) egVar.k;
            if (i >= bArr.length) {
                return arrayList.toString();
            }
            arrayList.add(((kj2) ((Enum[]) egVar.i)[bArr[i]]).h);
            i++;
        }
    }

    public abstract double u1(ij2 ij2Var, int i);

    public final void u2(int i, kj2 kj2Var) {
        long j = this.m;
        eg egVar = this.k;
        Enum[] enumArr = (Enum[]) egVar.i;
        byte[] bArr = (byte[]) egVar.k;
        this.m = j ^ (e2(i, (kj2) enumArr[bArr[i]]) ^ e2(i, kj2Var));
        byte b = bArr[i];
        int iOrdinal = kj2Var.ordinal();
        if (b != iOrdinal) {
            bArr[i] = (byte) iOrdinal;
            int[] iArr = (int[]) egVar.j;
            iArr[b] = iArr[b] - 1;
            iArr[iOrdinal] = iArr[iOrdinal] + 1;
        }
    }

    public abstract void v2(int i);

    public abstract void w2(int i);

    public abstract void x2(int i, double d);

    public abstract r22 y2(int i);

    public abstract double z1(int i);

    public abstract r22 z2();

    public void r2() {
    }

    public void a0(hj2 hj2Var) {
    }

    public void j(ij2 ij2Var) {
    }

    public void q2(boolean z) {
    }
}
