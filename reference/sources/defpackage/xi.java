package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xi extends qg1 {
    public mx2 v;
    public final /* synthetic */ yi w;

    public xi(yi yiVar) {
        this.w = yiVar;
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
    @Override // defpackage.qg1
    public final void B0() {
        yi yiVar = this.w;
        yiVar.h = this;
        if (yiVar.i != null) {
            g gVar = new g(this, yiVar, (byte) 3);
            l41 l41VarY = cu.Y(this);
            int i = l41VarY.i;
            s72 rectManager = o41.a(l41VarY).getRectManager();
            nx2 nx2Var = rectManager.d;
            nx2Var.getClass();
            si1 si1Var = nx2Var.a;
            mx2 mx2Var = new mx2(nx2Var, i, this, gVar);
            Object objB = si1Var.b(i);
            if (objB == null) {
                si1Var.h(i, mx2Var);
                objB = mx2Var;
            }
            mx2 mx2Var2 = (mx2) objB;
            if (mx2Var2 != mx2Var) {
                while (true) {
                    mx2 mx2Var3 = mx2Var2.d;
                    if (mx2Var3 == null) {
                        break;
                    } else {
                        mx2Var2 = mx2Var3;
                    }
                }
                mx2Var2.d = mx2Var;
            }
            l41 l41VarY2 = cu.Y(this.h);
            if (l41VarY2.n != -4) {
                u8 u8Var = rectManager.c;
                int iD = rectManager.d(l41VarY2);
                long[] jArr = (long[]) u8Var.b;
                int i2 = iD + 2;
                jArr[i2] = (jArr[i2] & 8070450532247928831L) | (-8070450532247928832L);
            }
            rectManager.f = true;
            rectManager.j();
            this.v = mx2Var;
        }
    }

    @Override // defpackage.qg1
    public final void C0() {
        yi yiVar = this.w;
        if (yiVar.h == this) {
            yiVar.h = null;
        }
        mx2 mx2Var = this.v;
        if (mx2Var != null) {
            mx2Var.b();
        }
        this.v = null;
    }
}
