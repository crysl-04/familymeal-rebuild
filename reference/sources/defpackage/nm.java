package defpackage;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nm implements gu1 {
    public final /* synthetic */ byte a;

    @Override // defpackage.gu1
    public final Comparable e(int i, Comparable comparable) {
        switch (this.a) {
            case 0:
                return lg1.e(i, (BigDecimal) comparable);
            case 1:
                return lg1.f(i, (BigDecimal) comparable);
            case 2:
                return ((BigDecimal) comparable).setScale(i, RoundingMode.HALF_EVEN);
            case 3:
                uw uwVar = (uw) comparable;
                g32 g32Var = h32.E;
                double dA1 = uwVar.a1();
                g32Var.getClass();
                return uw.f2(lg1.d(i, dA1), uwVar.j2() * ((double) i));
            case 4:
                u42 u42Var = (u42) comparable;
                double dA2 = u42Var.a1();
                double[] dArrQ2 = u42Var.q2();
                e32 e32Var = h32.r;
                double d = u42Var.m / dA2;
                e32Var.getClass();
                double dAcos = Math.acos(d);
                h32.y.getClass();
                u42 u42VarH = new u42(Math.log(dA2), dArrQ2[0] * dAcos, dArrQ2[1] * dAcos, dArrQ2[2] * dAcos).h(i);
                boolean zK2 = u42VarH.k2();
                double d2 = u42VarH.m;
                if (zK2) {
                    h32.w.getClass();
                    return new u42(Math.exp(d2));
                }
                h32.w.getClass();
                return u42.l2(Math.exp(d2), u42VarH.q2(), u42VarH.h2());
            default:
                u42 u42Var2 = (u42) comparable;
                if (i == 0) {
                    wg.f();
                    return null;
                }
                double dA3 = u42Var2.a1();
                double[] dArrQ3 = u42Var2.q2();
                e32 e32Var2 = h32.r;
                double d3 = u42Var2.m / dA3;
                e32Var2.getClass();
                double dAcos2 = Math.acos(d3);
                h32.y.getClass();
                u42 u42VarU1 = new u42(Math.log(dA3), dArrQ3[0] * dAcos2, dArrQ3[1] * dAcos2, dArrQ3[2] * dAcos2).u1(i);
                boolean zK3 = u42VarU1.k2();
                double d4 = u42VarU1.m;
                if (zK3) {
                    h32.w.getClass();
                    return new u42(Math.exp(d4));
                }
                h32.w.getClass();
                return u42.l2(Math.exp(d4), u42VarU1.q2(), u42VarU1.h2());
        }
    }
}
