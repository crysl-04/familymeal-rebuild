package defpackage;

import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.b;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wj implements kr0 {
    public static final wj a;
    private static final rh2 descriptor;

    static {
        wj wjVar = new wj();
        a = wjVar;
        o02 o02Var = new o02("com.familymeal.core.io.BackupCodec.FileDto", wjVar, 9);
        o02Var.l("format", false);
        o02Var.l("version", false);
        o02Var.l("exported_at", false);
        o02Var.l("includes_body_data", false);
        o02Var.l("ingredients", false);
        o02Var.l("recipes", false);
        o02Var.l("persons", false);
        o02Var.l("weight_entries", true);
        o02Var.l("schedule", false);
        descriptor = o02Var;
    }

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        rh2 rh2Var = descriptor;
        hz hzVarD = v60Var.D(rh2Var);
        d51[] d51VarArr = yj.j;
        Map map = null;
        String strP = null;
        String strP2 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        boolean z = true;
        int i = 0;
        int iZ = 0;
        boolean zU = false;
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
                    iZ = hzVarD.z(rh2Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strP2 = hzVarD.p(rh2Var, 2);
                    i |= 4;
                    break;
                case 3:
                    zU = hzVarD.u(rh2Var, 3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) hzVarD.y(rh2Var, 4, (r21) d51VarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) hzVarD.y(rh2Var, 5, (r21) d51VarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    list3 = (List) hzVarD.y(rh2Var, 6, (r21) d51VarArr[6].getValue(), list3);
                    i |= 64;
                    break;
                case 7:
                    list4 = (List) hzVarD.y(rh2Var, 7, (r21) d51VarArr[7].getValue(), list4);
                    i |= 128;
                    break;
                case DatabaseUtils.STATEMENT_DDL /* 8 */:
                    map = (Map) hzVarD.y(rh2Var, 8, (r21) d51VarArr[8].getValue(), map);
                    i |= 256;
                    break;
                default:
                    throw new l23(iH);
            }
        }
        hzVarD.s(rh2Var);
        return new yj(i, strP, iZ, strP2, zU, list, list2, list3, list4, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kr0
    public final r21[] b() {
        d51[] d51VarArr = yj.j;
        bo2 bo2Var = bo2.a;
        return new r21[]{bo2Var, ty0.a, bo2Var, sn.a, d51VarArr[4].getValue(), d51VarArr[5].getValue(), d51VarArr[6].getValue(), d51VarArr[7].getValue(), d51VarArr[8].getValue()};
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        yj yjVar = (yj) obj;
        yjVar.getClass();
        rh2 rh2Var = descriptor;
        b bVarA = bVar.a(rh2Var);
        d51[] d51VarArr = yj.j;
        String str = yjVar.a;
        List list = yjVar.h;
        bVarA.s(rh2Var, 0, str);
        int i = yjVar.b;
        bVarA.g(rh2Var, 1);
        bVarA.k(i);
        bVarA.s(rh2Var, 2, yjVar.c);
        boolean z = yjVar.d;
        bVarA.g(rh2Var, 3);
        bVarA.b(z);
        bVarA.o(rh2Var, 4, (r21) d51VarArr[4].getValue(), yjVar.e);
        bVarA.o(rh2Var, 5, (r21) d51VarArr[5].getValue(), yjVar.f);
        bVarA.o(rh2Var, 6, (r21) d51VarArr[6].getValue(), yjVar.g);
        if (bVarA.u(rh2Var) || !uz0.g(list, ag0.h)) {
            bVarA.o(rh2Var, 7, (r21) d51VarArr[7].getValue(), list);
        }
        bVarA.o(rh2Var, 8, (r21) d51VarArr[8].getValue(), yjVar.i);
        bVarA.t(rh2Var);
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return descriptor;
    }
}
