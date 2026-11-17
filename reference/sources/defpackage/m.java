package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class m extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public byte m;
    public final /* synthetic */ ui1 n;
    public final /* synthetic */ m22 o;
    public final /* synthetic */ lu p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(ui1 ui1Var, m22 m22Var, lu luVar, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = ui1Var;
        this.o = m22Var;
        this.p = luVar;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        x20 x20Var = (x20) obj;
        m10 m10Var = (m10) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((m) p(m10Var, x20Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        switch (this.l) {
            case 0:
                return new m(this.n, this.o, this.p, m10Var, (byte) 0);
            default:
                return new m(this.n, this.o, this.p, m10Var, (byte) 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r3.b(r9, r10) == r6) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (r3.b(r9, r10) == r6) goto L29;
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
            j23 r1 = defpackage.j23.a
            lu r2 = r10.p
            ui1 r3 = r10.n
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            y20 r6 = defpackage.y20.h
            r7 = 1
            r8 = 2
            m22 r9 = r10.o
            switch(r0) {
                case 0: goto L43;
                default: goto L14;
            }
        L14:
            byte r0 = r10.m
            if (r0 == 0) goto L29
            if (r0 == r7) goto L25
            if (r0 != r8) goto L20
            defpackage.m02.y(r11)
            goto L40
        L20:
            defpackage.li1.g(r5)
            r1 = r4
            goto L42
        L25:
            defpackage.m02.y(r11)
            goto L36
        L29:
            defpackage.m02.y(r11)
            long r4 = defpackage.mu.a
            r10.m = r7
            java.lang.Object r11 = defpackage.lt.r(r4, r10)
            if (r11 == r6) goto L3e
        L36:
            r10.m = r8
            java.lang.Object r10 = r3.b(r9, r10)
            if (r10 != r6) goto L40
        L3e:
            r1 = r6
            goto L42
        L40:
            r2.J = r9
        L42:
            return r1
        L43:
            byte r0 = r10.m
            if (r0 == 0) goto L58
            if (r0 == r7) goto L54
            if (r0 != r8) goto L4f
            defpackage.m02.y(r11)
            goto L6f
        L4f:
            defpackage.li1.g(r5)
            r1 = r4
            goto L71
        L54:
            defpackage.m02.y(r11)
            goto L65
        L58:
            defpackage.m02.y(r11)
            long r4 = defpackage.mu.a
            r10.m = r7
            java.lang.Object r11 = defpackage.lt.r(r4, r10)
            if (r11 == r6) goto L6d
        L65:
            r10.m = r8
            java.lang.Object r10 = r3.b(r9, r10)
            if (r10 != r6) goto L6f
        L6d:
            r1 = r6
            goto L71
        L6f:
            r2.N = r9
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m.r(java.lang.Object):java.lang.Object");
    }
}
