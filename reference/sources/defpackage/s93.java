package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class s93 extends pi0 {
    public final k1 n;
    public final uc2 o;
    public final int p;

    public s93(fy1 fy1Var, k1 k1Var) {
        super(fy1Var, k1Var.Z1(), k1Var.T());
        this.n = k1Var;
        this.o = fy1Var.h();
        this.p = k1Var.Z1();
    }

    @Override // defpackage.k1, defpackage.a1
    public final double A(int i) {
        return this.n.A(i);
    }

    @Override // defpackage.k1, defpackage.a1
    public final Comparable G(long j) {
        return this.o.n(this.n.G(j));
    }

    @Override // defpackage.re1, defpackage.k1
    public final double J(int i, int i2) {
        return this.n.z((((long) i2) * ((long) this.p)) + ((long) i));
    }

    @Override // defpackage.re1
    public final Comparable h0(int i, int i2) {
        return this.o.n(this.n.G((((long) i2) * ((long) this.p)) + ((long) i)));
    }
}
