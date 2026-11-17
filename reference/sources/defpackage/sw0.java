package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class sw0 implements bq0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ List i;
    public final /* synthetic */ vp0 j;

    public /* synthetic */ sw0(List list, vp0 vp0Var, byte b) {
        this.h = b;
        this.i = list;
        this.j = vp0Var;
    }

    @Override // defpackage.bq0
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.h;
        j23 j23Var = j23.a;
        yy yyVar = zy.a;
        List list = this.i;
        vp0 vp0Var = this.j;
        byte b2 = 2;
        byte b3 = 0;
        byte b4 = 1;
        switch (b) {
            case 0:
                g61 g61Var = (g61) obj;
                int iIntValue = ((Number) obj2).intValue();
                dr0 dr0Var = (dr0) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i = (iIntValue2 & 6) == 0 ? (dr0Var.f(g61Var) ? 4 : 2) | iIntValue2 : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i |= dr0Var.d(iIntValue) ? 32 : 16;
                }
                if (!dr0Var.N(i & 1, (i & 147) != 146)) {
                    dr0Var.Q();
                } else {
                    uv0 uv0Var = (uv0) list.get(iIntValue);
                    dr0Var.V(328235815);
                    boolean zF = dr0Var.f(vp0Var) | dr0Var.h(uv0Var);
                    Object objK = dr0Var.K();
                    if (zF || objK == yyVar) {
                        objK = new pw0(vp0Var, uv0Var, (byte) 0);
                        dr0Var.f0(objK);
                    }
                    cu.k(dt.N(-1313855155, new qw0(uv0Var, b3), dr0Var), h7.X(og1.h, false, "编辑", null, (kp0) objK, 13), dt.N(-1465341590, new qw0(uv0Var, b4), dr0Var), null, null, dr0Var, 3078, 500);
                    ie1.c(null, 0.0f, 0L, dr0Var, 0, 7);
                    dr0Var.p(false);
                }
                break;
            case 1:
                g61 g61Var2 = (g61) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dr0 dr0Var2 = (dr0) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i2 = (iIntValue4 & 6) == 0 ? (dr0Var2.f(g61Var2) ? 4 : 2) | iIntValue4 : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i2 |= dr0Var2.d(iIntValue3) ? 32 : 16;
                }
                if (!dr0Var2.N(i2 & 1, (i2 & 147) != 146)) {
                    dr0Var2.Q();
                } else {
                    uv0 uv0Var2 = (uv0) list.get(iIntValue3);
                    dr0Var2.V(937029106);
                    boolean zF2 = dr0Var2.f(vp0Var) | dr0Var2.h(uv0Var2);
                    Object objK2 = dr0Var2.K();
                    if (zF2 || objK2 == yyVar) {
                        objK2 = new pw0(vp0Var, uv0Var2, (byte) 1);
                        dr0Var2.f0(objK2);
                    }
                    cu.k(dt.N(-70846461, new qw0(uv0Var2, b2), dr0Var2), h7.X(og1.h, false, null, null, (kp0) objK2, 15), dt.N(-1198346874, new qw0(uv0Var2, (byte) 3), dr0Var2), null, null, dr0Var2, 3078, 500);
                    dr0Var2.p(false);
                }
                break;
            default:
                g61 g61Var3 = (g61) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                dr0 dr0Var3 = (dr0) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i3 = (iIntValue6 & 6) == 0 ? (dr0Var3.f(g61Var3) ? 4 : 2) | iIntValue6 : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i3 |= dr0Var3.d(iIntValue5) ? 32 : 16;
                }
                if (!dr0Var3.N(i3 & 1, (i3 & 147) != 146)) {
                    dr0Var3.Q();
                } else {
                    j62 j62Var = (j62) ((ArrayList) list).get(iIntValue5);
                    dr0Var3.V(-550740419);
                    bp1 bp1VarB = j62Var.b();
                    boolean zF3 = dr0Var3.f(vp0Var) | dr0Var3.h(j62Var);
                    Object objK3 = dr0Var3.K();
                    if (zF3 || objK3 == yyVar) {
                        objK3 = new xw1((byte) 1, vp0Var, j62Var);
                        dr0Var3.f0(objK3);
                    }
                    cu.k(dt.N(-91877207, new p70(j62Var, (byte) 7), dr0Var3), h7.X(og1.h, false, "编辑", null, (kp0) objK3, 13), dt.N(-124473594, new rl(j62Var, bp1VarB, (byte) 8), dr0Var3), null, null, dr0Var3, 3078, 500);
                    ie1.c(null, 0.0f, 0L, dr0Var3, 0, 7);
                    dr0Var3.p(false);
                }
                break;
        }
        return j23Var;
    }
}
