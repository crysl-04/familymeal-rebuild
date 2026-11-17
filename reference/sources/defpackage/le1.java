package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface le1 extends ne1 {
    int Y(double d);

    double j1();

    default int k1() {
        return Y(j1());
    }

    default boolean n1() {
        return k1() == lg1.g((long) Z1(), (long) T());
    }
}
