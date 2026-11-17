package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ct0 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ dt0 i;

    public /* synthetic */ ct0(dt0 dt0Var, byte b) {
        this.h = b;
        this.i = dt0Var;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        j23 j23Var = j23.a;
        dt0 dt0Var = this.i;
        switch (b) {
            case 0:
                if (dt0Var.C != null) {
                    return j23Var;
                }
                throw wi0.w("Font resolution state is not set.");
            default:
                if (dt0Var.C != null) {
                    return j23Var;
                }
                throw wi0.w("Font resolution state is not set.");
        }
    }
}
