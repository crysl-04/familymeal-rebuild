package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class z80 extends ru0 implements ne1, me1, le1 {
    public final boolean n;
    public transient re1 o;
    public double[] p;

    public z80(fy1 fy1Var, boolean z) {
        super(fy1Var);
        this.o = null;
        this.n = z;
    }

    public final void D0(boolean z, gy1 gy1Var) {
        int i = this.m;
        if (gy1Var instanceof l52) {
            l52 l52Var = (l52) gy1Var;
            lt.K(z, i, l52Var.n, d1(), ((l52) this.l).j, Math.max(1, i), this.p, l52Var.j, Math.max(1, l52Var.o));
        } else {
            l52 l52Var2 = (l52) l52.q.Q(gy1Var);
            D0(z, l52Var2);
            l52Var2.a(gy1Var);
        }
    }

    public final void F0(final boolean z, gy1 gy1Var) {
        int iK;
        int i = this.m;
        if (gy1Var instanceof l52) {
            l52 l52Var = (l52) gy1Var;
            if (l52Var.o == i) {
                final int iD1 = d1();
                int i2 = l52Var.n;
                final double[] dArr = ((l52) this.l).j;
                final int iMax = Math.max(1, i);
                final double[] dArr2 = l52Var.j;
                final int iMax2 = Math.max(1, i);
                sh.n("TRTRS", "n", iD1 >= 0);
                sh.n("TRTRS", "nrhs", i2 >= 0);
                sh.n("TRTRS", "lda", iMax >= Math.max(1, iD1));
                sh.n("TRTRS", "ldb", iMax2 >= Math.max(1, iD1));
                if (iD1 == 0) {
                    iK = 0;
                } else if (i2 <= 3) {
                    iK = p02.K(iD1, iMax, dArr);
                    if (iK == 0) {
                        for (int i3 = 0; i3 < i2; i3++) {
                            m02.o(true, z, false, iD1, dArr, iMax, dArr2, i3 * iMax2);
                        }
                        iK = 0;
                    }
                } else {
                    u8 u8Var = fr2.a;
                    iK = p02.K(iD1, iMax, dArr);
                    if (iK == 0) {
                        int iJ = oe1.j(48, ((double) (iD1 * iD1)) / 2.0d);
                        if (i2 > iJ) {
                            u8 u8Var2 = fr2.a;
                            u8Var2.a = iJ;
                            u8Var2.b(0, i2, new sb0() { // from class: er2
                                @Override // defpackage.sb0
                                public final void a(int i4, int i5) {
                                    while (i4 < i5) {
                                        rz1.s(true, z, false, iD1, dArr, iMax, dArr2, i4 * iMax2);
                                        i4++;
                                    }
                                }
                            });
                        } else {
                            for (int i4 = 0; i4 < i2; i4++) {
                                rz1.s(true, z, false, iD1, dArr, iMax, dArr2, i4 * iMax2);
                            }
                        }
                        iK = 0;
                    }
                }
                if (iK == 0) {
                    return;
                }
            }
        }
        gy1 gy1Var2 = this.l;
        if (z) {
            gy1Var.O(gy1Var2, false, true);
        } else {
            gy1Var.E0(gy1Var2, false, false);
        }
    }

    @Override // defpackage.me1
    public final re1 H1(e1 e1Var, gy1 gy1Var) {
        e1Var.a(gy1Var);
        D0(true, gy1Var);
        F0(false, gy1Var);
        int i = this.m;
        int i2 = this.k;
        if (i2 < i) {
            return gy1Var.A1(i2, gy1Var.T());
        }
        if (i2 <= i) {
            return gy1Var;
        }
        return new b(gy1Var, new z93(gy1Var.C0(), i2 - i, (int) gy1Var.B1()), (byte) 0);
    }

    @Override // defpackage.le1
    public final int Y(double d) {
        l52 l52Var = (l52) this.l;
        int iD1 = d1();
        int i = 0;
        for (int i2 = 0; i2 < iD1; i2++) {
            if (Math.abs(l52Var.p.J(i2, i2)) > d) {
                i++;
            }
        }
        return i;
    }

    @Override // defpackage.x
    public final boolean a0() {
        return Z1() >= T() && n1();
    }

    @Override // defpackage.ul2
    public final gy1 j(int i, int i2, int i3) {
        return m0(i, i3);
    }

    @Override // defpackage.le1
    public final double j1() {
        Comparable comparableP1 = this.l.p1();
        return Math.max(Double.MIN_NORMAL, xo1.c1(comparableP1)) * i0();
    }

    @Override // defpackage.ne1
    public final boolean p0(e1 e1Var) {
        double[] dArr;
        int i;
        double dAbs;
        double d;
        reset();
        l52 l52Var = (l52) A0(e1Var);
        int i2 = this.m;
        int iD1 = d1();
        double[] dArr2 = this.p;
        if (dArr2 == null || dArr2.length != iD1) {
            this.p = new double[iD1];
        }
        int i3 = this.k;
        double[] dArr3 = l52Var.j;
        int iMax = Math.max(1, i2);
        double[] dArr4 = this.p;
        sh.n("GEQRF", "m", i2 >= 0);
        sh.n("GEQRF", "n", i3 >= 0);
        sh.n("GEQRF", "lda", iMax >= Math.max(1, i2));
        if (i2 != 0 && i3 != 0) {
            u8 u8Var = rq0.a;
            int i4 = 0;
            for (int iMin = Math.min(i2, i3); i4 < iMin; iMin = iMin) {
                int i5 = i4 * iMax;
                int i6 = i4 + 1;
                if (i6 < i2) {
                    double dMax = h32.a;
                    int i7 = i4 + 1;
                    int i8 = i7;
                    while (i8 < i2) {
                        dMax = Math.max(dMax, Math.abs(dArr3[i5 + i8]));
                        i8++;
                        i2 = i2;
                    }
                    int i9 = i2;
                    double d2 = h32.a;
                    if (dMax == d2) {
                        i = i5;
                        dArr = dArr3;
                        i2 = i9;
                        dAbs = d2;
                    } else {
                        int i10 = i5 + i4;
                        double d3 = d2;
                        double dMax2 = Math.max(Math.abs(dArr3[i10]), dMax);
                        i2 = i9;
                        for (int i11 = i7; i11 < i2; i11++) {
                            double d4 = dArr3[i5 + i11] / dMax2;
                            d3 = (d4 * d4) + d3;
                        }
                        dArr = dArr3;
                        double d5 = dArr3[i10] / dMax2;
                        double d6 = (d5 * d5) + d3;
                        i = i5;
                        double dSqrt = Math.sqrt(d6);
                        if (Math.copySign(h32.b, d5) < h32.a) {
                            dArr[i10] = dSqrt * dMax2;
                            d = d5 - dSqrt;
                        } else {
                            dArr[i10] = (-dSqrt) * dMax2;
                            d = d5 + dSqrt;
                        }
                        for (int i12 = i7; i12 < i2; i12++) {
                            int i13 = i + i12;
                            dArr[i13] = (dArr[i13] / dMax2) / d;
                        }
                        dAbs = Math.abs(d) / dSqrt;
                    }
                } else {
                    dArr = dArr3;
                    i = i5;
                    dAbs = h32.a;
                }
                double d7 = dAbs;
                dArr4[i4] = d7;
                if (d7 != h32.a && i6 < i3) {
                    int i14 = i + i4;
                    double d8 = dArr[i14];
                    dArr[i14] = h32.b;
                    rq0.a(i2, dArr, i14, d7, dArr, 0, iMax, i4, i6, i3);
                    dArr[i14] = d8;
                }
                dArr3 = dArr;
                i4 = i6;
            }
        }
        for (int i15 = 0; i15 < iD1; i15++) {
            double d9 = this.p[i15];
            double d10 = h32.a;
        }
        this.j = null;
        this.h = true;
        return true;
    }

    @Override // defpackage.x, defpackage.ne1
    public final void reset() {
        super.reset();
        this.o = null;
    }

    @Override // defpackage.g01
    public final void x1(double[] dArr) {
        fy1 fy1Var = this.i;
        fy1Var.getClass();
        int length = dArr.length;
        mi0 mi0VarA = fy1Var.a(length, 1L);
        for (int i = 0; i < length; i++) {
            mi0VarA.o(i, dArr[i]);
        }
        gy1 gy1Var = (gy1) mi0VarA.build();
        D0(true, gy1Var);
        F0(false, gy1Var);
        gy1Var.R1(dArr);
    }
}
