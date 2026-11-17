package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface u23 extends hs1 {
    double b(int i);

    default boolean c(int i, double d, double d2) {
        return false;
    }

    Optional d();

    default boolean e(int i, double d) {
        return false;
    }

    default Collection g(boolean[] zArr, cz0 cz0Var) {
        return Collections.EMPTY_SET;
    }
}
