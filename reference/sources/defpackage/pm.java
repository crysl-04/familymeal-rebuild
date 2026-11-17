package defpackage;

import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pm implements uc2 {
    public final /* synthetic */ byte h;

    public /* synthetic */ pm(byte b) {
        this.h = b;
    }

    @Override // defpackage.uc2
    public final vc2 c() {
        switch (this.h) {
            case 0:
                return qm.j;
            case 1:
                return uw.m;
            case 2:
                return i32.j;
            case 3:
                return u42.r;
            default:
                return z52.n;
        }
    }

    @Override // defpackage.uc2
    public final vc2 e(Comparable comparable) {
        switch (this.h) {
            case 0:
                if (comparable != null) {
                    return comparable instanceof qm ? (qm) comparable : new qm(pz1.C(comparable));
                }
                return qm.k;
            case 1:
                return uw.l2(comparable);
            case 2:
                return new i32(xo1.c1(comparable));
            case 3:
                return u42.r2(comparable);
            default:
                return z52.v(comparable);
        }
    }

    @Override // defpackage.uc2
    public final Comparable f(double d) {
        switch (this.h) {
            case 0:
                return new BigDecimal(d);
            case 1:
                return new uw(d);
            case 2:
                return Double.valueOf(d);
            case 3:
                return new u42(d);
            default:
                return z52.t(d);
        }
    }

    @Override // defpackage.uc2
    public final vc2 k() {
        switch (this.h) {
            case 0:
                return qm.k;
            case 1:
                return uw.n;
            case 2:
                return i32.k;
            case 3:
                return u42.s;
            default:
                return z52.p;
        }
    }

    @Override // defpackage.uc2
    public final Comparable n(Comparable comparable) {
        switch (this.h) {
            case 0:
                return pz1.C(comparable);
            case 1:
                return uw.l2(comparable);
            case 2:
                return Double.valueOf(xo1.c1(comparable));
            case 3:
                return u42.r2(comparable);
            default:
                return z52.v(comparable);
        }
    }

    @Override // defpackage.uc2
    public final vc2 s(double d) {
        switch (this.h) {
            case 0:
                return new qm(BigDecimal.valueOf(d));
            case 1:
                return new uw(d);
            case 2:
                return new i32(d);
            case 3:
                return new u42(d);
            default:
                return z52.t(d);
        }
    }
}
