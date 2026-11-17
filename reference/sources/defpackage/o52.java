package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o52 implements kr0 {
    public static final o52 a;
    private static final rh2 descriptor;

    static {
        o52 o52Var = new o52();
        a = o52Var;
        o02 o02Var = new o02("com.familymeal.core.io.RangeDto", o52Var, 2);
        o02Var.l("min", true);
        o02Var.l("max", true);
        descriptor = o02Var;
    }

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        rh2 rh2Var = descriptor;
        hz hzVarD = v60Var.D(rh2Var);
        double dW = 0.0d;
        Double d = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iH = hzVarD.h(rh2Var);
            if (iH == -1) {
                z = false;
            } else if (iH == 0) {
                dW = hzVarD.w(rh2Var, 0);
                i |= 1;
            } else {
                if (iH != 1) {
                    throw new l23(iH);
                }
                d = (Double) hzVarD.g(rh2Var, 1, zb0.a, d);
                i |= 2;
            }
        }
        hzVarD.s(rh2Var);
        return new q52(i, dW, d);
    }

    @Override // defpackage.kr0
    public final r21[] b() {
        zb0 zb0Var = zb0.a;
        return new r21[]{zb0Var, ia2.l(zb0Var)};
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        q52 q52Var = (q52) obj;
        q52Var.getClass();
        Double d = q52Var.b;
        double d2 = q52Var.a;
        rh2 rh2Var = descriptor;
        b bVarA = bVar.a(rh2Var);
        if (bVarA.u(rh2Var) || Double.compare(d2, 0.0d) != 0) {
            bVarA.f(rh2Var, 0, d2);
        }
        if (bVarA.u(rh2Var) || d != null) {
            bVarA.n(rh2Var, 1, zb0.a, d);
        }
        bVarA.t(rh2Var);
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return descriptor;
    }
}
