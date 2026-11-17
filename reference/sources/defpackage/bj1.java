package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bj1 {
    public long[] a;
    public Object[] b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public bj1(int i) {
        this.a = bd2.a;
        this.b = s60.l;
        this.c = uy0.a;
        if (i >= 0) {
            e(bd2.d(i));
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
        gi.U(this.b, 0, this.d);
        this.f = bd2.a(this.d) - this.e;
    }

    public final int b(int i) {
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

    public final int c(Object obj) {
        long j;
        int i;
        long j2;
        long j3;
        long[] jArr;
        int i2;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.d;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr2 = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = (jArr2[i9] >>> i10) | ((jArr2[i9 + 1] << (64 - i10)) & ((-i10) >> 63));
            long j5 = i5;
            int i11 = i5;
            int i12 = 0;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (j6 - 72340172838076673L) & (~j6);
            long j8 = -9187201950435737472L;
            long j9 = j7 & (-9187201950435737472L);
            while (j9 != 0) {
                int iNumberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j9) >> 3)) & i6;
                long j10 = j8;
                if (uz0.g(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                j8 = j10;
            }
            long j11 = j8;
            if ((j4 & ((~j4) << 6) & j11) != 0) {
                int iB = b(i4);
                long j12 = 255;
                if (this.f != 0 || ((this.a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j = j5;
                    i = 0;
                    j2 = 255;
                    j3 = 128;
                } else {
                    int i13 = this.d;
                    if (i13 <= 8 || Long.compareUnsigned(((long) this.e) << 5, ((long) i13) * 25) > 0) {
                        j = j5;
                        i = 0;
                        j2 = 255;
                        j3 = 128;
                        int iB2 = bd2.b(this.d);
                        long[] jArr3 = this.a;
                        Object[] objArr = this.b;
                        int[] iArr = this.c;
                        int i14 = this.d;
                        e(iB2);
                        long[] jArr4 = this.a;
                        Object[] objArr2 = this.b;
                        int[] iArr2 = this.c;
                        int i15 = this.d;
                        int i16 = 0;
                        while (i16 < i14) {
                            if (((jArr3[i16 >> 3] >> ((i16 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr[i16];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i17 = iHashCode2 ^ (iHashCode2 << 16);
                                int iB3 = b(i17 >>> 7);
                                long j13 = i17 & 127;
                                int i18 = iB3 >> 3;
                                int i19 = (iB3 & 7) << 3;
                                jArr = jArr4;
                                long j14 = (jArr4[i18] & (~(255 << i19))) | (j13 << i19);
                                jArr[i18] = j14;
                                jArr[(((iB3 - 7) & i15) + (i15 & 7)) >> 3] = j14;
                                objArr2[iB3] = obj2;
                                iArr2[iB3] = iArr[i16];
                            } else {
                                jArr = jArr4;
                            }
                            i16++;
                            jArr3 = jArr3;
                            jArr4 = jArr;
                        }
                    } else {
                        long[] jArr5 = this.a;
                        int i20 = this.d;
                        Object[] objArr3 = this.b;
                        int[] iArr3 = this.c;
                        int i21 = (i20 + 7) >> 3;
                        int i22 = 0;
                        while (i22 < i21) {
                            long j15 = jArr5[i22] & j11;
                            jArr5[i22] = ((~j15) + (j15 >>> 7)) & (-72340172838076674L);
                            i22++;
                            j5 = j5;
                        }
                        j = j5;
                        j3 = 128;
                        int iY = gi.Y(jArr5);
                        int i23 = iY - 1;
                        long j16 = 72057594037927935L;
                        jArr5[i23] = (jArr5[i23] & 72057594037927935L) | (-72057594037927936L);
                        jArr5[iY] = jArr5[0];
                        int i24 = 0;
                        while (i24 != i20) {
                            int i25 = i24 >> 3;
                            int i26 = (i24 & 7) << 3;
                            long j17 = (jArr5[i25] >> i26) & j12;
                            if (j17 == 128 || j17 != 254) {
                                i24++;
                            } else {
                                Object obj3 = objArr3[i24];
                                int iHashCode3 = (obj3 != null ? obj3.hashCode() : i12) * (-862048943);
                                int i27 = iHashCode3 ^ (iHashCode3 << 16);
                                int i28 = i27 >>> 7;
                                int iB4 = b(i28);
                                int i29 = i28 & i20;
                                long j18 = j16;
                                if (((iB4 - i29) & i20) / 8 == ((i24 - i29) & i20) / 8) {
                                    int i30 = i12;
                                    long j19 = j12;
                                    jArr5[i25] = (jArr5[i25] & (~(j19 << i26))) | (((long) (i27 & 127)) << i26);
                                    jArr5[jArr5.length - 1] = (jArr5[i30] & j18) | Long.MIN_VALUE;
                                    i24++;
                                    j16 = j18;
                                    i12 = i30;
                                    j12 = j19;
                                } else {
                                    int i31 = i12;
                                    long j20 = j12;
                                    int i32 = iB4 >> 3;
                                    long j21 = jArr5[i32];
                                    int i33 = (iB4 & 7) << 3;
                                    if (((j21 >> i33) & j20) == 128) {
                                        int i34 = i24;
                                        jArr5[i32] = (j21 & (~(j20 << i33))) | (((long) (i27 & 127)) << i33);
                                        jArr5[i25] = (jArr5[i25] & (~(j20 << i26))) | (128 << i26);
                                        objArr3[iB4] = objArr3[i34];
                                        objArr3[i34] = null;
                                        iArr3[iB4] = iArr3[i34];
                                        iArr3[i34] = i31;
                                        i2 = i34;
                                    } else {
                                        int i35 = i24;
                                        jArr5[i32] = (j21 & (~(j20 << i33))) | (((long) (i27 & 127)) << i33);
                                        Object obj4 = objArr3[iB4];
                                        objArr3[iB4] = objArr3[i35];
                                        objArr3[i35] = obj4;
                                        int i36 = iArr3[iB4];
                                        iArr3[iB4] = iArr3[i35];
                                        iArr3[i35] = i36;
                                        i2 = i35 - 1;
                                    }
                                    jArr5[jArr5.length - 1] = (jArr5[i31] & j18) | Long.MIN_VALUE;
                                    i24 = i2 + 1;
                                    j16 = j18;
                                    i12 = i31;
                                    j12 = j20;
                                    i20 = i20;
                                }
                            }
                        }
                        i = i12;
                        j2 = j12;
                        this.f = bd2.a(this.d) - this.e;
                    }
                    iB = b(i4);
                }
                this.e++;
                int i37 = this.f;
                long[] jArr6 = this.a;
                int i38 = iB >> 3;
                long j22 = jArr6[i38];
                int i39 = (iB & 7) << 3;
                if (((j22 >> i39) & j2) == j3) {
                    i = 1;
                }
                this.f = i37 - i;
                int i40 = this.d;
                long j23 = (j22 & (~(j2 << i39))) | (j << i39);
                jArr6[i38] = j23;
                jArr6[(((iB - 7) & i40) + (i40 & 7)) >> 3] = j23;
                return ~iB;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
        }
    }

    public final int d(Object obj) {
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = (jArr[i7] >>> i8) | ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63));
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (j2 - 72340172838076673L) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (uz0.g(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    public final void e(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, bd2.c(i)) : 0;
        this.d = iMax;
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
        this.f = bd2.a(this.d) - this.e;
        this.b = new Object[iMax];
        this.c = new int[iMax];
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064 A[LOOP:0: B:14:0x0023->B:28:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0067 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bj1)) {
            return false;
        }
        bj1 bj1Var = (bj1) obj;
        if (bj1Var.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
        int[] iArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            int i5 = iArr[i4];
                            int iD = bj1Var.d(obj2);
                            if (iD < 0 || i5 != bj1Var.c[iD]) {
                                break loop0;
                            }
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
            return false;
        }
        return true;
    }

    public final void f(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = this.d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    public final void g(int i, Object obj) {
        int iC = c(obj);
        if (iC < 0) {
            iC = ~iC;
        }
        this.b[iC] = obj;
        this.c[iC] = i;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        int[] iArr = this.c;
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
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(iArr[i4]);
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

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT, PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:9:0x001e->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f BREAK  A[LOOP:0: B:9:0x001e->B:24:0x006c], SYNTHETIC] */
    public final String toString() {
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.b;
        int[] iArr = this.c;
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
                            int i6 = iArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i6);
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

    public /* synthetic */ bj1() {
        this(6);
    }
}
