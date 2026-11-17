package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class o03 extends mq2 implements zp0 {
    public np1[] l;
    public p03 m;
    public wu1 n;
    public int o;
    public int p;
    public int q;
    public byte r;
    public final /* synthetic */ np1[] s;
    public final /* synthetic */ p03 t;
    public final /* synthetic */ wu1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o03(np1[] np1VarArr, p03 p03Var, wu1 wu1Var, m10 m10Var) {
        super(2, m10Var);
        this.s = np1VarArr;
        this.t = p03Var;
        this.u = wu1Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((o03) p((m10) obj2, (ru1) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        return new o03(this.s, this.t, this.u, m10Var);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0072 -> B:27:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.rk
    public final java.lang.Object r(java.lang.Object r12) {
        /*
            r11 = this;
            byte r0 = r11.r
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L21
            if (r0 == r3) goto L11
            if (r0 == r2) goto L11
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r11)
            return r1
        L11:
            int r0 = r11.q
            int r4 = r11.p
            int r5 = r11.o
            wu1 r6 = r11.n
            p03 r7 = r11.m
            np1[] r8 = r11.l
            defpackage.m02.y(r12)
            goto L70
        L21:
            defpackage.m02.y(r12)
            np1[] r12 = r11.s
            int r0 = r12.length
            r4 = 0
            p03 r5 = r11.t
            wu1 r6 = r11.u
            r8 = r12
            r12 = r4
            r7 = r5
        L2f:
            if (r4 >= r0) goto L75
            r5 = r8[r4]
            int r9 = r12 + 1
            int r5 = r5.ordinal()
            if (r5 == 0) goto L72
            y20 r10 = defpackage.y20.h
            if (r5 == r3) goto L5a
            if (r5 != r2) goto L56
            r11.l = r8
            r11.m = r7
            r11.n = r6
            r11.o = r9
            r11.p = r4
            r11.q = r0
            r11.r = r2
            java.lang.Object r12 = r7.e(r6, r12, r11)
            if (r12 != r10) goto L6f
            goto L6e
        L56:
            defpackage.wg.n()
            return r1
        L5a:
            r11.l = r8
            r11.m = r7
            r11.n = r6
            r11.o = r9
            r11.p = r4
            r11.q = r0
            r11.r = r3
            java.lang.Object r12 = r7.d(r6, r12, r11)
            if (r12 != r10) goto L6f
        L6e:
            return r10
        L6f:
            r5 = r9
        L70:
            r12 = r5
            goto L73
        L72:
            r12 = r9
        L73:
            int r4 = r4 + r3
            goto L2f
        L75:
            j23 r11 = defpackage.j23.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o03.r(java.lang.Object):java.lang.Object");
    }
}
