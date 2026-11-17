package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class n42 extends im {
    public final /* synthetic */ byte i;
    public l42 j;
    public boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n42(byte b) {
        super((byte) 3);
        this.i = b;
    }

    @Override // defpackage.xo1
    public final int U0() {
        byte b = this.i;
        l42 l42Var = l42.p;
        switch (b) {
            case 0:
                if (this.k) {
                    l42Var = this.j;
                }
                return l42Var.U0();
            case 1:
                if (this.k) {
                    l42Var = this.j;
                }
                return l42Var.U0();
            default:
                if (this.k) {
                    l42Var = this.j;
                }
                return l42Var.U0();
        }
    }

    @Override // defpackage.im
    public final void d(Comparable comparable) {
        switch (this.i) {
            case 0:
                l42 l42Var = (l42) comparable;
                double d = h32.b;
                l42Var.getClass();
                if (!qm.l.B(d, l42Var.A0())) {
                    this.j = (l42) t42.e.a(this.j, (l42) t42.a.b(l42Var));
                    this.k = true;
                }
                break;
            case 1:
                this.j = (l42) t42.d.a(this.j, (l42) comparable);
                this.k = true;
                break;
            default:
                this.j = (l42) t42.e.a(this.j, (l42) comparable);
                this.k = true;
                break;
        }
    }

    @Override // defpackage.im
    public final im e() {
        byte b = this.i;
        l42 l42Var = l42.o;
        switch (b) {
            case 0:
                this.j = l42Var;
                this.k = false;
                break;
            case 1:
                this.j = l42.m;
                this.k = false;
                break;
            default:
                this.j = l42Var;
                this.k = false;
                break;
        }
        return this;
    }

    @Override // defpackage.im, defpackage.l1
    public final Object get() {
        byte b = this.i;
        l42 l42Var = l42.p;
        switch (b) {
            case 0:
                return this.k ? this.j : l42Var;
            case 1:
                return this.k ? this.j : l42Var;
            default:
                return this.k ? this.j : l42Var;
        }
    }
}
