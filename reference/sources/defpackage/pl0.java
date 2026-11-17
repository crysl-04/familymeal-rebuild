package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pl0 implements va2 {
    public static final pl0 a = new pl0();

    @Override // defpackage.va2
    public final rg1 a(rg1 rg1Var, float f) {
        if (f <= 0.0d) {
            yw0.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return rg1Var.c(new b51(f, true));
    }
}
