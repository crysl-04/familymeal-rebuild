package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class h63 implements bq0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ List i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ h63(List list, Object obj, Object obj2, byte b) {
        this.h = b;
        this.i = list;
        this.j = obj;
        this.k = obj2;
    }

    @Override // defpackage.bq0
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        String strT;
        String str2;
        byte b = this.h;
        j23 j23Var = j23.a;
        Object obj5 = this.j;
        List list = this.i;
        Object obj6 = this.k;
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
                    p60 p60Var = (p60) ((ArrayList) list).get(iIntValue);
                    dr0Var.V(1360941161);
                    t03.d(yj2.a, null, null, null, dt.N(-1054039988, new g63(p60Var, (LinkedHashMap) obj5, (LinkedHashMap) obj6), dr0Var), dr0Var, 196614);
                    dr0Var.p(false);
                }
                break;
            default:
                g61 g61Var2 = (g61) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dr0 dr0Var2 = (dr0) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                p63 p63Var = (p63) obj6;
                int i2 = (iIntValue4 & 6) == 0 ? (dr0Var2.f(g61Var2) ? 4 : 2) | iIntValue4 : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i2 |= dr0Var2.d(iIntValue3) ? 32 : 16;
                }
                if (!dr0Var2.N(i2 & 1, (i2 & 147) != 146)) {
                    dr0Var2.Q();
                } else {
                    nz1 nz1Var = (nz1) list.get(iIntValue3);
                    dr0Var2.V(3444699);
                    boolean zContains = ((Set) obj5).contains(nz1Var.b);
                    cm cmVar = c5.s;
                    yi0 yi0Var = yj2.a;
                    ba2 ba2Var = new ba2(1);
                    boolean zH = dr0Var2.h(p63Var) | dr0Var2.h(nz1Var) | dr0Var2.g(zContains);
                    Object objK = dr0Var2.K();
                    if (zH || objK == zy.a) {
                        objK = new l63(p63Var, nz1Var, zContains);
                        dr0Var2.f0(objK);
                    }
                    rg1 rg1VarH = t03.H(h7.X(yi0Var, false, null, ba2Var, (kp0) objK, 11), 8.0f, 0.0f, 2);
                    ua2 ua2VarA = ta2.a(uz0.e, cmVar, dr0Var2, 48);
                    int iHashCode = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL = dr0Var2.l();
                    rg1 rg1VarU = ls.U(dr0Var2, rg1VarH);
                    sy.f.getClass();
                    dr0Var2.Y();
                    if (dr0Var2.S) {
                        dr0Var2.k(l41.W);
                    } else {
                        dr0Var2.i0();
                    }
                    h12.y(c5.F, dr0Var2, ua2VarA);
                    h12.y(c5.E, dr0Var2, dx1VarL);
                    h12.y(c5.G, dr0Var2, Integer.valueOf(iHashCode));
                    h12.t(dr0Var2);
                    h12.y(c5.D, dr0Var2, rg1VarU);
                    dt.f(zContains, null, false, null, dr0Var2, 48);
                    uv0 uv0Var = nz1Var.a;
                    if (uv0Var == null || (str = uv0Var.b) == null) {
                        str = nz1Var.b;
                    }
                    gw2.b(str, tz0.k(new b51(1.0f, true), zContains ? 0.5f : 1.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var2, 0, 0, 262140);
                    double d = nz1Var.c;
                    if (d >= 1000.0d) {
                        strT = t03.t(2, d / 1000.0d);
                        str2 = " kg";
                    } else {
                        strT = t03.t(0, d);
                        str2 = " g";
                    }
                    gw2.b(strT.concat(str2), tz0.k(t03.J(og1.h, 0.0f, 0.0f, 8.0f, 0.0f, 11), zContains ? 0.5f : 1.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var2, 0, 0, 262140);
                    dr0Var2.p(true);
                    ie1.c(null, 0.0f, 0L, dr0Var2, 0, 7);
                    dr0Var2.p(false);
                }
                break;
        }
        return j23Var;
    }
}
