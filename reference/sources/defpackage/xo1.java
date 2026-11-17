package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface xo1 {
    /* JADX WARN: Multi-variable type inference failed */
    static long T1(Comparable comparable) {
        Objects.requireNonNull(comparable);
        if (comparable instanceof xo1) {
            return ((xo1) comparable).a0();
        }
        if (comparable instanceof Number) {
            return ((Number) comparable).longValue();
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static float U1(Comparable comparable) {
        Objects.requireNonNull(comparable);
        if (comparable instanceof xo1) {
            return ((xo1) comparable).d0();
        }
        if (comparable instanceof Number) {
            return ((Number) comparable).floatValue();
        }
        return Float.NaN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static double c1(Comparable comparable) {
        Objects.requireNonNull(comparable);
        if (comparable instanceof xo1) {
            return ((xo1) comparable).A0();
        }
        if (comparable instanceof Number) {
            return ((Number) comparable).doubleValue();
        }
        return Double.NaN;
    }

    double A0();

    default int U0() {
        return Math.round(d0());
    }

    default long a0() {
        return Math.round(A0());
    }

    default float d0() {
        return (float) A0();
    }
}
