package defpackage;

import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w52 implements c23 {
    public final /* synthetic */ byte h;

    @Override // defpackage.c23
    public final double a(double d) {
        return ((z52) b(z52.t(d))).A0();
    }

    @Override // defpackage.c23
    public final Comparable b(Comparable comparable) {
        z52 z52Var = (z52) comparable;
        switch (this.h) {
            case 0:
                return z52Var.compareTo(z52.p) < 0 ? z52Var.l() : z52Var;
            case 1:
                z52Var.getClass();
                return z52Var;
            case 2:
                lm lmVar = om.V;
                BigDecimal bigDecimalF1 = z52Var.F1();
                lmVar.getClass();
                return z52.v(lg1.b(bigDecimalF1));
            case 3:
                return z52.v(om.W.b(z52Var.F1()));
            case 4:
                return z52Var.l();
            default:
                lm lmVar2 = om.a0;
                BigDecimal bigDecimalF2 = z52Var.F1();
                lmVar2.getClass();
                return z52.v(lg1.f(2, bigDecimalF2));
        }
    }

    @Override // defpackage.c23
    public final float c(float f) {
        return ((z52) b(z52.t(f))).d0();
    }
}
