package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class um2 extends oj2 {
    public static final ch L;
    public static final vh M;
    public final cm2[] E;
    public final dh F;
    public xh G;
    public double H;
    public final dh I;
    public final bm2 J;
    public double K;

    static {
        vh vhVar = xh.k;
        ch chVar = dh.m;
        L = new ch(vhVar);
        M = vhVar;
    }

    public um2(ea1 ea1Var) {
        super(ea1Var);
        double d = h32.a;
        this.H = d;
        this.K = d;
        vh vhVar = xh.k;
        wo1 wo1Var = cm2.o;
        bm2 bm2Var = new bm2(vhVar);
        long jRound = Math.round(Math.sqrt(this.s));
        ns0 ns0Var = bm2Var.l;
        bm2Var.l = new ns0(Math.max(5L, jRound), ns0Var.a, ns0Var.c);
        this.J = bm2Var;
        this.E = new cm2[this.s];
        int i = 0;
        while (true) {
            int i2 = this.s;
            if (i >= i2) {
                ch chVar = L;
                this.I = chVar.c(i2);
                this.F = chVar.c(this.t);
                int i3 = this.t;
                M.getClass();
                this.G = xh.l2(i3);
                return;
            }
            this.E[i] = this.J.p(this.t);
            i++;
        }
    }

    public static double R2(cm2 cm2Var, double d, int i) {
        double dA = cm2Var.A(i);
        if (dA == h32.a) {
            li1.g("Pivot element is zero!");
            return 0.0d;
        }
        if (dA == h32.b) {
            return d;
        }
        f32 f32Var = h32.v;
        f32Var.getClass();
        sm smVar = new sm(f32Var, dA);
        cm2Var.O1(smVar);
        return smVar.a(d);
    }

    @Override // defpackage.oj2
    public final void H2(int i, int i2) {
        cm2 cm2Var = this.E[i];
        dh dhVar = this.I;
        double dR2 = R2(cm2Var, dhVar.A(i), i2);
        dhVar.o(i, dR2);
        Q2(i, i2, cm2Var, dR2);
    }

    @Override // defpackage.k1
    public final double J(int i, int i2) {
        int i3 = this.t;
        int i4 = this.s;
        if (i < i4) {
            return i2 < i3 ? this.E[i].A(i2) : this.I.A(i);
        }
        if (i == i4) {
            return i2 < i3 ? this.F.A(i2) : this.K;
        }
        return i2 < i3 ? this.G.j[i2] : this.H;
    }

    @Override // defpackage.oj2
    public final boolean J2(int i, double d) {
        double d2;
        int[] iArr = this.r;
        int iH = ys.H(0, iArr.length, i, iArr);
        if (iH >= 0) {
            cm2[] cm2VarArr = this.E;
            cm2 cm2Var = cm2VarArr[iH];
            dh dhVar = this.I;
            double dA = dhVar.A(iH);
            cm2 cm2VarC = this.J.p(this.t);
            e32 e32Var = h32.q;
            if (dA <= d) {
                if (dA < d) {
                    cm2Var.m1(h32.b, cm2VarC);
                    cm2VarC.o(i, h32.a);
                    d2 = dA - d;
                }
                return true;
            }
            cm2Var.m1(h32.e, cm2VarC);
            cm2VarC.o(i, h32.a);
            d2 = d - dA;
            int iI2 = I2(cm2VarC, new b90(this, this.s, (byte) 2));
            if (iI2 >= 0) {
                double dR2 = R2(cm2VarC, d2, iI2);
                Q2(-1, iI2, cm2VarC, dR2);
                cm2VarArr[iH] = cm2VarC;
                dhVar.o(iH, dR2);
                r22 r22VarG2 = i0();
                r22VarG2.size();
                long jCount = r22VarG2.count() - 1;
                long j = -1;
                do {
                    if (!(j < jCount)) {
                        B2(iH, iI2);
                        return true;
                    }
                    j++;
                } while (r22VarG2.z(j) >= h32.a);
            }
        }
        return false;
    }

    @Override // defpackage.oj2
    public final double K2() {
        return this.G != null ? this.H : h32.a;
    }

    @Override // defpackage.oj2
    public final double L2() {
        return this.K;
    }

    @Override // defpackage.oj2
    public final a90 M2() {
        ea1 ea1Var = this.u;
        return new a90(this, ea1Var.d, ea1Var.h(), (byte) 1);
    }

    @Override // defpackage.oj2
    public final r22 N2() {
        return new b90(this, this.u.d, (byte) 3);
    }

    @Override // defpackage.oj2
    public final r22 O2() {
        return new tm2(this, (byte) 0);
    }

    @Override // defpackage.oj2
    public final void P2(int i, double d) {
        super.P2(i, d);
        for (int i2 = 0; i2 < this.s; i2++) {
            double dA = this.E[i2].A(i);
            if (dA != h32.a) {
                this.I.f(i2, (-d) * dA);
            }
        }
    }

    public final void Q2(int i, int i2, cm2 cm2Var, double d) {
        wo1 wo1Var;
        cm2[] cm2VarArr = this.E;
        int length = cm2VarArr.length;
        int i3 = 0;
        while (true) {
            wo1Var = oj2.D;
            if (i3 >= length) {
                break;
            }
            if (i3 != i) {
                cm2 cm2Var2 = cm2VarArr[i3];
                double d2 = -cm2Var2.A(i2);
                if (d2 != h32.a && !wo1.D(d2, wo1Var.j)) {
                    cm2Var.m1(d2, cm2Var2);
                    this.I.f(i3, d2 * d);
                }
            }
            i3++;
        }
        dh dhVar = this.F;
        double d3 = -dhVar.A(i2);
        double d4 = h32.a;
        if (d3 != d4 && (this.G != null || !wo1.D(d3, wo1Var.j))) {
            cm2Var.m1(d3, dhVar);
            this.K = (d3 * d) + this.K;
        }
        xh xhVar = this.G;
        if (xhVar != null) {
            double d5 = -xhVar.j[i2];
            if (d5 != d4) {
                cm2Var.m1(d5, xhVar);
                this.H = (d5 * d) + this.H;
            }
        }
    }

    @Override // defpackage.no2
    public final int T() {
        return this.t + 1;
    }

    @Override // defpackage.lj2
    public final double U0() {
        double dA = -this.K;
        int i = 0;
        while (true) {
            int[] iArr = this.q;
            if (i >= iArr.length) {
                return dA + this.B;
            }
            int i2 = iArr[i];
            kj2 kj2VarC1 = c1(i2);
            kj2 kj2Var = kj2.LOWER;
            dh dhVar = this.F;
            if (kj2VarC1 == kj2Var) {
                double d = this.j[i2];
                if (d != h32.a) {
                    dA += dhVar.A(i2) * d;
                }
            } else if (kj2VarC1 == kj2.UPPER) {
                double d2 = this.o[i2];
                if (d2 != h32.a) {
                    dA = (dhVar.A(i2) * d2) + dA;
                }
            }
            i++;
        }
    }

    @Override // defpackage.no2
    public final int Z1() {
        xh xhVar = this.G;
        int i = this.s;
        return xhVar != null ? i + 2 : i + 1;
    }

    @Override // defpackage.dk1
    public final void b0(double d, int i, int i2) {
        int i3 = this.t;
        int i4 = this.s;
        if (i < i4) {
            if (i2 < i3) {
                this.E[i].o(i2, d);
                return;
            } else {
                this.I.o(i, d);
                return;
            }
        }
        if (i == i4) {
            if (i2 < i3) {
                this.F.o(i2, d);
                return;
            } else {
                this.K = d;
                return;
            }
        }
        if (i2 < i3) {
            this.G.j[i2] = d;
        } else {
            this.H = d;
        }
    }

    @Override // defpackage.lj2
    public final double d2(int i) {
        xh xhVar = this.G;
        int[] iArr = this.q;
        if (xhVar == null) {
            return this.F.A(iArr[i]);
        }
        return xhVar.j[iArr[i]];
    }

    @Override // defpackage.lj2
    public final boolean i2() {
        return this.G != null;
    }

    @Override // defpackage.lj2
    public final void m0(double[] dArr) {
        int i = 0;
        while (true) {
            int[] iArr = this.r;
            if (i >= iArr.length) {
                return;
            }
            dArr[iArr[i]] = this.I.A(i);
            i++;
        }
    }

    @Override // defpackage.lj2
    public final zj1 n2() {
        if (this.G == null) {
            M.getClass();
            this.G = xh.l2(this.t);
        }
        return new tm2(this, (byte) 1);
    }

    @Override // defpackage.lj2
    public final void o2() {
        xh xhVar = this.G;
        int i = this.t;
        if (xhVar == null) {
            M.getClass();
            this.G = xh.l2(i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            xh xhVar2 = this.G;
            xhVar2.j[i2] = this.F.A(i2);
        }
        this.H = this.K;
    }

    @Override // defpackage.lj2
    public final void t2() {
        this.G = null;
    }

    @Override // defpackage.lj2
    public final void x2(int i, double d) {
        this.G.f(this.q[i], d);
    }
}
