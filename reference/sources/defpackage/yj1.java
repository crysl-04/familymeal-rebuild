package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface yj1 extends mo2 {
    default void F(long j, double d) {
        f(Math.toIntExact(j), d);
    }

    default void G1(a1 a1Var, f32 f32Var) {
        long jMin = Math.min(a1Var.count(), count());
        for (long j = 0; j < jMin; j++) {
            Comparable comparableG = a1Var.G(j);
            f32Var.getClass();
            n(j, new rm(comparableG, f32Var));
        }
    }

    void O1(c23 c23Var);

    void f(int i, double d);

    void g(long j, Comparable comparable);

    void n(long j, c23 c23Var);

    default void v1(tm tmVar, a1 a1Var) {
        long jMin = Math.min(count(), a1Var.count());
        for (long j = 0; j < jMin; j++) {
            Comparable comparableG = a1Var.G(j);
            tmVar.getClass();
            n(j, new sm(tmVar, comparableG));
        }
    }
}
