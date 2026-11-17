package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yl extends c92 implements zp0 {
    public s02 j;
    public boolean k;
    public /* synthetic */ m10 l;
    public final /* synthetic */ x20 m;
    public final /* synthetic */ ry2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl(x20 x20Var, ry2 ry2Var, m10 m10Var) {
        super(2, m10Var);
        this.m = x20Var;
        this.n = ry2Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        ((yl) p((m10) obj2, (sq2) obj)).r(j23.a);
        return y20.h;
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        yl ylVar = new yl(this.m, this.n, m10Var);
        ylVar.l = (m10) obj;
        return ylVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:12:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.rk
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = r7.k
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            if (r0 != r2) goto L12
            s02 r0 = r7.j
            m10 r3 = r7.l
            sq2 r3 = (defpackage.sq2) r3
            defpackage.m02.y(r8)
            goto L31
        L12:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r7)
            return r1
        L18:
            defpackage.m02.y(r8)
            m10 r8 = r7.l
            sq2 r8 = (defpackage.sq2) r8
            s02 r0 = defpackage.s02.i
            r3 = r8
        L22:
            r7.l = r3
            r7.j = r0
            r7.k = r2
            java.lang.Object r8 = r3.a(r0, r7)
            y20 r4 = defpackage.y20.h
            if (r8 != r4) goto L31
            return r4
        L31:
            q02 r8 = (defpackage.q02) r8
            java.util.List r4 = r8.a
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            z02 r4 = (defpackage.z02) r4
            byte r4 = r4.i
            r5 = 2
            if (r4 != r5) goto L22
            byte r8 = r8.f
            r4 = 4
            ry2 r6 = r7.n
            if (r8 != r4) goto L54
            sl r8 = new sl
            r8.<init>(r6, r1, r5)
            r4 = 3
            x20 r5 = r7.m
            defpackage.ie1.p(r5, r1, r8, r4)
            goto L22
        L54:
            r4 = 5
            if (r8 != r4) goto L22
            r6.a()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl.r(java.lang.Object):java.lang.Object");
    }
}
