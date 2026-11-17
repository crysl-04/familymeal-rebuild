package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ic0 implements vp0 {
    public final /* synthetic */ byte h = 0;
    public final /* synthetic */ t72 i;

    public /* synthetic */ ic0(g2 g2Var, kc0 kc0Var, t72 t72Var) {
        this.i = t72Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        xz2 xz2Var = xz2.h;
        t72 t72Var = this.i;
        switch (b) {
            case 0:
                kc0 kc0Var = (kc0) obj;
                if (!kc0Var.u) {
                    return xz2.i;
                }
                if (kc0Var.w != null) {
                    ax0.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                kc0Var.w = null;
                t72Var.h = t72Var.h;
                return xz2Var;
            default:
                if (!((tt0) obj).x) {
                    return xz2Var;
                }
                t72Var.h = false;
                return xz2.j;
        }
    }

    public /* synthetic */ ic0(t72 t72Var) {
        this.i = t72Var;
    }
}
