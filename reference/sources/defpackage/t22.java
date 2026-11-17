package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class t22 extends im {
    public final /* synthetic */ byte i;
    public double j;
    public boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t22(byte b) {
        super((byte) 2);
        this.i = b;
    }

    @Override // defpackage.im, defpackage.xo1
    public final double A0() {
        switch (this.i) {
            case 0:
                return this.k ? this.j : h32.a;
            case 1:
                return this.k ? this.j : h32.a;
            default:
                return this.k ? this.j : h32.a;
        }
    }

    @Override // defpackage.xo1
    public final int U0() {
        double dA0;
        switch (this.i) {
            case 0:
                dA0 = A0();
                break;
            case 1:
                dA0 = A0();
                break;
            default:
                dA0 = A0();
                break;
        }
        return (int) dA0;
    }

    @Override // defpackage.im
    public final void b(double d) {
        switch (this.i) {
            case 0:
                h32.q.getClass();
                double dAbs = Math.abs(d);
                if (wo1.t(dAbs, h32.a) != 0) {
                    f32 f32Var = h32.B;
                    double d2 = this.j;
                    f32Var.getClass();
                    this.j = Math.min(d2, dAbs);
                    this.k = true;
                }
                break;
            case 1:
                f32 f32Var2 = h32.A;
                double d3 = this.j;
                f32Var2.getClass();
                this.j = Math.max(d3, d);
                this.k = true;
                break;
            default:
                f32 f32Var3 = h32.B;
                double d4 = this.j;
                f32Var3.getClass();
                this.j = Math.min(d4, d);
                this.k = true;
                break;
        }
    }

    @Override // defpackage.im
    public final im e() {
        switch (this.i) {
            case 0:
                this.j = Double.POSITIVE_INFINITY;
                this.k = false;
                break;
            case 1:
                this.j = Double.NEGATIVE_INFINITY;
                this.k = false;
                break;
            default:
                this.j = Double.POSITIVE_INFINITY;
                this.k = false;
                break;
        }
        return this;
    }
}
