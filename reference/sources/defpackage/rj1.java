package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class rj1 extends uk2 {
    public static final int[] n = new int[0];
    public final vp0 e;
    public final vp0 f;
    public int g;
    public nj1 h;
    public ArrayList i;
    public zk2 j;
    public int[] k;
    public int l;
    public boolean m;

    public rj1(long j, zk2 zk2Var, vp0 vp0Var, vp0 vp0Var2) {
        super(j, zk2Var);
        this.e = vp0Var;
        this.f = vp0Var2;
        this.j = zk2.l;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (bl2.c) {
            this.j = this.j.e(j);
        }
    }

    public void B(nj1 nj1Var) {
        this.h = nj1Var;
    }

    public rj1 C(vp0 vp0Var, vp0 vp0Var2) {
        vm1 vm1Var;
        if (this.c) {
            w12.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            w12.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = bl2.c;
        synchronized (obj) {
            long j = bl2.e;
            bl2.e = j + 1;
            bl2.d = bl2.d.e(j);
            zk2 zk2VarD = d();
            r(zk2VarD.e(j));
            vm1Var = new vm1(j, bl2.a(zk2VarD, g() + 1, j), bl2.i(vp0Var, e(), true), bl2.j(vp0Var2, i()), this);
        }
        if (this.m || this.c) {
            return vm1Var;
        }
        long jG = g();
        synchronized (obj) {
            long j2 = bl2.e;
            bl2.e = j2 + 1;
            s(j2);
            bl2.d = bl2.d.e(g());
        }
        r(bl2.a(d(), jG + 1, g()));
        return vm1Var;
    }

    @Override // defpackage.uk2
    public final void b() {
        bl2.d = bl2.d.b(g()).a(this.j);
    }

    @Override // defpackage.uk2
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (bl2.c) {
            o();
        }
        l();
    }

    @Override // defpackage.uk2
    public int h() {
        return this.g;
    }

    @Override // defpackage.uk2
    public vp0 i() {
        return this.f;
    }

    @Override // defpackage.uk2
    public void k() {
        this.l++;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x008d A[LOOP:0: B:17:0x0038->B:34:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x0090 A[EDGE_INSN: B:38:0x0090->B:35:0x0090 BREAK  A[LOOP:0: B:17:0x0038->B:34:0x008d], SYNTHETIC] */
    @Override // defpackage.uk2
    public void l() {
        if (this.l <= 0) {
            w12.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        nj1 nj1VarX = x();
        if (nj1VarX != null) {
            if (this.m) {
                w12.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long jG = g();
            Object[] objArr = nj1VarX.b;
            long[] jArr = nj1VarX.a;
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
                                for (sn2 sn2VarA = ((qn2) objArr[(i2 << 3) + i4]).a(); sn2VarA != null; sn2VarA = sn2VarA.b) {
                                    long j2 = sn2VarA.a;
                                    if (j2 == jG || dv.v0(this.j, Long.valueOf(j2))) {
                                        jc2 jc2Var = bl2.a;
                                        sn2VarA.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override // defpackage.uk2
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.uk2
    public void n(qn2 qn2Var) {
        nj1 nj1VarX = x();
        if (nj1VarX == null) {
            nj1 nj1Var = cd2.a;
            nj1VarX = new nj1();
            B(nj1VarX);
        }
        nj1VarX.a(qn2Var);
    }

    @Override // defpackage.uk2
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            bl2.t(this.k[i]);
        }
        o();
    }

    @Override // defpackage.uk2
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.uk2
    public uk2 u(vp0 vp0Var) {
        wm1 wm1Var;
        if (this.c) {
            w12.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            w12.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = bl2.c;
        synchronized (obj) {
            long j = bl2.e;
            bl2.e = j + 1;
            bl2.d = bl2.d.e(j);
            wm1Var = new wm1(j, bl2.a(d(), jG + 1, j), bl2.i(vp0Var, e(), true), this);
        }
        if (this.m || this.c) {
            return wm1Var;
        }
        long jG2 = g();
        synchronized (obj) {
            long j2 = bl2.e;
            bl2.e = j2 + 1;
            s(j2);
            bl2.d = bl2.d.e(g());
        }
        r(bl2.a(d(), jG2 + 1, g()));
        return wm1Var;
    }

    public final void v() {
        A(g());
        if (this.m || this.c) {
            return;
        }
        long jG = g();
        synchronized (bl2.c) {
            long j = bl2.e;
            bl2.e = j + 1;
            s(j);
            bl2.d = bl2.d.e(g());
        }
        r(bl2.a(d(), jG + 1, g()));
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0101 A[Catch: all -> 0x0160, LOOP:2: B:45:0x00d2->B:55:0x0101, LOOP_END, TryCatch #0 {, blocks: (B:40:0x00b6, B:42:0x00c6, B:45:0x00d2, B:47:0x00de, B:49:0x00e8, B:51:0x00ee, B:52:0x00f9, B:58:0x010a, B:61:0x0114, B:63:0x011e, B:65:0x0128, B:67:0x012e, B:68:0x0138, B:71:0x0140, B:72:0x0143, B:74:0x0147, B:76:0x014e, B:77:0x015a, B:55:0x0101), top: B:87:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0104  */
    /* JADX WARN: Code duplicated, block: B:70:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0140 A[Catch: all -> 0x0160, LOOP:4: B:61:0x0114->B:71:0x0140, LOOP_END, TryCatch #0 {, blocks: (B:40:0x00b6, B:42:0x00c6, B:45:0x00d2, B:47:0x00de, B:49:0x00e8, B:51:0x00ee, B:52:0x00f9, B:58:0x010a, B:61:0x0114, B:63:0x011e, B:65:0x0128, B:67:0x012e, B:68:0x0138, B:71:0x0140, B:72:0x0143, B:74:0x0147, B:76:0x014e, B:77:0x015a, B:55:0x0101), top: B:87:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0108 A[EDGE_INSN: B:93:0x0108->B:57:0x0108 BREAK  A[LOOP:2: B:45:0x00d2->B:55:0x0101], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0143 A[EDGE_INSN: B:98:0x0143->B:72:0x0143 BREAK  A[LOOP:4: B:61:0x0114->B:71:0x0140], SYNTHETIC] */
    public h12 w() {
        HashMap mapM;
        List list;
        nj1 nj1Var;
        long j;
        long j2;
        nj1 nj1VarX = x();
        if (nj1VarX != null) {
            long j3 = bl2.j.b;
            mapM = bl2.m(j3, this, bl2.d.b(j3));
        } else {
            mapM = null;
        }
        ag0 ag0Var = ag0.h;
        synchronized (bl2.c) {
            bl2.v(this);
            if (nj1VarX == null || nj1VarX.d == 0) {
                b();
                wr0 wr0Var = bl2.j;
                nj1 nj1Var2 = wr0Var.h;
                bl2.u(wr0Var, bl2.a);
                if (nj1Var2 == null || !nj1Var2.h()) {
                    list = ag0Var;
                    nj1Var = null;
                } else {
                    list = bl2.h;
                    nj1Var = nj1Var2;
                }
            } else {
                wr0 wr0Var2 = bl2.j;
                h12 h12VarZ = z(bl2.e, nj1VarX, mapM, bl2.d.b(wr0Var2.b));
                if (!h12VarZ.equals(xk2.b)) {
                    return h12VarZ;
                }
                b();
                nj1Var = wr0Var2.h;
                bl2.u(wr0Var2, bl2.a);
                B(null);
                wr0Var2.h = null;
                list = bl2.h;
            }
            this.m = true;
            if (nj1Var != null) {
                dd2 dd2Var = new dd2(nj1Var);
                if (!nj1Var.g()) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((zp0) list.get(i)).f(dd2Var, this);
                    }
                }
            }
            if (nj1VarX != null && nj1VarX.h()) {
                dd2 dd2Var2 = new dd2(nj1VarX);
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((zp0) list.get(i2)).f(dd2Var2, this);
                }
            }
            synchronized (bl2.c) {
                p();
                bl2.d();
                if (nj1Var != null) {
                    Object[] objArr = nj1Var.b;
                    long[] jArr = nj1Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        j = 128;
                        while (true) {
                            long j4 = jArr[i3];
                            j2 = 255;
                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i3 != length) {
                                    break;
                                    break;
                                }
                                i3++;
                            } else {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((j4 & 255) < 128) {
                                        bl2.p((qn2) objArr[(i3 << 3) + i5]);
                                    }
                                    j4 >>= 8;
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
                    } else {
                        j = 128;
                        j2 = 255;
                    }
                } else {
                    j = 128;
                    j2 = 255;
                }
                if (nj1VarX != null) {
                    Object[] objArr2 = nj1VarX.b;
                    long[] jArr2 = nj1VarX.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j5 = jArr2[i6];
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i6 != length2) {
                                    break;
                                    break;
                                }
                                i6++;
                            } else {
                                int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    if ((j5 & j2) < j) {
                                        bl2.p((qn2) objArr2[(i6 << 3) + i8]);
                                    }
                                    j5 >>= 8;
                                }
                                if (i7 != 8) {
                                    break;
                                }
                                if (i6 != length2) {
                                    break;
                                }
                                i6++;
                            }
                        }
                    }
                }
                ArrayList arrayList = this.i;
                if (arrayList != null) {
                    int size3 = arrayList.size();
                    for (int i9 = 0; i9 < size3; i9++) {
                        bl2.p((qn2) arrayList.get(i9));
                    }
                }
                this.i = null;
            }
            return xk2.b;
        }
    }

    public nj1 x() {
        return this.h;
    }

    @Override // defpackage.uk2
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public vp0 e() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0165  */
    /* JADX WARN: Code duplicated, block: B:67:0x016f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0194  */
    /* JADX WARN: Code duplicated, block: B:78:0x019b A[LOOP:3: B:77:0x0199->B:78:0x019b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:85:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final h12 z(long j, nj1 nj1Var, HashMap map, zk2 zk2Var) {
        ArrayList arrayList;
        ArrayList arrayListI0;
        ArrayList arrayList2;
        int size;
        int i;
        ArrayList arrayList3;
        int size2;
        int i2;
        qn2 qn2Var;
        sn2 sn2Var;
        zk2 zk2Var2;
        Object[] objArr;
        long[] jArr;
        zk2 zk2Var3;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        long j2;
        sn2 sn2VarR;
        sn2 sn2VarB;
        zk2 zk2VarD = d().e(g()).d(this.j);
        Object[] objArr3 = nj1Var.b;
        long[] jArr3 = nj1Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            arrayList2 = null;
            arrayListI0 = null;
            while (true) {
                long j3 = jArr3[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            qn2 qn2Var2 = (qn2) objArr3[(i4 << 3) + i6];
                            jArr2 = jArr3;
                            sn2 sn2VarA = qn2Var2.a();
                            i3 = i6;
                            ArrayList arrayList4 = arrayList2;
                            sn2 sn2VarR2 = bl2.r(sn2VarA, j, zk2Var);
                            ArrayList arrayList5 = arrayListI0;
                            j2 = j3;
                            if (sn2VarR2 == null || (sn2VarR = bl2.r(sn2VarA, g(), zk2VarD)) == null || sn2VarR.a == 1 || sn2VarR2.equals(sn2VarR)) {
                                zk2Var3 = zk2VarD;
                            } else {
                                zk2Var3 = zk2VarD;
                                sn2 sn2VarR3 = bl2.r(sn2VarA, g(), d());
                                if (sn2VarR3 == null) {
                                    bl2.q();
                                    throw null;
                                }
                                if (map == null || (sn2VarB = (sn2) map.get(sn2VarR2)) == null) {
                                    sn2VarB = qn2Var2.b(sn2VarR, sn2VarR2, sn2VarR3);
                                }
                                if (sn2VarB == null) {
                                    return new wk2(this);
                                }
                                if (!sn2VarB.equals(sn2VarR3)) {
                                    if (sn2VarB.equals(sn2VarR2)) {
                                        ArrayList arrayList6 = arrayList4 == null ? new ArrayList() : arrayList4;
                                        arrayList6.add(new wt1(qn2Var2, sn2VarR2.b(g())));
                                        arrayListI0 = arrayList5 == null ? new ArrayList() : arrayList5;
                                        arrayListI0.add(qn2Var2);
                                        arrayList2 = arrayList6;
                                    } else {
                                        arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                        arrayList2.add(!sn2VarB.equals(sn2VarR) ? new wt1(qn2Var2, sn2VarB) : new wt1(qn2Var2, sn2VarR.b(g())));
                                    }
                                }
                                arrayListI0 = arrayList5;
                            }
                            arrayList2 = arrayList4;
                            arrayListI0 = arrayList5;
                        } else {
                            zk2Var3 = zk2VarD;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i3 = i6;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i6 = i3 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        zk2VarD = zk2Var3;
                    }
                    zk2Var2 = zk2VarD;
                    objArr = objArr3;
                    jArr = jArr3;
                    arrayList2 = arrayList2;
                    arrayListI0 = arrayListI0;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    zk2Var2 = zk2VarD;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i4 != length) {
                    i4++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    zk2VarD = zk2Var2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                v();
                size2 = arrayList2.size();
                for (i2 = 0; i2 < size2; i2++) {
                    wt1 wt1Var = (wt1) arrayList2.get(i2);
                    qn2Var = (qn2) wt1Var.h;
                    sn2Var = (sn2) wt1Var.i;
                    sn2Var.a = j;
                    synchronized (bl2.c) {
                        sn2Var.b = qn2Var.a();
                        qn2Var.c(sn2Var);
                    }
                }
            }
            if (arrayListI0 != null) {
                size = arrayListI0.size();
                for (i = 0; i < size; i++) {
                    nj1Var.l((qn2) arrayListI0.get(i));
                }
                arrayList3 = this.i;
                if (arrayList3 != null) {
                    arrayListI0 = dv.I0(arrayList3, arrayListI0);
                }
                this.i = arrayListI0;
            }
            return xk2.b;
        }
        arrayList = null;
        arrayListI0 = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            size2 = arrayList2.size();
            while (i2 < size2) {
                wt1 wt1Var2 = (wt1) arrayList2.get(i2);
                qn2Var = (qn2) wt1Var2.h;
                sn2Var = (sn2) wt1Var2.i;
                sn2Var.a = j;
                synchronized (bl2.c) {
                    sn2Var.b = qn2Var.a();
                    qn2Var.c(sn2Var);
                }
            }
        }
        if (arrayListI0 != null) {
            size = arrayListI0.size();
            while (i < size) {
                nj1Var.l((qn2) arrayListI0.get(i));
            }
            arrayList3 = this.i;
            if (arrayList3 != null) {
                arrayListI0 = dv.I0(arrayList3, arrayListI0);
            }
            this.i = arrayListI0;
        }
        return xk2.b;
    }
}
