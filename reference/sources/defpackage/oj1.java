package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class oj1 extends c92 implements zp0 {
    public lr0 j;
    public pj1 k;
    public long[] l;
    public int m;
    public int n;
    public int o;
    public int p;
    public long q;
    public boolean r;
    public /* synthetic */ m10 s;
    public final /* synthetic */ pj1 t;
    public final /* synthetic */ lr0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj1(pj1 pj1Var, lr0 lr0Var, m10 m10Var) {
        super(2, m10Var);
        this.t = pj1Var;
        this.u = lr0Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((oj1) p((m10) obj2, (oh2) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        oj1 oj1Var = new oj1(this.t, this.u, m10Var);
        oj1Var.s = (m10) obj;
        return oj1Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0099  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x0094). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.rk
    public final java.lang.Object r(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            boolean r1 = r0.r
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 != r4) goto L25
            int r1 = r0.p
            int r5 = r0.o
            long r6 = r0.q
            int r8 = r0.n
            int r9 = r0.m
            long[] r10 = r0.l
            pj1 r11 = r0.k
            lr0 r12 = r0.j
            m10 r13 = r0.s
            oh2 r13 = (defpackage.oh2) r13
            defpackage.m02.y(r21)
            goto L94
        L25:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r0)
            r0 = 0
            return r0
        L2c:
            defpackage.m02.y(r21)
            m10 r1 = r0.s
            oh2 r1 = (defpackage.oh2) r1
            pj1 r5 = r0.t
            nj1 r6 = r5.i
            long[] r6 = r6.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La4
            lr0 r8 = r0.u
            r9 = r2
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L9f
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L64:
            if (r1 >= r5) goto L97
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L94
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.i = r2
            nj1 r3 = r11.i
            java.lang.Object[] r3 = r3.b
            r2 = r3[r2]
            r0.s = r13
            r0.j = r12
            r0.k = r11
            r0.l = r10
            r0.m = r9
            r0.n = r8
            r0.q = r6
            r0.o = r5
            r0.p = r1
            r0.r = r4
            r13.b(r2, r0)
            y20 r0 = defpackage.y20.h
            return r0
        L94:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L64
        L97:
            if (r5 != r3) goto La4
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        L9f:
            if (r9 == r7) goto La4
            int r9 = r9 + 1
            goto L41
        La4:
            j23 r0 = defpackage.j23.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj1.r(java.lang.Object):java.lang.Object");
    }
}
