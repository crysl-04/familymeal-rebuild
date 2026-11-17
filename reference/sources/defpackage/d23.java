package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class d23 extends gc1 {
    public final c23 l;

    public d23(re1 re1Var, c23 c23Var) {
        super(re1Var, re1Var.h1(), re1Var.B1());
        this.l = c23Var;
    }

    @Override // defpackage.re1, defpackage.k1
    public final double J(int i, int i2) {
        if (!a0()) {
            return xo1.c1(h0(i, i2));
        }
        return this.l.a(this.k.J(i, i2));
    }

    @Override // defpackage.re1
    public final Comparable h0(int i, int i2) {
        return this.l.b(this.k.h0(i, i2));
    }
}
