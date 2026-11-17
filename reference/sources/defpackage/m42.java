package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class m42 extends im {
    public int i;
    public l42 j;

    @Override // defpackage.xo1
    public final int U0() {
        l42 l42Var = this.j;
        double d = this.i;
        double d2 = 1.34217729E8d * d;
        double d3 = d2 - (d2 - d);
        return l42.d(l42Var.h, l42Var.j, d3, d - d3).U0();
    }

    @Override // defpackage.im
    public final void d(Comparable comparable) {
        this.i++;
        this.j = this.j.i0((l42) comparable);
    }

    @Override // defpackage.im
    public final im e() {
        this.i = 0;
        this.j = l42.p;
        return this;
    }

    @Override // defpackage.im, defpackage.l1
    public final Object get() {
        l42 l42Var = this.j;
        double d = this.i;
        double d2 = 1.34217729E8d * d;
        double d3 = d2 - (d2 - d);
        return l42.d(l42Var.h, l42Var.j, d3, d - d3);
    }
}
