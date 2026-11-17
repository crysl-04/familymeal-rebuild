package defpackage;

import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hm extends im {
    public int i;

    @Override // defpackage.xo1
    public final int U0() {
        return this.i;
    }

    @Override // defpackage.im
    public final void d(Comparable comparable) {
        if (((BigDecimal) comparable).signum() != 0) {
            this.i++;
        }
    }

    @Override // defpackage.im
    public final im e() {
        this.i = 0;
        return this;
    }

    @Override // defpackage.im, defpackage.l1
    public final Object get() {
        return new BigDecimal(this.i);
    }
}
