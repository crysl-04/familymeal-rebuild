package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zq0 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ dr0 i;

    public /* synthetic */ zq0(dr0 dr0Var, ph1 ph1Var) {
        this.h = (byte) 0;
        this.i = dr0Var;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        dr0 dr0Var = this.i;
        switch (b) {
            case 0:
                dr0Var.B(null, null);
                return j23.a;
            case 1:
                return dr0Var.m();
            default:
                return dr0Var.m();
        }
    }

    public /* synthetic */ zq0(dr0 dr0Var, byte b) {
        this.h = b;
        this.i = dr0Var;
    }
}
