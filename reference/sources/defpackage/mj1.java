package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class mj1 {
    public long[] a;
    public Object[] b;
    public Object[] c;
    public int d;
    public int e;
    public ae1 f;
    public int g;

    public mj1(int i) {
        this.a = bd2.a;
        Object[] objArr = s60.l;
        this.b = objArr;
        this.c = objArr;
        if (i >= 0) {
            h(bd2.d(i));
        } else {
            wg.m("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.e = 0;
        long[] jArr = this.a;
        if (jArr != bd2.a) {
            gi.V(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        gi.U(this.c, 0, this.d);
        gi.U(this.b, 0, this.d);
        this.g = bd2.a(this.d) - this.e;
    }

    public final boolean b(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = (jArr[i6] >>> i7) | ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63));
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            for (long j3 = (j2 - 72340172838076673L) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (uz0.g(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final boolean c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = (jArr[i6] >>> i7) | ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63));
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            for (long j3 = (j2 - 72340172838076673L) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (uz0.g(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[LOOP:0: B:5:0x000b->B:18:0x0045, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[SYNTHETIC] */
    public final boolean d(Object obj) {
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && uz0.g(obj, objArr[(i << 3) + i3])) {
                            return true;
                        }
                        j >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
        }
        return false;
    }

    public final int e(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = (jArr[i5] >>> i6) | ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63));
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[LOOP:0: B:14:0x0023->B:33:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[EDGE_INSN: B:35:0x0074->B:34:0x0074 BREAK  A[LOOP:0: B:14:0x0023->B:33:0x0071], SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mj1)) {
            return false;
        }
        mj1 mj1Var = (mj1) obj;
        if (mj1Var.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            Object obj3 = objArr2[i4];
                            if (obj3 == null) {
                                if (mj1Var.g(obj2) != null || !mj1Var.c(obj2)) {
                                    return false;
                                }
                            } else if (!obj3.equals(mj1Var.g(obj2))) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    public final int f(Object obj) {
        long j;
        int i;
        long j2;
        long j3;
        long[] jArr;
        int i2;
        long j4;
        int i3;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = iHashCode ^ (iHashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.d;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr2 = this.a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            int i12 = 1;
            long j5 = (jArr2[i10] >>> i11) | ((jArr2[i10 + 1] << (64 - i11)) & ((-i11) >> 63));
            long j6 = i6;
            int i13 = i6;
            int i14 = 0;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (j7 - 72340172838076673L) & (~j7);
            long j9 = -9187201950435737472L;
            long j10 = j8 & (-9187201950435737472L);
            while (j10 != 0) {
                int iNumberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j10) >> 3)) & i7;
                long j11 = j9;
                if (uz0.g(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j10 &= j10 - 1;
                j9 = j11;
            }
            long j12 = j9;
            if ((j5 & ((~j5) << 6) & j12) != 0) {
                int iE = e(i5);
                long j13 = 255;
                if (this.g != 0 || ((this.a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j = j6;
                    i = 0;
                    j2 = 255;
                    j3 = 128;
                } else {
                    int i15 = this.d;
                    if (i15 <= 8 || Long.compareUnsigned(((long) this.e) << 5, ((long) i15) * 25) > 0) {
                        j = j6;
                        i = 0;
                        j2 = 255;
                        j3 = 128;
                        int iB = bd2.b(this.d);
                        long[] jArr3 = this.a;
                        Object[] objArr = this.b;
                        Object[] objArr2 = this.c;
                        int i16 = this.d;
                        h(iB);
                        long[] jArr4 = this.a;
                        Object[] objArr3 = this.b;
                        Object[] objArr4 = this.c;
                        int i17 = this.d;
                        int i18 = 0;
                        while (i18 < i16) {
                            if (((jArr3[i18 >> 3] >> ((i18 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr[i18];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i19 = iHashCode2 ^ (iHashCode2 << 16);
                                int iE2 = e(i19 >>> 7);
                                long j14 = i19 & 127;
                                int i20 = iE2 >> 3;
                                int i21 = (iE2 & 7) << 3;
                                jArr = jArr4;
                                long j15 = (jArr4[i20] & (~(255 << i21))) | (j14 << i21);
                                jArr[i20] = j15;
                                jArr[(((iE2 - 7) & i17) + (i17 & 7)) >> 3] = j15;
                                objArr3[iE2] = obj2;
                                objArr4[iE2] = objArr2[i18];
                            } else {
                                jArr = jArr4;
                            }
                            i18++;
                            jArr3 = jArr3;
                            jArr4 = jArr;
                        }
                    } else {
                        long[] jArr5 = this.a;
                        int i22 = this.d;
                        Object[] objArr5 = this.b;
                        Object[] objArr6 = this.c;
                        int i23 = (i22 + 7) >> 3;
                        int i24 = 0;
                        while (i24 < i23) {
                            long j16 = jArr5[i24] & j12;
                            jArr5[i24] = ((~j16) + (j16 >>> 7)) & (-72340172838076674L);
                            i24++;
                            j6 = j6;
                        }
                        j = j6;
                        j3 = 128;
                        int iY = gi.Y(jArr5);
                        int i25 = iY - 1;
                        jArr5[i25] = (jArr5[i25] & 72057594037927935L) | (-72057594037927936L);
                        jArr5[iY] = jArr5[0];
                        int i26 = 0;
                        while (i26 != i22) {
                            int i27 = i26 >> 3;
                            int i28 = (i26 & 7) << 3;
                            long j17 = (jArr5[i27] >> i28) & j13;
                            if (j17 == 128 || j17 != 254) {
                                i26++;
                            } else {
                                Object obj3 = objArr5[i26];
                                int iHashCode3 = (obj3 != null ? obj3.hashCode() : i14) * (-862048943);
                                int i29 = iHashCode3 ^ (iHashCode3 << 16);
                                int i30 = i29 >>> 7;
                                int iE3 = e(i30);
                                int i31 = i30 & i22;
                                if (((iE3 - i31) & i22) / 8 == ((i26 - i31) & i22) / 8) {
                                    i2 = i14;
                                    j4 = j13;
                                    jArr5[i27] = (jArr5[i27] & (~(j4 << i28))) | (((long) (i29 & 127)) << i28);
                                    jArr5[jArr5.length - 1] = jArr5[i2];
                                    i26++;
                                } else {
                                    i2 = i14;
                                    j4 = j13;
                                    int i32 = iE3 >> 3;
                                    long j18 = jArr5[i32];
                                    int i33 = (iE3 & 7) << 3;
                                    if (((j18 >> i33) & j4) == 128) {
                                        int i34 = i26;
                                        jArr5[i32] = (j18 & (~(j4 << i33))) | (((long) (i29 & 127)) << i33);
                                        jArr5[i27] = (jArr5[i27] & (~(j4 << i28))) | (128 << i28);
                                        objArr5[iE3] = objArr5[i34];
                                        objArr5[i34] = null;
                                        objArr6[iE3] = objArr6[i34];
                                        objArr6[i34] = null;
                                        i3 = i34;
                                    } else {
                                        int i35 = i26;
                                        jArr5[i32] = (j18 & (~(j4 << i33))) | (((long) (i29 & 127)) << i33);
                                        Object obj4 = objArr5[iE3];
                                        objArr5[iE3] = objArr5[i35];
                                        objArr5[i35] = obj4;
                                        Object obj5 = objArr6[iE3];
                                        objArr6[iE3] = objArr6[i35];
                                        objArr6[i35] = obj5;
                                        i3 = i35 - 1;
                                    }
                                    jArr5[jArr5.length - 1] = jArr5[i2];
                                    i26 = i3 + 1;
                                    i22 = i22;
                                }
                                i14 = i2;
                                j13 = j4;
                            }
                        }
                        i = i14;
                        j2 = j13;
                        this.g = bd2.a(this.d) - this.e;
                    }
                    iE = e(i5);
                }
                this.e++;
                int i36 = this.g;
                long[] jArr6 = this.a;
                int i37 = iE >> 3;
                long j19 = jArr6[i37];
                int i38 = (iE & 7) << 3;
                if (((j19 >> i38) & j2) != j3) {
                    i12 = i;
                }
                this.g = i36 - i12;
                int i39 = this.d;
                long j20 = (j19 & (~(j2 << i38))) | (j << i38);
                jArr6[i37] = j20;
                jArr6[(((iE - 7) & i39) + (i39 & 7)) >> 3] = j20;
                return ~iE;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i6 = i13;
        }
    }

    public final Object g(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = i2 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = (jArr[i7] >>> i8) | ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63));
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (j2 - 72340172838076673L) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (uz0.g(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i += 8;
            i5 = i6 + i;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final void h(int i) {
        long[] jArr;
        Object[] objArr = s60.l;
        int iMax = i > 0 ? Math.max(7, bd2.c(i)) : 0;
        this.d = iMax;
        if (iMax == 0) {
            jArr = bd2.a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            int i3 = iMax >> 3;
            long j = 255 << ((iMax & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j)) | j;
            jArr = jArr2;
        }
        this.a = jArr;
        this.g = bd2.a(this.d) - this.e;
        this.b = iMax == 0 ? objArr : new Object[iMax];
        if (iMax != 0) {
            objArr = new Object[iMax];
        }
        this.c = objArr;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ (obj2 != null ? obj2.hashCode() : 0);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final boolean i() {
        return this.e == 0;
    }

    public final boolean j() {
        return this.e != 0;
    }

    public final void k(mj1 mj1Var) {
        mj1Var.getClass();
        Object[] objArr = mj1Var.b;
        Object[] objArr2 = mj1Var.c;
        long[] jArr = mj1Var.a;
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
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        n(objArr[i4], objArr2[i4]);
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

    public final Object l(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = i2 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = (jArr[i7] >>> i8) | ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63));
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (j2 - 72340172838076673L) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (uz0.g(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i += 8;
            i5 = i6 + i;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return m(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final Object m(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = this.d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
        Object[] objArr = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void n(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF < 0) {
            iF = ~iF;
        }
        this.b[iF] = obj;
        this.c[iF] = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[DONT_INVERT, PHI: r8
  0x0072: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002e, B:25:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0074 A[LOOP:0: B:9:0x0020->B:27:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0077 A[EDGE_INSN: B:31:0x0077->B:28:0x0077 BREAK  A[LOOP:0: B:9:0x0020->B:27:0x0074], SYNTHETIC] */
    public final String toString() {
        if (i()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            Object obj2 = objArr2[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
                            i2++;
                            if (i2 < this.e) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ mj1() {
        this(6);
    }
}
