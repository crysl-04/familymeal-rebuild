package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class qi2 extends u0 implements qj1, pk0, lq0 {
    public final int l;
    public final int m;
    public final dp n;
    public Object[] o;
    public long p;
    public long q;
    public int r;
    public int s;

    public qi2(int i, int i2, dp dpVar) {
        this.l = i;
        this.m = i2;
        this.n = dpVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007c A[Catch: all -> 0x00af, TRY_ENTER, TryCatch #2 {all -> 0x00af, blocks: (B:15:0x002f, B:30:0x0072, B:33:0x007c, B:37:0x008f, B:39:0x0095, B:40:0x0099, B:41:0x009a, B:20:0x0042), top: B:55:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008f A[Catch: all -> 0x00af, TryCatch #2 {all -> 0x00af, blocks: (B:15:0x002f, B:30:0x0072, B:33:0x007c, B:37:0x008f, B:39:0x0095, B:40:0x0099, B:41:0x009a, B:20:0x0042), top: B:55:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:57:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4, types: [qk0] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [u0] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [qi2] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [qk0] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [v0] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [ri2] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [ri2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00a8 -> B:44:0x00ab). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:61:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void j(defpackage.qi2 r8, defpackage.qk0 r9, defpackage.m10 r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.pi2
            if (r0 == 0) goto L13
            r0 = r10
            pi2 r0 = (defpackage.pi2) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.q = r1
            goto L18
        L13:
            pi2 r0 = new pi2
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.o
            int r1 = r0.q
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L56
            r8 = 1
            if (r1 == r8) goto L46
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L34
            s01 r8 = r0.n
            ri2 r9 = r0.m
            qk0 r1 = r0.l
            qi2 r4 = r0.k
            defpackage.m02.y(r10)     // Catch: java.lang.Throwable -> Laf
            goto Lab
        L34:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r8)
            return
        L3a:
            s01 r8 = r0.n
            ri2 r9 = r0.m
            qk0 r1 = r0.l
            qi2 r4 = r0.k
            defpackage.m02.y(r10)     // Catch: java.lang.Throwable -> Laf
            goto L72
        L46:
            ri2 r9 = r0.m
            qk0 r8 = r0.l
            qi2 r1 = r0.k
            defpackage.m02.y(r10)     // Catch: java.lang.Throwable -> L52
            r10 = r8
            r8 = r1
            goto L62
        L52:
            r8 = move-exception
            r4 = r1
            goto Lb4
        L56:
            defpackage.m02.y(r10)
            v0 r10 = r8.c()
            ri2 r10 = (defpackage.ri2) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L62:
            o20 r1 = r0.i     // Catch: java.lang.Throwable -> Lb1
            r1.getClass()     // Catch: java.lang.Throwable -> Lb1
            c5 r4 = defpackage.c5.Z     // Catch: java.lang.Throwable -> Lb1
            m20 r1 = r1.m(r4)     // Catch: java.lang.Throwable -> Lb1
            s01 r1 = (defpackage.s01) r1     // Catch: java.lang.Throwable -> Lb1
        L6f:
            r4 = r8
            r8 = r1
            r1 = r10
        L72:
            java.lang.Object r10 = r4.t(r9)     // Catch: java.lang.Throwable -> Laf
            qf0 r5 = defpackage.tz0.i0     // Catch: java.lang.Throwable -> Laf
            y20 r6 = defpackage.y20.h
            if (r10 != r5) goto L8d
            r0.k = r4     // Catch: java.lang.Throwable -> Laf
            r0.l = r1     // Catch: java.lang.Throwable -> Laf
            r0.m = r9     // Catch: java.lang.Throwable -> Laf
            r0.n = r8     // Catch: java.lang.Throwable -> Laf
            r0.q = r3     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r10 = r4.h(r9, r0)     // Catch: java.lang.Throwable -> Laf
            if (r10 != r6) goto L72
            goto Laa
        L8d:
            if (r8 == 0) goto L9a
            boolean r5 = r8.b()     // Catch: java.lang.Throwable -> Laf
            if (r5 != 0) goto L9a
            java.util.concurrent.CancellationException r8 = r8.o()     // Catch: java.lang.Throwable -> Laf
            throw r8     // Catch: java.lang.Throwable -> Laf
        L9a:
            r0.k = r4     // Catch: java.lang.Throwable -> Laf
            r0.l = r1     // Catch: java.lang.Throwable -> Laf
            r0.m = r9     // Catch: java.lang.Throwable -> Laf
            r0.n = r8     // Catch: java.lang.Throwable -> Laf
            r0.q = r2     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r10 = r1.m(r10, r0)     // Catch: java.lang.Throwable -> Laf
            if (r10 != r6) goto Lab
        Laa:
            return
        Lab:
            r10 = r1
            r1 = r8
            r8 = r4
            goto L6f
        Laf:
            r8 = move-exception
            goto Lb4
        Lb1:
            r10 = move-exception
            r4 = r8
            r8 = r10
        Lb4:
            r4.f(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qi2.j(qi2, qk0, m10):void");
    }

    @Override // defpackage.pk0
    public final Object a(qk0 qk0Var, m10 m10Var) throws Throwable {
        j(this, qk0Var, m10Var);
        return y20.h;
    }

    @Override // defpackage.lq0
    public final pk0 b(o20 o20Var, int i, dp dpVar) {
        return tz0.s(this, o20Var, i, dpVar);
    }

    public final Object h(ri2 ri2Var, m10 m10Var) {
        rq rqVar = new rq(1, ls.F(m10Var));
        rqVar.u();
        synchronized (this) {
            if (s(ri2Var) < 0) {
                ri2Var.b = rqVar;
            } else {
                rqVar.g(j23.a);
            }
        }
        Object objT = rqVar.t();
        return objT == y20.h ? objT : j23.a;
    }

    public final void i() {
        if (this.m != 0 || this.s > 1) {
            Object[] objArr = this.o;
            objArr.getClass();
            while (this.s > 0) {
                long jO = o();
                int i = this.r;
                int i2 = this.s;
                if (objArr[((int) ((jO + ((long) (i + i2))) - 1)) & (objArr.length - 1)] != tz0.i0) {
                    return;
                }
                this.s = i2 - 1;
                tz0.H(objArr, o() + ((long) (this.r + this.s)), null);
            }
        }
    }

    public final void k() {
        v0[] v0VarArr;
        Object[] objArr = this.o;
        objArr.getClass();
        tz0.H(objArr, o(), null);
        this.r--;
        long jO = o() + 1;
        if (this.p < jO) {
            this.p = jO;
        }
        if (this.q < jO) {
            if (this.i != 0 && (v0VarArr = this.h) != null) {
                for (v0 v0Var : v0VarArr) {
                    if (v0Var != null) {
                        ri2 ri2Var = (ri2) v0Var;
                        long j = ri2Var.a;
                        if (j >= 0 && j < jO) {
                            ri2Var.a = jO;
                        }
                    }
                }
            }
            this.q = jO;
        }
    }

    public final void l(Object obj) {
        int i = this.r + this.s;
        Object[] objArrP = this.o;
        if (objArrP == null) {
            objArrP = p(null, 0, 2);
        } else if (i >= objArrP.length) {
            objArrP = p(objArrP, i, objArrP.length << 1);
        }
        tz0.H(objArrP, o() + ((long) i), obj);
    }

    @Override // defpackage.qk0
    public final Object m(Object obj, m10 m10Var) throws Throwable {
        qi2 qi2Var;
        Throwable th;
        m10[] m10VarArrN;
        oi2 oi2Var;
        if (q(obj)) {
            return j23.a;
        }
        rq rqVar = new rq(1, ls.F(m10Var));
        rqVar.u();
        m10[] m10VarArrN2 = tz0.a;
        synchronized (this) {
            try {
                if (r(obj)) {
                    try {
                        rqVar.g(j23.a);
                        m10VarArrN = n(m10VarArrN2);
                        oi2Var = null;
                        qi2Var = this;
                    } catch (Throwable th2) {
                        th = th2;
                        qi2Var = this;
                        throw th;
                    }
                } else {
                    try {
                        qi2Var = this;
                        try {
                            oi2 oi2Var2 = new oi2(qi2Var, o() + ((long) (this.r + this.s)), obj, rqVar);
                            qi2Var.l(oi2Var2);
                            qi2Var.s++;
                            if (qi2Var.m == 0) {
                                m10VarArrN2 = qi2Var.n(m10VarArrN2);
                            }
                            m10VarArrN = m10VarArrN2;
                            oi2Var = oi2Var2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        qi2Var = this;
                        th = th4;
                        throw th;
                    }
                }
                if (oi2Var != null) {
                    rqVar.x(new nq(oi2Var, (byte) 2));
                }
                for (m10 m10Var2 : m10VarArrN) {
                    if (m10Var2 != null) {
                        m10Var2.g(j23.a);
                    }
                }
                Object objT = rqVar.t();
                y20 y20Var = y20.h;
                if (objT != y20Var) {
                    objT = j23.a;
                }
                return objT == y20Var ? objT : j23.a;
            } catch (Throwable th5) {
                th = th5;
                qi2Var = this;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [m10[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final m10[] n(m10[] m10VarArr) {
        v0[] v0VarArr;
        ri2 ri2Var;
        rq rqVar;
        int length = m10VarArr.length;
        if (this.i != 0 && (v0VarArr = this.h) != null) {
            int length2 = v0VarArr.length;
            int i = 0;
            while (i < length2) {
                v0 v0Var = v0VarArr[i];
                if (v0Var == null || (rqVar = (ri2Var = (ri2) v0Var).b) == null || s(ri2Var) < 0) {
                    m10VarArr = m10VarArr;
                } else {
                    if (length >= m10VarArr.length) {
                        m10VarArr = m10VarArr;
                        m10VarArr = m10VarArr;
                        m10VarArr = Arrays.copyOf((Object[]) m10VarArr, Math.max(2, m10VarArr.length << 1));
                    }
                    m10VarArr = m10VarArr;
                    m10VarArr = m10VarArr;
                    ((m10[]) m10VarArr)[length] = rqVar;
                    ri2Var.b = null;
                    length++;
                }
                i++;
                m10VarArr = m10VarArr;
            }
            m10VarArr = m10VarArr;
        }
        return (m10[]) m10VarArr;
    }

    public final long o() {
        return Math.min(this.q, this.p);
    }

    public final Object[] p(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            li1.g("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.o = objArr2;
        if (objArr != null) {
            long jO = o();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jO;
                tz0.H(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean q(Object obj) {
        int i;
        boolean z;
        m10[] m10VarArrN = tz0.a;
        synchronized (this) {
            if (r(obj)) {
                m10VarArrN = n(m10VarArrN);
                z = true;
            } else {
                z = false;
            }
        }
        for (m10 m10Var : m10VarArrN) {
            if (m10Var != null) {
                m10Var.g(j23.a);
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    public final boolean r(Object obj) {
        int i;
        long jO;
        long j;
        int i2 = this.i;
        int i3 = this.l;
        if (i2 != 0) {
            int i4 = this.r;
            int i5 = this.m;
            if (i4 >= i5 && this.q <= this.p) {
                int iOrdinal = this.n.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        l(obj);
                        i = this.r + 1;
                        this.r = i;
                        if (i > i5) {
                            k();
                        }
                        jO = o() + ((long) this.r);
                        j = this.p;
                        if (((int) (jO - j)) > i3) {
                            u(1 + j, this.q, o() + ((long) this.r), o() + ((long) this.r) + ((long) this.s));
                        }
                    } else if (iOrdinal != 2) {
                        wg.n();
                    }
                }
                return false;
            }
            l(obj);
            i = this.r + 1;
            this.r = i;
            if (i > i5) {
                k();
            }
            jO = o() + ((long) this.r);
            j = this.p;
            if (((int) (jO - j)) > i3) {
                u(1 + j, this.q, o() + ((long) this.r), o() + ((long) this.r) + ((long) this.s));
            }
        } else if (i3 != 0) {
            l(obj);
            int i6 = this.r + 1;
            this.r = i6;
            if (i6 > i3) {
                k();
            }
            this.q = o() + ((long) this.r);
            return true;
        }
        return true;
    }

    public final long s(ri2 ri2Var) {
        long j = ri2Var.a;
        if (j < o() + ((long) this.r) || (this.m <= 0 && j <= o() && this.s != 0)) {
            return j;
        }
        return -1L;
    }

    public final Object t(ri2 ri2Var) {
        Object obj;
        m10[] m10VarArrV = tz0.a;
        synchronized (this) {
            long jS = s(ri2Var);
            if (jS < 0) {
                obj = tz0.i0;
            } else {
                long j = ri2Var.a;
                Object[] objArr = this.o;
                objArr.getClass();
                Object obj2 = objArr[((int) jS) & (objArr.length - 1)];
                if (obj2 instanceof oi2) {
                    obj2 = ((oi2) obj2).j;
                }
                ri2Var.a = jS + 1;
                Object obj3 = obj2;
                m10VarArrV = v(j);
                obj = obj3;
            }
        }
        for (m10 m10Var : m10VarArrV) {
            if (m10Var != null) {
                m10Var.g(j23.a);
            }
        }
        return obj;
    }

    public final void u(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jO = o(); jO < jMin; jO++) {
            Object[] objArr = this.o;
            objArr.getClass();
            tz0.H(objArr, jO, null);
        }
        this.p = j;
        this.q = j2;
        this.r = (int) (j3 - jMin);
        this.s = (int) (j4 - j3);
    }

    public final m10[] v(long j) {
        long j2;
        m10[] m10VarArr;
        m10[] m10VarArr2;
        v0[] v0VarArr;
        qf0 qf0Var = tz0.i0;
        m10[] m10VarArr3 = tz0.a;
        if (j <= this.q) {
            long jO = o();
            long j3 = ((long) this.r) + jO;
            int i = this.m;
            if (i == 0 && this.s > 0) {
                j3++;
            }
            int i2 = 0;
            if (this.i != 0 && (v0VarArr = this.h) != null) {
                for (v0 v0Var : v0VarArr) {
                    if (v0Var != null) {
                        long j4 = ((ri2) v0Var).a;
                        if (j4 >= 0 && j4 < j3) {
                            j3 = j4;
                        }
                    }
                }
            }
            if (j3 > this.q) {
                long jO2 = o() + ((long) this.r);
                int i3 = this.i;
                int iMin = this.s;
                if (i3 > 0) {
                    iMin = Math.min(iMin, i - ((int) (jO2 - j3)));
                }
                long j5 = ((long) this.s) + jO2;
                if (iMin > 0) {
                    Object[] objArr = this.o;
                    objArr.getClass();
                    m10[] m10VarArr4 = new m10[iMin];
                    long j6 = jO2;
                    while (true) {
                        if (jO2 >= j5) {
                            m10VarArr2 = m10VarArr4;
                            j2 = j3;
                            break;
                        }
                        m10VarArr2 = m10VarArr4;
                        Object obj = objArr[((int) jO2) & (objArr.length - 1)];
                        if (obj != qf0Var) {
                            obj.getClass();
                            oi2 oi2Var = (oi2) obj;
                            j2 = j3;
                            int i4 = i2 + 1;
                            m10VarArr2[i2] = oi2Var.k;
                            tz0.H(objArr, jO2, qf0Var);
                            tz0.H(objArr, j6, oi2Var.j);
                            j6++;
                            if (i4 >= iMin) {
                                break;
                            }
                            i2 = i4;
                        } else {
                            j2 = j3;
                        }
                        jO2++;
                        m10VarArr4 = m10VarArr2;
                        j3 = j2;
                    }
                    jO2 = j6;
                    m10VarArr = m10VarArr2;
                } else {
                    j2 = j3;
                    m10VarArr = m10VarArr3;
                }
                int i5 = (int) (jO2 - jO);
                long j7 = this.i == 0 ? jO2 : j2;
                long jMax = Math.max(this.p, jO2 - ((long) Math.min(this.l, i5)));
                if (i == 0 && jMax < j5) {
                    Object[] objArr2 = this.o;
                    objArr2.getClass();
                    if (uz0.g(objArr2[((int) jMax) & (objArr2.length - 1)], qf0Var)) {
                        jO2++;
                        jMax++;
                    }
                }
                u(jMax, j7, jO2, j5);
                i();
                return m10VarArr.length == 0 ? m10VarArr : n(m10VarArr);
            }
        }
        return m10VarArr3;
    }
}
