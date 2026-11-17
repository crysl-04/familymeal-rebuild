package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xg0 extends m31 implements vp0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ zg0 j;
    public final /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xg0(zg0 zg0Var, long j, byte b) {
        super(1);
        this.i = b;
        this.j = zg0Var;
        this.k = j;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        vp0 vp0Var;
        vp0 vp0Var2;
        vp0 vp0Var3;
        vp0 vp0Var4;
        int iOrdinal;
        byte b = this.i;
        long j = this.k;
        long jB = 0;
        zg0 zg0Var = this.j;
        switch (b) {
            case 0:
                int iOrdinal2 = ((kg0) obj).ordinal();
                if (iOrdinal2 == 0) {
                    bs bsVar = zg0Var.z.a.c;
                    if (bsVar != null && (vp0Var = bsVar.b) != null) {
                        j = ((vy0) vp0Var.h(new vy0(j))).a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        wg.n();
                        return null;
                    }
                    bs bsVar2 = zg0Var.A.a.c;
                    if (bsVar2 != null && (vp0Var2 = bsVar2.b) != null) {
                        j = ((vy0) vp0Var2.h(new vy0(j))).a;
                    }
                }
                return new vy0(j);
            case 1:
                kg0 kg0Var = (kg0) obj;
                if (kg0Var == kg0.j && zg0Var.A.a.b == null) {
                    jB = zg0Var.B.i;
                } else {
                    ck2 ck2Var = zg0Var.z.a.b;
                    long j2 = (ck2Var == null || (vp0Var4 = ck2Var.a) == null) ? 0L : ((ny0) vp0Var4.h(new vy0(j))).a;
                    ck2 ck2Var2 = zg0Var.A.a.b;
                    long j3 = (ck2Var2 == null || (vp0Var3 = ck2Var2.a) == null) ? 0L : ((ny0) vp0Var3.h(new vy0(j))).a;
                    int iOrdinal3 = kg0Var.ordinal();
                    if (iOrdinal3 == 0) {
                        jB = j2;
                    } else if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            wg.n();
                            return null;
                        }
                        jB = j3;
                    }
                }
                return new ny0(jB);
            default:
                kg0 kg0Var2 = (kg0) obj;
                if (zg0Var.F != null && zg0Var.J0() != null && !uz0.g(zg0Var.F, zg0Var.J0()) && (iOrdinal = kg0Var2.ordinal()) != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        wg.n();
                        return null;
                    }
                    bs bsVar3 = zg0Var.A.a.c;
                    if (bsVar3 != null) {
                        vp0 vp0Var5 = bsVar3.b;
                        long j4 = this.k;
                        long j5 = ((vy0) vp0Var5.h(new vy0(j4))).a;
                        d5 d5VarJ0 = zg0Var.J0();
                        d5VarJ0.getClass();
                        u31 u31Var = u31.h;
                        long jA = ((dm) d5VarJ0).a(j4, j5, u31Var);
                        d5 d5Var = zg0Var.F;
                        d5Var.getClass();
                        jB = ny0.b(jA, d5Var.a(j4, j5, u31Var));
                    }
                }
                return new ny0(jB);
        }
    }
}
