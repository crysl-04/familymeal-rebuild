package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ov2 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ e90 i;
    public final /* synthetic */ sj1 j;

    public /* synthetic */ ov2(e90 e90Var, sj1 sj1Var, byte b) {
        this.h = b;
        this.i = e90Var;
        this.j = sj1Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        sj1 sj1Var = this.j;
        e90 e90Var = this.i;
        switch (b) {
            case 0:
                vz1 vz1Var = vz1.i;
                be beVar = new be((kp0) obj, (byte) 1);
                ov2 ov2Var = new ov2(e90Var, sj1Var, (byte) 1);
                ch2 ch2Var = nd1.a;
                return new kd1(beVar, ov2Var, vz1Var);
            default:
                fc0 fc0Var = (fc0) obj;
                sj1Var.setValue(new vy0((((long) e90Var.R(fc0.b(fc0Var.a))) << 32) | (((long) e90Var.R(fc0.a(fc0Var.a))) & 4294967295L)));
                return j23.a;
        }
    }
}
