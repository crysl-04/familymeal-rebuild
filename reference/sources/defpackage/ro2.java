package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ro2 extends k80 implements c12, vl0, im0 {
    public kp0 x;
    public boolean y;
    public final tq2 z;

    public ro2(kp0 kp0Var) {
        this.x = kp0Var;
        i8 i8Var = new i8(this, (byte) 2);
        q02 q02Var = oq2.a;
        tq2 tq2Var = new tq2(null, null, i8Var);
        J0(tq2Var);
        this.z = tq2Var;
    }

    @Override // defpackage.c12
    public final void K(q02 q02Var, s02 s02Var, long j) {
        this.z.K(q02Var, s02Var, j);
    }

    @Override // defpackage.vl0
    public final void W(km0 km0Var) {
        this.y = km0Var.a();
    }

    @Override // defpackage.c12
    public final void j0() {
        this.z.j0();
    }

    @Override // defpackage.c12
    public final long t() {
        gc0 gc0Var = s60.A0;
        e90 e90Var = cu.Y(this).E;
        gc0Var.getClass();
        int i = vy2.b;
        return m02.s(e90Var.R(10.0f), e90Var.R(40.0f), e90Var.R(10.0f), e90Var.R(40.0f));
    }
}
