package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class be implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ kp0 i;

    public /* synthetic */ be(kp0 kp0Var, byte b) {
        this.h = b;
        this.i = kp0Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        kp0 kp0Var = this.i;
        switch (b) {
            case 0:
                ((j92) obj).c(((Number) kp0Var.a()).floatValue());
                return j23.a;
            default:
                return (up1) kp0Var.a();
        }
    }
}
