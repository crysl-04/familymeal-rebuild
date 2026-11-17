package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class s22 extends im {
    public int i;
    public double j;

    @Override // defpackage.im, defpackage.xo1
    public final double A0() {
        return this.j / ((double) this.i);
    }

    @Override // defpackage.xo1
    public final int U0() {
        return (int) A0();
    }

    @Override // defpackage.im
    public final void b(double d) {
        this.i++;
        this.j += d;
    }

    @Override // defpackage.im
    public final im e() {
        this.i = 0;
        this.j = h32.a;
        return this;
    }
}
