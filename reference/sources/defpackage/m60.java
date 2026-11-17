package defpackage;

import java.util.ArrayList;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class m60 implements aq0 {
    public final /* synthetic */ nx h;
    public final /* synthetic */ boolean i;

    public m60(nx nxVar, boolean z) {
        this.h = nxVar;
        this.i = z;
    }

    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        String strL;
        float f;
        dr0 dr0Var = (dr0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if (dr0Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
            this.h.f(dr0Var, 0);
            float f2 = mp.e;
            rg1 rg1VarJ0 = og1.h;
            y02.d(dr0Var, yj2.i(rg1VarJ0, f2));
            iu0 iu0VarB = es.k;
            if (iu0VarB == null) {
                hu0 hu0Var = new hu0("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                int i = k33.a;
                rl2 rl2Var = new rl2(kv.b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new gv1(7.0f, 10.0f));
                arrayList.add(new nv1(5.0f, 5.0f));
                arrayList.add(new nv1(5.0f, -5.0f));
                arrayList.add(cv1.c);
                hu0.a(hu0Var, arrayList, rl2Var);
                iu0VarB = hu0Var.b();
                es.k = iu0VarB;
            }
            iu0 iu0Var = iu0VarB;
            if (this.i) {
                dr0Var.V(1509384391);
                strL = h12.l(R.string.m3c_date_picker_switch_to_day_selection, dr0Var);
                dr0Var.p(false);
                f = 180.0f;
            } else {
                dr0Var.V(1509478662);
                strL = h12.l(R.string.m3c_date_picker_switch_to_year_selection, dr0Var);
                dr0Var.p(false);
                f = 0.0f;
            }
            String str = strL;
            if (f != 0.0f) {
                rg1VarJ0 = h7.j0(rg1VarJ0, 0.0f, 0.0f, 0.0f, 0.0f, f, 0L, null, false, 0L, 0L, 1048319);
            }
            eu0.a(iu0Var, str, rg1VarJ0, 0L, dr0Var, 0, 8);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
