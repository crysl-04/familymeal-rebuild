package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qq2 extends mq2 implements zp0 {
    public byte l;
    public final /* synthetic */ long m;
    public final /* synthetic */ sq2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq2(long j, sq2 sq2Var, m10 m10Var) {
        super(2, m10Var);
        this.m = j;
        this.n = sq2Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((qq2) p((m10) obj2, (x20) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        return new qq2(this.m, this.n, m10Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (defpackage.lt.r(8, r10) == r7) goto L14;
     */
    @Override // defpackage.rk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r11) {
        /*
            r10 = this;
            byte r0 = r10.l
            r1 = 8
            long r3 = r10.m
            r5 = 2
            r6 = 1
            y20 r7 = defpackage.y20.h
            if (r0 == 0) goto L1f
            if (r0 == r6) goto L1b
            if (r0 != r5) goto L14
            defpackage.m02.y(r11)
            goto L35
        L14:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r10)
            r10 = 0
            return r10
        L1b:
            defpackage.m02.y(r11)
            goto L2c
        L1f:
            defpackage.m02.y(r11)
            long r8 = r3 - r1
            r10.l = r6
            java.lang.Object r11 = defpackage.lt.r(r8, r10)
            if (r11 == r7) goto L34
        L2c:
            r10.l = r5
            java.lang.Object r11 = defpackage.lt.r(r1, r10)
            if (r11 != r7) goto L35
        L34:
            return r7
        L35:
            sq2 r10 = r10.n
            rq r10 = r10.j
            if (r10 == 0) goto L48
            t02 r11 = new t02
            r11.<init>(r3)
            d92 r0 = new d92
            r0.<init>(r11)
            r10.g(r0)
        L48:
            j23 r10 = defpackage.j23.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qq2.r(java.lang.Object):java.lang.Object");
    }
}
