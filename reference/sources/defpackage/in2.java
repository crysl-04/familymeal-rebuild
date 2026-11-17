package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class in2 extends mq2 implements aq0 {
    public byte l;
    public /* synthetic */ qk0 m;
    public /* synthetic */ int n;
    public final /* synthetic */ jn2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in2(jn2 jn2Var, m10 m10Var) {
        super(3, m10Var);
        this.o = jn2Var;
    }

    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        in2 in2Var = new in2(this.o, (m10) obj3);
        in2Var.m = (qk0) obj;
        in2Var.n = iIntValue;
        return in2Var.r(j23.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e A[PHI: r0
  0x005e: PHI (r0v3 qk0) = (r0v2 qk0), (r0v6 qk0) binds: [B:23:0x005c, B:12:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r0.m(defpackage.ti2.h, r8) == r7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r0.m(defpackage.ti2.j, r8) == r7) goto L28;
     */
    @Override // defpackage.rk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.l
            r1 = 0
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            y20 r7 = defpackage.y20.h
            if (r0 == 0) goto L32
            if (r0 == r6) goto L2e
            if (r0 == r5) goto L28
            if (r0 == r4) goto L22
            if (r0 == r3) goto L1c
            if (r0 == r2) goto L2e
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r8)
            return r1
        L1c:
            qk0 r0 = r8.m
            defpackage.m02.y(r9)
            goto L6d
        L22:
            qk0 r0 = r8.m
            defpackage.m02.y(r9)
            goto L5e
        L28:
            qk0 r0 = r8.m
            defpackage.m02.y(r9)
            goto L52
        L2e:
            defpackage.m02.y(r9)
            goto L7a
        L32:
            defpackage.m02.y(r9)
            qk0 r0 = r8.m
            int r9 = r8.n
            if (r9 <= 0) goto L46
            r8.l = r6
            ti2 r9 = defpackage.ti2.h
            java.lang.Object r8 = r0.m(r9, r8)
            if (r8 != r7) goto L7a
            goto L79
        L46:
            r8.m = r0
            r8.l = r5
            r5 = 0
            java.lang.Object r9 = defpackage.lt.r(r5, r8)
            if (r9 == r7) goto L79
        L52:
            r8.m = r0
            r8.l = r4
            ti2 r9 = defpackage.ti2.i
            java.lang.Object r9 = r0.m(r9, r8)
            if (r9 == r7) goto L79
        L5e:
            r8.m = r0
            r8.l = r3
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r9 = defpackage.lt.r(r3, r8)
            if (r9 == r7) goto L79
        L6d:
            r8.m = r1
            r8.l = r2
            ti2 r9 = defpackage.ti2.j
            java.lang.Object r8 = r0.m(r9, r8)
            if (r8 != r7) goto L7a
        L79:
            return r7
        L7a:
            j23 r8 = defpackage.j23.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in2.r(java.lang.Object):java.lang.Object");
    }
}
