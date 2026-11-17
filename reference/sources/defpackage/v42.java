package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class v42 extends im {
    public int i;
    public u42 j;

    @Override // defpackage.xo1
    public final int U0() {
        return (int) ((u42) this.j.g2(this.i)).m;
    }

    @Override // defpackage.im
    public final void d(Comparable comparable) {
        this.i++;
        this.j = this.j.i0((u42) comparable);
    }

    @Override // defpackage.im
    public final im e() {
        this.i = 0;
        this.j = u42.s;
        return this;
    }

    @Override // defpackage.im, defpackage.l1
    public final Object get() {
        return (u42) this.j.g2(this.i);
    }
}
