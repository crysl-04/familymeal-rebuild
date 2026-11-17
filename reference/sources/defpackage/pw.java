package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pw extends im {
    public final /* synthetic */ byte i;
    public uw j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pw(byte b) {
        super((byte) 1);
        this.i = b;
    }

    @Override // defpackage.xo1
    public final int U0() {
        double dSqrt;
        switch (this.i) {
            case 0:
                dSqrt = this.j.i;
                break;
            case 1:
                dSqrt = this.j.i;
                break;
            case 2:
                dSqrt = this.j.i;
                break;
            case 3:
                dSqrt = this.j.i;
                break;
            case 4:
                dSqrt = this.j.i;
                break;
            case 5:
                e32 e32Var = h32.H;
                double dA1 = this.j.a1();
                e32Var.getClass();
                dSqrt = Math.sqrt(dA1);
                new uw(dSqrt);
                break;
            case 6:
                dSqrt = this.j.i;
                break;
            default:
                dSqrt = this.j.i;
                break;
        }
        return (int) dSqrt;
    }

    @Override // defpackage.im
    public final void d(Comparable comparable) {
        switch (this.i) {
            case 0:
                this.j = this.j.i0((uw) comparable);
                break;
            case 1:
                uw uwVar = (uw) comparable;
                this.j = this.j.i0(uwVar.i(uwVar));
                break;
            case 2:
                uw uwVar2 = this.j;
                uw uwVar3 = new uw(((uw) comparable).a1());
                if (uwVar2.compareTo(uwVar3) <= 0) {
                    uwVar2 = uwVar3;
                }
                this.j = uwVar2;
                break;
            case 3:
                uw uwVar4 = (uw) comparable;
                uw uwVar5 = this.j;
                if (uwVar5.compareTo(uwVar4) > 0) {
                    uwVar4 = uwVar5;
                }
                this.j = uwVar4;
                break;
            case 4:
                uw uwVar6 = this.j;
                this.j = new uw(uwVar6.i + ((uw) comparable).a1(), uwVar6.h);
                break;
            case 5:
                double dA1 = ((uw) comparable).a1();
                uw uwVar7 = this.j;
                this.j = new uw(uwVar7.i + (dA1 * dA1), uwVar7.h);
                break;
            case 6:
                this.j = this.j.i((uw) comparable);
                break;
            default:
                uw uwVar8 = (uw) comparable;
                this.j = this.j.i(uwVar8.i(uwVar8));
                break;
        }
    }

    @Override // defpackage.im
    public final im e() {
        switch (this.i) {
            case 0:
                this.j = uw.n;
                break;
            case 1:
                this.j = uw.n;
                break;
            case 2:
                this.j = uw.n;
                break;
            case 3:
                this.j = uw.n;
                break;
            case 4:
                this.j = uw.n;
                break;
            case 5:
                this.j = uw.n;
                break;
            case 6:
                this.j = uw.m;
                break;
            default:
                this.j = uw.m;
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
                return new uw(Math.sqrt(dA1));
            case 6:
                return this.j;
            default:
                return this.j;
        }
    }
}
