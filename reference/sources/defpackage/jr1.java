package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jr1 extends zr1 {
    public static final jr1 c = new jr1(0, 3, 1);

    @Override // defpackage.zr1
    public final void a(yq0 yq0Var, rg rgVar, ik2 ik2Var, g82 g82Var, as1 as1Var) {
        ix0 ix0Var;
        fk2 fk2Var = (fk2) yq0Var.d(1);
        boolean z = false;
        xq0 xq0Var = (xq0) yq0Var.d(0);
        sj0 sj0Var = (sj0) yq0Var.d(2);
        ik2 ik2VarD = fk2Var.d();
        if (as1Var != null) {
            try {
                ix0Var = new ix0(as1Var, ik2Var, (byte) 27, z);
            } catch (Throwable th) {
                ik2VarD.e(false);
                throw th;
            }
        } else {
            ix0Var = null;
        }
        if (!sj0Var.i.q0()) {
            ez.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        sj0Var.h.p0(rgVar, ik2VarD, g82Var, ix0Var);
        ik2VarD.e(true);
        ik2Var.d();
        xq0Var.getClass();
        ik2Var.z(fk2Var, fk2Var.a(xq0Var));
        ik2Var.j();
    }
}
