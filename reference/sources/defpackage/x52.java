package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x52 implements tm {
    public final /* synthetic */ byte a;

    @Override // defpackage.tm
    public final Comparable a(Comparable comparable, Comparable comparable2) {
        z52 z52Var = (z52) comparable;
        z52 z52Var2 = (z52) comparable2;
        switch (this.a) {
            case 0:
                return z52Var.i0(z52Var2);
            case 1:
                return z52Var.R(z52Var2);
            case 2:
                return z52Var.f1(z52Var2);
            case 3:
                return z52Var.compareTo(z52Var2) < 0 ? z52Var2 : z52Var;
            case 4:
                return z52Var.compareTo(z52Var2) > 0 ? z52Var2 : z52Var;
            default:
                return z52Var.i(z52Var2);
        }
    }

    @Override // defpackage.tm
    public final double c(double d, double d2) {
        return ((z52) a(z52.t(d), z52.t(d2))).A0();
    }

    @Override // defpackage.tm
    public final float h(float f, float f2) {
        return ((z52) a(z52.t(f), z52.t(f2))).d0();
    }
}
