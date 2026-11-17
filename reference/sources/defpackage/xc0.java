package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xc0 extends c92 implements zp0 {
    public q02 j;
    public boolean k;
    public byte l;
    public /* synthetic */ m10 m;
    public final /* synthetic */ t72 n;
    public final /* synthetic */ x72 o;
    public final /* synthetic */ x72 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc0(t72 t72Var, x72 x72Var, x72 x72Var2, m10 m10Var) {
        super(2, m10Var);
        this.n = t72Var;
        this.o = x72Var;
        this.p = x72Var2;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((xc0) p((m10) obj2, (sq2) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        xc0 xc0Var = new xc0(this.n, this.o, this.p, m10Var);
        xc0Var.m = (m10) obj;
        return xc0Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    /* JADX WARN: Code duplicated, block: B:18:0x0063 A[LOOP:2: B:15:0x0055->B:18:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x0067 A[EDGE_INSN: B:68:0x0067->B:20:0x0067 BREAK  A[LOOP:2: B:15:0x0055->B:18:0x0063], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ab -> B:36:0x00ae). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.rk
    public final java.lang.Object r(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc0.r(java.lang.Object):java.lang.Object");
    }
}
