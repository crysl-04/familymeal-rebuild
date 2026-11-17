package defpackage;

import java.math.MathContext;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cm2 extends zk {
    public static final wo1 o = wo1.I(MathContext.DECIMAL64);
    public int i;
    public final y22 j;
    public final ns0 k;
    public int[] l;
    public final int m;
    public ry1 n;

    public cm2(y22 y22Var, ns0 ns0Var, int i) {
        super(y22Var);
        this.i = 0;
        this.m = i;
        this.j = y22Var;
        this.k = ns0Var;
        long j = ns0Var.b;
        this.l = new int[(int) j];
        Objects.requireNonNull(y22Var);
        this.n = (ry1) y22Var.o(j);
    }

    @Override // defpackage.a1
    public final double A(int i) {
        int iQ1 = Q1(i);
        return iQ1 >= 0 ? this.n.A(iQ1) : h32.a;
    }

    @Override // defpackage.zk
    public final void A0(long j, a1 a1Var, f32 f32Var) {
        a1 a1Var2;
        f32 f32Var2;
        double d = h32.a;
        f32Var.getClass();
        if (!i32.l.B(h32.b, d - d)) {
            wg.m("SparseArray zero modification!");
            return;
        }
        int i = 0;
        while (i < this.i) {
            long j2 = this.l[i];
            if (j2 < 0 || j2 >= j || 0 != 0) {
                a1Var2 = a1Var;
                f32Var2 = f32Var;
            } else {
                a1Var2 = a1Var;
                f32Var2 = f32Var;
                this.n.f2(j2, i, a1Var2, f32Var2);
            }
            i++;
            a1Var = a1Var2;
            f32Var = f32Var2;
        }
    }

    @Override // defpackage.zj1
    public final void B(long j, Comparable comparable) {
        d2(j, Q1((int) j), comparable, false);
    }

    @Override // defpackage.zk
    public final void D0(long j, tm tmVar, a1 a1Var) {
        tm tmVar2;
        a1 a1Var2;
        double d = h32.a;
        if (!i32.l.B(h32.b, tmVar.c(d, d))) {
            wg.m("SparseArray zero modification!");
            return;
        }
        int i = 0;
        while (i < this.i) {
            long j2 = this.l[i];
            if (j2 < 0 || j2 >= j || 0 != 0) {
                tmVar2 = tmVar;
                a1Var2 = a1Var;
            } else {
                tmVar2 = tmVar;
                a1Var2 = a1Var;
                this.n.g2((int) j2, i, tmVar2, a1Var2);
            }
            i++;
            tmVar = tmVar2;
            a1Var = a1Var2;
        }
    }

    @Override // defpackage.yj1
    public final void F(long j, double d) {
        int iQ1 = Q1((int) j);
        if (iQ1 >= 0) {
            this.n.f(iQ1, d);
        } else {
            y(j, d);
        }
    }

    @Override // defpackage.zk
    public final void F0(dk1 dk1Var) {
        dk1Var.reset();
        b2(dk1Var);
    }

    @Override // defpackage.a1
    public final Comparable G(long j) {
        int iQ1 = Q1((int) j);
        return iQ1 >= 0 ? this.n.U1(iQ1) : (Comparable) this.j.k.k().get();
    }

    @Override // defpackage.zk
    public final void M0(long j, long j2, long j3, im imVar) {
        long j4 = 0;
        for (int i = 0; i < this.i; i++) {
            long j5 = this.l[i];
            if (j5 >= j && j5 < j2 && (j5 - j) % j3 == 0) {
                this.n.k2(i, imVar);
                j4++;
            }
        }
        if (j4 < (((j2 - j) + j3) - 1) / j3) {
            imVar.b(h32.a);
        }
    }

    @Override // defpackage.zk, defpackage.yj1
    public final void O1(c23 c23Var) {
        double d = h32.a;
        if (o.y(d, ((sm) c23Var).a(d))) {
            wg.m("SparseArray zero-value modification!");
        } else {
            this.n.O1(c23Var);
        }
    }

    public final int Q1(int i) {
        return Arrays.binarySearch(this.l, 0, this.i, i);
    }

    @Override // defpackage.a1
    public final void R1(double[] dArr) {
        Arrays.fill(dArr, h32.a);
        for (int i = 0; i < this.i; i++) {
            dArr[this.l[i]] = this.n.A(i);
        }
    }

    @Override // defpackage.a1
    public final double S(a1 a1Var) {
        double dA = h32.a;
        for (int i = 0; i < this.i; i++) {
            dA += a1Var.A(this.l[i]) * this.n.A(i);
        }
        return dA;
    }

    @Override // defpackage.a1
    /* JADX INFO: renamed from: T1, reason: merged with bridge method [inline-methods] */
    public final am2 b() {
        return new am2(this.l, this.n, -1, this.i - 1);
    }

    public final double U0(double[] dArr) {
        double dA = h32.a;
        for (int i = 0; i < this.i; i++) {
            dA += this.n.A(i) * dArr[this.l[i]];
        }
        return dA;
    }

    public final void U1(int i) {
        if (i >= 0) {
            this.i--;
            if (this.n.a0()) {
                while (i < this.i) {
                    int[] iArr = this.l;
                    int i2 = i + 1;
                    iArr[i] = iArr[i2];
                    ry1 ry1Var = this.n;
                    ry1Var.o(i, ry1Var.A(i2));
                    i = i2;
                }
                return;
            }
            while (i < this.i) {
                int[] iArr2 = this.l;
                int i3 = i + 1;
                iArr2[i] = iArr2[i3];
                ry1 ry1Var2 = this.n;
                ry1Var2.i2(i, ry1Var2.U1(i3));
                i = i3;
            }
        }
    }

    public final void b2(dk1 dk1Var) {
        int i = 0;
        if (a0()) {
            while (i < this.i) {
                dk1Var.o(this.l[i], this.n.A(i));
                i++;
            }
        } else {
            while (i < this.i) {
                dk1Var.B(this.l[i], this.n.U1(i));
                i++;
            }
        }
    }

    public final void c1(int i, int i2) {
        if (i == i2 || this.i == 0) {
            return;
        }
        int iQ1 = Q1(i);
        int iQ2 = Q1(i2);
        boolean z = iQ1 >= 0;
        boolean z2 = iQ2 >= 0;
        if (!z) {
            if (z2) {
                boolean zA0 = a0();
                ry1 ry1Var = this.n;
                if (zA0) {
                    double dA = ry1Var.A(iQ2);
                    U1(iQ2);
                    o(i, dA);
                    return;
                } else {
                    Comparable comparableU1 = ry1Var.U1(iQ2);
                    U1(iQ2);
                    B(i, comparableU1);
                    return;
                }
            }
            return;
        }
        if (z2) {
            boolean zA1 = a0();
            ry1 ry1Var2 = this.n;
            if (zA1) {
                double dA2 = ry1Var2.A(iQ1);
                ry1 ry1Var3 = this.n;
                ry1Var3.o(iQ1, ry1Var3.A(iQ2));
                this.n.o(iQ2, dA2);
                return;
            }
            Comparable comparableU2 = ry1Var2.U1(iQ1);
            ry1 ry1Var4 = this.n;
            ry1Var4.i2(iQ1, ry1Var4.U1(iQ2));
            this.n.i2(iQ2, comparableU2);
            return;
        }
        if (z2) {
            return;
        }
        boolean zA2 = a0();
        ry1 ry1Var5 = this.n;
        if (zA2) {
            double dA3 = ry1Var5.A(iQ1);
            U1(iQ1);
            o(i2, dA3);
        } else {
            Comparable comparableU3 = ry1Var5.U1(iQ1);
            U1(iQ1);
            B(i2, comparableU3);
        }
    }

    public final void c2(int i, int i2, double d, boolean z) {
        int[] iArr;
        if (i2 >= 0) {
            this.n.o(i2, d);
            return;
        }
        if (z || wo1.t(d, h32.a) != 0) {
            int i3 = -(i2 + 1);
            int i4 = this.i;
            int i5 = i4 + 1;
            int[] iArr2 = this.l;
            if (i5 <= iArr2.length) {
                while (true) {
                    iArr = this.l;
                    if (i4 <= i3) {
                        break;
                    }
                    int i6 = i4 - 1;
                    iArr[i4] = iArr[i6];
                    ry1 ry1Var = this.n;
                    ry1Var.o(i4, ry1Var.A(i6));
                    i4--;
                }
                iArr[i3] = i;
                this.n.o(i3, d);
            } else {
                int intExact = Math.toIntExact(this.k.b(iArr2.length));
                int[] iArr3 = new int[intExact];
                ry1 ry1Var2 = (ry1) this.j.p(intExact);
                for (int i7 = 0; i7 < i3; i7++) {
                    iArr3[i7] = this.l[i7];
                    ry1Var2.o(i7, this.n.A(i7));
                }
                iArr3[i3] = i;
                ry1Var2.o(i3, d);
                while (true) {
                    int[] iArr4 = this.l;
                    if (i3 >= iArr4.length) {
                        break;
                    }
                    int i8 = i3 + 1;
                    iArr3[i8] = iArr4[i3];
                    ry1Var2.o(i8, this.n.A(i3));
                    i3 = i8;
                }
                this.l = iArr3;
                this.n = ry1Var2;
            }
            this.i++;
        }
    }

    @Override // defpackage.mo2
    public final long count() {
        return this.m;
    }

    @Override // defpackage.zk
    public final void d0(long j, long j2, long j3, c23 c23Var) {
        if (!i32.l.B(h32.b, c23Var.a(h32.a))) {
            wg.m("SparseArray zero modification!");
            return;
        }
        for (int i = 0; i < this.i; i++) {
            long j4 = this.l[i];
            if (j4 >= j && j4 < j2 && (j4 - j) % j3 == 0) {
                this.n.e2(i, c23Var);
            }
        }
    }

    public final void d2(long j, int i, Comparable comparable, boolean z) {
        int[] iArr;
        int i2 = (int) j;
        if (i >= 0) {
            this.n.i2(i, comparable);
            return;
        }
        y22 y22Var = this.j;
        if (z || !comparable.equals(y22Var.k.k().get())) {
            int i3 = -(i + 1);
            int i4 = this.i;
            int i5 = i4 + 1;
            int[] iArr2 = this.l;
            if (i5 <= iArr2.length) {
                while (true) {
                    iArr = this.l;
                    if (i4 <= i3) {
                        break;
                    }
                    int i6 = i4 - 1;
                    iArr[i4] = iArr[i6];
                    ry1 ry1Var = this.n;
                    ry1Var.i2(i4, ry1Var.U1(i6));
                    i4--;
                }
                iArr[i3] = i2;
                this.n.i2(i3, comparable);
            } else {
                int intExact = Math.toIntExact(this.k.b(iArr2.length));
                int[] iArr3 = new int[intExact];
                ry1 ry1Var2 = (ry1) y22Var.p(intExact);
                for (int i7 = 0; i7 < i3; i7++) {
                    iArr3[i7] = this.l[i7];
                    ry1Var2.i2(i7, this.n.U1(i7));
                }
                iArr3[i3] = i2;
                ry1Var2.i2(i3, comparable);
                while (true) {
                    int[] iArr4 = this.l;
                    if (i3 >= iArr4.length) {
                        break;
                    }
                    int i8 = i3 + 1;
                    iArr3[i8] = iArr4[i3];
                    ry1Var2.i2(i8, this.n.U1(i3));
                    i3 = i8;
                }
                this.l = iArr3;
                this.n = ry1Var2;
            }
            this.i++;
        }
    }

    @Override // defpackage.yj1
    public final void f(int i, double d) {
        int iQ1 = Q1(i);
        if (iQ1 >= 0) {
            this.n.f(iQ1, d);
        } else {
            o(i, d);
        }
    }

    @Override // defpackage.yj1
    public final void g(long j, Comparable comparable) {
        int iQ1 = Q1((int) j);
        if (iQ1 >= 0) {
            this.n.U0(iQ1, comparable);
        } else {
            B(j, comparable);
        }
    }

    @Override // defpackage.zk
    public final void j(long j, long j2, long j3, long j4) {
        int i = (int) j;
        int i2 = (int) j2;
        int i3 = (int) j4;
        for (int i4 = 0; i4 < i3; i4++) {
            c1(i, i2);
            int i5 = (int) j3;
            i += i5;
            i2 += i5;
        }
    }

    @Override // defpackage.a1
    public final void m1(double d, yj1 yj1Var) {
        for (int i = 0; i < this.i; i++) {
            yj1Var.f(this.l[i], this.n.A(i) * d);
        }
    }

    @Override // defpackage.yj1
    public final void n(long j, c23 c23Var) {
        B(j, c23Var.b(G(j)));
    }

    @Override // defpackage.zj1
    public final void o(int i, double d) {
        c2(i, Q1(i), d, false);
    }

    @Override // defpackage.zj1
    public final void reset() {
        this.i = 0;
    }

    @Override // defpackage.mo2
    public final int size() {
        return this.m;
    }

    @Override // defpackage.z0
    public final void t(long j, im imVar) {
        if (a0()) {
            imVar.b(z(j));
        } else {
            imVar.d(G(j));
        }
    }

    @Override // defpackage.zk, defpackage.z0
    public final void w0(long j, im imVar) {
        int iQ1 = Q1(0);
        if (iQ1 < 0) {
            iQ1 = -(iQ1 + 1);
        }
        int iQ2 = Q1((int) j);
        if (iQ2 < 0) {
            iQ2 = -(iQ2 + 1);
        }
        if (j > iQ2 - iQ1) {
            imVar.b(h32.a);
        }
        while (iQ1 < iQ2) {
            this.n.k2(iQ1, imVar);
            iQ1++;
        }
    }

    @Override // defpackage.zj1
    public final void w1(float f, long j) {
        int i = (int) j;
        c2(i, Q1(i), f, false);
    }

    @Override // defpackage.zj1
    public final void y(long j, double d) {
        int i = (int) j;
        c2(i, Q1(i), d, false);
    }

    @Override // defpackage.a1
    public final double z(long j) {
        int iQ1 = Q1((int) j);
        return iQ1 >= 0 ? this.n.A(iQ1) : h32.a;
    }
}
