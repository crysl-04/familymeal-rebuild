package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x63 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ sj1 i;

    public /* synthetic */ x63(sj1 sj1Var, byte b) {
        this.h = b;
        this.i = sj1Var;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        j23 j23Var = j23.a;
        sj1 sj1Var = this.i;
        switch (b) {
            case 0:
                sj1Var.setValue(Boolean.TRUE);
                break;
            default:
                sj1Var.setValue(Boolean.FALSE);
                break;
        }
        return j23Var;
    }
}
