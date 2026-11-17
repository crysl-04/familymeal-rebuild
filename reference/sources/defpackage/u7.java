package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u7 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ long i;

    public /* synthetic */ u7(long j, byte b) {
        this.h = b;
        this.i = j;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        rq rqVar;
        Object d92Var;
        byte b = this.h;
        long j = this.i;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                zp zpVar = (zp) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (zpVar.h.d() >> 32)) / 2.0f;
                return zpVar.a(new v7(fIntBitsToFloat, (Object) h7.Z(zpVar, fIntBitsToFloat), (Object) new ln(5, j), (byte) 0));
            case 1:
                yo yoVar = (yo) obj;
                vp0 vp0Var = yoVar.b;
                if (vp0Var != null && (rqVar = yoVar.a) != null) {
                    try {
                        d92Var = vp0Var.h(Long.valueOf(j));
                    } catch (Throwable th) {
                        d92Var = new d92(th);
                    }
                    rqVar.g(d92Var);
                    break;
                }
                return j23Var;
            default:
                ((dh2) obj).a(mg2.a, new lg2(os0.h, this.i, kg2.i, true));
                return j23Var;
        }
    }
}
