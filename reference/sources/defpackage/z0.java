package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface z0 extends mo2 {
    default void S1(im imVar) {
        w0(count(), imVar);
    }

    void t(long j, im imVar);

    default void w0(long j, im imVar) {
        for (long j2 = 0; j2 < j; j2++) {
            t(j2, imVar);
        }
    }
}
