package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class x42 extends im {
    public final /* synthetic */ byte i;
    public u42 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x42(byte b) {
        super((byte) 4);
        this.i = b;
    }

    @Override // defpackage.xo1
    public final int U0() {
        double dSqrt;
        switch (this.i) {
            case 0:
                dSqrt = this.j.m;
                break;
            case 1:
                dSqrt = this.j.m;
                break;
            case 2:
                dSqrt = this.j.m;
                break;
            case 3:
                dSqrt = this.j.m;
                break;
            case 4:
                dSqrt = this.j.m;
                break;
            case 5:
                e32 e32Var = h32.H;
                double dA1 = this.j.a1();
                e32Var.getClass();
                dSqrt = Math.sqrt(dA1);
                new u42(dSqrt);
                break;
            case 6:
                dSqrt = this.j.m;
                break;
            default:
                dSqrt = this.j.m;
                break;
        }
        return (int) dSqrt;
    }

    @Override // defpackage.im
    public final void d(Comparable comparable) {
        switch (this.i) {
            case 0:
                this.j = this.j.i0((u42) comparable);
                break;
            case 1:
                u42 u42Var = (u42) comparable;
                this.j = this.j.i0(u42Var.i(u42Var));
                break;
            case 2:
                u42 u42Var2 = this.j;
                u42 u42Var3 = new u42(((u42) comparable).a1());
                if (u42Var2.compareTo(u42Var3) <= 0) {
                    u42Var2 = u42Var3;
                }
                this.j = u42Var2;
                break;
            case 3:
                u42 u42Var4 = (u42) comparable;
                u42 u42Var5 = this.j;
                if (u42Var5.compareTo(u42Var4) > 0) {
                    u42Var4 = u42Var5;
                }
                this.j = u42Var4;
                break;
            case 4:
                this.j = this.j.b2(((u42) comparable).a1());
                break;
            case 5:
                double dA1 = ((u42) comparable).a1();
                this.j = this.j.b2(dA1 * dA1);
                break;
            case 6:
                this.j = this.j.i((u42) comparable);
                break;
            default:
                u42 u42Var6 = (u42) comparable;
                this.j = this.j.i(u42Var6.i(u42Var6));
                break;
        }
    }

    @Override // defpackage.im
    public final im e() {
        switch (this.i) {
            case 0:
                this.j = u42.s;
                break;
            case 1:
                this.j = u42.s;
                break;
            case 2:
                this.j = u42.s;
                break;
            case 3:
                this.j = u42.s;
                break;
            case 4:
                this.j = u42.s;
                break;
            case 5:
                this.j = u42.s;
                break;
            case 6:
                this.j = u42.r;
                break;
            default:
                this.j = u42.r;
                break;
        }
        return this;
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
                return this.j;
            case 5:
                e32 e32Var = h32.H;
                double dA1 = this.j.a1();
                e32Var.getClass();
                return new u42(Math.sqrt(dA1));
            case 6:
                return this.j;
            default:
                return this.j;
        }
    }
}
