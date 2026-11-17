package defpackage;

import java.util.Arrays;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class k60 implements bq0 {
    public final /* synthetic */ qy0 h;
    public final /* synthetic */ hq i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ vp0 l;
    public final /* synthetic */ vf2 m;
    public final /* synthetic */ s40 n;

    public k60(qy0 qy0Var, hq hqVar, int i, int i2, vp0 vp0Var, vf2 vf2Var, s40 s40Var) {
        this.h = qy0Var;
        this.i = hqVar;
        this.j = i;
        this.k = i2;
        this.l = vp0Var;
        this.m = vf2Var;
        this.n = s40Var;
    }

    @Override // defpackage.bq0
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        dr0 dr0Var = (dr0) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= dr0Var.d(iIntValue) ? 32 : 16;
        }
        if (dr0Var.N(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            int i = iIntValue + this.h.h;
            String strA = fq.a(i, this.i.a);
            rg1 rg1VarF = yj2.f(og1.h, tz0.K, tz0.J);
            boolean z = i == this.j;
            boolean z2 = i == this.k;
            vp0 vp0Var = this.l;
            boolean zF = dr0Var.f(vp0Var) | dr0Var.d(i);
            Object objK = dr0Var.K();
            if (zF || objK == zy.a) {
                objK = new j60(vp0Var, i, (byte) 0);
                dr0Var.f0(objK);
            }
            n60.m(strA, rg1VarF, z, z2, (kp0) objK, this.m.a(i), String.format(h12.l(R.string.m3c_date_picker_navigate_to_year_description, dr0Var), Arrays.copyOf(new Object[]{strA}, 1)), this.n, dr0Var, 48);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
