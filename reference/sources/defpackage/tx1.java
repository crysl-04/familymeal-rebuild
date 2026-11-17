package defpackage;

import java.util.List;
import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tx1 implements kr0 {
    public static final tx1 a;
    private static final rh2 descriptor;

    static {
        tx1 tx1Var = new tx1();
        a = tx1Var;
        o02 o02Var = new o02("com.familymeal.core.io.PersonDto", tx1Var, 7);
        o02Var.l("id", false);
        o02Var.l("name", false);
        o02Var.l("age", false);
        o02Var.l("gender", false);
        o02Var.l("goal", false);
        o02Var.l("daily_targets", false);
        o02Var.l("excluded_ingredients", true);
        descriptor = o02Var;
    }

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        rh2 rh2Var = descriptor;
        hz hzVarD = v60Var.D(rh2Var);
        d51[] d51VarArr = vx1.h;
        int i = 0;
        int iZ = 0;
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        String strP4 = null;
        vs2 vs2Var = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iH = hzVarD.h(rh2Var);
            switch (iH) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strP = hzVarD.p(rh2Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strP2 = hzVarD.p(rh2Var, 1);
                    i |= 2;
                    break;
                case 2:
                    iZ = hzVarD.z(rh2Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strP3 = hzVarD.p(rh2Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strP4 = hzVarD.p(rh2Var, 4);
                    i |= 16;
                    break;
                case 5:
                    vs2Var = (vs2) hzVarD.y(rh2Var, 5, ts2.a, vs2Var);
                    i |= 32;
                    break;
                case 6:
                    list = (List) hzVarD.y(rh2Var, 6, (r21) d51VarArr[6].getValue(), list);
                    i |= 64;
                    break;
                default:
                    throw new l23(iH);
            }
        }
        hzVarD.s(rh2Var);
        return new vx1(i, strP, strP2, iZ, strP3, strP4, vs2Var, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kr0
    public final r21[] b() {
        d51[] d51VarArr = vx1.h;
        bo2 bo2Var = bo2.a;
        return new r21[]{bo2Var, bo2Var, ty0.a, bo2Var, bo2Var, ts2.a, d51VarArr[6].getValue()};
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        vx1 vx1Var = (vx1) obj;
        vx1Var.getClass();
        rh2 rh2Var = descriptor;
        b bVarA = bVar.a(rh2Var);
        d51[] d51VarArr = vx1.h;
        String str = vx1Var.a;
        List list = vx1Var.g;
        bVarA.s(rh2Var, 0, str);
        bVarA.s(rh2Var, 1, vx1Var.b);
        int i = vx1Var.c;
        bVarA.g(rh2Var, 2);
        bVarA.k(i);
        bVarA.s(rh2Var, 3, vx1Var.d);
        bVarA.s(rh2Var, 4, vx1Var.e);
        bVarA.o(rh2Var, 5, ts2.a, vx1Var.f);
        if (bVarA.u(rh2Var) || !uz0.g(list, ag0.h)) {
            bVarA.o(rh2Var, 6, (r21) d51VarArr[6].getValue(), list);
        }
        bVarA.t(rh2Var);
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return descriptor;
    }
}
