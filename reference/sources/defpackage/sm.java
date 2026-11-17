package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class sm implements c23, xo1 {
    public final double h;
    public final float i;
    public final tm j;
    public final Comparable k;

    public sm(tm tmVar, Comparable comparable) {
        this.j = tmVar;
        this.k = comparable;
        this.h = xo1.c1(comparable);
        this.i = xo1.U1(comparable);
    }

    @Override // defpackage.xo1
    public final double A0() {
        return this.h;
    }

    @Override // defpackage.c23
    public final double a(double d) {
        return this.j.c(d, this.h);
    }

    @Override // defpackage.c23
    public final Comparable b(Comparable comparable) {
        return this.j.a(comparable, this.k);
    }

    @Override // defpackage.c23
    public final float c(float f) {
        return this.j.h(f, this.i);
    }

    @Override // defpackage.xo1
    public final float d0() {
        return this.i;
    }

    public sm(f32 f32Var, double d) {
        this.j = f32Var;
        this.k = Double.valueOf(d);
        this.h = d;
        this.i = (float) d;
    }
}
