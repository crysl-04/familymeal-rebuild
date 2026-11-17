package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class jp2 implements gz2 {
    public final fz2 h;

    public jp2(fz2 fz2Var, long j, long j2) {
        if (fz2Var instanceof fi1) {
            this.h = ii1.o(Math.toIntExact(j), Math.toIntExact(j2));
        } else {
            if (!(fz2Var instanceof gi1)) {
                this.h = fz2Var;
                return;
            }
            int intExact = Math.toIntExact(j);
            Math.toIntExact(j2);
            this.h = ii1.m(intExact);
        }
    }

    @Override // defpackage.gz2
    public final ep2 H0(int i, int i2) {
        return new ep2(this, this.h, i, i2);
    }

    @Override // defpackage.gz2
    public final void K1(a1 a1Var, a1 a1Var2) {
        if (Math.toIntExact(a1Var.count() / h1()) != Math.toIntExact(a1Var2.count() / B1())) {
            a42.a();
            throw null;
        }
        this.h.a(this, a1Var, (int) (a1Var.count() / h1()), a1Var2);
    }

    @Override // defpackage.gz2
    public final gp2 L0(int... iArr) {
        return new gp2(this, this.h, iArr);
    }

    @Override // defpackage.gz2
    public final dp2 N0(int... iArr) {
        return new dp2(this, this.h, iArr);
    }

    public void Z(a1 a1Var) {
        long jMin = Math.min(count(), a1Var.count());
        for (long j = 0; j < jMin; j++) {
            B(j, a1Var.G(j));
        }
    }

    @Override // defpackage.gz2
    public gz2 j0() {
        return new ip2(this, this.h);
    }

    public final String toString() {
        return a1.V0(this);
    }

    @Override // defpackage.gz2
    public final fp2 v0(int i, int i2) {
        return new fp2(this, this.h, i, i2);
    }
}
