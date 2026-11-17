package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tl extends c92 implements zp0 {
    public final /* synthetic */ byte j;
    public boolean k;
    public /* synthetic */ m10 l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tl(Object obj, m10 m10Var, byte b) {
        super(2, m10Var);
        this.j = b;
        this.m = obj;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.j;
        j23 j23Var = j23.a;
        sq2 sq2Var = (sq2) obj;
        m10 m10Var = (m10) obj2;
        switch (b) {
            case 0:
                return ((tl) p(m10Var, sq2Var)).r(j23Var);
            default:
                ((tl) p(m10Var, sq2Var)).r(j23Var);
                return y20.h;
        }
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.j;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                tl tlVar = new tl((s02) obj2, m10Var, (byte) 0);
                tlVar.l = (m10) obj;
                return tlVar;
            default:
                tl tlVar2 = new tl((v10) obj2, m10Var, (byte) 1);
                tlVar2.l = (m10) obj;
                return tlVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0031 -> B:14:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:4:0x000d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.rk
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            byte r0 = r6.j
            java.lang.Object r1 = r6.m
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            y20 r4 = defpackage.y20.h
            r5 = 1
            switch(r0) {
                case 0: goto L4b;
                default: goto Ld;
            }
        Ld:
            boolean r0 = r6.k
            if (r0 == 0) goto L1f
            if (r0 != r5) goto L1b
            m10 r0 = r6.l
            sq2 r0 = (defpackage.sq2) r0
            defpackage.m02.y(r7)
            goto L35
        L1b:
            defpackage.li1.g(r3)
            goto L34
        L1f:
            defpackage.m02.y(r7)
            m10 r7 = r6.l
            sq2 r7 = (defpackage.sq2) r7
            r0 = r7
        L27:
            r6.l = r0
            r6.k = r5
            s02 r7 = defpackage.s02.h
            java.lang.Object r7 = r0.a(r7, r6)
            if (r7 != r4) goto L35
            r2 = r4
        L34:
            return r2
        L35:
            q02 r7 = (defpackage.q02) r7
            r2 = r1
            v10 r2 = (defpackage.v10) r2
            boolean r7 = defpackage.jg2.a(r7)
            r7 = r7 ^ r5
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            p81 r2 = r2.i
            lu1 r2 = r2.q
            r2.setValue(r7)
            goto L27
        L4b:
            boolean r0 = r6.k
            if (r0 == 0) goto L5a
            if (r0 != r5) goto L55
            defpackage.m02.y(r7)
            goto L6c
        L55:
            defpackage.li1.g(r3)
            r7 = r2
            goto L6c
        L5a:
            defpackage.m02.y(r7)
            m10 r7 = r6.l
            sq2 r7 = (defpackage.sq2) r7
            s02 r1 = (defpackage.s02) r1
            r6.k = r5
            java.lang.Object r7 = defpackage.ns2.h(r7, r1, r6)
            if (r7 != r4) goto L6c
            r7 = r4
        L6c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl.r(java.lang.Object):java.lang.Object");
    }
}
