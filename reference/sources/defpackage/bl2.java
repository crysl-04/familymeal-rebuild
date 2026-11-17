package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class bl2 {
    public static final jc2 a = new jc2(24);
    public static final eg b = new eg((byte) 19);
    public static final Object c = new Object();
    public static zk2 d;
    public static long e;
    public static final lb f;
    public static final u8 g;
    public static List h;
    public static List i;
    public static final wr0 j;
    public static final ji k;

    static {
        zk2 zk2Var = zk2.l;
        d = zk2Var;
        e = 2L;
        lb lbVar = new lb();
        lbVar.d = new long[16];
        lbVar.b = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        lbVar.e = iArr;
        f = lbVar;
        u8 u8Var = new u8();
        u8Var.b = new int[16];
        u8Var.c = new b63[16];
        g = u8Var;
        ag0 ag0Var = ag0.h;
        h = ag0Var;
        i = ag0Var;
        long j2 = e;
        e = 1 + j2;
        wr0 wr0Var = new wr0(j2, zk2Var, null, new rt((byte) 28));
        d = d.e(wr0Var.b);
        j = wr0Var;
        k = new ji(0);
    }

    public static final zk2 a(zk2 zk2Var, long j2, long j3) {
        while (uz0.j(j2, j3) < 0) {
            zk2Var = zk2Var.e(j2);
            j2++;
        }
        return zk2Var;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0088 A[LOOP:1: B:27:0x0051->B:37:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x008b A[EDGE_INSN: B:54:0x008b->B:38:0x008b BREAK  A[LOOP:1: B:27:0x0051->B:37:0x0088], SYNTHETIC] */
    public static final Object b(vp0 vp0Var) {
        nj1 nj1Var;
        Object objU;
        wr0 wr0Var = j;
        synchronized (c) {
            nj1Var = wr0Var.h;
            if (nj1Var != null) {
                k.addAndGet(1);
            }
            objU = u(wr0Var, vp0Var);
        }
        if (nj1Var != null) {
            try {
                List list = h;
                dd2 dd2Var = new dd2(nj1Var);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((zp0) list.get(i2)).f(dd2Var, wr0Var);
                }
                k.addAndGet(-1);
            } catch (Throwable th) {
                k.addAndGet(-1);
                throw th;
            }
        }
        synchronized (c) {
            d();
            if (nj1Var != null) {
                Object[] objArr = nj1Var.b;
                long[] jArr = nj1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    p((qn2) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                            if (i3 != length) {
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
        }
        return objU;
    }

    public static final void c() {
        b(a);
    }

    public static final void d() {
        u8 u8Var = g;
        int i2 = u8Var.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            b63 b63Var = ((b63[]) u8Var.c)[i3];
            Object obj = b63Var != null ? b63Var.get() : null;
            if (obj != null && o((qn2) obj)) {
                if (i4 != i3) {
                    ((b63[]) u8Var.c)[i4] = b63Var;
                    int[] iArr = (int[]) u8Var.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((b63[]) u8Var.c)[i5] = null;
            ((int[]) u8Var.b)[i5] = 0;
        }
        if (i4 != i2) {
            u8Var.a = i4;
        }
    }

    public static final uk2 e(uk2 uk2Var, vp0 vp0Var, boolean z) {
        boolean z2 = uk2Var instanceof rj1;
        if (z2 || uk2Var == null) {
            return new uz2(z2 ? (rj1) uk2Var : null, vp0Var, null, false, z);
        }
        return new vz2(uk2Var, vp0Var, false, z);
    }

    public static final sn2 f(sn2 sn2Var) {
        sn2 sn2VarR;
        uk2 uk2VarH = h();
        sn2 sn2VarR2 = r(sn2Var, uk2VarH.g(), uk2VarH.d());
        if (sn2VarR2 != null) {
            return sn2VarR2;
        }
        synchronized (c) {
            uk2 uk2VarH2 = h();
            sn2VarR = r(sn2Var, uk2VarH2.g(), uk2VarH2.d());
        }
        if (sn2VarR != null) {
            return sn2VarR;
        }
        q();
        throw null;
    }

    public static final sn2 g(sn2 sn2Var, uk2 uk2Var) {
        sn2 sn2VarR;
        sn2 sn2VarR2 = r(sn2Var, uk2Var.g(), uk2Var.d());
        if (sn2VarR2 != null) {
            return sn2VarR2;
        }
        synchronized (c) {
            sn2VarR = r(sn2Var, uk2Var.g(), uk2Var.d());
        }
        if (sn2VarR != null) {
            return sn2VarR;
        }
        q();
        throw null;
    }

    public static final uk2 h() {
        uk2 uk2Var = (uk2) b.f();
        return uk2Var == null ? j : uk2Var;
    }

    public static final vp0 i(vp0 vp0Var, vp0 vp0Var2, boolean z) {
        if (!z) {
            vp0Var2 = null;
        }
        if (vp0Var == null || vp0Var2 == null || vp0Var == vp0Var2) {
            return vp0Var == null ? vp0Var2 : vp0Var;
        }
        return new al2(vp0Var, vp0Var2, (byte) 0);
    }

    public static final vp0 j(vp0 vp0Var, vp0 vp0Var2) {
        if (vp0Var == null || vp0Var2 == null || vp0Var == vp0Var2) {
            return vp0Var == null ? vp0Var2 : vp0Var;
        }
        return new al2(vp0Var, vp0Var2, (byte) 1);
    }

    public static final sn2 k(sn2 sn2Var, qn2 qn2Var) {
        long j2 = e;
        lb lbVar = f;
        if (lbVar.a > 0) {
            j2 = ((long[]) lbVar.d)[0];
        }
        long j3 = j2 - 1;
        sn2 sn2Var2 = null;
        sn2 sn2Var3 = null;
        for (sn2 sn2VarA = qn2Var.a(); sn2VarA != null; sn2VarA = sn2VarA.b) {
            long j4 = sn2VarA.a;
            if (j4 != 0) {
                if (j4 != 0 && uz0.j(j4, j3) <= 0 && !zk2.l.c(j4)) {
                    if (sn2Var3 != null) {
                        if (uz0.j(sn2VarA.a, sn2Var3.a) >= 0) {
                            sn2Var2 = sn2Var3;
                            break;
                        }
                        break;
                    }
                    sn2Var3 = sn2VarA;
                }
            }
            sn2Var2 = sn2VarA;
            break;
        }
        if (sn2Var2 != null) {
            sn2Var2.a = Long.MAX_VALUE;
            return sn2Var2;
        }
        sn2 sn2VarB = sn2Var.b(Long.MAX_VALUE);
        sn2VarB.b = qn2Var.a();
        qn2Var.c(sn2VarB);
        return sn2VarB;
    }

    public static final void l(uk2 uk2Var, qn2 qn2Var) {
        uk2Var.t(uk2Var.h() + 1);
        vp0 vp0VarI = uk2Var.i();
        if (vp0VarI != null) {
            vp0VarI.h(qn2Var);
        }
    }

    public static final HashMap m(long j2, rj1 rj1Var, zk2 zk2Var) {
        long[] jArr;
        zk2 zk2Var2;
        long[] jArr2;
        int i2;
        int i3;
        sn2 sn2VarR;
        nj1 nj1VarX = rj1Var.x();
        if (nj1VarX != null) {
            long jG = rj1Var.g();
            zk2 zk2VarD = rj1Var.d().e(jG).d(rj1Var.j);
            Object[] objArr = nj1VarX.b;
            long[] jArr3 = nj1VarX.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap map = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                qn2 qn2Var = (qn2) objArr[(i4 << 3) + i7];
                                sn2 sn2VarA = qn2Var.a();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                sn2 sn2VarR2 = r(sn2VarA, j2, zk2Var);
                                if (sn2VarR2 != null && (sn2VarR = r(sn2VarA, jG, zk2VarD)) != null && !sn2VarR2.equals(sn2VarR)) {
                                    sn2 sn2VarR3 = r(sn2VarA, jG, rj1Var.d());
                                    if (sn2VarR3 == null) {
                                        q();
                                        throw null;
                                    }
                                    sn2 sn2VarB = qn2Var.b(sn2VarR, sn2VarR2, sn2VarR3);
                                    if (sn2VarB == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(sn2VarR2, sn2VarB);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            zk2VarD = zk2VarD;
                        }
                        jArr = jArr3;
                        zk2Var2 = zk2VarD;
                        if (i6 != i5) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        zk2Var2 = zk2VarD;
                    }
                    if (i4 == length) {
                        return map;
                    }
                    i4++;
                    jArr3 = jArr;
                    zk2VarD = zk2Var2;
                }
            }
        }
        return null;
    }

    public static final sn2 n(sn2 sn2Var, rn2 rn2Var, uk2 uk2Var, sn2 sn2Var2) {
        sn2 sn2VarK;
        if (uk2Var.f()) {
            uk2Var.n(rn2Var);
        }
        long jG = uk2Var.g();
        if (sn2Var2.a == jG) {
            return sn2Var2;
        }
        synchronized (c) {
            sn2VarK = k(sn2Var, rn2Var);
        }
        sn2VarK.a = jG;
        uk2Var.n(rn2Var);
        return sn2VarK;
    }

    public static final boolean o(qn2 qn2Var) {
        sn2 sn2Var;
        long j2 = e;
        lb lbVar = f;
        if (lbVar.a > 0) {
            j2 = ((long[]) lbVar.d)[0];
        }
        sn2 sn2Var2 = null;
        sn2 sn2VarA = null;
        int i2 = 0;
        for (sn2 sn2VarA2 = qn2Var.a(); sn2VarA2 != null; sn2VarA2 = sn2VarA2.b) {
            long j3 = sn2VarA2.a;
            if (j3 != 0) {
                if (uz0.j(j3, j2) >= 0) {
                    i2++;
                } else if (sn2Var2 == null) {
                    i2++;
                    sn2Var2 = sn2VarA2;
                } else {
                    if (uz0.j(sn2VarA2.a, sn2Var2.a) < 0) {
                        sn2Var = sn2Var2;
                        sn2Var2 = sn2VarA2;
                    } else {
                        sn2Var = sn2VarA2;
                    }
                    if (sn2VarA == null) {
                        sn2VarA = qn2Var.a();
                        sn2 sn2Var3 = sn2VarA;
                        while (true) {
                            if (sn2VarA == null) {
                                sn2VarA = sn2Var3;
                                break;
                            }
                            if (uz0.j(sn2VarA.a, j2) >= 0) {
                                break;
                            }
                            if (uz0.j(sn2Var3.a, sn2VarA.a) < 0) {
                                sn2Var3 = sn2VarA;
                            }
                            sn2VarA = sn2VarA.b;
                        }
                    }
                    sn2Var2.a = 0L;
                    sn2Var2.a(sn2VarA);
                    sn2Var2 = sn2Var;
                }
            }
        }
        return i2 > 1;
    }

    public static final void p(qn2 qn2Var) {
        if (o(qn2Var)) {
            u8 u8Var = g;
            int i2 = u8Var.a;
            int iIdentityHashCode = System.identityHashCode(qn2Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = u8Var.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 <= i4) {
                        int i6 = (i5 + i4) >>> 1;
                        int i7 = ((int[]) u8Var.b)[i6];
                        if (i7 >= iIdentityHashCode) {
                            if (i7 <= iIdentityHashCode) {
                                b63 b63Var = ((b63[]) u8Var.c)[i6];
                                if (qn2Var == (b63Var != null ? b63Var.get() : null)) {
                                    i3 = i6;
                                    break;
                                }
                                int i8 = i6 - 1;
                                while (true) {
                                    if (-1 >= i8 || ((int[]) u8Var.b)[i8] != iIdentityHashCode) {
                                        i6++;
                                        int i9 = u8Var.a;
                                        while (true) {
                                            if (i6 >= i9) {
                                                i3 = -(u8Var.a + 1);
                                                break;
                                            }
                                            if (((int[]) u8Var.b)[i6] != iIdentityHashCode) {
                                                i3 = -(i6 + 1);
                                                break;
                                            }
                                            b63 b63Var2 = ((b63[]) u8Var.c)[i6];
                                            if ((b63Var2 != null ? b63Var2.get() : null) == qn2Var) {
                                                i3 = i6;
                                                break;
                                            }
                                            i6++;
                                        }
                                    } else {
                                        b63 b63Var3 = ((b63[]) u8Var.c)[i8];
                                        if ((b63Var3 != null ? b63Var3.get() : null) == qn2Var) {
                                            i3 = i8;
                                            break;
                                        }
                                        i8--;
                                    }
                                }
                            } else {
                                i4 = i6 - 1;
                            }
                        } else {
                            i5 = i6 + 1;
                        }
                    } else {
                        i3 = -(i5 + 1);
                        break;
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            b63[] b63VarArr = (b63[]) u8Var.c;
            int length = b63VarArr.length;
            if (i2 == length) {
                int i11 = length << 1;
                b63[] b63VarArr2 = new b63[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(b63VarArr, i10, b63VarArr2, i12, i2 - i10);
                System.arraycopy((b63[]) u8Var.c, 0, b63VarArr2, 0, i10);
                gi.O(i12, i10, i2, (int[]) u8Var.b, iArr);
                gi.R(0, i10, 6, (int[]) u8Var.b, iArr);
                u8Var.c = b63VarArr2;
                u8Var.b = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(b63VarArr, i10, b63VarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) u8Var.b;
                gi.O(i13, i10, i2, iArr2, iArr2);
            }
            ((b63[]) u8Var.c)[i10] = new b63(qn2Var);
            ((int[]) u8Var.b)[i10] = iIdentityHashCode;
            u8Var.a++;
        }
    }

    public static final void q() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final sn2 r(sn2 sn2Var, long j2, zk2 zk2Var) {
        sn2 sn2Var2 = null;
        while (sn2Var != null) {
            long j3 = sn2Var.a;
            if (j3 != 0 && uz0.j(j3, j2) <= 0 && !zk2Var.c(j3) && (sn2Var2 == null || uz0.j(sn2Var2.a, sn2Var.a) < 0)) {
                sn2Var2 = sn2Var;
            }
            sn2Var = sn2Var.b;
        }
        if (sn2Var2 != null) {
            return sn2Var2;
        }
        return null;
    }

    public static final sn2 s(sn2 sn2Var, qn2 qn2Var) {
        sn2 sn2VarR;
        uk2 uk2VarH = h();
        vp0 vp0VarE = uk2VarH.e();
        if (vp0VarE != null) {
            vp0VarE.h(qn2Var);
        }
        sn2 sn2VarR2 = r(sn2Var, uk2VarH.g(), uk2VarH.d());
        if (sn2VarR2 != null) {
            return sn2VarR2;
        }
        synchronized (c) {
            uk2 uk2VarH2 = h();
            sn2 sn2VarA = qn2Var.a();
            sn2VarA.getClass();
            sn2VarR = r(sn2VarA, uk2VarH2.g(), uk2VarH2.d());
            if (sn2VarR == null) {
                q();
                throw null;
            }
        }
        return sn2VarR;
    }

    public static final void t(int i2) {
        lb lbVar = f;
        int i3 = ((int[]) lbVar.e)[i2];
        lbVar.d(i3, lbVar.a - 1);
        lbVar.a--;
        long[] jArr = (long[]) lbVar.d;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (uz0.j(jArr[i5], j2) <= 0) {
                break;
            }
            lbVar.d(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) lbVar.d;
        int i6 = lbVar.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < lbVar.a && uz0.j(jArr2[i7], jArr2[i8]) < 0) {
                if (uz0.j(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                lbVar.d(i7, i3);
                i3 = i7;
            } else {
                if (uz0.j(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                lbVar.d(i8, i3);
                i3 = i8;
            }
        }
        ((int[]) lbVar.e)[i2] = lbVar.c;
        lbVar.c = i2;
    }

    public static final Object u(wr0 wr0Var, vp0 vp0Var) {
        long j2 = wr0Var.b;
        Object objH = vp0Var.h(d.b(j2));
        long j3 = e;
        e = 1 + j3;
        zk2 zk2VarB = d.b(j2);
        d = zk2VarB;
        wr0Var.b = j3;
        wr0Var.a = zk2VarB;
        wr0Var.g = 0;
        wr0Var.h = null;
        wr0Var.o();
        d = d.e(j3);
        return objH;
    }

    public static final void v(uk2 uk2Var) {
        Long lValueOf;
        if (d.c(uk2Var.g())) {
            return;
        }
        long jG = uk2Var.g();
        boolean z = uk2Var.c;
        rj1 rj1Var = uk2Var instanceof rj1 ? (rj1) uk2Var : null;
        Object objValueOf = rj1Var != null ? Boolean.valueOf(rj1Var.m) : "read-only";
        synchronized (c) {
            lb lbVar = f;
            lValueOf = Long.valueOf(lbVar.a > 0 ? ((long[]) lbVar.d)[0] : -1L);
        }
        throw new IllegalStateException(("Snapshot is not open: snapshotId=" + jG + ", disposed=" + z + ", applied=" + objValueOf + ", lowestPin=" + lValueOf).toString());
    }

    public static final sn2 w(sn2 sn2Var, qn2 qn2Var, uk2 uk2Var) {
        sn2 sn2VarR;
        sn2 sn2VarR2;
        if (uk2Var.f()) {
            uk2Var.n(qn2Var);
        }
        long jG = uk2Var.g();
        sn2 sn2VarR3 = r(sn2Var, jG, uk2Var.d());
        if (sn2VarR3 == null) {
            synchronized (c) {
                uk2 uk2VarH = h();
                sn2 sn2VarA = qn2Var.a();
                sn2VarA.getClass();
                sn2VarR2 = r(sn2VarA, uk2VarH.g(), uk2VarH.d());
                if (sn2VarR2 == null) {
                    q();
                    throw null;
                }
            }
            sn2VarR3 = sn2VarR2;
        }
        if (sn2VarR3.a == uk2Var.g()) {
            return sn2VarR3;
        }
        synchronized (c) {
            sn2VarR = r(qn2Var.a(), jG, uk2Var.d());
            if (sn2VarR == null) {
                q();
                throw null;
            }
            if (sn2VarR.a != jG) {
                sn2 sn2VarK = k(sn2VarR, qn2Var);
                sn2VarK.a(sn2VarR);
                sn2VarK.a = uk2Var.g();
                sn2VarR = sn2VarK;
            }
        }
        uk2Var.n(qn2Var);
        return sn2VarR;
    }
}
