package defpackage;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ng1 implements ez0 {
    public static final double n = h32.d;
    public static final wo1 o = wo1.G(2);
    public final int[] b;
    public final double c;
    public final double d;
    public final int e;
    public final ez0 f;
    public boolean g = true;
    public volatile int h;
    public final int[] i;
    public final double[] j;
    public final double[] k;
    public final int[] l;
    public final double[] m;

    public ng1(ii0 ii0Var, ez0 ez0Var) {
        this.e = ii0Var.i;
        this.f = ez0Var;
        List listH = ii0Var.h();
        int size = listH.size();
        this.b = new int[size];
        for (int i = 0; i < size; i++) {
            this.b[i] = ((e33) listH.get(i)).p.h;
        }
        zh0 zh0VarC = ii0Var.C();
        BigDecimal bigDecimalS = zh0VarC.S();
        if (bigDecimalS != null) {
            this.d = bigDecimalS.doubleValue();
            BigDecimal[] bigDecimalArr = new BigDecimal[ii0Var.o.size()];
            Arrays.fill(bigDecimalArr, BigDecimal.ZERO);
            this.c = zh0VarC.N(new x0(bigDecimalArr)).doubleValue();
        } else {
            double d = h32.a;
            this.d = d;
            this.c = d;
        }
        this.h = 0;
        List listH2 = ii0Var.h();
        int size2 = listH2.size();
        this.m = new double[size2];
        this.j = new double[size2];
        this.l = new int[size2];
        this.i = new int[size2];
        this.k = new double[size2];
        double d2 = h32.a;
        for (int i2 = 0; i2 < size2; i2++) {
            BigDecimal bigDecimal = ((e33) listH2.get(i2)).i;
            if (bigDecimal != null && bigDecimal.signum() != 0) {
                double dAbs = Math.abs(bigDecimal.doubleValue());
                this.k[i2] = dAbs;
                if (dAbs > d2) {
                    d2 = dAbs;
                }
            }
        }
        if (wo1.D(d2, o.j)) {
            Arrays.fill(this.k, 1.0E-9d);
            return;
        }
        for (int i3 = 0; i3 < size2; i3++) {
            double[] dArr = this.k;
            dArr[i3] = Math.max(dArr[i3] / d2, 1.0E-9d);
        }
    }

    @Override // defpackage.ez0
    public final List a(int i) {
        List listA = this.f.a(i);
        for (int i2 = 0; i2 < listA.size(); i2++) {
            Comparator comparator = (Comparator) listA.get(i2);
            Comparator comparator2 = un1.v;
            if (comparator == comparator2 || comparator == un1.u) {
                int i3 = this.e;
                if (i3 == 2) {
                    listA.set(i2, comparator2);
                } else if (i3 == 1) {
                    listA.set(i2, un1.u);
                }
            }
        }
        return listA;
    }

    @Override // defpackage.ez0
    public final wo1 b() {
        return this.f.b();
    }

    @Override // defpackage.ez0
    public final wo1 c() {
        return this.f.c();
    }

    @Override // defpackage.ez0
    public final cz0 d() {
        return this.f.d();
    }

    public final boolean e(gs1 gs1Var, double d) {
        if (gs1Var != null) {
            if (!Double.isFinite(d)) {
                return false;
            }
            double d2 = gs1Var.n;
            double d3 = this.d;
            double d4 = h32.a;
            int i = this.e;
            if (d3 > d4) {
                double dH = h(d);
                double dI = i(d2);
                double dF = f(d2);
                if (i == 1) {
                    if (dH <= dI + dF) {
                        return false;
                    }
                } else if (dH >= dI - dF) {
                    return false;
                }
            }
            if (!this.f.b().y(d2, d)) {
                return false;
            }
            if ((i != 2 || d >= d2) && (i != 1 || d <= d2)) {
                return false;
            }
        }
        return true;
    }

    public final double f(double d) {
        return Math.max(this.d * 1.0E-6d, Math.max(1.0E-7d, Math.abs(d) * 1.0E-9d));
    }

    public final void g(un1 un1Var, double d) {
        int i = un1Var.j;
        double d2 = un1Var.k;
        if (i >= 0) {
            double d3 = un1Var.i;
            boolean zIsFinite = Double.isFinite(d);
            double d4 = n;
            if (zIsFinite && Double.isFinite(d2)) {
                double d5 = this.e == 2 ? d - d2 : d2 - d;
                double d6 = h32.a;
                if (d5 < d6) {
                    d5 = d6;
                }
                if (d5 > 1.0E-9d) {
                    d4 = d5;
                }
            }
            j(i, un1Var.r, d4 / d3);
        }
    }

    public final double h(double d) {
        double d2 = h32.a;
        double d3 = this.d;
        if (d3 <= d2 || !Double.isFinite(d)) {
            return d;
        }
        double dF = f(d);
        int i = this.e;
        double d4 = this.c;
        return ((i == 1 ? Math.floor(((d + dF) - d4) / d3) : Math.ceil(((d - dF) - d4) / d3)) * d3) + d4;
    }

    public final double i(double d) {
        double d2 = h32.a;
        double d3 = this.d;
        if (d3 <= d2 || !Double.isFinite(d)) {
            return d;
        }
        double d4 = this.c;
        return (Math.rint((d - d4) / d3) * d3) + d4;
    }

    public final void j(int i, boolean z, double d) {
        if (z) {
            synchronized (this.m) {
                int[] iArr = this.l;
                int i2 = iArr[i];
                double[] dArr = this.m;
                double d2 = (dArr[i] * ((double) i2)) + d;
                int i3 = i2 + 1;
                dArr[i] = d2 / ((double) i3);
                iArr[i] = i3;
            }
            return;
        }
        synchronized (this.j) {
            int[] iArr2 = this.i;
            int i4 = iArr2[i];
            double[] dArr2 = this.j;
            double d3 = (dArr2[i] * ((double) i4)) + d;
            int i5 = i4 + 1;
            dArr2[i] = d3 / ((double) i5);
            iArr2[i] = i5;
        }
    }

    public final String toString() {
        return Arrays.toString(this.b);
    }
}
