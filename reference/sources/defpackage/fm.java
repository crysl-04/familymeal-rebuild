package defpackage;

import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fm extends im {
    public final /* synthetic */ byte i;
    public BigDecimal j;
    public boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fm(byte b) {
        super((byte) 0);
        this.i = b;
    }

    @Override // defpackage.xo1
    public final int U0() {
        switch (this.i) {
            case 0:
                return (this.k ? this.j : om.a).intValue();
            case 1:
                return (this.k ? this.j : om.a).intValue();
            default:
                return (this.k ? this.j : om.a).intValue();
        }
    }

    @Override // defpackage.im
    public final void d(Comparable comparable) {
        switch (this.i) {
            case 0:
                BigDecimal bigDecimal = (BigDecimal) comparable;
                if (bigDecimal.signum() != 0) {
                    mm mmVar = om.Y;
                    BigDecimal bigDecimal2 = this.j;
                    om.R.getClass();
                    BigDecimal bigDecimalAbs = bigDecimal.abs();
                    mmVar.getClass();
                    this.j = bigDecimal2.min(bigDecimalAbs);
                    this.k = true;
                }
                break;
            case 1:
                this.j = this.j.max((BigDecimal) comparable);
                this.k = true;
                break;
            default:
                this.j = this.j.min((BigDecimal) comparable);
                this.k = true;
                break;
        }
    }

    @Override // defpackage.im
    public final im e() {
        switch (this.i) {
            case 0:
                this.j = om.O;
                this.k = false;
                break;
            case 1:
                this.j = om.N;
                this.k = false;
                break;
            default:
                this.j = om.O;
                this.k = false;
                break;
        }
        return this;
    }

    @Override // defpackage.im, defpackage.l1
    public final Object get() {
        switch (this.i) {
            case 0:
                return this.k ? this.j : om.a;
            case 1:
                return this.k ? this.j : om.a;
            default:
                return this.k ? this.j : om.a;
        }
    }
}
