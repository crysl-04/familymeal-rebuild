package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class i90 extends r22 implements yj1, mo2 {
    public static final double n = h32.h;
    public final double[] h;
    public final int[] j;
    public final boolean[] k;
    public boolean l = true;
    public int m = 0;
    public boolean i = true;

    public i90(int i) {
        this.h = new double[i];
        this.j = new int[i];
        this.k = new boolean[i];
    }

    @Override // defpackage.a1
    public final double A(int i) {
        return this.h[i];
    }

    public final void A0(i90 i90Var) {
        i90Var.reset();
        int iJ = j();
        int i = 0;
        for (int i2 = 0; i2 < iJ; i2++) {
            int i3 = this.j[i2];
            double d = this.h[i3];
            if (d != h32.a) {
                i90Var.h[i3] = d;
                i90Var.j[i] = i3;
                i++;
            }
        }
        i90Var.m0(i);
    }

    public final void D0(double d) {
        if (!this.i) {
            i0();
        }
        int i = 0;
        for (int i2 = 0; i2 < this.m; i2++) {
            int[] iArr = this.j;
            int i3 = iArr[i2];
            double[] dArr = this.h;
            if (Math.abs(dArr[i3]) <= d) {
                dArr[i3] = h32.a;
                if (this.l) {
                    this.k[i3] = false;
                }
            } else {
                iArr[i] = i3;
                i++;
            }
        }
        this.m = i;
    }

    public final void F0() {
        if (this.i && this.l) {
            int i = this.m;
            int length = this.h.length / 2;
            boolean[] zArr = this.k;
            if (i < length) {
                for (int i2 = 0; i2 < this.m; i2++) {
                    zArr[this.j[i2]] = false;
                }
            } else {
                Arrays.fill(zArr, false);
            }
        }
        this.l = false;
    }

    public final double R() {
        if (!this.i) {
            i0();
        }
        return ((double) this.m) / ((double) this.h.length);
    }

    public final int[] a0() {
        if (!this.i) {
            i0();
        }
        return this.j;
    }

    public final void d0(int i) {
        if (this.i) {
            boolean z = this.l;
            int[] iArr = this.j;
            boolean[] zArr = this.k;
            if (!z) {
                for (int i2 = 0; i2 < this.m; i2++) {
                    zArr[iArr[i2]] = true;
                }
                this.l = true;
            }
            if (zArr[i]) {
                return;
            }
            zArr[i] = true;
            int i3 = this.m;
            this.m = i3 + 1;
            iArr[i3] = i;
        }
    }

    @Override // defpackage.yj1
    public final void f(int i, double d) {
        if (d != h32.a) {
            double[] dArr = this.h;
            dArr[i] = dArr[i] + d;
            d0(i);
        }
    }

    @Override // defpackage.yj1
    public final void g(long j, Comparable comparable) {
        f(Math.toIntExact(j), xo1.c1(comparable));
    }

    public final void i0() {
        F0();
        this.m = 0;
        double[] dArr = this.h;
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            if (dArr[i] != h32.a) {
                int i2 = this.m;
                this.m = i2 + 1;
                this.j[i2] = i;
            }
        }
        this.i = true;
    }

    public final int j() {
        if (!this.i) {
            i0();
        }
        return this.m;
    }

    public final void m0(int i) {
        if (this.i && this.l && this.m > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                this.k[this.j[i2]] = true;
            }
        } else {
            this.l = i == 0;
        }
        this.m = i;
        this.i = true;
    }

    @Override // defpackage.yj1
    public final void n(long j, c23 c23Var) {
        y(j, c23Var.a(z(j)));
    }

    @Override // defpackage.zj1
    public final void o(int i, double d) {
        this.h[i] = d;
        if (d != h32.a) {
            d0(i);
        }
    }

    @Override // defpackage.zj1
    public final void reset() {
        F0();
        boolean z = this.i;
        double[] dArr = this.h;
        if (!z || this.m >= dArr.length / 2) {
            Arrays.fill(dArr, h32.a);
        } else {
            for (int i = 0; i < this.m; i++) {
                dArr[this.j[i]] = h32.a;
            }
        }
        this.m = 0;
        this.i = true;
        this.l = true;
    }

    @Override // defpackage.mo2
    public final int size() {
        return this.h.length;
    }
}
