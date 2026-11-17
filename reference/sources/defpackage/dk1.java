package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface dk1 extends no2, zj1 {
    @Override // defpackage.zj1
    default void B(long j, Comparable comparable) {
        long jH1 = h1();
        y0(j % jH1, j / jH1, comparable);
    }

    default void P1(float f, long j, long j2) {
        Y1(j, j2, f);
    }

    default void Y1(long j, long j2, double d) {
        b0(d, Math.toIntExact(j), Math.toIntExact(j2));
    }

    void b0(double d, int i, int i2);

    @Override // defpackage.zj1
    default void o(int i, double d) {
        long jH1 = h1();
        long j = i;
        Y1(j % jH1, j / jH1, d);
    }

    @Override // defpackage.zj1
    default void p(int i, float f) {
        long jH1 = h1();
        long j = i;
        P1(f, j % jH1, j / jH1);
    }

    @Override // defpackage.zj1
    default void y(long j, double d) {
        long jH1 = h1();
        Y1(j % jH1, j / jH1, d);
    }

    void y0(long j, long j2, Comparable comparable);
}
