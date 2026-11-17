package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i50 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ b81 i;

    public /* synthetic */ i50(b81 b81Var, byte b) {
        this.h = b;
        this.i = b81Var;
    }

    @Override // defpackage.kp0
    public final Object a() {
        int iH;
        byte b = this.h;
        b81 b81Var = this.i;
        switch (b) {
            case 0:
                iH = b81Var.h();
                break;
            case 1:
                iH = b81Var.j().o;
                break;
            default:
                iH = ((u71) b81Var.f.getValue()).k;
                break;
        }
        return Integer.valueOf(iH);
    }
}
