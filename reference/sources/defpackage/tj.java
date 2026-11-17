package defpackage;

import java.util.List;
import kotlinx.serialization.json.internal.b;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tj implements kr0 {
    public static final tj a;
    private static final rh2 descriptor;

    static {
        tj tjVar = new tj();
        a = tjVar;
        o02 o02Var = new o02("com.familymeal.core.io.BackupCodec.BackupPersonDto", tjVar, 14);
        o02Var.l("id", false);
        o02Var.l("name", false);
        o02Var.l("gender", false);
        o02Var.l("activity", false);
        o02Var.l("goal", false);
        o02Var.l("pace", false);
        o02Var.l("excluded_ingredients", true);
        o02Var.l("birth_year", true);
        o02Var.l("height_cm", true);
        o02Var.l("weight_kg", true);
        o02Var.l("target_weight_kg", true);
        o02Var.l("manual_targets", true);
        o02Var.l("kcal_offset", true);
        o02Var.l("last_adjusted", true);
        descriptor = o02Var;
    }

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        rh2 rh2Var = descriptor;
        hz hzVarD = v60Var.D(rh2Var);
        d51[] d51VarArr = vj.o;
        Double d = null;
        String str = null;
        Double d2 = null;
        vs2 vs2Var = null;
        Double d3 = null;
        Double d4 = null;
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        String strP4 = null;
        String strP5 = null;
        List list = null;
        Integer num = null;
        String strP6 = null;
        int i = 0;
        boolean z = true;
        while (true) {
            String str2 = strP;
            if (!z) {
                hzVarD.s(rh2Var);
                return new vj(i, strP6, str2, strP2, strP3, strP4, strP5, list, num, d, d3, d4, vs2Var, d2, str);
            }
            int iH = hzVarD.h(rh2Var);
            switch (iH) {
                case -1:
                    z = false;
                    strP = str2;
                    strP2 = strP2;
                    break;
                case 0:
                    strP6 = hzVarD.p(rh2Var, 0);
                    i |= 1;
                    strP = str2;
                    strP2 = strP2;
                    break;
                case 1:
                    strP2 = strP2;
                    i |= 2;
                    strP = hzVarD.p(rh2Var, 1);
                    strP2 = strP2;
                    break;
                case 2:
                    strP2 = hzVarD.p(rh2Var, 2);
                    i |= 4;
                    strP = str2;
                    break;
                case 3:
                    strP3 = hzVarD.p(rh2Var, 3);
                    i |= 8;
                    strP = str2;
                    break;
                case 4:
                    strP4 = hzVarD.p(rh2Var, 4);
                    i |= 16;
                    strP = str2;
                    break;
                case 5:
                    strP5 = hzVarD.p(rh2Var, 5);
                    i |= 32;
                    strP = str2;
                    break;
                case 6:
                    list = (List) hzVarD.y(rh2Var, 6, (r21) d51VarArr[6].getValue(), list);
                    i |= 64;
                    strP = str2;
                    strP2 = strP2;
                    break;
                case 7:
                    num = (Integer) hzVarD.g(rh2Var, 7, ty0.a, num);
                    i |= 128;
                    strP = str2;
                    strP2 = strP2;
                    break;
                case DatabaseUtils.STATEMENT_DDL /* 8 */:
                    d = (Double) hzVarD.g(rh2Var, 8, zb0.a, d);
                    i |= 256;
                    strP = str2;
                    strP2 = strP2;
                    break;
                case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                    d3 = (Double) hzVarD.g(rh2Var, 9, zb0.a, d3);
                    i |= 512;
                    strP = str2;
                    strP2 = strP2;
                    break;
                case 10:
                    d4 = (Double) hzVarD.g(rh2Var, 10, zb0.a, d4);
                    i |= 1024;
                    strP = str2;
                    strP2 = strP2;
                    break;
                case 11:
                    vs2Var = (vs2) hzVarD.g(rh2Var, 11, ts2.a, vs2Var);
                    i |= 2048;
                    strP = str2;
                    strP2 = strP2;
                    break;
                case 12:
                    d2 = (Double) hzVarD.g(rh2Var, 12, zb0.a, d2);
                    i |= 4096;
                    strP = str2;
                    strP2 = strP2;
                    break;
                case 13:
                    str = (String) hzVarD.g(rh2Var, 13, bo2.a, str);
                    i |= 8192;
                    strP = str2;
                    strP2 = strP2;
                    break;
                default:
                    throw new l23(iH);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kr0
    public final r21[] b() {
        d51[] d51VarArr = vj.o;
        bo2 bo2Var = bo2.a;
        zb0 zb0Var = zb0.a;
        return new r21[]{bo2Var, bo2Var, bo2Var, bo2Var, bo2Var, bo2Var, d51VarArr[6].getValue(), ia2.l(ty0.a), ia2.l(zb0Var), ia2.l(zb0Var), ia2.l(zb0Var), ia2.l(ts2.a), ia2.l(zb0Var), ia2.l(bo2Var)};
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        vj vjVar = (vj) obj;
        vjVar.getClass();
        rh2 rh2Var = descriptor;
        b bVarA = bVar.a(rh2Var);
        d51[] d51VarArr = vj.o;
        String str = vjVar.a;
        String str2 = vjVar.n;
        Double d = vjVar.m;
        vs2 vs2Var = vjVar.l;
        Double d2 = vjVar.k;
        Double d3 = vjVar.j;
        Double d4 = vjVar.i;
        Integer num = vjVar.h;
        List list = vjVar.g;
        bVarA.s(rh2Var, 0, str);
        bVarA.s(rh2Var, 1, vjVar.b);
        bVarA.s(rh2Var, 2, vjVar.c);
        bVarA.s(rh2Var, 3, vjVar.d);
        bVarA.s(rh2Var, 4, vjVar.e);
        bVarA.s(rh2Var, 5, vjVar.f);
        if (bVarA.u(rh2Var) || !uz0.g(list, ag0.h)) {
            bVarA.o(rh2Var, 6, (r21) d51VarArr[6].getValue(), list);
        }
        if (bVarA.u(rh2Var) || num != null) {
            bVarA.n(rh2Var, 7, ty0.a, num);
        }
        if (bVarA.u(rh2Var) || d4 != null) {
            bVarA.n(rh2Var, 8, zb0.a, d4);
        }
        if (bVarA.u(rh2Var) || d3 != null) {
            bVarA.n(rh2Var, 9, zb0.a, d3);
        }
        if (bVarA.u(rh2Var) || d2 != null) {
            bVarA.n(rh2Var, 10, zb0.a, d2);
        }
        if (bVarA.u(rh2Var) || vs2Var != null) {
            bVarA.n(rh2Var, 11, ts2.a, vs2Var);
        }
        if (bVarA.u(rh2Var) || d != null) {
            bVarA.n(rh2Var, 12, zb0.a, d);
        }
        if (bVarA.u(rh2Var) || str2 != null) {
            bVarA.n(rh2Var, 13, bo2.a, str2);
        }
        bVarA.t(rh2Var);
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return descriptor;
    }
}
