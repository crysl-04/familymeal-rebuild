package defpackage;

import java.util.function.BiFunction;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface gu1 extends BiFunction {
    @Override // java.util.function.BiFunction
    default Object apply(Object obj, Object obj2) {
        return e(((Integer) obj2).intValue(), (Comparable) obj);
    }

    Comparable e(int i, Comparable comparable);

    double f(int i, double d);
}
