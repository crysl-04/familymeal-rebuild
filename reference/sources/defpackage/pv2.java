package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pv2 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ kv2 i;

    public /* synthetic */ pv2(kv2 kv2Var, byte b) {
        this.h = b;
        this.i = kv2Var;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        j23 j23Var = j23.a;
        kv2 kv2Var = this.i;
        switch (b) {
            case 0:
                return Boolean.valueOf(!kv2Var.A);
            case 1:
                vv2 vv2VarB = kv2.b(kv2Var.l().a, m02.a(0, kv2Var.l().a.i.length()));
                kv2Var.c.h(vv2VarB);
                long j = vv2VarB.b;
                kv2Var.v = new qw2(j);
                kv2Var.t = vv2.a(kv2Var.t, null, j, 5);
                kv2Var.e(true);
                return j23Var;
            default:
                kp0 kp0Var = kv2Var.f;
                if (kp0Var != null) {
                    kp0Var.a();
                }
                return j23Var;
        }
    }
}
