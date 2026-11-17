package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface gz2 extends bk1, ck1, ak1, k1 {
    default void E(long j, long j2) {
        long jH1 = h1();
        for (long j3 = 0; j3 < jH1; j3++) {
            Comparable comparableH = H(j3, j);
            Comparable comparableH2 = H(j3, j2);
            y0(j3, j2, comparableH);
            y0(j3, j, comparableH2);
        }
    }

    ep2 H0(int i, int i2);

    default void K(long j, long j2) {
        long jB1 = B1();
        for (long j3 = 0; j3 < jB1; j3++) {
            Comparable comparableH = H(j, j3);
            Comparable comparableH2 = H(j2, j3);
            y0(j2, j3, comparableH);
            y0(j, j3, comparableH2);
        }
    }

    void K1(a1 a1Var, a1 a1Var2);

    gp2 L0(int... iArr);

    dp2 N0(int... iArr);

    gz2 j0();

    fp2 v0(int i, int i2);
}
