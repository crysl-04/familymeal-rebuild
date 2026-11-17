package defpackage;

import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r42 implements c23 {
    public final /* synthetic */ byte h;

    @Override // defpackage.c23
    public final double a(double d) {
        return ((l42) b(l42.r(d))).A0();
    }

    @Override // defpackage.c23
    public final Comparable b(Comparable comparable) {
        l42 l42Var = (l42) comparable;
        switch (this.h) {
            case 0:
                return Double.compare(l42Var.A0(), 0.0d) < 0 ? l42Var.o() : l42Var;
            case 1:
                l42Var.getClass();
                return l42Var;
            case 2:
                lm lmVar = om.V;
                BigDecimal bigDecimalF1 = l42Var.F1();
                lmVar.getClass();
                return l42.s(lg1.b(bigDecimalF1));
            case 3:
                return l42.s((BigDecimal) om.W.b(l42Var.F1()));
            case 4:
                return l42Var.o();
            default:
                lm lmVar2 = om.a0;
                BigDecimal bigDecimalF2 = l42Var.F1();
                lmVar2.getClass();
                return l42.s(lg1.f(2, bigDecimalF2));
        }
    }

    @Override // defpackage.c23
    public final float c(float f) {
        return ((l42) b(l42.r(f))).d0();
    }
}
