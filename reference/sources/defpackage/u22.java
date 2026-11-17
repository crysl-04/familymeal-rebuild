package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class u22 extends im {
    public final /* synthetic */ byte i;
    public double j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u22(byte b) {
        super((byte) 2);
        this.i = b;
    }

    @Override // defpackage.im, defpackage.xo1
    public final double A0() {
        switch (this.i) {
            case 0:
                return this.j;
            case 1:
                return this.j;
            case 2:
                return this.j;
            case 3:
                return this.j;
            case 4:
                e32 e32Var = h32.H;
                double d = this.j;
                e32Var.getClass();
                return Math.sqrt(d);
            case 5:
                return this.j;
            default:
                return this.j;
        }
    }

    @Override // defpackage.xo1
    public final int U0() {
        double dA0;
        switch (this.i) {
            case 0:
                dA0 = this.j;
                break;
            case 1:
                dA0 = this.j;
                break;
            case 2:
                dA0 = this.j;
                break;
            case 3:
                dA0 = this.j;
                break;
            case 4:
                dA0 = A0();
                break;
            case 5:
                dA0 = this.j;
                break;
            default:
                dA0 = this.j;
                break;
        }
        return (int) dA0;
    }

    @Override // defpackage.im
    public final void b(double d) {
        switch (this.i) {
            case 0:
                this.j += d;
                break;
            case 1:
                this.j = (d * d) + this.j;
                break;
            case 2:
                f32 f32Var = h32.A;
                double d2 = this.j;
                h32.q.getClass();
                double dAbs = Math.abs(d);
                f32Var.getClass();
                this.j = Math.max(d2, dAbs);
                break;
            case 3:
                double d3 = this.j;
                h32.q.getClass();
                this.j = Math.abs(d) + d3;
                break;
            case 4:
                this.j = (d * d) + this.j;
                break;
            case 5:
                this.j *= d;
                break;
            default:
                this.j = d * d * this.j;
                break;
        }
    }

    @Override // defpackage.im
    public final im e() {
        switch (this.i) {
            case 0:
                this.j = h32.a;
                break;
            case 1:
                this.j = h32.a;
                break;
            case 2:
                this.j = h32.a;
                break;
            case 3:
                this.j = h32.a;
                break;
            case 4:
                this.j = h32.a;
                break;
            case 5:
                this.j = h32.b;
                break;
            default:
                this.j = h32.b;
                break;
        }
        return this;
    }
}
