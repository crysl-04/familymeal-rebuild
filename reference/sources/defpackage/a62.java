package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class a62 extends c62 implements zt {
    public double o;
    public double p;
    public int q;
    public boolean r;

    @Override // defpackage.me1
    public final re1 H1(e1 e1Var, gy1 gy1Var) {
        e1Var.a(gy1Var);
        e62 e62Var = this.m;
        gy1Var.O(e62Var, false, false);
        gy1Var.E0(e62Var, false, true);
        return gy1Var;
    }

    @Override // defpackage.le1
    public final int Y(double d) {
        double dSqrt = Math.sqrt(d);
        e62 e62Var = this.m;
        int i = 0;
        for (int i2 = 0; i2 < this.q; i2++) {
            if (e62Var.J(i2, i2) > dSqrt) {
                i++;
            }
        }
        return i;
    }

    @Override // defpackage.x
    public final boolean a0() {
        return this.r && this.p > j1();
    }

    @Override // defpackage.zt
    public final boolean e0(xh xhVar) {
        double[] dArr = xhVar.j;
        int i = this.h ? this.n : 0;
        int i2 = i + 1;
        if (xhVar.i != i2) {
            wg.m(jp1.i(i2, "The column must be of length ", "!"));
            return false;
        }
        double[][] dArr2 = this.l;
        double[] dArr3 = new double[Math.max(i2, i << 1)];
        double d = h32.a;
        for (int i3 = 0; i3 < i; i3++) {
            double[] dArr4 = dArr2[i3];
            double d2 = dArr[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                d2 -= dArr4[i4] * dArr3[i4];
            }
            double d3 = d2 / dArr4[i3];
            dArr3[i3] = d3;
            d += d3 * d3;
        }
        double d4 = dArr[i];
        double d5 = d4 - d;
        if (d5 <= d4 * 1.0E-12d) {
            return false;
        }
        h32.H.getClass();
        dArr3[i] = Math.sqrt(d5);
        double[][] dArr5 = new double[i2][];
        for (int i5 = 0; i5 < i; i5++) {
            double[] dArrCopyOf = dArr2[i5];
            if (dArrCopyOf.length < i2) {
                dArrCopyOf = Arrays.copyOf(dArrCopyOf, Math.max(i2, dArrCopyOf.length << 1));
            }
            dArr5[i5] = dArrCopyOf;
        }
        dArr5[i] = dArr3;
        dArr5[0] = Arrays.copyOf(dArr5[0], i2);
        D0(dArr5);
        if (i == 0) {
            this.o = d5;
            this.p = d5;
        } else {
            f32 f32Var = h32.A;
            double d6 = this.o;
            f32Var.getClass();
            this.o = Math.max(d6, d5);
            f32 f32Var2 = h32.B;
            double d7 = this.p;
            f32Var2.getClass();
            this.p = Math.min(d7, d5);
        }
        this.q = i2;
        this.r = true;
        this.j = null;
        this.h = true;
        return true;
    }

    @Override // defpackage.zt
    public final void g1(int i) {
        int i2 = i;
        int i3 = this.h ? this.n : 0;
        if (i2 < 0 || i2 >= i3) {
            wg.m(wi0.g("Index ", i2, " is not in the range [0, ", i3, ")!"));
            return;
        }
        double[][] dArr = this.l;
        int i4 = i3 - 1;
        double[][] dArr2 = new double[i4][];
        System.arraycopy(dArr, 0, dArr2, 0, i2);
        System.arraycopy(dArr, i2 + 1, dArr2, i2, i4 - i2);
        while (i2 < i4) {
            double[] dArr3 = dArr2[i2];
            double d = dArr3[i2];
            int i5 = i2 + 1;
            double d2 = dArr3[i5];
            double dHypot = Math.hypot(d, d2);
            double d3 = d / dHypot;
            double d4 = d2 / dHypot;
            dArr3[i2] = dHypot;
            dArr3[i5] = h32.a;
            for (int i6 = i5; i6 < i4; i6++) {
                double[] dArr4 = dArr2[i6];
                double d5 = dArr4[i2];
                double d6 = dArr4[i5];
                dArr4[i2] = (d4 * d6) + (d3 * d5);
                dArr4[i5] = (d6 * d3) - (d5 * d4);
            }
            i2 = i5;
        }
        if (i4 > 0) {
            dArr2[0] = Arrays.copyOf(dArr2[0], i4);
        }
        D0(dArr2);
        this.o = Double.MIN_NORMAL;
        this.p = Double.MAX_VALUE;
        for (int i7 = 0; i7 < i4; i7++) {
            double d7 = dArr2[i7][i7];
            double d8 = d7 * d7;
            f32 f32Var = h32.A;
            double d9 = this.o;
            f32Var.getClass();
            this.o = Math.max(d9, d8);
            f32 f32Var2 = h32.B;
            double d10 = this.p;
            f32Var2.getClass();
            this.p = Math.min(d10, d8);
        }
        this.q = i4;
        this.r = true;
        this.j = null;
        this.h = true;
    }

    @Override // defpackage.ul2
    public final gy1 j(int i, int i2, int i3) {
        return m0(i, i3);
    }

    @Override // defpackage.le1
    public final double j1() {
        return i0() * h32.d * this.o;
    }

    @Override // defpackage.ne1
    public final boolean p0(e1 e1Var) {
        boolean z;
        double[][] dArrA0 = A0(e1Var, false);
        e62 e62Var = this.m;
        e1Var.a(e62Var);
        int i = this.n;
        this.r = this.k == i;
        this.o = Double.MIN_NORMAL;
        this.p = Double.MAX_VALUE;
        this.q = 0;
        int i2 = 0;
        while (true) {
            z = this.r;
            if (!z || i2 >= i) {
                break;
            }
            double[] dArr = dArrA0[i2];
            f32 f32Var = h32.A;
            double[] dArr2 = dArr;
            double dJ = e62Var.J(i2, i2) - es.f0(0, 0, 0, i2, dArr2, dArr);
            double d = h32.a;
            f32Var.getClass();
            double dMax = Math.max(dJ, d);
            this.o = Math.max(this.o, dMax);
            f32 f32Var2 = h32.B;
            double d2 = this.p;
            f32Var2.getClass();
            this.p = Math.min(d2, dMax);
            h32.H.getClass();
            double dSqrt = Math.sqrt(dMax);
            dArr2[i2] = dSqrt;
            boolean z2 = this.r && dSqrt > d;
            this.r = z2;
            if (z2) {
                this.q++;
            }
            int i3 = i2 + 1;
            for (int i4 = i3; i4 < i; i4++) {
                double[] dArr3 = dArr2;
                double[] dArr4 = dArrA0[i4];
                double dJ2 = e62Var.J(i4, i2);
                double dF0 = es.f0(0, 0, 0, i2, dArr4, dArr3);
                dArr2 = dArr3;
                dArr4[i2] = (dJ2 - dF0) / dSqrt;
            }
            i2 = i3;
        }
        this.j = null;
        this.h = z;
        return z;
    }

    @Override // defpackage.g01
    public final void x1(double[] dArr) {
        e62 e62Var = this.m;
        e62Var.B0(false, false, dArr);
        e62Var.q1(true, false, dArr);
    }
}
