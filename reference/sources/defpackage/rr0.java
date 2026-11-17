package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rr0 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ vp0 i;

    public /* synthetic */ rr0(vp0 vp0Var, byte b) {
        this.h = b;
        this.i = vp0Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        vp0 vp0Var = this.i;
        switch (b) {
            case 0:
                yz2 yz2Var = (yz2) obj;
                if (yz2Var instanceof qr0) {
                    return Boolean.valueOf(((Boolean) vp0Var.h(((qr0) yz2Var).v)).booleanValue());
                }
                li1.g("Node is not a GestureNode instance");
                return null;
            case 1:
                uk2 uk2Var = (uk2) vp0Var.h((zk2) obj);
                synchronized (bl2.c) {
                    bl2.d = bl2.d.e(uk2Var.g());
                }
                return uk2Var;
            default:
                Long l = (Long) obj;
                l.getClass();
                return vp0Var.h(l);
        }
    }
}
