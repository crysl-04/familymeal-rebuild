package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bl0 extends mq2 implements aq0 {
    public byte l;
    public /* synthetic */ qk0 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ zp0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl0(zp0 zp0Var, m10 m10Var) {
        super(3, m10Var);
        this.o = zp0Var;
    }

    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        bl0 bl0Var = new bl0(this.o, (m10) obj3);
        bl0Var.m = (qk0) obj;
        bl0Var.n = obj2;
        return bl0Var.r(j23.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r0.m(r6, r5) == r4) goto L14;
     */
    @Override // defpackage.rk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r6) {
        /*
            r5 = this;
            byte r0 = r5.l
            r1 = 0
            r2 = 2
            r3 = 1
            y20 r4 = defpackage.y20.h
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.m02.y(r6)
            goto L3b
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r5)
            return r1
        L17:
            qk0 r0 = r5.m
            defpackage.m02.y(r6)
            goto L30
        L1d:
            defpackage.m02.y(r6)
            qk0 r0 = r5.m
            java.lang.Object r6 = r5.n
            r5.m = r0
            r5.l = r3
            zp0 r3 = r5.o
            java.lang.Object r6 = r3.f(r6, r5)
            if (r6 == r4) goto L3a
        L30:
            r5.m = r1
            r5.l = r2
            java.lang.Object r5 = r0.m(r6, r5)
            if (r5 != r4) goto L3b
        L3a:
            return r4
        L3b:
            j23 r5 = defpackage.j23.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl0.r(java.lang.Object):java.lang.Object");
    }
}
