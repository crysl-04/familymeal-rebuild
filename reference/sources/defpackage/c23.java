package defpackage;

import java.util.function.DoubleUnaryOperator;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface c23 extends UnaryOperator, DoubleUnaryOperator {
    double a(double d);

    @Override // java.util.function.Function
    default Object apply(Object obj) {
        return b((Comparable) obj);
    }

    @Override // java.util.function.DoubleUnaryOperator
    default double applyAsDouble(double d) {
        return a(d);
    }

    Comparable b(Comparable comparable);

    default float c(float f) {
        return (float) a(f);
    }
}
