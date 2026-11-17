package defpackage;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface tm extends BinaryOperator, DoubleBinaryOperator {
    Comparable a(Comparable comparable, Comparable comparable2);

    @Override // java.util.function.BiFunction
    default Object apply(Object obj, Object obj2) {
        return a((Comparable) obj, (Comparable) obj2);
    }

    @Override // java.util.function.DoubleBinaryOperator
    default double applyAsDouble(double d, double d2) {
        return c(d, d2);
    }

    default short b(short s, short s2) {
        return (short) c(s, s2);
    }

    double c(double d, double d2);

    default int d(int i, int i2) {
        return Math.round((float) c(i, i2));
    }

    default long g(long j, long j2) {
        return Math.round(c(j, j2));
    }

    default float h(float f, float f2) {
        return (float) c(f, f2);
    }

    default byte i(byte b, byte b2) {
        return (byte) c(b, b2);
    }
}
