package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface uc2 {
    vc2 c();

    vc2 e(Comparable comparable);

    Comparable f(double d);

    default double g() {
        return h32.o;
    }

    default Comparable[] j(int i) {
        return (Comparable[]) Array.newInstance(((Comparable) k().get()).getClass(), i);
    }

    vc2 k();

    Comparable n(Comparable comparable);

    vc2 s(double d);
}
