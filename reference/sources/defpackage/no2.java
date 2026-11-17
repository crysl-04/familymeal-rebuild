package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface no2 extends mo2 {
    static int L(mo2 mo2Var, int i, int i2) {
        return mo2Var instanceof no2 ? Math.max(((no2) mo2Var).P0(i), i2) : i2;
    }

    static int Y0(mo2 mo2Var, int i, int i2) {
        return mo2Var instanceof no2 ? Math.min(((no2) mo2Var).P(i), i2) : i2;
    }

    default long B1() {
        return T();
    }

    default boolean N() {
        long jH1 = h1();
        return jH1 > 0 && jH1 == B1();
    }

    default int P(int i) {
        return Z1();
    }

    default int P0(int i) {
        return 0;
    }

    default boolean R0() {
        return B1() == 1 || h1() == 1;
    }

    int T();

    default int V(int i) {
        return T();
    }

    int Z1();

    @Override // defpackage.mo2
    default long count() {
        return B1() * h1();
    }

    default int d1() {
        return Math.toIntExact(Math.min(h1(), B1()));
    }

    default long h1() {
        return Z1();
    }

    default int n0(int i) {
        return 0;
    }

    @Override // defpackage.mo2
    default int size() {
        return T() * Z1();
    }
}
