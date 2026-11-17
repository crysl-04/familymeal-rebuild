package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bm1 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ kn2 i;

    public /* synthetic */ bm1(kn2 kn2Var, byte b) {
        this.h = b;
        this.i = kn2Var;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        kn2 kn2Var = this.i;
        switch (b) {
            case 0:
                return Float.valueOf(((Number) kn2Var.getValue()).floatValue());
            case 1:
                return Float.valueOf(((Number) kn2Var.getValue()).floatValue());
            default:
                up1 up1Var = (up1) kn2Var.getValue();
                long j = up1Var.a;
                return up1Var;
        }
    }
}
