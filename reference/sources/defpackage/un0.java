package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class un0 extends c92 implements zp0 {
    public final /* synthetic */ byte j;
    public byte k;
    public Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ un0(Object obj, Object obj2, m10 m10Var, byte b) {
        super(2, m10Var);
        this.j = b;
        this.m = obj;
        this.n = obj2;
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
            case 1:
                break;
        }
        return ((un0) p(m10Var, sq2Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.j;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                un0 un0Var = new un0((o20) this.m, (zp0) obj2, m10Var, (byte) 0);
                un0Var.l = obj;
                return un0Var;
            case 1:
                un0 un0Var2 = new un0((zt2) obj2, m10Var);
                un0Var2.m = (m10) obj;
                return un0Var2;
            default:
                un0 un0Var3 = new un0((s02) this.m, (x72) obj2, m10Var, (byte) 2);
                un0Var3.l = (m10) obj;
                return un0Var3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01ab A[PHI: r5
  0x01ab: PHI (r5v3 sq2) = (r5v1 sq2), (r5v2 sq2), (r5v4 sq2), (r5v8 sq2) binds: [B:92:0x01d8, B:86:0x01c6, B:80:0x01aa, B:74:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x01b1 A[Catch: CancellationException -> 0x01c9, TRY_ENTER, TryCatch #0 {CancellationException -> 0x01c9, blocks: (B:83:0x01b1, B:85:0x01be, B:74:0x0196, B:77:0x019f), top: B:97:0x017c }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01be A[Catch: CancellationException -> 0x01c9, PHI: r5
  0x01be: PHI (r5v2 sq2) = (r5v3 sq2), (r5v6 sq2) binds: [B:84:0x01bc, B:77:0x019f] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {CancellationException -> 0x01c9, blocks: (B:83:0x01b1, B:85:0x01be, B:74:0x0196, B:77:0x019f), top: B:97:0x017c }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b2 -> B:33:0x00b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0146 -> B:57:0x014a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x01c6 -> B:81:0x01ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x01d8 -> B:81:0x01ab). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.rk
    public final java.lang.Object r(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.un0.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un0(zt2 zt2Var, m10 m10Var) {
        super(2, m10Var);
        this.j = (byte) 1;
        this.n = zt2Var;
    }
}
