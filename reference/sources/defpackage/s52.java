package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class s52 extends im {
    public final /* synthetic */ byte i;
    public z52 j;
    public boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s52(byte b) {
        super((byte) 5);
        this.i = b;
    }

    @Override // defpackage.xo1
    public final int U0() {
        switch (this.i) {
            case 0:
                return (this.k ? this.j : z52.p).U0();
            case 1:
                return (this.k ? this.j : z52.p).U0();
            default:
                return (this.k ? this.j : z52.p).U0();
        }
    }

    @Override // defpackage.im
    public final void d(Comparable comparable) {
        switch (this.i) {
            case 0:
                z52 z52Var = (z52) comparable;
                double d = h32.b;
                pm pmVar = z52.k;
                z52Var.getClass();
                if (!qm.l.B(d, z52Var.A0())) {
                    this.j = (z52) y52.e.a(this.j, (z52) y52.a.b(z52Var));
                    this.k = true;
                }
                break;
            case 1:
                this.j = (z52) y52.d.a(this.j, (z52) comparable);
                this.k = true;
                break;
            default:
                this.j = (z52) y52.e.a(this.j, (z52) comparable);
                this.k = true;
                break;
        }
    }

    @Override // defpackage.im
    public final im e() {
        switch (this.i) {
            case 0:
                this.j = z52.o;
                this.k = false;
                break;
            case 1:
                this.j = z52.m;
                this.k = false;
                break;
            default:
                this.j = z52.o;
                this.k = false;
                break;
        }
        return this;
    }

    @Override // defpackage.im, defpackage.l1
    public final Object get() {
        switch (this.i) {
            case 0:
                return this.k ? this.j : z52.p;
            case 1:
                return this.k ? this.j : z52.p;
            default:
                return this.k ? this.j : z52.p;
        }
    }
}
