package defpackage;

import java.util.List;
import kotlinx.serialization.json.internal.b;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o62 implements kr0 {
    public static final o62 a;
    private static final rh2 descriptor;

    static {
        o62 o62Var = new o62();
        a = o62Var;
        o02 o02Var = new o02("com.familymeal.core.io.RecipeDto", o62Var, 11);
        o02Var.l("id", false);
        o02Var.l("name", false);
        o02Var.l("meal_types", false);
        o02Var.l("category", false);
        o02Var.l("base_servings", false);
        o02Var.l("min_diners", true);
        o02Var.l("ingredients", false);
        o02Var.l("total_nutrients", false);
        o02Var.l("tags", true);
        o02Var.l("season", false);
        o02Var.l("quick", false);
        descriptor = o02Var;
    }

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        rh2 rh2Var = descriptor;
        hz hzVarD = v60Var.D(rh2Var);
        d51[] d51VarArr = q62.l;
        List list = null;
        String strP = null;
        String strP2 = null;
        List list2 = null;
        String strP3 = null;
        List list3 = null;
        ep1 ep1Var = null;
        String strP4 = null;
        boolean z = true;
        int i = 0;
        int iZ = 0;
        int iZ2 = 0;
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
                    strP2 = hzVarD.p(rh2Var, 1);
                    i |= 2;
                    break;
                case 2:
                    list2 = (List) hzVarD.y(rh2Var, 2, (r21) d51VarArr[2].getValue(), list2);
                    i |= 4;
                    break;
                case 3:
                    strP3 = hzVarD.p(rh2Var, 3);
                    i |= 8;
                    break;
                case 4:
                    iZ = hzVarD.z(rh2Var, 4);
                    i |= 16;
                    break;
                case 5:
                    iZ2 = hzVarD.z(rh2Var, 5);
                    i |= 32;
                    break;
                case 6:
                    list3 = (List) hzVarD.y(rh2Var, 6, (r21) d51VarArr[6].getValue(), list3);
                    i |= 64;
                    break;
                case 7:
                    ep1Var = (ep1) hzVarD.y(rh2Var, 7, cp1.a, ep1Var);
                    i |= 128;
                    break;
                case DatabaseUtils.STATEMENT_DDL /* 8 */:
                    list = (List) hzVarD.y(rh2Var, 8, (r21) d51VarArr[8].getValue(), list);
                    i |= 256;
                    break;
                case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                    strP4 = hzVarD.p(rh2Var, 9);
                    i |= 512;
                    break;
                case 10:
                    zU = hzVarD.u(rh2Var, 10);
                    i |= 1024;
                    break;
                default:
                    throw new l23(iH);
            }
        }
        hzVarD.s(rh2Var);
        return new q62(i, strP, strP2, list2, strP3, iZ, iZ2, list3, ep1Var, list, strP4, zU);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kr0
    public final r21[] b() {
        d51[] d51VarArr = q62.l;
        bo2 bo2Var = bo2.a;
        ty0 ty0Var = ty0.a;
        return new r21[]{bo2Var, bo2Var, d51VarArr[2].getValue(), bo2Var, ty0Var, ty0Var, d51VarArr[6].getValue(), cp1.a, d51VarArr[8].getValue(), bo2Var, sn.a};
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        q62 q62Var = (q62) obj;
        q62Var.getClass();
        rh2 rh2Var = descriptor;
        b bVarA = bVar.a(rh2Var);
        d51[] d51VarArr = q62.l;
        String str = q62Var.a;
        List list = q62Var.i;
        int i = q62Var.f;
        bVarA.s(rh2Var, 0, str);
        bVarA.s(rh2Var, 1, q62Var.b);
        bVarA.o(rh2Var, 2, (r21) d51VarArr[2].getValue(), q62Var.c);
        bVarA.s(rh2Var, 3, q62Var.d);
        int i2 = q62Var.e;
        bVarA.g(rh2Var, 4);
        bVarA.k(i2);
        if (bVarA.u(rh2Var) || i != 1) {
            bVarA.g(rh2Var, 5);
            bVarA.k(i);
        }
        bVarA.o(rh2Var, 6, (r21) d51VarArr[6].getValue(), q62Var.g);
        bVarA.o(rh2Var, 7, cp1.a, q62Var.h);
        if (bVarA.u(rh2Var) || !uz0.g(list, ag0.h)) {
            bVarA.o(rh2Var, 8, (r21) d51VarArr[8].getValue(), list);
        }
        bVarA.s(rh2Var, 9, q62Var.j);
        boolean z = q62Var.k;
        bVarA.g(rh2Var, 10);
        bVarA.b(z);
        bVarA.t(rh2Var);
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return descriptor;
    }
}
