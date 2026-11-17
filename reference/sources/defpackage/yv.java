package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class yv {
    public static final aw a = new aw(uz0.g, c5.u);

    public static final aw a(bh bhVar, bm bmVar, dr0 dr0Var, int i) {
        if (bhVar.equals(uz0.g) && bmVar.equals(c5.u)) {
            dr0Var.V(-1446604504);
            dr0Var.p(false);
            return a;
        }
        dr0Var.V(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && dr0Var.f(bhVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !dr0Var.f(bmVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objK = dr0Var.K();
        if (z3 || objK == zy.a) {
            objK = new aw(bhVar, bmVar);
            dr0Var.f0(objK);
        }
        aw awVar = (aw) objK;
        dr0Var.p(false);
        return awVar;
    }
}
