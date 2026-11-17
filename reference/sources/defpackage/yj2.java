package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class yj2 {
    public static final yi0 a = new yi0(ra0.i);
    public static final yi0 b;
    public static final n93 c;
    public static final n93 d;
    public static final n93 e;
    public static final n93 f;

    static {
        ra0 ra0Var = ra0.j;
        b = new yi0(ra0Var);
        cm cmVar = c5.s;
        m93 m93Var = new m93(cmVar, (byte) 0);
        ra0 ra0Var2 = ra0.h;
        c = new n93(ra0Var2, m93Var, cmVar);
        cm cmVar2 = c5.r;
        d = new n93(ra0Var2, new m93(cmVar2, (byte) 0), cmVar2);
        dm dmVar = c5.m;
        e = new n93(ra0Var, new m93(dmVar, (byte) 1), dmVar);
        dm dmVar2 = c5.i;
        f = new n93(ra0Var, new m93(dmVar2, (byte) 1), dmVar2);
    }

    public static final rg1 a(rg1 rg1Var, float f2, float f3) {
        return rg1Var.c(new q23(f2, f3));
    }

    public static final rg1 b(rg1 rg1Var, float f2) {
        return rg1Var.c(new xj2(0.0f, f2, 0.0f, f2, true, 5));
    }

    public static final rg1 c(rg1 rg1Var, float f2, float f3) {
        return rg1Var.c(new xj2(0.0f, f2, 0.0f, f3, true, 5));
    }

    public static rg1 d(rg1 rg1Var, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i & 2) != 0) {
            f3 = Float.NaN;
        }
        return c(rg1Var, f2, f3);
    }

    public static final rg1 e(rg1 rg1Var, float f2) {
        return rg1Var.c(new xj2(0.0f, f2, 0.0f, f2, false, 5));
    }

    public static final rg1 f(rg1 rg1Var, float f2, float f3) {
        return rg1Var.c(new xj2(f2, f3, f2, f3, false));
    }

    public static rg1 g(rg1 rg1Var, float f2, float f3, float f4, float f5, int i) {
        return rg1Var.c(new xj2(f2, (i & 2) != 0 ? Float.NaN : f3, (i & 4) != 0 ? Float.NaN : f4, (i & 8) != 0 ? Float.NaN : f5, false));
    }

    public static final rg1 h(rg1 rg1Var, float f2) {
        return rg1Var.c(new xj2(f2, 0.0f, f2, 0.0f, false, 10));
    }

    public static final rg1 i(rg1 rg1Var, float f2) {
        return rg1Var.c(new xj2(f2, f2, f2, f2, true));
    }

    public static final rg1 j(rg1 rg1Var, float f2, float f3) {
        return rg1Var.c(new xj2(f2, f3, f2, f3, true));
    }

    public static final rg1 k(rg1 rg1Var, float f2, float f3, float f4, float f5) {
        return rg1Var.c(new xj2(f2, f3, f4, f5, true));
    }

    public static rg1 l(rg1 rg1Var, float f2, float f3, float f4, int i) {
        if ((i & 2) != 0) {
            f3 = Float.NaN;
        }
        if ((i & 4) != 0) {
            f4 = Float.NaN;
        }
        return k(rg1Var, f2, f3, f4, Float.NaN);
    }

    public static rg1 m(rg1 rg1Var) {
        n93 n93Var;
        cm cmVar = c5.s;
        if (uz0.g(cmVar, cmVar)) {
            n93Var = c;
        } else if (uz0.g(cmVar, c5.r)) {
            n93Var = d;
        } else {
            n93Var = new n93(ra0.h, new m93(cmVar, (byte) 0), cmVar);
        }
        return rg1Var.c(n93Var);
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
    public static rg1 n(rg1 rg1Var, int i) {
        n93 n93Var;
        dm dmVar = c5.m;
        if (dmVar.equals(dmVar)) {
            n93Var = e;
        } else if (dmVar.equals(c5.i)) {
            n93Var = f;
        } else {
            n93Var = new n93(ra0.j, new m93(dmVar, (byte) 1), dmVar);
        }
        return rg1Var.c(n93Var);
    }
}
