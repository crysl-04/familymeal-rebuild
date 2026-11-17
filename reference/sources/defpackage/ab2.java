package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ab2 {
    public double a = h32.b;
    public final s5 b;
    public final s5 c;
    public final double[] d;
    public final double[] e;

    public ab2(int i, int i2) {
        this.c = new s5(i);
        this.b = new s5(i2);
        this.e = new double[i];
        this.d = new double[i2];
    }

    public static double a(double d) {
        if (d < 1.0E-4d) {
            return h32.b;
        }
        if (d > 10000.0d) {
            return 10000.0d;
        }
        return d;
    }

    public static void b(double[] dArr) {
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            dArr[i] = a(dArr[i]);
        }
    }
}
