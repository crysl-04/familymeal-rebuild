package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class io1 extends c92 implements zp0 {
    public Object j;
    public boolean k;
    public /* synthetic */ m10 l;
    public final /* synthetic */ kp0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io1(kp0 kp0Var, m10 m10Var) {
        super(2, m10Var);
        this.m = kp0Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((io1) p((m10) obj2, (oh2) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        io1 io1Var = new io1(this.m, m10Var);
        io1Var.l = (m10) obj;
        return io1Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0034 -> B:14:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:13:0x0034
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.rk
    public final java.lang.Object r(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r4.k
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            if (r0 != r2) goto L12
            java.lang.Object r0 = r4.j
            m10 r3 = r4.l
            oh2 r3 = (defpackage.oh2) r3
            defpackage.m02.y(r5)
            goto L35
        L12:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r4)
            return r1
        L18:
            defpackage.m02.y(r5)
            m10 r5 = r4.l
            oh2 r5 = (defpackage.oh2) r5
            r3 = r5
        L20:
            kp0 r5 = r4.m
            java.lang.Object r5 = r5.a()
            if (r5 == 0) goto L34
            r4.l = r3
            r4.j = r5
            r4.k = r2
            r3.b(r5, r4)
            y20 r4 = defpackage.y20.h
            return r4
        L34:
            r0 = r1
        L35:
            if (r0 != 0) goto L20
            j23 r4 = defpackage.j23.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io1.r(java.lang.Object):java.lang.Object");
    }
}
