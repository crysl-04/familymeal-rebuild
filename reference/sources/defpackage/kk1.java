package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kk1 extends mq2 implements zp0 {
    public ok1 l;
    public Object m;
    public s70 n;
    public lk1 o;
    public byte p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ek1 r;
    public final /* synthetic */ lk1 s;
    public final /* synthetic */ zp0 t;
    public final /* synthetic */ s70 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk1(ek1 ek1Var, lk1 lk1Var, zp0 zp0Var, s70 s70Var, m10 m10Var) {
        super(2, m10Var);
        this.r = ek1Var;
        this.s = lk1Var;
        this.t = zp0Var;
        this.u = s70Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((kk1) p((m10) obj2, (x20) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        kk1 kk1Var = new kk1(this.r, this.s, this.t, this.u, m10Var);
        kk1Var.q = obj;
        return kk1Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // defpackage.rk
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.p
            r1 = 2
            r2 = 1
            r3 = 0
            y20 r4 = defpackage.y20.h
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1f
            java.lang.Object r0 = r8.m
            lk1 r0 = (defpackage.lk1) r0
            ok1 r1 = r8.l
            java.lang.Object r8 = r8.q
            gk1 r8 = (defpackage.gk1) r8
            defpackage.m02.y(r9)     // Catch: java.lang.Throwable -> L1c
            goto L8f
        L1c:
            r9 = move-exception
            goto La7
        L1f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r8)
            return r3
        L25:
            lk1 r0 = r8.o
            s70 r2 = r8.n
            java.lang.Object r5 = r8.m
            zp0 r5 = (defpackage.zp0) r5
            ok1 r6 = r8.l
            java.lang.Object r7 = r8.q
            gk1 r7 = (defpackage.gk1) r7
            defpackage.m02.y(r9)
            r9 = r6
            r6 = r5
            r5 = r9
            r9 = r0
            r0 = r7
            goto L77
        L3c:
            defpackage.m02.y(r9)
            java.lang.Object r9 = r8.q
            x20 r9 = (defpackage.x20) r9
            gk1 r0 = new gk1
            o20 r9 = r9.f()
            c5 r5 = defpackage.c5.Z
            m20 r9 = r9.m(r5)
            r9.getClass()
            s01 r9 = (defpackage.s01) r9
            ek1 r5 = r8.r
            r0.<init>(r5, r9)
            lk1 r9 = r8.s
            r9.a(r0)
            ok1 r5 = r9.b
            r8.q = r0
            r8.l = r5
            zp0 r6 = r8.t
            r8.m = r6
            s70 r7 = r8.u
            r8.n = r7
            r8.o = r9
            r8.p = r2
            java.lang.Object r2 = r5.d(r8)
            if (r2 == r4) goto L89
            r2 = r7
        L77:
            r8.q = r0     // Catch: java.lang.Throwable -> La1
            r8.l = r5     // Catch: java.lang.Throwable -> La1
            r8.m = r9     // Catch: java.lang.Throwable -> La1
            r8.n = r3     // Catch: java.lang.Throwable -> La1
            r8.o = r3     // Catch: java.lang.Throwable -> La1
            r8.p = r1     // Catch: java.lang.Throwable -> La1
            java.lang.Object r8 = r6.f(r2, r8)     // Catch: java.lang.Throwable -> La1
            if (r8 != r4) goto L8a
        L89:
            return r4
        L8a:
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        L8f:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> Lb6
        L91:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> Lb6
            if (r2 != 0) goto L9d
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> Lb6
            if (r2 == r8) goto L91
        L9d:
            r1.f(r3)
            return r9
        La1:
            r8 = move-exception
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        La7:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> Lb6
        La9:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> Lb6
            if (r2 != 0) goto Lb5
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> Lb6
            if (r2 == r8) goto La9
        Lb5:
            throw r9     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r8 = move-exception
            r1.f(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kk1.r(java.lang.Object):java.lang.Object");
    }
}
