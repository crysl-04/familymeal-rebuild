package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class u02 extends wg1 {
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
        if (!(obj instanceof u02)) {
            return false;
        }
        s9 s9Var = h7.P;
        return s9Var.equals(s9Var);
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        return new v02(h7.P, null);
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        v02 v02Var = (v02) qg1Var;
        s9 s9Var = h7.P;
        if (uz0.g(v02Var.w, s9Var)) {
            return;
        }
        v02Var.w = s9Var;
        if (v02Var.x) {
            v02Var.L0();
        }
    }

    public final int hashCode() {
        return (h7.P.hashCode() * 31) + 1237;
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + h7.P + ", overrideDescendants=false)";
    }
}
