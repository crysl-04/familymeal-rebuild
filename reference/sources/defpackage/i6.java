package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i6 implements Runnable {
    public final /* synthetic */ byte h;
    public final /* synthetic */ kp0 i;

    public /* synthetic */ i6(kp0 kp0Var, byte b) {
        this.h = b;
        this.i = kp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.h;
        kp0 kp0Var = this.i;
        switch (b) {
            case 0:
                kp0Var.a();
                break;
            case 1:
                kp0Var.a();
                break;
            default:
                kp0Var.a();
                break;
        }
    }
}
