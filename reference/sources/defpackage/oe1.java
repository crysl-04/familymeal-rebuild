package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface oe1 extends sh {
    static int j(int i, double d) {
        double d2 = i;
        return (int) Math.min(2.147483647E9d, Math.max(1.0d, Math.ceil(((d2 * d2) * d2) / d)));
    }

    static int k(int i, double d, double d2) {
        double d3 = i;
        return (int) Math.min(2.147483647E9d, Math.max(1.0d, Math.ceil(((d3 * d3) * d3) / (d * d2))));
    }
}
