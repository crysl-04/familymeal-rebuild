package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class to2 extends wg1 {
    public final gc0 h;

    public to2(gc0 gc0Var) {
        this.h = gc0Var;
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
        if (!(obj instanceof to2)) {
            return false;
        }
        to2 to2Var = (to2) obj;
        s9 s9Var = uz0.L;
        return s9Var.equals(s9Var) && uz0.g(this.h, to2Var.h);
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        return new uo2(uz0.L, this.h);
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        uo2 uo2Var = (uo2) qg1Var;
        s9 s9Var = uz0.L;
        if (!uz0.g(uo2Var.w, s9Var)) {
            uo2Var.w = s9Var;
            if (uo2Var.x) {
                uo2Var.L0();
            }
        }
        uo2Var.v = this.h;
    }

    public final int hashCode() {
        return (((1022 * 31) + 1237) * 31) + (this.h == null ? 0 : 905970895);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + uz0.L + ", overrideDescendants=false, touchBoundsExpansion=" + this.h + ")";
    }
}
