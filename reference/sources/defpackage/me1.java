package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface me1 extends ne1, ul2, g01 {
    re1 H1(e1 e1Var, gy1 gy1Var);

    default re1 l(re1 re1Var) {
        int iZ1 = Z1();
        int iT = T();
        int iT2 = re1Var.T();
        if (re1Var.Z1() == iZ1) {
            return H1(re1Var, j(iZ1, iT, iT2));
        }
        wg.f();
        return null;
    }

    default boolean l1(e1 e1Var) {
        return p0(e1Var) && s0();
    }

    boolean s0();
}
