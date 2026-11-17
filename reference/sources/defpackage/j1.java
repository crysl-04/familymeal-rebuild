package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface j1 extends no2, z0 {
    default void J0(im imVar) {
        long jMin = Math.min(h1(), B1());
        long j = 0;
        while (j < jMin) {
            j1 j1Var = this;
            im imVar2 = imVar;
            j1Var.x(j, j, imVar2);
            j++;
            this = j1Var;
            imVar = imVar2;
        }
    }

    default void t(long j, im imVar) {
        long jH1 = h1();
        x(j % jH1, j / jH1, imVar);
    }

    void x(long j, long j2, im imVar);
}
