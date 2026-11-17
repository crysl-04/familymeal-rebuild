package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class y33 extends m31 implements vp0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ z33 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y33(z33 z33Var, byte b) {
        super(1);
        this.i = b;
        this.j = z33Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        long j;
        byte b = this.i;
        z33 z33Var = this.j;
        switch (b) {
            case 0:
                mz2 mz2Var = (mz2) obj;
                kg0 kg0Var = kg0.h;
                kg0 kg0Var2 = kg0.i;
                if (mz2Var.c(kg0Var, kg0Var2)) {
                    pz2 pz2Var = z33Var.w.a;
                    return vg0.c;
                }
                if (!mz2Var.c(kg0Var2, kg0.j)) {
                    return vg0.c;
                }
                pz2 pz2Var2 = z33Var.x.a;
                return vg0.c;
            default:
                int iOrdinal = ((kg0) obj).ordinal();
                if (iOrdinal == 0) {
                    pz2 pz2Var3 = z33Var.w.a;
                    j = kv.f;
                } else if (iOrdinal == 1) {
                    pz2 pz2Var4 = z33Var.w.a;
                    pz2 pz2Var5 = z33Var.x.a;
                    j = kv.f;
                } else {
                    if (iOrdinal != 2) {
                        wg.n();
                        return null;
                    }
                    pz2 pz2Var6 = z33Var.x.a;
                    j = z33Var.y.e;
                }
                return new kv(j);
        }
    }
}
