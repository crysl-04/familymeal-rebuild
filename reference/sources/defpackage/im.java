package defpackage;

import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class im implements l1, Consumer, DoubleConsumer {
    public final /* synthetic */ byte h;

    @Override // defpackage.xo1
    public double A0() {
        switch (this.h) {
            case 0:
                return ((BigDecimal) get()).doubleValue();
            case 1:
                return ((uw) get()).i;
            case 2:
            default:
                return ((z52) get()).A0();
            case 3:
                return ((l42) get()).A0();
            case 4:
                return ((u42) get()).m;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        d((Comparable) obj);
    }

    public void b(double d) {
        switch (this.h) {
            case 0:
                d(new BigDecimal(d));
                break;
            case 1:
                d(new uw(d));
                break;
            case 2:
            default:
                d(z52.t(d));
                break;
            case 3:
                d(l42.r(d));
                break;
            case 4:
                d(new u42(d));
                break;
        }
    }

    public final void c(float f) {
        switch (this.h) {
            case 0:
                d(new BigDecimal(f));
                break;
            case 1:
                d(new uw(f));
                break;
            case 2:
                b(f);
                break;
            case 3:
                d(l42.r(f));
                break;
            case 4:
                d(new u42(f));
                break;
            default:
                d(z52.t(f));
                break;
        }
    }

    public void d(Comparable comparable) {
        b(((Double) comparable).doubleValue());
    }

    public abstract im e();

    @Override // defpackage.l1
    public Object get() {
        return Double.valueOf(A0());
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        b(d);
    }
}
