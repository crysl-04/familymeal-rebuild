package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n80 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ p80 i;

    public /* synthetic */ n80(p80 p80Var, byte b) {
        this.h = b;
        this.i = p80Var;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        p80 p80Var = this.i;
        switch (b) {
            case 0:
                v92 v92Var = (v92) vs.z(p80Var, y92.a);
                ga gaVar = p80Var.B;
                if (v92Var == null) {
                    if (gaVar != null) {
                        p80Var.K0(gaVar);
                    }
                    p80Var.B = null;
                } else if (gaVar == null) {
                    o80 o80Var = new o80(p80Var);
                    n80 n80Var = new n80(p80Var, (byte) 1);
                    hz0 hz0Var = p80Var.x;
                    boolean z = p80Var.y;
                    float f = p80Var.z;
                    q03 q03Var = z92.a;
                    ga gaVar2 = new ga(hz0Var, z, f, o80Var, n80Var);
                    p80Var.J0(gaVar2);
                    p80Var.B = gaVar2;
                }
                return j23.a;
            default:
                return aa3.N;
        }
    }
}
