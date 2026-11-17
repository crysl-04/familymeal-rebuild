package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class w42 extends im {
    public final /* synthetic */ byte i;
    public u42 j;
    public boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w42(byte b) {
        super((byte) 4);
        this.i = b;
    }

    @Override // defpackage.xo1
    public final int U0() {
        double d;
        switch (this.i) {
            case 0:
                d = (this.k ? this.j : u42.s).m;
                break;
            default:
                d = (this.k ? this.j : u42.s).m;
                break;
        }
        return (int) d;
    }

    @Override // defpackage.im
    public final void d(Comparable comparable) {
        switch (this.i) {
            case 0:
                u42 u42Var = (u42) comparable;
                double d = h32.b;
                pm pmVar = u42.n;
                u42Var.getClass();
                if (!i32.l.B(d, u42Var.a1())) {
                    u42 u42Var2 = this.j;
                    u42 u42Var3 = new u42(u42Var.a1());
                    if (u42Var2.compareTo(u42Var3) >= 0) {
                        u42Var2 = u42Var3;
                    }
                    this.j = u42Var2;
                    this.k = true;
                }
                break;
            default:
                u42 u42Var4 = (u42) comparable;
                u42 u42Var5 = this.j;
                if (u42Var5.compareTo(u42Var4) < 0) {
                    u42Var4 = u42Var5;
                }
                this.j = u42Var4;
                this.k = true;
                break;
        }
    }

    @Override // defpackage.im
    public final im e() {
        switch (this.i) {
            case 0:
                this.j = u42.q;
                this.k = false;
                break;
            default:
                this.j = u42.q;
                this.k = false;
                break;
        }
        return this;
    }

    @Override // defpackage.im, defpackage.l1
    public final Object get() {
        switch (this.i) {
            case 0:
                return this.k ? this.j : u42.s;
            default:
                return this.k ? this.j : u42.s;
        }
    }
}
