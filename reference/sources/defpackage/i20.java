package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i20 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ k20 i;

    public /* synthetic */ i20(k20 k20Var, byte b) {
        this.h = b;
        this.i = k20Var;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        j23 j23Var = j23.a;
        k20 k20Var = this.i;
        switch (b) {
            case 0:
                cu.V(k20Var);
                return j23Var;
            case 1:
                k20Var.C.e(true);
                break;
            case 2:
                k20Var.C.a(true);
                break;
            case 3:
                k20Var.C.c();
                break;
            case 4:
                cu.V(k20Var);
                return j23Var;
            case 5:
                k20Var.C.o();
                break;
            case 6:
                v10 v10Var = k20Var.z.w;
                v10Var.i.r.C(k20Var.D.e);
                break;
            default:
                p81 p81Var = k20Var.z;
                gm0 gm0Var = k20Var.E;
                if (!p81Var.b()) {
                    gm0.a(gm0Var);
                } else {
                    ol2 ol2Var = p81Var.c;
                    if (ol2Var != null) {
                        ((m80) ol2Var).b();
                    }
                }
                break;
        }
        return Boolean.TRUE;
    }
}
