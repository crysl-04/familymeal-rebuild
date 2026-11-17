package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hw0 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ List i;

    public /* synthetic */ hw0(int i, List list) {
        this.h = (byte) 2;
        this.i = list;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        List list = this.i;
        switch (b) {
            case 0:
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    gw2.b(wi0.h("以下菜谱还在使用这种食材，请先从菜谱中移除：\n", dv.E0(dv.N0(list, 10), "、", null, null, null, 62), list.size() > 10 ? jp1.i(list.size(), " 等 ", " 道") : ""), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var, 0, 0, 262142);
                } else {
                    dr0Var.Q();
                }
                break;
            case 1:
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        zp0 zp0Var = (zp0) list.get(i);
                        int iHashCode = Long.hashCode(dr0Var2.T);
                        sy.f.getClass();
                        r3 r3Var = c5.C;
                        dr0Var2.Y();
                        if (dr0Var2.S) {
                            dr0Var2.k(r3Var);
                        } else {
                            dr0Var2.i0();
                        }
                        h12.y(c5.G, dr0Var2, Integer.valueOf(iHashCode));
                        zp0Var.f(dr0Var2, 0);
                        dr0Var2.p(true);
                    }
                } else {
                    dr0Var2.Q();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                tz0.g(list, (dr0) obj, m02.A(1));
                break;
        }
        return j23Var;
    }

    public /* synthetic */ hw0(List list, byte b) {
        this.h = b;
        this.i = list;
    }
}
