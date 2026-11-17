package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ad1 extends ny1 implements eh1, ht1, bf1 {
    public yc1 m;
    public vp0 n;
    public zp0 o;
    public vp0 p;
    public py1 q;
    public mj1 r;
    public boolean s;
    public mj1 t;
    public boolean u;
    public boolean v;
    public final bd1 w = new bd1(this, 0);
    public fe x;
    public mj1 y;
    public static final vv0 z = new vv0(27);
    public static final vv0 A = new vv0(28);

    public static void G0(pn1 pn1Var) {
        m41 m41Var;
        pn1 pn1Var2 = pn1Var.C;
        l41 l41Var = pn1Var.B;
        if (!uz0.g(pn1Var2 != null ? pn1Var2.B : null, l41Var)) {
            l41Var.M.p.E.f();
            return;
        }
        i5 i5VarQ = l41Var.M.p.q();
        if (i5VarQ == null || (m41Var = ((ye1) i5VarQ).E) == null) {
            return;
        }
        m41Var.f();
    }

    public abstract boolean A0();

    @Override // defpackage.ht1
    public boolean B() {
        return B0().I();
    }

    public abstract l41 B0();

    public abstract af1 C0();

    public abstract ad1 D0();

    public abstract long E0();

    public final yc1 F0() {
        yc1 yc1Var = this.m;
        if (yc1Var != null) {
            return yc1Var;
        }
        yc1 yc1Var2 = new yc1(this);
        this.m = yc1Var2;
        return yc1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H0(nj1 nj1Var) {
        l41 l41Var;
        Object[] objArr = nj1Var.b;
        long[] jArr = nj1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (l41Var = (l41) ((z53) objArr[(i << 3) + i3]).get()) != null) {
                        if (u()) {
                            l41Var.T(false);
                        } else {
                            l41Var.V(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract void I0();

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:1: B:14:0x0033->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:1: B:14:0x0033->B:24:0x006a], SYNTHETIC] */
    public final void J0() {
        fe feVar = this.x;
        if (feVar != null) {
            int i = feVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((pt0[]) feVar.c)[i2] = null;
                ((float[]) feVar.d)[i2] = Float.NaN;
                ((byte[]) feVar.e)[i2] = 0;
            }
            feVar.b = 0;
        }
        mj1 mj1Var = this.y;
        if (mj1Var == null) {
            return;
        }
        Object[] objArr = mj1Var.c;
        long[] jArr = mj1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            H0((nj1) objArr[(i3 << 3) + i5]);
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        mj1Var.a();
    }

    @Override // defpackage.bf1
    public final af1 Q(int i, int i2, Map map, vp0 vp0Var, vp0 vp0Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            ax0.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new zc1(i, i2, map, vp0Var, vp0Var2, this);
    }

    @Override // defpackage.ny1
    public final int h0(e5 e5Var) {
        int iS0;
        if (!A0() || (iS0 = s0(e5Var)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z2 = e5Var instanceof j43;
        long j = this.l;
        return iS0 + ((int) (z2 ? j >> 32 : j & 4294967295L));
    }

    @Override // defpackage.eh1
    public final void o(boolean z2) {
        ad1 ad1VarD0 = D0();
        l41 l41VarB0 = ad1VarD0 != null ? ad1VarD0.B0() : null;
        if (uz0.g(l41VarB0, B0())) {
            this.s = z2;
            return;
        }
        if ((l41VarB0 != null ? l41VarB0.M.d : null) != h41.j) {
            if ((l41VarB0 != null ? l41VarB0.M.d : null) != h41.k) {
                return;
            }
        }
        this.s = z2;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Code duplicated, block: B:65:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x015e A[LOOP:4: B:53:0x011c->B:66:0x015e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x0161 A[EDGE_INSN: B:87:0x0161->B:67:0x0161 BREAK  A[LOOP:4: B:53:0x011c->B:66:0x015e], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void q0(l41 l41Var, pt0 pt0Var) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        mj1 mj1Var = this.y;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (mj1Var != null) {
            Object[] objArr = mj1Var.c;
            long[] jArr3 = mj1Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                nj1 nj1Var = (nj1) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = nj1Var.b;
                                long[] jArr4 = nj1Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    l41 l41Var2 = (l41) ((z53) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (l41Var2 != null) {
                                                        boolean zI = l41Var2.I();
                                                        i4 = i8;
                                                        if (zI) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    nj1Var.m(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        mj1 mj1Var2 = this.y;
        if (mj1Var2 != null) {
            long[] jArr5 = mj1Var2.a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr5[i15];
                    if ((((~j11) << c) & j11 & j) == j) {
                        if (i15 != length3) {
                            break;
                            break;
                        }
                        i15++;
                    } else {
                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & j2) < j3) {
                                int i18 = (i15 << 3) + i17;
                                if (((nj1) mj1Var2.c[i18]).g()) {
                                    mj1Var2.m(i18);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        } else if (i15 != length3) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
            }
        }
        mj1 mj1Var3 = this.y;
        if (mj1Var3 == null) {
            mj1Var3 = new mj1();
            this.y = mj1Var3;
        }
        Object objG = mj1Var3.g(pt0Var);
        if (objG == null) {
            objG = new nj1();
            mj1Var3.n(pt0Var, objG);
        }
        ((nj1) objG).k(new z53(l41Var));
    }

    public abstract int s0(e5 e5Var);

    /* JADX WARN: Code duplicated, block: B:112:0x01a2 A[EDGE_INSN: B:112:0x01a2->B:90:0x01a2 BREAK  A[LOOP:6: B:73:0x015c->B:89:0x019f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x019d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x019f A[LOOP:6: B:73:0x015c->B:89:0x019f, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void t0(final py1 py1Var, final long j, final long j2) {
        char c;
        long j3;
        long j4;
        long j5;
        l41 l41Var;
        int i;
        char c2;
        long j6;
        ad1 ad1VarD0;
        it1 snapshotObserver;
        mj1 mj1Var = this.y;
        fe feVar = this.x;
        if (feVar == null) {
            feVar = new fe();
            this.x = feVar;
        }
        fe feVar2 = feVar;
        t6 t6Var = B0().u;
        if (t6Var != null && (snapshotObserver = t6Var.getSnapshotObserver()) != null) {
            snapshotObserver.a.d(py1Var, z, new kp0() { // from class: xc1
                @Override // defpackage.kp0
                public final Object a() {
                    ad1 ad1Var = this.h;
                    ad1Var.F0().h = false;
                    ad1Var.F0().i = j;
                    ad1Var.F0().j = j2;
                    vp0 vp0VarE = py1Var.h.e();
                    if (vp0VarE != null) {
                        vp0VarE.h(ad1Var.F0());
                    }
                    return j23.a;
                }
            });
        }
        boolean zU = u();
        nj1 nj1Var = (nj1) feVar2.f;
        nj1 nj1Var2 = (nj1) feVar2.g;
        int i2 = feVar2.b;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) feVar2.e)[i3];
            if (b == 3) {
                pt0 pt0Var = ((pt0[]) feVar2.c)[i3];
                pt0Var.getClass();
                nj1Var2.k(pt0Var);
            } else if (b != 0 && mj1Var != null) {
                pt0 pt0Var2 = ((pt0[]) feVar2.c)[i3];
                pt0Var2.getClass();
                nj1 nj1Var3 = (nj1) mj1Var.l(pt0Var2);
                if (nj1Var3 != null) {
                    nj1Var.j(nj1Var3);
                }
            }
        }
        int i4 = feVar2.b;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) feVar2.e;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                pt0[] pt0VarArr = (pt0[]) feVar2.c;
                pt0VarArr[i6 - i5] = pt0VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = feVar2.b;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((pt0[]) feVar2.c)[i8] = null;
        }
        feVar2.b -= i5;
        ad1 ad1VarD1 = D0();
        Object[] objArr = nj1Var2.b;
        long[] jArr = nj1Var2.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            pt0 pt0Var3 = (pt0) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            ad1 ad1Var = ad1VarD1 == null ? this : ad1VarD1;
                            i = i9;
                            ad1 ad1Var2 = ad1Var;
                            while (true) {
                                fe feVar3 = ad1Var2.x;
                                if ((feVar3 != null && gi.Z((pt0[]) feVar3.c, pt0Var3) >= 0) || (ad1VarD0 = ad1Var2.D0()) == null) {
                                    break;
                                } else {
                                    ad1Var2 = ad1VarD0;
                                }
                            }
                            mj1 mj1Var2 = ad1Var2.y;
                            nj1 nj1Var4 = mj1Var2 != null ? (nj1) mj1Var2.l(pt0Var3) : null;
                            if (nj1Var4 != null) {
                                ad1Var.H0(nj1Var4);
                            }
                        } else {
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                    }
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                i9 = 8;
            }
        } else {
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        nj1Var2.b();
        Object[] objArr2 = nj1Var.b;
        long[] jArr2 = nj1Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) == j3) {
                    if (i13 != length2) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (l41Var = (l41) ((z53) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (zU) {
                                l41Var.T(false);
                            } else {
                                l41Var.V(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    } else if (i13 != length2) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        nj1Var.b();
    }

    @Override // defpackage.nz0
    public boolean u() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x011b  */
    /* JADX WARN: Code duplicated, block: B:64:0x011f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0126  */
    /* JADX WARN: Code duplicated, block: B:68:0x012e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0131  */
    public final void x0(af1 af1Var) {
        long j;
        char c;
        long j2;
        long j3;
        yc1 yc1Var;
        mj1 mj1Var;
        long[] jArr;
        Object[] objArr;
        int i;
        long[] jArr2;
        Object[] objArr2;
        int i2;
        boolean z2;
        fe feVar;
        mj1 mj1Var2;
        nj1 nj1Var;
        yc1 yc1Var2;
        long j4;
        if (this.v) {
            return;
        }
        vp0 vp0VarE = af1Var.e();
        zp0 zp0VarC = af1Var.c();
        vp0 vp0VarF = af1Var.f();
        long jO = 0;
        if (zp0VarC == null) {
            long jD0 = 9223372034707292159L;
            if (vp0VarE == null) {
                J0();
                this.n = null;
                this.o = null;
                this.p = null;
                yc1 yc1Var3 = this.m;
                if (yc1Var3 != null) {
                    yc1Var3.h = false;
                    yc1Var3.i = 9223372034707292159L;
                    return;
                }
                return;
            }
            this.o = null;
            this.p = null;
            boolean z3 = this.n != vp0VarE;
            if (!z3 && F0().h) {
                t31 t31VarZ0 = z0();
                jD0 = lt.d0(t31VarZ0.c(0L));
                jO = t31VarZ0.O();
                z3 = (ny0.a(jD0, F0().i) && vy0.a(jO, F0().j)) ? false : true;
            }
            if (z3) {
                py1 py1Var = this.q;
                if (py1Var != null) {
                    py1Var.h = af1Var;
                } else {
                    py1Var = new py1(af1Var, this, null);
                    this.q = py1Var;
                }
                t0(py1Var, jD0, jO);
                this.n = af1Var.e();
                return;
            }
            return;
        }
        if (zp0VarC != this.o || vp0VarF != this.p) {
            this.o = zp0VarC;
            this.p = vp0VarF;
            J0();
            return;
        }
        mj1 mj1Var3 = this.t;
        long j5 = -9187201950435737472L;
        int i3 = 8;
        if (mj1Var3 != null) {
            Object[] objArr3 = mj1Var3.c;
            long[] jArr3 = mj1Var3.a;
            j2 = 128;
            int length = jArr3.length - 2;
            if (length >= 0) {
                c = 7;
                int i4 = 0;
                yc1Var2 = null;
                while (true) {
                    long j6 = jArr3[i4];
                    j3 = 255;
                    if ((((~j6) << 7) & j6 & j5) != j5) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j6 & 255) < 128) {
                                j4 = j5;
                                yc1 yc1Var4 = (yc1) objArr3[(i4 << 3) + i6];
                                if (yc1Var4.h) {
                                    yc1Var2 = yc1Var4;
                                }
                            } else {
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i6++;
                            j5 = j4;
                        }
                        j = j5;
                        if (i5 != 8) {
                            break;
                        }
                    } else {
                        j = j5;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    j5 = j;
                }
            } else {
                j = -9187201950435737472L;
                c = 7;
                j3 = 255;
                yc1Var2 = null;
            }
            yc1Var = yc1Var2;
        } else {
            j = -9187201950435737472L;
            c = 7;
            j2 = 128;
            j3 = 255;
            yc1Var = null;
        }
        if (yc1Var == null) {
            return;
        }
        t31 t31VarZ1 = z0();
        long jD1 = lt.d0(t31VarZ1.c(0L));
        long jO2 = t31VarZ1.O();
        if ((ny0.a(jD1, yc1Var.i) && vy0.a(jO2, yc1Var.j)) || (mj1Var = this.t) == null) {
            return;
        }
        Object[] objArr4 = mj1Var.b;
        Object[] objArr5 = mj1Var.c;
        long[] jArr4 = mj1Var.a;
        int length2 = jArr4.length - 2;
        if (length2 < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j7 = jArr4[i7];
            int i8 = length2;
            if ((((~j7) << c) & j7 & j) != j) {
                int i9 = 8 - ((~(i7 - i8)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((j7 & j3) < j2) {
                        int i11 = (i7 << 3) + i10;
                        Object obj = objArr4[i11];
                        yc1 yc1Var5 = (yc1) objArr5[i11];
                        i2 = i3;
                        pt0 pt0Var = (pt0) obj;
                        jArr2 = jArr4;
                        if (yc1Var5.h) {
                            objArr2 = objArr4;
                            z2 = (vy0.a(yc1Var5.j, jO2) && ny0.a(yc1Var5.i, jD1)) ? false : true;
                            yc1Var5.j = jO2;
                            yc1Var5.i = jD1;
                            yc1Var5.h = false;
                            if (!z2) {
                                feVar = this.x;
                                if (feVar != null) {
                                    feVar.A(pt0Var);
                                }
                                mj1Var2 = this.y;
                                if (mj1Var2 != null) {
                                    nj1Var = (nj1) mj1Var2.g(pt0Var);
                                } else {
                                    nj1Var = null;
                                }
                                if (nj1Var != null) {
                                    H0(nj1Var);
                                    nj1Var.b();
                                }
                            }
                        } else {
                            objArr2 = objArr4;
                        }
                        yc1Var5.j = jO2;
                        yc1Var5.i = jD1;
                        yc1Var5.h = false;
                        if (!z2) {
                            feVar = this.x;
                            if (feVar != null) {
                                feVar.A(pt0Var);
                            }
                            mj1Var2 = this.y;
                            if (mj1Var2 != null) {
                                nj1Var = (nj1) mj1Var2.g(pt0Var);
                            } else {
                                nj1Var = null;
                            }
                            if (nj1Var != null) {
                                H0(nj1Var);
                                nj1Var.b();
                            }
                        }
                    } else {
                        jArr2 = jArr4;
                        objArr2 = objArr4;
                        i2 = i3;
                    }
                    j7 >>= i2;
                    i10++;
                    objArr4 = objArr2;
                    i3 = i2;
                    jArr4 = jArr2;
                }
                jArr = jArr4;
                objArr = objArr4;
                i = i3;
                if (i9 != i) {
                    return;
                }
            } else {
                jArr = jArr4;
                objArr = objArr4;
                i = i3;
            }
            length2 = i8;
            if (i7 == length2) {
                return;
            }
            i7++;
            i3 = i;
            objArr4 = objArr;
            jArr4 = jArr;
        }
    }

    public abstract ad1 y0();

    public abstract t31 z0();
}
