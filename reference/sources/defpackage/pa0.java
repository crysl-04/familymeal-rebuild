package defpackage;

import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pa0 extends h3 {
    public final zt K;
    public int[] L;
    public final BitSet M;
    public final double[][] N;
    public final double[][] O;
    public final l52 P;

    public pa0(o10 o10Var, ds1 ds1Var) {
        super(o10Var, ds1Var);
        int iH = this.i.h();
        int i = this.i.i();
        a62 a62Var = new a62();
        a62Var.o = h32.b;
        a62Var.p = h32.a;
        a62Var.q = 0;
        a62Var.r = false;
        this.K = a62Var;
        this.L = new int[16];
        this.M = new BitSet(iH + i);
        this.N = new double[iH][];
        this.O = new double[i][];
        this.P = (l52) tk.p.b(this.i.j(), 1L);
    }

    @Override // defpackage.tk
    public final void C() {
        int[] iArr;
        int i;
        double[] dArr;
        long j;
        boolean zE;
        l52 l52Var;
        BitSet bitSet;
        zt ztVar;
        boolean z;
        double[] dArr2;
        k();
        this.v = -1;
        int[] iArrM = M();
        int[] iArrA = this.w;
        if (iArrA == null) {
            iArrA = this.s.a();
            this.w = iArrA;
        }
        int iJ = J();
        o10 o10Var = this.i;
        int iJ2 = o10Var.j();
        long j2 = iJ;
        g52 g52Var = tk.p;
        l52 l52Var2 = (l52) g52Var.b(j2, 1L);
        double[] dArr3 = l52Var2.j;
        l52 l52Var3 = this.z;
        if (iJ <= iJ2) {
            j = 0;
            zE = this.l.s0();
            if (zE) {
                re1 re1Var = this.y;
                if (j2 == 0) {
                    l52Var3.Z(re1Var);
                    iArr = iArrA;
                    i = iJ;
                    dArr = dArr3;
                } else {
                    int iH = o10Var.h();
                    int iV = V() - 1;
                    while (true) {
                        bitSet = this.M;
                        ztVar = this.K;
                        if (iV < 0) {
                            break;
                        }
                        int i2 = this.L[iV];
                        if (i2 >= iH) {
                            dArr2 = dArr3;
                            if (Arrays.binarySearch(iArrM, i2 - iH) < 0) {
                                ztVar.g1(iV);
                                int[] iArr2 = this.L;
                                System.arraycopy(iArr2, iV + 1, iArr2, iV, V() - iV);
                                bitSet.clear(i2);
                            }
                        } else {
                            dArr2 = dArr3;
                        }
                        iV--;
                        dArr3 = dArr2;
                        iArrA = iArrA;
                    }
                    iArr = iArrA;
                    dArr = dArr3;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= iH) {
                            int length = iArrM.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= length) {
                                    z = true;
                                    break;
                                }
                                int i5 = iArrM[i4] + iH;
                                if (bitSet.get(i5) || U(i5)) {
                                    i4++;
                                }
                            }
                        } else if (bitSet.get(i3) || U(i3)) {
                            i3++;
                        }
                        z = false;
                        break;
                    }
                    if (z) {
                        int iH2 = o10Var.h();
                        double[] dArr4 = new double[iJ];
                        for (int i6 = 0; i6 < iJ; i6++) {
                            int i7 = this.L[i6];
                            double dS = X(i7).S(re1Var);
                            int iH3 = o10Var.h();
                            dArr4[i6] = dS - (i7 < iH3 ? o10Var.c.A(i7) : o10Var.d.A(i7 - iH3));
                        }
                        ztVar.x1(dArr4);
                        k();
                        l52Var3.T1(Double.valueOf(h32.a));
                        T(l52Var3, dArr4, h32.b);
                        l52Var3.G1(re1Var, h32.I);
                        double[] dArr5 = new double[iJ];
                        for (int i8 = 0; i8 < iJ; i8++) {
                            int i9 = this.L[i8];
                            double dS2 = X(i9).S(l52Var3);
                            int iH4 = o10Var.h();
                            dArr5[i8] = dS2 - (i9 < iH4 ? o10Var.c.A(i9) : o10Var.d.A(i9 - iH4));
                        }
                        ztVar.x1(dArr5);
                        T(l52Var3, dArr5, h32.e);
                        for (int i10 = 0; i10 < iJ; i10++) {
                            int iBinarySearch = this.L[i10];
                            if (iBinarySearch >= iH2) {
                                iBinarySearch = Arrays.binarySearch(iArrM, iBinarySearch - iH2) + iH2;
                            }
                            dArr[iBinarySearch] = dArr4[i10] + dArr5[i10];
                        }
                        gy1 gy1Var = o10Var.c;
                        int iH5 = o10Var.h();
                        int i11 = 0;
                        while (true) {
                            wo1 wo1Var = h3.F;
                            if (i11 >= iH5) {
                                int[] iArrM2 = M();
                                int length2 = iArrM2.length;
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= length2) {
                                        i = iJ;
                                        zE = true;
                                        break;
                                    }
                                    int i13 = iArrM2[i12];
                                    int[] iArr3 = iArrM2;
                                    i = iJ;
                                    double dA = o10Var.d.A(i13);
                                    if (Math.abs(v(i13).S(l52Var3) - dA) <= wo1Var.x(dA)) {
                                        i12++;
                                        iJ = i;
                                        iArrM2 = iArr3;
                                    }
                                }
                            } else {
                                double dA2 = gy1Var.A(i11);
                                gy1 gy1Var2 = gy1Var;
                                if (Math.abs(u(i11).S(l52Var3) - dA2) > wo1Var.x(dA2)) {
                                    i = iJ;
                                } else {
                                    i11++;
                                    gy1Var = gy1Var2;
                                }
                            }
                            zE = false;
                            break;
                        }
                        if (!zE) {
                            ztVar.reset();
                            bitSet.clear();
                        }
                    } else {
                        i = iJ;
                        zE = z;
                    }
                }
            } else {
                iArr = iArrA;
                i = iJ;
                dArr = dArr3;
            }
        } else {
            iArr = iArrA;
            i = iJ;
            dArr = dArr3;
            j = 0;
            zE = false;
        }
        if (!zE && (zE = E((l52Var = (l52) g52Var.b(iJ2 + i, 1L))))) {
            long j3 = iJ2;
            l52Var3.Z(l52Var.A1(j3, 1L));
            l52Var2.Z(l52Var.V1(j3, j));
        }
        Double dValueOf = Double.valueOf(h32.a);
        l52 l52Var4 = this.r;
        l52Var4.T1(dValueOf);
        double[] dArr6 = l52Var4.j;
        if (zE) {
            for (int i14 = 0; i14 < o10Var.h(); i14++) {
                dArr6[i14] = dArr[i14];
            }
            for (int i15 = 0; i15 < iArrM.length; i15++) {
                dArr6[o10Var.h() + iArrM[i15]] = dArr[o10Var.h() + i15];
            }
        }
        P(zE, l52Var3, iArrM, iArr);
    }

    @Override // defpackage.h3
    public final void K(int i) {
        super.K(i);
        this.O[i] = null;
    }

    @Override // defpackage.h3
    public final void R() {
        super.R();
        this.K.reset();
        this.M.clear();
    }

    public final void T(l52 l52Var, double[] dArr, double d) {
        int iJ = this.i.j();
        int iV = V();
        for (int i = 0; i < iV; i++) {
            double d2 = dArr[i] * d;
            if (d2 != h32.a) {
                double[] dArrW = W(this.L[i]);
                for (int i2 = 0; i2 < iJ; i2++) {
                    l52Var.f(i2, dArrW[i2] * d2);
                }
            }
        }
    }

    public final boolean U(int i) {
        int iV = V();
        double[] dArrW = W(i);
        double[] dArr = new double[iV + 1];
        for (int i2 = 0; i2 < iV; i2++) {
            dArr[i2] = X(this.L[i2]).U0(dArrW);
        }
        dArr[iV] = X(i).U0(dArrW);
        if (!this.K.e0(new xh(dArr))) {
            return false;
        }
        int[] iArrCopyOf = this.L;
        if (iV == iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iV << 1);
            this.L = iArrCopyOf;
        }
        iArrCopyOf[iV] = i;
        this.M.set(i);
        return true;
    }

    public final int V() {
        no2 no2Var = this.K;
        if (((x) no2Var).h) {
            return no2Var.Z1();
        }
        return 0;
    }

    public final double[] W(int i) {
        int iH = this.i.h();
        me1 me1Var = this.l;
        l52 l52Var = this.P;
        if (i < iH) {
            double[][] dArr = this.N;
            if (dArr[i] == null) {
                me1Var.H1(new c1(u(i)), l52Var);
                dArr[i] = l52Var.u0();
            }
            return dArr[i];
        }
        int i2 = i - iH;
        double[][] dArr2 = this.O;
        if (dArr2[i2] == null) {
            me1Var.H1(new c1(v(i2)), l52Var);
            dArr2[i2] = l52Var.u0();
        }
        return dArr2[i2];
    }

    public final cm2 X(int i) {
        int iH = this.i.h();
        return i < iH ? u(i) : v(i - iH);
    }
}
