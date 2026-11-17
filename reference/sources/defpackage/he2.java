package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class he2 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ je2 i;

    public /* synthetic */ he2(je2 je2Var, byte b) {
        this.h = b;
        this.i = je2Var;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        je2 je2Var = this.i;
        switch (b) {
            case 0:
                return Boolean.valueOf(je2Var.u);
            default:
                lm0 lm0Var = je2Var.a0;
                if (!lm0Var.h.u) {
                    return null;
                }
                km0 km0VarO0 = lm0Var.O0();
                int iOrdinal = km0VarO0.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return null;
                    }
                    wg.n();
                    return null;
                }
                if (km0VarO0.a()) {
                    return lm0Var.M0(null);
                }
                lm0 lm0VarF = ((em0) cu.Z(lm0Var).getFocusOwner()).f();
                if (lm0VarF != null) {
                    return lm0VarF.M0(cu.X(lm0Var));
                }
                return null;
        }
    }
}
