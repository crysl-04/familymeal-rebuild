package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class r52 extends im {
    public int i;
    public z52 j;

    @Override // defpackage.xo1
    public final int U0() {
        z52 z52Var = this.j;
        double d = this.i;
        z52Var.getClass();
        return z52Var.f1(z52.t(d)).U0();
    }

    @Override // defpackage.im
    public final void d(Comparable comparable) {
        this.i++;
        this.j = this.j.i0((z52) comparable);
    }

    @Override // defpackage.im
    public final im e() {
        this.i = 0;
        this.j = z52.p;
        return this;
    }

    @Override // defpackage.im, defpackage.l1
    public final Object get() {
        z52 z52Var = this.j;
        double d = this.i;
        z52Var.getClass();
        return z52Var.f1(z52.t(d));
    }
}
