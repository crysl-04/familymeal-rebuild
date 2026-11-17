package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class v22 extends im {
    public int i;

    @Override // defpackage.im, defpackage.xo1
    public final double A0() {
        return this.i;
    }

    @Override // defpackage.xo1
    public final int U0() {
        return this.i;
    }

    @Override // defpackage.im
    public final void b(double d) {
        if (i32.l.B(h32.b, d)) {
            return;
        }
        this.i++;
    }

    @Override // defpackage.im
    public final im e() {
        this.i = 0;
        return this;
    }
}
