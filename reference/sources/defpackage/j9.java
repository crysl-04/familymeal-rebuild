package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j9 implements bq0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ j9(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // defpackage.bq0
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.h;
        Object obj5 = this.i;
        switch (b) {
            case 0:
                k9 k9Var = (k9) obj5;
                a13 a13VarB = ((tm0) k9Var.l).b((ar2) obj, (qn0) obj2, ((on0) obj3).a, ((pn0) obj4).a);
                if (a13VarB instanceof a13) {
                    Object obj6 = a13VarB.h;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                eg egVar = new eg(a13VarB, k9Var.q);
                k9Var.q = egVar;
                Object obj7 = egVar.k;
                obj7.getClass();
                return (Typeface) obj7;
            default:
                nx nxVar = (nx) obj5;
                g61 g61Var = (g61) obj;
                ((Integer) obj2).getClass();
                dr0 dr0Var = (dr0) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dr0Var.f(g61Var) ? 4 : 2;
                }
                if (dr0Var.N(iIntValue & 1, (iIntValue & 131) != 130)) {
                    nxVar.c(g61Var, dr0Var, Integer.valueOf(iIntValue & 14));
                } else {
                    dr0Var.Q();
                }
                return j23.a;
        }
    }
}
