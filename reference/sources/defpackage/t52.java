package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class t52 extends im {
    public final /* synthetic */ byte i;
    public z52 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t52(byte b) {
        super((byte) 5);
        this.i = b;
    }

    @Override // defpackage.xo1
    public final int U0() {
        switch (this.i) {
            case 0:
                return this.j.U0();
            case 1:
                return this.j.U0();
            case 2:
                return this.j.U0();
            case 3:
                return this.j.U0();
            case 4:
                return f().U0();
            case 5:
                return this.j.U0();
            default:
                return this.j.U0();
        }
    }

    @Override // defpackage.im
    public final void d(Comparable comparable) {
        switch (this.i) {
            case 0:
                this.j = this.j.i0((z52) comparable);
                break;
            case 1:
                z52 z52Var = (z52) comparable;
                this.j = this.j.i0(z52Var.i(z52Var));
                break;
            case 2:
                this.j = (z52) y52.d.a(this.j, (z52) y52.a.b((z52) comparable));
                break;
            case 3:
                z52 z52Var2 = this.j;
                e32 e32Var = h32.q;
                double dA0 = ((z52) comparable).A0();
                e32Var.getClass();
                double dAbs = Math.abs(dA0);
                z52Var2.getClass();
                this.j = z52Var2.i0(z52.t(dAbs));
                break;
            case 4:
                e32 e32Var2 = h32.q;
                double dA1 = ((z52) comparable).A0();
                e32Var2.getClass();
                double dAbs2 = Math.abs(dA1);
                z52 z52Var3 = this.j;
                z52Var3.getClass();
                this.j = z52Var3.i0(z52.t(dAbs2 * dAbs2));
                break;
            case 5:
                this.j = this.j.i((z52) comparable);
                break;
            default:
                z52 z52Var4 = (z52) comparable;
                this.j = this.j.i(z52Var4.i(z52Var4));
                break;
        }
    }

    @Override // defpackage.im
    public final im e() {
        switch (this.i) {
            case 0:
                this.j = z52.p;
                break;
            case 1:
                this.j = z52.p;
                break;
            case 2:
                this.j = z52.p;
                break;
            case 3:
                this.j = z52.p;
                break;
            case 4:
                this.j = z52.p;
                break;
            case 5:
                this.j = z52.n;
                break;
            default:
                this.j = z52.n;
                break;
        }
        return this;
    }

    public final z52 f() {
        e32 e32Var = h32.H;
        e32 e32Var2 = h32.q;
        double dA0 = this.j.A0();
        e32Var2.getClass();
        double dAbs = Math.abs(dA0);
        e32Var.getClass();
        return z52.t(Math.sqrt(dAbs));
    }

    @Override // defpackage.im, defpackage.l1
    public final Object get() {
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
                return f();
            case 5:
                return this.j;
            default:
                return this.j;
        }
    }
}
