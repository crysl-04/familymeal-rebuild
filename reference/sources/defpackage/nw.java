package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nw extends im {
    public int i;
    public uw j;

    @Override // defpackage.xo1
    public final int U0() {
        return (int) this.j.u1(this.i).i;
    }

    @Override // defpackage.im
    public final void d(Comparable comparable) {
        this.i++;
        this.j = this.j.i0((uw) comparable);
    }

    @Override // defpackage.im
    public final im e() {
        this.i = 0;
        this.j = uw.n;
        return this;
    }

    @Override // defpackage.im, defpackage.l1
    public final Object get() {
        return this.j.u1(this.i);
    }
}
