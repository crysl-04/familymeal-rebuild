package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ow0 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ vp0 i;
    public final /* synthetic */ kp0 j;

    public /* synthetic */ ow0(vp0 vp0Var, kp0 kp0Var, int i, byte b) {
        this.h = b;
        this.i = vp0Var;
        this.j = kp0Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        kp0 kp0Var = this.j;
        vp0 vp0Var = this.i;
        dr0 dr0Var = (dr0) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                es.c(vp0Var, kp0Var, dr0Var, m02.A(1));
                break;
            default:
                pz1.d(vp0Var, kp0Var, dr0Var, m02.A(1));
                break;
        }
        return j23Var;
    }
}
