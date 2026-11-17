package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pp extends mq2 implements zp0 {
    public final /* synthetic */ byte l = 1;
    public byte m;
    public final /* synthetic */ tb n;
    public final /* synthetic */ float o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ gz0 q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp(tb tbVar, float f, boolean z, qp qpVar, gz0 gz0Var, m10 m10Var) {
        super(2, m10Var);
        this.n = tbVar;
        this.o = f;
        this.p = z;
        this.r = qpVar;
        this.q = gz0Var;
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
        return ((pp) p(m10Var, x20Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        Object obj2 = this.r;
        switch (b) {
            case 0:
                gz0 gz0Var = this.q;
                return new pp(this.n, this.o, this.p, (qp) obj2, gz0Var, m10Var);
            default:
                return new pp(this.n, this.o, this.p, this.q, (sj1) obj2, m10Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r5.e(r12, r13) == r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if (defpackage.df0.a(r5, r6, r13, r10, r12) == r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return r4;
     */
    @Override // defpackage.rk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pp.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp(tb tbVar, float f, boolean z, gz0 gz0Var, sj1 sj1Var, m10 m10Var) {
        super(2, m10Var);
        this.n = tbVar;
        this.o = f;
        this.p = z;
        this.q = gz0Var;
        this.r = sj1Var;
    }
}
