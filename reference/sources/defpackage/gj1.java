package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gj1 {
    public long[] a = bd2.a;
    public Object[] b = s60.l;
    public long[] c = uz0.J;
    public int d = Integer.MAX_VALUE;
    public int e = Integer.MAX_VALUE;
    public int f;
    public int g;
    public int h;

    public gj1(int i) {
        if (i >= 0) {
            f(bd2.d(i));
        } else {
            wg.m("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i = this.g;
        int iD = d(obj);
        this.b[iD] = obj;
        long[] jArr = this.c;
        int i2 = this.d;
        jArr[iD] = (((long) i2) & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = (jArr[i2] & (-4611686016279904257L)) | ((((long) iD) & 2147483647L) << 31);
        }
        this.d = iD;
        if (this.e == Integer.MAX_VALUE) {
            this.e = iD;
        }
        return this.g != i;
    }

    public final void b() {
        this.g = 0;
        long[] jArr = this.a;
        if (jArr != bd2.a) {
            gi.V(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.f;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        gi.U(this.b, 0, this.f);
        gi.V(this.c, 4611686018427387903L);
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        this.h = bd2.a(this.f) - this.g;
    }

    public final boolean c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f;
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
        int i;
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        int i2;
        long[] jArr2;
        int i3 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = iHashCode ^ (iHashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.f;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = (jArr3[i10] >>> i11) | ((jArr3[i10 + 1] << (64 - i11)) & ((-i11) >> 63));
            long j5 = i6;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (j6 - 72340172838076673L) & (~j6) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i8) & i7;
                int i12 = i3;
                if (uz0.g(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i3 = i12;
            }
            int i13 = i3;
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                int iE = e(i5);
                if (this.h != 0 || ((this.a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    i = 0;
                    j = j5;
                    j2 = 255;
                    j3 = 128;
                } else {
                    int i14 = this.f;
                    if (i14 > 8) {
                        c = 31;
                        j3 = 128;
                        j2 = 255;
                        if (Long.compareUnsigned(((long) this.g) << 5, ((long) i14) * 25) <= 0) {
                            long[] jArr4 = this.a;
                            if (jArr4 == null) {
                                i = 0;
                                j = j5;
                            } else {
                                int i15 = this.f;
                                Object[] objArr = this.b;
                                long[] jArr5 = this.c;
                                long[] jArr6 = new long[i15];
                                long j8 = 9223372034707292159L;
                                Arrays.fill(jArr6, 0, i15, 9223372034707292159L);
                                i = 0;
                                int i16 = (i15 + 7) >> 3;
                                int i17 = 0;
                                while (i17 < i16) {
                                    long j9 = j8;
                                    long j10 = jArr4[i17] & (-9187201950435737472L);
                                    jArr4[i17] = ((~j10) + (j10 >>> 7)) & (-72340172838076674L);
                                    i17++;
                                    j8 = j9;
                                }
                                long j11 = j8;
                                int length = jArr4.length;
                                int i18 = length - 1;
                                int i19 = length - 2;
                                jArr4[i19] = (jArr4[i19] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i18] = jArr4[0];
                                int i20 = 0;
                                while (i20 != i15) {
                                    int i21 = i20 >> 3;
                                    int i22 = (i20 & 7) << 3;
                                    long j12 = (jArr4[i21] >> i22) & 255;
                                    if (j12 == 128 || j12 != 254) {
                                        i20++;
                                    } else {
                                        Object obj2 = objArr[i20];
                                        int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
                                        int i23 = iHashCode2 ^ (iHashCode2 << 16);
                                        int i24 = i23 >>> 7;
                                        int iE2 = e(i24);
                                        int i25 = i24 & i15;
                                        if (((iE2 - i25) & i15) / 8 == ((i20 - i25) & i15) / 8) {
                                            jArr4[i21] = (jArr4[i21] & (~(255 << i22))) | (((long) (i23 & 127)) << i22);
                                            if (jArr6[i20] == j11) {
                                                long j13 = i20;
                                                jArr6[i20] = (j13 << 32) | j13;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i20++;
                                        } else {
                                            int i26 = iE2 >> 3;
                                            long j14 = jArr4[i26];
                                            int i27 = (iE2 & 7) << 3;
                                            if (((j14 >> i27) & 255) == 128) {
                                                jArr2 = jArr6;
                                                jArr4[i26] = (j14 & (~(255 << i27))) | (((long) (i23 & 127)) << i27);
                                                jArr4[i21] = (jArr4[i21] & (~(255 << i22))) | (128 << i22);
                                                objArr[iE2] = objArr[i20];
                                                objArr[i20] = null;
                                                jArr5[iE2] = jArr5[i20];
                                                jArr5[i20] = 4611686018427387903L;
                                                int i28 = (int) ((jArr2[i20] >> 32) & 4294967295L);
                                                if (i28 != Integer.MAX_VALUE) {
                                                    jArr2[i28] = (jArr2[i28] & (-4294967296L)) | ((long) iE2);
                                                    jArr2[i20] = (jArr2[i20] & 4294967295L) | (-4294967296L);
                                                } else {
                                                    jArr2[i20] = 9223372032559808512L | ((long) iE2);
                                                }
                                                jArr2[iE2] = (((long) i20) << 32) | 2147483647L;
                                            } else {
                                                jArr2 = jArr6;
                                                jArr4[i26] = (j14 & (~(255 << i27))) | (((long) (i23 & 127)) << i27);
                                                Object obj3 = objArr[iE2];
                                                objArr[iE2] = objArr[i20];
                                                objArr[i20] = obj3;
                                                long j15 = jArr5[iE2];
                                                jArr5[iE2] = jArr5[i20];
                                                jArr5[i20] = j15;
                                                int i29 = (int) ((jArr2[i20] >> 32) & 4294967295L);
                                                if (i29 != Integer.MAX_VALUE) {
                                                    long j16 = iE2;
                                                    jArr2[i29] = (jArr2[i29] & (-4294967296L)) | j16;
                                                    jArr2[i20] = (j16 << 32) | (jArr2[i20] & 4294967295L);
                                                } else {
                                                    long j17 = iE2;
                                                    jArr2[i20] = (j17 << 32) | j17;
                                                    i29 = i20;
                                                }
                                                jArr2[iE2] = (((long) i29) << 32) | ((long) i20);
                                                i20--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i20++;
                                            jArr6 = jArr2;
                                        }
                                        j5 = j5;
                                    }
                                }
                                j = j5;
                                long[] jArr7 = jArr6;
                                this.h = bd2.a(this.f) - this.g;
                                long[] jArr8 = this.c;
                                int length2 = jArr8.length;
                                for (int i30 = 0; i30 < length2; i30++) {
                                    long j18 = jArr8[i30];
                                    int i31 = (int) ((j18 >> 31) & 2147483647L);
                                    int i32 = (int) (j18 & 2147483647L);
                                    jArr8[i30] = (((j18 & (-4611686018427387904L)) | ((long) (i31 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr7[i31] & 4294967295L)))) << 31) | ((long) (i32 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr7[i32] & 4294967295L)));
                                }
                                int i33 = this.d;
                                if (i33 != Integer.MAX_VALUE) {
                                    this.d = (int) (jArr7[i33] & 4294967295L);
                                }
                                int i34 = this.e;
                                if (i34 != Integer.MAX_VALUE) {
                                    this.e = (int) (jArr7[i34] & 4294967295L);
                                }
                            }
                        }
                        iE = e(i5);
                    } else {
                        j2 = 255;
                        c = 31;
                        j3 = 128;
                    }
                    i = 0;
                    j = j5;
                    int iB = bd2.b(this.f);
                    long[] jArr9 = this.a;
                    Object[] objArr2 = this.b;
                    long[] jArr10 = this.c;
                    int i35 = this.f;
                    int[] iArr = new int[i35];
                    f(iB);
                    long[] jArr11 = this.a;
                    Object[] objArr3 = this.b;
                    long[] jArr12 = this.c;
                    int i36 = this.f;
                    int i37 = 0;
                    while (i37 < i35) {
                        if (((jArr9[i37 >> 3] >> ((i37 & 7) << 3)) & j2) < j3) {
                            Object obj4 = objArr2[i37];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i13;
                            int i38 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i38 >>> 7);
                            i2 = i36;
                            long j19 = i38 & 127;
                            int i39 = iE3 >> 3;
                            int i40 = (iE3 & 7) << 3;
                            jArr = jArr11;
                            long j20 = (jArr11[i39] & (~(j2 << i40))) | (j19 << i40);
                            jArr[i39] = j20;
                            jArr[(((iE3 - 7) & i2) + (i2 & 7)) >> 3] = j20;
                            objArr3[iE3] = obj4;
                            jArr12[iE3] = jArr10[i37];
                            iArr[i37] = iE3;
                        } else {
                            jArr = jArr11;
                            i2 = i36;
                        }
                        i37++;
                        i36 = i2;
                        jArr9 = jArr9;
                        jArr11 = jArr;
                    }
                    long[] jArr13 = this.c;
                    int length3 = jArr13.length;
                    for (int i41 = 0; i41 < length3; i41++) {
                        long j21 = jArr13[i41];
                        int i42 = (int) ((j21 >> c) & 2147483647L);
                        int i43 = (int) (j21 & 2147483647L);
                        jArr13[i41] = (((j21 & (-4611686018427387904L)) | ((long) (i42 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i42]))) << c) | ((long) (i43 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i43]));
                    }
                    int i44 = this.d;
                    if (i44 != Integer.MAX_VALUE) {
                        this.d = iArr[i44];
                    }
                    int i45 = this.e;
                    if (i45 != Integer.MAX_VALUE) {
                        this.e = iArr[i45];
                    }
                    iE = e(i5);
                }
                this.g++;
                int i46 = this.h;
                long[] jArr14 = this.a;
                int i47 = iE >> 3;
                long j22 = jArr14[i47];
                int i48 = (iE & 7) << 3;
                if (((j22 >> i48) & j2) == j3) {
                    i = 1;
                }
                this.h = i46 - i;
                int i49 = this.f;
                long j23 = (j22 & (~(j2 << i48))) | (j << i48);
                jArr14[i47] = j23;
                jArr14[(((iE - 7) & i49) + (i49 & 7)) >> 3] = j23;
                return iE;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i3 = i13;
        }
    }

    public final int e(int i) {
        int i2 = this.f;
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
        if (!(obj instanceof gj1)) {
            return false;
        }
        gj1 gj1Var = (gj1) obj;
        if (gj1Var.g != this.g) {
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
                        if ((255 & j) < 128 && !gj1Var.c(objArr[(i << 3) + i3])) {
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
        long[] jArr2;
        int iMax = i > 0 ? Math.max(7, bd2.c(i)) : 0;
        this.f = iMax;
        if (iMax == 0) {
            jArr = bd2.a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr3 = new long[i2];
            Arrays.fill(jArr3, 0, i2, -9187201950435737472L);
            jArr = jArr3;
        }
        this.a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.h = bd2.a(this.f) - this.g;
        this.b = iMax == 0 ? s60.l : new Object[iMax];
        if (iMax == 0) {
            jArr2 = uz0.J;
        } else {
            long[] jArr4 = new long[iMax];
            Arrays.fill(jArr4, 0, iMax, 4611686018427387903L);
            jArr2 = jArr4;
        }
        this.c = jArr2;
    }

    public final void g(Object obj) {
        int iD = d(obj);
        this.b[iD] = obj;
        long[] jArr = this.c;
        int i = this.d;
        jArr[iD] = (((long) i) & 2147483647L) | 4611686016279904256L;
        if (i != Integer.MAX_VALUE) {
            jArr[i] = (jArr[i] & (-4611686016279904257L)) | ((((long) iD) & 2147483647L) << 31);
        }
        this.d = iD;
        if (this.e == Integer.MAX_VALUE) {
            this.e = iD;
        }
    }

    public final boolean h(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f;
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
            i(iNumberOfTrailingZeros);
        }
        return z;
    }

    public final int hashCode() {
        int iHashCode = (this.f * 31) + this.g;
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
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (!uz0.g(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return iHashCode;
                    }
                }
                if (i != length) {
                    i++;
                }
            }
        }
        return iHashCode;
    }

    public final void i(int i) {
        this.g--;
        long[] jArr = this.a;
        int i2 = this.f;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
        long[] jArr2 = this.c;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | (((long) i6) & 2147483647L);
        } else {
            this.d = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = (jArr2[i6] & (-4611686016279904257L)) | ((((long) i5) & 2147483647L) << 31);
        } else {
            this.e = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0051 A[LOOP:0: B:5:0x0012->B:17:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0054 A[EDGE_INSN: B:24:0x0054->B:18:0x0054 BREAK  A[LOOP:0: B:5:0x0012->B:17:0x0051], SYNTHETIC] */
    public final boolean j(Collection collection) {
        collection.getClass();
        Object[] objArr = this.b;
        int i = this.g;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!dv.v0(collection, objArr[i5])) {
                                i(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.b;
        long[] jArr = this.c;
        int i = this.e;
        int i2 = 0;
        while (i != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i2++;
            i = i3;
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }
}
