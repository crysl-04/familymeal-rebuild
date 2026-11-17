package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class aj1 {
    public long[] a = bd2.a;
    public Object[] b = s60.l;
    public float[] c = dk0.a;
    public int d;
    public int e;
    public int f;

    public aj1(int i) {
        if (i >= 0) {
            c(bd2.d(i));
        } else {
            wg.m("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i) {
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

    public final int b(Object obj) {
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

    public final void c(int i) {
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
        this.c = new float[iMax];
    }

    public final void d(String str, float f) {
        long j;
        int i;
        long j2;
        int iNumberOfTrailingZeros;
        long[] jArr;
        Object[] objArr;
        float[] fArr;
        String str2 = str;
        int i2 = -862048943;
        int iHashCode = str2.hashCode() * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.d;
        int i7 = i4 & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr2 = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            int i11 = 1;
            int i12 = i8;
            int i13 = 0;
            long j3 = (jArr2[i9] >>> i10) | ((jArr2[i9 + 1] << (64 - i10)) & ((-i10) >> 63));
            long j4 = i5;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
            while (j6 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i7) & i6;
                int i14 = i2;
                if (uz0.g(this.b[iNumberOfTrailingZeros], str2)) {
                    break loop0;
                }
                j6 &= j6 - 1;
                i2 = i14;
            }
            int i15 = i2;
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                int iA = a(i4);
                long j7 = 255;
                if (this.f != 0 || ((this.a[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                    j = 255;
                    i = 1;
                    j2 = 128;
                } else {
                    int i16 = this.d;
                    if (i16 > 8) {
                        j2 = 128;
                        if (Long.compareUnsigned(((long) this.e) << 5, ((long) i16) * 25) <= 0) {
                            long[] jArr3 = this.a;
                            int i17 = this.d;
                            Object[] objArr2 = this.b;
                            float[] fArr2 = this.c;
                            int i18 = (i17 + 7) >> 3;
                            int i19 = 0;
                            while (i19 < i18) {
                                long j8 = j7;
                                long j9 = jArr3[i19] & (-9187201950435737472L);
                                jArr3[i19] = ((~j9) + (j9 >>> 7)) & (-72340172838076674L);
                                i19++;
                                i18 = i18;
                                j7 = j8;
                            }
                            j = j7;
                            int iY = gi.Y(jArr3);
                            int i20 = iY - 1;
                            jArr3[i20] = (jArr3[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iY] = jArr3[0];
                            int i21 = 0;
                            while (i21 != i17) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j10 = (jArr3[i22] >> i23) & j;
                                if (j10 == 128 || j10 != 254) {
                                    i21++;
                                } else {
                                    Object obj = objArr2[i21];
                                    int iHashCode2 = (obj != null ? obj.hashCode() : 0) * i15;
                                    int i24 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i25 = i24 >>> 7;
                                    int iA2 = a(i25);
                                    int i26 = i25 & i17;
                                    int i27 = i11;
                                    if (((iA2 - i26) & i17) / 8 == ((i21 - i26) & i17) / 8) {
                                        objArr = objArr2;
                                        fArr = fArr2;
                                        jArr3[i22] = (jArr3[i22] & (~(j << i23))) | (((long) (i24 & 127)) << i23);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    } else {
                                        objArr = objArr2;
                                        fArr = fArr2;
                                        int i28 = iA2 >> 3;
                                        long j11 = jArr3[i28];
                                        int i29 = (iA2 & 7) << 3;
                                        if (((j11 >> i29) & j) == 128) {
                                            jArr3[i28] = (j11 & (~(j << i29))) | (((long) (i24 & 127)) << i29);
                                            jArr3[i22] = (jArr3[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[iA2] = objArr[i21];
                                            objArr[i21] = null;
                                            fArr[iA2] = fArr[i21];
                                            fArr[i21] = 0.0f;
                                        } else {
                                            jArr3[i28] = (j11 & (~(j << i29))) | (((long) (i24 & 127)) << i29);
                                            Object obj2 = objArr[iA2];
                                            objArr[iA2] = objArr[i21];
                                            objArr[i21] = obj2;
                                            float f2 = fArr[iA2];
                                            fArr[iA2] = fArr[i21];
                                            fArr[i21] = f2;
                                            i21--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    }
                                    i21++;
                                    objArr2 = objArr;
                                    i11 = i27;
                                    fArr2 = fArr;
                                }
                            }
                            i = i11;
                            this.f = bd2.a(this.d) - this.e;
                        }
                        iA = a(i4);
                    } else {
                        j2 = 128;
                    }
                    j = 255;
                    i = 1;
                    int iB = bd2.b(this.d);
                    long[] jArr4 = this.a;
                    Object[] objArr3 = this.b;
                    float[] fArr3 = this.c;
                    int i30 = this.d;
                    c(iB);
                    long[] jArr5 = this.a;
                    Object[] objArr4 = this.b;
                    float[] fArr4 = this.c;
                    int i31 = this.d;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr4[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < j2) {
                            Object obj3 = objArr3[i32];
                            int iHashCode3 = (obj3 != null ? obj3.hashCode() : i13) * i15;
                            int i33 = iHashCode3 ^ (iHashCode3 << 16);
                            int iA3 = a(i33 >>> 7);
                            int i34 = i33 & 127;
                            jArr = jArr5;
                            int i35 = iA3 >> 3;
                            int i36 = (iA3 & 7) << 3;
                            long j12 = (jArr[i35] & (~(255 << i36))) | (((long) i34) << i36);
                            jArr[i35] = j12;
                            jArr[(((iA3 - 7) & i31) + (i31 & 7)) >> 3] = j12;
                            objArr4[iA3] = obj3;
                            fArr4[iA3] = fArr3[i32];
                        } else {
                            jArr = jArr5;
                        }
                        i32++;
                        jArr5 = jArr;
                        i13 = 0;
                    }
                    iA = a(i4);
                }
                this.e++;
                int i37 = this.f;
                long[] jArr6 = this.a;
                int i38 = iA >> 3;
                long j13 = jArr6[i38];
                int i39 = (iA & 7) << 3;
                if (((j13 >> i39) & j) != j2) {
                    i = 0;
                }
                this.f = i37 - i;
                int i40 = this.d;
                long j14 = (j13 & (~(j << i39))) | (j4 << i39);
                jArr6[i38] = j14;
                jArr6[(((iA - 7) & i40) + (i40 & 7)) >> 3] = j14;
                iNumberOfTrailingZeros = ~iA;
                break;
            }
            i8 = i12 + 8;
            i7 = (i7 + i8) & i6;
            str2 = str;
            i2 = i15;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.b[iNumberOfTrailingZeros] = str;
        this.c[iNumberOfTrailingZeros] = f;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0066 A[LOOP:0: B:14:0x0023->B:28:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0069 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aj1)) {
            return false;
        }
        aj1 aj1Var = (aj1) obj;
        if (aj1Var.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
        float[] fArr = this.c;
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
                            float f = fArr[i4];
                            int iB = aj1Var.b(obj2);
                            if (iB < 0 || f != aj1Var.c[iB]) {
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

    public final int hashCode() {
        Object[] objArr = this.b;
        float[] fArr = this.c;
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
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Float.hashCode(fArr[i4]);
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
        float[] fArr = this.c;
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
                            float f = fArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(f);
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
}
