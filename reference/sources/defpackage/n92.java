package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class n92 extends lj2 {
    public static final wo1 O = wo1.J(8);
    public ya2 A;
    public k52 B;
    public k52 C;
    public final l52 D;
    public fm2 E;
    public boolean F;
    public final i90 G;
    public final l52 H;
    public l52 I;
    public final i90 J;
    public boolean K;
    public final i90 L;
    public final double[] M;
    public final double[] N;
    public final double[] w;
    public final double[] x;
    public boolean y;
    public final i90 z;

    public n92(ea1 ea1Var) {
        super(ea1Var);
        this.y = false;
        this.F = true;
        this.I = null;
        this.K = false;
        int i = this.t;
        g52 g52Var = l52.q;
        this.H = g52.R(i, 1);
        int i2 = this.s;
        ya2 ya2Var = new ya2(l52.q, this.t, 0);
        ya2Var.j(i2);
        this.A = ya2Var;
        this.D = g52.R(this.s, 1);
        this.z = new i90(this.s);
        this.G = new i90(this.s);
        this.J = new i90(this.t);
        this.L = new i90(this.t - this.s);
        int i3 = this.s;
        this.M = new double[i3];
        this.N = new double[i3];
        this.x = new double[i3];
        this.w = new double[this.t - i3];
    }

    @Override // defpackage.lj2
    public final int A0() {
        return this.L.j();
    }

    @Override // defpackage.lj2
    public final r22 A2(int i) {
        fm2 fm2Var = this.E;
        i90 i90Var = this.G;
        fm2Var.R(i, i90Var);
        return i90Var;
    }

    @Override // defpackage.lj2
    public final void C2(jj2 jj2Var) {
        int i = jj2Var.b.c;
        double d = this.L.h[jj2Var.a.d];
        if (wo1.D(d, lj2.v.j)) {
            return;
        }
        double[] dArr = this.p;
        double d2 = dArr[i];
        double d3 = h32.b;
        i90 i90Var = this.z;
        int[] iArrA0 = i90Var.a0();
        int iJ = i90Var.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            int i3 = iArrA0[i2];
            if (i3 != i) {
                double d4 = i90Var.h[i3] / d;
                double d5 = d4 * d4 * d2;
                if (d5 > dArr[i3]) {
                    dArr[i3] = d5;
                }
                double d6 = dArr[i3];
                if (d6 > d3) {
                    d3 = d6;
                }
            }
        }
        double d7 = d2 / (d * d);
        double d8 = h32.b;
        double dMax = Math.max(d7, d8);
        dArr[i] = dMax;
        if (dMax > d3) {
            d3 = dMax;
        }
        if (d3 > 1.0E8d) {
            Arrays.fill(dArr, d8);
        }
    }

    @Override // defpackage.lj2
    public final int D0() {
        return this.z.j();
    }

    @Override // defpackage.lj2
    public final void D2(jj2 jj2Var) {
        int i = jj2Var.a.d;
        i90 i90Var = this.L;
        double[] dArr = i90Var.h;
        double d = dArr[i];
        if (wo1.D(d, lj2.v.j)) {
            return;
        }
        double[] dArr2 = this.p;
        double d2 = dArr2[i];
        double d3 = h32.b;
        int[] iArrA0 = i90Var.a0();
        int iJ = i90Var.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            int i3 = iArrA0[i2];
            if (i3 != i) {
                double d4 = dArr[i3] / d;
                double d5 = d4 * d4 * d2;
                if (d5 > dArr2[i3]) {
                    dArr2[i3] = d5;
                }
                double d6 = dArr2[i3];
                if (d6 > d3) {
                    d3 = d6;
                }
            }
        }
        double d7 = h32.b;
        double dMax = Math.max(d2 / (d * d), d7);
        dArr2[i] = dMax;
        if (dMax > d3) {
            d3 = dMax;
        }
        if (d3 > 1.0E8d) {
            Arrays.fill(dArr2, d7);
        }
    }

    @Override // defpackage.lj2
    public final void E2(int i, double d, double d2) {
        double d3;
        double d4 = h32.b;
        double d5 = d * d4;
        double d6 = d2 * d4;
        double[] dArr = this.j;
        double d7 = dArr[i];
        double[] dArr2 = this.o;
        double d8 = dArr2[i];
        if (this.y && h2(i)) {
            kj2 kj2VarC1 = c1(i);
            double d9 = h32.a;
            if (kj2VarC1 == kj2.LOWER) {
                d3 = d5 - d7;
            } else {
                d3 = kj2VarC1 == kj2.UPPER ? d6 - d8 : d9;
            }
            if (d3 != d9 && Double.isFinite(d3)) {
                I2(i, d3);
            }
        }
        dArr[i] = d5;
        dArr2[i] = d6;
    }

    @Override // defpackage.lj2
    public final void F0(yy yyVar) {
        this.u.getClass();
        yyVar.getClass();
        this.B = this.A.t0();
        ya2 ya2Var = this.A;
        ArrayList arrayList = ya2Var.k;
        int size = arrayList.size();
        int i = ya2Var.h;
        ArrayList arrayList2 = ya2Var.k;
        int size2 = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList2.get(i3);
            i3++;
            i2 += ((cm2) obj).i;
        }
        double[] dArr = new double[i2];
        int[] iArr = new int[i2];
        int[] iArr2 = new int[size + 1];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            iArr2[i5] = i4;
            am2 it = ((cm2) arrayList.get(i5)).b().iterator();
            while (it.hasNext()) {
                it.c();
                dArr[i4] = it.A0();
                iArr[i4] = (int) it.D0();
                i4++;
            }
        }
        iArr2[size] = i4;
        this.C = new k52(size, i, dArr, iArr, iArr2, (byte) 1);
        this.A = null;
        this.E = new fm2(this.B.d1());
    }

    @Override // defpackage.lj2
    public final int[] F1() {
        return this.L.a0();
    }

    public final double F2(int i, kj2 kj2Var) {
        if (kj2Var == kj2.LOWER) {
            return this.j[i];
        }
        return kj2Var == kj2.UPPER ? this.o[i] : h32.a;
    }

    public final void G2(int i) {
        double[] dArr;
        int i2;
        i90 i90Var = this.L;
        double[] dArr2 = i90Var.h;
        fm2 fm2Var = this.E;
        i90 i90Var2 = this.G;
        fm2Var.R(i, i90Var2);
        k52 k52Var = this.C;
        i90 i90Var3 = this.J;
        double[] dArr3 = i90Var3.h;
        k52Var.getClass();
        i90Var3.reset();
        int[] iArrA0 = i90Var2.a0();
        double[] dArr4 = i90Var2.h;
        int iJ = i90Var2.j();
        if (i90Var2.R() < i90.n) {
            int i3 = 0;
            while (i3 < iJ) {
                int i4 = iArrA0[i3];
                double d = dArr4[i4];
                if (d != h32.a) {
                    int[] iArr = k52Var.o;
                    int i5 = iArr[i4];
                    int i6 = iArr[i4 + 1];
                    int i7 = i5;
                    while (i7 < i6) {
                        double[] dArr5 = dArr2;
                        i90Var3.f(k52Var.n[i7], d * k52Var.p[i7]);
                        i7++;
                        iArrA0 = iArrA0;
                        dArr2 = dArr5;
                        dArr4 = dArr4;
                    }
                }
                i3++;
                iArrA0 = iArrA0;
                dArr2 = dArr2;
                dArr4 = dArr4;
            }
            dArr = dArr2;
            i2 = 0;
        } else {
            dArr = dArr2;
            for (int i8 = 0; i8 < iJ; i8++) {
                int i9 = iArrA0[i8];
                double d2 = dArr4[i9];
                if (d2 != h32.a) {
                    k52Var.d0(d2, i9, dArr3);
                }
            }
            i90Var3.F0();
            i2 = 0;
            i90Var3.m = 0;
            i90Var3.i = false;
        }
        i90Var.reset();
        int[] iArrA1 = i90Var.a0();
        if (i90Var2.R() < i90.n) {
            int[] iArrI1 = I1();
            int[] iArrA2 = i90Var3.a0();
            int iJ2 = i90Var3.j();
            for (int i10 = i2; i10 < iJ2; i10++) {
                int i11 = iArrA2[i10];
                double d3 = dArr3[i11];
                int i12 = iArrI1[i11];
                if (i12 >= 0 && d3 != h32.a && !f2(i11)) {
                    dArr[i12] = d3;
                    iArrA1[i2] = i12;
                    i2++;
                }
            }
        } else {
            int[] iArr2 = this.q;
            int length = iArr2.length;
            for (int i13 = i2; i13 < length; i13++) {
                int i14 = iArr2[i13];
                double d4 = dArr3[i14];
                if (d4 != h32.a && !f2(i14)) {
                    dArr[i13] = d4;
                    iArrA1[i2] = i13;
                    i2++;
                }
            }
        }
        i90Var.m0(i2);
    }

    public final void H2() {
        double[] dArr = this.D.j;
        int i = this.s;
        int i2 = 0;
        double[] dArr2 = this.N;
        System.arraycopy(dArr, 0, dArr2, 0, i);
        while (true) {
            int[] iArr = this.q;
            if (i2 >= iArr.length) {
                this.E.x1(dArr2);
                this.y = true;
                return;
            } else {
                int i3 = iArr[i2];
                double dF2 = F2(i3, c1(i3));
                if (dF2 != h32.a) {
                    this.B.d0(-dF2, i3, dArr2);
                }
                i2++;
            }
        }
    }

    public final void I2(int i, double d) {
        k52 k52Var = this.B;
        double[] dArr = this.M;
        k52Var.b2(i, dArr);
        this.E.x1(dArr);
        double[] dArr2 = this.N;
        aa3.w(dArr2, 0, -d, dArr, 0, 0, Math.min(dArr2.length, dArr.length));
    }

    public final void J2() {
        double[] dArr;
        l52 l52Var = this.I;
        if (l52Var == null) {
            l52Var = this.H;
        }
        double[] dArr2 = l52Var.j;
        int[] iArr = this.r;
        int length = iArr.length;
        int i = 0;
        while (true) {
            dArr = this.x;
            if (i >= length) {
                break;
            }
            dArr[i] = dArr2[iArr[i]];
            i++;
        }
        this.E.j(dArr);
        int[] iArr2 = this.q;
        int length2 = iArr2.length;
        for (int i2 = 0; i2 < length2; i2++) {
            int i3 = iArr2[i2];
            boolean zF2 = f2(i3);
            double[] dArr3 = this.w;
            if (zF2) {
                dArr3[i2] = dArr2[i3];
            } else {
                double d = dArr2[i3];
                k52 k52Var = this.B;
                k52Var.getClass();
                double d2 = h32.a;
                int[] iArr3 = k52Var.o;
                int i4 = iArr3[i3 + 1];
                for (int i5 = iArr3[i3]; i5 < i4; i5++) {
                    d2 += k52Var.p[i5] * dArr[k52Var.n[i5]];
                }
                dArr3[i2] = d - d2;
            }
        }
    }

    @Override // defpackage.lj2
    public final double Q1(int i) {
        int i2 = this.r[i];
        double d = this.N[i];
        double d2 = this.j[i2];
        double d3 = this.o[i2];
        if (d < d2) {
            return d - d2;
        }
        return d > d3 ? d - d3 : h32.a;
    }

    @Override // defpackage.lj2
    public final void R(jj2 jj2Var) {
        ij2 ij2Var = jj2Var.b;
        int i = ij2Var.c;
        hj2 hj2Var = jj2Var.a;
        int i2 = hj2Var.d;
        if (jj2Var.a()) {
            if (this.K) {
                J2();
            } else {
                double[] dArr = this.w;
                double d = dArr[i2];
                i90 i90Var = this.L;
                double[] dArr2 = i90Var.h;
                double d2 = -(d / dArr2[i2]);
                int iJ = i90Var.j();
                for (int i3 = 0; i3 < iJ; i3++) {
                    int i4 = i90Var.j[i3];
                    dArr[i4] = (dArr2[i4] * d2) + dArr[i4];
                }
                dArr[i2] = d2;
            }
        }
        if (this.K) {
            H2();
            this.K = false;
            return;
        }
        int i5 = ij2Var.c;
        if (i5 >= 0) {
            i5 = ij2Var.a[i5];
        }
        int iA = hj2Var.a();
        double dF2 = F2(i5, hj2Var.c);
        double dF3 = F2(iA, ij2Var.d);
        double[] dArr3 = this.N;
        double d3 = dArr3[i] - dF3;
        i90 i90Var2 = this.z;
        double[] dArr4 = i90Var2.h;
        double d4 = d3 / dArr4[i];
        double d5 = -d4;
        int iJ2 = i90Var2.j();
        for (int i6 = 0; i6 < iJ2; i6++) {
            int i7 = i90Var2.j[i6];
            dArr3[i7] = (dArr4[i7] * d5) + dArr3[i7];
        }
        dArr3[i] = dF2 + d4;
    }

    @Override // defpackage.lj2
    public final double[] T0() {
        double[] dArr = new double[this.t];
        int i = 0;
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
                if (!Double.isFinite(d)) {
                    d = h32.a;
                }
                dArr[i3] = d;
            } else if (kj2VarC1 == kj2.UPPER) {
                double d2 = this.o[i3];
                if (!Double.isFinite(d2)) {
                    d2 = h32.a;
                }
                dArr[i3] = d2;
            }
            i2++;
        }
        while (true) {
            int[] iArr2 = this.r;
            if (i >= iArr2.length) {
                return dArr;
            }
            dArr[iArr2[i]] = this.N[i];
            i++;
        }
    }

    @Override // defpackage.lj2
    public final double U0() {
        double[] dArr = this.H.j;
        double d = h32.a;
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.r;
            if (i2 >= iArr.length) {
                break;
            }
            d += this.N[i2] * dArr[iArr[i2]];
            i2++;
        }
        while (true) {
            int[] iArr2 = this.q;
            if (i >= iArr2.length) {
                return d;
            }
            int i3 = iArr2[i];
            double dF2 = F2(i3, c1(i3));
            if (dF2 != h32.a) {
                d = (dF2 * dArr[i3]) + d;
            }
            i++;
        }
    }

    @Override // defpackage.lj2
    public final double U1(int i) {
        return this.D.j[i];
    }

    @Override // defpackage.lj2
    public final void a0(hj2 hj2Var) {
        i90 i90Var;
        i90 i90Var2;
        fm2 fm2Var = this.E;
        k52 k52Var = this.B;
        int iA = hj2Var.a();
        i90 i90Var3 = this.z;
        double[] dArr = i90Var3.h;
        lm2 lm2Var = fm2Var.i;
        if (!lm2Var.h) {
            k52Var.b2(iA, dArr);
            fm2Var.x1(dArr);
            i90Var3.i0();
            return;
        }
        k52Var.U1(iA, (i90) lm2Var.u.l);
        i90Var3.reset();
        lm2Var.M0((i90) lm2Var.u.l);
        k01 k01Var = lm2Var.u;
        ((i90) k01Var.l).A0((i90) k01Var.m);
        i90 i90Var4 = (i90) lm2Var.u.l;
        int iJ = i90Var4.j();
        double[] dArr2 = i90Var4.h;
        boolean zT0 = lm2.T0(iJ, lm2Var.p, lm2Var.s.c, 0.03d);
        km2 km2Var = lm2Var.t;
        im2 im2Var = lm2Var.r;
        fe feVar = lm2Var.q;
        km2Var.getClass();
        int[] iArrA0 = i90Var3.a0();
        int i = 0;
        if (zT0) {
            int iZ = feVar.z(i90Var4.a0(), i90Var4.j(), im2Var.h, km2Var.d, km2Var.a, km2Var.b, km2Var.e) - 1;
            while (iZ >= 0) {
                int i2 = ((int[]) feVar.g)[iZ];
                double d = dArr2[i2];
                double d2 = h32.a;
                if (d != d2) {
                    dArr2[i2] = d2;
                    int i3 = im2Var.h[i2];
                    double d3 = d / im2Var.d[i3];
                    int i4 = km2Var.d[i3];
                    int i5 = km2Var.a[i3];
                    while (i4 < i5) {
                        int i6 = km2Var.b[i4];
                        dArr2[i6] = dArr2[i6] - (km2Var.e[i4] * d3);
                        i4++;
                        i90Var4 = i90Var4;
                    }
                    i90Var2 = i90Var4;
                    int i7 = im2Var.e[i3];
                    dArr[i7] = d3;
                    iArrA0[i] = i7;
                    i++;
                } else {
                    i90Var2 = i90Var4;
                }
                iZ--;
                i90Var4 = i90Var2;
            }
            i90Var = i90Var4;
        } else {
            i90Var = i90Var4;
            for (int i8 = im2Var.c - 1; i8 >= 0; i8--) {
                int i9 = im2Var.f[i8];
                if (i9 >= 0) {
                    double d4 = dArr2[i9];
                    double d5 = h32.a;
                    if (d4 != d5) {
                        dArr2[i9] = d5;
                        double d6 = d4 / im2Var.d[i8];
                        int i10 = km2Var.a[i8];
                        for (int i11 = km2Var.d[i8]; i11 < i10; i11++) {
                            int i12 = km2Var.b[i11];
                            dArr2[i12] = dArr2[i12] - (km2Var.e[i11] * d6);
                        }
                        int i13 = im2Var.e[i8];
                        dArr[i13] = d6;
                        iArrA0[i] = i13;
                        i++;
                    }
                }
            }
        }
        int i14 = i;
        i90Var.reset();
        i90Var3.m0(i14);
        lm2Var.u.h = iA;
        i90Var3.D0(lm2Var.l);
        jm2 jm2Var = lm2Var.s;
        jm2Var.c = (i90Var3.R() * 0.05d) + (jm2Var.c * 0.95d);
    }

    @Override // defpackage.lj2
    public final int[] b2() {
        return this.z.a0();
    }

    @Override // defpackage.lj2
    public final dk1 d0() {
        ya2 ya2Var = this.A;
        if (ya2Var != null) {
            return ya2Var;
        }
        li1.g("The constraints body is released when building is done!");
        return null;
    }

    @Override // defpackage.lj2
    public final double d2(int i) {
        return this.w[i];
    }

    @Override // defpackage.lj2
    public final double f1(int i) {
        return this.H.j[i];
    }

    @Override // defpackage.lj2
    public final boolean g2() {
        return this.E.j;
    }

    @Override // defpackage.lj2
    public final zj1 i0() {
        return this.D;
    }

    @Override // defpackage.lj2
    public final boolean i2() {
        return this.I != null;
    }

    @Override // defpackage.lj2
    public final void j(ij2 ij2Var) {
        G2(ij2Var.c);
    }

    @Override // defpackage.lj2
    public final boolean j2(jj2 jj2Var) {
        return !O.y(Math.abs(this.z.h[jj2Var.b.c]), Math.abs(this.L.h[jj2Var.a.d]));
    }

    @Override // defpackage.lj2
    public final zj1 m2() {
        return this.H;
    }

    @Override // defpackage.lj2
    public final zj1 n2() {
        l52 l52Var = this.I;
        if (l52Var != null) {
            return l52Var;
        }
        g52 g52Var = l52.q;
        l52 l52VarR = g52.R(this.t, 1);
        this.I = l52VarR;
        return l52VarR;
    }

    @Override // defpackage.lj2
    public final void o2() {
        double[] dArr = this.H.j;
        l52 l52VarR = this.I;
        int i = this.t;
        if (l52VarR == null) {
            g52 g52Var = l52.q;
            l52VarR = g52.R(i, 1);
            this.I = l52VarR;
        }
        System.arraycopy(dArr, 0, l52VarR.j, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0384  */
    /* JADX WARN: Code duplicated, block: B:84:0x038f  */
    @Override // defpackage.lj2
    public final void p2(jj2 jj2Var) {
        int i;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5 = jj2Var.b.c;
        int iA = jj2Var.a.a();
        super.p2(jj2Var);
        fm2 fm2Var = this.E;
        k52 k52Var = this.B;
        lm2 lm2Var = fm2Var.i;
        boolean z = lm2Var.h;
        int[] iArr2 = this.r;
        if (!z || fm2Var.j || fm2Var.k >= 100) {
            fm2Var.a0(k52Var, iArr2);
        } else {
            jm2 jm2Var = lm2Var.s;
            if (jm2Var.f <= ((double) jm2Var.b) * 2.0d) {
                k01 k01Var = lm2Var.u;
                if (k01Var.h != iA) {
                    k52Var.U1(iA, (i90) k01Var.l);
                    lm2Var.M0((i90) lm2Var.u.l);
                    k01 k01Var2 = lm2Var.u;
                    ((i90) k01Var2.l).A0((i90) k01Var2.m);
                    ((i90) lm2Var.u.l).reset();
                }
                k01 k01Var3 = lm2Var.u;
                if (k01Var3.i != i5) {
                    ((i90) k01Var3.j).o(i5, h32.b);
                    ((i90) lm2Var.u.n).reset();
                    k01 k01Var4 = lm2Var.u;
                    lm2Var.D0((i90) k01Var4.j, (i90) k01Var4.n);
                }
                k01 k01Var5 = lm2Var.u;
                k01Var5.h = -1;
                k01Var5.i = -1;
                int[] iArrA0 = ((i90) k01Var5.n).a0();
                int iJ = ((i90) lm2Var.u.n).j();
                im2 im2Var = lm2Var.r;
                int i6 = im2Var.g[i5];
                int i7 = im2Var.f[i6];
                double d = im2Var.d[i6];
                k01 k01Var6 = lm2Var.u;
                i90 i90Var = (i90) k01Var6.n;
                double[] dArr = ((i90) k01Var6.m).h;
                double d2 = h32.a;
                int iJ2 = i90Var.j();
                int i8 = 0;
                while (true) {
                    i = i6;
                    if (i8 >= iJ2) {
                        break;
                    }
                    int i9 = i90Var.j[i8];
                    d2 = (i90Var.h[i9] * dArr[i9]) + d2;
                    i8++;
                    i6 = i;
                }
                double d3 = d * d2;
                double dAbs = Math.abs(d3);
                if (Double.isFinite(d3)) {
                    if (dAbs > lm2Var.i0() * Math.max(lm2Var.s.d, dAbs)) {
                        km2 km2Var = lm2Var.t;
                        im2 im2Var2 = lm2Var.r;
                        km2Var.getClass();
                        int i10 = im2Var2.f[i];
                        int i11 = im2Var2.e[i];
                        int i12 = km2Var.j[i];
                        int i13 = i12;
                        for (int i14 = km2Var.g[i]; i13 < i14; i14 = i14) {
                            int i15 = i13;
                            if (km2Var.k[i15] != h32.a) {
                                int i16 = im2Var2.g[km2Var.h[i15]];
                                int i17 = km2Var.d[i16];
                                int i18 = km2Var.a[i16];
                                int i19 = i17;
                                while (i19 < i18) {
                                    int i20 = i18;
                                    if (km2Var.b[i19] == i10) {
                                        km2Var.e[i19] = h32.a;
                                    }
                                    i19++;
                                    i18 = i20;
                                }
                            }
                            i13 = i15 + 1;
                        }
                        int i21 = km2Var.d[i];
                        int i22 = km2Var.a[i];
                        while (i21 < i22) {
                            if (km2Var.e[i21] != h32.a) {
                                i4 = i21;
                                int i23 = im2Var2.h[km2Var.b[i4]];
                                int i24 = km2Var.j[i23];
                                int i25 = km2Var.g[i23];
                                while (i24 < i25) {
                                    int i26 = i25;
                                    if (km2Var.h[i24] == i11) {
                                        km2Var.k[i24] = h32.a;
                                    }
                                    i24++;
                                    i25 = i26;
                                }
                            } else {
                                i4 = i21;
                            }
                            i21 = i4 + 1;
                        }
                        im2 im2Var3 = lm2Var.r;
                        int[] iArr3 = im2Var3.f;
                        int i27 = iArr3[i];
                        int i28 = im2Var3.e[i];
                        iArr3[i] = -1;
                        int i29 = im2Var3.c;
                        int i30 = i29 + 1;
                        im2Var3.c = i30;
                        im2Var3.d = h7.l0(i30, im2Var3.d);
                        im2Var3.e = h7.m0(im2Var3.e, im2Var3.c);
                        im2Var3.f = h7.m0(im2Var3.f, im2Var3.c);
                        im2Var3.a(i29, i27, i28, d3);
                        km2 km2Var2 = lm2Var.t;
                        i90 i90Var2 = (i90) lm2Var.u.m;
                        double d4 = lm2Var.l;
                        im2 im2Var4 = lm2Var.r;
                        km2Var2.getClass();
                        int i31 = im2Var4.f[i29];
                        int i32 = im2Var4.e[i29];
                        km2Var2.d = h7.m0(km2Var2.d, i30);
                        km2Var2.a = h7.m0(km2Var2.a, i30);
                        km2Var2.j = h7.m0(km2Var2.j, i30);
                        km2Var2.g = h7.m0(km2Var2.g, i30);
                        int[] iArrM0 = h7.m0(km2Var2.f, i30);
                        km2Var2.f = iArrM0;
                        int[] iArr4 = km2Var2.j;
                        int i33 = km2Var2.i;
                        iArr4[i29] = i33;
                        km2Var2.g[i29] = i33;
                        iArrM0[i29] = 0;
                        int[] iArrA1 = i90Var2.a0();
                        int iJ3 = i90Var2.j();
                        iArr = iArr2;
                        km2Var2.b = h7.m0(km2Var2.b, km2Var2.c + iJ3);
                        km2Var2.e = h7.l0(km2Var2.c + iJ3, km2Var2.e);
                        km2Var2.d[i29] = km2Var2.c;
                        int i34 = 0;
                        while (i34 < iJ3) {
                            int i35 = iArrA1[i34];
                            int i36 = i34;
                            double d5 = i90Var2.h[i35];
                            if (i35 != i31 && Math.abs(d5) > d4) {
                                int[] iArr5 = km2Var2.b;
                                int i37 = km2Var2.c;
                                iArr5[i37] = i35;
                                km2Var2.e[i37] = d5;
                                km2Var2.c = i37 + 1;
                                int i38 = im2Var4.h[i35];
                                int i39 = km2Var2.g[i38];
                                int[] iArr6 = km2Var2.j;
                                int i40 = i39 - iArr6[i38];
                                if (i40 >= km2Var2.f[i38]) {
                                    int i41 = (i40 << 1) + 4;
                                    km2Var2.h = h7.m0(km2Var2.h, km2Var2.i + i41);
                                    km2Var2.k = h7.l0(km2Var2.i + i41, km2Var2.k);
                                    int i42 = km2Var2.j[i38];
                                    int i43 = km2Var2.i;
                                    int i44 = i40 + i42;
                                    int i45 = 0;
                                    while (i42 < i44) {
                                        int i46 = i42;
                                        double[] dArr2 = km2Var2.k;
                                        double d6 = dArr2[i46];
                                        if (d6 != h32.a) {
                                            int[] iArr7 = km2Var2.h;
                                            int i47 = i43 + i45;
                                            iArr7[i47] = iArr7[i46];
                                            dArr2[i47] = d6;
                                            i45++;
                                        }
                                        i42 = i46 + 1;
                                    }
                                    int[] iArr8 = km2Var2.j;
                                    iArr8[i38] = i43;
                                    km2Var2.f[i38] = i41;
                                    km2Var2.i += i41;
                                    iArr6 = iArr8;
                                    i40 = i45;
                                }
                                int i48 = iArr6[i38] + i40;
                                km2Var2.h[i48] = i32;
                                km2Var2.k[i48] = d5;
                                km2Var2.g[i38] = i48 + 1;
                            }
                            i34 = i36 + 1;
                            i90Var2 = i90Var2;
                        }
                        int[] iArr9 = km2Var2.a;
                        int i49 = km2Var2.c;
                        iArr9[i29] = i49;
                        int i50 = i49 - km2Var2.d[i29];
                        int i51 = lm2Var.o.h;
                        int i52 = 0;
                        while (i52 < iJ) {
                            int i53 = iArrA0[i52];
                            double d7 = ((i90) lm2Var.u.n).h[i53];
                            if (i53 == i7 || d7 == h32.a) {
                                i2 = i52;
                                i3 = i50;
                            } else {
                                i2 = i52;
                                i3 = i50;
                                double d8 = (-d) * d7;
                                if (Math.abs(d8) > lm2Var.l) {
                                    lm2Var.o.a(i53, d8);
                                }
                            }
                            i52 = i2 + 1;
                            i50 = i3;
                        }
                        lm2Var.o.b(i7);
                        jm2 jm2Var2 = lm2Var.s;
                        jm2Var2.f += (i50 + lm2Var.o.h) - i51;
                        jm2Var2.d = Math.max(jm2Var2.d, dAbs);
                        jm2Var2.e = Math.min(jm2Var2.e, dAbs);
                        lm2Var.j = null;
                        lm2Var.h = true;
                        if (lm2Var.s.e >= 1.0E-11d) {
                            fm2Var.k++;
                            return;
                        }
                    } else {
                        iArr = iArr2;
                    }
                } else {
                    iArr = iArr2;
                }
                fm2Var.a0(k52Var, iArr);
            } else {
                fm2Var.a0(k52Var, iArr2);
            }
        }
        this.K = true;
    }

    @Override // defpackage.lj2
    public final void q2(boolean z) {
        if (this.F) {
            this.E.a0(this.B, this.r);
            this.F = false;
        }
        if (z) {
            J2();
            H2();
        }
    }

    @Override // defpackage.lj2
    public final void r2() {
        H2();
    }

    @Override // defpackage.lj2
    public final double s1(int i, hj2 hj2Var) {
        return this.z.h[i];
    }

    @Override // defpackage.lj2
    public final boolean s2() {
        fm2 fm2Var = this.E;
        if (fm2Var.k <= 0) {
            return false;
        }
        fm2Var.a0(this.B, this.r);
        J2();
        H2();
        return true;
    }

    @Override // defpackage.lj2
    public final void t2() {
        if (this.I != null) {
            this.I = null;
            J2();
        }
    }

    @Override // defpackage.lj2
    public final double u1(ij2 ij2Var, int i) {
        return this.L.h[i];
    }

    @Override // defpackage.lj2
    public final void v2(int i) {
        kj2 kj2VarC1 = c1(i);
        l2(i);
        if (this.y) {
            double dF2 = this.j[i] - F2(i, kj2VarC1);
            if (dF2 != h32.a) {
                I2(i, dF2);
            }
        }
    }

    @Override // defpackage.lj2
    public final void w2(int i) {
        kj2 kj2VarC1 = c1(i);
        u2(i, kj2.UPPER);
        if (this.y) {
            double dF2 = this.o[i] - F2(i, kj2VarC1);
            if (dF2 != h32.a) {
                I2(i, dF2);
            }
        }
    }

    @Override // defpackage.lj2
    public final void x2(int i, double d) {
        double[] dArr = this.I.j;
        int i2 = this.q[i];
        dArr[i2] = dArr[i2] + d;
        double[] dArr2 = this.w;
        dArr2[i] = dArr2[i] + d;
    }

    @Override // defpackage.lj2
    public final r22 y2(int i) {
        G2(i);
        return new m92(this, I1());
    }

    @Override // defpackage.lj2
    public final double z1(int i) {
        return this.N[i];
    }

    @Override // defpackage.lj2
    public final r22 z2() {
        J2();
        return new q22(this, (byte) 2);
    }
}
