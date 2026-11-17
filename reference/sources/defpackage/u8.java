package defpackage;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class u8 {
    public int a;
    public Object b;
    public Object c;

    /* JADX WARN: Code duplicated, block: B:27:0x00d5  */
    public u8(qy0 qy0Var, lt ltVar) {
        Object l70Var;
        u8 u8VarF = ltVar.F();
        int i = qy0Var.h;
        if (i < 0) {
            dx0.c("negative nearestRange.first");
        }
        int iMin = Math.min(qy0Var.i, u8VarF.a - 1);
        if (iMin < i) {
            bj1 bj1Var = ip1.a;
            bj1Var.getClass();
            this.b = bj1Var;
            this.c = new Object[0];
            this.a = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.c = new Object[i2];
        this.a = i;
        bj1 bj1Var2 = new bj1(i2);
        uj1 uj1Var = (uj1) u8VarF.b;
        if (i < 0 || i >= u8VarF.a) {
            dx0.e("Index " + i + ", size " + u8VarF.a);
        }
        if (iMin < 0 || iMin >= u8VarF.a) {
            dx0.e("Index " + iMin + ", size " + u8VarF.a);
        }
        if (iMin < i) {
            dx0.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ")");
        }
        int iP = es.p(i, uj1Var);
        int i3 = ((mz0) uj1Var.h[iP]).a;
        while (i3 <= iMin) {
            mz0 mz0Var = (mz0) uj1Var.h[iP];
            vp0 key = mz0Var.c.getKey();
            int i4 = mz0Var.a;
            int iMax = Math.max(i, i4);
            int iMin2 = Math.min(iMin, (mz0Var.b + i4) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (key != null) {
                        l70Var = key.h(Integer.valueOf(iMax - i4));
                        l70Var = l70Var == null ? new l70(iMax) : l70Var;
                    }
                    bj1Var2.g(iMax, l70Var);
                    ((Object[]) this.c)[iMax - this.a] = l70Var;
                    iMax = iMax != iMin2 ? iMax + 1 : iMax;
                }
            }
            i3 += mz0Var.b;
            iP++;
        }
        this.b = bj1Var2;
    }

    public final void a(int i, n61 n61Var) {
        if (i < 0) {
            dx0.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        mz0 mz0Var = new mz0(this.a, i, n61Var);
        this.a += i;
        ((uj1) this.b).b(mz0Var);
    }

    public final void b(int i, int i2, sb0 sb0Var) {
        cu.v((ExecutorService) this.b, i, i2, this.a, ((fu1) this.c).h.getAsInt(), sb0Var);
    }

    public final mz0 c(int i) {
        if (i < 0 || i >= this.a) {
            dx0.e("Index " + i + ", size " + this.a);
        }
        mz0 mz0Var = (mz0) this.c;
        if (mz0Var != null) {
            int i2 = mz0Var.a;
            if (i < mz0Var.b + i2 && i2 <= i) {
                return mz0Var;
            }
        }
        uj1 uj1Var = (uj1) this.b;
        mz0 mz0Var2 = (mz0) uj1Var.h[es.p(i, uj1Var)];
        this.c = mz0Var2;
        return mz0Var2;
    }

    public final int d(Object obj) {
        bj1 bj1Var = (bj1) this.b;
        int iD = bj1Var.d(obj);
        if (iD >= 0) {
            return bj1Var.c[iD];
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int e(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
        int i8 = i & 33554431;
        long[] jArr = (long[]) this.b;
        int i9 = this.a;
        int i10 = i9 + 3;
        this.a = i10;
        int length = jArr.length;
        if (length <= i10) {
            int iMax = Math.max(length << 1, i10);
            this.b = Arrays.copyOf(jArr, iMax);
            this.c = Arrays.copyOf((long[]) this.c, iMax);
        }
        long[] jArr2 = (long[]) this.b;
        jArr2[i9] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i9 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        int i11 = i6 & 33554431;
        jArr2[i9 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (((long) i11) << 25) | ((long) (i & 33554431));
        if (i6 == -1) {
            return i9;
        }
        if ((i7 != -4) == false) {
            ax0.b("Inserted child " + i8 + " without valid parent index");
        }
        int i12 = i7 + 2;
        long j = jArr2[i12];
        if (!((((int) j) & 33554431) == i11)) {
            ax0.b("Inserted child " + i8 + " without valid parent index or parent " + i11 + " not found");
        }
        jArr2[i12] = (j & (-1151795604700004353L)) | (((long) Math.min((i9 - i7) / 3, 1023)) << 50);
        return i9;
    }

    public final void f(int i, int i2, int i3, long j) {
        long j2;
        char c;
        int i4;
        char c2 = '2';
        if ((((int) (j >> 50)) & 1023) > 0) {
            long j3 = -1125899873288193L;
            int i5 = 33554431;
            char c3 = 25;
            long[] jArr = (long[]) this.b;
            long[] jArr2 = (long[]) this.c;
            int i6 = this.a;
            jArr2[0] = (j & (-1125899873288193L)) | (((long) (i & 33554431)) << 25);
            int i7 = 1;
            while (i7 > 0) {
                i7--;
                long j4 = jArr2[i7];
                int i8 = ((int) j4) & i5;
                int i9 = ((int) (j4 >> c3)) & i5;
                int i10 = ((int) (j4 >> c2)) & 1023;
                int i11 = i10 == 1023 ? i6 : (i10 * 3) + i9;
                if (i9 < 0) {
                    return;
                }
                while (i9 < i6 - 2 && i9 <= i11) {
                    int i12 = i9 + 2;
                    long j5 = jArr[i12];
                    char c4 = c2;
                    int i13 = i5;
                    if ((((int) (j5 >> c3)) & i13) == i8) {
                        long j6 = jArr[i9];
                        int i14 = i9 + 1;
                        j2 = j3;
                        long j7 = jArr[i14];
                        c = c3;
                        i4 = i11;
                        jArr[i9] = (((long) (((int) (j6 >> 32)) + i2)) << 32) | (((long) (((int) j6) + i3)) & 4294967295L);
                        jArr[i14] = (((long) (((int) (j7 >> 32)) + i2)) << 32) | (((long) (((int) j7) + i3)) & 4294967295L);
                        jArr[i12] = (((j5 >> 63) & 1) << 60) | j5;
                        if ((((int) (j5 >> c4)) & 1023) > 0) {
                            jArr2[i7] = (j5 & j2) | (((long) ((i9 + 3) & i13)) << c);
                            i7++;
                        }
                    } else {
                        j2 = j3;
                        c = c3;
                        i4 = i11;
                    }
                    i9 += 3;
                    i11 = i4;
                    c3 = c;
                    i5 = i13;
                    c2 = c4;
                    j3 = j2;
                }
                c3 = c3;
                i5 = i5;
                c2 = c2;
                j3 = j3;
            }
        }
    }

    public u8() {
        this.b = new uj1(new mz0[16]);
    }
}
