package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class d62 extends c62 implements k31 {
    public final ly1 o = new ly1();

    public final boolean F0(e1 e1Var) {
        if (!(e1Var instanceof l52) || !N()) {
            return false;
        }
        l52 l52Var = (l52) e1Var;
        return l52Var.o == this.n && l52Var.n == 1;
    }

    @Override // defpackage.me1
    public final re1 H1(e1 e1Var, gy1 gy1Var) {
        ly1 ly1Var = this.o;
        if (e1Var != gy1Var && F0(e1Var) && F0(gy1Var)) {
            double[] dArr = ((l52) e1Var).j;
            double[] dArr2 = ((l52) gy1Var).j;
            int[] iArr = ly1Var.c;
            for (int i = 0; i < iArr.length; i++) {
                dArr2[i] = dArr[iArr[i]];
            }
        } else {
            e1Var.a(gy1Var);
            x.R(ly1Var, gy1Var);
        }
        e62 e62Var = this.m;
        if (!F0(gy1Var)) {
            gy1Var.O(e62Var, true, false);
            gy1Var.E0(e62Var, false, false);
            return gy1Var;
        }
        double[] dArr3 = ((l52) gy1Var).j;
        e62Var.B0(false, true, dArr3);
        e62Var.q1(false, false, dArr3);
        return gy1Var;
    }

    @Override // defpackage.le1
    public final int Y(double d) {
        e62 e62Var = this.m;
        int iD1 = d1();
        int i = 0;
        for (int i2 = 0; i2 < iD1; i2++) {
            if (Math.abs(e62Var.J(i2, i2)) > d) {
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
        double dDoubleValue = ((Double) this.m.k()).doubleValue();
        return Math.max(Double.MIN_NORMAL, dDoubleValue) * i0();
    }

    @Override // defpackage.ne1
    public final boolean p0(e1 e1Var) {
        int i = 0;
        double[][] dArrA0 = A0(e1Var, false);
        e1Var.a(this.m);
        int i2 = this.n;
        int i3 = this.k;
        ly1 ly1Var = this.o;
        ly1Var.c(i2);
        int iMin = Math.min(i2, i3);
        while (i < iMin) {
            e32 e32Var = h32.q;
            double d = dArrA0[i][i];
            e32Var.getClass();
            double dAbs = Math.abs(d);
            int i4 = i + 1;
            int i5 = i;
            for (int i6 = i4; i6 < i2; i6++) {
                e32 e32Var2 = h32.q;
                double d2 = dArrA0[i6][i];
                e32Var2.getClass();
                double dAbs2 = Math.abs(d2);
                if (dAbs2 > dAbs) {
                    i5 = i6;
                    dAbs = dAbs2;
                }
            }
            if (i5 != i) {
                double[] dArr = dArrA0[i];
                dArrA0[i] = dArrA0[i5];
                dArrA0[i5] = dArr;
                ly1Var.a(i, i5);
            }
            double[] dArr2 = dArrA0[i];
            double d3 = dArr2[i];
            if (wo1.t(d3, h32.a) != 0) {
                int i7 = i4;
                while (i7 < i2) {
                    int i8 = i7;
                    double[] dArr3 = dArrA0[i8];
                    double d4 = dArr3[i] / d3;
                    int i9 = i2;
                    int i10 = i;
                    if (wo1.t(d4, h32.a) != 0) {
                        dArr3[i10] = d4;
                        aa3.w(dArr3, 0, -d4, dArr2, 0, i4, i3);
                    }
                    i7 = i8 + 1;
                    i2 = i9;
                    i = i10;
                }
            }
            i2 = i2;
            i = i4;
        }
        this.j = null;
        this.h = true;
        return true;
    }

    @Override // defpackage.g01
    public final void x1(double[] dArr) {
        ly1 ly1Var = this.o;
        if (ly1Var.b) {
            ly1Var.b(dArr, ly1Var.d());
        }
        e62 e62Var = this.m;
        e62Var.B0(false, true, dArr);
        e62Var.q1(false, false, dArr);
    }
}
