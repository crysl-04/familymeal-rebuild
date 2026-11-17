package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ti1 {
    public long[] a;
    public int[] b;
    public int c;
    public int d;
    public int e;

    public ti1(int i) {
        this.a = bd2.a;
        this.b = uy0.a;
        if (i >= 0) {
            d(bd2.d(i));
        } else {
            wg.m("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    public final boolean a(int i) {
        long j;
        boolean z;
        long j2;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int[] iArr;
        int i2;
        int i3 = this.d;
        int i4 = -862048943;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.c;
        int i9 = i6 & i8;
        int i10 = 0;
        loop0: while (true) {
            long[] jArr2 = this.a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            boolean z2 = true;
            int i13 = i10;
            long j3 = (jArr2[i11] >>> i12) | ((jArr2[i11 + 1] << (64 - i12)) & ((-i12) >> 63));
            long j4 = i7;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
            while (j6 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i9) & i8;
                int i14 = i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    z = true;
                    break loop0;
                }
                j6 &= j6 - 1;
                i4 = i14;
            }
            int i15 = i4;
            char c = '\b';
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                int iC = c(i6);
                long j7 = 255;
                if (this.e != 0 || ((this.a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    j = 255;
                    z = true;
                    j2 = 128;
                } else {
                    int i16 = this.c;
                    if (i16 > 8) {
                        j2 = 128;
                        if (Long.compareUnsigned(((long) this.d) << 5, ((long) i16) * 25) <= 0) {
                            long[] jArr3 = this.a;
                            int i17 = this.c;
                            int[] iArr2 = this.b;
                            int i18 = (i17 + 7) >> 3;
                            int i19 = 0;
                            while (i19 < i18) {
                                char c2 = c;
                                long j8 = jArr3[i19] & (-9187201950435737472L);
                                int i20 = i19;
                                jArr3[i20] = ((~j8) + (j8 >>> 7)) & (-72340172838076674L);
                                i19 = i20 + 1;
                                c = c2;
                                j7 = j7;
                            }
                            j = j7;
                            char c3 = 7;
                            int iY = gi.Y(jArr3);
                            int i21 = iY - 1;
                            jArr3[i21] = (jArr3[i21] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iY] = jArr3[0];
                            int i22 = 0;
                            while (i22 != i17) {
                                int i23 = i22 >> 3;
                                int i24 = (i22 & 7) << 3;
                                long j9 = (jArr3[i23] >> i24) & j;
                                if (j9 == 128 || j9 != 254) {
                                    i22++;
                                } else {
                                    int iHashCode2 = Integer.hashCode(iArr2[i22]) * i15;
                                    int i25 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i26 = i25 >>> 7;
                                    int iC2 = c(i26);
                                    int i27 = i26 & i17;
                                    char c4 = c3;
                                    if (((iC2 - i27) & i17) / 8 == ((i22 - i27) & i17) / 8) {
                                        iArr = iArr2;
                                        jArr3[i23] = (jArr3[i23] & (~(j << i24))) | (((long) (i25 & 127)) << i24);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i22++;
                                    } else {
                                        iArr = iArr2;
                                        int i28 = i22;
                                        int i29 = iC2 >> 3;
                                        long j10 = jArr3[i29];
                                        int i30 = (iC2 & 7) << 3;
                                        if (((j10 >> i30) & j) == 128) {
                                            jArr3[i29] = (j10 & (~(j << i30))) | (((long) (i25 & 127)) << i30);
                                            jArr3[i23] = (jArr3[i23] & (~(j << i24))) | (128 << i24);
                                            iArr[iC2] = iArr[i28];
                                            iArr[i28] = 0;
                                            i2 = i28;
                                        } else {
                                            jArr3[i29] = (j10 & (~(j << i30))) | (((long) (i25 & 127)) << i30);
                                            int i31 = iArr[iC2];
                                            iArr[iC2] = iArr[i28];
                                            iArr[i28] = i31;
                                            i2 = i28 - 1;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i22 = i2 + 1;
                                    }
                                    iArr2 = iArr;
                                    c3 = c4;
                                }
                            }
                            this.e = bd2.a(this.c) - this.d;
                        }
                        z = z2;
                        iC = c(i6);
                    } else {
                        j2 = 128;
                    }
                    j = 255;
                    int iB = bd2.b(this.c);
                    long[] jArr4 = this.a;
                    int[] iArr3 = this.b;
                    int i32 = this.c;
                    d(iB);
                    long[] jArr5 = this.a;
                    int[] iArr4 = this.b;
                    int i33 = this.c;
                    int i34 = 0;
                    while (i34 < i32) {
                        if (((jArr4[i34 >> 3] >> ((i34 & 7) << 3)) & 255) < j2) {
                            int i35 = iArr3[i34];
                            int iHashCode3 = Integer.hashCode(i35) * i15;
                            int i36 = iHashCode3 ^ (iHashCode3 << 16);
                            int iC3 = c(i36 >>> 7);
                            jArr = jArr5;
                            long j11 = i36 & 127;
                            int i37 = iC3 >> 3;
                            int i38 = (iC3 & 7) << 3;
                            long j12 = (jArr[i37] & (~(255 << i38))) | (j11 << i38);
                            jArr[i37] = j12;
                            jArr[(((iC3 - 7) & i33) + (i33 & 7)) >> 3] = j12;
                            iArr4[iC3] = i35;
                        } else {
                            jArr = jArr5;
                        }
                        i34++;
                        jArr4 = jArr4;
                        z2 = z2;
                        jArr5 = jArr;
                    }
                    z = z2;
                    iC = c(i6);
                }
                iNumberOfTrailingZeros = iC;
                this.d++;
                int i39 = this.e;
                long[] jArr6 = this.a;
                int i40 = iNumberOfTrailingZeros >> 3;
                long j13 = jArr6[i40];
                int i41 = (iNumberOfTrailingZeros & 7) << 3;
                this.e = i39 - (((j13 >> i41) & j) == j2 ? z : 0);
                int i42 = this.c;
                long j14 = (j13 & (~(j << i41))) | (j4 << i41);
                jArr6[i40] = j14;
                jArr6[(((iNumberOfTrailingZeros - 7) & i42) + (i42 & 7)) >> 3] = j14;
                break;
            }
            i10 = i13 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i15;
        }
        this.b[iNumberOfTrailingZeros] = i;
        if (this.d != i3) {
            return z;
        }
        return false;
    }

    public final boolean b(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.c;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = (jArr[i7] >>> i8) | ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63));
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (j2 - 72340172838076673L) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int c(int i) {
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

    public final void d(int i) {
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
        this.e = bd2.a(this.c) - this.d;
        this.b = new int[iMax];
    }

    public final boolean e(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.c;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = (jArr[i7] >>> i8) | ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63));
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (j2 - 72340172838076673L) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            f(iNumberOfTrailingZeros);
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[LOOP:0: B:14:0x001d->B:26:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ti1)) {
            return false;
        }
        ti1 ti1Var = (ti1) obj;
        if (ti1Var.d != this.d) {
            return false;
        }
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !ti1Var.b(iArr[(i << 3) + i3])) {
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
        this.d--;
        long[] jArr = this.a;
        int i2 = this.c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }

    public final int hashCode() {
        int[] iArr = this.b;
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
                        iHashCode = Integer.hashCode(iArr[(i << 3) + i3]) + iHashCode;
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

    /* JADX WARN: Code duplicated, block: B:20:0x0058 A[DONT_INVERT, PHI: r5
  0x0058: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:6:0x0021, B:19:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x005a A[LOOP:0: B:5:0x0013->B:21:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005d A[EDGE_INSN: B:26:0x005d->B:22:0x005d BREAK  A[LOOP:0: B:5:0x0013->B:21:0x005a], SYNTHETIC] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int[] iArr = this.b;
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
                            int i5 = iArr[(i << 3) + i4];
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            sb.append(i5);
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

    public /* synthetic */ ti1() {
        this(6);
    }
}
