package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dv2 extends mq2 implements vp0 {
    public byte l;
    public final /* synthetic */ kv2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv2(kv2 kv2Var, m10 m10Var) {
        super(1, m10Var);
        this.m = kv2Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        return new dv2(this.m, (m10) obj).r(j23.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r13 == r6) goto L25;
     */
    @Override // defpackage.rk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r14) {
        /*
            r13 = this;
            byte r0 = r13.l
            r1 = 0
            j23 r2 = defpackage.j23.a
            r3 = 2
            r4 = 1
            kv2 r5 = r13.m
            y20 r6 = defpackage.y20.h
            if (r0 == 0) goto L1f
            if (r0 == r4) goto L1b
            if (r0 != r3) goto L15
            defpackage.m02.y(r14)
            goto L66
        L15:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r13)
            return r1
        L1b:
            defpackage.m02.y(r14)
            goto L2a
        L1f:
            defpackage.m02.y(r14)
            r13.l = r4
            java.lang.Object r14 = r5.t(r13)
            if (r14 == r6) goto L65
        L2a:
            wt1 r14 = r5.f()
            if (r14 == 0) goto L66
            java.lang.Object r0 = r14.h
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r14 = r14.i
            qw2 r14 = (defpackage.qw2) r14
            long r10 = r14.a
            d02 r8 = r5.i
            if (r8 == 0) goto L66
            r13.l = r3
            int r14 = r9.length()
            if (r14 == 0) goto L4d
            boolean r14 = defpackage.qw2.c(r10)
            if (r14 == 0) goto L4f
        L4d:
            r13 = r2
            goto L60
        L4f:
            b02 r7 = new b02
            r12 = 0
            r7.<init>(r8, r9, r10, r12)
            o20 r14 = r8.a
            hd0 r0 = new hd0
            r0.<init>(r8, r7, r1)
            java.lang.Object r13 = defpackage.ie1.G(r14, r0, r13)
        L60:
            if (r13 == r6) goto L63
            r13 = r2
        L63:
            if (r13 != r6) goto L66
        L65:
            return r6
        L66:
            r5.A = r4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dv2.r(java.lang.Object):java.lang.Object");
    }
}
