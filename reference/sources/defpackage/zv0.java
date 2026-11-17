package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zv0 implements kr0 {
    public static final zv0 a;
    private static final rh2 descriptor;

    static {
        zv0 zv0Var = new zv0();
        a = zv0Var;
        o02 o02Var = new o02("com.familymeal.core.io.IngredientDto", zv0Var, 4);
        o02Var.l("id", false);
        o02Var.l("name", false);
        o02Var.l("category", false);
        o02Var.l("per_100g", false);
        descriptor = o02Var;
    }

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        rh2 rh2Var = descriptor;
        hz hzVarD = v60Var.D(rh2Var);
        int i = 0;
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        ep1 ep1Var = null;
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
            } else if (iH == 2) {
                strP3 = hzVarD.p(rh2Var, 2);
                i |= 4;
            } else {
                if (iH != 3) {
                    throw new l23(iH);
                }
                ep1Var = (ep1) hzVarD.y(rh2Var, 3, cp1.a, ep1Var);
                i |= 8;
            }
        }
        hzVarD.s(rh2Var);
        return new bw0(i, strP, strP2, strP3, ep1Var);
    }

    @Override // defpackage.kr0
    public final r21[] b() {
        bo2 bo2Var = bo2.a;
        return new r21[]{bo2Var, bo2Var, bo2Var, cp1.a};
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        bw0 bw0Var = (bw0) obj;
        bw0Var.getClass();
        rh2 rh2Var = descriptor;
        b bVarA = bVar.a(rh2Var);
        bVarA.s(rh2Var, 0, bw0Var.a);
        bVarA.s(rh2Var, 1, bw0Var.b);
        bVarA.s(rh2Var, 2, bw0Var.c);
        bVarA.o(rh2Var, 3, cp1.a, bw0Var.d);
        bVarA.t(rh2Var);
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return descriptor;
    }
}
