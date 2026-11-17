package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class ut1 extends wg1 {
    public final tt1 h;
    public final yy i;
    public final ln j;

    public ut1(tt1 tt1Var, yy yyVar, ln lnVar) {
        this.h = tt1Var;
        this.i = yyVar;
        this.j = lnVar;
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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut1)) {
            return false;
        }
        ut1 ut1Var = (ut1) obj;
        if (!uz0.g(this.h, ut1Var.h)) {
            return false;
        }
        dm dmVar = c5.m;
        return dmVar.equals(dmVar) && this.i.equals(ut1Var.i) && uz0.g(this.j, ut1Var.j);
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        dm dmVar = c5.m;
        vt1 vt1Var = new vt1();
        vt1Var.v = this.h;
        vt1Var.w = true;
        vt1Var.x = dmVar;
        vt1Var.y = this.i;
        vt1Var.z = 1.0f;
        vt1Var.A = this.j;
        return vt1Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        vt1 vt1Var = (vt1) qg1Var;
        boolean z = vt1Var.w;
        tt1 tt1Var = this.h;
        boolean z2 = (z && wj2.a(vt1Var.v.d(), tt1Var.d())) ? false : true;
        vt1Var.v = tt1Var;
        vt1Var.w = true;
        vt1Var.x = c5.m;
        vt1Var.y = this.i;
        vt1Var.z = 1.0f;
        vt1Var.A = this.j;
        if (z2) {
            vs.E(vt1Var);
        }
        dt.H(vt1Var);
    }

    public final int hashCode() {
        int iHashCode = (((this.i.hashCode() + (((0 * 31) + 0 + (((this.h.hashCode() * 31) + 1231) * 31)) * 31)) * 31) + 1065353216) * 31;
        ln lnVar = this.j;
        return iHashCode + (lnVar != null ? lnVar.hashCode() : 0);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.h + ", sizeToIntrinsics=true, alignment=" + c5.m + ", contentScale=" + this.i + ", alpha=1.0, colorFilter=" + this.j + ")";
    }
}
