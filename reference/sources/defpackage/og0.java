package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class og0 extends m31 implements vp0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ og0(Object obj, Object obj2, byte b) {
        super(1);
        this.i = b;
        this.j = obj;
        this.k = obj2;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        oj0 oj0Var;
        oj0 oj0Var2;
        byte b = this.i;
        kg0 kg0Var = kg0.j;
        kg0 kg0Var2 = kg0.i;
        kg0 kg0Var3 = kg0.h;
        Object obj2 = this.j;
        Object obj3 = this.k;
        switch (b) {
            case 0:
                mz2 mz2Var = (mz2) obj;
                if (mz2Var.c(kg0Var3, kg0Var2)) {
                    ri0 ri0Var = ((ah0) obj2).a.a;
                    return (ri0Var == null || (oj0Var2 = ri0Var.b) == null) ? vg0.b : oj0Var2;
                }
                if (!mz2Var.c(kg0Var2, kg0Var)) {
                    return vg0.b;
                }
                ri0 ri0Var2 = ((wh0) obj3).a.a;
                return (ri0Var2 == null || (oj0Var = ri0Var2.b) == null) ? vg0.b : oj0Var;
            case 1:
                mz2 mz2Var2 = (mz2) obj;
                if (mz2Var2.c(kg0Var3, kg0Var2)) {
                    ad2 ad2Var = ((ah0) obj2).a.d;
                    return ad2Var != null ? ad2Var.c : vg0.b;
                }
                if (!mz2Var2.c(kg0Var2, kg0Var)) {
                    return vg0.b;
                }
                ad2 ad2Var2 = ((wh0) obj3).a.d;
                return ad2Var2 != null ? ad2Var2.c : vg0.b;
            default:
                ny1 ny1Var = (ny1) obj2;
                float f = ((y93) obj3).v;
                ((my1) obj).g(ny1Var);
                ny1Var.n0(ny0.c(0L, ny1Var.l), f, null);
                return j23.a;
        }
    }
}
