package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class x80 extends ru0 implements k31 {
    public transient int[] n;
    public final ly1 o;

    public x80(fy1 fy1Var) {
        super(fy1Var);
        this.n = null;
        this.o = new ly1();
    }

    public final int[] D0() {
        int[] iArr = this.n;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = this.o.c;
        int length = iArr2.length;
        int[] iArr3 = new int[length];
        int[] iArr4 = new int[length];
        for (int i = 0; i < length; i++) {
            iArr3[i] = i;
            iArr4[i] = i;
        }
        int[] iArr5 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr4[iArr2[i2]];
            iArr5[i2] = i3 + 1;
            int i4 = iArr3[i2];
            iArr3[i3] = i4;
            iArr4[i4] = i3;
            iArr3[i2] = iArr2[i2];
            iArr4[iArr2[i2]] = i2;
        }
        this.n = iArr5;
        return iArr5;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    @Override // defpackage.me1
    public final re1 H1(e1 e1Var, gy1 gy1Var) {
        e1Var.a(gy1Var);
        int i = this.m;
        if (N() && (gy1Var instanceof l52)) {
            l52 l52Var = (l52) gy1Var;
            if (l52Var.o == i) {
                ys.J(false, i, l52Var.n, ((l52) this.l).j, Math.max(1, i), D0(), l52Var.j, Math.max(1, i));
            } else {
                x.R(this.o, gy1Var);
                gy1 gy1Var2 = this.l;
                gy1Var.O(gy1Var2, true, false);
                gy1Var.E0(gy1Var2, false, false);
            }
        } else {
            x.R(this.o, gy1Var);
            gy1 gy1Var3 = this.l;
            gy1Var.O(gy1Var3, true, false);
            gy1Var.E0(gy1Var3, false, false);
        }
        return gy1Var;
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
        return N() && n1();
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ne1
    public final boolean p0(e1 e1Var) {
        int i;
        int i2;
        int i3;
        double[] dArr;
        int i4;
        double[] dArr2;
        int i5;
        int i6;
        reset();
        gy1 gy1VarA0 = A0(e1Var);
        int i7 = this.m;
        ly1 ly1Var = this.o;
        ly1Var.c(i7);
        int iD1 = d1();
        int[] iArr = new int[iD1];
        int i8 = this.m;
        int i9 = this.k;
        double[] dArr3 = ((l52) gy1VarA0).j;
        int i10 = 1;
        int iMax = Math.max(1, i8);
        sh.n("GETRF", "m", i8 >= 0);
        sh.n("GETRF", "n", i9 >= 0);
        sh.n("GETRF", "lda", iMax >= Math.max(1, i8));
        if (i8 != 0 && i9 != 0) {
            u8 u8Var = tq0.a;
            double[] dArr4 = new double[i8];
            int iMin = Math.min(i8, i9);
            int i11 = 0;
            int i12 = 0;
            while (i11 < iMin) {
                int i13 = i11 * iMax;
                double d = h32.a;
                int i14 = i11;
                int i15 = i14;
                while (i14 < i8) {
                    double dAbs = Math.abs(dArr3[i13 + i14]);
                    if (dAbs > d) {
                        i15 = i14;
                        d = dAbs;
                    }
                    i14++;
                }
                iArr[i11] = i15 + 1;
                if (i15 != i11) {
                    for (int i16 = 0; i16 < i9; i16++) {
                        int i17 = i16 * iMax;
                        int i18 = i17 + i15;
                        double d2 = dArr3[i18];
                        int i19 = i17 + i11;
                        dArr3[i18] = dArr3[i19];
                        dArr3[i19] = d2;
                    }
                }
                int i20 = i11 * iMax;
                double d3 = dArr3[i20 + i11];
                if (d3 == h32.a) {
                    i = i10;
                    i3 = i11;
                    i2 = i9;
                    i6 = 0;
                    dArr = dArr4;
                    i4 = iMax;
                    dArr2 = dArr3;
                    i5 = i8;
                } else {
                    int i21 = i11 + 1;
                    for (int i22 = i21; i22 < i8; i22++) {
                        int i23 = i20 + i22;
                        double d4 = dArr3[i23] / d3;
                        dArr3[i23] = d4;
                        dArr4[i22] = d4;
                    }
                    i = i10;
                    int iJ = oe1.j(56, (i8 - i11) - i10);
                    if ((i9 - i11) - 1 > iJ) {
                        u8 u8Var2 = tq0.a;
                        u8Var2.a = iJ;
                        i3 = i11;
                        dArr = dArr4;
                        i4 = iMax;
                        dArr2 = dArr3;
                        i5 = i8;
                        u8Var2.b(i21, i9, new sq0(i5, dArr2, i4, dArr, i3, (byte) 0));
                        i2 = i9;
                    } else {
                        i2 = i9;
                        tq0.a(i8, dArr3, iMax, dArr4, i11, i21, i2);
                        i3 = i11;
                        dArr = dArr4;
                        i4 = iMax;
                        dArr2 = dArr3;
                        i5 = i8;
                    }
                    i6 = i;
                }
                if (i6 == 0 && i12 == 0) {
                    i12 = i3 + 1;
                }
                i8 = i5;
                dArr3 = dArr2;
                iMax = i4;
                dArr4 = dArr;
                i9 = i2;
                i11 = i3 + 1;
                i10 = i;
            }
        }
        boolean z = i10;
        for (int i24 = 0; i24 < iD1; i24++) {
            ly1Var.a(iArr[i24] - 1, i24);
        }
        this.n = iArr;
        this.j = null;
        this.h = z;
        return z;
    }

    @Override // defpackage.g01
    public final void x1(double[] dArr) {
        int i = this.m;
        if (N() && dArr.length == i) {
            ys.J(false, i, 1, ((l52) this.l).j, Math.max(1, i), D0(), dArr, Math.max(1, i));
            return;
        }
        gy1 gy1Var = this.l;
        ly1 ly1Var = this.o;
        if (ly1Var.b) {
            ly1Var.b(dArr, ly1Var.d());
        }
        gy1Var.B0(false, true, dArr);
        gy1Var.q1(false, false, dArr);
    }
}
