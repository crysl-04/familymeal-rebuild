package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface xj1 extends zj1 {
    default void Z(a1 a1Var) {
        long jMin = Math.min(count(), a1Var.count());
        for (long j = 0; j < jMin; j++) {
            B(j, a1Var.G(j));
        }
    }
}
