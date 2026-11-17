package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nj2 extends r22 {
    public final /* synthetic */ a90 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ oj2 k;

    public nj2(oj2 oj2Var, a90 a90Var, int i, int i2) {
        this.h = a90Var;
        this.i = i;
        this.j = i2;
        this.k = oj2Var;
    }

    @Override // defpackage.a1
    public final double A(int i) {
        return this.h.J(this.i, this.j + i);
    }

    @Override // defpackage.zj1
    public final void o(int i, double d) {
        this.h.b0(d, this.i, this.j + i);
    }

    @Override // defpackage.mo2
    public final int size() {
        return this.k.s;
    }
}
