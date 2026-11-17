package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fj2 extends r22 {
    public final /* synthetic */ int h;
    public final /* synthetic */ a1 i;
    public final /* synthetic */ int j;

    public fj2(int i, int i2, a1 a1Var) {
        this.h = i;
        this.i = a1Var;
        this.j = i2;
    }

    @Override // defpackage.a1
    public final double A(int i) {
        int i2 = this.h;
        a1 a1Var = this.i;
        return i < i2 ? a1Var.A(this.j + i) : a1Var.A(i - i2);
    }

    @Override // defpackage.zj1
    public final void o(int i, double d) {
        throw new IllegalArgumentException();
    }

    @Override // defpackage.mo2
    public final int size() {
        return this.h + this.j;
    }
}
