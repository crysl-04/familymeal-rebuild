package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class n90 extends sn2 {
    public static final Object h = new Object();
    public long c;
    public int d;
    public bj1 e;
    public Object f;
    public int g;

    public n90(long j) {
        super(j);
        bj1 bj1Var = ip1.a;
        bj1Var.getClass();
        this.e = bj1Var;
        this.f = h;
    }

    @Override // defpackage.sn2
    public final void a(sn2 sn2Var) {
        sn2Var.getClass();
        n90 n90Var = (n90) sn2Var;
        this.e = n90Var.e;
        this.f = n90Var.f;
        this.g = n90Var.g;
    }

    public final boolean c(o90 o90Var, uk2 uk2Var) {
        boolean z;
        boolean z2;
        Object obj = bl2.c;
        synchronized (obj) {
            z = true;
            z2 = (this.c == uk2Var.g() && this.d == uk2Var.h()) ? false : true;
        }
        if (this.f == h || (z2 && this.g != d(o90Var, uk2Var))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.c = uk2Var.g();
            this.d = uk2Var.h();
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d6 A[PHI: r11
  0x00d6: PHI (r11v1 int) = (r11v0 int), (r11v2 int) binds: [B:30:0x00a9, B:38:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d9 A[Catch: all -> 0x014f, LOOP:3: B:29:0x009c->B:42:0x00d9, LOOP_END, TryCatch #1 {all -> 0x014f, blocks: (B:12:0x0025, B:15:0x0032, B:17:0x0041, B:19:0x004f, B:21:0x0059, B:24:0x0076, B:26:0x007a, B:29:0x009c, B:31:0x00ab, B:33:0x00b5, B:35:0x00bb, B:36:0x00cb, B:45:0x00f3, B:42:0x00d9, B:44:0x00e3), top: B:74:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f3 A[EDGE_INSN: B:82:0x00f3->B:45:0x00f3 BREAK  A[LOOP:3: B:29:0x009c->B:42:0x00d9], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [n90] */
    /* JADX WARN: Type inference failed for: r13v5, types: [sn2] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, sn2] */
    /* JADX WARN: Type inference failed for: r18v3, types: [int] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [int] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    public final int d(o90 o90Var, uk2 uk2Var) {
        bj1 bj1Var;
        int iIdentityHashCode;
        long[] jArr;
        int i;
        Object[] objArr;
        long[] jArr2;
        ?? r25;
        Object[] objArr2;
        long j;
        long j2;
        int i2;
        ?? r26;
        ?? G;
        synchronized (bl2.c) {
            bj1Var = this.e;
        }
        int i3 = 7;
        if (bj1Var.e == 0) {
            return 7;
        }
        uj1 uj1VarA = il2.a();
        Object[] objArr3 = uj1VarA.h;
        int i4 = uj1VarA.j;
        boolean z = false;
        for (int i5 = 0; i5 < i4; i5++) {
            ((cr0) objArr3[i5]).b();
        }
        try {
            Object[] objArr4 = bj1Var.b;
            int[] iArr = bj1Var.c;
            long[] jArr3 = bj1Var.a;
            int length = jArr3.length - 2;
            if (length < 0) {
                iIdentityHashCode = i3;
                break;
            }
            iIdentityHashCode = 7;
            int i6 = 0;
            while (true) {
                long j3 = jArr3[i6];
                long j4 = -9187201950435737472L;
                if ((((~j3) << i3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8;
                    int i8 = 8 - ((~(i6 - length)) >>> 31);
                    i = i3;
                    ?? r3 = z;
                    while (r3 < i8) {
                        if ((j3 & 255) < 128) {
                            ?? r18 = (i6 << 3) + r3;
                            j2 = j4;
                            qn2 qn2Var = (qn2) objArr4[r18];
                            int i9 = i7;
                            if (iArr[r18] != 1) {
                                jArr2 = jArr3;
                                r25 = r3;
                                objArr2 = objArr4;
                                j = j3;
                            } else {
                                if (qn2Var instanceof o90) {
                                    o90 o90Var2 = (o90) qn2Var;
                                    G = o90Var2.g((n90) bl2.g(o90Var2.k, uk2Var), uk2Var, z, o90Var2.i);
                                    bj1 bj1Var2 = G.e;
                                    Object[] objArr5 = bj1Var2.b;
                                    long[] jArr4 = bj1Var2.a;
                                    int length2 = jArr4.length - 2;
                                    jArr2 = jArr3;
                                    r26 = r3;
                                    objArr2 = objArr4;
                                    if (length2 >= 0) {
                                        int i10 = 0;
                                        while (true) {
                                            long j5 = jArr4[i10];
                                            j = j3;
                                            int iIdentityHashCode2 = iIdentityHashCode;
                                            if ((((~j5) << i) & j5 & j2) != j2) {
                                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                for (int i12 = 0; i12 < i11; i12++) {
                                                    if ((j5 & 255) < 128) {
                                                        iIdentityHashCode2 = (iIdentityHashCode2 * 31) + System.identityHashCode((qn2) objArr5[(i10 << 3) + i12]);
                                                    }
                                                    j5 >>= i9;
                                                }
                                                if (i11 != i9) {
                                                    iIdentityHashCode = iIdentityHashCode2;
                                                    break;
                                                }
                                                iIdentityHashCode = iIdentityHashCode2;
                                                if (i10 != length2) {
                                                    break;
                                                }
                                                i10++;
                                                j3 = j;
                                                i9 = 8;
                                            } else {
                                                iIdentityHashCode = iIdentityHashCode2;
                                                if (i10 != length2) {
                                                    break;
                                                    break;
                                                }
                                                i10++;
                                                j3 = j;
                                                i9 = 8;
                                            }
                                        }
                                    } else {
                                        j = j3;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    r26 = r3;
                                    objArr2 = objArr4;
                                    j = j3;
                                    G = bl2.g(qn2Var.a(), uk2Var);
                                }
                                iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(G)) * 31) + Long.hashCode(G.a);
                                r25 = r26;
                            }
                            i2 = 8;
                        } else {
                            jArr2 = jArr3;
                            r25 = r3;
                            objArr2 = objArr4;
                            j = j3;
                            j2 = j4;
                            i2 = i7;
                        }
                        j3 = j >> i2;
                        i7 = i2;
                        j4 = j2;
                        objArr4 = objArr2;
                        z = false;
                        r3 = r25 + 1;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    objArr = objArr4;
                    if (i8 != i7) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    i = i3;
                    objArr = objArr4;
                }
                if (i6 == length) {
                    i3 = iIdentityHashCode;
                    iIdentityHashCode = i3;
                    break;
                }
                i6++;
                i3 = i;
                jArr3 = jArr;
                objArr4 = objArr;
                z = false;
            }
            Object[] objArr6 = uj1VarA.h;
            int i13 = uj1VarA.j;
            for (int i14 = 0; i14 < i13; i14++) {
                ((cr0) objArr6[i14]).a();
            }
            return iIdentityHashCode;
        } catch (Throwable th) {
            Object[] objArr7 = uj1VarA.h;
            int i15 = uj1VarA.j;
            for (int i16 = 0; i16 < i15; i16++) {
                ((cr0) objArr7[i16]).a();
            }
            throw th;
        }
    }
}
