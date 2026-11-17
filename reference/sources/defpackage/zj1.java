package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface zj1 extends mo2 {
    void B(long j, Comparable comparable);

    void o(int i, double d);

    default void p(int i, float f) {
        o(i, f);
    }

    default void reset() {
        long jCount = count();
        for (long j = 0; j < jCount; j++) {
            y(j, h32.a);
        }
    }

    void w1(float f, long j);

    default void y(long j, double d) {
        o(Math.toIntExact(j), d);
    }
}
