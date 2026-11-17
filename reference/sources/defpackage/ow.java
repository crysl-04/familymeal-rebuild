package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ow extends im {
    public final /* synthetic */ byte i;
    public uw j;
    public boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ow(byte b) {
        super((byte) 1);
        this.i = b;
    }

    @Override // defpackage.xo1
    public final int U0() {
        double d;
        switch (this.i) {
            case 0:
                d = (this.k ? this.j : uw.n).i;
                break;
            default:
                d = (this.k ? this.j : uw.n).i;
                break;
        }
        return (int) d;
    }

    @Override // defpackage.im
    public final void d(Comparable comparable) {
        switch (this.i) {
            case 0:
                uw uwVar = (uw) comparable;
                double d = h32.b;
                pm pmVar = uw.j;
                uwVar.getClass();
                if (!i32.l.B(d, uwVar.a1())) {
                    uw uwVar2 = this.j;
                    uw uwVar3 = new uw(uwVar.a1());
                    if (uwVar2.compareTo(uwVar3) >= 0) {
                        uwVar2 = uwVar3;
                    }
                    this.j = uwVar2;
                    this.k = true;
                }
                break;
            default:
                uw uwVar4 = (uw) comparable;
                uw uwVar5 = this.j;
                if (uwVar5.compareTo(uwVar4) < 0) {
                    uwVar4 = uwVar5;
                }
                this.j = uwVar4;
                this.k = true;
                break;
        }
    }

    @Override // defpackage.im
    public final im e() {
        switch (this.i) {
            case 0:
                this.j = uw.l;
                this.k = false;
                break;
            default:
                this.j = uw.l;
                this.k = false;
                break;
        }
        return this;
    }

    @Override // defpackage.im, defpackage.l1
    public final Object get() {
        switch (this.i) {
            case 0:
                return this.k ? this.j : uw.n;
            default:
                return this.k ? this.j : uw.n;
        }
    }
}
