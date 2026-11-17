package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface k31 extends me1, ne1, le1 {
    @Override // defpackage.me1
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
}
