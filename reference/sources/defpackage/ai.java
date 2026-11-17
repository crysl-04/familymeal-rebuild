package defpackage;

import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ai extends y72 {
    public static final zh k = new zh(je1.p);

    @Override // defpackage.ry1, defpackage.a1
    public final double A(int i) {
        return ((BigDecimal[]) this.j)[i].doubleValue();
    }

    @Override // defpackage.ry1, defpackage.a1
    public final int D(int i) {
        return ((BigDecimal) this.j[i]).intValue();
    }

    @Override // defpackage.ry1
    public final void U0(int i, Comparable comparable) {
        Comparable[] comparableArr = this.j;
        comparableArr[i] = ((BigDecimal) comparableArr[i]).add((BigDecimal) this.h.k.n(comparable));
    }

    @Override // defpackage.ry1, defpackage.a1
    public final short d(int i) {
        return ((BigDecimal) this.j[i]).shortValue();
    }

    @Override // defpackage.yj1
    public final void f(int i, double d) {
        Comparable[] comparableArr = this.j;
        comparableArr[i] = ((BigDecimal) comparableArr[i]).add((BigDecimal) this.h.k.f(d));
    }

    @Override // defpackage.ry1, defpackage.a1
    public final float q(int i) {
        return ((BigDecimal[]) this.j)[i].floatValue();
    }

    @Override // defpackage.ry1, defpackage.a1
    public final long r(int i) {
        return ((BigDecimal) this.j[i]).longValue();
    }

    @Override // defpackage.ry1, defpackage.a1
    public final byte v(int i) {
        return ((BigDecimal) this.j[i]).byteValue();
    }
}
