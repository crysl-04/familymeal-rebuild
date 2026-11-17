package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yk2 extends c92 implements zp0 {
    public long[] j;
    public int k;
    public int l;
    public byte m;
    public /* synthetic */ m10 n;
    public final /* synthetic */ zk2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk2(zk2 zk2Var, m10 m10Var) {
        super(2, m10Var);
        this.o = zk2Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((yk2) p((m10) obj2, (oh2) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        yk2 yk2Var = new yk2(this.o, m10Var);
        yk2Var.n = (m10) obj;
        return yk2Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0077  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x009d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007d -> B:26:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bb -> B:37:0x00bc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:27:0x0094
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.rk
    public final java.lang.Object r(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            zk2 r1 = r0.o
            long r2 = r1.h
            long r4 = r1.j
            long r6 = r1.i
            byte r8 = r0.m
            r9 = 0
            r12 = 64
            r13 = 3
            r14 = 2
            r16 = 0
            r18 = 1
            r10 = 1
            y20 r11 = defpackage.y20.h
            if (r8 == 0) goto L4a
            if (r8 == r10) goto L3b
            if (r8 == r14) goto L31
            if (r8 != r13) goto L2b
            int r1 = r0.k
            m10 r6 = r0.n
            oh2 r6 = (defpackage.oh2) r6
            defpackage.m02.y(r23)
            goto Lbc
        L2b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r0)
            return r9
        L31:
            int r1 = r0.k
            m10 r8 = r0.n
            oh2 r8 = (defpackage.oh2) r8
            defpackage.m02.y(r23)
            goto L92
        L3b:
            int r1 = r0.l
            int r8 = r0.k
            long[] r15 = r0.j
            m10 r13 = r0.n
            oh2 r13 = (defpackage.oh2) r13
            defpackage.m02.y(r23)
            int r8 = r8 + r10
            goto L58
        L4a:
            defpackage.m02.y(r23)
            m10 r8 = r0.n
            r13 = r8
            oh2 r13 = (defpackage.oh2) r13
            long[] r15 = r1.k
            if (r15 == 0) goto L6f
            int r1 = r15.length
            r8 = 0
        L58:
            if (r8 >= r1) goto L6f
            r2 = r15[r8]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            r0.n = r13
            r0.j = r15
            r0.k = r8
            r0.l = r1
            r0.m = r10
            r13.b(r4, r0)
            return r11
        L6f:
            int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r1 == 0) goto L95
            r8 = r13
            r1 = 0
        L75:
            if (r1 >= r12) goto L94
            long r20 = r18 << r1
            long r20 = r6 & r20
            int r13 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r13 == 0) goto L92
            long r2 = (long) r1
            long r4 = r4 + r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r0.n = r8
            r0.j = r9
            r0.k = r1
            r0.m = r14
            r8.b(r2, r0)
            return r11
        L92:
            int r1 = r1 + r10
            goto L75
        L94:
            r13 = r8
        L95:
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 == 0) goto Lbf
            r6 = r13
            r15 = 0
        L9b:
            if (r15 >= r12) goto Lbf
            long r7 = r18 << r15
            long r7 = r7 & r2
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 == 0) goto Lbb
            long r1 = (long) r15
            long r4 = r4 + r1
            r1 = 64
            long r4 = r4 + r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r0.n = r6
            r0.j = r9
            r0.k = r15
            r7 = 3
            r0.m = r7
            r6.b(r1, r0)
            return r11
        Lbb:
            r1 = r15
        Lbc:
            int r15 = r1 + 1
            goto L9b
        Lbf:
            j23 r0 = defpackage.j23.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yk2.r(java.lang.Object):java.lang.Object");
    }
}
