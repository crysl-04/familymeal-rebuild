package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ig2 extends c92 implements zp0 {
    public final /* synthetic */ byte j = 0;
    public long k;
    public boolean l;
    public /* synthetic */ m10 m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig2(long j, w72 w72Var, m10 m10Var) {
        super(2, m10Var);
        this.k = j;
        this.n = w72Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.j;
        j23 j23Var = j23.a;
        sq2 sq2Var = (sq2) obj;
        m10 m10Var = (m10) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((ig2) p(m10Var, sq2Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.j;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                ig2 ig2Var = new ig2(this.k, (w72) obj2, m10Var);
                ig2Var.m = (m10) obj;
                return ig2Var;
            default:
                ig2 ig2Var2 = new ig2((z02) obj2, m10Var);
                ig2Var2.m = (m10) obj;
                return ig2Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0043 -> B:13:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:12:0x0045
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.rk
    public final java.lang.Object r(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.j
            java.lang.Object r1 = r9.n
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            y20 r4 = defpackage.y20.h
            r5 = 1
            switch(r0) {
                case 0: goto L51;
                default: goto Ld;
            }
        Ld:
            boolean r0 = r9.l
            if (r0 == 0) goto L21
            if (r0 != r5) goto L1d
            long r0 = r9.k
            m10 r2 = r9.m
            sq2 r2 = (defpackage.sq2) r2
            defpackage.m02.y(r10)
            goto L47
        L1d:
            defpackage.li1.g(r3)
            goto L50
        L21:
            defpackage.m02.y(r10)
            m10 r10 = r9.m
            sq2 r10 = (defpackage.sq2) r10
            z02 r1 = (defpackage.z02) r1
            long r0 = r1.b
            v43 r2 = r10.i()
            r2.getClass()
            r2 = 40
            long r2 = r2 + r0
            r0 = r2
            r2 = r10
        L38:
            r9.m = r2
            r9.k = r0
            r9.l = r5
            r10 = 3
            java.lang.Object r10 = defpackage.ns2.b(r2, r9, r10)
            if (r10 != r4) goto L47
            r2 = r4
            goto L50
        L47:
            z02 r10 = (defpackage.z02) r10
            long r6 = r10.b
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 < 0) goto L38
            r2 = r10
        L50:
            return r2
        L51:
            w72 r1 = (defpackage.w72) r1
            boolean r0 = r9.l
            if (r0 == 0) goto L65
            if (r0 != r5) goto L61
            m10 r9 = r9.m
            sq2 r9 = (defpackage.sq2) r9
            defpackage.m02.y(r10)
            goto L84
        L61:
            defpackage.li1.g(r3)
            goto Lb6
        L65:
            defpackage.m02.y(r10)
            m10 r10 = r9.m
            sq2 r10 = (defpackage.sq2) r10
            long r2 = r9.k
            s r0 = new s
            r6 = 21
            r0.<init>(r1, r6)
            r9.m = r10
            r9.l = r5
            java.lang.Object r9 = defpackage.ys.h(r10, r2, r0, r9)
            if (r9 != r4) goto L81
            r2 = r4
            goto Lb6
        L81:
            r8 = r10
            r10 = r9
            r9 = r8
        L84:
            z02 r10 = (defpackage.z02) r10
            if (r10 == 0) goto L9c
            long r0 = r1.h
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L9c
            ac0 r2 = defpackage.ac0.i
            goto Lb6
        L9c:
            tq2 r9 = r9.l
            q02 r9 = r9.z
            java.util.List r9 = r9.a
            java.lang.Object r9 = defpackage.dv.x0(r9)
            z02 r9 = (defpackage.z02) r9
            boolean r10 = defpackage.r02.m(r9)
            if (r10 == 0) goto Lb4
            r9.a()
            ac0 r2 = defpackage.ac0.h
            goto Lb6
        Lb4:
            ac0 r2 = defpackage.ac0.k
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ig2.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig2(z02 z02Var, m10 m10Var) {
        super(2, m10Var);
        this.n = z02Var;
    }
}
