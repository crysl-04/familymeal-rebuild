package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cp1 implements kr0 {
    public static final cp1 a;
    private static final rh2 descriptor;

    static {
        cp1 cp1Var = new cp1();
        a = cp1Var;
        o02 o02Var = new o02("com.familymeal.core.io.NutrientsDto", cp1Var, 5);
        o02Var.l("kcal", false);
        o02Var.l("protein", false);
        o02Var.l("fat", false);
        o02Var.l("carb", false);
        o02Var.l("fiber", false);
        descriptor = o02Var;
    }

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        rh2 rh2Var = descriptor;
        hz hzVarD = v60Var.D(rh2Var);
        int i = 0;
        double dW = 0.0d;
        double dW2 = 0.0d;
        double dW3 = 0.0d;
        double dW4 = 0.0d;
        double dW5 = 0.0d;
        boolean z = true;
        while (z) {
            int iH = hzVarD.h(rh2Var);
            if (iH == -1) {
                z = false;
            } else if (iH == 0) {
                dW = hzVarD.w(rh2Var, 0);
                i |= 1;
            } else if (iH == 1) {
                dW2 = hzVarD.w(rh2Var, 1);
                i |= 2;
            } else if (iH == 2) {
                dW3 = hzVarD.w(rh2Var, 2);
                i |= 4;
            } else if (iH == 3) {
                dW4 = hzVarD.w(rh2Var, 3);
                i |= 8;
            } else {
                if (iH != 4) {
                    throw new l23(iH);
                }
                dW5 = hzVarD.w(rh2Var, 4);
                i |= 16;
            }
        }
        hzVarD.s(rh2Var);
        return new ep1(i, dW, dW2, dW3, dW4, dW5);
    }

    @Override // defpackage.kr0
    public final r21[] b() {
        zb0 zb0Var = zb0.a;
        return new r21[]{zb0Var, zb0Var, zb0Var, zb0Var, zb0Var};
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        ep1 ep1Var = (ep1) obj;
        ep1Var.getClass();
        rh2 rh2Var = descriptor;
        b bVarA = bVar.a(rh2Var);
        bVarA.f(rh2Var, 0, ep1Var.a);
        bVarA.f(rh2Var, 1, ep1Var.b);
        bVarA.f(rh2Var, 2, ep1Var.c);
        bVarA.f(rh2Var, 3, ep1Var.d);
        bVarA.f(rh2Var, 4, ep1Var.e);
        bVarA.t(rh2Var);
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return descriptor;
    }
}
