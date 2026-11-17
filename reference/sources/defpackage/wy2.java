package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wy2 {
    public ks1 a;
    public long b;

    public wy2(long j, ks1 ks1Var) {
        this.a = ks1Var;
        this.b = j;
    }

    public static long a(wy2 wy2Var, long j, float f) {
        long jE = up1.e(wy2Var.b, j);
        wy2Var.b = jE;
        float fC = wy2Var.a == null ? up1.c(jE) : Math.abs(wy2Var.b(jE));
        if (fC <= 0.0f || fC < f) {
            return 9205357640488583168L;
        }
        ks1 ks1Var = wy2Var.a;
        long j2 = wy2Var.b;
        if (ks1Var == null) {
            float fC2 = up1.c(j2);
            return up1.d(wy2Var.b, up1.f(f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) / fC2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / fC2)) & 4294967295L)));
        }
        float fB = wy2Var.b(j2) - (Math.signum(wy2Var.b(wy2Var.b)) * f);
        long j3 = wy2Var.b;
        ks1 ks1Var2 = wy2Var.a;
        ks1 ks1Var3 = ks1.i;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (ks1Var2 == ks1Var3 ? j3 & 4294967295L : j3 >> 32));
        if (wy2Var.a == ks1Var3) {
            return (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L);
    }

    public final float b(long j) {
        return Float.intBitsToFloat((int) (this.a == ks1.i ? j >> 32 : j & 4294967295L));
    }

    public wy2(ks1 ks1Var) {
        this(0L, ks1Var);
    }
}
