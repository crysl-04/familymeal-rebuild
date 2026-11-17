package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qi {
    public short a;
    public short b;
    public float c;
    public long d;
    public long e;
    public long f;
    public float g;
    public int h;

    public final float a(long j) {
        long j2 = this.d;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.f;
        if (j3 < 0 || j < j3) {
            return hb1.b((j - j2) / this.a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.g;
        return (hb1.b((j - j3) / this.h, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
