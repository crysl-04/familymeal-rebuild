package defpackage;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rj2 extends da1 {
    public static final wo1 m;
    public static final wo1 n;
    public static final wo1 o;
    public static final wo1 p;
    public static final wo1 q;
    public static final wo1 r;
    public wc1 j;
    public final qj2 k;
    public final oj2 l;

    static {
        wo1 wo1VarH = wo1.H(12, 14);
        RoundingMode roundingMode = RoundingMode.HALF_DOWN;
        m = wo1VarH.L(roundingMode);
        n = wo1.H(12, 8).L(roundingMode);
        o = wo1.H(12, 8).L(roundingMode);
        p = wo1.H(12, 8).L(roundingMode);
        q = wo1.H(12, 8).L(roundingMode);
        r = wo1.H(8, 10).L(roundingMode);
    }

    public rj2(oj2 oj2Var, ds1 ds1Var) {
        super(ds1Var);
        this.j = null;
        ea1 ea1Var = oj2Var.u;
        int i = ea1Var.h + ea1Var.f + ea1Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            oj2Var.l2(i2);
        }
        this.l = oj2Var;
        qj2 qj2Var = new qj2();
        qj2Var.a = true;
        qj2Var.c = -1;
        qj2Var.b = -1;
        this.k = qj2Var;
        l();
        k();
    }

    public static void q(ii0 ii0Var, a90 a90Var, int i, int i2, lo2 lo2Var, double d) {
        ii0Var.getClass();
        int iR = ii0Var.r(lo2Var.h);
        if (iR >= 0) {
            a90Var.b0(d, i, iR);
        }
        int iQ = ii0Var.q(lo2Var.h);
        if (iQ >= 0) {
            a90Var.b0(-d, i, i2 + iQ);
        }
    }

    public static void r(ii0 ii0Var, a90 a90Var, int i, int i2, e33 e33Var, double d) {
        ii0Var.getClass();
        int iR = ii0Var.r(e33Var.p.h);
        if (iR >= 0) {
            a90Var.b0(d, i, iR);
        }
        int iQ = ii0Var.q(e33Var.p.h);
        if (iQ >= 0) {
            a90Var.b0(-d, i, i2 + iQ);
        }
    }

    @Override // defpackage.u23
    public final boolean c(int i, double d, double d2) {
        if (d == d2) {
            return e(i, d);
        }
        this.f = null;
        this.g = null;
        return false;
    }

    @Override // defpackage.u23
    public final Optional d() {
        oj2 oj2Var = this.l;
        return oj2Var.u.a.j() ? Optional.of(oj2Var.u) : Optional.empty();
    }

    @Override // defpackage.u23
    public final boolean e(int i, double d) {
        if (d < h32.a) {
            return false;
        }
        boolean zJ2 = this.l.J2(i, d);
        if (zJ2) {
            wc1 wc1Var = this.j;
            if (wc1Var == null) {
                vh vhVar = xh.k;
                wc1 wc1Var2 = new wc1(vhVar, ns0.a(vhVar.j));
                this.j = wc1Var2;
                wc1Var = wc1Var2;
            }
            cm2 cm2Var = wc1Var.j;
            int i2 = i;
            int iQ1 = cm2Var.Q1(i2);
            if (iQ1 >= 0) {
                cm2Var.n.A(iQ1);
            }
            cm2Var.c2(i2, iQ1, d, true);
            this.k.a = true;
            this.f = null;
            this.g = null;
        }
        return zJ2;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x016e  */
    @Override // defpackage.u23
    public final Collection g(boolean[] zArr, cz0 cz0Var) {
        oj2 oj2Var;
        wo1 wo1Var;
        mh0 mh0Var;
        mj2 mj2Var;
        int i;
        bl blVar;
        boolean[] zArr2 = zArr;
        wo1 wo1Var2 = this.a.k.d;
        double d = cz0Var.c;
        oj2 oj2Var2 = this.l;
        ea1 ea1Var = oj2Var2.u;
        if (oj2Var2.l > 0) {
            return Collections.EMPTY_LIST;
        }
        int length = zArr2.length;
        if (length != ea1Var.h() && (blVar = cl.a) != null) {
            blVar.println("generateCutCandidates: integer.length != structure.countVariables()");
        }
        int[] iArr = ea1Var.j;
        int[] iArr2 = ea1Var.i;
        int length2 = iArr.length;
        int length3 = iArr2.length;
        int iMax = 0;
        for (int i2 : iArr) {
            iMax = Math.max(iMax, i2 + 1);
        }
        int[] iArr3 = new int[iMax];
        int i3 = -1;
        Arrays.fill(iArr3, -1);
        for (int i4 = 0; i4 < length2; i4++) {
            iArr3[iArr[i4]] = i4;
        }
        int[] iArr4 = new int[length3 << 1];
        int i5 = 0;
        int i6 = 0;
        while (i5 < length3) {
            int i7 = iArr2[i5];
            int i8 = i7 < iMax ? iArr3[i7] : i3;
            int i9 = length2 + i5;
            if (i8 >= 0 && oj2Var2.h2(i8) && oj2Var2.h2(i9)) {
                int i10 = i6 + 1;
                iArr4[i6] = i8;
                i6 += 2;
                iArr4[i10] = i9;
            }
            i5++;
            i3 = -1;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr4, i6);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < oj2Var2.s) {
            int i12 = oj2Var2.r[i11];
            double dZ1 = oj2Var2.z1(i11);
            if (i12 < 0 || i12 >= length || !zArr2[i12]) {
                oj2Var = oj2Var2;
                wo1Var = wo1Var2;
            } else {
                wo1Var2.getClass();
                double d2 = h32.b;
                if (wo1Var2.B(d2, Math.rint(dZ1) - dZ1)) {
                    oj2Var = oj2Var2;
                    wo1Var = wo1Var2;
                } else {
                    r22 r22VarY2 = oj2Var2.y2(i11);
                    int[] iArr5 = oj2Var2.q;
                    wo1 wo1Var3 = bs2.a;
                    oj2Var = oj2Var2;
                    int length4 = zArr2.length;
                    mj2 mj2Var2 = (mj2) r22VarY2;
                    if (mj2Var2.j.t < length4) {
                        wg.f();
                        return null;
                    }
                    double dFloor = dZ1 - Math.floor(dZ1);
                    int[] iArr6 = iArr5;
                    wo1Var = wo1Var2;
                    mj2 mj2Var3 = mj2Var2;
                    if (bs2.b(dZ1, dFloor, d)) {
                        double d3 = d2 - dFloor;
                        double[] dArr = new double[length4];
                        int i13 = 0;
                        while (i13 < iArr6.length) {
                            int i14 = iArr6[i13];
                            int i15 = length4;
                            int[] iArr7 = iArr6;
                            if (i14 < length4) {
                                double dA = mj2Var3.A(i14);
                                mj2Var = mj2Var3;
                                i = i13;
                                double d4 = bs2.a.j;
                                if (!wo1.D(dA, d4)) {
                                    if (zArr[i14]) {
                                        double dFloor2 = dA - Math.floor(dA);
                                        if (dFloor2 > dFloor) {
                                            double d5 = h32.b - dFloor2;
                                            if (!wo1.D(d5, d4)) {
                                                dArr[i14] = d5 / d3;
                                            }
                                        } else if (!wo1.D(dFloor2, d4)) {
                                            dArr[i14] = dFloor2 / dFloor;
                                        }
                                    } else {
                                        double d6 = h32.a;
                                        if (dA > d6) {
                                            dArr[i14] = dA / dFloor;
                                        } else if (dA < d6) {
                                            dArr[i14] = (-dA) / d3;
                                        }
                                    }
                                }
                            } else {
                                mj2Var = mj2Var3;
                                i = i13;
                            }
                            i13 = i + 1;
                            iArr6 = iArr7;
                            length4 = i15;
                            mj2Var3 = mj2Var;
                        }
                        mh0Var = new mh0(new xh(dArr), i12, d2);
                    } else {
                        mh0Var = null;
                    }
                    if (mh0Var != null) {
                        int i16 = 0;
                        while (true) {
                            if (i16 >= iArrCopyOf.length) {
                                arrayList.add(mh0Var);
                                break;
                            }
                            if (mh0Var.i.A(iArrCopyOf[i16]) != h32.a) {
                                break;
                            }
                            i16++;
                        }
                    }
                }
            }
            i11++;
            zArr2 = zArr;
            oj2Var2 = oj2Var;
            wo1Var2 = wo1Var;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b7 A[LOOP:0: B:3:0x000a->B:101:0x01b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:125:0x01c6 A[EDGE_INSN: B:125:0x01c6->B:103:0x01c6 BREAK  A[LOOP:0: B:3:0x000a->B:101:0x01b7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x013d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:67:0x0143  */
    /* JADX WARN: Code duplicated, block: B:72:0x014f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0159  */
    /* JADX WARN: Code duplicated, block: B:85:0x017b A[PHI: r12
  0x017b: PHI (r12v13 oj2) = (r12v10 oj2), (r12v10 oj2), (r12v10 oj2), (r12v10 oj2), (r12v14 oj2) binds: [B:73:0x0157, B:75:0x015b, B:79:0x0167, B:81:0x016b, B:71:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.nr0
    public final gs1 h(gs1 gs1Var) {
        oj2 oj2Var;
        is1 is1Var;
        int i;
        oj2 oj2Var2;
        is1 is1Var2;
        int i2;
        double d;
        int i3;
        int i4;
        double d2;
        double d3;
        oj2 oj2Var3;
        oj2 oj2Var4;
        is1 is1Var3;
        this.f = null;
        this.g = null;
        k();
        while (true) {
            boolean zJ = j();
            oj2 oj2Var5 = this.l;
            is1 is1Var4 = is1.INFEASIBLE;
            if (!zJ) {
                oj2Var = oj2Var5;
                is1Var = is1Var4;
                i = 1;
                break;
            }
            k();
            qj2 qj2Var = this.k;
            int i5 = -1;
            qj2Var.c = -1;
            qj2Var.b = -1;
            boolean z = qj2Var.a;
            wo1 wo1Var = p;
            if (!z || (!wo1.D(-oj2Var5.K2(), o.j) && oj2Var5.l > 0)) {
                oj2Var2 = oj2Var5;
                is1Var2 = is1Var4;
                i = 1;
            } else {
                int[] iArr = oj2Var5.r;
                int[] iArr2 = oj2Var5.q;
                int i6 = oj2Var5.t;
                int i7 = 0;
                while (i7 < iArr.length) {
                    if (oj2Var5.f2(iArr[i7])) {
                        oj2Var5.J(i7, i6);
                        this.a.getClass();
                        double d4 = h32.a;
                        int i8 = i5;
                        int i9 = 0;
                        while (i9 < iArr2.length) {
                            int i10 = iArr2[i9];
                            is1 is1Var5 = is1Var4;
                            double dJ = oj2Var5.J(i7, i10);
                            oj2 oj2Var6 = oj2Var5;
                            if (dJ > d4 && !wo1.D(dJ, wo1Var.j)) {
                                d4 = dJ;
                                i8 = i10;
                            }
                            i9++;
                            is1Var4 = is1Var5;
                            oj2Var5 = oj2Var6;
                        }
                        oj2Var4 = oj2Var5;
                        is1Var3 = is1Var4;
                        if (i8 >= 0) {
                            qj2Var.c = i7;
                            qj2Var.b = i8;
                            p(qj2Var);
                        }
                    } else {
                        oj2Var4 = oj2Var5;
                        is1Var3 = is1Var4;
                    }
                    i7++;
                    is1Var4 = is1Var3;
                    oj2Var5 = oj2Var4;
                    i5 = -1;
                }
                oj2Var2 = oj2Var5;
                is1Var2 = is1Var4;
                i = 1;
                k();
                qj2Var.a = false;
                oj2Var2.t2();
                this.e = is1.FEASIBLE;
            }
            boolean z2 = qj2Var.a;
            oj2 oj2Var7 = oj2Var2;
            int i11 = oj2Var7.s;
            if (z2) {
                i11++;
            }
            int iH = oj2Var7.u.h();
            k();
            double d5 = !z2 ? -m.w() : h32.a;
            int i12 = -1;
            for (int i13 = 0; i13 < iH; i13++) {
                if (oj2Var7.h2(i13)) {
                    double dJ2 = oj2Var7.J(i11, i13);
                    if (dJ2 < d5 && (i12 < 0 || r.y(d5, dJ2))) {
                        k();
                        i12 = i13;
                        d5 = dJ2;
                    }
                }
            }
            qj2Var.b = i12;
            if (i12 >= 0) {
                int i14 = oj2Var7.t;
                boolean z3 = qj2Var.a;
                k();
                int i15 = oj2Var7.s;
                double d6 = Double.MIN_NORMAL;
                double d7 = Double.MAX_VALUE;
                int i16 = 0;
                int i17 = -1;
                while (i16 < i15) {
                    double dAbs = Math.abs(oj2Var7.J(i16, i14));
                    boolean z4 = z3;
                    int i18 = i15;
                    double dJ3 = oj2Var7.J(i16, i12);
                    int i19 = i14;
                    if (oj2Var7.f2(oj2Var7.r[i16])) {
                        d = d6;
                        i3 = wo1.D(dAbs, n.j) ? i : 0;
                        if (!z4 || i3 == 0) {
                            i4 = 0;
                        } else {
                            i4 = i;
                        }
                        if (i4 != 0) {
                            d2 = h32.a;
                        } else {
                            d2 = dAbs / dJ3;
                        }
                        d3 = h32.a;
                        if (dJ3 <= d3 || i4 != 0) {
                            int i20 = i3;
                            oj2Var3 = oj2Var7;
                            if (wo1.D(dJ3, wo1Var.j) && d2 >= d3 && (d2 < d7 || (!q.y(d7, d2) && dJ3 > d))) {
                                if (i20 != 0) {
                                    dJ3 = Math.max(dJ3, h32.b);
                                }
                                k();
                                i17 = i16;
                                d7 = d2;
                            }
                            i16++;
                            oj2Var7 = oj2Var3;
                            i14 = i19;
                            d6 = dJ3;
                            z3 = z4;
                            i15 = i18;
                        } else {
                            oj2Var3 = oj2Var7;
                        }
                        dJ3 = d;
                        i16++;
                        oj2Var7 = oj2Var3;
                        i14 = i19;
                        d6 = dJ3;
                        z3 = z4;
                        i15 = i18;
                    } else {
                        d = d6;
                    }
                    if (z4) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                    }
                    if (i4 != 0) {
                        d2 = h32.a;
                    } else {
                        d2 = dAbs / dJ3;
                    }
                    d3 = h32.a;
                    if (dJ3 <= d3) {
                        int i21 = i3;
                        oj2Var3 = oj2Var7;
                        if (wo1.D(dJ3, wo1Var.j)) {
                            dJ3 = d;
                        } else {
                            dJ3 = d;
                        }
                    } else {
                        int i22 = i3;
                        oj2Var3 = oj2Var7;
                        if (wo1.D(dJ3, wo1Var.j)) {
                            dJ3 = d;
                        } else {
                            dJ3 = d;
                        }
                    }
                    i16++;
                    oj2Var7 = oj2Var3;
                    i14 = i19;
                    d6 = dJ3;
                    z3 = z4;
                    i15 = i18;
                }
                oj2Var = oj2Var7;
                qj2Var.c = i17;
                if (i17 >= 0) {
                    i2 = i;
                    is1Var = is1Var2;
                } else if (qj2Var.a) {
                    is1Var = is1Var2;
                    this.e = is1Var;
                } else {
                    this.e = is1.UNBOUNDED;
                    is1Var = is1Var2;
                }
                k();
                if (i2 != 0) {
                    break;
                }
                p(qj2Var);
                i();
                k();
            } else {
                oj2Var = oj2Var7;
                is1Var = is1Var2;
                if (qj2Var.a) {
                    this.e = is1Var;
                } else {
                    this.e = is1.OPTIMAL;
                }
            }
            i2 = 0;
            k();
            if (i2 != 0) {
                break;
                break;
            }
            p(qj2Var);
            i();
            k();
        }
        k();
        oj2 oj2Var8 = oj2Var;
        int i23 = oj2Var8.t;
        ea1 ea1Var = oj2Var8.u;
        g52 g52Var = l52.q;
        int iH2 = ea1Var.h();
        m00 m00Var = ea1Var.a;
        l52 l52VarR = g52.R(iH2, i);
        double[] dArr = l52VarR.j;
        int i24 = oj2Var8.s;
        for (int i25 = 0; i25 < i24; i25++) {
            int i26 = oj2Var8.r[i25];
            if (!oj2Var8.f2(i26)) {
                dArr[i26] = oj2Var8.J(i25, i23);
            }
        }
        wc1 wc1Var = this.j;
        if (wc1Var != null) {
            am2 it = wc1Var.j.b().iterator();
            while (it.hasNext()) {
                it.c();
                dArr[(int) it.D0()] = it.A0();
            }
        }
        gs1 gs1Var2 = new gs1(this.e, (-oj2Var8.L2()) / m00Var.j, l52VarR);
        if (this.e == is1Var) {
            return gs1Var2;
        }
        final byte b = 0;
        gs1Var2.k = new Supplier(this) { // from class: pj2
            public final /* synthetic */ rj2 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Supplier
            public final Object get() {
                byte b2 = b;
                rj2 rj2Var = this.b;
                switch (b2) {
                    case 0:
                        return new xh(rj2Var.n());
                    default:
                        return new gj2(rj2Var, rj2Var.l.u.g(), (byte) 1);
                }
            }
        };
        if (!m00Var.j()) {
            final byte b2 = 1;
            gs1Var2.i = new Supplier(this) { // from class: pj2
                public final /* synthetic */ rj2 b;

                {
                    this.b = this;
                }

                @Override // java.util.function.Supplier
                public final Object get() {
                    byte b3 = b2;
                    rj2 rj2Var = this.b;
                    switch (b3) {
                        case 0:
                            return new xh(rj2Var.n());
                        default:
                            return new gj2(rj2Var, rj2Var.l.u.g(), (byte) 1);
                    }
                }
            };
            return gs1Var2;
        }
        final byte b3 = 1;
        Supplier supplier = new Supplier(this) { // from class: pj2
            public final /* synthetic */ rj2 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Supplier
            public final Object get() {
                byte b4 = b3;
                rj2 rj2Var = this.b;
                switch (b4) {
                    case 0:
                        return new xh(rj2Var.n());
                    default:
                        return new gj2(rj2Var, rj2Var.l.u.g(), (byte) 1);
                }
            }
        };
        gs1Var2.h = m00Var;
        gs1Var2.i = supplier;
        return gs1Var2;
    }

    @Override // defpackage.da1
    public final double[] m() {
        oj2 oj2Var = this.l;
        int i = oj2Var.s;
        double[] dArr = new double[i];
        if (this.e == is1.INFEASIBLE) {
            Arrays.fill(dArr, Double.NaN);
            return dArr;
        }
        r22 r22VarZ2 = oj2Var.z2();
        int i2 = 0;
        for (int i3 = 0; i3 < oj2Var.s; i3++) {
            dArr[i3] = ((mj2) r22VarZ2).A(i3);
        }
        while (true) {
            ea1 ea1Var = oj2Var.u;
            if (i2 >= i) {
                ea1Var.getClass();
                return dArr;
            }
            if (ea1Var.a.k.get(i2)) {
                dArr[i2] = -dArr[i2];
            }
            i2++;
        }
    }

    @Override // defpackage.da1
    public final double[] n() {
        int i;
        int i2;
        oj2 oj2Var = this.l;
        int i3 = oj2Var.t;
        ea1 ea1Var = oj2Var.u;
        double[] dArr = new double[i3];
        if (this.e == is1.INFEASIBLE) {
            Arrays.fill(dArr, Double.NaN);
            return dArr;
        }
        oj2Var.M0(dArr);
        double d = ea1Var.a.j;
        int i4 = 0;
        if (d != h32.b) {
            for (int i5 = 0; i5 < i3; i5++) {
                dArr[i5] = dArr[i5] / d;
            }
        }
        m00 m00Var = ea1Var.a;
        int[] iArr = ea1Var.i;
        int[] iArr2 = ea1Var.j;
        if (m00Var.j()) {
            int length = iArr2.length;
            int length2 = iArr.length;
            int iMax = 0;
            for (int i6 : iArr2) {
                iMax = Math.max(iMax, i6 + 1);
            }
            for (int i7 : iArr) {
                iMax = Math.max(iMax, i7 + 1);
            }
            int[] iArr3 = new int[iMax];
            int[] iArr4 = new int[iMax];
            Arrays.fill(iArr3, -1);
            Arrays.fill(iArr4, -1);
            for (int i8 = 0; i8 < length; i8++) {
                iArr3[iArr2[i8]] = i8;
            }
            for (int i9 = 0; i9 < length2; i9++) {
                iArr4[iArr[i9]] = length + i9;
            }
            ArrayList arrayListR = ea1Var.a.R(new xh(m()));
            int size = arrayListR.size();
            while (i4 < size) {
                Object obj = arrayListR.get(i4);
                i4++;
                eh0 eh0Var = (eh0) obj;
                mg1 mg1Var = (mg1) ((ih0) eh0Var.getKey()).R();
                if (mg1Var instanceof e33) {
                    int i10 = ((e33) mg1Var).p.h;
                    double dA0 = ((ih0) eh0Var.getKey()).j() == cs1.i ? -eh0Var.A0() : eh0Var.A0();
                    if (i10 < iMax && (i2 = iArr3[i10]) >= 0) {
                        dArr[i2] = dArr[i2] - dA0;
                    }
                    if (i10 < iMax && (i = iArr4[i10]) >= 0) {
                        dArr[i] = dArr[i] + dA0;
                    }
                }
            }
        }
        return dArr;
    }

    public final void p(qj2 qj2Var) {
        int i = qj2Var.c;
        int i2 = qj2Var.b;
        oj2 oj2Var = this.l;
        oj2Var.J(i, i2);
        oj2Var.J(qj2Var.c, oj2Var.t);
        int i3 = qj2Var.c;
        int i4 = qj2Var.b;
        oj2Var.H2(i3, i4);
        oj2Var.B2(i3, i4);
        k();
        k();
    }
}
