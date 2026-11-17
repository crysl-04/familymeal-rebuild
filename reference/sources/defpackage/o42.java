package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class o42 extends im {
    public final /* synthetic */ byte i;
    public l42 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o42(byte b) {
        super((byte) 3);
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
                this.j = this.j.i0((l42) comparable);
                break;
            case 1:
                l42 l42Var = (l42) comparable;
                this.j = this.j.i0(l42Var.i(l42Var));
                break;
            case 2:
                this.j = (l42) t42.d.a(this.j, (l42) t42.a.b((l42) comparable));
                break;
            case 3:
                l42 l42Var2 = this.j;
                e32 e32Var = h32.q;
                double dA0 = ((l42) comparable).A0();
                e32Var.getClass();
                double dAbs = Math.abs(dA0);
                double d = 1.34217729E8d * dAbs;
                double d2 = d - (d - dAbs);
                this.j = l42.b(l42Var2.h, l42Var2.j, d2, dAbs - d2);
                break;
            case 4:
                e32 e32Var2 = h32.q;
                double dA1 = ((l42) comparable).A0();
                e32Var2.getClass();
                double dAbs2 = Math.abs(dA1);
                l42 l42Var3 = this.j;
                double d3 = dAbs2 * dAbs2;
                double d4 = 1.34217729E8d * d3;
                double d5 = d4 - (d4 - d3);
                this.j = l42.b(l42Var3.h, l42Var3.j, d5, d3 - d5);
                break;
            case 5:
                this.j = this.j.i((l42) comparable);
                break;
            default:
                l42 l42Var4 = (l42) comparable;
                this.j = this.j.i(l42Var4.i(l42Var4));
                break;
        }
    }

    @Override // defpackage.im
    public final im e() {
        byte b = this.i;
        l42 l42Var = l42.n;
        l42 l42Var2 = l42.p;
        switch (b) {
            case 0:
                this.j = l42Var2;
                break;
            case 1:
                this.j = l42Var2;
                break;
            case 2:
                this.j = l42Var2;
                break;
            case 3:
                this.j = l42Var2;
                break;
            case 4:
                this.j = l42Var2;
                break;
            case 5:
                this.j = l42Var;
                break;
            default:
                this.j = l42Var;
                break;
        }
        return this;
    }

    public final l42 f() {
        e32 e32Var = h32.H;
        e32 e32Var2 = h32.q;
        double dA0 = this.j.A0();
        e32Var2.getClass();
        double dAbs = Math.abs(dA0);
        e32Var.getClass();
        return l42.r(Math.sqrt(dAbs));
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
