package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class h3 extends j00 {
    public static final wo1 E;
    public static final wo1 F;
    public static final double G;
    public static final wo1 H;
    public static final wo1 I;
    public static final wo1 J;
    public transient double[] A;
    public transient double[] B;
    public boolean C;
    public final l52 D;
    public final xu0 s;
    public final int t;
    public final BitSet u;
    public int v;
    public transient int[] w;
    public transient int[] x;
    public re1 y;
    public final l52 z;

    static {
        wo1 wo1VarH = wo1.H(12, 14);
        RoundingMode roundingMode = RoundingMode.HALF_DOWN;
        E = wo1VarH.L(roundingMode);
        F = wo1.H(12, 8);
        G = h32.d;
        H = wo1.H(12, 6).L(roundingMode);
        I = wo1.H(6, 10).L(roundingMode);
        J = wo1.G(6).L(roundingMode);
    }

    public h3(o10 o10Var, ds1 ds1Var) {
        super(o10Var, ds1Var);
        this.v = -1;
        this.w = null;
        this.x = null;
        this.A = null;
        this.B = null;
        this.C = true;
        int iJ = this.i.j();
        int iH = this.i.h();
        int i = this.i.i();
        this.s = new xu0(i);
        this.t = (iH + iJ + i) * 10;
        this.u = new BitSet(i);
        g52 g52Var = tk.p;
        this.z = (l52) g52Var.b(iJ, 1L);
        this.D = (l52) g52Var.b(i, 1L);
    }

    @Override // defpackage.tk
    public final boolean A() {
        k();
        if (this.c.get() >= this.t) {
            l();
            this.e = is1.FEASIBLE;
            return false;
        }
        int i = this.v;
        if (i >= 0) {
            k();
            Q(i);
            return true;
        }
        int iS = S();
        if (iS < 0) {
            k();
            this.e = is1.OPTIMAL;
            return false;
        }
        k();
        K(iS);
        this.u.clear();
        return true;
    }

    @Override // defpackage.j00
    public final re1 F() {
        o10 o10Var = this.i;
        int iH = o10Var.h();
        int iJ = o10Var.j();
        int[] iArrM = M();
        int length = iArrM.length + iH;
        tk.p.getClass();
        l52 l52VarR = g52.R(length, iJ);
        fi1 fi1Var = l52VarR.l;
        for (int i = 0; i < iH; i++) {
            u(i).b2(new gp2(l52VarR, fi1Var, i));
        }
        for (int i2 = 0; i2 < iArrM.length; i2++) {
            v(iArrM[i2]).b2(new gp2(l52VarR, fi1Var, iH + i2));
        }
        return l52VarR;
    }

    @Override // defpackage.j00
    public final re1 G() {
        o10 o10Var = this.i;
        int iH = o10Var.h();
        int[] iArrM = M();
        int length = iArrM.length + iH;
        tk.p.getClass();
        l52 l52VarR = g52.R(length, 1);
        double[] dArr = l52VarR.j;
        for (int i = 0; i < iH; i++) {
            dArr[i] = o10Var.c.A(i);
        }
        for (int i2 = 0; i2 < iArrM.length; i2++) {
            dArr[iH + i2] = o10Var.d.A(iArrM[i2]);
        }
        return l52VarR;
    }

    public final boolean I() {
        o10 o10Var = this.i;
        gy1 gy1Var = o10Var.c;
        gy1 gy1Var2 = o10Var.d;
        l52 l52Var = this.q;
        l52Var.Z(gy1Var);
        int iZ1 = gy1Var.Z1();
        for (int i = 0; i < iZ1; i++) {
            l52Var.f(i, -u(i).S(this.j));
        }
        l52 l52VarO = O();
        int i2 = l52Var.i;
        wo1 wo1Var = F;
        boolean z = true;
        if (i2 > 0) {
            k();
            for (int i3 = 0; i3 < i2; i3++) {
                if (!wo1Var.B(gy1Var.A(i3), l52Var.j[i3])) {
                    k();
                    z = false;
                }
            }
        }
        int i4 = l52VarO.i;
        if (z && i4 > 0) {
            k();
            for (int i5 = 0; i5 < i4; i5++) {
                double d = l52VarO.j[i5];
                if (d < h32.a && !wo1Var.B(gy1Var2.A(i5), d)) {
                    k();
                    z = false;
                }
            }
        }
        return z;
    }

    public final int J() {
        return this.i.h() + this.s.d;
    }

    public void K(int i) {
        xu0 xu0Var = this.s;
        boolean[] zArr = xu0Var.g;
        if (zArr[i]) {
            zArr[i] = false;
            xu0Var.e = i;
            xu0Var.b++;
            xu0Var.d--;
        }
        this.w = null;
        this.x = null;
    }

    public final double L(l52 l52Var, l52 l52Var2, double d, int i) {
        double d2;
        double d3;
        double d4;
        o10 o10Var;
        int i2;
        l52 l52Var3 = l52Var;
        double d5 = h32.b;
        this.v = -1;
        double dSqrt = Math.sqrt(l52Var3.S(l52Var3));
        double dDoubleValue = this.j.W(3).doubleValue();
        o10 o10Var2 = this.i;
        int i3 = o10Var2.i();
        xu0 xu0Var = this.s;
        int i4 = 0;
        int iMax = Math.max(0, Math.min(xu0Var.f, xu0Var.e) + 1);
        while (i4 < i3) {
            int i5 = (iMax + i4) % i3;
            if (xu0Var.g[i5]) {
                d2 = d5;
            } else {
                double dS = v(i5).S(l52Var3);
                d2 = d5;
                double d6 = h32.a;
                if (dS > d6) {
                    wo1 wo1Var = I;
                    d3 = dSqrt;
                    if (!wo1.D(dS, wo1Var.j)) {
                        if (dS > N(i5) * G * d && ((i5 != i && !this.u.get(i5)) || dS > N(i5) * 1.0E-6d * d3)) {
                            double d7 = l52Var2.j[i5];
                            d4 = dDoubleValue;
                            o10Var = o10Var2;
                            i2 = i3;
                            double dMax = (wo1Var.B(dS, d7) && wo1Var.B(Math.max(Math.abs(o10Var2.d.A(i5)), N(i5) * d4), d7)) ? d6 : Math.max(d7, d6) / dS;
                            if (dMax < d2) {
                                this.v = i5;
                                k();
                                if (dMax == d6) {
                                    return dMax;
                                }
                                d5 = dMax;
                            }
                        }
                        d5 = d2;
                    }
                    i4++;
                    l52Var3 = l52Var;
                    dSqrt = d3;
                    dDoubleValue = d4;
                    o10Var2 = o10Var;
                    i3 = i2;
                }
                d4 = dDoubleValue;
                o10Var = o10Var2;
                i2 = i3;
                d5 = d2;
                i4++;
                l52Var3 = l52Var;
                dSqrt = d3;
                dDoubleValue = d4;
                o10Var2 = o10Var;
                i3 = i2;
            }
            d3 = dSqrt;
            d4 = dDoubleValue;
            o10Var = o10Var2;
            i2 = i3;
            d5 = d2;
            i4++;
            l52Var3 = l52Var;
            dSqrt = d3;
            dDoubleValue = d4;
            o10Var2 = o10Var;
            i3 = i2;
        }
        return d5;
    }

    public final int[] M() {
        int[] iArr = this.x;
        if (iArr != null) {
            return iArr;
        }
        int[] iArrB = this.s.b();
        this.x = iArrB;
        return iArrB;
    }

    public final double N(int i) {
        double[] dArr;
        double[] dArr2 = this.B;
        if (dArr2 == null) {
            this.B = new double[this.i.i()];
            int i2 = 0;
            while (true) {
                dArr = this.B;
                if (i2 >= dArr.length) {
                    break;
                }
                cm2 cm2VarV = v(i2);
                dArr[i2] = Math.max(Math.sqrt(cm2VarV.S(cm2VarV)), h32.o);
                i2++;
            }
            dArr2 = dArr;
        }
        return dArr2[i];
    }

    public final l52 O() {
        gy1 gy1Var = this.i.d;
        l52 l52Var = this.D;
        l52Var.Z(gy1Var);
        int iZ1 = gy1Var.Z1();
        for (int i = 0; i < iZ1; i++) {
            l52Var.f(i, -v(i).S(this.j));
        }
        return l52Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [cm2] */
    /* JADX WARN: Type inference failed for: r19v0, types: [h3, j00, nr0, tk] */
    /* JADX WARN: Type inference failed for: r1v0, types: [a1, l52, xh, zk] */
    /* JADX WARN: Type inference failed for: r1v18, types: [xh] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r7v2, types: [cm2] */
    public final void P(boolean z, l52 l52Var, int[] iArr, int[] iArr2) {
        l52 l52Var2;
        double[] dArr;
        ?? r1 = l52Var;
        i();
        is1 is1Var = is1.FEASIBLE;
        BitSet bitSet = this.u;
        xu0 xu0Var = this.s;
        o10 o10Var = this.i;
        if (!z) {
            boolean zJ = j();
            is1 is1Var2 = is1.FAILED;
            if (!zJ) {
                if (I()) {
                    this.e = is1Var;
                    return;
                } else {
                    this.e = is1Var2;
                    return;
                }
            }
            l();
            if (iArr.length < 1) {
                this.e = is1Var2;
                return;
            }
            int iS = xu0Var.f;
            if (iS < 0 || !xu0Var.g[iS] || bitSet.get(iS)) {
                iS = -1;
            } else {
                bitSet.set(iS);
            }
            if (iS < 0) {
                iS = S();
            }
            if (iS < 0) {
                if (!this.C || xu0Var.f < 0) {
                    int[] iArrM = M();
                    int iH = o10Var.h();
                    int i = iArrM[0];
                    double d = h32.a;
                    int i2 = i;
                    for (int i3 = 0; i3 < iArrM.length; i3++) {
                        double d2 = this.r.j[iArrM[i3] + iH];
                        h32.q.getClass();
                        double dAbs = Math.abs(d2);
                        f32 f32Var = h32.A;
                        double d3 = h32.b;
                        f32Var.getClass();
                        double dMax = Math.max(-d2, d3) * dAbs;
                        if (dMax > d) {
                            i2 = iArrM[i3];
                            d = dMax;
                        }
                    }
                    iS = i2;
                } else {
                    int[] iArrM2 = M();
                    int i4 = xu0Var.f;
                    im imVarA = x22.L0.A();
                    cm2 cm2VarV = v(i4);
                    cm2VarV.S1(imVarA);
                    double dA0 = imVarA.A0();
                    double d4 = h32.a;
                    for (int i5 = 0; i5 < iArrM2.length; i5++) {
                        imVarA.e();
                        cm2 cm2VarV2 = v(iArrM2[i5]);
                        cm2VarV2.S1(imVarA);
                        double dAbs2 = (Math.abs(cm2VarV.S(cm2VarV2)) / dA0) / imVarA.A0();
                        if (dAbs2 > d4) {
                            i4 = iArrM2[i5];
                            d4 = dAbs2;
                        }
                    }
                    iS = i4;
                }
                this.C = !this.C;
            }
            k();
            K(iS);
            C();
            return;
        }
        f32 f32Var2 = h32.I;
        l52 l52Var3 = this.j;
        r1.v1(f32Var2, l52Var3);
        l52Var3.W(3).getClass();
        r1.W(3).getClass();
        k();
        k();
        int i6 = l52Var3.i;
        int i7 = 0;
        while (i7 < i6) {
            if (!J.B(Math.abs(l52Var3.j[i7]), r1.j[i7])) {
                double dL = h32.b;
                ?? r2 = r1;
                if (iArr2.length > 0) {
                    l52 l52VarO = O();
                    k();
                    double dMax2 = h32.a;
                    int iH2 = o10Var.h();
                    int i8 = 0;
                    while (i8 < iH2) {
                        double dAbs3 = Math.abs(u(i8).S(r1));
                        double[] dArr2 = this.A;
                        if (dArr2 == null) {
                            this.A = new double[o10Var.h()];
                            int i9 = 0;
                            while (true) {
                                dArr = this.A;
                                if (i9 >= dArr.length) {
                                    break;
                                }
                                a1 a1VarU = u(i9);
                                dArr[i9] = Math.max(Math.sqrt(a1VarU.S(a1VarU)), h32.o);
                                i9++;
                                l52VarO = l52VarO;
                                iH2 = iH2;
                                o10Var = o10Var;
                            }
                            dArr2 = dArr;
                        }
                        dMax2 = Math.max(dMax2, dAbs3 / dArr2[i8]);
                        i8++;
                        l52VarO = l52VarO;
                        iH2 = iH2;
                        o10Var = o10Var;
                    }
                    l52 l52Var4 = l52VarO;
                    for (int i10 : M()) {
                        dMax2 = Math.max(dMax2, Math.abs(v(i10).S(r1)) / N(i10));
                    }
                    if (dMax2 > Math.sqrt(r1.S(r1)) * 1.0E-6d) {
                        dMax2 = h32.a;
                    }
                    double d5 = dMax2;
                    dL = L(r1, l52Var4, d5, -1);
                    int i11 = this.v;
                    wo1 wo1Var = E;
                    if (wo1.D(dL, wo1Var.j) && i11 == xu0Var.e) {
                        l();
                        l52Var2 = l52Var;
                        dL = L(l52Var2, l52Var4, d5, i11);
                        if (wo1.D(dL, wo1Var.j) && this.v == i11) {
                            r2 = l52Var2;
                            r2 = l52Var2;
                            this.v = -1;
                            dL = h32.a;
                            r2 = l52Var2;
                        }
                    } else {
                        r2 = l52Var;
                    }
                }
                r2 = l52Var2;
                r2 = l52Var2;
                r2 = l52Var2;
                if (dL > h32.a) {
                    l();
                    r2.m1(dL, l52Var3);
                    bitSet.clear();
                } else {
                    l();
                }
                k();
                k();
                this.a.getClass();
            }
            i7++;
            o10Var = o10Var;
        }
        k();
        this.e = is1Var;
        k();
        k();
        this.a.getClass();
    }

    public final void Q(int i) {
        xu0 xu0Var = this.s;
        boolean[] zArr = xu0Var.g;
        if (!zArr[i]) {
            zArr[i] = true;
            xu0Var.f = i;
            xu0Var.d++;
            xu0Var.b--;
        }
        this.w = null;
        this.x = null;
    }

    public void R() {
        xu0 xu0Var = this.s;
        boolean[] zArr = xu0Var.g;
        Arrays.fill(zArr, false);
        xu0Var.b = zArr.length;
        xu0Var.d = 0;
        xu0Var.e = -1;
        xu0Var.f = -1;
        this.u.clear();
        this.w = null;
        this.x = null;
        o10 o10Var = this.i;
        int i = o10Var.i();
        int iH = o10Var.h();
        int iJ = o10Var.j();
        k();
        int iAbs = Math.abs((iJ / 2) - iH);
        if (i > 0 && iAbs > 0) {
            l52 l52VarO = O();
            for (int i2 = 0; i2 < i; i2++) {
                double d = l52VarO.j[i2];
                if (d >= h32.a && wo1.D(d, E.j) && xu0Var.d < iAbs) {
                    k();
                    Q(i2);
                }
            }
        }
        xu0Var.e = -1;
        xu0Var.f = -1;
    }

    public final int S() {
        wo1 wo1Var;
        l52 l52Var;
        int[] iArrM = M();
        int i = this.s.f;
        double d = h32.a;
        int iH = this.i.h();
        k();
        int length = iArrM.length;
        int i2 = -1;
        int i3 = -1;
        int i4 = 0;
        while (true) {
            wo1Var = H;
            l52Var = this.r;
            if (i4 >= length) {
                break;
            }
            int i5 = iArrM[i4];
            if (i5 != i) {
                double dJ = l52Var.p.J(i5 + iH, 0);
                if (dJ < d && !wo1.D(dJ, wo1Var.j)) {
                    k();
                    i2 = i4;
                    d = dJ;
                }
            } else {
                i3 = i4;
            }
            i4++;
        }
        if (i2 < 0 && i3 >= 0) {
            double dJ2 = l52Var.p.J(iH + iArrM[i3], 0);
            if (dJ2 < d && !wo1.D(dJ2, wo1Var.j)) {
                l();
                i2 = i3;
            }
        }
        l();
        return i2 >= 0 ? iArrM[i2] : i2;
    }

    @Override // defpackage.tk
    public final l52 r() {
        return this.j.U();
    }

    @Override // defpackage.j00, defpackage.tk
    public final boolean y(gs1 gs1Var) {
        l52 l52Var;
        is1 is1Var;
        l52 l52Var2 = this.j;
        is1 is1Var2 = is1.FEASIBLE;
        super.y(gs1Var);
        this.y = this.l.l(w());
        if (gs1Var != null && gs1Var.m.a()) {
            l52Var2.Z(gs1Var);
            if (gs1Var.m.c()) {
                this.e = gs1Var.m;
            } else if (I()) {
                this.e = is1Var2;
            }
        }
        if (this.e.c()) {
            l52Var = l52Var2;
            is1Var = is1Var2;
        } else {
            o10 o10Var = this.i;
            ds1 ds1Var = this.a;
            boolean z = this.m;
            wo1 wo1Var = ey1.B;
            int iJ = o10Var.j();
            int iH = o10Var.h();
            int i = o10Var.i();
            re1 re1VarQ0 = (re1) ((g2) o10Var.f.i).i;
            if (re1VarQ0.h1() == 1) {
                re1VarQ0 = re1VarQ0.Q0();
            }
            gy1 gy1Var = o10Var.c;
            gy1 gy1Var2 = o10Var.d;
            ea1 ea1Var = new ea1(i, iH, iJ, 0, 0, i, false);
            wo1 wo1Var2 = lj2.v;
            lj2 lj2Var = (lj2) new yy0(ds1Var, (byte) 1).apply(ea1Var);
            double[] dArr = lj2Var.j;
            double[] dArr2 = lj2Var.o;
            for (int i2 = 0; i2 < iJ; i2++) {
                dArr[i2] = Double.NEGATIVE_INFINITY;
                dArr2[i2] = Double.POSITIVE_INFINITY;
            }
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = iJ + i3;
                dArr[i4] = h32.a;
                dArr2[i4] = Double.POSITIVE_INFINITY;
            }
            for (int i5 = 0; i5 < ea1Var.b; i5++) {
                int i6 = iJ + i + i5;
                double d = h32.a;
                dArr[i6] = d;
                dArr2[i6] = d;
            }
            dk1 dk1VarD0 = lj2Var.d0();
            zj1 zj1VarI0 = lj2Var.i0();
            zj1 zj1VarM2 = lj2Var.m2();
            if (z) {
                int i7 = 0;
                while (i7 < iJ) {
                    zj1VarM2.o(i7, -re1VarQ0.A(i7));
                    i7++;
                    l52Var2 = l52Var2;
                    is1Var2 = is1Var2;
                }
            }
            l52Var = l52Var2;
            is1 is1Var3 = is1Var2;
            ya2 ya2Var = o10Var.b;
            ya2Var.h1();
            for (h1 h1Var = new h1(ya2Var); h1Var.hasNext(); h1Var = h1Var) {
                h1Var.k++;
                h1Var.c().forEach(new om2(dk1VarD0, h1Var, (byte) 4));
                long j = h1Var.k;
                dk1 dk1Var = dk1VarD0;
                dk1Var.Y1(j, ((long) iJ) + j, h32.b);
                long j2 = h1Var.k;
                zj1VarI0.y(j2, gy1Var2.z(j2));
                dk1VarD0 = dk1Var;
            }
            dk1 dk1Var2 = dk1VarD0;
            ya2 ya2Var2 = o10Var.a;
            ya2Var2.h1();
            h1 h1Var2 = new h1(ya2Var2);
            while (h1Var2.hasNext()) {
                h1Var2.k++;
                h1Var2.c().forEach(new dj2(dk1Var2, i, h1Var2, (byte) 0));
                long j3 = h1Var2.k;
                zj1VarI0.y(((long) i) + j3, gy1Var.z(j3));
            }
            for (int i8 = 0; i8 < iH; i8++) {
                dk1Var2.b0(h32.b, i + i8, iJ + i + i8);
            }
            lj2Var.F0(ds1Var.l);
            ey1 ey1Var = new ey1(ds1Var, lj2Var);
            ey1Var.c.set(0);
            ey1Var.b = -1L;
            ey1Var.d.a = System.nanoTime();
            try {
                gs1 gs1VarH = ey1Var.h(null);
                ey1Var.b = System.nanoTime() - ey1Var.d.a;
                a1 a1Var = (a1) Optional.ofNullable(gs1VarH.i).map(new j5((byte) 0)).get();
                is1 is1Var4 = gs1VarH.m;
                double d2 = gs1VarH.n;
                b90 b90Var = new b90(gs1VarH, iJ, (byte) 1);
                fj2 fj2Var = new fj2(iH, i, a1Var);
                gs1 gs1Var2 = new gs1(is1Var4, d2, b90Var);
                gs1Var2.i = new k5(fj2Var, (byte) 6);
                k();
                if (this.m || !gs1Var2.m.c()) {
                    is1Var = is1Var3;
                } else {
                    is1Var = is1Var3;
                    gs1Var2 = gs1Var2.f1(is1Var);
                }
                is1 is1Var5 = gs1Var2.m;
                l52Var.Z(gs1Var2);
                this.r.T1(Double.valueOf(h32.a));
                if (is1Var5.c()) {
                    this.e = is1Var5;
                } else if (I()) {
                    this.e = is1Var;
                } else {
                    this.e = is1.INFEASIBLE;
                }
            } catch (Throwable th) {
                ey1Var.b = System.nanoTime() - ey1Var.d.a;
                throw th;
            }
        }
        if (this.e.d() && !this.m) {
            this.e = is1Var;
        }
        if (this.e.c()) {
            R();
        } else {
            l52Var.T1(Double.valueOf(h32.a));
        }
        k();
        return this.e.c();
    }

    @Override // defpackage.tk
    public final boolean z() {
        return !this.m;
    }
}
