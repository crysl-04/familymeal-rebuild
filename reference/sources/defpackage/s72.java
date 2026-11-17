package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class s72 {
    public final si1 a;
    public final t6 b;
    public final u8 c;
    public final nx2 d;
    public final fj1 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public t i;
    public long j;
    public final xu1 k;
    public final lj1 l;

    public s72(si1 si1Var, t6 t6Var) {
        this.a = si1Var;
        this.b = t6Var;
        u8 u8Var = new u8();
        u8Var.b = new long[192];
        u8Var.c = new long[192];
        this.c = u8Var;
        this.d = new nx2();
        this.e = new fj1();
        this.j = -1L;
        this.k = new xu1(this, (byte) 2);
        this.l = new lj1();
    }

    public static boolean c(pn1 pn1Var) {
        gt1 gt1Var = pn1Var.a0;
        return (gt1Var == null || vs.J(((es0) gt1Var).b())) ? false : true;
    }

    public static long f(l41 l41Var) {
        ln1 ln1Var = l41Var.L;
        pn1 pn1Var = ln1Var.d;
        long jC = 0;
        for (pn1 pn1Var2 = ln1Var.c; pn1Var2 != null && pn1Var2 != pn1Var; pn1Var2 = pn1Var2.D) {
            if (c(pn1Var2)) {
                return 9223372034707292159L;
            }
            jC = ny0.c(jC, pn1Var2.M);
        }
        return jC;
    }

    public static void i(l41 l41Var) {
        if (!l41Var.j || c(l41Var.L.d)) {
            return;
        }
        l41Var.j = false;
        if (l41Var.l) {
            l41Var.k = f(l41Var);
            l41Var.l = false;
        }
        if (ny0.a(l41Var.k, 9223372034707292159L)) {
            return;
        }
        uj1 uj1VarZ = l41Var.z();
        Object[] objArr = uj1VarZ.h;
        int i = uj1VarZ.j;
        for (int i2 = 0; i2 < i; i2++) {
            i((l41) objArr[i2]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x024a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x024c A[LOOP:9: B:90:0x021b->B:102:0x024c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:105:0x0253 A[ADDED_TO_REGION, LOOP:12: B:105:0x0253->B:106:0x0255, LOOP_START, PHI: r1
  0x0253: PHI (r1v8 mx2) = (r1v7 mx2), (r1v9 mx2) binds: [B:104:0x0251, B:106:0x0255] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:106:0x0255 A[LOOP:12: B:105:0x0253->B:106:0x0255, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x0260  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x024f A[EDGE_INSN: B:132:0x024f->B:103:0x024f BREAK  A[LOOP:9: B:90:0x021b->B:102:0x024c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x024f A[EDGE_INSN: B:133:0x024f->B:103:0x024f BREAK  A[LOOP:9: B:90:0x021b->B:102:0x024c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0176  */
    /* JADX WARN: Code duplicated, block: B:69:0x0180 A[ADDED_TO_REGION, LOOP:7: B:69:0x0180->B:70:0x0182, LOOP_START, PHI: r3
  0x0180: PHI (r3v6 mx2) = (r3v5 mx2), (r3v7 mx2) binds: [B:68:0x017e, B:70:0x0182] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0182 A[LOOP:7: B:69:0x0180->B:70:0x0182, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x0208  */
    /* JADX WARN: Code duplicated, block: B:87:0x020f  */
    /* JADX WARN: Code duplicated, block: B:89:0x021a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0227  */
    /* JADX WARN: Code duplicated, block: B:94:0x0232  */
    /* JADX WARN: Code duplicated, block: B:96:0x0238  */
    /* JADX WARN: Code duplicated, block: B:98:0x0241 A[LOOP:11: B:97:0x023f->B:98:0x0241, LOOP_END] */
    public final void a() {
        boolean z;
        long j;
        int i;
        long j2;
        long j3;
        int i2;
        long j4;
        Object[] objArr;
        long[] jArr;
        int length;
        mx2 mx2Var;
        int i3;
        long j5;
        int i4;
        long j6;
        int i5;
        mx2 mx2Var2;
        long[] jArr2;
        long[] jArr3;
        int i6;
        int i7;
        int i8;
        long j7;
        long j8;
        float[] fArr;
        mx2 mx2Var3;
        long[] jArr4;
        long j9;
        long j10;
        t tVar = this.i;
        if (tVar != null) {
            this.b.removeCallbacks(tVar);
            this.i = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.f;
        boolean z3 = z2 || this.g;
        u8 u8Var = this.c;
        boolean z4 = true;
        nx2 nx2Var = this.d;
        if (z2) {
            this.f = false;
            fj1 fj1Var = this.e;
            Object[] objArr2 = fj1Var.a;
            int i9 = fj1Var.b;
            for (int i10 = 0; i10 < i9; i10++) {
                ((kp0) objArr2[i10]).a();
            }
            long[] jArr5 = (long[]) u8Var.b;
            int i11 = u8Var.a;
            int i12 = 0;
            while (i12 < jArr5.length - 2 && i12 < i11) {
                long j11 = jArr5[i12 + 2];
                boolean z5 = z4;
                int i13 = i11;
                if ((((int) (j11 >> 60)) & 1) != 0) {
                    long j12 = jArr5[i12];
                    long j13 = jArr5[i12 + 1];
                    mx2 mx2Var4 = (mx2) nx2Var.a.b(((int) j11) & 33554431);
                    while (mx2Var4 != null) {
                        mx2 mx2Var5 = mx2Var4.d;
                        boolean z6 = z3;
                        long j14 = mx2Var4.g;
                        boolean z7 = (jCurrentTimeMillis - j14 >= 0 || j14 == Long.MIN_VALUE) ? z5 : false;
                        mx2Var4.e = j12;
                        mx2Var4.f = j13;
                        if (z7) {
                            mx2Var4.g = jCurrentTimeMillis;
                            j9 = j12;
                            j10 = j13;
                            mx2Var4.a(j9, j10, nx2Var.d, nx2Var.e, nx2Var.g);
                        } else {
                            j9 = j12;
                            j10 = j13;
                        }
                        mx2Var4 = mx2Var5;
                        j12 = j9;
                        j13 = j10;
                        z3 = z6;
                    }
                }
                i12 += 3;
                z4 = z5;
                i11 = i13;
                z3 = z3;
            }
            z = z3;
            j = 0;
            long[] jArr6 = (long[]) u8Var.b;
            int i14 = u8Var.a;
            for (int i15 = 0; i15 < jArr6.length - 2 && i15 < i14; i15 += 3) {
                int i16 = i15 + 2;
                jArr6[i16] = jArr6[i16] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.g) {
            this.g = false;
            long j15 = nx2Var.d;
            long j16 = nx2Var.e;
            float[] fArr2 = nx2Var.g;
            si1 si1Var = nx2Var.a;
            j2 = 128;
            Object[] objArr3 = si1Var.c;
            long[] jArr7 = si1Var.a;
            int length2 = jArr7.length - 2;
            if (length2 >= 0) {
                int i17 = 0;
                int i18 = 8;
                j3 = 255;
                while (true) {
                    long j17 = j15;
                    long j18 = jArr7[i17];
                    int i19 = i18;
                    u8Var = u8Var;
                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i20 = 8 - ((~(i17 - length2)) >>> 31);
                        long j19 = j18;
                        int i21 = 0;
                        while (i21 < i20) {
                            if ((j19 & 255) < 128) {
                                mx2 mx2Var6 = (mx2) objArr3[(i17 << 3) + i21];
                                while (mx2Var6 != null) {
                                    nx2Var.a(mx2Var6, j17, j16, fArr2, jCurrentTimeMillis);
                                    mx2Var6 = mx2Var6.d;
                                    i19 = i19;
                                    jArr7 = jArr7;
                                }
                            }
                            long[] jArr8 = jArr7;
                            int i22 = i19;
                            j19 >>= i22;
                            i21++;
                            j17 = j17;
                            i19 = i22;
                            jArr7 = jArr8;
                        }
                        jArr4 = jArr7;
                        i = i19;
                        j15 = j17;
                        if (i20 != i) {
                            break;
                        }
                    } else {
                        jArr4 = jArr7;
                        i = i19;
                        j15 = j17;
                    }
                    if (i17 == length2) {
                        break;
                    }
                    i17++;
                    i18 = i;
                    u8Var = u8Var;
                    jArr7 = jArr4;
                }
            } else {
                i = 8;
            }
            if (z) {
                j7 = nx2Var.d;
                j8 = nx2Var.e;
                fArr = nx2Var.g;
                mx2Var3 = nx2Var.b;
                if (mx2Var3 != null) {
                    while (mx2Var3 != null) {
                        l41 l41VarY = cu.Y(mx2Var3.b);
                        long jB = o41.a(l41VarY).getRectManager().b(l41VarY);
                        mx2Var3.e = jB;
                        ye1 ye1Var = l41VarY.M.p;
                        mx2Var3.f = (((long) (ye1Var.h + ((int) (jB >> 32)))) << 32) | (((long) (ye1Var.i + ((int) (jB & 4294967295L)))) & 4294967295L);
                        nx2Var.a(mx2Var3, j7, j8, fArr, jCurrentTimeMillis);
                        mx2Var3 = mx2Var3.d;
                    }
                }
            }
            if (this.h) {
                i2 = 0;
                this.h = false;
                u8 u8Var2 = u8Var;
                jArr2 = (long[]) u8Var2.b;
                int i23 = u8Var2.a;
                jArr3 = (long[]) u8Var2.c;
                i7 = 0;
                for (i6 = 0; i6 < jArr2.length - 2 && i7 < jArr3.length - 2 && i6 < i23; i6 += 3) {
                    i8 = i6 + 2;
                    if (jArr2[i8] != 1125899906842623L) {
                        jArr3[i7] = jArr2[i6];
                        jArr3[i7 + 1] = jArr2[i6 + 1];
                        jArr3[i7 + 2] = jArr2[i8];
                        i7 += 3;
                    }
                }
                u8Var2.a = i7;
                u8Var2.b = jArr3;
                u8Var2.c = jArr2;
            } else {
                i2 = 0;
            }
            j4 = nx2Var.c;
            if (j4 <= jCurrentTimeMillis) {
                si1 si1Var2 = nx2Var.a;
                objArr = si1Var2.c;
                jArr = si1Var2.a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i3 = i2;
                    while (true) {
                        j5 = jArr[i3];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            i4 = 8 - ((~(i3 - length)) >>> 31);
                            j6 = j5;
                            for (i5 = i2; i5 < i4; i5++) {
                                if ((j6 & j3) < j2) {
                                    for (mx2Var2 = (mx2) objArr[(i3 << 3) + i5]; mx2Var2 != null; mx2Var2 = mx2Var2.d) {
                                    }
                                }
                                j6 >>= i;
                            }
                            if (i4 == i) {
                                break;
                            } else if (i3 != length) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                mx2Var = nx2Var.b;
                if (mx2Var != null) {
                    while (mx2Var != null) {
                        mx2Var = mx2Var.d;
                    }
                }
                j4 = -1;
                nx2Var.c = -1L;
            }
            if (j4 > j) {
                j();
            }
        }
        i = 8;
        j2 = 128;
        j3 = 255;
        if (z) {
            j7 = nx2Var.d;
            j8 = nx2Var.e;
            fArr = nx2Var.g;
            mx2Var3 = nx2Var.b;
            if (mx2Var3 != null) {
                while (mx2Var3 != null) {
                    l41 l41VarY2 = cu.Y(mx2Var3.b);
                    long jB2 = o41.a(l41VarY2).getRectManager().b(l41VarY2);
                    mx2Var3.e = jB2;
                    ye1 ye1Var2 = l41VarY2.M.p;
                    mx2Var3.f = (((long) (ye1Var2.h + ((int) (jB2 >> 32)))) << 32) | (((long) (ye1Var2.i + ((int) (jB2 & 4294967295L)))) & 4294967295L);
                    nx2Var.a(mx2Var3, j7, j8, fArr, jCurrentTimeMillis);
                    mx2Var3 = mx2Var3.d;
                }
            }
        }
        if (this.h) {
            i2 = 0;
            this.h = false;
            u8 u8Var3 = u8Var;
            jArr2 = (long[]) u8Var3.b;
            int i24 = u8Var3.a;
            jArr3 = (long[]) u8Var3.c;
            i7 = 0;
            while (i6 < jArr2.length - 2) {
                i8 = i6 + 2;
                if (jArr2[i8] != 1125899906842623L) {
                    jArr3[i7] = jArr2[i6];
                    jArr3[i7 + 1] = jArr2[i6 + 1];
                    jArr3[i7 + 2] = jArr2[i8];
                    i7 += 3;
                }
            }
            u8Var3.a = i7;
            u8Var3.b = jArr3;
            u8Var3.c = jArr2;
        } else {
            i2 = 0;
        }
        j4 = nx2Var.c;
        if (j4 <= jCurrentTimeMillis) {
            si1 si1Var3 = nx2Var.a;
            objArr = si1Var3.c;
            jArr = si1Var3.a;
            length = jArr.length - 2;
            if (length >= 0) {
                i3 = i2;
                while (true) {
                    j5 = jArr[i3];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        i4 = 8 - ((~(i3 - length)) >>> 31);
                        j6 = j5;
                        while (i5 < i4) {
                            if ((j6 & j3) < j2) {
                                while (mx2Var2 != null) {
                                }
                            }
                            j6 >>= i;
                        }
                        if (i4 == i) {
                            break;
                            break;
                        } else {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
            mx2Var = nx2Var.b;
            if (mx2Var != null) {
                while (mx2Var != null) {
                    mx2Var = mx2Var.d;
                }
            }
            j4 = -1;
            nx2Var.c = -1L;
        }
        if (j4 > j) {
            j();
        }
    }

    public final long b(l41 l41Var) {
        if (l41Var.n == -4) {
            return 9223372034707292159L;
        }
        long j = ((long[]) this.c.b)[d(l41Var)];
        return (((long) ((int) (j >> 32))) << 32) | (((long) ((int) j)) & 4294967295L);
    }

    public final int d(l41 l41Var) {
        int i = l41Var.n;
        if (i == -4) {
            i = -4;
            break;
        }
        int i2 = l41Var.i;
        u8 u8Var = this.c;
        long[] jArr = (long[]) u8Var.b;
        if (i < 0 || i >= u8Var.a - 2 || (((int) jArr[i + 2]) & 33554431) != (i2 & 33554431)) {
            int i3 = i2 & 33554431;
            int i4 = u8Var.a;
            i = 0;
            while (true) {
                if (i >= i4 - 2) {
                    i = -4;
                    break;
                }
                if ((((int) jArr[i + 2]) & 33554431) == i3) {
                    break;
                }
                i += 3;
            }
        }
        if (i == -4) {
            ax0.a("LayoutNode " + l41Var.i + " not found in RectList");
        }
        l41Var.n = i;
        return i;
    }

    public final void e(l41 l41Var) {
        int i;
        l41Var.j = true;
        ln1 ln1Var = l41Var.L;
        ye1 ye1Var = l41Var.M.p;
        int iK0 = ye1Var.k0();
        float fJ0 = ye1Var.j0();
        lj1 lj1Var = this.l;
        lj1Var.a = 0.0f;
        lj1Var.b = 0.0f;
        lj1Var.c = iK0;
        lj1Var.d = fJ0;
        for (pn1 pn1Var = ln1Var.d; pn1Var != null; pn1Var = pn1Var.D) {
            l41 l41Var2 = pn1Var.B;
            if (pn1Var == l41Var2.L.d && !l41Var2.j) {
                long jB = b(l41Var2);
                if (!ny0.a(jB, 9223372034707292159L)) {
                    lj1Var.c((((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L));
                    break;
                }
            }
            gt1 gt1Var = pn1Var.a0;
            if (gt1Var != null) {
                float[] fArrB = ((es0) gt1Var).b();
                if (!vs.J(fArrB)) {
                    ke1.c(fArrB, lj1Var);
                }
            }
            long j = pn1Var.M;
            lj1Var.c((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L));
        }
        int i2 = (int) lj1Var.a;
        int i3 = (int) lj1Var.b;
        int i4 = (int) lj1Var.c;
        int i5 = (int) lj1Var.d;
        int i6 = l41Var.i;
        int i7 = l41Var.n;
        u8 u8Var = this.c;
        int iD = -4;
        if (i7 != -4) {
            int iD2 = d(l41Var);
            long[] jArr = (long[]) u8Var.b;
            jArr[iD2] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
            jArr[iD2 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
            int i8 = iD2 + 2;
            long j2 = jArr[i8];
            jArr[i8] = j2 | (((j2 >> 63) & 1) << 60);
        } else {
            l41 l41VarU = l41Var.u();
            if (l41VarU != null) {
                i = l41VarU.i;
                iD = d(l41VarU);
            } else {
                i = -1;
            }
            l41Var.n = u8Var.e(i6, i2, i3, i4, i5, i, iD, ln1Var.c(1024), ln1Var.c(16), this.d.a.a(i6));
        }
        l41Var.m = false;
        this.f = true;
        uj1 uj1VarZ = l41Var.z();
        Object[] objArr = uj1VarZ.h;
        int i9 = uj1VarZ.j;
        for (int i10 = 0; i10 < i9; i10++) {
            l41 l41Var3 = (l41) objArr[i10];
            if (l41Var3.J()) {
                e(l41Var3);
            }
        }
    }

    public final void g(l41 l41Var) {
        long j;
        boolean zJ = l41Var.J();
        ln1 ln1Var = l41Var.L;
        if (zJ && l41Var.m) {
            l41 l41VarU = l41Var.u();
            if (l41VarU == null) {
                j = 0;
            } else if (l41VarU.j) {
                j = 9223372034707292159L;
            } else {
                if (l41VarU.l) {
                    l41VarU.l = false;
                    l41VarU.k = f(l41VarU);
                }
                j = l41VarU.k;
            }
            pn1 pn1Var = ln1Var.d;
            if (ny0.a(j, 9223372034707292159L) || c(pn1Var)) {
                e(l41Var);
            } else if (l41Var.j) {
                e(l41Var);
                i(l41Var);
            } else {
                long jC = ny0.c(j, pn1Var.M);
                ye1 ye1Var = l41Var.M.p;
                int iK0 = ye1Var.k0();
                int iJ0 = ye1Var.j0();
                int i = l41Var.n;
                u8 u8Var = this.c;
                if (i != -4) {
                    int iD = d(l41Var);
                    if (l41VarU != null) {
                        int iD2 = d(l41VarU);
                        long[] jArr = (long[]) u8Var.b;
                        long j2 = jArr[iD2];
                        int i2 = ((int) (j2 >> 32)) + ((int) (jC >> 32));
                        int i3 = ((int) j2) + ((int) (jC & 4294967295L));
                        long j3 = jArr[iD];
                        int i4 = i2 - ((int) (j3 >> 32));
                        int i5 = i3 - ((int) j3);
                        int i6 = iD + 2;
                        long j4 = jArr[i6];
                        jArr[iD] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
                        jArr[iD + 1] = (((long) (iK0 + i2)) << 32) | (((long) (iJ0 + i3)) & 4294967295L);
                        jArr[i6] = (((j4 >> 63) & 1) << 60) | j4;
                        if (i4 != 0 || i5 != 0) {
                            u8Var.f(iD, i4, i5, j4);
                        }
                    } else {
                        int iD3 = d(l41Var);
                        int i7 = (int) (jC >> 32);
                        int i8 = (int) (jC & 4294967295L);
                        long[] jArr2 = (long[]) u8Var.b;
                        long j5 = jArr2[iD3];
                        jArr2[iD3] = (((long) i7) << 32) | (((long) i8) & 4294967295L);
                        jArr2[iD3 + 1] = (((long) (iK0 + i7)) << 32) | (((long) (iJ0 + i8)) & 4294967295L);
                        int i9 = iD3 + 2;
                        long j6 = jArr2[i9];
                        jArr2[i9] = (((j6 >> 63) & 1) << 60) | j6;
                        int i10 = i7 - ((int) (j5 >> 32));
                        int i11 = i8 - ((int) j5);
                        if (i10 != 0 || i11 != 0) {
                            u8Var.f(iD3, i10, i11, j6);
                        }
                    }
                } else {
                    int i12 = l41Var.i;
                    boolean zC = ln1Var.c(1024);
                    boolean zC2 = ln1Var.c(16);
                    boolean zA = this.d.a.a(i12);
                    if (l41VarU != null) {
                        int i13 = l41VarU.i;
                        int iD4 = d(l41VarU);
                        int i14 = (int) (jC >> 32);
                        int i15 = (int) (jC & 4294967295L);
                        int i16 = i12 & 33554431;
                        long[] jArr3 = (long[]) u8Var.b;
                        if ((((int) jArr3[iD4 + 2]) & 33554431) != (33554431 & i13)) {
                            ax0.a("Inserted child " + i16 + " without valid parent index or parent " + i13 + " not found");
                        }
                        long j7 = jArr3[iD4];
                        int i17 = (int) j7;
                        int i18 = ((int) (j7 >> 32)) + i14;
                        int i19 = i17 + i15;
                        l41Var.n = u8Var.e(i16, i18, i19, iK0 + i18, i19 + iJ0, i13, iD4, zC, zC2, zA);
                    } else {
                        int i20 = (int) (jC >> 32);
                        int i21 = (int) (jC & 4294967295L);
                        l41Var.n = u8Var.e(i12, i20, i21, i20 + iK0, i21 + iJ0, -1, -4, zC, zC2, zA);
                    }
                }
            }
            l41Var.m = false;
            this.f = true;
            j();
        }
    }

    public final void h(l41 l41Var) {
        if (l41Var.n != -4) {
            int iD = d(l41Var);
            long[] jArr = (long[]) this.c.b;
            jArr[iD] = -1;
            jArr[iD + 1] = -1;
            jArr[iD + 2] = 1125899906842623L;
            l41Var.n = -4;
            l41Var.m = true;
            this.f = true;
            this.h = true;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void j() {
        t tVar = this.i;
        byte b = 1;
        boolean z = tVar != null;
        long j = this.d.c;
        if (j >= 0 || !z) {
            if (this.j == j && z) {
                return;
            }
            t6 t6Var = this.b;
            if (tVar != null) {
                t6Var.removeCallbacks(tVar);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.j = jMax;
            t tVar2 = new t(this.k, b);
            t6Var.postDelayed(tVar2, jMax - jCurrentTimeMillis);
            this.i = tVar2;
        }
    }
}
