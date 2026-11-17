package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ck implements kr0 {
    public static final ck a;
    private static final rh2 descriptor;

    static {
        ck ckVar = new ck();
        a = ckVar;
        o02 o02Var = new o02("com.familymeal.core.io.BackupCodec.WeightDto", ckVar, 3);
        o02Var.l("person_id", false);
        o02Var.l("date", false);
        o02Var.l("weight_kg", false);
        descriptor = o02Var;
    }

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        rh2 rh2Var = descriptor;
        hz hzVarD = v60Var.D(rh2Var);
        int i = 0;
        String strP = null;
        String strP2 = null;
        double dW = 0.0d;
        boolean z = true;
        while (z) {
            int iH = hzVarD.h(rh2Var);
            if (iH == -1) {
                z = false;
            } else if (iH == 0) {
                strP = hzVarD.p(rh2Var, 0);
                i |= 1;
            } else if (iH == 1) {
                strP2 = hzVarD.p(rh2Var, 1);
                i |= 2;
            } else {
                if (iH != 2) {
                    throw new l23(iH);
                }
                dW = hzVarD.w(rh2Var, 2);
                i |= 4;
            }
        }
        hzVarD.s(rh2Var);
        return new ek(dW, i, strP, strP2);
    }

    @Override // defpackage.kr0
    public final r21[] b() {
        bo2 bo2Var = bo2.a;
        return new r21[]{bo2Var, bo2Var, zb0.a};
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        ek ekVar = (ek) obj;
        ekVar.getClass();
        rh2 rh2Var = descriptor;
        b bVarA = bVar.a(rh2Var);
        bVarA.s(rh2Var, 0, ekVar.a);
        bVarA.s(rh2Var, 1, ekVar.b);
        bVarA.f(rh2Var, 2, ekVar.c);
        bVarA.t(rh2Var);
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return descriptor;
    }
}
