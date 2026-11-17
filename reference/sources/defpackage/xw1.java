package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xw1 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ vp0 i;
    public final /* synthetic */ Object j;

    public /* synthetic */ xw1(byte b, vp0 vp0Var, Object obj) {
        this.h = b;
        this.i = vp0Var;
        this.j = obj;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        j23 j23Var = j23.a;
        Object obj = this.j;
        vp0 vp0Var = this.i;
        switch (b) {
            case 0:
                vp0Var.h(((dy1) obj).a);
                break;
            default:
                vp0Var.h(((j62) obj).a);
                break;
        }
        return j23Var;
    }
}
