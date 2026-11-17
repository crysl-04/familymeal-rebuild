package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class px0 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ qx0 i;

    public /* synthetic */ px0(qx0 qx0Var, byte b) {
        this.h = b;
        this.i = qx0Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        qx0 qx0Var = this.i;
        yz2 yz2Var = (yz2) obj;
        switch (b) {
            case 0:
                yz2Var.getClass();
                qx0 qx0Var2 = (qx0) yz2Var;
                m73 m73Var = qx0Var.w;
                if (!uz0.g(qx0Var2.v, m73Var)) {
                    qx0Var2.v = m73Var;
                    qx0Var2.K0();
                }
                return xz2.i;
            default:
                yz2Var.getClass();
                qx0Var.v = ((qx0) yz2Var).w;
                return Boolean.FALSE;
        }
    }
}
