package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xs1 implements aq0 {
    public final /* synthetic */ vv2 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ w53 k;
    public final /* synthetic */ ui1 l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ nx n;
    public final /* synthetic */ nx o;
    public final /* synthetic */ nx p;
    public final /* synthetic */ au2 q;
    public final /* synthetic */ hi2 r;

    public xs1(vv2 vv2Var, boolean z, boolean z2, w53 w53Var, ui1 ui1Var, boolean z3, nx nxVar, nx nxVar2, nx nxVar3, au2 au2Var, hi2 hi2Var) {
        this.h = vv2Var;
        this.i = z;
        this.j = z2;
        this.k = w53Var;
        this.l = ui1Var;
        this.m = z3;
        this.n = nxVar;
        this.o = nxVar2;
        this.p = nxVar3;
        this.q = au2Var;
        this.r = hi2Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
        zp0 zp0Var = (zp0) obj;
        dr0 dr0Var = (dr0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= dr0Var.h(zp0Var) ? 4 : 2;
        }
        if (dr0Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            c5 c5Var = c5.h0;
            String str = this.h.a.i;
            hi2 hi2Var = this.r;
            boolean z = this.i;
            boolean z2 = this.m;
            ui1 ui1Var = this.l;
            au2 au2Var = this.q;
            c5Var.i(str, zp0Var, z, this.j, this.k, ui1Var, z2, this.n, this.o, null, null, this.p, au2Var, null, dt.N(1409265477, new us1(z, z2, ui1Var, au2Var, hi2Var, (byte) 1), dr0Var), dr0Var, (iIntValue << 3) & 112);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
