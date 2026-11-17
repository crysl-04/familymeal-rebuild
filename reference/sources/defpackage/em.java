package defpackage;

import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class em extends im {
    public int i;
    public BigDecimal j;

    @Override // defpackage.xo1
    public final int U0() {
        mm mmVar = om.U;
        BigDecimal bigDecimal = this.j;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.i);
        mmVar.getClass();
        return bigDecimal.divide(bigDecimalValueOf, lg1.b).intValue();
    }

    @Override // defpackage.im
    public final void d(Comparable comparable) {
        this.i++;
        mm mmVar = om.S;
        BigDecimal bigDecimal = this.j;
        mmVar.getClass();
        this.j = bigDecimal.add((BigDecimal) comparable);
    }

    @Override // defpackage.im
    public final im e() {
        this.i = 0;
        this.j = om.a;
        return this;
    }

    @Override // defpackage.im, defpackage.l1
    public final Object get() {
        mm mmVar = om.U;
        BigDecimal bigDecimal = this.j;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.i);
        mmVar.getClass();
        return bigDecimal.divide(bigDecimalValueOf, lg1.b);
    }
}
