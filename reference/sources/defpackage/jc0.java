package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jc0 implements vp0 {
    public final /* synthetic */ x72 h;
    public final /* synthetic */ kc0 i;
    public final /* synthetic */ g2 j;

    public jc0(x72 x72Var, kc0 kc0Var, g2 g2Var) {
        this.h = x72Var;
        this.i = kc0Var;
        this.j = g2Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        yz2 yz2Var = (yz2) obj;
        kc0 kc0Var = (kc0) yz2Var;
        if (!((f8) cu.Z(this.i).m8getDragAndDropManager()).b.contains(kc0Var) || !es.v(kc0Var, ls.B(this.j))) {
            return xz2.h;
        }
        this.h.h = yz2Var;
        return xz2.j;
    }
}
