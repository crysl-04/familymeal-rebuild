package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zc0 extends c92 implements zp0 {
    public final /* synthetic */ byte j = 0;
    public byte k;
    public /* synthetic */ m10 l;
    public Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ hq0 o;
    public final /* synthetic */ hq0 p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc0(sz szVar, kw0 kw0Var, s sVar, qc1 qc1Var, p pVar, m10 m10Var) {
        super(2, m10Var);
        this.m = szVar;
        this.n = kw0Var;
        this.o = sVar;
        this.p = qc1Var;
        this.q = pVar;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.j;
        j23 j23Var = j23.a;
        sq2 sq2Var = (sq2) obj;
        m10 m10Var = (m10) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((zc0) p(m10Var, sq2Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.j;
        Object obj2 = this.q;
        hq0 hq0Var = this.p;
        hq0 hq0Var2 = this.o;
        Object obj3 = this.n;
        switch (b) {
            case 0:
                zc0 zc0Var = new zc0((sz) this.m, (kw0) obj3, (s) hq0Var2, (qc1) hq0Var, (p) obj2, m10Var);
                zc0Var.l = (m10) obj;
                return zc0Var;
            default:
                zc0 zc0Var2 = new zc0((x20) obj3, (vu2) hq0Var2, (cb) hq0Var, (k22) obj2, m10Var);
                zc0Var2.l = (m10) obj;
                return zc0Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (r3 == r9) goto L19;
     */
    @Override // defpackage.rk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zc0.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc0(x20 x20Var, vu2 vu2Var, cb cbVar, k22 k22Var, m10 m10Var) {
        super(2, m10Var);
        this.n = x20Var;
        this.o = vu2Var;
        this.p = cbVar;
        this.q = k22Var;
    }
}
