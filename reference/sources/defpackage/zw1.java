package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zw1 implements bq0 {
    public final /* synthetic */ List h;
    public final /* synthetic */ int i;
    public final /* synthetic */ vp0 j;

    public zw1(List list, int i, vp0 vp0Var) {
        this.h = list;
        this.i = i;
        this.j = vp0Var;
    }

    @Override // defpackage.bq0
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g61 g61Var = (g61) obj;
        int iIntValue = ((Number) obj2).intValue();
        dr0 dr0Var = (dr0) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (dr0Var.f(g61Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= dr0Var.d(iIntValue) ? 32 : 16;
        }
        if (dr0Var.N(i & 1, (i & 147) != 146)) {
            dy1 dy1Var = (dy1) this.h.get(iIntValue);
            dr0Var.V(654175618);
            int i2 = this.i;
            ps2 ps2VarA = rs2.a(dy1Var, i2);
            e40 e40Var = ps2VarA.a;
            ap1 ap1Var = e40Var != null ? e40Var.a : null;
            vp0 vp0Var = this.j;
            boolean zF = dr0Var.f(vp0Var) | dr0Var.h(dy1Var);
            Object objK = dr0Var.K();
            if (zF || objK == zy.a) {
                objK = new xw1((byte) 0, vp0Var, dy1Var);
                dr0Var.f0(objK);
            }
            cu.k(dt.N(1445618843, new p70(dy1Var, (byte) 6), dr0Var), h7.X(og1.h, false, "编辑", null, (kp0) objK, 13), dt.N(-1274930120, new yw1(dy1Var, i2, ps2VarA, ap1Var), dr0Var), null, null, dr0Var, 3078, 500);
            ie1.c(null, 0.0f, 0L, dr0Var, 0, 7);
            dr0Var.p(false);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
