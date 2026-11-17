package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ta2 {
    public static final ua2 a = new ua2(uz0.e, c5.r);

    public static final ua2 a(zg zgVar, cm cmVar, dr0 dr0Var, int i) {
        if (zgVar.equals(uz0.e) && uz0.g(cmVar, c5.r)) {
            dr0Var.V(-1073830487);
            dr0Var.p(false);
            return a;
        }
        dr0Var.V(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && dr0Var.f(zgVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !dr0Var.f(cmVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objK = dr0Var.K();
        if (z3 || objK == zy.a) {
            objK = new ua2(zgVar, cmVar);
            dr0Var.f0(objK);
        }
        ua2 ua2Var = (ua2) objK;
        dr0Var.p(false);
        return ua2Var;
    }
}
