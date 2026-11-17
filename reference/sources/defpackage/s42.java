package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s42 implements tm {
    public final /* synthetic */ byte a;

    @Override // defpackage.tm
    public final Comparable a(Comparable comparable, Comparable comparable2) {
        l42 l42Var = (l42) comparable;
        l42 l42Var2 = (l42) comparable2;
        switch (this.a) {
            case 0:
                return l42Var.i0(l42Var2);
            case 1:
                return l42Var.R(l42Var2);
            case 2:
                return l42Var.f1(l42Var2);
            case 3:
                return Double.compare(l42Var.A0(), l42Var2.A0()) < 0 ? l42Var2 : l42Var;
            case 4:
                return Double.compare(l42Var.A0(), l42Var2.A0()) > 0 ? l42Var2 : l42Var;
            default:
                return l42Var.i(l42Var2);
        }
    }

    @Override // defpackage.tm
    public final double c(double d, double d2) {
        return ((l42) a(l42.r(d), l42.r(d2))).A0();
    }

    @Override // defpackage.tm
    public final float h(float f, float f2) {
        return ((l42) a(l42.r(f), l42.r(f2))).d0();
    }
}
