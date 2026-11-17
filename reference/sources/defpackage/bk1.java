package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface bk1 extends no2, yj1 {
    @Override // defpackage.yj1
    default void F(long j, double d) {
        long jH1 = h1();
        I0(j % jH1, j / jH1, d);
    }

    void I0(long j, long j2, double d);

    default void Q(long j, long j2, sm smVar) {
        long jMin = Math.min(h1() - j, B1() - j2);
        for (long j3 = 0; j3 < jMin; j3++) {
            W0(j + j3, j2 + j3, smVar);
        }
    }

    void S0(long j, long j2, Comparable comparable);

    void W0(long j, long j2, c23 c23Var);

    @Override // defpackage.yj1
    default void f(int i, double d) {
        int iZ1 = Z1();
        q0(d, i % iZ1, i / iZ1);
    }

    @Override // defpackage.yj1
    default void g(long j, Comparable comparable) {
        long jH1 = h1();
        S0(j % jH1, j / jH1, comparable);
    }

    @Override // defpackage.yj1
    default void n(long j, c23 c23Var) {
        long jH1 = h1();
        W0(j % jH1, j / jH1, c23Var);
    }

    void q0(double d, int i, int i2);

    default void t1(sm smVar) {
        Q(0L, 0L, smVar);
    }
}
