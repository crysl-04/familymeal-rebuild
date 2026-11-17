package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class y8 extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public byte m;
    public Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y8(Object obj, Object obj2, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = obj;
        this.o = obj2;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) throws Throwable {
        byte b = this.l;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                return ((y8) p((m10) obj2, (x20) obj)).r(j23Var);
            case 1:
                ((y8) p((m10) obj2, (x20) obj)).r(j23Var);
                return y20.h;
            case 2:
                return ((y8) p((m10) obj2, (x20) obj)).r(j23Var);
            case 3:
                return ((y8) p((m10) obj2, (x20) obj)).r(j23Var);
            case 4:
                return ((y8) p((m10) obj2, (x20) obj)).r(j23Var);
            case 5:
                return ((y8) p((m10) obj2, (x20) obj)).r(j23Var);
            case 6:
                return ((y8) p((m10) obj2, (u32) obj)).r(j23Var);
            case 7:
                return ((y8) p((m10) obj2, (x20) obj)).r(j23Var);
            default:
                return ((y8) p((m10) obj2, (wu1) obj)).r(j23Var);
        }
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        Object obj2 = this.o;
        switch (b) {
            case 0:
                return new y8((c9) this.n, (ix0) obj2, m10Var, (byte) 0);
            case 1:
                return new y8((s01) this.n, (q30) obj2, m10Var, (byte) 1);
            case 2:
                return new y8((lw0) obj2, m10Var, (byte) 2);
            case 3:
                y8 y8Var = new y8((nh1) obj2, m10Var, (byte) 3);
                y8Var.n = obj;
                return y8Var;
            case 4:
                return new y8((ay1) obj2, m10Var, (byte) 4);
            case 5:
                return new y8((x62) obj2, m10Var, (byte) 5);
            case 6:
                y8 y8Var2 = new y8((pk0) obj2, m10Var, (byte) 6);
                y8Var2.n = obj;
                return y8Var2;
            case 7:
                return new y8((s01) this.n, (k22) obj2, m10Var, (byte) 7);
            default:
                y8 y8Var3 = new y8((p03) obj2, m10Var, (byte) 8);
                y8Var3.n = obj;
                return y8Var3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:288:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:171:0x03fb -> B:166:0x03c9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:223:0x051f -> B:225:0x0522). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:200:0x04c4
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.rk
    public final java.lang.Object r(java.lang.Object r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y8.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y8(Object obj, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.o = obj;
    }
}
