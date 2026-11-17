package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nx2 {
    public final si1 a;
    public mx2 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    public nx2() {
        si1 si1Var = my0.a;
        this.a = new si1();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }

    public final void a(mx2 mx2Var, long j, long j2, float[] fArr, long j3) {
        long j4 = mx2Var.g;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            mx2Var.g = j3;
            mx2Var.a(mx2Var.e, mx2Var.f, j, j2, fArr);
        }
    }

    public final boolean b(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (ny0.a(j2, this.d)) {
            z = false;
        } else {
            this.d = j2;
            z = true;
        }
        if (!ny0.a(j, this.e)) {
            this.e = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.f) {
            return z;
        }
        this.f = j3;
        return true;
    }
}
