package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cc extends m31 implements aq0 {
    public final /* synthetic */ Object i;
    public final /* synthetic */ ll2 j;
    public final /* synthetic */ oc k;
    public final /* synthetic */ nx l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(Object obj, ll2 ll2Var, oc ocVar, nx nxVar) {
        super(3);
        this.i = obj;
        this.j = ll2Var;
        this.k = ocVar;
        this.l = nxVar;
    }

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
    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        vc vcVar = (vc) obj;
        dr0 dr0Var = (dr0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? dr0Var.f(vcVar) : dr0Var.h(vcVar) ? 4 : 2;
        }
        if (dr0Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            ll2 ll2Var = this.j;
            boolean zF = dr0Var.f(ll2Var);
            Object obj4 = this.i;
            boolean zH = zF | dr0Var.h(obj4);
            oc ocVar = this.k;
            boolean zH2 = zH | dr0Var.h(ocVar);
            Object objK = dr0Var.K();
            yy yyVar = zy.a;
            if (zH2 || objK == yyVar) {
                objK = new pg0(ll2Var, obj4, ocVar, (byte) 2);
                dr0Var.f0(objK);
            }
            h7.H(vcVar, obj4, (vp0) objK, dr0Var);
            mj1 mj1Var = ocVar.d;
            vcVar.getClass();
            mj1Var.n(obj4, ((wc) vcVar).a);
            Object objK2 = dr0Var.K();
            if (objK2 == yyVar) {
                objK2 = new hc();
                dr0Var.f0(objK2);
            }
            this.l.o((hc) objK2, obj4, dr0Var, 0);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
