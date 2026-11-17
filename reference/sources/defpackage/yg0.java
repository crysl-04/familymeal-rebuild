package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yg0 extends m31 implements vp0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ zg0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yg0(zg0 zg0Var, byte b) {
        super(1);
        this.i = b;
        this.j = zg0Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.i;
        kg0 kg0Var = kg0.j;
        kg0 kg0Var2 = kg0.i;
        kg0 kg0Var3 = kg0.h;
        zg0 zg0Var = this.j;
        switch (b) {
            case 0:
                mz2 mz2Var = (mz2) obj;
                boolean zC = mz2Var.c(kg0Var3, kg0Var2);
                zm2 zm2Var = null;
                if (zC) {
                    bs bsVar = zg0Var.z.a.c;
                    if (bsVar != null) {
                        zm2Var = bsVar.c;
                    }
                } else if (mz2Var.c(kg0Var2, kg0Var)) {
                    bs bsVar2 = zg0Var.A.a.c;
                    if (bsVar2 != null) {
                        zm2Var = bsVar2.c;
                    }
                } else {
                    zm2Var = vg0.e;
                }
                return zm2Var == null ? vg0.e : zm2Var;
            default:
                mz2 mz2Var2 = (mz2) obj;
                if (mz2Var2.c(kg0Var3, kg0Var2)) {
                    ck2 ck2Var = zg0Var.z.a.b;
                    return ck2Var != null ? ck2Var.b : vg0.d;
                }
                if (!mz2Var2.c(kg0Var2, kg0Var)) {
                    return vg0.d;
                }
                ck2 ck2Var2 = zg0Var.A.a.b;
                return ck2Var2 != null ? ck2Var2.b : vg0.d;
        }
    }
}
