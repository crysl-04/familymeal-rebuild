package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ lu i;

    public /* synthetic */ f(lu luVar, byte b) {
        this.h = b;
        this.i = luVar;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        lu luVar = this.i;
        switch (b) {
            case 0:
                dv0 dv0Var = (dv0) vs.z(luVar, av0.a);
                if (dv0Var == null) {
                    dx0.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + dv0Var);
                }
                dv0 dv0Var2 = luVar.F;
                luVar.F = dv0Var;
                if (dv0Var2 != null && !uz0.g(dv0Var, dv0Var2)) {
                    j80 j80Var = luVar.I;
                    if (j80Var != null) {
                        luVar.K0(j80Var);
                    } else if (!luVar.P) {
                    }
                    luVar.I = null;
                    luVar.R0();
                }
                return j23.a;
            default:
                luVar.S0();
                return Boolean.TRUE;
        }
    }
}
