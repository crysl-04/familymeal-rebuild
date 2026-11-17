package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f33 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ g33 i;

    public /* synthetic */ f33(g33 g33Var, byte b) {
        this.h = b;
        this.i = g33Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        j23 j23Var = j23.a;
        g33 g33Var = this.i;
        switch (b) {
            case 0:
                g33Var.d = true;
                g33Var.f.a();
                return j23Var;
            default:
                td0 td0Var = (td0) obj;
                ks0 ks0Var = g33Var.b;
                float f = g33Var.k;
                float f2 = g33Var.l;
                eg egVarF = td0Var.F();
                long jQ = egVarF.q();
                egVarF.g().l();
                try {
                    ((g2) egVarF.i).M(f, f2, 0L);
                    ks0Var.a(td0Var);
                    return j23Var;
                } finally {
                    wi0.r(egVarF, jQ);
                }
        }
    }
}
