package defpackage;

import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ew1 extends mq2 implements vp0 {
    public h4 l;
    public byte m;
    public final /* synthetic */ tw1 n;
    public final /* synthetic */ String o;
    public final /* synthetic */ LocalDate p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew1(tw1 tw1Var, String str, LocalDate localDate, m10 m10Var) {
        super(1, m10Var);
        this.n = tw1Var;
        this.o = str;
        this.p = localDate;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        String str = this.o;
        LocalDate localDate = this.p;
        return new ew1(this.n, str, localDate, (m10) obj).r(j23.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (r2 == r5) goto L24;
     */
    @Override // defpackage.rk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            byte r1 = r0.m
            java.time.LocalDate r11 = r0.p
            java.lang.String r2 = r0.o
            r13 = 3
            r3 = 2
            r4 = 1
            r14 = 0
            tw1 r15 = r0.n
            y20 r5 = defpackage.y20.h
            if (r1 == 0) goto L30
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L22
            if (r1 != r13) goto L1c
            defpackage.m02.y(r17)
            return r17
        L1c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r0)
            return r14
        L22:
            h4 r1 = r0.l
            defpackage.m02.y(r17)
            r2 = r17
            goto L64
        L2a:
            defpackage.m02.y(r17)
            r1 = r17
            goto L3b
        L30:
            defpackage.m02.y(r17)
            r0.m = r4
            java.lang.Object r1 = r15.a(r2, r11, r0)
            if (r1 == r5) goto L62
        L3b:
            boolean r4 = r1 instanceof defpackage.h4
            if (r4 == 0) goto L42
            h4 r1 = (defpackage.h4) r1
            goto L43
        L42:
            r1 = r14
        L43:
            if (r1 != 0) goto L58
            bw1 r0 = new bw1
            m32 r1 = new m32
            java.lang.String r2 = "adjust"
            java.lang.String r3 = "当前没有可采纳的调整建议"
            r1.<init>(r2, r3)
            java.util.List r1 = defpackage.lt.P(r1)
            r0.<init>(r1)
            return r0
        L58:
            r0.l = r1
            r0.m = r3
            java.lang.Object r2 = r15.d(r2, r0)
            if (r2 != r5) goto L64
        L62:
            r1 = r5
            goto L8a
        L64:
            r2.getClass()
            dy1 r2 = (defpackage.dy1) r2
            double r9 = r1.b
            r12 = 4095(0xfff, float:5.738E-42)
            r3 = 0
            r4 = 0
            r1 = r5
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            dy1 r2 = defpackage.dy1.a(r2, r3, r4, r5, r6, r7, r8, r9, r11, r12)
            r0.l = r14
            r0.m = r13
            com.familymeal.app.data.db.AppDatabase r3 = r15.a
            nw1 r4 = new nw1
            r5 = 0
            r4.<init>(r15, r2, r5, r14)
            java.lang.Object r0 = defpackage.ia2.C(r3, r4, r0)
            if (r0 != r1) goto L8b
        L8a:
            return r1
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ew1.r(java.lang.Object):java.lang.Object");
    }
}
