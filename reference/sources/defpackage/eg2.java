package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class eg2 extends c92 implements zp0 {
    public final /* synthetic */ byte j = 1;
    public byte k;
    public /* synthetic */ m10 l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg2(u8 u8Var, tj2 tj2Var, zt2 zt2Var, m10 m10Var) {
        super(2, m10Var);
        this.m = u8Var;
        this.n = tj2Var;
        this.o = zt2Var;
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
        return ((eg2) p(m10Var, sq2Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.j;
        Object obj2 = this.o;
        switch (b) {
            case 0:
                eg2 eg2Var = new eg2((u8) this.m, (tj2) this.n, (zt2) obj2, m10Var);
                eg2Var.l = (m10) obj;
                return eg2Var;
            default:
                eg2 eg2Var2 = new eg2((ro2) obj2, m10Var);
                eg2Var2.l = (m10) obj;
                return eg2Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0242  */
    /* JADX WARN: Code duplicated, block: B:134:0x024f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0265  */
    /* JADX WARN: Code duplicated, block: B:166:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:184:0x0331  */
    /* JADX WARN: Code duplicated, block: B:187:0x033d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x025d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00db  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x0124  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x0235 -> B:130:0x0237). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ce -> B:36:0x00d0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.rk
    public final java.lang.Object r(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg2.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg2(ro2 ro2Var, m10 m10Var) {
        super(2, m10Var);
        this.o = ro2Var;
    }
}
