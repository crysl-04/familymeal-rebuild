package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a72 implements kr0 {
    public static final a72 a;
    private static final rh2 descriptor;

    static {
        a72 a72Var = new a72();
        a = a72Var;
        o02 o02Var = new o02("com.familymeal.core.io.RecipeIngredientDto", a72Var, 2);
        o02Var.l("id", false);
        o02Var.l("amount_g", false);
        descriptor = o02Var;
    }

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        rh2 rh2Var = descriptor;
        hz hzVarD = v60Var.D(rh2Var);
        String strP = null;
        double dW = 0.0d;
        boolean z = true;
        int i = 0;
        while (z) {
            int iH = hzVarD.h(rh2Var);
            if (iH == -1) {
                z = false;
            } else if (iH == 0) {
                strP = hzVarD.p(rh2Var, 0);
                i |= 1;
            } else {
                if (iH != 1) {
                    throw new l23(iH);
                }
                dW = hzVarD.w(rh2Var, 1);
                i |= 2;
            }
        }
        hzVarD.s(rh2Var);
        return new c72(i, strP, dW);
    }

    @Override // defpackage.kr0
    public final r21[] b() {
        return new r21[]{bo2.a, zb0.a};
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        c72 c72Var = (c72) obj;
        c72Var.getClass();
        rh2 rh2Var = descriptor;
        b bVarA = bVar.a(rh2Var);
        bVarA.s(rh2Var, 0, c72Var.a);
        bVarA.f(rh2Var, 1, c72Var.b);
        bVarA.t(rh2Var);
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return descriptor;
    }
}
