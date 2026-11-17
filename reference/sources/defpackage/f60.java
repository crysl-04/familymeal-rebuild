package defpackage;

import java.util.ArrayList;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class f60 implements zp0 {
    public final /* synthetic */ kp0 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ kp0 j;
    public final /* synthetic */ boolean k;

    public f60(kp0 kp0Var, boolean z, kp0 kp0Var2, boolean z2) {
        this.h = kp0Var;
        this.i = z;
        this.j = kp0Var2;
        this.k = z2;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        dr0 dr0Var = (dr0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            ua2 ua2VarA = ta2.a(uz0.e, c5.r, dr0Var, 0);
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            rg1 rg1VarU = ls.U(dr0Var, og1.h);
            sy.f.getClass();
            dr0Var.Y();
            if (dr0Var.S) {
                dr0Var.k(l41.W);
            } else {
                dr0Var.i0();
            }
            h12.y(c5.F, dr0Var, ua2VarA);
            h12.y(c5.E, dr0Var, dx1VarL);
            yx yxVar = c5.G;
            if (dr0Var.S || !uz0.g(dr0Var.K(), Integer.valueOf(iHashCode))) {
                wi0.o(iHashCode, dr0Var, iHashCode, yxVar);
            }
            h12.y(c5.D, dr0Var, rg1VarU);
            iu0 iu0VarB = ou.d;
            if (iu0VarB == null) {
                hu0 hu0Var = new hu0("AutoMirrored.Filled.KeyboardArrowLeft", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                int i = k33.a;
                rl2 rl2Var = new rl2(kv.b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new gv1(15.41f, 16.59f));
                arrayList.add(new fv1(10.83f, 12.0f));
                arrayList.add(new nv1(4.58f, -4.59f));
                arrayList.add(new fv1(14.0f, 6.0f));
                arrayList.add(new nv1(-6.0f, 6.0f));
                arrayList.add(new nv1(6.0f, 6.0f));
                arrayList.add(new nv1(1.41f, -1.41f));
                arrayList.add(cv1.c);
                hu0.a(hu0Var, arrayList, rl2Var);
                iu0VarB = hu0Var.b();
                ou.d = iu0VarB;
            }
            n60.h(this.h, iu0VarB, h12.l(R.string.m3c_date_picker_switch_to_previous_month, dr0Var), null, this.i, dr0Var, 0, 8);
            iu0 iu0VarB2 = ou.e;
            if (iu0VarB2 == null) {
                hu0 hu0Var2 = new hu0("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                int i2 = k33.a;
                rl2 rl2Var2 = new rl2(kv.b);
                ArrayList arrayList2 = new ArrayList(32);
                arrayList2.add(new gv1(8.59f, 16.59f));
                arrayList2.add(new fv1(13.17f, 12.0f));
                arrayList2.add(new fv1(8.59f, 7.41f));
                arrayList2.add(new fv1(10.0f, 6.0f));
                arrayList2.add(new nv1(6.0f, 6.0f));
                arrayList2.add(new nv1(-6.0f, 6.0f));
                arrayList2.add(new nv1(-1.41f, -1.41f));
                arrayList2.add(cv1.c);
                hu0.a(hu0Var2, arrayList2, rl2Var2);
                iu0VarB2 = hu0Var2.b();
                ou.e = iu0VarB2;
            }
            n60.h(this.j, iu0VarB2, h12.l(R.string.m3c_date_picker_switch_to_next_month, dr0Var), null, this.k, dr0Var, 0, 8);
            dr0Var.p(true);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
