package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class o90 extends rn2 implements kn2 {
    public final kp0 i;
    public final hl2 j;
    public n90 k = new n90(bl2.h().g());

    public o90(kp0 kp0Var, hl2 hl2Var) {
        this.i = kp0Var;
        this.j = hl2Var;
    }

    @Override // defpackage.qn2
    public final sn2 a() {
        return this.k;
    }

    @Override // defpackage.qn2
    public final void c(sn2 sn2Var) {
        this.k = (n90) sn2Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0095 A[Catch: all -> 0x00ab, LOOP:1: B:14:0x0045->B:28:0x0095, LOOP_END, TryCatch #3 {all -> 0x00ab, blocks: (B:8:0x0023, B:10:0x002f, B:11:0x0037, B:14:0x0045, B:16:0x0055, B:18:0x0061, B:20:0x006b, B:22:0x0083, B:24:0x0089, B:28:0x0095, B:29:0x0098), top: B:94:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0098 A[EDGE_INSN: B:99:0x0098->B:29:0x0098 BREAK  A[LOOP:1: B:14:0x0045->B:28:0x0095], SYNTHETIC] */
    public final n90 g(n90 n90Var, uk2 uk2Var, boolean z, kp0 kp0Var) {
        n90 n90Var2;
        hl2 hl2Var;
        int i;
        if (n90Var.c(this, uk2Var)) {
            if (z) {
                uj1 uj1VarA = il2.a();
                Object[] objArr = uj1VarA.h;
                int i2 = uj1VarA.j;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((cr0) objArr[i3]).b();
                }
                try {
                    bj1 bj1Var = n90Var.e;
                    eg egVar = il2.a;
                    sy0 sy0Var = (sy0) egVar.f();
                    if (sy0Var == null) {
                        sy0Var = new sy0();
                        egVar.D(sy0Var);
                    }
                    int i4 = sy0Var.a;
                    Object[] objArr2 = bj1Var.b;
                    int[] iArr = bj1Var.c;
                    long[] jArr = bj1Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i5 != length) {
                                    break;
                                    break;
                                }
                                i5++;
                            } else {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        qn2 qn2Var = (qn2) objArr2[i9];
                                        i = i6;
                                        sy0Var.a = i4 + iArr[i9];
                                        vp0 vp0VarE = uk2Var.e();
                                        if (vp0VarE != null) {
                                            vp0VarE.h(qn2Var);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                                if (i5 != length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    sy0Var.a = i4;
                } finally {
                    Object[] objArr3 = uj1VarA.h;
                    int i10 = uj1VarA.j;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((cr0) objArr3[i11]).a();
                    }
                }
            }
            return n90Var;
        }
        bj1 bj1Var2 = new bj1();
        eg egVar2 = il2.a;
        sy0 sy0Var2 = (sy0) egVar2.f();
        if (sy0Var2 == null) {
            sy0Var2 = new sy0();
            egVar2.D(sy0Var2);
        }
        sy0 sy0Var3 = sy0Var2;
        int i12 = sy0Var3.a;
        uj1 uj1VarA2 = il2.a();
        Object[] objArr4 = uj1VarA2.h;
        int i13 = uj1VarA2.j;
        for (int i14 = 0; i14 < i13; i14++) {
            ((cr0) objArr4[i14]).b();
        }
        try {
            sy0Var3.a = i12 + 1;
            Object objS = y02.s(new m90((byte) 0, i12, this, sy0Var3, bj1Var2), kp0Var);
            sy0Var3.a = i12;
            Object[] objArr5 = uj1VarA2.h;
            int i15 = uj1VarA2.j;
            for (int i16 = 0; i16 < i15; i16++) {
                ((cr0) objArr5[i16]).a();
            }
            Object obj = bl2.c;
            synchronized (obj) {
                uk2 uk2VarH = bl2.h();
                Object obj2 = n90Var.f;
                if (obj2 == n90.h || (hl2Var = this.j) == null || !hl2Var.e(objS, obj2)) {
                    n90 n90Var3 = this.k;
                    synchronized (obj) {
                        sn2 sn2VarK = bl2.k(n90Var3, this);
                        sn2VarK.a(n90Var3);
                        sn2VarK.a = uk2VarH.g();
                        n90Var2 = (n90) sn2VarK;
                        n90Var2.e = bj1Var2;
                        n90Var2.g = n90Var2.d(this, uk2VarH);
                        n90Var2.f = objS;
                    }
                    return n90Var2;
                }
                n90Var.e = bj1Var2;
                n90Var.g = n90Var.d(this, uk2VarH);
                n90Var2 = n90Var;
            }
            sy0 sy0Var4 = (sy0) il2.a.f();
            if (sy0Var4 == null || sy0Var4.a != 0) {
                return n90Var2;
            }
            bl2.h().m();
            synchronized (obj) {
                uk2 uk2VarH2 = bl2.h();
                n90Var2.c = uk2VarH2.g();
                n90Var2.d = uk2VarH2.h();
                return n90Var2;
            }
        } catch (Throwable th) {
            Object[] objArr6 = uj1VarA2.h;
            int i17 = uj1VarA2.j;
            for (int i18 = 0; i18 < i17; i18++) {
                ((cr0) objArr6[i18]).a();
            }
            throw th;
        }
    }

    @Override // defpackage.kn2
    public final Object getValue() {
        vp0 vp0VarE = bl2.h().e();
        if (vp0VarE != null) {
            vp0VarE.h(this);
        }
        uk2 uk2VarH = bl2.h();
        return g((n90) bl2.g(this.k, uk2VarH), uk2VarH, true, this.i).f;
    }

    public final n90 h() {
        uk2 uk2VarH = bl2.h();
        return g((n90) bl2.g(this.k, uk2VarH), uk2VarH, false, this.i);
    }

    public final String toString() {
        n90 n90Var = (n90) bl2.f(this.k);
        return "DerivedState(value=" + (n90Var.c(this, bl2.h()) ? String.valueOf(n90Var.f) : "<Not calculated>") + ")@" + hashCode();
    }
}
