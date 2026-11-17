package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class h8 extends c92 implements zp0 {
    public final /* synthetic */ byte j;
    public byte k;
    public /* synthetic */ m10 l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h8(Object obj, m10 m10Var, byte b) {
        super(2, m10Var);
        this.j = b;
        this.m = obj;
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
        return ((h8) p(m10Var, sq2Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.j;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                h8 h8Var = new h8((j8) obj2, m10Var, (byte) 0);
                h8Var.l = (m10) obj;
                return h8Var;
            default:
                h8 h8Var2 = new h8((vp0) obj2, m10Var, (byte) 1);
                h8Var2.l = (m10) obj;
                return h8Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e7 A[LOOP:1: B:40:0x00d4->B:43:0x00e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a6 -> B:33:0x00aa). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.rk
    public final java.lang.Object r(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h8.r(java.lang.Object):java.lang.Object");
    }
}
