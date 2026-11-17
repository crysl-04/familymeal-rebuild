package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nj1 {
    public long[] a;
    public Object[] b;
    public int c;
    public int d;
    public pj1 e;
    public int f;

    public nj1(int i) {
        this.a = bd2.a;
        this.b = s60.l;
        if (i >= 0) {
            f(bd2.d(i));
        } else {
            wg.m("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i = this.d;
        this.b[d(obj)] = obj;
        return this.d != i;
    }

    public final void b() {
        this.d = 0;
        long[] jArr = this.a;
        if (jArr != bd2.a) {
            gi.V(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        gi.U(this.b, 0, this.c);
        this.f = bd2.a(this.c) - this.d;
    }

    public final boolean c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.c;
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

    public final int d(Object obj) {
        long j;
        int i;
        long j2;
        long j3;
        long[] jArr;
        long j4;
        int i2;
        int i3 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = iHashCode ^ (iHashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.c;
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
                if (this.f != 0 || ((this.a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j = j6;
                    i = 0;
                    j2 = 255;
                    j3 = 128;
                } else {
                    int i15 = this.c;
                    if (i15 <= 8 || Long.compareUnsigned(((long) this.d) << 5, ((long) i15) * 25) > 0) {
                        j = j6;
                        i = 0;
                        j2 = 255;
                        j3 = 128;
                        int iB = bd2.b(this.c);
                        long[] jArr3 = this.a;
                        Object[] objArr = this.b;
                        int i16 = this.c;
                        f(iB);
                        long[] jArr4 = this.a;
                        Object[] objArr2 = this.b;
                        int i17 = this.c;
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
                                objArr2[iE2] = obj2;
                            } else {
                                jArr = jArr4;
                            }
                            i18++;
                            jArr3 = jArr3;
                            jArr4 = jArr;
                        }
                    } else {
                        long[] jArr5 = this.a;
                        int i22 = this.c;
                        Object[] objArr3 = this.b;
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
                        long j17 = 72057594037927935L;
                        jArr5[i25] = (jArr5[i25] & 72057594037927935L) | (-72057594037927936L);
                        jArr5[iY] = jArr5[0];
                        int i26 = 0;
                        while (i26 != i22) {
                            int i27 = i26 >> 3;
                            int i28 = (i26 & 7) << 3;
                            long j18 = (jArr5[i27] >> i28) & j13;
                            if (j18 == 128 || j18 != 254) {
                                i26++;
                            } else {
                                Object obj3 = objArr3[i26];
                                int iHashCode3 = (obj3 != null ? obj3.hashCode() : i14) * i3;
                                int i29 = iHashCode3 ^ (iHashCode3 << 16);
                                int i30 = i29 >>> 7;
                                int iE3 = e(i30);
                                int i31 = i30 & i22;
                                int i32 = i3;
                                if (((iE3 - i31) & i22) / 8 == ((i26 - i31) & i22) / 8) {
                                    long j19 = j17;
                                    jArr5[i27] = (jArr5[i27] & (~(j13 << i28))) | (((long) (i29 & 127)) << i28);
                                    jArr5[jArr5.length - 1] = (jArr5[i14] & j19) | Long.MIN_VALUE;
                                    i26++;
                                    i3 = i32;
                                    j17 = j19;
                                } else {
                                    long j20 = j17;
                                    int i33 = iE3 >> 3;
                                    long j21 = jArr5[i33];
                                    int i34 = (iE3 & 7) << 3;
                                    if (((j21 >> i34) & j13) == 128) {
                                        j4 = j13;
                                        int i35 = i26;
                                        jArr5[i33] = (j21 & (~(j4 << i34))) | (((long) (i29 & 127)) << i34);
                                        jArr5[i27] = (jArr5[i27] & (~(j4 << i28))) | (128 << i28);
                                        objArr3[iE3] = objArr3[i35];
                                        objArr3[i35] = null;
                                        i2 = i35;
                                    } else {
                                        int i36 = i26;
                                        j4 = j13;
                                        jArr5[i33] = (j21 & (~(j4 << i34))) | (((long) (i29 & 127)) << i34);
                                        Object obj4 = objArr3[iE3];
                                        objArr3[iE3] = objArr3[i36];
                                        objArr3[i36] = obj4;
                                        i2 = i36 - 1;
                                    }
                                    jArr5[jArr5.length - 1] = (jArr5[i14] & j20) | Long.MIN_VALUE;
                                    i26 = i2 + 1;
                                    i22 = i22;
                                    i14 = i14;
                                    i3 = i32;
                                    j17 = j20;
                                    j13 = j4;
                                }
                            }
                        }
                        i = i14;
                        j2 = j13;
                        this.f = bd2.a(this.c) - this.d;
                    }
                    iE = e(i5);
                }
                this.d++;
                int i37 = this.f;
                long[] jArr6 = this.a;
                int i38 = iE >> 3;
                long j22 = jArr6[i38];
                int i39 = (iE & 7) << 3;
                if (((j22 >> i39) & j2) != j3) {
                    i12 = i;
                }
                this.f = i37 - i12;
                int i40 = this.c;
                long j23 = (j22 & (~(j2 << i39))) | (j << i39);
                jArr6[i38] = j23;
                jArr6[(((iE - 7) & i40) + (i40 & 7)) >> 3] = j23;
                return iE;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i6 = i13;
        }
    }

    public final int e(int i) {
        int i2 = this.c;
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

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[LOOP:0: B:14:0x001d->B:26:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nj1)) {
            return false;
        }
        nj1 nj1Var = (nj1) obj;
        if (nj1Var.d != this.d) {
            return false;
        }
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !nj1Var.c(objArr[(i << 3) + i3])) {
                            return false;
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
        return true;
    }

    public final void f(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, bd2.c(i)) : 0;
        this.c = iMax;
        if (iMax == 0) {
            jArr = bd2.a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f = bd2.a(this.c) - this.d;
        this.b = iMax == 0 ? s60.l : new Object[iMax];
    }

    public final boolean g() {
        return this.d == 0;
    }

    public final boolean h() {
        return this.d != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
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
                        Object obj = objArr[(i << 3) + i3];
                        iHashCode += obj != null ? obj.hashCode() : 0;
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

    public final void i(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.c;
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
            } else {
                i += 8;
                i5 = i6 + i;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            m(iNumberOfTrailingZeros);
        }
    }

    public final void j(nj1 nj1Var) {
        nj1Var.getClass();
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
                    if ((255 & j) < 128) {
                        k(objArr[(i << 3) + i3]);
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

    public final void k(Object obj) {
        this.b[d(obj)] = obj;
    }

    public final boolean l(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.c;
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
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            m(iNumberOfTrailingZeros);
        }
        return z;
    }

    public final void m(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = this.c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063 A[DONT_INVERT, PHI: r7
  0x0063: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0023, B:22:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0065 A[LOOP:0: B:5:0x0015->B:24:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0068 A[EDGE_INSN: B:29:0x0068->B:25:0x0068 BREAK  A[LOOP:0: B:5:0x0015->B:24:0x0065], SYNTHETIC] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
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
                            Object obj = objArr[(i << 3) + i4];
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
                            i2++;
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
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ nj1() {
        this(6);
    }
}
