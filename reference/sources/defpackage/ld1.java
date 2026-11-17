package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ld1 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ md1 i;

    public /* synthetic */ ld1(md1 md1Var, byte b) {
        this.h = b;
        this.i = md1Var;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        md1 md1Var = this.i;
        switch (b) {
            case 0:
                md1Var.L0();
                return j23.a;
            case 1:
                return new up1(md1Var.J);
            default:
                t31 t31Var = (t31) md1Var.H.getValue();
                return new up1(t31Var != null ? t31Var.S(0L) : 9205357640488583168L);
        }
    }
}
