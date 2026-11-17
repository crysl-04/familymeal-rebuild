package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class u52 extends im {
    public int i;

    @Override // defpackage.xo1
    public final int U0() {
        return this.i;
    }

    @Override // defpackage.im
    public final void d(Comparable comparable) {
        double d = h32.b;
        e32 e32Var = h32.q;
        double dA0 = ((z52) comparable).A0();
        e32Var.getClass();
        if (i32.l.B(d, Math.abs(dA0))) {
            return;
        }
        this.i++;
    }

    @Override // defpackage.im
    public final im e() {
        this.i = 0;
        return this;
    }

    @Override // defpackage.im, defpackage.l1
    public final Object get() {
        return z52.n(this.i, 1L);
    }
}
