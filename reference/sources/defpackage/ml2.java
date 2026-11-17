package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ml2 {
    public final vp0 a;
    public Object b;
    public bj1 c;
    public boolean j;
    public int k;
    public int d = -1;
    public final mj1 e = p02.v();
    public final mj1 f = new mj1();
    public final nj1 g = new nj1();
    public final uj1 h = new uj1(new o90[16]);
    public final cr0 i = new cr0(this, (byte) 1);
    public final mj1 l = p02.v();
    public final HashMap m = new HashMap();

    public ml2(vp0 vp0Var) {
        this.a = vp0Var;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 16451. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final boolean a(java.util.Set r46) {
        /*
            Method dump skipped, instruction units count: 1645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml2.a(java.util.Set):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x008b A[LOOP:0: B:14:0x0046->B:27:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x008e A[EDGE_INSN: B:36:0x008e->B:28:0x008e BREAK  A[LOOP:0: B:14:0x0046->B:27:0x008b], SYNTHETIC] */
    public final void b(Object obj, int i, Object obj2, bj1 bj1Var) {
        int i2;
        if (this.k <= 0) {
            int iC = bj1Var.c(obj);
            if (iC < 0) {
                iC = ~iC;
                i2 = -1;
            } else {
                i2 = bj1Var.c[iC];
            }
            bj1Var.b[iC] = obj;
            bj1Var.c[iC] = i;
            if ((obj instanceof o90) && i2 != i) {
                n90 n90VarH = ((o90) obj).h();
                this.m.put(obj, n90VarH.f);
                bj1 bj1Var2 = n90VarH.e;
                mj1 mj1Var = this.l;
                p02.G(mj1Var, obj);
                Object[] objArr = bj1Var2.b;
                long[] jArr = bj1Var2.a;
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
                                if ((j & 255) < 128) {
                                    qn2 qn2Var = (qn2) objArr[(i3 << 3) + i5];
                                    if (qn2Var instanceof rn2) {
                                        ((rn2) qn2Var).f(2);
                                    }
                                    p02.e(mj1Var, qn2Var, obj);
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
            }
            if (i2 == -1) {
                if (obj instanceof rn2) {
                    ((rn2) obj).f(2);
                }
                p02.e(this.e, obj, obj2);
            }
        }
    }

    public final void c(Object obj, Object obj2) {
        mj1 mj1Var = this.e;
        p02.E(mj1Var, obj2, obj);
        if (!(obj2 instanceof o90) || mj1Var.c(obj2)) {
            return;
        }
        p02.G(this.l, obj2);
        this.m.remove(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x009f A[LOOP:2: B:16:0x0066->B:28:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00aa A[EDGE_INSN: B:49:0x00aa->B:30:0x00aa BREAK  A[LOOP:2: B:16:0x0066->B:28:0x009f], SYNTHETIC] */
    public final void d(de1 de1Var) {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        mj1 mj1Var = this.f;
        long[] jArr3 = mj1Var.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j3 = jArr3[i2];
            char c2 = 7;
            long j4 = -9187201950435737472L;
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j3 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj = mj1Var.b[i6];
                        j2 = j4;
                        bj1 bj1Var = (bj1) mj1Var.c[i6];
                        Boolean bool = (Boolean) de1Var.h(obj);
                        if (bool.booleanValue()) {
                            Object[] objArr = bj1Var.b;
                            int[] iArr = bj1Var.c;
                            long[] jArr4 = bj1Var.a;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j3;
                                int i8 = 0;
                                while (true) {
                                    long j5 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    if ((((~j5) << c) & j5 & j2) != j2) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j5 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                c(obj, obj2);
                                            }
                                            j5 >>= i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                        if (i8 != length2) {
                                            break;
                                        }
                                        i8++;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    } else if (i8 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i8++;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                j = j3;
                            }
                        } else {
                            jArr2 = jArr3;
                            j = j3;
                        }
                        if (bool.booleanValue()) {
                            mj1Var.m(i6);
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j = j3;
                        c = c2;
                        j2 = j4;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j3 = j >> i;
                    c2 = c;
                    j4 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }
}
