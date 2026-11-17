package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class xh extends z22 {
    public static final vh k = new vh(je1.n, 1);
    public final double[] j;

    public xh(double[] dArr) {
        super(k, dArr.length);
        this.j = dArr;
    }

    public static xh l2(int i) {
        return new xh(new double[i]);
    }

    @Override // defpackage.ry1, defpackage.a1
    public final double A(int i) {
        return this.j[i];
    }

    @Override // defpackage.ry1, defpackage.a1
    public final int D(int i) {
        return (int) Math.round(this.j[i]);
    }

    @Override // defpackage.zk
    public final void F0(dk1 dk1Var) {
        double[] dArr = this.j;
        int iMin = Math.min(dArr.length, dk1Var.size());
        for (int i = 0; i < iMin; i++) {
            dk1Var.o(i, dArr[i]);
        }
    }

    @Override // defpackage.ry1
    public final void Q1(int i, Comparable comparable) {
        lt.v(((Double) comparable).doubleValue(), i, this.j);
    }

    @Override // defpackage.a1
    public final double S(a1 a1Var) {
        double dA = h32.a;
        double[] dArr = this.j;
        int iMin = Math.min(dArr.length, (int) a1Var.count());
        for (int i = 0; i < iMin; i++) {
            dA += a1Var.A(i) * dArr[i];
        }
        return dA;
    }

    @Override // defpackage.ry1
    public final void U0(int i, Comparable comparable) {
        double[] dArr = this.j;
        dArr[i] = xo1.c1(comparable) + dArr[i];
    }

    @Override // defpackage.ry1
    public final Comparable U1(int i) {
        return Double.valueOf(this.j[i]);
    }

    public void Z(a1 a1Var) {
        boolean z = a1Var instanceof xh;
        int i = 0;
        double[] dArr = this.j;
        if (!z) {
            u8 u8Var = gj0.h;
            int iMin = Math.min(dArr.length, a1Var.size());
            while (i < iMin) {
                dArr[i] = a1Var.A(i);
                i++;
            }
            return;
        }
        double[] dArr2 = ((xh) a1Var).j;
        u8 u8Var2 = gj0.h;
        int iMin2 = Math.min(dArr.length, dArr2.length);
        while (i < iMin2) {
            dArr[i] = dArr2[i];
            i++;
        }
    }

    @Override // defpackage.ry1
    public final void b2(int i, int i2, int i3, a1 a1Var, f32 f32Var) {
        ls.H(this.j, i, i2, i3, a1Var, f32Var, this);
    }

    @Override // defpackage.ry1
    public final void c1(int i, int i2, int i3, int i4) {
        double[] dArr = this.j;
        int i5 = 0;
        if (i3 == 1) {
            while (i5 < i4) {
                int i6 = i + i5;
                double d = dArr[i6];
                int i7 = i2 + i5;
                dArr[i6] = dArr[i7];
                dArr[i7] = d;
                i5++;
            }
            return;
        }
        while (i5 < i4) {
            double d2 = dArr[i];
            dArr[i] = dArr[i2];
            dArr[i2] = d2;
            i += i3;
            i2 += i3;
            i5++;
        }
    }

    @Override // defpackage.ry1
    public final void c2(int i, int i2, int i3, tm tmVar, a1 a1Var) {
        ls.H(this.j, i, i2, i3, this, tmVar, a1Var);
    }

    @Override // defpackage.ry1, defpackage.a1
    public final short d(int i) {
        return (short) Math.round(this.j[i]);
    }

    @Override // defpackage.ry1
    public final void d2(int i, int i2, int i3, c23 c23Var) {
        double[] dArr = this.j;
        ys.K(dArr, i, i2, i3, dArr, c23Var);
    }

    @Override // defpackage.ry1
    public final void e2(int i, c23 c23Var) {
        double[] dArr = this.j;
        dArr[i] = c23Var.a(dArr[i]);
    }

    @Override // defpackage.zk
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xh) && Arrays.equals(this.j, ((xh) obj).j);
    }

    @Override // defpackage.yj1
    public final void f(int i, double d) {
        double[] dArr = this.j;
        dArr[i] = dArr[i] + d;
    }

    @Override // defpackage.ry1
    public final void f2(long j, int i, a1 a1Var, f32 f32Var) {
        double dZ = a1Var.z(j);
        double[] dArr = this.j;
        dArr[i] = dZ - dArr[i];
    }

    @Override // defpackage.ry1
    public final void g2(long j, int i, tm tmVar, a1 a1Var) {
        double[] dArr = this.j;
        dArr[i] = tmVar.c(dArr[i], a1Var.z(j));
    }

    @Override // defpackage.ry1
    public final void h2(int i, c23 c23Var) {
        double[] dArr = this.j;
        dArr[i] = c23Var.a(dArr[i]);
    }

    @Override // defpackage.zk
    public int hashCode() {
        return Arrays.hashCode(this.j) + 31;
    }

    @Override // defpackage.ry1
    public final void i2(int i, Comparable comparable) {
        this.j[i] = comparable != null ? xo1.c1(comparable) : 0.0d;
    }

    @Override // defpackage.ry1
    public final void j2(int i, int i2, int i3, im imVar) {
        double[] dArr = this.j;
        if (i3 == 1) {
            while (i < i2) {
                imVar.b(dArr[i]);
                i++;
            }
        } else {
            while (i < i2) {
                imVar.b(dArr[i]);
                i += i3;
            }
        }
    }

    @Override // defpackage.ry1
    public final void k2(int i, im imVar) {
        imVar.b(this.j[i]);
    }

    @Override // defpackage.a1
    public final void m1(double d, yj1 yj1Var) {
        boolean z = yj1Var instanceof xh;
        double[] dArr = this.j;
        if (z) {
            aa3.w(((xh) yj1Var).j, 0, d, dArr, 0, 0, dArr.length);
            return;
        }
        for (int i = 0; i < dArr.length; i++) {
            yj1Var.f(i, dArr[i] * d);
        }
    }

    @Override // defpackage.ry1, defpackage.zj1
    public final void o(int i, double d) {
        this.j[i] = d;
    }

    @Override // defpackage.ry1, defpackage.a1
    public final float q(int i) {
        return (float) this.j[i];
    }

    @Override // defpackage.ry1, defpackage.a1
    public final long r(int i) {
        return Math.round(this.j[i]);
    }

    @Override // defpackage.zj1
    public final void reset() {
        Arrays.fill(this.j, h32.a);
    }

    @Override // defpackage.ry1, defpackage.a1
    public final byte v(int i) {
        return (byte) Math.round(this.j[i]);
    }
}
