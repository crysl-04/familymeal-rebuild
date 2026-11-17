package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class k extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public byte m;
    public final /* synthetic */ long n;
    public Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kt2 kt2Var, long j, ot2 ot2Var, jt2 jt2Var, m10 m10Var) {
        super(2, m10Var);
        this.l = (byte) 1;
        this.o = kt2Var;
        this.n = j;
        this.p = ot2Var;
        this.q = jt2Var;
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
            case 1:
                break;
        }
        return ((k) p(m10Var, x20Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        Object obj2 = this.q;
        Object obj3 = this.p;
        switch (b) {
            case 0:
                return new k(obj3, this.n, (ui1) obj2, m10Var, (byte) 0);
            case 1:
                return new k((kt2) this.o, this.n, (ot2) obj3, (jt2) obj2, m10Var);
            default:
                return new k(obj3, this.n, (ui1) obj2, m10Var, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r9.b(r0, r12) != r5) goto L17;
     */
    @Override // defpackage.rk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, long j, ui1 ui1Var, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.p = obj;
        this.n = j;
        this.q = ui1Var;
    }
}
