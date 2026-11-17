package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xa2 extends gz {
    public final int[] l;

    public xa2(re1 re1Var, int... iArr) {
        super(re1Var, iArr.length, re1Var.T());
        this.l = iArr;
    }

    @Override // defpackage.re1, defpackage.k1
    public final double J(int i, int i2) {
        return this.k.J(this.l[i], i2);
    }

    @Override // defpackage.w0, defpackage.no2
    public final int V(int i) {
        return this.k.V(this.l[i]);
    }

    @Override // defpackage.re1
    public final Comparable h0(int i, int i2) {
        return this.k.h0(this.l[i], i2);
    }

    @Override // defpackage.re1, defpackage.e1
    /* JADX INFO: renamed from: m */
    public final void a(gz2 gz2Var) {
        int[] iArr = this.l;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            gz2Var.X0(i, this.k.N1(iArr[i]));
        }
    }

    @Override // defpackage.no2
    public final int n0(int i) {
        return this.k.n0(this.l[i]);
    }
}
