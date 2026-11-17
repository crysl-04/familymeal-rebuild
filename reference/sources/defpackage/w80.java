package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class w80 extends ru0 implements zt {
    public double n;
    public double o;
    public int p;
    public boolean q;

    public final void D0(int i) {
        gy1 gy1Var = this.l;
        this.n = Double.MIN_NORMAL;
        this.o = Double.MAX_VALUE;
        this.p = i;
        for (int i2 = 0; i2 < i; i2++) {
            double dJ = gy1Var.J(i2, i2);
            double d = dJ * dJ;
            f32 f32Var = h32.A;
            double d2 = this.n;
            f32Var.getClass();
            this.n = Math.max(d2, d);
            f32 f32Var2 = h32.B;
            double d3 = this.o;
            f32Var2.getClass();
            this.o = Math.min(d3, d);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    @Override // defpackage.me1
    public final re1 H1(e1 e1Var, gy1 gy1Var) {
        e1Var.a(gy1Var);
        int i = this.m;
        if (N() && (gy1Var instanceof l52)) {
            l52 l52Var = (l52) gy1Var;
            if (l52Var.o == i) {
                int i2 = l52Var.n;
                double[] dArr = ((l52) this.l).j;
                vs.G(i, i2, Math.max(1, i), Math.max(1, i), dArr, l52Var.j);
            } else {
                gy1 gy1Var2 = this.l;
                gy1Var.O(gy1Var2, false, false);
                gy1Var.E0(gy1Var2, false, true);
            }
        } else {
            gy1 gy1Var3 = this.l;
            gy1Var.O(gy1Var3, false, false);
            gy1Var.E0(gy1Var3, false, true);
        }
        return gy1Var;
    }

    @Override // defpackage.le1
    public final int Y(double d) {
        double dSqrt = Math.sqrt(d);
        gy1 gy1Var = this.l;
        int i = 0;
        for (int i2 = 0; i2 < this.p; i2++) {
            if (gy1Var.J(i2, i2) > dSqrt) {
                i++;
            }
        }
        return i;
    }

    @Override // defpackage.x
    public final boolean a0() {
        return this.q && this.o > j1();
    }

    @Override // defpackage.zt
    public final boolean e0(xh xhVar) {
        int i = this.h ? this.m : 0;
        int i2 = i + 1;
        if (xhVar.i != i2) {
            wg.m(jp1.i(i2, "The column must be of length ", "!"));
            return false;
        }
        uc2 uc2VarH = this.i.h();
        gy1 gy1Var = this.l;
        ArrayList arrayList = new ArrayList(i);
        double d = h32.a;
        for (int i3 = 0; i3 < i; i3++) {
            vc2 vc2VarE = uc2VarH.e(xhVar.U1(i3));
            for (int i4 = 0; i4 < i3; i4++) {
                vc2VarE = vc2VarE.m0(uc2VarH.e(gy1Var.h0(i3, i4)).s1((vc2) arrayList.get(i4)));
            }
            vc2 vc2Var = (vc2) vc2VarE.g2(gy1Var.J(i3, i3));
            arrayList.add(vc2Var);
            double dA1 = vc2Var.a1();
            d += dA1 * dA1;
        }
        long j = i;
        double dA0 = uc2VarH.e(xhVar.U1((int) j)).A0();
        double d2 = dA0 - d;
        if (d2 <= dA0 * 1.0E-12d) {
            return false;
        }
        gy1 gy1VarM0 = m0(i2, i2);
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = i5; i6 < i; i6++) {
                gy1VarM0.y0(i6, i5, gy1Var.h0(i6, i5));
            }
            gy1 gy1Var2 = gy1VarM0;
            gy1Var2.y0(j, i5, (Comparable) ((vc2) arrayList.get(i5)).T0().get());
            gy1VarM0 = gy1Var2;
        }
        h32.H.getClass();
        gy1VarM0.b0(Math.sqrt(d2), i, i);
        A0(gy1VarM0);
        D0(this.m);
        this.q = true;
        this.j = null;
        this.h = true;
        return true;
    }

    @Override // defpackage.zt
    public final void g1(int i) {
        vc2 vc2VarC;
        vc2 vc2VarK;
        int i2 = i;
        int i3 = this.h ? this.m : 0;
        if (i2 < 0 || i2 >= i3) {
            wg.m(wi0.g("Index ", i2, " is not in the range [0, ", i3, ")!"));
            return;
        }
        uc2 uc2VarH = this.i.h();
        gy1 gy1Var = this.l;
        int i4 = i3 - 1;
        ArrayList arrayList = new ArrayList(i4);
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 != i2) {
                ArrayList arrayList2 = new ArrayList(i5 + 1);
                for (int i6 = 0; i6 <= i5; i6++) {
                    arrayList2.add(uc2VarH.e(gy1Var.h0(i5, i6)));
                }
                arrayList.add(arrayList2);
            }
        }
        while (i2 < i4) {
            List list = (List) arrayList.get(i2);
            vc2 vc2Var = (vc2) list.get(i2);
            int i7 = i2 + 1;
            vc2 vc2Var2 = (vc2) list.get(i7);
            double dA1 = vc2Var.a1();
            double dHypot = Math.hypot(dA1, vc2Var2.a1());
            vc2 vc2Var3 = (vc2) vc2Var.T0().g2(dHypot);
            vc2 vc2Var4 = (vc2) vc2Var2.T0().g2(dHypot);
            if (dA1 > h32.a) {
                vc2VarC = (vc2) ((vc2) vc2Var.X1()).s1(vc2Var2).h((-dA1) / dHypot);
                uc2VarH = uc2VarH;
                vc2VarK = uc2VarH.s(dA1 / dHypot);
            } else {
                vc2VarC = uc2VarH.c();
                vc2VarK = uc2VarH.k();
            }
            list.set(i2, uc2VarH.s(dHypot));
            list.remove(i7);
            for (int i8 = i7; i8 < i4; i8++) {
                List list2 = (List) arrayList.get(i8);
                vc2 vc2Var5 = (vc2) list2.get(i2);
                vc2 vc2Var6 = (vc2) list2.get(i7);
                list2.set(i2, vc2Var5.s1(vc2Var3).z1(vc2Var6.s1(vc2Var4)));
                list2.set(i7, vc2Var5.s1(vc2VarC).z1(vc2Var6.s1(vc2VarK)));
            }
            i2 = i7;
        }
        gy1 gy1VarM0 = m0(i4, i4);
        for (int i9 = 0; i9 < i4; i9++) {
            List list3 = (List) arrayList.get(i9);
            for (int i10 = 0; i10 <= i9; i10++) {
                gy1VarM0.y0(i9, i10, (Comparable) ((vc2) list3.get(i10)).get());
            }
        }
        A0(gy1VarM0);
        D0(this.m);
        this.q = true;
        this.j = null;
        this.h = true;
    }

    @Override // defpackage.ul2
    public final gy1 j(int i, int i2, int i3) {
        return m0(i, i3);
    }

    @Override // defpackage.le1
    public final double j1() {
        return i0() * h32.d * this.n;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bf  */
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
        boolean z = this.m == this.k;
        this.n = Double.MIN_NORMAL;
        this.o = Double.MAX_VALUE;
        this.p = 0;
        if (z) {
            int i7 = this.m;
            double[] dArr3 = ((l52) gy1VarA0).j;
            int iMax = Math.max(1, i7);
            sh.n("POTRF", "n", i7 >= 0);
            sh.n("POTRF", "lda", iMax >= Math.max(1, i7));
            if (i7 == 0) {
                i2 = 0;
            } else {
                u8 u8Var = jt1.a;
                double[] dArr4 = new double[i7];
                int i8 = 0;
                while (true) {
                    if (i8 >= i7) {
                        i = i7;
                        i2 = 0;
                        break;
                    }
                    int i9 = (i8 * iMax) + i8;
                    double d = dArr3[i9];
                    if (d <= h32.a) {
                        i2 = i8 + 1;
                    } else {
                        double dSqrt = Math.sqrt(d);
                        dArr3[i9] = dSqrt;
                        int i10 = i8 + 1;
                        int i11 = i9 + 1;
                        int i12 = i10;
                        while (i12 < i7) {
                            double d2 = dArr3[i11] / dSqrt;
                            dArr3[i11] = d2;
                            dArr4[i12] = d2;
                            i12++;
                            i11++;
                        }
                        int i13 = (i7 - i8) - 1;
                        int iJ = oe1.j(56, ((double) i13) / 2.0d);
                        if (i13 > iJ) {
                            u8 u8Var2 = jt1.a;
                            u8Var2.a = iJ;
                            int i14 = i8;
                            dArr = dArr4;
                            i4 = iMax;
                            dArr2 = dArr3;
                            i5 = i7;
                            u8Var2.b(i10, i5, new sq0(i5, dArr2, i4, dArr, i14, (byte) 1));
                            i3 = i10;
                        } else {
                            int i15 = i8;
                            double[] dArr5 = dArr4;
                            int i16 = iMax;
                            double[] dArr6 = dArr3;
                            i3 = i10;
                            jt1.a(i7, dArr6, i16, dArr5, i15, i3, i7);
                            dArr = dArr5;
                            i4 = i16;
                            dArr2 = dArr6;
                            i5 = i7;
                        }
                        i7 = i5;
                        dArr3 = dArr2;
                        iMax = i4;
                        dArr4 = dArr;
                        i8 = i3;
                    }
                }
                if (i2 == 0) {
                    i6 = i;
                } else {
                    i6 = i2 - 1;
                }
                D0(i6);
                z = i2 == 0;
            }
            i = i7;
            if (i2 == 0) {
                i6 = i;
            } else {
                i6 = i2 - 1;
            }
            D0(i6);
            z = i2 == 0;
        }
        this.q = z;
        this.j = null;
        this.h = z;
        return z;
    }

    @Override // defpackage.x, defpackage.ne1
    public final void reset() {
        super.reset();
        this.q = false;
    }

    @Override // defpackage.g01
    public final void x1(double[] dArr) {
        int i = this.m;
        if (N() && dArr.length == i) {
            vs.G(i, 1, Math.max(1, i), Math.max(1, i), ((l52) this.l).j, dArr);
        } else {
            gy1 gy1Var = this.l;
            gy1Var.B0(false, false, dArr);
            gy1Var.q1(true, false, dArr);
        }
    }
}
