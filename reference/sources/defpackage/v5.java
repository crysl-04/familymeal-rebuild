package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Optional;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class v5 extends r10 implements u23 {
    public transient double[] g;
    public final q5 h;
    public final ki0 i;
    public final ab2 j;
    public final s5 k;
    public final t5 l;
    public final u5 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(q5 q5Var, ds1 ds1Var, t5 t5Var) throws Throwable {
        int[] iArr;
        int i;
        int[] iArr2;
        int[] iArr3;
        double[] dArr;
        super(ds1Var);
        q5 q5Var2 = q5Var;
        Throwable th = null;
        this.g = null;
        this.h = q5Var2;
        this.l = t5Var;
        k52 k52Var = q5Var2.h;
        ab2 ab2Var = new ab2(k52Var.h, k52Var.j);
        this.j = ab2Var;
        u5 u5Var = new u5(q5Var2);
        this.m = u5Var;
        this.k = new s5(q5Var2);
        double d = h32.b;
        s5 s5Var = ab2Var.c;
        double[] dArr2 = s5Var.i;
        Arrays.fill(dArr2, d);
        s5 s5Var2 = ab2Var.b;
        double[] dArr3 = s5Var2.i;
        Arrays.fill(dArr3, d);
        ab2Var.a = d;
        int i2 = 0;
        while (i2 < 5) {
            k52 k52Var2 = q5Var2.h;
            double[] dArr4 = k52Var2.p;
            int[] iArr4 = k52Var2.o;
            double[] dArr5 = q5Var2.k;
            Throwable th2 = th;
            k52 k52Var3 = q5Var2.j;
            int i3 = k52Var2.h;
            int i4 = i2;
            int i5 = 0;
            while (true) {
                dArr = ab2Var.e;
                if (i5 >= i3) {
                    break;
                }
                int i6 = iArr4[i5];
                int i7 = i5 + 1;
                int i8 = i5;
                int i9 = iArr4[i7];
                k52 k52Var4 = k52Var;
                u5 u5Var2 = u5Var;
                int[] iArr5 = iArr4;
                double dMax = h32.a;
                for (int i10 = i6; i10 < i9; i10++) {
                    dMax = Math.max(Math.abs(dArr4[i10]), dMax);
                }
                dArr[i8] = dMax;
                i5 = i7;
                iArr4 = iArr5;
                k52Var = k52Var4;
                u5Var = u5Var2;
            }
            k52 k52Var5 = k52Var;
            u5 u5Var3 = u5Var;
            int[] iArr6 = iArr4;
            k52.A0(k52Var3, dArr);
            double[] dArr6 = k52Var3.p;
            double d2 = h32.a;
            double[] dArr7 = ab2Var.d;
            Arrays.fill(dArr7, d2);
            int i11 = 0;
            while (i11 < i3) {
                int i12 = iArr6[i11];
                i11++;
                int i13 = iArr6[i11];
                while (i12 < i13) {
                    int i14 = k52Var2.n[i12];
                    dArr7[i14] = Math.max(Math.abs(dArr4[i12]), dArr7[i14]);
                    i12++;
                    i3 = i3;
                    i13 = i13;
                    i11 = i11;
                }
            }
            ab2.b(dArr);
            ab2.b(dArr7);
            rz1.t(dArr);
            rz1.t(dArr7);
            lt.L(dArr, dArr);
            lt.L(dArr7, dArr7);
            k52.Q1(k52Var3, dArr);
            k52.c1(k52Var3, dArr);
            k52.Q1(k52Var2, dArr7);
            k52.c1(k52Var2, dArr);
            lt.M(dArr5, dArr);
            double[] dArr8 = s5Var.i;
            int length = dArr8.length;
            int length2 = dArr.length;
            int length3 = dArr8.length;
            BigDecimal[] bigDecimalArr = lg1.a;
            ys.U(dArr8, 0, Math.min(Math.min(length, length2), length3), 1, dArr, dArr8);
            double[] dArr9 = s5Var2.i;
            ys.U(dArr9, 0, Math.min(Math.min(dArr9.length, dArr7.length), dArr9.length), 1, dArr7, dArr9);
            double d3 = h32.a;
            Arrays.fill(dArr, d3);
            k52.A0(k52Var3, dArr);
            int length4 = dArr.length;
            for (double d4 : dArr) {
                d3 += d4;
            }
            double dMax2 = h32.b / Math.max(ab2.a(d3 / ((double) length4)), ab2.a(lt.J(0, dArr5.length, dArr5)));
            int length5 = dArr6.length;
            for (int i15 = 0; i15 < length5; i15++) {
                dArr6[i15] = dArr6[i15] * dMax2;
            }
            ys.T(dArr5, 0, dArr5.length, 1, dMax2, dArr5);
            ab2Var.a *= dMax2;
            i2 = i4 + 1;
            q5Var2 = q5Var;
            th = th2;
            k52Var = k52Var5;
            u5Var = u5Var3;
        }
        Throwable th3 = th;
        lt.L(s5Var.h, dArr2);
        lt.L(s5Var2.h, dArr3);
        double[] dArr10 = q5Var.i;
        double[] dArr11 = s5Var2.i;
        lt.M(dArr10, dArr11);
        lt.M(q5Var.l, dArr11);
        t(true, false);
        k52 k52Var6 = q5Var.j;
        double[] dArr12 = k52Var6.p;
        double[] dArr13 = k52Var.p;
        double[] dArr14 = u5Var.j.h;
        int[] iArr7 = new int[dArr12.length];
        BitSet bitSet = new BitSet(dArr12.length + 1);
        int[] iArr8 = new int[dArr13.length];
        int i16 = k52Var.j;
        int[] iArr9 = new int[i16];
        wk wkVar = new wk(iArr7, bitSet, iArr8, iArr9);
        int i17 = k52Var6.h;
        i52 i52Var = new i52();
        int i18 = (i17 + i16) - 1;
        k52 k52Var7 = k52Var6;
        i52Var.b0(h32.a, i18, i18);
        int length6 = dArr12.length;
        int length7 = dArr13.length;
        int[] iArr10 = new int[length6];
        int[] iArr11 = new int[length6];
        int[] iArr12 = new int[length7];
        int[] iArr13 = new int[length7];
        int[] iArr14 = new int[i16];
        int[] iArr15 = new int[i16];
        int i19 = 0;
        while (true) {
            int[] iArr16 = iArr11;
            if (i19 >= i17) {
                double[] dArr15 = dArr13;
                int[] iArr17 = iArr7;
                int[] iArr18 = iArr9;
                int[] iArr19 = iArr10;
                int i20 = 0;
                while (i20 < i17) {
                    int[] iArr20 = k52Var.o;
                    int i21 = iArr20[i20];
                    int i22 = i20 + 1;
                    int i23 = iArr20[i22];
                    while (i21 < i23) {
                        int i24 = k52Var.n[i21];
                        int i25 = i23;
                        k52 k52Var8 = k52Var;
                        double d5 = dArr15[i21];
                        if (d5 == h32.a) {
                            wg.f();
                            throw th3;
                        }
                        int i26 = i24 + i17;
                        i52Var.b0(d5, i20, i26);
                        iArr12[i21] = i20;
                        iArr13[i21] = i26;
                        i21++;
                        i23 = i25;
                        k52Var = k52Var8;
                    }
                    i20 = i22;
                }
                for (int i27 = 0; i27 < i16; i27++) {
                    double d6 = -dArr14[i27];
                    if (d6 == h32.a) {
                        wg.f();
                        throw th3;
                    }
                    int i28 = i17 + i27;
                    i52Var.b0(d6, i28, i28);
                    iArr14[i27] = i28;
                    iArr15[i27] = i28;
                }
                int i29 = i52Var.i;
                int i30 = i52Var.h;
                cw cwVar = i52Var.j;
                ArrayList arrayList = cwVar.i;
                int size = arrayList.size();
                int i31 = 0;
                int i32 = 0;
                while (i32 < size) {
                    Object obj = arrayList.get(i32);
                    i32++;
                    i31 += ((cm2) obj).i;
                }
                k52 k52VarA0 = cwVar.a0(i29, i30, i31);
                int i33 = k52VarA0.h;
                int[] iArr21 = k52VarA0.n;
                int[] iArr22 = k52VarA0.o;
                for (int i34 = 0; i34 < length6; i34++) {
                    int i35 = iArr19[i34];
                    int i36 = iArr16[i34];
                    iArr17[i34] = ys.H(iArr22[i36], iArr22[i36 + 1], i35, iArr21);
                }
                for (int i37 = 0; i37 < length7; i37++) {
                    int i38 = iArr12[i37];
                    int i39 = iArr13[i37];
                    iArr8[i37] = ys.H(iArr22[i39], iArr22[i39 + 1], i38, iArr21);
                }
                for (int i40 = 0; i40 < i16; i40++) {
                    int i41 = iArr14[i40];
                    int i42 = iArr15[i40];
                    iArr18[i40] = ys.H(iArr22[i42], iArr22[i42 + 1], i41, iArr21);
                }
                g2 g2Var = new g2((byte) 29);
                ly1 ly1Var = (ly1) g2Var.i;
                int[] iArr23 = (int[]) wkVar.l;
                int[] iArr24 = (int[]) wkVar.j;
                int[] iArr25 = (int[]) wkVar.k;
                double[] dArr16 = k52VarA0.p;
                if (i33 <= 0) {
                    iArr = iArr21;
                } else {
                    int[] iArr26 = new int[i33];
                    int i43 = 0;
                    while (i43 < i33) {
                        int i44 = iArr22[i43];
                        while (true) {
                            i = i43 + 1;
                            iArr2 = iArr21;
                            if (i44 < iArr22[i]) {
                                int i45 = iArr2[i44];
                                if (i45 < i43) {
                                    iArr26[i45] = iArr26[i45] + 1;
                                    iArr26[i43] = iArr26[i43] + 1;
                                }
                                i44++;
                                iArr21 = iArr2;
                            }
                        }
                        i43 = i;
                        iArr21 = iArr2;
                    }
                    iArr = iArr21;
                    int iMax = 0;
                    for (int i46 = 0; i46 < i33; i46++) {
                        iMax = Math.max(iMax, iArr26[i46]);
                    }
                    int[] iArr27 = new int[iMax + 2];
                    for (int i47 = 0; i47 < i33; i47++) {
                        int i48 = iArr26[i47] + 1;
                        iArr27[i48] = iArr27[i48] + 1;
                    }
                    int i49 = 0;
                    while (i49 <= iMax) {
                        int i50 = i49 + 1;
                        iArr27[i50] = iArr27[i50] + iArr27[i49];
                        i49 = i50;
                    }
                    ly1Var.c(i33);
                    int[] iArr28 = ly1Var.c;
                    for (int i51 = 0; i51 < i33; i51++) {
                        int i52 = iArr26[i51];
                        int i53 = iArr27[i52];
                        iArr27[i52] = i53 + 1;
                        iArr28[i53] = i51;
                    }
                    ly1Var.b = true;
                    ly1Var.e = true;
                }
                int[] iArr29 = new int[dArr16.length];
                int[] iArrD = ly1Var.d();
                int[] iArr30 = new int[i33];
                k52 k52Var9 = new k52(i33, i33, iArr22[i33]);
                int i54 = 0;
                while (i54 < i33) {
                    int i55 = iArrD[i54];
                    int i56 = iArr22[i54];
                    i54++;
                    int[] iArr31 = iArrD;
                    int i57 = iArr22[i54];
                    double[] dArr17 = dArr16;
                    int i58 = i56;
                    while (i58 < i57) {
                        int i59 = i57;
                        int iMax2 = Math.max(iArr31[iArr[i58]], i55);
                        iArr30[iMax2] = iArr30[iMax2] + 1;
                        i58++;
                        i57 = i59;
                    }
                    iArrD = iArr31;
                    dArr16 = dArr17;
                }
                int[] iArr32 = iArrD;
                double[] dArr18 = dArr16;
                int i60 = 0;
                int i61 = 0;
                while (true) {
                    iArr3 = k52Var9.o;
                    if (i60 >= i33) {
                        break;
                    }
                    iArr3[i60] = i61;
                    int i62 = iArr30[i60] + i61;
                    iArr30[i60] = i61;
                    i60++;
                    i61 = i62;
                }
                iArr3[i33] = i61;
                int i63 = 0;
                while (i63 < i33) {
                    int i64 = iArr32[i63];
                    int i65 = iArr22[i63];
                    i63++;
                    int i66 = iArr22[i63];
                    while (i65 < i66) {
                        int i67 = i63;
                        int i68 = iArr32[iArr[i65]];
                        int iMax3 = Math.max(i68, i64);
                        int i69 = iArr30[iMax3];
                        iArr30[iMax3] = i69 + 1;
                        k52Var9.n[i69] = Math.min(i68, i64);
                        k52Var9.p[i69] = dArr18[i65];
                        iArr29[i65] = i69;
                        i65++;
                        i63 = i67;
                    }
                }
                int length8 = iArr23.length;
                for (int i70 = 0; i70 < length8; i70++) {
                    iArr23[i70] = iArr29[iArr23[i70]];
                }
                int length9 = iArr24.length;
                for (int i71 = 0; i71 < length9; i71++) {
                    iArr24[i71] = iArr29[iArr24[i71]];
                }
                int length10 = iArr25.length;
                for (int i72 = 0; i72 < length10; i72++) {
                    iArr25[i72] = iArr29[iArr25[i72]];
                }
                mm2 mm2Var = new mm2();
                x51 x51VarA0 = mm2Var.A0(k52Var9);
                mm2Var.reset();
                mm2Var.D0(k52Var9, x51VarA0, mm2Var.l, mm2Var.k, mm2Var.n);
                this.i = new ki0(wkVar, g2Var, mm2Var, x51VarA0, k52Var9, dArr14);
                this.e = is1.UNEXPLORED;
                return;
            }
            k52 k52Var10 = k52Var7;
            double[] dArr19 = dArr13;
            int[] iArr33 = k52Var10.o;
            int i73 = iArr33[i19];
            int i74 = i19 + 1;
            int i75 = iArr33[i74];
            int[] iArr34 = iArr7;
            int[] iArr35 = iArr9;
            int[] iArr36 = iArr10;
            int i76 = i73;
            boolean z = false;
            while (i76 < i75) {
                int i77 = k52Var10.n[i76];
                k52 k52Var11 = k52Var10;
                int i78 = i75;
                double d7 = dArr12[i76];
                if (d7 == h32.a) {
                    wg.f();
                    throw th3;
                }
                i52Var.b0(d7, i77, i19);
                iArr36[i76] = i77;
                iArr16[i76] = i19;
                if (i77 == i19) {
                    i52Var.q0(1.0E-6d, i77, i19);
                    ((BitSet) wkVar.i).set(i76, true);
                    z = true;
                }
                i76++;
                i75 = i78;
                k52Var10 = k52Var11;
            }
            k52 k52Var12 = k52Var10;
            if (!z) {
                i52Var.b0(1.0E-6d, i19, i19);
            }
            dArr13 = dArr19;
            iArr11 = iArr16;
            i19 = i74;
            iArr7 = iArr34;
            iArr9 = iArr35;
            k52Var7 = k52Var12;
            iArr10 = iArr36;
        }
    }

    @Override // defpackage.u23
    public final double b(int i) {
        double[] dArrQ = this.g;
        if (dArrQ == null) {
            dArrQ = q();
            this.g = dArrQ;
        }
        return dArrQ[i];
    }

    @Override // defpackage.u23
    public final boolean c(int i, double d, double d2) {
        cs1 cs1Var;
        t5 t5Var = this.l;
        int i2 = t5Var.a[i];
        if (i2 < 0) {
            return false;
        }
        this.g = null;
        double d3 = t5Var.b[i] * this.j.b.i[i2];
        q5 q5Var = this.h;
        q5Var.i[i2] = d * d3;
        q5Var.l[i2] = d3 * d2;
        m00 m00Var = t5Var.c;
        ih0[] ih0VarArr = m00Var.i;
        if (ih0VarArr != null) {
            boolean z = d > Double.NEGATIVE_INFINITY;
            boolean z2 = d2 < Double.POSITIVE_INFINITY;
            if (!z) {
                cs1Var = z2 ? cs1.l : cs1.j;
            } else if (z2) {
                cs1Var = d == d2 ? cs1.h : cs1.k;
            } else {
                cs1Var = cs1.i;
            }
            ih0 ih0Var = ih0VarArr[i2];
            if (ih0Var.j() != cs1Var) {
                int i3 = m00Var.m;
                ih0[] ih0VarArr2 = (ih0[]) ih0VarArr.clone();
                m00 m00Var2 = new m00(i3, ih0VarArr2, (BitSet) m00Var.k.clone());
                m00Var2.h.or(m00Var.h);
                m00Var2.j = m00Var.j;
                m00Var2.l = m00Var.l;
                ih0VarArr2[i2] = new hh0((mg1) ih0Var.R(), cs1Var);
                m00Var = m00Var2;
            }
        }
        t5Var.c = m00Var;
        this.e = is1.UNEXPLORED;
        return t(true, true);
    }

    @Override // defpackage.u23
    public final Optional d() {
        t5 t5Var = this.l;
        return t5Var != null ? Optional.of(t5Var) : Optional.empty();
    }

    @Override // defpackage.u23
    public final boolean e(int i, double d) {
        return c(i, d, d);
    }

    @Override // defpackage.nr0
    public final gs1 h(gs1 gs1Var) {
        boolean z;
        ds1 ds1Var = this.a;
        this.g = null;
        q5 q5Var = this.h;
        u5 u5Var = this.m;
        if (gs1Var != null && gs1Var.m.c()) {
            gs1Var.R1(u5Var.k);
            lt.M(u5Var.k, this.j.c.h);
            k52.F0(u5Var.s, q5Var.h, u5Var.k);
            Optional.ofNullable(gs1Var.i).map(new j5((byte) 0)).ifPresent(new b1(this, (byte) 1));
        }
        this.e = is1.UNEXPLORED;
        ki0 ki0Var = this.i;
        mm2 mm2Var = ki0Var.m;
        boolean z2 = mm2Var.h;
        double dO = Double.NaN;
        s5 s5Var = this.k;
        is1 is1Var = is1.FAILED;
        if (!z2) {
            this.e = is1Var;
            return s5Var.j(Double.NaN, is1Var, false);
        }
        if (!z2 || mm2Var.m != ki0Var.j.h - ki0Var.i.length) {
            is1 is1Var2 = is1.INVALID;
            this.e = is1Var2;
            return s5Var.j(Double.NaN, is1Var2, false);
        }
        try {
            k();
            k52 k52Var = q5Var.h;
            int i = k52Var.j;
            int i2 = k52Var.h;
            wo1 wo1Var = p5.a;
            int i3 = ds1Var.c;
            if (i3 == Integer.MAX_VALUE) {
                i3 = 10000;
            }
            int iMin = Math.min((int) (Math.sqrt(i + i2) * 400.0d), i3);
            int iMin2 = Math.min((int) (((double) iMin) * 2.0d), ds1Var.c);
            r5 r5Var = new r5(iMin, iMin2);
            int i4 = 1;
            boolean z3 = false;
            while (i4 <= iMin2) {
                i();
                r();
                z3 = i4 == 1 || i4 % 25 == 0;
                if (z3 && (p(false) || !j() || !r5Var.b(i4, u5Var.d))) {
                    break;
                }
                if (i4 % 25 == 0 && !n()) {
                    this.e = is1Var;
                    break;
                }
                i4++;
            }
            if (!z3) {
                p(false);
            }
            if (this.e.c()) {
                z = false;
            } else {
                boolean zP = p(true);
                z = zP && this.e.d();
                if (!zP || z) {
                    try {
                        this.e = is1.APPROXIMATE;
                    } catch (Exception e) {
                        e = e;
                        cl.b(e, "OSQP solve failed!", new Object[0]);
                        this.e = is1Var;
                    }
                }
            }
            s(z);
            dO = o();
        } catch (Exception e2) {
            e = e2;
            z = false;
        }
        gs1 gs1VarJ = s5Var.j(dO, this.e, z);
        if (r10.m(this.e)) {
            gs1VarJ.k = new k5(this, (byte) 0);
        }
        t5 t5Var = this.l;
        if (t5Var.c.j() && Optional.ofNullable(gs1VarJ.i).isPresent()) {
            m00 m00Var = t5Var.c;
            Supplier supplier = (Supplier) Optional.ofNullable(gs1VarJ.i).get();
            gs1VarJ.h = m00Var;
            gs1VarJ.i = supplier;
        }
        return gs1VarJ;
    }

    public final boolean n() {
        double dMax;
        double dMax2;
        u5 u5Var = this.m;
        double[] dArr = u5Var.t;
        double dJ = lt.J(0, dArr.length, dArr);
        if (Double.isNaN(u5Var.f)) {
            double[] dArr2 = u5Var.s;
            double dJ2 = lt.J(0, dArr2.length, dArr2);
            double[] dArr3 = u5Var.a;
            dMax = Math.max(dJ2, lt.J(0, dArr3.length, dArr3));
        } else {
            dMax = u5Var.f;
        }
        double d = dJ / (dMax + 1.0E-10d);
        double[] dArr4 = u5Var.l;
        double dJ3 = lt.J(0, dArr4.length, dArr4);
        if (Double.isNaN(u5Var.e)) {
            double[] dArr5 = this.h.k;
            double dJ4 = lt.J(0, dArr5.length, dArr5);
            double[] dArr6 = u5Var.p;
            double dJ5 = lt.J(0, dArr6.length, dArr6);
            double[] dArr7 = u5Var.h;
            dMax2 = Math.max(Math.max(dJ4, dJ5), lt.J(0, dArr7.length, dArr7));
        } else {
            dMax2 = u5Var.e;
        }
        double d2 = dJ3 / (dMax2 + 1.0E-10d);
        double dMin = Math.min(Math.max(1.0E-6d, Math.sqrt(d / (d2 + 1.0E-10d)) * u5Var.c), 1000000.0d);
        double d3 = u5Var.c;
        if (dMin <= d3 * 5.0d && dMin >= d3 / 5.0d) {
            return true;
        }
        u5Var.c = dMin;
        return t(false, true);
    }

    public final double o() {
        double d;
        double d2;
        double d3 = h32.a;
        q5 q5Var = this.h;
        k52 k52Var = q5Var.j;
        int[] iArr = k52Var.o;
        int[] iArr2 = k52Var.n;
        double[] dArr = k52Var.p;
        double[] dArr2 = this.m.k;
        int i = q5Var.h.h;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            int i4 = iArr[i3];
            for (int i5 = iArr[i2]; i5 < i4; i5++) {
                int i6 = iArr2[i5];
                if (i6 == i2) {
                    d = h32.f * dArr[i5] * dArr2[i6];
                    d2 = dArr2[i2];
                } else {
                    if (i6 < i2) {
                        d = dArr[i5] * dArr2[i6];
                        d2 = dArr2[i2];
                    }
                }
                d3 += d * d2;
            }
            i2 = i3;
        }
        double[] dArr3 = q5Var.k;
        int iMin = Math.min(dArr3.length, dArr2.length);
        double d4 = 0.0d;
        for (int i7 = 0; i7 < iMin; i7++) {
            d4 += dArr3[i7] * dArr2[i7];
        }
        return (d4 + d3) / (this.j.a * this.l.c.j);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x014f  */
    /* JADX WARN: Code duplicated, block: B:69:0x01fe A[EDGE_INSN: B:69:0x01fe->B:70:0x01ff BREAK  A[LOOP:1: B:58:0x01da->B:67:0x01f8]] */
    public final boolean p(boolean z) {
        double d;
        double d2;
        int i;
        int i2;
        int i3;
        int i4;
        double d3;
        boolean z2;
        boolean z3;
        boolean z4;
        wo1 wo1Var = z ? p5.c : p5.a;
        u5 u5Var = this.m;
        double[] dArr = u5Var.a;
        q5 q5Var = this.h;
        k52.F0(dArr, q5Var.h, u5Var.k);
        aa3.v(u5Var.t, h32.e, u5Var.s, u5Var.a);
        double[] dArr2 = u5Var.t;
        int i5 = 0;
        double dJ = lt.J(0, dArr2.length, dArr2);
        double[] dArr3 = q5Var.k;
        double[] dArr4 = u5Var.l;
        k52 k52Var = q5Var.h;
        System.arraycopy(dArr3, 0, dArr4, 0, k52Var.h);
        double[] dArr5 = u5Var.h;
        k52.U0(dArr5, q5Var.j, u5Var.k);
        double[] dArr6 = u5Var.l;
        double d4 = h32.b;
        aa3.v(dArr6, d4, dArr5, dArr6);
        double[] dArr7 = u5Var.p;
        k52.M0(dArr7, u5Var.o, k52Var);
        double[] dArr8 = u5Var.l;
        aa3.v(dArr8, 1.0d, dArr7, dArr8);
        double[] dArr9 = u5Var.l;
        double dJ2 = lt.J(0, dArr9.length, dArr9);
        u5Var.getClass();
        double[] dArr10 = u5Var.q;
        if (dJ > 1.0E32d || dJ2 > 1.0E32d) {
            this.e = is1.INVALID;
            return true;
        }
        double[] dArr11 = u5Var.s;
        double dJ3 = lt.J(0, dArr11.length, dArr11);
        double[] dArr12 = u5Var.a;
        double dMax = Math.max(dJ3, lt.J(0, dArr12.length, dArr12));
        u5Var.f = dMax;
        double dX = dJ / wo1Var.x(dMax);
        if (dX < d4) {
            i = 0;
            d2 = dJ2;
            i3 = 1;
            d = 1.0000000000000002E28d;
        } else {
            wo1 wo1Var2 = z ? p5.c : p5.d;
            k52 k52Var2 = q5Var.h;
            d = 1.0000000000000002E28d;
            double[] dArr13 = q5Var.i;
            double[] dArr14 = q5Var.l;
            int i6 = k52Var2.j;
            int i7 = 0;
            while (i7 < i6) {
                if (dArr14[i7] <= 1.0000000000000002E28d) {
                    i4 = i7;
                    d3 = dJ2;
                    if (dArr13[i4] < -1.0000000000000002E28d) {
                        dArr10[i4] = Math.max(dArr10[i4], 0.0d);
                    }
                } else if (dArr13[i7] < -1.0000000000000002E28d) {
                    dArr10[i7] = 0.0d;
                    i4 = i7;
                    d3 = dJ2;
                } else {
                    i4 = i7;
                    d3 = dJ2;
                    dArr10[i4] = Math.min(dArr10[i4], 0.0d);
                }
                i7 = i4 + 1;
                dJ2 = d3;
            }
            d2 = dJ2;
            double[] dArr15 = u5Var.r;
            double dJ4 = lt.J(0, dArr10.length, dArr10);
            double dX2 = wo1Var2.x(dJ4);
            if (wo1.D(dJ4, wo1Var2.j)) {
                i = 0;
                i2 = i;
            } else {
                int i8 = k52Var2.j;
                double dMin = 0.0d;
                int i9 = 0;
                while (i9 < i8) {
                    int i10 = i9;
                    dMin = (Math.min(dArr10[i10], 0.0d) * dArr13[i10]) + (Math.max(dArr10[i9], 0.0d) * dArr14[i9]) + dMin;
                    i9 = i10 + 1;
                }
                if (dMin < (-dX2)) {
                    k52.M0(dArr15, dArr10, k52Var2);
                    i = 0;
                    if (lt.J(0, dArr15.length, dArr15) < dX2) {
                        i2 = 1;
                    }
                } else {
                    i = 0;
                }
                i2 = i;
            }
            i3 = i;
            i5 = i2;
        }
        double[] dArr16 = q5Var.k;
        double dJ5 = lt.J(i, dArr16.length, dArr16);
        double[] dArr17 = u5Var.p;
        double dJ6 = lt.J(i, dArr17.length, dArr17);
        double[] dArr18 = u5Var.h;
        int i11 = i3;
        double dMax2 = Math.max(Math.max(dJ5, dJ6), lt.J(i, dArr18.length, dArr18));
        u5Var.e = dMax2;
        double dX3 = wo1Var.x(dMax2);
        if (!z) {
            u5Var.d = Math.max(dX, d2 / dX3);
        }
        if (d2 < dX3) {
            z4 = true;
            z3 = false;
        } else {
            wo1 wo1Var3 = p5.c;
            double[] dArr19 = u5Var.m;
            double[] dArr20 = u5Var.i;
            double[] dArr21 = u5Var.b;
            double dJ7 = lt.J(0, dArr19.length, dArr19);
            if (wo1.D(dJ7, wo1Var3.j)) {
                z2 = false;
                break;
            }
            double dX4 = wo1Var3.x(dJ7);
            double[] dArr22 = q5Var.k;
            k52 k52Var3 = q5Var.h;
            int iMin = Math.min(dArr22.length, dArr19.length);
            double d5 = 0.0d;
            for (int i12 = 0; i12 < iMin; i12++) {
                d5 = (dArr22[i12] * dArr19[i12]) + d5;
            }
            double d6 = -dX4;
            if (d5 >= d6) {
                z2 = false;
                break;
            }
            k52.U0(dArr20, q5Var.j, dArr19);
            if (lt.J(0, dArr20.length, dArr20) >= dX4) {
                z2 = false;
                break;
            }
            k52.F0(dArr21, k52Var3, dArr19);
            int i13 = k52Var3.j;
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    z2 = true;
                    break;
                }
                if ((q5Var.l[i14] < d && dArr21[i14] > dX4) || (q5Var.i[i14] > -1.0000000000000002E28d && dArr21[i14] < d6)) {
                    z2 = false;
                    break;
                }
                i14++;
            }
            z3 = z2;
            z4 = false;
        }
        if (i11 != 0 && z4) {
            this.e = is1.OPTIMAL;
            return true;
        }
        if (i5 != 0) {
            this.e = is1.INFEASIBLE;
            return true;
        }
        if (z3) {
            this.e = is1.UNBOUNDED;
            return true;
        }
        this.e = is1.APPROXIMATE;
        return false;
    }

    public final double[] q() {
        t5 t5Var;
        q5 q5Var = this.h;
        int i = q5Var.h.h;
        double[] dArr = new double[i];
        double[] dArr2 = new double[i];
        double[] dArr3 = new double[i];
        u5 u5Var = this.m;
        double[] dArr4 = u5Var.o;
        double[] dArrCopyOf = Arrays.copyOf(dArr4, dArr4.length);
        int i2 = 0;
        while (true) {
            t5Var = this.l;
            if (i2 >= i) {
                break;
            }
            int i3 = t5Var.a[i2];
            if (i3 >= 0) {
                dArrCopyOf[i3] = h32.a;
            }
            i2++;
        }
        k52.U0(dArr2, q5Var.j, u5Var.k);
        k52.M0(dArr3, dArrCopyOf, q5Var.h);
        double d = h32.b;
        ab2 ab2Var = this.j;
        double d2 = d / (ab2Var.a * t5Var.c.j);
        for (int i4 = 0; i4 < i; i4++) {
            dArr[i4] = (dArr2[i4] + q5Var.k[i4] + dArr3[i4]) * ab2Var.c.h[i4] * d2;
        }
        return dArr;
    }

    public final void r() {
        u5 u5Var = this.m;
        double[] dArr = u5Var.l;
        double[] dArr2 = u5Var.o;
        s5 s5Var = u5Var.j;
        double[] dArr3 = u5Var.n;
        u5Var.l = u5Var.k;
        u5Var.k = dArr;
        double[] dArr4 = u5Var.t;
        u5Var.t = u5Var.s;
        u5Var.s = dArr4;
        q5 q5Var = this.h;
        k52 k52Var = q5Var.h;
        int i = k52Var.j;
        int i2 = k52Var.h;
        for (int i3 = 0; i3 < i2; i3++) {
            dArr3[i3] = (u5Var.l[i3] * 1.0E-6d) - q5Var.k[i3];
        }
        for (int i4 = 0; i4 < i; i4++) {
            dArr3[i2 + i4] = u5Var.t[i4] - (s5Var.h[i4] * dArr2[i4]);
        }
        this.i.x1(dArr3);
        for (int i5 = 0; i5 < i2; i5++) {
            double d = dArr3[i5];
            double[] dArr5 = u5Var.l;
            double d2 = d - dArr5[i5];
            double[] dArr6 = u5Var.m;
            double d3 = p5.b * d2;
            dArr6[i5] = d3;
            u5Var.k[i5] = dArr5[i5] + d3;
        }
        for (int i6 = 0; i6 < i; i6++) {
            double d4 = p5.b;
            u5Var.s[i6] = Math.min(Math.max(q5Var.i[i6], (s5Var.h[i6] * dArr2[i6]) + ((h32.b - d4) * u5Var.t[i6]) + (dArr3[i6 + i2] * d4)), q5Var.l[i6]);
        }
        for (int i7 = 0; i7 < i; i7++) {
            double[] dArr7 = u5Var.q;
            double d5 = s5Var.i[i7];
            double d6 = p5.b;
            double d7 = ((((h32.b - d6) * u5Var.t[i7]) + (dArr3[i7 + i2] * d6)) - u5Var.s[i7]) * d5;
            dArr7[i7] = d7;
            dArr2[i7] = dArr2[i7] + d7;
        }
    }

    public final void s(boolean z) {
        boolean zC = this.e.c();
        q5 q5Var = this.h;
        u5 u5Var = this.m;
        s5 s5Var = this.k;
        if (zC || z) {
            double[] dArr = u5Var.k;
            double[] dArr2 = s5Var.h;
            double[] dArr3 = s5Var.i;
            System.arraycopy(dArr, 0, dArr2, 0, q5Var.h.h);
            System.arraycopy(u5Var.o, 0, dArr3, 0, q5Var.h.j);
            ab2 ab2Var = this.j;
            ab2Var.getClass();
            lt.M(s5Var.h, ab2Var.c.i);
            lt.M(dArr3, ab2Var.b.i);
            ys.T(dArr3, 0, dArr3.length, 1, h32.b / ab2Var.a, dArr3);
            return;
        }
        Arrays.fill(s5Var.h, 0, q5Var.h.h, Double.NaN);
        Arrays.fill(s5Var.i, 0, q5Var.h.j, Double.NaN);
        if (this.e == is1.INFEASIBLE) {
            double[] dArr4 = u5Var.q;
            double d = h32.b;
            ys.T(dArr4, 0, dArr4.length, 1, d / lt.J(0, dArr4.length, dArr4), dArr4);
            double[] dArr5 = u5Var.m;
            ys.T(dArr5, 0, dArr5.length, 1, d / lt.J(0, dArr5.length, dArr5), dArr5);
        }
        Arrays.fill(u5Var.k, 0.0d);
        Arrays.fill(u5Var.s, 0.0d);
        Arrays.fill(u5Var.o, 0.0d);
    }

    public final boolean t(boolean z, boolean z2) {
        u5 u5Var;
        byte b;
        double d;
        q5 q5Var = this.h;
        k52 k52Var = q5Var.h;
        double[] dArr = q5Var.l;
        int i = k52Var.j;
        int i2 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            u5Var = this.m;
            if (i2 >= i) {
                break;
            }
            byte[] bArr = u5Var.g;
            byte b2 = bArr[i2];
            if (z) {
                double d2 = q5Var.i[i2];
                b = (d2 >= -1.0000000000000002E28d || dArr[i2] <= 1.0000000000000002E28d) ? dArr[i2] - d2 < 1.0E-4d ? (byte) 1 : (byte) 0 : (byte) -1;
            } else {
                b = b2;
            }
            if (b == -1) {
                d = 1.0E-6d;
            } else {
                d = u5Var.c;
                if (b == 1) {
                    d *= 10000.0d;
                }
            }
            if (b != b2) {
                bArr[i2] = b;
                z4 = true;
            }
            double[] dArr2 = u5Var.j.i;
            if (dArr2[i2] != d) {
                dArr2[i2] = d;
                z3 = true;
            }
            i2++;
        }
        if (z3) {
            s5 s5Var = u5Var.j;
            lt.L(s5Var.h, s5Var.i);
        }
        if (!z2 || (!z3 && !z4)) {
            return true;
        }
        s5 s5Var2 = u5Var.j;
        ki0 ki0Var = this.i;
        ki0Var.getClass();
        double[] dArr3 = s5Var2.h;
        ki0Var.i = dArr3;
        k52 k52Var2 = ki0Var.j;
        double[] dArr4 = k52Var2.p;
        int[] iArr = (int[]) ki0Var.k.k;
        int length = dArr3.length;
        for (int i3 = 0; i3 < length; i3++) {
            dArr4[iArr[i3]] = -dArr3[i3];
        }
        mm2 mm2Var = ki0Var.m;
        x51 x51Var = ki0Var.h;
        mm2Var.reset();
        return mm2Var.D0(k52Var2, x51Var, mm2Var.l, mm2Var.k, mm2Var.n);
    }
}
